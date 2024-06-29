import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class35 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field499 = 0;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field502 = -1;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field505 = -1;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field503 = 0;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public int field514 = 0;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public int field517 = 0;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field512 = 0;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field511 = 0;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field519 = -1;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public int field513 = 0;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field500 = 0;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public int field523 = -1;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public int field524 = -1;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public int field515 = -1;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public int field521 = -1;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public int field518 = -1;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public int field516 = 0;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field506 = -1;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field501 = -1;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public int field509 = -1;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public int field526 = -1;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public int field531 = -1;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public int field508 = -1;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public int field529 = -1;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public int field530 = -1;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public int field522 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
    public static int[] field498 = new int[200];

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field504 = 0;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field525 = 0;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "[[I")
    public int[][] field520;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method242(int arg0) {
        if (arg0 > -113) {
            method242(124);
        }
        field498 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static final void method243(int arg0) {
        if (class234.field3536 > 1) {
            class108.field1559 = class213.field3063;
            class234.field3536--;
        }
        if (class257.field3898 > 0) {
            class257.field3898--;
        }
        field507++;
        if (class148.field2109) {
            class148.field2109 = false;
            class259.method1736((byte) -13);
            return;
        }
        for (int var1 = 0; var1 < 100 && class258.method1732(-121); var1++) {
        }
        if (class192.field2754 != 30) {
            return;
        }
        class225.method1468(-103, class95.field1451, 227);
        Object var2 = class124.field1807.field1896;
        synchronized (class124.field1807.field1896) {
            if (!class103.field1533) {
                class124.field1807.field1903 = 0;
            } else if (class200.field2894 != 0 || class124.field1807.field1903 >= 40) {
                class282.field4499++;
                class95.field1451.method522(148, 28727);
                class95.field1451.method775(0, -127);
                int var3 = class95.field1451.field1673;
                int var4 = 0;
                for (int var5 = 0; var5 < class124.field1807.field1903 && class95.field1451.field1673 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class124.field1807.field1901[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class124.field1807.field1902[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class124.field1807.field1902[var5] == -1 && class124.field1807.field1901[var5] == -1) {
                        var7 = true;
                        var8 = -1;
                        var6 = -1;
                    }
                    if (class205.field2968 != var6 || class114.field1672 != var8) {
                        int var9 = var6 - class205.field2968;
                        class205.field2968 = var6;
                        int var10 = var8 - class114.field1672;
                        class114.field1672 = var8;
                        if (class234.field3535 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class95.field1451.method794((class234.field3535 << 12) + (var9 << 6) + var10, (byte) -25);
                            class234.field3535 = 0;
                        } else if (class234.field3535 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class95.field1451.method775(class234.field3535 + 128, -111);
                            class95.field1451.method794((var9 << 8) + var10, (byte) -103);
                            class234.field3535 = 0;
                        } else if (class234.field3535 < 32) {
                            class95.field1451.method775(class234.field3535 + 192, arg0 + -31446);
                            if (var7) {
                                class95.field1451.method737(-2645, Integer.MIN_VALUE);
                            } else {
                                class95.field1451.method737(-2645, var8 << 16 | var6);
                            }
                            class234.field3535 = 0;
                        } else {
                            class95.field1451.method794(class234.field3535 + 57344, (byte) -26);
                            if (var7) {
                                class95.field1451.method737(arg0 ^ 0xFFFF8FF4, Integer.MIN_VALUE);
                            } else {
                                class95.field1451.method737(-2645, var6 | var8 << 16);
                            }
                            class234.field3535 = 0;
                        }
                    } else if (class234.field3535 < 2047) {
                        class234.field3535++;
                    }
                }
                class95.field1451.method743(class95.field1451.field1673 - var3, (byte) 57);
                if (var4 < class124.field1807.field1903) {
                    class124.field1807.field1903 -= var4;
                    for (int var11 = 0; var11 < class124.field1807.field1903; var11++) {
                        class124.field1807.field1901[var11] = class124.field1807.field1901[var4 + var11];
                        class124.field1807.field1902[var11] = class124.field1807.field1902[var11 + var4];
                    }
                } else {
                    class124.field1807.field1903 = 0;
                }
            }
        }
        if (class200.field2894 != 0) {
            class25.field338++;
            long var12 = (class31.field461 - class28.field409) / 50L;
            class28.field409 = class31.field461;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class42.field602;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class279.field4465;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            int var17 = (int) var12;
            if (class200.field2894 == 2) {
                var16 = 1;
            }
            class95.field1451.method522(247, 28727);
            class95.field1451.method737(-2645, var14 << 16 | var15);
            class95.field1451.method794(var17 | var16 << 15, (byte) -95);
        }
        if (class57.field883 > 0) {
            class57.field883--;
        }
        if (class107.field1555) {
            for (int var18 = 0; var18 < class277.field4444; var18++) {
                int var19 = class185.field2637[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class185.field2644 = true;
                    break;
                }
            }
        } else if (class19.field267[96] || class19.field267[97] || class19.field267[98] || class19.field267[99]) {
            class185.field2644 = true;
        }
        if (class185.field2644 && class57.field883 <= 0) {
            class183.field2612++;
            class185.field2644 = false;
            class57.field883 = 20;
            class95.field1451.method522(181, 28727);
            class95.field1451.method784(true, class245.field3667);
            class95.field1451.method794(class103.field1535, (byte) -92);
        }
        if (class162.field2347 && !class145.field2074) {
            class145.field2074 = true;
            class95.field1451.method522(171, arg0 - 2600);
            class95.field1451.method775(1, -127);
            class250.field3824++;
        }
        if (!class162.field2347 && class145.field2074) {
            class145.field2074 = false;
            class250.field3824++;
            class95.field1451.method522(171, 28727);
            class95.field1451.method775(0, -116);
        }
        if (!class15.field229) {
            class95.field1451.method522(72, 28727);
            class95.field1451.method773(class54.method360(arg0 ^ 0x8D0FA0CF), 0);
            class15.field229 = true;
            class7.field148++;
        }
        class168.method1115((byte) 88);
        if (class192.field2754 != 30) {
            return;
        }
        class56.method381((byte) 20);
        class222.method1446(true);
        class184.method1187(17604);
        class21.field283++;
        if (class21.field283 > 750) {
            class259.method1736((byte) -13);
            return;
        }
        class280.method1887((byte) -113);
        class142.method942(3);
        class108.method711(-33);
        if (class204.field2952 != null) {
            class151.method1019(-25344);
        }
        for (int var20 = method245(true, true); var20 != -1; var20 = method245(false, true)) {
            class97.method658(7272, var20);
            class284.field4527[class184.method1188(31, class115.field1703++)] = var20;
        }
        for (class270 var21 = class52.method347(0); var21 != null; var21 = class52.method347(0)) {
            int var22 = var21.method1811(255);
            int var23 = var21.method1809((byte) -15);
            if (var22 == 1) {
                class210.field3026[var23] = var21.field4226;
                class23.field295[class184.method1188(class286.field4542++, 31)] = var23;
            } else if (var22 == 2) {
                class233.field3487[var23] = var21.field4222;
                class111.field1599[class184.method1188(31, class128.field1885++)] = var23;
            } else if (var22 == 3) {
                class267 var44 = class282.method1897(var23, 63);
                if (!var21.field4222.equals(var44.field4156)) {
                    var44.field4156 = var21.field4222;
                    class217.method1396(false, var44);
                }
            } else if (var22 == 4) {
                class267 var24 = class282.method1897(var23, arg0 ^ 0x7A60);
                int var25 = var21.field4226;
                int var26 = var21.field4230;
                int var27 = var21.field4233;
                if (var24.field4057 != var25 || var24.field4038 != var26 || var24.field4165 != var27) {
                    var24.field4165 = var27;
                    var24.field4038 = var26;
                    var24.field4057 = var25;
                    class217.method1396(false, var24);
                }
            } else if (var22 == 5) {
                class267 var28 = class282.method1897(var23, 83);
                if (var21.field4226 != var28.field4120 || var21.field4226 == -1) {
                    var28.field4115 = 0;
                    var28.field4126 = 0;
                    var28.field4190 = 1;
                    var28.field4120 = var21.field4226;
                    class217.method1396(false, var28);
                }
            } else if (var22 == 6) {
                int var38 = var21.field4226;
                int var39 = var38 >> 10 & 0x1F;
                class267 var40 = class282.method1897(var23, 85);
                int var41 = (var38 & 0x3E7) >> 5;
                int var42 = var38 & 0x1F;
                int var43 = (var42 << 3) + (var39 << 19) + (var41 << 11);
                if (var40.field4084 != var43) {
                    var40.field4084 = var43;
                    class217.method1396(false, var40);
                }
            } else if (var22 == 7) {
                class267 var36 = class282.method1897(var23, 103);
                boolean var37 = var21.field4226 == 1;
                if (var36.field4023 != var37) {
                    var36.field4023 = var37;
                    class217.method1396(false, var36);
                }
            } else if (var22 == 8) {
                class267 var29 = class282.method1897(var23, 58);
                if (var21.field4226 != var29.field4097 || var21.field4230 != var29.field4155 || var21.field4233 != var29.field4135) {
                    var29.field4135 = var21.field4233;
                    var29.field4155 = var21.field4230;
                    if (var29.field4185 != -1) {
                        if (var29.field4123 > 0) {
                            var29.field4135 = var29.field4135 * 32 / var29.field4123;
                        } else if (var29.field4187 > 0) {
                            var29.field4135 = var29.field4135 * 32 / var29.field4187;
                        }
                    }
                    var29.field4097 = var21.field4226;
                    class217.method1396(false, var29);
                }
            } else if (var22 == 9) {
                class267 var35 = class282.method1897(var23, 72);
                if (var21.field4226 != var35.field4185 || var21.field4230 != var35.field4100) {
                    var35.field4185 = var21.field4226;
                    var35.field4100 = var21.field4230;
                    class217.method1396(false, var35);
                }
            } else if (var22 == 10) {
                class267 var34 = class282.method1897(var23, 115);
                if (var21.field4226 != var34.field4041 || var21.field4230 != var34.field4076 || var21.field4233 != var34.field4054) {
                    var34.field4054 = var21.field4233;
                    var34.field4076 = var21.field4230;
                    var34.field4041 = var21.field4226;
                    class217.method1396(false, var34);
                }
            } else if (var22 == 11) {
                class267 var30 = class282.method1897(var23, 80);
                var30.field4035 = var30.field4153 = var21.field4230;
                var30.field4173 = var30.field4062 = var21.field4226;
                var30.field4112 = 0;
                var30.field4080 = 0;
                class217.method1396(false, var30);
            } else if (var22 == 12) {
                class267 var31 = class282.method1897(var23, arg0 ^ 0x7A35);
                int var32 = var21.field4226;
                if (var31 != null && var31.field4149 == 0) {
                    if (var31.field4134 - var31.field4051 < var32) {
                        var32 = var31.field4134 - var31.field4051;
                    }
                    if (var32 < 0) {
                        var32 = 0;
                    }
                    if (var31.field4140 != var32) {
                        var31.field4140 = var32;
                        class217.method1396(false, var31);
                    }
                }
            } else if (var22 == 13) {
                class267 var33 = class282.method1897(var23, 85);
                var33.field4162 = var21.field4226;
            }
        }
        if (class290.field4582 != 0) {
            class107.field1550 += 20;
            if (class107.field1550 >= 400) {
                class290.field4582 = 0;
            }
        }
        class38.field566++;
        if (class114.field1694 != null) {
            class69.field1086++;
            if (class69.field1086 >= 15) {
                class217.method1396(false, class114.field1694);
                class114.field1694 = null;
            }
        }
        if (class16.field235 != null) {
            class217.method1396(false, class16.field235);
            if (class57.field874 + 5 < class25.field345 || class25.field345 < class57.field874 - 5 || class190.field2688 > (class262.field3947 + 5) || class262.field3947 - 5 > class190.field2688) {
                class12.field188 = true;
            }
            class213.field3055++;
            if (class137.field1987 == 0) {
                if (class12.field188 && class213.field3055 >= 5) {
                    if (class16.field235 == class141.field2034 && class246.field3678 != class234.field3524) {
                        class237.field3565++;
                        byte var45 = 0;
                        class267 var46 = class16.field235;
                        if (class121.field1764 == 1 && var46.field4104 == 206) {
                            var45 = 1;
                        }
                        if (var46.field4107[class246.field3678] <= 0) {
                            var45 = 0;
                        }
                        if (client.method1439(var46).method629((byte) -121)) {
                            int var49 = class246.field3678;
                            int var50 = class234.field3524;
                            var46.field4107[var49] = var46.field4107[var50];
                            var46.field4172[var49] = var46.field4172[var50];
                            var46.field4107[var50] = -1;
                            var46.field4172[var50] = 0;
                        } else if (var45 == 1) {
                            int var47 = class234.field3524;
                            int var48 = class246.field3678;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var46.method1779(121, var47, var47 - 1);
                                    var47--;
                                } else if (var48 > var47) {
                                    var46.method1779(110, var47, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var46.method1779(116, class234.field3524, class246.field3678);
                        }
                        class95.field1451.method522(228, 28727);
                        class95.field1451.method794(class234.field3524, (byte) -103);
                        class95.field1451.method761(-123, class246.field3678);
                        class95.field1451.method771(var45, arg0 - 31328);
                        class95.field1451.method764(19753, class16.field235.field4113);
                    }
                } else if ((class250.field3787 == 1 || class76.method506(class283.field4508 - 1, (byte) 73)) && class283.field4508 > 2) {
                    class7.method76(0);
                } else if (class283.field4508 > 0) {
                    class26.method195(127);
                }
                class69.field1086 = 10;
                class200.field2894 = 0;
                class16.field235 = null;
            }
        }
        class277.field4444 = 0;
        class219.field3229 = false;
        class267 var51 = class250.field3790;
        class250.field3790 = null;
        class231.field3453 = null;
        class267 var52 = class15.field221;
        class70.field1091 = false;
        class15.field221 = null;
        while (class71.method483(1) && class277.field4444 < 128) {
            class185.field2637[class277.field4444] = class7.field152;
            class141.field2044[class277.field4444] = class247.field3692;
            class277.field4444++;
        }
        class204.field2952 = null;
        if (class193.field2774 != -1) {
            class247.method1622(class250.field3813, class193.field2774, 0, 0, 0, 0, class214.field3080, (byte) 78);
        }
        class213.field3063++;
        while (true) {
            class234 var53;
            class267 var54;
            class267 var55;
            do {
                var53 = (class234) class9.field165.method653((byte) 106);
                if (var53 == null) {
                    while (true) {
                        class234 var56;
                        class267 var57;
                        class267 var58;
                        do {
                            var56 = (class234) class225.field3385.method653((byte) 127);
                            if (var56 == null) {
                                if (arg0 != 31327) {
                                    return;
                                }
                                while (true) {
                                    class234 var59;
                                    class267 var60;
                                    class267 var61;
                                    do {
                                        var59 = (class234) class255.field3873.method653((byte) 106);
                                        if (var59 == null) {
                                            if (class204.field2952 == null) {
                                                class193.field2766 = 0;
                                            }
                                            if (class273.field4357 != null) {
                                                class86.method592(arg0 ^ 0x7460);
                                            }
                                            if (class270.field4228 > 0 && class19.field267[82] && class19.field267[81] && class204.field2959 != 0) {
                                                int var62 = class163.field2364 - class204.field2959;
                                                if (var62 < 0) {
                                                    var62 = 0;
                                                } else if (var62 > 3) {
                                                    var62 = 3;
                                                }
                                                class281.method1896(class55.field847.field50[0] + class95.field1445, var62, class55.field847.field119[0] + class113.field1615, 90);
                                            }
                                            if (class270.field4228 > 0 && class19.field267[82] && class19.field267[81]) {
                                                if (class17.field245 != -1) {
                                                    class281.method1896(class95.field1445 + class183.field2618, class163.field2364, class17.field245 + class113.field1615, 5);
                                                }
                                                class99.field1487 = 0;
                                                class203.field2940 = 0;
                                            } else if (class203.field2940 == 2) {
                                                if (class17.field245 != -1) {
                                                    class95.field1451.method522(69, 28727);
                                                    class156.field2276++;
                                                    class95.field1451.method737(-2645, class172.field2462);
                                                    class95.field1451.method761(-120, class102.field1511);
                                                    class95.field1451.method784(true, class95.field1445 + class183.field2618);
                                                    class95.field1451.method794(class17.field245 + class113.field1615, (byte) -106);
                                                    class270.field4236 = class279.field4465;
                                                    class65.field1021 = class42.field602;
                                                    class290.field4582 = 1;
                                                    class107.field1550 = 0;
                                                }
                                                class203.field2940 = 0;
                                            } else if (class99.field1487 == 2) {
                                                if (class17.field245 != -1) {
                                                    class95.field1451.method522(32, arg0 ^ 0xA68);
                                                    class7.field143++;
                                                    class95.field1451.method761(-121, class17.field245 + class113.field1615);
                                                    class95.field1451.method738(class95.field1445 + class183.field2618, (byte) 67);
                                                    class270.field4236 = class279.field4465;
                                                    class107.field1550 = 0;
                                                    class65.field1021 = class42.field602;
                                                    class290.field4582 = 1;
                                                }
                                                class99.field1487 = 0;
                                            } else if (class17.field245 != -1 && class203.field2940 == 0 && class99.field1487 == 0) {
                                                boolean var63 = class193.method1241(class55.field847.field50[0], class17.field245, 0, 0, false, class55.field847.field119[0], true, 0, 0, 0, class183.field2618, 0);
                                                if (var63) {
                                                    class270.field4236 = class279.field4465;
                                                    class290.field4582 = 1;
                                                    class107.field1550 = 0;
                                                    class65.field1021 = class42.field602;
                                                }
                                            }
                                            class17.field245 = -1;
                                            class103.method688(-46);
                                            if (class250.field3790 != var51) {
                                                if (var51 != null) {
                                                    class217.method1396(false, var51);
                                                }
                                                if (class250.field3790 != null) {
                                                    class217.method1396(false, class250.field3790);
                                                }
                                            }
                                            if (class15.field221 != var52 && class261.field3943 == class222.field3312) {
                                                if (var52 != null) {
                                                    class217.method1396(false, var52);
                                                }
                                                if (class15.field221 != null) {
                                                    class217.method1396(false, class15.field221);
                                                }
                                            }
                                            if (class15.field221 == null) {
                                                if (class222.field3312 > 0) {
                                                    class222.field3312--;
                                                }
                                            } else if (class222.field3312 < class261.field3943) {
                                                class222.field3312++;
                                                if (class261.field3943 == class222.field3312) {
                                                    class217.method1396(false, class15.field221);
                                                }
                                            }
                                            if (class68.field1069 == 1) {
                                                class187.method1207(31253);
                                            } else if (class68.field1069 == 2) {
                                                class53.method355((byte) -111);
                                            } else {
                                                class153.method1036(2);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class194.field2780[var64]++;
                                            }
                                            int var65 = class138.method926(true);
                                            int var66 = class264.method1756(412);
                                            if (var65 > 15000 && var66 > 15000) {
                                                class82.field1265++;
                                                class257.field3898 = 250;
                                                class190.method1220((byte) 67, 14500);
                                                class95.field1451.method522(214, arg0 - 2600);
                                            }
                                            if (class184.field2631 != null && class184.field2631.field3588 == 1) {
                                                if (class184.field2631.field3585 != null) {
                                                    class114.method788((byte) -37, class211.field3032, class96.field1457);
                                                }
                                                class184.field2631 = null;
                                                class96.field1457 = null;
                                                class211.field3032 = false;
                                            }
                                            class94.field1435++;
                                            class43.field617++;
                                            class200.field2883++;
                                            if (class43.field617 > 500) {
                                                class43.field617 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x4) == 4) {
                                                    class253.field3847 += class247.field3685;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class170.field2448 += class1.field18;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class247.field3706 += class170.field2447;
                                                }
                                            }
                                            if (class94.field1435 > 500) {
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class183.field2611 += class163.field2367;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class282.field4495 += class195.field2810;
                                                }
                                                class94.field1435 = 0;
                                            }
                                            if (class170.field2448 < -50) {
                                                class1.field18 = 2;
                                            }
                                            if (class282.field4495 < -20) {
                                                class195.field2810 = 1;
                                            }
                                            if (class282.field4495 > 10) {
                                                class195.field2810 = -1;
                                            }
                                            if (class247.field3706 < -55) {
                                                class170.field2447 = 2;
                                            }
                                            if (class183.field2611 < -60) {
                                                class163.field2367 = 2;
                                            }
                                            if (class183.field2611 > 60) {
                                                class163.field2367 = -2;
                                            }
                                            if (class247.field3706 > 55) {
                                                class170.field2447 = -2;
                                            }
                                            if (class170.field2448 > 50) {
                                                class1.field18 = -2;
                                            }
                                            if (class253.field3847 < -40) {
                                                class247.field3685 = 1;
                                            }
                                            if (class253.field3847 > 40) {
                                                class247.field3685 = -1;
                                            }
                                            if (class200.field2883 > 50) {
                                                class95.field1451.method522(220, arg0 ^ 0xA68);
                                                class145.field2083++;
                                            }
                                            if (class225.field3370) {
                                                class25.method183(0);
                                                class225.field3370 = false;
                                            }
                                            try {
                                                if (class10.field180 != null && class95.field1451.field1673 > 0) {
                                                    class10.field180.method356((byte) 13, class95.field1451.field1629, 0, class95.field1451.field1673);
                                                    class200.field2883 = 0;
                                                    class95.field1451.field1673 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var69) {
                                                class259.method1736((byte) -13);
                                                return;
                                            }
                                        }
                                        var60 = var59.field3531;
                                        if (var60.field4058 < 0) {
                                            break;
                                        }
                                        var61 = class282.method1897(var60.field4139, 125);
                                    } while (var61 == null || var61.field4160 == null || var60.field4058 >= var61.field4160.length || var61.field4160[var60.field4058] != var60);
                                    class15.method118((byte) 118, var59);
                                }
                            }
                            var57 = var56.field3531;
                            if (var57.field4058 < 0) {
                                break;
                            }
                            var58 = class282.method1897(var57.field4139, 95);
                        } while (var58 == null || var58.field4160 == null || var57.field4058 >= var58.field4160.length || var58.field4160[var57.field4058] != var57);
                        class15.method118((byte) 86, var56);
                    }
                }
                var54 = var53.field3531;
                if (var54.field4058 < 0) {
                    break;
                }
                var55 = class282.method1897(var54.field4139, arg0 - 31205);
            } while (var55 == null || var55.field4160 == null || var54.field4058 >= var55.field4160.length || var55.field4160[var54.field4058] != var54);
            class15.method118((byte) 69, var53);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)Ltc;")
    public static final class35 method244(byte arg0, int arg1) {
        class35 var2 = (class35) class218.field3224.method263((byte) 109, (long) arg1);
        field532++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 39) {
            method247((class233) null, -30);
        }
        byte[] var3 = class32.field469.method1538(32, arg1, (byte) 95);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method248(new class114(var3), -6739);
        }
        var4.method246(59);
        class218.field3224.method255((long) arg1, var4, (byte) -125);
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZZ)I")
    private static final int method245(boolean arg0, boolean arg1) {
        if (!arg1) {
            field525 = 10;
        }
        field527++;
        long var2 = class287.method1928(27332);
        for (class71 var4 = arg0 ? (class71) class51.field749.method1219(1) : (class71) class51.field749.method1223(89); var4 != null; var4 = (class71) class51.field749.method1223(80)) {
            if ((var4.field1103 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field1103 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3851;
                    class20.field276[var5] = class43.field616[var5];
                    var4.method1706(-114);
                    return var5;
                }
                var4.method1706(-79);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    private final void method246(int arg0) {
        field528++;
        if (arg0 <= 36) {
            this.field509 = -123;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lve;I)V")
    public static final void method247(class233 arg0, int arg1) {
        if (arg1 != 7) {
            field504 = -47;
        }
        class160.field2322 = arg0.method1522(7233, "runes");
        field510++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lkl;I)V")
    private final void method248(class114 arg0, int arg1) {
        field534++;
        if (arg1 != -6739) {
            this.field516 = -122;
        }
        while (true) {
            int var3 = arg0.method760(false);
            if (var3 == 0) {
                return;
            }
            this.method250(arg0, var3, 1490);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method249(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class90.field1372 = arg1;
        class225.field3383 = arg2;
        class219.field3228 = arg3;
        class17.field241 = new class131[arg0][class90.field1372][class225.field3383];
        class176.field2502 = new int[arg0][class90.field1372 + 1][class225.field3383 + 1];
        if (arg4) {
            class264.field3985 = new class131[1][class90.field1372][class225.field3383];
            class86.field1335 = new int[class90.field1372][class225.field3383];
            class110.field1587 = new int[1][class90.field1372 + 1][class225.field3383 + 1];
        } else {
            class264.field3985 = null;
            class86.field1335 = null;
            class110.field1587 = null;
        }
        class1.method5(false);
        class54.field829 = new class229[500];
        class162.field2336 = 0;
        class80.field1243 = new class229[500];
        class237.field3579 = 0;
        class280.field4466 = new int[arg0][class90.field1372 + 1][class225.field3383 + 1];
        class268.field4197 = new class162[5000];
        class158.field2288 = 0;
        class27.field401 = new class162[100];
        class233.field3478 = new boolean[class219.field3228 + class219.field3228 + 1][class219.field3228 + class219.field3228 + 1];
        class26.field355 = new boolean[class219.field3228 + class219.field3228 + 2][class219.field3228 + class219.field3228 + 2];
        class111.field1600 = new byte[arg0][class90.field1372][class225.field3383];
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lkl;II)V")
    private final void method250(class114 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field531 = arg0.method756(arg2 ^ 0xFFFF8EE1);
            this.field519 = arg0.method756(-29901);
            if (this.field531 == 65535) {
                this.field531 = -1;
            }
            if (this.field519 == 65535) {
                this.field519 = -1;
            }
        } else if (arg1 == 2) {
            this.field509 = arg0.method756(-29901);
        } else if (arg1 == 3) {
            this.field515 = arg0.method756(-29901);
        } else if (arg1 == 4) {
            this.field523 = arg0.method756(arg2 - 31391);
        } else if (arg1 == 5) {
            this.field506 = arg0.method756(arg2 - 31391);
        } else if (arg1 == 6) {
            this.field526 = arg0.method756(arg2 - 31391);
        } else if (arg1 == 7) {
            this.field524 = arg0.method756(arg2 ^ 0xFFFF8EE1);
        } else if (arg1 == 8) {
            this.field505 = arg0.method756(-29901);
        } else if (arg1 == 9) {
            this.field529 = arg0.method756(-29901);
        } else if (arg1 == 26) {
            this.field499 = (short) (arg0.method760(false) * 4);
            this.field511 = (short) (arg0.method760(false) * 4);
        } else if (arg1 == 27) {
            if (this.field520 == null) {
                this.field520 = new int[12][];
            }
            int var4 = arg0.method760(false);
            this.field520[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field520[var4][var5] = arg0.method763(true);
            }
        } else if (arg1 == 29) {
            this.field517 = arg0.method760(false);
        } else if (arg1 == 30) {
            this.field514 = arg0.method756(-29901);
        } else if (arg1 == 31) {
            this.field516 = arg0.method760(false);
        } else if (arg1 == 32) {
            this.field522 = arg0.method756(-29901);
        } else if (arg1 == 33) {
            this.field513 = arg0.method763(true);
        } else if (arg1 == 34) {
            this.field503 = arg0.method760(false);
        } else if (arg1 == 35) {
            this.field512 = arg0.method756(-29901);
        } else if (arg1 == 36) {
            this.field500 = arg0.method763(true);
        } else if (arg1 == 37) {
            this.field508 = arg0.method760(false);
        } else if (arg1 == 38) {
            this.field502 = arg0.method756(arg2 - 31391);
        } else if (arg1 == 39) {
            this.field501 = arg0.method756(-29901);
        } else if (arg1 == 40) {
            this.field518 = arg0.method756(-29901);
        } else if (arg1 == 41) {
            this.field521 = arg0.method756(-29901);
        } else if (arg1 == 42) {
            this.field530 = arg0.method756(-29901);
        } else if (arg1 == 43) {
            arg0.method756(-29901);
        } else if (arg1 == 44) {
            arg0.method756(-29901);
        } else if (arg1 == 45) {
            arg0.method756(arg2 - 31391);
        }
        field533++;
        if (arg2 != 1490) {
            method247((class233) null, 46);
        }
    }
}
