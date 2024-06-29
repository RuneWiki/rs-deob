import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class76 extends class139 {

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Z")
    public boolean field1566 = false;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()V")
    public abstract void method501();

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
    public abstract int method106();

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()I")
    public abstract int method503();

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)V")
    public abstract void method504(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "()I")
    public abstract int method505();

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lwf;I)V")
    public abstract void method506(class1 arg0, int arg1);

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public abstract void method507(int arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lwf;ILwf;I[IZ)V")
    public abstract void method508(class1 arg0, int arg1, class1 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "()I")
    public abstract int method509();

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZ)Lph;")
    public abstract class76 method510(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "()I")
    public abstract int method511();

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "()V")
    public abstract void method512();

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(III)V")
    public abstract void method513(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([[IIIIII)V")
    public final void method514(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method516(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method516(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method516(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method516(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method520(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method507(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method513(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lwf;IZ)V")
    public abstract void method515(class1 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([[III)I")
    private static final int method516(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZZ)Lph;")
    public abstract class76 method517(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "()I")
    public abstract int method518();

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "()V")
    public abstract void method519();

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public abstract void method520(int arg0);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public abstract void method521(int arg0);
}
