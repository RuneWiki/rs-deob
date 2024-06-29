import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class66 extends class114 {

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    private int field979;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    private int field970;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field974 = 0;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[I")
    public static int[] field977 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Lfe;")
    public static class231 field976 = null;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "[[[I")
    public static int[][][] field983 = new int[2][][];

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "Ljava/lang/String;")
    public static String field973 = "Loaded defaults";

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Lvl;")
    public static class73 field981;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public static void method433(byte arg0) {
        field973 = null;
        if (arg0 == 25) {
            field976 = null;
            field977 = null;
            field981 = null;
            field983 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
    public final void method105(int arg0, int arg1, int arg2) {
        int var4 = this.field969 * arg0 >> 12;
        int var5 = this.field979 * arg0 >> 12;
        if (arg1 != -8132) {
            method435((byte) 18);
        }
        int var6 = this.field970 * arg2 >> 12;
        int var7 = this.field985 * arg2 >> 12;
        class77.method527(var5, arg1 ^ -8068, var4, super.field1662, var6, var7);
        ++field972;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)I")
    public static final int method434(byte arg0, int arg1) {
        ++field978;
        if (arg0 > -119) {
            field983 = null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Llh;")
    public static final class22 method435(byte arg0) {
        ++field980;
        try {
            if (arg0 != 73) {
                field977 = null;
            }
            return (class22) Class.forName("pa").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)V")
    public static final void method436(int arg0, int arg1) {
        ++field984;
        if (~arg1 <= -1) {
            int var2 = class92.field1378[arg1];
            int var3 = class192.field3056[arg1];
            if (~var3 <= -2001) {
                var3 -= 2000;
            }
            int var4 = (int) class150.field2205[arg1];
            int var5 = class180.field2830[arg1];
            long var6 = class150.field2205[arg1];
            if (var3 == 1002 || ~var3 == -1011 || var3 == 1012 || var3 == 1006 || ~var3 == -1009) {
                class192.method1353(var2, var3, var4, (byte) 27);
            }
            if (var3 == 19) {
                boolean var8 = true;
                class231 var9 = class201.method1398(var5, 0);
                if (var9.field3563 > 0) {
                    var8 = class125.method812(var9, false);
                }
                if (var8) {
                    ++class29.field368;
                    class150.field2218.method445(109, 7);
                    class150.field2218.method1210(var5, (byte) -16);
                }
            }
            if (var3 == 58) {
                class257.field4190 = class171.field2686;
                class114.field1672 = class223.field3493;
                class268.field4345 = 2;
                ++class294.field4710;
                class313.field5023 = 0;
                class150.field2218.method445(135, 7);
                class150.field2218.method1203(var4, 714844776);
                class150.field2218.method1202(arg0 + 24922, !class309.field4977[82] ? 0 : 1);
                class150.field2218.method1203(class113.field1653 + var2, 714844776);
                class150.field2218.method1213(var5 - -class5.field77, (byte) 106);
            }
            if (var3 == 4) {
                class86 var10 = class191.field3045[var4];
                if (var10 != null) {
                    class114.field1672 = class223.field3493;
                    class268.field4345 = 2;
                    class313.field5023 = 0;
                    class257.field4190 = class171.field2686;
                    class150.field2218.method445(56, 7);
                    class150.field2218.method1213(var4, (byte) -119);
                    ++class27.field322;
                    class150.field2218.method1214(arg0 ^ -68, !class309.field4977[82] ? 0 : 1);
                }
            }
            if (~var3 == -10) {
                class86 var11 = class191.field3045[var4];
                if (var11 != null) {
                    class114.field1672 = class223.field3493;
                    class313.field5023 = 0;
                    ++class24.field299;
                    class257.field4190 = class171.field2686;
                    class268.field4345 = 2;
                    class150.field2218.method445(185, 7);
                    class150.field2218.method1161(class309.field4977[82] ? 1 : 0, 128);
                    class150.field2218.method1203(var4, 714844776);
                }
            }
            if (~var3 == -44) {
                class257.field4190 = class171.field2686;
                class313.field5023 = 0;
                class114.field1672 = class223.field3493;
                ++class227.field3524;
                class268.field4345 = 2;
                class150.field2218.method445(234, 7);
                class150.field2218.method1161(!class309.field4977[82] ? 0 : 1, 128);
                class150.field2218.method1180(arg0 ^ -17439, class5.field77 + var5);
                class150.field2218.method1210(class175.field2760, (byte) -16);
                class150.field2218.method1207(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
                class150.field2218.method1207(true, class99.field1488);
                class150.field2218.method1203(class113.field1653 + var2, 714844776);
                class150.field2218.method1180(-17437, class271.field4409);
            }
            if (~var3 == -3) {
                ++class42.field512;
                class150.field2218.method445(128, 7);
                class150.field2218.method1213(var2, (byte) -107);
                class150.field2218.method1163(var5, (byte) 40);
                class150.field2218.method1207(true, var4);
                class217.field3396 = 0;
                class297.field4739 = class201.method1398(var5, 0);
                class32.field387 = var2;
            }
            if (~var3 == -4) {
                class86 var12 = class191.field3045[var4];
                if (var12 != null) {
                    ++class84.field1297;
                    class114.field1672 = class223.field3493;
                    class268.field4345 = 2;
                    class257.field4190 = class171.field2686;
                    class313.field5023 = 0;
                    class150.field2218.method445(68, 7);
                    class150.field2218.method1213(var4, (byte) 121);
                    class150.field2218.method1213(class271.field4409, (byte) -93);
                    class150.field2218.method1203(class99.field1488, 714844776);
                    class150.field2218.method1183(class309.field4977[82] ? 1 : 0, arg0 ^ 984049210);
                    class150.field2218.method1163(class175.field2760, (byte) 40);
                }
            }
            if (~var3 == -6) {
                class1 var13 = class35.field409[var4];
                if (var13 != null) {
                    class268.field4345 = 2;
                    class114.field1672 = class223.field3493;
                    class313.field5023 = 0;
                    ++class21.field281;
                    class257.field4190 = class171.field2686;
                    class150.field2218.method445(249, arg0 + 5);
                    class150.field2218.method1202(arg0 + 24922, !class309.field4977[82] ? 0 : 1);
                    class150.field2218.method1207(true, var4);
                }
            }
            if (var3 == 42) {
                class1 var14 = class35.field409[var4];
                if (var14 != null) {
                    ++class275.field4459;
                    class114.field1672 = class223.field3493;
                    class313.field5023 = 0;
                    class257.field4190 = class171.field2686;
                    class268.field4345 = 2;
                    class150.field2218.method445(180, 7);
                    class150.field2218.method1161(!class309.field4977[82] ? 0 : 1, 128);
                    class150.field2218.method1207(true, var4);
                }
            }
            if (var3 == 18) {
                ++class287.field4639;
                class313.field5023 = 0;
                class114.field1672 = class223.field3493;
                class257.field4190 = class171.field2686;
                class268.field4345 = 2;
                class150.field2218.method445(77, 7);
                class150.field2218.method1213(class113.field1653 + var2, (byte) -77);
                class150.field2218.method1214(-110, class309.field4977[82] ? 1 : 0);
                class150.field2218.method1203(var4, 714844776);
                class150.field2218.method1180(arg0 + -17439, class5.field77 + var5);
            }
            if (var3 == 41) {
                ++class211.field3286;
                class150.field2218.method445(213, 7);
                class150.field2218.method1180(-17437, var2);
                class150.field2218.method1163(var5, (byte) 40);
                class150.field2218.method1207(true, var4);
                class217.field3396 = 0;
                class297.field4739 = class201.method1398(var5, 0);
                class32.field387 = var2;
            }
            if (var3 == 14) {
                class114.field1672 = class223.field3493;
                class313.field5023 = 0;
                ++class294.field4711;
                class268.field4345 = 2;
                class257.field4190 = class171.field2686;
                class150.field2218.method445(44, 7);
                class150.field2218.method1203(class5.field77 + var5, 714844776);
                class150.field2218.method1213(var4, (byte) 78);
                class150.field2218.method1203(class113.field1653 + var2, 714844776);
                class150.field2218.method1161(class309.field4977[82] ? 1 : 0, 128);
            }
            if (var3 == 31) {
                class1 var15 = class35.field409[var4];
                if (var15 != null) {
                    class268.field4345 = 2;
                    class114.field1672 = class223.field3493;
                    class313.field5023 = 0;
                    ++class253.field4137;
                    class257.field4190 = class171.field2686;
                    class150.field2218.method445(101, 7);
                    class150.field2218.method1207(true, var4);
                    class150.field2218.method1183(class309.field4977[82] ? 1 : 0, 984049208);
                }
            }
            if (~var3 == -39) {
                class1 var16 = class35.field409[var4];
                if (var16 != null) {
                    class257.field4190 = class171.field2686;
                    class268.field4345 = 2;
                    ++class112.field1623;
                    class313.field5023 = 0;
                    class114.field1672 = class223.field3493;
                    class150.field2218.method445(5, 7);
                    class150.field2218.method1213(var4, (byte) -104);
                    class150.field2218.method1202(arg0 ^ 24926, class309.field4977[82] ? 1 : 0);
                }
            }
            if (var3 == 22) {
                if (~var4 != -1) {
                    if (var4 == 1) {
                        class150.field2218.method445(173, 7);
                        class150.field2218.method1180(arg0 ^ -17439, class113.field1653 + var2);
                        class150.field2218.method1180(arg0 ^ -17439, class304.field4829);
                        ++class41.field499;
                        class150.field2218.method1203(class5.field77 + var5, 714844776);
                        class150.field2218.method1163(class71.field1034, (byte) 40);
                    }
                } else {
                    class266.field4321 = 1;
                    class304.method2039(class148.field2204, var2, var5);
                }
            }
            if (var3 == 59) {
                class150.field2218.method445(143, arg0 + 5);
                ++class33.field395;
                class150.field2218.method1164(var5, 8825);
                class150.field2218.method1213(var4, (byte) 82);
                class150.field2218.method1203(var2, 714844776);
                class217.field3396 = 0;
                class297.field4739 = class201.method1398(var5, 0);
                class32.field387 = var2;
            }
            if (var3 == 44) {
                class1 var17 = class35.field409[var4];
                if (var17 != null) {
                    class268.field4345 = 2;
                    class114.field1672 = class223.field3493;
                    class313.field5023 = 0;
                    class257.field4190 = class171.field2686;
                    class150.field2218.method445(167, 7);
                    ++class205.field3207;
                    class150.field2218.method1175(class175.field2760, false);
                    class150.field2218.method1213(var4, (byte) -112);
                    class150.field2218.method1213(class99.field1488, (byte) -77);
                    class150.field2218.method1202(24924, !class309.field4977[82] ? 0 : 1);
                    class150.field2218.method1207(true, class271.field4409);
                }
            }
            if (~var3 == -27) {
                class150.field2218.method445(10, 7);
                class150.field2218.method1175(var5, false);
                class150.field2218.method1207(true, var4);
                class150.field2218.method1180(-17437, var2);
                ++class71.field1033;
                class217.field3396 = 0;
                class297.field4739 = class201.method1398(var5, arg0 ^ 2);
                class32.field387 = var2;
            }
            if (~var3 == -25) {
                class121.method788(1427);
            }
            if (~var3 == -1005) {
                class313.field5023 = 0;
                class268.field4345 = 2;
                class114.field1672 = class223.field3493;
                class257.field4190 = class171.field2686;
                class150.field2218.method445(122, 7);
                class150.field2218.method1207(true, var4);
                ++class150.field2214;
            }
            if (var3 == 7) {
                class86 var18 = class191.field3045[var4];
                if (var18 != null) {
                    class268.field4345 = 2;
                    class313.field5023 = 0;
                    ++class5.field78;
                    class114.field1672 = class223.field3493;
                    class257.field4190 = class171.field2686;
                    class150.field2218.method445(32, 7);
                    class150.field2218.method1207(true, var4);
                    class150.field2218.method1202(24924, !class309.field4977[82] ? 0 : 1);
                }
            }
            if (var3 == 40) {
                class86 var19 = class191.field3045[var4];
                if (var19 != null) {
                    class257.field4190 = class171.field2686;
                    ++class247.field4015;
                    class313.field5023 = 0;
                    class268.field4345 = 2;
                    class114.field1672 = class223.field3493;
                    class150.field2218.method445(9, 7);
                    class150.field2218.method1207(true, var4);
                    class150.field2218.method1214(arg0 + -76, !class309.field4977[82] ? 0 : 1);
                }
            }
            if (~var3 == -50) {
                class1 var20 = class35.field409[var4];
                if (var20 != null) {
                    class313.field5023 = 0;
                    class257.field4190 = class171.field2686;
                    ++class163.field2538;
                    class114.field1672 = class223.field3493;
                    class268.field4345 = 2;
                    class150.field2218.method445(115, 7);
                    class150.field2218.method1213(var4, (byte) 60);
                    class150.field2218.method1202(24924, !class309.field4977[82] ? 0 : 1);
                }
            }
            if (var3 == 10) {
                ++class210.field3278;
                class150.field2218.method445(241, 7);
                class150.field2218.method1163(class71.field1034, (byte) 40);
                class150.field2218.method1207(true, var2);
                class150.field2218.method1180(arg0 ^ -17439, class304.field4829);
                class150.field2218.method1210(var5, (byte) -16);
            }
            if (var3 == 8) {
                class268.field4345 = 2;
                class257.field4190 = class171.field2686;
                class313.field5023 = 0;
                class114.field1672 = class223.field3493;
                ++class298.field4750;
                class150.field2218.method445(8, 7);
                class150.field2218.method1203(class113.field1653 + var2, arg0 ^ 714844778);
                class150.field2218.method1203(var4, arg0 ^ 714844778);
                class150.field2218.method1161(class309.field4977[82] ? 1 : 0, arg0 + 126);
                class150.field2218.method1203(class5.field77 + var5, 714844776);
            }
            if (~var3 == -31) {
                class86 var21 = class191.field3045[var4];
                if (var21 != null) {
                    ++class263.field4269;
                    class268.field4345 = 2;
                    class313.field5023 = 0;
                    class257.field4190 = class171.field2686;
                    class114.field1672 = class223.field3493;
                    class150.field2218.method445(78, arg0 ^ 5);
                    class150.field2218.method1203(class304.field4829, 714844776);
                    class150.field2218.method1175(class71.field1034, false);
                    class150.field2218.method1183(!class309.field4977[82] ? 0 : 1, 984049208);
                    class150.field2218.method1213(var4, (byte) 99);
                }
            }
            if (var3 == 1003) {
                class313.field5023 = 0;
                class114.field1672 = class223.field3493;
                class268.field4345 = 2;
                class257.field4190 = class171.field2686;
                ++class100.field1499;
                class150.field2218.method445(114, 7);
                class150.field2218.method1213(var4, (byte) -100);
            }
            if (var3 == 15) {
                if (~var4 == -1) {
                    class304.method2039(class148.field2204, var2, var5);
                } else if (~var4 == -2) {
                    if (~class72.field1072 < -1 && class309.field4977[82] && class309.field4977[81]) {
                        class62.method397(class113.field1653 - -var2, class5.field77 - -var5, class148.field2204, false);
                    } else {
                        class195.method1364(var5, 1, arg0 + 17, var2);
                        class150.field2218.method1183(class251.field4104, 984049208);
                        class150.field2218.method1183(class171.field2681, arg0 + 984049206);
                        class150.field2218.method1180(-17437, (int) class144.field2145);
                        class150.field2218.method1183(57, 984049208);
                        class150.field2218.method1183(class146.field2173, 984049208);
                        class150.field2218.method1183(class60.field876, 984049208);
                        class150.field2218.method1183(89, 984049208);
                        class150.field2218.method1180(-17437, class214.field3347.field3915);
                        class150.field2218.method1180(arg0 ^ -17439, class214.field3347.field3920);
                        class150.field2218.method1183(class175.field2761, 984049208);
                        class150.field2218.method1183(63, arg0 ^ 984049210);
                    }
                }
            }
            if (~var3 == -46) {
                class1 var22 = class35.field409[var4];
                if (var22 != null) {
                    ++class250.field4071;
                    class268.field4345 = 2;
                    class114.field1672 = class223.field3493;
                    class257.field4190 = class171.field2686;
                    class313.field5023 = 0;
                    class150.field2218.method445(129, 7);
                    class150.field2218.method1214(-78, !class309.field4977[82] ? 0 : 1);
                    class150.field2218.method1213(var4, (byte) 91);
                }
            }
            if (~var3 == -49) {
                class150.field2218.method445(41, 7);
                ++class94.field1408;
                class150.field2218.method1163(var5, (byte) 40);
                class150.field2218.method1213(var2, (byte) 121);
                class150.field2218.method1203(var4, 714844776);
                class217.field3396 = 0;
                class297.field4739 = class201.method1398(var5, 0);
                class32.field387 = var2;
            }
            if (~var3 == -58) {
                class223.method1582(true);
                class231 var23 = class201.method1398(var5, 0);
                class271.field4409 = var4;
                class99.field1488 = var2;
                class197.field3123 = 1;
                class175.field2760 = var5;
                class247.method1761(var23, (byte) -112);
                class230.field3551 = "<col=ff9040>" + class104.method696((byte) -26, var4).field2425 + "<col=ffffff>";
                if (class230.field3551 == null) {
                    class230.field3551 = "null";
                }
            } else {
                if (~var3 == -21) {
                    class150.field2218.method445(177, 7);
                    ++class95.field1434;
                    class150.field2218.method1203(var4, arg0 ^ 714844778);
                    class150.field2218.method1163(var5, (byte) 40);
                    class150.field2218.method1203(var2, 714844776);
                    class217.field3396 = 0;
                    class297.field4739 = class201.method1398(var5, 0);
                    class32.field387 = var2;
                }
                if (arg0 != 2) {
                    method434((byte) 113, 74);
                }
                if (var3 == 16 && class137.field1969 == null) {
                    class93.method633(var5, (byte) 124, var2);
                    class137.field1969 = class282.method1942(var5, var2, (byte) 115);
                    class247.method1761(class137.field1969, (byte) -107);
                }
                if (var3 == 1) {
                    ++class159.field2383;
                    class150.field2218.method445(187, arg0 ^ 5);
                    class150.field2218.method1180(-17437, var2);
                    class150.field2218.method1175(var5, false);
                    class150.field2218.method1207(true, var4);
                    class150.field2218.method1163(class71.field1034, (byte) 40);
                    class150.field2218.method1207(true, class304.field4829);
                    class217.field3396 = 0;
                    class297.field4739 = class201.method1398(var5, 0);
                    class32.field387 = var2;
                }
                if (~var3 == -12) {
                    class313.field5023 = 0;
                    class114.field1672 = class223.field3493;
                    class257.field4190 = class171.field2686;
                    class268.field4345 = 2;
                    ++class74.field1125;
                    class150.field2218.method445(19, arg0 + 5);
                    class150.field2218.method1213(var5 - -class5.field77, (byte) 63);
                    class150.field2218.method1214(arg0 ^ -117, class309.field4977[82] ? 1 : 0);
                    class150.field2218.method1180(-17437, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class150.field2218.method1213(class304.field4829, (byte) -127);
                    class150.field2218.method1210(class71.field1034, (byte) -16);
                    class150.field2218.method1207(true, class113.field1653 + var2);
                }
                if (var3 == 21) {
                    class268.field4345 = 2;
                    ++class92.field1385;
                    class114.field1672 = class223.field3493;
                    class313.field5023 = 0;
                    class257.field4190 = class171.field2686;
                    class150.field2218.method445(87, arg0 + 5);
                    class150.field2218.method1203(class99.field1488, arg0 ^ 714844778);
                    class150.field2218.method1210(class175.field2760, (byte) -16);
                    class150.field2218.method1213(class113.field1653 + var2, (byte) 69);
                    class150.field2218.method1180(arg0 ^ -17439, class5.field77 + var5);
                    class150.field2218.method1202(24924, class309.field4977[82] ? 1 : 0);
                    class150.field2218.method1180(-17437, class271.field4409);
                    class150.field2218.method1203(var4, arg0 ^ 714844778);
                }
                if (~var3 == -36) {
                    class114.field1672 = class223.field3493;
                    ++class252.field4129;
                    class257.field4190 = class171.field2686;
                    class268.field4345 = 2;
                    class313.field5023 = 0;
                    class150.field2218.method445(120, 7);
                    class150.field2218.method1203(Integer.MAX_VALUE & (int) (var6 >>> 32), 714844776);
                    class150.field2218.method1203(class113.field1653 + var2, 714844776);
                    class150.field2218.method1207(true, class5.field77 + var5);
                    class150.field2218.method1161(!class309.field4977[82] ? 0 : 1, arg0 + 126);
                }
                if (var3 == 60) {
                    class231 var24 = class282.method1942(var5, var2, (byte) 52);
                    if (var24 != null) {
                        class223.method1582(true);
                        class29 var25 = client.method1698(var24);
                        class298.method2004(false, var5, var25.field362, var24.field3736, var24.field3589, var25.method159(75), var2);
                        class197.field3123 = 0;
                        class59.field865 = class174.method1242(116, var24);
                        if (!var24.field3585) {
                            class284.field4604 = "<col=00ff00>" + var24.field3743 + "<col=ffffff>";
                        } else {
                            class284.field4604 = var24.field3712 + "<col=ffffff>";
                        }
                        if (class59.field865 == null) {
                            class59.field865 = "Null";
                        }
                    }
                } else {
                    if (~var3 == -7) {
                        ++class29.field368;
                        class150.field2218.method445(109, arg0 ^ 5);
                        class150.field2218.method1210(var5, (byte) -16);
                        class231 var26 = class201.method1398(var5, 0);
                        if (var26.field3626 != null && var26.field3626[0][0] == 5) {
                            int var27 = var26.field3626[0][1];
                            class299.field4770[var27] = -class299.field4770[var27] + 1;
                            class61.method391(arg0 ^ -5, var27);
                        }
                    }
                    if (~var3 == -34) {
                        ++class254.field4150;
                        class150.field2218.method445(248, 7);
                        class150.field2218.method1180(-17437, var4);
                        class150.field2218.method1164(var5, 8825);
                        class150.field2218.method1213(var2, (byte) -123);
                        class217.field3396 = 0;
                        class297.field4739 = class201.method1398(var5, 0);
                        class32.field387 = var2;
                    }
                    if (var3 == 29) {
                        class1 var28 = class35.field409[var4];
                        if (var28 != null) {
                            class257.field4190 = class171.field2686;
                            class313.field5023 = 0;
                            ++class138.field1982;
                            class268.field4345 = 2;
                            class114.field1672 = class223.field3493;
                            class150.field2218.method445(97, 7);
                            class150.field2218.method1203(var4, 714844776);
                            class150.field2218.method1214(arg0 ^ -90, class309.field4977[82] ? 1 : 0);
                        }
                    }
                    if (var3 == 50) {
                        class150.field2218.method445(109, 7);
                        ++class29.field368;
                        class150.field2218.method1210(var5, (byte) -16);
                        class231 var29 = class201.method1398(var5, arg0 ^ 2);
                        if (var29.field3626 != null && var29.field3626[0][0] == 5) {
                            int var30 = var29.field3626[0][1];
                            if (class299.field4770[var30] != var29.field3654[0]) {
                                class299.field4770[var30] = var29.field3654[0];
                                class61.method391(-7, var30);
                            }
                        }
                    }
                    if (~var3 == -26) {
                        ++class286.field4620;
                        class150.field2218.method445(92, 7);
                        class150.field2218.method1213(var4, (byte) -103);
                        class150.field2218.method1175(var5, false);
                        class150.field2218.method1203(var2, 714844776);
                        class217.field3396 = 0;
                        class297.field4739 = class201.method1398(var5, 0);
                        class32.field387 = var2;
                    }
                    if (~var3 == -38) {
                        class150.field2218.method445(133, 7);
                        class150.field2218.method1203(var4, 714844776);
                        class150.field2218.method1210(var5, (byte) -16);
                        class150.field2218.method1213(var2, (byte) -119);
                        ++class196.field3096;
                        class217.field3396 = 0;
                        class297.field4739 = class201.method1398(var5, 0);
                        class32.field387 = var2;
                    }
                    if (~var3 == -29) {
                        if (~var4 != -1) {
                            if (~class72.field1072 < -1 && class309.field4977[82] && class309.field4977[81]) {
                                class62.method397(class113.field1653 + var2, class5.field77 + var5, class148.field2204, false);
                            } else {
                                class150.field2218.method445(81, arg0 + 5);
                                ++class306.field4877;
                                class150.field2218.method1203(class113.field1653 - -var2, 714844776);
                                class150.field2218.method1180(-17437, class5.field77 + var5);
                            }
                        } else {
                            class184.field2895 = 1;
                            class304.method2039(class148.field2204, var2, var5);
                        }
                    }
                    if (var3 == 23) {
                        class268.field4345 = 2;
                        class313.field5023 = 0;
                        ++class256.field4181;
                        class257.field4190 = class171.field2686;
                        class114.field1672 = class223.field3493;
                        class150.field2218.method445(220, 7);
                        class150.field2218.method1207(true, class5.field77 + var5);
                        class150.field2218.method1203(Integer.MAX_VALUE & (int) (var6 >>> 32), 714844776);
                        class150.field2218.method1203(var2 - -class113.field1653, 714844776);
                        class150.field2218.method1183(class309.field4977[82] ? 1 : 0, arg0 + 984049206);
                    }
                    if (~var3 == -1008) {
                        class313.field5023 = 0;
                        class114.field1672 = class223.field3493;
                        class257.field4190 = class171.field2686;
                        class268.field4345 = 2;
                        class150.field2218.method445(74, 7);
                        class150.field2218.method1180(-17437, class5.field77 + var5);
                        ++class107.field1558;
                        class150.field2218.method1207(true, class113.field1653 + var2);
                        class150.field2218.method1161(!class309.field4977[82] ? 0 : 1, 128);
                        class150.field2218.method1207(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    }
                    if (var3 == 13) {
                        ++class211.field3291;
                        class257.field4190 = class171.field2686;
                        class114.field1672 = class223.field3493;
                        class268.field4345 = 2;
                        class313.field5023 = 0;
                        class150.field2218.method445(66, 7);
                        class150.field2218.method1180(-17437, class5.field77 + var5);
                        class150.field2218.method1161(!class309.field4977[82] ? 0 : 1, arg0 + 126);
                        class150.field2218.method1180(-17437, class113.field1653 + var2);
                        class150.field2218.method1203(Integer.MAX_VALUE & (int) (var6 >>> 32), 714844776);
                    }
                    if (~var3 == -40) {
                        class268.field4345 = 2;
                        class257.field4190 = class171.field2686;
                        class313.field5023 = 0;
                        ++class198.field3131;
                        class114.field1672 = class223.field3493;
                        class150.field2218.method445(49, 7);
                        class150.field2218.method1210(class71.field1034, (byte) -16);
                        class150.field2218.method1203(var2 - -class113.field1653, 714844776);
                        class150.field2218.method1207(true, var4);
                        class150.field2218.method1214(-123, class309.field4977[82] ? 1 : 0);
                        class150.field2218.method1213(class304.field4829, (byte) 94);
                        class150.field2218.method1207(true, class5.field77 + var5);
                    }
                    if (var3 == 34) {
                        class268.field4345 = 2;
                        class257.field4190 = class171.field2686;
                        class114.field1672 = class223.field3493;
                        class313.field5023 = 0;
                        class150.field2218.method445(30, 7);
                        ++class182.field2868;
                        class150.field2218.method1180(-17437, class113.field1653 + var2);
                        class150.field2218.method1207(true, class5.field77 + var5);
                        class150.field2218.method1183(!class309.field4977[82] ? 0 : 1, 984049208);
                        class150.field2218.method1180(arg0 + -17439, var4);
                    }
                    if (~var3 == -33) {
                        class150.field2218.method445(2, arg0 ^ 5);
                        class150.field2218.method1180(-17437, var2);
                        class150.field2218.method1180(arg0 + -17439, var4);
                        class150.field2218.method1164(var5, 8825);
                        ++class232.field3753;
                        class217.field3396 = 0;
                        class297.field4739 = class201.method1398(var5, 0);
                        class32.field387 = var2;
                    }
                    if (var3 == 36) {
                        ++class140.field2011;
                        class150.field2218.method445(51, arg0 + 5);
                        class150.field2218.method1175(class175.field2760, false);
                        class150.field2218.method1207(true, class99.field1488);
                        class150.field2218.method1180(-17437, var4);
                        class150.field2218.method1213(var2, (byte) -87);
                        class150.field2218.method1164(var5, 8825);
                        class150.field2218.method1203(class271.field4409, arg0 + 714844774);
                        class217.field3396 = 0;
                        class297.field4739 = class201.method1398(var5, 0);
                        class32.field387 = var2;
                    }
                    if (var3 == 46) {
                        class1 var31 = class35.field409[var4];
                        if (var31 != null) {
                            class257.field4190 = class171.field2686;
                            class313.field5023 = 0;
                            class114.field1672 = class223.field3493;
                            ++class217.field3393;
                            class268.field4345 = 2;
                            class150.field2218.method445(198, 7);
                            class150.field2218.method1161(class309.field4977[82] ? 1 : 0, 128);
                            class150.field2218.method1207(true, var4);
                        }
                    }
                    if (~var3 == -18) {
                        class257.field4190 = class171.field2686;
                        ++class191.field3020;
                        class268.field4345 = 2;
                        class313.field5023 = 0;
                        class114.field1672 = class223.field3493;
                        class150.field2218.method445(107, 7);
                        class150.field2218.method1202(24924, class309.field4977[82] ? 1 : 0);
                        class150.field2218.method1207(true, var2 - -class113.field1653);
                        class150.field2218.method1207(true, class5.field77 + var5);
                        class150.field2218.method1180(-17437, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    }
                    if (var3 == 1011) {
                        class231 var32 = class201.method1398(var5, 0);
                        if (var32 != null && var32.field3582[var2] >= 100000) {
                            class236.method1655(0, "", 95, var32.field3582[var2] + " x " + class104.method696((byte) -26, var4).field2425);
                        } else {
                            ++class100.field1499;
                            class150.field2218.method445(114, 7);
                            class150.field2218.method1213(var4, (byte) -91);
                        }
                        class217.field3396 = 0;
                        class297.field4739 = class201.method1398(var5, 0);
                        class32.field387 = var2;
                    }
                    if (~var3 == -48) {
                        class1 var33 = class35.field409[var4];
                        if (var33 != null) {
                            class257.field4190 = class171.field2686;
                            class313.field5023 = 0;
                            ++class86.field1318;
                            class114.field1672 = class223.field3493;
                            class268.field4345 = 2;
                            class150.field2218.method445(7, 7);
                            class150.field2218.method1203(class304.field4829, arg0 ^ 714844778);
                            class150.field2218.method1164(class71.field1034, 8825);
                            class150.field2218.method1180(-17437, var4);
                            class150.field2218.method1161(class309.field4977[82] ? 1 : 0, 128);
                        }
                    }
                    if (~var3 == -13) {
                        class86 var34 = class191.field3045[var4];
                        if (var34 != null) {
                            class313.field5023 = 0;
                            ++class172.field2696;
                            class268.field4345 = 2;
                            class257.field4190 = class171.field2686;
                            class114.field1672 = class223.field3493;
                            class150.field2218.method445(192, 7);
                            class150.field2218.method1183(class309.field4977[82] ? 1 : 0, 984049208);
                            class150.field2218.method1213(var4, (byte) -97);
                        }
                    }
                    if (var3 == 1005) {
                        class313.field5023 = 0;
                        class268.field4345 = 2;
                        class257.field4190 = class171.field2686;
                        class114.field1672 = class223.field3493;
                        class86 var35 = class191.field3045[var4];
                        if (var35 != null) {
                            class134 var36 = var35.field1321;
                            if (var36.field1894 != null) {
                                var36 = var36.method855((byte) -114);
                            }
                            if (var36 != null) {
                                class150.field2218.method445(186, 7);
                                class150.field2218.method1207(true, var36.field1944);
                                ++class215.field3364;
                            }
                        }
                    }
                    if (var3 == 51 || var3 == 1009) {
                        class171.method1225(20214, class43.field521[arg1], var5, var2, var4);
                    }
                    if (class197.field3123 != 0) {
                        class197.field3123 = 0;
                        class247.method1761(class201.method1398(class175.field2760, arg0 ^ 2), (byte) -107);
                    }
                    if (class63.field911) {
                        class223.method1582(true);
                    }
                    if (class297.field4739 != null && ~class217.field3396 == -1) {
                        class247.method1761(class297.field4739, (byte) -120);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(III)V")
    public final void method103(int arg0, int arg1, int arg2) {
        int var4 = this.field969 * arg0 >> 12;
        int var5 = this.field970 * arg1 >> 12;
        ++field971;
        int var6 = this.field979 * arg0 >> 12;
        if (arg2 != -29715) {
            field974 = -106;
        }
        int var7 = this.field985 * arg1 >> 12;
        class130.method833(var6, super.field1663, var5, arg2 + 29601, var4, super.field1661, var7);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(IIIIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field979 = arg0;
        this.field969 = arg2;
        this.field985 = arg3;
        this.field970 = arg1;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)I")
    public static final int method437(byte arg0) {
        if (arg0 < 126) {
            method437((byte) -53);
        }
        ++field982;
        if (class163.field2515) {
            return 0;
        } else if (!class60.method384(-4)) {
            return 1;
        } else {
            return class44.field528 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        ++field975;
        if (arg0 != 32768) {
            field977 = null;
        }
        int var4 = this.field979 * arg2 >> 12;
        int var5 = this.field969 * arg2 >> 12;
        int var6 = this.field985 * arg1 >> 12;
        int var7 = this.field970 * arg1 >> 12;
        class310.method2092(var7, super.field1662, var5, var4, super.field1661, var6, -2, super.field1663);
    }
}
