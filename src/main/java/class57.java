import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class57 extends class176 {

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Z")
    public boolean field844 = false;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([[III)I", line = 14)
    private static final int method433(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([[IIIIII)V", line = 46)
    public final void method443(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method433(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method433(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method433(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method433(arg0, arg1 + var19, arg3 + var20);
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
                this.method432(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method441(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    public abstract void method425();

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()I")
    public abstract int method426();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public abstract void method428(int arg0);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZ)Lca;")
    public abstract class57 method429(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
    public abstract void method430();

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(ZZ)Lca;")
    public abstract class57 method431(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public abstract void method432(int arg0);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ld;IZ)V")
    public abstract void method434(class40 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "()I")
    public abstract int method435();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public abstract int method152();

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "()I")
    public abstract int method436();

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "()I")
    public abstract int method437();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "()V")
    public abstract void method438();

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public abstract void method439(int arg0);

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "()I")
    public abstract int method440();

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
    public abstract void method441(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ld;I)V")
    public abstract void method442(class40 arg0, int arg1);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)V")
    public abstract void method444(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ld;ILd;I[IZ)V")
    public abstract void method445(class40 arg0, int arg1, class40 arg2, int arg3, int[] arg4, boolean arg5);
}
