import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public abstract class class396 implements class103 {
   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public final void method3028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method265(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFII)V"
   )
   public final void method3029(float arg0, float arg1, int arg2, int arg3) {
      this.method3036(arg0, arg1, (float)this.method1971() / 2.0F, (float)this.method1975() / 2.0F, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFIIIII)V"
   )
   public final void method3030(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method3036(arg0, arg1, (float)this.method1971() / 2.0F, (float)this.method1975() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFFFFFIII)V"
   )
   private final void method3031(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method1973(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method262(int arg0, int arg1, class512 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method1974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method3032(int arg0, int arg1, int arg2, int arg3) {
      this.method1974(arg0, arg1, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFFFIILaa;II)V"
   )
   public final void method3033(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method1971() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method1971() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method1975() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method1975() - arg3) * var13) / 4096.0F + arg1;
         this.method3034(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public abstract void method1970(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class512 arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFFFFFLaa;II)V"
   )
   private final void method3034(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class512 arg6, int arg7, int arg8) {
      this.method1970(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3035(int arg0, int arg1) {
      this.method264(arg0, arg1, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFFFIIIII)V"
   )
   private final void method3036(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method1971() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method1971() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method1975() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method1975() - arg3) * var13) / 4096.0F + arg1;
         this.method3031(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public abstract void method1973(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method263(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!at",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method1967();

   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method1971();

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method264(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method1975();

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method1969(int[] arg0);

   @OriginalMember(
      owner = "client!at",
      name = "b",
      descriptor = "(IIII)V"
   )
   public abstract void method1976(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!at",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method3037(int arg0, int arg1, int arg2, int arg3) {
      this.method265(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
   }

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!at",
      name = "a",
      descriptor = "(FFIILaa;II)V"
   )
   public final void method3038(float arg0, float arg1, int arg2, int arg3, class512 arg4, int arg5, int arg6) {
      this.method3033(arg0, arg1, (float)this.method1971() / 2.0F, (float)this.method1975() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!at",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method1965();
}
