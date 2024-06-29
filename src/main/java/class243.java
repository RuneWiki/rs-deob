import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class243 extends class262 {

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Z")
    public boolean field4199 = false;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([[III)I", line = 26)
    private static final int method1771(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([[IIIIII)V", line = 45)
    public final void method1772(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1771(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1771(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1771(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1771(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method42(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method47(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method29(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()V")
    public abstract void method21();

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lpf;IZ)V")
    public abstract void method46(class78 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(III)V")
    public abstract void method23(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!am", name = "d", descriptor = "()I")
    public abstract int method32();

    @OriginalMember(owner = "client!am", name = "e", descriptor = "()V")
    public abstract void method31();

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!am", name = "f", descriptor = "()V")
    public abstract void method45();

    @OriginalMember(owner = "client!am", name = "g", descriptor = "()I")
    public abstract int method19();

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public abstract void method47(int arg0);

    @OriginalMember(owner = "client!am", name = "h", descriptor = "()I")
    public abstract int method30();

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()I")
    public abstract int method48();

    @OriginalMember(owner = "client!am", name = "i", descriptor = "()I")
    public abstract int method39();

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lpf;I)V")
    public abstract void method51(class78 arg0, int arg1);

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public abstract void method27(int arg0);

    @OriginalMember(owner = "client!am", name = "j", descriptor = "()I")
    public abstract int method55();

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)V")
    public abstract void method42(int arg0);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZZ)Lam;")
    public abstract class243 method34(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(III)V")
    public abstract void method29(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(ZZ)Lam;")
    public abstract class243 method24(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lpf;ILpf;I[IZ)V")
    public abstract void method36(class78 arg0, int arg1, class78 arg2, int arg3, int[] arg4, boolean arg5);
}
