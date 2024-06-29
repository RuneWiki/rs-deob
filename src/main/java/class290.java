import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class290 {

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lce;")
    public static class126 field4807 = class206.method1445(-7923, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lce;")
    private static class126 field4803 = class206.method1445(-7923, "glow1:");

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lce;")
    public static class126 field4801 = class206.method1445(-7923, "clignotant1:");

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lce;")
    public static class126 field4808 = field4803;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field4810 = 0;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "Lce;")
    public static class126 field4812 = field4803;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
    public static int[] field4814 = new int[100];

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 4)
    public static void method1922(int arg0) {
        if (arg0 != 104) {
            return;
        }
        field4803 = null;
        field4812 = null;
        field4808 = null;
        field4814 = null;
        field4801 = null;
        field4807 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)V", line = 30)
    public static final void method1923(boolean arg0, int arg1) {
        class218.field3659 = new int[104];
        class259.field4347 = new int[104];
        class4.field32 = new int[104];
        class245.field4147 = 99;
        class294.field4906 = new int[104];
        class259.field4354 = new int[104];
        field4809++;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class119.field2003 = new int[var2][105][105];
        if (arg1 != 32) {
            method1924(104, -10, true, 29, -36, 34, -35, 73, -1.9796885F);
        }
        class122.field2036 = new byte[var2][105][105];
        class65.field1103 = new byte[var2][104][104];
        class17.field238 = new byte[var2][104][104];
        class172.field3048 = new byte[var2][104][104];
        class122.field2042 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZIIIIIF)[[I", line = 74)
    public static final int[][] method1924(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        field4804++;
        int[][] var9 = new int[arg0][arg7];
        class91 var10 = new class91();
        var10.field1436 = (int) (arg8 * 4096.0F);
        var10.field1440 = arg2;
        var10.field1433 = arg1;
        var10.field1438 = arg6;
        var10.field1442 = arg3;
        var10.method2((byte) 84);
        class320.method2228(arg0, arg7, -98);
        int var11 = 0;
        int var12 = 61 / ((41 - arg4) / 62);
        while (arg0 > var11) {
            var10.method633(var9[var11], var11, true);
            var11++;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZZIZ)V", line = 114)
    public static final void method1925(int arg0, boolean arg1, boolean arg2, int arg3, boolean arg4) {
        field4805++;
        if (arg2) {
            method1923(false, -94);
        }
        class50.method321(0, arg0, arg1, arg4, class140.field2552.length - 1, (byte) -51, arg3);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZ[Lwd;II)V", line = 130)
    public static final void method1926(int arg0, int arg1, boolean arg2, class112[] arg3, int arg4, int arg5) {
        if (arg4 <= 107) {
            method1923(false, 59);
        }
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class112 var7 = arg3[var6];
            if (var7 != null && var7.field1865 == arg0) {
                class285.method1898(arg5, var7, arg1, arg2, (byte) -21);
                class110.method723(arg5, var7, 94, arg1);
                if (var7.field1880 > var7.field1814 - var7.field1766) {
                    var7.field1880 = var7.field1814 - var7.field1766;
                }
                if (var7.field1880 < 0) {
                    var7.field1880 = 0;
                }
                if (var7.field1827 > (var7.field1791 - var7.field1753)) {
                    var7.field1827 = var7.field1791 - var7.field1753;
                }
                if (var7.field1827 < 0) {
                    var7.field1827 = 0;
                }
                if (var7.field1780 == 0) {
                    class304.method2039(arg2, (byte) 11, var7);
                }
            }
        }
        field4813++;
    }
}
