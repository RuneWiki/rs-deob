import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class492 implements class461 {
   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method3569(int arg0, int arg1, int arg2, int arg3) {
      this.method966(arg0, arg1, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method3570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method428(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method958();

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method426(int arg0, int arg1, class515 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFIILaa;II)V"
   )
   public final void method3571(float arg0, float arg1, int arg2, int arg3, class515 arg4, int arg5, int arg6) {
      this.method3578(arg0, arg1, (float)this.method960() / 2.0F, (float)this.method957() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFIIIII)V"
   )
   public final void method3572(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method3574(arg0, arg1, (float)this.method960() / 2.0F, (float)this.method957() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!bg",
      name = "c",
      descriptor = "(IIII)V"
   )
   public abstract void method961(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public abstract void method965(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class515 arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFFFFFIII)V"
   )
   private final void method3573(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method964(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFFFIIIII)V"
   )
   private final void method3574(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method960() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method960() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method957() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method957() - arg3) * var13) / 4096.0F + arg1;
         this.method3573(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3575(int arg0, int arg1) {
      this.method429(arg0, arg1, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method424(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFFFFFLaa;II)V"
   )
   private final void method3576(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class515 arg6, int arg7, int arg8) {
      this.method965(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method3577(int arg0, int arg1, int arg2, int arg3) {
      this.method428(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method957();

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!bg",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method963();

   @OriginalMember(
      owner = "client!bg",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method960();

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public abstract void method964(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method429(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFFFIILaa;II)V"
   )
   public final void method3578(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class515 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method960() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method960() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method957() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method957() - arg3) * var13) / 4096.0F + arg1;
         this.method3576(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(FFII)V"
   )
   public final void method3579(float arg0, float arg1, int arg2, int arg3) {
      this.method3574(arg0, arg1, (float)this.method960() / 2.0F, (float)this.method957() / 2.0F, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method962(int[] arg0);
}
