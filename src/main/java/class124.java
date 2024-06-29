import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class124 {

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1458 = new String[] { method1080(method1079("d[p\\")), method1080(method1079("dJ}")), method1080(method1079("q\u00002\u001e5")), method1080(method1079("hC2q`")), method1080(method1079("hC2s`")), method1080(method1079("hC2t`")), method1080(method1079("hC2r`")) };

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Z")
    public static boolean field1455 = false;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field1456;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1457;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
    public static final int method1074(int arg0, int arg1, int arg2) {
        try {
            arg1 = (arg2 & 0x7F) * arg1 >> 7;
            if (arg0 != -24734) {
                return -105;
            }
            field1454++;
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return (arg2 & 0xFF80) + arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1458[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)Z")
    public static final boolean method1075(int arg0, int arg1, int arg2) {
        try {
            field1451++;
            if (arg0 == -105) {
                return (arg2 & 0x84080) != 0;
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1458[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lha;IB)Z")
    public static final boolean method1076(class66 arg0, int arg1, byte arg2) {
        try {
            field1456++;
            int var3 = (class648.field9378 - 104) / 2;
            int var4 = 34 % ((27 - arg2) / 39);
            int var5 = (class659.field9506 - 104) / 2;
            boolean var6 = true;
            for (int var7 = var3; var7 < var3 + 104; var7++) {
                for (int var8 = var5; var8 < (var5 + 104); var8++) {
                    for (int var9 = arg1; var9 <= 3; var9++) {
                        if (class256.method2171(2, var9, var8, arg1, var7)) {
                            int var10 = var9;
                            if (class231.method1980(1, var8, var7)) {
                                var10 = var9 - 1;
                            }
                            if (var10 >= 0) {
                                var6 &= class725.method5281(var7, var10, var8, (byte) -123);
                            }
                        }
                    }
                }
            }
            if (!var6) {
                return false;
            }
            int[] var11 = new int[262144];
            for (int var12 = 0; var12 < var11.length; var12++) {
                var11[var12] = -16777216;
            }
            class338.field5274 = arg0.method520(0, 512, var11, (byte) 41, 512, 512);
            class624.method4638(0);
            int var13 = (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) - (-238 - ((int) (Math.random() * 20.0D) + -10)) | 0xFF000000;
            int var14 = ((int) (Math.random() * 20.0D) + 228 | 0x8B38FF00) << 16;
            int var15 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
            boolean[][] var16 = new boolean[class180.field2495 + 3][class180.field2495 + 1 + 2];
            for (int var17 = var3; var17 < (var3 + 104); var17 += class180.field2495) {
                for (int var18 = var5; var18 < var5 + 104; var18 += class180.field2495) {
                    int var19 = 0;
                    int var20 = 0;
                    int var21 = var17;
                    if (var17 > 0) {
                        var19 += 4;
                        var21 = var17 - 1;
                    }
                    int var22 = var18;
                    if (var18 > 0) {
                        var22 = var18 - 1;
                    }
                    int var23 = class180.field2495 + var17;
                    if (var23 < 104) {
                        var23++;
                    }
                    int var24 = class180.field2495 + var18;
                    if (var24 < 104) {
                        var24++;
                        var20 += 4;
                    }
                    arg0.method489(0, 0, class180.field2495 * 4 + var19, class180.field2495 * 4 + var20);
                    arg0.method483(-16777216);
                    for (int var25 = arg1; var25 <= 3; var25++) {
                        for (int var26 = 0; var26 <= class180.field2495; var26++) {
                            for (int var27 = 0; var27 <= class180.field2495; var27++) {
                                var16[var26][var27] = class256.method2171(2, var25, var22 + var27, arg1, var21 + var26);
                            }
                        }
                        class184.field2541[var25].method1512(0, 0, 1024, var21, var22, var23, var24, var16);
                        if (!class74.field859) {
                            for (int var28 = -4; var28 < class180.field2495; var28++) {
                                for (int var29 = -4; var29 < class180.field2495; var29++) {
                                    int var30 = var17 + var28;
                                    int var31 = var18 + var29;
                                    if (var3 <= var30 && var5 <= var31 && class256.method2171(2, var25, var31, arg1, var30)) {
                                        int var32 = var25;
                                        if (class231.method1980(1, var31, var30)) {
                                            var32 = var25 - 1;
                                        }
                                        if (var32 >= 0) {
                                            class607.method4493(var13, (class180.field2495 - var29) * 4 + var20 - 4, var31, var14, arg0, var32, (byte) 96, var30, var28 * 4 + var19);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class74.field859) {
                        class324 var33 = class429.field6298[arg1];
                        for (int var34 = 0; var34 < class180.field2495; var34++) {
                            for (int var35 = 0; var35 < class180.field2495; var35++) {
                                int var36 = var17 + var34;
                                int var37 = var18 + var35;
                                int var38 = var33.field5117[var36 - var33.field5114][var37 - var33.field5097];
                                if ((var38 & 0x40240000) != 0) {
                                    arg0.method593(-1713569622, var19 + (var34 * 4), (byte) -82, 4, 4, var20 + ((class180.field2495 - var35) * 4) - 4);
                                } else if ((var38 & 0x800000) != 0) {
                                    arg0.method564(-1713569622, (byte) 88, 4, var34 * 4 + var19, (-var35 + class180.field2495) * 4 + var20 + -4);
                                } else if ((var38 & 0x2000000) != 0) {
                                    arg0.method476(4, (class180.field2495 - var35) * 4 + var20 - 4, var34 * 4 + var19 - -3, -1713569622, (byte) -113);
                                } else if ((var38 & 0x8000000) != 0) {
                                    arg0.method564(-1713569622, (byte) 88, 4, var19 + (var34 * 4), (-var35 + class180.field2495) * 4 + var20 + -4 + 3);
                                } else if ((var38 & 0x20000000) != 0) {
                                    arg0.method476(4, (class180.field2495 - var35) * 4 + var20 - 4, var19 - -(var34 * 4), -1713569622, (byte) -96);
                                }
                            }
                        }
                    }
                    arg0.method556(var19, var20, class180.field2495 * 4, class180.field2495 * 4, var15, 2);
                    class338.field5274.method987(((var17 - var3) * 4) + 48, -((var18 - var5) * 4) + -(class180.field2495 * 4) + 464, class180.field2495 * 4, class180.field2495 * 4, var19, var20);
                }
            }
            arg0.method553();
            arg0.method483(-16777215);
            class649.method4771((byte) -35);
            class296.field4505 = 0;
            class265.field4056.method3879(87);
            if (!class74.field859) {
                for (int var39 = var3; var39 < var3 + 104; var39++) {
                    for (int var40 = var5; var40 < var5 + 104; var40++) {
                        for (int var41 = arg1; (arg1 + 1) >= var41 && var41 <= 3; var41++) {
                            if (class256.method2171(2, var41, var40, arg1, var39)) {
                                class583 var42 = (class583) class89.method766(var41, var39, var40);
                                if (var42 == null) {
                                    var42 = (class583) class261.method2196(var41, var39, var40, field1457 == null ? (field1457 = method1078(field1458[1])) : field1457);
                                }
                                if (var42 == null) {
                                    var42 = (class583) class599.method4456(var41, var39, var40);
                                }
                                if (var42 == null) {
                                    var42 = (class583) class271.method2248(var41, var39, var40);
                                }
                                if (var42 != null) {
                                    class198 var43 = class417.field6144.method3030(0, var42.method1083((byte) 108));
                                    if (!var43.field3007 || class709.field10277) {
                                        int var44 = var43.field3061;
                                        if (var43.field3017 != null) {
                                            for (int var45 = 0; var45 < var43.field3017.length; var45++) {
                                                if (var43.field3017[var45] != -1) {
                                                    class198 var46 = class417.field6144.method3030(0, var43.field3017[var45]);
                                                    if (var46.field3061 >= 0) {
                                                        var44 = var46.field3061;
                                                    }
                                                }
                                            }
                                        }
                                        if (var44 >= 0) {
                                            boolean var47 = false;
                                            if (var44 >= 0) {
                                                class306 var48 = class643.field9316.method622(var44, (byte) 111);
                                                if (var48 != null && var48.field4784) {
                                                    var47 = true;
                                                }
                                            }
                                            int var49 = var39;
                                            int var50 = var40;
                                            if (var47) {
                                                int[][] var51 = class429.field6298[var41].field5117;
                                                int var52 = class429.field6298[var41].field5114;
                                                int var53 = class429.field6298[var41].field5097;
                                                for (int var54 = 0; var54 < 10; var54++) {
                                                    int var55 = (int) (Math.random() * 4.0D);
                                                    if (var55 == 0 && var3 < var49 && var39 - 3 < var49 && (var51[var49 - var52 - 1][var50 - var53] & 0x2C0108) == 0) {
                                                        var49--;
                                                    }
                                                    if (var55 == 1 && (var3 + 104 - 1) > var49 && var39 + 3 > var49 && (var51[var49 + 1 - var52][var50 - var53] & 0x2C0180) == 0) {
                                                        var49++;
                                                    }
                                                    if (var55 == 2 && var5 < var50 && var40 - 3 < var50 && (var51[var49 - var52][var50 - var53 - 1] & 0x2C0102) == 0) {
                                                        var50--;
                                                    }
                                                    if (var55 == 3 && var50 < (var5 + 104 - 1) && var50 < var40 + 3 && (var51[var49 - var52][var50 + 1 - var53] & 0x2C0120) == 0) {
                                                        var50++;
                                                    }
                                                }
                                            }
                                            class274.field4148[class296.field4505] = var43.field3014;
                                            class271.field4111[class296.field4505] = var49;
                                            class569.field8418[class296.field4505] = var50;
                                            class296.field4505++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class224.field3436 != null) {
                    class669.field9714.field6927 = 1;
                    class643.field9316.method621(36, 64, 1024);
                    for (int var56 = 0; var56 < class224.field3436.field6047; var56++) {
                        int var57 = class224.field3436.field6050[var56];
                        if (var57 >> 28 == class225.field3446.field6200) {
                            int var58 = (var57 >> 14 & 0x3FFF) - class494.field7101;
                            int var59 = (var57 & 0x3FFF) - class281.field4219;
                            if (var58 >= 0 && var58 < class648.field9378 && var59 >= 0 && class659.field9506 > var59) {
                                class265.field4056.method3868(-108, new class609(var56));
                            } else {
                                class306 var60 = class643.field9316.method622(class224.field3436.field6049[var56], (byte) -110);
                                if (var60.field4780 != null && var58 + var60.field4792 >= 0 && (var60.field4822 + var58) < class648.field9378 && var60.field4801 + var59 >= 0 && class659.field9506 > var59 + var60.field4810) {
                                    class265.field4056.method3868(107, new class609(var56));
                                }
                            }
                        }
                    }
                    class643.field9316.method621(36, 64, 128);
                    class669.field9714.field6927 = 2;
                    class669.field9714.method3642((byte) 111);
                }
            }
            return true;
        } catch (RuntimeException var62) {
            throw class759.method5498(var62, field1458[3] + (arg0 == null ? field1458[0] : field1458[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        try {
            field1452++;
            class236 var1 = null;
            try {
                class42 var2 = class580.field8601.method213((byte) 118, true, "");
                if (arg0 != -3) {
                    return;
                }
                while (var2.field503 == 0) {
                    class151.method1269(false, 1L);
                }
                if (var2.field503 == 1) {
                    var1 = (class236) var2.field499;
                    class163 var3 = class289.field4305.method658(12);
                    var1.method2012(0, var3.field2209, arg0 + 4, var3.field2201);
                }
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method2011(-2968);
                }
            } catch (Exception var5) {
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1458[4] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1078(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1079(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1080(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
