import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class257 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4103 = "green:";

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4107 = "slide:";

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Leg;")
    public static class272 field4100 = new class272(200);

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field4109 = 3;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4112 = "wave:";

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4111 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lne;")
    public static class212 field4104;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Z")
    public static boolean field4113;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -51) {
            field4107 = null;
        }
        field4108++;
        class200.field3230 = 0;
        for (int var7 = -1; var7 < (class70.field969 + class251.field4027); var7++) {
            class49 var23;
            if (var7 == -1) {
                var23 = class197.field3179;
            } else if (class70.field969 <= var7) {
                var23 = class198.field3193[class134.field2250[var7 - class70.field969]];
            } else {
                var23 = class260.field4141[class51.field721[var7]];
            }
            if (var23 != null && var23.method376(-11127)) {
                if (var23 instanceof class275) {
                    class265 var24 = ((class275) var23).field4439;
                    if (var24.field4271 != null) {
                        var24 = var24.method1794(arg4 - 8108);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (class70.field969 <= var7) {
                    class265 var25 = ((class275) var23).field4439;
                    if (var25.field4271 != null) {
                        var25 = var25.method1794(-8159);
                    }
                    if (var25.field4253 >= 0 && var25.field4253 < class154.field2481.length) {
                        int var26;
                        if (var25.field4307 == -1) {
                            var26 = var23.method377(arg4 ^ 0xFFFFFFCC) + 15;
                        } else {
                            var26 = var25.field4307 + 15;
                        }
                        class75.method570(var26, arg6 >> 1, arg2, false, arg3 >> 1, arg5, var23);
                        if (class236.field3775 > -1) {
                            class154.field2481[var25.field4253].method174(arg0 + class236.field3775 - 12, class54.field773 + arg1 - 30);
                        }
                    }
                    class115[] var27 = class293.field4649;
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        class115 var29 = var27[var28];
                        if (var29 != null && var29.field1967 == 1 && class134.field2250[var7 - class70.field969] == var29.field1960 && (class9.field141 % 20) < 10) {
                            int var30;
                            if (var25.field4307 == -1) {
                                var30 = var23.method377(arg4 ^ 0xFFFFFFCC) + 15;
                            } else {
                                var30 = var25.field4307 + 15;
                            }
                            class75.method570(var30, arg6 >> 1, arg2, false, arg3 >> 1, arg5, var23);
                            if (class236.field3775 > -1) {
                                class1.field17[var29.field1970].method174(class236.field3775 + arg0 - 12, class54.field773 + arg1 + -28);
                            }
                        }
                    }
                } else {
                    class235 var31 = (class235) var23;
                    int var32 = 30;
                    if (var31.field3755 != -1 || var31.field3750 != -1) {
                        class75.method570(var23.method377(1) + 15, arg6 >> 1, arg2, false, arg3 >> 1, arg5, var23);
                        if (class236.field3775 > -1) {
                            if (var31.field3755 != -1) {
                                class99.field1511[var31.field3755].method174(class236.field3775 + arg0 - 12, -var32 + class54.field773 + arg1);
                                var32 += 25;
                            }
                            if (var31.field3750 != -1) {
                                class154.field2481[var31.field3750].method174(arg0 + class236.field3775 - 12, -var32 + class54.field773 + arg1);
                                var32 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var33 = 0;
                        class115[] var34 = class293.field4649;
                        while (var34.length > var33) {
                            class115 var35 = var34[var33];
                            if (var35 != null && var35.field1967 == 10 && class51.field721[var7] == var35.field1960) {
                                class75.method570(var23.method377(1) + 15, arg6 >> 1, arg2, false, arg3 >> 1, arg5, var23);
                                if (class236.field3775 > -1) {
                                    class1.field17[var35.field1970].method174(arg0 + class236.field3775 - 12, -var32 + arg1 - -class54.field773);
                                }
                            }
                            var33++;
                        }
                    }
                }
                if (var23.field695 != null && (var7 >= class70.field969 || class71.field979 == 0 || class71.field979 == 3 || class71.field979 == 1 && class75.method569((byte) -44, ((class235) var23).field3735))) {
                    class75.method570(var23.method377(arg4 + 52), arg6 >> 1, arg2, false, arg3 >> 1, arg5, var23);
                    if (class236.field3775 > -1 && class45.field544 > class200.field3230) {
                        class45.field537[class200.field3230] = class283.field4524.method1119(var23.field695) / 2;
                        class45.field550[class200.field3230] = class283.field4524.field2650;
                        class45.field549[class200.field3230] = class236.field3775;
                        class45.field546[class200.field3230] = class54.field773;
                        class45.field545[class200.field3230] = var23.field678;
                        class45.field541[class200.field3230] = var23.field653;
                        class45.field539[class200.field3230] = var23.field612;
                        class45.field551[class200.field3230] = var23.field695;
                        class200.field3230++;
                    }
                }
                if (class9.field141 < var23.field704) {
                    class271 var36 = class216.field3469[0];
                    class271 var37 = class216.field3469[1];
                    int var38;
                    if ((var23 instanceof class275)) {
                        class275 var39 = (class275) var23;
                        class271[] var40 = (class271[]) class83.field1150.method1839((byte) 95, (long) var39.field4439.field4265);
                        if (var40 == null) {
                            var40 = class120.method846(0, var39.field4439.field4265, class169.field2739, (byte) 29);
                            if (var40 != null) {
                                class83.field1150.method1830((long) var39.field4439.field4265, -48, var40);
                            }
                        }
                        if (var40 != null && var40.length == 2) {
                            var36 = var40[0];
                            var37 = var40[1];
                        }
                        class265 var41 = var39.field4439;
                        if (var41.field4307 == -1) {
                            var38 = var23.method377(arg4 ^ 0xFFFFFFCC);
                        } else {
                            var38 = var41.field4307;
                        }
                    } else {
                        var38 = var23.method377(arg4 + 52);
                    }
                    class75.method570(var38 + var36.field4372 + 10, arg6 >> 1, arg2, false, arg3 >> 1, arg5, var23);
                    if (class236.field3775 > -1) {
                        int var42 = class54.field773 + arg1 - 3;
                        int var43 = class236.field3775 + arg0 - (var36.field4383 >> 1);
                        var36.method174(var43, var42);
                        int var44 = var23.field619 * var36.field4383 / 255;
                        int var45 = var36.field4372;
                        class63.method505(var43, var42, var43 + var44, var42 + var45);
                        var37.method174(var43, var42);
                        class63.method494(arg0, arg1, arg0 + arg6, arg1 - -arg3);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (class9.field141 < var23.field608[var46]) {
                        int var47;
                        if ((var23 instanceof class275)) {
                            class275 var48 = (class275) var23;
                            class265 var49 = var48.field4439;
                            if (var49.field4307 == -1) {
                                var47 = var23.method377(1) / 2;
                            } else {
                                var47 = var49.field4307 / 2;
                            }
                        } else {
                            var47 = var23.method377(1) / 2;
                        }
                        class75.method570(var47, arg6 >> 1, arg2, false, arg3 >> 1, arg5, var23);
                        if (class236.field3775 > -1) {
                            if (var46 == 1) {
                                class54.field773 -= 20;
                            }
                            if (var46 == 2) {
                                class236.field3775 -= 15;
                                class54.field773 -= 10;
                            }
                            if (var46 == 3) {
                                class54.field773 -= 10;
                                class236.field3775 += 15;
                            }
                            class5.field66[var23.field635[var46]].method174(arg0 + class236.field3775 - 12, class54.field773 + -12 + arg1);
                            class122.field2050.method1137(Integer.toString(var23.field606[var46]), arg0 + class236.field3775 - 1, class54.field773 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class200.field3230; var8++) {
            int var9 = class45.field549[var8];
            int var10 = class45.field537[var8];
            int var11 = class45.field546[var8];
            int var12 = class45.field550[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var11 + 2) > (class45.field546[var22] - class45.field550[var22]) && class45.field546[var22] + 2 > -var12 + var11 && var9 - var10 < class45.field549[var22] + class45.field537[var22] && class45.field549[var22] - class45.field537[var22] < var9 + var10 && var11 > (class45.field546[var22] - class45.field550[var22])) {
                        var11 = class45.field546[var22] - class45.field550[var22];
                        var13 = true;
                    }
                }
            }
            class236.field3775 = class45.field549[var8];
            class54.field773 = class45.field546[var8] = var11;
            String var14 = class45.field551[var8];
            if (class222.field3535 == 0) {
                int var15 = 16776960;
                if (class45.field545[var8] < 6) {
                    var15 = class100.field1522[class45.field545[var8]];
                }
                if (class45.field545[var8] == 6) {
                    var15 = (class23.field293 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class45.field545[var8] == 7) {
                    var15 = class23.field293 % 20 < 10 ? 255 : 65535;
                }
                if (class45.field545[var8] == 8) {
                    var15 = (class23.field293 % 20) < 10 ? 45056 : 8454016;
                }
                if (class45.field545[var8] == 9) {
                    int var16 = 150 - class45.field539[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 16776960 - ((var16 - 50) * 327680);
                    } else if (var16 < 150) {
                        var15 = 65280 - (500 - (var16 * 5));
                    }
                }
                if (class45.field545[var8] == 10) {
                    int var17 = 150 - class45.field539[var8];
                    if (var17 < 50) {
                        var15 = var17 * 5 + 16711680;
                    } else if (var17 < 100) {
                        var15 = 16711935 - (var17 - 50) * 327680;
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 - (var17 * 5 + -500) - 32768000;
                    }
                }
                if (class45.field545[var8] == 11) {
                    int var18 = 150 - class45.field539[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = ((var18 - 50) * 327685) + 65280;
                    } else if (var18 < 150) {
                        var15 = 16777215 - ((var18 - 100) * 327680);
                    }
                }
                if (class45.field541[var8] == 0) {
                    class283.field4524.method1137(var14, arg0 + class236.field3775, class54.field773 + arg1, var15, 0);
                }
                if (class45.field541[var8] == 1) {
                    class283.field4524.method1127(var14, arg0 + class236.field3775, arg1 - -class54.field773, var15, 0, class23.field293);
                }
                if (class45.field541[var8] == 2) {
                    class283.field4524.method1141(var14, class236.field3775 + arg0, class54.field773 + arg1, var15, 0, class23.field293);
                }
                if (class45.field541[var8] == 3) {
                    class283.field4524.method1130(var14, class236.field3775 + arg0, class54.field773 + arg1, var15, 0, class23.field293, 150 - class45.field539[var8]);
                }
                if (class45.field541[var8] == 4) {
                    int var19 = (150 - class45.field539[var8]) * (class283.field4524.method1119(var14) + 100) / 150;
                    class63.method505(class236.field3775 + arg0 - 50, arg1, class236.field3775 + arg0 + 50, arg1 + arg3);
                    class283.field4524.method1121(var14, arg0 + class236.field3775 + 50 - var19, class54.field773 + arg1, var15, 0);
                    class63.method494(arg0, arg1, arg0 + arg6, arg1 - -arg3);
                }
                if (class45.field541[var8] == 5) {
                    int var20 = 150 - class45.field539[var8];
                    class63.method505(arg0, class54.field773 + arg1 - class283.field4524.field2650 - 1, arg0 + arg6, arg1 + class54.field773 + 5);
                    int var21 = 0;
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class283.field4524.method1137(var14, arg0 + class236.field3775, arg1 + var21 + class54.field773, var15, 0);
                    class63.method494(arg0, arg1, arg0 + arg6, arg1 - -arg3);
                }
            } else {
                class283.field4524.method1137(var14, arg0 + class236.field3775, class54.field773 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
    public static final int method1687(int arg0, int arg1) {
        field4106++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 <= 42 ? -79 : 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method1688(byte arg0) {
        field4111 = null;
        field4103 = null;
        field4107 = null;
        field4112 = null;
        if (arg0 != 64) {
            field4100 = null;
        }
        field4100 = null;
        field4104 = null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static final void method1689(byte arg0) {
        if (class71.field980 != -1) {
            class227.method1495(-1, -1, 119, class71.field980);
            class71.field980 = -1;
        }
        field4102++;
        if (arg0 < 22) {
            field4110 = 53;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)Z")
    public static final boolean method1690(int arg0) {
        field4101++;
        class106 var1 = class170.field2750;
        synchronized (class170.field2750) {
            if (class64.field899 == class166.field2713) {
                return false;
            } else {
                class170.field2752 = class52.field727[class64.field899];
                class155.field2496 = class28.field332[class64.field899];
                class64.field899 = arg0 & class64.field899 + 1;
                return true;
            }
        }
    }
}
