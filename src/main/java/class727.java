import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class727 extends class166 {
   @OriginalMember(
      owner = "client!ic",
      name = "q",
      descriptor = "I"
   )
   private int field10807;
   @OriginalMember(
      owner = "client!ic",
      name = "u",
      descriptor = "I"
   )
   private int field10809;
   @OriginalMember(
      owner = "client!ic",
      name = "m",
      descriptor = "Z"
   )
   private boolean field10803;
   @OriginalMember(
      owner = "client!ic",
      name = "v",
      descriptor = "I"
   )
   private int field10797;
   @OriginalMember(
      owner = "client!ic",
      name = "n",
      descriptor = "I"
   )
   private int field10802;
   @OriginalMember(
      owner = "client!ic",
      name = "p",
      descriptor = "I"
   )
   private int field10800;
   @OriginalMember(
      owner = "client!ic",
      name = "r",
      descriptor = "I"
   )
   private int field10798;
   @OriginalMember(
      owner = "client!ic",
      name = "x",
      descriptor = "I"
   )
   private int field10796;
   @OriginalMember(
      owner = "client!ic",
      name = "o",
      descriptor = "I"
   )
   private int field10799;
   @OriginalMember(
      owner = "client!ic",
      name = "t",
      descriptor = "I"
   )
   private int field10801;
   @OriginalMember(
      owner = "client!ic",
      name = "y",
      descriptor = "I"
   )
   private int field10804;
   @OriginalMember(
      owner = "client!ic",
      name = "z",
      descriptor = "I"
   )
   private int field10805;
   @OriginalMember(
      owner = "client!ic",
      name = "w",
      descriptor = "I"
   )
   private int field10806;
   @OriginalMember(
      owner = "client!ic",
      name = "s",
      descriptor = "I"
   )
   private int field10808;
   @OriginalMember(
      owner = "client!ic",
      name = "A",
      descriptor = "I"
   )
   private int field10810;

   @OriginalMember(
      owner = "client!ic",
      name = "c",
      descriptor = "(II[B[IIIIIIIILic;II)I"
   )
   private static final int method5264(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class727 arg11, int arg12, int arg13) {
      arg11.field10796 -= arg11.field10806 * arg5;
      arg11.field10808 -= arg11.field10801 * arg5;
      int var14;
      if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var10001;
      while(arg5 < var14) {
         int var18 = arg4 >> 8;
         byte var19 = arg2[var18];
         var10001 = arg5++;
         arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18 + 1] - var19)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      int var15;
      if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
         var15 = arg9;
      }

      int var16 = arg13;

      while(arg5 < var15) {
         byte var17 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += ((var17 << 8) + (arg4 & 255) * (var16 - var17)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      arg11.field10796 += arg11.field10806 * arg5;
      arg11.field10808 += arg11.field10801 * arg5;
      arg11.field10810 = arg6;
      arg11.field10798 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(I[B[IIIIIIIIIILic;)I"
   )
   private static final int method5265(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class727 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19;
      if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
         var19 = arg10;
      }

      arg12.field10810 += (var19 - arg4) * arg12.field10805;
      int var20 = arg4 << 1;
      int var21 = var19 << 1;
      int var44 = var21 - 6;

      while(var20 < var44) {
         byte var23 = arg1[var13--];
         int var33 = var20++;
         arg2[var33] += var15 * var23;
         int var24 = var15 + var17;
         int var34 = var20++;
         arg2[var34] += var16 * var23;
         int var25 = var16 + var18;
         byte var26 = arg1[var13--];
         int var36 = var20++;
         arg2[var36] += var24 * var26;
         int var27 = var17 + var24;
         int var37 = var20++;
         arg2[var37] += var25 * var26;
         int var28 = var18 + var25;
         byte var29 = arg1[var13--];
         int var39 = var20++;
         arg2[var39] += var27 * var29;
         int var30 = var17 + var27;
         int var40 = var20++;
         arg2[var40] += var28 * var29;
         int var31 = var18 + var28;
         byte var32 = arg1[var13--];
         int var42 = var20++;
         arg2[var42] += var30 * var32;
         var15 = var17 + var30;
         int var43 = var20++;
         arg2[var43] += var31 * var32;
         var16 = var18 + var31;
      }

      var21 = var44 + 6;

      while(var20 < var21) {
         byte var22 = arg1[var13--];
         int var10001 = var20++;
         arg2[var10001] += var15 * var22;
         var15 += var17;
         int var45 = var20++;
         arg2[var45] += var16 * var22;
         var16 += var18;
      }

      arg12.field10796 = var15 >> 2;
      arg12.field10808 = var16 >> 2;
      arg12.field10798 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "f",
      descriptor = "(I)V"
   )
   public final synchronized void method5266(int arg0) {
      this.field10799 = arg0;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "d",
      descriptor = "(II)I"
   )
   private static final int method5267(int arg0, int arg1) {
      return arg1 < 0 ? -arg0 : (int)((double)arg0 * Math.sqrt((double)arg1 * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(II)V"
   )
   public final synchronized void method5268(int arg0, int arg1) {
      this.method5280(arg0, arg1, this.method5283());
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "()I"
   )
   public final int method184() {
      return this.field10802 == 0 && this.field10804 == 0 ? 0 : 1;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "d",
      descriptor = "()Lwea;"
   )
   public final class166 method176() {
      return null;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(II[B[IIIIIIILic;II)I"
   )
   private static final int method5269(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class727 arg10, int arg11, int arg12) {
      int var13;
      if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
         var13 = arg8;
      }

      int var10001;
      while(arg5 < var13) {
         int var17 = arg4 >> 8;
         byte var18 = arg2[var17];
         var10001 = arg5++;
         arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17 + 1] - var18)) * arg6 >> 6;
         arg4 += arg11;
      }

      int var14;
      if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
         var14 = arg8;
      }

      int var15 = arg12;

      while(arg5 < var14) {
         byte var16 = arg2[arg4 >> 8];
         var10001 = arg5++;
         arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (var15 - var16)) * arg6 >> 6;
         arg4 += arg11;
      }

      arg10.field10798 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "j",
      descriptor = "(I)V"
   )
   private final synchronized void method5270(int arg0) {
      this.method5273(arg0, this.method5283());
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "([B[IIIIIIILic;)I"
   )
   private static final int method5271(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class727 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12;
      if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
         var12 = arg6;
      }

      var12 -= 3;

      int var10001;
      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9--] * var11;
         int var13 = arg3++;
         arg1[var13] += arg0[var9--] * var11;
         int var14 = arg3++;
         arg1[var14] += arg0[var9--] * var11;
         int var15 = arg3++;
         arg1[var15] += arg0[var9--] * var11;
      }

      var12 += 3;

      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9--] * var11;
      }

      arg8.field10798 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "([IIIII)I"
   )
   private final int method5272(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field10804 <= 0) {
            if (this.field10797 == 256 && (this.field10798 & 255) == 0) {
               if (class532.field7780) {
                  return method5299(0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, 0, arg3, arg2, this);
               }

               return method5284(((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, 0, arg3, arg2, this);
            }

            if (class532.field7780) {
               return method5278(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, 0, arg3, arg2, this, this.field10797, arg4);
            }

            return method5269(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, 0, arg3, arg2, this, this.field10797, arg4);
         }

         int var6 = this.field10804 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field10804 += arg1;
         if (this.field10797 == 256 && (this.field10798 & 255) == 0) {
            if (class532.field7780) {
               arg1 = method5301(0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, this.field10806, this.field10801, 0, var6, arg2, this);
            } else {
               arg1 = method5300(((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, this.field10805, 0, var6, arg2, this);
            }
         } else if (class532.field7780) {
            arg1 = method5297(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, this.field10806, this.field10801, 0, var6, arg2, this, this.field10797, arg4);
         } else {
            arg1 = method5264(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, this.field10805, 0, var6, arg2, this, this.field10797, arg4);
         }

         this.field10804 -= arg1;
         if (this.field10804 != 0) {
            return arg1;
         }
      } while(!this.method5285());

      return arg3;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(II)V"
   )
   private final synchronized void method5273(int arg0, int arg1) {
      this.field10802 = arg0;
      this.field10800 = arg1;
      this.field10804 = 0;
      this.method5293();
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "()I"
   )
   public final int method1348() {
      int var1 = this.field10810 * 3 >> 6;
      int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
      if (this.field10799 == 0) {
         var2 -= this.field10798 * var2 / (((class640)super.field2081).field9329.length << 8);
      } else if (this.field10799 >= 0) {
         var2 -= this.field10807 * var2 / ((class640)super.field2081).field9329.length;
      }

      return var2 > 255 ? 255 : var2;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method5274(int arg0) {
      int var2 = ((class640)super.field2081).field9329.length << 8;
      if (arg0 < -1) {
         arg0 = -1;
      }

      if (arg0 > var2) {
         arg0 = var2;
      }

      this.field10798 = arg0;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "e",
      descriptor = "()I"
   )
   public final synchronized int method5275() {
      return this.field10797 < 0 ? -this.field10797 : this.field10797;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "h",
      descriptor = "(I)V"
   )
   public final synchronized void method5276(int arg0) {
      this.method5273(arg0 << 6, this.method5283());
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(II[B[IIIIIIILic;II)I"
   )
   private static final int method5277(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class727 arg10, int arg11, int arg12) {
      int var13;
      if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var13 = arg8;
      }

      int var10001;
      while(arg5 < var13) {
         int var17 = arg4 >> 8;
         byte var18 = arg2[var17 - 1];
         var10001 = arg5++;
         arg3[var10001] += ((var18 << 8) + (arg4 & 255) * (arg2[var17] - var18)) * arg6 >> 6;
         arg4 += arg11;
      }

      int var14;
      if (arg11 == 0 || (var14 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
         var14 = arg8;
      }

      int var15 = arg12;
      int var16 = arg11;

      while(arg5 < var14) {
         var10001 = arg5++;
         arg3[var10001] += ((var15 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var15)) * arg6 >> 6;
         arg4 += var16;
      }

      arg10.field10798 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(II[B[IIIIIIIILic;II)I"
   )
   private static final int method5278(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class727 arg11, int arg12, int arg13) {
      int var14;
      if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var15 = arg5 << 1;
      int var16 = var14 << 1;

      int var10001;
      while(var15 < var16) {
         int var22 = arg4 >> 8;
         byte var23 = arg2[var22];
         int var24 = (var23 << 8) + (arg4 & 255) * (arg2[var22 + 1] - var23);
         var10001 = var15++;
         arg3[var10001] += arg6 * var24 >> 6;
         int var25 = var15++;
         arg3[var25] += arg7 * var24 >> 6;
         arg4 += arg12;
      }

      int var17;
      if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
         var17 = arg9;
      }

      int var18 = var17 << 1;
      int var19 = arg13;

      while(var15 < var18) {
         byte var20 = arg2[arg4 >> 8];
         int var21 = (var20 << 8) + (arg4 & 255) * (var19 - var20);
         var10001 = var15++;
         arg3[var10001] += arg6 * var21 >> 6;
         var10001 = var15++;
         arg3[var10001] += arg7 * var21 >> 6;
         arg4 += arg12;
      }

      arg11.field10798 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "g",
      descriptor = "()V"
   )
   private final void method5279() {
      if (this.field10804 != 0) {
         if (this.field10802 == Integer.MIN_VALUE) {
            this.field10802 = 0;
         }

         this.field10804 = 0;
         this.method5293();
      }

   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(III)V"
   )
   public final synchronized void method5280(int arg0, int arg1, int arg2) {
      if (arg0 == 0) {
         this.method5273(arg1, arg2);
      } else {
         int var4 = method5294(arg1, arg2);
         int var5 = method5267(arg1, arg2);
         if (this.field10796 == var4 && this.field10808 == var5) {
            this.field10804 = 0;
         } else {
            int var6 = arg1 - this.field10810;
            if (this.field10810 - arg1 > var6) {
               var6 = this.field10810 - arg1;
            }

            if (var4 - this.field10796 > var6) {
               var6 = var4 - this.field10796;
            }

            if (this.field10796 - var4 > var6) {
               var6 = this.field10796 - var4;
            }

            if (var5 - this.field10808 > var6) {
               var6 = var5 - this.field10808;
            }

            if (this.field10808 - var5 > var6) {
               var6 = this.field10808 - var5;
            }

            if (arg0 > var6) {
               arg0 = var6;
            }

            this.field10804 = arg0;
            this.field10802 = arg1;
            this.field10800 = arg2;
            this.field10805 = (arg1 - this.field10810) / arg0;
            this.field10806 = (var4 - this.field10796) / arg0;
            this.field10801 = (var5 - this.field10808) / arg0;
         }
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(I[B[IIIIIIIILic;)I"
   )
   private static final int method5281(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class727 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15;
      if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
         var15 = arg8;
      }

      int var16 = arg4 << 1;
      int var17 = var15 << 1;
      int var23 = var17 - 6;

      while(var16 < var23) {
         byte var19 = arg1[var11--];
         int var24 = var16++;
         arg2[var24] += var13 * var19;
         int var25 = var16++;
         arg2[var25] += var14 * var19;
         byte var20 = arg1[var11--];
         int var27 = var16++;
         arg2[var27] += var13 * var20;
         int var28 = var16++;
         arg2[var28] += var14 * var20;
         byte var21 = arg1[var11--];
         int var30 = var16++;
         arg2[var30] += var13 * var21;
         int var31 = var16++;
         arg2[var31] += var14 * var21;
         byte var22 = arg1[var11--];
         int var33 = var16++;
         arg2[var33] += var13 * var22;
         int var34 = var16++;
         arg2[var34] += var14 * var22;
      }

      var17 = var23 + 6;

      while(var16 < var17) {
         byte var18 = arg1[var11--];
         int var10001 = var16++;
         arg2[var10001] += var13 * var18;
         int var35 = var16++;
         arg2[var35] += var14 * var18;
      }

      arg10.field10798 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "i",
      descriptor = "(I)V"
   )
   public final synchronized void method5282(int arg0) {
      this.method5273(this.method5302(), arg0);
   }

   @OriginalMember(
      owner = "client!ic",
      name = "f",
      descriptor = "()I"
   )
   public final synchronized int method5283() {
      return this.field10800 < 0 ? -1 : this.field10800;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "([B[IIIIIIILic;)I"
   )
   private static final int method5284(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class727 arg8) {
      int var9 = arg2 >> 8;
      int var10 = arg7 >> 8;
      int var11 = arg4 << 2;
      int var12;
      if ((var12 = arg3 + var10 - var9) > arg6) {
         var12 = arg6;
      }

      var12 -= 3;

      int var10001;
      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9++] * var11;
         int var13 = arg3++;
         arg1[var13] += arg0[var9++] * var11;
         int var14 = arg3++;
         arg1[var14] += arg0[var9++] * var11;
         int var15 = arg3++;
         arg1[var15] += arg0[var9++] * var11;
      }

      var12 += 3;

      while(arg3 < var12) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var9++] * var11;
      }

      arg8.field10798 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "k",
      descriptor = "()Z"
   )
   private final boolean method5285() {
      int var1 = this.field10802;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method5294(var1, this.field10800);
         var2 = method5267(var1, this.field10800);
      }

      if (this.field10810 == var1 && this.field10796 == var3 && this.field10808 == var2) {
         if (this.field10802 == Integer.MIN_VALUE) {
            this.field10802 = 0;
            this.field10810 = this.field10796 = this.field10808 = 0;
            this.method2720(0);
            return true;
         } else {
            this.method5293();
            return false;
         }
      } else {
         if (this.field10810 < var1) {
            this.field10805 = 1;
            this.field10804 = var1 - this.field10810;
         } else if (this.field10810 > var1) {
            this.field10805 = -1;
            this.field10804 = this.field10810 - var1;
         } else {
            this.field10805 = 0;
         }

         if (this.field10796 < var3) {
            this.field10806 = 1;
            if (this.field10804 == 0 || this.field10804 > var3 - this.field10796) {
               this.field10804 = var3 - this.field10796;
            }
         } else if (this.field10796 > var3) {
            this.field10806 = -1;
            if (this.field10804 == 0 || this.field10804 > this.field10796 - var3) {
               this.field10804 = this.field10796 - var3;
            }
         } else {
            this.field10806 = 0;
         }

         if (this.field10808 < var2) {
            this.field10801 = 1;
            if (this.field10804 == 0 || this.field10804 > var2 - this.field10808) {
               this.field10804 = var2 - this.field10808;
            }
         } else if (this.field10808 > var2) {
            this.field10801 = -1;
            if (this.field10804 == 0 || this.field10804 > this.field10808 - var2) {
               this.field10804 = this.field10808 - var2;
            }
         } else {
            this.field10801 = 0;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "e",
      descriptor = "(I)V"
   )
   public final synchronized void method5286(int arg0) {
      if (this.field10797 < 0) {
         this.field10797 = -arg0;
      } else {
         this.field10797 = arg0;
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(II[B[IIIIIIIIIILic;II)I"
   )
   private static final int method5287(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class727 arg13, int arg14, int arg15) {
      arg13.field10810 -= arg13.field10805 * arg5;
      int var16;
      if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
         var16 = arg11;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var24 = arg4 >> 8;
         byte var25 = arg2[var24 - 1];
         int var26 = (var25 << 8) + (arg4 & 255) * (arg2[var24] - var25);
         var10001 = var17++;
         arg3[var10001] += arg6 * var26 >> 6;
         arg6 += arg8;
         int var27 = var17++;
         arg3[var27] += arg7 * var26 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var19;
      if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
         var19 = arg11;
      }

      int var20 = var19 << 1;
      int var21 = arg15;

      while(var17 < var20) {
         int var23 = (var21 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var21);
         var10001 = var17++;
         arg3[var10001] += arg6 * var23 >> 6;
         arg6 += arg8;
         var10001 = var17++;
         arg3[var10001] += arg7 * var23 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var22 = var17 >> 1;
      arg13.field10810 += arg13.field10805 * var22;
      arg13.field10796 = arg6;
      arg13.field10808 = arg7;
      arg13.field10798 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "([IIIII)I"
   )
   private final int method5288(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field10804 <= 0) {
            if (this.field10797 == -256 && (this.field10798 & 255) == 0) {
               if (class532.field7780) {
                  return method5281(0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, 0, arg3, arg2, this);
               }

               return method5271(((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, 0, arg3, arg2, this);
            }

            if (class532.field7780) {
               return method5298(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, 0, arg3, arg2, this, this.field10797, arg4);
            }

            return method5277(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, 0, arg3, arg2, this, this.field10797, arg4);
         }

         int var6 = this.field10804 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field10804 += arg1;
         if (this.field10797 == -256 && (this.field10798 & 255) == 0) {
            if (class532.field7780) {
               arg1 = method5265(0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, this.field10806, this.field10801, 0, var6, arg2, this);
            } else {
               arg1 = method5295(((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, this.field10805, 0, var6, arg2, this);
            }
         } else if (class532.field7780) {
            arg1 = method5287(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10796, this.field10808, this.field10806, this.field10801, 0, var6, arg2, this, this.field10797, arg4);
         } else {
            arg1 = method5289(0, 0, ((class640)super.field2081).field9329, arg0, this.field10798, arg1, this.field10810, this.field10805, 0, var6, arg2, this, this.field10797, arg4);
         }

         this.field10804 -= arg1;
         if (this.field10804 != 0) {
            return arg1;
         }
      } while(!this.method5285());

      return arg3;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "d",
      descriptor = "(II[B[IIIIIIIILic;II)I"
   )
   private static final int method5289(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class727 arg11, int arg12, int arg13) {
      arg11.field10796 -= arg11.field10806 * arg5;
      arg11.field10808 -= arg11.field10801 * arg5;
      int var14;
      if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var10001;
      while(arg5 < var14) {
         int var18 = arg4 >> 8;
         byte var19 = arg2[var18 - 1];
         var10001 = arg5++;
         arg3[var10001] += ((var19 << 8) + (arg4 & 255) * (arg2[var18] - var19)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += arg12;
      }

      int var15;
      if (arg12 == 0 || (var15 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var15 = arg9;
      }

      int var16 = arg13;
      int var17 = arg12;

      while(arg5 < var15) {
         var10001 = arg5++;
         arg3[var10001] += ((var16 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var16)) * arg6 >> 6;
         arg6 += arg7;
         arg4 += var17;
      }

      arg11.field10796 += arg11.field10806 * arg5;
      arg11.field10808 += arg11.field10801 * arg5;
      arg11.field10810 = arg6;
      arg11.field10798 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method5290(int arg0) {
      if (arg0 == 0) {
         this.method5270(0);
         this.method2720(0);
      } else if (this.field10796 == 0 && this.field10808 == 0) {
         this.field10804 = 0;
         this.field10802 = 0;
         this.field10810 = 0;
         this.method2720(0);
      } else {
         int var2 = -this.field10810;
         if (this.field10810 > var2) {
            var2 = this.field10810;
         }

         if (-this.field10796 > var2) {
            var2 = -this.field10796;
         }

         if (this.field10796 > var2) {
            var2 = this.field10796;
         }

         if (-this.field10808 > var2) {
            var2 = -this.field10808;
         }

         if (this.field10808 > var2) {
            var2 = this.field10808;
         }

         if (arg0 > var2) {
            arg0 = var2;
         }

         this.field10804 = arg0;
         this.field10802 = Integer.MIN_VALUE;
         this.field10805 = -this.field10810 / arg0;
         this.field10806 = -this.field10796 / arg0;
         this.field10801 = -this.field10808 / arg0;
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(Ljaa;III)Lic;"
   )
   public static final class727 method5291(class640 arg0, int arg1, int arg2, int arg3) {
      return arg0.field9329 != null && arg0.field9329.length != 0 ? new class727(arg0, arg1, arg2, arg3) : null;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method179(int arg0) {
      if (this.field10804 > 0) {
         if (arg0 >= this.field10804) {
            if (this.field10802 == Integer.MIN_VALUE) {
               this.field10802 = 0;
               this.field10810 = this.field10796 = this.field10808 = 0;
               this.method2720(0);
               arg0 = this.field10804;
            }

            this.field10804 = 0;
            this.method5293();
         } else {
            this.field10810 += this.field10805 * arg0;
            this.field10796 += this.field10806 * arg0;
            this.field10808 += this.field10801 * arg0;
            this.field10804 -= arg0;
         }
      }

      class640 var2 = (class640)super.field2081;
      int var3 = this.field10807 << 8;
      int var4 = this.field10809 << 8;
      int var5 = var2.field9329.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field10799 = 0;
      }

      if (this.field10798 < 0) {
         if (this.field10797 <= 0) {
            this.method5279();
            this.method2720(0);
            return;
         }

         this.field10798 = 0;
      }

      if (this.field10798 >= var5) {
         if (this.field10797 >= 0) {
            this.method5279();
            this.method2720(0);
            return;
         }

         this.field10798 = var5 - 1;
      }

      this.field10798 += this.field10797 * arg0;
      if (this.field10799 < 0) {
         if (!this.field10803) {
            if (this.field10797 < 0) {
               if (this.field10798 < var3) {
                  this.field10798 = var4 - 1 - (var4 - 1 - this.field10798) % var6;
               }
            } else if (this.field10798 >= var4) {
               this.field10798 = (this.field10798 - var3) % var6 + var3;
            }
         } else {
            if (this.field10797 < 0) {
               if (this.field10798 >= var3) {
                  return;
               }

               this.field10798 = var3 + var3 - 1 - this.field10798;
               this.field10797 = -this.field10797;
            }

            while(this.field10798 >= var4) {
               this.field10798 = var4 + var4 - 1 - this.field10798;
               this.field10797 = -this.field10797;
               if (this.field10798 >= var3) {
                  return;
               }

               this.field10798 = var3 + var3 - 1 - this.field10798;
               this.field10797 = -this.field10797;
            }

         }
      } else {
         if (this.field10799 > 0) {
            if (this.field10803) {
               label125: {
                  if (this.field10797 < 0) {
                     if (this.field10798 >= var3) {
                        return;
                     }

                     this.field10798 = var3 + var3 - 1 - this.field10798;
                     this.field10797 = -this.field10797;
                     if (--this.field10799 == 0) {
                        break label125;
                     }
                  }

                  do {
                     if (this.field10798 < var4) {
                        return;
                     }

                     this.field10798 = var4 + var4 - 1 - this.field10798;
                     this.field10797 = -this.field10797;
                     if (--this.field10799 == 0) {
                        break;
                     }

                     if (this.field10798 >= var3) {
                        return;
                     }

                     this.field10798 = var3 + var3 - 1 - this.field10798;
                     this.field10797 = -this.field10797;
                  } while(--this.field10799 != 0);
               }
            } else if (this.field10797 < 0) {
               if (this.field10798 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field10798) / var6;
               if (var7 < this.field10799) {
                  this.field10798 += var6 * var7;
                  this.field10799 -= var7;
                  return;
               }

               this.field10798 += this.field10799 * var6;
               this.field10799 = 0;
            } else {
               if (this.field10798 < var4) {
                  return;
               }

               int var8 = (this.field10798 - var3) / var6;
               if (var8 < this.field10799) {
                  this.field10798 -= var6 * var8;
                  this.field10799 -= var8;
                  return;
               }

               this.field10798 -= this.field10799 * var6;
               this.field10799 = 0;
            }
         }

         if (this.field10797 < 0) {
            if (this.field10798 < 0) {
               this.field10798 = -1;
               this.method5279();
               this.method2720(0);
               return;
            }
         } else if (this.field10798 >= var5) {
            this.field10798 = var5;
            this.method5279();
            this.method2720(0);
         }

      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(Z)V"
   )
   public final synchronized void method5292(boolean arg0) {
      this.field10797 = (this.field10797 >>> 31) + (this.field10797 ^ this.field10797 >> 31);
      if (arg0) {
         this.field10797 = -this.field10797;
      }

   }

   @OriginalMember(
      owner = "client!ic",
      name = "j",
      descriptor = "()V"
   )
   private final void method5293() {
      this.field10810 = this.field10802;
      this.field10796 = method5294(this.field10802, this.field10800);
      this.field10808 = method5267(this.field10802, this.field10800);
   }

   @OriginalMember(
      owner = "client!ic",
      name = "c",
      descriptor = "(II)I"
   )
   private static final int method5294(int arg0, int arg1) {
      return arg1 < 0 ? arg0 : (int)((double)arg0 * Math.sqrt((double)(16384 - arg1) * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "([B[IIIIIIIILic;)I"
   )
   private static final int method5295(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class727 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
         var14 = arg7;
      }

      arg9.field10796 += (var14 - arg3) * arg9.field10806;
      arg9.field10808 += (var14 - arg3) * arg9.field10801;
      var14 -= 3;

      int var10001;
      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10--] * var12;
         int var15 = var12 + var13;
         int var18 = arg3++;
         arg1[var18] += arg0[var10--] * var15;
         int var16 = var13 + var15;
         int var19 = arg3++;
         arg1[var19] += arg0[var10--] * var16;
         int var17 = var13 + var16;
         int var20 = arg3++;
         arg1[var20] += arg0[var10--] * var17;
         var12 = var13 + var17;
      }

      var14 += 3;

      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10--] * var12;
         var12 += var13;
      }

      arg9.field10810 = var12 >> 2;
      arg9.field10798 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "h",
      descriptor = "()Z"
   )
   public final boolean method5296() {
      return this.field10804 != 0;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(II[B[IIIIIIIIIILic;II)I"
   )
   private static final int method5297(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class727 arg13, int arg14, int arg15) {
      arg13.field10810 -= arg13.field10805 * arg5;
      int var16;
      if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
         var16 = arg11;
      }

      int var17 = arg5 << 1;
      int var18 = var16 << 1;

      int var10001;
      while(var17 < var18) {
         int var25 = arg4 >> 8;
         byte var26 = arg2[var25];
         int var27 = (var26 << 8) + (arg4 & 255) * (arg2[var25 + 1] - var26);
         var10001 = var17++;
         arg3[var10001] += arg6 * var27 >> 6;
         arg6 += arg8;
         int var28 = var17++;
         arg3[var28] += arg7 * var27 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var19;
      if (arg14 == 0 || (var19 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
         var19 = arg11;
      }

      int var20 = var19 << 1;
      int var21 = arg15;

      while(var17 < var20) {
         byte var23 = arg2[arg4 >> 8];
         int var24 = (var23 << 8) + (arg4 & 255) * (var21 - var23);
         var10001 = var17++;
         arg3[var10001] += arg6 * var24 >> 6;
         arg6 += arg8;
         var10001 = var17++;
         arg3[var10001] += arg7 * var24 >> 6;
         arg7 += arg9;
         arg4 += arg14;
      }

      int var22 = var17 >> 1;
      arg13.field10810 += arg13.field10805 * var22;
      arg13.field10796 = arg6;
      arg13.field10808 = arg7;
      arg13.field10798 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "a",
      descriptor = "(II[B[IIIIIIIILic;II)I"
   )
   private static final int method5298(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class727 arg11, int arg12, int arg13) {
      int var14;
      if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
         var14 = arg9;
      }

      int var15 = arg5 << 1;
      int var16 = var14 << 1;

      int var10001;
      while(var15 < var16) {
         int var21 = arg4 >> 8;
         byte var22 = arg2[var21 - 1];
         int var23 = (var22 << 8) + (arg4 & 255) * (arg2[var21] - var22);
         var10001 = var15++;
         arg3[var10001] += arg6 * var23 >> 6;
         int var24 = var15++;
         arg3[var24] += arg7 * var23 >> 6;
         arg4 += arg12;
      }

      int var17;
      if (arg12 == 0 || (var17 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
         var17 = arg9;
      }

      int var18 = var17 << 1;
      int var19 = arg13;

      while(var15 < var18) {
         int var20 = (var19 << 8) + (arg4 & 255) * (arg2[arg4 >> 8] - var19);
         var10001 = var15++;
         arg3[var10001] += arg6 * var20 >> 6;
         var10001 = var15++;
         arg3[var10001] += arg7 * var20 >> 6;
         arg4 += arg12;
      }

      arg11.field10798 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "c",
      descriptor = "()Lwea;"
   )
   public final class166 method182() {
      return null;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(I[B[IIIIIIIILic;)I"
   )
   private static final int method5299(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class727 arg10) {
      int var11 = arg3 >> 8;
      int var12 = arg9 >> 8;
      int var13 = arg5 << 2;
      int var14 = arg6 << 2;
      int var15;
      if ((var15 = arg4 + var12 - var11) > arg8) {
         var15 = arg8;
      }

      int var16 = arg4 << 1;
      int var17 = var15 << 1;
      int var23 = var17 - 6;

      while(var16 < var23) {
         byte var19 = arg1[var11++];
         int var24 = var16++;
         arg2[var24] += var13 * var19;
         int var25 = var16++;
         arg2[var25] += var14 * var19;
         byte var20 = arg1[var11++];
         int var27 = var16++;
         arg2[var27] += var13 * var20;
         int var28 = var16++;
         arg2[var28] += var14 * var20;
         byte var21 = arg1[var11++];
         int var30 = var16++;
         arg2[var30] += var13 * var21;
         int var31 = var16++;
         arg2[var31] += var14 * var21;
         byte var22 = arg1[var11++];
         int var33 = var16++;
         arg2[var33] += var13 * var22;
         int var34 = var16++;
         arg2[var34] += var14 * var22;
      }

      var17 = var23 + 6;

      while(var16 < var17) {
         byte var18 = arg1[var11++];
         int var10001 = var16++;
         arg2[var10001] += var13 * var18;
         int var35 = var16++;
         arg2[var35] += var14 * var18;
      }

      arg10.field10798 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method187(int[] arg0, int arg1, int arg2) {
      if (this.field10802 == 0 && this.field10804 == 0) {
         this.method179(arg2);
      } else {
         class640 var4 = (class640)super.field2081;
         int var5 = this.field10807 << 8;
         int var6 = this.field10809 << 8;
         int var7 = var4.field9329.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field10799 = 0;
         }

         int var9 = arg1;
         int var10 = arg1 + arg2;
         if (this.field10798 < 0) {
            if (this.field10797 <= 0) {
               this.method5279();
               this.method2720(0);
               return;
            }

            this.field10798 = 0;
         }

         if (this.field10798 >= var7) {
            if (this.field10797 >= 0) {
               this.method5279();
               this.method2720(0);
               return;
            }

            this.field10798 = var7 - 1;
         }

         if (this.field10799 < 0) {
            if (this.field10803) {
               if (this.field10797 < 0) {
                  var9 = this.method5288(arg0, arg1, var5, var10, var4.field9329[this.field10807]);
                  if (this.field10798 >= var5) {
                     return;
                  }

                  this.field10798 = var5 + var5 - 1 - this.field10798;
                  this.field10797 = -this.field10797;
               }

               while(true) {
                  int var11 = this.method5272(arg0, var9, var6, var10, var4.field9329[this.field10809 - 1]);
                  if (this.field10798 < var6) {
                     return;
                  }

                  this.field10798 = var6 + var6 - 1 - this.field10798;
                  this.field10797 = -this.field10797;
                  var9 = this.method5288(arg0, var11, var5, var10, var4.field9329[this.field10807]);
                  if (this.field10798 >= var5) {
                     return;
                  }

                  this.field10798 = var5 + var5 - 1 - this.field10798;
                  this.field10797 = -this.field10797;
               }
            } else if (this.field10797 < 0) {
               while(true) {
                  var9 = this.method5288(arg0, var9, var5, var10, var4.field9329[this.field10809 - 1]);
                  if (this.field10798 >= var5) {
                     return;
                  }

                  this.field10798 = var6 - 1 - (var6 - 1 - this.field10798) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method5272(arg0, var9, var6, var10, var4.field9329[this.field10807]);
                  if (this.field10798 < var6) {
                     return;
                  }

                  this.field10798 = (this.field10798 - var5) % var8 + var5;
               }
            }
         } else {
            if (this.field10799 > 0) {
               if (this.field10803) {
                  label130: {
                     if (this.field10797 < 0) {
                        var9 = this.method5288(arg0, arg1, var5, var10, var4.field9329[this.field10807]);
                        if (this.field10798 >= var5) {
                           return;
                        }

                        this.field10798 = var5 + var5 - 1 - this.field10798;
                        this.field10797 = -this.field10797;
                        if (--this.field10799 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method5272(arg0, var9, var6, var10, var4.field9329[this.field10809 - 1]);
                        if (this.field10798 < var6) {
                           return;
                        }

                        this.field10798 = var6 + var6 - 1 - this.field10798;
                        this.field10797 = -this.field10797;
                        if (--this.field10799 == 0) {
                           break;
                        }

                        var9 = this.method5288(arg0, var9, var5, var10, var4.field9329[this.field10807]);
                        if (this.field10798 >= var5) {
                           return;
                        }

                        this.field10798 = var5 + var5 - 1 - this.field10798;
                        this.field10797 = -this.field10797;
                     } while(--this.field10799 != 0);
                  }
               } else if (this.field10797 < 0) {
                  while(true) {
                     var9 = this.method5288(arg0, var9, var5, var10, var4.field9329[this.field10809 - 1]);
                     if (this.field10798 >= var5) {
                        return;
                     }

                     int var12 = (var6 - 1 - this.field10798) / var8;
                     if (var12 >= this.field10799) {
                        this.field10798 += this.field10799 * var8;
                        this.field10799 = 0;
                        break;
                     }

                     this.field10798 += var8 * var12;
                     this.field10799 -= var12;
                  }
               } else {
                  while(true) {
                     var9 = this.method5272(arg0, var9, var6, var10, var4.field9329[this.field10807]);
                     if (this.field10798 < var6) {
                        return;
                     }

                     int var13 = (this.field10798 - var5) / var8;
                     if (var13 >= this.field10799) {
                        this.field10798 -= this.field10799 * var8;
                        this.field10799 = 0;
                        break;
                     }

                     this.field10798 -= var8 * var13;
                     this.field10799 -= var13;
                  }
               }
            }

            if (this.field10797 < 0) {
               this.method5288(arg0, var9, 0, var10, 0);
               if (this.field10798 < 0) {
                  this.field10798 = -1;
                  this.method5279();
                  this.method2720(0);
                  return;
               }
            } else {
               this.method5272(arg0, var9, var7, var10, 0);
               if (this.field10798 >= var7) {
                  this.field10798 = var7;
                  this.method5279();
                  this.method2720(0);
               }
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "([B[IIIIIIIILic;)I"
   )
   private static final int method5300(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class727 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var11 - var10) > arg7) {
         var14 = arg7;
      }

      arg9.field10796 += (var14 - arg3) * arg9.field10806;
      arg9.field10808 += (var14 - arg3) * arg9.field10801;
      var14 -= 3;

      int var10001;
      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10++] * var12;
         int var15 = var12 + var13;
         int var18 = arg3++;
         arg1[var18] += arg0[var10++] * var15;
         int var16 = var13 + var15;
         int var19 = arg3++;
         arg1[var19] += arg0[var10++] * var16;
         int var17 = var13 + var16;
         int var20 = arg3++;
         arg1[var20] += arg0[var10++] * var17;
         var12 = var13 + var17;
      }

      var14 += 3;

      while(arg3 < var14) {
         var10001 = arg3++;
         arg1[var10001] += arg0[var10++] * var12;
         var12 += var13;
      }

      arg9.field10810 = var12 >> 2;
      arg9.field10798 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "b",
      descriptor = "(I[B[IIIIIIIIIILic;)I"
   )
   private static final int method5301(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class727 arg12) {
      int var13 = arg3 >> 8;
      int var14 = arg11 >> 8;
      int var15 = arg5 << 2;
      int var16 = arg6 << 2;
      int var17 = arg7 << 2;
      int var18 = arg8 << 2;
      int var19;
      if ((var19 = arg4 + var14 - var13) > arg10) {
         var19 = arg10;
      }

      arg12.field10810 += (var19 - arg4) * arg12.field10805;
      int var20 = arg4 << 1;
      int var21 = var19 << 1;
      int var44 = var21 - 6;

      while(var20 < var44) {
         byte var23 = arg1[var13++];
         int var33 = var20++;
         arg2[var33] += var15 * var23;
         int var24 = var15 + var17;
         int var34 = var20++;
         arg2[var34] += var16 * var23;
         int var25 = var16 + var18;
         byte var26 = arg1[var13++];
         int var36 = var20++;
         arg2[var36] += var24 * var26;
         int var27 = var17 + var24;
         int var37 = var20++;
         arg2[var37] += var25 * var26;
         int var28 = var18 + var25;
         byte var29 = arg1[var13++];
         int var39 = var20++;
         arg2[var39] += var27 * var29;
         int var30 = var17 + var27;
         int var40 = var20++;
         arg2[var40] += var28 * var29;
         int var31 = var18 + var28;
         byte var32 = arg1[var13++];
         int var42 = var20++;
         arg2[var42] += var30 * var32;
         var15 = var17 + var30;
         int var43 = var20++;
         arg2[var43] += var31 * var32;
         var16 = var18 + var31;
      }

      var21 = var44 + 6;

      while(var20 < var21) {
         byte var22 = arg1[var13++];
         int var10001 = var20++;
         arg2[var10001] += var15 * var22;
         var15 += var17;
         int var45 = var20++;
         arg2[var45] += var16 * var22;
         var16 += var18;
      }

      arg12.field10796 = var15 >> 2;
      arg12.field10808 = var16 >> 2;
      arg12.field10798 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "l",
      descriptor = "()I"
   )
   public final synchronized int method5302() {
      return this.field10802 == Integer.MIN_VALUE ? 0 : this.field10802;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "i",
      descriptor = "()Z"
   )
   public final boolean method5303() {
      return this.field10798 < 0 || this.field10798 >= ((class640)super.field2081).field9329.length << 8;
   }

   @OriginalMember(
      owner = "client!ic",
      name = "<init>",
      descriptor = "(Ljaa;III)V"
   )
   private class727(class640 arg0, int arg1, int arg2, int arg3) {
      super.field2081 = arg0;
      this.field10807 = arg0.field9327;
      this.field10809 = arg0.field9328;
      this.field10803 = arg0.field9330;
      this.field10797 = arg1;
      this.field10802 = arg2;
      this.field10800 = arg3;
      this.field10798 = 0;
      this.method5293();
   }
}
