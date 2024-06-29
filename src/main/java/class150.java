import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class150 extends class51 {

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Z")
    public boolean field2751 = false;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZ)Lhg;")
    public abstract class150 method972(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()I")
    public abstract int method973();

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lik;I)V")
    public abstract void method974(class225 arg0, int arg1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lik;ILik;I[IZ)V")
    public abstract void method975(class225 arg0, int arg1, class225 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "()I")
    public abstract int method976();

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "()I")
    public abstract int method977();

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V")
    public abstract void method978(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIJILnc;)V")
    public abstract void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class125 arg10);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(ZZ)Lhg;")
    public abstract class150 method979(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public abstract void method980(int arg0);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "()V")
    public abstract void method981();

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public abstract void method982(int arg0);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()I")
    public abstract int method166();

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([[III)I")
    private static final int method983(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
    public final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "()I")
    public abstract int method984();

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([[IIIIII)V")
    public final void method985(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method983(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method983(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method983(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method983(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method988(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method982(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method978(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "()I")
    public abstract int method986();

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public abstract void method988(int arg0);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V")
    public abstract void method989(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "()V")
    public abstract void method990();

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lik;IZ)V")
    public abstract void method991(class225 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "()V")
    public abstract void method992();
}
