import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class155 extends class175 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Z")
    public boolean field2652 = false;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([[IIIIII)V", line = 4)
    public final void method1109(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1110(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1110(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1110(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1110(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method217(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method241(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method224(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([[III)I", line = 72)
    private static final int method1110(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIII)V", line = 94)
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
    public abstract void method224(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "()I")
    public abstract int method222();

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "()V")
    public abstract void method230();

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpb;IZ)V")
    public abstract void method198(class290 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpb;I)V")
    public abstract void method225(class290 arg0, int arg1);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public abstract void method217(int arg0);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZ)Lpa;")
    public abstract class155 method244(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public abstract void method240(int arg0);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lpb;ILpb;I[IZ)V")
    public abstract void method190(class290 arg0, int arg1, class290 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "()I")
    public abstract int method194();

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "()V")
    public abstract void method201();

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(ZZ)Lpa;")
    public abstract class155 method196(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "()I")
    public abstract int method237();

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIIJILab;)V")
    public abstract void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "()I")
    public abstract int method238();

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "()I")
    public abstract int method186();

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)V")
    public abstract void method204(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public abstract void method241(int arg0);

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "()V")
    public abstract void method210();
}
