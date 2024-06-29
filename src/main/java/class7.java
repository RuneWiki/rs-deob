import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class123 {

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    private int field147 = 0;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "[I")
    public static int[] field143 = new int[25];

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
    public static int field151 = 20;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "Lvc;")
    private static class137 field138 = class45.method325("Moderator option: Mute player for 48 hours: <OFF>", -46);

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "Lvc;")
    private static class137 field162 = class45.method325("white:", -46);

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "Lvc;")
    public static class137 field163 = field138;

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "Lvc;")
    public static class137 field159 = field162;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "Lvc;")
    public static class137 field141 = class45.method325("Freund hinzuf-Ugen", -46);

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Z")
    public static boolean field148 = false;

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "Lvc;")
    private static class137 field164 = class45.method325(" from your ignore list first", -46);

    @OriginalMember(owner = "client!af", name = "vb", descriptor = "Lvc;")
    public static class137 field165 = field164;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "Lqe;")
    public static class109 field156 = new class109(new byte[5000]);

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    public int field153;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!af", name = "wb", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "Lfb;")
    public static class38 field137;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "Lme;")
    public static class85 field154;

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "Lnb;")
    public static class88 field155;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "[I")
    public static int[] field149;

    @OriginalMember(owner = "client!af", name = "xb", descriptor = "[I")
    public static int[] field167;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILqe;)V")
    public final void method39(int arg0, int arg1, class109 arg2) {
        while (true) {
            int var4 = arg2.method838(255);
            if (var4 == 0) {
                field146++;
                if (arg0 > -77) {
                    method49(-27);
                    return;
                }
                return;
            }
            this.method43(arg2, false, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    private final void method40(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF86) >> arg0) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        field157++;
        if (var5 > var3) {
            var9 = var5;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 > var5) {
            var11 = var5;
        }
        double var13 = 0.0D;
        if (var11 > var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (-var11 + var9) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (var9 - var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        if (var17 > 0.5D) {
            this.field144 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field144 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field144 < 1) {
            this.field144 = 1;
        }
        this.field153 = (int) (var15 * 256.0D);
        this.field135 = (int) (var17 * 256.0D);
        if (this.field135 < 0) {
            this.field135 = 0;
        } else if (this.field135 > 255) {
            this.field135 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field153 < 0) {
            this.field153 = 0;
        } else if (this.field153 > 255) {
            this.field153 = 255;
        }
        this.field136 = (int) ((double) this.field144 * var19);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLnb;)V")
    public static final void method41(byte arg0, class88 arg1) {
        field158++;
        class116.field2749 = arg1;
        class89.field2136 = class116.field2749.method651(16, true);
        if (arg0 != 66) {
            method41((byte) -118, null);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLvc;Lvc;Z)V")
    public static final void method42(byte arg0, class137 arg1, class137 arg2, boolean arg3) {
        if (class86.field2058) {
            class86.field2058 = false;
            class70.method494((byte) -23);
            client.method187(-21226);
            class83.method605(0);
            class44.method303(false);
            class70.method493(class71.field1510, class110.field2606, class75.field1695, (byte) -94, class21.field453);
            class106.method771(-1, 9, class112.field2670 == -1, class75.field1691, class32.field679);
            class68.field1413 = true;
            class64.field1354 = true;
            class93.field2192 = true;
        }
        field161++;
        short var4 = 151;
        int var6 = var4 - 3;
        class21.method178(arg0 + 278);
        class75.field1695.method1146(arg1, 257, var6, 0);
        class75.field1695.method1146(arg1, 256, var6 - 1, 16777215);
        if (arg0 != -23) {
            method47(95, -53, 10, 114);
        }
        if (arg2 != null) {
            var6 += 15;
            if (arg3) {
                int var5 = class75.field1695.method1130(arg2) + 4;
                class62.method454(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class75.field1695.method1146(arg2, 257, var6, 0);
            class75.field1695.method1146(arg2, 256, var6 - 1, 16777215);
        }
        class137.method1015(112);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lqe;ZII)V")
    private final void method43(class109 arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field147 = arg0.method822((byte) 43);
        }
        if (arg1) {
            field165 = null;
        }
        field160++;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
    public static void method44(byte arg0) {
        field156 = null;
        field143 = null;
        field138 = null;
        field164 = null;
        field154 = null;
        field162 = null;
        field163 = null;
        field155 = null;
        field165 = null;
        field149 = null;
        field141 = null;
        field167 = null;
        field159 = null;
        field137 = null;
        if (arg0 <= 105) {
            method50(-4, 6);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lvc;I)V")
    public static final void method45(class137 arg0, int arg1) {
        field150++;
        if (arg0 == null || arg0.method997(-86) == 0) {
            class38.field847 = 0;
            return;
        }
        class137 var2 = arg0;
        class137[] var3 = new class137[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method1031(32, arg1);
            if (var5 == -1) {
                class137 var6 = var2.method1034(104);
                if (var6.method997(123) > 0) {
                    var3[var4++] = var6.method1005((byte) 98);
                }
                class38.field847 = arg1;
                label47: for (int var7 = 0; var7 < class82.field1852; var7++) {
                    class141 var8 = class39.method286((byte) -42, var7);
                    if (var8.field3313 == -1 && var8.field3316 != null) {
                        class137 var9 = var8.field3316.method1005((byte) 98);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method1003(var3[var10], (byte) -82) == -1) {
                                continue label47;
                            }
                        }
                        class6.field116[class38.field847] = var9;
                        class67.field1376[class38.field847] = var7;
                        class38.field847++;
                        if (class6.field116.length <= class38.field847) {
                            return;
                        }
                    }
                }
                return;
            }
            class137 var11 = var2.method1013(var5, 0, (byte) 55).method1034(126);
            if (var11.method997(-18) > 0) {
                var3[var4++] = var11.method1005((byte) 98);
            }
            var2 = var2.method1035(1, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (arg0) {
            method48((byte) -23);
        }
        field134++;
        this.method40(-1925245304, this.field147);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
    public static final void method47(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class61.field1329[arg2][arg3 + var4][arg1 + var7] = 0;
            }
        }
        field140++;
        if (arg3 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class61.field1329[arg2][arg3][arg1 + var5] = class61.field1329[arg2][arg3 - 1][arg1 + var5];
            }
        }
        if (arg0 != -24238) {
            method41((byte) 33, null);
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class61.field1329[arg2][arg3 + var6][arg1] = class61.field1329[arg2][arg3 + var6][arg1 - 1];
            }
        }
        if (arg3 > 0 && class61.field1329[arg2][arg3 - 1][arg1] != 0) {
            class61.field1329[arg2][arg3][arg1] = class61.field1329[arg2][arg3 - 1][arg1];
        } else if (arg1 > 0 && class61.field1329[arg2][arg3][arg1 - 1] != 0) {
            class61.field1329[arg2][arg3][arg1] = class61.field1329[arg2][arg3][arg1 - 1];
        } else if (arg3 > 0 && arg1 > 0 && class61.field1329[arg2][arg3 - 1][arg1 - 1] != 0) {
            class61.field1329[arg2][arg3][arg1] = class61.field1329[arg2][arg3 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
    public static final void method48(byte arg0) {
        Object var1 = class60.field1290;
        synchronized (class60.field1290) {
            if (class12.field270 == 0) {
                class131.field3048.method358(new class29(), 5, 0);
            }
            class12.field270 = 600;
        }
        field166++;
        if (arg0 < 79) {
            field137 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public static final void method49(int arg0) {
        if (arg0 != 3) {
            field148 = true;
        }
        field139++;
        for (int var1 = 0; var1 < class68.field1416; var1++) {
            int var2 = class85.field2036[var1];
            class56 var3 = class125.field2914[var2];
            int var4 = class103.field2391.method838(255);
            if ((var4 & 0x40) != 0) {
                var3.field1686 = class103.field2391.method833(-1);
                var3.field1658 = 100;
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class103.field2391.method794((byte) -106);
                int var6 = class103.field2391.method825(21934);
                var3.method562(var6, var5, (byte) -3, class112.field2667);
                var3.field1636 = class112.field2667 + 300;
                var3.field1671 = class103.field2391.method838(255);
                var3.field1666 = class103.field2391.method808(-56);
            }
            if ((var4 & 0x8) != 0) {
                int var7 = class103.field2391.method838(arg0 ^ 0xFC);
                int var8 = class103.field2391.method808(-70);
                var3.method562(var8, var7, (byte) -3, class112.field2667);
                var3.field1636 = class112.field2667 + 300;
                var3.field1671 = class103.field2391.method808(-114);
                var3.field1666 = class103.field2391.method825(21934);
            }
            if ((var4 & 0x2) != 0) {
                var3.field1625 = class103.field2391.method821(-1);
                if (var3.field1625 == 65535) {
                    var3.field1625 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class103.field2391.method831((byte) 105);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class103.field2391.method838(255);
                if (var3.field1654 == var9 && var9 != -1) {
                    int var11 = class68.method481(arg0 - 3, var9).field3368;
                    if (var11 == 1) {
                        var3.field1680 = 0;
                        var3.field1669 = var10;
                        var3.field1641 = 0;
                        var3.field1629 = 0;
                    }
                    if (var11 == 2) {
                        var3.field1641 = 0;
                    }
                } else if (var9 == -1 || var3.field1654 == -1 || class68.method481(0, var9).field3365 >= class68.method481(arg0 ^ 0x3, var3.field1654).field3365) {
                    var3.field1654 = var9;
                    var3.field1669 = var10;
                    var3.field1623 = var3.field1631;
                    var3.field1629 = 0;
                    var3.field1680 = 0;
                    var3.field1641 = 0;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1678 = class103.field2391.method841(-19184);
                var3.field1663 = class103.field2391.method841(arg0 ^ 0xFFFFB513);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1655 = class103.field2391.method821(-1);
                int var12 = class103.field2391.method832(14722);
                var3.field1621 = 0;
                var3.field1620 = var12 >> 16;
                var3.field1674 = (var12 & 0xFFFF) + class112.field2667;
                var3.field1660 = 0;
                if (var3.field1655 == 65535) {
                    var3.field1655 = -1;
                }
                if (var3.field1674 > class112.field2667) {
                    var3.field1660 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1203 = class67.method476(true, class103.field2391.method831((byte) 105));
                var3.field1639 = var3.field1203.field3198;
                var3.field1685 = var3.field1203.field3239;
                var3.field1688 = var3.field1203.field3247;
                var3.field1649 = var3.field1203.field3217;
                var3.field1634 = var3.field1203.field3241;
                var3.field1630 = var3.field1203.field3223;
                var3.field1676 = var3.field1203.field3219;
                var3.field1673 = var3.field1203.field3243;
                var3.field1677 = var3.field1203.field3246;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V")
    public static final void method50(int arg0, int arg1) {
        class82 var2 = (class82) class84.field1899.method867((long) arg0, false);
        field132++;
        if (arg1 != -8719) {
            field156 = null;
        }
        if (var2 != null) {
            var2.method776(0);
        }
    }
}
