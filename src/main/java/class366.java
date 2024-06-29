import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class366 {
   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5424 = new String[]{method2889(method2888("\u0006=(sP")), method2889(method2888("F2\u007fL\u0011\n")), method2889(method2888("\u00057e")), method2889(method2888("\u0006=(qP")), method2889(method2888("F2jL")), method2889(method2888("\u0006#jL")), method2889(method2888("\u0004?d")), method2889(method2888("\u0013x(\u000e\u0005")), method2889(method2888("\u0004?hU\u0000")), method2889(method2888("F%i")), method2889(method2888("\u001f?h")), method2889(method2888("\u0006=(pP")), method2889(method2888("\u0006=(uP")), method2889(method2888("\u0006=(tP"))};
   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field5418 = new class724(140, -1);
   @OriginalMember(
      owner = "client!nk",
      name = "g",
      descriptor = "Liw;"
   )
   public static class107 field5423 = new class107(128, 4);
   @OriginalMember(
      owner = "client!nk",
      name = "d",
      descriptor = "I"
   )
   public static int field5417;
   @OriginalMember(
      owner = "client!nk",
      name = "e",
      descriptor = "I"
   )
   public static int field5419;
   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "I"
   )
   public static int field5420;
   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "I"
   )
   public static int field5421;
   @OriginalMember(
      owner = "client!nk",
      name = "f",
      descriptor = "Lgga;"
   )
   public static class502 field5422;

   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method2878(int arg0, int arg1);

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(IIIBII)Z"
   )
   public static final boolean method2879(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         if (arg3 < 107) {
            return true;
         } else {
            ++field5420;
            int var7 = arg0;
            int var10000;
            if (var6) {
               var10000 = arg4;
            } else if (~arg0 < ~arg2) {
               var10000 = 0;
               if (!var6) {
                  return false;
               }
            } else {
               var10000 = arg4;
            }

            while(true) {
               int var8 = var10000;
               if (var6) {
                  if (~class211.field3019[var7][var8] == ~arg5 && class341.field5024[var7][var8] <= 1) {
                     return true;
                  }

                  ++var8;
               }

               while(true) {
                  while(var8 <= arg1) {
                     if (~class211.field3019[var7][var8] == ~arg5 && class341.field5024[var7][var8] <= 1) {
                        return true;
                     }

                     ++var8;
                  }

                  if (!var6) {
                     ++var7;
                     if (~var7 < ~arg2) {
                        var10000 = 0;
                        if (!var6) {
                           return false;
                        }
                     } else {
                        var10000 = arg4;
                     }
                     break;
                  }

                  ++var8;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field5424[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(B)Lmf;"
   )
   public abstract class738 method2880(byte arg0);

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method2881(int arg0, String arg1) {
      try {
         int var2 = 77 % ((32 - arg0) / 44);
         ++field5421;
         if (class238.field3676.startsWith(field5424[10])) {
            return arg1 + field5424[4];
         } else if (!class238.field3676.startsWith(field5424[8])) {
            return class238.field3676.startsWith(field5424[2]) ? field5424[6] + arg1 + field5424[1] : null;
         } else {
            return field5424[6] + arg1 + field5424[9];
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5424[3] + arg0 + ',' + (arg1 != null ? field5424[7] : field5424[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2882(int arg0, int arg1) {
      try {
         ++field5419;
         if (arg0 != -29222) {
            return false;
         } else {
            return ~arg1 == -4 || arg1 == 5 || ~arg1 == -7;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5424[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(IIIIIIIIIZ)Z"
   )
   public static final boolean method2883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
      try {
         ++field5417;
         if (!class274.method2319(arg2, arg4, -10, arg3)) {
            return false;
         } else {
            int var15 = class322.field4806[1];
            int var14 = class322.field4806[0];
            int var16 = class322.field4806[2];
            if (!class274.method2319(arg1, arg8, -10, arg0)) {
               return false;
            } else {
               int var20 = class322.field4806[2];
               int var13 = class322.field4806[0];
               int var12 = class322.field4806[1];
               if (!class274.method2319(arg7, arg6, -10, arg5)) {
                  return false;
               } else {
                  int var18 = class322.field4806[2];
                  int var17 = class322.field4806[1];
                  if (arg9) {
                     method2883(95, -86, -41, -66, -38, 26, -61, 35, 110, true);
                  }

                  int var19 = class322.field4806[0];
                  return class217.method1888(var13, var20, var12, var18, var15, var19, var17, (byte)-127, var16, var14);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field5424[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(BI)I"
   )
   public abstract int method2884(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2885(int arg0) {
      try {
         if (arg0 != 5) {
            method2882(61, -68);
         }

         field5423 = null;
         field5422 = null;
         field5418 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5424[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(III)Lhs;"
   )
   public static final class312 method2886(int arg0, int arg1, int arg2) {
      if (class324.field4826[arg0][arg1][arg2] == null) {
         boolean var3 = class324.field4826[0][arg1][arg2] != null && class324.field4826[0][arg1][arg2].field4685 != null;
         if (var3 && arg0 >= class522.field7337 - 1) {
            return null;
         }

         class199.method1743(arg0, arg1, arg2);
      }

      return class324.field4826[arg0][arg1][arg2];
   }

   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "(BI)[B"
   )
   public abstract byte[] method2887(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2888(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2889(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
