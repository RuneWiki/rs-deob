import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ja")
public class class23 extends class21 {
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "p",
      descriptor = "[B"
   )
   private byte[] field158;
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "q",
      descriptor = "I"
   )
   private int field159;
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "r",
      descriptor = "I"
   )
   private int field160;
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "s",
      descriptor = "I"
   )
   public int field161;
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "t",
      descriptor = "I"
   )
   public int field162;
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "u",
      descriptor = "I"
   )
   private int field163;
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "v",
      descriptor = "I"
   )
   private int field164;
   @OriginalMember(
      owner = "loginapplet!ja",
      name = "w",
      descriptor = "[I"
   )
   private int[] field165;

   @OriginalMember(
      owner = "loginapplet!ja",
      name = "a",
      descriptor = "(II)V",
      line = 24
   )
   public final void method115(int arg0, int arg1) {
      arg0 += this.field159;
      arg1 += this.field164;
      int var3 = arg0 + arg1 * class21.field148;
      int var4 = 0;
      int var5 = this.field160;
      int var6 = this.field163;
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
         method116(class21.field152, this.field158, this.field165, var4, var3, var6, var5, var7, var8);
      }
   }

   @OriginalMember(
      owner = "loginapplet!ja",
      name = "a",
      descriptor = "([I[B[IIIIIII)V",
      line = 81
   )
   private static final void method116(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var9 = -(arg5 >> 2);
      int var13 = -(arg5 & 3);

      for(int var10 = -arg6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = arg2[var12 & 255];
            } else {
               ++arg4;
            }

            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = arg2[var12 & 255];
            } else {
               ++arg4;
            }

            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = arg2[var12 & 255];
            } else {
               ++arg4;
            }

            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = arg2[var12 & 255];
            } else {
               ++arg4;
            }
         }

         for(var11 = var13; var11 < 0; ++var11) {
            var12 = arg1[arg3++];
            if (var12 != 0) {
               arg0[arg4++] = arg2[var12 & 255];
            } else {
               ++arg4;
            }
         }

         arg4 += arg7;
         arg3 += arg8;
      }

   }
}
