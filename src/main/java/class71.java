import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class71 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Ldd;")
    public static class35 field1694 = class180.method1196((byte) -127, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ldd;")
    private static class35 field1695 = class180.method1196((byte) 126, "shake:");

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Ldd;")
    public static class35 field1693 = field1695;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Ldd;")
    public static class35 field1690 = field1695;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lld;")
    public static class111 field1689 = new class111(5);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lth;")
    public static class187 field1698 = new class187();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[S")
    public static short[] field1699 = new short[] { 32, 26, 39, 50, 24, 29, 20, 47 };

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Ldd;")
    public static class35 field1703 = class180.method1196((byte) 127, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Ldd;")
    private static class35 field1701 = class180.method1196((byte) 127, "The server is being updated)3");

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Ldd;")
    public static class35 field1702 = field1701;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "[Z")
    public static boolean[] field1705 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
    public static int[] field1700 = new int[128];

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Ldd;")
    public static class35 field1706 = class180.method1196((byte) -62, "::clientdrop");

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lkd;")
    public static class102 field1704;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIIII)V")
    public static final void method568(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1697++;
        int var7 = 2048 - arg5 & 0x7FF;
        int var8 = 0;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = arg6;
        if (var9 != 0) {
            int var12 = class11.field201[var9];
            int var13 = class11.field211[var9];
            int var14 = var10 * var12 - arg6 * var13 >> 16;
            var11 = var10 * var13 + arg6 * var12 >> 16;
            var10 = var14;
        }
        if (var7 != 0) {
            int var15 = class11.field201[var7];
            int var16 = class11.field211[var7];
            int var17 = var8 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var8 * var16 >> 16;
            var8 = var17;
        }
        class8.field122 = arg3 - var11;
        class55.field1246 = arg5;
        class116.field2593 = arg4;
        class26.field571 = arg2 - var8;
        if (arg1 > -47) {
            field1704 = null;
        }
        class51.field1150 = arg0 - var10;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method569(int arg0, int arg1) {
        field1692++;
        if (arg1 == 100 && class38.field848 > 0) {
            byte[] var2 = class68.field1599[--class38.field848];
            class68.field1599[class38.field848] = null;
            return var2;
        } else if (arg1 == 5000 && class125.field2729 > 0) {
            byte[] var3 = class98.field2167[--class125.field2729];
            class98.field2167[class125.field2729] = null;
            return var3;
        } else if (arg1 == 30000 && class107.field2391 > 0) {
            byte[] var4 = class42.field915[--class107.field2391];
            class42.field915[class107.field2391] = null;
            return var4;
        } else {
            if (arg0 != 15366) {
                field1707 = -5;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method570(int arg0) {
        field1703 = null;
        field1698 = null;
        field1701 = null;
        field1694 = null;
        field1704 = null;
        field1695 = null;
        field1693 = null;
        field1699 = null;
        field1700 = null;
        field1690 = null;
        field1706 = null;
        if (arg0 != 2) {
            field1703 = null;
        }
        field1702 = null;
        field1689 = null;
        field1705 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
    public static final int method571(int arg0, int arg1, int arg2) {
        field1696++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg2 != 24) {
                field1695 = null;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }
}
