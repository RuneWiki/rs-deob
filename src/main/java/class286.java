import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class286 extends class216 {

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Z")
    public boolean field4708 = false;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([[IIIIII)V", line = 7)
    public final void method1966(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1967(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1967(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1967(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1967(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1721(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1739(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1734(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([[III)I", line = 80)
    private static final int method1967(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V", line = 105)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()I")
    public abstract int method1726();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public abstract void method1728(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()I")
    public abstract int method182();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIIJILbn;)V")
    public abstract void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZZ)Lv;")
    public abstract class286 method1713(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public abstract void method1732(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lmb;ILmb;I[IZ)V")
    public abstract void method1714(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
    public abstract void method1730();

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()I")
    public abstract int method1723();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lmb;IZ)V")
    public abstract void method1716(class145 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()I")
    public abstract int method1720();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(ZZ)Lv;")
    public abstract class286 method1727(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lmb;I)V")
    public abstract void method1715(class145 arg0, int arg1);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "()V")
    public abstract void method1710();

    @OriginalMember(owner = "client!v", name = "h", descriptor = "()V")
    public abstract void method1733();

    @OriginalMember(owner = "client!v", name = "i", descriptor = "()I")
    public abstract int method1729();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public abstract void method1721(int arg0);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
    public abstract void method1734(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public abstract void method1739(int arg0);

    @OriginalMember(owner = "client!v", name = "j", descriptor = "()I")
    public abstract int method1717();
}
