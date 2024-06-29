import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class26 extends class69 {

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[I")
    public static int[] field312 = new int[14];

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field314 = "flash1:";

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "B")
    public byte field318;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Lcg;")
    public static class36 field316;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Ljava/lang/String;")
    public String field317;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Ljava/lang/String;")
    public String field323;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    public static final void method180(int arg0) {
        if (class122.field2048 < 0) {
            class237.field3791 = -1;
            class150.field2407 = -1;
            class122.field2048 = 0;
        }
        if (class183.field2927 < class122.field2048) {
            class237.field3791 = -1;
            class122.field2048 = class183.field2927;
            class150.field2407 = -1;
        }
        if (class266.field4320 < 0) {
            class150.field2407 = -1;
            class237.field3791 = -1;
            class266.field4320 = 0;
        }
        if (class266.field4320 > class225.field3569) {
            class237.field3791 = -1;
            class150.field2407 = -1;
            class266.field4320 = class225.field3569;
        }
        field319++;
        if (arg0 < 21) {
            method180(-40);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field324++;
        if (class262.field4151 == 0) {
            int var7 = class246.field3953;
            int var8 = class41.field490;
            int var9 = class237.field3781;
            int var10 = (arg5 - arg6) * (var8 - var9) / arg4 + var9;
            int var11 = class172.field2775;
            int var12 = (arg1 - arg2) * (var11 - var7) / arg0 + var7;
            if (class290.field4632 && (class125.field2098 & 0x40) != 0) {
                class103 var13 = class122.method859(class221.field3526, (byte) -102, class254.field4063);
                if (var13 == null) {
                    class238.method1566(96);
                } else {
                    class38.method301(var12, class117.field1995, " ->", (short) 12, class17.field201, 89, 0L, var10);
                }
            } else {
                class33.field398++;
                if (class189.field3026 == 1) {
                    class38.method301(var12, class193.field3104, "", (short) 22, -1, 107, 0L, var10);
                }
                class38.method301(var12, class186.field2981, "", (short) 7, -1, arg3 ^ 0x7E, 0L, var10);
            }
        }
        long var14 = -1L;
        int var16 = 0;
        if (arg3 != 1) {
            return;
        }
        while (var16 < class177.field2872) {
            long var17 = class64.field907[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3F87) >> 7;
            int var21 = ((int) var17 & 0x74A21179) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                label371: {
                    var14 = var17;
                    if (var21 == 2 && class98.method704(class28.field336, var19, var20, var17)) {
                        class94 var23 = class119.method842(124, var22);
                        if (var23.field1345 != null) {
                            var23 = var23.method658(arg3 ^ 0xEFB);
                        }
                        if (var23 == null) {
                            break label371;
                        }
                        if (class262.field4151 == 1) {
                            class38.method301(var19, class46.field556, class74.field1010 + " -> <col=00ffff>" + var23.field1377, (short) 9, class38.field466, 71, var17, var20);
                            class287.field4594++;
                        } else if (class290.field4632) {
                            class19 var24 = class274.field4429 == -1 ? null : class18.method129(11, class274.field4429);
                            if ((class125.field2098 & 0x4) != 0 && (var24 == null || var23.method660((byte) 1, class274.field4429, var24.field222) != var24.field222)) {
                                class250.field3995++;
                                class38.method301(var19, class117.field1995, class21.field268 + " -> <col=00ffff>" + var23.field1377, (short) 59, class17.field201, 95, var17, var20);
                            }
                        } else {
                            String[] var25 = var23.field1411;
                            if (class71.field976) {
                                var25 = class143.method969(var25, (byte) 85);
                            }
                            class104.field1746++;
                            if (var25 != null) {
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25[var26] != null) {
                                        class249.field3988++;
                                        short var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 13;
                                        }
                                        if (var26 == 1) {
                                            var27 = 42;
                                        }
                                        int var28 = -1;
                                        if (var23.field1391 == var26) {
                                            var28 = var23.field1346;
                                        }
                                        if (var26 == 2) {
                                            var27 = 34;
                                        }
                                        if (var26 == 3) {
                                            var27 = 31;
                                        }
                                        if (var23.field1387 == var26) {
                                            var28 = var23.field1379;
                                        }
                                        if (var26 == 4) {
                                            var27 = 1004;
                                        }
                                        class38.method301(var19, var25[var26], "<col=00ffff>" + var23.field1377, var27, var28, 91, var17, var20);
                                    }
                                }
                            }
                            class38.method301(var19, class45.field543, "<col=00ffff>" + var23.field1377, (short) 1003, class227.field3593, 109, (long) var23.field1388, var20);
                        }
                    }
                    if (var21 == 1) {
                        class275 var29 = class198.field3193[var22];
                        if ((var29.field4439.field4262 & 0x1) == 0 && (var29.field614 & 0x7F) == 0 && (var29.field613 & 0x7F) == 0 || (var29.field4439.field4262 & 0x1) == 1 && (var29.field614 & 0x7F) == 64 && (var29.field613 & 0x7F) == 64) {
                            int var30 = var29.field614 + 64 - (var29.field4439.field4262 * 64);
                            int var31 = var29.field613 - (var29.field4439.field4262 - 1) * 64;
                            for (int var32 = 0; var32 < class251.field4027; var32++) {
                                class275 var37 = class198.field3193[class134.field2250[var32]];
                                if (var37 != null && !var37.field625 && var29 != var37 && var37.field651) {
                                    int var38 = var37.field614 - ((var37.field4439.field4262 - 1) * 64);
                                    int var39 = var37.field613 - ((var37.field4439.field4262 - 1) * 64);
                                    if (var38 >= var30 && (var29.field4439.field4262 - (var38 - var30 >> 7)) >= var37.field4439.field4262 && var39 >= var31 && var37.field4439.field4262 <= (var29.field4439.field4262 - (var39 - var31 >> 7))) {
                                        class293.method1961(var37.field4439, var19, arg3 ^ 0x72, class134.field2250[var32], var20);
                                        var37.field625 = true;
                                    }
                                }
                            }
                            for (int var33 = 0; var33 < class70.field969; var33++) {
                                class235 var34 = class260.field4141[class51.field721[var33]];
                                if (var34 != null && !var34.field625 && var34.field651) {
                                    int var35 = var34.field614 - ((var34.method385((byte) 80) - 1) * 64);
                                    int var36 = var34.field613 - ((var34.method385((byte) -53) - 1) * 64);
                                    if (var30 <= var35 && var34.method385((byte) 118) <= var29.field4439.field4262 - (var35 - var30 >> 7) && var31 <= var36 && var34.method385((byte) 110) <= (var29.field4439.field4262 - (var36 - var31 >> 7))) {
                                        class147.method1006(class51.field721[var33], var34, var20, var19, (byte) -74);
                                        var34.field625 = true;
                                    }
                                }
                            }
                        }
                        if (var29.field625) {
                            break label371;
                        }
                        class293.method1961(var29.field4439, var19, -45, var22, var20);
                        var29.field625 = true;
                    }
                    if (var21 == 0) {
                        class235 var40 = class260.field4141[var22];
                        if ((var40.field614 & 0x7F) == 64 && (var40.field613 & 0x7F) == 64) {
                            int var41 = var40.field614 - (var40.method385((byte) -92) - 1) * 64;
                            int var42 = var40.field613 - ((var40.method385((byte) 121) - 1) * 64);
                            for (int var43 = 0; var43 < class251.field4027; var43++) {
                                class275 var48 = class198.field3193[class134.field2250[var43]];
                                if (var48 != null && !var48.field625 && var48.field651) {
                                    int var49 = var48.field614 + 64 - (var48.field4439.field4262 * 64);
                                    int var50 = var48.field613 - ((var48.field4439.field4262 - 1) * 64);
                                    if (var41 <= var49 && var48.field4439.field4262 <= var40.method385((byte) 123) - (var49 - var41 >> 7) && var42 <= var50 && var48.field4439.field4262 <= var40.method385((byte) -122) - (var50 - var42 >> 7)) {
                                        class293.method1961(var48.field4439, var19, -107, class134.field2250[var43], var20);
                                        var48.field625 = true;
                                    }
                                }
                            }
                            for (int var44 = 0; var44 < class70.field969; var44++) {
                                class235 var45 = class260.field4141[class51.field721[var44]];
                                if (var45 != null && !var45.field625 && var40 != var45 && var45.field651) {
                                    int var46 = var45.field614 - ((var45.method385((byte) -101) - 1) * 64);
                                    int var47 = var45.field613 - (var45.method385((byte) -105) - 1) * 64;
                                    if (var46 >= var41 && var45.method385((byte) 123) <= var40.method385((byte) -99) - (var46 - var41 >> 7) && var42 <= var47 && var45.method385((byte) -123) <= var40.method385((byte) 81) - (var47 - var42 >> 7)) {
                                        class147.method1006(class51.field721[var44], var45, var20, var19, (byte) -71);
                                        var45.field625 = true;
                                    }
                                }
                            }
                        }
                        if (var40.field625) {
                            break label371;
                        }
                        class147.method1006(var22, var40, var20, var19, (byte) -113);
                        var40.field625 = true;
                    }
                    if (var21 == 3) {
                        class48 var51 = class244.field3913[class28.field336][var19][var20];
                        if (var51 != null) {
                            for (class266 var52 = (class266) var51.method369(arg3 + 117); var52 != null; var52 = (class266) var51.method366(109)) {
                                int var53 = var52.field4312.field3250;
                                class208 var54 = class64.method514(var53, arg3 ^ 0x1);
                                if (class262.field4151 == 1) {
                                    class275.field4430++;
                                    class38.method301(var19, class46.field556, class74.field1010 + " -> <col=ff9040>" + var54.field3358, (short) 5, class38.field466, arg3 ^ 0x5A, (long) var53, var20);
                                } else if (class290.field4632) {
                                    class19 var55 = class274.field4429 == -1 ? null : class18.method129(arg3 ^ 0xA, class274.field4429);
                                    if ((class125.field2098 & 0x1) != 0 && (var55 == null || var54.method1406(var55.field222, class274.field4429, false) != var55.field222)) {
                                        class146.field2353++;
                                        class38.method301(var19, class117.field1995, class21.field268 + " -> <col=ff9040>" + var54.field3358, (short) 14, class17.field201, 116, (long) var53, var20);
                                    }
                                } else {
                                    class25.field302++;
                                    String[] var56 = var54.field3353;
                                    if (class71.field976) {
                                        var56 = class143.method969(var56, (byte) 85);
                                    }
                                    for (int var57 = 4; var57 >= 0; var57--) {
                                        if (var56 != null && var56[var57] != null) {
                                            class227.field3590++;
                                            int var58 = -1;
                                            byte var59 = 0;
                                            if (var54.field3395 == var57) {
                                                var58 = var54.field3415;
                                            }
                                            if (var57 == 0) {
                                                var59 = 3;
                                            }
                                            if (var54.field3411 == var57) {
                                                var58 = var54.field3413;
                                            }
                                            if (var57 == 1) {
                                                var59 = 21;
                                            }
                                            if (var57 == 2) {
                                                var59 = 2;
                                            }
                                            if (var57 == 3) {
                                                var59 = 29;
                                            }
                                            if (var57 == 4) {
                                                var59 = 1;
                                            }
                                            class38.method301(var19, var56[var57], "<col=ff9040>" + var54.field3358, var59, var58, arg3 + 85, (long) var53, var20);
                                        }
                                    }
                                    class38.method301(var19, class45.field543, "<col=ff9040>" + var54.field3358, (short) 1005, class227.field3593, 114, (long) var53, var20);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public static void method182(int arg0) {
        field316 = null;
        field314 = null;
        field312 = null;
        int var1 = 11 / ((arg0 - 81) / 39);
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V")
    public static final void method183(int arg0) {
        field322++;
        int var1 = class283.field4524.method1119(class205.field3282);
        for (int var2 = arg0; var2 < class202.field3248; var2++) {
            int var6 = class283.field4524.method1119(class207.method1396((byte) 75, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        int var3 = class202.field3248 * 15 + 21;
        var1 += 8;
        int var4 = class120.field2031 - var1 / 2;
        int var5 = class104.field1752;
        if (class107.field1856 < (var1 + var4)) {
            var4 = class107.field1856 - var1;
        }
        if (class97.field1469 < var3 + var5) {
            var5 = class97.field1469 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (class119.field2009 == 1) {
            if (class216.field3470 == class120.field2031 && class215.field3465 == class104.field1752) {
                class179.field2897 = var1;
                class240.field3852 = true;
                class250.field4007 = var4;
                class119.field2009 = 0;
                class214.field3451 = var5;
                class283.field4512 = (class41.field482 ? 26 : 22) + class202.field3248 * 15;
            }
        } else if (class266.field4319 == class120.field2031 && class232.field3696 == class104.field1752) {
            class240.field3852 = true;
            class179.field2897 = var1;
            class250.field4007 = var4;
            class214.field3451 = var5;
            class119.field2009 = 0;
            class283.field4512 = class202.field3248 * 15 + (class41.field482 ? 26 : 22);
        } else {
            class119.field2009 = 1;
            class216.field3470 = class266.field4319;
            class215.field3465 = class232.field3696;
        }
    }
}
