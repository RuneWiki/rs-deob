import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class625 extends class213 {
   @OriginalMember(
      owner = "client!rj",
      name = "J",
      descriptor = "I"
   )
   private int field8734 = 8192;
   @OriginalMember(
      owner = "client!rj",
      name = "N",
      descriptor = "I"
   )
   private int field8732 = 0;
   @OriginalMember(
      owner = "client!rj",
      name = "U",
      descriptor = "I"
   )
   private int field8728 = 2048;
   @OriginalMember(
      owner = "client!rj",
      name = "G",
      descriptor = "I"
   )
   private int field8726 = 2048;
   @OriginalMember(
      owner = "client!rj",
      name = "E",
      descriptor = "I"
   )
   private int field8737 = 0;
   @OriginalMember(
      owner = "client!rj",
      name = "F",
      descriptor = "I"
   )
   private int field8731 = 12288;
   @OriginalMember(
      owner = "client!rj",
      name = "Y",
      descriptor = "I"
   )
   private int field8727 = 4096;
   @OriginalMember(
      owner = "client!rj",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8742 = new String[]{method4549(method4548("\u00172\u000b6\u0007")), method4549(method4548("\u00172\u000b7\u0007")), method4549(method4548("\u001ev\u000bUR")), method4549(method4548("\u000b-I\u0017")), method4549(method4548("\u00172\u000b<\u0007")), method4549(method4548("\u00172\u000b8\u0007")), method4549(method4548("\u00172\u000b:\u0007")), method4549(method4548("\u00172\u000b9\u0007")), method4549(method4548("\u00172\u000b3\u0007")), method4549(method4548("\u00172\u000b>\u0007")), method4549(method4548("\u00172\u000b?\u0007")), method4549(method4548("\u00172\u000b0\u0007")), method4549(method4548("\u00172\u000b5\u0007")), method4549(method4548("\u00172\u000b=\u0007")), method4549(method4548("\u00172\u000b2\u0007"))};
   @OriginalMember(
      owner = "client!rj",
      name = "Z",
      descriptor = "[B"
   )
   public static byte[] field8724 = new byte[520];
   @OriginalMember(
      owner = "client!rj",
      name = "H",
      descriptor = "I"
   )
   public static int field8736 = 0;
   @OriginalMember(
      owner = "client!rj",
      name = "P",
      descriptor = "I"
   )
   public static int field8720;
   @OriginalMember(
      owner = "client!rj",
      name = "Q",
      descriptor = "I"
   )
   public static int field8721;
   @OriginalMember(
      owner = "client!rj",
      name = "T",
      descriptor = "I"
   )
   public static int field8722;
   @OriginalMember(
      owner = "client!rj",
      name = "M",
      descriptor = "I"
   )
   public static int field8723;
   @OriginalMember(
      owner = "client!rj",
      name = "S",
      descriptor = "I"
   )
   public static int field8725;
   @OriginalMember(
      owner = "client!rj",
      name = "V",
      descriptor = "I"
   )
   public static int field8729;
   @OriginalMember(
      owner = "client!rj",
      name = "W",
      descriptor = "I"
   )
   public static int field8730;
   @OriginalMember(
      owner = "client!rj",
      name = "R",
      descriptor = "I"
   )
   public static int field8735;
   @OriginalMember(
      owner = "client!rj",
      name = "O",
      descriptor = "I"
   )
   public static int field8738;
   @OriginalMember(
      owner = "client!rj",
      name = "I",
      descriptor = "I"
   )
   public static int field8739;
   @OriginalMember(
      owner = "client!rj",
      name = "X",
      descriptor = "I"
   )
   public static int field8740;
   @OriginalMember(
      owner = "client!rj",
      name = "D",
      descriptor = "I"
   )
   public static int field8741;
   @OriginalMember(
      owner = "client!rj",
      name = "L",
      descriptor = "[Lqc;"
   )
   public static class777[] field8733;

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field8729;
         int var4 = 83 % ((arg1 - 68) / 48);
         if (~arg2 != -1) {
            if (arg2 == 1) {
               this.field8732 = arg0.method4280(-19104);
               return;
            }

            if (~arg2 == -3) {
               this.field8737 = arg0.method4280(-19104);
               return;
            }

            if (arg2 == 3) {
               this.field8728 = arg0.method4280(-19104);
               return;
            }

            if (arg2 == 4) {
               this.field8731 = arg0.method4280(-19104);
               return;
            }

            if (arg2 == 5) {
               this.field8727 = arg0.method4280(-19104);
               return;
            }

            if (~arg2 != -7) {
               return;
            }

            if (!client.field4273) {
               this.field8734 = arg0.method4280(-19104);
               return;
            }
         }

         this.field8726 = arg0.method4280(-19104);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8742[4] + (arg0 != null ? field8742[2] : field8742[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method4538(int arg0, int arg1, int arg2) {
      try {
         ++field8730;
         if (arg2 != 65536) {
            method4546(-83, -109, false);
         }

         return (arg1 & 65536) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8742[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method4539(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            field8724 = null;
         }

         ++field8739;
         return (32 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8742[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "d",
      descriptor = "(III)Z"
   )
   public static final boolean method4540(int arg0, int arg1, int arg2) {
      try {
         ++field8725;
         int var3 = 53 / ((-69 - arg1) / 52);
         return ~(arg2 & 458752) != -1 | class256.method1960(arg0, -117, arg2) || class430.method3224(arg0, arg2, 50);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8742[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4541(int arg0) {
      try {
         field8733 = null;
         if (arg0 < -86) {
            field8724 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8742[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "b",
      descriptor = "(III)Z"
   )
   private final boolean method4542(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 2048) {
            this.field8737 = 117;
         }

         ++field8721;
         int var4 = (arg0 + arg1) * this.field8731 >> 12;
         int var5 = class210.field2607[255 & var4 * 255 >> 12];
         int var6 = (var5 << 12) / this.field8731;
         int var7 = (var6 << 12) / this.field8734;
         int var8 = this.field8727 * var7 >> 12;
         return ~var8 < ~(-arg0 + arg1) && arg1 - arg0 > -var8;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field8742[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(BILwm;)V"
   )
   public static final void method4543(byte arg0, int arg1, class594 arg2) {
      try {
         if (class532.field7280 != null) {
            try {
               class532.field7280.method1977(6825, 0L);
               class532.field7280.method1981(false, 24, arg2.field8227, arg1);
            } catch (Exception var5) {
            }
         }

         ++field8735;
         int var3 = -104 / ((arg0 - -54) / 36);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8742[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8742[2] : field8742[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "c",
      descriptor = "(BII)Z"
   )
   private final boolean method4544(byte arg0, int arg1, int arg2) {
      try {
         ++field8740;
         int var4 = (-arg2 + arg1) * this.field8731 >> 12;
         int var5 = class210.field2607[255 & var4 * 255 >> 12];
         int var6 = (var5 << 12) / this.field8731;
         int var7 = (var6 << 12) / this.field8734;
         int var8 = this.field8727 * var7 >> 12;
         int var9 = -51 / ((arg0 - -23) / 63);
         return ~var8 < ~(arg1 + arg2) && arg1 + arg2 > -var8;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field8742[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "<init>",
      descriptor = "()V"
   )
   public class625() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!rj",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         class39.method296((byte)56);
         ++field8738;
         if (arg0 != 28274) {
            field8724 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8742[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method4545(int arg0, int arg1, byte arg2) {
      try {
         ++field8723;
         if (arg2 != -111) {
            field8733 = null;
         }

         return (class470.method3447(8, arg1, arg0) | class47.method400(arg2 ^ -112, arg0, arg1) | class715.method5203(arg1, true, arg0)) & class724.method5258(arg1, 0, arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8742[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(IIZ)Lwia;"
   )
   public static final class794 method4546(int arg0, int arg1, boolean arg2) {
      boolean var3 = client.field4273;

      try {
         ++field8741;
         class411[] var4 = class558.field7652;
         synchronized(class558.field7652) {
            if (arg0 != 0) {
               method4540(-87, 85, 94);
            }

            class794 var5;
            label46: {
               if (~class558.field7652.length < ~arg1 && !class558.field7652[arg1].method3115(false)) {
                  var5 = (class794)class558.field7652[arg1].method3109((byte)-87);
                  var5.method5512((byte)103);
                  int var10002 = class580.field7964[arg1]--;
                  if (!var3) {
                     break label46;
                  }
               }

               var5 = new class794();
               var5.field11601 = new class52[arg1];
               int var6 = 0;
               if (var3 || var6 < arg1) {
                  do {
                     var5.field11601[var6] = new class52();
                     ++var6;
                  } while(var6 < arg1);
               }
            }

            var5.field11599 = arg2;
            return var5;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field8742[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "b",
      descriptor = "(BII)I"
   )
   public static final int method4547(byte arg0, int arg1, int arg2) {
      try {
         ++field8722;
         if (arg0 <= 72) {
            return 59;
         } else {
            int var3 = arg2 >>> 24;
            int var4 = -var3 + 255;
            int var7 = (-16711936 & (arg2 & 16711935) * var3 | 16711680 & (arg2 & 65280) * var3) >>> 8;
            return (((arg1 & 16711935) * var4 & -16711936 | (arg1 & 65280) * var4 & 16711680) >>> 8) + var7;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8742[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 2064866508) {
            return null;
         } else {
            ++field8720;
            int[] var4 = super.field2650.method3769(arg0, -4);
            if (super.field2650.field7140) {
               int var5 = class551.field7586[arg0] + -2048;
               int var6 = 0;
               if (var3 || class576.field7916 > var6) {
                  do {
                     int var7 = class534.field7301[var6] + -2048;
                     int var8 = this.field8726 + var7;
                     int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                     int var10 = ~var9 >= -2049 ? var9 : var9 + -4096;
                     int var11 = var5 - -this.field8732;
                     int var12 = ~var11 > 2047 ? var11 + 4096 : var11;
                     int var13 = var12 > 2048 ? var12 + -4096 : var12;
                     int var14 = this.field8737 + var7;
                     int var15 = var14 < -2048 ? var14 + 4096 : var14;
                     int var16 = ~var15 < -2049 ? var15 + -4096 : var15;
                     int var17 = this.field8728 + var5;
                     int var18 = var17 >= -2048 ? var17 : var17 + 4096;
                     int var19 = var18 > 2048 ? var18 + -4096 : var18;
                     var4[var6] = !this.method4544((byte)-100, var13, var10) ? (this.method4542(var16, var19, 2048) ? 4096 : 0) : 4096;
                     ++var6;
                  } while(class576.field7916 > var6);
               }
            }

            return var4;
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field8742[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4548(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4549(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
