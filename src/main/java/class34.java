import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class34 extends class280 {

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Z")
    public boolean field532 = false;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([[IIIIII)V", line = 13)
    public final void method238(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method247(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method247(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method247(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method247(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method252(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method246(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method243(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([[III)I", line = 87)
    private static final int method247(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V")
    public abstract void method230();

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()I")
    public abstract int method231();

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()I")
    public abstract int method232();

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lcj;ILcj;I[IZ)V")
    public abstract void method233(class282 arg0, int arg1, class282 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "()V")
    public abstract void method234();

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "()I")
    public abstract int method236();

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "()I")
    public abstract int method237();

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZZ)Lkl;")
    public abstract class34 method239(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "()V")
    public abstract void method240();

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(ZZ)Lkl;")
    public abstract class34 method241(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(III)V")
    public abstract void method243(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lcj;I)V")
    public abstract void method244(class282 arg0, int arg1);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public abstract void method245(int arg0);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public abstract void method246(int arg0);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()I")
    public abstract int method248();

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "()I")
    public abstract int method249();

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lcj;IZ)V")
    public abstract void method250(class282 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(III)V")
    public abstract void method251(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
    public abstract void method252(int arg0);
}
