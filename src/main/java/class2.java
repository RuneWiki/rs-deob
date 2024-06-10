import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!aa")
public class class2 extends class21 {
   @OriginalMember(
      owner = "loginapplet!aa",
      name = "p",
      descriptor = "[I"
   )
   public int[] field4;
   @OriginalMember(
      owner = "loginapplet!aa",
      name = "q",
      descriptor = "I"
   )
   public int field5;
   @OriginalMember(
      owner = "loginapplet!aa",
      name = "r",
      descriptor = "I"
   )
   public int field6;
   @OriginalMember(
      owner = "loginapplet!aa",
      name = "s",
      descriptor = "I"
   )
   public int field7;
   @OriginalMember(
      owner = "loginapplet!aa",
      name = "t",
      descriptor = "I"
   )
   public int field8;

   @OriginalMember(
      owner = "loginapplet!aa",
      name = "a",
      descriptor = "([I[IIIIIII)V",
      line = 5
   )
   private static final void method3(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      for(int var8 = -arg5; var8 < 0; ++var8) {
         int var9 = arg3 + arg4 - 3;

         while(arg3 < var9) {
            arg0[arg3++] = arg1[arg2++];
            arg0[arg3++] = arg1[arg2++];
            arg0[arg3++] = arg1[arg2++];
            arg0[arg3++] = arg1[arg2++];
         }

         var9 += 3;

         while(arg3 < var9) {
            arg0[arg3++] = arg1[arg2++];
         }

         arg3 += arg6;
         arg2 += arg7;
      }

   }

   @OriginalMember(
      owner = "loginapplet!aa",
      name = "a",
      descriptor = "(II)V",
      line = 74
   )
   public final void method4(int arg0, int arg1) {
      arg0 += this.field5;
      arg1 += this.field7;
      int var3 = arg0 + arg1 * class21.field148;
      int var4 = 0;
      int var5 = this.field6;
      int var6 = this.field8;
      int var7 = class21.field148 - var6;
      int var8 = 0;
      int var9;
      if (arg1 < class21.field147) {
         var9 = class21.field147 - arg1;
         var5 -= var9;
         arg1 = class21.field147;
         var4 += var9 * var6;
         var3 += var9 * class21.field148;
      }

      if (arg1 + var5 > class21.field150) {
         var5 -= arg1 + var5 - class21.field150;
      }

      if (arg0 < class21.field146) {
         var9 = class21.field146 - arg0;
         var6 -= var9;
         arg0 = class21.field146;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (arg0 + var6 > class21.field149) {
         var9 = arg0 + var6 - class21.field149;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method6(class21.field152, this.field4, 0, var4, var3, var6, var5, var7, var8);
      }
   }

   @OriginalMember(
      owner = "loginapplet!aa",
      name = "b",
      descriptor = "(II)V",
      line = 136
   )
   public final void method5(int arg0, int arg1) {
      arg0 += this.field5;
      arg1 += this.field7;
      int var3 = arg0 + arg1 * class21.field148;
      int var4 = 0;
      int var5 = this.field6;
      int var6 = this.field8;
      int var7 = class21.field148 - var6;
      int var8 = 0;
      int var9;
      if (arg1 < class21.field147) {
         var9 = class21.field147 - arg1;
         var5 -= var9;
         arg1 = class21.field147;
         var4 += var9 * var6;
         var3 += var9 * class21.field148;
      }

      if (arg1 + var5 > class21.field150) {
         var5 -= arg1 + var5 - class21.field150;
      }

      if (arg0 < class21.field146) {
         var9 = class21.field146 - arg0;
         var6 -= var9;
         arg0 = class21.field146;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (arg0 + var6 > class21.field149) {
         var9 = arg0 + var6 - class21.field149;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method3(class21.field152, this.field4, var4, var3, var6, var5, var7, var8);
      }
   }

   @OriginalMember(
      owner = "loginapplet!aa",
      name = "a",
      descriptor = "([I[IIIIIIII)V",
      line = 212
   )
   private static final void method6(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var9 = -(arg5 >> 2);
      int var13 = -(arg5 & 3);

      for(int var10 = -arg6; var10 < 0; ++var10) {
         int var11;
         int var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = var12;
            } else {
               ++arg4;
            }

            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = var12;
            } else {
               ++arg4;
            }

            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = var12;
            } else {
               ++arg4;
            }

            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = var12;
            } else {
               ++arg4;
            }
         }

         for(var11 = var13; var11 < 0; ++var11) {
            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = var12;
            } else {
               ++arg4;
            }
         }

         arg4 += arg7;
         arg3 += arg8;
      }

   }
}
