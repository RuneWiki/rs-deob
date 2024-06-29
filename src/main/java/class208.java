import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class208 extends class322 {

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Z")
    public boolean field3470 = false;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V", line = 10)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([[III)I", line = 15)
    private static final int method1575(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([[IIIIII)V", line = 37)
    public final void method1576(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1575(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1575(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1575(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1575(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1365(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1373(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1374(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lkd;ILkd;I[IZ)V")
    public abstract void method1393(class72 arg0, int arg1, class72 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()I")
    public abstract int method1360();

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()I")
    public abstract int method1392();

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public abstract void method1365(int arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lkd;IZ)V")
    public abstract void method1375(class72 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
    public abstract void method1398(int arg0);

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()V")
    public abstract void method1349();

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()I")
    public abstract int method1382();

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZZ)Lfg;")
    public abstract class208 method1367(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIIJILmk;)V")
    public abstract void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class284 arg10);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(III)V")
    public abstract void method1374(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "()V")
    public abstract void method1356();

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
    public abstract void method1373(int arg0);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(ZZ)Lfg;")
    public abstract class208 method1399(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "()V")
    public abstract void method1386();

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()I")
    public abstract int method325();

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "()I")
    public abstract int method1372();

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method1380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "()I")
    public abstract int method1391();

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(III)V")
    public abstract void method1357(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lkd;I)V")
    public abstract void method1376(class72 arg0, int arg1);
}
