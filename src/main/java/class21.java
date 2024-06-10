import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ia")
public class class21 extends class49 {
   @OriginalMember(
      owner = "loginapplet!ia",
      name = "i",
      descriptor = "I"
   )
   public static int field146 = 0;
   @OriginalMember(
      owner = "loginapplet!ia",
      name = "j",
      descriptor = "I"
   )
   public static int field147 = 0;
   @OriginalMember(
      owner = "loginapplet!ia",
      name = "k",
      descriptor = "I"
   )
   public static int field148;
   @OriginalMember(
      owner = "loginapplet!ia",
      name = "l",
      descriptor = "I"
   )
   public static int field149 = 0;
   @OriginalMember(
      owner = "loginapplet!ia",
      name = "m",
      descriptor = "I"
   )
   public static int field150 = 0;
   @OriginalMember(
      owner = "loginapplet!ia",
      name = "n",
      descriptor = "I"
   )
   private static int field151;
   @OriginalMember(
      owner = "loginapplet!ia",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field152;

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "a",
      descriptor = "(IIII)V",
      line = 5
   )
   private static final void method99(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 >= field146 && arg0 < field149) {
         if (arg1 < field147) {
            arg2 -= field147 - arg1;
            arg1 = field147;
         }

         if (arg1 + arg2 > field150) {
            arg2 = field150 - arg1;
         }

         int var4 = arg0 + arg1 * field148;

         for(int var5 = 0; var5 < arg2; ++var5) {
            field152[var4 + var5 * field148] = arg3;
         }

      }
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "b",
      descriptor = "(IIII)V",
      line = 34
   )
   public static final void method100(int arg0, int arg1, int arg2, int arg3) {
      if (arg1 >= field147 && arg1 < field150) {
         if (arg0 < field146) {
            arg2 -= field146 - arg0;
            arg0 = field146;
         }

         if (arg0 + arg2 > field149) {
            arg2 = field149 - arg0;
         }

         int var4 = arg0 + arg1 * field148;

         for(int var5 = 0; var5 < arg2; ++var5) {
            field152[var4 + var5] = arg3;
         }

      }
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "a",
      descriptor = "()V",
      line = 58
   )
   public static final void method101() {
      int var0 = 0;
      int var1 = field148 * field151 - 7;

      while(var0 < var1) {
         field152[var0++] = 0;
         field152[var0++] = 0;
         field152[var0++] = 0;
         field152[var0++] = 0;
         field152[var0++] = 0;
         field152[var0++] = 0;
         field152[var0++] = 0;
         field152[var0++] = 0;
      }

      var1 += 7;

      while(var0 < var1) {
         field152[var0++] = 0;
      }

   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "a",
      descriptor = "(IIIII)V",
      line = 81
   )
   public static final void method102(int arg0, int arg1, int arg2, int arg3, int arg4) {
      method100(arg0, arg1, arg2, arg4);
      method100(arg0, arg1 + arg3 - 1, arg2, arg4);
      method99(arg0, arg1, arg3, arg4);
      method99(arg0 + arg2 - 1, arg1, arg3, arg4);
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "b",
      descriptor = "()V",
      line = 88
   )
   public static void method103() {
      field152 = null;
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "a",
      descriptor = "([III)V",
      line = 97
   )
   public static final void method104(int[] arg0, int arg1, int arg2) {
      field152 = arg0;
      field148 = arg1;
      field151 = arg2;
      method108(0, 0, arg1, arg2);
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "a",
      descriptor = "(IIIIIIII[II[IIIIIIII)V",
      line = 113
   )
   private static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17) {
      while(arg17 < 0) {
         arg3 = arg14;
         arg4 = arg12;

         for(int var18 = arg13; var18 < 0; ++var18) {
            if (arg3 < arg6) {
               int var19 = arg10[(arg6 - arg3) * arg9 / arg6];
               int var21 = arg8[arg7];
               int var23 = var19 + var21;
               int var20 = (var19 & 16711935) + (var21 & 16711935);
               int var22 = (var20 & 16777472) + (var23 - var20 & 65536);
               arg8[arg7] = var23 - var22 | var22 - (var22 >>> 8);
            }

            ++arg7;
            arg3 += arg4;
            arg4 += arg5;
         }

         arg7 += arg11;
         arg14 += arg15;
         arg15 += arg16;
         ++arg17;
      }

   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "b",
      descriptor = "(IIIII)V",
      line = 148
   )
   public static final void method106(int arg0, int arg1, int arg2, int arg3, int arg4) {
      arg2 -= arg0;
      arg3 -= arg1;
      if (arg3 == 0) {
         if (arg2 >= 0) {
            method100(arg0, arg1, arg2 + 1, arg4);
         } else {
            method100(arg0 + arg2, arg1, -arg2 + 1, arg4);
         }

      } else if (arg2 == 0) {
         if (arg3 >= 0) {
            method99(arg0, arg1, arg3 + 1, arg4);
         } else {
            method99(arg0, arg1 + arg3, -arg3 + 1, arg4);
         }

      } else {
         if (arg2 + arg3 < 0) {
            arg0 += arg2;
            arg2 = -arg2;
            arg1 += arg3;
            arg3 = -arg3;
         }

         int var5;
         int var6;
         if (arg2 > arg3) {
            arg1 <<= 16;
            arg1 += 32768;
            int var8 = arg3 << 16;
            var5 = (int)Math.floor((double)var8 / (double)arg2 + 0.5D);
            arg2 += arg0;
            if (arg0 < field146) {
               arg1 += var5 * (field146 - arg0);
               arg0 = field146;
            }

            if (arg2 >= field149) {
               arg2 = field149 - 1;
            }

            while(arg0 <= arg2) {
               var6 = arg1 >> 16;
               if (var6 >= field147 && var6 < field150) {
                  field152[arg0 + var6 * field148] = arg4;
               }

               arg1 += var5;
               ++arg0;
            }
         } else {
            arg0 <<= 16;
            arg0 += 32768;
            int var7 = arg2 << 16;
            var5 = (int)Math.floor((double)var7 / (double)arg3 + 0.5D);
            arg3 += arg1;
            if (arg1 < field147) {
               arg0 += var5 * (field147 - arg1);
               arg1 = field147;
            }

            if (arg3 >= field150) {
               arg3 = field150 - 1;
            }

            while(arg1 <= arg3) {
               var6 = arg0 >> 16;
               if (var6 >= field146 && var6 < field149) {
                  field152[var6 + arg1 * field148] = arg4;
               }

               arg0 += var5;
               ++arg1;
            }
         }

      }
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "c",
      descriptor = "(IIIII)V",
      line = 242
   )
   public static final void method107(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (arg0 < field146) {
         arg2 -= field146 - arg0;
         arg0 = field146;
      }

      if (arg1 < field147) {
         arg3 -= field147 - arg1;
         arg1 = field147;
      }

      if (arg0 + arg2 > field149) {
         arg2 = field149 - arg0;
      }

      if (arg1 + arg3 > field150) {
         arg3 = field150 - arg1;
      }

      int var5 = field148 - arg2;
      int var6 = arg0 + arg1 * field148;

      for(int var7 = -arg3; var7 < 0; ++var7) {
         for(int var8 = -arg2; var8 < 0; ++var8) {
            field152[var6++] = arg4;
         }

         var6 += var5;
      }

   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "c",
      descriptor = "(IIII)V",
      line = 292
   )
   private static final void method108(int arg0, int arg1, int arg2, int arg3) {
      if (arg0 < 0) {
         arg0 = 0;
      }

      if (arg1 < 0) {
         arg1 = 0;
      }

      if (arg2 > field148) {
         arg2 = field148;
      }

      if (arg3 > field151) {
         arg3 = field151;
      }

      field146 = arg0;
      field147 = arg1;
      field149 = arg2;
      field150 = arg3;
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "a",
      descriptor = "(IIII[I)V",
      line = 315
   )
   public static final void method109(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      int var5 = arg2 * arg2;
      int var6 = arg0 - arg2 >> 4;
      int var7 = arg0 + arg2 + 15 >> 4;
      int var8 = arg1 - arg2 >> 4;
      int var9 = arg1 + arg2 + 15 >> 4;
      if (var6 < field146) {
         var6 = field146;
      }

      if (var7 > field149) {
         var7 = field149;
      }

      if (var8 < field147) {
         var8 = field147;
      }

      if (var9 > field150) {
         var9 = field150;
      }

      int var10 = (var6 << 4) - arg0;
      int var24 = var10 * var10;
      int var11 = (var6 + 1 << 4) - arg0;
      int var25 = var11 * var11;
      int var12 = (var6 + 2 << 4) - arg0;
      int var26 = var12 * var12;
      int var13 = var25 - var24;
      int var14 = var26 - var25;
      int var15 = var14 - var13;
      int var16 = (var8 << 4) - arg1;
      int var27 = var16 * var16;
      int var17 = (var8 + 1 << 4) - arg1;
      int var28 = var17 * var17;
      int var18 = (var8 + 2 << 4) - arg1;
      int var29 = var18 * var18;
      int var19 = var28 - var27;
      int var20 = var29 - var28;
      int var21 = var20 - var19;
      int var22 = var6 + var8 * field148;
      int var23 = field148 + var6 - var7;
      method105(0, 0, 0, 0, 0, var15, var5, var22, field152, arg3, arg4, var23, var13, var6 - var7, var27 + var24, var19, var21, var8 - var9);
   }

   @OriginalMember(
      owner = "loginapplet!ia",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 376
   )
   public static final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      if (arg0 < field146) {
         arg2 -= field146 - arg0;
         arg0 = field146;
      }

      if (arg1 < field147) {
         arg3 -= field147 - arg1;
         arg1 = field147;
      }

      if (arg0 + arg2 > field149) {
         arg2 = field149 - arg0;
      }

      if (arg1 + arg3 > field150) {
         arg3 = field150 - arg1;
      }

      int var12 = ((arg4 & 16711935) * arg5 >> 8 & 16711935) + ((arg4 & 65280) * arg5 >> 8 & 65280);
      int var6 = 256 - arg5;
      int var7 = field148 - arg2;
      int var8 = arg0 + arg1 * field148;

      for(int var9 = 0; var9 < arg3; ++var9) {
         for(int var10 = -arg2; var10 < 0; ++var10) {
            int var11 = field152[var8];
            int var13 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            field152[var8++] = var12 + var13;
         }

         var8 += var7;
      }

   }
}
