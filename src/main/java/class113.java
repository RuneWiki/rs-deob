import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class113 extends class290 {

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Z")
    public boolean field1950 = false;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V", line = 7)
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([[IIIIII)V", line = 11)
    public final void method807(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method808(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method808(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method808(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method808(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method307(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method290(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method312(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([[III)I", line = 77)
    private static final int method808(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lee;IZ)V")
    public abstract void method284(class284 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)V")
    public abstract void method312(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIJ)V")
    public abstract void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public abstract void method290(int arg0);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()I")
    public abstract int method282();

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZ)Lke;")
    public abstract class113 method288(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public abstract void method307(int arg0);

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()I")
    public abstract int method292();

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I")
    public abstract int method95();

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIJILac;)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10);

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()V")
    public abstract void method316();

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "()V")
    public abstract void method297();

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)V")
    public abstract void method304(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "()V")
    public abstract void method299();

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "()I")
    public abstract int method289();

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lee;I)V")
    public abstract void method310(class284 arg0, int arg1);

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "()I")
    public abstract int method302();

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(ZZ)Lke;")
    public abstract class113 method313(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public abstract void method306(int arg0);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "()I")
    public abstract int method314();

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lee;ILee;I[IZ)V")
    public abstract void method286(class284 arg0, int arg1, class284 arg2, int arg3, int[] arg4, boolean arg5);
}
