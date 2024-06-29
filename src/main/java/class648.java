import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class648 implements class179 {
   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFIILaa;II)V"
   )
   public final void method4759(float arg0, float arg1, int arg2, int arg3, class87 arg4, int arg5, int arg6) {
      this.method4764(arg0, arg1, (float)this.method2406() / 2.0F, (float)this.method2396() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method2411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method2394();

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method2408(int[] arg0);

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4760(int arg0, int arg1) {
      this.method2399(arg0, arg1, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFFFFFLaa;II)V"
   )
   private final void method4761(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class87 arg6, int arg7, int arg8) {
      this.method2395(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public abstract void method2395(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class87 arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method2410(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public abstract void method2402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method4762(int arg0, int arg1, int arg2, int arg3) {
      this.method2409(arg0, arg1, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFII)V"
   )
   public final void method4763(float arg0, float arg1, int arg2, int arg3) {
      this.method4768(arg0, arg1, (float)this.method2406() / 2.0F, (float)this.method2396() / 2.0F, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFFFIILaa;II)V"
   )
   public final void method4764(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method2406() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method2406() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method2396() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method2396() - arg3) * var13) / 4096.0F + arg1;
         this.method4761(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method2397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!pd",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method2404();

   @OriginalMember(
      owner = "client!pd",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method2396();

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "(IIII)V"
   )
   public abstract void method2405(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method2399(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method2398(int arg0, int arg1, class87 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!pd",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method2409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFIIIII)V"
   )
   public final void method4765(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method4768(arg0, arg1, (float)this.method2406() / 2.0F, (float)this.method2396() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method4766(int arg0, int arg1, int arg2, int arg3) {
      this.method2397(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFFFFFIII)V"
   )
   private final void method4767(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method2402(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(FFFFIIIII)V"
   )
   private final void method4768(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method2406() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method2406() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method2396() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method2396() - arg3) * var13) / 4096.0F + arg1;
         this.method4767(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method2406();

   @OriginalMember(
      owner = "client!pd",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method4769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method2397(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }
}
