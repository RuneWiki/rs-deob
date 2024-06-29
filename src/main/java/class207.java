import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class207 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Lwa;")
    public static class200 field4033 = null;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[I")
    public static int[] field4040 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lai;")
    public static class10 field4046 = class44.method278("titlebox", -70);

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lai;")
    private static class10 field4041 = class44.method278("flash1:", -12);

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lai;")
    public static class10 field4042 = field4041;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lai;")
    public static class10 field4037 = field4041;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ldb;")
    public static class32 field4032 = new class32(512);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Lai;")
    public static class10 field4048 = class44.method278("Bitte geben Sie Ihr Passwort ein)3", -110);

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lwa;")
    public static class200 field4039;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)I")
    public static final int method1336(byte arg0, int arg1) {
        field4038++;
        class67 var2 = class28.method180(127, arg1);
        int var3 = var2.field1165;
        int var4 = var2.field1166;
        int var5 = var2.field1184;
        if (arg0 <= 75) {
            field4042 = null;
        }
        int var6 = class107.field1986[var4 - var5];
        return class13.field215[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lme;ILai;)I")
    public static final int method1337(class114 arg0, int arg1, class10 arg2) {
        if (arg1 != -3014) {
            return 64;
        }
        int var3 = arg0.field2170;
        field4043++;
        arg0.method809(-1, arg2.field118);
        arg0.field2170 += class101.field1894.method851(arg2.field118, true, arg0.field2170, arg0.field2160, 0, arg2.field160);
        return arg0.field2170 - var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static final void method1338(int arg0) {
        if (class146.field2786 > 0) {
            class146.field2786--;
        }
        field4036++;
        if (class37.field584 > 1) {
            class37.field584--;
        }
        if (class172.field3322) {
            class172.field3322 = false;
            class175.method1145(-1);
            return;
        }
        for (int var1 = 0; var1 < 100 && class89.method546(true); var1++) {
        }
        if (class174.field3353 != 30) {
            return;
        }
        class54.method376(126, 63, class76.field1323);
        Object var2 = class42.field701.field1944;
        synchronized (class42.field701.field1944) {
            if (!class2.field8) {
                class42.field701.field1957 = 0;
            } else if (class25.field384 != 0 || class42.field701.field1957 >= 40) {
                class171.field3305++;
                class76.field1323.method635((byte) -74, 6);
                class76.field1323.method781(0, 0);
                int var3 = 0;
                int var4 = class76.field1323.field2170;
                for (int var5 = 0; var5 < class42.field701.field1957 && class76.field1323.field2170 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class42.field701.field1958[var5];
                    int var7 = class42.field701.field1959[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class42.field701.field1958[var5] == -1 && class42.field701.field1959[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (class193.field3679 != var7 || class34.field529 != var6) {
                        int var9 = var6 - class34.field529;
                        class34.field529 = var6;
                        int var10 = var7 - class193.field3679;
                        class193.field3679 = var7;
                        if (class170.field3281 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class76.field1323.method793(116, (class170.field3281 << 12) + (var10 << 6) + var9);
                            class170.field3281 = 0;
                        } else if (class170.field3281 < 8) {
                            class76.field1323.method805((class170.field3281 << 19) + (var8 + 8388608), (byte) -127);
                            class170.field3281 = 0;
                        } else {
                            class76.field1323.method786((class170.field3281 << 19) + var8 - 1073741824, (byte) -108);
                            class170.field3281 = 0;
                        }
                    } else if (class170.field3281 < 2047) {
                        class170.field3281++;
                    }
                }
                class76.field1323.method789(class76.field1323.field2170 - var4, (byte) 7);
                if (class42.field701.field1957 > var3) {
                    class42.field701.field1957 -= var3;
                    for (int var11 = 0; var11 < class42.field701.field1957; var11++) {
                        class42.field701.field1959[var11] = class42.field701.field1959[var3 + var11];
                        class42.field701.field1958[var11] = class42.field701.field1958[var3 + var11];
                    }
                } else {
                    class42.field701.field1957 = 0;
                }
            }
        }
        if (class25.field384 != 0) {
            class148.field2826++;
            long var12 = (class170.field3296 - class158.field3048) / 50L;
            class158.field3048 = class170.field3296;
            int var14 = class172.field3330;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            int var15 = class5.field58;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var17 = (int) var12;
            if (class25.field384 == 2) {
                var16 = 1;
            }
            int var18 = var15 * 765 + var14;
            class76.field1323.method635((byte) -118, 36);
            class76.field1323.method808(-34, (var17 << 20) + (var16 << 19) + var18);
        }
        if (class93.field1684 > 0) {
            class93.field1684--;
        }
        if (class182.field3477[96] || class182.field3477[97] || class182.field3477[98] || class182.field3477[99]) {
            class104.field1950 = true;
        }
        if (class104.field1950 && class93.field1684 <= 0) {
            class93.field1684 = 20;
            class104.field1950 = false;
            class9.field108++;
            class76.field1323.method635((byte) -121, 26);
            class76.field1323.method812(false, class171.field3316);
            class76.field1323.method796(46, class36.field577);
        }
        if (class96.field1772 && !class160.field3079) {
            class147.field2806++;
            class160.field3079 = true;
            class76.field1323.method635((byte) -51, 233);
            class76.field1323.method781(arg0 ^ 0xFFFFCEFC, 1);
        }
        if (!class96.field1772 && class160.field3079) {
            class147.field2806++;
            class160.field3079 = false;
            class76.field1323.method635((byte) -41, 233);
            class76.field1323.method781(arg0 + 12548, 0);
        }
        class46.method285(false);
        if (class174.field3353 != 30) {
            return;
        }
        class128.method891((byte) -91);
        method1342((byte) 78);
        class37.field585++;
        if (class37.field585 > 750) {
            class175.method1145(-1);
            return;
        }
        class126.method870(-119);
        class160.method1065(false);
        class11.method79(61);
        if (class126.field2400 != 0) {
            class83.field1451 += 20;
            if (class83.field1451 >= 400) {
                class126.field2400 = 0;
            }
        }
        class145.field2769++;
        if (class169.field3255 != null) {
            class120.field2309++;
            if (class120.field2309 >= 15) {
                class168.method1116(class169.field3255, -106);
                class169.field3255 = null;
            }
        }
        if (class33.field511 != null) {
            class168.method1116(class33.field511, -114);
            class129.field2459++;
            if (class196.field3714 + 5 < class79.field1389 || class79.field1389 < class196.field3714 - 5 || class89.field1559 > class184.field3493 + 5 || class184.field3493 - 5 > class89.field1559) {
                class123.field2356 = true;
            }
            if (class58.field1014 == 0) {
                if (class123.field2356 && class129.field2459 >= 5) {
                    if (class33.field511 == field4039 && class95.field1751 != class80.field1406) {
                        class200 var19 = class33.field511;
                        class6.field73++;
                        byte var20 = 0;
                        if (class77.field1349 == 1 && var19.field3865 == 206) {
                            var20 = 1;
                        }
                        if (var19.field3883[class95.field1751] <= 0) {
                            var20 = 0;
                        }
                        if (class174.method1141(-1, class203.method1318(0, var19))) {
                            int var23 = class95.field1751;
                            int var24 = class80.field1406;
                            var19.field3883[var23] = var19.field3883[var24];
                            var19.field3905[var23] = var19.field3905[var24];
                            var19.field3883[var24] = -1;
                            var19.field3905[var24] = 0;
                        } else if (var20 == 1) {
                            int var21 = class80.field1406;
                            int var22 = class95.field1751;
                            while (var21 != var22) {
                                if (var21 > var22) {
                                    var19.method1301(0, var21 - 1, var21);
                                    var21--;
                                } else if (var22 > var21) {
                                    var19.method1301(0, var21 + 1, var21);
                                    var21++;
                                }
                            }
                        } else {
                            var19.method1301(0, class95.field1751, class80.field1406);
                        }
                        class76.field1323.method635((byte) -69, 63);
                        class76.field1323.method768(class80.field1406, arg0 + 12505);
                        class76.field1323.method791(class33.field511.field3833, true);
                        class76.field1323.method793(85, class95.field1751);
                        class76.field1323.method781(0, var20);
                    }
                } else if ((class27.field406 == 1 || class180.method1165(class53.field946 - 1, arg0 ^ 0xFFFFCEA7)) && class53.field946 > 2) {
                    class139.method947(arg0 ^ 0xFFFFAB56);
                } else if (class53.field946 > 0) {
                    class30.method200(class53.field946 - 1, (byte) 102);
                }
                class25.field384 = 0;
                class120.field2309 = 10;
                class33.field511 = null;
            }
        }
        class15.field252 = 0;
        field4033 = null;
        class118.field2275 = false;
        class13.field209 = false;
        class200 var25 = class77.field1342;
        class77.field1342 = null;
        class200 var26 = class102.field1908;
        class102.field1908 = null;
        while (class151.method1033((byte) 75) && class15.field252 < 128) {
            class175.field3365[class15.field252] = class4.field47;
            class203.field3969[class15.field252] = class83.field1442;
            class15.field252++;
        }
        if (class27.field402 != -1) {
            class201.method1304(0, 765, 0, 0, 0, -19, 503, class27.field402);
        }
        class7.field78++;
        while (true) {
            class5 var27;
            class200 var28;
            class200 var29;
            do {
                var27 = (class5) class5.field54.method1232(false);
                if (var27 == null) {
                    while (true) {
                        class5 var30;
                        class200 var31;
                        class200 var32;
                        do {
                            var30 = (class5) class120.field2303.method1232(false);
                            if (var30 == null) {
                                while (true) {
                                    class5 var33;
                                    class200 var34;
                                    class200 var35;
                                    do {
                                        var33 = (class5) class166.field3175.method1232(false);
                                        if (var33 == null) {
                                            if (class100.field1871 != null) {
                                                class155.method1052((byte) -114);
                                            }
                                            if (class92.field1648 != -1) {
                                                int var36 = class92.field1648;
                                                int var37 = class92.field1631;
                                                boolean var38 = class84.method514(var36, arg0 + 12549, 0, 0, var37, 0, 0, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], true);
                                                if (var38) {
                                                    class95.field1754 = class5.field58;
                                                    class83.field1451 = 0;
                                                    class126.field2400 = 1;
                                                    class21.field323 = class172.field3330;
                                                }
                                                class92.field1648 = -1;
                                            }
                                            class15.method94(91);
                                            if (class77.field1342 != var25) {
                                                if (var25 != null) {
                                                    class168.method1116(var25, -127);
                                                }
                                                if (class77.field1342 != null) {
                                                    class168.method1116(class77.field1342, arg0 + 12427);
                                                }
                                            }
                                            if (class102.field1908 != var26 && class58.field1024 == class155.field3012) {
                                                if (var26 != null) {
                                                    class168.method1116(var26, -92);
                                                }
                                                if (class102.field1908 != null) {
                                                    class168.method1116(class102.field1908, -126);
                                                }
                                            }
                                            if (class102.field1908 == null) {
                                                if (class155.field3012 > 0) {
                                                    class155.field3012--;
                                                }
                                            } else if (class58.field1024 > class155.field3012) {
                                                class155.field3012++;
                                                if (class58.field1024 == class155.field3012) {
                                                    class168.method1116(class102.field1908, arg0 + 12469);
                                                }
                                            }
                                            class182.method1180((byte) 12);
                                            if (class128.field2435) {
                                                class175.method1146(false);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class78.field1361[var39]++;
                                            }
                                            int var40 = class121.method855(-1);
                                            int var41 = class172.method1133((byte) 108);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class146.field2786 = 250;
                                                class50.method357(true, 4000);
                                                class131.field2478++;
                                                class76.field1323.method635((byte) -53, 187);
                                            }
                                            class58.field1018++;
                                            class205.field3976++;
                                            class83.field1449++;
                                            if (class83.field1449 > 500) {
                                                int var42 = (int) (Math.random() * 8.0D);
                                                class83.field1449 = 0;
                                                if ((var42 & 0x1) == 1) {
                                                    class104.field1951 += class174.field3359;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class70.field1209 += class75.field1306;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class152.field2917 += class7.field87;
                                                }
                                            }
                                            if (class104.field1951 < -50) {
                                                class174.field3359 = 2;
                                            }
                                            if (class58.field1018 > 500) {
                                                class58.field1018 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class42.field698 += class125.field2388;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class53.field950 += class80.field1399;
                                                }
                                            }
                                            if (class70.field1209 < -55) {
                                                class75.field1306 = 2;
                                            }
                                            if (class53.field950 < -60) {
                                                class80.field1399 = 2;
                                            }
                                            if (class42.field698 < -20) {
                                                class125.field2388 = 1;
                                            }
                                            if (class70.field1209 > 55) {
                                                class75.field1306 = -2;
                                            }
                                            if (arg0 != -12548) {
                                                field4046 = null;
                                            }
                                            if (class104.field1951 > 50) {
                                                class174.field3359 = -2;
                                            }
                                            if (class152.field2917 < -40) {
                                                class7.field87 = 1;
                                            }
                                            if (class53.field950 > 60) {
                                                class80.field1399 = -2;
                                            }
                                            if (class152.field2917 > 40) {
                                                class7.field87 = -1;
                                            }
                                            if (class42.field698 > 10) {
                                                class125.field2388 = -1;
                                            }
                                            if (class205.field3976 > 50) {
                                                class76.field1323.method635((byte) -70, 87);
                                                class76.field1316++;
                                            }
                                            try {
                                                if (class188.field3593 != null && class76.field1323.field2170 > 0) {
                                                    class188.field3593.method557(class76.field1323.field2170, class76.field1323.field2160, 0, 124);
                                                    class76.field1323.field2170 = 0;
                                                    class205.field3976 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class175.method1145(-1);
                                                return;
                                            }
                                        }
                                        var34 = var33.field55;
                                        if (var34.field3871 < 0) {
                                            break;
                                        }
                                        var35 = class66.method432(var34.field3794, false);
                                    } while (var35 == null || var35.field3796 == null || var35.field3796.length <= var34.field3871 || var35.field3796[var34.field3871] != var34);
                                    class104.method681(200000, var33);
                                }
                            }
                            var31 = var30.field55;
                            if (var31.field3871 < 0) {
                                break;
                            }
                            var32 = class66.method432(var31.field3794, false);
                        } while (var32 == null || var32.field3796 == null || var31.field3871 >= var32.field3796.length || var32.field3796[var31.field3871] != var31);
                        class104.method681(arg0 ^ 0xFFFCC3BC, var30);
                    }
                }
                var28 = var27.field55;
                if (var28.field3871 < 0) {
                    break;
                }
                var29 = class66.method432(var28.field3794, false);
            } while (var29 == null || var29.field3796 == null || var29.field3796.length <= var28.field3871 || var29.field3796[var28.field3871] != var28);
            class104.method681(200000, var27);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Z")
    public static final boolean method1339(int arg0, int arg1) {
        int var2 = 100 / ((60 - arg0) / 41);
        field4034++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1340(byte arg0) {
        field4040 = null;
        field4042 = null;
        field4032 = null;
        field4033 = null;
        field4048 = null;
        field4046 = null;
        if (arg0 != -16) {
            method1337(null, 97, null);
        }
        field4037 = null;
        field4039 = null;
        field4041 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public static final void method1341(byte arg0) {
        field4045++;
        if (!class32.field482) {
            return;
        }
        class200 var1 = class82.method507((byte) 117, class45.field741, class163.field3131);
        if (var1 != null && var1.field3911 != null) {
            class5 var2 = new class5();
            var2.field53 = var1.field3911;
            var2.field55 = var1;
            class104.method681(200000, var2);
        }
        class32.field482 = false;
        if (arg0 != 29) {
            method1338(-14);
        }
        class168.method1116(var1, arg0 - 116);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    private static final void method1342(byte arg0) {
        field4047++;
        for (int var1 = 0; var1 < class135.field2540; var1++) {
            int var10002 = class159.field3062[var1]--;
            if (class159.field3062[var1] >= -10) {
                class199 var3 = class139.field2625[var1];
                if (var3 == null) {
                    var3 = class199.method1288(class151.field2912, class183.field3480[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class159.field3062[var1] += var3.method1286();
                    class139.field2625[var1] = var3;
                }
                if (class159.field3062[var1] < 0) {
                    int var4;
                    if (class169.field3267[var1] == 0) {
                        var4 = class40.field676;
                    } else {
                        int var5 = (class169.field3267[var1] & 0xFF) * 128;
                        int var6 = class169.field3267[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class145.field2767.field1100;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class169.field3267[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class145.field2767.field1097;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var9 + var7 - 128;
                        if (var5 < var10) {
                            class159.field3062[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class120.field2317 / var5;
                    }
                    if (var4 > 0) {
                        class150 var11 = var3.method1285().method1026(class203.field3970);
                        class48 var12 = class48.method303(var11, 100, var4);
                        var12.method302(class176.field3373[var1] - 1);
                        class122.field2344.method1251(var12);
                    }
                    class159.field3062[var1] = -100;
                }
            } else {
                class135.field2540--;
                for (int var2 = var1; var2 < class135.field2540; var2++) {
                    class183.field3480[var2] = class183.field3480[var2 + 1];
                    class139.field2625[var2] = class139.field2625[var2 + 1];
                    class176.field3373[var2] = class176.field3373[var2 + 1];
                    class159.field3062[var2] = class159.field3062[var2 + 1];
                    class169.field3267[var2] = class169.field3267[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 <= 44) {
            method1340((byte) 5);
        }
        if (class61.field1040 && !class76.method470(0)) {
            if (class93.field1688 != 0 && class106.field1966 != -1) {
                class205.method1323(class93.field1688, 10000, class5.field67, false, class106.field1966, 0);
            }
            class61.field1040 = false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static final void method1343(int arg0) {
        class15.field246.method226((byte) -90);
        if (arg0 == 1) {
            class146.field2789.method226((byte) -90);
            field4035++;
        }
    }
}
