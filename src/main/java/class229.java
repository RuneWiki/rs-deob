import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class229 extends class57 {

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    private final int field3818;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    private final int field3827;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    private final int field3814;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    private final int field3820;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Lok;")
    public static class146 field3823 = class235.method1724(-12908, "mapfunction");

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Lok;")
    public static class146 field3819 = class235.method1724(-12908, "Objet d(Wabonn-Bs");

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field3821 = 0;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Loh;")
    public static class15 field3825;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 12)
    public final void method259(int arg0, int arg1, int arg2) {
        if (arg0 == -27128) {
            field3822++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIII)V", line = 21)
    public class229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3818 = arg2;
        this.field3827 = arg0;
        this.field3814 = arg3;
        this.field3820 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[Lok;)[Lok;", line = 33)
    public static final class146[] method1683(int arg0, class146[] arg1) {
        field3826++;
        class146[] var2 = new class146[5];
        int var3 = 63 % ((5 - arg0) / 60);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = class112.method758(-56, new class146[] { class82.method585(14744, var4), class26.field451 });
            if (arg1 != null && arg1[var4] != null) {
                var2[var4] = class112.method758(-123, new class146[] { var2[var4], arg1[var4] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BII)V", line = 63)
    public final void method258(byte arg0, int arg1, int arg2) {
        int var4 = this.field3827 * arg2 >> 12;
        if (arg0 != -27) {
            field3823 = (class146) null;
        }
        field3815++;
        int var5 = this.field3818 * arg2 >> 12;
        int var6 = this.field3820 * arg1 >> 12;
        int var7 = this.field3814 * arg1 >> 12;
        class294.method2095(var5, var6, 0, var4, this.field1001, var7);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V", line = 81)
    public final void method260(int arg0, int arg1, byte arg2) {
        field3816++;
        int var4 = this.field3818 * arg1 >> 12;
        int var5 = this.field3820 * arg0 >> 12;
        int var6 = this.field3827 * arg1 >> 12;
        int var7 = this.field3814 * arg0 >> 12;
        if (arg2 < 53) {
            field3825 = (class15) null;
        }
        class85.method592(var4, 896, var5, this.field1003, this.field1002, var6, var7, this.field1001);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V", line = 101)
    public static final void method1684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3817++;
        class40.method281(arg1, arg2 - arg0, class81.field1297[arg4], arg0 + arg2, arg3 ^ 0x2D6F);
        int var6 = arg5;
        int var7 = arg0 * arg0;
        int var8 = 0;
        int var9 = arg5 * arg5;
        int var10 = arg5 << 1;
        int var11 = var7 << 1;
        if (arg3 != 11624) {
            method1685(103);
        }
        int var12 = var9 - ((var10 - 1) * var11);
        int var13 = var9 << 1;
        int var14 = (1 - var10) * var7 + var13;
        int var15 = var7 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg5 << 1) - 3) * var11;
        int var18 = (var8 + 1) * var16;
        int var19 = (arg5 - 1) * var15;
        int var20 = ((var8 << 1) + 3) * var13;
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var20;
                    var12 += var18;
                    var20 += var16;
                    var18 += var16;
                    var8++;
                }
            }
            var6--;
            if (var12 < 0) {
                var8++;
                var12 += var18;
                var14 += var20;
                var20 += var16;
                var18 += var16;
            }
            int var21 = arg4 - var6;
            var14 += -var19;
            int var22 = arg2 + var8;
            var12 += -var17;
            int var23 = arg2 - var8;
            int var24 = arg4 + var6;
            var17 -= var15;
            class40.method281(arg1, var23, class81.field1297[var21], var22, 7);
            class40.method281(arg1, var23, class81.field1297[var24], var22, 7);
            var19 -= var15;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 201)
    public static void method1685(int arg0) {
        field3825 = null;
        field3823 = null;
        if (arg0 != 293977132) {
            field3825 = (class15) null;
        }
        field3819 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZI)Lkm;", line = 226)
    public static final class319 method1686(boolean arg0, int arg1) {
        field3824++;
        class319 var2 = (class319) class83.field1324.method1511((long) arg1, 115);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class147.field2504.method92(11, 0, arg1);
        class319 var4 = new class319();
        if (var3 != null) {
            var4.method2221(91, new class47(var3));
        }
        if (arg0) {
            field3821 = 87;
        }
        class83.field1324.method1509((long) arg1, 88, var4);
        return var4;
    }
}
