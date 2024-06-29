import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class706 extends class216 {
   @OriginalMember(
      owner = "client!ti",
      name = "C",
      descriptor = "Lmi;"
   )
   private class20 field10155;
   @OriginalMember(
      owner = "client!ti",
      name = "B",
      descriptor = "[I"
   )
   private int[] field10156;
   @OriginalMember(
      owner = "client!ti",
      name = "z",
      descriptor = "[I"
   )
   private int[] field10151;
   @OriginalMember(
      owner = "client!ti",
      name = "y",
      descriptor = "[[B"
   )
   private byte[][] field10152;
   @OriginalMember(
      owner = "client!ti",
      name = "A",
      descriptor = "[I"
   )
   private int[] field10154;
   @OriginalMember(
      owner = "client!ti",
      name = "x",
      descriptor = "[I"
   )
   private int[] field10153;

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "([B[IIIIIIIIIIILaa;II)V"
   )
   private final void method5146(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class684 arg12, int arg13, int arg14) {
      class540 var16 = (class540)arg12;
      int[] var17 = var16.field7582;
      int[] var18 = var16.field7581;
      int var19 = arg9 - this.field10155.field298;
      int var20 = arg10;
      if (arg14 > arg10) {
         var20 = arg14;
         arg4 += (arg14 - arg10) * this.field10155.field299;
         arg3 += (arg14 - arg10) * arg11;
      }

      int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var17[var22 - arg14] + arg13;
         int var24 = var18[var22 - arg14];
         int var25 = arg5;
         if (var19 > var23) {
            int var26 = var19 - var23;
            if (var26 >= var24) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            var24 -= var26;
         } else {
            int var27 = var23 - var19;
            if (var27 >= arg5) {
               arg3 += arg5 + arg8;
               arg4 += arg5 + arg7;
               continue;
            }

            arg3 += var27;
            var25 = arg5 - var27;
            arg4 += var27;
         }

         int var28 = 0;
         if (var25 < var24) {
            var24 = var25;
         } else {
            var28 = var25 - var24;
         }

         for(int var29 = -var24; var29 < 0; ++var29) {
            int var30 = arg0[arg3++] & 255;
            if (var30 != 0) {
               int var31 = ((arg2 & 16711935) * var30 & -16711936) + ((arg2 & 65280) * var30 & 16711680) >> 8;
               int var32 = 256 - var30;
               int var33 = arg1[arg4];
               arg1[arg4++] = (((var33 & 16711935) * var32 & -16711936) + ((var33 & 65280) * var32 & 16711680) >> 8) + var31;
            } else {
               ++arg4;
            }
         }

         arg3 += arg8 + var28;
         arg4 += arg7 + var28;
      }

   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method1878(char arg0, int arg1, int arg2, int arg3, boolean arg4, class684 arg5, int arg6, int arg7) {
      if (arg5 == null) {
         this.method1875(arg0, arg1, arg2, arg3, arg4);
      } else {
         int var9 = this.field10153[arg0] + arg1;
         int var10 = this.field10154[arg0] + arg2;
         int var11 = this.field10156[arg0];
         int var12 = this.field10151[arg0];
         int var13 = this.field10155.field299;
         int var14 = var10 * var13 + var9;
         int var15 = var13 - var11;
         int var16 = 0;
         int var17 = 0;
         if (var10 < this.field10155.field280) {
            int var18 = this.field10155.field280 - var10;
            var12 -= var18;
            var10 = this.field10155.field280;
            var17 += var11 * var18;
            var14 += var13 * var18;
         }

         if (var10 + var12 > this.field10155.field281) {
            var12 -= var10 + var12 - this.field10155.field281;
         }

         if (var9 < this.field10155.field298) {
            int var19 = this.field10155.field298 - var9;
            var11 -= var19;
            var9 = this.field10155.field298;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
         }

         if (var9 + var11 > this.field10155.field306) {
            int var20 = var9 + var11 - this.field10155.field306;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
         }

         if (var11 > 0 && var12 > 0) {
            this.method5146(this.field10152[arg0], this.field10155.field312, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field10156[arg0], arg5, arg6, arg7);
         }
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "<init>",
      descriptor = "(Lmi;Lwm;[Liaa;[I[I)V"
   )
   public class706(class20 arg0, class440 arg1, class433[] arg2, int[] arg3, int[] arg4) {
      super(arg0, arg1);
      this.field10155 = arg0;
      this.field10155 = arg0;
      this.field10156 = arg3;
      this.field10151 = arg4;
      this.field10152 = new byte[arg2.length][];
      this.field10154 = new int[arg2.length];
      this.field10153 = new int[arg2.length];

      for(int var6 = 0; var6 < arg2.length; ++var6) {
         class433 var7 = arg2[var6];
         if (var7.field6356 != null) {
            this.field10152[var6] = var7.field6356;
         } else {
            byte[] var8 = var7.field6354;
            byte[] var9 = this.field10152[var6] = new byte[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               var9[var10] = (byte)(var8[var10] == 0 ? 0 : -1);
            }
         }

         this.field10154[var6] = var7.field6358;
         this.field10153[var6] = var7.field6355;
      }

   }

   @OriginalMember(
      owner = "client!ti",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method1875(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int var6 = this.field10153[arg0] + arg1;
      int var7 = this.field10154[arg0] + arg2;
      int var8 = this.field10156[arg0];
      int var9 = this.field10151[arg0];
      int var10 = this.field10155.field299;
      int var11 = var7 * var10 + var6;
      int var12 = var10 - var8;
      int var13 = 0;
      int var14 = 0;
      if (var7 < this.field10155.field280) {
         int var15 = this.field10155.field280 - var7;
         var9 -= var15;
         var7 = this.field10155.field280;
         var14 += var8 * var15;
         var11 += var10 * var15;
      }

      if (var7 + var9 > this.field10155.field281) {
         var9 -= var7 + var9 - this.field10155.field281;
      }

      if (var6 < this.field10155.field298) {
         int var16 = this.field10155.field298 - var6;
         var8 -= var16;
         var6 = this.field10155.field298;
         var14 += var16;
         var11 += var16;
         var13 += var16;
         var12 += var16;
      }

      if (var6 + var8 > this.field10155.field306) {
         int var17 = var6 + var8 - this.field10155.field306;
         var8 -= var17;
         var13 += var17;
         var12 += var17;
      }

      if (var8 > 0 && var9 > 0) {
         this.method5147(this.field10152[arg0], this.field10155.field312, arg3, var14, var11, var8, var9, var12, var13);
      }
   }

   @OriginalMember(
      owner = "client!ti",
      name = "a",
      descriptor = "([B[IIIIIIII)V"
   )
   private final void method5147(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      for(int var10 = -arg6; var10 < 0; ++var10) {
         for(int var11 = -arg5; var11 < 0; ++var11) {
            int var12 = arg0[arg3++] & 255;
            if (var12 != 0) {
               int var13 = ((arg2 & 16711935) * var12 & -16711936) + ((arg2 & 65280) * var12 & 16711680) >> 8;
               int var14 = 256 - var12;
               int var15 = arg1[arg4];
               arg1[arg4++] = (((var15 & 16711935) * var14 & -16711936) + ((var15 & 65280) * var14 & 16711680) >> 8) + var13;
            } else {
               ++arg4;
            }
         }

         arg4 += arg7;
         arg3 += arg8;
      }

   }
}
