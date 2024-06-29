import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class45 {

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public int field694 = -1;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field680 = 1405;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field684 = 0;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "[I")
    public static int[] field682 = new int[14];

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
    public static boolean field678 = false;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    private int field677;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "J")
    private long field696;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "J")
    private long field697;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "Lhh;")
    public static class84 field693;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "Z")
    public boolean field676;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
    public int[] field679;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "[[I")
    private int[][] field691;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lio;III)V")
    public final void method337(class300 arg0, int arg1, int arg2, int arg3) {
        field698++;
        int var5 = class353.field5341[arg1];
        int var6 = -127 % ((73 - arg3) / 41);
        if (this.field689[var5] != 0 && arg0.method1854(arg2, 1471) != null) {
            this.field689[var5] = class29.method239(arg2, Integer.MIN_VALUE);
            this.method347(-54);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILrq;BI)J")
    public static final long method338(int arg0, class232 arg1, byte arg2, int arg3) {
        field690++;
        int var4 = -128 / ((arg2 + 13) / 45);
        long var5 = 4194304L;
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class510 var11 = class246.field3567.method609(119, arg1.method379((byte) -96));
        long var12 = (long) (arg1.method380(true) << 14 | arg0 << 7 | arg3 | arg1.method375(-13015) << 20 | 0x40000000);
        if (var11.field7491 == 0) {
            var12 |= var9;
        }
        if (var11.field7458 == 1) {
            var12 |= var5;
        }
        if (var11.field7493) {
            var12 |= var7;
        }
        return var12 | (long) arg1.method379((byte) -96) << 32;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    public static void method339(boolean arg0) {
        if (arg0) {
            field682 = null;
            field693 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZII[I[I)V")
    public final void method340(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.field679 = arg5;
        if (this.field677 != arg0) {
            this.field691 = null;
            this.field677 = arg0;
        }
        if (arg3 != 28164) {
            this.method343(104, null, 111, null, -115, null, -83, -66, null, null, null, null);
        }
        this.field676 = arg1;
        this.field689 = arg4;
        field695++;
        this.field694 = arg2;
        this.method347(-60);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V")
    public final void method341(byte arg0, int arg1, int arg2) {
        this.field679[arg1] = arg2;
        if (arg0 == 60) {
            field685++;
            this.method347(arg0 - 145);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BZ)V")
    public final void method342(byte arg0, boolean arg1) {
        field687++;
        this.field676 = arg1;
        this.method347(-125);
        if (arg0 != -6) {
            this.field689 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILqa;ILdn;ILio;IILcl;Lbk;Lav;Lpn;)Lc;")
    public final class121 method343(int arg0, class162 arg1, int arg2, class357 arg3, int arg4, class300 arg5, int arg6, int arg7, class173 arg8, class253 arg9, class449 arg10, class522 arg11) {
        field681++;
        if (this.field694 != -1) {
            return arg9.method1605((byte) -117, this.field694).method1063(arg2, arg1, arg6, arg10, (byte) 42, arg0, arg3, arg7, arg8);
        }
        int var13 = arg6;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg3.field5395[arg7];
            var13 = arg6 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class402 var25 = arg8.method1232((byte) -46, var23);
            if (var25 != null) {
                var15 |= var25.method2501(var24, -13123);
                var14 |= var25.method2499(var24, (byte) 80);
                var17 |= var25.method2500(var24, true);
                var16 |= arg3.field5391;
            }
            if ((arg3.field5411 || class66.field1151) && arg2 != -1 && arg2 < arg3.field5395.length) {
                int var26 = arg3.field5395[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class402 var29 = var23 == var27 ? var25 : arg8.method1232((byte) -46, var27);
                if (var29 != null) {
                    var15 |= var29.method2501(var28, -13123);
                    var14 |= var29.method2499(var28, (byte) 86);
                    var17 |= var29.method2500(var28, true);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg4 < 125) {
            this.field676 = false;
        }
        class364 var30 = class87.field1449;
        class121 var31;
        synchronized (class87.field1449) {
            var31 = (class121) class87.field1449.method2339(-87, this.field697);
        }
        if (var31 == null || arg1.method518(var31.method915(), var13) != 0) {
            if (var31 != null) {
                var13 = arg1.method472(var13, var31.method915());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field689[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg5.method1854(var35 & 0x3FFFFFFF, 1471).method158(0)) {
                        var33 = true;
                    }
                } else if (!arg11.method3077(-10, var35 & 0x3FFFFFFF).method1214((byte) 86, this.field676)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class527[] var36 = new class527[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field689[var38];
                if ((var39 & 0x40000000) != 0) {
                    class527 var41 = arg11.method3077(-125, var39 & 0x3FFFFFFF).method1222(91, this.field676);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class527 var40 = arg5.method1854(var39 & 0x3FFFFFFF, 1471).method155((byte) -33);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class527 var43 = new class527(var36, var37);
            var31 = arg1.method499(var43, var42, class472.field6951, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field679[var44] < class497.field7230[var44].length) {
                    var31.method917(class477.field7000[var44], class497.field7230[var44][this.field679[var44]]);
                }
                if (class274.field3964[var44].length > this.field679[var44]) {
                    var31.method917(class469.field6909[var44], class274.field3964[var44][this.field679[var44]]);
                }
            }
            var31.method894(var13);
            class364 var45 = class87.field1449;
            synchronized (class87.field1449) {
                class87.field1449.method2342(this.field697, var31, -53);
            }
        }
        if (arg3 == null) {
            return var31;
        } else {
            var31.method881((byte) 4, var13, true);
            return arg3.method2307(arg0, arg7, arg2, arg6, var31, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([Ltk;IILav;ILqa;ILfc;Lpn;ZIILdn;ILcl;ILdn;Lio;Lbk;)Lc;")
    public final class121 method344(class228[] arg0, int arg1, int arg2, class449 arg3, int arg4, class162 arg5, int arg6, class169 arg7, class522 arg8, boolean arg9, int arg10, int arg11, class357 arg12, int arg13, class173 arg14, int arg15, class357 arg16, class300 arg17, class253 arg18) {
        field688++;
        if (this.field694 != -1) {
            return arg18.method1605((byte) -117, this.field694).method1054(65535, arg11, arg2, arg4, arg5, arg6, arg14, arg7, arg13, arg16, arg15, arg1, arg0, arg3, arg12);
        }
        int var20 = arg1;
        long var21 = this.field697;
        int[] var23 = this.field689;
        if (arg12 != null && (arg12.field5390 >= 0 || arg12.field5392 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field689[var24];
            }
            if (arg12.field5390 >= 0) {
                if (arg12.field5390 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class29.method239(1073741824, arg12.field5390);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg12.field5392 >= 0) {
                if (arg12.field5392 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class29.method239(arg12.field5392, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg12 != null || arg16 != null;
        int var29 = arg0 == null ? 0 : arg0.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class85.field1412[var30] = null;
            if (arg0[var30] != null) {
                class357 var31 = arg14.method1233(true, arg0[var30].field3341);
                if (var31.field5395 != null) {
                    class412.field6068[var30] = var31;
                    var28 = true;
                    int var32 = arg0[var30].field3340;
                    int var33 = arg0[var30].field3346;
                    int var34 = var31.field5395[var32];
                    class85.field1412[var30] = arg14.method1232((byte) -46, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class309.field4412[var30] = var35;
                    if (class85.field1412[var30] != null) {
                        var26 |= class85.field1412[var30].method2501(var35, -13123);
                        var25 |= class85.field1412[var30].method2499(var35, (byte) 89);
                        var27 |= class85.field1412[var30].method2500(var35, true);
                    }
                    if ((var31.field5411 || class66.field1151) && var33 != -1 && var33 < var31.field5395.length) {
                        class108.field1684[var30] = var31.field5408[var32];
                        class408.field6009[var30] = arg0[var30].field3342;
                        int var36 = var31.field5395[var33];
                        class434.field6305[var30] = arg14.method1232((byte) -46, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class274.field3955[var30] = var37;
                        if (class434.field6305[var30] != null) {
                            var26 |= class434.field6305[var30].method2501(var37, -13123);
                            var25 |= class434.field6305[var30].method2499(var37, (byte) 96);
                            var27 |= class434.field6305[var30].method2500(var37, true);
                        }
                    } else {
                        class108.field1684[var30] = 0;
                        class408.field6009[var30] = 0;
                        class434.field6305[var30] = null;
                        class274.field3955[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class402 var41 = null;
        class402 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class402 var46 = null;
        class402 var47 = null;
        if (var28) {
            if (arg12 != null) {
                int var48 = arg12.field5395[arg13];
                int var49 = var48 >>> 16;
                var41 = arg14.method1232((byte) -46, var49);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method2501(var38, -13123);
                    var25 |= var41.method2499(var38, (byte) 93);
                    var27 |= var41.method2500(var38, true);
                }
                if ((arg12.field5411 || class66.field1151) && arg4 != -1 && arg12.field5395.length > arg4) {
                    int var50 = arg12.field5395[arg4];
                    var40 = arg12.field5408[arg13];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg14.method1232((byte) -46, var51);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method2501(var39, -13123);
                        var25 |= var42.method2499(var39, (byte) 127);
                        var27 |= var42.method2500(var39, true);
                    }
                }
            }
            var20 = arg1 | 0x20;
            if (arg16 != null) {
                int var52 = arg16.field5395[arg11];
                int var53 = var52 >>> 16;
                var46 = arg14.method1232((byte) -46, var53);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method2501(var43, arg10 - 13125);
                    var25 |= var46.method2499(var43, (byte) 87);
                    var27 |= var46.method2500(var43, true);
                }
                if ((arg16.field5411 || class66.field1151) && arg2 != -1 && arg16.field5395.length > arg2) {
                    var45 = arg16.field5408[arg11];
                    int var54 = arg16.field5395[arg2];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg14.method1232((byte) -46, var55);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method2501(var44, arg10 ^ 0xFFFFCCBF);
                        var25 |= var47.method2499(var44, (byte) 82);
                        var27 |= var47.method2500(var44, true);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class364 var56 = class248.field3579;
        class121 var57;
        synchronized (class248.field3579) {
            var57 = (class121) class248.field3579.method2339(arg10 - 78, var21);
        }
        class441 var58 = null;
        if (this.field677 != -1) {
            var58 = arg7.method1199(this.field677, (byte) -40);
        }
        if (var57 == null || arg5.method518(var57.method915(), var20) != 0 || var58 != null && var58.field6460 != null && this.field691 == null) {
            if (var57 != null) {
                var20 = arg5.method472(var20, var57.method915());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg17.method1854(var62 & 0x3FFFFFFF, arg10 + 1469).method157(arg10 - 1120)) {
                        var60 = true;
                    }
                } else if (!arg8.method3077(-120, var62 & 0x3FFFFFFF).method1219(this.field676, (byte) -89)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field696 != -1L) {
                    class364 var88 = class248.field3579;
                    synchronized (class248.field3579) {
                        var57 = (class121) class248.field3579.method2339(-101, this.field696);
                    }
                }
                if (var57 == null || arg5.method518(var57.method915(), var20) != 0 || var58 != null && var58.field6460 != null && this.field691 == null) {
                    return null;
                }
            } else {
                class527[] var63 = new class527[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class527 var66 = arg8.method3077(arg10 ^ 0x30, var65 & 0x3FFFFFFF).method1221(this.field676, true);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    } else if ((var65 & Integer.MIN_VALUE) != 0) {
                        class527 var67 = arg17.method1854(var65 & 0x3FFFFFFF, 1471).method159((byte) 42);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field6460 != null) {
                    for (int var68 = 0; var68 < var58.field6460.length; var68++) {
                        if (var58.field6460[var68] != null && var63[var68] != null) {
                            int var69 = var58.field6460[var68][0];
                            int var70 = var58.field6460[var68][1];
                            int var71 = var58.field6460[var68][2];
                            int var72 = var58.field6460[var68][3] << 3;
                            int var73 = var58.field6460[var68][4] << 3;
                            int var74 = var58.field6460[var68][5] << 3;
                            if (this.field691 == null) {
                                this.field691 = new int[var58.field6460.length][];
                            }
                            if (this.field691[var68] == null) {
                                int[] var75 = this.field691[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[14] = -var71;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[13] = -var70;
                                    var75[12] = -var69;
                                } else {
                                    int var76 = class324.field4974[var72];
                                    int var77 = class324.field4966[var72];
                                    int var78 = class324.field4974[var73];
                                    int var79 = class324.field4966[var73];
                                    int var80 = class324.field4974[var74];
                                    int var81 = class324.field4966[var74];
                                    int var82 = var77 * var80 + 16384 >> 15;
                                    int var83 = var77 * var81 + 16384 >> 15;
                                    var75[3] = var76 * var81 + 16384 >> 15;
                                    var75[2] = var76 * var79 + 16384 >> 15;
                                    var75[5] = -var77;
                                    var75[4] = var76 * var80 + 16384 >> 15;
                                    var75[8] = var76 * var78 + 16384 >> 15;
                                    var75[0] = var79 * var83 + var78 * var80 + 16384 >> 15;
                                    var75[7] = var78 * var82 + -var79 * -var81 + 16384 >> 15;
                                    var75[6] = -var79 * var80 + (var78 * var83) + 16384 >> 15;
                                    var75[1] = -var81 * var78 + var79 * var82 + 16384 >> 15;
                                    var75[12] = var75[3] * -var70 + var75[6] * -var71 + var75[0] * -var69 + 16384 >> 15;
                                    var75[14] = var75[8] * -var71 + var75[2] * -var69 + (var75[5] * -var70) + 16384 >> 15;
                                    var75[13] = var75[1] * -var69 + var75[7] * -var71 + var75[4] * -var70 + 16384 >> 15;
                                }
                                var75[10] = var70;
                                var75[11] = var71;
                                var75[9] = var69;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method3119(var74, var73, var72, 111);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method3114(var71, var69, false, var70);
                            }
                        }
                    }
                }
                class527 var84 = new class527(var63, var63.length);
                int var85 = var20 | 0x4000;
                var57 = arg5.method499(var84, var85, class472.field6951, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    if (class497.field7230[var86].length > this.field679[var86]) {
                        var57.method917(class477.field7000[var86], class497.field7230[var86][this.field679[var86]]);
                    }
                    if (this.field679[var86] < class274.field3964[var86].length) {
                        var57.method917(class469.field6909[var86], class274.field3964[var86][this.field679[var86]]);
                    }
                }
                if (arg9) {
                    var57.method894(var20);
                    class364 var87 = class248.field3579;
                    synchronized (class248.field3579) {
                        class248.field3579.method2342(var21, var57, -123);
                    }
                    this.field696 = var21;
                }
            }
        }
        class121 var89 = var57.method881((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class85.field1412[var90] != null) {
                var89.method887(class85.field1412[var90], false, -116, class309.field4412[var90], class108.field1684[var90], class274.field3955[var90], 0, var91, this.field691 == null ? null : this.field691[var90], class408.field6009[var90] - 1, class434.field6305[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method921(var38, var45, var40, arg12.field5412, arg6 - 1, var41, false, var42, arg15 - 1, arg10 ^ 0xFFFFFFD2, var46, var43, var44, var47, var39);
        } else if (var41 != null) {
            var89.method893(arg15 - 1, false, var41, var38, var40, var42, var39, 0, false);
        } else if (var46 != null) {
            var89.method893(arg6 - 1, false, var46, var43, var45, var47, var44, 0, false);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class85.field1412[var92] = null;
            class434.field6305[var92] = null;
            class412.field6068[var92] = null;
        }
        if (arg10 != 2) {
            this.method342((byte) 112, true);
        }
        return var89;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILqa;Ldn;IILio;ILcl;IIII)Lc;")
    public final class121 method345(int arg0, class162 arg1, class357 arg2, int arg3, int arg4, class300 arg5, int arg6, class173 arg7, int arg8, int arg9, int arg10, int arg11) {
        field683++;
        int var13 = arg0;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg2.field5395[arg9];
            Object var22 = null;
            var13 = arg0 | 0x20;
            int var23 = var21 >>> 16;
            class402 var24 = arg7.method1232((byte) -46, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2501(var25, arg10 + 2253);
                var14 |= var24.method2499(var25, (byte) 124);
                var17 |= var24.method2500(var25, true);
                var16 |= arg2.field5391;
            }
            if ((arg2.field5411 || class66.field1151) && arg3 != -1 && arg2.field5395.length > arg3) {
                int var26 = arg2.field5395[arg3];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class402 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg7.method1232((byte) -46, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2501(var28, arg10 ^ 0xF4D);
                    var14 |= var29.method2499(var28, (byte) 110);
                    var17 |= var29.method2500(var28, true);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg8 | (long) (arg6 << 16) | (long) arg4 << 32;
        class364 var32 = class87.field1449;
        class121 var33;
        synchronized (class87.field1449) {
            var33 = (class121) class87.field1449.method2339(-67, var30);
        }
        if (var33 == null || arg1.method518(var33.method915(), var13) != 0) {
            if (var33 != null) {
                var13 = arg1.method472(var13, var33.method915());
            }
            class527[] var35 = new class527[3];
            int var36 = 0;
            if (!arg5.method1854(arg8, 1471).method158(0) || !arg5.method1854(arg6, 1471).method158(0) || !arg5.method1854(arg4, 1471).method158(0)) {
                return null;
            }
            class527 var37 = arg5.method1854(arg8, 1471).method155((byte) -33);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class527 var38 = arg5.method1854(arg6, arg10 ^ 0xFFFFC64F).method155((byte) -33);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class527 var39 = arg5.method1854(arg4, 1471).method155((byte) -33);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class527 var40 = new class527(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg1.method499(var40, var41, class472.field6951, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field679[var42] < class497.field7230[var42].length) {
                    var33.method917(class477.field7000[var42], class497.field7230[var42][this.field679[var42]]);
                }
                if (this.field679[var42] < class274.field3964[var42].length) {
                    var33.method917(class469.field6909[var42], class274.field3964[var42][this.field679[var42]]);
                }
            }
            var33.method894(var13);
            class364 var43 = class87.field1449;
            synchronized (class87.field1449) {
                class87.field1449.method2342(var30, var33, -86);
            }
        }
        if (arg2 == null) {
            return var33;
        }
        class121 var44 = var33.method881((byte) 4, var13, true);
        if (arg10 != -15376) {
            this.method343(82, null, 63, null, -117, null, -121, -121, null, null, null, null);
        }
        return arg2.method2307(arg11, arg9, arg3, arg0, var44, (byte) 109);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static final void method346(int arg0) {
        class138.method1022(arg0, 1);
        field686++;
        class18.method165(102);
        System.gc();
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
    private final void method347(int arg0) {
        field692++;
        long[] var2 = class81.field1339;
        if (arg0 >= -44) {
            return;
        }
        this.field697 = -1L;
        this.field697 = var2[(int) (((long) (this.field677 >> 8) ^ this.field697) & 0xFFL)] ^ this.field697 >>> 8;
        this.field697 = this.field697 >>> 8 ^ var2[(int) (((long) this.field677 ^ this.field697) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field697 = this.field697 >>> 8 ^ var2[(int) (((long) (this.field689[var3] >> 24) ^ this.field697) & 0xFFL)];
            this.field697 = this.field697 >>> 8 ^ var2[(int) (((long) (this.field689[var3] >> 16) ^ this.field697) & 0xFFL)];
            this.field697 = var2[(int) ((this.field697 ^ (long) (this.field689[var3] >> 8)) & 0xFFL)] ^ this.field697 >>> 8;
            this.field697 = var2[(int) (((long) this.field689[var3] ^ this.field697) & 0xFFL)] ^ this.field697 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field697 = var2[(int) ((this.field697 ^ (long) this.field679[var4]) & 0xFFL)] ^ this.field697 >>> 8;
        }
        this.field697 = this.field697 >>> 8 ^ var2[(int) ((this.field697 ^ (long) (this.field676 ? 1 : 0)) & 0xFFL)];
    }
}
