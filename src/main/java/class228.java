import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class228 extends class183 {

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static volatile int field4279 = -1;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Ldj;")
    public static class44 field4278 = class89.method650(255, "b12_full");

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Z")
    public static volatile boolean field4277 = true;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "Ldj;")
    public static class44 field4282 = class89.method650(255, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field4285 = 0;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Ldj;")
    public static class44 field4284 = class89.method650(255, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "Lo;")
    public static class151 field4280;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "[[[B")
    public static byte[][][] field4281;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
    public static void method1493(int arg0) {
        field4282 = null;
        field4284 = null;
        if (arg0 == 10) {
            field4278 = null;
            field4280 = null;
            field4281 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JI)Ldj;")
    public static final class44 method1494(long arg0, int arg1) {
        field4286++;
        class143.field2542.setTime(new Date(arg0));
        int var3 = class143.field2542.get(7);
        int var4 = class143.field2542.get(5);
        int var5 = class143.field2542.get(2);
        if (arg1 != -21645) {
            method1493(25);
        }
        int var6 = class143.field2542.get(1);
        int var7 = class143.field2542.get(11);
        int var8 = class143.field2542.get(12);
        int var9 = class143.field2542.get(13);
        return class70.method555(new class44[] { class68.field1284[var3 - 1], class63.field1173, class199.method1287(var4 / 10, arg1 ^ 0x548C), class199.method1287(var4 % 10, -1), class111.field2005, class137.field2460[var5], class111.field2005, class199.method1287(var6, -1), class180.field3124, class199.method1287(var7 / 10, arg1 ^ 0x548C), class199.method1287(var7 % 10, arg1 ^ 0x548C), class129.field2308, class199.method1287(var8 / 10, arg1 + 21644), class199.method1287(var8 % 10, -1), class129.field2308, class199.method1287(var9 / 10, arg1 ^ 0x548C), class199.method1287(var9 % 10, -1), class49.field914 }, -3);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public static final void method1495(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4287++;
        for (class29 var5 = (class29) class78.field1503.method1189(arg4); var5 != null; var5 = (class29) class78.field1503.method1192((byte) -124)) {
            if (var5.field513 != -1 || var5.field506 != null) {
                int var6 = 0;
                if (arg2 > var5.field522) {
                    var6 += arg2 - var5.field522;
                } else if (var5.field504 > arg2) {
                    var6 += var5.field504 - arg2;
                }
                if (var5.field516 < arg3) {
                    var6 += arg3 - var5.field516;
                } else if (arg3 < var5.field518) {
                    var6 += var5.field518 - arg3;
                }
                if (var5.field520 < var6 - 64 || class226.field4254 == 0 || var5.field509 != arg1) {
                    if (var5.field510 != null) {
                        class36.field634.method109(var5.field510);
                        var5.field510 = null;
                    }
                    if (var5.field519 != null) {
                        class36.field634.method109(var5.field519);
                        var5.field519 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field520 - var6) * class226.field4254 / var5.field520;
                    if (var5.field510 != null) {
                        var5.field510.method735(var7);
                    } else if (var5.field513 >= 0) {
                        class16 var8 = class16.method142(class62.field1159, var5.field513, 0);
                        if (var8 != null) {
                            class209 var9 = var8.method139().method1358(class135.field2409);
                            class100 var10 = class100.method721(var9, 100, var7);
                            var10.method716(-1);
                            class36.field634.method104(var10);
                            var5.field510 = var10;
                        }
                    }
                    if (var5.field519 != null) {
                        var5.field519.method735(var7);
                        if (!var5.field519.method1146((byte) 96)) {
                            var5.field519 = null;
                        }
                    } else if (var5.field506 != null && (var5.field505 -= arg0) <= 0) {
                        int var11 = (int) (Math.random() * (double) var5.field506.length);
                        class16 var12 = class16.method142(class62.field1159, var5.field506[var11], 0);
                        if (var12 != null) {
                            class209 var13 = var12.method139().method1358(class135.field2409);
                            class100 var14 = class100.method721(var13, 100, var7);
                            var14.method716(0);
                            class36.field634.method104(var14);
                            var5.field519 = var14;
                            var5.field505 = (int) ((double) (var5.field503 - var5.field515) * Math.random()) + var5.field515;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lga;Z)V")
    public static final void method1496(class68 arg0, boolean arg1) {
        class133.field2388.method1185(arg0, (byte) -110);
        while (true) {
            class68 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class68[][] var7;
            class68 var65;
            do {
                class68 var64;
                do {
                    class68 var63;
                    do {
                        class68 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class68) class133.field2388.method1187((byte) -121);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1296);
                                            var3 = var2.field1315;
                                            var4 = var2.field1295;
                                            var5 = var2.field1299;
                                            var6 = var2.field1292;
                                            var7 = class32.field567[var5];
                                            if (!var2.field1309) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class68 var8 = class32.field567[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1296) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class157.field2735 && var3 > class106.field1933) {
                                                    class68 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1296 && (var9.field1309 || (var2.field1293 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class157.field2735 && var3 < class208.field3737 - 1) {
                                                    class68 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1296 && (var10.field1309 || (var2.field1293 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class98.field1799 && var4 > class115.field2046) {
                                                    class68 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1296 && (var11.field1309 || (var2.field1293 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class98.field1799 && var4 < class218.field3960 - 1) {
                                                    class68 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1296 && (var12.field1309 || (var2.field1293 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1309 = false;
                                            if (var2.field1311 != null) {
                                                class68 var13 = var2.field1311;
                                                if (var13.field1313 == null) {
                                                    if (var13.field1301 != null && !class94.method668(0, var3, var4)) {
                                                        class22.method161(var13.field1301, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var3, var4);
                                                    }
                                                } else if (!class94.method668(0, var3, var4)) {
                                                    class173.method1097(var13.field1313, 0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var3, var4);
                                                }
                                                class33 var14 = var13.field1298;
                                                if (var14 != null) {
                                                    var14.field576.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var14.field573 - class191.field3298, var14.field579 - class153.field2666, var14.field586 - class200.field3546, var14.field581);
                                                }
                                                for (int var15 = 0; var15 < var13.field1300; var15++) {
                                                    class106 var16 = var13.field1314[var15];
                                                    if (var16 != null) {
                                                        var16.field1947.method42(var16.field1937, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var16.field1948 - class191.field3298, var16.field1941 - class153.field2666, var16.field1940 - class200.field3546, var16.field1953);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1313 == null) {
                                                if (var2.field1301 != null && !class94.method668(var6, var3, var4)) {
                                                    var17 = true;
                                                    class22.method161(var2.field1301, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var3, var4);
                                                }
                                            } else if (!class94.method668(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field1313.field4390 != 12345678 || class72.field1374 && var5 <= class45.field860) {
                                                    class173.method1097(var2.field1313, var6, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class33 var20 = var2.field1298;
                                            class98 var21 = var2.field1318;
                                            if (var20 != null || var21 != null) {
                                                if (class157.field2735 == var3) {
                                                    var18++;
                                                } else if (class157.field2735 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class98.field1799 == var4) {
                                                    var18 += 3;
                                                } else if (class98.field1799 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = class156.field2695[var18];
                                                var2.field1294 = class207.field3717[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field577 & class60.field1112[var18]) == 0) {
                                                    var2.field1307 = 0;
                                                } else if (var20.field577 == 16) {
                                                    var2.field1307 = 3;
                                                    var2.field1310 = class75.field1441[var18];
                                                    var2.field1312 = 3 - var2.field1310;
                                                } else if (var20.field577 == 32) {
                                                    var2.field1307 = 6;
                                                    var2.field1310 = class131.field2337[var18];
                                                    var2.field1312 = 6 - var2.field1310;
                                                } else if (var20.field577 == 64) {
                                                    var2.field1307 = 12;
                                                    var2.field1310 = class131.field2353[var18];
                                                    var2.field1312 = 12 - var2.field1310;
                                                } else {
                                                    var2.field1307 = 9;
                                                    var2.field1310 = class134.field2390[var18];
                                                    var2.field1312 = 9 - var2.field1310;
                                                }
                                                if ((var20.field577 & var19) != 0 && !class202.method1302(var6, var3, var4, var20.field577)) {
                                                    var20.field576.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var20.field573 - class191.field3298, var20.field579 - class153.field2666, var20.field586 - class200.field3546, var20.field581);
                                                }
                                                if ((var20.field582 & var19) != 0 && !class202.method1302(var6, var3, var4, var20.field582)) {
                                                    var20.field578.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var20.field573 - class191.field3298, var20.field579 - class153.field2666, var20.field586 - class200.field3546, var20.field581);
                                                }
                                            }
                                            if (var21 != null && !class218.method1414(var6, var3, var4, var21.field1813.method67())) {
                                                if ((var21.field1801 & var19) != 0) {
                                                    var21.field1813.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var21.field1816 + var21.field1809 - class191.field3298, var21.field1803 - class153.field2666, var21.field1800 + var21.field1805 - class200.field3546, var21.field1811);
                                                } else if (var21.field1801 == 256) {
                                                    int var22 = var21.field1816 - class191.field3298;
                                                    int var23 = var21.field1803 - class153.field2666;
                                                    int var24 = var21.field1800 - class200.field3546;
                                                    int var25 = var21.field1806;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field1813.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var21.field1809 + var22, var23, var21.field1805 + var24, var21.field1811);
                                                    } else if (var21.field1804 != null) {
                                                        var21.field1804.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var22, var23, var24, var21.field1811);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class220 var28 = var2.field1304;
                                                if (var28 != null) {
                                                    var28.field3977.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var28.field3979 - class191.field3298, var28.field3978 - class153.field2666, var28.field3990 - class200.field3546, var28.field3997);
                                                }
                                                class174 var29 = var2.field1302;
                                                if (var29 != null && var29.field3021 == 0) {
                                                    if (var29.field3022 != null) {
                                                        var29.field3022.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var29.field3014 - class191.field3298, var29.field3020 - class153.field2666, var29.field3023 - class200.field3546, var29.field3015);
                                                    }
                                                    if (var29.field3024 != null) {
                                                        var29.field3024.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var29.field3014 - class191.field3298, var29.field3020 - class153.field2666, var29.field3023 - class200.field3546, var29.field3015);
                                                    }
                                                    if (var29.field3019 != null) {
                                                        var29.field3019.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var29.field3014 - class191.field3298, var29.field3020 - class153.field2666, var29.field3023 - class200.field3546, var29.field3015);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field1293;
                                            if (var30 != 0) {
                                                if (var3 < class157.field2735 && (var30 & 0x4) != 0) {
                                                    class68 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field1296) {
                                                        class133.field2388.method1185(var31, (byte) -110);
                                                    }
                                                }
                                                if (var4 < class98.field1799 && (var30 & 0x2) != 0) {
                                                    class68 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field1296) {
                                                        class133.field2388.method1185(var32, (byte) -110);
                                                    }
                                                }
                                                if (var3 > class157.field2735 && (var30 & 0x1) != 0) {
                                                    class68 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field1296) {
                                                        class133.field2388.method1185(var33, (byte) -110);
                                                    }
                                                }
                                                if (var4 > class98.field1799 && (var30 & 0x8) != 0) {
                                                    class68 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field1296) {
                                                        class133.field2388.method1185(var34, (byte) -110);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1307 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field1300; var36++) {
                                                if (class188.field3248 != var2.field1314[var36].field1944 && (var2.field1308[var36] & var2.field1307) == var2.field1310) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class33 var37 = var2.field1298;
                                                if (!class202.method1302(var6, var3, var4, var37.field577)) {
                                                    var37.field576.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var37.field573 - class191.field3298, var37.field579 - class153.field2666, var37.field586 - class200.field3546, var37.field581);
                                                }
                                                var2.field1307 = 0;
                                            }
                                        }
                                        if (!var2.field1305) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field1300;
                                            var2.field1305 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class106 var41 = var2.field1314[var40];
                                                if (class188.field3248 != var41.field1944) {
                                                    for (int var42 = var41.field1945; var42 <= var41.field1939; var42++) {
                                                        for (int var43 = var41.field1955; var43 <= var41.field1936; var43++) {
                                                            class68 var44 = var7[var42][var43];
                                                            if (var44.field1309) {
                                                                var2.field1305 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field1307 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field1945) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field1939) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field1955) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field1936) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field1307) == var2.field1312) {
                                                                    var2.field1305 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class220.field3996[var39++] = var41;
                                                    int var46 = class157.field2735 - var41.field1945;
                                                    int var47 = var41.field1939 - class157.field2735;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class98.field1799 - var41.field1955;
                                                    int var49 = var41.field1936 - class98.field1799;
                                                    if (var49 > var48) {
                                                        var41.field1949 = var46 + var49;
                                                    } else {
                                                        var41.field1949 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class106 var53 = class220.field3996[var52];
                                                    if (class188.field3248 != var53.field1944) {
                                                        if (var53.field1949 > var50) {
                                                            var50 = var53.field1949;
                                                            var51 = var52;
                                                        } else if (var53.field1949 == var50) {
                                                            int var54 = var53.field1948 - class191.field3298;
                                                            int var55 = var53.field1940 - class200.field3546;
                                                            int var56 = class220.field3996[var51].field1948 - class191.field3298;
                                                            int var57 = class220.field3996[var51].field1940 - class200.field3546;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class106 var58 = class220.field3996[var51];
                                                var58.field1944 = class188.field3248;
                                                if (!class186.method1159(var6, var58.field1945, var58.field1939, var58.field1955, var58.field1936, var58.field1947.method67())) {
                                                    var58.field1947.method42(var58.field1937, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var58.field1948 - class191.field3298, var58.field1941 - class153.field2666, var58.field1940 - class200.field3546, var58.field1953);
                                                }
                                                for (int var59 = var58.field1945; var59 <= var58.field1939; var59++) {
                                                    for (int var60 = var58.field1955; var60 <= var58.field1936; var60++) {
                                                        class68 var61 = var7[var59][var60];
                                                        if (var61.field1307 != 0) {
                                                            class133.field2388.method1185(var61, (byte) -110);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field1296) {
                                                            class133.field2388.method1185(var61, (byte) -110);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1305) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field1305 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1296);
                            } while (var2.field1307 != 0);
                            if (var3 > class157.field2735 || var3 <= class106.field1933) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field1296);
                        if (var3 < class157.field2735 || var3 >= class208.field3737 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field1296);
                    if (var4 > class98.field1799 || var4 <= class115.field2046) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field1296);
                if (var4 < class98.field1799 || var4 >= class218.field3960 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field1296);
            var2.field1296 = false;
            class53.field961--;
            class174 var66 = var2.field1302;
            if (var66 != null && var66.field3021 != 0) {
                if (var66.field3022 != null) {
                    var66.field3022.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var66.field3014 - class191.field3298, var66.field3020 - class153.field2666 - var66.field3021, var66.field3023 - class200.field3546, var66.field3015);
                }
                if (var66.field3024 != null) {
                    var66.field3024.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var66.field3014 - class191.field3298, var66.field3020 - class153.field2666 - var66.field3021, var66.field3023 - class200.field3546, var66.field3015);
                }
                if (var66.field3019 != null) {
                    var66.field3019.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var66.field3014 - class191.field3298, var66.field3020 - class153.field2666 - var66.field3021, var66.field3023 - class200.field3546, var66.field3015);
                }
            }
            if (var2.field1294 != 0) {
                class98 var67 = var2.field1318;
                if (var67 != null && !class218.method1414(var6, var3, var4, var67.field1813.method67())) {
                    if ((var67.field1801 & var2.field1294) != 0) {
                        var67.field1813.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var67.field1816 + var67.field1809 - class191.field3298, var67.field1803 - class153.field2666, var67.field1800 + var67.field1805 - class200.field3546, var67.field1811);
                    } else if (var67.field1801 == 256) {
                        int var68 = var67.field1816 - class191.field3298;
                        int var69 = var67.field1803 - class153.field2666;
                        int var70 = var67.field1800 - class200.field3546;
                        int var71 = var67.field1806;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field1813.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var67.field1809 + var68, var69, var67.field1805 + var70, var67.field1811);
                        } else if (var67.field1804 != null) {
                            var67.field1804.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var68, var69, var70, var67.field1811);
                        }
                    }
                }
                class33 var74 = var2.field1298;
                if (var74 != null) {
                    if ((var74.field582 & var2.field1294) != 0 && !class202.method1302(var6, var3, var4, var74.field582)) {
                        var74.field578.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var74.field573 - class191.field3298, var74.field579 - class153.field2666, var74.field586 - class200.field3546, var74.field581);
                    }
                    if ((var74.field577 & var2.field1294) != 0 && !class202.method1302(var6, var3, var4, var74.field577)) {
                        var74.field576.method42(0, class174.field3030, class156.field2705, class82.field1609, class77.field1494, var74.field573 - class191.field3298, var74.field579 - class153.field2666, var74.field586 - class200.field3546, var74.field581);
                    }
                }
            }
            if (var5 < class163.field2815 - 1) {
                class68 var75 = class32.field567[var5 + 1][var3][var4];
                if (var75 != null && var75.field1296) {
                    class133.field2388.method1185(var75, (byte) -110);
                }
            }
            if (var3 < class157.field2735) {
                class68 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field1296) {
                    class133.field2388.method1185(var76, (byte) -110);
                }
            }
            if (var4 < class98.field1799) {
                class68 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field1296) {
                    class133.field2388.method1185(var77, (byte) -110);
                }
            }
            if (var3 > class157.field2735) {
                class68 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field1296) {
                    class133.field2388.method1185(var78, (byte) -110);
                }
            }
            if (var4 > class98.field1799) {
                class68 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field1296) {
                    class133.field2388.method1185(var79, (byte) -110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
    public class228(int arg0, int arg1) {
        this.field4276 = arg1;
        this.field4283 = arg0;
    }
}
