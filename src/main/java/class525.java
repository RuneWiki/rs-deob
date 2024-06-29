import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class525 {

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public int field7295 = -1;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field7288 = 0;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "Liu;")
    public static class517 field7293 = new class517(97, -1);

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field7306 = -50;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "Luj;")
    public static class574 field7308 = new class574(16);

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    private int field7298;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "J")
    private long field7294;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "J")
    private long field7305;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Ln;")
    public static class472 field7309;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
    public boolean field7290;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "[I")
    public int[] field7289;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "[I")
    private int[] field7296;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "[[I")
    private int[][] field7301;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lqa;IIILbj;ILnk;BILeca;II)Lr;", line = 4)
    public final class519 method2957(class167 arg0, int arg1, int arg2, int arg3, class439 arg4, int arg5, class376 arg6, byte arg7, int arg8, class378 arg9, int arg10, int arg11) {
        field7299++;
        int var13 = arg11;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg4.field6416[arg3];
            var13 = arg11 | 0x20;
            int var23 = var22 >>> 16;
            class285 var24 = arg9.method2298(-80, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1810(var25, (byte) -111);
                var14 |= var24.method1814(var25, arg7 ^ 0x4072);
                var17 |= var24.method1811(true, var25);
                var16 |= arg4.field6415;
            }
            if ((arg4.field6395 || class429.field6257) && arg10 != -1 && arg10 < arg4.field6416.length) {
                int var26 = arg4.field6416[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class285 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg9.method2298(-91, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method1810(var28, (byte) -120);
                    var14 |= var29.method1814(var28, 16384);
                    var17 |= var29.method1811(true, var28);
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
        long var30 = (long) (arg1 << 16) | (long) arg2 << 32 | (long) arg8;
        if (arg7 != 114) {
            field7309 = null;
        }
        class395 var32 = class496.field6946;
        class519 var33;
        synchronized (class496.field6946) {
            var33 = (class519) class496.field6946.method2407(false, var30);
        }
        if (var33 == null || arg0.method560(var33.method1373(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method649(var13, var33.method1373());
            }
            class560[] var35 = new class560[3];
            int var36 = 0;
            if (!arg6.method2283(115, arg8).method2830(-115) || !arg6.method2283(124, arg1).method2830(-121) || !arg6.method2283(120, arg2).method2830(-119)) {
                return null;
            }
            class560 var37 = arg6.method2283(119, arg8).method2829(true);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class560 var38 = arg6.method2283(112, arg1).method2829(true);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class560 var39 = arg6.method2283(126, arg2).method2829(true);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class560 var40 = new class560(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg0.method400(var40, var41, class501.field7024, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class273.field3991[var42].length > this.field7289[var42]) {
                    var33.method1387(class242.field3517[var42], class273.field3991[var42][this.field7289[var42]]);
                }
                if (this.field7289[var42] < class265.field3873[var42].length) {
                    var33.method1387(class201.field2840[var42], class265.field3873[var42][this.field7289[var42]]);
                }
            }
            var33.method1405(var13);
            class395 var43 = class496.field6946;
            synchronized (class496.field6946) {
                class496.field6946.method2408(var33, var30, -124);
            }
        }
        if (arg4 == null) {
            return var33;
        } else {
            class519 var44 = var33.method765((byte) 4, var13, true);
            return arg4.method2593(var44, arg5, arg3, (byte) 115, arg10, arg11);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)Z", line = 159)
    public static final boolean method2958(int arg0, int arg1, int arg2) {
        if (arg0 != 15123) {
            field7288 = 107;
        }
        field7307++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILnk;B)V", line = 175)
    public final void method2959(int arg0, int arg1, class376 arg2, byte arg3) {
        field7302++;
        int var5 = class141.field2210[arg1];
        if (this.field7296[var5] == 0) {
            return;
        }
        int var6 = 22 / ((21 - arg3) / 35);
        if (arg2.method2283(112, arg0) != null) {
            this.field7296[var5] = class188.method1258(Integer.MIN_VALUE, arg0);
            this.method2964(1370654351);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V", line = 198)
    public final void method2960(boolean arg0, boolean arg1) {
        this.field7290 = arg0;
        field7291++;
        this.method2964(1370654351);
        if (!arg1) {
            this.method2960(false, false);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lms;IBLnk;ZLdn;ILeca;[Lkba;Lel;Ltj;Lbj;ILbj;ILqa;III)Lr;", line = 210)
    public final class519 method2961(class107 arg0, int arg1, byte arg2, class376 arg3, boolean arg4, class257 arg5, int arg6, class378 arg7, class527[] arg8, class173 arg9, class31 arg10, class439 arg11, int arg12, class439 arg13, int arg14, class167 arg15, int arg16, int arg17, int arg18) {
        field7297++;
        if (this.field7295 != -1) {
            return arg10.method287(this.field7295, 8).method2574(arg9, arg8, arg14, arg12, (byte) -26, arg18, arg11, arg7, arg13, arg0, arg17, arg15, arg6, arg1, arg16);
        }
        int var20 = arg18;
        long var21 = this.field7294;
        int[] var23 = this.field7296;
        if (arg11 != null && (arg11.field6405 >= 0 || arg11.field6389 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field7296[var24];
            }
            if (arg11.field6405 >= 0) {
                if (arg11.field6405 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class188.method1258(1073741824, arg11.field6405);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg11.field6389 >= 0) {
                if (arg11.field6389 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class188.method1258(1073741824, arg11.field6389);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg11 != null || arg13 != null;
        int var29 = arg8 == null ? 0 : arg8.length;
        if (arg2 <= 26) {
            return null;
        }
        for (int var30 = 0; var30 < var29; var30++) {
            class376.field5528[var30] = null;
            if (arg8[var30] != null) {
                class439 var31 = arg7.method2297((byte) 106, arg8[var30].field7335);
                if (var31.field6416 != null) {
                    class252.field3687[var30] = var31;
                    var28 = true;
                    int var32 = arg8[var30].field7330;
                    int var33 = arg8[var30].field7332;
                    int var34 = var31.field6416[var32];
                    class376.field5528[var30] = arg7.method2298(-114, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class201.field2842[var30] = var35;
                    if (class376.field5528[var30] != null) {
                        var26 |= class376.field5528[var30].method1810(var35, (byte) -56);
                        var25 |= class376.field5528[var30].method1814(var35, 16384);
                        var27 |= class376.field5528[var30].method1811(true, var35);
                    }
                    if ((var31.field6395 || class429.field6257) && var33 != -1 && var33 < var31.field6416.length) {
                        class42.field580[var30] = var31.field6413[var32];
                        class335.field4801[var30] = arg8[var30].field7331;
                        int var36 = var31.field6416[var33];
                        class33.field446[var30] = arg7.method2298(-120, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class528.field7349[var30] = var37;
                        if (class33.field446[var30] != null) {
                            var26 |= class33.field446[var30].method1810(var37, (byte) -70);
                            var25 |= class33.field446[var30].method1814(var37, 16384);
                            var27 |= class33.field446[var30].method1811(true, var37);
                        }
                    } else {
                        class42.field580[var30] = 0;
                        class335.field4801[var30] = 0;
                        class33.field446[var30] = null;
                        class528.field7349[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class285 var41 = null;
        class285 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class285 var46 = null;
        class285 var47 = null;
        if (var28) {
            if (arg11 != null) {
                int var48 = arg11.field6416[arg14];
                int var49 = var48 >>> 16;
                var41 = arg7.method2298(-113, var49);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method1810(var38, (byte) -91);
                    var25 |= var41.method1814(var38, 16384);
                    var27 |= var41.method1811(true, var38);
                }
                if ((arg11.field6395 || class429.field6257) && arg12 != -1 && arg12 < arg11.field6416.length) {
                    var40 = arg11.field6413[arg14];
                    int var50 = arg11.field6416[arg12];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg7.method2298(-73, var51);
                    if (var42 != null) {
                        var26 |= var42.method1810(var39, (byte) -83);
                        var25 |= var42.method1814(var39, 16384);
                        var27 |= var42.method1811(true, var39);
                    }
                }
            }
            var20 = arg18 | 0x20;
            if (arg13 != null) {
                int var52 = arg13.field6416[arg6];
                int var53 = var52 >>> 16;
                var46 = arg7.method2298(-74, var53);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method1810(var43, (byte) -55);
                    var25 |= var46.method1814(var43, 16384);
                    var27 |= var46.method1811(true, var43);
                }
                if ((arg13.field6395 || class429.field6257) && arg1 != -1 && arg13.field6416.length > arg1) {
                    int var54 = arg13.field6416[arg1];
                    var45 = arg13.field6413[arg6];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg7.method2298(-121, var55);
                    if (var47 != null) {
                        var26 |= var47.method1810(var44, (byte) -88);
                        var25 |= var47.method1814(var44, 16384);
                        var27 |= var47.method1811(true, var44);
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
        class395 var56 = class461.field6670;
        class519 var57;
        synchronized (class461.field6670) {
            var57 = (class519) class461.field6670.method2407(false, var21);
        }
        class298 var58 = null;
        if (this.field7298 != -1) {
            var58 = arg9.method1193(112, this.field7298);
        }
        if (var57 == null || arg15.method560(var57.method1373(), var20) != 0 || var58 != null && var58.field4280 != null && this.field7301 == null) {
            if (var57 != null) {
                var20 = arg15.method649(var20, var57.method1373());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg3.method2283(112, var62 & 0x3FFFFFFF).method2824((byte) -112)) {
                        var60 = true;
                    }
                } else if (!arg5.method1621((byte) 118, var62 & 0x3FFFFFFF).method2318(this.field7290, -16797)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field7305 != -1L) {
                    class395 var63 = class461.field6670;
                    synchronized (class461.field6670) {
                        var57 = (class519) class461.field6670.method2407(false, this.field7305);
                    }
                }
                if (var57 == null || arg15.method560(var57.method1373(), var20) != 0 || var58 != null && var58.field4280 != null && this.field7301 == null) {
                    return null;
                }
            } else {
                class560[] var64 = new class560[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class560 var67 = arg5.method1621((byte) 57, var66 & 0x3FFFFFFF).method2313(this.field7290, (byte) -69);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class560 var68 = arg3.method2283(125, var66 & 0x3FFFFFFF).method2823((byte) 102);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field4280 != null) {
                    for (int var69 = 0; var69 < var58.field4280.length; var69++) {
                        if (var58.field4280[var69] != null && var64[var69] != null) {
                            int var70 = var58.field4280[var69][0];
                            int var71 = var58.field4280[var69][1];
                            int var72 = var58.field4280[var69][2];
                            int var73 = var58.field4280[var69][3] << 3;
                            int var74 = var58.field4280[var69][4] << 3;
                            int var75 = var58.field4280[var69][5] << 3;
                            if (this.field7301 == null) {
                                this.field7301 = new int[var58.field4280.length][];
                            }
                            if (this.field7301[var69] == null) {
                                int[] var76 = this.field7301[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[12] = -var70;
                                    var76[13] = -var71;
                                    var76[14] = -var72;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                } else {
                                    int var77 = class285.field4152[var73];
                                    int var78 = class285.field4154[var73];
                                    int var79 = class285.field4152[var74];
                                    int var80 = class285.field4154[var74];
                                    int var81 = class285.field4152[var75];
                                    int var82 = class285.field4154[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[0] = var79 * var81 + (var80 * var84 + 16384) >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[6] = -var80 * var81 + (var79 * var84) + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[1] = var80 * var83 + -var82 * var79 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                    var76[13] = var76[7] * -var72 + var76[4] * -var71 + var76[1] * -var70 + 16384 >> 15;
                                    var76[14] = var76[2] * -var70 + var76[8] * -var72 + var76[5] * -var71 + 16384 >> 15;
                                    var76[12] = var76[0] * -var70 + var76[3] * -var71 + var76[6] * -var72 + 16384 >> 15;
                                }
                                var76[9] = var70;
                                var76[10] = var71;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method3156(var73, 55, var74, var75);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method3151(0, var70, var71, var72);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class560 var86 = new class560(var64, var64.length);
                var57 = arg15.method400(var86, var85, class501.field7024, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class273.field3991[var87].length > this.field7289[var87]) {
                        var57.method1387(class242.field3517[var87], class273.field3991[var87][this.field7289[var87]]);
                    }
                    if (this.field7289[var87] < class265.field3873[var87].length) {
                        var57.method1387(class201.field2840[var87], class265.field3873[var87][this.field7289[var87]]);
                    }
                }
                if (arg4) {
                    var57.method1405(var20);
                    class395 var88 = class461.field6670;
                    synchronized (class461.field6670) {
                        class461.field6670.method2408(var57, var21, -126);
                    }
                    this.field7305 = var21;
                }
            }
        }
        class519 var89 = var57.method765((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class376.field5528[var90] != null) {
                var89.method2937(class376.field5528[var90], 0, class335.field4801[var90] - 1, class33.field446[var90], false, class201.field2842[var90], class528.field7349[var90], -9454, var91, class42.field580[var90], this.field7301 == null ? null : this.field7301[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2935(var40, var41, var45, arg16 - 1, arg17 + -1, var42, (byte) 119, arg11.field6412, var38, false, var47, var39, var46, var44, var43);
        } else if (var41 != null) {
            var89.method2934(0, var39, var42, var38, arg16 - 1, var41, false, var40, (byte) 122);
        } else if (var46 != null) {
            var89.method2934(0, var44, var47, var43, arg17 - 1, var46, false, var45, (byte) 122);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class376.field5528[var92] = null;
            class33.field446[var92] = null;
            class252.field3687[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lms;Ldn;IILnk;Lqa;ILtj;ILbj;ILeca;)Lr;", line = 711)
    public final class519 method2962(class107 arg0, class257 arg1, int arg2, int arg3, class376 arg4, class167 arg5, int arg6, class31 arg7, int arg8, class439 arg9, int arg10, class378 arg11) {
        int var13 = -43 / ((arg8 - 61) / 49);
        field7292++;
        if (this.field7295 != -1) {
            return arg7.method287(this.field7295, 8).method2577(arg0, arg11, arg10, arg3, arg9, arg5, arg2, -1269275376, arg6);
        }
        int var14 = arg6;
        if (arg9 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            Object var22 = null;
            int var23 = arg9.field6416[arg10];
            var14 = arg6 | 0x20;
            int var24 = var23 >>> 16;
            class285 var25 = arg11.method2298(-87, var24);
            int var26 = var23 & 0xFFFF;
            if (var25 != null) {
                var16 |= var25.method1810(var26, (byte) -124);
                var15 |= var25.method1814(var26, 16384);
                var18 |= var25.method1811(true, var26);
                var17 |= arg9.field6415;
            }
            if ((arg9.field6395 || class429.field6257) && arg3 != -1 && arg9.field6416.length > arg3) {
                int var27 = arg9.field6416[arg3];
                int var28 = var27 >>> 16;
                class285 var29 = var24 == var28 ? var25 : arg11.method2298(-76, var28);
                int var30 = var27 & 0xFFFF;
                if (var29 != null) {
                    var16 |= var29.method1810(var30, (byte) -73);
                    var15 |= var29.method1814(var30, 16384);
                    var18 |= var29.method1811(true, var30);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        class395 var31 = class496.field6946;
        class519 var32;
        synchronized (class496.field6946) {
            var32 = (class519) class496.field6946.method2407(false, this.field7294);
        }
        if (var32 == null || arg5.method560(var32.method1373(), var14) != 0) {
            if (var32 != null) {
                var14 = arg5.method649(var14, var32.method1373());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field7296[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var36) != 0 && !arg4.method2283(121, var36 & 0x3FFFFFFF).method2830(-121)) {
                        var34 = true;
                    }
                } else if (!arg1.method1621((byte) 106, var36 & 0x3FFFFFFF).method2325((byte) -111, this.field7290)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class560[] var37 = new class560[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field7296[var39];
                if ((var40 & 0x40000000) != 0) {
                    class560 var42 = arg1.method1621((byte) -114, var40 & 0x3FFFFFFF).method2317(-23007, this.field7290);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class560 var41 = arg4.method2283(122, var40 & 0x3FFFFFFF).method2829(true);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            class560 var43 = new class560(var37, var38);
            int var44 = var14 | 0x4000;
            var32 = arg5.method400(var43, var44, class501.field7024, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field7289[var45] < class273.field3991[var45].length) {
                    var32.method1387(class242.field3517[var45], class273.field3991[var45][this.field7289[var45]]);
                }
                if (this.field7289[var45] < class265.field3873[var45].length) {
                    var32.method1387(class201.field2840[var45], class265.field3873[var45][this.field7289[var45]]);
                }
            }
            var32.method1405(var14);
            class395 var46 = class496.field6946;
            synchronized (class496.field6946) {
                class496.field6946.method2408(var32, this.field7294, -118);
            }
        }
        if (arg9 == null) {
            return var32;
        } else {
            var32.method765((byte) 4, var14, true);
            return arg9.method2593(var32, arg2, arg10, (byte) 115, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 909)
    public static void method2963(int arg0) {
        field7309 = null;
        field7308 = null;
        field7293 = null;
        if (arg0 != 3801) {
            field7293 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 928)
    private final void method2964(int arg0) {
        field7304++;
        this.field7294 = -1L;
        long[] var2 = class442.field6466;
        this.field7294 = this.field7294 >>> 8 ^ var2[(int) (((long) (this.field7298 >> 8) ^ this.field7294) & 0xFFL)];
        this.field7294 = this.field7294 >>> 8 ^ var2[(int) (((long) this.field7298 ^ this.field7294) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field7294 = this.field7294 >>> 8 ^ var2[(int) (((long) (this.field7296[var3] >> 24) ^ this.field7294) & 0xFFL)];
            this.field7294 = this.field7294 >>> 8 ^ var2[(int) (((long) (this.field7296[var3] >> 16) ^ this.field7294) & 0xFFL)];
            this.field7294 = var2[(int) (((long) (this.field7296[var3] >> 8) ^ this.field7294) & 0xFFL)] ^ this.field7294 >>> 8;
            this.field7294 = var2[(int) (((long) this.field7296[var3] ^ this.field7294) & 0xFFL)] ^ this.field7294 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field7294 = this.field7294 >>> 8 ^ var2[(int) ((this.field7294 ^ (long) this.field7289[var4]) & 0xFFL)];
        }
        if (arg0 != 1370654351) {
            method2963(-27);
        }
        this.field7294 = var2[(int) (((long) (this.field7290 ? 1 : 0) ^ this.field7294) & 0xFFL)] ^ this.field7294 >>> 8;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([I[IZIIB)V", line = 968)
    public final void method2965(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 58) {
            return;
        }
        field7300++;
        if (this.field7298 != arg4) {
            this.field7301 = null;
            this.field7298 = arg4;
        }
        this.field7296 = arg0;
        this.field7295 = arg3;
        this.field7289 = arg1;
        this.field7290 = arg2;
        this.method2964(arg5 ^ 0x51B286B5);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBI)V", line = 990)
    public final void method2966(int arg0, byte arg1, int arg2) {
        if (arg1 <= 126) {
            field7308 = null;
        }
        this.field7289[arg0] = arg2;
        field7303++;
        this.method2964(1370654351);
    }
}
