import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class321 {

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public int field4279 = -1;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Ljw;")
    public static class259 field4284 = new class259(1, 19);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "J")
    private long field4286;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "J")
    private long field4291;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Z")
    public boolean field4292;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "[I")
    private int[] field4282;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
    public int[] field4295;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "[[I")
    private int[][] field4283;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ltfa;Leu;IIIIILhca;ILr;II)Lda;", line = 4)
    public final class470 method1853(class288 arg0, class692 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class186 arg7, int arg8, class562 arg9, int arg10, int arg11) {
        if (arg10 != 1282418318) {
            return null;
        }
        field4276++;
        int var13 = arg6;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg6 | 0x20;
            int var21 = arg7.field2570[arg3];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class493 var25 = arg0.method1704(100, var23);
            if (var25 != null) {
                var15 |= var25.method2812(var24, -92);
                var14 |= var25.method2815(arg10 ^ 0xB38FAC4B, var24);
                var17 |= var25.method2813(var24, false);
                var16 |= arg7.field2591;
            }
            if ((arg7.field2585 || class654.field9307) && arg11 != -1 && arg11 < arg7.field2570.length) {
                int var26 = arg7.field2570[arg11];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class493 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg0.method1704(100, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2812(var28, -80);
                    var14 |= var29.method2815(-30011, var28);
                    var17 |= var29.method2813(var28, false);
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
        long var30 = (long) arg5 << 32 | (long) (arg4 << 16) | (long) arg8;
        class380 var32 = class83.field970;
        class470 var33;
        synchronized (class83.field970) {
            var33 = (class470) class83.field970.method2176(arg10 ^ 0xB38FD90E, var30);
        }
        if (var33 == null || arg9.method1053(var33.method604(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method1080(var13, var33.method604());
            }
            class250[] var35 = new class250[3];
            int var36 = 0;
            if (!arg1.method3902(arg8, true).method2719(-126) || !arg1.method3902(arg4, true).method2719(arg10 - 1282418404) || !arg1.method3902(arg5, true).method2719(-59)) {
                return null;
            }
            class250 var37 = arg1.method3902(arg8, true).method2715(arg10 - 1282418388);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class250 var38 = arg1.method3902(arg4, true).method2715(-85);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class250 var39 = arg1.method3902(arg5, true).method2715(-96);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class250 var41 = new class250(var35, var36);
            var33 = arg9.method1089(var41, var40, class138.field1878, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class64.field806.length; var43++) {
                    if (class64.field806[var43][var42].length > this.field4295[var42]) {
                        var33.method638(class119.field1523[var43][var42], class64.field806[var43][var42][this.field4295[var42]]);
                    }
                }
            }
            var33.method602(var13);
            class380 var44 = class83.field970;
            synchronized (class83.field970) {
                class83.field970.method2174(var33, var30, (byte) 124);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            class470 var45 = var33.method649((byte) 4, var13, true);
            return arg7.method1229(arg6, var45, arg3, arg2, arg10 - 1282388019, arg11);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z", line = 167)
    public static final boolean method1854(int arg0, int arg1, int arg2) {
        if (arg2 >= -1) {
            method1854(-60, 26, 63);
        }
        field4281++;
        return class690.method3899(arg0, arg1, (byte) -88) | (arg0 & 0x60000) != 0 || class172.method1169(7, arg1, arg0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)V", line = 182)
    public final void method1855(boolean arg0, int arg1) {
        if (arg1 >= -123) {
            this.method1860((byte) 64);
        }
        this.field4292 = arg0;
        field4277++;
        this.method1860((byte) 120);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 197)
    public static void method1856(int arg0) {
        int var1 = 14 % ((-arg0 - 79) / 45);
        field4284 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILoa;)V", line = 207)
    public final void method1857(int arg0, int arg1, int arg2, class224 arg3) {
        int var5 = 71 % ((arg1 - 56) / 41);
        field4288++;
        if (arg2 == -1) {
            this.field4282[arg0] = 0;
        } else if (arg3.method1394(-95, arg2) != null) {
            this.field4282[arg0] = class665.method3789(1073741824, arg2);
            this.method1860((byte) 120);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V", line = 233)
    public final void method1858(int arg0, int arg1, int arg2) {
        if (arg1 >= 118) {
            this.field4295[arg2] = arg0;
            field4278++;
            this.method1860((byte) 120);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILeu;II)V", line = 245)
    public final void method1859(int arg0, class692 arg1, int arg2, int arg3) {
        if (arg0 != 5) {
            this.field4283 = null;
        }
        field4293++;
        int var5 = class18.field226[arg2];
        if (arg1.method3902(arg3, true) != null) {
            this.field4282[var5] = class665.method3789(Integer.MIN_VALUE, arg3);
            this.method1860((byte) 120);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 262)
    private final void method1860(byte arg0) {
        field4280++;
        long[] var2 = class702.field9873;
        this.field4286 = -1L;
        this.field4286 = this.field4286 >>> 8 ^ var2[(int) (((long) (this.field4294 >> 8) ^ this.field4286) & 0xFFL)];
        this.field4286 = var2[(int) ((this.field4286 ^ (long) this.field4294) & 0xFFL)] ^ this.field4286 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4286 = this.field4286 >>> 8 ^ var2[(int) ((this.field4286 ^ (long) (this.field4282[var3] >> 24)) & 0xFFL)];
            this.field4286 = this.field4286 >>> 8 ^ var2[(int) (((long) (this.field4282[var3] >> 16) ^ this.field4286) & 0xFFL)];
            this.field4286 = var2[(int) ((this.field4286 ^ (long) (this.field4282[var3] >> 8)) & 0xFFL)] ^ this.field4286 >>> 8;
            this.field4286 = var2[(int) ((this.field4286 ^ (long) this.field4282[var3]) & 0xFFL)] ^ this.field4286 >>> 8;
        }
        if (arg0 == 120) {
            for (int var4 = 0; var4 < 5; var4++) {
                this.field4286 = var2[(int) (((long) this.field4295[var4] ^ this.field4286) & 0xFFL)] ^ this.field4286 >>> 8;
            }
            this.field4286 = var2[(int) ((this.field4286 ^ (long) (this.field4292 ? 1 : 0)) & 0xFFL)] ^ this.field4286 >>> 8;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ[IIB[I)V", line = 300)
    public final void method1861(int arg0, boolean arg1, int[] arg2, int arg3, byte arg4, int[] arg5) {
        this.field4295 = arg2;
        this.field4282 = arg5;
        field4287++;
        this.field4279 = arg3;
        this.field4292 = arg1;
        if (this.field4294 != arg0) {
            this.field4283 = null;
            this.field4294 = arg0;
        }
        if (arg4 != -5) {
            this.method1855(true, -115);
        }
        this.method1860((byte) 120);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ltfa;Lhca;Lr;ILhca;I[Ltk;IILml;ILsba;Lk;IZBILeu;Loa;)Lda;", line = 327)
    public final class470 method1862(class288 arg0, class186 arg1, class562 arg2, int arg3, class186 arg4, int arg5, class405[] arg6, int arg7, int arg8, class36 arg9, int arg10, class647 arg11, class91 arg12, int arg13, boolean arg14, byte arg15, int arg16, class692 arg17, class224 arg18) {
        field4285++;
        if (this.field4279 != -1) {
            return arg12.method502(this.field4279, -15704).method2198(arg1, arg7, arg10, arg0, arg6, arg2, arg13, arg8, arg16, arg11, arg9, 108, arg5, arg4, arg3);
        }
        int var20 = arg5;
        long var21 = this.field4286;
        int[] var23 = this.field4282;
        if (arg1 != null && (arg1.field2582 >= 0 || arg1.field2593 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field4282[var24];
            }
            if (arg1.field2582 >= 0) {
                if (arg1.field2582 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class665.method3789(1073741824, arg1.field2582);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg1.field2593 >= 0) {
                if (arg1.field2593 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class665.method3789(arg1.field2593, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg1 != null || arg4 != null;
        int var29 = arg6 == null ? 0 : arg6.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class527.field7298[var30] = null;
            if (arg6[var30] != null) {
                class186 var31 = arg0.method1707(arg6[var30].field5350, 105);
                if (var31.field2570 != null) {
                    class102.field1223[var30] = var31;
                    var28 = true;
                    int var32 = arg6[var30].field5352;
                    int var33 = arg6[var30].field5351;
                    int var34 = var31.field2570[var32];
                    class527.field7298[var30] = arg0.method1704(class50.method268(arg15, 40), var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class674.field9592[var30] = var35;
                    if (class527.field7298[var30] != null) {
                        var26 |= class527.field7298[var30].method2812(var35, -78);
                        var25 |= class527.field7298[var30].method2815(arg15 - 30087, var35);
                        var27 |= class527.field7298[var30].method2813(var35, false);
                    }
                    if ((var31.field2585 || class654.field9307) && var33 != -1 && var31.field2570.length > var33) {
                        class547.field7482[var30] = var31.field2595[var32];
                        class657.field9358[var30] = arg6[var30].field5347;
                        int var36 = var31.field2570[var33];
                        class336.field4543[var30] = arg0.method1704(100, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class342.field4579[var30] = var37;
                        if (class336.field4543[var30] != null) {
                            var26 |= class336.field4543[var30].method2812(var37, arg15 ^ 0xFFFFFF89);
                            var25 |= class336.field4543[var30].method2815(arg15 - 30087, var37);
                            var27 |= class336.field4543[var30].method2813(var37, false);
                        }
                    } else {
                        class547.field7482[var30] = 0;
                        class657.field9358[var30] = 0;
                        class336.field4543[var30] = null;
                        class342.field4579[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class493 var41 = null;
        class493 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class493 var46 = null;
        class493 var47 = null;
        if (var28) {
            if (arg1 != null) {
                int var48 = arg1.field2570[arg10];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg0.method1704(100, var49);
                if (var41 != null) {
                    var26 |= var41.method2812(var38, -72);
                    var25 |= var41.method2815(-30011, var38);
                    var27 |= var41.method2813(var38, false);
                }
                if ((arg1.field2585 || class654.field9307) && arg16 != -1 && arg16 < arg1.field2570.length) {
                    int var50 = arg1.field2570[arg16];
                    var40 = arg1.field2595[arg10];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg0.method1704(arg15 + 24, var51);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method2812(var39, arg15 - 182);
                        var25 |= var42.method2815(-30011, var39);
                        var27 |= var42.method2813(var39, false);
                    }
                }
            }
            var20 = arg5 | 0x20;
            if (arg4 != null) {
                int var52 = arg4.field2570[arg13];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg0.method1704(100, var53);
                if (var46 != null) {
                    var26 |= var46.method2812(var43, -101);
                    var25 |= var46.method2815(-30011, var43);
                    var27 |= var46.method2813(var43, false);
                }
                if ((arg4.field2585 || class654.field9307) && arg8 != -1 && arg4.field2570.length > arg8) {
                    var45 = arg4.field2595[arg13];
                    int var54 = arg4.field2570[arg8];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg0.method1704(100, var55);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method2812(var44, -60);
                        var25 |= var47.method2815(-30011, var44);
                        var27 |= var47.method2813(var44, false);
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
        class380 var56 = class162.field2320;
        class470 var57;
        synchronized (class162.field2320) {
            var57 = (class470) class162.field2320.method2176(-126, var21);
        }
        class266 var58 = null;
        if (this.field4294 != -1) {
            var58 = arg11.method3595(this.field4294, 89);
        }
        if (var57 == null || arg2.method1053(var57.method604(), var20) != 0 || var58 != null && var58.field3445 != null && this.field4283 == null) {
            if (var57 != null) {
                var20 = arg2.method1080(var20, var57.method604());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg17.method3902(var62 & 0x3FFFFFFF, true).method2723(arg15 ^ 0x3CB1)) {
                        var60 = true;
                    }
                } else if (!arg18.method1394(-77, var62 & 0x3FFFFFFF).method3234(this.field4292, (byte) -88)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field4291 != -1L) {
                    class380 var89 = class162.field2320;
                    synchronized (class162.field2320) {
                        var57 = (class470) class162.field2320.method2176(-127, this.field4291);
                    }
                }
                if (var57 == null || arg2.method1053(var57.method604(), var20) != 0 || var58 != null && var58.field3445 != null && this.field4283 == null) {
                    return null;
                }
            } else {
                class250[] var63 = new class250[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class250 var67 = arg18.method1394(-57, var65 & 0x3FFFFFFF).method3230(this.field4292, arg15 ^ 0x592A);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    } else if ((var65 & Integer.MIN_VALUE) != 0) {
                        class250 var66 = arg17.method3902(var65 & 0x3FFFFFFF, true).method2718((byte) -117);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    }
                }
                if (var58 != null && var58.field3445 != null) {
                    for (int var68 = 0; var68 < var58.field3445.length; var68++) {
                        if (var58.field3445[var68] != null && var63[var68] != null) {
                            int var69 = var58.field3445[var68][0];
                            int var70 = var58.field3445[var68][1];
                            int var71 = var58.field3445[var68][2];
                            int var72 = var58.field3445[var68][3] << 3;
                            int var73 = var58.field3445[var68][4] << 3;
                            int var74 = var58.field3445[var68][5] << 3;
                            if (this.field4283 == null) {
                                this.field4283 = new int[var58.field3445.length][];
                            }
                            if (this.field4283[var68] == null) {
                                int[] var75 = this.field4283[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[14] = -var71;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[13] = -var70;
                                    var75[12] = -var69;
                                } else {
                                    int var76 = class240.field3177[var72];
                                    int var77 = class240.field3176[var72];
                                    int var78 = class240.field3177[var73];
                                    int var79 = class240.field3176[var73];
                                    int var80 = class240.field3177[var74];
                                    int var81 = class240.field3176[var74];
                                    int var82 = var77 * var80 + 8192 >> 14;
                                    int var83 = var77 * var81 + 8192 >> 14;
                                    var75[1] = -var81 * var78 + var79 * var82 + 8192 >> 14;
                                    var75[6] = -var79 * var80 + var78 * var83 + 8192 >> 14;
                                    var75[4] = var76 * var80 + 8192 >> 14;
                                    var75[8] = var76 * var78 + 8192 >> 14;
                                    var75[3] = var76 * var81 + 8192 >> 14;
                                    var75[0] = var78 * var80 + (var79 * var83) + 8192 >> 14;
                                    var75[5] = -var77;
                                    var75[7] = var78 * var82 + -var79 * -var81 + 8192 >> 14;
                                    var75[2] = var76 * var79 + 8192 >> 14;
                                    var75[12] = var75[3] * -var70 + var75[0] * -var69 + var75[6] * -var71 + 8192 >> 14;
                                    var75[14] = var75[8] * -var71 + var75[2] * -var69 + var75[5] * -var70 + 8192 >> 14;
                                    var75[13] = var75[7] * -var71 + var75[1] * -var69 + var75[4] * -var70 + 8192 >> 14;
                                }
                                var75[10] = var70;
                                var75[9] = var69;
                                var75[11] = var71;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method1523((byte) -81, var73, var74, var72);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method1511(var70, true, var71, var69);
                            }
                        }
                    }
                }
                class250 var84 = new class250(var63, var63.length);
                int var85 = var20 | 0x4000;
                var57 = arg2.method1089(var84, var85, class138.field1878, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    for (int var87 = 0; var87 < class64.field806.length; var87++) {
                        if (class64.field806[var87][var86].length > this.field4295[var86]) {
                            var57.method638(class119.field1523[var87][var86], class64.field806[var87][var86][this.field4295[var86]]);
                        }
                    }
                }
                if (arg14) {
                    var57.method602(var20);
                    class380 var88 = class162.field2320;
                    synchronized (class162.field2320) {
                        class162.field2320.method2174(var57, var21, (byte) 2);
                    }
                    this.field4291 = var21;
                }
            }
        }
        class470 var90 = var57.method649((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var91 < var29) {
            if (class527.field7298[var91] != null) {
                var90.method2713(0, class657.field9358[var91] - 1, class342.field4579[var91], class336.field4543[var91], var92, this.field4283 == null ? null : this.field4283[var91], class547.field7482[var91], false, class527.field7298[var91], class674.field9592[var91], -1);
            }
            var92 <<= 0x1;
            var91++;
        }
        if (arg15 != 76) {
            this.field4279 = -97;
        }
        if (var41 != null && var46 != null) {
            var90.method2712(false, (byte) -9, var38, arg3 - 1, var39, var41, var42, arg7 - 1, var46, var43, var44, var45, var47, var40, arg1.field2569);
        } else if (var41 != null) {
            var90.method2714(false, arg15 - 12300, arg7 - 1, var38, 0, var42, var41, var39, var40);
        } else if (var46 != null) {
            var90.method2714(false, arg15 - 12300, arg3 - 1, var43, 0, var47, var46, var44, var45);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class527.field7298[var93] = null;
            class336.field4543[var93] = null;
            class102.field1223[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILk;ILhca;Ltfa;ILoa;Lr;Lml;Leu;ZI)Lda;", line = 836)
    public final class470 method1863(int arg0, class91 arg1, int arg2, class186 arg3, class288 arg4, int arg5, class224 arg6, class562 arg7, class36 arg8, class692 arg9, boolean arg10, int arg11) {
        field4290++;
        if (this.field4279 != -1) {
            return arg1.method502(this.field4279, -15704).method2205(arg0, arg2, arg4, arg7, arg8, arg5, arg11, arg3, (byte) -45);
        }
        int var13 = arg11;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg11 | 0x20;
            int var22 = arg3.field2570[arg0];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class493 var25 = arg4.method1704(100, var23);
            if (var25 != null) {
                var15 |= var25.method2812(var24, -101);
                var14 |= var25.method2815(-30011, var24);
                var17 |= var25.method2813(var24, false);
                var16 |= arg3.field2591;
            }
            if ((arg3.field2585 || class654.field9307) && arg5 != -1 && arg3.field2570.length > arg5) {
                int var26 = arg3.field2570[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class493 var29 = var23 == var27 ? var25 : arg4.method1704(100, var27);
                if (var29 != null) {
                    var15 |= var29.method2812(var28, -63);
                    var14 |= var29.method2815(-30011, var28);
                    var17 |= var29.method2813(var28, false);
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
        class380 var30 = class83.field970;
        class470 var31;
        synchronized (class83.field970) {
            var31 = (class470) class83.field970.method2176(-125, this.field4286);
        }
        if (var31 == null || arg7.method1053(var31.method604(), var13) != 0) {
            if (var31 != null) {
                var13 = arg7.method1080(var13, var31.method604());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field4282[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg9.method3902(var35 & 0x3FFFFFFF, !arg10).method2719(-38)) {
                        var33 = true;
                    }
                } else if (!arg6.method1394(-45, var35 & 0x3FFFFFFF).method3228(this.field4292, (byte) 94)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class250[] var36 = new class250[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field4282[var38];
                if ((var39 & 0x40000000) != 0) {
                    class250 var41 = arg6.method1394(-111, var39 & 0x3FFFFFFF).method3225(this.field4292, arg10);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class250 var40 = arg9.method3902(var39 & 0x3FFFFFFF, true).method2715(-42);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class250 var42 = new class250(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg7.method1089(var42, var43, class138.field1878, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class64.field806.length; var45++) {
                    if (class64.field806[var45][var44].length > this.field4295[var44]) {
                        var31.method638(class119.field1523[var45][var44], class64.field806[var45][var44][this.field4295[var44]]);
                    }
                }
            }
            var31.method602(var13);
            class380 var46 = class83.field970;
            synchronized (class83.field970) {
                class83.field970.method2174(var31, this.field4286, (byte) -56);
            }
        }
        if (arg3 == null) {
            return var31;
        } else if (arg10) {
            return null;
        } else {
            var31.method649((byte) 4, var13, true);
            return arg3.method1229(arg11, var31, arg0, arg2, 30299, arg5);
        }
    }
}
