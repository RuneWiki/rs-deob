import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class145 {

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[S")
    public short[] field2705;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[Lvf;")
    public class265[] field2702;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    public int[] field2699;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "[B")
    public byte[] field2704;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[S")
    public short[] field2709;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lvf;")
    public static class265 field2706 = class87.method582(-46, "null");

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lvf;")
    public static class265 field2714 = class87.method582(-46, ")4j");

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Z")
    public static boolean field2718;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)I")
    public final int method997(byte arg0, int arg1) {
        field2711++;
        int var3 = -45 % ((arg0 + 51) / 56);
        return this.field2704[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lvg;B)V")
    public static final void method998(class224 arg0, byte arg1) {
        if (arg1 != 118) {
            return;
        }
        arg0.field3993 = false;
        if (arg0.field3990 != null) {
            arg0.field3990.field2277 = 0;
        }
        field2717++;
        for (class224 var2 = arg0.method211(); var2 != null; var2 = arg0.method182()) {
            method998(var2, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method999(byte arg0) {
        field2706 = null;
        field2714 = null;
        if (arg0 < 102) {
            method999((byte) 73);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1000(int arg0) {
        if (class263.field4585 > 1) {
            class167.field3043 = class135.field2455;
            class263.field4585--;
        }
        field2703++;
        if (~class56.field1150 < arg0) {
            class56.field1150--;
        }
        if (class17.field473) {
            class17.field473 = false;
            class241.method1608((byte) -102);
            return;
        }
        for (int var1 = 0; var1 < 100 && class204.method1397(true); var1++) {
        }
        if (class246.field4281 != 30) {
            return;
        }
        class106.method711(class55.field1133, -5, 152);
        Object var2 = class201.field3600.field4597;
        synchronized (class201.field3600.field4597) {
            if (!class261.field4530) {
                class201.field3600.field4606 = 0;
            } else if (class141.field2620 != 0 || class201.field3600.field4606 >= 40) {
                class55.field1133.method1863(true, 176);
                class55.field1133.method903((byte) 36, 0);
                int var3 = class55.field1133.field2449;
                int var4 = 0;
                for (int var5 = 0; class201.field3600.field4606 > var5 && (class55.field1133.field2449 - var3) < 240; var5++) {
                    int var6 = class201.field3600.field4608[var5];
                    boolean var7 = false;
                    var4++;
                    int var8 = class201.field3600.field4607[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class201.field3600.field4608[var5] == -1 && class201.field3600.field4607[var5] == -1) {
                        var7 = true;
                        var6 = -1;
                        var8 = -1;
                    }
                    if (class56.field1142 != var8 || class138.field2528 != var6) {
                        int var9 = var8 - class56.field1142;
                        class56.field1142 = var8;
                        int var10 = var6 - class138.field2528;
                        class138.field2528 = var6;
                        if (class231.field4087 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class55.field1133.method921(98, (class231.field4087 << 12) + (var9 << 6) + var10);
                            class231.field4087 = 0;
                        } else if (class231.field4087 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            class55.field1133.method903((byte) 36, class231.field4087 + 128);
                            var10 += 128;
                            class55.field1133.method921(109, (var9 << 8) + var10);
                            class231.field4087 = 0;
                        } else if (class231.field4087 < 32) {
                            class55.field1133.method903((byte) 36, class231.field4087 + 192);
                            if (var7) {
                                class55.field1133.method898((byte) 126, Integer.MIN_VALUE);
                            } else {
                                class55.field1133.method898((byte) 103, var8 | var6 << 16);
                            }
                            class231.field4087 = 0;
                        } else {
                            class55.field1133.method921(106, class231.field4087 + 57344);
                            if (var7) {
                                class55.field1133.method898((byte) 91, Integer.MIN_VALUE);
                            } else {
                                class55.field1133.method898((byte) 90, var6 << 16 | var8);
                            }
                            class231.field4087 = 0;
                        }
                    } else if (class231.field4087 < 2047) {
                        class231.field4087++;
                    }
                }
                class6.field111++;
                class55.field1133.method926(arg0 - 128, -var3 + class55.field1133.field2449);
                if (class201.field3600.field4606 <= var4) {
                    class201.field3600.field4606 = 0;
                } else {
                    class201.field3600.field4606 -= var4;
                    for (int var11 = 0; var11 < class201.field3600.field4606; var11++) {
                        class201.field3600.field4607[var11] = class201.field3600.field4607[var11 + var4];
                        class201.field3600.field4608[var11] = class201.field3600.field4608[var4 + var11];
                    }
                }
            }
        }
        if (class141.field2620 != 0) {
            class69.field1312++;
            int var12 = class192.field3427;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            long var13 = (class143.field2663 - class167.field3041) / 50L;
            class167.field3041 = class143.field2663;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            byte var15 = 0;
            int var16 = class122.field2193;
            if (class141.field2620 == 2) {
                var15 = 1;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            class55.field1133.method1863(true, 140);
            class55.field1133.method921(97, var15 << 15 | var17);
            class55.field1133.method946((byte) 124, var16 | var12 << 16);
        }
        if (class62.field1224 > 0) {
            class62.field1224--;
        }
        if (class253.field4359) {
            for (int var18 = 0; var18 < class44.field966; var18++) {
                int var19 = class82.field1550[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class225.field3994 = true;
                    break;
                }
            }
        } else if (class69.field1311[96] || class69.field1311[97] || class69.field1311[98] || class69.field1311[99]) {
            class225.field3994 = true;
        }
        if (class225.field3994 && class62.field1224 <= 0) {
            class225.field3994 = false;
            class221.field3968++;
            class62.field1224 = 20;
            class55.field1133.method1863(true, 19);
            class55.field1133.method897(arg0 ^ 0xFFFFFF8F, class118.field2087);
            class55.field1133.method934(-30753, class79.field1500);
        }
        if (class87.field1589 && !class261.field4553) {
            class261.field4553 = true;
            class259.field4457++;
            class55.field1133.method1863(true, 63);
            class55.field1133.method903((byte) 36, 1);
        }
        if (!class87.field1589 && class261.field4553) {
            class259.field4457++;
            class261.field4553 = false;
            class55.field1133.method1863(true, 63);
            class55.field1133.method903((byte) 36, 0);
        }
        if (!class106.field1884) {
            class55.field1133.method1863(true, 106);
            class93.field1653++;
            class55.field1133.method946((byte) 127, class207.method1417((byte) 78));
            class106.field1884 = true;
        }
        class68.method488(arg0 ^ 0xFFFFFFE5);
        if (class246.field4281 != 30) {
            return;
        }
        class66.method476(25);
        class148.method1023((byte) 123);
        class198.field3545++;
        if (class198.field3545 > 750) {
            class241.method1608((byte) -74);
            return;
        }
        class137.method953(arg0);
        class19.method133(43);
        class56.method425(arg0 + 67);
        if (class186.field3365 != null) {
            class204.method1401(true);
        }
        for (int var20 = class79.method546(true, -1); var20 != -1; var20 = class79.method546(false, arg0)) {
            class134.method888((byte) 110, var20);
            class91.field1637[class203.method1395(class280.field4946++, 31)] = var20;
        }
        for (class178 var21 = class273.method1870((byte) -122); var21 != null; var21 = class273.method1870((byte) -122)) {
            int var22 = var21.method1159(255);
            int var23 = var21.method1157(arg0 ^ 0x8D8);
            if (var22 == 1) {
                class112.field1955[var23] = var21.field3172;
                class1.field22[class203.method1395(31, class171.field3094++)] = var23;
            } else if (var22 == 2) {
                class1.field7[var23] = var21.field3181;
                class182.field3225[class203.method1395(31, class216.field3895++)] = var23;
            } else if (var22 == 3) {
                class6 var24 = class21.method204(var23, -16257);
                if (!var21.field3181.method1776((byte) -125, var24.field103)) {
                    var24.field103 = var21.field3181;
                    class176.method1145((byte) -47, var24);
                }
            } else if (var22 == 4) {
                class6 var41 = class21.method204(var23, -16257);
                int var42 = var21.field3172;
                int var43 = var21.field3170;
                if (var41.field102 != var42 || var41.field222 != var43) {
                    var41.field222 = var43;
                    var41.field102 = var42;
                    class176.method1145((byte) -60, var41);
                }
            } else if (var22 == 5) {
                class6 var40 = class21.method204(var23, arg0 ^ 0x3F80);
                if (var21.field3172 != var40.field150 || var21.field3172 == -1) {
                    var40.field152 = 0;
                    var40.field150 = var21.field3172;
                    var40.field174 = 0;
                    class176.method1145((byte) 71, var40);
                }
            } else if (var22 == 6) {
                int var34 = var21.field3172;
                int var35 = var34 >> 10 & 0x1F;
                int var36 = var34 >> 5 & 0x1F;
                int var37 = var34 & 0x1F;
                int var38 = (var35 << 19) + (var36 << 11) + (var37 << 3);
                class6 var39 = class21.method204(var23, -16257);
                if (var39.field168 != var38) {
                    var39.field168 = var38;
                    class176.method1145((byte) 84, var39);
                }
            } else if (var22 == 7) {
                class6 var25 = class21.method204(var23, arg0 ^ 0x3F80);
                boolean var26 = var21.field3172 == 1;
                if (var25.field241 != var26) {
                    var25.field241 = var26;
                    class176.method1145((byte) 113, var25);
                }
            } else if (var22 == 8) {
                class6 var27 = class21.method204(var23, -16257);
                if (var21.field3172 != var27.field124 || var21.field3170 != var27.field123 || var21.field3171 != var27.field235) {
                    var27.field123 = var21.field3170;
                    var27.field235 = var21.field3171;
                    var27.field124 = var21.field3172;
                    if (var27.field167 != -1) {
                        if (var27.field232 > 0) {
                            var27.field235 = var27.field235 * 32 / var27.field232;
                        } else if (var27.field161 > 0) {
                            var27.field235 = var27.field235 * 32 / var27.field161;
                        }
                    }
                    class176.method1145((byte) -89, var27);
                }
            } else if (var22 == 9) {
                class6 var28 = class21.method204(var23, arg0 - 16256);
                if (var21.field3172 != var28.field167 || var21.field3170 != var28.field148) {
                    var28.field148 = var21.field3170;
                    var28.field167 = var21.field3172;
                    class176.method1145((byte) -120, var28);
                }
            } else if (var22 == 10) {
                class6 var33 = class21.method204(var23, -16257);
                if (var21.field3172 != var33.field132 || var21.field3170 != var33.field178 || var21.field3171 != var33.field77) {
                    var33.field132 = var21.field3172;
                    var33.field178 = var21.field3170;
                    var33.field77 = var21.field3171;
                    class176.method1145((byte) -78, var33);
                }
            } else if (var22 == 11) {
                class6 var29 = class21.method204(var23, arg0 - 16256);
                var29.field204 = var29.field216 = var21.field3170;
                var29.field153 = var29.field87 = var21.field3172;
                var29.field79 = 0;
                var29.field184 = 0;
                class176.method1145((byte) 53, var29);
            } else if (var22 == 12) {
                class6 var31 = class21.method204(var23, -16257);
                int var32 = var21.field3172;
                if (var31 != null && var31.field187 == 0) {
                    if (var32 > var31.field195 - var31.field84) {
                        var32 = var31.field195 - var31.field84;
                    }
                    if (var32 < 0) {
                        var32 = 0;
                    }
                    if (var31.field193 != var32) {
                        var31.field193 = var32;
                        class176.method1145((byte) -41, var31);
                    }
                }
            } else if (var22 == 13) {
                class6 var30 = class21.method204(var23, -16257);
                var30.field244 = var21.field3172;
            }
        }
        class84.field1572++;
        if (class141.field2615 != 0) {
            class277.field4905 += 20;
            if (class277.field4905 >= 400) {
                class141.field2615 = 0;
            }
        }
        if (class163.field2970 != null) {
            class127.field2265++;
            if (class127.field2265 >= 15) {
                class176.method1145((byte) -116, class163.field2970);
                class163.field2970 = null;
            }
        }
        if (class218.field3927 != null) {
            class176.method1145((byte) -117, class218.field3927);
            class137.field2494++;
            if ((class25.field692 + 5) < class79.field1497 || (class25.field692 - 5) > class79.field1497 || class272.field4832 + 5 < class268.field4722 || class268.field4722 < (class272.field4832 - 5)) {
                class77.field1474 = true;
            }
            if (class232.field4102 == 0) {
                if (class77.field1474 && class137.field2494 >= 5) {
                    if (class218.field3927 == class133.field2402 && class4.field57 != class208.field3747) {
                        class71.field1363++;
                        class6 var44 = class218.field3927;
                        byte var45 = 0;
                        if (class1.field21 == 1 && var44.field146 == 206) {
                            var45 = 1;
                        }
                        if (var44.field92[class4.field57] <= 0) {
                            var45 = 0;
                        }
                        if (class119.method800((byte) -39, client.method1474(var44))) {
                            int var46 = class208.field3747;
                            int var47 = class4.field57;
                            var44.field92[var47] = var44.field92[var46];
                            var44.field218[var47] = var44.field218[var46];
                            var44.field92[var46] = -1;
                            var44.field218[var46] = 0;
                        } else if (var45 == 1) {
                            int var48 = class4.field57;
                            int var49 = class208.field3747;
                            while (var48 != var49) {
                                if (var48 < var49) {
                                    var44.method38(var49 - 1, var49, 122);
                                    var49--;
                                } else if (var49 < var48) {
                                    var44.method38(var49 + 1, var49, arg0 ^ 0xFFFFFF85);
                                    var49++;
                                }
                            }
                        } else {
                            var44.method38(class4.field57, class208.field3747, 102);
                        }
                        class55.field1133.method1863(true, 200);
                        class55.field1133.method935(class208.field3747, arg0 - 1);
                        class55.field1133.method919(-1, class218.field3927.field219);
                        class55.field1133.method934(arg0 - 30752, class4.field57);
                        class55.field1133.method892(13966, var45);
                    }
                } else if ((class143.field2659 == 1 || class195.method1349(class120.field2129 - 1, 31955)) && class120.field2129 > 2) {
                    class163.method1080((byte) 90);
                } else if (class120.field2129 > 0) {
                    class267.method1820(false);
                }
                class218.field3927 = null;
                class141.field2620 = 0;
                class127.field2265 = 10;
            }
        }
        class44.field966 = 0;
        class26.field707 = null;
        class6 var50 = class44.field967;
        class6 var51 = class232.field4094;
        class252.field4341 = false;
        class232.field4094 = null;
        class30.field751 = false;
        class44.field967 = null;
        while (class91.method624(false) && class44.field966 < 128) {
            class82.field1550[class44.field966] = class130.field2344;
            class169.field3060[class44.field966] = class239.field4172;
            class44.field966++;
        }
        class186.field3365 = null;
        if (class8.field271 != -1) {
            class260.method1729(-1, 0, 0, class26.field706, class50.field1053, 0, 0, class8.field271);
        }
        class135.field2455++;
        while (true) {
            class277 var52;
            class6 var53;
            class6 var54;
            do {
                var52 = (class277) class126.field2249.method793(37);
                if (var52 == null) {
                    while (true) {
                        class277 var55;
                        class6 var56;
                        class6 var57;
                        do {
                            var55 = (class277) class167.field3029.method793(37);
                            if (var55 == null) {
                                while (true) {
                                    class277 var58;
                                    class6 var59;
                                    class6 var60;
                                    do {
                                        var58 = (class277) class64.field1245.method793(37);
                                        if (var58 == null) {
                                            if (class9.field292 && class186.field3365 == null) {
                                                class9.field292 = false;
                                            }
                                            if (class207.field3722 != null) {
                                                class261.method1749(0);
                                            }
                                            if (class30.field773 > 0 && class69.field1311[82] && class69.field1311[81] && class16.field463 != 0) {
                                                int var61 = class216.field3902 - class16.field463;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class107.method715(class64.field1248 + class214.field3827.field2536[0], class231.field4073 - -class214.field3827.field2575[0], (byte) -104, var61);
                                            }
                                            if (class30.field773 > 0 && class69.field1311[82] && class69.field1311[81]) {
                                                if (class127.field2267 != -1) {
                                                    class107.method715(class64.field1248 + class127.field2267, class231.field4073 + class179.field3183, (byte) -114, class216.field3902);
                                                }
                                                class58.field1179 = 0;
                                                class106.field1872 = 0;
                                            } else if (class106.field1872 == 2) {
                                                if (class127.field2267 != -1) {
                                                    class75.field1444++;
                                                    class55.field1133.method1863(true, 205);
                                                    class55.field1133.method934(-30753, class26.field703);
                                                    class55.field1133.method921(112, class231.field4073 + class179.field3183);
                                                    class55.field1133.method919(120, class192.field3457);
                                                    class55.field1133.method897(77, class64.field1248 + class127.field2267);
                                                    class141.field2615 = 1;
                                                    class277.field4905 = 0;
                                                    class162.field2944 = class122.field2193;
                                                    class95.field1681 = class192.field3427;
                                                }
                                                class106.field1872 = 0;
                                            } else if (class58.field1179 == 2) {
                                                if (class127.field2267 != -1) {
                                                    class166.field2994++;
                                                    class55.field1133.method1863(true, 48);
                                                    class55.field1133.method935(class231.field4073 + class179.field3183, arg0 ^ 0x1);
                                                    class55.field1133.method935(class64.field1248 + class127.field2267, -2);
                                                    class141.field2615 = 1;
                                                    class162.field2944 = class122.field2193;
                                                    class95.field1681 = class192.field3427;
                                                    class277.field4905 = 0;
                                                }
                                                class58.field1179 = 0;
                                            } else if (class127.field2267 != -1 && class106.field1872 == 0 && class58.field1179 == 0) {
                                                boolean var62 = class217.method1496(0, class179.field3183, class214.field3827.field2536[0], arg0 + 10397, 0, true, 0, 0, 0, 0, class214.field3827.field2575[0], class127.field2267);
                                                if (var62) {
                                                    class162.field2944 = class122.field2193;
                                                    class95.field1681 = class192.field3427;
                                                    class277.field4905 = 0;
                                                    class141.field2615 = 1;
                                                }
                                            }
                                            class127.field2267 = -1;
                                            class221.method1511((byte) 100);
                                            if (class44.field967 != var50) {
                                                if (var50 != null) {
                                                    class176.method1145((byte) -73, var50);
                                                }
                                                if (class44.field967 != null) {
                                                    class176.method1145((byte) 63, class44.field967);
                                                }
                                            }
                                            if (class232.field4094 != var51 && class84.field1569 == class238.field4166) {
                                                if (var51 != null) {
                                                    class176.method1145((byte) 63, var51);
                                                }
                                                if (class232.field4094 != null) {
                                                    class176.method1145((byte) 123, class232.field4094);
                                                }
                                            }
                                            if (class232.field4094 == null) {
                                                if (class238.field4166 > 0) {
                                                    class238.field4166--;
                                                }
                                            } else if (class84.field1569 > class238.field4166) {
                                                class238.field4166++;
                                                if (class84.field1569 == class238.field4166) {
                                                    class176.method1145((byte) 96, class232.field4094);
                                                }
                                            }
                                            if (class254.field4361 == 1) {
                                                class36.method306((byte) -122);
                                            } else if (class254.field4361 == 2) {
                                                class148.method1019(arg0 - 85);
                                            } else {
                                                class65.method468((byte) -109);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class172.field3096[var63]++;
                                            }
                                            int var64 = class196.method1358(arg0 ^ 0x74);
                                            int var65 = class131.method870((byte) 87);
                                            if (var64 > 15000 && var65 > 15000) {
                                                class4.field56++;
                                                class56.field1150 = 250;
                                                class269.method1843(14500, 25245);
                                                class55.field1133.method1863(true, 179);
                                            }
                                            if (class119.field2106 != null && class119.field2106.field1996 == 1) {
                                                if (class119.field2106.field1997 != null) {
                                                    class105.method703((byte) -121, class10.field340, class236.field4126);
                                                }
                                                class119.field2106 = null;
                                                class236.field4126 = null;
                                                class10.field340 = false;
                                            }
                                            class13.field418++;
                                            class147.field2742++;
                                            class143.field2680++;
                                            if (class147.field2742 > 500) {
                                                class147.field2742 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class186.field3364 += class96.field1691;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class93.field1648 += class116.field2048;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class277.field4897 += class39.field906;
                                                }
                                            }
                                            if (class13.field418 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class13.field418 = 0;
                                                if ((var67 & 0x2) == 2) {
                                                    class39.field908 += class219.field3954;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class122.field2180 += class107.field1891;
                                                }
                                            }
                                            if (class39.field908 < -20) {
                                                class219.field3954 = 1;
                                            }
                                            if (class186.field3364 < -50) {
                                                class96.field1691 = 2;
                                            }
                                            if (class39.field908 > 10) {
                                                class219.field3954 = -1;
                                            }
                                            if (class93.field1648 < -40) {
                                                class116.field2048 = 1;
                                            }
                                            if (class93.field1648 > 40) {
                                                class116.field2048 = -1;
                                            }
                                            if (class186.field3364 > 50) {
                                                class96.field1691 = -2;
                                            }
                                            if (class277.field4897 < -55) {
                                                class39.field906 = 2;
                                            }
                                            if (class122.field2180 < -60) {
                                                class107.field1891 = 2;
                                            }
                                            if (class277.field4897 > 55) {
                                                class39.field906 = -2;
                                            }
                                            if (class122.field2180 > 60) {
                                                class107.field1891 = -2;
                                            }
                                            if (class143.field2680 > 50) {
                                                class55.field1133.method1863(true, 252);
                                                class183.field3249++;
                                            }
                                            if (class36.field838) {
                                                class63.method463(-127);
                                                class36.field838 = false;
                                            }
                                            try {
                                                if (class197.field3520 != null && class55.field1133.field2449 > 0) {
                                                    class197.field3520.method982(0, true, class55.field1133.field2483, class55.field1133.field2449);
                                                    class55.field1133.field2449 = 0;
                                                    class143.field2680 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class241.method1608((byte) -83);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4901;
                                        if (var59.field233 < 0) {
                                            break;
                                        }
                                        var60 = class21.method204(var59.field142, -16257);
                                    } while (var60 == null || var60.field160 == null || var59.field233 >= var60.field160.length || var60.field160[var59.field233] != var59);
                                    class192.method1318(var58, 200000);
                                }
                            }
                            var56 = var55.field4901;
                            if (var56.field233 < 0) {
                                break;
                            }
                            var57 = class21.method204(var56.field142, -16257);
                        } while (var57 == null || var57.field160 == null || var57.field160.length <= var56.field233 || var57.field160[var56.field233] != var56);
                        class192.method1318(var55, 200000);
                    }
                }
                var53 = var52.field4901;
                if (var53.field233 < 0) {
                    break;
                }
                var54 = class21.method204(var53.field142, -16257);
            } while (var54 == null || var54.field160 == null || var53.field233 >= var54.field160.length || var54.field160[var53.field233] != var53);
            class192.method1318(var52, 200000);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method1001(boolean arg0, byte[] arg1, boolean arg2) {
        field2715++;
        if (arg1 == null) {
            return null;
        } else if (arg2) {
            if (arg1.length > 136 && !class171.field3089) {
                try {
                    class225 var3 = (class225) Class.forName("wc").getDeclaredConstructor().newInstance();
                    var3.method577(arg1, 84);
                    return var3;
                } catch (Throwable var4) {
                    class171.field3089 = true;
                }
            }
            return arg0 ? class75.method533(arg1, 0) : arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)Z")
    public final boolean method1002(int arg0, boolean arg1) {
        if (arg1) {
            this.field2699 = null;
        }
        field2708++;
        return (this.field2704[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)Z")
    public final boolean method1003(boolean arg0, int arg1) {
        if (arg0) {
            this.field2709 = null;
        }
        field2712++;
        return (this.field2704[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Llj;")
    public static final class39 method1004(int arg0, int arg1) {
        field2707++;
        class39 var2 = (class39) class262.field4579.method1424((long) arg0, (byte) 98);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 14015) {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class17.field480.method1332(true, arg0, 1);
            } else {
                var3 = class219.field3956.method1332(true, arg0 & 0x7FFF, 1);
            }
            class39 var4 = new class39();
            if (var3 != null) {
                var4.method319(arg1 - 14015, new class135(var3));
            }
            if (arg0 >= 32768) {
                var4.method327(106);
            }
            class262.field4579.method1419(0, (long) arg0, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(ZI)Z")
    public final boolean method1005(boolean arg0, int arg1) {
        if (arg0) {
            this.field2704 = null;
        }
        field2716++;
        return (this.field2704[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I)V")
    public class145(int arg0) {
        this.field2713 = arg0;
        this.field2705 = new short[this.field2713];
        this.field2702 = new class265[this.field2713];
        this.field2699 = new int[this.field2713];
        this.field2704 = new byte[this.field2713];
        this.field2709 = new short[this.field2713];
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static final void method1006(boolean arg0) {
        if (arg0) {
            field2714 = null;
        }
        field2710++;
        class207.field3730.method1866(8);
        int var1 = class207.field3730.method1867(1, 8);
        if (var1 == 0) {
            return;
        }
        int var2 = class207.field3730.method1867(2, 8);
        if (var2 == 0) {
            class279.field4928[class131.field2376++] = 2047;
        } else if (var2 == 1) {
            int var3 = class207.field3730.method1867(3, 8);
            class214.field3827.method966((byte) -28, var3, false);
            int var4 = class207.field3730.method1867(1, 8);
            if (var4 == 1) {
                class279.field4928[class131.field2376++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class207.field3730.method1867(3, 8);
            class214.field3827.method966((byte) -28, var5, true);
            int var6 = class207.field3730.method1867(3, 8);
            class214.field3827.method966((byte) -28, var6, true);
            int var7 = class207.field3730.method1867(1, 8);
            if (var7 == 1) {
                class279.field4928[class131.field2376++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class207.field3730.method1867(7, 8);
            int var9 = class207.field3730.method1867(1, 8);
            if (var9 == 1) {
                class279.field4928[class131.field2376++] = 2047;
            }
            int var10 = class207.field3730.method1867(1, 8);
            int var11 = class207.field3730.method1867(7, 8);
            class216.field3902 = class207.field3730.method1867(2, 8);
            class214.field3827.method823(19, var11, var8, var10 == 1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(ZI)V")
    public static final void method1007(boolean arg0, int arg1) {
        class182.field3245 = null;
        class120.field2130 = null;
        class254.field4373 = null;
        if (arg0 && class181.field3211 != null) {
            class219.field3935 = class181.field3211.field410;
        } else {
            class219.field3935 = null;
        }
        class186.field3365 = null;
        if (arg1 != 179) {
            return;
        }
        class166.field3007 = null;
        class172.field3112 = null;
        class61.field1216 = null;
        class177.field3162 = null;
        field2698++;
        class18.field493 = null;
        class181.field3211 = null;
        class72.field1369 = null;
        class103.field1830 = 0;
        class258.field4429.method791(arg1 - 121);
        class100.field1781 = null;
        class126.field2260 = null;
        class95.field1680 = null;
        class201.field3603 = null;
        class121.field2135 = null;
        class208.field3755 = null;
        class160.field2934 = null;
        class174.field3125 = -1;
        class246.field4277 = null;
        class257.field4396 = null;
        class214.field3837 = null;
        class36.field842 = -1;
    }
}
