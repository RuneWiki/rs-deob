import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public abstract class class70 extends class165 {

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Z")
    public boolean field1333 = false;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([[III)I")
    private static final int method495(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lph;I)V")
    public abstract void method496(class63 arg0, int arg1);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([[IIIIII)V")
    public final void method497(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method495(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method495(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method495(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method495(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method502(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method499(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method504(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V")
    public abstract void method498();

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public abstract void method499(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()I")
    public abstract int method21();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lph;ILph;I[IZ)V")
    public abstract void method501(class63 arg0, int arg1, class63 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
    public abstract void method502(int arg0);

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)V")
    public abstract void method503(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)V")
    public abstract void method504(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lph;IZ)V")
    public abstract void method505(class63 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)V")
    public abstract void method506(int arg0);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()I")
    public abstract int method507();

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "()I")
    public abstract int method508();

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "()I")
    public abstract int method509();

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "()I")
    public abstract int method510();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZ)Lra;")
    public abstract class70 method511(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "()V")
    public abstract void method512();

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "()I")
    public abstract int method513();

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(ZZ)Lra;")
    public abstract class70 method514(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "()V")
    public abstract void method515();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);
}
