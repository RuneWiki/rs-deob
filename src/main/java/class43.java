import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class43 extends class12 {

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static volatile int field1089 = -1;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field1084 = 0;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Z")
    public static boolean field1086 = false;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field1090 = 0;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "Lad;")
    private static class5 field1101 = class88.method674("Drop", -118);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Lad;")
    public static class5 field1085 = class88.method674("headicons_hint", 97);

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    public static int field1103 = 0;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "[Z")
    public static boolean[] field1105 = new boolean[5];

    @OriginalMember(owner = "client!ha", name = "jb", descriptor = "[Z")
    public static boolean[] field1109 = new boolean[112];

    @OriginalMember(owner = "client!ha", name = "ib", descriptor = "I")
    public static int field1108 = 0;

    @OriginalMember(owner = "client!ha", name = "hb", descriptor = "Lad;")
    public static class5 field1107 = field1101;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "Lhd;")
    public static class46 field1091 = new class46(32);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ha", name = "kb", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "[I")
    public int[] field1087;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "[I")
    public int[] field1088;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "[I")
    public static int[] field1095;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "[I")
    public int[] field1100;

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "[Lkb;")
    public class62[] field1096;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "[Lkb;")
    public class62[] field1099;

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "[[[B")
    public byte[][][] field1098;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V", line = 13)
    public static final void method359(boolean arg0) {
        class109.field2727 = 0;
        if (!arg0) {
            field1103 = 98;
        }
        field1082++;
        class33.field800 = 0;
        class48.method416(10162);
        class128.method993(0);
        class110.method888(8270336);
        for (int var1 = 0; var1 < class33.field800; var1++) {
            int var3 = class1.field18[var1];
            if (class69.field1636 != class103.field2504[var3].field113) {
                class103.field2504[var3].field1498 = null;
                class103.field2504[var3] = null;
            }
        }
        if (class75.field1804 != class36.field907.field957) {
            throw new RuntimeException("gnp1 pos:" + class36.field907.field957 + " psize:" + class75.field1804);
        }
        for (int var2 = 0; var2 < class33.field790; var2++) {
            if (class103.field2504[class25.field611[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class33.field790);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V", line = 78)
    public static final void method360(int arg0, int arg1, int arg2) {
        if (arg2 < 35) {
            return;
        }
        field1093++;
        class23 var3 = class22.field559[class54.field1344][arg0][arg1];
        if (var3 == null) {
            class42.field1065.method742(class54.field1344, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class4 var5 = null;
        for (class4 var6 = (class4) var3.method180(0); var6 != null; var6 = (class4) var3.method181(0)) {
            class27 var11 = class3.method21((byte) 42, var6.field132);
            int var12 = var11.field704;
            if (var11.field695 == 1) {
                var12 = (var6.field137 + 1) * var12;
            }
            if (var4 < var12) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (var5 == null) {
            class42.field1065.method742(class54.field1344, arg0, arg1);
            return;
        }
        var3.method179(false, var5);
        class4 var7 = null;
        class4 var8 = null;
        for (class4 var9 = (class4) var3.method180(0); var9 != null; var9 = (class4) var3.method181(0)) {
            if (var5.field132 != var9.field132) {
                if (var7 == null) {
                    var7 = var9;
                }
                if (var7.field132 != var9.field132 && var8 == null) {
                    var8 = var9;
                }
            }
        }
        int var10 = (arg1 << 7) + arg0 + 1610612736;
        class42.field1065.method748(class54.field1344, arg0, arg1, class95.method730(60, arg0 * 128 + 64, class54.field1344, arg1 * 128 + 64), var5, var10, var7, var8);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V", line = 171)
    public static final void method361(int arg0) {
        field1097++;
        class17.method132(-103, class69.field1626);
        if (class33.field796 != -1) {
            class17.method132(-85, class33.field796);
        }
        class98.field2382 = 0;
        class4.field127.method885(-63);
        class16.field440 = class114.method906(class16.field440);
        class55.method445();
        class86.method657(0, 503, 1515, 765, 0, class69.field1626, 0);
        if (class33.field796 != -1) {
            class86.method657(0, 503, arg0 + 1387, 765, 0, class33.field796, 0);
        }
        if (class128.field3069) {
            class121.method955(-26266);
        } else {
            class79.method618(0);
            class103.method829(true);
        }
        try {
            Graphics var1 = class9.field305.getGraphics();
            if (arg0 != 128) {
                method361(-18);
            }
            class4.field127.method253(0, var1, false, 0);
        } catch (Exception var2) {
            class9.field305.repaint();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Laa;Ljava/awt/Component;I)Lle;", line = 214)
    public static final class71 method362(class2 arg0, Component arg1, int arg2) {
        class118.method931(0, arg1, arg0);
        if (arg2 == 503) {
            field1106++;
            class71 var3 = new class71();
            class100.method799(var3, arg2 - 13448);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 233)
    public static void method363(int arg0) {
        field1107 = null;
        field1085 = null;
        if (arg0 != 0) {
            return;
        }
        field1095 = null;
        field1091 = null;
        field1101 = null;
        field1109 = null;
        field1105 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BI)V", line = 256)
    public static final void method364(byte arg0, int arg1) {
        if (arg0 != 119) {
            method361(74);
        }
        if (arg1 == -3) {
            class120.method953(class91.field2145, (byte) 101, class87.field2027, class82.field1928);
        } else if (arg1 == -2) {
            class120.method953(class61.field1506, (byte) 120, class87.field2036, class87.field1997);
        } else if (arg1 == -1) {
            class120.method953(class91.field2175, (byte) 113, class87.field2037, class102.field2495);
        } else if (arg1 == 3) {
            class120.method953(class9.field325, (byte) 118, class87.field2001, class87.field2004);
        } else if (arg1 == 4) {
            class120.method953(class59.field1452, (byte) 105, class87.field2031, class60.field1460);
        } else if (arg1 == 5) {
            class120.method953(class92.field2195, (byte) 113, class87.field2003, class95.field2246);
        } else if (arg1 == 6) {
            class120.method953(class120.field2977, (byte) 114, class87.field2039, class40.field1031);
        } else if (arg1 == 7) {
            class120.method953(class53.field1324, (byte) 92, class87.field2035, class118.field2918);
        } else if (arg1 == 8) {
            class120.method953(class133.field3210, (byte) 110, class87.field2034, class39.field1006);
        } else if (arg1 == 9) {
            class120.method953(class21.field550, (byte) 122, class87.field2022, class52.field1310);
        } else if (arg1 == 10) {
            class120.method953(class47.field1221, (byte) 127, class87.field2009, class39.field1014);
        } else if (arg1 == 11) {
            class120.method953(class10.field332, (byte) 98, class87.field2023, class105.field2639);
        } else if (arg1 == 12) {
            class120.method953(class53.field1319, (byte) 111, class87.field2000, class75.field1796);
        } else if (arg1 == 13) {
            class120.method953(class91.field2151, (byte) 103, class87.field2014, class49.field1261);
        } else if (arg1 == 14) {
            class120.method953(class106.field2675, (byte) 126, class87.field2042, class118.field2931);
        } else if (arg1 == 16) {
            class120.method953(class53.field1332, (byte) 121, class87.field2025, class82.field1938);
        } else if (arg1 == 17) {
            class120.method953(class99.field2399, (byte) 95, class87.field2033, class95.field2267);
        } else if (arg1 == 18) {
            class120.method953(class87.field2047, (byte) 92, class87.field2024, class100.field2431);
        } else if (arg1 == 20) {
            class120.method953(class91.field2164, (byte) 105, class87.field1996, class116.field2873);
        } else if (arg1 == 22) {
            class120.method953(class17.field453, (byte) 95, class87.field1998, class88.field2058);
        } else if (arg1 == 23) {
            class120.method953(class106.field2693, (byte) 111, class87.field2043, class12.field375);
        } else if (arg1 == 24) {
            class120.method953(class27.field668, (byte) 117, class87.field2019, class5.field200);
        } else if (arg1 == 25) {
            class120.method953(class91.field2177, (byte) 127, class87.field2021, class86.field1983);
        } else if (arg1 == 26) {
            class120.method953(class53.field1321, (byte) 105, class87.field2016, class36.field906);
        } else if (arg1 == 27) {
            class120.method953(class74.field1776, (byte) 102, class87.field2017, class87.field2006);
        } else {
            class120.method953(class91.field2143, (byte) 111, class87.field2040, class27.field672);
        }
        field1092++;
        class69.method541(10, 68);
    }
}
