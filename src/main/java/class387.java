import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class387 extends class476 {
   @OriginalMember(
      owner = "client!he",
      name = "m",
      descriptor = "Llga;"
   )
   public class739 field5722;
   @OriginalMember(
      owner = "client!he",
      name = "y",
      descriptor = "I"
   )
   public int field5704;
   @OriginalMember(
      owner = "client!he",
      name = "A",
      descriptor = "I"
   )
   public int field5727;
   @OriginalMember(
      owner = "client!he",
      name = "w",
      descriptor = "I"
   )
   public static int field5714 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "I"
   )
   private static int field5707 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "t",
      descriptor = "I"
   )
   public static int field5705 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "q",
      descriptor = "I"
   )
   public static int field5711 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "B",
      descriptor = "I"
   )
   public static int field5715 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "l",
      descriptor = "I"
   )
   public static int field5726 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "F",
      descriptor = "I"
   )
   public static int field5723 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "n",
      descriptor = "I"
   )
   private static int field5732 = 0;
   @OriginalMember(
      owner = "client!he",
      name = "e",
      descriptor = "I"
   )
   public static int field5700;
   @OriginalMember(
      owner = "client!he",
      name = "r",
      descriptor = "I"
   )
   public static int field5701;
   @OriginalMember(
      owner = "client!he",
      name = "C",
      descriptor = "I"
   )
   public static int field5702;
   @OriginalMember(
      owner = "client!he",
      name = "s",
      descriptor = "I"
   )
   public int field5703;
   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "I"
   )
   public static int field5706;
   @OriginalMember(
      owner = "client!he",
      name = "G",
      descriptor = "I"
   )
   public static int field5708;
   @OriginalMember(
      owner = "client!he",
      name = "E",
      descriptor = "I"
   )
   private static int field5709;
   @OriginalMember(
      owner = "client!he",
      name = "j",
      descriptor = "I"
   )
   public static int field5710;
   @OriginalMember(
      owner = "client!he",
      name = "u",
      descriptor = "I"
   )
   public static int field5712;
   @OriginalMember(
      owner = "client!he",
      name = "v",
      descriptor = "I"
   )
   public static int field5713;
   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "I"
   )
   public static int field5717;
   @OriginalMember(
      owner = "client!he",
      name = "h",
      descriptor = "I"
   )
   public static int field5718;
   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "I"
   )
   public int field5719;
   @OriginalMember(
      owner = "client!he",
      name = "i",
      descriptor = "I"
   )
   public int field5720;
   @OriginalMember(
      owner = "client!he",
      name = "z",
      descriptor = "I"
   )
   private static int field5721;
   @OriginalMember(
      owner = "client!he",
      name = "p",
      descriptor = "I"
   )
   public static int field5724;
   @OriginalMember(
      owner = "client!he",
      name = "g",
      descriptor = "I"
   )
   public static int field5725;
   @OriginalMember(
      owner = "client!he",
      name = "k",
      descriptor = "I"
   )
   private static int field5728;
   @OriginalMember(
      owner = "client!he",
      name = "x",
      descriptor = "I"
   )
   public int field5729;
   @OriginalMember(
      owner = "client!he",
      name = "D",
      descriptor = "I"
   )
   public static int field5730;
   @OriginalMember(
      owner = "client!he",
      name = "f",
      descriptor = "I"
   )
   private static int field5731;
   @OriginalMember(
      owner = "client!he",
      name = "o",
      descriptor = "[I"
   )
   private int[] field5716;

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "()I",
      line = 3
   )
   public final int method3000() {
      return this.field5727 + this.field5703 + this.field5720;
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "([I)V",
      line = 9
   )
   public final void method3001(int[] arg0) {
      arg0[0] = this.field5719;
      arg0[1] = this.field5703;
      arg0[2] = this.field5729;
      arg0[3] = this.field5720;
   }

   @OriginalMember(
      owner = "client!he",
      name = "c",
      descriptor = "()I",
      line = 18
   )
   public final int method3002() {
      return this.field5704;
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(FFFFFFIIII)V",
      line = 21
   )
   public final void method3003(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field5722.method5320()) {
         throw new IllegalStateException();
      } else if (this.method3004(arg0, arg1, arg2, arg3, arg4, arg5)) {
         field5706 = arg7;
         if (arg6 != 1) {
            field5711 = arg7 >>> 24;
            field5723 = 256 - field5711;
            if (arg6 == 0) {
               field5705 = (arg7 & 16711680) >> 16;
               field5726 = (arg7 & 65280) >> 8;
               field5714 = arg7 & 255;
            } else if (arg6 == 2) {
               field5707 = arg7 >>> 24;
               field5732 = 256 - field5707;
               int var11 = (arg7 & 16711935) * field5732 & -16711936;
               int var12 = (arg7 & 65280) * field5732 & 16711680;
               field5715 = (var11 | var12) >>> 8;
            }
         }

         if (arg6 == 1) {
            if (arg8 == 0) {
               this.method1052(1, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1052(1, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1052(1, 2);
               return;
            }
         } else if (arg6 == 0) {
            if (arg8 == 0) {
               this.method1052(0, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1052(0, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1052(0, 2);
               return;
            }
         } else if (arg6 == 3) {
            if (arg8 == 0) {
               this.method1052(3, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1052(3, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1052(3, 2);
               return;
            }
         } else if (arg6 == 2) {
            if (arg8 == 0) {
               this.method1052(2, 0);
               return;
            }

            if (arg8 == 1) {
               this.method1052(2, 1);
               return;
            }

            if (arg8 == 2) {
               this.method1052(2, 2);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(FFFFFF)Z",
      line = 123
   )
   private final boolean method3004(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      int var7 = this.field5719 + this.field5704 + this.field5729;
      int var8 = this.field5727 + this.field5703 + this.field5720;
      if (this.field5704 != var7 || this.field5727 != var8) {
         float var9 = (arg2 - arg0) / (float)var7;
         float var10 = (arg3 - arg1) / (float)var7;
         float var11 = (arg4 - arg0) / (float)var8;
         float var12 = (arg5 - arg1) / (float)var8;
         float var13 = (float)this.field5703 * var11;
         float var14 = (float)this.field5703 * var12;
         float var15 = (float)this.field5719 * var9;
         float var16 = (float)this.field5719 * var10;
         float var17 = (float)this.field5729 * -var9;
         float var18 = (float)this.field5729 * -var10;
         float var19 = (float)this.field5720 * -var11;
         float var20 = (float)this.field5720 * -var12;
         arg0 += var13 + var15;
         arg1 += var14 + var16;
         arg2 += var13 + var17;
         arg3 += var14 + var18;
         arg4 += var15 + var19;
         arg5 += var16 + var20;
      }

      float var21 = arg2 - arg0 + arg4;
      float var22 = arg5 - arg1 + arg3;
      float var23;
      float var24;
      if (arg0 < arg2) {
         var23 = arg0;
         var24 = arg2;
      } else {
         var23 = arg2;
         var24 = arg0;
      }

      if (arg4 < var23) {
         var23 = arg4;
      }

      if (var21 < var23) {
         var23 = var21;
      }

      if (arg4 > var24) {
         var24 = arg4;
      }

      if (var21 > var24) {
         var24 = var21;
      }

      float var25;
      float var26;
      if (arg1 < arg3) {
         var25 = arg1;
         var26 = arg3;
      } else {
         var25 = arg3;
         var26 = arg1;
      }

      if (arg5 < var25) {
         var25 = arg5;
      }

      if (var22 < var25) {
         var25 = var22;
      }

      if (arg5 > var26) {
         var26 = arg5;
      }

      if (var22 > var26) {
         var26 = var22;
      }

      if (var23 < (float)this.field5722.field10615) {
         var23 = (float)this.field5722.field10615;
      }

      if (var24 > (float)this.field5722.field10612) {
         var24 = (float)this.field5722.field10612;
      }

      if (var25 < (float)this.field5722.field10644) {
         var25 = (float)this.field5722.field10644;
      }

      if (var26 > (float)this.field5722.field10639) {
         var26 = (float)this.field5722.field10639;
      }

      float var27 = var23 - var24;
      if (var27 >= 0.0F) {
         return false;
      } else {
         float var28 = var25 - var26;
         if (var28 >= 0.0F) {
            return false;
         } else {
            field5725 = this.field5722.field10630;
            field5730 = (int)((float)((int)var25 * field5725) + var23);
            float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
            float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
            field5713 = (int)((arg5 - arg1) * 4096.0F * (float)this.field5704 / var29);
            field5700 = (int)((arg3 - arg1) * 4096.0F * (float)this.field5727 / var30);
            field5710 = (int)((arg4 - arg0) * 4096.0F * (float)this.field5704 / var30);
            field5701 = (int)((arg2 - arg0) * 4096.0F * (float)this.field5727 / var29);
            field5721 = (int)(var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
            field5728 = (int)(var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
            field5717 = (this.field5704 >> 1 << 12) + (field5728 * field5710 >> 4);
            field5718 = (this.field5727 >> 1 << 12) + (field5728 * field5701 >> 4);
            field5712 = field5721 * field5713 >> 4;
            field5708 = field5721 * field5700 >> 4;
            field5731 = (int)var23;
            field5724 = (int)var27;
            field5709 = (int)var25;
            field5702 = (int)var28;
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "d",
      descriptor = "()I",
      line = 257
   )
   public final int method3005() {
      return this.field5727;
   }

   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "(IIII)V",
      line = 265
   )
   public final void method3006(int arg0, int arg1, int arg2, int arg3) {
      this.field5719 = arg0;
      this.field5703 = arg1;
      this.field5729 = arg2;
      this.field5720 = arg3;
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 273
   )
   public final void method3007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field5722.method5320()) {
         throw new IllegalStateException();
      } else {
         if (this.field5716 == null) {
            this.field5716 = new int[4];
         }

         this.field5722.method254(this.field5716);
         this.field5722.method309(this.field5722.field10615, this.field5722.field10644, arg0 + arg2, arg1 + arg3);
         int var8 = this.method3009();
         int var9 = this.method3000();
         int var10 = (arg2 + var8 - 1) / var8;
         int var11 = (arg3 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var9 * var12;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method1055(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
         }

         this.field5722.method333(this.field5716[0], this.field5716[1], this.field5716[2], this.field5716[3]);
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "<init>",
      descriptor = "(Llga;II)V",
      line = 353
   )
   public class387(class739 arg0, int arg1, int arg2) {
      this.field5722 = arg0;
      this.field5704 = arg1;
      this.field5727 = arg2;
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V",
      line = 359
   )
   public final void method3008(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9) {
      if (this.field5722.method5320()) {
         throw new IllegalStateException();
      } else if (this.method3004(arg0, arg1, arg2, arg3, arg4, arg5)) {
         class348 var11 = (class348)arg7;
         this.method1058(var11.field4952, var11.field4947, field5731 - arg8, -arg9 - (field5702 - field5709));
      }
   }

   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "()I",
      line = 371
   )
   public final int method3009() {
      return this.field5719 + this.field5704 + this.field5729;
   }

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method1055(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method1054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!he",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method1052(int arg0, int arg1);

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method1059(int arg0, int arg1, class510 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!he",
      name = "a",
      descriptor = "([I[III)V"
   )
   public abstract void method1058(int[] arg0, int[] arg1, int arg2, int arg3);
}
