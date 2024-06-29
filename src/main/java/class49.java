import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class49 extends class139 {

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Ljava/lang/String;")
    private String field719 = "null";

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "[J")
    public static long[] field710 = new long[500];

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Ljava/lang/String;")
    public static String field722 = "Loaded config";

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public static int field706 = 0;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "C")
    public char field717;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "C")
    public char field723;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "Lnj;")
    public class144 field724;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "Lnj;")
    private class144 field730;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
    private final void method374(int arg0) {
        this.field730 = new class144(this.field724.method1030(-28));
        field721++;
        if (arg0 != 30136) {
            method383((byte) -126, -108);
        }
        for (class276 var2 = (class276) this.field724.method1033(-9843); var2 != null; var2 = (class276) this.field724.method1031((byte) -7)) {
            class66 var3 = new class66(var2.field4423, (int) var2.field4459);
            this.field730.method1032(false, var3, class209.method1529(var2.field4423, 12881));
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public static final void method375(int arg0) {
        field729++;
        if (arg0 != 29353) {
            field706 = -72;
        }
        if (class46.field675 == 2) {
            if (class289.field4587 == class272.field4378 && class52.field767 == class281.field4471) {
                class46.field675 = 0;
                if (class171.field2761 && class285.field4512[81] && class243.field3890 > 2) {
                    method378(class243.field3890 - 2, 114);
                } else {
                    method378(class243.field3890 - 1, -118);
                }
            }
        } else if (class272.field4378 == class126.field1850 && class52.field767 == class101.field1497) {
            class46.field675 = 0;
            if (class171.field2761 && class285.field4512[81] && class243.field3890 > 2) {
                method378(class243.field3890 - 2, 80);
            } else {
                method378(class243.field3890 - 1, 93);
            }
        } else {
            class46.field675 = 2;
            class281.field4471 = class101.field1497;
            class289.field4587 = class126.field1850;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    public final boolean method376(int arg0, int arg1) {
        field720++;
        if (this.field724 == null) {
            return false;
        } else if (arg0 == 2) {
            if (this.field730 == null) {
                this.method386(20128);
            }
            class130 var3 = (class130) this.field730.method1034((long) arg1, (byte) 21);
            return var3 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V")
    public static void method377(byte arg0) {
        field722 = null;
        field710 = null;
        if (arg0 >= -88) {
            method377((byte) 4);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
    public static final void method378(int arg0, int arg1) {
        int var2 = 93 % ((18 - arg1) / 38);
        field726++;
        if (arg0 < 0) {
            return;
        }
        int var3 = class276.field4425[arg0];
        int var4 = class77.field1108[arg0];
        int var5 = (int) field710[arg0];
        long var6 = field710[arg0];
        int var8 = class207.field3318[arg0];
        if (var8 >= 2000) {
            var8 -= 2000;
        }
        if (var8 == 44) {
            class220.field3532.method557(107, 8);
            class220.field3532.method1119(var4, (byte) 84);
            class131 var9 = class122.method891(var4, (byte) -122);
            class229.field3687++;
            if (var9.field2017 != null && var9.field2017[0][0] == 5) {
                int var10 = var9.field2017[0][1];
                if (class243.field3904[var10] != var9.field2124[0]) {
                    class243.field3904[var10] = var9.field2124[0];
                    class273.method1888(var10, -118);
                }
            }
        }
        if (var8 == 1005) {
            class131 var11 = class122.method891(var4, (byte) -127);
            if (var11 == null || var11.field2113[var3] < 100000) {
                class220.field3532.method557(28, 8);
                class220.field3532.method1087(-1228597208, var5);
                class269.field4348++;
            } else {
                class172.method1276(0, "", (byte) 40, var11.field2113[var3] + " x " + class254.method1800(var5, 15017).field910);
            }
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -123);
            class163.field2650 = var3;
        }
        if (var8 == 37) {
            class52.field754 = 0;
            class230.field3712 = class126.field1850;
            class66.field969++;
            class53.field775 = 2;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(46, 8);
            class220.field3532.method1112((byte) 3, class264.field4288);
            class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            class220.field3532.method1108(class282.field4487 + var3, (byte) 94);
            class220.field3532.method1108(class155.field2548, (byte) -74);
            class220.field3532.method1094(-700861976, class212.field3401);
            class220.field3532.method1084((byte) -107, var4 + class99.field1465);
            class220.field3532.method1108(var5, (byte) -68);
        }
        if (var8 == 9) {
            class29 var12 = class92.field1374[var5];
            if (var12 != null) {
                class230.field3712 = class126.field1850;
                class220.field3529 = class101.field1497;
                class52.field754 = 0;
                class53.field775 = 2;
                class180.field2897++;
                class220.field3532.method557(43, 8);
                class220.field3532.method1108(var5, (byte) -97);
                class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            }
        }
        if (var8 == 16) {
            class18 var13 = class169.field2730[var5];
            if (var13 != null) {
                class52.field754 = 0;
                class230.field3712 = class126.field1850;
                class53.field775 = 2;
                class220.field3529 = class101.field1497;
                class78.field1125++;
                class220.field3532.method557(139, 8);
                class220.field3532.method1070(class285.field4512[82] ? 1 : 0, false);
                class220.field3532.method1094(-700861976, var5);
            }
        }
        if (var8 == 32) {
            class5.field37++;
            class220.field3532.method557(184, 8);
            class220.field3532.method1119(var4, (byte) 36);
            class220.field3532.method1084((byte) -99, var3);
            class220.field3532.method1084((byte) 108, var5);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -124);
            class163.field2650 = var3;
        }
        if (var8 == 3) {
            class220.field3532.method557(240, 8);
            class53.field770++;
            class220.field3532.method1109(var4, false);
            class220.field3532.method1087(-1228597208, var3);
            class220.field3532.method1108(var5, (byte) 82);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -125);
            class163.field2650 = var3;
        }
        if (var8 == 1006) {
            class96.field1411++;
            class52.field754 = 0;
            class53.field775 = 2;
            class230.field3712 = class126.field1850;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(227, 8);
            class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            class220.field3532.method1087(-1228597208, class282.field4487 + var3);
            class220.field3532.method1094(-700861976, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class220.field3532.method1094(-700861976, class99.field1465 + var4);
        }
        if (var8 == 8 && class211.field3390 == null) {
            class205.method1500(127, var3, var4);
            class211.field3390 = class161.method1200((byte) 74, var3, var4);
            class274.method1896(class211.field3390, 10);
        }
        if (var8 == 39) {
            class220.field3532.method557(244, 8);
            class220.field3532.method1089(var4, -62);
            class42.field594++;
            class220.field3532.method1089(class34.field436, -107);
            class220.field3532.method1084((byte) 112, var3);
            class220.field3532.method1084((byte) 109, class126.field1862);
        }
        if (var8 == 48) {
            if (var5 == 0) {
                class119.field1724 = 1;
                class264.method1846(class58.field826, var3, var4);
            } else if (class21.field227 > 0 && class285.field4512[82] && class285.field4512[81]) {
                class25.method183(class58.field826, class99.field1465 + var4, true, class282.field4487 + var3);
            } else {
                class220.field3532.method557(161, 8);
                class220.field3532.method1084((byte) -127, class282.field4487 + var3);
                class32.field396++;
                class220.field3532.method1084((byte) 80, class99.field1465 + var4);
            }
        }
        if (var8 == 7) {
            class26.field303++;
            class230.field3712 = class126.field1850;
            class53.field775 = 2;
            class52.field754 = 0;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(87, 8);
            class220.field3532.method1084((byte) -123, var5);
            class220.field3532.method1074(class285.field4512[82] ? 1 : 0, 60);
            class220.field3532.method1108(class282.field4487 + var3, (byte) 105);
            class220.field3532.method1094(-700861976, class99.field1465 + var4);
        }
        if (var8 == 26) {
            class29 var14 = class92.field1374[var5];
            if (var14 != null) {
                class230.field3712 = class126.field1850;
                class220.field3529 = class101.field1497;
                class52.field754 = 0;
                class98.field1445++;
                class53.field775 = 2;
                class220.field3532.method557(177, 8);
                class220.field3532.method1084((byte) -121, var5);
                class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
                class220.field3532.method1084((byte) 75, class212.field3401);
                class220.field3532.method1087(-1228597208, class155.field2548);
                class220.field3532.method1112((byte) 3, class264.field4288);
            }
        }
        if (var8 == 4) {
            if (var5 == 0) {
                class262.field4265 = 1;
                class264.method1846(class58.field826, var3, var4);
            } else if (var5 == 1) {
                class220.field3532.method557(147, 8);
                class220.field3532.method1094(-700861976, class282.field4487 + var3);
                class220.field3532.method1112((byte) 3, class34.field436);
                class148.field2418++;
                class220.field3532.method1087(-1228597208, class126.field1862);
                class220.field3532.method1087(-1228597208, class99.field1465 + var4);
            }
        }
        if (var8 == 29) {
            class220.field3532.method557(110, 8);
            class96.field1413++;
            class220.field3532.method1112((byte) 3, var4);
            class220.field3532.method1108(var5, (byte) 118);
            class220.field3532.method1094(-700861976, var3);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -127);
            class163.field2650 = var3;
        }
        if (var8 == 59) {
            class29 var15 = class92.field1374[var5];
            if (var15 != null) {
                class52.field754 = 0;
                class230.field3712 = class126.field1850;
                class53.field775 = 2;
                class128.field1884++;
                class220.field3529 = class101.field1497;
                class220.field3532.method557(150, 8);
                class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
                class220.field3532.method1084((byte) -92, var5);
            }
        }
        if (var8 == 23) {
            class220.field3529 = class101.field1497;
            class172.field2767++;
            class53.field775 = 2;
            class230.field3712 = class126.field1850;
            class52.field754 = 0;
            class220.field3532.method557(168, 8);
            class220.field3532.method1084((byte) 107, class212.field3401);
            class220.field3532.method1094(-700861976, var3 + class282.field4487);
            class220.field3532.method1108(class155.field2548, (byte) 86);
            class220.field3532.method1112((byte) 3, class264.field4288);
            class220.field3532.method1084((byte) 115, class99.field1465 + var4);
            class220.field3532.method1074(class285.field4512[82] ? 1 : 0, 92);
            class220.field3532.method1108(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 89);
        }
        if (var8 == 10) {
            class16.method110(568);
        }
        if (var8 == 60) {
            field713++;
            class220.field3532.method557(178, 8);
            class220.field3532.method1108(var5, (byte) 86);
            class220.field3532.method1108(var3, (byte) -54);
            class220.field3532.method1119(var4, (byte) 73);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -121);
            class163.field2650 = var3;
        }
        if (var8 == 57) {
            class230.field3712 = class126.field1850;
            class52.field754 = 0;
            class220.field3529 = class101.field1497;
            class53.field775 = 2;
            class29.field359++;
            class220.field3532.method557(52, 8);
            class220.field3532.method1084((byte) 124, class99.field1465 + var4);
            class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
            class220.field3532.method1094(-700861976, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class220.field3532.method1108(class282.field4487 + var3, (byte) -116);
        }
        if (var8 == 21) {
            class18 var16 = class169.field2730[var5];
            if (var16 != null) {
                class53.field775 = 2;
                class176.field2854++;
                class230.field3712 = class126.field1850;
                class220.field3529 = class101.field1497;
                class52.field754 = 0;
                class220.field3532.method557(8, 8);
                class220.field3532.method1074(class285.field4512[82] ? 1 : 0, 114);
                class220.field3532.method1087(-1228597208, class212.field3401);
                class220.field3532.method1087(-1228597208, var5);
                class220.field3532.method1119(class264.field4288, (byte) -119);
                class220.field3532.method1087(-1228597208, class155.field2548);
            }
        }
        if (var8 == 51) {
            class131 var17 = class122.method891(var4, (byte) -121);
            boolean var18 = true;
            if (var17.field2005 > 0) {
                var18 = class66.method473(1, var17);
            }
            if (var18) {
                class220.field3532.method557(107, 8);
                class220.field3532.method1119(var4, (byte) 75);
                class229.field3687++;
            }
        }
        if (var8 == 12) {
            class51.field739++;
            class220.field3532.method557(194, 8);
            class220.field3532.method1108(var5, (byte) 100);
            class220.field3532.method1108(var3, (byte) -67);
            class220.field3532.method1112((byte) 3, var4);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -123);
            class163.field2650 = var3;
        }
        if (var8 == 41) {
            class29 var19 = class92.field1374[var5];
            if (var19 != null) {
                class111.field1594++;
                class230.field3712 = class126.field1850;
                class52.field754 = 0;
                class53.field775 = 2;
                class220.field3529 = class101.field1497;
                class220.field3532.method557(202, 8);
                class220.field3532.method1108(class126.field1862, (byte) 114);
                class220.field3532.method1119(class34.field436, (byte) 110);
                class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
                class220.field3532.method1094(-700861976, var5);
            }
        }
        if (var8 == 22) {
            class18 var20 = class169.field2730[var5];
            if (var20 != null) {
                class230.field3712 = class126.field1850;
                class52.field754 = 0;
                class90.field1338++;
                class220.field3529 = class101.field1497;
                class53.field775 = 2;
                class220.field3532.method557(221, 8);
                class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
                class220.field3532.method1084((byte) -118, var5);
            }
        }
        if (var8 == 17) {
            class18 var21 = class169.field2730[var5];
            if (var21 != null) {
                class53.field775 = 2;
                class52.field754 = 0;
                class220.field3529 = class101.field1497;
                client.field2584++;
                class230.field3712 = class126.field1850;
                class220.field3532.method557(47, 8);
                class220.field3532.method1094(-700861976, var5);
                class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            }
        }
        if (var8 == 6) {
            class235.field3777++;
            class230.field3712 = class126.field1850;
            class220.field3529 = class101.field1497;
            class52.field754 = 0;
            class53.field775 = 2;
            class220.field3532.method557(12, 8);
            class220.field3532.method1087(-1228597208, class99.field1465 + var4);
            class220.field3532.method1108(var5, (byte) 101);
            class220.field3532.method1108(class282.field4487 + var3, (byte) -110);
            class220.field3532.method1074(class285.field4512[82] ? 1 : 0, 52);
        }
        if (var8 == 1002) {
            class53.field775 = 2;
            class52.field754 = 0;
            class230.field3712 = class126.field1850;
            class269.field4348++;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(28, 8);
            class220.field3532.method1087(-1228597208, var5);
        }
        if (var8 == 20) {
            class53.field775 = 2;
            class230.field3712 = class126.field1850;
            class52.field754 = 0;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(74, 8);
            class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            class128.field1899++;
            class220.field3532.method1094(-700861976, class99.field1465 + var4);
            class220.field3532.method1087(-1228597208, var5);
            class220.field3532.method1108(class282.field4487 + var3, (byte) 76);
        }
        if (var8 == 25 || var8 == 1004) {
            class60.method431(var5, class243.field3927[arg0], 164, var3, var4);
        }
        if (var8 == 58) {
            class18 var22 = class169.field2730[var5];
            if (var22 != null) {
                class186.field2992++;
                class53.field775 = 2;
                class220.field3529 = class101.field1497;
                class230.field3712 = class126.field1850;
                class52.field754 = 0;
                class220.field3532.method557(242, 8);
                class220.field3532.method1084((byte) -109, var5);
                class220.field3532.method1074(class285.field4512[82] ? 1 : 0, 106);
            }
        }
        if (var8 == 18) {
            class229.field3687++;
            class220.field3532.method557(107, 8);
            class220.field3532.method1119(var4, (byte) 37);
            class131 var23 = class122.method891(var4, (byte) -121);
            if (var23.field2017 != null && var23.field2017[0][0] == 5) {
                int var24 = var23.field2017[0][1];
                class243.field3904[var24] = 1 - class243.field3904[var24];
                class273.method1888(var24, -120);
            }
        }
        if (var8 == 43) {
            class18 var25 = class169.field2730[var5];
            if (var25 != null) {
                class220.field3529 = class101.field1497;
                class52.field754 = 0;
                class230.field3712 = class126.field1850;
                class53.field775 = 2;
                class253.field4177++;
                class220.field3532.method557(175, 8);
                class220.field3532.method1087(-1228597208, var5);
                class220.field3532.method1070(class285.field4512[82] ? 1 : 0, false);
                class220.field3532.method1108(class126.field1862, (byte) 98);
                class220.field3532.method1119(class34.field436, (byte) -123);
            }
        }
        if (var8 == 46) {
            class220.field3532.method557(35, 8);
            class105.field1524++;
            class220.field3532.method1112((byte) 3, var4);
            class220.field3532.method1084((byte) 62, var3);
            class220.field3532.method1094(-700861976, var5);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -126);
            class163.field2650 = var3;
        }
        if (var8 == 36) {
            class29 var26 = class92.field1374[var5];
            if (var26 != null) {
                class53.field775 = 2;
                class191.field3082++;
                class52.field754 = 0;
                class230.field3712 = class126.field1850;
                class220.field3529 = class101.field1497;
                class220.field3532.method557(60, 8);
                class220.field3532.method1087(-1228597208, var5);
                class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
            }
        }
        if (var8 == 45) {
            class52.field754 = 0;
            class234.field3744++;
            class53.field775 = 2;
            class230.field3712 = class126.field1850;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(33, 8);
            class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
            class220.field3532.method1087(-1228597208, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class220.field3532.method1108(var3 + class282.field4487, (byte) -100);
            class220.field3532.method1087(-1228597208, var4 + class99.field1465);
        }
        if (var8 == 19) {
            class131 var27 = class161.method1200((byte) 74, var3, var4);
            if (var27 != null) {
                class243.method1723(-1);
                class73 var28 = client.method1168(var27);
                class244.method1746(var28.method526(-128), var3, -9750, var28.field1066, var27.field2085, var27.field2154, var4);
                class63.field941 = 0;
                class293.field4659 = class286.method1944(var27, 16730);
                if (var27.field2077) {
                    class77.field1117 = var27.field2047 + "<col=ffffff>";
                } else {
                    class77.field1117 = "<col=00ff00>" + var27.field2133 + "<col=ffffff>";
                }
                if (class293.field4659 == null) {
                    class293.field4659 = "Null";
                }
            }
            return;
        }
        if (var8 == 40) {
            class220.field3532.method557(170, 8);
            class220.field3532.method1109(var4, false);
            class220.field3532.method1084((byte) -114, var5);
            class220.field3532.method1094(-700861976, var3);
            class83.field1198++;
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -128);
            class163.field2650 = var3;
        }
        if (var8 == 5) {
            class32.field404++;
            class220.field3532.method557(101, 8);
            class220.field3532.method1089(var4, -76);
            class220.field3532.method1087(-1228597208, var3);
            class220.field3532.method1087(-1228597208, var5);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -121);
            class163.field2650 = var3;
        }
        if (var8 == 15) {
            class53.field775 = 2;
            class52.field754 = 0;
            class230.field3712 = class126.field1850;
            class100.field1472++;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(249, 8);
            class220.field3532.method1087(-1228597208, var5);
            class220.field3532.method1087(-1228597208, class282.field4487 + var3);
            class220.field3532.method1087(-1228597208, class99.field1465 + var4);
            class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
        }
        if (var8 == 30) {
            class18 var29 = class169.field2730[var5];
            if (var29 != null) {
                class220.field3529 = class101.field1497;
                class230.field3712 = class126.field1850;
                class52.field754 = 0;
                class53.field775 = 2;
                class220.field3532.method557(72, 8);
                class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
                class247.field4131++;
                class220.field3532.method1094(-700861976, var5);
            }
        }
        if (var8 == 42) {
            class29 var30 = class92.field1374[var5];
            if (var30 != null) {
                class220.field3513++;
                class53.field775 = 2;
                class52.field754 = 0;
                class220.field3529 = class101.field1497;
                class230.field3712 = class126.field1850;
                class220.field3532.method557(193, 8);
                class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
                class220.field3532.method1084((byte) 100, var5);
            }
        }
        if (var8 == 31) {
            class53.field775 = 2;
            class52.field754 = 0;
            class164.field2653++;
            class230.field3712 = class126.field1850;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(19, 8);
            class220.field3532.method1084((byte) 71, class282.field4487 + var3);
            class220.field3532.method1070(class285.field4512[82] ? 1 : 0, false);
            class220.field3532.method1094(-700861976, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class220.field3532.method1084((byte) 114, var4 + class99.field1465);
        }
        if (var8 == 28) {
            class23.field259++;
            class52.field754 = 0;
            class230.field3712 = class126.field1850;
            class53.field775 = 2;
            class220.field3529 = class101.field1497;
            class220.field3532.method557(245, 8);
            class220.field3532.method1094(-700861976, var5);
            class220.field3532.method1094(-700861976, class126.field1862);
            class220.field3532.method1087(-1228597208, class282.field4487 + var3);
            class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            class220.field3532.method1084((byte) 107, class99.field1465 + var4);
            class220.field3532.method1109(class34.field436, false);
        }
        if (var8 == 35) {
            class29 var31 = class92.field1374[var5];
            if (var31 != null) {
                class52.field754 = 0;
                class71.field1039++;
                class220.field3529 = class101.field1497;
                class53.field775 = 2;
                class230.field3712 = class126.field1850;
                class220.field3532.method557(195, 8);
                class220.field3532.method1087(-1228597208, var5);
                class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            }
        }
        if (var8 == 50) {
            class52.field754 = 0;
            class220.field3529 = class101.field1497;
            class250.field4156++;
            class53.field775 = 2;
            class230.field3712 = class126.field1850;
            class220.field3532.method557(56, 8);
            class220.field3532.method1094(-700861976, class99.field1465 + var4);
            class220.field3532.method1087(-1228597208, class282.field4487 + var3);
            class220.field3532.method1074(class285.field4512[82] ? 1 : 0, 59);
            class220.field3532.method1087(-1228597208, var5);
        }
        if (var8 == 13) {
            class220.field3532.method557(3, 8);
            class220.field3532.method1108(class155.field2548, (byte) 111);
            class220.field3532.method1084((byte) 115, class212.field3401);
            class294.field4670++;
            class220.field3532.method1112((byte) 3, class264.field4288);
            class220.field3532.method1094(-700861976, var5);
            class220.field3532.method1084((byte) -92, var3);
            class220.field3532.method1109(var4, false);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -126);
            class163.field2650 = var3;
        }
        if (var8 == 2) {
            class243.method1723(-1);
            class131 var32 = class122.method891(var4, (byte) -122);
            class63.field941 = 1;
            class264.field4288 = var4;
            class155.field2548 = var3;
            class212.field3401 = var5;
            class274.method1896(var32, 10);
            class297.field4709 = "<col=ff9040>" + class254.method1800(var5, 15017).field910 + "<col=ffffff>";
            if (class297.field4709 == null) {
                class297.field4709 = "null";
            }
            return;
        }
        if (var8 == 11) {
            class75.field1073++;
            class220.field3532.method557(57, 8);
            class220.field3532.method1084((byte) 59, var3);
            class220.field3532.method1089(var4, -80);
            class220.field3532.method1094(-700861976, var5);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -128);
            class163.field2650 = var3;
        }
        if (var8 == 1) {
            class52.field754 = 0;
            class220.field3529 = class101.field1497;
            class53.field775 = 2;
            class230.field3712 = class126.field1850;
            class220.field3532.method557(253, 8);
            class220.field3532.method1087(-1228597208, class282.field4487 + var3);
            class128.field1896++;
            class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            class220.field3532.method1087(-1228597208, class99.field1465 + var4);
            class220.field3532.method1094(-700861976, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var8 == 34) {
            class29 var33 = class92.field1374[var5];
            if (var33 != null) {
                class230.field3712 = class126.field1850;
                class189.field3053++;
                class220.field3529 = class101.field1497;
                class53.field775 = 2;
                class52.field754 = 0;
                class220.field3532.method557(207, 8);
                class220.field3532.method1122(false, class285.field4512[82] ? 1 : 0);
                class220.field3532.method1084((byte) -77, var5);
            }
        }
        if (var8 == 24) {
            class192.field3090++;
            class220.field3532.method557(220, 8);
            class220.field3532.method1087(-1228597208, var3);
            class220.field3532.method1084((byte) 108, var5);
            class220.field3532.method1089(var4, -62);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -126);
            class163.field2650 = var3;
        }
        if (var8 == 14) {
            class135.field2206++;
            class52.field754 = 0;
            class230.field3712 = class126.field1850;
            class220.field3529 = class101.field1497;
            class53.field775 = 2;
            class220.field3532.method557(116, 8);
            class220.field3532.method1108(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -89);
            class220.field3532.method1119(class34.field436, (byte) -114);
            class220.field3532.method1094(-700861976, var3 + class282.field4487);
            class220.field3532.method1094(-700861976, class126.field1862);
            class220.field3532.method1070(class285.field4512[82] ? 1 : 0, false);
            class220.field3532.method1108(class99.field1465 + var4, (byte) 106);
        }
        if (var8 == 33) {
            class29 var34 = class92.field1374[var5];
            if (var34 != null) {
                class230.field3712 = class126.field1850;
                class220.field3529 = class101.field1497;
                class52.field754 = 0;
                class53.field775 = 2;
                class101.field1479++;
                class220.field3532.method557(186, 8);
                class220.field3532.method1108(var5, (byte) -106);
                class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            }
        }
        if (var8 == 49) {
            if (var5 == 0) {
                class264.method1846(class58.field826, var3, var4);
            } else if (var5 == 1) {
                if (class21.field227 > 0 && class285.field4512[82] && class285.field4512[81]) {
                    class25.method183(class58.field826, class99.field1465 + var4, true, class282.field4487 + var3);
                } else {
                    class148.method1055(1, var4, var3, -2048);
                    class220.field3532.method1074(class111.field1608, 99);
                    class220.field3532.method1074(class264.field4287, 127);
                    class220.field3532.method1094(-700861976, (int) class190.field3068);
                    class220.field3532.method1074(57, 93);
                    class220.field3532.method1074(class61.field855, 99);
                    class220.field3532.method1074(class53.field776, 83);
                    class220.field3532.method1074(89, 126);
                    class220.field3532.method1094(-700861976, class186.field2993.field1979);
                    class220.field3532.method1094(-700861976, class186.field2993.field1910);
                    class220.field3532.method1074(class12.field149, 70);
                    class220.field3532.method1074(63, 50);
                }
            }
        }
        if (var8 == 1007) {
            class52.field754 = 0;
            class188.field3024++;
            class220.field3529 = class101.field1497;
            class53.field775 = 2;
            class230.field3712 = class126.field1850;
            class220.field3532.method557(166, 8);
            class220.field3532.method1108(var5, (byte) -57);
        }
        if (var8 == 1003) {
            class52.field754 = 0;
            class230.field3712 = class126.field1850;
            class220.field3529 = class101.field1497;
            class53.field775 = 2;
            class18 var35 = class169.field2730[var5];
            if (var35 != null) {
                class245 var36 = var35.field205;
                if (var36.field3972 != null) {
                    var36 = var36.method1758(true);
                }
                if (var36 != null) {
                    class178.field2882++;
                    class220.field3532.method557(39, 8);
                    class220.field3532.method1084((byte) -92, var36.field3986);
                }
            }
        }
        if (var8 == 38) {
            class220.field3532.method557(13, 8);
            class82.field1183++;
            class220.field3532.method1094(-700861976, var5);
            class220.field3532.method1094(-700861976, var3);
            class220.field3532.method1112((byte) 3, var4);
            class220.field3532.method1109(class34.field436, false);
            class220.field3532.method1084((byte) -89, class126.field1862);
            class33.field425 = 0;
            class110.field1588 = class122.method891(var4, (byte) -122);
            class163.field2650 = var3;
        }
        if (var8 == 47) {
            class29 var37 = class92.field1374[var5];
            if (var37 != null) {
                class230.field3712 = class126.field1850;
                class267.field4311++;
                class52.field754 = 0;
                class220.field3529 = class101.field1497;
                class53.field775 = 2;
                class220.field3532.method557(180, 8);
                class220.field3532.method1087(-1228597208, var5);
                class220.field3532.method1123(-16081, class285.field4512[82] ? 1 : 0);
            }
        }
        if (class63.field941 != 0) {
            class63.field941 = 0;
            class274.method1896(class122.method891(class264.field4288, (byte) -124), 10);
        }
        if (class131.field2131) {
            class243.method1723(-1);
        }
        if (class110.field1588 != null && class33.field425 == 0) {
            class274.method1896(class110.field1588, 10);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILv;I)V")
    private final void method379(int arg0, class152 arg1, int arg2) {
        if (arg2 == 1) {
            this.field717 = class226.method1620(114, arg1.method1092((byte) -62));
        } else if (arg2 == 2) {
            this.field723 = class226.method1620(103, arg1.method1092((byte) -62));
        } else if (arg2 == 3) {
            this.field719 = arg1.method1078(arg0 ^ 0xFFFFFF3C);
        } else if (arg2 == 4) {
            this.field714 = arg1.method1097(127);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1126(false);
            this.field724 = new class144(class254.method1801(var4, (byte) 87));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1097(127);
                class280 var7;
                if (arg2 == 5) {
                    var7 = new class276(arg1.method1078(-1));
                } else {
                    var7 = new class130(arg1.method1097(arg0 - 69));
                }
                this.field724.method1032(false, var7, (long) var6);
            }
        }
        field716++;
        if (arg0 != 195) {
            this.method376(-81, 94);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method380(int arg0, String arg1) {
        field725++;
        if (this.field724 == null) {
            return false;
        }
        if (this.field730 == null) {
            this.method374(30136);
        }
        if (arg0 != 101) {
            this.method379(71, (class152) null, 84);
        }
        for (class66 var3 = (class66) this.field730.method1034(class209.method1529(arg1, 12881), (byte) 21); var3 != null; var3 = (class66) this.field730.method1029(false)) {
            if (var3.field968.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method381(int arg0, int arg1) {
        field711++;
        if (arg1 != 82) {
            field715 = 33;
        }
        if (this.field724 == null) {
            return this.field719;
        } else {
            class276 var3 = (class276) this.field724.method1034((long) arg0, (byte) 21);
            return var3 == null ? this.field719 : var3.field4423;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(II)I")
    public final int method382(int arg0, int arg1) {
        if (arg1 != 244) {
            this.method384((byte) -44, (class152) null);
        }
        field708++;
        if (this.field724 == null) {
            return this.field714;
        } else {
            class130 var3 = (class130) this.field724.method1034((long) arg0, (byte) 21);
            return var3 == null ? this.field714 : var3.field1989;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V")
    public static final void method383(byte arg0, int arg1) {
        field727++;
        int var2 = 110 % ((arg0 - 16) / 48);
        class226.field3630.method1548(arg1, 0);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BLv;)V")
    public final void method384(byte arg0, class152 arg1) {
        field712++;
        while (true) {
            int var3 = arg1.method1111(arg0 ^ 0xBA);
            if (var3 == 0) {
                if (arg0 == 69) {
                    return;
                } else {
                    this.field714 = 12;
                    return;
                }
            }
            this.method379(195, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILcf;)V")
    public static final void method385(int arg0, class95 arg1) {
        arg1.field1410 = false;
        if (arg1.field1408 != null) {
            arg1.field1408.field964 = 0;
        }
        if (arg0 < 65) {
            method378(56, 92);
        }
        for (class95 var2 = arg1.method250(); var2 != null; var2 = arg1.method249()) {
            method385(107, var2);
        }
        field707++;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
    private final void method386(int arg0) {
        field705++;
        if (arg0 != 20128) {
            this.method379(-70, (class152) null, -87);
        }
        this.field730 = new class144(this.field724.method1030(arg0 - 20218));
        for (class130 var2 = (class130) this.field724.method1033(-9843); var2 != null; var2 = (class130) this.field724.method1031((byte) -7)) {
            class130 var3 = new class130((int) var2.field4459);
            this.field730.method1032(false, var3, (long) var2.field1989);
        }
    }
}
