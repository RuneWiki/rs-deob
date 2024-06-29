import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class59 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Ldd;")
    public static class35 field1467 = class180.method1196((byte) -10, "::errortest");

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1469 = 0;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Ldd;")
    public static class35 field1466 = class180.method1196((byte) -18, "(U5");

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Ldd;")
    public static class35 field1471 = class180.method1196((byte) 126, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public static final void method507(int arg0, int arg1, int arg2) {
        field1465++;
        int var3 = 12 % ((-arg1 - 49) / 49);
        int[] var4 = new int[4];
        var4[0] = arg0;
        int var5 = 1;
        int[] var6 = new int[4];
        var6[0] = arg2;
        for (int var7 = 0; var7 < 4; var7++) {
            if (class100.field2192[var7] != arg0) {
                var4[var5] = class100.field2192[var7];
                var6[var5] = class120.field2642[var7];
                var5++;
            }
        }
        class100.field2192 = var4;
        class120.field2642 = var6;
        class154.method1040(class20.field399.length - 1, -29978, class120.field2642, 0, class20.field399, class100.field2192);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lfd;B)I")
    public static final int method508(class55 arg0, byte arg1) {
        if (arg1 != 32) {
            method507(122, -95, -121);
        }
        class15 var2 = (class15) class26.field555.method796(true, ((long) arg0.field1383 << 32) + ((long) arg0.field1339));
        field1473++;
        return var2 == null ? arg0.field1338 : var2.field276;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
    public static final void method509(int arg0, byte arg1) {
        field1472++;
        if (class2.field27 == arg0) {
            return;
        }
        if (class2.field27 == 0) {
            class89.method656(true);
        }
        if (arg1 < 110) {
            method509(-89, (byte) -121);
        }
        if (arg0 == 20 || arg0 == 40) {
            class109.field2423 = 0;
            class90.field2014 = 0;
            class159.field3240 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class64.field1538 != null) {
            class64.field1538.method920((byte) -98);
            class64.field1538 = null;
        }
        if (class2.field27 == 25) {
            class114.field2556 = 0;
            class21.field433 = 1;
            class9.field174 = 1;
            class31.field659 = 0;
            class26.field576 = 0;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class172.method1117(class118.field2618, class78.field1815, class191.field3848, (byte) -79);
        } else {
            class208.method1371((byte) -114);
        }
        class2.field27 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method510(int arg0) {
        field1471 = null;
        if (arg0 != 0) {
            field1466 = null;
        }
        field1467 = null;
        field1466 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZII)V")
    public static final void method511(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class178.field3656 = 0;
        for (int var5 = -1; var5 < class83.field1921 + class72.field1714; var5++) {
            class69 var21;
            if (var5 == -1) {
                var21 = class71.field1704;
            } else if (var5 >= class72.field1714) {
                var21 = class204.field4058[class73.field1738[var5 - class72.field1714]];
            } else {
                var21 = class51.field1154[class35.field748[var5]];
            }
            if (var21 != null && var21.method169((byte) -53)) {
                if (var21 instanceof class19) {
                    class182 var22 = ((class19) var21).field377;
                    if (var22.field3719 != null) {
                        var22 = var22.method1211(89);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class72.field1714 <= var5) {
                    class182 var23 = ((class19) var21).field377;
                    if (var23.field3719 != null) {
                        var23 = var23.method1211(123);
                    }
                    if (var23.field3750 >= 0 && var23.field3750 < class178.field3664.length) {
                        class1.method8(62, var21.method563((byte) -108) + 15, var21);
                        if (class73.field1747 > -1) {
                            class178.field3664[var23.field3750].method115(class73.field1747 + arg4 - 12, class35.field738 + -30 + arg1);
                        }
                    }
                    class89[] var24 = class162.field3297;
                    for (int var25 = 0; var25 < var24.length; var25++) {
                        class89 var26 = var24[var25];
                        if (var26 != null && var26.field1994 == 1 && class73.field1738[var5 - class72.field1714] == var26.field1984 && class89.field1988 % 20 < 10) {
                            class1.method8(-116, var21.method563((byte) -108) + 15, var21);
                            if (class73.field1747 > -1) {
                                class205.field4076[var26.field1981].method115(arg4 + class73.field1747 - 12, class35.field738 + -28 + arg1);
                            }
                        }
                    }
                } else {
                    class102 var27 = (class102) var21;
                    int var28 = 30;
                    if (var27.field2257 != -1 || var27.field2277 != -1) {
                        class1.method8(-123, var21.method563((byte) -108) + 15, var21);
                        if (class73.field1747 > -1) {
                            if (var27.field2257 != -1) {
                                class19.field381[var27.field2257].method115(class73.field1747 + arg4 - 12, class35.field738 + arg1 + -var28);
                                var28 += 25;
                            }
                            if (var27.field2277 != -1) {
                                class178.field3664[var27.field2277].method115(class73.field1747 + arg4 - 12, -var28 + arg1 + class35.field738);
                                var28 += 25;
                            }
                        }
                    }
                    if (var5 >= 0) {
                        class89[] var29 = class162.field3297;
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            class89 var31 = var29[var30];
                            if (var31 != null && var31.field1994 == 10 && class35.field748[var5] == var31.field1984) {
                                class1.method8(39, var21.method563((byte) -108) + 15, var21);
                                if (class73.field1747 > -1) {
                                    class205.field4076[var31.field1981].method115(arg4 + class73.field1747 - 12, class35.field738 + arg1 + -var28);
                                }
                            }
                        }
                    }
                }
                if (var21.field1633 != null && (var5 >= class72.field1714 || class91.field2034 == 0 || class91.field2034 == 3 || class91.field2034 == 1 && class3.method16(((class102) var21).field2254, (byte) 125))) {
                    class1.method8(92, var21.method563((byte) -108), var21);
                    if (class73.field1747 > -1 && class178.field3656 < class160.field3260) {
                        class160.field3265[class178.field3656] = class122.field2673.method1314(var21.field1633) / 2;
                        class160.field3268[class178.field3656] = class122.field2673.field3950;
                        class160.field3262[class178.field3656] = class73.field1747;
                        class160.field3244[class178.field3656] = class35.field738;
                        class160.field3241[class178.field3656] = var21.field1628;
                        class160.field3267[class178.field3656] = var21.field1649;
                        class160.field3248[class178.field3656] = var21.field1652;
                        class160.field3261[class178.field3656] = var21.field1633;
                        class178.field3656++;
                    }
                }
                if (var21.field1616 > class89.field1988) {
                    class1.method8(-99, var21.method563((byte) -108) + 15, var21);
                    if (class73.field1747 > -1) {
                        class140.method970(class73.field1747 + arg4 - 15, class35.field738 + arg1 - 3, var21.field1621, 5, 65280);
                        class140.method970(arg4 + var21.field1621 + class73.field1747 - 15, arg1 + -3 - -class35.field738, 30 - var21.field1621, 5, 16711680);
                    }
                }
                for (int var32 = 0; var32 < 4; var32++) {
                    if (class89.field1988 < var21.field1612[var32]) {
                        class1.method8(58, var21.method563((byte) -108) / 2, var21);
                        if (class73.field1747 > -1) {
                            if (var32 == 1) {
                                class35.field738 -= 20;
                            }
                            if (var32 == 2) {
                                class35.field738 -= 10;
                                class73.field1747 -= 15;
                            }
                            if (var32 == 3) {
                                class35.field738 -= 10;
                                class73.field1747 += 15;
                            }
                            class38.field853[var21.field1663[var32]].method115(class73.field1747 + arg4 - 12, arg1 + -12 - -class35.field738);
                            class15.field270.method1326(class3.method19(var21.field1661[var32], -29578), class73.field1747 + arg4 - 1, class35.field738 + 3 + arg1, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg2) {
            field1468 = 35;
        }
        field1470++;
        for (int var6 = 0; var6 < class178.field3656; var6++) {
            int var7 = class160.field3262[var6];
            int var8 = class160.field3244[var6];
            int var9 = class160.field3265[var6];
            int var10 = class160.field3268[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (var8 + 2 > class160.field3244[var20] + -class160.field3268[var20] && var8 - var10 < class160.field3244[var20] - -2 && var7 - var9 < class160.field3265[var20] + class160.field3262[var20] && var7 + var9 > class160.field3262[var20] - class160.field3265[var20] && var8 > class160.field3244[var20] - class160.field3268[var20]) {
                        var11 = true;
                        var8 = class160.field3244[var20] - class160.field3268[var20];
                    }
                }
            }
            class73.field1747 = class160.field3262[var6];
            class35.field738 = class160.field3244[var6] = var8;
            class35 var12 = class160.field3261[var6];
            if (class61.field1505 == 0) {
                int var13 = 16776960;
                if (class160.field3241[var6] < 6) {
                    var13 = class38.field845[class160.field3241[var6]];
                }
                if (class160.field3241[var6] == 6) {
                    var13 = class40.field890 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class160.field3241[var6] == 7) {
                    var13 = class40.field890 % 20 >= 10 ? 65535 : 255;
                }
                if (class160.field3241[var6] == 8) {
                    var13 = class40.field890 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class160.field3241[var6] == 9) {
                    int var14 = 150 - class160.field3248[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 33160960 - var14 * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class160.field3241[var6] == 10) {
                    int var15 = 150 - class160.field3248[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 16711935 + 16384000 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 - 100) * 327680 + 255 + 500 - var15 * 5;
                    }
                }
                if (class160.field3241[var6] == 11) {
                    int var16 = 150 - class160.field3248[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 - 16318970;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class160.field3267[var6] == 0) {
                    class122.field2673.method1326(var12, arg4 + class73.field1747, class35.field738 + arg1, var13, 0);
                }
                if (class160.field3267[var6] == 1) {
                    class122.field2673.method1320(var12, class73.field1747 + arg4, class35.field738 + arg1, var13, 0, class40.field890);
                }
                if (class160.field3267[var6] == 2) {
                    class122.field2673.method1308(var12, class73.field1747 + arg4, class35.field738 + arg1, var13, 0, class40.field890);
                }
                if (class160.field3267[var6] == 3) {
                    class122.field2673.method1311(var12, class73.field1747 + arg4, class35.field738 + arg1, var13, 0, class40.field890, 150 - class160.field3248[var6]);
                }
                if (class160.field3267[var6] == 4) {
                    int var17 = (150 - class160.field3248[var6]) * (class122.field2673.method1314(var12) + 100) / 150;
                    class140.method954(arg4 + class73.field1747 - 50, arg1, arg4 + class73.field1747 + 50, arg1 + arg3);
                    class122.field2673.method1322(var12, arg4 + class73.field1747 + 50 - var17, class35.field738 + arg1, var13, 0);
                    class140.method958(arg4, arg1, arg0 + arg4, arg1 - -arg3);
                }
                if (class160.field3267[var6] == 5) {
                    int var18 = 150 - class160.field3248[var6];
                    class140.method954(arg4, arg1 + class35.field738 - class122.field2673.field3950 - 1, arg0 + arg4, arg1 + class35.field738 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class122.field2673.method1326(var12, class73.field1747 + arg4, class35.field738 + arg1 + var19, var13, 0);
                    class140.method958(arg4, arg1, arg0 + arg4, arg1 + arg3);
                }
            } else {
                class122.field2673.method1326(var12, arg4 + class73.field1747, arg1 - -class35.field738, 16776960, 0);
            }
        }
    }
}
