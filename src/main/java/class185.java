import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class185 {
   @OriginalMember(
      owner = "client!cka",
      name = "B",
      descriptor = "I"
   )
   private int field2286;
   @OriginalMember(
      owner = "client!cka",
      name = "c",
      descriptor = "I"
   )
   private int field2283;
   @OriginalMember(
      owner = "client!cka",
      name = "i",
      descriptor = "I"
   )
   private int field2287;
   @OriginalMember(
      owner = "client!cka",
      name = "k",
      descriptor = "I"
   )
   private int field2289;
   @OriginalMember(
      owner = "client!cka",
      name = "n",
      descriptor = "I"
   )
   public int field2282;
   @OriginalMember(
      owner = "client!cka",
      name = "f",
      descriptor = "I"
   )
   public int field2292;
   @OriginalMember(
      owner = "client!cka",
      name = "x",
      descriptor = "I"
   )
   public int field2291;
   @OriginalMember(
      owner = "client!cka",
      name = "l",
      descriptor = "I"
   )
   public int field2293;
   @OriginalMember(
      owner = "client!cka",
      name = "s",
      descriptor = "I"
   )
   public int field2285;
   @OriginalMember(
      owner = "client!cka",
      name = "t",
      descriptor = "I"
   )
   public int field2295;
   @OriginalMember(
      owner = "client!cka",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2313 = new String[]{method1444(method1443("y>~aG2")), method1444(method1443("y>~aD2")), method1444(method1443("a{1a{")), method1444(method1443("t s#")), method1444(method1443("y>~a:s;v;82")), method1444(method1443("y>~aE2")), method1444(method1443("y>~aB2"))};
   @OriginalMember(
      owner = "client!cka",
      name = "y",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2294 = new String[100];
   @OriginalMember(
      owner = "client!cka",
      name = "e",
      descriptor = "Lnca;"
   )
   public static class785 field2288 = new class785(14, 0);
   @OriginalMember(
      owner = "client!cka",
      name = "q",
      descriptor = "Lnca;"
   )
   public static class785 field2297 = new class785(15, 4);
   @OriginalMember(
      owner = "client!cka",
      name = "o",
      descriptor = "Lnca;"
   )
   public static class785 field2298 = new class785(16, -2);
   @OriginalMember(
      owner = "client!cka",
      name = "A",
      descriptor = "Lnca;"
   )
   public static class785 field2299 = new class785(17, 0);
   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "Lnca;"
   )
   public static class785 field2300 = new class785(19, -2);
   @OriginalMember(
      owner = "client!cka",
      name = "u",
      descriptor = "Lnca;"
   )
   public static class785 field2301 = new class785(22, -2);
   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "Lnca;"
   )
   public static class785 field2302 = new class785(23, 4);
   @OriginalMember(
      owner = "client!cka",
      name = "j",
      descriptor = "Lnca;"
   )
   public static class785 field2303 = new class785(24, -1);
   @OriginalMember(
      owner = "client!cka",
      name = "v",
      descriptor = "Lnca;"
   )
   public static class785 field2304 = new class785(26, 0);
   @OriginalMember(
      owner = "client!cka",
      name = "b",
      descriptor = "Lnca;"
   )
   public static class785 field2305 = new class785(27, 0);
   @OriginalMember(
      owner = "client!cka",
      name = "C",
      descriptor = "Lnca;"
   )
   public static class785 field2306 = new class785(28, -2);
   @OriginalMember(
      owner = "client!cka",
      name = "r",
      descriptor = "Lnca;"
   )
   public static class785 field2307 = new class785(29, -2);
   @OriginalMember(
      owner = "client!cka",
      name = "g",
      descriptor = "Lnca;"
   )
   public static class785 field2308 = new class785(30, -2);
   @OriginalMember(
      owner = "client!cka",
      name = "p",
      descriptor = "[Lnca;"
   )
   private static class785[] field2309 = new class785[32];
   @OriginalMember(
      owner = "client!cka",
      name = "E",
      descriptor = "I"
   )
   public static int field2311;
   @OriginalMember(
      owner = "client!cka",
      name = "h",
      descriptor = "I"
   )
   public static int field2284;
   @OriginalMember(
      owner = "client!cka",
      name = "d",
      descriptor = "I"
   )
   public static int field2290;
   @OriginalMember(
      owner = "client!cka",
      name = "D",
      descriptor = "I"
   )
   public static int field2296;
   @OriginalMember(
      owner = "client!cka",
      name = "w",
      descriptor = "Leaa;"
   )
   public static class526 field2312;
   @OriginalMember(
      owner = "client!cka",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field2310;

   static {
      class785[] var0 = class458.method3443(11745);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field2309[var0[var1].field11435] = var0[var1];
      }

      field2311 = 0;
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "([[IB)V",
      line = 4
   )
   public static final void method1439(int[][] arg0, byte arg1) {
      try {
         if (arg1 == 109) {
            class292.field4077 = arg0;
            ++field2284;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2313[1] + (arg0 != null ? field2313[2] : field2313[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(IIII)Z",
      line = 15
   )
   public final boolean method1440(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field2296;
         if (~this.field2295 >= ~arg1 && ~arg1 >= ~this.field2285) {
            if (~arg2 <= ~this.field2291 && ~arg2 >= ~this.field2292) {
               if (this.field2282 <= arg0 && ~this.field2293 <= ~arg0) {
                  if (arg3 != 0) {
                     return false;
                  } else {
                     int var5 = -this.field2286 + arg1;
                     int var6 = -this.field2289 + arg0;
                     return ~(var5 * var5 + var6 * var6) > ~this.field2283;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2313[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(B)V",
      line = 44
   )
   public static void method1441(byte arg0) {
      try {
         field2309 = null;
         field2303 = null;
         field2299 = null;
         field2312 = null;
         field2307 = null;
         field2304 = null;
         field2301 = null;
         field2298 = null;
         if (arg0 != -101) {
            field2299 = null;
         }

         field2305 = null;
         field2310 = null;
         field2300 = null;
         field2288 = null;
         field2297 = null;
         field2294 = null;
         field2308 = null;
         field2306 = null;
         field2302 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2313[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(IIIIIIIIIII)V",
      line = 78
   )
   public final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      try {
         this.field2286 = arg7;
         this.field2287 = arg6;
         this.field2289 = arg0;
         this.field2283 = arg4 * arg4;
         ++field2290;
         this.field2295 = this.field2286 + arg8;
         this.field2282 = this.field2289 + arg5;
         this.field2285 = this.field2286 + arg3;
         this.field2292 = this.field2287 - -arg2;
         this.field2291 = this.field2287 + arg9;
         this.field2293 = this.field2289 + arg10;
         if (arg1 != 27) {
            this.field2283 = -14;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field2313[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V",
      line = 112
   )
   public class185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         this.field2286 = arg0;
         this.field2283 = arg3 * arg3;
         this.field2287 = arg1;
         this.field2289 = arg2;
         this.field2282 = this.field2289 - -arg8;
         this.field2292 = this.field2287 + arg7;
         this.field2291 = this.field2287 + arg6;
         this.field2293 = this.field2289 + arg9;
         this.field2285 = this.field2286 + arg5;
         this.field2295 = this.field2286 - -arg4;
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field2313[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1443(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1444(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
