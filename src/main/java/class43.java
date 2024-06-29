import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 extends class67 {
   @OriginalMember(
      owner = "client!pja",
      name = "D",
      descriptor = "Lbda;"
   )
   private class531 field463;
   @OriginalMember(
      owner = "client!pja",
      name = "E",
      descriptor = "[I"
   )
   private int[] field462;
   @OriginalMember(
      owner = "client!pja",
      name = "A",
      descriptor = "[I"
   )
   private int[] field461;
   @OriginalMember(
      owner = "client!pja",
      name = "B",
      descriptor = "[[B"
   )
   private byte[][] field464;
   @OriginalMember(
      owner = "client!pja",
      name = "F",
      descriptor = "[I"
   )
   private int[] field465;
   @OriginalMember(
      owner = "client!pja",
      name = "C",
      descriptor = "[I"
   )
   private int[] field460;

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "([B[IIIIIIII)V",
      line = 5
   )
   private final void method293(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

   @OriginalMember(
      owner = "client!pja",
      name = "<init>",
      descriptor = "(Lbda;Lpg;[Lnia;[I[I)V",
      line = 41
   )
   public class43(class531 arg0, class763 arg1, class671[] arg2, int[] arg3, int[] arg4) {
      super(arg0, arg1);
      this.field463 = arg0;
      this.field463 = arg0;
      this.field462 = arg3;
      this.field461 = arg4;
      this.field464 = new byte[arg2.length][];
      this.field465 = new int[arg2.length];
      this.field460 = new int[arg2.length];

      for(int var6 = 0; var6 < arg2.length; ++var6) {
         class671 var7 = arg2[var6];
         if (var7.field10095 != null) {
            this.field464[var6] = var7.field10095;
         } else {
            byte[] var8 = var7.field10099;
            byte[] var9 = this.field464[var6] = new byte[var8.length];

            for(int var10 = 0; var10 < var8.length; ++var10) {
               var9[var10] = (byte)(var8[var10] == 0 ? 0 : -1);
            }
         }

         this.field465[var6] = var7.field10102;
         this.field460[var6] = var7.field10103;
      }

   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "([B[IIIIIIIIIIILaa;II)V",
      line = 84
   )
   private final void method294(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class512 arg12, int arg13, int arg14) {
      class645 var16 = (class645)arg12;
      int[] var17 = var16.field9384;
      int[] var18 = var16.field9387;
      int var19 = arg9 - this.field463.field7745;
      int var20 = arg10;
      if (arg14 > arg10) {
         var20 = arg14;
         arg4 += (arg14 - arg10) * this.field463.field7758;
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
      owner = "client!pja",
      name = "a",
      descriptor = "(CIIIZLaa;II)V",
      line = 179
   )
   public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class512 arg5, int arg6, int arg7) {
      if (arg5 == null) {
         this.method136(arg0, arg1, arg2, arg3, arg4);
      } else {
         int var9 = this.field460[arg0] + arg1;
         int var10 = this.field465[arg0] + arg2;
         int var11 = this.field462[arg0];
         int var12 = this.field461[arg0];
         int var13 = this.field463.field7758;
         int var14 = var10 * var13 + var9;
         int var15 = var13 - var11;
         int var16 = 0;
         int var17 = 0;
         if (var10 < this.field463.field7740) {
            int var18 = this.field463.field7740 - var10;
            var12 -= var18;
            var10 = this.field463.field7740;
            var17 += var11 * var18;
            var14 += var13 * var18;
         }

         if (var10 + var12 > this.field463.field7723) {
            var12 -= var10 + var12 - this.field463.field7723;
         }

         if (var9 < this.field463.field7745) {
            int var19 = this.field463.field7745 - var9;
            var11 -= var19;
            var9 = this.field463.field7745;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
         }

         if (var9 + var11 > this.field463.field7732) {
            int var20 = var9 + var11 - this.field463.field7732;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
         }

         if (var11 > 0 && var12 > 0) {
            this.method294(this.field464[arg0], this.field463.field7761, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field462[arg0], arg5, arg6, arg7);
         }
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "fa",
      descriptor = "(CIIIZ)V",
      line = 241
   )
   public final void method136(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int var6 = this.field460[arg0] + arg1;
      int var7 = this.field465[arg0] + arg2;
      int var8 = this.field462[arg0];
      int var9 = this.field461[arg0];
      int var10 = this.field463.field7758;
      int var11 = var7 * var10 + var6;
      int var12 = var10 - var8;
      int var13 = 0;
      int var14 = 0;
      if (var7 < this.field463.field7740) {
         int var15 = this.field463.field7740 - var7;
         var9 -= var15;
         var7 = this.field463.field7740;
         var14 += var8 * var15;
         var11 += var10 * var15;
      }

      if (var7 + var9 > this.field463.field7723) {
         var9 -= var7 + var9 - this.field463.field7723;
      }

      if (var6 < this.field463.field7745) {
         int var16 = this.field463.field7745 - var6;
         var8 -= var16;
         var6 = this.field463.field7745;
         var14 += var16;
         var11 += var16;
         var13 += var16;
         var12 += var16;
      }

      if (var6 + var8 > this.field463.field7732) {
         int var17 = var6 + var8 - this.field463.field7732;
         var8 -= var17;
         var13 += var17;
         var12 += var17;
      }

      if (var8 > 0 && var9 > 0) {
         this.method293(this.field464[arg0], this.field463.field7761, arg3, var14, var11, var8, var9, var12, var13);
      }
   }
}
