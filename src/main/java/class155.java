import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class155 implements class150 {
   @OriginalMember(
      owner = "client!lq",
      name = "f",
      descriptor = "Lpda;"
   )
   private class395 field2315;
   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "Lrr;"
   )
   private class678 field2309;
   @OriginalMember(
      owner = "client!lq",
      name = "o",
      descriptor = "Lrr;"
   )
   private class678 field2311;
   @OriginalMember(
      owner = "client!lq",
      name = "p",
      descriptor = "I"
   )
   private int field2320;
   @OriginalMember(
      owner = "client!lq",
      name = "d",
      descriptor = "[Lwt;"
   )
   private class453[] field2318;
   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2323 = new String[]{method1404(method1403("2\u0002\u007fD=")), method1404(method1403("2\u0002\u007fN=")), method1404(method1403("2\u0002\u007fO=")), method1404(method1403("2\u0002\u007fA=")), method1404(method1403("2\u0002\u007fF=")), method1404(method1403("0\u0006=k")), method1404(method1403("2\u0002\u007f;|0\u001a%9=")), method1404(method1403("%]\u007f)h")), method1404(method1403("2\u0002\u007fC=")), method1404(method1403("2\u0002\u007fB=")), method1404(method1403("2\u0002\u007fE=")), method1404(method1403("2\u0002\u007f@="))};
   @OriginalMember(
      owner = "client!lq",
      name = "l",
      descriptor = "I"
   )
   public static int field2312 = -1;
   @OriginalMember(
      owner = "client!lq",
      name = "k",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2307 = new String[200];
   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "I"
   )
   public static int field2306;
   @OriginalMember(
      owner = "client!lq",
      name = "h",
      descriptor = "I"
   )
   public static int field2308;
   @OriginalMember(
      owner = "client!lq",
      name = "g",
      descriptor = "I"
   )
   public static int field2310;
   @OriginalMember(
      owner = "client!lq",
      name = "m",
      descriptor = "I"
   )
   public static int field2313;
   @OriginalMember(
      owner = "client!lq",
      name = "n",
      descriptor = "I"
   )
   public static int field2314;
   @OriginalMember(
      owner = "client!lq",
      name = "c",
      descriptor = "I"
   )
   public static int field2316;
   @OriginalMember(
      owner = "client!lq",
      name = "j",
      descriptor = "I"
   )
   public static int field2317;
   @OriginalMember(
      owner = "client!lq",
      name = "e",
      descriptor = "I"
   )
   public static int field2319;
   @OriginalMember(
      owner = "client!lq",
      name = "i",
      descriptor = "I"
   )
   public static int field2321;
   @OriginalMember(
      owner = "client!lq",
      name = "q",
      descriptor = "I"
   )
   public static int field2322;

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1400(int arg0, int arg1, int arg2) {
      try {
         ++field2314;
         if (arg1 != 0) {
            method1402(35);
         }

         return (arg0 & 458752) != 0 | class755.method5541(arg2, arg0, (byte)103) || class508.method3945(arg2, -2108543543, arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2323[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(IIZBFI)[F"
   )
   public final float[] method1376(int arg0, int arg1, boolean arg2, byte arg3, float arg4, int arg5) {
      try {
         ++field2319;
         if (arg3 > -77) {
            this.field2309 = null;
         }

         return this.method1401(arg1, (byte)-109).method2278(this.field2309, true, this, arg5, this.field2318[arg1].field6928, arg0);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2323[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "b",
      descriptor = "(IB)Lnha;"
   )
   private final class262 method1401(int arg0, byte arg1) {
      try {
         ++field2310;
         class297 var3 = this.field2315.method3178(0, (long)arg0);
         if (var3 != null) {
            return (class262)var3;
         } else {
            byte[] var4 = this.field2311.method5025(0, arg0);
            if (arg1 > -76) {
               this.field2320 = -6;
            }

            if (var4 == null) {
               return null;
            } else {
               class262 var5 = new class262(new class354(var4));
               this.field2315.method3183((long)arg0, var5, (byte)64);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2323[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(IFZIII)[I"
   )
   public final int[] method1375(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg5 != -9197) {
            this.field2311 = null;
         }

         ++field2321;
         return this.method1401(arg4, (byte)-85).method2274(arg2, this, arg0, 117, this.field2318[arg4].field6928, this.field2309, (double)arg1, arg3);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2323[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1377(byte arg0) {
      try {
         if (arg0 < 126) {
            field2316 = -15;
         }

         ++field2317;
         return this.field2320;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2323[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(IIZIFI)[I"
   )
   public final int[] method1374(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
      try {
         if (arg0 != -2395) {
            return null;
         } else {
            ++field2306;
            return this.method1401(arg3, (byte)-124).method2279(arg1, this.field2309, (double)arg4, this.field2318[arg3].field6928, this, 0, arg5);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2323[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1402(int arg0) {
      try {
         field2307 = null;
         int var1 = -13 % ((arg0 - -19) / 59);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2323[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method1372(int arg0, int arg1) {
      try {
         ++field2308;
         class262 var3 = this.method1401(arg1, (byte)-120);
         if (arg0 >= -104) {
            this.method1375(88, -0.33444008F, false, 126, -118, -22);
         }

         return var3 != null && var3.method2276(this.field2309, this, 0);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2323[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(IB)Lwt;"
   )
   public final class453 method1373(int arg0, byte arg1) {
      try {
         ++field2313;
         if (arg1 != -54) {
            this.field2315 = null;
         }

         return this.field2318[arg0];
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2323[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "<init>",
      descriptor = "(Lrr;Lrr;Lrr;)V"
   )
   public class155(class678 param1, class678 param2, class678 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1403(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1404(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
