import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class58 extends class279 {

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "Lrm;")
    public static class184 field825 = new class184(64);

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "Ljava/lang/String;")
    public static String field840 = "Select";

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "[I")
    public static int[] field839 = new int[500];

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "C")
    private char field824;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public int field826;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "Ljava/lang/String;")
    public String field829;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V", line = 4)
    public static void method467(int arg0) {
        field825 = null;
        field840 = null;
        field839 = null;
        if (arg0 != 4095) {
            field840 = (String) null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "(I)V", line = 22)
    public static final void method468(int arg0) {
        class120.field1670.method1355(false);
        if (arg0 == -1000000) {
            field828++;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILvl;)Lqe;", line = 35)
    public static final class210 method469(int arg0, class6 arg1) {
        if (arg0 >= -48) {
            field825 = (class184) null;
        }
        field827++;
        return new class210(arg1.method78((byte) -123), arg1.method78((byte) -68), arg1.method78((byte) -116), arg1.method78((byte) -45), arg1.method31(-22888), arg1.method31(-22888), arg1.method58(-288140008));
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZIII[[[Lsm;)Z", line = 56)
    public static final boolean method470(int arg0, boolean arg1, int arg2, int arg3, int arg4, class124[][][] arg5) {
        field835++;
        byte var6 = arg1 ? 1 : (byte) (class301.field4629 & 0xFF);
        if (class214.field3376[class154.field2392][arg2][arg0] == var6) {
            return false;
        } else if (arg4 != 1) {
            return false;
        } else if ((class134.field1969[class154.field2392][arg2][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class41.field568[var7] = arg2;
            int var31 = var7 + 1;
            class231.field3608[var7] = arg0;
            int var8 = 0;
            class214.field3376[class154.field2392][arg2][arg0] = var6;
            while (var31 != var8) {
                int var9 = (class41.field568[var8] & 0xFFB0D0) >> 16;
                int var10 = class41.field568[var8] & 0xFFFF;
                int var11 = class41.field568[var8] >> 24 & 0xFF;
                int var12 = class231.field3608[var8] >> 16 & 0xFF;
                int var13 = class231.field3608[var8] & 0xFFFF;
                boolean var14 = false;
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                if ((class134.field1969[class154.field2392][var10][var13] & 0x4) == 0) {
                    var14 = true;
                }
                label241: for (int var16 = class154.field2392 + 1; var16 <= 3; var16++) {
                    if ((class134.field1969[var16][var10][var13] & 0x8) == 0) {
                        if (var14 && arg5[var16][var10][var13] != null) {
                            if (arg5[var16][var10][var13].field1775 != null) {
                                int var17 = class284.method2012(114, var9);
                                if (arg5[var16][var10][var13].field1775.field1366 == var17 || arg5[var16][var10][var13].field1775.field1358 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class284.method2012(110, var11);
                                    if (arg5[var16][var10][var13].field1775.field1366 == var18 || arg5[var16][var10][var13].field1775.field1358 == var18) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var19 = class284.method2012(arg4 + 108, var12);
                                    if (arg5[var16][var10][var13].field1775.field1366 == var19 || arg5[var16][var10][var13].field1775.field1358 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg5[var16][var10][var13].field1783 != null) {
                                for (int var20 = 0; var20 < arg5[var16][var10][var13].field1798; var20++) {
                                    int var21 = (int) (arg5[var16][var10][var13].field1783[var20].field4122 >> 14 & 0x3FL);
                                    int var22 = (int) (arg5[var16][var10][var13].field1783[var20].field4122 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var21 | var22 << 6;
                                    if (var9 == var23 || var11 != 0 && var11 == var23 || var12 != 0 && var12 == var23) {
                                        continue label241;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class124 var24 = arg5[var16][var10][var13];
                        if (var24 != null && var24.field1798 > 0) {
                            for (int var25 = 0; var25 < var24.field1798; var25++) {
                                class263 var26 = var24.field1783[var25];
                                if (var26.field4124 != var26.field4115 || var26.field4127 != var26.field4126) {
                                    for (int var27 = var26.field4124; var27 <= var26.field4115; var27++) {
                                        for (int var28 = var26.field4127; var28 <= var26.field4126; var28++) {
                                            class214.field3376[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class214.field3376[var16][var10][var13] = var6;
                    }
                }
                if (var15) {
                    int var29 = var13 << 7;
                    int var30 = var10 << 7;
                    if (class341.field5305[arg3] < class172.field2843[class154.field2392 + 1][var10][var13]) {
                        class341.field5305[arg3] = class172.field2843[class154.field2392 + 1][var10][var13];
                    }
                    if (var30 < class282.field4366[arg3]) {
                        class282.field4366[arg3] = var30;
                    } else if (class335.field5220[arg3] < var30) {
                        class335.field5220[arg3] = var30;
                    }
                    if (var29 < class259.field4078[arg3]) {
                        class259.field4078[arg3] = var29;
                    } else if (class42.field570[arg3] < var29) {
                        class42.field570[arg3] = var29;
                    }
                }
                if (!var14) {
                    if (var10 >= 1 && class214.field3376[class154.field2392][var10 - 1][var13] != var6) {
                        class41.field568[var31] = class214.method1562(-754974720, class214.method1562(var10 - 1, 1179648));
                        class231.field3608[var31] = class214.method1562(1245184, var13);
                        var31 = var31 + 1 & 0xFFF;
                        class214.field3376[class154.field2392][var10 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if ((var10 - 1) >= 0 && class214.field3376[class154.field2392][var10 - 1][var13] != var6 && (class134.field1969[class154.field2392][var10][var13] & 0x4) == 0 && (class134.field1969[class154.field2392][var10 - 1][var13 - 1] & 0x4) == 0) {
                            class41.field568[var31] = class214.method1562(class214.method1562(var10 - 1, 1179648), 1375731712);
                            class231.field3608[var31] = class214.method1562(var13, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3376[class154.field2392][var10 - 1][var13] = var6;
                        }
                        if (class214.field3376[class154.field2392][var10][var13] != var6) {
                            class41.field568[var31] = class214.method1562(class214.method1562(var10, 5373952), 318767104);
                            class231.field3608[var31] = class214.method1562(5439488, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3376[class154.field2392][var10][var13] = var6;
                        }
                        if ((var10 + 1) < 104 && class214.field3376[class154.field2392][var10 + 1][var13] != var6 && (class134.field1969[class154.field2392][var10][var13] & 0x4) == 0 && (class134.field1969[class154.field2392][var10 + 1][var13 - 1] & 0x4) == 0) {
                            class41.field568[var31] = class214.method1562(class214.method1562(5373952, var10 + 1), -1845493760);
                            class231.field3608[var31] = class214.method1562(var13, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3376[class154.field2392][var10 + 1][var13] = var6;
                        }
                    }
                    var13--;
                    if (var10 + 1 < 104 && class214.field3376[class154.field2392][var10 + 1][var13] != var6) {
                        class41.field568[var31] = class214.method1562(class214.method1562(9568256, var10 + 1), 1392508928);
                        class231.field3608[var31] = class214.method1562(9633792, var13);
                        var31 = var31 + 1 & 0xFFF;
                        class214.field3376[class154.field2392][var10 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var10 - 1) >= 0 && class214.field3376[class154.field2392][var10 - 1][var13] != var6 && (class134.field1969[class154.field2392][var10][var13] & 0x4) == 0 && (class134.field1969[class154.field2392][var10 - 1][var13 + 1] & 0x4) == 0) {
                            class41.field568[var31] = class214.method1562(301989888, class214.method1562(13762560, var10 - 1));
                            class231.field3608[var31] = class214.method1562(13828096, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3376[class154.field2392][var10 - 1][var13] = var6;
                        }
                        if (class214.field3376[class154.field2392][var10][var13] != var6) {
                            class41.field568[var31] = class214.method1562(class214.method1562(var10, 13762560), -1828716544);
                            class231.field3608[var31] = class214.method1562(var13, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3376[class154.field2392][var10][var13] = var6;
                        }
                        if ((var10 + 1) < 104 && class214.field3376[class154.field2392][var10 + 1][var13] != var6 && (class134.field1969[class154.field2392][var10][var13] & 0x4) == 0 && (class134.field1969[class154.field2392][var10 + 1][var13 + 1] & 0x4) == 0) {
                            class41.field568[var31] = class214.method1562(class214.method1562(var10 + 1, 9568256), -771751936);
                            class231.field3608[var31] = class214.method1562(9633792, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class214.field3376[class154.field2392][var10 + 1][var13] = var6;
                        }
                    }
                }
            }
            if (class341.field5305[arg3] != -1000000) {
                class341.field5305[arg3] += 10;
                class282.field4366[arg3] -= 50;
                class335.field5220[arg3] += 50;
                class42.field570[arg3] += 50;
                class259.field4078[arg3] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V", line = 359)
    public static final void method471(int arg0, int arg1) {
        field825.method1353(-1, arg1);
        class229.field3586.method1353(-1, arg1);
        if (arg0 == 1942) {
            field833++;
        }
    }

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "(I)Z", line = 372)
    public final boolean method472(int arg0) {
        int var2 = 60 / ((arg0 + 31) / 36);
        field823++;
        return this.field824 == 's';
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IC)B", line = 381)
    public static final byte method473(int arg0, char arg1) {
        field837++;
        byte var2;
        if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg0 != 19064) {
            method470(15, false, -112, -123, 43, (class124[][][]) ((class124[][][]) null));
        }
        return var2;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lvl;I)V", line = 513)
    public final void method474(class6 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method58(-288140008);
            if (var3 == 0) {
                field832++;
                if (arg1 != 8220) {
                    field838 = 122;
                }
                return;
            }
            this.method476(arg0, arg1 - 607286934, var3);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lnm;Lql;IIIIILmm;)V", line = 543)
    public static final void method475(class212 arg0, class337 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class121 arg7) {
        field831++;
        class166 var8 = new class166();
        var8.field2728 = arg3;
        var8.field2739 = arg5 * arg6;
        var8.field2714 = arg4 * 128;
        if (arg7 != null) {
            var8.field2720 = arg7.field1752 * 128;
            var8.field2735 = arg7;
            var8.field2732 = arg7.field1740;
            int var10 = arg7.field1724;
            var8.field2727 = arg7.field1731;
            var8.field2738 = arg7.field1729;
            var8.field2740 = arg7.field1688;
            int var11 = arg7.field1734;
            var8.field2713 = arg7.field1684;
            if (arg2 == 1 || arg2 == 3) {
                var11 = arg7.field1724;
                var10 = arg7.field1734;
            }
            var8.field2726 = (arg4 + var10) * 128;
            var8.field2717 = (arg6 + var11) * 128;
            if (arg7.field1690 != null) {
                var8.field2722 = true;
                var8.method1246(false);
            }
            if (var8.field2727 != null) {
                var8.field2723 = (int) (Math.random() * (double) (var8.field2713 - var8.field2732)) + var8.field2732;
            }
            class81.field1109.method19(var8, -1058);
        } else if (arg0 != null) {
            var8.field2719 = arg0;
            class161 var9 = arg0.field3346;
            if (var9.field2585 != null) {
                var8.field2722 = true;
                var9 = var9.method1192(arg5 - 129);
            }
            if (var9 != null) {
                var8.field2717 = (var9.field2555 + arg6) * 128;
                var8.field2726 = (var9.field2555 + arg4) * 128;
                var8.field2740 = class213.method1549(arg0, arg5 - 110);
                var8.field2738 = var9.field2605;
                var8.field2720 = var9.field2593 * 128;
            }
            class284.field4394.method19(var8, -1058);
        } else if (arg1 != null) {
            var8.field2718 = arg1;
            var8.field2726 = (arg1.method2099((byte) 123) + arg4) * 128;
            var8.field2717 = (arg1.method2099((byte) 123) + arg6) * 128;
            var8.field2740 = class166.method1247((byte) -93, arg1);
            var8.field2720 = arg1.field5262 * 128;
            var8.field2738 = arg1.field5267;
            class99.field1304.method2161(var8, class83.method608(arg1.field5277, (byte) -119), -1);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lvl;II)V", line = 633)
    private final void method476(class6 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field824 = class319.method2242(arg0.method83((byte) -77), (byte) -17);
        } else if (arg2 == 2) {
            this.field826 = arg0.method73((byte) 19);
        } else if (arg2 == 5) {
            this.field829 = arg0.method40(false);
        }
        if (arg1 != -607278714) {
            method470(34, false, 96, 62, -110, (class124[][][]) ((class124[][][]) null));
        }
        field834++;
    }
}
