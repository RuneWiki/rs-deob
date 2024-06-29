import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class407 {

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field5737 = 0;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field5739 = 0;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)I")
    public static final int method2401(boolean arg0) {
        if (!class72.field935.field6520) {
            for (int var1 = 0; var1 < class18.field154; var1++) {
                if (class143.field1818[var1].method99(17220) == 's' || class143.field1818[var1].method99(17220) == 'S') {
                    class72.field935.field6520 = true;
                    break;
                }
            }
        }
        field5738++;
        if (class38.field386 == class119.field1526) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class669.method3713(0);
            if (class275.field3725 == 0L) {
                class275.field3725 = var4;
            }
            if (var3 > 16384 && (var4 - class275.field3725) < 5000L) {
                if (var4 - class532.field7342 > 1000L) {
                    System.gc();
                    class532.field7342 = var4;
                }
                return 0;
            }
        }
        if (class38.field388 == class119.field1526) {
            if (class240.field3147 == null) {
                class240.field3147 = new class621(class311.field4180, class249.field3352, class227.field2959, class312.field4375);
            }
            if (!class240.field3147.method3398(-16834)) {
                return 0;
            }
            class473.method2656(-12087, 0, false);
            class125.field1608 = class652.method3614(32, 22570, true, false, 1);
            class659.field9290 = class652.method3614(33, 22570, true, false, 1);
            class613.field8373 = class652.method3614(13, 22570, true, false, 1);
        }
        if (class38.field389 == class119.field1526) {
            class659.field9290.method1088(-78);
            int var6 = class352.field5145[33].method1602((byte) -16);
            int var7 = var6 + class352.field5145[32].method1602((byte) -16);
            int var8 = var7 + class352.field5145[13].method1602((byte) -16);
            int var9 = var8 + class659.field9290.method1070(115);
            if (var9 != 400) {
                return var9 / 4;
            }
            class511.field6888 = class125.field1608.method1059(true);
            class563.field7699 = class659.field9290.method1059(true);
            class286.method1715((byte) 77, class125.field1608);
            int var10 = class72.field935.field6530;
            class266.field3650 = new class639(class33.field322, class350.field5121, class659.field9290);
            int[] var11 = class266.field3650.method3477(var10, 339);
            class609 var12 = new class609(class125.field1608);
            if (var11.length > 0) {
                class241.field3153 = new class617[var11.length];
                for (int var13 = 0; var13 < class241.field3153.length; var13++) {
                    class241.field3153[var13] = new class6(class266.field3650.method3480(var11[var13], (byte) 95), var12);
                }
            }
        }
        if (class38.field390 == class119.field1526) {
            class604.method3342(class612.method3368(1), class613.field8373, 9216, class125.field1608);
        }
        if (class38.field391 == class119.field1526) {
            int var14 = class386.method2323(23384);
            int var15 = class452.method2573(0);
            if (var15 > var14) {
                return var14 * 100 / var15;
            }
        }
        if (class38.field392 == class119.field1526) {
            class234.method1450(false, class9.field103);
            class282.method1696(class9.field103, (byte) 72);
            class676.method3739(-22149, 1);
        }
        if (class38.field393 == class119.field1526) {
            for (int var16 = 0; var16 < 4; var16++) {
                class624.field8489[var16] = class114.method638(class12.field113, (byte) -89, class588.field8082);
            }
        }
        if (class38.field394 == class119.field1526) {
            class39.field510 = class652.method3614(8, 22570, true, false, 1);
            class401.field5696 = class652.method3614(0, 22570, true, false, 1);
            class93.field1162 = class652.method3614(1, 22570, true, false, 1);
            class119.field1528 = class652.method3614(2, 22570, true, false, 1);
            class108.field1300 = class652.method3614(3, 22570, true, false, 1);
            class589.field8086 = class652.method3614(4, 22570, true, false, 1);
            class397.field5664 = class652.method3614(5, 22570, true, true, 1);
            class328.field4812 = class652.method3614(6, 22570, false, true, 1);
            class284.field3839 = class652.method3614(7, 22570, true, false, 1);
            class355.field5163 = class652.method3614(9, 22570, true, false, 1);
            class103.field1263 = class652.method3614(10, 22570, true, false, 1);
            class209.field2740 = class652.method3614(11, 22570, true, false, 1);
            class314.field4517 = class652.method3614(12, 22570, true, false, 1);
            class16.field132 = class652.method3614(14, 22570, false, false, 1);
            class360.field5194 = class652.method3614(15, 22570, true, false, 1);
            class560.field7638 = class652.method3614(16, 22570, true, false, 1);
            class563.field7708 = class652.method3614(17, 22570, true, false, 1);
            class175.field2199 = class652.method3614(18, 22570, true, false, 1);
            class560.field7636 = class652.method3614(19, 22570, true, false, 1);
            class327.field4752 = class652.method3614(20, 22570, true, false, 1);
            class23.field223 = class652.method3614(21, 22570, true, false, 1);
            class440.field6064 = class652.method3614(22, 22570, true, false, 1);
            class307.field4123 = class652.method3614(23, 22570, true, true, 1);
            class429.field5959 = class652.method3614(24, 22570, true, false, 1);
            class61.field846 = class652.method3614(25, 22570, true, false, 1);
            class3.field29 = class652.method3614(26, 22570, true, true, 1);
            class417.field5814 = class652.method3614(27, 22570, true, false, 1);
            class639.field8722 = class652.method3614(28, 22570, true, true, 1);
            class462.field6300 = class652.method3614(29, 22570, true, false, 1);
            class640.field8729 = class652.method3614(30, 22570, true, true, 1);
            class16.field134 = class652.method3614(31, 22570, true, true, 1);
        }
        if (class38.field395 == class119.field1526) {
            int var17 = 0;
            for (int var18 = 0; var18 < 34; var18++) {
                var17 += class352.field5145[var18].method1602((byte) -16) * class99.field1206[var18] / 100;
            }
            if (var17 != 100) {
                return var17;
            }
            class370.method2272(false, class39.field510);
            class604.method3342(class612.method3368(1), class613.field8373, 9216, class39.field510);
        }
        if (class38.field396 == class119.field1526) {
            class77.method437(false);
            class676.method3739(-22149, 2);
        }
        if (class38.field397 == class119.field1526) {
            class110.method583(false, class640.field8729, class495.field6687);
        }
        if (class38.field398 == class119.field1526) {
            if (!class639.field8722.method1088(-65)) {
                return class639.field8722.method1070(108);
            }
            class548.method3082(class639.field8722.method1082((byte) 33, 1), (byte) 1);
            class155.method1030((byte) -115, class639.field8722.method1082((byte) 33, 3));
            if (class254.field3512 != -1 && !class284.field3839.method1081((byte) 100, class254.field3512, 0)) {
                return 99;
            }
        }
        if (class38.field399 == class119.field1526) {
            int var19 = class222.method1360("jaggl", (byte) 66);
            if (var19 >= 0 && var19 < 100) {
                return var19;
            }
        }
        if (class38.field400 == class119.field1526) {
            int var20 = class222.method1360("jagdx", (byte) 119);
            if (var20 >= 0 && var20 < 100) {
                return var20;
            }
        }
        if (class38.field401 == class119.field1526) {
            int var21 = class222.method1360("jagmisc", (byte) -59);
            if (var21 >= 0 && var21 < 100) {
                return var21;
            }
            if (var21 == 100) {
                class167.field2083.method2065(5754);
            }
        }
        if (class38.field402 == class119.field1526) {
            int var22 = class222.method1360("sw3d", (byte) -87);
            if (var22 >= 0 && var22 < 100) {
                return var22;
            }
        }
        if (class38.field403 == class119.field1526) {
            int var23 = class222.method1360("jaclib", (byte) -111);
            if (var23 >= 0 && var23 < 100) {
                return var23;
            }
            if (var23 == 100) {
                class167.field2083.method2072((byte) -55);
            }
        }
        if (class38.field404 == class119.field1526) {
            int var24 = class222.method1360("hw3d", (byte) -105);
            if (var24 >= 0 && var24 < 100) {
                return var24;
            }
        }
        if (class38.field405 == class119.field1526 && !class16.field134.method1088(-110)) {
            return 0;
        }
        if (class38.field406 == class119.field1526) {
            if (!class3.field29.method1088(-76)) {
                return class3.field29.method1070(113);
            }
            class576.field7965 = new class292(class3.field29, class355.field5163, class39.field510);
        }
        if (class38.field407 == class119.field1526) {
            class119.field1528.method1088(-106);
            byte var25 = 0;
            int var26 = var25 + class119.field1528.method1070(127);
            class560.field7638.method1088(-70);
            int var27 = var26 + class560.field7638.method1070(116);
            class563.field7708.method1088(-62);
            int var28 = var27 + class563.field7708.method1070(107);
            class175.field2199.method1088(-84);
            int var29 = var28 + class175.field2199.method1070(125);
            class560.field7636.method1088(-103);
            int var30 = var29 + class560.field7636.method1070(112);
            class327.field4752.method1088(-95);
            int var31 = var30 + class327.field4752.method1070(126);
            class23.field223.method1088(-70);
            int var32 = var31 + class23.field223.method1070(123);
            class440.field6064.method1088(-87);
            int var33 = var32 + class440.field6064.method1070(124);
            class429.field5959.method1088(-103);
            int var34 = var33 + class429.field5959.method1070(118);
            class61.field846.method1088(-86);
            int var35 = var34 + class61.field846.method1070(106);
            class417.field5814.method1088(-96);
            int var36 = var35 + class417.field5814.method1070(114);
            class462.field6300.method1088(-73);
            int var37 = var36 + class462.field6300.method1070(118);
            if (var37 < 1200) {
                return var37 / 12;
            }
            class191.field2486 = new class197(class33.field322, class350.field5121, class119.field1528);
            class613.field8364 = new class311(class33.field322, class350.field5121, class119.field1528);
            class637.field8698 = new class224(class33.field322, class350.field5121, class119.field1528, class39.field510);
            class39.field469 = new class626(class33.field322, class350.field5121, class563.field7708);
            class276.field3744 = new class411(class33.field322, class350.field5121, class119.field1528);
            class261.field3604 = new class169(class33.field322, class350.field5121, class119.field1528);
            class34.field336 = new class30(class33.field322, class350.field5121, class119.field1528, class284.field3839);
            class255.field3521 = new class615(class33.field322, class350.field5121, class119.field1528);
            class640.field8730 = new class433(class33.field322, class350.field5121, class119.field1528);
            class578.field7980 = new class294(class33.field322, class350.field5121, true, class560.field7638, class284.field3839);
            class665.field9460 = new class37(class33.field322, class350.field5121, class119.field1528, class39.field510);
            class70.field916 = new class150(class33.field322, class350.field5121, class119.field1528, class39.field510);
            class318.field4640 = new class618(class33.field322, class350.field5121, true, class175.field2199, class284.field3839);
            class237.field3088 = new class219(class33.field322, class350.field5121, true, class191.field2486, class560.field7636, class284.field3839);
            class559.field7615 = new class383(class33.field322, class350.field5121, class119.field1528);
            class77.field971 = new class129(class33.field322, class350.field5121, class327.field4752, class401.field5696, class93.field1162);
            class603.field8243 = new class512(class33.field322, class350.field5121, class119.field1528);
            class502.field6772 = new class209(class33.field322, class350.field5121, class119.field1528);
            class236.field3079 = new class157(class33.field322, class350.field5121, class23.field223, class284.field3839);
            class67.field876 = new class570(class33.field322, class350.field5121, class119.field1528);
            class236.field3078 = new class132(class33.field322, class350.field5121, class119.field1528);
            class383.field5570 = new class29(class33.field322, class350.field5121, class119.field1528);
            class150.field1888 = new class528(class33.field322, class350.field5121, class440.field6064);
            class48.field654 = new class461(class33.field322, class350.field5121, class119.field1528);
            class87.method488((byte) 52, class39.field510, class284.field3839, class108.field1300, class613.field8373);
            class433.method2490(class462.field6300, 118);
            class527.field7297 = new class151(class350.field5121, class429.field5959, class61.field846);
            class673.field9539 = new class498(class350.field5121, class429.field5959, class61.field846, new class377());
            class253.method1585(15717);
            class578.field7980.method1745(21272, !class72.field935.method1861(class161.field2038, -122));
            class327.field4771 = new class339();
            class107.method572(124);
            class168.method1121(class417.field5814, 1);
            class427.method2458(29998, class284.field3839, class576.field7965);
        }
        if (arg0) {
            method2401(false);
        }
        if (class38.field408 == class119.field1526) {
            int var38 = class379.method2296(127, class39.field510) + class399.method2361((byte) -6, true);
            int var39 = class563.method3174((byte) 97) + class452.method2573(0);
            if (var39 > var38) {
                return var38 * 100 / var39;
            }
        }
        if (class38.field409 == class119.field1526) {
            if (!class103.field1263.method1066("huffman", -1, "")) {
                return 0;
            }
            class133 var40 = new class133(class103.field1263.method1063("huffman", "", 63));
            class460.method2603(var40, -12392);
        }
        if (class38.field410 == class119.field1526 && !class108.field1300.method1088(-109)) {
            return class108.field1300.method1070(126);
        } else if (class38.field411 == class119.field1526 && !class314.field4517.method1088(-92)) {
            return class314.field4517.method1070(106);
        } else if (class38.field412 == class119.field1526 && !class613.field8373.method1088(-127)) {
            return class613.field8373.method1070(111);
        } else {
            if (class38.field413 == class119.field1526) {
                if (!class307.field4123.method1083(-78, "details")) {
                    return class307.field4123.method1073(0, "details");
                }
                class561.method3148(class307.field4123, class276.field3744, class261.field3604, class578.field7980, class665.field9460, class70.field916, class327.field4771);
            }
            if (class38.field414 == class119.field1526) {
                class24.field229 = new String[class236.field3078.field1677];
                class85.field1042 = new int[class383.field5570.field280];
                class521.field7223 = new boolean[class383.field5570.field280];
                for (int var41 = 0; var41 < class383.field5570.field280; var41++) {
                    if (class383.field5570.method178(var41, 75).field4852 == 0) {
                        class521.field7223[var41] = true;
                        class637.field8699++;
                    }
                    class85.field1042[var41] = -1;
                }
                class179.method1179(-2);
                class627.field8528 = class108.field1300.method1090("loginscreen", (byte) 95);
                class315.field4597 = class108.field1300.method1090("lobbyscreen", (byte) -113);
                class397.field5664.method1072(false, (byte) 126, true);
                class328.field4812.method1072(true, (byte) -6, true);
                class39.field510.method1072(true, (byte) 127, true);
                class613.field8373.method1072(true, (byte) 121, true);
                class103.field1263.method1072(true, (byte) 122, true);
                class108.field1300.method1072(true, (byte) 7, true);
                class119.field1528.field1989 = 2;
                class525.field7265 = true;
                class563.field7708.field1989 = 2;
                class560.field7638.field1989 = 2;
                class175.field2199.field1989 = 2;
                class560.field7636.field1989 = 2;
                class327.field4752.field1989 = 2;
                class23.field223.field1989 = 2;
            }
            if (class38.field416 == class119.field1526) {
                class73.field944 = class72.field935.field6520;
                class72.field935.field6520 = true;
                class72.field935.method1856(0, class495.field6687);
                if (class73.field944) {
                    class564.method3180(0, (byte) 115);
                } else {
                    class564.method3180(class72.field935.field6511, (byte) 65);
                }
                class587.method3284(-1, 3954, -1, class72.field935.field6507, false);
                class234.method1450(false, class9.field103);
                class282.method1696(class9.field103, (byte) 60);
                class305.method1831(class9.field103, class39.field510, (byte) 81);
                class19.method109(2048, class615.field8391);
                class536.method3030(12667, null);
                class266.field3650 = null;
                class241.field3153 = null;
                class659.field9290 = null;
                class125.field1608 = null;
            }
            return class185.method1189(-3);
        }
    }
}
