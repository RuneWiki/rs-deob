import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class517 extends class672 {
   @OriginalMember(
      owner = "client!ft",
      name = "t",
      descriptor = "Lld;"
   )
   public class164 field7868;
   @OriginalMember(
      owner = "client!ft",
      name = "s",
      descriptor = "I"
   )
   public int field7866;
   @OriginalMember(
      owner = "client!ft",
      name = "v",
      descriptor = "I"
   )
   public int field7861;
   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "I"
   )
   public static int field7859 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "A",
      descriptor = "I"
   )
   public static int field7864 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "m",
      descriptor = "I"
   )
   private static int field7872 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "y",
      descriptor = "I"
   )
   public static int field7869 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "r",
      descriptor = "I"
   )
   public static int field7865 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "B",
      descriptor = "I"
   )
   public static int field7880 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "c",
      descriptor = "I"
   )
   public static int field7871 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "j",
      descriptor = "I"
   )
   private static int field7875 = 0;
   @OriginalMember(
      owner = "client!ft",
      name = "D",
      descriptor = "I"
   )
   public static int field7854;
   @OriginalMember(
      owner = "client!ft",
      name = "p",
      descriptor = "I"
   )
   public static int field7855;
   @OriginalMember(
      owner = "client!ft",
      name = "e",
      descriptor = "I"
   )
   private static int field7856;
   @OriginalMember(
      owner = "client!ft",
      name = "d",
      descriptor = "I"
   )
   public static int field7857;
   @OriginalMember(
      owner = "client!ft",
      name = "F",
      descriptor = "I"
   )
   private static int field7858;
   @OriginalMember(
      owner = "client!ft",
      name = "n",
      descriptor = "I"
   )
   public static int field7860;
   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "I"
   )
   public static int field7862;
   @OriginalMember(
      owner = "client!ft",
      name = "G",
      descriptor = "I"
   )
   private static int field7863;
   @OriginalMember(
      owner = "client!ft",
      name = "u",
      descriptor = "I"
   )
   public static int field7870;
   @OriginalMember(
      owner = "client!ft",
      name = "E",
      descriptor = "I"
   )
   public int field7873;
   @OriginalMember(
      owner = "client!ft",
      name = "o",
      descriptor = "I"
   )
   public static int field7874;
   @OriginalMember(
      owner = "client!ft",
      name = "l",
      descriptor = "I"
   )
   public static int field7876;
   @OriginalMember(
      owner = "client!ft",
      name = "i",
      descriptor = "I"
   )
   public static int field7877;
   @OriginalMember(
      owner = "client!ft",
      name = "k",
      descriptor = "I"
   )
   private static int field7878;
   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "I"
   )
   public static int field7879;
   @OriginalMember(
      owner = "client!ft",
      name = "g",
      descriptor = "I"
   )
   public int field7881;
   @OriginalMember(
      owner = "client!ft",
      name = "w",
      descriptor = "I"
   )
   public static int field7882;
   @OriginalMember(
      owner = "client!ft",
      name = "x",
      descriptor = "I"
   )
   public int field7883;
   @OriginalMember(
      owner = "client!ft",
      name = "C",
      descriptor = "I"
   )
   public int field7884;
   @OriginalMember(
      owner = "client!ft",
      name = "h",
      descriptor = "I"
   )
   public static int field7885;
   @OriginalMember(
      owner = "client!ft",
      name = "f",
      descriptor = "I"
   )
   public static int field7886;
   @OriginalMember(
      owner = "client!ft",
      name = "q",
      descriptor = "[I"
   )
   private int[] field7867;

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "()I"
   )
   public final int method2108() {
      return this.field7873 + this.field7861 + this.field7883;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method932(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field7868.method1525()) {
         throw new IllegalStateException();
      } else {
         if (this.field7867 == null) {
            this.field7867 = new int[4];
         }

         this.field7868.method626(this.field7867);
         this.field7868.method586(this.field7868.field2478, this.field7868.field2469, arg0 + arg2, arg1 + arg3);
         int var8 = this.method2106();
         int var9 = this.method2108();
         int var10 = (arg2 + var8 - 1) / var8;
         int var11 = (arg3 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var9 * var12;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method938(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
         }

         this.field7868.method629(this.field7867[0], this.field7867[1], this.field7867[2], this.field7867[3]);
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method2097(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class96 arg7, int arg8, int arg9) {
      if (this.field7868.method1525()) {
         throw new IllegalStateException();
      } else if (this.method3997(arg0, arg1, arg2, arg3, arg4, arg5)) {
         class561 var11 = (class561)arg7;
         this.method936(var11.field8337, var11.field8339, field7856 - arg8, -arg9 - (field7877 - field7858));
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ft",
      name = "d",
      descriptor = "()I"
   )
   public final int method2106() {
      return this.field7881 + this.field7866 + this.field7884;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method2102(int[] arg0) {
      arg0[0] = this.field7881;
      arg0[1] = this.field7873;
      arg0[2] = this.field7884;
      arg0[3] = this.field7883;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(FFFFFF)Z"
   )
   private final boolean method3997(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      int var7 = this.field7881 + this.field7866 + this.field7884;
      int var8 = this.field7873 + this.field7861 + this.field7883;
      if (this.field7866 != var7 || this.field7861 != var8) {
         float var9 = (arg2 - arg0) / (float)var7;
         float var10 = (arg3 - arg1) / (float)var7;
         float var11 = (arg4 - arg0) / (float)var8;
         float var12 = (arg5 - arg1) / (float)var8;
         float var13 = (float)this.field7873 * var11;
         float var14 = (float)this.field7873 * var12;
         float var15 = (float)this.field7881 * var9;
         float var16 = (float)this.field7881 * var10;
         float var17 = (float)this.field7884 * -var9;
         float var18 = (float)this.field7884 * -var10;
         float var19 = (float)this.field7883 * -var11;
         float var20 = (float)this.field7883 * -var12;
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

      if (var23 < (float)this.field7868.field2478) {
         var23 = (float)this.field7868.field2478;
      }

      if (var24 > (float)this.field7868.field2477) {
         var24 = (float)this.field7868.field2477;
      }

      if (var25 < (float)this.field7868.field2469) {
         var25 = (float)this.field7868.field2469;
      }

      if (var26 > (float)this.field7868.field2498) {
         var26 = (float)this.field7868.field2498;
      }

      float var27 = var23 - var24;
      if (var27 >= 0.0F) {
         return false;
      } else {
         float var28 = var25 - var26;
         if (var28 >= 0.0F) {
            return false;
         } else {
            field7870 = this.field7868.field2481;
            field7855 = (int)((float)((int)var25 * field7870) + var23);
            float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
            float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
            field7874 = (int)((arg5 - arg1) * 4096.0F * (float)this.field7866 / var29);
            field7862 = (int)((arg3 - arg1) * 4096.0F * (float)this.field7861 / var30);
            field7886 = (int)((arg4 - arg0) * 4096.0F * (float)this.field7866 / var30);
            field7885 = (int)((arg2 - arg0) * 4096.0F * (float)this.field7861 / var29);
            field7863 = (int)(var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
            field7878 = (int)(var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
            field7860 = (this.field7866 >> 1 << 12) + (field7886 * field7878 >> 4);
            field7854 = (this.field7861 >> 1 << 12) + (field7885 * field7878 >> 4);
            field7879 = field7874 * field7863 >> 4;
            field7882 = field7863 * field7862 >> 4;
            field7856 = (int)var23;
            field7857 = (int)var27;
            field7858 = (int)var25;
            field7877 = (int)var28;
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "()I"
   )
   public final int method2104() {
      return this.field7866;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method939(int arg0, int arg1, class96 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "([I[III)V"
   )
   public abstract void method936(int[] arg0, int[] arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method938(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ft",
      name = "<init>",
      descriptor = "(Lld;II)V"
   )
   public class517(class164 arg0, int arg1, int arg2) {
      this.field7868 = arg0;
      this.field7866 = arg1;
      this.field7861 = arg2;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method2096(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field7868.method1525()) {
         throw new IllegalStateException();
      } else if (this.method3997(arg0, arg1, arg2, arg3, arg4, arg5)) {
         field7876 = arg7;
         if (arg6 != 1) {
            field7864 = arg7 >>> 24;
            field7869 = 256 - field7864;
            if (arg6 == 0) {
               field7880 = (arg7 & 16711680) >> 16;
               field7865 = (arg7 & 65280) >> 8;
               field7859 = arg7 & 255;
            } else if (arg6 == 2) {
               field7872 = arg7 >>> 24;
               field7875 = 256 - field7872;
               int var11 = (arg7 & 16711935) * field7875 & -16711936;
               int var12 = (arg7 & 65280) * field7875 & 16711680;
               field7871 = (var11 | var12) >>> 8;
            }
         }

         if (arg6 == 1) {
            if (arg8 == 0) {
               this.method932(1, 0);
               return;
            }

            if (arg8 == 1) {
               this.method932(1, 1);
               return;
            }

            if (arg8 == 2) {
               this.method932(1, 2);
               return;
            }
         } else if (arg6 == 0) {
            if (arg8 == 0) {
               this.method932(0, 0);
               return;
            }

            if (arg8 == 1) {
               this.method932(0, 1);
               return;
            }

            if (arg8 == 2) {
               this.method932(0, 2);
               return;
            }
         } else if (arg6 == 3) {
            if (arg8 == 0) {
               this.method932(3, 0);
               return;
            }

            if (arg8 == 1) {
               this.method932(3, 1);
               return;
            }

            if (arg8 == 2) {
               this.method932(3, 2);
               return;
            }
         } else if (arg6 == 2) {
            if (arg8 == 0) {
               this.method932(2, 0);
               return;
            }

            if (arg8 == 1) {
               this.method932(2, 1);
               return;
            }

            if (arg8 == 2) {
               this.method932(2, 2);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method2107(int arg0, int arg1, int arg2, int arg3) {
      this.field7881 = arg0;
      this.field7873 = arg1;
      this.field7884 = arg2;
      this.field7883 = arg3;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "c",
      descriptor = "()I"
   )
   public final int method2095() {
      return this.field7861;
   }
}
