import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class62 extends class47 {

    @OriginalMember(owner = "client!gf", name = "fd", descriptor = "I")
    public int field1551 = -1;

    @OriginalMember(owner = "client!gf", name = "bd", descriptor = "S")
    private short field1547 = 0;

    @OriginalMember(owner = "client!gf", name = "ld", descriptor = "I")
    public int field1557 = 0;

    @OriginalMember(owner = "client!gf", name = "jd", descriptor = "I")
    public int field1555 = 0;

    @OriginalMember(owner = "client!gf", name = "pd", descriptor = "I")
    public int field1561 = 0;

    @OriginalMember(owner = "client!gf", name = "dd", descriptor = "I")
    public int field1549 = 0;

    @OriginalMember(owner = "client!gf", name = "xd", descriptor = "I")
    public int field1569 = 0;

    @OriginalMember(owner = "client!gf", name = "zd", descriptor = "Z")
    public boolean field1571 = false;

    @OriginalMember(owner = "client!gf", name = "Dd", descriptor = "I")
    public int field1575 = -1;

    @OriginalMember(owner = "client!gf", name = "Cd", descriptor = "S")
    private short field1574 = 0;

    @OriginalMember(owner = "client!gf", name = "hd", descriptor = "I")
    public static int field1553 = 0;

    @OriginalMember(owner = "client!gf", name = "id", descriptor = "Lgg;")
    public static class63 field1554 = null;

    @OriginalMember(owner = "client!gf", name = "md", descriptor = "Lgg;")
    private static class63 field1558 = class116.method911(43, "Connection timed out)3");

    @OriginalMember(owner = "client!gf", name = "ud", descriptor = "Lgg;")
    public static class63 field1566 = field1558;

    @OriginalMember(owner = "client!gf", name = "cd", descriptor = "Lgg;")
    public static class63 field1548 = null;

    @OriginalMember(owner = "client!gf", name = "td", descriptor = "[I")
    public static int[] field1565 = new int[25];

    @OriginalMember(owner = "client!gf", name = "vd", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!gf", name = "Gd", descriptor = "Z")
    public static boolean field1578 = false;

    @OriginalMember(owner = "client!gf", name = "Zc", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!gf", name = "ad", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!gf", name = "ed", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!gf", name = "kd", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!gf", name = "qd", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!gf", name = "rd", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!gf", name = "sd", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!gf", name = "wd", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!gf", name = "yd", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!gf", name = "Ad", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!gf", name = "Bd", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!gf", name = "Ed", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!gf", name = "Hd", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!gf", name = "Id", descriptor = "I")
    public int field1580;

    @OriginalMember(owner = "client!gf", name = "nd", descriptor = "Lbe;")
    public class16 field1559;

    @OriginalMember(owner = "client!gf", name = "od", descriptor = "Lth;")
    public static class179 field1560;

    @OriginalMember(owner = "client!gf", name = "Fd", descriptor = "Ldf;")
    public class36 field1577;

    @OriginalMember(owner = "client!gf", name = "gd", descriptor = "Lgg;")
    public class63 field1552;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public static void method563(int arg0) {
        field1548 = null;
        field1565 = null;
        field1560 = null;
        field1558 = null;
        field1566 = null;
        if (arg0 != 7052) {
            field1558 = null;
        }
        field1554 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lab;I)V")
    public final void method564(class3 arg0, int arg1) {
        arg0.field54 = 0;
        ++field1564;
        int var3 = arg0.method64(31790);
        if (~(2 & var3) != -3) {
            this.field1574 = 0;
            this.field1547 = 0;
        } else {
            this.field1574 = (short) (arg0.method64(31790) << 2);
            this.field1547 = (short) (arg0.method64(31790) << 2);
        }
        super.field1123 = (var3 >> 3) + 1;
        this.field1551 = arg0.method73((byte) 29);
        boolean var4 = ~(4 & var3) != -1;
        this.field1575 = arg0.method73((byte) 29);
        if (arg1 != 8144) {
            method566(25, (class3) null, -36, (class149) null);
        }
        this.field1555 = 0;
        int var5 = -1;
        int[] var6 = new int[12];
        for (int var7 = 0; ~var7 > -13; ++var7) {
            int var8 = arg0.method64(31790);
            if (~var8 == -1) {
                var6[var7] = 0;
            } else {
                int var9 = arg0.method64(31790);
                int var10 = (var8 << 8) - -var9;
                if (~var7 == -1 && ~var10 == -65536) {
                    var5 = arg0.method46((byte) 65);
                    break;
                }
                if (var10 >= 32768) {
                    int var15 = class187.field3781[var10 - 32768];
                    var6[var7] = class202.method1332(1073741824, var15);
                    int var16 = class59.method554(var15, 13319).field2232;
                    if (~var16 != -1) {
                        this.field1555 = var16;
                    }
                } else {
                    var6[var7] = class202.method1332(Integer.MIN_VALUE, var10 + -256);
                }
            }
        }
        int var11 = var3 & 1;
        int[] var12 = new int[5];
        for (int var13 = 0; ~var13 > -6; ++var13) {
            int var14 = arg0.method64(arg1 + 23646);
            if (var14 < 0 || ~var14 <= ~class71.field1793[var13].length) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field1110 = arg0.method46((byte) 65);
        if (~super.field1110 == -65536) {
            super.field1110 = -1;
        }
        super.field1160 = arg0.method46((byte) 65);
        if (super.field1160 == 65535) {
            super.field1160 = -1;
        }
        super.field1136 = super.field1160;
        super.field1113 = arg0.method46((byte) 65);
        if (super.field1113 == 65535) {
            super.field1113 = -1;
        }
        super.field1149 = arg0.method46((byte) 65);
        if (~super.field1149 == -65536) {
            super.field1149 = -1;
        }
        super.field1157 = arg0.method46((byte) 65);
        if (super.field1157 == 65535) {
            super.field1157 = -1;
        }
        super.field1124 = arg0.method46((byte) 65);
        if (~super.field1124 == -65536) {
            super.field1124 = -1;
        }
        super.field1159 = arg0.method46((byte) 65);
        if (~super.field1159 == -65536) {
            super.field1159 = -1;
        }
        this.field1552 = class89.method770(arg0.method21(arg1 + -36500), false).method576((byte) 32);
        this.field1569 = arg0.method64(31790);
        if (var4) {
            this.field1561 = arg0.method46((byte) 65);
        }
        if (this.field1559 == null) {
            this.field1559 = new class16();
        }
        this.field1559.method177(var6, var11 == 1, var12, var5, 7);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1545;
        if (this.field1559 != null) {
            class9 var11 = ~super.field1167 != 0 && ~super.field1152 == -1 ? class49.method480(1000, super.field1167) : null;
            class9 var12 = ~super.field1108 == 0 || this.field1571 || ~super.field1110 == ~super.field1108 && var11 != null ? null : class49.method480(1000, super.field1108);
            class36 var13 = this.field1559.method184(var12, super.field1097, var11, 9420, super.field1119);
            if (var13 != null) {
                var13.method331();
                super.field728 = var13.field728;
                if (~this.field1574 != -1 && ~this.field1547 != -1) {
                    int var14 = class25.field571[arg0];
                    int var15 = class25.field576[arg0];
                    short var16 = this.field1574;
                    short var17 = this.field1547;
                    int var18 = -var16 / 2;
                    int var19 = -var17 / 2;
                    int var20 = var14 * var19 + var15 * var18 >> 16;
                    int var21 = var15 * var19 + -(var14 * var18) >> 16;
                    int var22 = var16 / 2;
                    int var23 = class112.method894(-113, class112.field2528, super.field1141 + var20, super.field1144 + var21);
                    int var24 = -var17 / 2;
                    int var25 = var14 * var24 - -(var15 * var22) >> 16;
                    int var26 = var15 * var24 + -(var14 * var22) >> 16;
                    int var27 = -var16 / 2;
                    int var28 = class112.method894(-100, class112.field2528, super.field1141 + var25, super.field1144 + var26);
                    int var29 = var17 / 2;
                    int var30 = var15 * var29 + -(var14 * var27) >> 16;
                    int var31 = var16 / 2;
                    int var32 = var17 / 2;
                    int var33 = var14 * var29 + var15 * var27 >> 16;
                    int var34 = var15 * var32 + -(var14 * var31) >> 16;
                    int var35 = var14 * var32 + var15 * var31 >> 16;
                    int var36 = var28 > var23 ? var23 : var28;
                    int var37 = class112.method894(-98, class112.field2528, super.field1141 + var33, super.field1144 + var30);
                    int var38 = class112.method894(-116, class112.field2528, super.field1141 - -var35, super.field1144 + var34);
                    int var39 = ~var23 > ~var37 ? var23 : var37;
                    int var40 = var37 < var38 ? var37 : var38;
                    int var41 = 2047 & (int) (320.0D * Math.atan2((double) (var36 - var40), (double) var17));
                    int var42 = var28 < var38 ? var28 : var38;
                    int var43 = (var36 + var40 - -var42 + var39) / 4;
                    var13.method329(var41);
                    int var44 = (int) (Math.atan2((double) (-var42 + var39), (double) var16) * 320.0D) & 2047;
                    var13.method337(var44);
                    var13.method338(0, -super.field1143 + var43, 0);
                }
                class36 var45 = null;
                if (!this.field1571 && super.field1135 != -1 && super.field1114 != -1) {
                    var45 = class19.method198(19, super.field1135).method464(-129, super.field1114);
                    if (var45 != null) {
                        var45.method338(0, -super.field1116, 0);
                    }
                }
                class36 var46 = null;
                if (!this.field1571 && this.field1577 != null) {
                    if (this.field1549 <= class173.field3571) {
                        this.field1577 = null;
                    }
                    if (this.field1557 <= class173.field3571 && ~class173.field3571 > ~this.field1549) {
                        var46 = this.field1577;
                        var46.method338(-super.field1141 + this.field1576, -super.field1143 + this.field1580, -super.field1144 + this.field1546);
                        if (~super.field1129 != -513) {
                            if (~super.field1129 == -1025) {
                                var46.method333();
                                var46.method333();
                            } else if (~super.field1129 == -1537) {
                                var46.method333();
                            }
                        } else {
                            var46.method333();
                            var46.method333();
                            var46.method333();
                        }
                    }
                }
                if (var45 != null) {
                    var13 = ((class66) var13).method622(var45);
                }
                if (var46 != null) {
                    var13 = ((class66) var13).method622(var46);
                }
                var13.field843 = true;
                var13.method95(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var46 != null) {
                    if (super.field1129 != 512) {
                        if (super.field1129 == 1024) {
                            var46.method333();
                            var46.method333();
                        } else if (super.field1129 == 1536) {
                            var46.method333();
                            var46.method333();
                            var46.method333();
                        }
                    } else {
                        var46.method333();
                    }
                    var46.method338(super.field1141 - this.field1576, -this.field1580 + super.field1143, -this.field1546 + super.field1144);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)Z")
    public final boolean method97(int arg0) {
        ++field1570;
        if (arg0 != 4365) {
            method567((class47) null, 18, -38);
        }
        return this.field1559 != null;
    }

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V")
    public static final void method565(int arg0) {
        class150.method1055(false, 22344);
        class142.field3038 = 0;
        ++field1572;
        boolean var1 = true;
        for (int var2 = 0; class52.field1283.length > var2; ++var2) {
            if (class32.field790[var2] != -1 && class52.field1283[var2] == null) {
                class52.field1283[var2] = class47.field1142.method745(class32.field790[var2], 0, class180.method1200(arg0, 2047));
                if (class52.field1283[var2] == null) {
                    ++class142.field3038;
                    var1 = false;
                }
            }
            if (class187.field3770[var2] != -1 && class138.field2953[var2] == null) {
                class138.field2953[var2] = class47.field1142.method747(arg0 + -30379, class187.field3770[var2], class121.field2665[var2], 0);
                if (class138.field2953[var2] == null) {
                    var1 = false;
                    ++class142.field3038;
                }
            }
        }
        if (!var1) {
            class26.field593 = 1;
        } else {
            class14.field321 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class52.field1283.length < ~var4; ++var4) {
                byte[] var56 = class138.field2953[var4];
                if (var56 != null) {
                    int var57 = (class182.field3691[var4] >> 8) * 64 + -class3.field110;
                    int var58 = (class182.field3691[var4] & 255) * 64 + -class38.field921;
                    if (class83.field1976) {
                        var57 = 10;
                        var58 = 10;
                    }
                    var3 &= class162.method1104(false, var57, var58, var56);
                }
            }
            if (!var3) {
                class26.field593 = 2;
            } else {
                if (~class26.field593 != -1) {
                    class60.method561(true, 79, class89.method772((byte) 82, new class63[] { class11.field267, class78.field1891 }));
                }
                class198.method1294((byte) -30);
                class48.method475((byte) -29);
                class198.method1294((byte) -30);
                class169.method1144();
                class198.method1294((byte) -30);
                System.gc();
                for (int var5 = 0; var5 < 4; ++var5) {
                    class157.field3267[var5].method714(-98);
                }
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    for (int var54 = 0; var54 < 104; ++var54) {
                        for (int var55 = 0; var55 < 104; ++var55) {
                            class49.field1194[var6][var54][var55] = 0;
                        }
                    }
                }
                class198.method1294((byte) -30);
                class10.method134(-126);
                int var7 = class52.field1283.length;
                class125.method949(false);
                class150.method1055(true, arg0 ^ 20663);
                if (!class83.field1976) {
                    for (int var8 = 0; ~var8 > ~var7; ++var8) {
                        int var17 = (class182.field3691[var8] >> 8) * 64 + -class3.field110;
                        int var18 = (class182.field3691[var8] & 255) * 64 - class38.field921;
                        byte[] var19 = class52.field1283[var8];
                        if (var19 != null) {
                            class198.method1294((byte) -30);
                            class182.method1205((byte) 83, var19, var18, class140.field3023 * 8 + -48, var17, class158.field3270 * 8 + -48, class157.field3267);
                        }
                    }
                    for (int var9 = 0; ~var9 > ~var7; ++var9) {
                        int var14 = (class182.field3691[var9] >> 8) * 64 + -class3.field110;
                        int var15 = (255 & class182.field3691[var9]) * 64 - class38.field921;
                        byte[] var16 = class52.field1283[var9];
                        if (var16 == null && ~class140.field3023 > -801) {
                            class198.method1294((byte) -30);
                            class33.method320(64, var15, arg0 ^ 2047, 64, var14);
                        }
                    }
                    class150.method1055(true, 22344);
                    for (int var10 = 0; ~var10 > ~var7; ++var10) {
                        byte[] var11 = class138.field2953[var10];
                        if (var11 != null) {
                            int var12 = (255 & class182.field3691[var10]) * 64 + -class38.field921;
                            int var13 = (class182.field3691[var10] >> 8) * 64 - class3.field110;
                            class198.method1294((byte) -30);
                            class81.method726(var13, (byte) -45, var11, class157.field3267, var12);
                        }
                    }
                }
                if (class83.field1976) {
                    for (int var20 = 0; var20 < 4; ++var20) {
                        class198.method1294((byte) -30);
                        for (int var34 = 0; ~var34 > -14; ++var34) {
                            for (int var35 = 0; var35 < 13; ++var35) {
                                boolean var36 = false;
                                int var37 = class32.field789[var20][var34][var35];
                                if (~var37 != 0) {
                                    int var38 = 3 & var37 >> 24;
                                    int var39 = (7 & var37) >> 1;
                                    int var40 = (16772545 & var37) >> 14;
                                    int var41 = (16381 & var37) >> 3;
                                    int var42 = (var40 / 8 << 8) + var41 / 8;
                                    for (int var43 = 0; class182.field3691.length > var43; ++var43) {
                                        if (~class182.field3691[var43] == ~var42 && class52.field1283[var43] != null) {
                                            class12.method148(-113, var38, (7 & var40) * 8, var34 * 8, var35 * 8, var20, var39, (7 & var41) * 8, class157.field3267, class52.field1283[var43]);
                                            var36 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var36) {
                                    class3.method59(-128, var35 * 8, var34 * 8, var20);
                                }
                            }
                        }
                    }
                    for (int var21 = 0; ~var21 > -14; ++var21) {
                        for (int var32 = 0; ~var32 > -14; ++var32) {
                            int var33 = class32.field789[0][var21][var32];
                            if (~var33 == 0) {
                                class33.method320(8, var32 * 8, 0, 8, var21 * 8);
                            }
                        }
                    }
                    class150.method1055(true, 22344);
                    for (int var22 = 0; ~var22 > -5; ++var22) {
                        class198.method1294((byte) -30);
                        for (int var23 = 0; var23 < 13; ++var23) {
                            for (int var24 = 0; var24 < 13; ++var24) {
                                int var25 = class32.field789[var22][var23][var24];
                                if (var25 != -1) {
                                    int var26 = 3 & var25 >> 24;
                                    int var27 = (var25 & 6) >> 1;
                                    int var28 = 1023 & var25 >> 14;
                                    int var29 = (16376 & var25) >> 3;
                                    int var30 = (var28 / 8 << 8) + var29 / 8;
                                    for (int var31 = 0; ~var31 > ~class182.field3691.length; ++var31) {
                                        if (~class182.field3691[var31] == ~var30 && class138.field2953[var31] != null) {
                                            class139.method1004(var24 * 8, (byte) -25, class157.field3267, var22, class138.field2953[var31], (var28 & 7) * 8, var23 * 8, var26, (var29 & 7) * 8, var27);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (arg0 != 2047) {
                    method563(-10);
                }
                class150.method1055(true, arg0 ^ 20663);
                class48.method475((byte) 123);
                class198.method1294((byte) -30);
                class8.method115(arg0 + -2175, class157.field3267);
                class150.method1055(true, 22344);
                int var44 = class35.field819;
                if (class112.field2528 < var44) {
                    var44 = class112.field2528;
                }
                if (class112.field2528 - 1 > var44) {
                    int var45 = class112.field2528 + -1;
                }
                if (class198.field3964) {
                    class32.method316(class35.field819);
                } else {
                    class32.method316(0);
                }
                for (int var46 = 0; ~var46 > -105; ++var46) {
                    for (int var53 = 0; ~var53 > -105; ++var53) {
                        class52.method513(var53, var46, (byte) -114);
                    }
                }
                class198.method1294((byte) -30);
                class171.method1149(21057);
                class48.method475((byte) 124);
                if (class153.field3193 != null) {
                    class141.field3031.method854(168, true);
                    class141.field3031.method76(1057001181, (byte) 114);
                    ++class97.field2301;
                }
                if (!class83.field1976) {
                    int var47 = (class158.field3270 - 6) / 8;
                    int var48 = (class158.field3270 + 6) / 8;
                    int var49 = (class140.field3023 + -6) / 8;
                    int var50 = (class140.field3023 - -6) / 8;
                    for (int var51 = var47 + -1; ~(var48 + 1) <= ~var51; ++var51) {
                        for (int var52 = var49 + -1; var52 <= var50 - -1; ++var52) {
                            if (~var51 > ~var47 || var51 > var48 || var52 < var49 || ~var50 > ~var52) {
                                class47.field1142.method746(class89.method772((byte) 87, new class63[] { class11.field263, class175.method1162((byte) -126, var51), class175.field3587, class175.method1162((byte) -126, var52) }), arg0 + -2047);
                                class47.field1142.method746(class89.method772((byte) 97, new class63[] { class26.field594, class175.method1162((byte) -126, var51), class175.field3587, class175.method1162((byte) -126, var52) }), 0);
                            }
                        }
                    }
                }
                class121.method931(30, 1);
                class198.method1294((byte) -30);
                class113.method899(arg0 + -1976);
                class141.field3031.method854(187, true);
                class142.method1019((byte) 41);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILab;ILqe;)V")
    public static final void method566(int arg0, class3 arg1, int arg2, class149 arg3) {
        ++field1563;
        class100 var4 = new class100();
        var4.field2356 = arg1.method64(31790);
        var4.field2350 = arg1.method56(-1);
        if (arg2 != -4) {
            field1566 = null;
        }
        var4.field2347 = new class87[var4.field2356];
        var4.field2354 = new class87[var4.field2356];
        var4.field2345 = new byte[var4.field2356][][];
        var4.field2353 = new int[var4.field2356];
        var4.field2361 = new int[var4.field2356];
        var4.field2362 = new int[var4.field2356];
        for (int var5 = 0; var5 < var4.field2356; ++var5) {
            try {
                int var6 = arg1.method64(31790);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var10 = new String(arg1.method28(arg2 + 3).method604((byte) -91));
                        String var11 = new String(arg1.method28(-1).method604((byte) 91));
                        int var12 = arg1.method64(31790);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var14 < var12; ++var14) {
                            var13[var14] = new String(arg1.method28(-1).method604((byte) -62));
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; var16 < var12; ++var16) {
                                int var17 = arg1.method56(arg2 ^ 3);
                                var15[var16] = new byte[var17];
                                arg1.method71(var17, arg2 + -26248, 0, var15[var16]);
                            }
                        }
                        var4.field2353[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var19 < var12; ++var19) {
                            var18[var19] = class64.method609(2000, var13[var19]);
                        }
                        var4.field2347[var5] = arg3.method1046(class64.method609(arg2 + 2004, var10), 2, var11, var18);
                        var4.field2345[var5] = var15;
                    }
                } else {
                    String var7 = new String(arg1.method28(-1).method604((byte) 106));
                    String var8 = new String(arg1.method28(-1).method604((byte) -80));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method56(arg2 + 3);
                    }
                    var4.field2353[var5] = var6;
                    var4.field2362[var5] = var9;
                    var4.field2354[var5] = arg3.method1050(var8, class64.method609(2000, var7), 0);
                }
            } catch (ClassNotFoundException var20) {
                var4.field2361[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2361[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2361[var5] = -3;
            } catch (Exception var23) {
                var4.field2361[var5] = -4;
            } catch (Throwable var24) {
                var4.field2361[var5] = -5;
            }
        }
        class134.field2903.method1034(0, var4);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Leh;II)V")
    public static final void method567(class47 arg0, int arg1, int arg2) {
        ++field1568;
        if (~class173.field3571 <= ~arg0.field1126) {
            if (~class173.field3571 >= ~arg0.field1140) {
                class136.method986((byte) 55, arg0);
            } else {
                class198.method1297(arg0, arg2 + -1);
            }
        } else {
            class203.method1339(arg2 ^ 223, arg0);
        }
        if (arg0.field1141 < arg2 || arg0.field1144 < 128 || ~arg0.field1141 <= -13185 || arg0.field1144 >= 13184) {
            arg0.field1167 = -1;
            arg0.field1141 = arg0.field1117[0] * 128 + arg0.field1123 * 64;
            arg0.field1140 = 0;
            arg0.field1135 = -1;
            arg0.field1144 = arg0.field1164[0] * 128 + arg0.field1123 * 64;
            arg0.field1126 = 0;
            arg0.method472((byte) 121);
        }
        if (class3.field72 == arg0 && (arg0.field1141 < 1536 || ~arg0.field1144 > -1537 || ~arg0.field1141 <= -11777 || arg0.field1144 >= 11776)) {
            arg0.field1140 = 0;
            arg0.field1144 = arg0.field1164[0] * 128 + arg0.field1123 * 64;
            arg0.field1135 = -1;
            arg0.field1126 = 0;
            arg0.field1167 = -1;
            arg0.field1141 = arg0.field1117[0] * 128 - -(arg0.field1123 * 64);
            arg0.method472((byte) 88);
        }
        class161.method1100(arg0, (byte) 79);
        class22.method227(arg0, -2);
    }
}
