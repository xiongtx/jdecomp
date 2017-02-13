package decompile;

import clojure.lang.AFunction;
import clojure.lang.Numbers;

public final class core$mul extends AFunction {
   public static Object invokeStatic(Object x, Object y) {
      Object var10000 = x;
      x = null;
      Object var10001 = y;
      y = null;
      return Numbers.multiply(var10000, var10001);
   }

   public Object invoke(Object var1, Object var2) {
      Object var10000 = var1;
      var1 = null;
      Object var10001 = var2;
      var2 = null;
      return invokeStatic(var10000, var10001);
   }
}
