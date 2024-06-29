import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class218 extends class66 {
   @OriginalMember(
      owner = "client!dga",
      name = "A",
      descriptor = "Lnda;"
   )
   private class587 field2709;
   @OriginalMember(
      owner = "client!dga",
      name = "C",
      descriptor = "[I"
   )
   private int[] field2706;
   @OriginalMember(
      owner = "client!dga",
      name = "B",
      descriptor = "[I"
   )
   private int[] field2710;
   @OriginalMember(
      owner = "client!dga",
      name = "y",
      descriptor = "[[B"
   )
   private byte[][] field2711;
   @OriginalMember(
      owner = "client!dga",
      name = "x",
      descriptor = "[I"
   )
   private int[] field2707;
   @OriginalMember(
      owner = "client!dga",
      name = "D",
      descriptor = "[I"
   )
   private int[] field2712;
   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "[I"
   )
   private int[] field2708;

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "([B[IIIIIIIIIIILaa;II)V"
   )
   private final void method1656(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class516 arg12, int arg13, int arg14) {
      class155 var16 = (class155)arg12;
      int[] var17 = var16.field2000;
      int[] var18 = var16.field2003;
      int var19 = arg9 - this.field2709.field8099;
      int var20 = arg10;
      if (arg14 > arg10) {
         var20 = arg14;
         arg4 += (arg14 - arg10) * this.field2709.field8091;
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
            if (arg0[arg3++] != 0) {
               arg1[arg4++] = arg2;
            } else {
               ++arg4;
            }
         }

         arg3 += arg3 + var28;
         arg4 += arg7 + var28;
      }

   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "([B[I[IIIIIII)V"
   )
   private final void method1657(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = -(arg5 >> 2);
      int var11 = -(arg5 & 3);
      boolean var12 = false;

      for(int var13 = -arg6; var13 < 0; ++var13) {
         for(int var14 = var10; var14 < 0; ++var14) {
            byte var17;
            if ((var17 = arg0[arg3++]) != 0) {
               arg1[arg4++] = arg2[var17 & 255];
            } else {
               ++arg4;
            }

            byte var18;
            if ((var18 = arg0[arg3++]) != 0) {
               arg1[arg4++] = arg2[var18 & 255];
            } else {
               ++arg4;
            }

            byte var19;
            if ((var19 = arg0[arg3++]) != 0) {
               arg1[arg4++] = arg2[var19 & 255];
            } else {
               ++arg4;
            }

            byte var20;
            if ((var20 = arg0[arg3++]) != 0) {
               arg1[arg4++] = arg2[var20 & 255];
            } else {
               ++arg4;
            }
         }

         for(int var15 = var11; var15 < 0; ++var15) {
            byte var16;
            if ((var16 = arg0[arg3++]) != 0) {
               arg1[arg4++] = arg2[var16 & 255];
            } else {
               ++arg4;
            }
         }

         arg4 += arg7;
         arg3 += arg8;
      }

   }

   @OriginalMember(
      owner = "client!dga",
      name = "<init>",
      descriptor = "(Lnda;Ljk;[Lok;[I[I)V"
   )
   public class218(class587 arg0, class663 arg1, class267[] arg2, int[] arg3, int[] arg4) {
      super(arg0, arg1);
      this.field2709 = arg0;
      this.field2709 = arg0;
      this.field2706 = arg3;
      this.field2710 = arg4;
      this.field2711 = new byte[arg2.length][];
      this.field2707 = new int[arg2.length];
      this.field2712 = new int[arg2.length];

      for(int var6 = 0; var6 < arg2.length; ++var6) {
         this.field2711[var6] = arg2[var6].field3472;
         this.field2707[var6] = arg2[var6].field3466;
         this.field2712[var6] = arg2[var6].field3465;
      }

      this.field2708 = arg2[0].field3468;
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "([B[IIIIIIII)V"
   )
   private final void method1658(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
      owner = "client!dga",
      name = "fa",
      descriptor = "(CIIIZ)V"
   )
   public final void method170(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
      int var6 = this.field2712[arg0] + arg1;
      int var7 = this.field2707[arg0] + arg2;
      int var8 = this.field2706[arg0];
      int var9 = this.field2710[arg0];
      int var10 = this.field2709.field8091;
      int var11 = var7 * var10 + var6;
      int var12 = var10 - var8;
      int var13 = 0;
      int var14 = 0;
      if (var7 < this.field2709.field8073) {
         int var15 = this.field2709.field8073 - var7;
         var9 -= var15;
         var7 = this.field2709.field8073;
         var14 += var8 * var15;
         var11 += var10 * var15;
      }

      if (var7 + var9 > this.field2709.field8062) {
         var9 -= var7 + var9 - this.field2709.field8062;
      }

      if (var6 < this.field2709.field8099) {
         int var16 = this.field2709.field8099 - var6;
         var8 -= var16;
         var6 = this.field2709.field8099;
         var14 += var16;
         var11 += var16;
         var13 += var16;
         var12 += var16;
      }

      if (var6 + var8 > this.field2709.field8083) {
         int var17 = var6 + var8 - this.field2709.field8083;
         var8 -= var17;
         var13 += var17;
         var12 += var17;
      }

      if (var8 > 0 && var9 > 0) {
         if (arg4) {
            this.method1658(this.field2711[arg0], this.field2709.field8068, arg3, var14, var11, var8, var9, var12, var13);
         } else {
            this.method1657(this.field2711[arg0], this.field2709.field8068, this.field2708, var14, var11, var8, var9, var12, var13);
         }
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "([B[I[IIIIIIIIIIILaa;II)V"
   )
   private final void method1659(byte[] arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class516 arg13, int arg14, int arg15) {
      class155 var17 = (class155)arg13;
      int[] var18 = var17.field2000;
      int[] var19 = var17.field2003;
      int var20 = arg10 - this.field2709.field8099;
      int var21 = arg11;
      if (arg15 > arg11) {
         var21 = arg15;
         arg5 += (arg15 - arg11) * this.field2709.field8091;
         arg4 += (arg15 - arg11) * arg12;
      }

      int var22 = var18.length + arg15 < arg7 + arg11 ? var18.length + arg15 : arg7 + arg11;
      boolean var23 = false;

      for(int var24 = var21; var24 < var22; ++var24) {
         int var25 = var18[var24 - arg15] + arg14;
         int var26 = var19[var24 - arg15];
         int var27 = arg6;
         if (var20 > var25) {
            int var28 = var20 - var25;
            if (var28 >= var26) {
               arg4 += arg6 + arg9;
               arg5 += arg6 + arg8;
               continue;
            }

            var26 -= var28;
         } else {
            int var29 = var25 - var20;
            if (var29 >= arg6) {
               arg4 += arg6 + arg9;
               arg5 += arg6 + arg8;
               continue;
            }

            arg4 += var29;
            var27 = arg6 - var29;
            arg5 += var29;
         }

         int var30 = 0;
         if (var27 < var26) {
            var26 = var27;
         } else {
            var30 = var27 - var26;
         }

         for(int var31 = -var26; var31 < 0; ++var31) {
            byte var32;
            if ((var32 = arg0[arg4++]) != 0) {
               arg1[arg5++] = arg2[var32 & 255];
            } else {
               ++arg5;
            }
         }

         arg4 += arg9 + var30;
         arg5 += arg8 + var30;
      }

   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(CIIIZLaa;II)V"
   )
   public final void method168(char arg0, int arg1, int arg2, int arg3, boolean arg4, class516 arg5, int arg6, int arg7) {
      if (arg5 == null) {
         this.method170(arg0, arg1, arg2, arg3, arg4);
      } else {
         int var9 = this.field2712[arg0] + arg1;
         int var10 = this.field2707[arg0] + arg2;
         int var11 = this.field2706[arg0];
         int var12 = this.field2710[arg0];
         int var13 = this.field2709.field8091;
         int var14 = var10 * var13 + var9;
         int var15 = var13 - var11;
         int var16 = 0;
         int var17 = 0;
         if (var10 < this.field2709.field8073) {
            int var18 = this.field2709.field8073 - var10;
            var12 -= var18;
            var10 = this.field2709.field8073;
            var17 += var11 * var18;
            var14 += var13 * var18;
         }

         if (var10 + var12 > this.field2709.field8062) {
            var12 -= var10 + var12 - this.field2709.field8062;
         }

         if (var9 < this.field2709.field8099) {
            int var19 = this.field2709.field8099 - var9;
            var11 -= var19;
            var9 = this.field2709.field8099;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
         }

         if (var9 + var11 > this.field2709.field8083) {
            int var20 = var9 + var11 - this.field2709.field8083;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
         }

         if (var11 > 0 && var12 > 0) {
            if (arg4) {
               this.method1656(this.field2711[arg0], this.field2709.field8068, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field2706[arg0], arg5, arg6, arg7);
            } else {
               this.method1659(this.field2711[arg0], this.field2709.field8068, this.field2708, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field2706[arg0], arg5, arg6, arg7);
            }
         }
      }
   }
}
