import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class217 extends class418 {

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public volatile int field3034 = -1;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Ljava/lang/String;")
    public volatile String field3035;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
    public static int[] field3028 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field3032 = 0;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "F")
    public static float field3033;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lir;")
    public static class185 field3026;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[Ll;")
    public static class315[] field3027;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 4)
    public static void method1429(int arg0) {
        if (arg0 != 0) {
            field3027 = null;
        }
        field3026 = null;
        field3028 = null;
        field3027 = null;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 23)
    public static final void method1430(int arg0) {
        if (arg0 != 1013274631) {
            field3024 = -8;
        }
        class277.field4058 = null;
        field3025++;
        class421.field6121 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V", line = 48)
    public static final void method1431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3023++;
        if (arg3 != 100) {
            return;
        }
        if (class50.field757 == 1) {
            class181.field2424[class48.field754 / 100].method2070(class211.field2860 - 8, class132.field1729 - 8);
        }
        if (class50.field757 == 2) {
            class181.field2424[class48.field754 / 100 + 4].method2070(class211.field2860 - 8, class132.field1729 + -8);
        }
        class39.method292(false);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIZ[BILtj;I[Lao;)[I", line = 78)
    public static final int[] method1432(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, class298 arg7, int arg8, class280[] arg9) {
        field3030++;
        if (!arg4) {
            for (int var10 = 0; var10 < 4; var10++) {
                class280 var11 = arg9[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg1 + var12;
                        int var15 = arg0 + var13;
                        if (var14 >= 0 && class351.field5217 > var14 && var15 >= 0 && class143.field1815 > var15) {
                            var11.method1849(var14, 66560, var15);
                        }
                    }
                }
            }
        }
        class341 var16 = new class341(arg5);
        if (arg3 != -1) {
            return null;
        }
        int var17 = arg1 + arg2;
        int var18 = arg0 + arg6;
        for (int var19 = 0; var19 < arg8; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class158.method1052(var17 + var55, var56 - -arg0, var16, false, arg1 + var55, 0, var19, var18 + var56, 0, 0, arg4, (byte) 21);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field5042.length > var16.field5049) {
            int var22 = var16.method2233((byte) 104);
            if (var22 == 128) {
                class108.field1417[0] = var16.method2239(class294.method1993(arg3, 1076227959));
                class108.field1417[1] = var16.method2212(-2);
                class108.field1417[2] = var16.method2212(-2);
                class108.field1417[3] = var16.method2212(class294.method1993(arg3, 1));
                class108.field1417[4] = var16.method2239(-1076227960);
                var20 = true;
            } else {
                if (var22 != 129) {
                    var16.field5049--;
                    break;
                }
                if (class386.field5642 == null) {
                    class386.field5642 = new byte[4][][];
                }
                for (int var23 = 0; var23 < 4; var23++) {
                    byte var24 = var16.method2211(255);
                    if (var24 == 0 && class386.field5642[var23] != null) {
                        int var25 = arg1;
                        int var26 = arg1 + 64;
                        int var27 = arg0;
                        if (arg0 < 0) {
                            var27 = 0;
                        } else if (arg0 >= class143.field1815) {
                            var27 = class143.field1815;
                        }
                        int var28 = arg0 + 64;
                        if (arg1 < 0) {
                            var25 = 0;
                        } else if (arg1 >= class351.field5217) {
                            var25 = class351.field5217;
                        }
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= class351.field5217) {
                            var26 = class351.field5217;
                        }
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (class143.field1815 <= var28) {
                            var28 = class143.field1815;
                        }
                        while (var25 < var26) {
                            while (var27 < var28) {
                                class386.field5642[var23][var25][var27] = 0;
                                var27++;
                            }
                            var25++;
                        }
                    } else if (var24 == 1) {
                        if (class386.field5642[var23] == null) {
                            class386.field5642[var23] = new byte[class351.field5217 + 1][class143.field1815 + 1];
                        }
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var16.method2211(255);
                                for (int var32 = arg1 + var29; var32 < arg1 + var29 + 4; var32++) {
                                    for (int var33 = var30 + arg0; var33 < (var30 + arg0 + 4); var33++) {
                                        if (var32 >= 0 && class351.field5217 > var32 && var33 >= 0 && var33 < class143.field1815) {
                                            class386.field5642[var23][var32][var33] = var31;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var24 == 2) {
                        if (class386.field5642[var23] == null) {
                            class386.field5642[var23] = new byte[class351.field5217 + 1][class143.field1815 + 1];
                        }
                        if (var23 > 0) {
                            int var34 = arg1;
                            int var35 = arg1 + 64;
                            int var36 = arg0;
                            if (var35 < 0) {
                                var35 = 0;
                            } else if (class351.field5217 <= var35) {
                                var35 = class351.field5217;
                            }
                            if (arg0 < 0) {
                                var36 = 0;
                            } else if (arg0 >= class143.field1815) {
                                var36 = class143.field1815;
                            }
                            if (arg1 < 0) {
                                var34 = 0;
                            } else if (class351.field5217 <= arg1) {
                                var34 = class351.field5217;
                            }
                            int var37 = arg0 + 64;
                            if (var37 < 0) {
                                var37 = 0;
                            } else if (class143.field1815 <= var37) {
                                var37 = class143.field1815;
                            }
                            while (var35 > var34) {
                                while (var36 < var37) {
                                    class386.field5642[var23][var34][var36] = class386.field5642[var23 - 1][var34][var36];
                                    var36++;
                                }
                                var34++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg4) {
            class238 var38 = null;
            while (true) {
                while (var16.field5042.length > var16.field5049) {
                    int var43 = var16.method2233((byte) 104);
                    if (var43 == 0) {
                        var38 = new class238(var16);
                    } else if (var43 == 1) {
                        int var44 = var16.method2233((byte) 104);
                        if (var44 > 0) {
                            for (int var45 = 0; var45 < var44; var45++) {
                                class64 var46 = new class64(var16);
                                if (var46.field965 == 31) {
                                    class25 var47 = class113.method835(var16.method2239(-1076227960), (byte) -60);
                                    var46.method563(4, var47.field442, var47.field443, var47.field446, var47.field452);
                                }
                                var46.field264 += arg1 << 7;
                                var46.field269 += arg0 << 7;
                                int var48 = var46.field264 >> 7;
                                int var49 = var46.field269 >> 7;
                                if (var48 >= 0 && var49 >= 0 && var48 < class351.field5217 && var49 < class143.field1815) {
                                    var46.field272 = class164.field2231[var46.field957][var48][var49] - var46.field272;
                                    if (arg7.method495() > 0) {
                                        class24.method216(var46);
                                    }
                                }
                            }
                        }
                    } else if (var43 == 2) {
                        if (var38 == null) {
                            var38 = new class238();
                        }
                        var38.method1549(var16, -85);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var38 != null) {
                    for (int var39 = 0; var39 < 8; var39++) {
                        for (int var40 = 0; var40 < 8; var40++) {
                            int var41 = (arg1 >> 3) + var39;
                            int var42 = (arg0 >> 3) + var40;
                            if (var41 >= 0 && (class351.field5217 >> 3) > var41 && var42 >= 0 && var42 < (class143.field1815 >> 3)) {
                                class393.method2528(var38, var42, var41, (byte) 117);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (!var21 && class386.field5642 != null) {
            for (int var50 = 0; var50 < 4; var50++) {
                if (class386.field5642[var50] != null) {
                    for (int var51 = 0; var51 < 16; var51++) {
                        for (int var52 = 0; var52 < 16; var52++) {
                            int var53 = (arg1 >> 2) + var51;
                            int var54 = (arg0 >> 2) + var52;
                            if (var53 >= 0 && var53 < 26 && var54 >= 0 && var54 < 26) {
                                class386.field5642[var50][var53][var54] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class108.field1417;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 521)
    public class217(String arg0) {
        this.field3035 = arg0;
    }
}
