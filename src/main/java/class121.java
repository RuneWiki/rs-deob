import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class121 extends class115 {

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "Lmd;")
    public class249 field2176;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Lud;")
    private static class279 field2173 = class130.method1024("Started 3d Library", 255);

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Lud;")
    public static class279 field2175 = field2173;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "Lud;")
    public static class279 field2171 = class130.method1024("<col=ffffff>", 255);

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field2172 = 0;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lud;")
    public static class279 field2179 = class130.method1024("<)4col>", 255);

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Lud;")
    public static class279 field2178 = class130.method1024("Chargement de la liste des serveurs", 255);

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Lud;")
    public static class279 field2169 = class130.method1024(" ", 255);

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "Lud;")
    public static class279 field2177 = class130.method1024("(U2", 255);

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "[S")
    public static short[] field2184 = new short[256];

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Lud;")
    public static class279 field2181 = class130.method1024("event_opbase", 255);

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "[I")
    public static int[] field2185 = new int[2000];

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Lok;")
    public static class149 field2186;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "Lgf;")
    public static class8 field2182;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class276.field4896 = 0;
        for (int var7 = -1; var7 < (class103.field1931 + class26.field626); var7++) {
            class1 var8;
            if (var7 == -1) {
                var8 = class72.field1420;
            } else if (var7 < class103.field1931) {
                var8 = class96.field1780[class252.field4503[var7]];
            } else {
                var8 = class122.field2196[class200.field3579[var7 - class103.field1931]];
            }
            if (var8 != null && var8.method2(27121)) {
                if (var8 instanceof class102) {
                    class125 var9 = ((class102) var8).field1921;
                    if (var9.field2321 != null) {
                        var9 = var9.method999(13102);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class103.field1931 <= var7) {
                    class125 var10 = ((class102) var8).field1921;
                    if (var10.field2321 != null) {
                        var10 = var10.method999(13102);
                    }
                    if (var10.field2333 >= 0 && var10.field2333 < class120.field2156.length) {
                        int var11;
                        if (var10.field2319 == -1) {
                            var11 = var8.method17((byte) 75) + 15;
                        } else {
                            var11 = var10.field2319 + 15;
                        }
                        class247.method1765(arg0, arg2 >> 1, arg6, arg1 ^ 0x2BD0, arg3 >> 1, var8, var11);
                        if (class209.field3679 > -1) {
                            class120.field2156[var10.field2333].method584(arg4 + class209.field3679 - 12, arg5 + -30 + class12.field385);
                        }
                    }
                    int var12 = 0;
                    class130[] var13 = class268.field4807;
                    while (var12 < var13.length) {
                        class130 var14 = var13[var12];
                        if (var14 != null && var14.field2365 == 1 && class200.field3579[var7 - class103.field1931] == var14.field2374 && (class8.field279 % 20) < 10) {
                            int var15;
                            if (var10.field2319 == -1) {
                                var15 = var8.method17((byte) 75) + 15;
                            } else {
                                var15 = var10.field2319 + 15;
                            }
                            class247.method1765(arg0, arg2 >> 1, arg6, 30593, arg3 >> 1, var8, var15);
                            if (class209.field3679 > -1) {
                                class199.field3557[var14.field2380].method584(class209.field3679 + arg4 - 12, arg5 - (-class12.field385 - -28));
                            }
                        }
                        var12++;
                    }
                } else {
                    int var16 = 30;
                    class239 var17 = (class239) var8;
                    if (var17.field4211 != -1 || var17.field4203 != -1) {
                        class247.method1765(arg0, arg2 >> 1, arg6, 30593, arg3 >> 1, var8, var8.method17((byte) 75) + 15);
                        if (class209.field3679 > -1) {
                            if (var17.field4211 != -1) {
                                class310.field5496[var17.field4211].method584(arg4 + class209.field3679 - 12, class12.field385 + arg5 + -var16);
                                var16 += 25;
                            }
                            if (var17.field4203 != -1) {
                                class120.field2156[var17.field4203].method584(arg4 + class209.field3679 - 12, arg5 - (-class12.field385 - -var16));
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var18 = 0;
                        class130[] var19 = class268.field4807;
                        while (var19.length > var18) {
                            class130 var20 = var19[var18];
                            if (var20 != null && var20.field2365 == 10 && class252.field4503[var7] == var20.field2374) {
                                class247.method1765(arg0, arg2 >> 1, arg6, arg1 + 6960, arg3 >> 1, var8, var8.method17((byte) 75) + 15);
                                if (class209.field3679 > -1) {
                                    class199.field3557[var20.field2380].method584(class209.field3679 + arg4 - 12, -var16 + arg5 - -class12.field385);
                                }
                            }
                            var18++;
                        }
                    }
                }
                if (var8.field42 != null && (class103.field1931 <= var7 || class314.field5536 == 0 || class314.field5536 == 3 || class314.field5536 == 1 && class171.method1329(((class239) var8).field4197, arg1 - 23506))) {
                    class247.method1765(arg0, arg2 >> 1, arg6, arg1 + 6960, arg3 >> 1, var8, var8.method17((byte) 75));
                    if (class209.field3679 > -1 && class73.field1438 > class276.field4896) {
                        class73.field1443[class276.field4896] = class292.field5210.method411(var8.field42) / 2;
                        class73.field1442[class276.field4896] = class292.field5210.field995;
                        class73.field1439[class276.field4896] = class209.field3679;
                        class73.field1444[class276.field4896] = class12.field385;
                        class73.field1440[class276.field4896] = var8.field1;
                        class73.field1448[class276.field4896] = var8.field37;
                        class73.field1445[class276.field4896] = var8.field36;
                        class73.field1446[class276.field4896] = var8.field42;
                        class276.field4896++;
                    }
                }
                if (class8.field279 < var8.field21) {
                    class70 var21 = class103.field1940[0];
                    class70 var22 = class103.field1940[1];
                    int var23;
                    if ((var8 instanceof class102)) {
                        class102 var24 = (class102) var8;
                        class70[] var25 = (class70[]) ((class70[]) class1.field97.method1336((long) var24.field1921.field2277, 0));
                        if (var25 == null) {
                            var25 = class149.method1166(false, class266.field4799, var24.field1921.field2277, 0);
                            if (var25 != null) {
                                class1.field97.method1331(var25, arg1 ^ 0x2A4C, (long) var24.field1921.field2277);
                            }
                        }
                        class125 var26 = var24.field1921;
                        if (var25 != null && var25.length == 2) {
                            var21 = var25[0];
                            var22 = var25[1];
                        }
                        if (var26.field2319 == -1) {
                            var23 = var8.method17((byte) 75);
                        } else {
                            var23 = var26.field2319;
                        }
                    } else {
                        var23 = var8.method17((byte) 75);
                    }
                    class247.method1765(arg0, arg2 >> 1, arg6, 30593, arg3 >> 1, var8, var23 + var21.field1375 + 10);
                    if (class209.field3679 > -1) {
                        int var27 = arg5 - (3 - class12.field385);
                        int var28 = class209.field3679 + arg4 - (var21.field1377 >> 1);
                        var21.method584(var28, var27);
                        int var29 = var21.field1375;
                        int var30 = var8.field48 * var21.field1377 / 255;
                        if (class97.field1824) {
                            class256.method1835(var28, var27, var28 + var30, var27 + var29);
                        } else {
                            class146.method1107(var28, var27, var28 + var30, var27 + var29);
                        }
                        var22.method584(var28, var27);
                        if (class97.field1824) {
                            class256.method1830(arg4, arg5, arg2 + arg4, arg3 + arg5);
                        } else {
                            class146.method1127(arg4, arg5, arg4 + arg2, arg3 + arg5);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class8.field279 < var8.field96[var31]) {
                        int var32;
                        if ((var8 instanceof class102)) {
                            class102 var33 = (class102) var8;
                            class125 var34 = var33.field1921;
                            if (var34.field2319 == -1) {
                                var32 = var8.method17((byte) 75) / 2;
                            } else {
                                var32 = var34.field2319 / 2;
                            }
                        } else {
                            var32 = var8.method17((byte) 75) / 2;
                        }
                        class247.method1765(arg0, arg2 >> 1, arg6, 30593, arg3 >> 1, var8, var32);
                        if (class209.field3679 > -1) {
                            if (var31 == 1) {
                                class12.field385 -= 20;
                            }
                            if (var31 == 2) {
                                class12.field385 -= 10;
                                class209.field3679 -= 15;
                            }
                            if (var31 == 3) {
                                class12.field385 -= 10;
                                class209.field3679 += 15;
                            }
                            class59.field1244[var8.field57[var31]].method584(class209.field3679 + arg4 - 12, class12.field385 + arg5 + -12);
                            class109.field2015.method409(class191.method1447(5, var8.field17[var31]), arg4 - (1 - class209.field3679), arg5 + 3 + class12.field385, 16777215, 0);
                        }
                    }
                }
            }
        }
        field2170++;
        for (int var35 = 0; var35 < class276.field4896; var35++) {
            int var36 = class73.field1439[var35];
            int var37 = class73.field1444[var35];
            int var38 = class73.field1443[var35];
            boolean var39 = true;
            int var40 = class73.field1442[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var37 + 2 > class73.field1444[var41] + -class73.field1442[var41] && (var37 - var40) < (class73.field1444[var41] + 2) && (var36 - var38) < (class73.field1443[var41] + class73.field1439[var41]) && class73.field1439[var41] - class73.field1443[var41] < var36 + var38 && var37 > class73.field1444[var41] - class73.field1442[var41]) {
                        var39 = true;
                        var37 = class73.field1444[var41] - class73.field1442[var41];
                    }
                }
            }
            class209.field3679 = class73.field1439[var35];
            class12.field385 = class73.field1444[var35] = var37;
            class279 var42 = class73.field1446[var35];
            if (class233.field4079 == 0) {
                int var43 = 16776960;
                if (class73.field1440[var35] < 6) {
                    var43 = class164.field2949[class73.field1440[var35]];
                }
                if (class73.field1440[var35] == 6) {
                    var43 = class59.field1239 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class73.field1440[var35] == 7) {
                    var43 = class59.field1239 % 20 >= 10 ? 65535 : 255;
                }
                if (class73.field1440[var35] == 8) {
                    var43 = class59.field1239 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class73.field1440[var35] == 9) {
                    int var44 = 150 - class73.field1445[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 + 16776960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 * 5) + 65280 - 500;
                    }
                }
                if (class73.field1440[var35] == 10) {
                    int var45 = 150 - class73.field1445[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 * 327680 - 16384000);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 255 + 500 - (var45 * 5) - 32768000;
                    }
                }
                if (class73.field1440[var35] == 11) {
                    int var46 = 150 - class73.field1445[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - (var46 * 327680);
                    }
                }
                if (class73.field1448[var35] == 0) {
                    class292.field5210.method409(var42, arg4 + class209.field3679, arg5 - -class12.field385, var43, 0);
                }
                if (class73.field1448[var35] == 1) {
                    class292.field5210.method400(var42, class209.field3679 + arg4, arg5 - -class12.field385, var43, 0, class59.field1239);
                }
                if (class73.field1448[var35] == 2) {
                    class292.field5210.method407(var42, class209.field3679 + arg4, arg5 - -class12.field385, var43, 0, class59.field1239);
                }
                if (class73.field1448[var35] == 3) {
                    class292.field5210.method417(var42, class209.field3679 + arg4, class12.field385 + arg5, var43, 0, class59.field1239, 150 - class73.field1445[var35]);
                }
                if (class73.field1448[var35] == 4) {
                    int var47 = (150 - class73.field1445[var35]) * (class292.field5210.method411(var42) + 100) / 150;
                    if (class97.field1824) {
                        class256.method1835(arg4 + class209.field3679 - 50, arg5, class209.field3679 + arg4 + 50, arg3 + arg5);
                    } else {
                        class146.method1107(class209.field3679 + arg4 - 50, arg5, class209.field3679 + arg4 + 50, arg5 - -arg3);
                    }
                    class292.field5210.method419(var42, arg4 + class209.field3679 + 50 - var47, class12.field385 + arg5, var43, 0);
                    if (class97.field1824) {
                        class256.method1830(arg4, arg5, arg2 + arg4, arg3 + arg5);
                    } else {
                        class146.method1127(arg4, arg5, arg2 + arg4, arg3 + arg5);
                    }
                }
                if (class73.field1448[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class73.field1445[var35];
                    if (class97.field1824) {
                        class256.method1835(arg4, class12.field385 + arg5 - class292.field5210.field995 - 1, arg2 + arg4, class12.field385 + arg5 + 5);
                    } else {
                        class146.method1107(arg4, arg5 + class12.field385 - class292.field5210.field995 - 1, arg2 + arg4, class12.field385 + arg5 + 5);
                    }
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    class292.field5210.method409(var42, class209.field3679 + arg4, arg5 - -class12.field385 - -var48, var43, 0);
                    if (class97.field1824) {
                        class256.method1830(arg4, arg5, arg2 + arg4, arg5 - -arg3);
                    } else {
                        class146.method1127(arg4, arg5, arg4 + arg2, arg3 + arg5);
                    }
                }
            } else {
                class292.field5210.method409(var42, class209.field3679 + arg4, class12.field385 + arg5, 16776960, 0);
            }
        }
        if (arg1 != 23633) {
            field2179 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIILsf;Lsf;IIJ)V", line = 488)
    public static final void method958(int arg0, int arg1, int arg2, int arg3, class108 arg4, class108 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class17 var10 = new class17();
        var10.field530 = arg8;
        var10.field528 = arg1 * 128 + 64;
        var10.field531 = arg2 * 128 + 64;
        var10.field527 = arg3;
        var10.field522 = arg4;
        var10.field525 = arg5;
        var10.field533 = arg6;
        var10.field521 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class24.field619[var11][arg1][arg2] == null) {
                class24.field619[var11][arg1][arg2] = new class191(var11, arg1, arg2);
            }
        }
        class24.field619[arg0][arg1][arg2].field3439 = var10;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 518)
    public static final void method959(int arg0) {
        if (arg0 != -21098) {
            method960(true);
        }
        field2183++;
        class101.field1887.method1338((byte) -111);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lmd;)V", line = 542)
    public class121(class249 arg0) {
        this.field2176 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V", line = 577)
    public static void method960(boolean arg0) {
        field2177 = null;
        field2173 = null;
        field2181 = null;
        if (arg0) {
            method959(-46);
        }
        field2169 = null;
        field2175 = null;
        field2184 = null;
        field2179 = null;
        field2182 = null;
        field2185 = null;
        field2186 = null;
        field2178 = null;
        field2171 = null;
    }
}
