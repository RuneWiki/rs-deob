import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class119 extends class258 {

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
    public boolean field1730 = false;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([[IIIIII)V")
    public final void method724(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method744(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method744(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method744(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method744(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method737(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method739(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method729(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "()I")
    public abstract int method725();

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "()V")
    public abstract void method726();

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "()I")
    public abstract int method727();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZZ)Loc;")
    public abstract class119 method728(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(III)V")
    public abstract void method729(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "()I")
    public abstract int method730();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public abstract void method731(int arg0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsf;ILsf;I[IZ)V")
    public abstract void method732(class218 arg0, int arg1, class218 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "()V")
    public abstract void method733();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()I")
    public abstract int method266();

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(ZZ)Loc;")
    public abstract class119 method734(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "()I")
    public abstract int method735();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public abstract void method737(int arg0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsf;IZ)V")
    public abstract void method738(class218 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public abstract void method739(int arg0);

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "()I")
    public abstract int method740();

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lsf;I)V")
    public abstract void method741(class218 arg0, int arg1);

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "()V")
    public abstract void method742();

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(III)V")
    public abstract void method743(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([[III)I")
    private static final int method744(int[][] arg0, int arg1, int arg2) {
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
}
