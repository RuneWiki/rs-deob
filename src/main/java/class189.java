import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class189 extends class126 {

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "Z")
    public boolean field3435 = false;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()V")
    public abstract void method435();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
    public final void method214(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([[III)I")
    private static final int method1304(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
    public abstract int method405();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZ)Lvc;")
    public abstract class189 method425(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public abstract void method428(int arg0);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "()I")
    public abstract int method409();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Laj;ILaj;I[IZ)V")
    public abstract void method426(class47 arg0, int arg1, class47 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "()I")
    public abstract int method414();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Laj;IZ)V")
    public abstract void method418(class47 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "()I")
    public abstract int method421();

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(ZZ)Lvc;")
    public abstract class189 method427(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "()I")
    public abstract int method420();

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)V")
    public abstract void method406(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
    public abstract void method413(int arg0);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Laj;I)V")
    public abstract void method430(class47 arg0, int arg1);

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([[IIIIII)V")
    public final void method1305(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1304(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1304(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1304(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1304(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method428(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method424(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method433(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(III)V")
    public abstract void method433(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "()V")
    public abstract void method412();

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIJILmd;)V")
    public abstract void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class221 arg10);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
    public abstract void method424(int arg0);

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "()V")
    public abstract void method408();

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
    public abstract int method216();
}
