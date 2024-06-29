import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class257 extends class70 {

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
    public boolean field4552 = false;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([[III)I")
    private static final int method1797(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()I")
    public abstract int method744();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZZ)Lrk;")
    public abstract class257 method759(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "()I")
    public abstract int method760();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()I")
    public abstract int method496();

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "()V")
    public abstract void method758();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "()I")
    public abstract int method768();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([[IIIIII)V")
    public final void method1798(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1797(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1797(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1797(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1797(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method739(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method747(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method761(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public abstract void method747(int arg0);

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(ZZ)Lrk;")
    public abstract class257 method764(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)V")
    public abstract void method763(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "()I")
    public abstract int method751();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lok;ILok;I[IZ)V")
    public abstract void method755(class39 arg0, int arg1, class39 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "()V")
    public abstract void method748();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lok;IZ)V")
    public abstract void method762(class39 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lok;I)V")
    public abstract void method738(class39 arg0, int arg1);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
    public abstract void method765(int arg0);

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "()I")
    public abstract int method737();

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(III)V")
    public abstract void method761(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
    public abstract void method739(int arg0);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "()V")
    public abstract void method741();
}
