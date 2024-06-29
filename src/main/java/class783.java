import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class783 extends class268 {
   @OriginalMember(
      owner = "client!mo",
      name = "o",
      descriptor = "I"
   )
   private int field11452;
   @OriginalMember(
      owner = "client!mo",
      name = "n",
      descriptor = "I"
   )
   private int field11442;
   @OriginalMember(
      owner = "client!mo",
      name = "x",
      descriptor = "Z"
   )
   private boolean field11453;
   @OriginalMember(
      owner = "client!mo",
      name = "w",
      descriptor = "I"
   )
   private int field11448;
   @OriginalMember(
      owner = "client!mo",
      name = "z",
      descriptor = "I"
   )
   private int field11451;
   @OriginalMember(
      owner = "client!mo",
      name = "A",
      descriptor = "I"
   )
   private int field11454;
   @OriginalMember(
      owner = "client!mo",
      name = "s",
      descriptor = "I"
   )
   private int field11441;
   @OriginalMember(
      owner = "client!mo",
      name = "v",
      descriptor = "I"
   )
   private int field11443;
   @OriginalMember(
      owner = "client!mo",
      name = "p",
      descriptor = "I"
   )
   private int field11444;
   @OriginalMember(
      owner = "client!mo",
      name = "t",
      descriptor = "I"
   )
   private int field11445;
   @OriginalMember(
      owner = "client!mo",
      name = "u",
      descriptor = "I"
   )
   private int field11446;
   @OriginalMember(
      owner = "client!mo",
      name = "r",
      descriptor = "I"
   )
   private int field11447;
   @OriginalMember(
      owner = "client!mo",
      name = "y",
      descriptor = "I"
   )
   private int field11449;
   @OriginalMember(
      owner = "client!mo",
      name = "q",
      descriptor = "I"
   )
   private int field11450;
   @OriginalMember(
      owner = "client!mo",
      name = "B",
      descriptor = "I"
   )
   private int field11455;

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "([IIIII)I"
   )
   private final int method5606(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field11449 <= 0) {
            if (this.field11448 == 256 && (this.field11441 & 255) == 0) {
               if (class614.field8578) {
                  return method5615(0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, 0, arg3, arg2, this);
               }

               return method5635(((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, 0, arg3, arg2, this);
            }

            if (class614.field8578) {
               return method5614(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, 0, arg3, arg2, this, this.field11448, arg4);
            }

            return method5645(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, 0, arg3, arg2, this, this.field11448, arg4);
         }

         int var6 = this.field11449 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field11449 += arg1;
         if (this.field11448 == 256 && (this.field11441 & 255) == 0) {
            if (class614.field8578) {
               arg1 = method5632(0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, this.field11447, this.field11450, 0, var6, arg2, this);
            } else {
               arg1 = method5620(((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, this.field11455, 0, var6, arg2, this);
            }
         } else if (class614.field8578) {
            arg1 = method5619(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, this.field11447, this.field11450, 0, var6, arg2, this, this.field11448, arg4);
         } else {
            arg1 = method5625(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, this.field11455, 0, var6, arg2, this, this.field11448, arg4);
         }

         this.field11449 -= arg1;
         if (this.field11449 != 0) {
            return arg1;
         }
      } while(!this.method5642());

      return arg3;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "()I"
   )
   public final int method668() {
      return this.field11451 == 0 && this.field11449 == 0 ? 0 : 1;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(II)V"
   )
   private final synchronized void method5607(int arg0, int arg1) {
      this.field11451 = arg0;
      this.field11454 = arg1;
      this.field11449 = 0;
      this.method5639();
   }

   @OriginalMember(
      owner = "client!mo",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method5608() {
      return this.field11441 < 0 || this.field11441 >= ((class98)super.field3476).field1277.length << 8;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "([B[IIIIIIIILmo;)I"
   )
   private static final int method5609(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class783 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
         var14 = arg7;
      }

      arg9.field11443 += (var14 - arg3) * arg9.field11447;
      arg9.field11444 += (var14 - arg3) * arg9.field11450;
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

      arg9.field11446 = var12 >> 2;
      arg9.field11441 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(II[B[IIIIIIIIIILmo;II)I"
   )
   private static final int method5610(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class783 arg13, int arg14, int arg15) {
      arg13.field11446 -= arg13.field11455 * arg5;
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
      arg13.field11446 += arg13.field11455 * var22;
      arg13.field11443 = arg6;
      arg13.field11444 = arg7;
      arg13.field11441 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "i",
      descriptor = "(I)V"
   )
   public final synchronized void method5611(int arg0) {
      if (this.field11448 < 0) {
         this.field11448 = -arg0;
      } else {
         this.field11448 = arg0;
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(II[B[IIIIIIILmo;II)I"
   )
   private static final int method5612(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class783 arg10, int arg11, int arg12) {
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

      arg10.field11441 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "g",
      descriptor = "()V"
   )
   private final void method5613() {
      if (this.field11449 != 0) {
         if (this.field11451 == Integer.MIN_VALUE) {
            this.field11451 = 0;
         }

         this.field11449 = 0;
         this.method5639();
      }

   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "()Lfga;"
   )
   public final class268 method649() {
      return null;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(II[B[IIIIIIIILmo;II)I"
   )
   private static final int method5614(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class783 arg11, int arg12, int arg13) {
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

      arg11.field11441 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(I[B[IIIIIIIILmo;)I"
   )
   private static final int method5615(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class783 arg10) {
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

      arg10.field11441 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(II[B[IIIIIIIILmo;II)I"
   )
   private static final int method5616(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class783 arg11, int arg12, int arg13) {
      arg11.field11443 -= arg11.field11447 * arg5;
      arg11.field11444 -= arg11.field11450 * arg5;
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

      arg11.field11443 += arg11.field11447 * arg5;
      arg11.field11444 += arg11.field11450 * arg5;
      arg11.field11446 = arg6;
      arg11.field11441 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "e",
      descriptor = "(I)V"
   )
   public final synchronized void method5617(int arg0) {
      this.method5607(this.method5627(), arg0);
   }

   @OriginalMember(
      owner = "client!mo",
      name = "j",
      descriptor = "(I)V"
   )
   public final synchronized void method5618(int arg0) {
      this.field11445 = arg0;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(II[B[IIIIIIIIIILmo;II)I"
   )
   private static final int method5619(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class783 arg13, int arg14, int arg15) {
      arg13.field11446 -= arg13.field11455 * arg5;
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
      arg13.field11446 += arg13.field11455 * var22;
      arg13.field11443 = arg6;
      arg13.field11444 = arg7;
      arg13.field11441 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "([B[IIIIIIIILmo;)I"
   )
   private static final int method5620(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class783 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var11 - var10) > arg7) {
         var14 = arg7;
      }

      arg9.field11443 += (var14 - arg3) * arg9.field11447;
      arg9.field11444 += (var14 - arg3) * arg9.field11450;
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

      arg9.field11446 = var12 >> 2;
      arg9.field11441 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "f",
      descriptor = "()I"
   )
   public final synchronized int method5621() {
      return this.field11454 < 0 ? -1 : this.field11454;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(I[B[IIIIIIIILmo;)I"
   )
   private static final int method5622(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class783 arg10) {
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

      arg10.field11441 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(III)V"
   )
   public final synchronized void method5623(int arg0, int arg1, int arg2) {
      if (arg0 == 0) {
         this.method5607(arg1, arg2);
      } else {
         int var4 = method5644(arg1, arg2);
         int var5 = method5633(arg1, arg2);
         if (this.field11443 == var4 && this.field11444 == var5) {
            this.field11449 = 0;
         } else {
            int var6 = arg1 - this.field11446;
            if (this.field11446 - arg1 > var6) {
               var6 = this.field11446 - arg1;
            }

            if (var4 - this.field11443 > var6) {
               var6 = var4 - this.field11443;
            }

            if (this.field11443 - var4 > var6) {
               var6 = this.field11443 - var4;
            }

            if (var5 - this.field11444 > var6) {
               var6 = var5 - this.field11444;
            }

            if (this.field11444 - var5 > var6) {
               var6 = this.field11444 - var5;
            }

            if (arg0 > var6) {
               arg0 = var6;
            }

            this.field11449 = arg0;
            this.field11451 = arg1;
            this.field11454 = arg2;
            this.field11455 = (arg1 - this.field11446) / arg0;
            this.field11447 = (var4 - this.field11443) / arg0;
            this.field11450 = (var5 - this.field11444) / arg0;
         }
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "([IIIII)I"
   )
   private final int method5624(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field11449 <= 0) {
            if (this.field11448 == -256 && (this.field11441 & 255) == 0) {
               if (class614.field8578) {
                  return method5622(0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, 0, arg3, arg2, this);
               }

               return method5634(((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, 0, arg3, arg2, this);
            }

            if (class614.field8578) {
               return method5636(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, 0, arg3, arg2, this, this.field11448, arg4);
            }

            return method5612(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, 0, arg3, arg2, this, this.field11448, arg4);
         }

         int var6 = this.field11449 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field11449 += arg1;
         if (this.field11448 == -256 && (this.field11441 & 255) == 0) {
            if (class614.field8578) {
               arg1 = method5641(0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, this.field11447, this.field11450, 0, var6, arg2, this);
            } else {
               arg1 = method5609(((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, this.field11455, 0, var6, arg2, this);
            }
         } else if (class614.field8578) {
            arg1 = method5610(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11443, this.field11444, this.field11447, this.field11450, 0, var6, arg2, this, this.field11448, arg4);
         } else {
            arg1 = method5616(0, 0, ((class98)super.field3476).field1277, arg0, this.field11441, arg1, this.field11446, this.field11455, 0, var6, arg2, this, this.field11448, arg4);
         }

         this.field11449 -= arg1;
         if (this.field11449 != 0) {
            return arg1;
         }
      } while(!this.method5642());

      return arg3;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "d",
      descriptor = "(II[B[IIIIIIIILmo;II)I"
   )
   private static final int method5625(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class783 arg11, int arg12, int arg13) {
      arg11.field11443 -= arg11.field11447 * arg5;
      arg11.field11444 -= arg11.field11450 * arg5;
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

      arg11.field11443 += arg11.field11447 * arg5;
      arg11.field11444 += arg11.field11450 * arg5;
      arg11.field11446 = arg6;
      arg11.field11441 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "h",
      descriptor = "(I)V"
   )
   private final synchronized void method5626(int arg0) {
      this.method5607(arg0, this.method5621());
   }

   @OriginalMember(
      owner = "client!mo",
      name = "e",
      descriptor = "()I"
   )
   public final synchronized int method5627() {
      return this.field11451 == Integer.MIN_VALUE ? 0 : this.field11451;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "g",
      descriptor = "(I)V"
   )
   public final synchronized void method5628(int arg0) {
      int var2 = ((class98)super.field3476).field1277.length << 8;
      if (arg0 < -1) {
         arg0 = -1;
      }

      if (arg0 > var2) {
         arg0 = var2;
      }

      this.field11441 = arg0;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "i",
      descriptor = "()Z"
   )
   public final boolean method5629() {
      return this.field11449 != 0;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "d",
      descriptor = "(II)V"
   )
   public final synchronized void method5630(int arg0, int arg1) {
      this.method5623(arg0, arg1, this.method5621());
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(Z)V"
   )
   public final synchronized void method5631(boolean arg0) {
      this.field11448 = (this.field11448 >>> 31) + (this.field11448 ^ this.field11448 >> 31);
      if (arg0) {
         this.field11448 = -this.field11448;
      }

   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(I[B[IIIIIIIIIILmo;)I"
   )
   private static final int method5632(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class783 arg12) {
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

      arg12.field11446 += (var19 - arg4) * arg12.field11455;
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

      arg12.field11443 = var15 >> 2;
      arg12.field11444 = var16 >> 2;
      arg12.field11441 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(II)I"
   )
   private static final int method5633(int arg0, int arg1) {
      return arg1 < 0 ? -arg0 : (int)((double)arg0 * Math.sqrt((double)arg1 * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "([B[IIIIIIILmo;)I"
   )
   private static final int method5634(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class783 arg8) {
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

      arg8.field11441 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "([B[IIIIIIILmo;)I"
   )
   private static final int method5635(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class783 arg8) {
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

      arg8.field11441 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "(II[B[IIIIIIIILmo;II)I"
   )
   private static final int method5636(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class783 arg11, int arg12, int arg13) {
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

      arg11.field11441 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "()Lfga;"
   )
   public final class268 method650() {
      return null;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "f",
      descriptor = "(I)V"
   )
   public final synchronized void method5637(int arg0) {
      this.method5607(arg0 << 6, this.method5621());
   }

   @OriginalMember(
      owner = "client!mo",
      name = "h",
      descriptor = "()I"
   )
   public final synchronized int method5638() {
      return this.field11448 < 0 ? -this.field11448 : this.field11448;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "k",
      descriptor = "()V"
   )
   private final void method5639() {
      this.field11446 = this.field11451;
      this.field11443 = method5644(this.field11451, this.field11454);
      this.field11444 = method5633(this.field11451, this.field11454);
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method669(int[] arg0, int arg1, int arg2) {
      if (this.field11451 == 0 && this.field11449 == 0) {
         this.method684(arg2);
      } else {
         class98 var4 = (class98)super.field3476;
         int var5 = this.field11452 << 8;
         int var6 = this.field11442 << 8;
         int var7 = var4.field1277.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field11445 = 0;
         }

         int var9 = arg1;
         int var10 = arg1 + arg2;
         if (this.field11441 < 0) {
            if (this.field11448 <= 0) {
               this.method5613();
               this.method3609(109);
               return;
            }

            this.field11441 = 0;
         }

         if (this.field11441 >= var7) {
            if (this.field11448 >= 0) {
               this.method5613();
               this.method3609(112);
               return;
            }

            this.field11441 = var7 - 1;
         }

         if (this.field11445 < 0) {
            if (this.field11453) {
               if (this.field11448 < 0) {
                  var9 = this.method5624(arg0, arg1, var5, var10, var4.field1277[this.field11452]);
                  if (this.field11441 >= var5) {
                     return;
                  }

                  this.field11441 = var5 + var5 - 1 - this.field11441;
                  this.field11448 = -this.field11448;
               }

               while(true) {
                  int var11 = this.method5606(arg0, var9, var6, var10, var4.field1277[this.field11442 - 1]);
                  if (this.field11441 < var6) {
                     return;
                  }

                  this.field11441 = var6 + var6 - 1 - this.field11441;
                  this.field11448 = -this.field11448;
                  var9 = this.method5624(arg0, var11, var5, var10, var4.field1277[this.field11452]);
                  if (this.field11441 >= var5) {
                     return;
                  }

                  this.field11441 = var5 + var5 - 1 - this.field11441;
                  this.field11448 = -this.field11448;
               }
            } else if (this.field11448 < 0) {
               while(true) {
                  var9 = this.method5624(arg0, var9, var5, var10, var4.field1277[this.field11442 - 1]);
                  if (this.field11441 >= var5) {
                     return;
                  }

                  this.field11441 = var6 - 1 - (var6 - 1 - this.field11441) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method5606(arg0, var9, var6, var10, var4.field1277[this.field11452]);
                  if (this.field11441 < var6) {
                     return;
                  }

                  this.field11441 = (this.field11441 - var5) % var8 + var5;
               }
            }
         } else {
            if (this.field11445 > 0) {
               if (this.field11453) {
                  label130: {
                     if (this.field11448 < 0) {
                        var9 = this.method5624(arg0, arg1, var5, var10, var4.field1277[this.field11452]);
                        if (this.field11441 >= var5) {
                           return;
                        }

                        this.field11441 = var5 + var5 - 1 - this.field11441;
                        this.field11448 = -this.field11448;
                        if (--this.field11445 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method5606(arg0, var9, var6, var10, var4.field1277[this.field11442 - 1]);
                        if (this.field11441 < var6) {
                           return;
                        }

                        this.field11441 = var6 + var6 - 1 - this.field11441;
                        this.field11448 = -this.field11448;
                        if (--this.field11445 == 0) {
                           break;
                        }

                        var9 = this.method5624(arg0, var9, var5, var10, var4.field1277[this.field11452]);
                        if (this.field11441 >= var5) {
                           return;
                        }

                        this.field11441 = var5 + var5 - 1 - this.field11441;
                        this.field11448 = -this.field11448;
                     } while(--this.field11445 != 0);
                  }
               } else if (this.field11448 < 0) {
                  while(true) {
                     var9 = this.method5624(arg0, var9, var5, var10, var4.field1277[this.field11442 - 1]);
                     if (this.field11441 >= var5) {
                        return;
                     }

                     int var12 = (var6 - 1 - this.field11441) / var8;
                     if (var12 >= this.field11445) {
                        this.field11441 += this.field11445 * var8;
                        this.field11445 = 0;
                        break;
                     }

                     this.field11441 += var8 * var12;
                     this.field11445 -= var12;
                  }
               } else {
                  while(true) {
                     var9 = this.method5606(arg0, var9, var6, var10, var4.field1277[this.field11452]);
                     if (this.field11441 < var6) {
                        return;
                     }

                     int var13 = (this.field11441 - var5) / var8;
                     if (var13 >= this.field11445) {
                        this.field11441 -= this.field11445 * var8;
                        this.field11445 = 0;
                        break;
                     }

                     this.field11441 -= var8 * var13;
                     this.field11445 -= var13;
                  }
               }
            }

            if (this.field11448 < 0) {
               this.method5624(arg0, var9, 0, var10, 0);
               if (this.field11441 < 0) {
                  this.field11441 = -1;
                  this.method5613();
                  this.method3609(84);
                  return;
               }
            } else {
               this.method5606(arg0, var9, var7, var10, 0);
               if (this.field11441 >= var7) {
                  this.field11441 = var7;
                  this.method5613();
                  this.method3609(127);
               }
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "b",
      descriptor = "(I)V"
   )
   public final synchronized void method5640(int arg0) {
      if (arg0 == 0) {
         this.method5626(0);
         this.method3609(81);
      } else if (this.field11443 == 0 && this.field11444 == 0) {
         this.field11449 = 0;
         this.field11451 = 0;
         this.field11446 = 0;
         this.method3609(87);
      } else {
         int var2 = -this.field11446;
         if (this.field11446 > var2) {
            var2 = this.field11446;
         }

         if (-this.field11443 > var2) {
            var2 = -this.field11443;
         }

         if (this.field11443 > var2) {
            var2 = this.field11443;
         }

         if (-this.field11444 > var2) {
            var2 = -this.field11444;
         }

         if (this.field11444 > var2) {
            var2 = this.field11444;
         }

         if (arg0 > var2) {
            arg0 = var2;
         }

         this.field11449 = arg0;
         this.field11451 = Integer.MIN_VALUE;
         this.field11455 = -this.field11446 / arg0;
         this.field11447 = -this.field11443 / arg0;
         this.field11450 = -this.field11444 / arg0;
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(I[B[IIIIIIIIIILmo;)I"
   )
   private static final int method5641(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class783 arg12) {
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

      arg12.field11446 += (var19 - arg4) * arg12.field11455;
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

      arg12.field11443 = var15 >> 2;
      arg12.field11444 = var16 >> 2;
      arg12.field11441 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "d",
      descriptor = "()I"
   )
   public final int method2058() {
      int var1 = this.field11446 * 3 >> 6;
      int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
      if (this.field11445 == 0) {
         var2 -= this.field11441 * var2 / (((class98)super.field3476).field1277.length << 8);
      } else if (this.field11445 >= 0) {
         var2 -= this.field11452 * var2 / ((class98)super.field3476).field1277.length;
      }

      return var2 > 255 ? 255 : var2;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "j",
      descriptor = "()Z"
   )
   private final boolean method5642() {
      int var1 = this.field11451;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method5644(var1, this.field11454);
         var2 = method5633(var1, this.field11454);
      }

      if (this.field11446 == var1 && this.field11443 == var3 && this.field11444 == var2) {
         if (this.field11451 == Integer.MIN_VALUE) {
            this.field11451 = 0;
            this.field11446 = this.field11443 = this.field11444 = 0;
            this.method3609(98);
            return true;
         } else {
            this.method5639();
            return false;
         }
      } else {
         if (this.field11446 < var1) {
            this.field11455 = 1;
            this.field11449 = var1 - this.field11446;
         } else if (this.field11446 > var1) {
            this.field11455 = -1;
            this.field11449 = this.field11446 - var1;
         } else {
            this.field11455 = 0;
         }

         if (this.field11443 < var3) {
            this.field11447 = 1;
            if (this.field11449 == 0 || this.field11449 > var3 - this.field11443) {
               this.field11449 = var3 - this.field11443;
            }
         } else if (this.field11443 > var3) {
            this.field11447 = -1;
            if (this.field11449 == 0 || this.field11449 > this.field11443 - var3) {
               this.field11449 = this.field11443 - var3;
            }
         } else {
            this.field11447 = 0;
         }

         if (this.field11444 < var2) {
            this.field11450 = 1;
            if (this.field11449 == 0 || this.field11449 > var2 - this.field11444) {
               this.field11449 = var2 - this.field11444;
            }
         } else if (this.field11444 > var2) {
            this.field11450 = -1;
            if (this.field11449 == 0 || this.field11449 > this.field11444 - var2) {
               this.field11449 = this.field11444 - var2;
            }
         } else {
            this.field11450 = 0;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(Lin;III)Lmo;"
   )
   public static final class783 method5643(class98 arg0, int arg1, int arg2, int arg3) {
      return arg0.field1277 != null && arg0.field1277.length != 0 ? new class783(arg0, arg1, arg2, arg3) : null;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "c",
      descriptor = "(II)I"
   )
   private static final int method5644(int arg0, int arg1) {
      return arg1 < 0 ? arg0 : (int)((double)arg0 * Math.sqrt((double)(16384 - arg1) * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(II[B[IIIIIIILmo;II)I"
   )
   private static final int method5645(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class783 arg10, int arg11, int arg12) {
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

      arg10.field11441 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!mo",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method684(int arg0) {
      if (this.field11449 > 0) {
         if (arg0 >= this.field11449) {
            if (this.field11451 == Integer.MIN_VALUE) {
               this.field11451 = 0;
               this.field11446 = this.field11443 = this.field11444 = 0;
               this.method3609(92);
               arg0 = this.field11449;
            }

            this.field11449 = 0;
            this.method5639();
         } else {
            this.field11446 += this.field11455 * arg0;
            this.field11443 += this.field11447 * arg0;
            this.field11444 += this.field11450 * arg0;
            this.field11449 -= arg0;
         }
      }

      class98 var2 = (class98)super.field3476;
      int var3 = this.field11452 << 8;
      int var4 = this.field11442 << 8;
      int var5 = var2.field1277.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field11445 = 0;
      }

      if (this.field11441 < 0) {
         if (this.field11448 <= 0) {
            this.method5613();
            this.method3609(121);
            return;
         }

         this.field11441 = 0;
      }

      if (this.field11441 >= var5) {
         if (this.field11448 >= 0) {
            this.method5613();
            this.method3609(119);
            return;
         }

         this.field11441 = var5 - 1;
      }

      this.field11441 += this.field11448 * arg0;
      if (this.field11445 < 0) {
         if (!this.field11453) {
            if (this.field11448 < 0) {
               if (this.field11441 < var3) {
                  this.field11441 = var4 - 1 - (var4 - 1 - this.field11441) % var6;
               }
            } else if (this.field11441 >= var4) {
               this.field11441 = (this.field11441 - var3) % var6 + var3;
            }
         } else {
            if (this.field11448 < 0) {
               if (this.field11441 >= var3) {
                  return;
               }

               this.field11441 = var3 + var3 - 1 - this.field11441;
               this.field11448 = -this.field11448;
            }

            while(this.field11441 >= var4) {
               this.field11441 = var4 + var4 - 1 - this.field11441;
               this.field11448 = -this.field11448;
               if (this.field11441 >= var3) {
                  return;
               }

               this.field11441 = var3 + var3 - 1 - this.field11441;
               this.field11448 = -this.field11448;
            }

         }
      } else {
         if (this.field11445 > 0) {
            if (this.field11453) {
               label125: {
                  if (this.field11448 < 0) {
                     if (this.field11441 >= var3) {
                        return;
                     }

                     this.field11441 = var3 + var3 - 1 - this.field11441;
                     this.field11448 = -this.field11448;
                     if (--this.field11445 == 0) {
                        break label125;
                     }
                  }

                  do {
                     if (this.field11441 < var4) {
                        return;
                     }

                     this.field11441 = var4 + var4 - 1 - this.field11441;
                     this.field11448 = -this.field11448;
                     if (--this.field11445 == 0) {
                        break;
                     }

                     if (this.field11441 >= var3) {
                        return;
                     }

                     this.field11441 = var3 + var3 - 1 - this.field11441;
                     this.field11448 = -this.field11448;
                  } while(--this.field11445 != 0);
               }
            } else if (this.field11448 < 0) {
               if (this.field11441 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field11441) / var6;
               if (var7 < this.field11445) {
                  this.field11441 += var6 * var7;
                  this.field11445 -= var7;
                  return;
               }

               this.field11441 += this.field11445 * var6;
               this.field11445 = 0;
            } else {
               if (this.field11441 < var4) {
                  return;
               }

               int var8 = (this.field11441 - var3) / var6;
               if (var8 < this.field11445) {
                  this.field11441 -= var6 * var8;
                  this.field11445 -= var8;
                  return;
               }

               this.field11441 -= this.field11445 * var6;
               this.field11445 = 0;
            }
         }

         if (this.field11448 < 0) {
            if (this.field11441 < 0) {
               this.field11441 = -1;
               this.method5613();
               this.method3609(96);
               return;
            }
         } else if (this.field11441 >= var5) {
            this.field11441 = var5;
            this.method5613();
            this.method3609(103);
         }

      }
   }

   @OriginalMember(
      owner = "client!mo",
      name = "<init>",
      descriptor = "(Lin;III)V"
   )
   private class783(class98 arg0, int arg1, int arg2, int arg3) {
      super.field3476 = arg0;
      this.field11452 = arg0.field1278;
      this.field11442 = arg0.field1280;
      this.field11453 = arg0.field1279;
      this.field11448 = arg1;
      this.field11451 = arg2;
      this.field11454 = arg3;
      this.field11441 = 0;
      this.method5639();
   }
}
