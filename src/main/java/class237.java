import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class237 {

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Z")
    public boolean field4320 = true;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public int field4314;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public int field4313;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Ldc;")
    public static class37 field4307 = class185.method1233((byte) 86, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Ldc;")
    public static class37 field4309 = class185.method1233((byte) 86, "<col=c0ff00>");

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Ldc;")
    public static class37 field4308 = class185.method1233((byte) 86, "<col=00ff80>");

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Ldc;")
    private static class37 field4304 = class185.method1233((byte) 86, "Allocating memory");

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Ldc;")
    public static class37 field4310 = class185.method1233((byte) 86, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[Z")
    public static boolean[] field4311 = new boolean[200];

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Ldc;")
    public static class37 field4318 = field4304;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Z")
    public static final boolean method1528(int arg0, int arg1) {
        field4316++;
        if (arg1 == 0) {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILwa;)Lbg;")
    public static final class19 method1529(int arg0, int arg1, class238 arg2) {
        field4305++;
        byte[] var3 = arg2.method1536(arg1, 18808);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 15) {
                method1528(-25, -6);
            }
            return new class19(var3);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1530(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class114.field2038 = 0;
        field4315++;
        for (int var7 = -1; var7 < class95.field1669 + class76.field1342; var7++) {
            class190 var23;
            if (var7 == -1) {
                var23 = class238.field4382;
            } else if (class76.field1342 <= var7) {
                var23 = class70.field1262[class92.field1579[var7 - class76.field1342]];
            } else {
                var23 = class8.field107[class9.field122[var7]];
            }
            if (var23 != null && var23.method482((byte) -108)) {
                if (var23 instanceof class66) {
                    class206 var24 = ((class66) var23).field1190;
                    if (var24.field3831 != null) {
                        var24 = var24.method1356(674);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class76.field1342) {
                    class206 var25 = ((class66) var23).field1190;
                    if (var25.field3831 != null) {
                        var25 = var25.method1356(arg2 ^ 0xFFFFFD1E);
                    }
                    if (var25.field3842 >= 0 && var25.field3842 < class239.field4399.length) {
                        class119.method821(arg0 >> 1, arg2 + 68, arg3, arg5 >> 1, arg6, var23, var23.method1261((byte) -41) + 15);
                        if (class38.field802 > -1) {
                            class239.field4399[var25.field3842].method687(arg4 + class38.field802 - 12, class218.field4074 + arg1 + -30);
                        }
                    }
                    class25[] var26 = class246.field4504;
                    for (int var27 = 0; var27 < var26.length; var27++) {
                        class25 var28 = var26[var27];
                        if (var28 != null && var28.field429 == 1 && class92.field1579[var7 - class76.field1342] == var28.field435 && class203.field3758 % 20 < 10) {
                            class119.method821(arg0 >> 1, 0, arg3, arg5 >> 1, arg6, var23, var23.method1261((byte) -41) + 15);
                            if (class38.field802 > -1) {
                                class12.field174[var28.field431].method687(class38.field802 + arg4 - 12, arg1 + -28 + class218.field4074);
                            }
                        }
                    }
                } else {
                    class123 var29 = (class123) var23;
                    int var30 = 30;
                    if (var29.field2199 != -1 || var29.field2192 != -1) {
                        class119.method821(arg0 >> 1, 0, arg3, arg5 >> 1, arg6, var23, var23.method1261((byte) -41) + 15);
                        if (class38.field802 > -1) {
                            if (var29.field2199 != -1) {
                                class201.field3750[var29.field2199].method687(class38.field802 + arg4 - 12, class218.field4074 + arg1 + -var30);
                                var30 += 25;
                            }
                            if (var29.field2192 != -1) {
                                class239.field4399[var29.field2192].method687(class38.field802 + arg4 - 12, -var30 + class218.field4074 + arg1);
                                var30 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var31 = 0;
                        class25[] var32 = class246.field4504;
                        while (var32.length > var31) {
                            class25 var33 = var32[var31];
                            if (var33 != null && var33.field429 == 10 && class9.field122[var7] == var33.field435) {
                                class119.method821(arg0 >> 1, 0, arg3, arg5 >> 1, arg6, var23, var23.method1261((byte) -41) + 15);
                                if (class38.field802 > -1) {
                                    class12.field174[var33.field431].method687(class38.field802 + arg4 - 12, class218.field4074 + arg1 + -var30);
                                }
                            }
                            var31++;
                        }
                    }
                }
                if (var23.field3501 != null && (class76.field1342 <= var7 || class17.field263 == 0 || class17.field263 == 3 || class17.field263 == 1 && class99.method659(((class123) var23).field2187, (byte) 56))) {
                    class119.method821(arg0 >> 1, arg2 + 68, arg3, arg5 >> 1, arg6, var23, var23.method1261((byte) -41));
                    if (class38.field802 > -1 && class114.field2038 < class120.field2149) {
                        class120.field2152[class114.field2038] = class32.field633.method606(var23.field3501) / 2;
                        class120.field2151[class114.field2038] = class32.field633.field1594;
                        class120.field2159[class114.field2038] = class38.field802;
                        class120.field2157[class114.field2038] = class218.field4074;
                        class120.field2154[class114.field2038] = var23.field3544;
                        class120.field2156[class114.field2038] = var23.field3532;
                        class120.field2150[class114.field2038] = var23.field3470;
                        class120.field2158[class114.field2038] = var23.field3501;
                        class114.field2038++;
                    }
                }
                if (class203.field3758 < var23.field3469) {
                    class119.method821(arg0 >> 1, 0, arg3, arg5 >> 1, arg6, var23, var23.method1261((byte) -41) + 15);
                    if (class38.field802 > -1) {
                        class48.method420(class38.field802 + arg4 - 15, arg1 + -3 - -class218.field4074, var23.field3539, 5, 65280);
                        class48.method420(class38.field802 + arg4 + var23.field3539 - 15, arg1 + -3 + class218.field4074, 30 - var23.field3539, 5, 16711680);
                    }
                }
                for (int var34 = 0; var34 < 4; var34++) {
                    if (var23.field3518[var34] > class203.field3758) {
                        class119.method821(arg0 >> 1, 0, arg3, arg5 >> 1, arg6, var23, var23.method1261((byte) -41) / 2);
                        if (class38.field802 > -1) {
                            if (var34 == 1) {
                                class218.field4074 -= 20;
                            }
                            if (var34 == 2) {
                                class38.field802 -= 15;
                                class218.field4074 -= 10;
                            }
                            if (var34 == 3) {
                                class38.field802 += 15;
                                class218.field4074 -= 10;
                            }
                            class170.field3241[var23.field3483[var34]].method687(class38.field802 + arg4 - 12, arg1 - 12 + class218.field4074);
                            client.field686.method621(class151.method1034((byte) -9, var23.field3500[var34]), class38.field802 + arg4 - 1, arg1 + 3 - -class218.field4074, 16777215, 0);
                        }
                    }
                }
            }
        }
        int var8 = 0;
        if (arg2 != -68) {
            method1532(-112, 0, 116, -22, -73, true, 69);
        }
        while (var8 < class114.field2038) {
            int var9 = class120.field2157[var8];
            int var10 = class120.field2159[var8];
            int var11 = class120.field2151[var8];
            boolean var12 = true;
            int var13 = class120.field2152[var8];
            while (var12) {
                var12 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if (var9 + 2 > class120.field2157[var22] + -class120.field2151[var22] && var9 - var11 < class120.field2157[var22] + 2 && class120.field2159[var22] + class120.field2152[var22] > -var13 + var10 && class120.field2159[var22] - class120.field2152[var22] < var10 + var13 && class120.field2157[var22] - class120.field2151[var22] < var9) {
                        var9 = class120.field2157[var22] - class120.field2151[var22];
                        var12 = true;
                    }
                }
            }
            class38.field802 = class120.field2159[var8];
            class218.field4074 = class120.field2157[var8] = var9;
            class37 var14 = class120.field2158[var8];
            if (class35.field703 == 0) {
                int var15 = 16776960;
                if (class120.field2154[var8] < 6) {
                    var15 = class229.field4208[class120.field2154[var8]];
                }
                if (class120.field2154[var8] == 6) {
                    var15 = class231.field4224 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class120.field2154[var8] == 7) {
                    var15 = class231.field4224 % 20 >= 10 ? 65535 : 255;
                }
                if (class120.field2154[var8] == 8) {
                    var15 = class231.field4224 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class120.field2154[var8] == 9) {
                    int var16 = 150 - class120.field2150[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var15 = var16 * 5 + 65280 - 500;
                    }
                }
                if (class120.field2154[var8] == 10) {
                    int var17 = 150 - class120.field2150[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 + 16384000 - var17 * 327680;
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 - (var17 - 100) * 5 - 32768000;
                    }
                }
                if (class120.field2154[var8] == 11) {
                    int var18 = 150 - class120.field2150[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - var18 * 327685;
                    } else if (var18 < 100) {
                        var15 = var18 * 327685 - 16318970;
                    } else if (var18 < 150) {
                        var15 = 16777215 + 32768000 - var18 * 327680;
                    }
                }
                if (class120.field2156[var8] == 0) {
                    class32.field633.method621(var14, class38.field802 + arg4, class218.field4074 + arg1, var15, 0);
                }
                if (class120.field2156[var8] == 1) {
                    class32.field633.method614(var14, class38.field802 + arg4, class218.field4074 + arg1, var15, 0, class231.field4224);
                }
                if (class120.field2156[var8] == 2) {
                    class32.field633.method612(var14, class38.field802 + arg4, class218.field4074 + arg1, var15, 0, class231.field4224);
                }
                if (class120.field2156[var8] == 3) {
                    class32.field633.method625(var14, class38.field802 + arg4, class218.field4074 + arg1, var15, 0, class231.field4224, 150 - class120.field2150[var8]);
                }
                if (class120.field2156[var8] == 4) {
                    int var19 = (150 - class120.field2150[var8]) * (class32.field633.method606(var14) + 100) / 150;
                    class48.method402(class38.field802 + arg4 - 50, arg1, class38.field802 + arg4 + 50, arg0 + arg1);
                    class32.field633.method607(var14, class38.field802 + arg4 + 50 - var19, class218.field4074 + arg1, var15, 0);
                    class48.method408(arg4, arg1, arg4 + arg5, arg0 + arg1);
                }
                if (class120.field2156[var8] == 5) {
                    int var20 = 0;
                    int var21 = 150 - class120.field2150[var8];
                    class48.method402(arg4, arg1 + class218.field4074 - class32.field633.field1594 - 1, arg4 + arg5, class218.field4074 + arg1 + 5);
                    if (var21 < 25) {
                        var20 = var21 - 25;
                    } else if (var21 > 125) {
                        var20 = var21 - 125;
                    }
                    class32.field633.method621(var14, arg4 + class38.field802, class218.field4074 + arg1 - -var20, var15, 0);
                    class48.method408(arg4, arg1, arg4 + arg5, arg0 + arg1);
                }
            } else {
                class32.field633.method621(var14, class38.field802 + arg4, class218.field4074 + arg1, 16776960, 0);
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static void method1531(boolean arg0) {
        if (arg0) {
            method1531(false);
        }
        field4308 = null;
        field4318 = null;
        field4309 = null;
        field4307 = null;
        field4304 = null;
        field4310 = null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1532(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg4 - arg6 >= class29.field536 && class82.field1458 >= arg4 + arg6 && class198.field3697 <= arg1 - arg6 && arg1 + arg6 <= class199.field3712) {
            class239.method1570(arg0, arg1, arg2, arg3, -80, arg4, arg6);
        } else {
            class131.method920((byte) 83, arg2, arg1, arg0, arg4, arg3, arg6);
        }
        if (!arg5) {
            field4311 = null;
        }
        field4319++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static final void method1533(int arg0) {
        field4306++;
        class140.field2718.method698(0, 0);
        class49.field984.method698(382, 0);
        class149.field2830.method662(382 - class149.field2830.field1742 / 2, 18);
        if (arg0 > -97) {
            field4308 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
    public static final void method1534(int arg0) {
        class106.field1836 = null;
        class10.field138 = null;
        class190.field3521 = null;
        field4317++;
        class193.field3608 = null;
        class152.field2886 = null;
        class145.field2774 = null;
        if (arg0 >= -62) {
            field4304 = null;
        }
        class95.field1676 = null;
        class67.field1208 = null;
        class86.field1519 = null;
        class119.field2135 = null;
        class124.field2219 = null;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)I")
    public static int method1535(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4322 = arg0;
        this.field4323 = arg3;
        this.field4321 = arg4;
        this.field4314 = arg1;
        this.field4313 = arg2;
        this.field4312 = arg5;
        this.field4320 = arg6;
    }
}
