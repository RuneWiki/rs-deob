import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class1 extends class88 {

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Z")
    public boolean field1 = false;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I")
    public abstract int method1();

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(III)V")
    public abstract void method2(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lpd;ILpd;I[IZ)V")
    public abstract void method3(class167 arg0, int arg1, class167 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public abstract void method4(int arg0);

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()I")
    public abstract int method5();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZ)La;")
    public abstract class1 method6(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "()V")
    public abstract void method7();

    @OriginalMember(owner = "client!a", name = "e", descriptor = "()V")
    public abstract void method8();

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
    public abstract void method9(int arg0);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "()V")
    public abstract void method10();

    @OriginalMember(owner = "client!a", name = "g", descriptor = "()I")
    public abstract int method11();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([[IIIIII)V")
    public final void method12(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method18(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method18(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method18(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method18(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method21(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method9(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method14(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "()I")
    public abstract int method13();

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(III)V")
    public abstract void method14(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!a", name = "i", descriptor = "()I")
    public abstract int method15();

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(ZZ)La;")
    public abstract class1 method16(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "()I")
    public abstract int method17();

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([[III)I")
    private static final int method18(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public abstract void method21(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lpd;IZ)V")
    public abstract void method22(class167 arg0, int arg1, boolean arg2);
}
