import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!s")
public class class40 extends class35 {
   @OriginalMember(
      owner = "loginapplet!s",
      name = "<init>",
      descriptor = "([B[I[I[I[I[I[[B)V",
      line = 5
   )
   public class40(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "loginapplet!s",
      name = "b",
      descriptor = "([BIIIII)V",
      line = 9
   )
   public final void method168(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = arg1 + arg2 * class21.field148;
      int var8 = class21.field148 - arg3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (arg2 < class21.field147) {
         var11 = class21.field147 - arg2;
         arg4 -= var11;
         arg2 = class21.field147;
         var10 += var11 * arg3;
         var7 += var11 * class21.field148;
      }

      if (arg2 + arg4 > class21.field150) {
         arg4 -= arg2 + arg4 - class21.field150;
      }

      if (arg1 < class21.field146) {
         var11 = class21.field146 - arg1;
         arg3 -= var11;
         arg1 = class21.field146;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (arg1 + arg3 > class21.field149) {
         var11 = arg1 + arg3 - class21.field149;
         arg3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (arg3 > 0 && arg4 > 0) {
         class35.method161(class21.field152, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
      }
   }

   @OriginalMember(
      owner = "loginapplet!s",
      name = "a",
      descriptor = "([BIIIIII)V",
      line = 58
   )
   public final void method159(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = arg1 + arg2 * class21.field148;
      int var9 = class21.field148 - arg3;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (arg2 < class21.field147) {
         var12 = class21.field147 - arg2;
         arg4 -= var12;
         arg2 = class21.field147;
         var11 += var12 * arg3;
         var8 += var12 * class21.field148;
      }

      if (arg2 + arg4 > class21.field150) {
         arg4 -= arg2 + arg4 - class21.field150;
      }

      if (arg1 < class21.field146) {
         var12 = class21.field146 - arg1;
         arg3 -= var12;
         arg1 = class21.field146;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (arg1 + arg3 > class21.field149) {
         var12 = arg1 + arg3 - class21.field149;
         arg3 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (arg3 > 0 && arg4 > 0) {
         class35.method158(class21.field152, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
      }
   }
}
