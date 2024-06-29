import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class13 {

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field246 = new String[500];

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lik;")
    public static class259 field242 = new class259(64);

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lda;")
    public static class120[] field248 = new class120[0];

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lsa;")
    public static class110 field247 = new class110(16);

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "[S")
    public static short[] field251 = new short[256];

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Lja;")
    public static class64 field250;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Lja;")
    public static class64 field252;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 8)
    public static void method114(int arg0) {
        field252 = null;
        field247 = null;
        if (arg0 > -2) {
            field251 = (short[]) null;
        }
        field246 = null;
        field248 = null;
        field250 = null;
        field242 = null;
        field251 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)I", line = 35)
    public static final int method115(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field245++;
        if (arg0 == var4) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIILob;)V", line = 54)
    public static final void method116(int arg0, int arg1, int arg2, int arg3, class292 arg4) {
        field243++;
        class84.method605((byte) 52);
        if (arg1 != 256) {
            field246 = (String[]) null;
        }
        if (class265.field4126) {
            class262.method1865(arg3, arg2, arg4.field4608 + arg3, arg4.field4499 + arg2);
        } else {
            class182.method1358(arg3, arg2, arg4.field4608 + arg3, arg4.field4499 + arg2);
        }
        if (class17.field331 != 2 && class17.field331 != 5 && class329.field5088 != null) {
            int var5 = class248.field3833 + class204.field3234 & 0x7FF;
            int var6 = 464 - (class19.field356.field1369 / 32);
            int var7 = class19.field356.field1442 / 32 + 48;
            if (class265.field4126) {
                ((class105) class329.field5088).method814(arg3, arg2, arg4.field4608, arg4.field4499, var7, var6, var5, class123.field1970 + 256, (class105) arg4.method2056((byte) -59, false));
            } else {
                ((class7) class329.field5088).method53(arg3, arg2, arg4.field4608, arg4.field4499, var7, var6, var5, class123.field1970 + 256, arg4.field4597, arg4.field4459);
            }
            if (class79.field1204 != null) {
                for (int var8 = 0; var8 < class79.field1204.field3136; var8++) {
                    if (class79.field1204.method1437(var8, (byte) 71)) {
                        int var9 = (class79.field1204.field3139[var8] - class177.field2780) * 4 + (2 - class19.field356.field1442 / 32);
                        int var10 = (class79.field1204.field3137[var8] - class91.field1485) * 4 + 2 - (class19.field356.field1369 / 32);
                        int var11 = class174.field2731[var5];
                        int var12 = var11 * 256 / (class123.field1970 + 256);
                        int var13 = class174.field2732[var5];
                        int var14 = var13 * 256 / (class123.field1970 + 256);
                        int var15 = var10 * var14 - (var9 * var12) >> 16;
                        int var16 = var9 * var14 + var10 * var12 >> 16;
                        class135 var17 = class127.field2035;
                        if (class79.field1204.method1438(var8, (byte) 81) == 1) {
                            var17 = class64.field1021;
                        }
                        if (class79.field1204.method1438(var8, (byte) 81) == 2) {
                            var17 = class95.field1558;
                        }
                        int var18 = var17.method1026(class79.field1204.field3131[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if ((-arg4.field4608) <= var19 && var19 <= arg4.field4608 && var15 >= (-arg4.field4499) && arg4.field4499 >= var15) {
                            int var20 = 16777215;
                            if (class79.field1204.field3144[var8] != -1) {
                                var20 = class79.field1204.field3144[var8];
                            }
                            if (class265.field4126) {
                                class262.method1867((class105) arg4.method2056((byte) -59, false));
                            } else {
                                class182.method1356(arg4.field4597, arg4.field4459);
                            }
                            var17.method1017(class79.field1204.field3131[var8], arg4.field4608 / 2 + var19 + arg3, arg2 - -(arg4.field4499 / 2) - var15, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class265.field4126) {
                                class262.method1859();
                            } else {
                                class182.method1369();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class231.field3666; var21++) {
                int var22 = class276.field4284[var21] * 4 + (2 - (class19.field356.field1369 / 32));
                int var23 = class247.field3819[var21] * 4 + 2 - (class19.field356.field1442 / 32);
                class6 var24 = class28.method190(-127, class151.field2434[var21]);
                if (var24.field56 != null) {
                    var24 = var24.method19(false);
                    if (var24 == null || var24.field104 == -1) {
                        continue;
                    }
                }
                class100.method722(arg3, arg2, 2047, class73.field1134[var24.field104], var22, var23, arg4);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class204 var27 = class261.field4050[class41.field734][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class19.field356.field1442 / 32);
                        int var29 = var26 * 4 + 2 - (class19.field356.field1369 / 32);
                        class100.method722(arg3, arg2, 2047, class94.field1552[0], var29, var28, arg4);
                    }
                }
            }
            for (int var30 = 0; var30 < class77.field1173; var30++) {
                class305 var31 = class138.field2196[class145.field2279[var30]];
                if (var31 != null && var31.method199(arg1 - 198)) {
                    class208 var32 = var31.field4778;
                    if (var32 != null && var32.field3313 != null) {
                        var32 = var32.method1518(arg1 - 5097);
                    }
                    if (var32 != null && var32.field3296 && var32.field3275) {
                        int var33 = var31.field1442 / 32 - (class19.field356.field1442 / 32);
                        int var34 = var31.field1369 / 32 - (class19.field356.field1369 / 32);
                        if (var32.field3327 == -1) {
                            class100.method722(arg3, arg2, 2047, class94.field1552[1], var34, var33, arg4);
                        } else {
                            class100.method722(arg3, arg2, 2047, class73.field1134[var32.field3327], var34, var33, arg4);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class65.field1058; var35++) {
                class30 var36 = class82.field1228[class149.field2398[var35]];
                if (var36 != null && var36.method199(58)) {
                    int var37 = var36.field1442 / 32 - (class19.field356.field1442 / 32);
                    boolean var38 = false;
                    int var39 = var36.field1369 / 32 - class19.field356.field1369 / 32;
                    long var40 = class36.method281(44, var36.field494);
                    for (int var42 = 0; var42 < class319.field4971; var42++) {
                        if (class110.field1824[var42] == var40 && class204.field3246[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class12.field237; var44++) {
                        if (class245.field3789[var44].field3734 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class19.field356.field492 != 0 && var36.field492 != 0 && class19.field356.field492 == var36.field492) {
                        var45 = true;
                    }
                    if (var38) {
                        class100.method722(arg3, arg2, 2047, class94.field1552[3], var39, var37, arg4);
                    } else if (var43) {
                        class100.method722(arg3, arg2, 2047, class94.field1552[5], var39, var37, arg4);
                    } else if (var45) {
                        class100.method722(arg3, arg2, 2047, class94.field1552[4], var39, var37, arg4);
                    } else {
                        class100.method722(arg3, arg2, 2047, class94.field1552[2], var39, var37, arg4);
                    }
                }
            }
            int var46 = 0;
            class210[] var47 = class88.field1341;
            while (var46 < var47.length) {
                class210 var48 = var47[var46];
                if (var48 != null && var48.field3358 != 0 && class205.field3252 % 20 < 10) {
                    if (var48.field3358 == 1 && var48.field3364 >= 0 && class138.field2196.length > var48.field3364) {
                        class305 var49 = class138.field2196[var48.field3364];
                        if (var49 != null) {
                            int var50 = var49.field1442 / 32 - (class19.field356.field1442 / 32);
                            int var51 = var49.field1369 / 32 - (class19.field356.field1369 / 32);
                            class310.method2146(var48.field3360, arg3, (byte) 104, arg4, arg2, var50, var51);
                        }
                    }
                    if (var48.field3358 == 2) {
                        int var52 = (var48.field3361 - class91.field1485) * 4 + 2 - class19.field356.field1369 / 32;
                        int var53 = (var48.field3352 - class177.field2780) * 4 + 2 - (class19.field356.field1442 / 32);
                        class310.method2146(var48.field3360, arg3, (byte) 104, arg4, arg2, var53, var52);
                    }
                    if (var48.field3358 == 10 && var48.field3364 >= 0 && var48.field3364 < class82.field1228.length) {
                        class30 var54 = class82.field1228[var48.field3364];
                        if (var54 != null) {
                            int var55 = var54.field1442 / 32 - (class19.field356.field1442 / 32);
                            int var56 = var54.field1369 / 32 - (class19.field356.field1369 / 32);
                            class310.method2146(var48.field3360, arg3, (byte) 104, arg4, arg2, var55, var56);
                        }
                    }
                }
                var46++;
            }
            if (class25.field417 != 0) {
                int var57 = class25.field417 * 4 + 2 - (class19.field356.field1442 / 32);
                int var58 = class36.field640 * 4 + 2 - (class19.field356.field1369 / 32);
                class100.method722(arg3, arg2, arg1 + 1791, class258.field3983, var58, var57, arg4);
            }
            if (class265.field4126) {
                class262.method1855(arg4.field4608 / 2 + arg3 - 1, arg2 - -(arg4.field4499 / 2) + -1, 3, 3, 16777215);
            } else {
                class182.method1360(arg4.field4608 / 2 + arg3 - 1, arg2 - -(arg4.field4499 / 2) + -1, 3, 3, 16777215);
            }
        } else if (class265.field4126) {
            class126 var59 = arg4.method2056((byte) -59, false);
            if (var59 != null) {
                var59.method59(arg3, arg2);
            }
        } else {
            class182.method1355(arg3, arg2, 0, arg4.field4597, arg4.field4459);
        }
        class301.field4734[arg0] = true;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lhk;I)V", line = 416)
    public static final void method117(class305 arg0, int arg1) {
        field244++;
        for (class254 var2 = (class254) class139.field2216.method1490(200); var2 != null; var2 = (class254) class139.field2216.method1487((byte) 117)) {
            if (var2.field3920 == arg0) {
                if (var2.field3925 != null) {
                    class128.field2045.method358(var2.field3925);
                    var2.field3925 = null;
                }
                var2.method1701(-123);
                return;
            }
        }
        if (arg1 != 32) {
            field242 = (class259) null;
        }
    }
}
