import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public abstract class class304 extends class148 {
   @OriginalMember(
      owner = "client!ria",
      name = "i",
      descriptor = "Lmi;"
   )
   public class20 field4601;
   @OriginalMember(
      owner = "client!ria",
      name = "G",
      descriptor = "I"
   )
   public int field4618;
   @OriginalMember(
      owner = "client!ria",
      name = "m",
      descriptor = "I"
   )
   public int field4607;
   @OriginalMember(
      owner = "client!ria",
      name = "D",
      descriptor = "I"
   )
   private static int field4596 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "t",
      descriptor = "I"
   )
   public static int field4592 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "I"
   )
   public static int field4615 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "h",
      descriptor = "I"
   )
   public static int field4612 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "v",
      descriptor = "I"
   )
   public static int field4609 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "j",
      descriptor = "I"
   )
   private static int field4602 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "k",
      descriptor = "I"
   )
   public static int field4594 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "o",
      descriptor = "I"
   )
   public static int field4619 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "A",
      descriptor = "I"
   )
   private static int field4589;
   @OriginalMember(
      owner = "client!ria",
      name = "x",
      descriptor = "I"
   )
   private static int field4590;
   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "I"
   )
   public static int field4591;
   @OriginalMember(
      owner = "client!ria",
      name = "l",
      descriptor = "I"
   )
   public static int field4593;
   @OriginalMember(
      owner = "client!ria",
      name = "g",
      descriptor = "I"
   )
   public static int field4595;
   @OriginalMember(
      owner = "client!ria",
      name = "y",
      descriptor = "I"
   )
   public static int field4597;
   @OriginalMember(
      owner = "client!ria",
      name = "d",
      descriptor = "I"
   )
   public static int field4598;
   @OriginalMember(
      owner = "client!ria",
      name = "F",
      descriptor = "I"
   )
   public static int field4599;
   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "I"
   )
   public static int field4600;
   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "I"
   )
   private static int field4603;
   @OriginalMember(
      owner = "client!ria",
      name = "e",
      descriptor = "I"
   )
   public static int field4604;
   @OriginalMember(
      owner = "client!ria",
      name = "r",
      descriptor = "I"
   )
   public int field4605;
   @OriginalMember(
      owner = "client!ria",
      name = "n",
      descriptor = "I"
   )
   public static int field4606;
   @OriginalMember(
      owner = "client!ria",
      name = "f",
      descriptor = "I"
   )
   public int field4608;
   @OriginalMember(
      owner = "client!ria",
      name = "q",
      descriptor = "I"
   )
   public static int field4610;
   @OriginalMember(
      owner = "client!ria",
      name = "u",
      descriptor = "I"
   )
   public static int field4611;
   @OriginalMember(
      owner = "client!ria",
      name = "C",
      descriptor = "I"
   )
   public int field4613;
   @OriginalMember(
      owner = "client!ria",
      name = "B",
      descriptor = "I"
   )
   public int field4614;
   @OriginalMember(
      owner = "client!ria",
      name = "w",
      descriptor = "I"
   )
   public static int field4616;
   @OriginalMember(
      owner = "client!ria",
      name = "p",
      descriptor = "I"
   )
   public static int field4620;
   @OriginalMember(
      owner = "client!ria",
      name = "s",
      descriptor = "I"
   )
   private static int field4621;
   @OriginalMember(
      owner = "client!ria",
      name = "E",
      descriptor = "[I"
   )
   private int[] field4617;

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "()I"
   )
   public final int method1351() {
      return this.field4618 + this.field4608 + this.field4605;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method2328(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public final void method1349(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class684 arg7, int arg8, int arg9) {
      if (this.field4601.method275()) {
         throw new IllegalStateException();
      } else if (this.method2511(arg0, arg1, arg2, arg3, arg4, arg5)) {
         class540 var11 = (class540)arg7;
         this.method2325(var11.field7582, var11.field7581, field4590 - arg8, -arg9 - (field4616 - field4589));
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "()I"
   )
   public final int method1354() {
      return this.field4607;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "d",
      descriptor = "()I"
   )
   public final int method1356() {
      return this.field4614 + this.field4607 + this.field4613;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      if (this.field4601.method275()) {
         throw new IllegalStateException();
      } else {
         if (this.field4617 == null) {
            this.field4617 = new int[4];
         }

         this.field4601.method211(this.field4617);
         this.field4601.method209(this.field4601.field298, this.field4601.field280, arg0 + arg2, arg1 + arg3);
         int var8 = this.method1351();
         int var9 = this.method1356();
         int var10 = (arg2 + var8 - 1) / var8;
         int var11 = (arg3 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var9 * var12;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method1352(var8 * var14 + arg0, arg1 + var13, arg4, arg5, arg6);
            }
         }

         this.field4601.method150(this.field4617[0], this.field4617[1], this.field4617[2], this.field4617[3]);
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(FFFFFF)Z"
   )
   private final boolean method2511(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      int var7 = this.field4618 + this.field4608 + this.field4605;
      int var8 = this.field4614 + this.field4607 + this.field4613;
      if (this.field4618 != var7 || this.field4607 != var8) {
         float var9 = (arg2 - arg0) / (float)var7;
         float var10 = (arg3 - arg1) / (float)var7;
         float var11 = (arg4 - arg0) / (float)var8;
         float var12 = (arg5 - arg1) / (float)var8;
         float var13 = (float)this.field4614 * var11;
         float var14 = (float)this.field4614 * var12;
         float var15 = (float)this.field4608 * var9;
         float var16 = (float)this.field4608 * var10;
         float var17 = (float)this.field4605 * -var9;
         float var18 = (float)this.field4605 * -var10;
         float var19 = (float)this.field4613 * -var11;
         float var20 = (float)this.field4613 * -var12;
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

      if (var23 < (float)this.field4601.field298) {
         var23 = (float)this.field4601.field298;
      }

      if (var24 > (float)this.field4601.field306) {
         var24 = (float)this.field4601.field306;
      }

      if (var25 < (float)this.field4601.field280) {
         var25 = (float)this.field4601.field280;
      }

      if (var26 > (float)this.field4601.field281) {
         var26 = (float)this.field4601.field281;
      }

      float var27 = var23 - var24;
      if (var27 >= 0.0F) {
         return false;
      } else {
         float var28 = var25 - var26;
         if (var28 >= 0.0F) {
            return false;
         } else {
            field4595 = this.field4601.field299;
            field4604 = (int)((float)((int)var25 * field4595) + var23);
            float var29 = (arg2 - arg0) * (arg5 - arg1) - (arg4 - arg0) * (arg3 - arg1);
            float var30 = (arg4 - arg0) * (arg3 - arg1) - (arg2 - arg0) * (arg5 - arg1);
            field4606 = (int)((arg5 - arg1) * 4096.0F * (float)this.field4618 / var29);
            field4610 = (int)((arg3 - arg1) * 4096.0F * (float)this.field4607 / var30);
            field4620 = (int)((arg4 - arg0) * 4096.0F * (float)this.field4618 / var30);
            field4591 = (int)((arg2 - arg0) * 4096.0F * (float)this.field4607 / var29);
            field4621 = (int)(var23 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + var21) / 4.0F * 16.0F);
            field4603 = (int)(var25 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + var22) / 4.0F * 16.0F);
            field4599 = (this.field4618 >> 1 << 12) + (field4620 * field4603 >> 4);
            field4598 = (this.field4607 >> 1 << 12) + (field4603 * field4591 >> 4);
            field4611 = field4621 * field4606 >> 4;
            field4593 = field4621 * field4610 >> 4;
            field4590 = (int)var23;
            field4597 = (int)var27;
            field4589 = (int)var25;
            field4616 = (int)var28;
            return true;
         }
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method1347(int arg0, int arg1, class684 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method2326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method1344(int[] arg0) {
      arg0[0] = this.field4608;
      arg0[1] = this.field4614;
      arg0[2] = this.field4605;
      arg0[3] = this.field4613;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method1343(int arg0, int arg1, int arg2, int arg3) {
      this.field4608 = arg0;
      this.field4614 = arg1;
      this.field4605 = arg2;
      this.field4613 = arg3;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method1352(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "([I[III)V"
   )
   public abstract void method2325(int[] arg0, int[] arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "()I"
   )
   public final int method1350() {
      return this.field4618;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public final void method1346(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      if (this.field4601.method275()) {
         throw new IllegalStateException();
      } else if (this.method2511(arg0, arg1, arg2, arg3, arg4, arg5)) {
         field4600 = arg7;
         if (arg6 != 1) {
            field4612 = arg7 >>> 24;
            field4619 = 256 - field4612;
            if (arg6 == 0) {
               field4594 = (arg7 & 16711680) >> 16;
               field4609 = (arg7 & 65280) >> 8;
               field4615 = arg7 & 255;
            } else if (arg6 == 2) {
               field4596 = arg7 >>> 24;
               field4602 = 256 - field4596;
               int var11 = (arg7 & 16711935) * field4602 & -16711936;
               int var12 = (arg7 & 65280) * field4602 & 16711680;
               field4592 = (var11 | var12) >>> 8;
            }
         }

         if (arg6 == 1) {
            if (arg8 == 0) {
               this.method2328(1, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2328(1, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2328(1, 2);
               return;
            }
         } else if (arg6 == 0) {
            if (arg8 == 0) {
               this.method2328(0, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2328(0, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2328(0, 2);
               return;
            }
         } else if (arg6 == 3) {
            if (arg8 == 0) {
               this.method2328(3, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2328(3, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2328(3, 2);
               return;
            }
         } else if (arg6 == 2) {
            if (arg8 == 0) {
               this.method2328(2, 0);
               return;
            }

            if (arg8 == 1) {
               this.method2328(2, 1);
               return;
            }

            if (arg8 == 2) {
               this.method2328(2, 2);
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "<init>",
      descriptor = "(Lmi;II)V"
   )
   public class304(class20 arg0, int arg1, int arg2) {
      this.field4601 = arg0;
      this.field4618 = arg1;
      this.field4607 = arg2;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public abstract void method2327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);
}
