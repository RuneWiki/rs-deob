import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class196 extends class114 {

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Z")
    public boolean field3364 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([[IIIIII)V", line = 12)
    public final void method1393(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1394(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1394(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1394(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1394(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method218(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method212(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method240(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([[III)I", line = 80)
    private static final int method1394(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V", line = 101)
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "()I")
    public abstract int method222();

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "()I")
    public abstract int method242();

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "()I")
    public abstract int method215();

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public abstract void method218(int arg0);

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "()V")
    public abstract void method239();

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "()V")
    public abstract void method216();

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(III)V")
    public abstract void method240(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(III)V")
    public abstract void method231(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "()I")
    public abstract int method229();

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIJILqj;)V")
    public abstract void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class211 arg10);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZZ)Lwi;")
    public abstract class196 method226(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public abstract void method233(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lfd;I)V")
    public abstract void method227(class219 arg0, int arg1);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(ZZ)Lwi;")
    public abstract class196 method217(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
    public abstract void method212(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lfd;ILfd;I[IZ)V")
    public abstract void method210(class219 arg0, int arg1, class219 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "()V")
    public abstract void method235();

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "()I")
    public abstract int method225();

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "()I")
    public abstract int method236();

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lfd;IZ)V")
    public abstract void method208(class219 arg0, int arg1, boolean arg2);
}
