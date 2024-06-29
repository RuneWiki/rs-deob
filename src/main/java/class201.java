import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class201 {

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public int field2617 = -1;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "Lmw;")
    public static class517 field2620 = new class517(19, 3);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    private int field2604;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "J")
    private long field2615;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "J")
    private long field2618;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "Z")
    public boolean field2607;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "[I")
    private int[] field2611;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "[I")
    public int[] field2612;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "[Leg;")
    private class117[] field2610;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILffa;)V")
    public final void method1320(int arg0, int arg1, int arg2, class198 arg3) {
        field2603++;
        int var5 = class760.field10449[arg0];
        if (arg3.method1294(23707, arg2) == null) {
            return;
        }
        this.field2611[var5] = class670.method3699(Integer.MIN_VALUE, arg2);
        this.method1322(91);
        if (arg1 != 13815) {
            this.method1329(-20, -11, null, 94);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static void method1321(boolean arg0) {
        field2620 = null;
        if (arg0) {
            method1324(96, false);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    private final void method1322(int arg0) {
        field2609++;
        this.field2615 = -1L;
        long[] var2 = class377.field5509;
        this.field2615 = var2[(int) ((this.field2615 ^ (long) (this.field2604 >> 8)) & 0xFFL)] ^ this.field2615 >>> 8;
        this.field2615 = this.field2615 >>> 8 ^ var2[(int) ((this.field2615 ^ (long) this.field2604) & 0xFFL)];
        int var3 = -53 % ((48 - arg0) / 40);
        for (int var4 = 0; var4 < this.field2611.length; var4++) {
            this.field2615 = var2[(int) ((this.field2615 ^ (long) (this.field2611[var4] >> 24)) & 0xFFL)] ^ this.field2615 >>> 8;
            this.field2615 = this.field2615 >>> 8 ^ var2[(int) ((this.field2615 ^ (long) (this.field2611[var4] >> 16)) & 0xFFL)];
            this.field2615 = this.field2615 >>> 8 ^ var2[(int) (((long) (this.field2611[var4] >> 8) ^ this.field2615) & 0xFFL)];
            this.field2615 = this.field2615 >>> 8 ^ var2[(int) ((this.field2615 ^ (long) this.field2611[var4]) & 0xFFL)];
        }
        if (this.field2610 != null) {
            for (int var5 = 0; var5 < this.field2610.length; var5++) {
                if (this.field2610[var5] != null) {
                    int[] var6;
                    int[] var7;
                    if (this.field2607) {
                        var6 = this.field2610[var5].field1576;
                        var7 = this.field2610[var5].field1573;
                    } else {
                        var6 = this.field2610[var5].field1572;
                        var7 = this.field2610[var5].field1575;
                    }
                    if (var6 != null) {
                        for (int var8 = 0; var8 < var6.length; var8++) {
                            this.field2615 = var2[(int) ((this.field2615 ^ (long) (var6[var8] >> 8)) & 0xFFL)] ^ this.field2615 >>> 8;
                            this.field2615 = var2[(int) (((long) var6[var8] ^ this.field2615) & 0xFFL)] ^ this.field2615 >>> 8;
                        }
                    }
                    if (var7 != null) {
                        for (int var9 = 0; var9 < var7.length; var9++) {
                            this.field2615 = var2[(int) ((this.field2615 ^ (long) (var7[var9] >> 8)) & 0xFFL)] ^ this.field2615 >>> 8;
                            this.field2615 = this.field2615 >>> 8 ^ var2[(int) ((this.field2615 ^ (long) var7[var9]) & 0xFFL)];
                        }
                    }
                    if (this.field2610[var5].field1571 != null) {
                        for (int var10 = 0; var10 < this.field2610[var5].field1571.length; var10++) {
                            this.field2615 = this.field2615 >>> 8 ^ var2[(int) ((this.field2615 ^ (long) (this.field2610[var5].field1571[var10] >> 8)) & 0xFFL)];
                            this.field2615 = var2[(int) ((this.field2615 ^ (long) this.field2610[var5].field1571[var10]) & 0xFFL)] ^ this.field2615 >>> 8;
                        }
                    }
                    if (this.field2610[var5].field1578 != null) {
                        for (int var11 = 0; var11 < this.field2610[var5].field1578.length; var11++) {
                            this.field2615 = var2[(int) ((this.field2615 ^ (long) (this.field2610[var5].field1578[var11] >> 8)) & 0xFFL)] ^ this.field2615 >>> 8;
                            this.field2615 = this.field2615 >>> 8 ^ var2[(int) (((long) this.field2610[var5].field1578[var11] ^ this.field2615) & 0xFFL)];
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < 5; var12++) {
            this.field2615 = this.field2615 >>> 8 ^ var2[(int) ((this.field2615 ^ (long) this.field2612[var12]) & 0xFFL)];
        }
        this.field2615 = this.field2615 >>> 8 ^ var2[(int) ((this.field2615 ^ (long) (this.field2607 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILmba;Lmu;Lmu;IIILkka;Lkia;IIILes;Lll;[Lid;[ILffa;IZLha;I)Lka;")
    public final class497 method1323(int arg0, class441 arg1, class317 arg2, class317 arg3, int arg4, int arg5, int arg6, class328 arg7, class646 arg8, int arg9, int arg10, int arg11, class403 arg12, class384 arg13, class610[] arg14, int[] arg15, class198 arg16, int arg17, boolean arg18, class66 arg19, int arg20) {
        field2619++;
        if (this.field2617 != -1) {
            return arg8.method3587(this.field2617, arg20).method1971(arg1, arg11, arg10, arg6, arg9, arg19, arg3, arg17, null, arg15, arg0, arg12, arg14, arg5, arg20 + 256, arg4, arg13, arg2);
        }
        int var22 = arg17;
        long var23 = this.field2615;
        int[] var25 = this.field2611;
        boolean var26 = false;
        boolean var27 = false;
        if (arg2 != null && (arg2.field4467 >= 0 || arg2.field4492 >= 0)) {
            var25 = new int[this.field2611.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field2611[var28];
            }
            if (arg2.field4467 >= 0) {
                if (arg2.field4467 == 65535) {
                    var25[5] = 0;
                    var26 = true;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class670.method3699(1073741824, arg2.field4467);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg2.field4492 >= 0) {
                if (arg2.field4492 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class670.method3699(1073741824, arg2.field4492);
                    var23 ^= var25[3];
                }
                var27 = true;
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg2 != null || arg3 != null;
        int var33 = arg14 == null ? 0 : arg14.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class552.field7628[var34] = null;
            if (arg14[var34] != null) {
                class317 var35 = arg13.method2388(arg14[var34].field8251, 0);
                if (var35.field4493 != null) {
                    class412.field5902[var34] = var35;
                    var32 = true;
                    int var36 = arg14[var34].field8249;
                    int var37 = arg14[var34].field8248;
                    int var38 = var35.field4493[var36];
                    class552.field7628[var34] = arg13.method2381((byte) 66, var38 >>> 16);
                    int var39 = var38 & 0xFFFF;
                    class391.field5650[var34] = var39;
                    if (class552.field7628[var34] != null) {
                        var30 |= class552.field7628[var34].method1496(var39, -3);
                        var29 |= class552.field7628[var34].method1500(var39, -3);
                        var31 |= class552.field7628[var34].method1497(var39, (byte) 63);
                    }
                    if ((var35.field4474 || class779.field10699) && var37 != -1 && var37 < var35.field4493.length) {
                        class275.field3988[var34] = var35.field4485[var36];
                        class391.field5651[var34] = arg14[var34].field8252;
                        int var40 = var35.field4493[var37];
                        class66.field914[var34] = arg13.method2381((byte) 108, var40 >>> 16);
                        int var41 = var40 & 0xFFFF;
                        class563.field7713[var34] = var41;
                        if (class66.field914[var34] != null) {
                            var30 |= class66.field914[var34].method1496(var41, -3);
                            var29 |= class66.field914[var34].method1500(var41, -3);
                            var31 |= class66.field914[var34].method1497(var41, (byte) 103);
                        }
                    } else {
                        class275.field3988[var34] = 0;
                        class391.field5651[var34] = 0;
                        class66.field914[var34] = null;
                        class563.field7713[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class236 var45 = null;
        class236 var46 = null;
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class236 var50 = null;
        class236 var51 = null;
        if (var32) {
            if (arg2 != null) {
                int var52 = arg2.field4493[arg11];
                int var53 = var52 >>> 16;
                var45 = arg13.method2381((byte) 108, var53);
                var42 = var52 & 0xFFFF;
                if (var45 != null) {
                    var30 |= var45.method1496(var42, arg20 ^ 0xFFFFFFFD);
                    var29 |= var45.method1500(var42, -3);
                    var31 |= var45.method1497(var42, (byte) 68);
                }
                if ((arg2.field4474 || class779.field10699) && arg5 != -1 && arg5 < arg2.field4493.length) {
                    int var54 = arg2.field4493[arg5];
                    var44 = arg2.field4485[arg11];
                    int var55 = var54 >>> 16;
                    var46 = var53 == var55 ? var45 : arg13.method2381((byte) 88, var55);
                    var43 = var54 & 0xFFFF;
                    if (var46 != null) {
                        var30 |= var46.method1496(var43, arg20 ^ 0xFFFFFFFD);
                        var29 |= var46.method1500(var43, -3);
                        var31 |= var46.method1497(var43, (byte) 18);
                    }
                }
            }
            var22 = arg17 | 0x20;
            if (arg3 != null) {
                int var56 = arg3.field4493[arg6];
                int var57 = var56 >>> 16;
                var47 = var56 & 0xFFFF;
                var50 = arg13.method2381((byte) 102, var57);
                if (var50 != null) {
                    var30 |= var50.method1496(var47, -3);
                    var29 |= var50.method1500(var47, -3);
                    var31 |= var50.method1497(var47, (byte) 23);
                }
                if ((arg3.field4474 || class779.field10699) && arg0 != -1 && arg0 < arg3.field4493.length) {
                    var49 = arg3.field4485[arg6];
                    int var58 = arg3.field4493[arg0];
                    int var59 = var58 >>> 16;
                    var48 = var58 & 0xFFFF;
                    var51 = var57 == var59 ? var50 : arg13.method2381((byte) 126, var59);
                    if (var51 != null) {
                        var30 |= var51.method1496(var48, -3);
                        var29 |= var51.method1500(var48, arg20 - 3);
                        var31 |= var51.method1497(var48, (byte) -75);
                    }
                }
            }
            if (var30) {
                var22 |= 0x80;
            }
            if (var29) {
                var22 |= 0x100;
            }
            if (var31) {
                var22 |= 0x400;
            }
        }
        class535 var60 = class263.field3874;
        class497 var61;
        synchronized (class263.field3874) {
            var61 = (class497) class263.field3874.method3109((byte) 102, var23);
        }
        class588 var62 = null;
        if (this.field2604 != -1) {
            var62 = arg1.method2629(this.field2604, (byte) -41);
        }
        if (var61 == null || arg19.method520(var61.method260(), var22) != 0) {
            if (var61 != null) {
                var22 = arg19.method473(var22, var61.method260());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var65 >= var25.length) {
                    if (var64) {
                        if (this.field2618 != -1L) {
                            class535 var69 = class263.field3874;
                            synchronized (class263.field3874) {
                                var61 = (class497) class263.field3874.method3109((byte) 104, this.field2618);
                            }
                        }
                        if (var61 == null || arg19.method520(var61.method260(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class625[] var70 = new class625[var25.length];
                        for (int var71 = 0; var71 < var25.length; var71++) {
                            int var72 = var25[var71];
                            class117 var73 = null;
                            boolean var74 = var71 == 5 && var26 || var71 == 3 && var27;
                            if ((var72 & 0x40000000) != 0) {
                                if (!var74 && this.field2610 != null && this.field2610[var71] != null) {
                                    var73 = this.field2610[var71];
                                }
                                class625 var76 = arg7.method2121(var72 & 0x3FFFFFFF, 25928).method2310(0, this.field2607, var73);
                                if (var76 != null) {
                                    var70[var71] = var76;
                                }
                            } else if ((var72 & Integer.MIN_VALUE) != 0) {
                                class625 var75 = arg16.method1294(23707, var72 & 0x3FFFFFFF).method2083((byte) -20);
                                if (var75 != null) {
                                    var70[var71] = var75;
                                }
                            }
                        }
                        if (var62 != null && var62.field8019 != null) {
                            for (int var77 = 0; var77 < var62.field8019.length; var77++) {
                                if (var70[var77] != null) {
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    int var83 = 0;
                                    if (var62.field8019[var77] != null) {
                                        var82 = var62.field8019[var77][4] << 3;
                                        var78 = var62.field8019[var77][0];
                                        var81 = var62.field8019[var77][3] << 3;
                                        var79 = var62.field8019[var77][1];
                                        var83 = var62.field8019[var77][5] << 3;
                                        var80 = var62.field8019[var77][2];
                                    }
                                    if (var81 != 0 || var82 != 0 || var83 != 0) {
                                        var70[var77].method3450(var83, var82, var81, 1);
                                    }
                                    if (var78 != 0 || var79 != 0 || var80 != 0) {
                                        var70[var77].method3453(arg20, var80, var79, var78);
                                    }
                                }
                            }
                        }
                        class625 var84 = new class625(var70, var70.length);
                        int var85 = var22 | 0x4000;
                        var61 = arg19.method484(var84, var85, class390.field5647, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            for (int var87 = 0; var87 < class511.field7120.length; var87++) {
                                if (this.field2612[var86] < class511.field7120[var87][var86].length) {
                                    var61.method295(class448.field6453[var87][var86], class511.field7120[var87][var86][this.field2612[var86]]);
                                }
                            }
                        }
                        if (arg18) {
                            var61.method270(var22);
                            class535 var88 = class263.field3874;
                            synchronized (class263.field3874) {
                                class263.field3874.method3108(var23, 16337, var61);
                            }
                            this.field2618 = var23;
                        }
                    }
                    break;
                }
                int var66 = var25[var65];
                class117 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field2610 != null && this.field2610[var65] != null) {
                        var67 = this.field2610[var65];
                    }
                    if (!arg7.method2121(var66 & 0x3FFFFFFF, arg20 + 25928).method2315(this.field2607, (byte) 123, var67)) {
                        var64 = true;
                    }
                } else if ((var66 & Integer.MIN_VALUE) != 0 && !arg16.method1294(23707, var66 & 0x3FFFFFFF).method2086(20605)) {
                    var64 = true;
                }
                var65++;
            }
        }
        class497 var89 = var61.method271((byte) 4, var22, true);
        boolean var90 = false;
        if (arg15 != null) {
            for (int var91 = 0; var91 < arg15.length; var91++) {
                if (arg15[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class109[] var92 = null;
        if (var62 != null) {
            var92 = var62.method3301(false, arg19);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg15.length; var93++) {
                if (var92[var93] != null) {
                    var89.method261(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = arg20;
        int var95 = 1;
        while (var33 > var94) {
            if (class552.field7628[var94] != null) {
                var89.method2923(class391.field5651[var94] - 1, class391.field5650[var94], var95, class275.field3988[var94], class552.field7628[var94], null, arg20 ^ 0xFFFFFF90, 0, class66.field914[var94], false, class563.field7713[var94]);
            }
            var94++;
            var95 <<= 0x1;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg15.length; var96++) {
                if (arg15[var96] != -1) {
                    int var97 = arg15[var96] - arg4;
                    int var98 = var97 & 0x3FFF;
                    class109 var99 = arg19.method541();
                    var99.method810(var98);
                    var89.method261(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg15.length; var100++) {
                if (var92[var100] != null) {
                    var89.method261(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method2920(var47, var48, var49, var43, var45, arg10 - 1, var46, arg2.field4469, var44, (byte) -82, var42, var50, var51, false, arg9 - 1);
        } else if (var45 != null) {
            var89.method2919(0, var42, var44, var43, var46, false, arg10 - 1, var45, 10);
        } else if (var50 != null) {
            var89.method2919(0, var47, var49, var48, var51, false, arg9 - 1, var50, 10);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class552.field7628[var101] = null;
            class66.field914[var101] = null;
            class412.field5902[var101] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1324(int arg0, boolean arg1) {
        field2616++;
        if (arg0 != 1073741823) {
            method1324(-2, false);
        }
        boolean var2 = class375.field5490.method472();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class375.field5490.method511();
        } else if (!class375.field5490.method510()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class125.field1721.method2255(true, arg1 ? 1 : 0, class125.field1721.field5164);
            class515.method3006(-2);
            return true;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIB[I[I[Leg;I)V")
    public final void method1325(boolean arg0, int arg1, byte arg2, int[] arg3, int[] arg4, class117[] arg5, int arg6) {
        this.field2612 = arg4;
        this.field2611 = arg3;
        if (arg2 != 68) {
            return;
        }
        this.field2617 = arg1;
        this.field2607 = arg0;
        if (this.field2604 != arg6) {
            this.field2604 = arg6;
        }
        this.field2610 = arg5;
        field2605++;
        this.method1322(arg2 ^ 0xFFFFFF8B);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIILha;Lll;Lmu;IILffa;ZII)Lka;")
    public final class497 method1326(int arg0, int arg1, int arg2, class66 arg3, class384 arg4, class317 arg5, int arg6, int arg7, class198 arg8, boolean arg9, int arg10, int arg11) {
        field2606++;
        int var13 = arg10;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg5.field4493[arg2];
            var13 = arg10 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class236 var25 = arg4.method2381((byte) 75, var23);
            if (var25 != null) {
                var15 |= var25.method1496(var24, -3);
                var14 |= var25.method1500(var24, -3);
                var17 |= var25.method1497(var24, (byte) 31);
                var16 |= arg5.field4477;
            }
            if ((arg5.field4474 || class779.field10699) && arg6 != -1 && arg6 < arg5.field4493.length) {
                int var26 = arg5.field4493[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class236 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg4.method2381((byte) 69, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method1496(var28, -3);
                    var14 |= var29.method1500(var28, -3);
                    var17 |= var29.method1497(var28, (byte) -86);
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
        if (arg9) {
            return null;
        }
        long var30 = (long) arg11 << 32 | (long) (arg1 << 16) | (long) arg7;
        class535 var32 = class465.field6593;
        class497 var33;
        synchronized (class465.field6593) {
            var33 = (class497) class465.field6593.method3109((byte) 124, var30);
        }
        if (var33 == null || arg3.method520(var33.method260(), var13) != 0) {
            if (var33 != null) {
                var13 = arg3.method473(var13, var33.method260());
            }
            class625[] var35 = new class625[3];
            int var36 = 0;
            if (!arg8.method1294(23707, arg7).method2089(69) || !arg8.method1294(23707, arg1).method2089(64) || !arg8.method1294(23707, arg11).method2089(102)) {
                return null;
            }
            class625 var37 = arg8.method1294(23707, arg7).method2084(0);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class625 var38 = arg8.method1294(23707, arg1).method2084(0);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class625 var39 = arg8.method1294(23707, arg11).method2084(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class625 var40 = new class625(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg3.method484(var40, var41, class390.field5647, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class511.field7120.length; var43++) {
                    if (this.field2612[var42] < class511.field7120[var43][var42].length) {
                        var33.method295(class448.field6453[var43][var42], class511.field7120[var43][var42][this.field2612[var42]]);
                    }
                }
            }
            var33.method270(var13);
            class535 var44 = class465.field6593;
            synchronized (class465.field6593) {
                class465.field6593.method3108(var30, 16337, var33);
            }
        }
        if (arg5 == null) {
            return var33;
        } else {
            class497 var45 = var33.method271((byte) 4, var13, true);
            return arg5.method2023(arg10, arg0, arg2, -65536, arg6, var45);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V")
    public final void method1327(int arg0, int arg1, int arg2) {
        if (arg2 > -14) {
            method1324(-8, true);
        }
        field2608++;
        this.field2612[arg1] = arg0;
        this.method1322(98);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZI)V")
    public final void method1328(boolean arg0, int arg1) {
        field2602++;
        if (arg1 != -1177040848) {
            this.field2615 = -93L;
        }
        this.field2607 = arg0;
        this.method1322(arg1 + 1177040765);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILkka;I)V")
    public final void method1329(int arg0, int arg1, class328 arg2, int arg3) {
        field2613++;
        if (arg0 == arg1) {
            this.field2611[arg3] = 0;
        } else if (arg2.method2121(arg1, 25928) != null) {
            this.field2611[arg3] = class670.method3699(arg1, 1073741824);
            this.method1322(arg0 ^ 0x4);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILkia;ILes;Lffa;ILkka;Lha;Lmu;ILll;I)Lka;")
    public final class497 method1330(int arg0, class646 arg1, int arg2, class403 arg3, class198 arg4, int arg5, class328 arg6, class66 arg7, class317 arg8, int arg9, class384 arg10, int arg11) {
        field2614++;
        if (this.field2617 != -1) {
            return arg1.method3587(this.field2617, arg5 + 17731).method1962(null, arg10, arg8, arg0, (byte) -126, arg3, arg11, arg2, arg7, arg9);
        } else if (arg5 == -17731) {
            int var13 = arg2;
            if (arg8 != null) {
                boolean var14 = false;
                boolean var15 = false;
                boolean var16 = false;
                boolean var17 = false;
                boolean var18 = true;
                boolean var19 = true;
                Object var20 = null;
                var13 = arg2 | 0x20;
                Object var21 = null;
                int var22 = arg8.field4493[arg9];
                int var23 = var22 >>> 16;
                int var24 = var22 & 0xFFFF;
                class236 var25 = arg10.method2381((byte) 79, var23);
                if (var25 != null) {
                    var15 |= var25.method1496(var24, -3);
                    var14 |= var25.method1500(var24, -3);
                    var17 |= var25.method1497(var24, (byte) 110);
                    var16 |= arg8.field4477;
                }
                if ((arg8.field4474 || class779.field10699) && arg11 != -1 && arg8.field4493.length > arg11) {
                    int var26 = arg8.field4493[arg11];
                    int var27 = var26 >>> 16;
                    int var28 = var26 & 0xFFFF;
                    class236 var29 = var23 == var27 ? var25 : arg10.method2381((byte) 100, var27);
                    if (var29 != null) {
                        var15 |= var29.method1496(var28, arg5 + 17728);
                        var14 |= var29.method1500(var28, -3);
                        var17 |= var29.method1497(var28, (byte) -118);
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
            class535 var30 = class465.field6593;
            class497 var31;
            synchronized (class465.field6593) {
                var31 = (class497) class465.field6593.method3109((byte) 122, this.field2615);
            }
            if (var31 == null || arg7.method520(var31.method260(), var13) != 0) {
                if (var31 != null) {
                    var13 = arg7.method473(var13, var31.method260());
                }
                boolean var33 = false;
                for (int var34 = 0; var34 < this.field2611.length; var34++) {
                    int var35 = this.field2611[var34];
                    class117 var36 = null;
                    if ((var35 & 0x40000000) != 0) {
                        if (this.field2610 != null && this.field2610[var34] != null) {
                            var36 = this.field2610[var34];
                        }
                        if (!arg6.method2121(var35 & 0x3FFFFFFF, arg5 ^ 0xFFFFDFF5).method2319(this.field2607, 19553, var36)) {
                            var33 = true;
                        }
                    } else if ((Integer.MIN_VALUE & var35) != 0 && !arg4.method1294(23707, var35 & 0x3FFFFFFF).method2089(arg5 ^ 0xFFFFBAE1)) {
                        var33 = true;
                    }
                }
                if (var33) {
                    return null;
                }
                class625[] var37 = new class625[this.field2611.length];
                int var38 = 0;
                for (int var39 = 0; var39 < this.field2611.length; var39++) {
                    int var40 = this.field2611[var39];
                    class117 var41 = null;
                    if ((var40 & 0x40000000) != 0) {
                        if (this.field2610 != null && this.field2610[var39] != null) {
                            var41 = this.field2610[var39];
                        }
                        class625 var42 = arg6.method2121(var40 & 0x3FFFFFFF, arg5 ^ 0xFFFFDFF5).method2316(this.field2607, var41, 2);
                        if (var42 != null) {
                            var37[var38++] = var42;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class625 var43 = arg4.method1294(arg5 + 41438, var40 & 0x3FFFFFFF).method2084(arg5 + 17731);
                        if (var43 != null) {
                            var37[var38++] = var43;
                        }
                    }
                }
                class625 var44 = new class625(var37, var38);
                int var45 = var13 | 0x4000;
                var31 = arg7.method484(var44, var45, class390.field5647, 64, 768);
                for (int var46 = 0; var46 < 5; var46++) {
                    for (int var47 = 0; var47 < class511.field7120.length; var47++) {
                        if (this.field2612[var46] < class511.field7120[var47][var46].length) {
                            var31.method295(class448.field6453[var47][var46], class511.field7120[var47][var46][this.field2612[var46]]);
                        }
                    }
                }
                var31.method270(var13);
                class535 var48 = class465.field6593;
                synchronized (class465.field6593) {
                    class465.field6593.method3108(this.field2615, 16337, var31);
                }
            }
            if (arg8 == null) {
                return var31;
            } else {
                var31.method271((byte) 4, var13, true);
                return arg8.method2023(arg2, arg0, arg9, -65536, arg11, var31);
            }
        } else {
            return null;
        }
    }
}
