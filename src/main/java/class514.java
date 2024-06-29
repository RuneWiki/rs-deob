import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class514 extends class447 {
   @OriginalMember(
      owner = "client!gga",
      name = "x",
      descriptor = "Lpq;"
   )
   private class195 field7165;
   @OriginalMember(
      owner = "client!gga",
      name = "w",
      descriptor = "[I"
   )
   private int[] field7167;
   @OriginalMember(
      owner = "client!gga",
      name = "t",
      descriptor = "[I"
   )
   private int[] field7169;
   @OriginalMember(
      owner = "client!gga",
      name = "v",
      descriptor = "[[B"
   )
   private byte[][] field7168;
   @OriginalMember(
      owner = "client!gga",
      name = "y",
      descriptor = "[I"
   )
   private int[] field7164;
   @OriginalMember(
      owner = "client!gga",
      name = "u",
      descriptor = "[I"
   )
   private int[] field7166;

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method294(char arg0, int arg1, int arg2, int arg3, boolean arg4, class87 arg5, int arg6, int arg7) {
      if (arg5 == null) {
         this.method295(arg0, arg1, arg2, arg3, arg4);
      } else {
         int var9 = this.field7166[arg0] + arg1;
         int var10 = this.field7164[arg0] + arg2;
         int var11 = this.field7167[arg0];
         int var12 = this.field7169[arg0];
         int var13 = this.field7165.field2486;
         int var14 = var10 * var13 + var9;
         int var15 = var13 - var11;
         int var16 = 0;
         int var17 = 0;
         if (var10 < this.field7165.field2512) {
            int var18 = this.field7165.field2512 - var10;
            var12 -= var18;
            var10 = this.field7165.field2512;
            var17 += var11 * var18;
            var14 += var13 * var18;
         }

         if (var10 + var12 > this.field7165.field2495) {
            var12 -= var10 + var12 - this.field7165.field2495;
         }

         if (var9 < this.field7165.field2483) {
            int var19 = this.field7165.field2483 - var9;
            var11 -= var19;
            var9 = this.field7165.field2483;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
         }

         if (var9 + var11 > this.field7165.field2492) {
            int var20 = var9 + var11 - this.field7165.field2492;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
         }

         if (var11 > 0 && var12 > 0) {
            this.method3875(this.field7168[arg0], this.field7165.field2490, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field7167[arg0], arg5, arg6, arg7);
         }
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "<init>",
      descriptor = "(Lpq;Lkv;[Lu;[I[I)V"
   )
   public class514(class195 arg0, class19 arg1, class65[] arg2, int[] arg3, int[] arg4) {
      super(arg0, arg1);
      this.field7165 = arg0;
      this.field7165 = arg0;
      this.field7167 = arg3;
      this.field7169 = arg4;
      this.field7168 = new byte[arg2.length][];
      this.field7164 = new int[arg2.length];
      this.field7166 = new int[arg2.length];

      for(int var6 = 0; var6 < arg2.length; ++var6) {
         class65 var7 = arg2[var6];
         if (var7.field815 != null) {
            this.field7168[var6] = var7.field815;
         } else {
            byte[] var8 = var7.field818;
            byte[] var9 = this.field7168[var6] = new byte[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               var9[var10] = (byte)(var8[var10] == 0 ? 0 : -1);
            }
         }

         this.field7164[var6] = var7.field814;
         this.field7166[var6] = var7.field816;
      }

   }

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "([B[IIIIIIIIIIILaa;II)V"
   )
   private final void method3875(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class87 arg12, int arg13, int arg14) {
      class424 var16 = (class424)arg12;
      int[] var17 = var16.field5778;
      int[] var18 = var16.field5776;
      int var19 = arg9 - this.field7165.field2483;
      int var20 = arg10;
      if (arg14 > arg10) {
         var20 = arg14;
         arg4 += (arg14 - arg10) * this.field7165.field2486;
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
      owner = "client!gga",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method295(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int var6 = this.field7166[arg0] + arg1;
      int var7 = this.field7164[arg0] + arg2;
      int var8 = this.field7167[arg0];
      int var9 = this.field7169[arg0];
      int var10 = this.field7165.field2486;
      int var11 = var7 * var10 + var6;
      int var12 = var10 - var8;
      int var13 = 0;
      int var14 = 0;
      if (var7 < this.field7165.field2512) {
         int var15 = this.field7165.field2512 - var7;
         var9 -= var15;
         var7 = this.field7165.field2512;
         var14 += var8 * var15;
         var11 += var10 * var15;
      }

      if (var7 + var9 > this.field7165.field2495) {
         var9 -= var7 + var9 - this.field7165.field2495;
      }

      if (var6 < this.field7165.field2483) {
         int var16 = this.field7165.field2483 - var6;
         var8 -= var16;
         var6 = this.field7165.field2483;
         var14 += var16;
         var11 += var16;
         var13 += var16;
         var12 += var16;
      }

      if (var6 + var8 > this.field7165.field2492) {
         int var17 = var6 + var8 - this.field7165.field2492;
         var8 -= var17;
         var13 += var17;
         var12 += var17;
      }

      if (var8 > 0 && var9 > 0) {
         this.method3876(this.field7168[arg0], this.field7165.field2490, arg3, var14, var11, var8, var9, var12, var13);
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "([B[IIIIIIII)V"
   )
   private final void method3876(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
