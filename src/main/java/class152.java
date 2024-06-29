import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class152 extends class231 {

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Z")
    public boolean field2354 = false;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([[IIIIII)V", line = 5)
    public final void method1039(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1040(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1040(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1040(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1040(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method666(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method657(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method710(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([[III)I", line = 73)
    private static final int method1040(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public abstract void method684(int arg0);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public abstract void method666(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lid;ILid;I[IZ)V")
    public abstract void method680(class102 arg0, int arg1, class102 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
    public abstract void method710(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
    public abstract void method691();

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "()I")
    public abstract int method687();

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public abstract void method657(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lid;I)V")
    public abstract void method678(class102 arg0, int arg1);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "()I")
    public abstract int method659();

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "()V")
    public abstract void method658();

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()I")
    public abstract int method116();

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)Lfc;")
    public abstract class152 method671(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "()I")
    public abstract int method690();

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(ZZ)Lfc;")
    public abstract class152 method699(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "()I")
    public abstract int method708();

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(III)V")
    public abstract void method688(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lid;IZ)V")
    public abstract void method662(class102 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "()I")
    public abstract int method672();

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "()V")
    public abstract void method663();
}
