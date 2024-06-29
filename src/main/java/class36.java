import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class36 extends class139 {

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Z")
    public boolean field646 = false;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public abstract void method223(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZZ)Lme;")
    public abstract class36 method224(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()I")
    public abstract int method225();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lqf;IZ)V")
    public abstract void method226(class77 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()V")
    public abstract void method227();

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()I")
    public abstract int method228();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()I")
    public abstract int method183();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public abstract void method229(int arg0);

    @OriginalMember(owner = "client!me", name = "f", descriptor = "()I")
    public abstract int method230();

    @OriginalMember(owner = "client!me", name = "g", descriptor = "()I")
    public abstract int method231();

    @OriginalMember(owner = "client!me", name = "h", descriptor = "()I")
    public abstract int method232();

    @OriginalMember(owner = "client!me", name = "i", descriptor = "()V")
    public abstract void method233();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V")
    public abstract void method235(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([[III)I")
    private static final int method236(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!me", name = "j", descriptor = "()V")
    public abstract void method237();

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(ZZ)Lme;")
    public abstract class36 method238(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lqf;I)V")
    public abstract void method239(class77 arg0, int arg1);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([[IIIIII)V")
    public final void method240(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method236(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method236(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method236(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method236(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method242(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method229(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method241(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(III)V")
    public abstract void method241(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public abstract void method242(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lqf;ILqf;I[IZ)V")
    public abstract void method243(class77 arg0, int arg1, class77 arg2, int arg3, int[] arg4, boolean arg5);
}
