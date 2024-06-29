import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class148 implements class795 {
   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IILaa;II)V"
   )
   public abstract void method1347(int arg0, int arg1, class684 arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method1344(int[] arg0);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFFFIIIII)V"
   )
   private final void method1441(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method1351() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method1351() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method1356() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method1356() - arg3) * var13) / 4096.0F + arg1;
         this.method1442(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "()I"
   )
   public abstract int method1354();

   @OriginalMember(
      owner = "client!ma",
      name = "d",
      descriptor = "()I"
   )
   public abstract int method1356();

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFFFFFIII)V"
   )
   private final void method1442(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
      this.method1346(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, 1);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "()I"
   )
   public abstract int method1350();

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "()I"
   )
   public abstract int method1351();

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFFFFFLaa;II)V"
   )
   private final void method1443(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class684 arg6, int arg7, int arg8) {
      this.method1349(arg0, arg1, arg2, arg3, arg4, arg5, 1, arg6, arg7, arg8);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFFFIILaa;II)V"
   )
   public final void method1444(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, class684 arg6, int arg7, int arg8) {
      if (arg4 != 0) {
         double var10 = (double)(arg5 & 65535) * 9.587379924285257E-5D;
         float var12 = (float)Math.sin(var10) * (float)arg4;
         float var13 = (float)Math.cos(var10) * (float)arg4;
         float var14 = (-arg2 * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var15 = (-arg3 * var13 + arg2 * var12) / 4096.0F + arg1;
         float var16 = (((float)this.method1351() - arg2) * var13 + -arg3 * var12) / 4096.0F + arg0;
         float var17 = (-((float)this.method1351() - arg2) * var12 + -arg3 * var13) / 4096.0F + arg1;
         float var18 = (-arg2 * var13 + ((float)this.method1356() - arg3) * var12) / 4096.0F + arg0;
         float var19 = (arg2 * var12 + ((float)this.method1356() - arg3) * var13) / 4096.0F + arg1;
         this.method1443(var14, var15, var16, var17, var18, var19, arg6, arg7, arg8);
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "(IIII)V"
   )
   public abstract void method1343(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public abstract void method1359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFII)V"
   )
   public final void method1445(float arg0, float arg1, int arg2, int arg3) {
      this.method1441(arg0, arg1, (float)this.method1351() / 2.0F, (float)this.method1356() / 2.0F, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method1361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public abstract void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public abstract void method1352(int arg0, int arg1, int arg2, int arg3, int arg4);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFIILaa;II)V"
   )
   public final void method1446(float arg0, float arg1, int arg2, int arg3, class684 arg4, int arg5, int arg6) {
      this.method1444(arg0, arg1, (float)this.method1351() / 2.0F, (float)this.method1356() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFIIIII)V"
   )
   public final void method1447(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method1441(arg0, arg1, (float)this.method1351() / 2.0F, (float)this.method1356() / 2.0F, arg2, arg3, arg4, arg5, arg6);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1360(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method1448(int arg0, int arg1, int arg2, int arg3) {
      this.method1353(arg0, arg1, arg2, arg3, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method1449(int arg0, int arg1, int arg2, int arg3) {
      this.method1359(arg0, arg1, arg2, arg3, 1, 0, 1, 1);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public final void method1450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      this.method1359(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 1);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFFFFFIIII)V"
   )
   public abstract void method1346(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9);

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1451(int arg0, int arg1) {
      this.method1352(arg0, arg1, 1, 0, 1);
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(FFFFFFILaa;II)V"
   )
   public abstract void method1349(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class684 arg7, int arg8, int arg9);
}
