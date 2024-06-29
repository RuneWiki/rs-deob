import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class17 extends class119 {

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Z")
    public boolean field333 = false;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZ)Lna;")
    public abstract class17 method148(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()I")
    public abstract int method90();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lgk;I)V")
    public abstract void method149(class166 arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([[IIIIII)V")
    public final void method150(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method153(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method153(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method153(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method153(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method164(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method154(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method156(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
    public abstract void method151();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([[III)I")
    private static final int method153(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(ZZ)Lna;")
    public abstract class17 method155(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(III)V")
    public abstract void method156(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
    public abstract void method157();

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()I")
    public abstract int method158();

    @OriginalMember(owner = "client!na", name = "f", descriptor = "()I")
    public abstract int method159();

    @OriginalMember(owner = "client!na", name = "g", descriptor = "()I")
    public abstract int method160();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lgk;ILgk;I[IZ)V")
    public abstract void method161(class166 arg0, int arg1, class166 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(III)V")
    public abstract void method162(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!na", name = "h", descriptor = "()I")
    public abstract int method163();

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lgk;IZ)V")
    public abstract void method166(class166 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!na", name = "i", descriptor = "()V")
    public abstract void method167();

    @OriginalMember(owner = "client!na", name = "j", descriptor = "()I")
    public abstract int method168();
}
