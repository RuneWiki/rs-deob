import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class289 extends class7 {

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Z")
    public boolean field4906 = false;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([[IIIIII)V", line = 8)
    public final void method1976(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1977(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1977(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1977(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1977(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1362(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1331(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1325(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([[III)I", line = 75)
    private static final int method1977(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lfm;IZ)V")
    public abstract void method1364(class42 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public abstract void method1362(int arg0);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()I")
    public abstract int method1370();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lfm;ILfm;I[IZ)V")
    public abstract void method1374(class42 arg0, int arg1, class42 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
    public abstract void method1325(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()V")
    public abstract void method1339();

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public abstract void method1331(int arg0);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "()V")
    public abstract void method1360();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()I")
    public abstract int method40();

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "()I")
    public abstract int method1346();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lfm;I)V")
    public abstract void method1348(class42 arg0, int arg1);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V")
    public abstract void method1334(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)Lhk;")
    public abstract class289 method1365(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "()V")
    public abstract void method1368();

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "()I")
    public abstract int method1358();

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(ZZ)Lhk;")
    public abstract class289 method1373(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public abstract void method1356(int arg0);

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "()I")
    public abstract int method1326();

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "()I")
    public abstract int method1327();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
