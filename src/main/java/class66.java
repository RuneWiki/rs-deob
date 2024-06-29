import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class66 extends class557 {
   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field972 = new String[]{method712(method711("\u0013?\u0018{/")), method712(method711("\u0013?\u0018~/")), method712(method711("\u0013?\u0018r/")), method712(method711("\u0013?\u0018\u007f/")), method712(method711("\u0013?\u0018y/")), method712(method711("\u0013?\u0018p/")), method712(method711("\rr\u0018\u0016z")), method712(method711("\u0018)ZT")), method712(method711("\u0013?\u0018z/")), method712(method711("\u0013?\u0018|/"))};
   @OriginalMember(
      owner = "client!ec",
      name = "h",
      descriptor = "I"
   )
   public static int field967 = 0;
   @OriginalMember(
      owner = "client!ec",
      name = "n",
      descriptor = "Lwt;"
   )
   public static class9 field962 = new class9(64);
   @OriginalMember(
      owner = "client!ec",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field971 = true;
   @OriginalMember(
      owner = "client!ec",
      name = "l",
      descriptor = "I"
   )
   public static int field961;
   @OriginalMember(
      owner = "client!ec",
      name = "k",
      descriptor = "I"
   )
   public static int field963;
   @OriginalMember(
      owner = "client!ec",
      name = "j",
      descriptor = "I"
   )
   public static int field965;
   @OriginalMember(
      owner = "client!ec",
      name = "m",
      descriptor = "I"
   )
   public static int field966;
   @OriginalMember(
      owner = "client!ec",
      name = "o",
      descriptor = "I"
   )
   public static int field968;
   @OriginalMember(
      owner = "client!ec",
      name = "r",
      descriptor = "I"
   )
   public static int field969;
   @OriginalMember(
      owner = "client!ec",
      name = "i",
      descriptor = "I"
   )
   public static int field970;
   @OriginalMember(
      owner = "client!ec",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field964;

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (super.field7906.method4710(-123)) {
            super.field7905 = 0;
         }

         if (arg0 == -22) {
            ++field963;
            if (super.field7906.field9138.method2740(-83) == 0) {
               super.field7905 = 0;
            }

            if (~super.field7905 > -1 || ~super.field7905 < -3) {
               super.field7905 = this.method97(0);
            }

         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field972[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method707(int arg0) {
      try {
         field964 = null;
         if (arg0 == 0) {
            field962 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field972[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field961;
         super.field7905 = arg0;
         if (!arg1) {
            this.method97(62);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field972[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field968;
         if (arg0 != 1) {
            field971 = true;
         }

         if (super.field7906.method4710(arg0 + 76)) {
            return 3;
         } else {
            return ~super.field7906.field9138.method2740(arg0 ^ -77) == -1 ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field972[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(Luf;Ldea;ZI)V"
   )
   public static final void method708(class33 arg0, class471 arg1, boolean arg2, int arg3) {
      try {
         ++field965;
         if (class501.field7151 < 50) {
            if (arg0 != null && arg0.field490 != null && arg3 < arg0.field490.length && arg0.field490[arg3] != null) {
               if (!arg2) {
                  field964 = null;
               }

               int var4 = arg0.field490[arg3][0];
               int var5 = var4 >> 8;
               int var6 = (var4 & 233) >> 5;
               int var7 = 31 & var4;
               if (~arg0.field490[arg3].length < -2) {
                  int var8 = (int)((double)arg0.field490[arg3].length * Math.random());
                  if (~var8 < -1) {
                     var5 = arg0.field490[arg3][var8];
                  }
               }

               int var9 = 256;
               if (arg0.field465 != null && arg0.field475 != null) {
                  var9 = arg0.field465[arg3] + (int)(Math.random() * (double)(arg0.field475[arg3] - arg0.field465[arg3]));
               }

               int var10 = arg0.field486 != null ? arg0.field486[arg3] : 255;
               if (var7 == 0) {
                  if (class117.field1849 == arg1) {
                     if (arg0.field469) {
                        class423.method3293(var10, var9, (byte)4, 0, false, var6, var5);
                        return;
                     }

                     class314.method2557(0, true, var5, var9, var10, var6);
                  }

               } else if (class476.field6870.field9102.method3775(-102) != 0) {
                  int var11 = arg1.field6832 + -256 >> 9;
                  int var12 = arg1.field6833 - 256 >> 9;
                  int var13 = class117.field1849 != arg1 ? (var12 << 8) + (arg1.field6824 << 24) + (var11 << 16) - -var7 : 0;
                  class24.field345[class501.field7151++] = new class180((byte)(!arg0.field469 ? 1 : 2), var5, var6, 0, var10, var13, var9, arg1);
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field972[8] + (arg0 != null ? field972[6] : field972[7]) + ',' + (arg1 != null ? field972[6] : field972[7]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class66(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method709(int arg0) {
      try {
         ++field969;
         return arg0 >= -52 ? 39 : super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field972[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class66(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field966;
         if (arg0 != 0) {
            this.method97(-52);
         }

         return 2;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field972[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method710(byte arg0) {
      try {
         ++field970;
         if (arg0 != 108) {
            this.method97(-44);
         }

         if (super.field7906.method4710(-128)) {
            return false;
         } else {
            return super.field7906.field9138.method2740(-65) != 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field972[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method711(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method712(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
