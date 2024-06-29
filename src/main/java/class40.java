import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class40 extends class29 {

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
    public int field1122 = -1;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
    public int field1128 = -1;

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "Z")
    public boolean field1129 = false;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
    public int field1114 = 2;

    @OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
    public int field1138 = 99;

    @OriginalMember(owner = "client!gd", name = "Bb", descriptor = "I")
    public int field1133 = 5;

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
    public int field1119 = -1;

    @OriginalMember(owner = "client!gd", name = "Kb", descriptor = "I")
    public int field1142 = -1;

    @OriginalMember(owner = "client!gd", name = "Mb", descriptor = "I")
    public int field1144 = -1;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lwb;")
    private static class130 field1105 = class26.method212(" has logged in)3", -32376);

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lwb;")
    public static class130 field1104 = field1105;

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "Lwb;")
    public static class130 field1124 = class26.method212("Classic", -32376);

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
    public static volatile int field1112 = 0;

    @OriginalMember(owner = "client!gd", name = "Ib", descriptor = "Z")
    public static boolean field1140 = false;

    @OriginalMember(owner = "client!gd", name = "Jb", descriptor = "Lwb;")
    private static class130 field1141 = class26.method212("Hide", -32376);

    @OriginalMember(owner = "client!gd", name = "Ab", descriptor = "Lwb;")
    private static class130 field1132 = class26.method212("Your ignore list is full)3 Max of 100 hit", -32376);

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lwb;")
    public static class130 field1134 = class26.method212("backbase1", -32376);

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "Lwb;")
    public static class130 field1121 = field1132;

    @OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
    public static int field1139 = 0;

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lwb;")
    public static class130 field1127 = field1141;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!gd", name = "Db", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!gd", name = "Eb", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!gd", name = "Fb", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!gd", name = "Lb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "[I")
    public int[] field1106;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "[I")
    private int[] field1107;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "[I")
    public int[] field1108;

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "[I")
    private int[] field1130;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V", line = 9)
    public static final void method384(boolean arg0) {
        field1118++;
        class128.method948(14935, arg0);
        boolean var1 = true;
        class42.field1176 = 0;
        for (int var2 = 0; var2 < class24.field699.length; var2++) {
            if (class29.field799[var2] != -1 && class24.field699[var2] == null) {
                class24.field699[var2] = class64.field1634.method508(0, 0, class29.field799[var2]);
                if (class24.field699[var2] == null) {
                    var1 = false;
                    class42.field1176++;
                }
            }
            if (class53.field1388[var2] != -1 && class72.field1851[var2] == null) {
                class72.field1851[var2] = class64.field1634.method492(class53.field1388[var2], class132.field3201[var2], 0, -518439420);
                if (class72.field1851[var2] == null) {
                    var1 = false;
                    class42.field1176++;
                }
            }
        }
        if (!var1) {
            class54.field1403 = 1;
            return;
        }
        class115.field2829 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class24.field699.length; var4++) {
            byte[] var56 = class72.field1851[var4];
            if (var56 != null) {
                int var57 = (class108.field2608[var4] >> 8) * 64 - class129.field3045;
                int var58 = (class108.field2608[var4] & 0xFF) * 64 - class42.field1172;
                if (class23.field671) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class18.method152(var56, var57, var58, 88);
            }
        }
        if (!var3) {
            class54.field1403 = 2;
            return;
        }
        if (class54.field1403 != 0) {
            class4.method30(class124.field2997, true, (byte) 78, class45.field1228);
        }
        class99.method737(-28464);
        class79.field1926.method295();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class99.field2404[var5].method931(-89);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class56.field1435[var6][var54][var55] = 0;
                }
            }
        }
        class83.method624((byte) -102);
        int var7 = class24.field699.length;
        client.method166(50);
        class128.method948(14935, true);
        if (!class23.field671) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class108.field2608[var8] >> 8) * 64 - class129.field3045;
                int var18 = (class108.field2608[var8] & 0xFF) * 64 - class42.field1172;
                byte[] var19 = class24.field699[var8];
                if (var19 != null) {
                    class83.method622(var18, (byte) -32, class26.field762 * 8 - 48, var17, (class99.field2383 - 6) * 8, var19, class99.field2404);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class108.field2608[var9] >> 8) * 64 - class129.field3045;
                byte[] var15 = class24.field699[var9];
                int var16 = (class108.field2608[var9] & 0xFF) * 64 - class42.field1172;
                if (var15 == null && class26.field762 < 800) {
                    class35.method319(var16, var14, 64, 64, true);
                }
            }
            class128.method948(14935, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class72.field1851[var10];
                if (var11 != null) {
                    int var12 = (class108.field2608[var10] >> 8) * 64 - class129.field3045;
                    int var13 = (class108.field2608[var10] & 0xFF) * 64 - class42.field1172;
                    class97.method728(class99.field2404, class79.field1926, var12, var13, var11, 2047);
                }
            }
        }
        if (class23.field671) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class58.field1464[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 1 & 0x3;
                            int var39 = var37 >> 24 & 0x3;
                            int var40 = var37 >> 14 & 0x3FF;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class108.field2608.length; var43++) {
                                if (class108.field2608[var43] == var42 && class24.field699[var43] != null) {
                                    class123.method935(class24.field699[var43], var20, var38, var34 * 8, var35 * 8, -128, (var40 & 0x7) * 8, var39, (var41 & 0x7) * 8, class99.field2404);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class111.method851(var20, var35 * 8, 14440, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class58.field1464[0][var21][var32];
                    if (var33 == -1) {
                        class35.method319(var32 * 8, var21 * 8, 8, 8, !arg0);
                    }
                }
            }
            class128.method948(14935, true);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class58.field1464[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 1 & 0x3;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var27 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class108.field2608.length; var31++) {
                                if (class108.field2608[var31] == var30 && class72.field1851[var31] != null) {
                                    class31.method250(var28, class99.field2404, var22, class72.field1851[var31], var26, (var29 & 0x7) * 8, var23 * 8, (var27 & 0x7) * 8, (byte) -118, class79.field1926, var24 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class128.method948(14935, true);
        class99.method737(-28464);
        class43.method409(class79.field1926, class99.field2404, 128);
        class128.method948(14935, true);
        int var44 = class128.field3028;
        if (class71.field1818 < var44) {
            var44 = class71.field1818;
        }
        if (var44 < class71.field1818 - 1) {
            int var45 = class71.field1818 - 1;
        }
        if (class4.field189) {
            class79.field1926.method315(class128.field3028);
        } else {
            class79.field1926.method315(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class83.method620(-99999999, var53, var46);
            }
        }
        class10.method79((byte) 55);
        class68.field1760.method401(26116);
        if (class61.field1588 != null) {
            class112.field2773++;
            class14.field406.method727(112, -114);
            class14.field406.method325(-405801808, 1057001181);
        }
        if (!class23.field671) {
            int var47 = (class99.field2383 - 6) / 8;
            int var48 = (class99.field2383 + 6) / 8;
            int var49 = (class26.field762 - 6) / 8;
            int var50 = (class26.field762 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var47 > var51 || var51 > var48 || var49 > var52 || var52 > var50) {
                        class64.field1634.method500(-95, class15.method114(new class130[] { class93.field2247, class109.method831(var51, 10), class111.field2723, class109.method831(var52, 10) }, -20349));
                        class64.field1634.method500(-46, class15.method114(new class130[] { class63.field1604, class109.method831(var51, 10), class111.field2723, class109.method831(var52, 10) }, -20349));
                    }
                }
            }
        }
        if (class112.field2768 == -1) {
            class90.method669(19013, 30);
        } else {
            class90.method669(19013, 35);
        }
        class113.method865(112);
        class14.field406.method727(151, 66);
        class21.method195((byte) -52);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V", line = 469)
    public static void method385(boolean arg0) {
        if (arg0) {
            field1124 = null;
        }
        field1121 = null;
        field1104 = null;
        field1134 = null;
        field1132 = null;
        field1141 = null;
        field1105 = null;
        field1127 = null;
        field1124 = null;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V", line = 488)
    public static final void method386(int arg0) {
        while (true) {
            if (class67.field1682.method726((byte) -86, class65.field1661) >= 11) {
                int var1 = class67.field1682.method721(11, (byte) -99);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class105.field2550[var1] == null) {
                        var2 = true;
                        class105.field2550[var1] = new class59();
                        if (class103.field2527[var1] != null) {
                            class105.field2550[var1].method485((byte) 10, class103.field2527[var1]);
                        }
                    }
                    class26.field770[class61.field1582++] = var1;
                    class59 var3 = class105.field2550[var1];
                    var3.field2104 = class130.field3128;
                    int var4 = class67.field1682.method721(1, (byte) -124);
                    if (var4 == 1) {
                        class69.field1775[class45.field1220++] = var1;
                    }
                    int var5 = class67.field1682.method721(5, (byte) -95);
                    int var6 = class67.field1682.method721(1, (byte) -98);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var7 = class67.field1682.method721(5, (byte) -112);
                    int var8 = class71.field1815[class67.field1682.method721(3, (byte) -104)];
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var2) {
                        var3.field2099 = var8;
                    }
                    var3.method653((byte) 35, class42.field1179.field2079[0] + var7, var6 == 1, class42.field1179.field2107[0] + var5);
                    continue;
                }
            }
            field1111++;
            if (arg0 < 89) {
                method386(-83);
            }
            class67.field1682.method730(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V", line = 555)
    public static final void method387(byte arg0) {
        field1113++;
        if (class53.field1397 == 0) {
            return;
        }
        int var1 = 12 % ((arg0 - 64) / 54);
        int var2 = 0;
        if (class36.field1078 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class37.field1089[var3] != null) {
                int var4 = class69.field1786[var3];
                class130 var5 = class93.field2218[var3];
                if (var5 != null && var5.method981(-11361, class83.field1949)) {
                    var5 = var5.method977(5, true);
                }
                if (var5 != null && var5.method981(-11361, class7.field232)) {
                    var5 = var5.method977(5, true);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class48.field1291 == 0 || class48.field1291 == 1 && class4.method38(4739, var5))) {
                    int var6 = 329 - var2 * 13;
                    if (class18.field483 > 4 && class101.field2429 - 4 > var6 + -10 && var6 + 3 >= class101.field2429 - 4) {
                        int var7 = class132.field3202.method1013(class15.method114(new class130[] { class101.field2444, class69.field1768, var5, class37.field1089[var3] }, -20349)) + 25;
                        if (var7 > 450) {
                            var7 = 450;
                        }
                        if (var7 + 4 > class18.field483) {
                            if (class21.field605 >= 1) {
                                class108.field2604++;
                                class53.method450(0, 0, class59.field1509, class15.method114(new class130[] { class81.field1943, var5 }, -20349), 2035, 0, -122);
                            }
                            class53.method450(0, 0, class111.field2737, class15.method114(new class130[] { class81.field1943, var5 }, -20349), 2036, 0, -120);
                            class97.field2344++;
                            class53.method450(0, 0, class1.field16, class15.method114(new class130[] { class81.field1943, var5 }, -20349), 2051, 0, -126);
                            class116.field2875++;
                        }
                    }
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
                if ((var4 == 5 || var4 == 6) && class48.field1291 < 2) {
                    var2++;
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lkc;", line = 682)
    public static final class63 method388(int arg0, int arg1) {
        field1123++;
        class63 var2 = (class63) class41.field1169.method402((long) arg0, -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field677.method508(arg0, 0, arg1);
        class63 var4 = new class63();
        if (var3 != null) {
            var4.method523(arg1 ^ 0x72, new class36(var3));
        }
        class41.field1169.method403((long) arg0, var4, (byte) -101);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILr;)Lr;", line = 703)
    public final class102 method389(int arg0, int arg1, class102 arg2) {
        int var4 = this.field1106[arg1];
        field1117++;
        class79 var5 = class132.method1015(var4 >> 16, 5);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method770(true);
        } else if (arg0 == -65536) {
            int var7 = 0;
            class79 var8 = null;
            if (this.field1130 != null && this.field1130.length > arg1) {
                int var9 = this.field1130[arg1];
                var8 = class132.method1015(var9 >> 16, 5);
                var7 = var9 & 0xFFFF;
            }
            if (var8 == null || var7 == 65535) {
                class102 var11 = arg2.method770(!var5.method609(-105, var6));
                var11.method788(var5, var6);
                return var11;
            } else {
                class102 var10 = arg2.method770(!var5.method609(-110, var6) & !var8.method609(-113, var7));
                var10.method788(var5, var6);
                var10.method788(var8, var7);
                return var10;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V", line = 746)
    public final void method390(int arg0) {
        if (arg0 != -13391) {
            this.field1106 = null;
        }
        if (this.field1128 == -1) {
            if (this.field1107 == null) {
                this.field1128 = 0;
            } else {
                this.field1128 = 2;
            }
        }
        field1131++;
        if (this.field1119 != -1) {
            return;
        }
        if (this.field1107 == null) {
            this.field1119 = 0;
        } else {
            this.field1119 = 2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lr;IZ)Lr;", line = 777)
    public final class102 method391(class102 arg0, int arg1, boolean arg2) {
        int var4 = this.field1106[arg1];
        class79 var5 = class132.method1015(var4 >> 16, 5);
        field1126++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method770(true);
        } else if (arg2) {
            class102 var7 = arg0.method770(!var5.method609(-107, var6));
            var7.method788(var5, var6);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(Z)V", line = 799)
    public static final void method392(boolean arg0) {
        field1143++;
        if (!arg0) {
            field1112 = 82;
        }
        for (class64 var1 = (class64) class15.field419.method813(-96); var1 != null; var1 = (class64) class15.field419.method814((byte) -19)) {
            if (var1.field1612 > 0) {
                var1.field1612--;
            }
            if (var1.field1612 != 0) {
                if (var1.field1629 > 0) {
                    var1.field1629--;
                }
                if (var1.field1629 == 0 && var1.field1645 >= 1 && var1.field1627 >= 1 && var1.field1645 <= 102 && var1.field1627 <= 102 && (var1.field1631 < 0 || class30.method243(var1.field1643, var1.field1631, -2661))) {
                    class75.method594(var1.field1644, var1.field1645, var1.field1631, var1.field1643, (byte) -32, var1.field1614, var1.field1632, var1.field1627);
                    var1.field1629 = -1;
                    if (var1.field1631 == var1.field1623 && var1.field1623 == -1) {
                        var1.method714((byte) 53);
                    } else if (var1.field1631 == var1.field1623 && var1.field1642 == var1.field1614 && var1.field1643 == var1.field1628) {
                        var1.method714((byte) 48);
                    }
                }
            } else if (var1.field1623 < 0 || class30.method243(var1.field1628, var1.field1623, -2661)) {
                class75.method594(var1.field1644, var1.field1645, var1.field1623, var1.field1628, (byte) -83, var1.field1642, var1.field1632, var1.field1627);
                var1.method714((byte) -102);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILfe;)V", line = 855)
    private final void method393(byte arg0, int arg1, class36 arg2) {
        if (arg0 != 71) {
            method384(false);
        }
        field1110++;
        if (arg1 == 1) {
            int var4 = arg2.method365((byte) -121);
            this.field1108 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1108[var5] = arg2.method351((byte) -117);
            }
            this.field1106 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1106[var6] = arg2.method351((byte) -105);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1106[var7] += arg2.method351((byte) -124) << 16;
            }
        } else if (arg1 == 2) {
            this.field1142 = arg2.method351((byte) -102);
        } else if (arg1 == 3) {
            int var8 = arg2.method365((byte) -121);
            this.field1107 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1107[var9] = arg2.method365((byte) -123);
            }
            this.field1107[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field1129 = true;
        } else if (arg1 == 5) {
            this.field1133 = arg2.method365((byte) -128);
        } else if (arg1 == 6) {
            this.field1122 = arg2.method351((byte) -113);
        } else if (arg1 == 7) {
            this.field1144 = arg2.method351((byte) -106);
        } else if (arg1 == 8) {
            this.field1138 = arg2.method365((byte) -124);
        } else if (arg1 == 9) {
            this.field1128 = arg2.method365((byte) -124);
        } else if (arg1 == 10) {
            this.field1119 = arg2.method365((byte) -125);
        } else if (arg1 == 11) {
            this.field1114 = arg2.method365((byte) -125);
        } else if (arg1 == 12) {
            int var10 = arg2.method365((byte) -125);
            this.field1130 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1130[var11] = arg2.method351((byte) -127);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1130[var12] = (arg2.method351((byte) -104) << 16) + this.field1130[var12];
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILgd;IILr;)Lr;", line = 976)
    public final class102 method394(int arg0, class40 arg1, int arg2, int arg3, class102 arg4) {
        field1136++;
        if (arg3 <= 92) {
            return null;
        }
        int var6 = this.field1106[arg2];
        class79 var7 = class132.method1015(var6 >> 16, 5);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method391(arg4, arg0, true);
        }
        int var9 = arg1.field1106[arg0];
        class79 var10 = class132.method1015(var9 >> 16, 5);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class102 var12 = arg4.method770(!var7.method609(-111, var8));
            var12.method788(var7, var8);
            return var12;
        } else {
            class102 var13 = arg4.method770(!var7.method609(-120, var8) & !var10.method609(-112, var11));
            var13.method779(var7, var8, var10, var11, this.field1107);
            return var13;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIILfe;III)V", line = 1013)
    public static final void method395(int arg0, int arg1, int arg2, int arg3, class36 arg4, int arg5, int arg6, int arg7) {
        field1125++;
        if (arg7 >= 0 && arg7 < 104 && arg0 >= 0 && arg0 < 104) {
            class56.field1435[arg2][arg7][arg0] = 0;
            while (true) {
                int var8 = arg4.method365((byte) -121);
                if (var8 == 0) {
                    if (arg2 == 0) {
                        class69.field1781[0][arg7][arg0] = -class46.method418((byte) 86, arg1 + arg7 + 932731, arg3 + 556238 - -arg0) * 8;
                    } else {
                        class69.field1781[arg2][arg7][arg0] = class69.field1781[arg2 - 1][arg7][arg0] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg4.method365((byte) -123);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg2 == 0) {
                        class69.field1781[0][arg7][arg0] = -var9 * 8;
                    } else {
                        class69.field1781[arg2][arg7][arg0] = class69.field1781[arg2 - 1][arg7][arg0] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class6.field228[arg2][arg7][arg0] = arg4.method335(-105);
                    class43.field1188[arg2][arg7][arg0] = (byte) ((var8 - 2) / 4);
                    class8.field263[arg2][arg7][arg0] = (byte) class32.method257(var8 + arg6 - 2, 3);
                } else if (var8 <= 81) {
                    class56.field1435[arg2][arg7][arg0] = (byte) (var8 - 49);
                } else {
                    class8.field288[arg2][arg7][arg0] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg4.method365((byte) -127);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg4.method365((byte) -122);
                    break;
                }
                if (var10 <= 49) {
                    arg4.method365((byte) -121);
                }
            }
        }
        if (arg5 < 1) {
            method386(34);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfe;Z)V", line = 1112)
    public final void method396(class36 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method365((byte) -127);
            if (var3 == 0) {
                if (!arg1) {
                    return;
                }
                field1137++;
                return;
            }
            this.method393((byte) 71, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILr;)Lr;", line = 1143)
    public final class102 method397(byte arg0, int arg1, class102 arg2) {
        int var4 = this.field1106[arg1];
        field1115++;
        class79 var5 = class132.method1015(var4 >> 16, 5);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method775(true);
        }
        class102 var7 = arg2.method775(!var5.method609(-115, var6));
        if (arg0 != 36) {
            this.method396(null, false);
        }
        var7.method788(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILr;II)Lr;", line = 1207)
    public final class102 method398(int arg0, class102 arg1, int arg2, int arg3) {
        field1120++;
        int var5 = this.field1106[arg0];
        class79 var6 = class132.method1015(var5 >> 16, arg3 ^ 0xFFFA);
        int var7 = var5 & arg3;
        if (var6 == null) {
            return arg1.method770(true);
        }
        int var8 = arg2 & 0x3;
        class102 var9 = arg1.method770(!var6.method609(-123, var7));
        if (var8 == 1) {
            var9.method789();
        } else if (var8 == 2) {
            var9.method777();
        } else if (var8 == 3) {
            var9.method787();
        }
        var9.method788(var6, var7);
        if (var8 == 1) {
            var9.method787();
        } else if (var8 == 2) {
            var9.method777();
        } else if (var8 == 3) {
            var9.method789();
        }
        return var9;
    }
}
