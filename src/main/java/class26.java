import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class26 extends class51 {

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Z")
    public boolean field331 = false;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([[IIIIII)V", line = 10)
    public final void method165(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method171(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method171(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method171(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method171(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method173(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method177(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method166(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([[III)I", line = 80)
    private static final int method171(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 108)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldg;IZ)V")
    public abstract void method159(class172 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldg;ILdg;I[IZ)V")
    public abstract void method160(class172 arg0, int arg1, class172 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZ)Lha;")
    public abstract class26 method161(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method163();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V")
    public abstract void method166(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()I")
    public abstract int method167();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()I")
    public abstract int method168();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldg;I)V")
    public abstract void method169(class172 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)V")
    public abstract void method170(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIJILfk;)V")
    public abstract void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()I")
    public abstract int method172();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()I")
    public abstract int method154();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method173(int arg0);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "()V")
    public abstract void method174();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(ZZ)Lha;")
    public abstract class26 method175(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method176();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public abstract void method177(int arg0);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method178();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()I")
    public abstract int method179();
}
