import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class754 {
   @OriginalMember(
      owner = "client!tfa",
      name = "k",
      descriptor = "I"
   )
   private int field10786;
   @OriginalMember(
      owner = "client!tfa",
      name = "i",
      descriptor = "I"
   )
   private int field10777;
   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "I"
   )
   private int field10776;
   @OriginalMember(
      owner = "client!tfa",
      name = "f",
      descriptor = "Z"
   )
   private boolean field10778;
   @OriginalMember(
      owner = "client!tfa",
      name = "e",
      descriptor = "I"
   )
   private int field10789;
   @OriginalMember(
      owner = "client!tfa",
      name = "t",
      descriptor = "I"
   )
   private int field10782;
   @OriginalMember(
      owner = "client!tfa",
      name = "l",
      descriptor = "I"
   )
   private int field10791;
   @OriginalMember(
      owner = "client!tfa",
      name = "p",
      descriptor = "I"
   )
   private int field10785;
   @OriginalMember(
      owner = "client!tfa",
      name = "q",
      descriptor = "I"
   )
   private int field10790;
   @OriginalMember(
      owner = "client!tfa",
      name = "n",
      descriptor = "I"
   )
   private int field10794;
   @OriginalMember(
      owner = "client!tfa",
      name = "h",
      descriptor = "I"
   )
   private int field10781;
   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "[I"
   )
   private static int[] field10779 = new int[4];
   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "I"
   )
   private int field10774;
   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "I"
   )
   private int field10783;
   @OriginalMember(
      owner = "client!tfa",
      name = "o",
      descriptor = "I"
   )
   private int field10787;
   @OriginalMember(
      owner = "client!tfa",
      name = "r",
      descriptor = "I"
   )
   private int field10788;
   @OriginalMember(
      owner = "client!tfa",
      name = "s",
      descriptor = "I"
   )
   public int field10793;
   @OriginalMember(
      owner = "client!tfa",
      name = "u",
      descriptor = "Lma;"
   )
   private static class148 field10775;
   @OriginalMember(
      owner = "client!tfa",
      name = "j",
      descriptor = "Lma;"
   )
   private static class148 field10780;
   @OriginalMember(
      owner = "client!tfa",
      name = "g",
      descriptor = "Lma;"
   )
   private class148 field10792;
   @OriginalMember(
      owner = "client!tfa",
      name = "m",
      descriptor = "Lka;"
   )
   private static class761 field10784;

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method5445(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field10778) {
         int var5 = this.field10786 - arg0;
         int var6 = this.field10777 - arg1;
         int var7 = this.field10776 - arg2;
         this.field10793 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field10793 == 0) {
            this.field10793 = 1;
         }

         var8 = (var5 << 8) / this.field10793;
         var9 = (var6 << 8) / this.field10793;
         var10 = (var7 << 8) / this.field10793;
      } else {
         this.field10793 = 1073741823;
         var8 = this.field10786;
         var9 = this.field10777;
         var10 = this.field10776;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field10783 = this.field10791 * arg3 / (this.field10778 ? 1024 : this.field10793);
      } else {
         this.field10783 = 0;
      }

      if (this.field10783 < 8) {
         this.field10792 = null;
         return false;
      } else {
         int var12 = class645.method4694(this.field10783, (byte)-128);
         if (var12 > arg3) {
            var12 = class397.method3090((byte)-113, arg3);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field10774 != var12) {
            this.field10774 = var12;
         }

         this.field10787 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field10788 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field10792 = null;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "d",
      descriptor = "(Lha;Ltfa;)V"
   )
   private final void method5446(class17 arg0, class754 arg1) {
      class590 var3 = class362.method2845(class297.field4415, this.field10789, 0, (byte)-104);
      if (var3 != null) {
         arg0.method211(field10779);
         arg0.method150(0, 0, this.field10774, this.field10774);
         arg0.method144();
         arg0.method226(0, 0, this.field10774, this.field10774, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field10778) {
               var4 = -arg1.field10786;
               var5 = -arg1.field10777;
               var6 = -arg1.field10776;
            } else {
               var4 = this.field10786 - arg1.field10786;
               var5 = this.field10777 - arg1.field10777;
               var6 = this.field10776 - arg1.field10776;
            }
         }

         if (this.field10787 != 0) {
            int var7 = -this.field10787 & 16383;
            int var8 = class160.field2447[var7];
            int var9 = class160.field2446[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field10788 != 0) {
            int var11 = -this.field10788 & 16383;
            int var12 = class160.field2447[var11];
            int var13 = class160.field2446[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method197(1.0F);
         arg0.method154(this.field10782, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         var3.method4334(this.field10794 & 16383, this.field10790 & 16383, this.field10781 & 16383, 12949);
         class761 var15 = arg0.method240(var3, 2048, 0, 64, 768);
         int var16 = var15.method797() - var15.method800();
         int var17 = var15.method758() - var15.method801();
         int var18 = var16 > var17 ? var16 : var17;
         int var19 = this.field10774 * 1024 / var18;
         int[] var20 = arg0.method147();
         arg0.method256(this.field10774 / 2, this.field10774 / 2, var19, var19);
         arg0.method255(arg0.method183());
         class502 var21 = arg0.method254();
         var21.method322(0, 0, arg0.method141() - var15.method779());
         var15.method763(var21, (class213)null, arg0.method141(), 1);
         this.field10792 = arg0.method159(0, 0, this.field10774, this.field10774, true);
         this.field10792.method1360(0, 0, 3);
         arg0.method256(var20[0], var20[1], var20[2], var20[3]);
         arg0.method150(field10779[0], field10779[1], field10779[2], field10779[3]);
      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(Lha;)V"
   )
   private static final void method5447(class17 arg0) {
      if (field10775 == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            int var5 = var4 * var4;
            int var6 = 128 - var3 - 1;
            int var7 = var3 * 128;
            int var8 = var6 * 128;

            for(int var9 = 0; var9 < 64; ++var9) {
               int var10 = 64 - var9;
               int var11 = var10 * var10;
               int var12 = 128 - var9 - 1;
               int var13 = 256 - (var5 + var11 << 8) / 4096;
               int var14 = var13 * 16 * 192 / 1536;
               if (var14 < 0) {
                  var14 = 0;
               } else if (var14 > 255) {
                  var14 = 255;
               }

               int var15 = var14 / 2;
               var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = -16777216 | var14 << 16;
               var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 16777215;
            }
         }

         field10775 = arg0.method215(128, 128, var2, 128, 0, 1);
         field10780 = arg0.method215(128, 128, var1, 128, 0, 1);
      }

   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(Lha;IIIIIIIIII)V"
   )
   public final void method5448(class17 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      if (this.field10792 != null) {
         int[] var12 = new int[3];
         int var13 = -(this.field10786 - arg7 << 16);
         int var14 = this.field10777 - arg8 << 15;
         int var15 = -(this.field10776 - arg9 << 16);
         class502 var16 = arg0.method176();
         var16.method332(0, 0, 0, var12);
         int var17 = var12[0] + var13;
         int var18 = var12[1] + var14;
         int var19 = var12[2] + var15;
         arg0.method248(var17, var18, var19, var12);
         if (var12[2] >= 0) {
            int var20 = var12[0] - this.field10783 / 2;
            int var21 = var12[1] - this.field10783 / 2;
            if (var21 < arg4 && this.field10783 + var21 > 0 && var20 < arg3 && this.field10783 + var20 > 0) {
               this.field10792.method1450(var20, var21, this.field10783, this.field10783, 0, arg10 << 24 | 16777215, 1);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "(Lha;Ltfa;)Z"
   )
   public final boolean method5449(class17 arg0, class754 arg1) {
      return this.field10792 != null || this.method5450(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "c",
      descriptor = "(Lha;Ltfa;)Z"
   )
   private final boolean method5450(class17 arg0, class754 arg1) {
      if (this.field10792 == null) {
         if (this.field10785 == 0) {
            if (class662.field9328.method2036(this.field10789, (byte)-103)) {
               int[] var3 = class662.field9328.method2042(0.7F, this.field10789, false, this.field10774, this.field10774, true);
               this.field10792 = arg0.method215(this.field10774, this.field10774, var3, this.field10774, 0, 1);
            }
         } else if (this.field10785 == 2) {
            this.method5446(arg0, arg1);
         } else if (this.field10785 == 1) {
            this.method5451(arg0, arg1);
         }
      }

      return this.field10792 != null;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "(Lha;Ltfa;)V"
   )
   private final void method5451(class17 arg0, class754 arg1) {
      method5454(arg0);
      method5447(arg0);
      arg0.method211(field10779);
      arg0.method150(0, 0, this.field10774, this.field10774);
      arg0.method144();
      arg0.method226(0, 0, this.field10774, this.field10774, -16777216 | this.field10782, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field10778) {
            var3 = -arg1.field10786;
            var4 = -arg1.field10777;
            var5 = -arg1.field10776;
         } else {
            var3 = arg1.field10786 - this.field10786;
            var4 = arg1.field10777 - this.field10777;
            var5 = arg1.field10776 - this.field10776;
         }
      }

      if (this.field10787 != 0) {
         int var6 = class160.field2447[this.field10787];
         int var7 = class160.field2446[this.field10787];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field10788 != 0) {
         int var9 = class160.field2447[this.field10788];
         int var10 = class160.field2446[this.field10788];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class761 var12 = field10784.method755((byte)0, 51200, true);
      var12.method811((short)0, (short)this.field10789);
      arg0.method197(1.0F);
      arg0.method154(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field10774 * 1024 / (var12.method797() - var12.method800());
      if (this.field10782 != 0) {
         var13 = var13 * 13 / 16;
      }

      int[] var14 = arg0.method147();
      arg0.method256(this.field10774 / 2, this.field10774 / 2, var13, var13);
      arg0.method255(arg0.method183());
      class502 var15 = arg0.method183();
      var15.method322(0, 0, arg0.method141() - var12.method779());
      var12.method763(var15, (class213)null, 1024, 1);
      int var16 = this.field10774 * 13 / 16;
      int var17 = (this.field10774 - var16) / 2;
      field10780.method1450(var17, var17, var16, var16, 0, -16777216 | this.field10782, 1);
      this.field10792 = arg0.method159(0, 0, this.field10774, this.field10774, true);
      arg0.method144();
      arg0.method226(0, 0, this.field10774, this.field10774, 0, 0);
      field10775.method1450(0, 0, this.field10774, this.field10774, 1, 0, 0);
      this.field10792.method1360(0, 0, 3);
      arg0.method256(var14[0], var14[1], var14[2], var14[3]);
      arg0.method150(field10779[0], field10779[1], field10779[2], field10779[3]);
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "()V"
   )
   public static final void method5452() {
      field10784 = null;
      field10775 = null;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "a",
      descriptor = "()V"
   )
   public static void method5453() {
      field10784 = null;
      field10780 = null;
      field10775 = null;
      field10779 = null;
   }

   @OriginalMember(
      owner = "client!tfa",
      name = "b",
      descriptor = "(Lha;)V"
   )
   private static final void method5454(class17 arg0) {
      if (field10784 == null) {
         class590 var1 = new class590(580, 1104, 1);
         var1.method4331((byte)0, (short)1024, (short)0, (short)1024, (byte)0, (short)32767, 126, (short)0, (short)1024, (byte)0);
         var1.method4340(0, 128, 0, 0);
         var1.method4340(0, -128, 0, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class160.field2447[var3];
            int var5 = class160.field2446[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var12 = var6 * 8192 / 24;
               int var13 = class160.field2446[var12] >> 7;
               int var14 = class160.field2447[var12] * var4 >> 21;
               int var15 = class160.field2447[var12] * var5 >> 21;
               var1.method4340(var15, var13, -var14, 0);
            }

            if (var2 > 0) {
               int var7 = var2 * 23 + 2;
               int var8 = var7 - 23;
               var1.method4337((short)127, var8, (short)0, (byte)0, 16695, var7, (byte)0, (byte)0, 0);

               for(int var9 = 1; var9 < 23; ++var9) {
                  int var10 = var8 + 1;
                  int var11 = var7 + 1;
                  var1.method4337((short)127, var10, (short)0, (byte)0, 16695, var7, (byte)0, (byte)0, var8);
                  var1.method4337((short)127, var11, (short)0, (byte)0, 16695, var7, (byte)0, (byte)0, var10);
                  var8 = var10;
                  var7 = var11;
               }

               var1.method4337((short)127, var8, (short)0, (byte)0, 16695, 1, (byte)0, (byte)0, var7);
            }
         }

         var1.field8306 = var1.field8307;
         var1.field8310 = null;
         var1.field8329 = null;
         var1.field8327 = null;
         field10784 = arg0.method240(var1, 51200, 33, 64, 768);
      }

   }

   @OriginalMember(
      owner = "client!tfa",
      name = "<init>",
      descriptor = "(IIIIIIIZIII)V"
   )
   public class754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
      this.field10786 = arg2;
      this.field10777 = arg3;
      this.field10776 = arg4;
      this.field10778 = arg7;
      this.field10789 = arg1;
      this.field10782 = arg6;
      this.field10791 = arg5;
      this.field10785 = arg0;
      this.field10790 = arg8;
      this.field10794 = arg9;
      this.field10781 = arg10;
   }
}
