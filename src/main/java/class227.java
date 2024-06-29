import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class227 extends class177 {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Z")
    public boolean field3774 = false;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([[III)I", line = 15)
    private static final int method1572(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([[IIIIII)V", line = 37)
    public final void method1573(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1572(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1572(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1572(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1572(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1334(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1376(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1353(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public abstract void method1349(int arg0);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public abstract void method1334(int arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZZ)Lof;")
    public abstract class227 method1360(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
    public abstract void method1332();

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)V")
    public abstract void method1353(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()V")
    public abstract void method1356();

    @OriginalMember(owner = "client!of", name = "e", descriptor = "()I")
    public abstract int method1338();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lmf;IZ)V")
    public abstract void method1381(class42 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!of", name = "f", descriptor = "()I")
    public abstract int method1345();

    @OriginalMember(owner = "client!of", name = "g", descriptor = "()I")
    public abstract int method1363();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lmf;I)V")
    public abstract void method1374(class42 arg0, int arg1);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
    public abstract void method1352(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "()I")
    public abstract int method1339();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()I")
    public abstract int method176();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!of", name = "i", descriptor = "()I")
    public abstract int method1350();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lmf;ILmf;I[IZ)V")
    public abstract void method1344(class42 arg0, int arg1, class42 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public abstract void method1376(int arg0);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "()V")
    public abstract void method1336();

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(ZZ)Lof;")
    public abstract class227 method1373(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
