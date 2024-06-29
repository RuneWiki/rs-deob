import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class635 {
   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8979 = new String[]{method4613(method4612("H\u0000AA_")), method4613(method4612("H\u0000AD_")), method4613(method4612("H\u0000AG_")), method4613(method4612("H\u0000AF_")), method4613(method4612("\\[A+\n")), method4613(method4612("I\u0000\u0003i")), method4613(method4612("H\u0000A@_"))};
   @OriginalMember(
      owner = "client!ou",
      name = "e",
      descriptor = "I"
   )
   public static int field8978 = 999999;
   @OriginalMember(
      owner = "client!ou",
      name = "h",
      descriptor = "Lbga;"
   )
   public static class378 field8975 = new class378(67, 8);
   @OriginalMember(
      owner = "client!ou",
      name = "d",
      descriptor = "I"
   )
   public static int field8971;
   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "I"
   )
   public static int field8972;
   @OriginalMember(
      owner = "client!ou",
      name = "c",
      descriptor = "I"
   )
   public static int field8973;
   @OriginalMember(
      owner = "client!ou",
      name = "g",
      descriptor = "I"
   )
   public static int field8974;
   @OriginalMember(
      owner = "client!ou",
      name = "b",
      descriptor = "I"
   )
   public static int field8976;
   @OriginalMember(
      owner = "client!ou",
      name = "f",
      descriptor = "I"
   )
   public static int field8977;

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(IIIIIIIIII)V"
   )
   public static final void method4606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4273;

      try {
         label47: {
            if (~arg0 == ~arg1 && ~arg3 == ~arg9 && ~arg2 == ~arg4 && arg5 == arg6) {
               class324.method2440(arg2, arg3, arg5, -123, arg7, arg0);
               if (!var10) {
                  break label47;
               }
            }

            int var11 = arg0;
            int var12 = arg3;
            int var13 = arg0 * 3;
            int var14 = arg3 * 3;
            int var15 = arg1 * 3;
            int var16 = arg9 * 3;
            int var17 = arg4 * 3;
            int var18 = arg6 * 3;
            int var19 = -arg0 + var15 + arg2 - var17;
            int var20 = -arg3 + arg5 + -var18 + var16;
            int var21 = var17 - (var15 - -var15 - var13);
            int var22 = var18 - (-var14 + var16) + -var16;
            int var23 = -var13 + var15;
            int var24 = -var14 + var16;
            int var25 = 128;
            if (var10 || var25 <= 4096) {
               do {
                  int var26 = var25 * var25 >> 12;
                  int var27 = var25 * var26 >> 12;
                  int var28 = var19 * var27;
                  int var29 = var20 * var27;
                  int var30 = var21 * var26;
                  int var31 = var22 * var26;
                  int var32 = var23 * var25;
                  int var33 = var24 * var25;
                  int var34 = arg0 - -(var28 - -var30 + var32 >> 12);
                  int var35 = (var29 + var33 + var31 >> 12) + arg3;
                  class324.method2440(var34, var12, var35, -125, arg7, var11);
                  var12 = var35;
                  var11 = var34;
                  var25 += 128;
               } while(var25 <= 4096);
            }
         }

         ++field8976;
         if (arg8 < 53) {
            method4609(-103, false);
         }
      } catch (RuntimeException var37) {
         throw class534.method3846(var37, field8979[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(IJI)Lep;"
   )
   public static final class446 method4607(int arg0, long arg1, int arg2) {
      try {
         ++field8974;
         if (arg0 < 107) {
            method4606(-97, -113, 36, 90, -11, -107, -58, 33, -26, 116);
         }

         class446 var4 = (class446)class661.field9434.method1839(-17, arg1 | (long)arg2 << 56);
         if (var4 == null) {
            var4 = new class446(arg2, arg1);
            class661.field9434.method1841(var4.field6862, true, var4);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8979[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4608(int arg0) {
      try {
         if (arg0 >= -50) {
            method4609(-23, true);
         }

         field8975 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8979[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method4609(int arg0, boolean arg1) {
      try {
         ++field8972;
         if (arg1) {
            class446 var2 = method4607(113, (long)arg0, 17);
            var2.method3312(-121);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8979[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(ZIIILqt;)V"
   )
   public static final void method4610(boolean param0, int param1, int param2, int param3, class666 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(Lu;)V"
   )
   public static final void method4611(class80 arg0) {
      class292.field3851.method568(arg0.field999, arg0.field998 + (arg0.method782(103) >> 1), arg0.field1003, class713.field10442);
      arg0.field1006 = class713.field10442[0];
      arg0.field994 = class713.field10442[1];
      arg0.field993 = class713.field10442[2];
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4612(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4613(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
