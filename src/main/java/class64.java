import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class64 extends class203 {

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Lmh;")
    public static class62 field974 = class201.method1405(true, "event_opbase");

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "[J")
    public static long[] field963 = new long[200];

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "Lmh;")
    private static class62 field971 = class201.method1405(true, " has logged out)3");

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "Lmh;")
    public static class62 field967 = class201.method1405(true, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "Lmh;")
    public static class62 field975 = field971;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lmh;")
    public class62 field980;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "[I")
    public int[] field968;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "[I")
    public int[] field970;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "[Led;")
    public class49[] field973;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "[Lmh;")
    public class62[] field976;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)I", line = 7)
    public static final int method460(byte arg0, int arg1, int arg2) {
        field965++;
        int var3 = class155.method1145(arg1 + 91923, arg2 + 45365, 4, (byte) -91) - (-(class155.method1145(arg1 + 37821, arg2 - -10294, 2, (byte) -71) - 128 >> 1) + -(class155.method1145(arg1, arg2, 1, (byte) -87) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 >= -95) {
            field963 = (long[]) null;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZI)I", line = 35)
    public static final int method461(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field975 = (class62) null;
        }
        field978++;
        int var4 = class23.field246[class67.method496(arg0, arg3)];
        if (arg1 > 0) {
            int var5 = class23.field248.method179(arg1 & 0xFFFF, (byte) -44);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 <= 127) {
                    var6 = arg3 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class23.field248.method188(arg1 & 0xFFFF, 0);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var10 > 65535) {
                    var10 = 65535;
                }
                var4 = ((var10 & 0x3100FF00) << 8) + (var12 >> 8) + (var11 & 0xFF00);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V", line = 118)
    public static final void method462(byte arg0, int arg1) {
        field979++;
        if (arg1 == -1 && !class91.field1429) {
            class237.method1673(-129);
        } else if (arg1 != -1 && (class182.field2909 != arg1 || !class109.method841(123)) && class100.field1650 != 0 && !class91.field1429) {
            class278.method1900(class100.field1650, false, 0, arg1, 0, 2, class163.field2649);
        }
        class182.field2909 = arg1;
        int var2 = -102 % ((arg0 - 42) / 48);
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(B)V", line = 142)
    public static final void method463(byte arg0) {
        if (arg0 != 54) {
            method462((byte) -88, -125);
        }
        field964++;
        class219.field3773.method1395((byte) -43);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 167)
    public static void method464(boolean arg0) {
        field963 = null;
        field974 = null;
        if (arg0) {
            method460((byte) -89, 88, 70);
        }
        field967 = null;
        field971 = null;
        field975 = null;
    }
}
