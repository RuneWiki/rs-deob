import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class98 extends class16 {

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Z")
    public boolean field1817 = false;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([[III)I")
    private static final int method735(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([[IIIIII)V")
    public final void method736(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method735(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method735(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method735(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method735(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
        if (var26 != 0) {
            this.method755(var26);
        }
        int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
        if (var27 != 0) {
            this.method747(var27);
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method753(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZ)Lwg;")
    public abstract class98 method737(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lub;IZ)V")
    public abstract void method738(class227 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
    public abstract int method739();

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()V")
    public abstract void method740();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
    public abstract int method126();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lub;I)V")
    public abstract void method741(class227 arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "()V")
    public abstract void method742();

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(ZZ)Lwg;")
    public abstract class98 method743(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public abstract void method744(int arg0);

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "()I")
    public abstract int method745();

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(III)V")
    public abstract void method746(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public abstract void method747(int arg0);

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "()I")
    public abstract int method748();

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "()V")
    public abstract void method749();

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "()I")
    public abstract int method750();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lub;ILub;I[IZ)V")
    public abstract void method751(class227 arg0, int arg1, class227 arg2, int arg3, int[] arg4, boolean arg5);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(III)V")
    public abstract void method753(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "()I")
    public abstract int method754();

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
    public abstract void method755(int arg0);
}
