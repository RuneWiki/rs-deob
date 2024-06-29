import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class143 extends class447 {
   @OriginalMember(
      owner = "client!vh",
      name = "y",
      descriptor = "Lpq;"
   )
   private class195 field1807;
   @OriginalMember(
      owner = "client!vh",
      name = "x",
      descriptor = "[I"
   )
   private int[] field1806;
   @OriginalMember(
      owner = "client!vh",
      name = "u",
      descriptor = "[I"
   )
   private int[] field1808;
   @OriginalMember(
      owner = "client!vh",
      name = "t",
      descriptor = "[[B"
   )
   private byte[][] field1805;
   @OriginalMember(
      owner = "client!vh",
      name = "v",
      descriptor = "[I"
   )
   private int[] field1803;
   @OriginalMember(
      owner = "client!vh",
      name = "w",
      descriptor = "[I"
   )
   private int[] field1804;

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "([B[IIIIIIII)V"
   )
   private final void method1171(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = arg2 >>> 24;
      int var11 = 255 - var10;

      for(int var12 = -arg6; var12 < 0; ++var12) {
         for(int var13 = -arg5; var13 < 0; ++var13) {
            if (arg0[arg3++] != 0) {
               int var14 = ((arg2 & 16711935) * var10 & -16711936) + ((arg2 & 65280) * var10 & 16711680) >> 8;
               int var15 = arg1[arg4];
               arg1[arg4++] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & 65280) * var11 & 16711680) >> 8) + var14;
            } else {
               ++arg4;
            }
         }

         arg4 += arg7;
         arg3 += arg8;
      }

   }

   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "([B[IIIIIIIIIIILaa;II)V"
   )
   private final void method1172(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class87 arg12, int arg13, int arg14) {
      class424 var16 = (class424)arg12;
      int[] var17 = var16.field5778;
      int[] var18 = var16.field5776;
      int var19 = arg9 - this.field1807.field2483;
      int var20 = arg10;
      if (arg14 > arg10) {
         var20 = arg14;
         arg4 += (arg14 - arg10) * this.field1807.field2486;
         arg3 += (arg14 - arg10) * arg11;
      }

      int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
      int var22 = arg2 >>> 24;
      int var23 = 255 - var22;

      for(int var24 = var20; var24 < var21; ++var24) {
         int var25 = var17[var24 - arg14] + arg13;
         int var26 = var18[var24 - arg14];
         int var27 = arg5;
         if (var19 > var25) {
            int var28 = var19 - var25;
            if (var28 >= var26) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            var26 -= var28;
         } else {
            int var29 = var25 - var19;
            if (var29 >= arg5) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            arg3 += var29;
            var27 = arg5 - var29;
            arg4 += var29;
         }

         int var30 = 0;
         if (var27 < var26) {
            var26 = var27;
         } else {
            var30 = var27 - var26;
         }

         for(int var31 = -var26; var31 < 0; ++var31) {
            if (arg0[arg3++] != 0) {
               int var32 = ((arg2 & 16711935) * var22 & -16711936) + ((arg2 & 65280) * var22 & 16711680) >> 8;
               int var33 = arg1[arg4];
               arg1[arg4++] = (((var33 & 16711935) * var23 & -16711936) + ((var33 & 65280) * var23 & 16711680) >> 8) + var32;
            } else {
               ++arg4;
            }
         }

         arg3 += arg8 + var30;
         arg4 += arg7 + var30;
      }

   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method294(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7) {
      if (arg5 == null) {
         this.method295(arg0, arg1, arg2, arg3, arg4);
      } else {
         int var9 = this.field1804[arg0] + arg1;
         int var10 = this.field1803[arg0] + arg2;
         int var11 = this.field1806[arg0];
         int var12 = this.field1808[arg0];
         int var13 = this.field1807.field2486;
         int var14 = var10 * var13 + var9;
         int var15 = var13 - var11;
         int var16 = 0;
         int var17 = 0;
         if (var10 < this.field1807.field2512) {
            int var18 = this.field1807.field2512 - var10;
            var12 -= var18;
            var10 = this.field1807.field2512;
            var17 += var11 * var18;
            var14 += var13 * var18;
         }

         if (var10 + var12 > this.field1807.field2495) {
            var12 -= var10 + var12 - this.field1807.field2495;
         }

         if (var9 < this.field1807.field2483) {
            int var19 = this.field1807.field2483 - var9;
            var11 -= var19;
            var9 = this.field1807.field2483;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
         }

         if (var9 + var11 > this.field1807.field2492) {
            int var20 = var9 + var11 - this.field1807.field2492;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
         }

         if (var11 > 0 && var12 > 0) {
            if ((arg3 & -16777216) == -16777216) {
               this.method1174(this.field1805[arg0], this.field1807.field2490, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field1806[arg0], arg5, arg6, arg7);
            } else {
               this.method1172(this.field1805[arg0], this.field1807.field2490, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field1806[arg0], arg5, arg6, arg7);
            }
         }
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "<init>",
      descriptor = "(Lpq;Lkv;[Lu;[I[I)V"
   )
   public class143(class195 arg0, class19 arg1, class65[] arg2, int[] arg3, int[] arg4) {
      super(arg0, arg1);
      this.field1807 = arg0;
      this.field1806 = arg3;
      this.field1808 = arg4;
      this.field1805 = new byte[arg2.length][];
      this.field1803 = new int[arg2.length];
      this.field1804 = new int[arg2.length];

      for(int var6 = 0; var6 < arg2.length; ++var6) {
         this.field1805[var6] = arg2[var6].field818;
         this.field1803[var6] = arg2[var6].field814;
         this.field1804[var6] = arg2[var6].field816;
      }

   }

   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "([B[IIIIIIII)V"
   )
   private final void method1173(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = -(arg5 >> 2);
      int var11 = -(arg5 & 3);

      for(int var12 = -arg6; var12 < 0; ++var12) {
         for(int var13 = var10; var13 < 0; ++var13) {
            if (arg0[arg3++] != 0) {
               arg1[arg4++] = arg2;
            } else {
               ++arg4;
            }

            if (arg0[arg3++] != 0) {
               arg1[arg4++] = arg2;
            } else {
               ++arg4;
            }

            if (arg0[arg3++] != 0) {
               arg1[arg4++] = arg2;
            } else {
               ++arg4;
            }

            if (arg0[arg3++] != 0) {
               arg1[arg4++] = arg2;
            } else {
               ++arg4;
            }
         }

         for(int var14 = var11; var14 < 0; ++var14) {
            if (arg0[arg3++] != 0) {
               arg1[arg4++] = arg2;
            } else {
               ++arg4;
            }
         }

         arg4 += arg7;
         arg3 += arg8;
      }

   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "([B[IIIIIIIIIIILaa;II)V"
   )
   private final void method1174(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class87 arg12, int arg13, int arg14) {
      class424 var16 = (class424)arg12;
      int[] var17 = var16.field5778;
      int[] var18 = var16.field5776;
      int var19 = arg10;
      if (arg14 > arg10) {
         var19 = arg14;
         arg4 += (arg14 - arg10) * this.field1807.field2486;
         arg3 += (arg14 - arg10) * arg11;
      }

      int var20 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;

      for(int var21 = var19; var21 < var20; ++var21) {
         int var22 = var17[var21 - arg14] + arg13;
         int var23 = var18[var21 - arg14];
         int var24 = arg5;
         if (arg9 > var22) {
            int var25 = arg9 - var22;
            if (var25 >= var23) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            var23 -= var25;
         } else {
            int var26 = var22 - arg9;
            if (var26 >= arg5) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            arg3 += var26;
            var24 = arg5 - var26;
            arg4 += var26;
         }

         int var27 = 0;
         if (var24 < var23) {
            var23 = var24;
         } else {
            var27 = var24 - var23;
         }

         for(int var28 = 0; var28 < var23; ++var28) {
            if (arg0[arg3++] != 0) {
               arg1[arg4++] = arg2;
            } else {
               ++arg4;
            }
         }

         arg3 += arg8 + var27;
         arg4 += arg7 + var27;
      }

   }

   @OriginalMember(
      owner = "client!vh",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int var6 = this.field1804[arg0] + arg1;
      int var7 = this.field1803[arg0] + arg2;
      int var8 = this.field1806[arg0];
      int var9 = this.field1808[arg0];
      int var10 = this.field1807.field2486;
      int var11 = var7 * var10 + var6;
      int var12 = var10 - var8;
      int var13 = 0;
      int var14 = 0;
      if (var7 < this.field1807.field2512) {
         int var15 = this.field1807.field2512 - var7;
         var9 -= var15;
         var7 = this.field1807.field2512;
         var14 += var8 * var15;
         var11 += var10 * var15;
      }

      if (var7 + var9 > this.field1807.field2495) {
         var9 -= var7 + var9 - this.field1807.field2495;
      }

      if (var6 < this.field1807.field2483) {
         int var16 = this.field1807.field2483 - var6;
         var8 -= var16;
         var6 = this.field1807.field2483;
         var14 += var16;
         var11 += var16;
         var13 += var16;
         var12 += var16;
      }

      if (var6 + var8 > this.field1807.field2492) {
         int var17 = var6 + var8 - this.field1807.field2492;
         var8 -= var17;
         var13 += var17;
         var12 += var17;
      }

      if (var8 > 0 && var9 > 0) {
         if ((arg3 & -16777216) == -16777216) {
            this.method1173(this.field1805[arg0], this.field1807.field2490, arg3, var14, var11, var8, var9, var12, var13);
         } else {
            if ((arg3 & -16777216) != 0) {
               this.method1171(this.field1805[arg0], this.field1807.field2490, arg3, var14, var11, var8, var9, var12, var13);
            }

         }
      }
   }
}
