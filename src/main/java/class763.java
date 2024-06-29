import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public abstract class class763 implements class796 {
   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFFFIILaa;II)V"
   )
   public final void method5476(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class516 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method2125() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method2125() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method2129() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method2129() - arg3) * var13) / 4096.0F + arg1;
         this.method5480(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method2135(int[] arg0);

   @OriginalMember(
      owner = "client!bo",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method2137();

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method2129();

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method5477(int arg0, int arg1, int arg2, int arg3) {
      this.method1626(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFII)V"
   )
   public final void method5478(float arg0, float arg1, int arg2, int arg3) {
      this.method5483(arg0, arg1, (float)this.method2125() / 2.0F, (float)this.method2129() / 2.0F, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public abstract void method2128(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class516 arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFFFFFIII)V"
   )
   private final void method5479(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method2138(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method2127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method1629(int arg0, int arg1, class516 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method1626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!bo",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method2125();

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method2132(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFFFFFLaa;II)V"
   )
   private final void method5480(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class516 arg6, int arg7, int arg8) {
      this.method2128(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1625(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFIILaa;II)V"
   )
   public final void method5481(float arg0, float arg1, int arg2, int arg3, class516 arg4, int arg5, int arg6) {
      this.method5476(arg0, arg1, (float)this.method2125() / 2.0F, (float)this.method2129() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5482(int arg0, int arg1) {
      this.method1631(arg0, arg1, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public abstract void method2138(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method1631(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFFFIIIII)V"
   )
   private final void method5483(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method2125() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method2125() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method2129() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method2129() - arg3) * var13) / 4096.0F + arg1;
         this.method5479(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method1624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!bo",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method5484(int arg0, int arg1, int arg2, int arg3) {
      this.method2127(arg0, arg1, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(FFIIIII)V"
   )
   public final void method5485(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method5483(arg0, arg1, (float)this.method2125() / 2.0F, (float)this.method2129() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public final void method5486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method1626(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method2126();
}
