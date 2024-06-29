import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class476 implements class619 {
   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method1059(int arg0, int arg1, class510 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFIILaa;II)V"
   )
   public final void method3600(float arg0, float arg1, int arg2, int arg3, class510 arg4, int arg5, int arg6) {
      this.method3610(arg0, arg1, (float)this.method3009() / 2.0F, (float)this.method3000() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method3007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFII)V"
   )
   public final void method3601(float arg0, float arg1, int arg2, int arg3) {
      this.method3606(arg0, arg1, (float)this.method3009() / 2.0F, (float)this.method3000() / 2.0F, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!td",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method3002();

   @OriginalMember(
      owner = "client!td",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method3602(int arg0, int arg1, int arg2, int arg3) {
      this.method1057(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
   }

   @OriginalMember(
      owner = "client!td",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method3005();

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public abstract void method3008(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class510 arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFFFFFLaa;II)V"
   )
   private final void method3603(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class510 arg6, int arg7, int arg8) {
      this.method3008(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFFFFFIII)V"
   )
   private final void method3604(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method3003(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public final void method3605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method1057(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1056(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "(IIII)V"
   )
   public abstract void method3006(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFFFIIIII)V"
   )
   private final void method3606(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method3009() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method3009() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method3000() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method3000() - arg3) * var13) / 4096.0F + arg1;
         this.method3604(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method3607(int arg0, int arg1, int arg2, int arg3) {
      this.method3007(arg0, arg1, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFIIIII)V"
   )
   public final void method3608(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method3606(arg0, arg1, (float)this.method3009() / 2.0F, (float)this.method3000() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!td",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method3009();

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public abstract void method3003(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method1055(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method3001(int[] arg0);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3609(int arg0, int arg1) {
      this.method1055(arg0, arg1, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method3000();

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(FFFFIILaa;II)V"
   )
   public final void method3610(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method3009() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method3009() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method3000() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method3000() - arg3) * var13) / 4096.0F + arg1;
         this.method3603(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }
}
