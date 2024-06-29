import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class44 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[J")
    public static long[] field1040 = new long[100];

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Lmc;")
    public static class75 field1042 = class30.method234(true, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "Lmc;")
    private static class75 field1045 = class30.method234(true, "flash3:");

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field1047 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Lmc;")
    public static class75 field1043 = class30.method234(true, "backleft1");

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "Lmc;")
    public static class75 field1064 = field1045;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Lkc;")
    public static class63 field1055 = new class63(200);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "J")
    private long field1061;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "J")
    private long field1065;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lj;")
    public static class54 field1046;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Z")
    public static boolean field1037;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Z")
    public boolean field1053;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "[I")
    private int[] field1058;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "[I")
    private int[] field1067;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method330(int arg0, byte arg1) {
        field1038++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class1.field28[arg0];
        int var3 = class126.field3073[arg0];
        int var4 = class86.field2125[arg0];
        int var5 = class38.field914[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (class128.field3124 != 0 && var2 != 1006) {
            class128.field3124 = 0;
            class35.field841 = true;
        }
        if (var2 == 51) {
            class118.field2923.method707(arg1 ^ 0xFFFFFF9C, 135);
            class41.field984++;
            class118.field2923.method536(true, var5);
            class118.field2923.method530(var3, 121);
            class118.field2923.method489(var4, 0);
            class76.field1931 = var3;
            field1063 = 2;
            class34.field793 = var4;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
            class84.field2074 = 0;
        }
        if (var2 == 1002) {
            class68.field1736 = 0;
            class107.field2676 = class12.field245;
            class125.field3063 = class71.field1813;
            class118.field2918++;
            class24.field467 = 2;
            class118.field2923.method707(88, 122);
            class118.field2923.method530(var5 >> 14 & 0x7FFF, arg1 + 95);
        }
        if (var2 == 15) {
            class126.field3084++;
            class118.field2923.method707(-116, 41);
            class118.field2923.method526(var4, (byte) 7);
            class99 var6 = class40.method305(65535, var4);
            if (var6.field2537 != null && var6.field2537[0][0] == 5) {
                int var7 = var6.field2537[0][1];
                class62.field1613[var7] = 1 - class62.field1613[var7];
                class129.method1011(var7, 0);
                class108.field2743 = true;
            }
        }
        if (var2 == 19) {
            class122 var8 = class40.field957[var5];
            if (var8 != null) {
                class101.field2604++;
                class111.method906((byte) 79, 0, 0, var8.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var8.field1236[0]);
                class107.field2676 = class12.field245;
                class24.field467 = 2;
                class125.field3063 = class71.field1813;
                class68.field1736 = 0;
                class118.field2923.method707(arg1 - 21, 208);
                class118.field2923.method506(-128, var5);
                class118.field2923.method526(class76.field1925, (byte) 7);
            }
        }
        if (var2 == 17) {
            class10.field154++;
            boolean var9 = class111.method906((byte) 24, 0, 0, var3, 0, 0, false, 2, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var4);
            if (!var9) {
                class111.method906((byte) 96, 0, 0, var3, 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var4);
            }
            class125.field3063 = class71.field1813;
            class107.field2676 = class12.field245;
            class24.field467 = 2;
            class68.field1736 = 0;
            class118.field2923.method707(-116, 234);
            class118.field2923.method530(class62.field1618 + var3, arg1 ^ 0x77);
            class118.field2923.method536(true, var4 + class55.field1367);
            class118.field2923.method489(class76.field1925, 0);
            class118.field2923.method530(var5, 119);
        }
        if (var2 == 38) {
            class118.field2923.method707(-113, 59);
            class118.field2923.method530(var3, arg1 ^ 0x69);
            class118.field2923.method536(true, var5);
            class118.field2923.method526(var4, (byte) 7);
            field1063 = 2;
            class34.field793 = var4;
            class84.field2074 = 0;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
            class76.field1931 = var3;
            class7.field103++;
        }
        if (arg1 != 25) {
            method339(46);
        }
        if (var2 == 54) {
            class47.method357(arg1 ^ 0xFFFFFFB8);
        }
        if (var2 == 11) {
            class88.field2167++;
            class118.field2923.method707(-115, 43);
            class118.field2923.method500((byte) 68, var4);
            class118.field2923.method505(var3, 984693608);
            class118.field2923.method530(var5, 110);
            class34.field793 = var4;
            class76.field1931 = var3;
            class84.field2074 = 0;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 39) {
            class118.field2923.method707(-111, 108);
            class58.field1458++;
            class118.field2923.method506(-128, var3);
            class118.field2923.method500((byte) -80, var4);
            class118.field2923.method536(true, var5);
            field1063 = 2;
            class34.field793 = var4;
            class76.field1931 = var3;
            class84.field2074 = 0;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 35) {
            class122 var11 = class40.field957[var5];
            if (var11 != null) {
                class111.method906((byte) 12, 0, 0, var11.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var11.field1236[0]);
                class24.field467 = 2;
                class50.field1251++;
                class107.field2676 = class12.field245;
                class125.field3063 = class71.field1813;
                class68.field1736 = 0;
                class118.field2923.method707(-121, 117);
                class118.field2923.method506(-128, class38.field916);
                class118.field2923.method489(class119.field2940, 0);
                class118.field2923.method506(-128, var5);
                class118.field2923.method530(class98.field2478, arg1 ^ 0x6E);
            }
        }
        if (var2 == 13) {
            class98.method821(var4, var3, (byte) 52, var5);
            class118.field2923.method707(arg1 + 40, 29);
            class96.field2412++;
            class118.field2923.method506(arg1 ^ 0xFFFFFF99, var5 >> 14 & 0x7FFF);
            class118.field2923.method530(class55.field1367 + var4, 117);
            class118.field2923.method505(var3 + class62.field1618, arg1 + 984693583);
        }
        if (var2 == 29) {
            class97 var12 = class12.field231[var5];
            if (var12 != null) {
                class111.method906((byte) 86, 0, 0, var12.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var12.field1236[0]);
                class125.field3063 = class71.field1813;
                class24.field467 = 2;
                class107.field2676 = class12.field245;
                class68.field1736 = 0;
                class125.field3052++;
                class118.field2923.method707(5, 229);
                class118.field2923.method536(true, var5);
            }
        }
        if (var2 == 28) {
            class118.field2923.method707(88, 147);
            class118.field2923.method500((byte) 38, class119.field2940);
            class118.field2923.method530(var3, 127);
            class7.field110++;
            class118.field2923.method491(5, var4);
            class118.field2923.method505(class38.field916, 984693608);
            class118.field2923.method530(class98.field2478, arg1 ^ 0x6F);
            class118.field2923.method530(var5, 126);
            class76.field1931 = var3;
            class84.field2074 = 0;
            class34.field793 = var4;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 3 || var2 == 12 || var2 == 33 || var2 == 25) {
            class75 var13 = class43.field1036[arg0];
            int var14 = var13.method644(class26.field526, 0);
            if (var14 != -1) {
                long var15 = var13.method645(var14 + 5, (byte) 110).method637(90).method643(true);
                if (var2 == 3) {
                    class5.method24(var15, 0);
                }
                if (var2 == 12) {
                    class27.method178(var15, -10530);
                }
                if (var2 == 33) {
                    class21.method149(arg1 ^ 0xFFFFDBE1, var15);
                }
                if (var2 == 25) {
                    class34.method266(var15, (byte) 103);
                }
            }
        }
        if (var2 == 27) {
            class55.field1398++;
            boolean var17 = class111.method906((byte) 97, 0, 0, var3, 0, 0, false, 2, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var4);
            if (!var17) {
                class111.method906((byte) 20, 0, 0, var3, 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var4);
            }
            class125.field3063 = class71.field1813;
            class24.field467 = 2;
            class107.field2676 = class12.field245;
            class68.field1736 = 0;
            class118.field2923.method707(-117, 116);
            class118.field2923.method505(class62.field1618 + var3, 984693608);
            class118.field2923.method506(-128, class55.field1367 + var4);
            class118.field2923.method505(var5, arg1 ^ 0x3AB13B71);
        }
        if (var2 == 44) {
            class98.method821(var4, var3, (byte) 52, var5);
            class118.field2923.method707(arg1 ^ 0xFFFFFF95, 72);
            class109.field2757++;
            class118.field2923.method530(var5 >> 14 & 0x7FFF, arg1 ^ 0x60);
            class118.field2923.method536(true, class62.field1618 + var3);
            class118.field2923.method506(arg1 - 153, class55.field1367 + var4);
        }
        if (var2 == 32) {
            class122 var19 = class40.field957[var5];
            if (var19 != null) {
                class111.method906((byte) 36, 0, 0, var19.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var19.field1236[0]);
                class68.field1736 = 0;
                class24.field467 = 2;
                class125.field3063 = class71.field1813;
                class76.field1937++;
                class107.field2676 = class12.field245;
                class118.field2923.method707(arg1 ^ 0xFFFFFF96, 8);
                class118.field2923.method505(var5, 984693608);
            }
        }
        if (var2 == 20) {
            class97 var20 = class12.field231[var5];
            if (var20 != null) {
                class43.field1030++;
                class111.method906((byte) 68, 0, 0, var20.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var20.field1236[0]);
                class125.field3063 = class71.field1813;
                class107.field2676 = class12.field245;
                class24.field467 = 2;
                class68.field1736 = 0;
                class118.field2923.method707(arg1 ^ 0x73, 64);
                class118.field2923.method506(-128, var5);
                class118.field2923.method500((byte) -88, class76.field1925);
            }
        }
        if (var2 == 26) {
            class122 var21 = class40.field957[var5];
            if (var21 != null) {
                class111.method906((byte) 51, 0, 0, var21.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var21.field1236[0]);
                class31.field686++;
                class107.field2676 = class12.field245;
                class125.field3063 = class71.field1813;
                class68.field1736 = 0;
                class24.field467 = 2;
                class118.field2923.method707(-107, 138);
                class118.field2923.method536(true, var5);
            }
        }
        if (var2 == 9) {
            class91.field2226++;
            class118.field2923.method707(-128, 216);
            class118.field2923.method491(arg1 ^ 0xFFFFFF9E, var4);
            class118.field2923.method506(arg1 ^ 0xFFFFFF99, var3);
            class118.field2923.method505(var5, 984693608);
            class84.field2074 = 0;
            field1063 = 2;
            class34.field793 = var4;
            class76.field1931 = var3;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 1) {
            boolean var22 = class111.method906((byte) 38, 0, 0, var3, 0, 0, false, 2, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var4);
            class5.field65++;
            if (!var22) {
                class111.method906((byte) 88, 0, 0, var3, 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var4);
            }
            class125.field3063 = class71.field1813;
            class107.field2676 = class12.field245;
            class68.field1736 = 0;
            class24.field467 = 2;
            class118.field2923.method707(31, 254);
            class118.field2923.method505(var5, 984693608);
            class118.field2923.method530(class55.field1367 + var4, arg1 ^ 0x6C);
            class118.field2923.method506(arg1 ^ 0xFFFFFF99, var3 + class62.field1618);
        }
        if (var2 == 36 && class98.method821(var4, var3, (byte) 52, var5)) {
            class118.field2923.method707(-125, 101);
            class7.field98++;
            class118.field2923.method505(var5 >> 14 & 0x7FFF, 984693608);
            class118.field2923.method530(var4 + class55.field1367, 122);
            class118.field2923.method491(arg1 - 96, class76.field1925);
            class118.field2923.method505(class62.field1618 + var3, 984693608);
        }
        if (var2 == 2) {
            if (class15.field283) {
                class107.field2679.method192(var3 - 4, var4 + -4);
            } else {
                class107.field2679.method192(class12.field245 - 4, class71.field1813 - 4);
            }
        }
        if (var2 == 48) {
            class114.field2889++;
            boolean var24 = class111.method906((byte) 58, 0, 0, var3, 0, 0, false, 2, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var4);
            if (!var24) {
                class111.method906((byte) 20, 0, 0, var3, 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var4);
            }
            class107.field2676 = class12.field245;
            class24.field467 = 2;
            class68.field1736 = 0;
            class125.field3063 = class71.field1813;
            class118.field2923.method707(-124, 250);
            class118.field2923.method506(-128, var3 + class62.field1618);
            class118.field2923.method536(true, class55.field1367 + var4);
            class118.field2923.method505(var5, 984693608);
        }
        if (var2 == 23) {
            class75 var26 = class43.field1036[arg0];
            int var27 = var26.method644(class26.field526, 0);
            if (var27 != -1) {
                int var28 = -1;
                long var29 = var26.method645(var27 + 5, (byte) 110).method637(90).method643(true);
                for (int var31 = 0; var31 < class12.field226; var31++) {
                    if (class104.field2649[var31] == var29) {
                        var28 = var31;
                        break;
                    }
                }
                if (var28 != -1 && class131.field3186[var28] > 0) {
                    class16.field314 = class16.field309;
                    class35.field841 = true;
                    class99.field2485 = true;
                    class128.field3124 = 0;
                    class5.field66 = 3;
                    class114.field2876 = class104.field2649[var28];
                    class16.field297 = class69.method586(new class75[] { class64.field1683, class12.field242[var28] }, (byte) 102);
                }
            }
        }
        if (var2 == 14 || var2 == 34) {
            class75 var32 = class43.field1036[arg0];
            int var33 = var32.method644(class26.field526, arg1 ^ 0x19);
            if (var33 != -1) {
                class75 var34 = var32.method645(var33 + 5, (byte) 110).method637(arg1 + 65);
                class75 var35 = var34.method632(-30765).method652(1);
                boolean var36 = false;
                for (int var37 = 0; var37 < class34.field783; var37++) {
                    class122 var38 = class40.field957[class84.field2081[var37]];
                    if (var38 != null && var38.field3003 != null && var38.field3003.method634(var35, arg1 ^ 0x18)) {
                        class111.method906((byte) 59, 0, 0, var38.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var38.field1236[0]);
                        if (var2 == 14) {
                            class52.field1302++;
                            class118.field2923.method707(39, 235);
                            class118.field2923.method536(true, class84.field2081[var37]);
                        }
                        var36 = true;
                        if (var2 == 34) {
                            class118.field2923.method707(-13, 138);
                            class118.field2923.method536(true, class84.field2081[var37]);
                            class31.field686++;
                        }
                        break;
                    }
                }
                if (!var36) {
                    class31.method242(class16.field309, 0, arg1 - 26, class69.method586(new class75[] { class5.field64, var35 }, (byte) 111));
                }
            }
        }
        if (var2 == 46) {
            class98.field2478 = var3;
            class119.field2940 = var4;
            class42.field1013 = 1;
            class38.field916 = var5;
            class64.field1688 = class69.method586(new class75[] { class35.field853, class43.method326(var5, 0).field204, class26.field526 }, (byte) 126);
            if (class64.field1688 == null) {
                class64.field1688 = class64.field1682;
            }
            class17.field332 = 0;
            class108.field2743 = true;
            return;
        }
        if (var2 == 31) {
            class75 var39 = class43.field1036[arg0];
            int var40 = var39.method644(class26.field526, 0);
            if (var40 != -1) {
                if (class130.field3155 == -1) {
                    class47.method357(68);
                    if (class32.field736 != -1) {
                        class16.field293 = var39.method645(var40 + 5, (byte) 110).method637(arg1 ^ 0x43);
                        class58.field1455 = false;
                        client.field364 = class130.field3155 = class32.field736;
                    }
                } else {
                    class31.method242(class16.field309, 0, -1, class56.field1422);
                }
            }
        }
        if (var2 == 5 && class98.method821(var4, var3, (byte) 52, var5)) {
            class118.field2923.method707(36, 118);
            class118.field2923.method506(arg1 - 153, class98.field2478);
            class70.field1787++;
            class118.field2923.method536(true, class38.field916);
            class118.field2923.method530(class55.field1367 + var4, 113);
            class118.field2923.method489(class119.field2940, 0);
            class118.field2923.method536(true, var5 >> 14 & 0x7FFF);
            class118.field2923.method536(true, var3 + class62.field1618);
        }
        if (var2 == 1005) {
            class107.field2676 = class12.field245;
            class125.field3063 = class71.field1813;
            class24.field467 = 2;
            class68.field1736 = 0;
            class97 var41 = class12.field231[var5];
            if (var41 != null) {
                class34 var42 = var41.field2447;
                if (var42.field814 != null) {
                    var42 = var42.method272((byte) -90);
                }
                if (var42 != null) {
                    class118.field2923.method707(92, 132);
                    class112.field2832++;
                    class118.field2923.method506(-128, var42.field784);
                }
            }
        }
        if (var2 == 7) {
            class98.method821(var4, var3, (byte) 52, var5);
            class84.field2070++;
            class118.field2923.method707(-110, 225);
            class118.field2923.method506(arg1 ^ 0xFFFFFF99, var5 >> 14 & 0x7FFF);
            class118.field2923.method506(-128, class55.field1367 + var4);
            class118.field2923.method505(class62.field1618 + var3, 984693608);
        }
        if (var2 == 56) {
            class118.field2923.method707(93, 91);
            class118.field2923.method530(var3, arg1 + 87);
            class1.field14++;
            class118.field2923.method536(true, var5);
            class118.field2923.method526(var4, (byte) 7);
            class34.field793 = var4;
            class84.field2074 = 0;
            class76.field1931 = var3;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 21) {
            class122 var43 = class40.field957[var5];
            if (var43 != null) {
                class82.field2032++;
                class111.method906((byte) 100, 0, 0, var43.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var43.field1236[0]);
                class68.field1736 = 0;
                class107.field2676 = class12.field245;
                class125.field3063 = class71.field1813;
                class24.field467 = 2;
                class118.field2923.method707(86, 141);
                class118.field2923.method536(true, var5);
            }
        }
        if (var2 == 41) {
            class98.method821(var4, var3, (byte) 52, var5);
            class118.field2923.method707(3, 170);
            class78.field1977++;
            class118.field2923.method530(class55.field1367 + var4, arg1 ^ 0x76);
            class118.field2923.method530(var5 >> 14 & 0x7FFF, 125);
            class118.field2923.method536(true, class62.field1618 + var3);
        }
        if (var2 == 30) {
            class57.field1442++;
            boolean var44 = class111.method906((byte) 94, 0, 0, var3, 0, 0, false, 2, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var4);
            if (!var44) {
                class111.method906((byte) 109, 0, 0, var3, 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var4);
            }
            class24.field467 = 2;
            class125.field3063 = class71.field1813;
            class68.field1736 = 0;
            class107.field2676 = class12.field245;
            class118.field2923.method707(arg1 - 139, 50);
            class118.field2923.method505(var5, 984693608);
            class118.field2923.method530(class55.field1367 + var4, 121);
            class118.field2923.method530(class62.field1618 + var3, 117);
        }
        if (var2 == 42) {
            class99 var46 = class40.method305(65535, var4);
            boolean var47 = true;
            if (var46.field2503 > 0) {
                var47 = class35.method276(arg1 + 275, var46);
            }
            if (var47) {
                class118.field2923.method707(arg1 ^ 0x7C, 41);
                class118.field2923.method526(var4, (byte) 7);
                class126.field3084++;
            }
        }
        if (var2 == 10) {
            class43.field1029++;
            boolean var48 = class111.method906((byte) 70, 0, 0, var3, 0, 0, false, 2, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var4);
            if (!var48) {
                class111.method906((byte) 15, 0, 0, var3, 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var4);
            }
            class24.field467 = 2;
            class125.field3063 = class71.field1813;
            class107.field2676 = class12.field245;
            class68.field1736 = 0;
            class118.field2923.method707(arg1 - 13, 144);
            class118.field2923.method536(true, class62.field1618 + var3);
            class118.field2923.method505(var5, 984693608);
            class118.field2923.method536(true, class55.field1367 + var4);
        }
        if (var2 == 24) {
            class97 var50 = class12.field231[var5];
            if (var50 != null) {
                class111.method906((byte) 123, 0, 0, var50.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var50.field1236[0]);
                class104.field2634++;
                class24.field467 = 2;
                class107.field2676 = class12.field245;
                class125.field3063 = class71.field1813;
                class68.field1736 = 0;
                class118.field2923.method707(80, 177);
                class118.field2923.method536(true, var5);
            }
        }
        if (var2 == 1004) {
            class7.field105++;
            class107.field2676 = class12.field245;
            class24.field467 = 2;
            class68.field1736 = 0;
            class125.field3063 = class71.field1813;
            class118.field2923.method707(-125, 13);
            class118.field2923.method536(true, var5);
        }
        if (var2 == 1003) {
            class111.field2808++;
            class98.method821(var4, var3, (byte) 52, var5);
            class118.field2923.method707(59, 150);
            class118.field2923.method530(class62.field1618 + var3, 117);
            class118.field2923.method530(var5 >> 14 & 0x7FFF, 124);
            class118.field2923.method530(class55.field1367 + var4, 115);
        }
        if (var2 == 37) {
            class97 var51 = class12.field231[var5];
            if (var51 != null) {
                class111.method906((byte) 114, 0, 0, var51.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var51.field1236[0]);
                class122.field3004++;
                class24.field467 = 2;
                class107.field2676 = class12.field245;
                class68.field1736 = 0;
                class125.field3063 = class71.field1813;
                class118.field2923.method707(29, 241);
                class118.field2923.method506(arg1 ^ 0xFFFFFF99, var5);
            }
        }
        if (var2 == 53) {
            class118.field2923.method707(arg1 ^ 0x60, 111);
            class16.field312++;
            class118.field2923.method530(var5, 117);
            class118.field2923.method491(123, var4);
            class118.field2923.method536(true, var3);
            class34.field793 = var4;
            class76.field1931 = var3;
            class84.field2074 = 0;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 16) {
            class97 var52 = class12.field231[var5];
            if (var52 != null) {
                class111.method906((byte) 93, 0, 0, var52.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var52.field1236[0]);
                class107.field2676 = class12.field245;
                class108.field2720++;
                class24.field467 = 2;
                class68.field1736 = 0;
                class125.field3063 = class71.field1813;
                class118.field2923.method707(arg1 - 36, 153);
                class118.field2923.method505(var5, 984693608);
            }
        }
        if (var2 == 45) {
            class97 var53 = class12.field231[var5];
            if (var53 != null) {
                class107.field2672++;
                class111.method906((byte) 109, 0, 0, var53.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var53.field1236[0]);
                class107.field2676 = class12.field245;
                class125.field3063 = class71.field1813;
                class24.field467 = 2;
                class68.field1736 = 0;
                class118.field2923.method707(-125, 140);
                class118.field2923.method536(true, class38.field916);
                class118.field2923.method530(var5, arg1 ^ 0x61);
                class118.field2923.method506(-128, class98.field2478);
                class118.field2923.method491(-26, class119.field2940);
            }
        }
        if (var2 == 6) {
            class122 var54 = class40.field957[var5];
            if (var54 != null) {
                class111.method906((byte) 100, 0, 0, var54.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var54.field1236[0]);
                class84.field2065++;
                class24.field467 = 2;
                class125.field3063 = class71.field1813;
                class107.field2676 = class12.field245;
                class68.field1736 = 0;
                class118.field2923.method707(-108, 62);
                class118.field2923.method536(true, var5);
            }
        }
        if (var2 == 18) {
            class34.field785++;
            class118.field2923.method707(-110, 120);
            class118.field2923.method530(var5, 119);
            class118.field2923.method526(var4, (byte) 7);
            class118.field2923.method536(true, var3);
            class76.field1931 = var3;
            field1063 = 2;
            class34.field793 = var4;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
            class84.field2074 = 0;
        }
        if (var2 == 22 && !class75.field1894) {
            class118.field2923.method707(-121, 73);
            class75.field1894 = true;
            class111.field2805++;
        }
        if (var2 == 4) {
            class97 var55 = class12.field231[var5];
            if (var55 != null) {
                class84.field2084++;
                class111.method906((byte) 93, 0, 0, var55.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var55.field1236[0]);
                class68.field1736 = 0;
                class125.field3063 = class71.field1813;
                class107.field2676 = class12.field245;
                class24.field467 = 2;
                class118.field2923.method707(9, 231);
                class118.field2923.method505(var5, arg1 + 984693583);
            }
        }
        if (var2 == 55) {
            class71.method598((byte) -86, class55.field1377);
            class55.field1377 = -1;
            class35.field841 = true;
        }
        if (var2 == 1001) {
            class99 var56 = class40.method305(65535, var4);
            if (var56 == null || var56.field2509[var3] < 100000) {
                class7.field105++;
                class118.field2923.method707(126, 13);
                class118.field2923.method536(true, var5);
            } else {
                class31.method242(class16.field309, 0, arg1 - 26, class69.method586(new class75[] { class45.method345(22978, var56.field2509[var3]), class92.field2286, class43.method326(var5, 0).field204 }, (byte) 79));
            }
            class34.field793 = var4;
            class84.field2074 = 0;
            class76.field1931 = var3;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 8) {
            class118.field2923.method707(-117, 41);
            class118.field2923.method526(var4, (byte) 7);
            class126.field3084++;
            class99 var57 = class40.method305(65535, var4);
            if (var57.field2537 != null && var57.field2537[0][0] == 5) {
                int var58 = var57.field2537[0][1];
                if (class62.field1613[var58] != var57.field2507[0]) {
                    class62.field1613[var58] = var57.field2507[0];
                    class129.method1011(var58, 0);
                    class108.field2743 = true;
                }
            }
        }
        if (var2 == 49) {
            class99 var59 = class40.method305(65535, var4);
            class100.field2596 = var59.field2527;
            class42.field1013 = 0;
            class99.field2561 = var59.field2539;
            class17.field332 = 1;
            class108.field2743 = true;
            class76.field1925 = var4;
            class86.field2126 = class69.method586(new class75[] { class55.field1404, var59.field2500, class26.field526 }, (byte) 110);
            if (class99.field2561 == 16) {
                class108.field2743 = true;
                class130.field3167 = 3;
                class30.field681 = true;
            }
            return;
        }
        if (var2 == 52) {
            class34.field813++;
            class118.field2923.method707(-117, 255);
            class118.field2923.method500((byte) -116, class76.field1925);
            class118.field2923.method536(true, var5);
            class118.field2923.method505(var3, 984693608);
            class118.field2923.method491(-15, var4);
            class84.field2074 = 0;
            class76.field1931 = var3;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
            class34.field793 = var4;
        }
        if (var2 == 47) {
            class122 var60 = class40.field957[var5];
            if (var60 != null) {
                class111.method906((byte) 93, 0, 0, var60.field1270[0], 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var60.field1236[0]);
                class68.field1736 = 0;
                class52.field1302++;
                class107.field2676 = class12.field245;
                class125.field3063 = class71.field1813;
                class24.field467 = 2;
                class118.field2923.method707(-113, 235);
                class118.field2923.method536(true, var5);
            }
        }
        if (var2 == 43) {
            boolean var61 = class111.method906((byte) 99, 0, 0, var3, 0, 0, false, 2, class52.field1315.field1236[0], 0, class52.field1315.field1270[0], var4);
            class1.field12++;
            if (!var61) {
                class111.method906((byte) 113, 0, 0, var3, 1, 0, false, 2, class52.field1315.field1236[0], 1, class52.field1315.field1270[0], var4);
            }
            class107.field2676 = class12.field245;
            class68.field1736 = 0;
            class24.field467 = 2;
            class125.field3063 = class71.field1813;
            class118.field2923.method707(-116, 9);
            class118.field2923.method491(-20, class119.field2940);
            class118.field2923.method536(true, class55.field1367 + var4);
            class118.field2923.method506(-128, var5);
            class118.field2923.method506(-128, var3 + class62.field1618);
            class118.field2923.method530(class98.field2478, arg1 + 92);
            class118.field2923.method530(class38.field916, 127);
        }
        if (var2 == 40) {
            class119.field2941++;
            class118.field2923.method707(arg1 - 27, 210);
            class118.field2923.method489(var4, arg1 ^ 0x19);
            class118.field2923.method506(arg1 - 153, var5);
            class118.field2923.method530(var3, 119);
            class76.field1931 = var3;
            class84.field2074 = 0;
            class34.field793 = var4;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (var2 == 50) {
            class55.field1380++;
            class118.field2923.method707(-115, 25);
            class118.field2923.method489(var4, 0);
            class118.field2923.method536(true, var5);
            class118.field2923.method536(true, var3);
            class34.field793 = var4;
            class84.field2074 = 0;
            class76.field1931 = var3;
            field1063 = 2;
            if (var4 >> 16 == class130.field3155) {
                field1063 = 1;
            }
            if (var4 >> 16 == class130.field3161) {
                field1063 = 3;
            }
        }
        if (class42.field1013 != 0) {
            class108.field2743 = true;
            class42.field1013 = 0;
        }
        if (class17.field332 != 0) {
            class108.field2743 = true;
            class17.field332 = 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 1157)
    private final void method331(int arg0) {
        long var2 = this.field1061;
        field1062++;
        int var4 = this.field1067[5];
        int var5 = this.field1067[9];
        this.field1067[5] = var5;
        this.field1067[9] = var4;
        this.field1061 = 0L;
        int var6 = 0;
        int var7 = 3 / ((arg0 + 55) / 42);
        while (var6 < 12) {
            this.field1061 <<= 0x4;
            if (this.field1067[var6] >= 256) {
                this.field1061 += this.field1067[var6] - 256;
            }
            var6++;
        }
        if (this.field1067[0] >= 256) {
            this.field1061 += this.field1067[0] - 256 >> 4;
        }
        if (this.field1067[1] >= 256) {
            this.field1061 += this.field1067[1] - 256 >> 8;
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field1061 <<= 0x3;
            this.field1061 += this.field1058[var8];
        }
        this.field1061 <<= 0x1;
        this.field1061 += this.field1053 ? 1 : 0;
        this.field1067[5] = var4;
        this.field1067[9] = var5;
        if (var2 != 0L && this.field1061 != var2) {
            class108.field2732.method555(var2, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZ)V", line = 1215)
    public final void method332(boolean arg0, boolean arg1) {
        field1051++;
        if (arg0 != this.field1053) {
            if (!arg1) {
                field1046 = null;
            }
            this.method343(arg0, this.field1058, null, (byte) -121, -1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)I", line = 1229)
    public final int method333(int arg0) {
        field1052++;
        int var2 = 30 / ((arg0 + 27) / 39);
        return this.field1056 == -1 ? (this.field1067[8] << 10) + (this.field1067[11] << 5) + this.field1067[1] + (this.field1067[0] << 15) + (this.field1058[0] << 25) + (this.field1058[4] << 20) : class52.method400(this.field1056, -13673).field784 + 305419896;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLja;)I", line = 1251)
    public static final int method334(boolean arg0, class55 arg1) {
        field1044++;
        int var2 = 0;
        if (arg1.method444(class38.field910, class92.field2279, (byte) -71)) {
            var2++;
        }
        if (arg1.method444(class31.field704, class92.field2279, (byte) -88)) {
            var2++;
        }
        if (arg1.method444(class90.field2219, class92.field2279, (byte) -31)) {
            var2++;
        }
        if (arg1.method444(class7.field116, class92.field2279, (byte) -96)) {
            var2++;
        }
        if (arg1.method444(class110.field2795, class92.field2279, (byte) -116)) {
            var2++;
        }
        if (arg1.method444(class16.field311, class92.field2279, (byte) -12)) {
            var2++;
        }
        if (arg1.method444(field1043, class92.field2279, (byte) -62)) {
            var2++;
        }
        if (arg1.method444(class13.field251, class92.field2279, (byte) -32)) {
            var2++;
        }
        if (arg1.method444(class104.field2647, class92.field2279, (byte) -36)) {
            var2++;
        }
        if (arg1.method444(class62.field1651, class92.field2279, (byte) -65)) {
            var2++;
        }
        if (arg1.method444(class12.field237, class92.field2279, (byte) -98)) {
            var2++;
        }
        if (!arg0) {
            return -54;
        }
        if (arg1.method444(class92.field2277, class92.field2279, (byte) -97)) {
            var2++;
        }
        if (arg1.method444(class107.field2690, class92.field2279, (byte) -24)) {
            var2++;
        }
        if (arg1.method444(class86.field2141, class92.field2279, (byte) -58)) {
            var2++;
        }
        if (arg1.method444(class88.field2173, class92.field2279, (byte) -108)) {
            var2++;
        }
        if (arg1.method444(class52.field1282, class92.field2279, (byte) -92)) {
            var2++;
        }
        if (arg1.method444(class75.field1895, class92.field2279, (byte) -29)) {
            var2++;
        }
        if (arg1.method444(class10.field205, class92.field2279, (byte) -50)) {
            var2++;
        }
        if (arg1.method444(class25.field506, class92.field2279, (byte) -58)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILka;)V", line = 1337)
    public final void method335(int arg0, class61 arg1) {
        field1060++;
        arg1.method493((byte) 88, this.field1053 ? 1 : 0);
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1067[class3.field50[var3]];
            if (var5 == 0) {
                arg1.method493((byte) 88, -1);
            } else {
                arg1.method493((byte) 88, var5 - 256);
            }
        }
        if (arg0 != -1704615600) {
            field1057 = -94;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method493((byte) 88, this.field1058[var4]);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZZ)V", line = 1370)
    public final void method336(int arg0, boolean arg1, boolean arg2) {
        field1054++;
        if (arg0 == 1 && this.field1053) {
            return;
        }
        int var4 = this.field1067[class3.field50[arg0]];
        if (var4 == 0) {
            return;
        }
        if (!arg2) {
            field1057 = -4;
        }
        var4 -= 256;
        class62 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class59.field1529) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class59.field1529 - 1;
                }
            }
            var5 = class17.method115(var4, false);
        } while (var5 == null || var5.field1629 || var5.field1625 != (this.field1053 ? 7 : 0) + arg0);
        this.field1067[class3.field50[arg0]] = var4 + 256;
        this.method331(-101);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILja;I)[Laa;", line = 1428)
    public static final class2[] method337(int arg0, int arg1, class55 arg2, int arg3) {
        if (arg0 != 1330296878) {
            field1037 = false;
        }
        field1050++;
        return class82.method693(arg0 ^ 0x4F4AB049, arg3, arg2, arg1) ? class26.method172(107) : null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZBI)V", line = 1458)
    public final void method338(boolean arg0, byte arg1, int arg2) {
        field1041++;
        int var4 = -75 % ((-arg1 - 56) / 37);
        int var5 = this.field1058[arg2];
        if (arg0) {
            var5++;
            if (var5 >= class55.field1378[arg2].length) {
                var5 = 0;
            }
        } else {
            var5--;
            if (var5 < 0) {
                var5 = class55.field1378[arg2].length - 1;
            }
        }
        this.field1058[arg2] = var5;
        this.method331(-114);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 1487)
    public static final void method339(int arg0) {
        field1039++;
        if (arg0 != 30392) {
            method340((byte) -11);
        }
        class41.field998.method553((byte) 114);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 1500)
    public static void method340(byte arg0) {
        field1042 = null;
        field1045 = null;
        field1040 = null;
        field1043 = null;
        field1046 = null;
        field1055 = null;
        if (arg0 < 59) {
            method330(-41, (byte) 29);
        }
        field1064 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILs;Ls;B)Lpc;", line = 1522)
    public final class93 method341(int arg0, int arg1, class107 arg2, class107 arg3, byte arg4) {
        field1066++;
        if (this.field1056 != -1) {
            return class52.method400(this.field1056, -13673).method270(arg2, -50, arg1, arg0, arg3);
        }
        long var6 = this.field1061;
        int[] var8 = this.field1067;
        if (arg3 != null && (arg3.field2659 >= 0 || arg3.field2678 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1067[var9];
            }
            if (arg3.field2659 >= 0) {
                var6 += arg3.field2659 - this.field1067[5] << 8;
                var8[5] = arg3.field2659;
            }
            if (arg3.field2678 >= 0) {
                var6 += arg3.field2678 - this.field1067[3] << 16;
                var8[3] = arg3.field2678;
            }
        }
        class93 var10 = (class93) class108.field2732.method559(var6, 3);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var8[var12];
                if (var20 >= 256 && var20 < 512 && !class17.method115(var20 - 256, false).method544(27142)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class43.method326(var20 - 512, 0).method62(-85, this.field1053)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1065 != -1L) {
                    var10 = (class93) class108.field2732.method559(this.field1065, -128);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var8[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class93 var18 = class17.method115(var17 - 256, false).method539(4048);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class93 var19 = class43.method326(var17 - 512, 0).method70(this.field1053, false);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class93(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field1058[var16] != 0) {
                        var10.method789(class55.field1378[var16][0], class55.field1378[var16][this.field1058[var16]]);
                        if (var16 == 1) {
                            var10.method789(class68.field1733[0], class68.field1733[this.field1058[var16]]);
                        }
                    }
                }
                var10.method783();
                var10.method800(64, 850, -30, -50, -30, true);
                class108.field2732.method558(var6, var10, 304);
                this.field1065 = var6;
            }
        }
        if (arg4 > -24) {
            field1040 = null;
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class93 var21;
        if (arg3 != null && arg2 != null) {
            var21 = arg3.method882(arg2, arg1, var10, arg0, (byte) 97);
        } else if (arg3 == null) {
            var21 = arg2.method873((byte) -118, var10, arg1);
        } else {
            var21 = arg3.method873((byte) -54, var10, arg0);
        }
        return var21;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)Lpc;", line = 1686)
    public final class93 method342(int arg0) {
        field1049++;
        if (this.field1056 != -1) {
            return class52.method400(this.field1056, -13673).method261(0);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1067[var3];
            if (var12 >= 256 && var12 < 512 && !class17.method115(var12 - 256, false).method545(6)) {
                var2 = true;
            }
            if (var12 >= 512 && !class43.method326(var12 - 512, 0).method63(this.field1053, -1)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1067[var6];
            if (var9 >= 256 && var9 < 512) {
                class93 var10 = class17.method115(var9 - 256, false).method547((byte) -104);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class93 var11 = class43.method326(var9 - 512, 0).method73(this.field1053, 2);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class93 var7 = new class93(var4, var5);
        if (arg0 <= 80) {
            field1040 = null;
        }
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1058[var8] != 0) {
                var7.method789(class55.field1378[var8][0], class55.field1378[var8][this.field1058[var8]]);
                if (var8 == 1) {
                    var7.method789(class68.field1733[0], class68.field1733[this.field1058[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[I[IBI)V", line = 1800)
    public final void method343(boolean arg0, int[] arg1, int[] arg2, byte arg3, int arg4) {
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class59.field1529; var7++) {
                    class62 var8 = class17.method115(var7, false);
                    if (var8 != null && !var8.field1629 && var6 + (arg0 ? 7 : 0) == var8.field1625) {
                        arg2[class3.field50[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1067 = arg2;
        field1059++;
        this.field1058 = arg1;
        if (arg3 >= -100) {
            this.method336(-122, false, true);
        }
        this.field1056 = arg4;
        this.field1053 = arg0;
        this.method331(-1);
    }
}
