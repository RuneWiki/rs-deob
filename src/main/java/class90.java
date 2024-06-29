import jaclib.memory.heap.NativeHeap;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class90 extends class432 {

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1166;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "Lpb;")
    public static class680 field1161 = new class680("WTRC", "office", "_rc", 1);

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "Ljo;")
    public static class351 field1167 = new class351(19, 4);

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "Lnba;")
    public static class312 field1165;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)I")
    public static final int method634(int arg0) {
        if (class145.field1852.field8989.method1619((byte) -126) == 0) {
            for (int var1 = 0; var1 < class33.field440; var1++) {
                if (class190.field2829[var1].method2710(-9159) == 's' || class190.field2829[var1].method2710(-9159) == 'S') {
                    class145.field1852.method3632(class145.field1852.field8989, true, 1);
                    class522.field7454 = true;
                    break;
                }
            }
        }
        field1169++;
        if (class515.field7364 == class496.field7034) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class109.method731(60);
            if (class573.field8109 == 0L) {
                class573.field8109 = var4;
            }
            if (var3 > 16384 && var4 - class573.field8109 < 5000L) {
                if (var4 - class664.field9316 > 1000L) {
                    System.gc();
                    class664.field9316 = var4;
                }
                return 0;
            }
        }
        if (class515.field7364 == class496.field7038) {
            if (class126.field1654 == null) {
                class126.field1654 = new class682(class451.field6478, class687.field9739, class334.field4982, class516.field7382);
            }
            if (!class126.field1654.method3852((byte) -47)) {
                return 0;
            }
            class147.method1015(0, -2, true, null);
            class455.field6535 = !class610.method3514(false);
            class631.field8919 = class34.method234(false, 1, arg0 + 999999, class455.field6535 ? 34 : 32);
            class705.field9940 = class34.method234(false, 1, 1000000, 33);
            class7.field79 = class34.method234(false, 1, arg0 ^ 0xF4241, 13);
        }
        if (class515.field7364 == class496.field7040) {
            boolean var6 = class705.field9940.method3132(true);
            int var7 = class656.field9245[33].method1714(-1);
            int var8 = var7 + class656.field9245[class455.field6535 ? 34 : 32].method1714(-1);
            int var9 = var8 + class656.field9245[13].method1714(-1);
            int var10 = var9 + (var6 ? 100 : class705.field9940.method3155(-79));
            if (var10 != 400) {
                return var10 / 4;
            }
            class327.field4892 = class631.field8919.method3157(3);
            class61.field828 = class705.field9940.method3157(arg0 + 2);
            class568.method3300(class631.field8919, arg0 ^ 0x52);
            int var11 = class145.field1852.field9014.method2326((byte) -81);
            class693.field9791 = new class277(class536.field7555, class526.field7494, class705.field9940);
            int[] var12 = class693.field9791.method1803((byte) 101, var11);
            if (var12.length == 0) {
                var12 = class693.field9791.method1803((byte) 112, 0);
            }
            class217 var13 = new class217(class631.field8919, class7.field79);
            if (var12.length > 0) {
                class380.field5449 = new class613[var12.length];
                for (int var14 = 0; var14 < class380.field5449.length; var14++) {
                    class380.field5449[var14] = new class328(class693.field9791.method1799(var12[var14], 103), var13);
                }
            }
        }
        if (class515.field7364 == class496.field7041) {
            class606.method3495(arg0 ^ 0x76, class664.method3780(arg0 + 723), class7.field79, class631.field8919);
        }
        if (class515.field7364 == class496.field7042) {
            int var15 = class674.method3823((byte) -128);
            int var16 = class425.method2533(-2);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class515.field7364 == class496.field7043) {
            if (class380.field5449 != null && class380.field5449.length > 0) {
                if (class380.field5449[0].method1536(9657) < 100) {
                    return 0;
                }
                if (class380.field5449.length > 1 && class693.field9791.method1798(-9899) && class380.field5449[1].method1536(9657) < 100) {
                    return 0;
                }
            }
            class89.method629(class638.field8979, (byte) -104);
            class361.method2263(75, class638.field8979);
            class374.method2323(1, (byte) -125);
        }
        if (class515.field7364 == class496.field7044) {
            for (int var17 = 0; var17 < 4; var17++) {
                class234.field3394[var17] = class459.method2736(class109.field1314, class760.field10479, 22204);
            }
        }
        if (class515.field7364 == class496.field7045) {
            class491.field6972 = class34.method234(false, 1, 1000000, 8);
            class235.field3408 = class34.method234(false, 1, 1000000, 0);
            class524.field7476 = class34.method234(false, 1, 1000000, 1);
            class518.field7400 = class34.method234(false, 1, 1000000, 2);
            class471.field6715 = class34.method234(false, 1, 1000000, 3);
            class346.field5086 = class34.method234(false, 1, arg0 + 999999, 4);
            class277.field3850 = class34.method234(true, 1, 1000000, 5);
            class606.field8526 = class34.method234(true, 1, arg0 ^ 0xF4241, 6);
            class358.field5213 = class34.method234(false, 1, 1000000, 7);
            class77.field1029 = class34.method234(false, 1, 1000000, 9);
            class397.field5630 = class34.method234(false, 1, 1000000, 10);
            class76.field1026 = class34.method234(false, 1, 1000000, 11);
            class264.field3732 = class34.method234(false, 1, arg0 + 999999, 12);
            class641.field9035 = class34.method234(false, 1, 1000000, 14);
            class84.field1103 = class34.method234(false, 1, 1000000, 15);
            class179.field2712 = class34.method234(false, 1, arg0 ^ 0xF4241, 16);
            class490.field6965 = class34.method234(false, 1, arg0 + 999999, 17);
            class439.field6284 = class34.method234(false, 1, 1000000, 18);
            class145.field1851 = class34.method234(false, 1, arg0 + 999999, 19);
            class703.field9906 = class34.method234(false, 1, 1000000, 20);
            class171.field2443 = class34.method234(false, 1, arg0 + 999999, 21);
            client.field4674 = class34.method234(false, 1, 1000000, 22);
            class621.field8752 = class34.method234(true, 1, 1000000, 23);
            class136.field1780 = class34.method234(false, 1, 1000000, 24);
            class739.field10311 = class34.method234(false, 1, arg0 + 999999, 25);
            class214.field3087 = class34.method234(true, 1, 1000000, 26);
            class657.field9270 = class34.method234(false, 1, arg0 + 999999, 27);
            class134.field1740 = class34.method234(true, 1, 1000000, 28);
            class587.field8308 = class34.method234(false, 1, arg0 ^ 0xF4241, 29);
            class469.field6703 = class34.method234(true, 1, 1000000, 30);
            class689.field9756 = class34.method234(true, 1, arg0 + 999999, 31);
            class71.field967 = class34.method234(true, 2, 1000000, 36);
        }
        if (class515.field7364 == class496.field7046) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class656.field9245[var19] != null) {
                    var18 += class656.field9245[var19].method1714(-1) * class196.field2879[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class588.field8321 < 0) {
                    class588.field8321 = var18;
                }
                return (var18 - class588.field8321) * 100 / (100 - class588.field8321);
            }
            class481.method2823(class491.field6972, 23381);
            class606.method3495(107, class664.method3780(arg0 ^ 0x2D5), class7.field79, class491.field6972);
        }
        if (class515.field7364 == class496.field7047) {
            if (class792.field10870 == -1) {
                class792.field10870 = class606.field8526.method3134(0, "scape main");
            }
            class124.method914(22050);
            class374.method2323(2, (byte) 112);
        }
        if (class515.field7364 == class496.field7048) {
            class677.method3830((byte) -44, class469.field6703, class27.field395);
        }
        if (class515.field7364 == class496.field7049) {
            int var20 = class265.method1745(100);
            if (var20 < 100) {
                return var20;
            }
            class37.method268(class134.field1740.method3149(1, -114), (byte) -128);
            class63.method379((byte) 72, class134.field1740.method3149(3, -115));
            class99.field1257 = new class755(class134.field1740);
        }
        if (class515.field7364 == class496.field7050) {
            if (class123.field1606 != -1 && !class358.field5213.method3135(-1, 0, class123.field1606)) {
                return 99;
            }
            class413.field5837 = new class318(class214.field3087, class77.field1029, class491.field6972);
            class788.field10824 = new class233(class536.field7555, class526.field7494, class518.field7400);
            class549.field7742 = new class671(class536.field7555, class526.field7494, class518.field7400, class99.field1257);
            class604.field8501 = new class299(class536.field7555, class526.field7494, class518.field7400, class491.field6972);
            class391.field5554 = new class35(class536.field7555, class526.field7494, class490.field6965);
            class483.field6864 = new class696(class536.field7555, class526.field7494, class518.field7400);
            class32.field438 = new class744(class536.field7555, class526.field7494, class518.field7400);
            class162.field2384 = new class195(class536.field7555, class526.field7494, class518.field7400, class491.field6972);
            class176.field2677 = new class16(class536.field7555, class526.field7494, class518.field7400, class358.field5213);
            class783.field10778 = new class697(class536.field7555, class526.field7494, class518.field7400);
            class276.field3842 = new class340(class536.field7555, class526.field7494, class518.field7400);
            class496.field7061 = new class49(class536.field7555, class526.field7494, true, class179.field2712, class358.field5213);
            class247.field3521 = new class649(class536.field7555, class526.field7494, class518.field7400, class491.field6972);
            class386.field5496 = new class553(class536.field7555, class526.field7494, class518.field7400, class491.field6972);
            class21.field322 = new class204(class536.field7555, class526.field7494, true, class439.field6284, class358.field5213);
            class526.field7490 = new class624(class536.field7555, class526.field7494, true, class788.field10824, class145.field1851, class358.field5213);
            class488.field6906 = new class231(class536.field7555, class526.field7494, class518.field7400);
            class203.field2975 = new class289(class536.field7555, class526.field7494, class703.field9906, class235.field3408, class524.field7476);
            class684.field9714 = new class539(class536.field7555, class526.field7494, class518.field7400);
            class510.field7302 = new class75(class536.field7555, class526.field7494, class518.field7400);
            class87.field1131 = new class224(class536.field7555, class526.field7494, class171.field2443, class358.field5213);
            class729.field10195 = new class71(class536.field7555, class526.field7494, class518.field7400);
            class35.field456 = new class517(class536.field7555, class526.field7494, class518.field7400);
            class463.field6616 = new class89(class536.field7555, class526.field7494, class518.field7400);
            class324.field4862 = new class562(class536.field7555, class526.field7494, client.field4674);
            class266.field3756 = new class475(class536.field7555, class526.field7494, class518.field7400);
            class511.field7304 = new class145(class536.field7555, class526.field7494, class518.field7400);
            class627.method3592(class358.field5213, class7.field79, class491.field6972, -79, class471.field6715);
            class376.method2329((byte) -93, class587.field8308);
            class101.field1275 = new class779(class526.field7494, class136.field1780, class739.field10311);
            class544.field7646 = new class234(class526.field7494, class136.field1780, class739.field10311, new class99());
            class189.method1398((byte) -92);
            class496.field7061.method321((byte) 84, class145.field1852.field9018.method2757((byte) -83) == 0);
            class271.field3796 = new class276();
            class292.method1978(true);
            class253.method1676(arg0 ^ 0x5964, class657.field9270);
            class202.method1452(class413.field5837, 22203, class358.field5213);
            class672 var21 = new class672(class397.field5630.method3126((byte) -105, "huffman", ""));
            class241.method1641(48, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class31.field424 = class361.method2266(true);
            class357.field5197 = new class119(true, class27.field395);
        }
        if (class515.field7364 == class496.field7052) {
            int var22 = class269.method1758(class491.field6972, arg0 - 14) + class239.method1639(arg0 ^ 0x1, true);
            int var23 = class697.method3928(16) + class425.method2533(-2);
            if (var23 > var22) {
                return var22 * 100 / var23;
            }
        }
        if (arg0 != 1) {
            return -104;
        }
        if (class515.field7364 == class496.field7053) {
            class436.method2617(class621.field8752, class483.field6864, class32.field438, class496.field7061, class247.field3521, class386.field5496, class271.field3796);
        }
        if (class515.field7364 == class496.field7054) {
            class604.field8499 = new int[class463.field6616.field1155];
            class434.field6173 = new String[class35.field456.field7390];
            class9.field127 = new boolean[class463.field6616.field1155];
            for (int var24 = 0; var24 < class463.field6616.field1155; var24++) {
                if (class463.field6616.method633((byte) -20, var24).field10454 == 0) {
                    class9.field127[var24] = true;
                    class132.field1728++;
                }
                class604.field8499[var24] = -1;
            }
            class444.method2675(false);
            class730.field10207 = class471.field6715.method3134(arg0 ^ 0x1, "loginscreen");
            class711.field10012 = class471.field6715.method3134(0, "lobbyscreen");
            class277.field3850.method3145(true, arg0 ^ 0xFFFFE940, false);
            class606.field8526.method3145(true, arg0 - 5824, true);
            class491.field6972.method3145(true, -5823, true);
            class7.field79.method3145(true, -5823, true);
            class397.field5630.method3145(true, arg0 ^ 0xFFFFE940, true);
            class471.field6715.method3145(true, -5823, true);
            class489.field6914 = true;
            class518.field7400.field7650 = 2;
            class490.field6965.field7650 = 2;
            class179.field2712.field7650 = 2;
            class439.field6284.field7650 = 2;
            class145.field1851.field7650 = 2;
            class703.field9906.field7650 = 2;
            class171.field2443.field7650 = 2;
        }
        if (class515.field7364 == class496.field7055) {
            if (!class420.method2512((byte) 43, class730.field10207)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class110.field1382[class730.field10207].length; var26++) {
                class176 var27 = class110.field1382[class730.field10207][var26];
                if (var27.field2560 == 5 && var27.field2638 != -1 && !class491.field6972.method3135(-1, 0, var27.field2638)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class515.field7364 == class496.field7056) {
            class619.method3537(2028208128, true);
        }
        if (class515.field7364 == class496.field7057) {
            class203.field2976.method618(arg0 ^ 0xFFFF815D);
            try {
                class421.field5944.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class693.field9791 = null;
            class705.field9940 = null;
            class421.field5944 = null;
            class203.field2976 = null;
            class380.field5449 = null;
            class631.field8919 = null;
            class96.method674((byte) 95);
            class267.field3757 = class145.field1852.field8989.method1619((byte) -116) == 1;
            class145.field1852.method3632(class145.field1852.field8989, true, 1);
            if (class267.field3757) {
                class145.field1852.method3632(class145.field1852.field9016, true, 0);
            } else if (class145.field1852.field9016.field5231 && class357.field5197.field1506 < 512 && class357.field5197.field1506 != 0) {
                class145.field1852.method3632(class145.field1852.field9016, true, 0);
            }
            class781.method4285(3);
            if (class267.field3757) {
                class226.method1559((byte) 3, false, 0);
            } else {
                class226.method1559((byte) 98, false, class145.field1852.field9016.method2258((byte) -50));
            }
            class725.method4080(-1, class145.field1852.field8987.method2724((byte) -110), -1, false, 0);
            class89.method629(class638.field8979, (byte) -117);
            class361.method2263(-114, class638.field8979);
            class347.method2198(class638.field8979, class491.field6972, arg0 ^ 0x1);
            class384.method2351(0, class541.field7591);
        }
        return class141.method980(-26546);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)I")
    public static final int method635(int arg0, int arg1, int arg2, int arg3) {
        field1160++;
        if ((class617.field8700[arg1][arg0][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class617.field8700[1][arg0][arg3] & 0x2) == 0) {
            return arg2 == 1000 ? arg1 : 88;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BII)I")
    public static final int method636(byte arg0, int arg1, int arg2) {
        field1163++;
        if (arg0 <= 97) {
            field1161 = null;
        }
        byte var3;
        if (arg1 > 20000) {
            class481.method2822(0);
            var3 = 4;
        } else if (arg1 > 10000) {
            var3 = 3;
            class566.method3293(true);
        } else if (arg1 <= 5000) {
            var3 = 1;
            class34.method232((byte) -58, true);
        } else {
            class478.method2814(0);
            var3 = 2;
        }
        if (arg2 != class145.field1852.field9002.method2258((byte) -72)) {
            class145.field1852.method3632(class145.field1852.field9016, true, arg2);
            class226.method1559((byte) 12, false, arg2);
        }
        class781.method4285(3);
        return var3;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIZ)V")
    public static final void method637(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1162++;
        if (class420.method2512((byte) 43, arg0)) {
            class672.method3809(arg1, arg3, arg4, class110.field1382[arg0], arg2 ^ 0xFFFF9F66, arg2);
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(I)V")
    public static void method638(int arg0) {
        field1165 = null;
        field1161 = null;
        field1167 = null;
        if (arg0 >= -92) {
            method635(88, -8, -5, -82);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public final void method639(byte arg0) {
        field1168++;
        this.field1166.method3947();
        if (arg0 != 42) {
            method636((byte) 3, -19, 98);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)V")
    public static final void method640(byte arg0, int arg1) {
        field1164++;
        class678 var2 = class630.method3597(29636, 7, (long) arg1);
        var2.method3836((byte) -60);
        if (arg0 < 110) {
            method634(105);
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(I)V")
    public class90(int arg0) {
        this.field1166 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
    public static final void method641(int arg0, int arg1, int arg2) {
        field1159++;
        int var3 = class33.field439.method1728(class674.field9575.method3825((byte) -10, class526.field7494), -35);
        int var5;
        if (class102.field1282) {
            for (class4 var4 = (class4) class174.field2456.method2480(381); var4 != null; var4 = (class4) class174.field2456.method2476((byte) 18)) {
                int var6;
                if (var4.field49 == 1) {
                    var6 = class328.method2123((class312) var4.field46.field5842.field3126, 98);
                } else {
                    var6 = class316.method2074(var4, 0);
                }
                if (var3 < var6) {
                    var3 = var6;
                }
            }
            var5 = class27.field394 * 16 + 21;
            class407.field5748 = (class102.field1283 ? 26 : 22) + class27.field394 * 16;
            var3 += 8;
        } else {
            for (class312 var7 = (class312) class551.field7826.method2508((byte) 108); var7 != null; var7 = (class312) class551.field7826.method2505((byte) -55)) {
                int var10 = class328.method2123(var7, 92);
                if (var3 < var10) {
                    var3 = var10;
                }
            }
            class407.field5748 = (class102.field1283 ? 26 : 22) + class543.field7608 * 16;
            var3 += 8;
            var5 = class543.field7608 * 16 + 21;
        }
        if (arg0 != 1) {
            method635(69, 104, 51, 28);
        }
        int var8 = arg1 - (var3 / 2);
        if (class638.field8980 < var8 + var3) {
            var8 = class638.field8980 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        if (class512.field7325 < (var5 + arg2)) {
            var9 = class512.field7325 - var5;
        }
        class505.field7233 = var8;
        if (var9 < 0) {
            var9 = 0;
        }
        class422.field5962 = true;
        class761.field10487 = var9;
        class611.field8627 = var3;
    }
}
