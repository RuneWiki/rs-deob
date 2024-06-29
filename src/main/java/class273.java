import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class273 extends class302 {
   @OriginalMember(
      owner = "client!mb",
      name = "J",
      descriptor = "I"
   )
   private int field3800 = 0;
   @OriginalMember(
      owner = "client!mb",
      name = "O",
      descriptor = "I"
   )
   private int field3805 = 0;
   @OriginalMember(
      owner = "client!mb",
      name = "M",
      descriptor = "I"
   )
   private int field3807 = 2048;
   @OriginalMember(
      owner = "client!mb",
      name = "H",
      descriptor = "I"
   )
   private int field3801 = 12288;
   @OriginalMember(
      owner = "client!mb",
      name = "L",
      descriptor = "I"
   )
   private int field3809 = 2048;
   @OriginalMember(
      owner = "client!mb",
      name = "N",
      descriptor = "I"
   )
   private int field3811 = 4096;
   @OriginalMember(
      owner = "client!mb",
      name = "S",
      descriptor = "I"
   )
   private int field3812 = 8192;
   @OriginalMember(
      owner = "client!mb",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3813 = new String[]{method2107(method2106("\r~N2!")), method2107(method2106("\u000ei\f\u0019")), method2107(method2106("\r~N3!")), method2107(method2106("\u001b2N[t")), method2107(method2106("\r~N6!")), method2107(method2106("\r~N4!")), method2107(method2106("\r~N1!")), method2107(method2106("\r~N0!"))};
   @OriginalMember(
      owner = "client!mb",
      name = "K",
      descriptor = "[S"
   )
   public static short[] field3810 = new short[256];
   @OriginalMember(
      owner = "client!mb",
      name = "P",
      descriptor = "I"
   )
   public static int field3798;
   @OriginalMember(
      owner = "client!mb",
      name = "U",
      descriptor = "I"
   )
   public static int field3799;
   @OriginalMember(
      owner = "client!mb",
      name = "Q",
      descriptor = "I"
   )
   public static int field3802;
   @OriginalMember(
      owner = "client!mb",
      name = "T",
      descriptor = "I"
   )
   public static int field3803;
   @OriginalMember(
      owner = "client!mb",
      name = "I",
      descriptor = "I"
   )
   public static int field3804;
   @OriginalMember(
      owner = "client!mb",
      name = "V",
      descriptor = "I"
   )
   public static int field3806;
   @OriginalMember(
      owner = "client!mb",
      name = "R",
      descriptor = "I"
   )
   public static int field3808;

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      try {
         class378.method2923(82);
         if (arg0 <= -87) {
            ++field3802;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3813[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 >= -37) {
            return null;
         } else {
            ++field3806;
            int[] var4 = super.field4298.method3175(arg0, (byte)-127);
            if (super.field4298.field6356) {
               int var5 = class23.field241[arg0] + -2048;
               int var6 = 0;
               if (var3 != 0 || class344.field5238 > var6) {
                  do {
                     int var7 = class757.field11167[var6] + -2048;
                     int var8 = var7 - -this.field3807;
                     int var9 = var8 < -2048 ? var8 + 4096 : var8;
                     int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                     int var11 = this.field3800 + var5;
                     int var12 = ~var11 <= 2047 ? var11 : var11 + 4096;
                     int var13 = ~var12 >= -2049 ? var12 : var12 + -4096;
                     int var14 = this.field3805 + var7;
                     int var15 = var14 >= -2048 ? var14 : var14 + 4096;
                     int var16 = var15 <= 2048 ? var15 : var15 + -4096;
                     int var17 = this.field3809 + var5;
                     int var18 = ~var17 <= 2047 ? var17 : var17 + 4096;
                     int var19 = ~var18 >= -2049 ? var18 : var18 + -4096;
                     var4[var6] = !this.method2103(var10, var13, 0) ? (this.method2104(var19, var16, (byte)-118) ? 4096 : 0) : 4096;
                     ++var6;
                  } while(class344.field5238 > var6);
               }
            }

            return var4;
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field3813[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "c",
      descriptor = "(III)Z"
   )
   private final boolean method2103(int arg0, int arg1, int arg2) {
      try {
         ++field3799;
         if (arg2 != 0) {
            this.field3800 = 15;
         }

         int var4 = (-arg0 + arg1) * this.field3801 >> 12;
         int var5 = class724.field10777[(var4 * 255 & 1047956) >> 12];
         int var6 = (var5 << 12) / this.field3801;
         int var7 = (var6 << 12) / this.field3812;
         int var8 = this.field3811 * var7 >> 12;
         return arg0 + arg1 < var8 && arg0 + arg1 > -var8;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3813[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "<init>",
      descriptor = "()V"
   )
   public class273() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IIB)Z"
   )
   private final boolean method2104(int arg0, int arg1, byte arg2) {
      try {
         int var4 = 16 % ((-11 - arg2) / 53);
         ++field3798;
         int var5 = (arg0 + arg1) * this.field3801 >> 12;
         int var6 = class724.field10777[(1046723 & var5 * 255) >> 12];
         int var7 = (var6 << 12) / this.field3801;
         int var8 = (var7 << 12) / this.field3812;
         int var9 = this.field3811 * var8 >> 12;
         return arg0 - arg1 < var9 && -arg1 + arg0 > -var9;
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field3813[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field3808;
         if (arg1 != 0) {
            this.method2103(86, 19, 71);
         }

         if (~arg0 != -1) {
            if (arg0 == 1) {
               this.field3800 = arg2.method1038((byte)-100);
               return;
            }

            if (~arg0 == -3) {
               this.field3805 = arg2.method1038((byte)-105);
               return;
            }

            if (~arg0 == -4) {
               this.field3809 = arg2.method1038((byte)-117);
               return;
            }

            if (~arg0 == -5) {
               this.field3801 = arg2.method1038((byte)-115);
               return;
            }

            if (~arg0 == -6) {
               this.field3811 = arg2.method1038((byte)-100);
               return;
            }

            if (arg0 != 6) {
               return;
            }

            if (client.field4530 == 0) {
               this.field3812 = arg2.method1038((byte)-101);
               return;
            }
         }

         this.field3807 = arg2.method1038((byte)-116);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3813[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3813[3] : field3813[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method2105(byte arg0) {
      try {
         field3810 = null;
         if (arg0 != -86) {
            field3804 = 91;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3813[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2106(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2107(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
