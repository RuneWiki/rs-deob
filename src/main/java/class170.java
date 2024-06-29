import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class170 extends class71 {

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "Lrg;")
    public static class557 field2360;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rs", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field2366;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static final void method1087(byte arg0) {
        field2365++;
        if (arg0 != 53) {
            method1089(-96);
        }
        for (class6 var1 = (class6) class755.field10409.method3618(101); var1 != null; var1 = (class6) class755.field10409.method3619(arg0 - 53)) {
            class38.method209(arg0 ^ 0xFFFFF525, var1, false);
        }
        for (class6 var2 = (class6) class159.field2226.method3618(-45); var2 != null; var2 = (class6) class159.field2226.method3619(arg0 ^ 0x35)) {
            class38.method209(-2800, var2, true);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    public static void method1088(byte arg0) {
        field2360 = null;
        int var1 = -89 / ((arg0 + 25) / 50);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)[Lbk;")
    public static final class446[] method1089(int arg0) {
        if (arg0 > -48) {
            return null;
        } else {
            field2364++;
            return new class446[] { class497.field6961, class3.field26, class76.field1115 };
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZBI)Lwda;")
    public static final class169 method1090(boolean arg0, byte arg1, int arg2) {
        field2359++;
        if (arg1 == -94) {
            long var3 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
            return (class169) class306.field4307.method812(106, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILha;)Z")
    public static final boolean method1091(int arg0, int arg1, class548 arg2) {
        field2363++;
        int var3 = (class277.field4036 - 104) / 2;
        int var4 = (class667.field9202 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class718.method4028((byte) 49, var57, var58, arg1, var6)) {
                        int var59 = var58;
                        if (class479.method2918(var57, true, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class229.method1361(true, var57, var59, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class555.field7741 = arg2.method3244(512, var7, (byte) -59, 512, 0, 512);
        class694.method3917(-1);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x6AA9FF00) << 16;
        if (arg0 != 4) {
            field2360 = null;
        }
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class450.field6247 + 1 + 2][class450.field6247 + 2 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class450.field6247) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class450.field6247) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class450.field6247 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class450.field6247 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg2.method1544(0, 0, class450.field6247 * 4 + var37, class450.field6247 * 4 + var38);
                arg2.method273(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class450.field6247; var50++) {
                        for (int var56 = 0; var56 <= class450.field6247; var56++) {
                            var12[var50][var56] = class718.method4028((byte) 58, var40 + var56, var43, arg1, var39 + var50);
                        }
                    }
                    class550.field7649[var43].method1044(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class617.field8295) {
                        for (int var51 = -4; var51 < class450.field6247; var51++) {
                            for (int var52 = -4; var52 < class450.field6247; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class718.method4028((byte) -82, var54, var43, arg1, var53)) {
                                    int var55 = var43;
                                    if (class479.method2918(var54, true, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class238.method1610(arg2, var55, var10, var51 * 4 + var37, var9, var38 + ((-var52 + class450.field6247) * 4) - 4, arg0 + -2, var53, var54);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class617.field8295) {
                    class228 var44 = class209.field2735[arg1];
                    for (int var45 = 0; var45 < class450.field6247; var45++) {
                        for (int var46 = 0; var46 < class450.field6247; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field3049[var47 - var44.field3063][var48 - var44.field3052];
                            if ((var49 & 0x40240000) != 0) {
                                arg2.method3249(var45 * 4 + var37, 126, 4, 4, -1713569622, (class450.field6247 - var46) * 4 + (var38 - 4));
                            } else if ((var49 & 0x800000) != 0) {
                                arg2.method3243(var37 + (var45 * 4), (byte) -27, (class450.field6247 - var46) * 4 + var38 - 4, -1713569622, 4);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg2.method3254(4, -1713569622, (class450.field6247 - var46) * 4 + var38 - 4, var45 * 4 + (var37 - -3), false);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg2.method3243(var37 + (var45 * 4), (byte) -27, var38 + (class450.field6247 - var46) * 4 + 3 - 4, -1713569622, 4);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg2.method3254(4, -1713569622, (class450.field6247 - var46) * 4 + var38 - 4, var45 * 4 + var37, false);
                            }
                        }
                    }
                }
                arg2.method1412(var37, var38, class450.field6247 * 4, class450.field6247 * 4, var11, 2);
                class555.field7741.method1015((var13 - var3) * 4 + 48, -(class450.field6247 * 4) + 464 - (-var4 + var36) * 4, class450.field6247 * 4, class450.field6247 * 4, var37, var38);
            }
        }
        arg2.method1437();
        arg2.method273(-16777215);
        class235.method1566(16349);
        class746.field10254 = 0;
        class80.field1149.method3615((byte) -67);
        if (!class617.field8295) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg1; (arg1 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class718.method4028((byte) -80, var20, var21, arg1, var14)) {
                            class722 var22 = (class722) class134.method851(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class722) class141.method932(var21, var14, var20, field2366 == null ? (field2366 = method1092("bda")) : field2366);
                            }
                            if (var22 == null) {
                                var22 = (class722) class376.method2357(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class722) class540.method3199(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class220 var23 = class20.field192.method716(6, var22.method782((byte) 121));
                                if (!var23.field2883 || class560.field7795) {
                                    int var24 = var23.field2901;
                                    if (var23.field2966 != null) {
                                        for (int var25 = 0; var25 < var23.field2966.length; var25++) {
                                            if (var23.field2966[var25] != -1) {
                                                class220 var26 = class20.field192.method716(6, var23.field2966[var25]);
                                                if (var26.field2901 >= 0) {
                                                    var24 = var26.field2901;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class21 var28 = class700.field9771.method11(-106, var24);
                                            if (var28 != null && var28.field214) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class209.field2735[var21].field3049;
                                            int var32 = class209.field2735[var21].field3063;
                                            int var33 = class209.field2735[var21].field3052;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class621.field8310[class746.field10254] = var23.field2964;
                                        class274.field3974[class746.field10254] = var29;
                                        class303.field4287[class746.field10254] = var30;
                                        class746.field10254++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class643.field8616 != null) {
                class27.field350.field3498 = 1;
                class700.field9771.method5(false, 64, 1024);
                for (int var15 = 0; var15 < class643.field8616.field5276; var15++) {
                    int var16 = class643.field8616.field5275[var15];
                    if (var16 >> 28 == class388.field5601.field4408) {
                        int var17 = ((var16 & 0xFFFC4C2) >> 14) - class113.field1509;
                        int var18 = (var16 & 0x3FFF) - class587.field7995;
                        if (var17 >= 0 && var17 < class277.field4036 && var18 >= 0 && class667.field9202 > var18) {
                            class80.field1149.method3610(arg0 + 9285, new class27(var15));
                        } else {
                            class21 var19 = class700.field9771.method11(24, class643.field8616.field5274[var15]);
                            if (var19.field222 != null && var17 + var19.field234 >= 0 && class277.field4036 > (var19.field239 + var17) && var18 + var19.field251 >= 0 && var19.field238 + var18 < class667.field9202) {
                                class80.field1149.method3610(9289, new class27(var15));
                            }
                        }
                    }
                }
                class700.field9771.method5(false, 64, 128);
                class27.field350.field3498 = 2;
                class27.field350.method1594((byte) 122);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(II)V")
    public class170(int arg0, int arg1) {
        this.field2361 = arg0;
        this.field2362 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1092(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
