import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class248 extends class593 {
   @OriginalMember(
      owner = "client!ec",
      name = "A",
      descriptor = "I"
   )
   private int field3420;
   @OriginalMember(
      owner = "client!ec",
      name = "B",
      descriptor = "I"
   )
   private int field3414;
   @OriginalMember(
      owner = "client!ec",
      name = "t",
      descriptor = "Z"
   )
   private boolean field3421;
   @OriginalMember(
      owner = "client!ec",
      name = "q",
      descriptor = "I"
   )
   private int field3425;
   @OriginalMember(
      owner = "client!ec",
      name = "v",
      descriptor = "I"
   )
   private int field3418;
   @OriginalMember(
      owner = "client!ec",
      name = "C",
      descriptor = "I"
   )
   private int field3422;
   @OriginalMember(
      owner = "client!ec",
      name = "z",
      descriptor = "I"
   )
   private int field3411;
   @OriginalMember(
      owner = "client!ec",
      name = "y",
      descriptor = "I"
   )
   private int field3412;
   @OriginalMember(
      owner = "client!ec",
      name = "u",
      descriptor = "I"
   )
   private int field3413;
   @OriginalMember(
      owner = "client!ec",
      name = "w",
      descriptor = "I"
   )
   private int field3415;
   @OriginalMember(
      owner = "client!ec",
      name = "x",
      descriptor = "I"
   )
   private int field3416;
   @OriginalMember(
      owner = "client!ec",
      name = "r",
      descriptor = "I"
   )
   private int field3417;
   @OriginalMember(
      owner = "client!ec",
      name = "s",
      descriptor = "I"
   )
   private int field3419;
   @OriginalMember(
      owner = "client!ec",
      name = "E",
      descriptor = "I"
   )
   private int field3423;
   @OriginalMember(
      owner = "client!ec",
      name = "D",
      descriptor = "I"
   )
   private int field3424;

   @OriginalMember(
      owner = "client!ec",
      name = "j",
      descriptor = "()V",
      line = 3
   )
   private final void method1878() {
      if (this.field3416 != 0) {
         if (this.field3418 == Integer.MIN_VALUE) {
            this.field3418 = 0;
         }

         this.field3416 = 0;
         this.method1912();
      }

   }

   @OriginalMember(
      owner = "client!ec",
      name = "j",
      descriptor = "(I)V",
      line = 14
   )
   private final synchronized void method1879(int arg0) {
      this.method1906(arg0, this.method1880());
   }

   @OriginalMember(
      owner = "client!ec",
      name = "e",
      descriptor = "()I",
      line = 17
   )
   public final synchronized int method1880() {
      return this.field3422 < 0 ? -1 : this.field3422;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(II)I",
      line = 20
   )
   private static final int method1881(int arg0, int arg1) {
      return arg1 < 0 ? arg0 : (int)((double)arg0 * Math.sqrt((double)(16384 - arg1) * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(II[B[IIIIIIIIIILec;II)I",
      line = 23
   )
   private static final int method1882(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class248 arg13, int arg14, int arg15) {
      arg13.field3412 -= arg13.field3413 * arg5;
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
      arg13.field3412 += arg13.field3413 * var22;
      arg13.field3424 = arg6;
      arg13.field3415 = arg7;
      arg13.field3411 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "g",
      descriptor = "()Z",
      line = 64
   )
   public final boolean method1883() {
      return this.field3416 != 0;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "([B[IIIIIIIILec;)I",
      line = 68
   )
   private static final int method1884(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class248 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
         var14 = arg7;
      }

      arg9.field3424 += (var14 - arg3) * arg9.field3419;
      arg9.field3415 += (var14 - arg3) * arg9.field3417;
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

      arg9.field3412 = var12 >> 2;
      arg9.field3411 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "()Lkj;",
      line = 102
   )
   public final class593 method1603() {
      return null;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "([B[IIIIIIIILec;)I",
      line = 105
   )
   private static final int method1885(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class248 arg9) {
      int var10 = arg2 >> 8;
      int var11 = arg8 >> 8;
      int var12 = arg4 << 2;
      int var13 = arg5 << 2;
      int var14;
      if ((var14 = arg3 + var11 - var10) > arg7) {
         var14 = arg7;
      }

      arg9.field3424 += (var14 - arg3) * arg9.field3419;
      arg9.field3415 += (var14 - arg3) * arg9.field3417;
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

      arg9.field3412 = var12 >> 2;
      arg9.field3411 = var10 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(Lvea;III)Lec;",
      line = 140
   )
   public static final class248 method1886(class289 arg0, int arg1, int arg2, int arg3) {
      return arg0.field4006 != null && arg0.field4006.length != 0 ? new class248(arg0, arg1, arg2, arg3) : null;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "([B[IIIIIIILec;)I",
      line = 148
   )
   private static final int method1887(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class248 arg8) {
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

      arg8.field3411 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "([III)V",
      line = 173
   )
   public final synchronized void method1607(int[] arg0, int arg1, int arg2) {
      if (this.field3418 == 0 && this.field3416 == 0) {
         this.method1606(arg2);
      } else {
         class289 var4 = (class289)super.field8721;
         int var5 = this.field3420 << 8;
         int var6 = this.field3414 << 8;
         int var7 = var4.field4006.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field3423 = 0;
         }

         int var9 = arg1;
         int var10 = arg1 + arg2;
         if (this.field3411 < 0) {
            if (this.field3425 <= 0) {
               this.method1878();
               this.method3165(116);
               return;
            }

            this.field3411 = 0;
         }

         if (this.field3411 >= var7) {
            if (this.field3425 >= 0) {
               this.method1878();
               this.method3165(113);
               return;
            }

            this.field3411 = var7 - 1;
         }

         if (this.field3423 < 0) {
            if (this.field3421) {
               if (this.field3425 < 0) {
                  var9 = this.method1903(arg0, arg1, var5, var10, var4.field4006[this.field3420]);
                  if (this.field3411 >= var5) {
                     return;
                  }

                  this.field3411 = var5 + var5 - 1 - this.field3411;
                  this.field3425 = -this.field3425;
               }

               while(true) {
                  int var11 = this.method1900(arg0, var9, var6, var10, var4.field4006[this.field3414 - 1]);
                  if (this.field3411 < var6) {
                     return;
                  }

                  this.field3411 = var6 + var6 - 1 - this.field3411;
                  this.field3425 = -this.field3425;
                  var9 = this.method1903(arg0, var11, var5, var10, var4.field4006[this.field3420]);
                  if (this.field3411 >= var5) {
                     return;
                  }

                  this.field3411 = var5 + var5 - 1 - this.field3411;
                  this.field3425 = -this.field3425;
               }
            } else if (this.field3425 < 0) {
               while(true) {
                  var9 = this.method1903(arg0, var9, var5, var10, var4.field4006[this.field3414 - 1]);
                  if (this.field3411 >= var5) {
                     return;
                  }

                  this.field3411 = var6 - 1 - (var6 - 1 - this.field3411) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method1900(arg0, var9, var6, var10, var4.field4006[this.field3420]);
                  if (this.field3411 < var6) {
                     return;
                  }

                  this.field3411 = (this.field3411 - var5) % var8 + var5;
               }
            }
         } else {
            if (this.field3423 > 0) {
               if (this.field3421) {
                  label130: {
                     if (this.field3425 < 0) {
                        var9 = this.method1903(arg0, arg1, var5, var10, var4.field4006[this.field3420]);
                        if (this.field3411 >= var5) {
                           return;
                        }

                        this.field3411 = var5 + var5 - 1 - this.field3411;
                        this.field3425 = -this.field3425;
                        if (--this.field3423 == 0) {
                           break label130;
                        }
                     }

                     do {
                        var9 = this.method1900(arg0, var9, var6, var10, var4.field4006[this.field3414 - 1]);
                        if (this.field3411 < var6) {
                           return;
                        }

                        this.field3411 = var6 + var6 - 1 - this.field3411;
                        this.field3425 = -this.field3425;
                        if (--this.field3423 == 0) {
                           break;
                        }

                        var9 = this.method1903(arg0, var9, var5, var10, var4.field4006[this.field3420]);
                        if (this.field3411 >= var5) {
                           return;
                        }

                        this.field3411 = var5 + var5 - 1 - this.field3411;
                        this.field3425 = -this.field3425;
                     } while(--this.field3423 != 0);
                  }
               } else if (this.field3425 < 0) {
                  while(true) {
                     var9 = this.method1903(arg0, var9, var5, var10, var4.field4006[this.field3414 - 1]);
                     if (this.field3411 >= var5) {
                        return;
                     }

                     int var12 = (var6 - 1 - this.field3411) / var8;
                     if (var12 >= this.field3423) {
                        this.field3411 += this.field3423 * var8;
                        this.field3423 = 0;
                        break;
                     }

                     this.field3411 += var8 * var12;
                     this.field3423 -= var12;
                  }
               } else {
                  while(true) {
                     var9 = this.method1900(arg0, var9, var6, var10, var4.field4006[this.field3420]);
                     if (this.field3411 < var6) {
                        return;
                     }

                     int var13 = (this.field3411 - var5) / var8;
                     if (var13 >= this.field3423) {
                        this.field3411 -= this.field3423 * var8;
                        this.field3423 = 0;
                        break;
                     }

                     this.field3411 -= var8 * var13;
                     this.field3423 -= var13;
                  }
               }
            }

            if (this.field3425 < 0) {
               this.method1903(arg0, var9, 0, var10, 0);
               if (this.field3411 < 0) {
                  this.field3411 = -1;
                  this.method1878();
                  this.method3165(119);
                  return;
               }
            } else {
               this.method1900(arg0, var9, var7, var10, 0);
               if (this.field3411 >= var7) {
                  this.field3411 = var7;
                  this.method1878();
                  this.method3165(124);
               }
            }

         }
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "(II)I",
      line = 411
   )
   private static final int method1888(int arg0, int arg1) {
      return arg1 < 0 ? -arg0 : (int)((double)arg0 * Math.sqrt((double)arg1 * 1.220703125E-4D) + 0.5D);
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(I[B[IIIIIIIIIILec;)I",
      line = 415
   )
   private static final int method1889(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class248 arg12) {
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

      arg12.field3412 += (var19 - arg4) * arg12.field3413;
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

      arg12.field3424 = var15 >> 2;
      arg12.field3415 = var16 >> 2;
      arg12.field3411 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "i",
      descriptor = "()Z",
      line = 468
   )
   public final boolean method1890() {
      return this.field3411 < 0 || this.field3411 >= ((class289)super.field8721).field4006.length << 8;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "d",
      descriptor = "()I",
      line = 472
   )
   public final int method1891() {
      int var1 = this.field3412 * 3 >> 6;
      int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
      if (this.field3423 == 0) {
         var2 -= this.field3411 * var2 / (((class289)super.field8721).field4006.length << 8);
      } else if (this.field3423 >= 0) {
         var2 -= this.field3420 * var2 / ((class289)super.field8721).field4006.length;
      }

      return var2 > 255 ? 255 : var2;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(I[B[IIIIIIIILec;)I",
      line = 489
   )
   private static final int method1892(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10) {
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

      arg10.field3411 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(II[B[IIIIIIIILec;II)I",
      line = 528
   )
   private static final int method1893(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
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

      arg11.field3411 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(I[B[IIIIIIIIIILec;)I",
      line = 560
   )
   private static final int method1894(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class248 arg12) {
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

      arg12.field3412 += (var19 - arg4) * arg12.field3413;
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

      arg12.field3424 = var15 >> 2;
      arg12.field3415 = var16 >> 2;
      arg12.field3411 = var13 << 8;
      return var20 >> 1;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "h",
      descriptor = "()Z",
      line = 615
   )
   private final boolean method1895() {
      int var1 = this.field3418;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var2 = 0;
         var3 = 0;
         var1 = 0;
      } else {
         var3 = method1881(var1, this.field3422);
         var2 = method1888(var1, this.field3422);
      }

      if (this.field3412 == var1 && this.field3424 == var3 && this.field3415 == var2) {
         if (this.field3418 == Integer.MIN_VALUE) {
            this.field3418 = 0;
            this.field3412 = this.field3424 = this.field3415 = 0;
            this.method3165(111);
            return true;
         } else {
            this.method1912();
            return false;
         }
      } else {
         if (this.field3412 < var1) {
            this.field3413 = 1;
            this.field3416 = var1 - this.field3412;
         } else if (this.field3412 > var1) {
            this.field3413 = -1;
            this.field3416 = this.field3412 - var1;
         } else {
            this.field3413 = 0;
         }

         if (this.field3424 < var3) {
            this.field3419 = 1;
            if (this.field3416 == 0 || this.field3416 > var3 - this.field3424) {
               this.field3416 = var3 - this.field3424;
            }
         } else if (this.field3424 > var3) {
            this.field3419 = -1;
            if (this.field3416 == 0 || this.field3416 > this.field3424 - var3) {
               this.field3416 = this.field3424 - var3;
            }
         } else {
            this.field3419 = 0;
         }

         if (this.field3415 < var2) {
            this.field3417 = 1;
            if (this.field3416 == 0 || this.field3416 > var2 - this.field3415) {
               this.field3416 = var2 - this.field3415;
            }
         } else if (this.field3415 > var2) {
            this.field3417 = -1;
            if (this.field3416 == 0 || this.field3416 > this.field3415 - var2) {
               this.field3416 = this.field3415 - var2;
            }
         } else {
            this.field3417 = 0;
         }

         return false;
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(II[B[IIIIIIIIIILec;II)I",
      line = 700
   )
   private static final int method1896(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class248 arg13, int arg14, int arg15) {
      arg13.field3412 -= arg13.field3413 * arg5;
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
      arg13.field3412 += arg13.field3413 * var22;
      arg13.field3424 = arg6;
      arg13.field3415 = arg7;
      arg13.field3411 = arg4;
      return var22;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(Z)V",
      line = 742
   )
   public final synchronized void method1897(boolean arg0) {
      this.field3425 = (this.field3425 >>> 31) + (this.field3425 ^ this.field3425 >> 31);
      if (arg0) {
         this.field3425 = -this.field3425;
      }

   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "()I",
      line = 751
   )
   public final int method1602() {
      return this.field3418 == 0 && this.field3416 == 0 ? 0 : 1;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(I)V",
      line = 758
   )
   public final synchronized void method1898(int arg0) {
      this.field3423 = arg0;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(I[B[IIIIIIIILec;)I",
      line = 762
   )
   private static final int method1899(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10) {
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

      arg10.field3411 = var11 << 8;
      return var16 >> 1;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "([IIIII)I",
      line = 800
   )
   private final int method1900(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field3416 <= 0) {
            if (this.field3425 == 256 && (this.field3411 & 255) == 0) {
               if (class65.field790) {
                  return method1899(0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, 0, arg3, arg2, this);
               }

               return method1907(((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, 0, arg3, arg2, this);
            }

            if (class65.field790) {
               return method1904(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, 0, arg3, arg2, this, this.field3425, arg4);
            }

            return method1909(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, 0, arg3, arg2, this, this.field3425, arg4);
         }

         int var6 = this.field3416 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field3416 += arg1;
         if (this.field3425 == 256 && (this.field3411 & 255) == 0) {
            if (class65.field790) {
               arg1 = method1894(0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, this.field3419, this.field3417, 0, var6, arg2, this);
            } else {
               arg1 = method1885(((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, this.field3413, 0, var6, arg2, this);
            }
         } else if (class65.field790) {
            arg1 = method1896(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, this.field3419, this.field3417, 0, var6, arg2, this, this.field3425, arg4);
         } else {
            arg1 = method1902(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, this.field3413, 0, var6, arg2, this, this.field3425, arg4);
         }

         this.field3416 -= arg1;
         if (this.field3416 != 0) {
            return arg1;
         }
      } while(!this.method1895());

      return arg3;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "k",
      descriptor = "()I",
      line = 855
   )
   public final synchronized int method1901() {
      return this.field3418 == Integer.MIN_VALUE ? 0 : this.field3418;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "(II[B[IIIIIIIILec;II)I",
      line = 858
   )
   private static final int method1902(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
      arg11.field3424 -= arg11.field3419 * arg5;
      arg11.field3415 -= arg11.field3417 * arg5;
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

      arg11.field3424 += arg11.field3419 * arg5;
      arg11.field3415 += arg11.field3417 * arg5;
      arg11.field3412 = arg6;
      arg11.field3411 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "()Lkj;",
      line = 891
   )
   public final class593 method1605() {
      return null;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "([IIIII)I",
      line = 896
   )
   private final int method1903(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
      do {
         if (this.field3416 <= 0) {
            if (this.field3425 == -256 && (this.field3411 & 255) == 0) {
               if (class65.field790) {
                  return method1892(0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, 0, arg3, arg2, this);
               }

               return method1887(((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, 0, arg3, arg2, this);
            }

            if (class65.field790) {
               return method1893(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, 0, arg3, arg2, this, this.field3425, arg4);
            }

            return method1908(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, 0, arg3, arg2, this, this.field3425, arg4);
         }

         int var6 = this.field3416 + arg1;
         if (var6 > arg3) {
            var6 = arg3;
         }

         this.field3416 += arg1;
         if (this.field3425 == -256 && (this.field3411 & 255) == 0) {
            if (class65.field790) {
               arg1 = method1889(0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, this.field3419, this.field3417, 0, var6, arg2, this);
            } else {
               arg1 = method1884(((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, this.field3413, 0, var6, arg2, this);
            }
         } else if (class65.field790) {
            arg1 = method1882(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3424, this.field3415, this.field3419, this.field3417, 0, var6, arg2, this, this.field3425, arg4);
         } else {
            arg1 = method1914(0, 0, ((class289)super.field8721).field4006, arg0, this.field3411, arg1, this.field3412, this.field3413, 0, var6, arg2, this, this.field3425, arg4);
         }

         this.field3416 -= arg1;
         if (this.field3416 != 0) {
            return arg1;
         }
      } while(!this.method1895());

      return arg3;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(II[B[IIIIIIIILec;II)I",
      line = 952
   )
   private static final int method1904(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
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

      arg11.field3411 = arg4;
      return var15 >> 1;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "i",
      descriptor = "(I)V",
      line = 986
   )
   public final synchronized void method1905(int arg0) {
      if (arg0 == 0) {
         this.method1879(0);
         this.method3165(117);
      } else if (this.field3424 == 0 && this.field3415 == 0) {
         this.field3416 = 0;
         this.field3418 = 0;
         this.field3412 = 0;
         this.method3165(109);
      } else {
         int var2 = -this.field3412;
         if (this.field3412 > var2) {
            var2 = this.field3412;
         }

         if (-this.field3424 > var2) {
            var2 = -this.field3424;
         }

         if (this.field3424 > var2) {
            var2 = this.field3424;
         }

         if (-this.field3415 > var2) {
            var2 = -this.field3415;
         }

         if (this.field3415 > var2) {
            var2 = this.field3415;
         }

         if (arg0 > var2) {
            arg0 = var2;
         }

         this.field3416 = arg0;
         this.field3418 = Integer.MIN_VALUE;
         this.field3413 = -this.field3412 / arg0;
         this.field3419 = -this.field3424 / arg0;
         this.field3417 = -this.field3415 / arg0;
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "d",
      descriptor = "(II)V",
      line = 1031
   )
   private final synchronized void method1906(int arg0, int arg1) {
      this.field3418 = arg0;
      this.field3422 = arg1;
      this.field3416 = 0;
      this.method1912();
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "([B[IIIIIIILec;)I",
      line = 1037
   )
   private static final int method1907(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class248 arg8) {
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

      arg8.field3411 = var9 << 8;
      return arg3;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(II[B[IIIIIIILec;II)I",
      line = 1062
   )
   private static final int method1908(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10, int arg11, int arg12) {
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

      arg10.field3411 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(II[B[IIIIIIILec;II)I",
      line = 1088
   )
   private static final int method1909(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class248 arg10, int arg11, int arg12) {
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

      arg10.field3411 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(I)V",
      line = 1118
   )
   public final synchronized void method1606(int arg0) {
      if (this.field3416 > 0) {
         if (arg0 >= this.field3416) {
            if (this.field3418 == Integer.MIN_VALUE) {
               this.field3418 = 0;
               this.field3412 = this.field3424 = this.field3415 = 0;
               this.method3165(122);
               arg0 = this.field3416;
            }

            this.field3416 = 0;
            this.method1912();
         } else {
            this.field3412 += this.field3413 * arg0;
            this.field3424 += this.field3419 * arg0;
            this.field3415 += this.field3417 * arg0;
            this.field3416 -= arg0;
         }
      }

      class289 var2 = (class289)super.field8721;
      int var3 = this.field3420 << 8;
      int var4 = this.field3414 << 8;
      int var5 = var2.field4006.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field3423 = 0;
      }

      if (this.field3411 < 0) {
         if (this.field3425 <= 0) {
            this.method1878();
            this.method3165(115);
            return;
         }

         this.field3411 = 0;
      }

      if (this.field3411 >= var5) {
         if (this.field3425 >= 0) {
            this.method1878();
            this.method3165(118);
            return;
         }

         this.field3411 = var5 - 1;
      }

      this.field3411 += this.field3425 * arg0;
      if (this.field3423 < 0) {
         if (!this.field3421) {
            if (this.field3425 < 0) {
               if (this.field3411 < var3) {
                  this.field3411 = var4 - 1 - (var4 - 1 - this.field3411) % var6;
               }
            } else if (this.field3411 >= var4) {
               this.field3411 = (this.field3411 - var3) % var6 + var3;
            }
         } else {
            if (this.field3425 < 0) {
               if (this.field3411 >= var3) {
                  return;
               }

               this.field3411 = var3 + var3 - 1 - this.field3411;
               this.field3425 = -this.field3425;
            }

            while(this.field3411 >= var4) {
               this.field3411 = var4 + var4 - 1 - this.field3411;
               this.field3425 = -this.field3425;
               if (this.field3411 >= var3) {
                  return;
               }

               this.field3411 = var3 + var3 - 1 - this.field3411;
               this.field3425 = -this.field3425;
            }

         }
      } else {
         if (this.field3423 > 0) {
            if (this.field3421) {
               label125: {
                  if (this.field3425 < 0) {
                     if (this.field3411 >= var3) {
                        return;
                     }

                     this.field3411 = var3 + var3 - 1 - this.field3411;
                     this.field3425 = -this.field3425;
                     if (--this.field3423 == 0) {
                        break label125;
                     }
                  }

                  do {
                     if (this.field3411 < var4) {
                        return;
                     }

                     this.field3411 = var4 + var4 - 1 - this.field3411;
                     this.field3425 = -this.field3425;
                     if (--this.field3423 == 0) {
                        break;
                     }

                     if (this.field3411 >= var3) {
                        return;
                     }

                     this.field3411 = var3 + var3 - 1 - this.field3411;
                     this.field3425 = -this.field3425;
                  } while(--this.field3423 != 0);
               }
            } else if (this.field3425 < 0) {
               if (this.field3411 >= var3) {
                  return;
               }

               int var7 = (var4 - 1 - this.field3411) / var6;
               if (var7 < this.field3423) {
                  this.field3411 += var6 * var7;
                  this.field3423 -= var7;
                  return;
               }

               this.field3411 += this.field3423 * var6;
               this.field3423 = 0;
            } else {
               if (this.field3411 < var4) {
                  return;
               }

               int var8 = (this.field3411 - var3) / var6;
               if (var8 < this.field3423) {
                  this.field3411 -= var6 * var8;
                  this.field3423 -= var8;
                  return;
               }

               this.field3411 -= this.field3423 * var6;
               this.field3423 = 0;
            }
         }

         if (this.field3425 < 0) {
            if (this.field3411 < 0) {
               this.field3411 = -1;
               this.method1878();
               this.method3165(114);
               return;
            }
         } else if (this.field3411 >= var5) {
            this.field3411 = var5;
            this.method1878();
            this.method3165(126);
         }

      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "d",
      descriptor = "(I)V",
      line = 1339
   )
   public final synchronized void method1910(int arg0) {
      int var2 = ((class289)super.field8721).field4006.length << 8;
      if (arg0 < -1) {
         arg0 = -1;
      }

      if (arg0 > var2) {
         arg0 = var2;
      }

      this.field3411 = arg0;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "a",
      descriptor = "(III)V",
      line = 1349
   )
   public final synchronized void method1911(int arg0, int arg1, int arg2) {
      if (arg0 == 0) {
         this.method1906(arg1, arg2);
      } else {
         int var4 = method1881(arg1, arg2);
         int var5 = method1888(arg1, arg2);
         if (this.field3424 == var4 && this.field3415 == var5) {
            this.field3416 = 0;
         } else {
            int var6 = arg1 - this.field3412;
            if (this.field3412 - arg1 > var6) {
               var6 = this.field3412 - arg1;
            }

            if (var4 - this.field3424 > var6) {
               var6 = var4 - this.field3424;
            }

            if (this.field3424 - var4 > var6) {
               var6 = this.field3424 - var4;
            }

            if (var5 - this.field3415 > var6) {
               var6 = var5 - this.field3415;
            }

            if (this.field3415 - var5 > var6) {
               var6 = this.field3415 - var5;
            }

            if (arg0 > var6) {
               arg0 = var6;
            }

            this.field3416 = arg0;
            this.field3418 = arg1;
            this.field3422 = arg2;
            this.field3413 = (arg1 - this.field3412) / arg0;
            this.field3419 = (var4 - this.field3424) / arg0;
            this.field3417 = (var5 - this.field3415) / arg0;
         }
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "f",
      descriptor = "()V",
      line = 1395
   )
   private final void method1912() {
      this.field3412 = this.field3418;
      this.field3424 = method1881(this.field3418, this.field3422);
      this.field3415 = method1888(this.field3418, this.field3422);
   }

   @OriginalMember(
      owner = "client!ec",
      name = "b",
      descriptor = "(II)V",
      line = 1403
   )
   public final synchronized void method1913(int arg0, int arg1) {
      this.method1911(arg0, arg1, this.method1880());
   }

   @OriginalMember(
      owner = "client!ec",
      name = "d",
      descriptor = "(II[B[IIIIIIIILec;II)I",
      line = 1406
   )
   private static final int method1914(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class248 arg11, int arg12, int arg13) {
      arg11.field3424 -= arg11.field3419 * arg5;
      arg11.field3415 -= arg11.field3417 * arg5;
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

      arg11.field3424 += arg11.field3419 * arg5;
      arg11.field3415 += arg11.field3417 * arg5;
      arg11.field3412 = arg6;
      arg11.field3411 = arg4;
      return arg5;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "c",
      descriptor = "(I)V",
      line = 1439
   )
   public final synchronized void method1915(int arg0) {
      if (this.field3425 < 0) {
         this.field3425 = -arg0;
      } else {
         this.field3425 = arg0;
      }
   }

   @OriginalMember(
      owner = "client!ec",
      name = "g",
      descriptor = "(I)V",
      line = 1446
   )
   public final synchronized void method1916(int arg0) {
      this.method1906(arg0 << 6, this.method1880());
   }

   @OriginalMember(
      owner = "client!ec",
      name = "l",
      descriptor = "()I",
      line = 1450
   )
   public final synchronized int method1917() {
      return this.field3425 < 0 ? -this.field3425 : this.field3425;
   }

   @OriginalMember(
      owner = "client!ec",
      name = "<init>",
      descriptor = "(Lvea;III)V",
      line = 1453
   )
   private class248(class289 arg0, int arg1, int arg2, int arg3) {
      super.field8721 = arg0;
      this.field3420 = arg0.field4010;
      this.field3414 = arg0.field4009;
      this.field3421 = arg0.field4008;
      this.field3425 = arg1;
      this.field3418 = arg2;
      this.field3422 = arg3;
      this.field3411 = 0;
      this.method1912();
   }

   @OriginalMember(
      owner = "client!ec",
      name = "h",
      descriptor = "(I)V",
      line = 1465
   )
   public final synchronized void method1918(int arg0) {
      this.method1906(this.method1901(), arg0);
   }
}
