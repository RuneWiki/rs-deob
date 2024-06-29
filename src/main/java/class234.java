import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class234 extends class171 {

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
    public boolean field3956 = false;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([[III)I", line = 14)
    private static final int method1706(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([[IIIIII)V", line = 41)
    public final void method1707(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1706(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1706(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1706(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1706(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method407(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method445(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method410(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()I")
    public abstract int method411();

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()I")
    public abstract int method453();

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lme;ILme;I[IZ)V")
    public abstract void method441(class176 arg0, int arg1, class176 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()I")
    public abstract int method430();

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZZ)Lcc;")
    public abstract class234 method451(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
    public abstract void method455(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "()V")
    public abstract void method454();

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "()V")
    public abstract void method413();

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "()I")
    public abstract int method417();

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public abstract void method407(int arg0);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lme;I)V")
    public abstract void method425(class176 arg0, int arg1);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public abstract void method445(int arg0);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()I")
    public abstract int method443();

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "()V")
    public abstract void method442();

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(ZZ)Lcc;")
    public abstract class234 method419(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lme;IZ)V")
    public abstract void method418(class176 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
    public abstract void method410(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    public abstract void method422(int arg0);

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "()I")
    public abstract int method412();
}
