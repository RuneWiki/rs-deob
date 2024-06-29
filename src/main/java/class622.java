import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class622 {

    @OriginalMember(owner = "client!th", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9118 = new String[] { method4634(method4633("SA\u001eEs")), method4634(method4633("SA\u001eFs")), method4634(method4633("KFRe\"TJBb>I")), method4634(method4633("TJQw>\u0007DQn5")), method4634(method4633("O\\Va6FG")), method4634(method4633("KFWn5TJBb>I")) };

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Ldea;")
    public static class259 field9114 = new class259();

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field9117 = -1;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "Leba;")
    public static class614 field9116 = new class614();

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "J")
    public static long field9115;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 3)
    public static void method4631(byte arg0) {
        try {
            field9114 = null;
            field9116 = null;
            if (arg0 > -87) {
                field9115 = 20L;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9118[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)I", line = 19)
    public static final int method4632(byte arg0) {
        try {
            if (arg0 > -107) {
                field9116 = null;
            }
            field9113++;
            if (class289.field4305.field839.method1475(false) == 0) {
                for (int var1 = 0; var1 < class486.field7011; var1++) {
                    if (class77.field889[var1].method3516(13112) == 's' || class77.field889[var1].method3516(13112) == 'S') {
                        class289.field4305.method655(17, 1, class289.field4305.field839);
                        class129.field1515 = true;
                        break;
                    }
                }
            }
            if (class722.field10460 == class626.field9151) {
                Runtime var2 = Runtime.getRuntime();
                int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
                long var4 = class430.method3299(119);
                if (class710.field10297 == 0L) {
                    class710.field10297 = var4;
                }
                if (var3 > 16384 && var4 - class710.field10297 < 5000L) {
                    if (var4 - class595.field8729 > 1000L) {
                        System.gc();
                        class595.field8729 = var4;
                    }
                    return 0;
                }
            }
            if (class722.field10460 == class626.field9160) {
                if (class351.field5419 == null) {
                    class351.field5419 = new class251(class768.field11093, class751.field10930, class311.field4925, class48.field545);
                }
                if (!class351.field5419.method2122((byte) -1)) {
                    return 0;
                }
                class378.method3044(null, -118, true, 0);
                class610.field8906 = !class486.method3692(9804);
                class112.field1317 = class615.method4551(false, 1000000, class610.field8906 ? 34 : 32, 1);
                class553.field8243 = class615.method4551(false, 1000000, 33, 1);
                class753.field10953 = class615.method4551(false, 1000000, 13, 1);
            }
            if (class722.field10460 == class626.field9162) {
                boolean var6 = class553.field8243.method3624(false);
                int var7 = class362.field5550[33].method3773(0);
                int var8 = var7 + class362.field5550[class610.field8906 ? 34 : 32].method3773(0);
                int var9 = var8 + class362.field5550[13].method3773(0);
                int var10 = var9 + (var6 ? 100 : class553.field8243.method3634(-79));
                if (var10 != 400) {
                    return var10 / 4;
                }
                class759.field11004 = class112.field1317.method3636(-126);
                class739.field10739 = class553.field8243.method3636(108);
                class533.method4028(class112.field1317, -17262);
                int var11 = class289.field4305.field840.method3536(false);
                class415.field6114 = new class146(class447.field6576, class167.field2300, class553.field8243);
                int[] var12 = class415.field6114.method1234(1, var11);
                if (var12.length == 0) {
                    var12 = class415.field6114.method1234(1, 0);
                }
                class477 var13 = new class477(class112.field1317, class753.field10953);
                if (var12.length > 0) {
                    class360.field5498 = new class441[var12.length];
                    for (int var14 = 0; var14 < class360.field5498.length; var14++) {
                        class360.field5498[var14] = new class648(class415.field6114.method1235(var12[var14], -23585), var13);
                    }
                }
            }
            if (class722.field10460 == class626.field9163) {
                class727.method5307(class168.method1490(90), class112.field1317, (byte) 100, class753.field10953);
            }
            if (class722.field10460 == class626.field9164) {
                int var15 = class385.method3078(false);
                int var16 = class194.method1656((byte) 99);
                if (var16 > var15) {
                    return var15 * 100 / var16;
                }
            }
            if (class722.field10460 == class626.field9165) {
                if (class360.field5498 != null && class360.field5498.length > 0) {
                    if (class360.field5498[0].method3386(19607) < 100) {
                        return 0;
                    }
                    if (class360.field5498.length > 1 && class415.field6114.method1236((byte) 100) && class360.field5498[1].method3386(19607) < 100) {
                        return 0;
                    }
                }
                class472.method3585(false, class610.field8913);
                class514.method3888(-1, class610.field8913);
                class86.method728(1, (byte) -96);
            }
            if (class722.field10460 == class626.field9166) {
                for (int var17 = 0; var17 < 4; var17++) {
                    class429.field6298[var17] = class212.method1863(4014, class648.field9378, class659.field9506);
                }
            }
            if (class722.field10460 == class626.field9167) {
                class383.field5798 = class615.method4551(false, 1000000, 8, 1);
                class315.field4987 = class615.method4551(false, 1000000, 0, 1);
                class95.field1072 = class615.method4551(false, 1000000, 1, 1);
                class669.field9714 = class615.method4551(false, 1000000, 2, 1);
                class72.field794 = class615.method4551(false, 1000000, 3, 1);
                class227.field3474 = class615.method4551(false, 1000000, 4, 1);
                class550.field8195 = class615.method4551(true, 1000000, 5, 1);
                class232.field3503 = class615.method4551(true, 1000000, 6, 1);
                class589.field8661 = class615.method4551(false, 1000000, 7, 1);
                class614.field8975 = class615.method4551(false, 1000000, 9, 1);
                class107.field1239 = class615.method4551(false, 1000000, 10, 1);
                class657.field9489 = class615.method4551(false, 1000000, 11, 1);
                class743.field10810 = class615.method4551(false, 1000000, 12, 1);
                class571.field8452 = class615.method4551(false, 1000000, 14, 1);
                class647.field9368 = class615.method4551(false, 1000000, 15, 1);
                class234.field3531 = class615.method4551(false, 1000000, 16, 1);
                class489.field7024 = class615.method4551(false, 1000000, 17, 1);
                class137.field1631 = class615.method4551(false, 1000000, 18, 1);
                class411.field6075 = class615.method4551(false, 1000000, 19, 1);
                class604.field8851 = class615.method4551(false, 1000000, 20, 1);
                class122.field1440 = class615.method4551(false, 1000000, 21, 1);
                class304.field4754 = class615.method4551(false, 1000000, 22, 1);
                class366.field5598 = class615.method4551(true, 1000000, 23, 1);
                class85.field952 = class615.method4551(false, 1000000, 24, 1);
                class729.field10586 = class615.method4551(false, 1000000, 25, 1);
                class710.field10289 = class615.method4551(true, 1000000, 26, 1);
                class630.field9209 = class615.method4551(false, 1000000, 27, 1);
                class443.field6513 = class615.method4551(true, 1000000, 28, 1);
                class523.field7639 = class615.method4551(false, 1000000, 29, 1);
                class342.field5319 = class615.method4551(true, 1000000, 30, 1);
                class426.field6273 = class615.method4551(true, 1000000, 31, 1);
                class433.field6362 = class615.method4551(true, 1000000, 36, 2);
            }
            if (class722.field10460 == class626.field9168) {
                int var18 = 0;
                for (int var19 = 0; var19 < 37; var19++) {
                    if (class362.field5550[var19] != null) {
                        var18 += class362.field5550[var19].method3773(0) * class100.field1107[var19] / 100;
                    }
                }
                if (var18 != 100) {
                    if (class678.field9839 < 0) {
                        class678.field9839 = var18;
                    }
                    return (var18 - class678.field9839) * 100 / (100 - class678.field9839);
                }
                class564.method4211(false, class383.field5798);
                class727.method5307(class168.method1490(92), class383.field5798, (byte) 126, class753.field10953);
            }
            if (class722.field10460 == class626.field9169) {
                if (class666.field9683 == -1) {
                    class666.field9683 = class232.field3503.method3627(field9118[3], 69);
                }
                class382.method3062(true);
                class86.method728(2, (byte) -96);
            }
            if (class722.field10460 == class626.field9170) {
                class397.method3133(class342.field5319, true, class580.field8601);
            }
            if (class722.field10460 == class626.field9171) {
                int var20 = class112.method978(0);
                if (var20 < 100) {
                    return var20;
                }
                class554.method4170(class443.field6513.method3638(-75, 1), (byte) 124);
                class435.method3324(class443.field6513.method3638(-87, 3), (byte) 45);
                class463.field6746 = new class91(class443.field6513);
            }
            if (class722.field10460 == class626.field9172) {
                if (class676.field9793 != -1 && !class589.field8661.method3621(0, -119, class676.field9793)) {
                    return 99;
                }
                class278.field4183 = new class653(class710.field10289, class614.field8975, class383.field5798);
                class566.field8395 = new class444(class447.field6576, class167.field2300, class669.field9714);
                class496.field7116 = new class661(class447.field6576, class167.field2300, class669.field9714, class463.field6746);
                class208.field3189 = new class381(class447.field6576, class167.field2300, class669.field9714, class383.field5798);
                class420.field6209 = new class389(class447.field6576, class167.field2300, class489.field7024);
                class546.field8157 = new class196(class447.field6576, class167.field2300, class669.field9714);
                class224.field3429 = new class743(class447.field6576, class167.field2300, class669.field9714);
                class81.field924 = new class680(class447.field6576, class167.field2300, class669.field9714, class383.field5798);
                class513.field7378 = new class656(class447.field6576, class167.field2300, class669.field9714, class589.field8661);
                class152.field1880 = new class152(class447.field6576, class167.field2300, class669.field9714);
                class640.field9301 = new class45(class447.field6576, class167.field2300, class669.field9714);
                class417.field6144 = new class376(class447.field6576, class167.field2300, true, class234.field3531, class589.field8661);
                class643.field9316 = new class68(class447.field6576, class167.field2300, class669.field9714, class383.field5798);
                class617.field9073 = new class618(class447.field6576, class167.field2300, class669.field9714, class383.field5798);
                class262.field4035 = new class569(class447.field6576, class167.field2300, true, class137.field1631, class589.field8661);
                class540.field7920 = new class682(class447.field6576, class167.field2300, true, class566.field8395, class411.field6075, class589.field8661);
                class329.field5185 = new class302(class447.field6576, class167.field2300, class669.field9714);
                class272.field4122 = new class271(class447.field6576, class167.field2300, class604.field8851, class315.field4987, class95.field1072);
                class596.field8739 = new class107(class447.field6576, class167.field2300, class669.field9714);
                class13.field162 = new class11(class447.field6576, class167.field2300, class669.field9714);
                class771.field11208 = new class297(class447.field6576, class167.field2300, class122.field1440, class589.field8661);
                class496.field7133 = new class445(class447.field6576, class167.field2300, class669.field9714);
                class671.field9743 = new class405(class447.field6576, class167.field2300, class669.field9714);
                class483.field6982 = new class334(class447.field6576, class167.field2300, class669.field9714);
                class369.field5638 = new class571(class447.field6576, class167.field2300, class304.field4754);
                class289.field4303 = new class354(class447.field6576, class167.field2300, class669.field9714);
                class747.field10862 = new class642(class447.field6576, class167.field2300, class669.field9714);
                class430.method3298(15000, class383.field5798, class72.field794, class589.field8661, class753.field10953);
                class737.method5384(class523.field7639, 124);
                class13.field160 = new class9(class167.field2300, class85.field952, class729.field10586);
                class690.field10023 = new class674(class167.field2300, class85.field952, class729.field10586, new class627());
                class77.method684(0);
                class417.field6144.method3034(class289.field4305.field825.method717(false) == 0, -50);
                class276.field4168 = new class702();
                class735.method5364(2);
                class785.method5680(class630.field9209, 21809);
                class152.method1274(class278.field4183, class589.field8661, 74);
                class336 var21 = new class336(class107.field1239.method3640((byte) 57, "", field9118[4]));
                class748.method5444(61, var21);
                try {
                    jagmisc.init();
                } catch (Throwable var30) {
                }
                class523.field7643 = class458.method3495(16);
                class306.field4779 = new class10(true, class580.field8601);
            }
            if (class722.field10460 == class626.field9174) {
                int var22 = class71.method642(1, class383.field5798) + class60.method436(true, 102);
                int var23 = class282.method2312(false) + class194.method1656((byte) 99);
                if (var22 < var23) {
                    return var22 * 100 / var23;
                }
            }
            if (class722.field10460 == class626.field9175) {
                class161.method1370(class366.field5598, class546.field8157, class224.field3429, class417.field6144, class643.field9316, class617.field9073, class276.field4168);
            }
            if (class722.field10460 == class626.field9176) {
                class8.field86 = new String[class671.field9743.field6038];
                class199.field3112 = new boolean[class483.field6982.field5226];
                class86.field960 = new int[class483.field6982.field5226];
                for (int var24 = 0; var24 < class483.field6982.field5226; var24++) {
                    if (class483.field6982.method2800(19, var24).field10471 == 0) {
                        class199.field3112[var24] = true;
                        class178.field2484++;
                    }
                    class86.field960[var24] = -1;
                }
                class578.method4314(-106);
                class461.field6733 = class72.field794.method3627(field9118[5], -96);
                class9.field89 = class72.field794.method3627(field9118[2], -128);
                class550.field8195.method3625(-115, false, true);
                class232.field3503.method3625(-124, true, true);
                class383.field5798.method3625(-123, true, true);
                class753.field10953.method3625(-115, true, true);
                class107.field1239.method3625(-128, true, true);
                class72.field794.method3625(-122, true, true);
                class720.field10429 = true;
                class669.field9714.field6927 = 2;
                class489.field7024.field6927 = 2;
                class234.field3531.field6927 = 2;
                class137.field1631.field6927 = 2;
                class411.field6075.field6927 = 2;
                class604.field8851.field6927 = 2;
                class122.field1440.field6927 = 2;
            }
            if (class722.field10460 == class626.field9177) {
                if (!class334.method2801(class461.field6733, 0)) {
                    return 0;
                }
                boolean var25 = true;
                for (int var26 = 0; var26 < class683.field9897[class461.field6733].length; var26++) {
                    class541 var27 = class683.field9897[class461.field6733][var26];
                    if (var27.field8042 == 5 && var27.field8063 != -1 && !class383.field5798.method3621(0, -121, var27.field8063)) {
                        var25 = false;
                    }
                }
                if (!var25) {
                    return 0;
                }
            }
            if (class722.field10460 == class626.field9178) {
                class298.method2517(16384, true);
            }
            if (class722.field10460 == class626.field9179) {
                class768.field11101.method5220((byte) -116);
                try {
                    class663.field9581.join();
                } catch (InterruptedException var29) {
                    return 0;
                }
                class112.field1317 = null;
                class768.field11101 = null;
                class663.field9581 = null;
                class415.field6114 = null;
                class360.field5498 = null;
                class553.field8243 = null;
                class305.method2587(-4);
                class124.field1455 = class289.field4305.field839.method1475(false) == 1;
                class289.field4305.method655(17, 1, class289.field4305.field839);
                if (class124.field1455) {
                    class289.field4305.method655(17, 0, class289.field4305.field834);
                } else if (class289.field4305.field834.field2538 && class306.field4779.field99 < 512 && class306.field4779.field99 != 0) {
                    class289.field4305.method655(17, 0, class289.field4305.field834);
                }
                class124.method1077(-3);
                if (class124.field1455) {
                    class640.method4693(0, -13558, false);
                } else {
                    class640.method4693(class289.field4305.field834.method1610(false), -13558, false);
                }
                class178.method1563(false, 122, -1, -1, class289.field4305.field829.method5551(false));
                class472.method3585(false, class610.field8913);
                class514.method3888(-1, class610.field8913);
                class88.method745(class383.field5798, 0, class610.field8913);
                class670.method4930(class208.field3193, (byte) -16);
            }
            return class45.method356((byte) -27);
        } catch (RuntimeException var31) {
            throw class759.method5498(var31, field9118[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4633(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!th", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4634(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
