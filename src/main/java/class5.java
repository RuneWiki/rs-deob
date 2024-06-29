import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 {
   @OriginalMember(
      owner = "client!dc",
      name = "o",
      descriptor = "I"
   )
   private int field47;
   @OriginalMember(
      owner = "client!dc",
      name = "l",
      descriptor = "I"
   )
   private int field50;
   @OriginalMember(
      owner = "client!dc",
      name = "q",
      descriptor = "I"
   )
   private int field52;
   @OriginalMember(
      owner = "client!dc",
      name = "p",
      descriptor = "Z"
   )
   private boolean field45;
   @OriginalMember(
      owner = "client!dc",
      name = "k",
      descriptor = "I"
   )
   private int field49;
   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "I"
   )
   private int field40;
   @OriginalMember(
      owner = "client!dc",
      name = "i",
      descriptor = "I"
   )
   private int field41;
   @OriginalMember(
      owner = "client!dc",
      name = "e",
      descriptor = "I"
   )
   private int field57;
   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "[I"
   )
   private static int[] field55 = new int[4];
   @OriginalMember(
      owner = "client!dc",
      name = "c",
      descriptor = "I"
   )
   private int field44;
   @OriginalMember(
      owner = "client!dc",
      name = "n",
      descriptor = "I"
   )
   private int field46;
   @OriginalMember(
      owner = "client!dc",
      name = "f",
      descriptor = "I"
   )
   private int field48;
   @OriginalMember(
      owner = "client!dc",
      name = "m",
      descriptor = "I"
   )
   public int field54;
   @OriginalMember(
      owner = "client!dc",
      name = "d",
      descriptor = "I"
   )
   private int field56;
   @OriginalMember(
      owner = "client!dc",
      name = "g",
      descriptor = "Lbg;"
   )
   private static class492 field43;
   @OriginalMember(
      owner = "client!dc",
      name = "h",
      descriptor = "Lbg;"
   )
   private static class492 field51;
   @OriginalMember(
      owner = "client!dc",
      name = "j",
      descriptor = "Lbg;"
   )
   private class492 field53;
   @OriginalMember(
      owner = "client!dc",
      name = "r",
      descriptor = "Lka;"
   )
   private static class500 field42;

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(Lha;Ldc;)V"
   )
   private final void method24(class66 arg0, class5 arg1) {
      class464 var3 = class695.method5060(this.field49, 0, (byte)-52, class57.field702);
      if (var3 != null) {
         arg0.method605(field55);
         arg0.method592(0, 0, this.field48, this.field48);
         arg0.method496(0, 0, this.field48, this.field48, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if (arg1 != null) {
            if (arg1.field45) {
               var4 = -arg1.field47;
               var5 = -arg1.field50;
               var6 = -arg1.field52;
            } else {
               var4 = this.field47 - arg1.field47;
               var5 = this.field50 - arg1.field50;
               var6 = this.field52 - arg1.field52;
            }
         }

         if (this.field44 != 0) {
            int var7 = -this.field44 & 16383;
            int var8 = class363.field4956[var7];
            int var9 = class363.field4987[var7];
            int var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if (this.field46 != 0) {
            int var11 = -this.field46 & 16383;
            int var12 = class363.field4956[var11];
            int var13 = class363.field4987[var11];
            int var14 = var4 * var13 + var6 * var12 >> 14;
            var6 = var6 * var13 - var4 * var12 >> 14;
            var4 = var14;
         }

         arg0.method534(1.0F);
         arg0.method582(16777215, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         class500 var15 = arg0.method555(var3, 2048, 0, 64, 768);
         int var16 = var15.method220() - var15.method199();
         int var17 = var15.method201() - var15.method226();
         int var18 = var15.method199() + var16 / 2;
         int var19 = var15.method226() + var17 / 2;
         int var20 = var16 > var17 ? var16 : var17;
         arg0.method492(var18, var19, var20, var20);
         arg0.method532(arg0.method596());
         class521 var21 = arg0.method598();
         var21.method1217(0, 0, arg0.method595() - var15.method197());
         var15.method182(var21, (class307)null, arg0.method595(), 1);
         this.field53 = arg0.method552(0, 0, this.field48, this.field48, true);
         this.field53.method424(0, 0, 3);
         arg0.method592(field55[0], field55[1], field55[2], field55[3]);
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "c",
      descriptor = "(Lha;Ldc;)Z"
   )
   public final boolean method25(class66 arg0, class5 arg1) {
      return this.field53 != null || this.method33(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "()V"
   )
   public static final void method26() {
      field42 = null;
      field43 = null;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "(Lha;Ldc;)V"
   )
   private final void method27(class66 arg0, class5 arg1) {
      method34(arg0);
      method31(arg0);
      arg0.method605(field55);
      arg0.method592(0, 0, this.field48, this.field48);
      arg0.method523();
      arg0.method496(0, 0, this.field48, this.field48, -16777216 | this.field40, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if (arg1 != null) {
         if (arg1.field45) {
            var3 = -arg1.field47;
            var4 = -arg1.field50;
            var5 = -arg1.field52;
         } else {
            var3 = arg1.field47 - this.field47;
            var4 = arg1.field50 - this.field50;
            var5 = arg1.field52 - this.field52;
         }
      }

      if (this.field44 != 0) {
         int var6 = class363.field4956[this.field44];
         int var7 = class363.field4987[this.field44];
         int var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if (this.field46 != 0) {
         int var9 = class363.field4956[this.field46];
         int var10 = class363.field4987[this.field46];
         int var11 = var3 * var10 + var5 * var9 >> 14;
         var5 = var5 * var10 - var3 * var9 >> 14;
         var3 = var11;
      }

      class500 var12 = field42.method159((byte)0, 51200, true);
      var12.method176((short)0, (short)this.field49);
      arg0.method534(1.0F);
      arg0.method582(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      int var13 = this.field48 * 1024 / (var12.method220() - var12.method199());
      if (this.field40 != 0) {
         var13 = var13 * 13 / 16;
      }

      arg0.method492(this.field48 / 2, this.field48 / 2, var13, var13);
      arg0.method532(arg0.method596());
      class521 var14 = arg0.method596();
      var14.method1217(0, 0, arg0.method595() - var12.method197());
      var12.method182(var14, (class307)null, 1024, 1);
      int var15 = this.field48 * 13 / 16;
      int var16 = (this.field48 - var15) / 2;
      field51.method3570(var16, var16, var15, var15, 0, -16777216 | this.field40, 1);
      this.field53 = arg0.method552(0, 0, this.field48, this.field48, true);
      arg0.method523();
      arg0.method496(0, 0, this.field48, this.field48, 0, 0);
      field43.method3570(0, 0, this.field48, this.field48, 1, 0, 0);
      this.field53.method424(0, 0, 0);
      arg0.method592(field55[0], field55[1], field55[2], field55[3]);
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method28(int arg0, int arg1, int arg2, int arg3) {
      int var8;
      int var9;
      int var10;
      if (!this.field45) {
         int var5 = this.field47 - arg0;
         int var6 = this.field50 - arg1;
         int var7 = this.field52 - arg2;
         this.field54 = (int)Math.sqrt((double)(var7 * var7 + var5 * var5 + var6 * var6));
         if (this.field54 == 0) {
            this.field54 = 1;
         }

         var8 = (var5 << 8) / this.field54;
         var9 = (var6 << 8) / this.field54;
         var10 = (var7 << 8) / this.field54;
      } else {
         this.field54 = 1073741823;
         var8 = this.field47;
         var9 = this.field50;
         var10 = this.field52;
      }

      int var11 = (int)(Math.sqrt((double)(var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
      if (var11 > 128) {
         var8 = (var8 << 16) / var11;
         var9 = (var9 << 16) / var11;
         var10 = (var10 << 16) / var11;
         this.field56 = this.field41 * arg3 / (this.field45 ? 1024 : this.field54);
      } else {
         this.field56 = 0;
      }

      if (this.field56 < 8) {
         this.field53 = null;
         return false;
      } else {
         int var12 = class350.method2552(false, this.field56);
         if (var12 > arg3) {
            var12 = class22.method136(arg3, (byte)48);
         }

         if (var12 > 512) {
            var12 = 512;
         }

         if (this.field48 != var12) {
            this.field48 = var12;
         }

         this.field44 = (int)(Math.asin((double)((float)var9 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.field46 = (int)(Math.atan2((double)var8, (double)(-var10)) * 2607.5945876176133D) & 16383;
         this.field53 = null;
         return true;
      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "c",
      descriptor = "()V"
   )
   public static void method29() {
      field42 = null;
      field51 = null;
      field43 = null;
      field55 = null;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "()V"
   )
   public final void method30() {
      this.field53 = null;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(Lha;)V"
   )
   private static final void method31(class66 arg0) {
      if (field43 == null) {
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

         field43 = arg0.method548(-19069, 128, var2, 128, 128, 0);
         field51 = arg0.method548(-19069, 128, var1, 128, 128, 0);
      }

   }

   @OriginalMember(
      owner = "client!dc",
      name = "a",
      descriptor = "(Lha;IIIIII)V"
   )
   public final void method32(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field53 != null) {
         int var8 = this.field44 - arg5 & 16383;
         int var9 = this.field46 - arg6 & 16383;
         if (var9 > 8192) {
            var9 -= 16384;
         }

         if (var8 > 8192) {
            var8 -= 16384;
         }

         int var10 = arg4 * var8 / 4096 + (arg4 - this.field56) / 2;
         int var11 = arg4 * var9 / -4096 + (arg3 - this.field56) / 2;
         if (var10 < arg4 && this.field56 + var10 > 0 && var11 < arg3 && this.field56 + var11 > 0) {
            this.field53.method3577(arg1 + var11, arg2 + var10, this.field56, this.field56);
         }

      }
   }

   @OriginalMember(
      owner = "client!dc",
      name = "d",
      descriptor = "(Lha;Ldc;)Z"
   )
   private final boolean method33(class66 arg0, class5 arg1) {
      if (this.field53 == null) {
         if (this.field57 == 0) {
            if (class265.field3655.method1353(this.field49, (byte)123)) {
               int[] var3 = class265.field3655.method1351(this.field48, 0.7F, false, this.field49, 12356, this.field48);
               this.field53 = arg0.method548(-19069, this.field48, var3, this.field48, this.field48, 0);
            }
         } else if (this.field57 == 2) {
            this.method24(arg0, arg1);
         } else if (this.field57 == 1) {
            this.method27(arg0, arg1);
         }
      }

      return this.field53 != null;
   }

   @OriginalMember(
      owner = "client!dc",
      name = "b",
      descriptor = "(Lha;)V"
   )
   private static final void method34(class66 arg0) {
      if (field42 == null) {
         class464 var1 = new class464(580, 1104, 1);
         var1.method3374((short)1024, (short)1024, (byte)0, (short)32767, 0, (short)0, (short)0, (byte)0, (short)1024, (byte)0);
         var1.method3366(127, 0, 128, 0);
         var1.method3366(124, 0, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = class363.field4956[var3];
            int var5 = class363.field4987[var3];

            for(int var6 = 1; var6 < 24; ++var6) {
               int var12 = var6 * 8192 / 24;
               int var13 = class363.field4987[var12] >> 7;
               int var14 = class363.field4956[var12] * var4 >> 21;
               int var15 = class363.field4956[var12] * var5 >> 21;
               var1.method3366(127, var15, var13, -var14);
            }

            if (var2 > 0) {
               int var7 = var2 * 23 + 2;
               int var8 = var7 - 23;
               var1.method3375((short)127, (byte)35, var8, (byte)0, (byte)0, var7, 0, (byte)0, (short)0);

               for(int var9 = 1; var9 < 23; ++var9) {
                  int var10 = var8 + 1;
                  int var11 = var7 + 1;
                  var1.method3375((short)127, (byte)32, var10, (byte)0, (byte)0, var7, var8, (byte)0, (short)0);
                  var1.method3375((short)127, (byte)125, var11, (byte)0, (byte)0, var7, var10, (byte)0, (short)0);
                  var8 = var10;
                  var7 = var11;
               }

               var1.method3375((short)127, (byte)67, var8, (byte)0, (byte)0, 1, var7, (byte)0, (short)0);
            }
         }

         var1.field6706 = var1.field6686;
         var1.field6704 = null;
         var1.field6658 = null;
         var1.field6677 = null;
         field42 = arg0.method555(var1, 51200, 33, 64, 768);
      }

   }

   @OriginalMember(
      owner = "client!dc",
      name = "<init>",
      descriptor = "(IIIIIIIZ)V"
   )
   public class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      this.field47 = arg2;
      this.field50 = arg3;
      this.field52 = arg4;
      this.field45 = arg7;
      this.field49 = arg1;
      this.field40 = arg6;
      this.field41 = arg5;
      this.field57 = arg0;
   }
}
