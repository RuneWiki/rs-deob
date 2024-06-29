import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class256 extends class265 {

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Z")
    public boolean field4529 = false;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()I")
    public abstract int method426();

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lv;IZ)V")
    public abstract void method1617(class149 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V")
    public abstract void method1621();

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public abstract void method1602(int arg0);

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()I")
    public abstract int method1614();

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)V")
    public abstract void method1612(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(III)V")
    public abstract void method1600(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method1610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()I")
    public abstract int method1626();

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "()V")
    public abstract void method1607();

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lv;ILv;I[IZ)V")
    public abstract void method1627(class149 arg0, int arg1, class149 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZ)Lik;")
    public abstract class256 method1623(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public abstract void method1619(int arg0);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(ZZ)Lik;")
    public abstract class256 method1608(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "()I")
    public abstract int method1606();

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public abstract void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lv;I)V")
    public abstract void method1618(class149 arg0, int arg1);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([[IIIIII)V")
    public final void method1729(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1730(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1730(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1730(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1730(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1602(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1604(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1600(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "()I")
    public abstract int method1596();

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([[III)I")
    private static final int method1730(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "()V")
    public abstract void method1615();

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "()I")
    public abstract int method1598();

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public abstract void method1604(int arg0);
}
