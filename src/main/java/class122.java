import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class122 extends class26 {

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1599 = "Loaded world list data";

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
    public static boolean field1603 = true;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Lcc;")
    public static class327 field1597 = new class327(4);

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Lpc;")
    public class113 field1601;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "Lfh;")
    public static class140 field1605;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Lpb;")
    public class168 field1602;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lqh;")
    public class275 field1617;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "Lsi;")
    public class84 field1621;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 8)
    public static final String method878(String arg0, int arg1) {
        field1598++;
        if (arg1 != -8251) {
            field1599 = (String) null;
        }
        String var2 = class92.method667(0, class201.method1476(arg1 + 8125, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILpm;)V", line = 25)
    public static final void method879(int arg0, class69 arg1) {
        class77 var2 = null;
        field1616++;
        try {
            class188 var3 = arg1.method508("runescape", (byte) -92);
            while (var3.field2608 == 0) {
                class177.method1299((byte) 64, 1L);
            }
            if (var3.field2608 == 1) {
                var2 = (class77) var3.field2606;
                class299 var4 = class140.method1064(-100);
                var2.method552(var4.field4351, 0, true, var4.field4350);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method554(arg0 ^ 0x62D2);
            }
        } catch (Exception var7) {
        }
        if (arg0 != -25299) {
            method880(-67, -114);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)I", line = 61)
    public static final int method880(int arg0, int arg1) {
        field1625++;
        if (arg0 >= -77) {
            field1599 = (String) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V", line = 87)
    public final void method881(int arg0) {
        this.field1601 = null;
        this.field1621 = null;
        if (arg0 != 338) {
            this.field1608 = -99;
        }
        this.field1617 = null;
        this.field1602 = null;
        field1607++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V", line = 109)
    public static void method882(boolean arg0) {
        field1599 = null;
        field1597 = null;
        if (!arg0) {
            field1605 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V", line = 123)
    public static final void method883(int arg0) {
        field1613++;
        if (arg0 != -4760) {
            field1599 = (String) null;
        }
        class179.field2451++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)V", line = 138)
    public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1620++;
        if (class140.method1081(-111, arg0) && arg6 < -28) {
            client.method901(class26.field308[arg0], -1, arg5, arg3, arg1, arg7, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 155)
    public static final byte[] method885(String arg0, int arg1) {
        int var2 = arg0.length();
        if (arg1 != 23668) {
            return (byte[]) null;
        }
        byte[] var3 = new byte[var2];
        field1596++;
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }
}
