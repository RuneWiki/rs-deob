import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class81 extends class128 {

    @OriginalMember(owner = "client!ec", name = "ub", descriptor = "Le;")
    public static class191 field1372 = class54.method368("Art", 2047);

    @OriginalMember(owner = "client!ec", name = "sb", descriptor = "Le;")
    private static class191 field1370 = class54.method368("Loading config )2 ", 2047);

    @OriginalMember(owner = "client!ec", name = "lb", descriptor = "Le;")
    public static class191 field1363 = field1370;

    @OriginalMember(owner = "client!ec", name = "nb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ec", name = "qb", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ec", name = "rb", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!ec", name = "tb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ec", name = "vb", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ec", name = "mb", descriptor = "Lrg;")
    public static class236 field1364;

    @OriginalMember(owner = "client!ec", name = "ob", descriptor = "Z")
    public static boolean field1366;

    @OriginalMember(owner = "client!ec", name = "pb", descriptor = "Z")
    public static boolean field1367;

    @OriginalMember(owner = "client!ec", name = "kb", descriptor = "[[[B")
    public static byte[][][] field1362;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(BI)I")
    public static final int method515(byte arg0, int arg1) {
        ++field1365;
        if (arg0 > -108) {
            method516(-30);
        }
        return arg1 == 16711935 ? -1 : class126.method851(-29413, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "(I)V")
    public static void method516(int arg0) {
        field1364 = null;
        field1370 = null;
        field1363 = null;
        field1362 = null;
        field1372 = null;
        if (arg0 != 1) {
            method515((byte) -7, 98);
        }
    }

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "(I)V")
    public static final void method517(int arg0) {
        ++field1373;
        if (class263.field4670 != null) {
            class263.field4670.method174(-107);
            class263.field4670 = null;
        }
        class169.method1145((byte) -81);
        class197.method1387();
        int var1 = 22 % ((arg0 - -76) / 42);
        for (int var2 = 0; var2 < 4; ++var2) {
            class82.field1383[var2].method1497((byte) -12);
        }
        class241.method1689(0);
        System.gc();
        class28.method204(true, 2);
        class141.field2360 = false;
        class11.field128 = -1;
        class13.method91(true, (byte) 101);
        class193.field3474 = 0;
        class225.field4061 = 0;
        class71.field1241 = false;
        for (int var3 = 0; ~var3 > ~class152.field2608.length; ++var3) {
            class152.field2608[var3] = null;
        }
        class260.field4586 = 0;
        class197.field3514 = 0;
        for (int var4 = 0; var4 < 2048; ++var4) {
            class245.field4357[var4] = null;
            class134.field2254[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; ++var5) {
            class115.field1901[var5] = null;
        }
        for (int var6 = 0; ~var6 > -5; ++var6) {
            for (int var7 = 0; ~var7 > -105; ++var7) {
                for (int var8 = 0; var8 < 104; ++var8) {
                    class75.field1281[var6][var7][var8] = null;
                }
            }
        }
        class250.method1744(1);
        class92.field1509 = 0;
        class245.method1712(-10697);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        int[][] var3 = super.field2053.method1775((byte) -99, arg0);
        if (super.field2053.field4558 && this.method873((byte) 108)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = arg0 % super.field2125 * super.field2125;
            int[] var7 = var3[1];
            for (int var8 = 0; class64.field1132 > var8; ++var8) {
                int var9 = super.field2135[var8 % super.field2121 + var6];
                var5[var8] = class167.method1128(var9, 255) << 4;
                var7[var8] = class167.method1128(var9 >> 4, 4080);
                var4[var8] = class167.method1128(var9, 16711680) >> 12;
            }
        }
        if (arg1 != -7) {
            field1370 = null;
        }
        ++field1369;
        return var3;
    }
}
