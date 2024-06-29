import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class28 extends class293 {

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Z")
    public boolean field412 = false;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([[IIIIII)V", line = 13)
    public final void method209(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method210(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method210(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method210(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method210(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method221(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method203(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method223(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([[III)I", line = 69)
    private static final int method210(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()I")
    public abstract int method201();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public abstract void method203(int arg0);

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()I")
    public abstract int method204();

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "()I")
    public abstract int method205();

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
    public abstract void method206(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "()V")
    public abstract void method207();

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "()I")
    public abstract int method208();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lla;ILla;I[IZ)V")
    public abstract void method211(class113 arg0, int arg1, class113 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "()I")
    public abstract int method213();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lla;I)V")
    public abstract void method215(class113 arg0, int arg1);

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "()V")
    public abstract void method216();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZZ)Lec;")
    public abstract class28 method217(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZZ)Lec;")
    public abstract class28 method218(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lla;IZ)V")
    public abstract void method219(class113 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "()V")
    public abstract void method220();

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public abstract void method221(int arg0);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public abstract void method222(int arg0);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)V")
    public abstract void method223(int arg0, int arg1, int arg2);
}
