import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class253 extends class67 {

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Z")
    public boolean field4511 = false;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
    public abstract void method1451();

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()V")
    public abstract void method1446();

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([[III)I")
    private static final int method1732(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lr;IZ)V")
    public abstract void method1448(class63 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()I")
    public abstract int method308();

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "()I")
    public abstract int method1449();

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public abstract void method1445(int arg0);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIJILdk;)V")
    public abstract void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class193 arg10);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(ZZ)Lbl;")
    public abstract class253 method1450(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lr;I)V")
    public abstract void method1444(class63 arg0, int arg1);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public abstract void method1459(int arg0);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(ZZ)Lbl;")
    public abstract class253 method1464(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "()I")
    public abstract int method1466();

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
    public abstract void method1457(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([[IIIIII)V")
    public final void method1733(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1732(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1732(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1732(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1732(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1467(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1459(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1457(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lr;ILr;I[IZ)V")
    public abstract void method1462(class63 arg0, int arg1, class63 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "()I")
    public abstract int method1463();

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "()V")
    public abstract void method1470();

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public abstract void method1467(int arg0);

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(III)V")
    public abstract void method1469(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "()I")
    public abstract int method1465();

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method1471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "()I")
    public abstract int method1458();
}
