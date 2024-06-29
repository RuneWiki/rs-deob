import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class599 {
   @OriginalMember(
      owner = "client!fp",
      name = "o",
      descriptor = "I"
   )
   private int field8850;
   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "I"
   )
   private int field8842;
   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "I"
   )
   private int field8840;
   @OriginalMember(
      owner = "client!fp",
      name = "q",
      descriptor = "Z"
   )
   private boolean field8854;
   @OriginalMember(
      owner = "client!fp",
      name = "m",
      descriptor = "I"
   )
   private int field8853;
   @OriginalMember(
      owner = "client!fp",
      name = "j",
      descriptor = "I"
   )
   private int field8841;
   @OriginalMember(
      owner = "client!fp",
      name = "k",
      descriptor = "I"
   )
   private int field8845;
   @OriginalMember(
      owner = "client!fp",
      name = "e",
      descriptor = "I"
   )
   private int field8844;
   @OriginalMember(
      owner = "client!fp",
      name = "f",
      descriptor = "[I"
   )
   private static int[] field8857 = new int[4];
   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "I"
   )
   private int field8846;
   @OriginalMember(
      owner = "client!fp",
      name = "l",
      descriptor = "I"
   )
   public int field8847;
   @OriginalMember(
      owner = "client!fp",
      name = "p",
      descriptor = "I"
   )
   private int field8848;
   @OriginalMember(
      owner = "client!fp",
      name = "n",
      descriptor = "I"
   )
   private int field8851;
   @OriginalMember(
      owner = "client!fp",
      name = "d",
      descriptor = "I"
   )
   private int field8855;
   @OriginalMember(
      owner = "client!fp",
      name = "h",
      descriptor = "Lka;"
   )
   private static class232 field8852;
   @OriginalMember(
      owner = "client!fp",
      name = "r",
      descriptor = "Lpd;"
   )
   private static class648 field8843;
   @OriginalMember(
      owner = "client!fp",
      name = "g",
      descriptor = "Lpd;"
   )
   private static class648 field8849;
   @OriginalMember(
      owner = "client!fp",
      name = "i",
      descriptor = "Lpd;"
   )
   private class648 field8856;

   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "(Lha;Lfp;)V"
   )
   private final void method4453(class479 arg0, class599 arg1) {
      method4462(arg0);
      method4456(arg0);
      arg0.method417(field8857);
      arg0.method460(0, 0, this.field8846, this.field8846);
      arg0.method502();
      arg0.method513(0, 0, this.field8846, this.field8846, -16777216 | this.field8841, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field8854) {
            var3 = -arg1.field8850;
            var4 = -arg1.field8842;
            var5 = -arg1.field8840;
         } else {
            var3 = arg1.field8850 - this.field8850;
            var4 = arg1.field8842 - this.field8842;
            var5 = arg1.field8840 - this.field8840;
         }
      }

      if (this.field8851 != 0) {
         int var6 = class746.field10907[this.field8851];
         int var7 = class746.field10897[this.field8851];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field8848 != 0) {
         int var9 = class746.field10907[this.field8848];
         int var10 = class746.field10897[this.field8848];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class232 var12 = field8852.method1256((byte)0, 51200, true);
      var12.method1280((short)0, (short)this.field8853);
      arg0.method428(1.0F);
      arg0.method418(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field8846 * 1024 / (var12.method1295() - var12.method1226());
      if (this.field8841 != 0) {
         var13 = var13 * 13 / 16;
      }

      arg0.method504(this.field8846 / 2, this.field8846 / 2, var13, var13);
      arg0.method397(arg0.method480());
      class93 var14 = arg0.method480();
      var14.method860(0, 0, arg0.method519() - var12.method1261());
      var12.method1297(var14, (class687)null, 1024, 1);
      int var15 = this.field8846 * 13 / 16;
      int var16 = (this.field8846 - var15) / 2;
      field8849.method4769(var16, var16, var15, var15, 0, -16777216 | this.field8841, 1);
      this.field8856 = arg0.method414(0, 0, this.field8846, this.field8846, true);
      arg0.method502();
      arg0.method513(0, 0, this.field8846, this.field8846, 0, 0);
      field8843.method4769(0, 0, this.field8846, this.field8846, 1, 0, 0);
      this.field8856.method2410(0, 0, 0);
      arg0.method460(field8857[0], field8857[1], field8857[2], field8857[3]);
   }

   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "(Lha;Lfp;)Z"
   )
   public final boolean method4454(class479 arg0, class599 arg1) {
      return this.field8856 != null || this.method4455(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fp",
      name = "d",
      descriptor = "(Lha;Lfp;)Z"
   )
   private final boolean method4455(class479 arg0, class599 arg1) {
      if (this.field8856 == null) {
         if (this.field8844 == 0) {
            if (class484.field6738.method915(this.field8853, 127)) {
               int[] var3 = class484.field6738.method914(this.field8853, this.field8846, this.field8846, false, 0.7F, true);
               this.field8856 = arg0.method3638(this.field8846, -117, var3, this.field8846, this.field8846, 0);
            }
         } else if (this.field8844 == 2) {
            this.method4463(arg0, arg1);
         } else if (this.field8844 == 1) {
            this.method4453(arg0, arg1);
         }
      }

      return this.field8856 != null;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(Lha;)V"
   )
   private static final void method4456(class479 arg0) {
      if (field8843 == null) {
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

         field8843 = arg0.method3638(128, -61, var2, 128, 128, 0);
         field8849 = arg0.method3638(128, -74, var1, 128, 128, 0);
      }

   }

   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "()V"
   )
   public static void method4457() {
      field8852 = null;
      field8849 = null;
      field8843 = null;
      field8857 = null;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "()V"
   )
   public final void method4458() {
      this.field8856 = null;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "()V"
   )
   public static final void method4459() {
      field8852 = null;
      field8843 = null;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method4460(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field8854) {
         int var5 = this.field8850 - arg0;
         int var6 = this.field8842 - arg1;
         int var7 = this.field8840 - arg2;
         this.field8847 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field8847 == 0) {
            this.field8847 = 1;
         }

         var8 = (var5 << 8) / this.field8847;
         var9 = (var6 << 8) / this.field8847;
         var10 = (var7 << 8) / this.field8847;
      } else {
         this.field8847 = 1073741823;
         var8 = this.field8850;
         var9 = this.field8842;
         var10 = this.field8840;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field8855 = this.field8845 * arg3 / (this.field8854 ? 1024 : this.field8847);
      } else {
         this.field8855 = 0;
      }

      if (this.field8855 < 8) {
         this.field8856 = null;
         return false;
      } else {
         int var12 = class109.method978(-1, this.field8855);
         if (var12 > arg3) {
            var12 = class634.method4671(arg3, (byte)88);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field8846 != var12) {
            this.field8846 = var12;
         }

         this.field8851 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field8848 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field8856 = null;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(Lha;IIIIII)V"
   )
   public final void method4461(class479 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field8856 != null) {
         int var8 = this.field8851 - arg5 & 16383;
         int var9 = this.field8848 - arg6 & 16383;
         if (var9 > 8192) {
            var9 -= 16384;
         }

         if (var8 > 8192) {
            var8 -= 16384;
         }

         int var10 = arg4 * var8 / 4096 + (arg4 - this.field8855) / 2;
         int var11 = arg4 * var9 / -4096 + (arg3 - this.field8855) / 2;
         if (var10 < arg4 && this.field8855 + var10 > 0 && var11 < arg3 && this.field8855 + var11 > 0) {
            this.field8856.method4766(arg1 + var11, arg2 + var10, this.field8855, this.field8855);
         }

      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "(Lha;)V"
   )
   private static final void method4462(class479 arg0) {
      if (field8852 == null) {
         class167 var1 = new class167(580, 1104, 1);
         var1.method1450((byte)0, (byte)0, (short)32767, (short)1024, (byte)0, 12, (short)0, (short)1024, (short)0, (short)1024);
         var1.method1443(128, 1, 0, 0);
         var1.method1443(-128, 1, 0, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class746.field10907[var3];
            int var5 = class746.field10897[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var12 = var6 * 8192 / 24;
               int var13 = class746.field10897[var12] >> 7;
               int var14 = class746.field10907[var12] * var4 >> 21;
               int var15 = class746.field10907[var12] * var5 >> 21;
               var1.method1443(var13, 1, -var14, var15);
            }

            if (var2 > 0) {
               int var7 = var2 * 23 + 2;
               int var8 = var7 - 23;
               var1.method1452(var7, (byte)0, 0, (byte)0, var8, (short)0, (short)127, (byte)0, 20086);

               for(int var9 = 1; var9 < 23; ++var9) {
                  int var10 = var8 + 1;
                  int var11 = var7 + 1;
                  var1.method1452(var7, (byte)0, var8, (byte)0, var10, (short)0, (short)127, (byte)0, 20086);
                  var1.method1452(var7, (byte)0, var10, (byte)0, var11, (short)0, (short)127, (byte)0, 20086);
                  var8 = var10;
                  var7 = var11;
               }

               var1.method1452(1, (byte)0, var7, (byte)0, var8, (short)0, (short)127, (byte)0, 20086);
            }
         }

         var1.field2142 = var1.field2179;
         var1.field2186 = null;
         var1.field2167 = null;
         var1.field2140 = null;
         field8852 = arg0.method494(var1, 51200, 33, 64, 768);
      }

   }

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(Lha;Lfp;)V"
   )
   private final void method4463(class479 arg0, class599 arg1) {
      class167 var3 = class745.method5399(64, class323.field4419, this.field8853, 0);
      if (var3 != null) {
         arg0.method417(field8857);
         arg0.method460(0, 0, this.field8846, this.field8846);
         arg0.method513(0, 0, this.field8846, this.field8846, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field8854) {
               var4 = -arg1.field8850;
               var5 = -arg1.field8842;
               var6 = -arg1.field8840;
            } else {
               var4 = this.field8850 - arg1.field8850;
               var5 = this.field8842 - arg1.field8842;
               var6 = this.field8840 - arg1.field8840;
            }
         }

         if (this.field8851 != 0) {
            int var7 = -this.field8851 & 16383;
            int var8 = class746.field10907[var7];
            int var9 = class746.field10897[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field8848 != 0) {
            int var11 = -this.field8848 & 16383;
            int var12 = class746.field10907[var11];
            int var13 = class746.field10897[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method428(1.0F);
         arg0.method418(16777215, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         class232 var15 = arg0.method494(var3, 2048, 0, 64, 768);
         int var16 = var15.method1295() - var15.method1226();
         int var17 = var15.method1286() - var15.method1287();
         int var18 = var15.method1226() + var16 / 2;
         int var19 = var15.method1287() + var17 / 2;
         int var20 = var16 > var17 ? var16 : var17;
         arg0.method504(var18, var19, var20, var20);
         arg0.method397(arg0.method480());
         class93 var21 = arg0.method396();
         var21.method860(0, 0, arg0.method519() - var15.method1261());
         var15.method1297(var21, (class687)null, arg0.method519(), 1);
         this.field8856 = arg0.method414(0, 0, this.field8846, this.field8846, true);
         this.field8856.method2410(0, 0, 3);
         arg0.method460(field8857[0], field8857[1], field8857[2], field8857[3]);
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "<init>",
      descriptor = "(IIIIIIIZ)V"
   )
   public class599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      this.field8850 = arg2;
      this.field8842 = arg3;
      this.field8840 = arg4;
      this.field8854 = arg7;
      this.field8853 = arg1;
      this.field8841 = arg6;
      this.field8845 = arg5;
      this.field8844 = arg0;
   }
}
