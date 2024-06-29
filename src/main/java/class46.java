import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 {

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
    public static short[] field1083 = new short[] { -1, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Z")
    public static boolean field1087 = false;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lod;")
    private static class101 field1084 = method335(-119, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lod;")
    private static class101 field1094 = method335(98, "Please wait)3)3)3");

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lod;")
    public static class101 field1095 = method335(-85, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lod;")
    public static class101 field1082 = field1094;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
    public static int[] field1092 = new int[25];

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lod;")
    private static class101 field1096 = method335(-89, "Loaded config");

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lod;")
    public static class101 field1097 = method335(-70, "<)4col>");

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lod;")
    public static class101 field1088 = field1096;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lod;")
    public static class101 field1098 = field1084;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lod;")
    public static class101 field1091 = method335(-90, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lud;")
    public static class143 field1089 = new class143(4096);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lh;")
    public class49 field1081;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "[Lrd;")
    public static class122[] field1086;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[S")
    public static short[] field1075;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public static void method330(boolean arg0) {
        field1075 = null;
        field1092 = null;
        field1083 = null;
        field1089 = null;
        if (arg0) {
            method331(87, 23, -95, -1);
        }
        field1097 = null;
        field1096 = null;
        field1088 = null;
        field1084 = null;
        field1094 = null;
        field1095 = null;
        field1098 = null;
        field1082 = null;
        field1086 = null;
        field1091 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
    public static final int method331(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < arg1) {
            arg2 /= 2;
        }
        field1080++;
        if (arg1 > 192) {
            arg2 /= 2;
        }
        if (arg1 > 217) {
            arg2 /= 2;
        }
        if (arg1 > 243) {
            arg2 /= 2;
        }
        return (arg2 / 32 << 7) + (arg3 / 4 << 10) + arg1 / 2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
    public static final int method332(int arg0) {
        field1078++;
        if (arg0 != 27) {
            method333(17, 117);
        }
        return class90.field1956++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method333(int arg0, int arg1) {
        int var2 = 90 / ((arg0 + 44) / 49);
        if (arg1 == -3) {
            class53.method383(class84.field1836, class80.field1699, -5, class6.field86);
        } else if (arg1 == -2) {
            class53.method383(class95.field2047, class80.field1669, -5, class80.field1671);
        } else if (arg1 == -1) {
            class53.method383(class84.field1838, class80.field1700, -5, class67.field1520);
        } else if (arg1 == 3) {
            class53.method383(class62.field1380, class80.field1701, -5, class80.field1698);
        } else if (arg1 == 4) {
            class53.method383(class15.field339, class80.field1680, -5, class87.field1913);
        } else if (arg1 == 5) {
            class53.method383(class85.field1884, class80.field1676, -5, class149.field3386);
        } else if (arg1 == 6) {
            class53.method383(class35.field885, class80.field1715, -5, class99.field2137);
        } else if (arg1 == 7) {
            class53.method383(class36.field911, class80.field1688, -5, class64.field1441);
        } else if (arg1 == 8) {
            class53.method383(class7.field111, class80.field1681, -5, class96.field2091);
        } else if (arg1 == 9) {
            class53.method383(class35.field900, class80.field1683, -5, class134.field3070);
        } else if (arg1 == 10) {
            class53.method383(class28.field748, class80.field1686, -5, class96.field2083);
        } else if (arg1 == 11) {
            class53.method383(class134.field3059, class80.field1694, -5, class23.field536);
        } else if (arg1 == 12) {
            class53.method383(field1098, class80.field1670, -5, class65.field1487);
        } else if (arg1 == 13) {
            class53.method383(class84.field1833, class80.field1713, -5, class79.field1657);
        } else if (arg1 == 14) {
            class53.method383(class78.field1631, class80.field1712, -5, class141.field3251);
        } else if (arg1 == 16) {
            class53.method383(class53.field1212, class80.field1690, -5, class1.field2);
        } else if (arg1 == 17) {
            class53.method383(class63.field1411, class80.field1703, -5, class52.field1195);
        } else if (arg1 == 18) {
            class53.method383(class148.field3371, class80.field1682, -5, class127.field2894);
        } else if (arg1 == 19) {
            class53.method383(class98.field2124, class36.field904, -5, class75.field1613);
        } else if (arg1 == 20) {
            class53.method383(class84.field1827, class80.field1708, -5, class41.field981);
        } else if (arg1 == 22) {
            class53.method383(class130.field2972, class80.field1702, -5, class98.field2118);
        } else if (arg1 == 23) {
            class53.method383(class78.field1643, class80.field1687, -5, class30.field783);
        } else if (arg1 == 24) {
            class53.method383(class40.field954, class80.field1675, -5, class142.field3276);
        } else if (arg1 == 25) {
            class53.method383(class84.field1828, class80.field1685, -5, class83.field1819);
        } else if (arg1 == 26) {
            class53.method383(class61.field1352, class80.field1705, -5, class18.field389);
        } else if (arg1 == 27) {
            class53.method383(class12.field242, class80.field1697, -5, class80.field1707);
        } else {
            class53.method383(class84.field1829, class80.field1677, -5, class146.field3354);
        }
        class35.method262(0, 10);
        field1100++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLc;II)Lrd;")
    public static final class122 method334(boolean arg0, class15 arg1, int arg2, int arg3) {
        if (!arg0) {
            field1087 = false;
        }
        field1085++;
        return class134.method1038(arg2, arg3, arg1, 2001) ? class150.method1166((byte) 99) : null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;)Lod;")
    public static final class101 method335(int arg0, String arg1) {
        field1074++;
        int var2 = 0;
        int var3 = 120 / ((arg0 - 6) / 55);
        byte[] var4 = arg1.getBytes();
        int var5 = var4.length;
        class101 var6 = new class101();
        var6.field2223 = new byte[var5];
        while (var5 > var2) {
            int var7 = var4[var2++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var2 >= var5) {
                    break;
                }
                int var8 = var4[var2++] & 0xFF;
                var6.field2223[var6.field2231++] = (byte) ((var7 - 40) * 43 + var8 - 48);
            } else if (var7 != 0) {
                var6.field2223[var6.field2231++] = (byte) var7;
            }
        }
        var6.method727(2);
        return var6.method738(-64);
    }
}
