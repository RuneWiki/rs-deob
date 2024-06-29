import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class262 extends class20 {

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
    public boolean field4608 = false;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)V")
    public abstract void method1467(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([[IIIIII)V")
    public final void method1782(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1783(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1783(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1783(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1783(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1490(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1484(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1471(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lw;IZ)V")
    public abstract void method1493(class154 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "()I")
    public abstract int method1481();

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lw;I)V")
    public abstract void method1487(class154 arg0, int arg1);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public abstract void method1490(int arg0);

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "()I")
    public abstract int method1468();

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "()V")
    public abstract void method1483();

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZZ)Ljh;")
    public abstract class262 method1482(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(ZZ)Ljh;")
    public abstract class262 method1480(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "()V")
    public abstract void method1479();

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "()I")
    public abstract int method1475();

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public abstract void method1484(int arg0);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lw;ILw;I[IZ)V")
    public abstract void method1494(class154 arg0, int arg1, class154 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "()I")
    public abstract int method1463();

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "()V")
    public abstract void method1476();

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "()I")
    public abstract int method1477();

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public abstract void method1491(int arg0);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()I")
    public abstract int method28();

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([[III)I")
    private static final int method1783(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(III)V")
    public abstract void method1471(int arg0, int arg1, int arg2);
}
