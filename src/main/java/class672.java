import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class672 implements class166 {
   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIII)V",
      line = 4
   )
   public final void method4949(int arg0, int arg1, int arg2, int arg3) {
      this.method2101(arg0, arg1, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFIIIII)V",
      line = 7
   )
   public final void method4950(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method4955(arg0, arg1, (float)this.method2106() / 2.0F, (float)this.method2108() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFII)V",
      line = 10
   )
   public final void method4951(float arg0, float arg1, int arg2, int arg3) {
      this.method4955(arg0, arg1, (float)this.method2106() / 2.0F, (float)this.method2108() / 2.0F, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFFFFFIII)V",
      line = 17
   )
   private final void method4952(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method2096(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 22
   )
   public final void method4953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method933(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "(IIII)V",
      line = 27
   )
   public final void method4954(int arg0, int arg1, int arg2, int arg3) {
      this.method933(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFFFIIIII)V",
      line = 32
   )
   private final void method4955(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method2106() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method2106() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method2108() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method2108() - arg3) * var13) / 4096.0F + arg1;
         this.method4952(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFFFFFLaa;II)V",
      line = 60
   )
   private final void method4956(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class96 arg6, int arg7, int arg8) {
      this.method2097(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFIILaa;II)V",
      line = 63
   )
   public final void method4957(float arg0, float arg1, int arg2, int arg3, class96 arg4, int arg5, int arg6) {
      this.method4958(arg0, arg1, (float)this.method2106() / 2.0F, (float)this.method2108() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFFFIILaa;II)V",
      line = 66
   )
   public final void method4958(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class96 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method2106() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method2106() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method2108() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method2108() - arg3) * var13) / 4096.0F + arg1;
         this.method4956(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(II)V",
      line = 93
   )
   public final void method4959(int arg0, int arg1) {
      this.method938(arg0, arg1, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!jq",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method2095();

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method935(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method939(int arg0, int arg1, class96 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jq",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method2106();

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method938(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!jq",
      name = "c",
      descriptor = "(IIII)V"
   )
   public abstract void method2107(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method2104();

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public abstract void method2097(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class96 arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method2102(int[] arg0);

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public abstract void method2096(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method2108();
}
