import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class249 extends class208 {

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
    public boolean field4336 = false;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public abstract void method1573(int arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([[IIIIII)V")
    public final void method1696(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1697(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1697(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1697(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1697(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1599(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1573(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1596(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public abstract void method1599(int arg0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZZ)Lnb;")
    public abstract class249 method1592(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V")
    public abstract void method1596(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lcc;ILcc;I[IZ)V")
    public abstract void method1570(class32 arg0, int arg1, class32 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
    public abstract void method1585();

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public abstract void method1574(int arg0);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()I")
    public abstract int method1568();

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "()I")
    public abstract int method1588();

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)V")
    public abstract void method1578(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lcc;IZ)V")
    public abstract void method1593(class32 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "()V")
    public abstract void method1595();

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "()I")
    public abstract int method1584();

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([[III)I")
    private static final int method1697(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lcc;I)V")
    public abstract void method1583(class32 arg0, int arg1);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()I")
    public abstract int method190();

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "()I")
    public abstract int method1576();

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZZ)Lnb;")
    public abstract class249 method1581(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "()V")
    public abstract void method1577();

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "()I")
    public abstract int method1580();
}
