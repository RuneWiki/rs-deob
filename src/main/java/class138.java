import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class138 extends class123 {

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Z")
    public boolean field2236 = false;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([[III)I", line = 12)
    private static final int method1042(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "([[IIIIII)V", line = 36)
    public final void method1043(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1042(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1042(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1042(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1042(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method497(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method487(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method477(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
    public abstract int method478();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZ)Lab;")
    public abstract class138 method495(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
    public abstract void method477(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lqd;ILqd;I[IZ)V")
    public abstract void method491(class170 arg0, int arg1, class170 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(ZZ)Lab;")
    public abstract class138 method482(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
    public abstract void method501();

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()I")
    public abstract int method503();

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public abstract void method487(int arg0);

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V")
    public abstract void method486();

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()I")
    public abstract int method504();

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "()V")
    public abstract void method488();

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public abstract void method497(int arg0);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lqd;IZ)V")
    public abstract void method475(class170 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(III)V")
    public abstract void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public abstract void method500(int arg0);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "()I")
    public abstract int method479();

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lqd;I)V")
    public abstract void method493(class170 arg0, int arg1);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
    public abstract int method278();

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "()I")
    public abstract int method489();
}
