import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class82 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[J")
    public static long[] field1513 = new long[256];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[I")
    public static int[] field1516 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Ljf;")
    public static class229 field1519;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Ljf;")
    public static class229 field1521;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Ljf;")
    public static class229 field1520;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lkf;")
    public static class225 field1517;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "[[[B")
    public static byte[][][] field1515;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 4)
    public static void method577(int arg0) {
        field1515 = (byte[][][]) null;
        field1520 = null;
        field1516 = null;
        field1519 = null;
        if (arg0 != 1) {
            method584(80, 87, -123);
        }
        field1517 = null;
        field1521 = null;
        field1513 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1513[var0] = var1;
        }
        field1519 = class212.method1457((byte) 122, "::serverjs5drop");
        field1521 = class212.method1457((byte) 101, "glissement:");
        field1520 = class212.method1457((byte) 120, "name_icons");
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIILek;IZI)V", line = 30)
    public static final void method578(boolean arg0, int arg1, int arg2, class185 arg3, int arg4, boolean arg5, int arg6) {
        class211.field3634 = arg4;
        field1514++;
        class240.field4230 = arg3;
        class132.field2321 = arg2;
        class184.field3191 = arg5;
        class165.field2835 = arg6;
        class186.field3267 = arg1;
        class318.field5373 = 1;
        if (!arg0) {
            field1519 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V", line = 52)
    public static final void method580(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < class126.field2238; var2++) {
            long var3 = (long) class283.field4858[var2] << 32 | 0x20000000L;
            class331 var5 = class331.field5637[class283.field4858[var2]];
            if (var5 != null && var5.method302(0) && arg1 == var5.field5631.field2934 && var5.field5631.method1159(false)) {
                int var6 = var5.field1983 >> 7;
                int var7 = var5.field2028 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.method299(true) == 1 && (var5.field1983 & 0x7F) == 64 && (var5.field2028 & 0x7F) == 64) {
                        if (class26.field474[var6][var7] == class295.field5049) {
                            continue;
                        }
                        class26.field474[var6][var7] = class295.field5049;
                    }
                    if (!var5.field5631.field2907) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field1973 = class282.method1984((byte) -128, var5.field2028, var5.field1983, class16.field254);
                    class106.method719(class16.field254, var5.field1983, var5.field2028, var5.field1973, (var5.method299(true) - 1) * 64 + 60, var5, var5.field1987, var3, var5.field2034);
                }
            }
        }
        if (arg0 >= -35) {
            method578(true, 127, 113, (class185) null, -104, true, 85);
        }
        field1518++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Ljf;", line = 99)
    public static final class229 method581(int arg0, int arg1, int arg2) {
        int var3 = arg2 - arg0;
        field1512++;
        if (var3 < -9) {
            return class150.field2603;
        } else if (var3 < -6) {
            return class123.field2175;
        } else if (var3 < -3) {
            return class329.field5592;
        } else if (arg1 != 256) {
            return (class229) null;
        } else if (var3 < 0) {
            return class63.field1087;
        } else if (var3 > 9) {
            return class126.field2250;
        } else if (var3 > 6) {
            return class301.field5123;
        } else if (var3 <= 3) {
            return var3 <= 0 ? class15.field231 : class95.field1691;
        } else {
            return class112.field2001;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V", line = 155)
    public static final void method584(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            field1516 = (int[]) null;
        }
        class6.field61 = class149.field2576[arg2][arg1].field1707;
        field1510++;
        class30.field518 = class149.field2576[arg2][arg1].field1704;
        class31.field532 = class149.field2576[arg2][arg1].field1711;
        class276.method1937((float) class6.field61, (float) class30.field518, (float) class31.field532);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method579(int arg0, Component arg1);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I")
    public abstract int method582(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method583(boolean arg0, Component arg1);
}
