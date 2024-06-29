import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class389 {

    @OriginalMember(owner = "client!po", name = "a", descriptor = "[Lmf;")
    public class286[] field5845 = null;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "[Lmf;")
    public class286[] field5848 = null;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Ljd;")
    public class152 field5851 = null;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Ljd;")
    public class152 field5856 = null;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "Ljd;")
    public class152 field5857 = null;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Z")
    public boolean field5850;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Leu;")
    public static class332 field5853;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I")
    public static final int method2398(int arg0) {
        field5847++;
        return arg0 == 1006 ? class148.field2365 : 101;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIII)Lbi;")
    public static final class333 method2399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5846++;
        if (arg4 != -1) {
            field5859 = 113;
        }
        long var7 = (long) arg1 * 32147369L ^ (long) arg6 * 475427L ^ (long) arg5 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 986053L ^ (long) arg0 * 76724863L;
        class333 var9 = (class333) class497.field7340.method494(0, var7);
        if (var9 == null) {
            class333 var10 = class412.field6158.method204(arg3, arg5, arg6, arg2, arg1, arg0);
            class497.field7340.method485(var7, (byte) -125, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)Z")
    public static final boolean method2400(int arg0, int arg1, int arg2) {
        field5852++;
        return (class260.field3784[1][arg0][arg1] & arg2) != 0;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIIIII)V")
    public static final void method2401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class303.field4287 = arg0;
        field5849++;
        class280.field4018 = arg4;
        if (arg2 != -29518) {
            method2403(-57, null, null, -34, false);
        }
        class286.field4082 = arg5;
        class213.field3045 = arg3;
        class451.field6743 = arg1;
        class474.field7090 = arg6;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lqa;III)V")
    public static final void method2402(class162 arg0, int arg1, int arg2, int arg3) {
        field5858++;
        if (arg3 < 0 || arg1 < 0 || class242.field3494 == 0 || class92.field1576 == 0) {
            return;
        }
        arg0.method230(class435.field6487, class22.field458, class242.field3494, class92.field1576);
        arg0.method298(class482.field7169, class26.field577, class242.field3494, class92.field1576);
        class414 var4 = arg0.method231();
        var4.method873(class286.field4082, class451.field6743, class474.field7090, class303.field4287, class213.field3045, class280.field4018);
        arg0.method302(var4);
        if (class43.field829 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method200();
            int var8 = (arg3 - class435.field6487) * var7 / class242.field3494;
            int var9 = (arg1 - class22.field458) * var7 / class92.field1576;
            int var10 = arg0.method275();
            int var11 = (arg3 - class435.field6487) * var10 / class242.field3494;
            int var12 = (arg1 - class22.field458) * var10 / class92.field1576;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method870(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method870(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class33.field662 > var20 && class121.field1966 > var22) {
                    int var23 = class139.field2224.field6232;
                    if (var23 < 3 && (class260.field3784[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class43.field829[var23].method371(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class139.field2224.method1654(102) - 1 << 6) + var19 >> 7;
                        var6 = (class139.field2224.method1654(104) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class99.field1638 && (class417.field6234 & 0x40) != 0) {
                    class350 var24 = class83.method649((byte) 85, class383.field5790, class347.field5187);
                    if (var24 == null) {
                        class227.method1486(0);
                    } else {
                        class338.method2167(" ->", 0L, class56.field980, 1, var6, true, class432.field6423, false, var5, -1, 46);
                    }
                } else {
                    if (class428.field6357 == class403.field6054) {
                        class338.method2167("", 0L, -1, 1, var6, true, class499.field7369.method2180(client.field2870, 29491), false, var5, -1, 59);
                    }
                    class22.field448++;
                    class338.method2167("", 0L, class416.field6208, 1, var6, true, class165.field2561, false, var5, -1, 16);
                }
            }
        }
        class254 var25 = class221.field3167;
        if (arg2 != 23662) {
            method2400(-63, -121, 125);
        }
        for (class163 var26 = (class163) var25.method1640(false); var26 != null; var26 = (class163) var25.method1641(true)) {
            if (class139.field2224.field6232 == var26.field2517 && var26.method1204(arg0, arg1, (byte) 22, arg3)) {
                if (var26.field2523 instanceof class256) {
                    class256 var27 = (class256) var26.field2523;
                    int var28 = var27.method1654(91);
                    if ((var28 & 0x1) == 0 && (var27.field6228 & 0x7F) == 0 && (var27.field6233 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6228 & 0x7F) == 64 && (var27.field6233 & 0x7F) == 64) {
                        int var29 = var27.field6228 - (var27.method1654(106) - 1 << 6);
                        int var30 = var27.field6233 - (var27.method1654(arg2 ^ 0x5C23) - 1 << 6);
                        for (int var31 = 0; var31 < class510.field7529; var31++) {
                            class255 var38 = class34.field668[class148.field2363[var31]];
                            if (var38 != null && class531.field7821 != var38.field7610 && var38.field7608) {
                                int var39 = var38.field6228 - (var38.field3677.field807 - 1 << 6);
                                int var40 = var38.field6233 - (var38.field3677.field807 - 1 << 6);
                                if (var39 >= var29 && var38.field3677.field807 <= (var27.method1654(96) - (var39 - var29 >> 7)) && var30 <= var40 && var38.field3677.field807 <= var27.method1654(81) - (var40 - var30 >> 7)) {
                                    class426.method2561(-1, class139.field2224.field6232 != var26.field2517, var38);
                                    var38.field7610 = class531.field7821;
                                }
                            }
                        }
                        int var32 = class409.field6135;
                        int[] var33 = class358.field5445;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class256 var35 = class183.field2747[var33[var34]];
                            if (var35 != null && class531.field7821 != var35.field7610 && var27 != var35 && var35.field7608) {
                                int var36 = var35.field6228 - (var35.method1654(92) - 1 << 6);
                                int var37 = var35.field6233 - (var35.method1654(arg2 ^ 0x5C3F) - 1 << 6);
                                if (var29 <= var36 && var35.method1654(arg2 - 23552) <= (var27.method1654(82) - (var36 - var29 >> 7)) && var30 <= var37 && var35.method1654(80) <= (var27.method1654(106) - (var37 - var30 >> 7))) {
                                    class263.method1699(0, var35, class139.field2224.field6232 != var26.field2517);
                                    var35.field7610 = class531.field7821;
                                }
                            }
                        }
                    }
                    if (class531.field7821 == var27.field7610) {
                        continue;
                    }
                    class263.method1699(0, var27, class139.field2224.field6232 != var26.field2517);
                    var27.field7610 = class531.field7821;
                }
                if (var26.field2523 instanceof class255) {
                    class255 var41 = (class255) var26.field2523;
                    if (var41.field3677 != null) {
                        if ((var41.field3677.field807 & 0x1) == 0 && (var41.field6228 & 0x7F) == 0 && (var41.field6233 & 0x7F) == 0 || (var41.field3677.field807 & 0x1) == 1 && (var41.field6228 & 0x7F) == 64 && (var41.field6233 & 0x7F) == 64) {
                            int var42 = var41.field6228 - (var41.field3677.field807 - 1 << 6);
                            int var43 = var41.field6233 - (var41.field3677.field807 - 1 << 6);
                            for (int var44 = 0; var44 < class510.field7529; var44++) {
                                class255 var51 = class34.field668[class148.field2363[var44]];
                                if (var51 != null && class531.field7821 != var51.field7610 && var41 != var51 && var51.field7608) {
                                    int var52 = var51.field6228 - (var51.field3677.field807 - 1 << 6);
                                    int var53 = var51.field6233 - (var51.field3677.field807 - 1 << 6);
                                    if (var52 >= var42 && (var41.field3677.field807 - (var52 - var42 >> 7)) >= var51.field3677.field807 && var53 >= var43 && (var41.field3677.field807 - (var53 - var43 >> 7)) >= var51.field3677.field807) {
                                        class426.method2561(-1, class139.field2224.field6232 != var26.field2517, var51);
                                        var51.field7610 = class531.field7821;
                                    }
                                }
                            }
                            int var45 = class409.field6135;
                            int[] var46 = class358.field5445;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class256 var48 = class183.field2747[var46[var47]];
                                if (var48 != null && class531.field7821 != var48.field7610 && var48.field7608) {
                                    int var49 = var48.field6228 - (var48.method1654(arg2 ^ 0x5C25) - 1 << 6);
                                    int var50 = var48.field6233 - (var48.method1654(101) - 1 << 6);
                                    if (var49 >= var42 && var48.method1654(arg2 ^ 0x5C36) <= (var41.field3677.field807 - (var49 - var42 >> 7)) && var50 >= var43 && var48.method1654(94) <= var41.field3677.field807 - (var50 - var43 >> 7)) {
                                        class263.method1699(0, var48, class139.field2224.field6232 != var26.field2517);
                                        var48.field7610 = class531.field7821;
                                    }
                                }
                            }
                        }
                        if (class531.field7821 == var41.field7610) {
                            continue;
                        }
                        class426.method2561(-1, class139.field2224.field6232 != var26.field2517, var41);
                        var41.field7610 = class531.field7821;
                    }
                }
                if (var26.field2523 instanceof class362) {
                    class294 var54 = (class294) class433.field6430.method171((byte) 79, (long) (var26.field2520 | var26.field2524 << 14 | var26.field2517 << 28));
                    if (var54 != null) {
                        for (class223 var55 = (class223) var54.field4192.method2426(true); var55 != null; var55 = (class223) var54.field4192.method2433(-1)) {
                            class134 var56 = class367.field5550.method1312((byte) 91, var55.field3191);
                            if (!class99.field1638) {
                                if (class139.field2224.field6232 == var26.field2517) {
                                    String[] var57 = var56.field2153;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            int var60 = class361.field5476;
                                            if (var58 == 0) {
                                                var59 = 48;
                                            }
                                            if (var58 == 1) {
                                                var59 = 44;
                                            }
                                            if (var58 == 2) {
                                                var59 = 3;
                                            }
                                            if (var58 == 3) {
                                                var59 = 23;
                                            }
                                            if (var56.field2101 == var58) {
                                                var60 = var56.field2162;
                                            }
                                            if (var58 == 4) {
                                                var59 = 2;
                                            }
                                            if (var56.field2087 == var58) {
                                                var60 = var56.field2142;
                                            }
                                            class338.method2167("<col=ff9040>" + var56.field2133, (long) var55.field3191, var60, 1, var26.field2524, true, var57[var58], false, var26.field2520, -1, var59);
                                            class54.field928++;
                                        }
                                    }
                                }
                                class140.field2231++;
                                class338.method2167("<col=ff9040>" + var56.field2133, (long) var55.field3191, class155.field2446, 1, var26.field2524, true, class360.field5464.method2180(client.field2870, 29491), class139.field2224.field6232 != var26.field2517, var26.field2520, -1, 1010);
                            } else if (class139.field2224.field6232 == var26.field2517) {
                                class61 var61 = class140.field2234 == -1 ? null : class162.field2506.method597(arg2 - 23651, class140.field2234);
                                if ((class417.field6234 & 0x1) != 0 && (var61 == null || var56.method1007(var61.field1062, (byte) 117, class140.field2234) != var61.field1062)) {
                                    class338.method2167(class1.field7 + " -> <col=ff9040>" + var56.field2133, (long) var55.field3191, class56.field980, 1, var26.field2524, true, class432.field6423, false, var26.field2520, -1, 13);
                                    class79.field1364++;
                                }
                            }
                        }
                    }
                }
                if (var26.field2523 instanceof class248) {
                    class248 var62 = (class248) var26.field2523;
                    class79 var63 = class319.field4807.method2874(var62.method17((byte) -101), -17045);
                    if (var63.field1370 != null) {
                        var63 = var63.method631(6574, class335.field5059);
                    }
                    if (var63 != null) {
                        if (!class99.field1638) {
                            if (class139.field2224.field6232 == var26.field2517) {
                                String[] var64 = var63.field1380;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            int var67 = class361.field5476;
                                            if (var65 == 0) {
                                                var66 = 5;
                                            }
                                            if (var65 == 1) {
                                                var66 = 45;
                                            }
                                            if (var65 == 2) {
                                                var66 = 21;
                                            }
                                            if (var65 == 3) {
                                                var66 = 47;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1006;
                                            }
                                            if (var63.field1358 == var65) {
                                                var67 = var63.field1371;
                                            }
                                            if (var63.field1324 == var65) {
                                                var67 = var63.field1341;
                                            }
                                            class338.method2167("<col=00ffff>" + var63.field1328, class65.method550(var62, var26.field2524, var26.field2520, 104), var67, 1, var26.field2524, true, var64[var65], false, var26.field2520, -1, var66);
                                            class332.field5027++;
                                        }
                                    }
                                }
                            }
                            class152.field2413++;
                            class338.method2167("<col=00ffff>" + var63.field1328, (long) var63.field1318, class155.field2446, 1, var26.field2524, true, class360.field5464.method2180(client.field2870, 29491), class139.field2224.field6232 != var26.field2517, var26.field2520, -1, 1011);
                        } else if (class139.field2224.field6232 == var26.field2517) {
                            class61 var68 = class140.field2234 == -1 ? null : class162.field2506.method597(arg2 - 23651, class140.field2234);
                            if ((class417.field6234 & 0x4) != 0 && (var68 == null || var63.method632((byte) -17, class140.field2234, var68.field1062) != var68.field1062)) {
                                class412.field6154++;
                                class338.method2167(class1.field7 + " -> <col=00ffff>" + var63.field1328, class65.method550(var62, var26.field2524, var26.field2520, 28), class56.field980, 1, var26.field2524, true, class432.field6423, false, var26.field2520, -1, 60);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILvr;Lvr;IZ)I")
    public static final int method2403(int arg0, class89 arg1, class89 arg2, int arg3, boolean arg4) {
        field5855++;
        if (arg3 != -1) {
            method2400(-119, -30, 23);
        }
        if (arg0 == 1) {
            int var5 = arg2.field4262;
            int var6 = arg1.field4262;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class261.method1693(arg1.method697(-2277).field2607, client.field2870, arg2.method697(-2277).field2607, 25911);
        } else if (arg0 == 3) {
            if (arg2.field1555.equals("-")) {
                if (arg1.field1555.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1555.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class261.method1693(arg1.field1555, client.field2870, arg2.field1555, arg3 ^ 0xFFFF9AC8);
            }
        } else if (arg0 == 4) {
            if (arg2.method1891(true)) {
                return arg1.method1891(true) ? 0 : 1;
            } else if (arg1.method1891(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 5) {
            if (arg2.method1889(arg3 - 21539)) {
                return arg1.method1889(arg3 - 21539) ? 0 : 1;
            } else if (arg1.method1889(arg3 ^ 0x5423)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 6) {
            if (arg2.method1890(arg3 + 655)) {
                return arg1.method1890(654) ? 0 : 1;
            } else if (arg1.method1890(654)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 7) {
            if (arg2.method1893(-12997)) {
                return arg1.method1893(-12997) ? 0 : 1;
            } else if (arg1.method1893(-12997)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg0 == 8) {
            int var7 = arg2.field1556;
            int var8 = arg1.field1556;
            if (arg4) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg2.field1553 - arg1.field1553;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2404(int arg0, int arg1, String arg2) {
        field5854++;
        class96.field1613++;
        class28.method321(class460.field6896, -5001);
        class410.field6141.method1109(false, class217.method1444(arg2, -123) + 1);
        class410.field6141.method1082(61, arg0);
        class410.field6141.method1089((byte) -89, arg2);
        if (arg1 != 4940) {
            field5859 = 125;
        }
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public static void method2405(int arg0) {
        field5853 = null;
        if (arg0 != 64) {
            method2399(101, 86, -107, 16, -16, 55, -3);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lvj;)V")
    public class389(class303 arg0) {
        this.field5850 = arg0.field4553;
        class77.method610(arg0, 4497);
        if (this.field5850) {
            byte[] var6 = class1.method5(false, 31346, class167.field2587);
            this.field5856 = new class152(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class1.method5(false, 31346, class241.field3481);
            this.field5857 = new class152(arg0, 6410, 128, 128, 16, var7, 6410);
            class398 var8 = arg0.field4493;
            if (var8.method2458((byte) 109)) {
                byte[] var9 = class1.method5(false, 31346, class37.field706);
                this.field5851 = new class152(arg0, 6408, 128, 128, 16);
                class152 var10 = new class152(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2456(var10, true, 2.0F, this.field5851)) {
                    this.field5851.method2927((byte) -71);
                } else {
                    this.field5851.method2931(125);
                    this.field5851 = null;
                }
                var10.method2931(122);
            }
        } else {
            this.field5845 = new class286[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class378.method2349(32768, class167.field2587, 54, var2 * 128 * 256);
                this.field5845[var2] = new class286(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field5848 = new class286[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class378.method2349(32768, class241.field3481, 87, var3 * 128 * 2 * 128);
                this.field5848[var3] = new class286(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    static {
        new class342("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        new class342("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field5859 = 100;
    }
}
