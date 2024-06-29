import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class135 extends class103 {

    @OriginalMember(owner = "client!w", name = "jb", descriptor = "Z")
    private boolean field3281 = false;

    @OriginalMember(owner = "client!w", name = "mb", descriptor = "Z")
    private volatile boolean field3284 = false;

    @OriginalMember(owner = "client!w", name = "Bb", descriptor = "I")
    private int field3299 = -1;

    @OriginalMember(owner = "client!w", name = "ub", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!w", name = "ob", descriptor = "Lnd;")
    private class82 field3286;

    @OriginalMember(owner = "client!w", name = "Jb", descriptor = "Lnd;")
    private class82 field3307;

    @OriginalMember(owner = "client!w", name = "yb", descriptor = "Lgd;")
    public static class40 field3296 = class14.method90(false, " hat sich ausgeloggt)3");

    @OriginalMember(owner = "client!w", name = "Cb", descriptor = "Lgd;")
    public static class40 field3300 = class14.method90(false, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!w", name = "kb", descriptor = "I")
    public static int field3282 = 0;

    @OriginalMember(owner = "client!w", name = "Ib", descriptor = "Lgd;")
    public static class40 field3306 = class14.method90(false, "headicons_hint");

    @OriginalMember(owner = "client!w", name = "nb", descriptor = "Lgd;")
    public static class40 field3285 = null;

    @OriginalMember(owner = "client!w", name = "Db", descriptor = "Lgd;")
    private static class40 field3301 = class14.method90(false, "Select");

    @OriginalMember(owner = "client!w", name = "sb", descriptor = "Lgd;")
    public static class40 field3290 = field3301;

    @OriginalMember(owner = "client!w", name = "Kb", descriptor = "[Lgd;")
    public static class40[] field3308 = new class40[1000];

    @OriginalMember(owner = "client!w", name = "Lb", descriptor = "Lgd;")
    public static class40 field3309 = class14.method90(false, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!w", name = "hb", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!w", name = "ib", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!w", name = "lb", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!w", name = "pb", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!w", name = "rb", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!w", name = "tb", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!w", name = "vb", descriptor = "I")
    private int field3293;

    @OriginalMember(owner = "client!w", name = "wb", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!w", name = "xb", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!w", name = "zb", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!w", name = "Ab", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!w", name = "Eb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!w", name = "Fb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!w", name = "Gb", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!w", name = "Hb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!w", name = "Mb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!w", name = "Nb", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!w", name = "Ob", descriptor = "Lmb;")
    public static class73 field3312;

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "Loc;")
    public static class86 field3278;

    @OriginalMember(owner = "client!w", name = "qb", descriptor = "[Z")
    private volatile boolean[] field3288;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILhb;I)V", line = 3)
    public static final void method1053(int arg0, class43 arg1, int arg2) {
        if (arg0 > -55) {
            field3309 = null;
        }
        ++field3276;
        while (true) {
            class126 var3 = (class126) class98.field2323.method593(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var5 > ~var3.field3018; ++var5) {
                if (var3.field2993[var5] != null) {
                    if (~var3.field2993[var5].field2885 == -3) {
                        var3.field2992[var5] = -5;
                    }
                    if (var3.field2993[var5].field2885 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2985[var5] != null) {
                    if (var3.field2985[var5].field2885 == 2) {
                        var3.field2992[var5] = -6;
                    }
                    if (~var3.field2985[var5].field2885 == -1) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method290((byte) 0, arg2);
            arg1.method756(0, 1);
            int var6 = arg1.field2563;
            arg1.method761(var3.field3005, -23644);
            for (int var7 = 0; ~var7 > ~var3.field3018; ++var7) {
                if (var3.field2992[var7] != 0) {
                    arg1.method756(var3.field2992[var7], 1);
                } else {
                    try {
                        int var8 = var3.field3017[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field2993[var7].field2887;
                            int var10 = var9.getInt((Object) null);
                            arg1.method756(0, 1);
                            arg1.method761(var10, -23644);
                        } else if (~var8 != -2) {
                            if (~var8 == -3) {
                                Field var11 = (Field) var3.field2993[var7].field2887;
                                int var12 = var11.getModifiers();
                                arg1.method756(0, 1);
                                arg1.method761(var12, -23644);
                            }
                        } else {
                            Field var13 = (Field) var3.field2993[var7].field2887;
                            var13.setInt((Object) null, var3.field2991[var7]);
                            arg1.method756(0, 1);
                        }
                        if (var8 != 3) {
                            if (~var8 == -5) {
                                Method var14 = (Method) var3.field2985[var7].field2887;
                                int var15 = var14.getModifiers();
                                arg1.method756(0, 1);
                                arg1.method761(var15, -23644);
                            }
                        } else {
                            Method var16 = (Method) var3.field2985[var7].field2887;
                            byte[][] var17 = var3.field3010[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; ~var19 > ~var17.length; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 != null) {
                                if (!(var21 instanceof Number)) {
                                    if (var21 instanceof class40) {
                                        arg1.method756(2, 1);
                                        arg1.method789(true, (class40) var21);
                                    } else {
                                        arg1.method756(4, 1);
                                    }
                                } else {
                                    arg1.method756(1, 1);
                                    arg1.method793(((Number) var21).longValue(), false);
                                }
                            } else {
                                arg1.method756(0, 1);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method756(-10, 1);
                    } catch (InvalidClassException var23) {
                        arg1.method756(-11, 1);
                    } catch (StreamCorruptedException var24) {
                        arg1.method756(-12, 1);
                    } catch (OptionalDataException var25) {
                        arg1.method756(-13, 1);
                    } catch (IllegalAccessException var26) {
                        arg1.method756(-14, 1);
                    } catch (IllegalArgumentException var27) {
                        arg1.method756(-15, 1);
                    } catch (InvocationTargetException var28) {
                        arg1.method756(-16, 1);
                    } catch (SecurityException var29) {
                        arg1.method756(-17, 1);
                    } catch (IOException var30) {
                        arg1.method756(-18, 1);
                    } catch (NullPointerException var31) {
                        arg1.method756(-19, 1);
                    } catch (Exception var32) {
                        arg1.method756(-20, 1);
                    } catch (Throwable var33) {
                        arg1.method756(-21, 1);
                    }
                }
            }
            arg1.method785(var6, true);
            arg1.method766(-var6 + arg1.field2563, 125);
            var3.method833(4);
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(II)I", line = 199)
    private final int method1054(int arg0, int arg1) {
        if (arg0 != -10923) {
            this.method1061((byte[]) null, (class82) null, -22, (byte) -11, true);
        }
        ++field3291;
        if (super.field2471[arg1] != null) {
            return 100;
        } else {
            return this.field3288[arg1] ? 100 : class18.method106(this.field3292, arg1, true);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([Lq;Lud;I)V", line = 223)
    public static final void method1055(class99[] arg0, class124 arg1, int arg2) {
        ++field3298;
        for (int var3 = 0; var3 < 4; ++var3) {
            for (int var111 = 0; ~var111 > -105; ++var111) {
                for (int var112 = 0; ~var112 > -105; ++var112) {
                    if (~(1 & class112.field2716[var3][var111][var112]) == -2) {
                        int var113 = var3;
                        if (~(2 & class112.field2716[1][var111][var112]) == -3) {
                            var113 = var3 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method697(var112, (byte) 127, var111);
                        }
                    }
                }
            }
        }
        class92.field2102 += (int) (5.0D * Math.random()) - 2;
        if (~class92.field2102 > 15) {
            class92.field2102 = -16;
        }
        if (~class92.field2102 < -17) {
            class92.field2102 = 16;
        }
        class110.field2680 += -2 + (int) (Math.random() * 5.0D);
        if (class110.field2680 < -8) {
            class110.field2680 = -8;
        }
        int var4 = 122 / ((-14 - arg2) / 40);
        if (class110.field2680 > 8) {
            class110.field2680 = 8;
        }
        for (int var5 = 0; ~var5 > -5; ++var5) {
            byte[][] var48 = class23.field538[var5];
            int var49 = (int) Math.sqrt(5100.0D);
            int var50 = var49 * 768 >> 8;
            for (int var51 = 1; var51 < 103; ++var51) {
                for (int var102 = 1; ~var102 > -104; ++var102) {
                    int var103 = class89.field2021[var5][var102 - -1][var51] + -class89.field2021[var5][var102 + -1][var51];
                    int var104 = class89.field2021[var5][var102][var51 + 1] + -class89.field2021[var5][var102][var51 + -1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 - (-65536 - var104 * var104)));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var48[var102 - 1][var51] >> 2) - (-(var48[var102][var51 - 1] >> 2) + -(var48[var102 + 1][var51] >> 3) - ((var48[var102][var51 - -1] >> 3) - -(var48[var102][var51] >> 1)));
                    int var110 = (var108 * -50 + var106 * -50 + var107 * -10) / var50 + 96;
                    class60.field1502[var102][var51] = -var109 + var110;
                }
            }
            for (int var52 = 0; ~var52 > -105; ++var52) {
                class7.field169[var52] = 0;
                class9.field224[var52] = 0;
                class115.field2762[var52] = 0;
                class106.field2582[var52] = 0;
                class31.field818[var52] = 0;
            }
            for (int var53 = -5; ~var53 > -110; ++var53) {
                for (int var56 = 0; var56 < 104; ++var56) {
                    int var96 = var53 + 5;
                    int var10002;
                    if (~var96 <= -1 && ~var96 > -105) {
                        int var97 = class24.field566[var5][var96][var56] & 255;
                        if (~var97 < -1) {
                            class122 var98 = class104.method792(32355, var97 + -1);
                            class7.field169[var56] += var98.field2876;
                            class9.field224[var56] += var98.field2867;
                            class115.field2762[var56] += var98.field2879;
                            class106.field2582[var56] += var98.field2872;
                            var10002 = class31.field818[var56]++;
                        }
                    }
                    int var99 = var53 + -5;
                    if (~var99 <= -1 && var99 < 104) {
                        int var100 = class24.field566[var5][var99][var56] & 255;
                        if (var100 > 0) {
                            class122 var101 = class104.method792(32355, var100 - 1);
                            class7.field169[var56] -= var101.field2876;
                            class9.field224[var56] -= var101.field2867;
                            class115.field2762[var56] -= var101.field2879;
                            class106.field2582[var56] -= var101.field2872;
                            var10002 = class31.field818[var56]--;
                        }
                    }
                }
                if (~var53 <= -2 && var53 < 103) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; ~var62 > -110; ++var62) {
                        int var63 = var62 + 5;
                        if (~var63 <= -1 && var63 < 104) {
                            var61 += class31.field818[var63];
                            var59 += class106.field2582[var63];
                            var60 += class115.field2762[var63];
                            var57 += class9.field224[var63];
                            var58 += class7.field169[var63];
                        }
                        int var64 = var62 - 5;
                        if (~var64 <= -1 && var64 < 104) {
                            var58 -= class7.field169[var64];
                            var57 -= class9.field224[var64];
                            var59 -= class106.field2582[var64];
                            var60 -= class115.field2762[var64];
                            var61 -= class31.field818[var64];
                        }
                        if (var62 >= 1 && ~var62 > -104 && (!class8.field209 || ~(2 & class112.field2716[0][var53][var62]) != -1 || ~(16 & class112.field2716[var5][var53][var62]) == -1 && class7.method36((byte) -117, var62, var5, var53) == class74.field1733)) {
                            if (~class96.field2236 < ~var5) {
                                class96.field2236 = var5;
                            }
                            int var65 = 255 & class24.field566[var5][var53][var62];
                            int var66 = 255 & class74.field1724[var5][var53][var62];
                            if (var65 > 0 || ~var66 < -1) {
                                int var67 = class89.field2021[var5][var53][var62];
                                int var68 = class89.field2021[var5][var53 + 1][var62];
                                int var69 = class89.field2021[var5][var53 - -1][var62 + 1];
                                int var70 = class89.field2021[var5][var53][var62 + 1];
                                int var71 = class60.field1502[var53][var62];
                                int var72 = class60.field1502[var53 - -1][var62];
                                int var73 = class60.field1502[var53 + 1][var62 - -1];
                                int var74 = class60.field1502[var53][var62 - -1];
                                int var75 = -1;
                                int var76 = -1;
                                if (var65 > 0) {
                                    int var77 = var58 * 256 / var59;
                                    int var78 = var60 / var61;
                                    int var79 = var57 / var61;
                                    var75 = class48.method378(var77, (byte) -99, var79, var78);
                                    int var80 = var77 - -class110.field2680 & 255;
                                    int var81 = class92.field2102 + var78;
                                    if (~var81 > -1) {
                                        var81 = 0;
                                    } else if (var81 > 255) {
                                        var81 = 255;
                                    }
                                    var76 = class48.method378(var80, (byte) -99, var79, var81);
                                }
                                if (var5 > 0) {
                                    boolean var82 = true;
                                    if (~var65 == -1 && ~class131.field3186[var5][var53][var62] != -1) {
                                        var82 = false;
                                    }
                                    if (~var66 < -1 && !class34.method218(var66 + -1, 14925).field501) {
                                        var82 = false;
                                    }
                                    if (var82 && ~var67 == ~var68 && ~var67 == ~var69 && ~var67 == ~var70) {
                                        class54.field1370[var5][var53][var62] = class43.method294(class54.field1370[var5][var53][var62], 2340);
                                    }
                                }
                                int var83 = 0;
                                if (~var76 != 0) {
                                    var83 = class109.field2664[class8.method45(var76, 96, -116)];
                                }
                                if (var66 != 0) {
                                    int var84 = class131.field3186[var5][var53][var62] - -1;
                                    byte var85 = class130.field3150[var5][var53][var62];
                                    class22 var86 = class34.method218(var66 + -1, 14925);
                                    int var87 = var86.field507;
                                    int var88;
                                    int var89;
                                    if (var87 >= 0) {
                                        var88 = class109.field2667.method526(var87, 20597);
                                        var89 = -1;
                                    } else if (var86.field508 == 16711935) {
                                        var88 = -2;
                                        var87 = -1;
                                        var89 = -2;
                                    } else {
                                        var89 = class48.method378(var86.field517, (byte) -99, var86.field504, var86.field521);
                                        int var90 = 255 & class110.field2680 + var86.field517;
                                        int var91 = class92.field2102 + var86.field521;
                                        if (~var91 <= -1) {
                                            if (var91 > 255) {
                                                var91 = 255;
                                            }
                                        } else {
                                            var91 = 0;
                                        }
                                        var88 = class48.method378(var90, (byte) -99, var86.field504, var91);
                                    }
                                    int var92 = 0;
                                    if (var88 != -2) {
                                        var92 = class109.field2664[class122.method935(96, var88, (byte) 104)];
                                    }
                                    if (var86.field500 != -1) {
                                        int var93 = class92.field2102 + var86.field526;
                                        int var94 = 255 & class110.field2680 + var86.field498;
                                        if (~var93 > -1) {
                                            var93 = 0;
                                        } else if (~var93 < -256) {
                                            var93 = 255;
                                        }
                                        int var95 = class48.method378(var94, (byte) -99, var86.field510, var93);
                                        var92 = class109.field2664[class122.method935(96, var95, (byte) 95)];
                                    }
                                    arg1.method950(var5, var53, var62, var84, var85, var87, var67, var68, var69, var70, class8.method45(var75, var71, -127), class8.method45(var75, var72, -127), class8.method45(var75, var73, -127), class8.method45(var75, var74, -109), class122.method935(var71, var89, (byte) 92), class122.method935(var72, var89, (byte) 124), class122.method935(var73, var89, (byte) 120), class122.method935(var74, var89, (byte) 112), var83, var92);
                                } else {
                                    arg1.method950(var5, var53, var62, 0, 0, -1, var67, var68, var69, var70, class8.method45(var75, var71, -127), class8.method45(var75, var72, -117), class8.method45(var75, var73, -127), class8.method45(var75, var74, -121), 0, 0, 0, 0, var83, 0);
                                }
                            }
                        }
                    }
                }
            }
            for (int var54 = 1; ~var54 > -104; ++var54) {
                for (int var55 = 1; var55 < 103; ++var55) {
                    arg1.method955(var5, var55, var54, class7.method36((byte) 40, var54, var5, var55));
                }
            }
            class24.field566[var5] = null;
            class74.field1724[var5] = null;
            class131.field3186[var5] = null;
            class130.field3150[var5] = null;
            class23.field538[var5] = null;
        }
        arg1.method964(-50, -10, -50);
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var47 = 0; var47 < 104; ++var47) {
                if ((2 & class112.field2716[1][var6][var47]) == 2) {
                    arg1.method973(var6, var47);
                }
            }
        }
        int var7 = 2;
        int var8 = 4;
        int var9 = 1;
        for (int var10 = 0; ~var10 > -5; ++var10) {
            if (var10 > 0) {
                var7 <<= 3;
                var8 <<= 3;
                var9 <<= 3;
            }
            for (int var11 = 0; ~var10 <= ~var11; ++var11) {
                for (int var12 = 0; var12 <= 104; ++var12) {
                    for (int var13 = 0; var13 <= 104; ++var13) {
                        if (~(var9 & class54.field1370[var11][var13][var12]) != -1) {
                            int var14;
                            for (var14 = var12; var14 > 0 && ~(class54.field1370[var11][var13][var14 + -1] & var9) != -1; --var14) {
                            }
                            int var15 = var12;
                            int var16 = var11;
                            while (~var15 > -105 && (var9 & class54.field1370[var11][var13][var15 - -1]) != 0) {
                                ++var15;
                            }
                            int var17 = var11;
                            label353: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; ++var18) {
                                    if (~(class54.field1370[var16 + -1][var13][var18] & var9) == -1) {
                                        break label353;
                                    }
                                }
                                --var16;
                            }
                            label342: while (~var17 > ~var10) {
                                for (int var19 = var14; ~var19 >= ~var15; ++var19) {
                                    if (~(class54.field1370[var17 + 1][var13][var19] & var9) == -1) {
                                        break label342;
                                    }
                                }
                                ++var17;
                            }
                            int var20 = (-var14 + 1 + var15) * (var17 + 1 + -var16);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = class89.field2021[var17][var13][var14] + -var21;
                                int var23 = class89.field2021[var16][var13][var14];
                                class124.method954(var10, 1, var13 * 128, var13 * 128, var14 * 128, var15 * 128 + 128, var22, var23);
                                for (int var24 = var16; ~var24 >= ~var17; ++var24) {
                                    for (int var25 = var14; var15 >= var25; ++var25) {
                                        class54.field1370[var24][var13][var25] = class101.method709(class54.field1370[var24][var13][var25], ~var9);
                                    }
                                }
                            }
                        }
                        if (~(var7 & class54.field1370[var11][var13][var12]) != -1) {
                            int var26 = var13;
                            int var27 = var13;
                            while (var26 > 0 && (class54.field1370[var11][var26 + -1][var12] & var7) != 0) {
                                --var26;
                            }
                            int var28 = var11;
                            while (var27 < 104 && (class54.field1370[var11][var27 + 1][var12] & var7) != 0) {
                                ++var27;
                            }
                            label409: while (var28 > 0) {
                                for (int var29 = var26; ~var29 >= ~var27; ++var29) {
                                    if ((var7 & class54.field1370[var28 + -1][var29][var12]) == 0) {
                                        break label409;
                                    }
                                }
                                --var28;
                            }
                            int var30;
                            label397: for (var30 = var11; var10 > var30; ++var30) {
                                for (int var31 = var26; ~var31 >= ~var27; ++var31) {
                                    if (~(class54.field1370[var30 + 1][var31][var12] & var7) == -1) {
                                        break label397;
                                    }
                                }
                            }
                            int var32 = (var27 - var26 + 1) * (-var28 + var30 + 1);
                            if (~var32 <= -9) {
                                short var33 = 240;
                                int var34 = class89.field2021[var30][var26][var12] + -var33;
                                int var35 = class89.field2021[var28][var26][var12];
                                class124.method954(var10, 2, var26 * 128, var27 * 128 + 128, var12 * 128, var12 * 128, var34, var35);
                                for (int var36 = var28; var36 <= var30; ++var36) {
                                    for (int var37 = var26; var27 >= var37; ++var37) {
                                        class54.field1370[var36][var37][var12] = class101.method709(class54.field1370[var36][var37][var12], ~var7);
                                    }
                                }
                            }
                        }
                        if (~(class54.field1370[var11][var13][var12] & var8) != -1) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40;
                            for (var40 = var12; ~var40 > -105 && (var8 & class54.field1370[var11][var13][var40 - -1]) != 0; ++var40) {
                            }
                            int var41;
                            for (var41 = var12; var41 > 0 && (var8 & class54.field1370[var11][var13][var41 + -1]) != 0; --var41) {
                            }
                            label463: while (var38 > 0) {
                                for (int var42 = var41; ~var40 <= ~var42; ++var42) {
                                    if (~(var8 & class54.field1370[var11][var38 + -1][var42]) == -1) {
                                        break label463;
                                    }
                                }
                                --var38;
                            }
                            label452: while (var39 < 104) {
                                for (int var43 = var41; var43 <= var40; ++var43) {
                                    if (~(class54.field1370[var11][var39 - -1][var43] & var8) == -1) {
                                        break label452;
                                    }
                                }
                                ++var39;
                            }
                            if (~((var40 - var41 + 1) * (-var38 + var39 + 1)) <= -5) {
                                int var44 = class89.field2021[var11][var38][var41];
                                class124.method954(var10, 4, var38 * 128, var39 * 128 - -128, var41 * 128, var40 * 128 + 128, var44, var44);
                                for (int var45 = var38; ~var39 <= ~var45; ++var45) {
                                    for (int var46 = var41; ~var40 <= ~var46; ++var46) {
                                        class54.field1370[var11][var45][var46] = class101.method709(class54.field1370[var11][var45][var46], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)V", line = 958)
    public final void method742(int arg0, int arg1) {
        class100.method705(arg1, this.field3292, arg0 ^ 861079633);
        if (arg0 != 1) {
            field3296 = null;
        }
        ++field3302;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lnd;Lnd;IZZZ)V", line = 1121)
    public class135(class82 arg0, class82 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3292 = arg2;
        this.field3286 = arg0;
        this.field3307 = arg1;
        this.field3281 = arg5;
        class80.method535(this, (byte) 118, this.field3292);
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(II)V", line = 976)
    public final void method1056(int arg0, int arg1) {
        ++field3280;
        this.field3293 = arg1;
        if (this.field3307 == null) {
            class80.method536(this.field3292, this.field3293, (byte) 112, this, true, 255, (byte) 0);
        } else {
            class110.method853(this.field3307, this.field3292, (byte) -33, this);
        }
        if (arg0 >= -80) {
            this.field3293 = 23;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)V", line = 994)
    public final void method736(int arg0, boolean arg1) {
        if (this.field3286 != null && this.field3288 != null && this.field3288[arg0]) {
            class110.method853(this.field3286, arg0, (byte) 116, this);
        } else {
            class80.method536(arg0, super.field2485[arg0], (byte) 120, this, true, this.field3292, (byte) 2);
        }
        ++field3305;
        if (arg1) {
            this.method1056(-11, -3);
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(II)Z", line = 1014)
    public static final boolean method1057(int arg0, int arg1) {
        ++field3303;
        if (~arg1 > arg0) {
            return false;
        } else {
            int var2 = class45.field1122[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return ~var2 == -28;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZBZ)I", line = 1043)
    public static final int method1058(boolean arg0, byte arg1, boolean arg2) {
        ++field3289;
        int var3 = 0;
        if (arg2) {
            var3 += class61.field1516 + class110.field2678;
        }
        if (arg1 != -20) {
            field3301 = null;
        }
        if (arg0) {
            var3 += class50.field1264 + class104.field2506;
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)I", line = 1064)
    public final int method1059(int arg0) {
        int var2 = 0;
        int var3 = 0;
        ++field3297;
        for (int var4 = 0; ~super.field2471.length < ~var4; ++var4) {
            if (~super.field2450[var4] < -1) {
                var2 += 100;
                var3 += this.method1054(-10923, var4);
            }
        }
        if (arg0 != 1585279406) {
            this.method1061((byte[]) null, (class82) null, -2, (byte) 77, false);
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 1102)
    public static void method1060(byte arg0) {
        field3308 = null;
        field3312 = null;
        if (arg0 > 54) {
            field3290 = null;
            field3300 = null;
            field3309 = null;
            field3301 = null;
            field3285 = null;
            field3306 = null;
            field3296 = null;
            field3278 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BLnd;IBZ)V", line = 1133)
    public final void method1061(byte[] arg0, class82 arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 == -117) {
            ++field3311;
            if (this.field3307 != arg1) {
                if (!arg4 && ~this.field3299 == ~arg2) {
                    this.field3284 = true;
                }
                if (arg0 == null || ~arg0.length >= -3) {
                    this.field3288[arg2] = false;
                    if (this.field3281 || arg4) {
                        class80.method536(arg2, super.field2485[arg2], (byte) 93, this, arg4, this.field3292, (byte) 2);
                    }
                    return;
                }
                class130.field3106.reset();
                class130.field3106.update(arg0, 0, arg0.length + -2);
                int var6 = (int) class130.field3106.getValue();
                int var7 = (arg0[arg0.length + -2] << 8 & 65280) + (arg0[arg0.length + -1] & 255);
                if (~super.field2485[arg2] != ~var6 || super.field2464[arg2] != var7) {
                    this.field3288[arg2] = false;
                    if (this.field3281 || arg4) {
                        class80.method536(arg2, super.field2485[arg2], (byte) 125, this, arg4, this.field3292, (byte) 2);
                    }
                    return;
                }
                this.field3288[arg2] = true;
                if (arg4) {
                    super.field2471[arg2] = arg0;
                    return;
                }
            } else {
                if (this.field3284) {
                    throw new RuntimeException();
                }
                if (arg0 == null) {
                    class80.method536(this.field3292, this.field3293, (byte) 96, this, true, 255, (byte) 0);
                    return;
                }
                class130.field3106.reset();
                class130.field3106.update(arg0, 0, arg0.length);
                int var8 = (int) class130.field3106.getValue();
                if (~this.field3293 != ~var8) {
                    class80.method536(this.field3292, this.field3293, (byte) 107, this, true, 255, (byte) 0);
                    return;
                }
                this.method733(1, arg0);
                this.method1065(arg3 + 119);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)I", line = 1228)
    public final int method1062(int arg0) {
        ++field3283;
        if (this.field3284) {
            return 100;
        } else if (super.field2471 != null) {
            return 99;
        } else {
            if (arg0 < 109) {
                this.field3292 = -57;
            }
            int var2 = class18.method106(255, this.field3292, true);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BZIZI)V", line = 1253)
    public final void method1063(byte[] arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        ++field3295;
        if (!arg3) {
            arg0[arg0.length + -2] = (byte) (super.field2464[arg2] >> 8);
            arg0[arg0.length + -1] = (byte) super.field2464[arg2];
            if (this.field3286 != null) {
                class98.method684(arg2, arg0, 0, this.field3286);
                this.field3288[arg2] = true;
            }
            if (arg1) {
                super.field2471[arg2] = arg0;
            }
        } else {
            if (this.field3284) {
                throw new RuntimeException();
            }
            if (this.field3307 != null) {
                class98.method684(this.field3292, arg0, 0, this.field3307);
            }
            this.method733(1, arg0);
            this.method1065(2);
        }
        if (arg4 != -1) {
            field3275 = -13;
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V", line = 1295)
    public static final void method1064(int arg0) {
        ++field3279;
        if (class125.field2967 == 0) {
            if (arg0 >= -64) {
                method1066(117, -91, (class99) null, 68, -4, 84, -97, 108, (class124) null, 80);
            }
            if (~class80.field1841 == -2) {
                int var1 = class132.field3191 + -25 + -550;
                int var2 = class90.field2041 + -5 - 4;
                if (~var1 <= -1 && ~var2 <= -1 && var1 < 146 && ~var2 > -152) {
                    var2 -= 75;
                    int var3 = class42.field1041 + class2.field43 & 2047;
                    var1 -= 73;
                    int var4 = class109.field2659[var3];
                    int var5 = class109.field2657[var3];
                    int var6 = (class63.field1541 + 256) * var4 >> 8;
                    int var7 = (class63.field1541 + 256) * var5 >> 8;
                    int var8 = var1 * var7 + var2 * var6 >> 11;
                    int var9 = var2 * var7 + -(var1 * var6) >> 11;
                    int var10 = class13.field332.field792 + var8 >> 7;
                    int var11 = -var9 + class13.field332.field838 >> 7;
                    boolean var12 = class128.method1015(0, class13.field332.field803[0], var10, var11, class13.field332.field819[0], true, 0, 0, 0, 1, (byte) 97, 0);
                    if (var12) {
                        class92.field2094.method756(var1, 1);
                        class92.field2094.method756(var2, 1);
                        class92.field2094.method768(class2.field43, 108);
                        class92.field2094.method756(57, 1);
                        class92.field2094.method756(class42.field1041, 1);
                        class92.field2094.method756(class63.field1541, 1);
                        class92.field2094.method756(89, 1);
                        class92.field2094.method768(class13.field332.field792, 95);
                        class92.field2094.method768(class13.field332.field838, 74);
                        class92.field2094.method756(class106.field2574, 1);
                        class92.field2094.method756(63, 1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V", line = 1358)
    private final void method1065(int arg0) {
        ++field3304;
        this.field3288 = new boolean[super.field2471.length];
        if (arg0 == 2) {
            for (int var2 = 0; ~var2 > ~this.field3288.length; ++var2) {
                this.field3288[var2] = false;
            }
            if (this.field3286 == null) {
                this.field3284 = true;
            } else {
                this.field3299 = -1;
                for (int var3 = 0; this.field3288.length > var3; ++var3) {
                    if (super.field2450[var3] > 0) {
                        class29.method186(this, arg0 + -1, var3, this.field3286);
                        this.field3299 = var3;
                    }
                }
                if (this.field3299 == -1) {
                    this.field3284 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILq;IIIIILud;I)V", line = 1407)
    public static final void method1066(int arg0, int arg1, class99 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class124 arg8, int arg9) {
        int var10 = class89.field2021[arg7][arg5][arg1];
        ++field3294;
        int var11 = class89.field2021[arg7][arg5 - -1][arg1];
        int var12 = class89.field2021[arg7][arg5 - -1][arg1 - -1];
        int var13 = class89.field2021[arg7][arg5][arg1 - -1];
        int var14 = var10 + var11 + var13 - -var12 >> 2;
        class14 var15 = class114.method884(arg6, (byte) -56);
        int var16 = -80 % ((29 - arg3) / 50);
        int var17 = (arg6 << 14) + (arg5 - -(arg1 << 7) - -1073741824);
        int var18 = (arg4 << 6) + arg9;
        if (~var15.field391 == -2) {
            var18 += 256;
        }
        if (~var15.field360 == -1) {
            var17 += Integer.MIN_VALUE;
        }
        if (arg9 == 22) {
            class1 var19;
            if (~var15.field381 == 0 && var15.field361 == null) {
                var19 = var15.method85(var12, 22, var10, var11, var13, arg4, -1);
            } else {
                var19 = new class38(arg6, 22, arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
            }
            arg8.method942(arg0, arg5, arg1, var14, var19, var17, var18);
            if (var15.field410 && ~var15.field360 == -2) {
                arg2.method697(arg1, (byte) 127, arg5);
            }
        } else if (arg9 != 10 && ~arg9 != -12) {
            if (~arg9 <= -13) {
                class1 var20;
                if (~var15.field381 == 0 && var15.field361 == null) {
                    var20 = var15.method85(var12, arg9, var10, var11, var13, arg4, -1);
                } else {
                    var20 = new class38(arg6, arg9, arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
                }
                arg8.method947(arg0, arg5, arg1, var14, 1, 1, var20, 0, var17, var18);
                if (var15.field410) {
                    arg2.method691(arg4, var15.field379, false, var15.field363, arg1, var15.field370, arg5);
                }
            } else if (~arg9 == -1) {
                class1 var21;
                if (var15.field381 == -1 && var15.field361 == null) {
                    var21 = var15.method85(var12, 0, var10, var11, var13, arg4, -1);
                } else {
                    var21 = new class38(arg6, 0, arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
                }
                arg8.method971(arg0, arg5, arg1, var14, var21, (class1) null, class35.field901[arg4], 0, var17, var18);
                if (var15.field410) {
                    arg2.method692(arg5, arg1, arg4, (byte) 108, var15.field379, arg9);
                }
            } else if (arg9 == 1) {
                class1 var22;
                if (var15.field381 == -1 && var15.field361 == null) {
                    var22 = var15.method85(var12, 1, var10, var11, var13, arg4, -1);
                } else {
                    var22 = new class38(arg6, 1, arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
                }
                arg8.method971(arg0, arg5, arg1, var14, var22, (class1) null, class96.field2239[arg4], 0, var17, var18);
                if (var15.field410) {
                    arg2.method692(arg5, arg1, arg4, (byte) 43, var15.field379, arg9);
                }
            } else if (arg9 == 2) {
                int var23 = arg4 + 1 & 3;
                class1 var24;
                class1 var25;
                if (~var15.field381 == 0 && var15.field361 == null) {
                    var24 = var15.method85(var12, 2, var10, var11, var13, 4 - -arg4, -1);
                    var25 = var15.method85(var12, 2, var10, var11, var13, var23, -1);
                } else {
                    var24 = new class38(arg6, 2, 4 - -arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
                    var25 = new class38(arg6, 2, var23, var10, var11, var12, var13, var15.field381, true, (class1) null);
                }
                arg8.method971(arg0, arg5, arg1, var14, var24, var25, class35.field901[arg4], class35.field901[var23], var17, var18);
                if (var15.field410) {
                    arg2.method692(arg5, arg1, arg4, (byte) 14, var15.field379, arg9);
                }
            } else if (~arg9 == -4) {
                class1 var26;
                if (var15.field381 == -1 && var15.field361 == null) {
                    var26 = var15.method85(var12, 3, var10, var11, var13, arg4, -1);
                } else {
                    var26 = new class38(arg6, 3, arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
                }
                arg8.method971(arg0, arg5, arg1, var14, var26, (class1) null, class96.field2239[arg4], 0, var17, var18);
                if (var15.field410) {
                    arg2.method692(arg5, arg1, arg4, (byte) 26, var15.field379, arg9);
                }
            } else if (arg9 == 9) {
                class1 var27;
                if (var15.field381 == -1 && var15.field361 == null) {
                    var27 = var15.method85(var12, arg9, var10, var11, var13, arg4, -1);
                } else {
                    var27 = new class38(arg6, arg9, arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
                }
                arg8.method947(arg0, arg5, arg1, var14, 1, 1, var27, 0, var17, var18);
                if (var15.field410) {
                    arg2.method691(arg4, var15.field379, false, var15.field363, arg1, var15.field370, arg5);
                }
            } else {
                if (var15.field353) {
                    if (arg4 != 1) {
                        if (~arg4 != -3) {
                            if (~arg4 == -4) {
                                int var28 = var13;
                                var13 = var10;
                                var10 = var11;
                                var11 = var12;
                                var12 = var28;
                            }
                        } else {
                            int var29 = var13;
                            var13 = var11;
                            var11 = var29;
                            int var30 = var12;
                            var12 = var10;
                            var10 = var30;
                        }
                    } else {
                        int var31 = var13;
                        var13 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var31;
                    }
                }
                if (arg9 == 4) {
                    class1 var32;
                    if (var15.field381 == -1 && var15.field361 == null) {
                        var32 = var15.method85(var12, 4, var10, var11, var13, 0, -1);
                    } else {
                        var32 = new class38(arg6, 4, 0, var10, var11, var12, var13, var15.field381, true, (class1) null);
                    }
                    arg8.method974(arg0, arg5, arg1, var14, var32, class35.field901[arg4], arg4 * 512, 0, 0, var17, var18);
                } else if (~arg9 == -6) {
                    int var33 = 16;
                    int var34 = arg8.method970(arg0, arg5, arg1);
                    if (~var34 < -1) {
                        var33 = class114.method884((var34 & 536865008) >> 14, (byte) -56).field365;
                    }
                    class1 var35;
                    if (var15.field381 == -1 && var15.field361 == null) {
                        var35 = var15.method85(var12, 4, var10, var11, var13, 0, -1);
                    } else {
                        var35 = new class38(arg6, 4, 0, var10, var11, var12, var13, var15.field381, true, (class1) null);
                    }
                    arg8.method974(arg0, arg5, arg1, var14, var35, class35.field901[arg4], arg4 * 512, class9.field240[arg4] * var33, class23.field532[arg4] * var33, var17, var18);
                } else if (~arg9 == -7) {
                    class1 var36;
                    if (var15.field381 == -1 && var15.field361 == null) {
                        var36 = var15.method85(var12, 4, var10, var11, var13, 0, -1);
                    } else {
                        var36 = new class38(arg6, 4, 0, var10, var11, var12, var13, var15.field381, true, (class1) null);
                    }
                    arg8.method974(arg0, arg5, arg1, var14, var36, 256, arg4, 0, 0, var17, var18);
                } else if (~arg9 == -8) {
                    class1 var37;
                    if (~var15.field381 == 0 && var15.field361 == null) {
                        var37 = var15.method85(var12, 4, var10, var11, var13, 0, -1);
                    } else {
                        var37 = new class38(arg6, 4, 0, var10, var11, var12, var13, var15.field381, true, (class1) null);
                    }
                    arg8.method974(arg0, arg5, arg1, var14, var37, 512, arg4, 0, 0, var17, var18);
                } else if (arg9 == 8) {
                    class1 var38;
                    if (~var15.field381 == 0 && var15.field361 == null) {
                        var38 = var15.method85(var12, 4, var10, var11, var13, 0, -1);
                    } else {
                        var38 = new class38(arg6, 4, 0, var10, var11, var12, var13, var15.field381, true, (class1) null);
                    }
                    arg8.method974(arg0, arg5, arg1, var14, var38, 768, arg4, 0, 0, var17, var18);
                }
            }
        } else {
            class1 var39;
            if (var15.field381 == -1 && var15.field361 == null) {
                var39 = var15.method85(var12, 10, var10, var11, var13, arg4, -1);
            } else {
                var39 = new class38(arg6, 10, arg4, var10, var11, var12, var13, var15.field381, true, (class1) null);
            }
            if (var39 != null) {
                int var40;
                int var41;
                if (arg4 != 1 && arg4 != 3) {
                    var40 = var15.field370;
                    var41 = var15.field363;
                } else {
                    var41 = var15.field370;
                    var40 = var15.field363;
                }
                int var42 = 0;
                if (arg9 == 11) {
                    var42 += 256;
                }
                arg8.method947(arg0, arg5, arg1, var14, var41, var40, var39, var42, var17, var18);
            }
            if (var15.field410) {
                arg2.method691(arg4, var15.field379, false, var15.field363, arg1, var15.field370, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 1715)
    public static final void method1067(byte arg0) {
        ++field3287;
        try {
            if (~class30.field752 == -1) {
                if (class110.field2684 != null) {
                    class110.field2684.method1079(true);
                    class110.field2684 = null;
                }
                class30.field752 = 1;
                class9.field241 = 0;
                class108.field2644 = null;
                class65.field1601 = false;
            }
            if (class30.field752 == 1) {
                if (class108.field2644 == null) {
                    class108.field2644 = class30.field737.method722(true, class21.field486);
                }
                if (~class108.field2644.field2885 == -3) {
                    throw new IOException();
                }
                if (class108.field2644.field2885 == 1) {
                    class110.field2684 = new class137((Socket) class108.field2644.field2887, class30.field737);
                    class108.field2644 = null;
                    class30.field752 = 2;
                }
            }
            if (~class30.field752 == -3) {
                long var1 = class49.field1237 = class92.field2097.method246(105);
                int var3 = (int) (var1 >> 16 & 31L);
                class92.field2094.field2563 = 0;
                class92.field2094.method756(14, 1);
                class92.field2094.method756(var3, 1);
                class110.field2684.method1086(0, class92.field2094.field2554, 2, (byte) 118);
                class100.field2376.field2563 = 0;
                class30.field752 = 3;
            }
            if (~class30.field752 == -4) {
                int var4 = class110.field2684.method1084(117);
                if (var4 != 0) {
                    class113.method874((byte) -74, var4);
                    return;
                }
                class100.field2376.field2563 = 0;
                class30.field752 = 4;
            }
            if (class30.field752 == 4) {
                if (~class100.field2376.field2563 > -9) {
                    int var5 = class110.field2684.method1085(0);
                    if (-class100.field2376.field2563 + 8 < var5) {
                        var5 = 8 - class100.field2376.field2563;
                    }
                    if (var5 > 0) {
                        class110.field2684.method1081(class100.field2376.field2554, 110, var5, class100.field2376.field2563);
                        class100.field2376.field2563 += var5;
                    }
                }
                if (class100.field2376.field2563 == 8) {
                    class100.field2376.field2563 = 0;
                    class41.field1026 = class100.field2376.method808(true);
                    class30.field752 = 5;
                }
            }
            if (class30.field752 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (9.9999999E7D * Math.random()), (int) (class41.field1026 >> 32), (int) class41.field1026 };
                class92.field2094.field2563 = 0;
                class92.field2094.method756(10, 1);
                class92.field2094.method761(var6[0], -23644);
                class92.field2094.method761(var6[1], -23644);
                class92.field2094.method761(var6[2], -23644);
                class92.field2094.method761(var6[3], -23644);
                class92.field2094.method761(class30.field737.field2424, -23644);
                class92.field2094.method793(class92.field2097.method246(-120), false);
                class92.field2094.method789(true, class92.field2117);
                class92.field2094.method804((byte) -89, class21.field479, class126.field2999);
                class51.field1303.field2563 = 0;
                if (class115.field2769 != 40) {
                    class51.field1303.method756(16, 1);
                } else {
                    class51.field1303.method756(18, 1);
                }
                class51.field1303.method756(class92.field2094.field2563 + 61, 1);
                class51.field1303.method761(441, -23644);
                class51.field1303.method756(!class8.field209 ? 0 : 1, 1);
                class51.field1303.method761(class42.field1057.field2446, -23644);
                class51.field1303.method761(class43.field1077.field2446, -23644);
                class51.field1303.method761(class22.field494.field2446, -23644);
                class51.field1303.method761(class29.field632.field2446, -23644);
                class51.field1303.method761(class41.field1016.field2446, -23644);
                class51.field1303.method761(class80.field1826.field2446, -23644);
                class51.field1303.method761(class50.field1282.field2446, -23644);
                class51.field1303.method761(class107.field2603.field2446, -23644);
                class51.field1303.method761(class106.field2578.field2446, -23644);
                class51.field1303.method761(class2.field42.field2446, -23644);
                class51.field1303.method761(class103.field2494.field2446, -23644);
                class51.field1303.method761(class98.field2324.field2446, -23644);
                class51.field1303.method761(class136.field3333.field2446, -23644);
                class51.field1303.method761(class90.field2042.field2446, -23644);
                class51.field1303.method811(true, class92.field2094.field2563, 0, class92.field2094.field2554);
                class110.field2684.method1086(0, class51.field1303.field2554, class51.field1303.field2563, (byte) -121);
                class92.field2094.method293((byte) 25, var6);
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    var6[var7] += 50;
                }
                class100.field2376.method293((byte) 25, var6);
                class30.field752 = 6;
            }
            int var8 = 32 % ((arg0 - -76) / 35);
            if (~class30.field752 == -7 && class110.field2684.method1085(0) > 0) {
                int var9 = class110.field2684.method1084(-103);
                if (var9 == 21 && ~class115.field2769 == -21) {
                    class30.field752 = 7;
                } else if (var9 == 2) {
                    class30.field752 = 9;
                } else {
                    if (~var9 == -16 && class115.field2769 == 40) {
                        class21.method124(-1);
                        return;
                    }
                    if (var9 != 23 || class64.field1551 >= 1) {
                        class113.method874((byte) -5, var9);
                        return;
                    }
                    class30.field752 = 0;
                    ++class64.field1551;
                }
            }
            if (class30.field752 == 7 && class110.field2684.method1085(0) > 0) {
                class120.field2836 = 60 * class110.field2684.method1084(-5) + 180;
                class30.field752 = 8;
            }
            if (class30.field752 == 8) {
                class9.field241 = 0;
                class93.method625(class48.field1227, client.method114(true, new class40[] { class21.method121(23444, class120.field2836 / 60), class41.field1015 }), (byte) -89, class88.field1989);
                if (~(--class120.field2836) >= -1) {
                    class30.field752 = 0;
                }
            } else {
                if (class30.field752 == 9 && class110.field2684.method1085(0) >= 8) {
                    class107.field2610 = class110.field2684.method1084(92);
                    class41.field1020 = ~class110.field2684.method1084(107) == -2;
                    class101.field2414 = class110.field2684.method1084(113);
                    class101.field2414 <<= 8;
                    class101.field2414 += class110.field2684.method1084(113);
                    class89.field2008 = class110.field2684.method1084(126);
                    class110.field2684.method1081(class100.field2376.field2554, 107, 1, 0);
                    class100.field2376.field2563 = 0;
                    class113.field2736 = class100.field2376.method295((byte) -102);
                    class110.field2684.method1081(class100.field2376.field2554, 98, 2, 0);
                    class100.field2376.field2563 = 0;
                    class51.field1305 = class100.field2376.method797(-7916);
                    class30.field752 = 10;
                }
                if (class30.field752 == 10) {
                    if (~class110.field2684.method1085(0) <= ~class51.field1305) {
                        class100.field2376.field2563 = 0;
                        class110.field2684.method1081(class100.field2376.field2554, 127, class51.field1305, 0);
                        class129.method1021(79);
                        class125.field2957 = -1;
                        class85.method557(false, (byte) -66);
                        class113.field2736 = -1;
                    }
                } else {
                    ++class9.field241;
                    if (~class9.field241 < -2001) {
                        if (class64.field1551 < 1) {
                            ++class64.field1551;
                            if (class21.field486 != class108.field2645) {
                                class21.field486 = class108.field2645;
                            } else {
                                class21.field486 = class120.field2823;
                            }
                            class30.field752 = 0;
                        } else {
                            class113.method874((byte) -6, -3);
                        }
                    }
                }
            }
        } catch (IOException var10) {
            if (~class64.field1551 > -2) {
                class30.field752 = 0;
                if (class21.field486 == class108.field2645) {
                    class21.field486 = class120.field2823;
                } else {
                    class21.field486 = class108.field2645;
                }
                ++class64.field1551;
            } else {
                class113.method874((byte) 124, -2);
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V", line = 2027)
    public static final void method1068(boolean arg0) {
        ++field3310;
        class40.field972.method40((byte) -101);
        if (arg0) {
            field3296 = null;
        }
    }
}
