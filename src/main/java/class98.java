import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class98 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "J")
    public long field1465 = 0L;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lec;")
    public static class25 field1463 = new class25(2);

    @OriginalMember(owner = "client!em", name = "n", descriptor = "S")
    public static short field1476 = 1;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1470 = "shake:";

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Lfa;")
    public static class273 field1477;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Ljk;")
    public class276 field1479;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Ljk;")
    public class276 field1480;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIILjk;JZ)V")
    public static final void method633(int arg0, int arg1, int arg2, int arg3, class276 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class286 var8 = new class286();
        var8.field4769 = arg4;
        var8.field4771 = arg1 * 128 + 64;
        var8.field4774 = arg2 * 128 + 64;
        var8.field4764 = arg3;
        var8.field4766 = arg5;
        if (class27.field346[arg0][arg1][arg2] == null) {
            class27.field346[arg0][arg1][arg2] = new class154(arg0, arg1, arg2);
        }
        class27.field346[arg0][arg1][arg2].field2419 = var8;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    public static void method634(boolean arg0) {
        field1477 = null;
        if (!arg0) {
            field1477 = null;
        }
        field1470 = null;
        field1463 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZBII)V")
    public static final void method635(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        field1474++;
        class80.field1274++;
        if (class309.field5006 != null && (class309.field5006.field836 - (class309.field5006.method362(25892) - 1) * 64 >> 7) == class281.field4649 && (class309.field5006.field850 - (class309.field5006.method362(25892) - 1) * 64 >> 7) == class271.field4443) {
            client.field2582 = false;
            class281.field4649 = 0;
        }
        class68.method429((byte) 79);
        if (!arg2) {
            class243.method1706((byte) 88);
        }
        class49.method305(-1);
        class77.field1199 = arg5;
        class77.field1209 = arg0;
        if (class92.field1402 == 1) {
            int var8 = (int) class79.field1255;
            if (class276.field4569 / 256 > var8) {
                var8 = class276.field4569 / 256;
            }
            int var9 = (int) class202.field3253 + class128.field1974 & 0x7FF;
            if (class99.field1483[4] && var8 < (class225.field3580[4] + 128)) {
                var8 = class225.field3580[4] + 128;
            }
            class53.method320(arg4, var9, false, class12.method66(class309.field5006.field836, class165.field2600, class309.field5006.field850, 0) - 50, var8, var8 * 3 + 600, class302.field4946, class118.field1804);
        } else if (class92.field1402 == 4) {
            int var6 = (int) class79.field1255;
            if (var6 < (class276.field4569 / 256)) {
                var6 = class276.field4569 / 256;
            }
            if (class99.field1483[4] && var6 < class225.field3580[4] + 128) {
                var6 = class225.field3580[4] + 128;
            }
            int var7 = (int) class202.field3253 & 0x7FF;
            class53.method320(arg4, var7, false, class12.method66(class274.field4531, class165.field2600, class49.field677, 0) - 50, var6, (var6 * 3) + 600, class302.field4946, class118.field1804);
        } else if (class92.field1402 == 5) {
            class286.method2015(-123, arg4);
        }
        int var10 = class262.field4326;
        int var11 = class53.field715;
        int var12 = class174.field2724;
        int var13 = class100.field1514;
        int var14 = class132.field2037;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class99.field1483[var15]) {
                int var23 = (int) ((double) (class204.field3287[var15] * 2 + 1) * Math.random() + Math.sin((double) class208.field3347[var15] / 100.0D * (double) class314.field5064[var15]) * (double) class225.field3580[var15] - (double) class204.field3287[var15]);
                if (var15 == 1) {
                    class262.field4326 += var23;
                }
                if (var15 == 2) {
                    class174.field2724 += var23;
                }
                if (var15 == 0) {
                    class53.field715 += var23;
                }
                if (var15 == 3) {
                    class100.field1514 = class100.field1514 + var23 & 0x7FF;
                }
                if (var15 == 4) {
                    class132.field2037 += var23;
                    if (class132.field2037 < 128) {
                        class132.field2037 = 128;
                    }
                    if (class132.field2037 > 383) {
                        class132.field2037 = 383;
                    }
                }
            }
        }
        class123.method808(721849927);
        class62.method391(arg5, arg0, arg1 + arg5, arg0 + arg4);
        class172.method1139();
        if (class40.field496 < 0) {
            class62.method380(arg5, arg0, arg1, arg4, 0);
        } else {
            class205 var16 = class306.method2092(class197.field3127, class102.field1544, class40.field496, (byte) 22, class164.field2589);
            var16.method1466(class203.field3284, arg5, arg0, arg1, arg4, class132.field2037, class100.field1514, 0);
        }
        if (class220.field3525 || arg5 > class265.field4367 || class265.field4367 >= arg1 + arg5 || arg0 > class262.field4331 || arg0 + arg4 <= class262.field4331) {
            class104.field1560 = true;
            class103.field1555 = 0;
            class43.field592 = false;
        } else {
            int var17 = class66.field978;
            int var18 = class141.field2191;
            class43.field592 = true;
            class103.field1555 = 0;
            class157.field2490 = (class265.field4367 - arg5) * (var18 - var17) / arg1 + var17;
            int var19 = class43.field601;
            class104.field1560 = true;
            int var20 = class287.field4777;
            class262.field4325 = (class262.field4331 - arg0) * (var20 - var19) / arg4 + var19;
        }
        class217.method1521(1);
        byte var21 = class226.method1572(12283) == 2 ? (byte) class80.field1274 : 1;
        class84.method563(class53.field715, class262.field4326, class174.field2724, class132.field2037, class100.field1514, class219.field3506, class248.field3942, class216.field3446, class93.field1417, class157.field2501, class218.field3479, class165.field2600 + 1, var21, class309.field5006.field836 >> 7, class309.field5006.field850 >> 7);
        class217.method1521(1);
        class82.method557();
        class307.method2100(256, arg5, arg0, -128, arg4, 256, arg1);
        class294.method2052(arg1, arg0, 256, arg4, 256, arg5, -96);
        ((class266) class172.field2670).method1839(class247.field3938, 255);
        class7.method38(arg0, arg1, 100, arg5, arg4);
        class132.field2037 = var14;
        class174.field2724 = var12;
        int var22 = -3 % ((arg3 + 69) / 34);
        class53.field715 = var11;
        class262.field4326 = var10;
        class100.field1514 = var13;
        if (class230.field3676 && class229.field3663.method1696((byte) 125) == 0) {
            class230.field3676 = false;
        }
        if (class230.field3676) {
            class62.method380(arg5, arg0, arg1, arg4, 0);
            class152.method1007(false, class250.field3982, (byte) -121);
        }
        if (!arg2 && !class230.field3676 && !class220.field3525 && arg5 <= class265.field4367 && arg1 + arg5 > class265.field4367 && arg0 <= class262.field4331 && class262.field4331 < (arg0 + arg4)) {
            class235.method1633(class262.field4331, class265.field4367, arg5, -124, arg1, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method636(int arg0, String arg1) {
        field1471++;
        if (arg1 == null) {
            return;
        }
        String var2 = class304.method2088(arg1, 2);
        if (var2 == null) {
            return;
        }
        if (arg0 != 7993) {
            method637(false);
        }
        for (int var3 = 0; var3 < class140.field2164; var3++) {
            String var4 = class304.method2088(class120.field1848[var3], 2);
            if (var4 != null && var4.equals(var2)) {
                class140.field2164--;
                class174.field2716++;
                for (int var5 = var3; var5 < class140.field2164; var5++) {
                    class120.field1848[var5] = class120.field1848[var5 + 1];
                    class241.field3808[var5] = class241.field3808[var5 + 1];
                    class69.field1013[var5] = class69.field1013[var5 + 1];
                    class277.field4593[var5] = class277.field4593[var5 + 1];
                    class53.field719[var5] = class53.field719[var5 + 1];
                    class175.field2738[var5] = class175.field2738[var5 + 1];
                }
                class287.field4783 = class40.field502;
                class276.field4572.method1391(0, 184);
                class276.field4572.method1446((byte) 55, class187.method1270((byte) -62, arg1));
                class276.field4572.method1409(arg1, (byte) 77);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)I")
    public static final int method637(boolean arg0) {
        if (!arg0) {
            field1470 = null;
        }
        field1473++;
        return 2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method638(Component arg0, int arg1) {
        field1467++;
        arg0.addMouseListener(class190.field2937);
        int var2 = 3 / ((arg1 + 73) / 51);
        arg0.addMouseMotionListener(class190.field2937);
        arg0.addFocusListener(class190.field2937);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static final void method639(int arg0) {
        field1481++;
        if (class13.field171 == null) {
            return;
        }
        if (class127.field1968 < 10) {
            if (!class13.field163.method1901(1, class13.field171.field3486)) {
                class127.field1968 = class157.field2499.method1879(class13.field171.field3486, (byte) 120) / 10;
                return;
            }
            class272.method1868(85);
            class127.field1968 = 10;
        }
        if (class127.field1968 == 10) {
            class13.field173 = class13.field171.field3470 >> 6 << 6;
            class13.field169 = class13.field171.field3471 >> 6 << 6;
            class13.field165 = (class13.field171.field3476 >> 6 << 6) + 64 - class13.field169;
            class13.field175 = (class13.field171.field3466 >> 6 << 6) + 64 - class13.field173;
            int[] var1 = new int[3];
            int var2 = -1;
            int var3 = -1;
            if (class13.field171.method1526(false, (class309.field5006.field836 >> 7) + class101.field1517, (class309.field5006.field850 >> 7) + class254.field4063, class165.field2600, var1)) {
                var2 = class13.field165 - (var1[2] - class13.field169) - 1;
                var3 = var1[1] - class13.field173;
            }
            if (!class270.field4430 && var3 >= 0 && class13.field175 > var3 && var2 >= 0 && class13.field165 > var2) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var2 + ((int) (Math.random() * 10.0D) - 5);
                class187.field2897 = var4;
                class44.field606 = var5;
            } else if (class141.field2177 == -1 || class151.field2349 == -1) {
                class13.field171.method1522(18539, class13.field171.field3467 >> 14 & 0x3FFF, var1, class13.field171.field3467 & 0x3FFF);
                class44.field606 = class13.field169 + class13.field165 - var1[2] - 1;
                class187.field2897 = var1[1] - class13.field173;
            } else {
                class13.field171.method1522(18539, class141.field2177, var1, class151.field2349);
                class151.field2349 = -1;
                class141.field2177 = -1;
                class270.field4430 = false;
                if (var1 != null) {
                    class44.field606 = class13.field165 - (var1[2] + 1 - class13.field169);
                    class187.field2897 = var1[1] - class13.field173;
                }
            }
            if (class13.field171.field3481 == 37) {
                class13.field172 = 3.0F;
                class13.field174 = 3.0F;
            } else if (class13.field171.field3481 == 50) {
                class13.field172 = 4.0F;
                class13.field174 = 4.0F;
            } else if (class13.field171.field3481 == 75) {
                class13.field172 = 6.0F;
                class13.field174 = 6.0F;
            } else if (class13.field171.field3481 == 100) {
                class13.field172 = 8.0F;
                class13.field174 = 8.0F;
            } else if (class13.field171.field3481 == 200) {
                class13.field172 = 16.0F;
                class13.field174 = 16.0F;
            } else {
                class13.field172 = 8.0F;
                class13.field174 = 8.0F;
            }
            class162.method1073(-121);
            int var6 = class13.field175 >> 6;
            class13.field190 = new int[class137.field2124 + 1];
            int var7 = class13.field165 >> 6;
            class13.field185 = new byte[var6][var7][];
            class13.field179 = new byte[var6][var7][];
            class13.field181 = new int[var6][var7][];
            class13.field187 = new byte[var6][var7][];
            class13.field182 = new byte[var6][var7][];
            class13.field188 = new int[var6][var7][];
            class13.field186 = new byte[var6][var7][];
            class194.field3071 = new class281();
            class211.field3385 = new class22();
            int var8 = class300.field4931 >> 1;
            int var9 = class67.field982 >> 2 << 10;
            class13.method82(var9, var8);
            class171.method1128(1024, false, 256);
            class274.method1908(256, -1, 256);
            class138.method921(true, 256);
            class127.field1968 = 20;
        } else if (class127.field1968 == 20) {
            class137.method915(0, new class202(class13.field163.method1889(124, "underlay", class13.field171.field3486)));
            class127.field1968 = 30;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 30) {
            class13.method81(new class202(class13.field163.method1889(127, "overlay", class13.field171.field3486)));
            class127.field1968 = 40;
            class252.method1748(9801);
        } else if (class127.field1968 == 40) {
            class13.method78(new class202(class13.field163.method1889(123, "overlay2", class13.field171.field3486)));
            class127.field1968 = 50;
            class252.method1748(9801);
        } else if (class127.field1968 == 50) {
            class13.method68(new class202(class13.field163.method1889(124, "loc", class13.field171.field3486)), class141.field2180);
            class127.field1968 = 60;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 60) {
            if (class13.field163.method1899(class13.field171.field3486 + "_labels", true)) {
                if (!class13.field163.method1901(1, class13.field171.field3486 + "_labels")) {
                    return;
                }
                class13.field167 = class131.method878(-2, class141.field2180, class13.field171.field3486 + "_labels", class13.field163);
            } else {
                class13.field167 = new class288(0);
            }
            class13.method83();
            class127.field1968 = 70;
            class252.method1748(9801);
        } else if (class127.field1968 == 70) {
            class212.field3386 = new class30(11, true, class113.field1701);
            class127.field1968 = 73;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 73) {
            class37.field485 = new class30(12, true, class113.field1701);
            class127.field1968 = 76;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 76) {
            class294.field4826 = new class30(14, true, class113.field1701);
            class127.field1968 = 79;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 79) {
            class3.field15 = new class30(17, true, class113.field1701);
            class127.field1968 = 82;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 82) {
            class226.field3583 = new class30(19, true, class113.field1701);
            class127.field1968 = 85;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 85) {
            class178.field2771 = new class30(22, true, class113.field1701);
            class127.field1968 = 88;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else if (class127.field1968 == 88) {
            class148.field2314 = new class30(26, true, class113.field1701);
            class127.field1968 = 91;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
        } else {
            class31.field398 = new class30(30, true, class113.field1701);
            class127.field1968 = 100;
            class215.method1506((byte) 59, true);
            class252.method1748(9801);
            int var10 = 100 % ((55 - arg0) / 51);
            System.gc();
        }
    }
}
