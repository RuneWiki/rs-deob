import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[B")
    private byte[] field68 = new byte[4];

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Lhf;")
    private class76 field70;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    private int field58;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "J")
    private long field62;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "[B")
    public static byte[] field67 = new byte[520];

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Ll;")
    public static class107 field64 = new class107(32);

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Ldd;")
    public static class35 field73 = class180.method1196((byte) -4, ")4lang)4de");

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Ldd;")
    private static class35 field77 = class180.method1196((byte) 126, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Ldd;")
    public static class35 field75 = field77;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Lth;")
    public static class187 field76 = new class187();

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Ldd;")
    public static class35 field79 = class180.method1196((byte) 126, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ldd;")
    public static class35 field80 = class180.method1196((byte) -77, "null");

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "J")
    public static long field74;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field56;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "[B")
    private byte[] field65;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILfd;I)V")
    public static final void method20(int arg0, int arg1, class55 arg2, int arg3) {
        if (arg2.field1247 == 1) {
            class15.method125(arg2.field1383, class20.field387, arg3 ^ 0xFFFFADEA, arg2.field1371, (short) 58, 0, 0L);
            class91.field2027++;
        }
        field71++;
        if (arg2.field1247 == 2 && !class130.field2799) {
            class35 var4 = class21.method190(1, arg2);
            if (var4 != null) {
                class73.field1740++;
                class15.method125(arg2.field1383, class63.method529(new class35[] { class84.field1925, arg2.field1271 }, (byte) 102), -21056, var4, (short) 31, -1, 0L);
            }
        }
        if (arg2.field1247 == 3) {
            class15.method125(arg2.field1383, class20.field387, -21056, class150.field3131, (short) 33, 0, 0L);
            class93.field2066++;
        }
        if (arg2.field1247 == 4) {
            class175.field3573++;
            class15.method125(arg2.field1383, class20.field387, arg3 - 21098, arg2.field1371, (short) 37, 0, 0L);
        }
        if (arg2.field1247 == 5) {
            class74.field1794++;
            class15.method125(arg2.field1383, class20.field387, -21056, arg2.field1371, (short) 22, 0, 0L);
        }
        if (arg2.field1247 == 6 && class101.field2218 == null) {
            class15.method125(arg2.field1383, class20.field387, -21056, arg2.field1371, (short) 30, -1, 0L);
            class183.field3762++;
        }
        if (arg2.field1355 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field1329; var6++) {
                for (int var7 = 0; var7 < arg2.field1249; var7++) {
                    int var8 = (arg2.field1353 + 32) * var7;
                    int var9 = (arg2.field1309 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field1255[var5];
                        var9 += arg2.field1290[var5];
                    }
                    if (var8 <= arg1 && arg0 >= var9 && arg1 < var8 + 32 && arg0 < var9 + 32) {
                        class147.field3100 = var5;
                        class14.field242 = arg2;
                        if (arg2.field1316[var5] > 0) {
                            class46 var10 = class207.method1370((byte) -73, arg2.field1316[var5] - 1);
                            if (class128.field2765 == 1 && class203.method1341(class59.method508(arg2, (byte) 32), 4)) {
                                if (class158.field3225 != arg2.field1383 || class175.field3578 != var5) {
                                    class126.field2738++;
                                    class15.method125(arg2.field1383, class63.method529(new class35[] { class159.field3233, class146.field3081, var10.field995 }, (byte) 59), -21056, class63.field1516, (short) 3, var5, (long) var10.field1008);
                                }
                            } else if (!class130.field2799 || !class203.method1341(class59.method508(arg2, (byte) 32), arg3 - 38)) {
                                class186.field3793++;
                                class35[] var11 = var10.field1019;
                                if (class8.field117) {
                                    var11 = class198.method1300(var11, arg3 ^ 0x2A);
                                }
                                if (class203.method1341(class59.method508(arg2, (byte) 32), arg3 ^ 0x2E)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class88.field1960++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 10;
                                            } else {
                                                var13 = 28;
                                            }
                                            class15.method125(arg2.field1383, class63.method529(new class35[] { class208.field4133, var10.field995 }, (byte) 67), arg3 - 21098, var11[var12], var13, var5, (long) var10.field1008);
                                        } else if (var12 == 4) {
                                            class29.field586++;
                                            class15.method125(arg2.field1383, class63.method529(new class35[] { class208.field4133, var10.field995 }, (byte) 58), -21056, class209.field4146, (short) 28, var5, (long) var10.field1008);
                                        }
                                    }
                                }
                                if (class19.method172(class59.method508(arg2, (byte) 32), (byte) 91)) {
                                    class129.field2776++;
                                    class15.method125(arg2.field1383, class63.method529(new class35[] { class208.field4133, var10.field995 }, (byte) 72), -21056, class63.field1516, (short) 25, var5, (long) var10.field1008);
                                }
                                if (class203.method1341(class59.method508(arg2, (byte) 32), 4) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class98.field2159++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 9;
                                            }
                                            if (var14 == 1) {
                                                var15 = 8;
                                            }
                                            if (var14 == 2) {
                                                var15 = 5;
                                            }
                                            class15.method125(arg2.field1383, class63.method529(new class35[] { class208.field4133, var10.field995 }, (byte) 52), -21056, var11[var14], var15, var5, (long) var10.field1008);
                                        }
                                    }
                                }
                                class35[] var16 = arg2.field1358;
                                if (class8.field117) {
                                    var16 = class198.method1300(var16, arg3 - 42);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class88.field1962++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 13;
                                            }
                                            if (var17 == 1) {
                                                var18 = 44;
                                            }
                                            if (var17 == 2) {
                                                var18 = 42;
                                            }
                                            if (var17 == 3) {
                                                var18 = 51;
                                            }
                                            if (var17 == 4) {
                                                var18 = 38;
                                            }
                                            class15.method125(arg2.field1383, class63.method529(new class35[] { class208.field4133, var10.field995 }, (byte) 71), -21056, var16[var17], var18, var5, (long) var10.field1008);
                                        }
                                    }
                                }
                                class15.method125(arg2.field1383, class63.method529(new class35[] { class208.field4133, var10.field995 }, (byte) 85), -21056, class52.field1181, (short) 1004, var5, (long) var10.field1008);
                            } else if ((class123.field2700 & 0x10) == 16) {
                                class107.field2390++;
                                class15.method125(arg2.field1383, class63.method529(new class35[] { class165.field3343, class146.field3081, var10.field995 }, (byte) 110), -21056, class125.field2736, (short) 17, var5, (long) var10.field1008);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg2.field1291) {
            if (!class130.field2799) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class35 var23 = class133.method908(arg2, 28039, var19);
                    if (var23 != null) {
                        class15.method125(arg2.field1383, arg2.field1263, -21056, var23, (short) 1007, arg2.field1339, (long) (var19 + 1));
                        class99.field2174++;
                    }
                }
                class35 var20 = class21.method190(1, arg2);
                if (var20 != null) {
                    class15.method125(arg2.field1383, arg2.field1263, -21056, var20, (short) 31, arg2.field1339, 0L);
                    class73.field1740++;
                }
                for (int var21 = 4; var21 >= 0; var21--) {
                    class35 var22 = class133.method908(arg2, arg3 ^ 0x6DAD, var21);
                    if (var22 != null) {
                        class15.method125(arg2.field1383, arg2.field1263, arg3 - 21098, var22, (short) 2, arg2.field1339, (long) (var21 + 1));
                        class99.field2174++;
                    }
                }
                if (class32.method307(0, class59.method508(arg2, (byte) 32))) {
                    class15.method125(arg2.field1383, class20.field387, -21056, class50.field1087, (short) 30, arg2.field1339, 0L);
                    class183.field3762++;
                }
            } else if (class92.method672(class59.method508(arg2, (byte) 32), (byte) -102) && (class123.field2700 & 0x20) == 32) {
                class145.field3053++;
                class15.method125(arg2.field1383, class63.method529(new class35[] { class165.field3343, class162.field3289, arg2.field1263 }, (byte) 68), -21056, class125.field2736, (short) 12, arg2.field1339, 0L);
            }
        }
        if (arg3 != 42) {
            method23((byte) 40, 102);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILd;IIIII)V")
    public static final void method21(int arg0, int arg1, int arg2, class31 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field60++;
        class145 var9 = method23((byte) -104, arg0);
        int var10;
        int var11;
        if (arg6 == 1 || arg6 == 3) {
            var11 = var9.field3034;
            var10 = var9.field3017;
        } else {
            var10 = var9.field3034;
            var11 = var9.field3017;
        }
        int var12;
        int var13;
        if (arg1 + var11 > 104) {
            var12 = arg1;
            var13 = arg1 + 1;
        } else {
            var13 = arg1 + (var11 + 1 >> 1);
            var12 = (var11 >> 1) + arg1;
        }
        int var14;
        int var15;
        if (arg2 + var10 > 104) {
            var14 = arg2;
            var15 = arg2 + 1;
        } else {
            var15 = (var10 + 1 >> 1) + arg2;
            var14 = (var10 >> 1) + arg2;
        }
        int var16 = (arg1 << 7) + (var11 << 6);
        int[][] var17 = class206.field4109[arg8];
        int var18 = var17[var12][var14] + var17[var12][var15] + var17[var13][var14] + var17[var13][var15] >> 2;
        int var19 = (arg2 << 7) + (var10 << 6);
        long var20 = (long) ((arg6 | 0x400) << 20 | arg7 << 14 | arg2 << 7 | arg1);
        if (var9.field3043 == 0) {
            var20 |= Long.MIN_VALUE;
        }
        if (var9.field3052 == 1) {
            var20 |= 0x400000L;
        }
        long var22 = var20 | (long) arg0 << 32;
        if (arg7 == 22) {
            class110 var24;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var24 = var9.method990(arg6, var18, -109, var17, var19, 22, var16);
            } else {
                var24 = new class97(arg0, 22, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class97.method738(arg4, arg1, arg2, var18, var24, var22, var9.field3069);
            if (var9.field3045 == 1) {
                arg3.method293(-6327, arg1, arg2);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class110 var50;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var50 = var9.method990(arg6, var18, arg5 ^ 0xFFFFFF90, var17, var19, 10, var16);
            } else {
                var50 = new class97(arg0, 10, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            if (var50 != null) {
                class165.method1091(arg4, arg1, arg2, var18, var11, var10, var50, arg7 == 11 ? 256 : 0, var22);
            }
            if (var9.field3045 != 0) {
                arg3.method302(arg2, var9.field3076, var10, arg5 + 120, var11, arg1);
            }
        } else if (arg7 >= 12) {
            class110 var25;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var25 = var9.method990(arg6, var18, -114, var17, var19, arg7, var16);
            } else {
                var25 = new class97(arg0, arg7, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class165.method1091(arg4, arg1, arg2, var18, 1, 1, var25, 0, var22);
            if (var9.field3045 != 0) {
                arg3.method302(arg2, var9.field3076, var10, 126, var11, arg1);
            }
        } else if (arg7 == 0) {
            class110 var26;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var26 = var9.method990(arg6, var18, arg5 - 33, var17, var19, 0, var16);
            } else {
                var26 = new class97(arg0, 0, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class17.method157(arg4, arg1, arg2, var18, var26, null, class57.field1437[arg6], 0, var22);
            if (var9.field3045 != 0) {
                arg3.method301(arg6, arg7, var9.field3076, arg1, arg2, -1);
            }
        } else if (arg7 == 1) {
            class110 var27;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var27 = var9.method990(arg6, var18, arg5 + 80, var17, var19, 1, var16);
            } else {
                var27 = new class97(arg0, 1, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class17.method157(arg4, arg1, arg2, var18, var27, null, class196.field3904[arg6], 0, var22);
            if (var9.field3045 != 0) {
                arg3.method301(arg6, arg7, var9.field3076, arg1, arg2, -1);
            }
        } else if (arg5 == arg7) {
            int var28 = arg6 + 1 & 0x3;
            class110 var29;
            class110 var30;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var29 = var9.method990(arg6 + 4, var18, 121, var17, var19, 2, var16);
                var30 = var9.method990(var28, var18, 91, var17, var19, 2, var16);
            } else {
                var29 = new class97(arg0, 2, arg6 + 4, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
                var30 = new class97(arg0, 2, var28, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class17.method157(arg4, arg1, arg2, var18, var29, var30, class57.field1437[arg6], class57.field1437[var28], var22);
            if (var9.field3045 != 0) {
                arg3.method301(arg6, arg7, var9.field3076, arg1, arg2, arg5 ^ 0xFFFFFFFD);
            }
        } else if (arg7 == 3) {
            class110 var31;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var31 = var9.method990(arg6, var18, -63, var17, var19, 3, var16);
            } else {
                var31 = new class97(arg0, 3, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class17.method157(arg4, arg1, arg2, var18, var31, null, class196.field3904[arg6], 0, var22);
            if (var9.field3045 != 0) {
                arg3.method301(arg6, arg7, var9.field3076, arg1, arg2, -1);
            }
        } else if (arg7 == 9) {
            class110 var32;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var32 = var9.method990(arg6, var18, -55, var17, var19, arg7, var16);
            } else {
                var32 = new class97(arg0, arg7, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class165.method1091(arg4, arg1, arg2, var18, 1, 1, var32, 0, var22);
            if (var9.field3045 != 0) {
                arg3.method302(arg2, var9.field3076, var10, 104, var11, arg1);
            }
        } else if (arg7 == 4) {
            class110 var33;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var33 = var9.method990(arg6, var18, -72, var17, var19, 4, var16);
            } else {
                var33 = new class97(arg0, 4, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class193.method1262(arg4, arg1, arg2, var18, var33, null, class57.field1437[arg6], 0, 0, 0, var22);
        } else if (arg7 == 5) {
            int var34 = 16;
            long var35 = class111.method812(arg4, arg1, arg2);
            if (var35 != 0L) {
                var34 = method23((byte) -44, Integer.MAX_VALUE & (int) (var35 >>> 32)).field3068;
            }
            class110 var37;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var37 = var9.method990(arg6, var18, 104, var17, var19, 4, var16);
            } else {
                var37 = new class97(arg0, 4, arg6, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class193.method1262(arg4, arg1, arg2, var18, var37, null, class57.field1437[arg6], 0, class13.field235[arg6] * var34, class130.field2806[arg6] * var34, var22);
        } else if (arg7 == 6) {
            long var38 = class111.method812(arg4, arg1, arg2);
            int var40 = 8;
            if (var38 != 0L) {
                var40 = method23((byte) -43, (int) (var38 >>> 32) & Integer.MAX_VALUE).field3068 / 2;
            }
            class110 var41;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var41 = var9.method990(arg6 + 4, var18, 100, var17, var19, 4, var16);
            } else {
                var41 = new class97(arg0, 4, arg6 + 4, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class193.method1262(arg4, arg1, arg2, var18, var41, null, 256, arg6, class49.field1070[arg6] * var40, class78.field1821[arg6] * var40, var22);
        } else if (arg7 == 7) {
            int var42 = arg6 + 2 & 0x3;
            class110 var43;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var43 = var9.method990(var42 + 4, var18, -33, var17, var19, 4, var16);
            } else {
                var43 = new class97(arg0, 4, var42 + 4, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class193.method1262(arg4, arg1, arg2, var18, var43, null, 256, var42, 0, 0, var22);
        } else if (arg7 == 8) {
            int var44 = 8;
            long var45 = class111.method812(arg4, arg1, arg2);
            if (var45 != 0L) {
                var44 = method23((byte) -40, (int) (var45 >>> 32) & Integer.MAX_VALUE).field3068 / 2;
            }
            int var47 = arg6 + 2 & 0x3;
            class110 var48;
            class110 var49;
            if (var9.field3067 == -1 && var9.field3018 == null) {
                var48 = var9.method990(arg6 + 4, var18, 93, var17, var19, 4, var16);
                var49 = var9.method990(var47 + 4, var18, arg5 + 88, var17, var19, 4, var16);
            } else {
                var48 = new class97(arg0, 4, arg6 + 4, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
                var49 = new class97(arg0, 4, var47 + 4, arg8, arg1, arg2, var9.field3067, var9.field3038, null);
            }
            class193.method1262(arg4, arg1, arg2, var18, var48, var49, 256, arg6, class49.field1070[arg6] * var44, class78.field1821[arg6] * var44, var22);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field63++;
        long var6 = class111.method812(arg4, arg0, arg2);
        if (var6 != 0L) {
            int var8 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            int var9 = (52736 - arg2 * 512) * 4 + arg0 * 4 + 24624;
            int var10 = arg1;
            int[] var11 = class174.field3556.field222;
            int var12 = (int) var6 >> 20 & 0x3;
            class145 var13 = method23((byte) -119, var8);
            if (var6 > 0L) {
                var10 = arg3;
            }
            int var14 = (int) var6 >> 14 & 0x1F;
            if (var13.field3065 == -1) {
                if (var14 == 0 || var14 == 2) {
                    if (var12 == 0) {
                        var11[var9] = var10;
                        var11[var9 + 512] = var10;
                        var11[var9 + 1024] = var10;
                        var11[var9 + 1536] = var10;
                    } else if (var12 == 1) {
                        var11[var9] = var10;
                        var11[var9 + 1] = var10;
                        var11[var9 + 2] = var10;
                        var11[var9 + 3] = var10;
                    } else if (var12 == 2) {
                        var11[var9 + 3] = var10;
                        var11[var9 + 512 + 3] = var10;
                        var11[var9 + 3 + 1024] = var10;
                        var11[var9 + 1539] = var10;
                    } else if (var12 == 3) {
                        var11[var9 + 1536] = var10;
                        var11[var9 + 1537] = var10;
                        var11[var9 + 1536 + 2] = var10;
                        var11[var9 + 1536 + 3] = var10;
                    }
                }
                if (var14 == 3) {
                    if (var12 == 0) {
                        var11[var9] = var10;
                    } else if (var12 == 1) {
                        var11[var9 + 3] = var10;
                    } else if (var12 == 2) {
                        var11[var9 + 3 + 1536] = var10;
                    } else if (var12 == 3) {
                        var11[var9 + 1536] = var10;
                    }
                }
                if (var14 == 2) {
                    if (var12 == 3) {
                        var11[var9] = var10;
                        var11[var9 + 512] = var10;
                        var11[var9 + 1024] = var10;
                        var11[var9 + 1536] = var10;
                    } else if (var12 == 0) {
                        var11[var9] = var10;
                        var11[var9 + 1] = var10;
                        var11[var9 + 2] = var10;
                        var11[var9 + 3] = var10;
                    } else if (var12 == 1) {
                        var11[var9 + 3] = var10;
                        var11[var9 + 3 + 512] = var10;
                        var11[var9 + 1027] = var10;
                        var11[var9 + 3 + 1536] = var10;
                    } else if (var12 == 2) {
                        var11[var9 + 1536] = var10;
                        var11[var9 + 1537] = var10;
                        var11[var9 + 1538] = var10;
                        var11[var9 + 1539] = var10;
                    }
                }
            } else {
                class18 var15 = class2.field34[var13.field3065];
                if (var15 != null) {
                    int var16 = (var13.field3017 * 4 - var15.field358) / 2;
                    int var17 = (var13.field3034 * 4 - var15.field356) / 2;
                    var15.method162(var16 + arg0 * 4 + 48, (-var13.field3034 + -arg2 + 104) * 4 + 48 - -var17);
                }
            }
        }
        long var18 = class88.method651(arg4, arg0, arg2);
        if (arg5 != 0) {
            method24(-4);
        }
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) var18 >> 14 & 0x1F;
            int var22 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class145 var23 = method23((byte) -88, var22);
            if (var23.field3065 != -1) {
                class18 var27 = class2.field34[var23.field3065];
                if (var27 != null) {
                    int var28 = (var23.field3034 * 4 - var27.field356) / 2;
                    int var29 = (var23.field3017 * 4 - var27.field358) / 2;
                    var27.method162(arg0 * 4 + var29 + 48, (104 - var23.field3034 + -arg2) * 4 + var28 + 48);
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int var25 = arg0 * 4 + (52736 - arg2 * 512) * 4 + 24624;
                int[] var26 = class174.field3556.field222;
                if (var20 == 0 || var20 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1024 + 1] = var24;
                    var26[var25 + 514] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 513] = var24;
                    var26[var25 + 1024 + 2] = var24;
                    var26[var25 + 1536 + 3] = var24;
                }
            }
        }
        long var30 = class56.method495(arg4, arg0, arg2);
        if (var30 == 0L) {
            return;
        }
        int var32 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class145 var33 = method23((byte) 71, var32);
        if (var33.field3065 == -1) {
            return;
        }
        class18 var34 = class2.field34[var33.field3065];
        if (var34 != null) {
            int var35 = (var33.field3017 * 4 - var34.field358) / 2;
            int var36 = (var33.field3034 * 4 - var34.field356) / 2;
            var34.method162(arg0 * 4 + var35 + 48, (-arg2 + 104 + -var33.field3034) * 4 + var36 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lpb;")
    public static final class145 method23(byte arg0, int arg1) {
        class145 var2 = (class145) class69.field1646.method817(true, (long) arg1);
        int var3 = 119 % ((15 - arg0) / 54);
        field59++;
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class193.field3862.method39(6, -1, arg1);
        class145 var5 = new class145();
        var5.field3059 = arg1;
        if (var4 != null) {
            var5.method1001(new class26(var4), (byte) -73);
        }
        var5.method992(10);
        if (var5.field3040) {
            var5.field3076 = false;
            var5.field3045 = 0;
        }
        class69.field1646.method816(var5, (long) arg1, 16);
        return var5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method24(int arg0) {
        field77 = null;
        if (arg0 != -967) {
            method23((byte) 71, 57);
        }
        field76 = null;
        field80 = null;
        field73 = null;
        field79 = null;
        field75 = null;
        field67 = null;
        field64 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)[B")
    public final byte[] method25(boolean arg0) throws IOException {
        field57++;
        if (this.field62 < class190.method1253((byte) 18)) {
            throw new IOException("fdt");
        }
        if (this.field58 == 0) {
            if (this.field70.field1806 == 2) {
                throw new IOException("fds");
            }
            if (this.field70.field1806 == 1) {
                this.field56 = (DataInputStream) this.field70.field1804;
                this.field58 = 1;
            }
        }
        if (!arg0) {
            return null;
        }
        if (this.field58 == 1) {
            int var2 = this.field56.available();
            if (var2 > 0) {
                if (this.field55 + var2 > 4) {
                    var2 = 4 - this.field55;
                }
                this.field55 += this.field56.read(this.field68, this.field55, var2);
                if (this.field55 == 4) {
                    int var3 = (new class26(this.field68)).method240(8);
                    this.field58 = 2;
                    this.field65 = new byte[var3];
                }
            }
        }
        if (this.field58 == 2) {
            int var4 = this.field56.available();
            if (var4 > 0) {
                if (this.field65.length < this.field72 + var4) {
                    var4 = this.field65.length - this.field72;
                }
                this.field72 += this.field56.read(this.field65, this.field72, var4);
                if (this.field65.length == this.field72) {
                    return this.field65;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lo;IZ)V")
    public static final void method26(class134 arg0, int arg1, boolean arg2) {
        field69++;
        if (class107.field2389 != null) {
            class107.field2389.field527 = arg1 * 8 + 5;
            int var3 = class107.field2389.method240(8);
            int var4 = class107.field2389.method240(8);
            arg0.method917(var3, (byte) 124, var4);
        } else if (!arg2) {
            class57.method501(255, (byte) 0, 0, 255, true, (byte) 95, null);
            class162.field3292[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Le;Ljava/net/URL;)V")
    public class4(class41 arg0, URL arg1) {
        this.field70 = arg0.method388(3927, arg1);
        this.field58 = 0;
        this.field62 = class190.method1253((byte) 18) + 30000L;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZLug;)V")
    public static final void method27(int arg0, boolean arg1, class195 arg2) {
        field54++;
        int var3 = (int) arg2.field2416;
        int var4 = arg2.field3884;
        arg2.method799(-24265);
        if (arg1) {
            class138.method945(var4, 0);
        }
        client.method285(-2039771728, var4);
        class55 var5 = class131.method903(609074640, var3);
        if (var5 != null) {
            class137.method937(var5, (byte) -85);
        }
        if (arg0 != -817150687) {
            return;
        }
        class52.field1166 = false;
        class59.field1469 = 0;
        class209.method1377(class183.field3767, class57.field1436, 5488, class97.field2146, class113.field2533);
        if (class93.field2062 != -1) {
            class82.method623(class93.field2062, 1, (byte) -112);
        }
    }
}
