import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class480 {

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public int field6628 = -1;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Lvj;")
    public static class304 field6631;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    private int field6626;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "J")
    private long field6618;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "J")
    private long field6620;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
    public boolean field6617;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
    private int[] field6613;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
    public int[] field6627;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[[I")
    private int[][] field6619;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method2751(byte arg0) {
        if (arg0 < 119) {
            field6629 = 77;
        }
        field6631 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILeb;I)V")
    public final void method2752(int arg0, int arg1, class439 arg2, int arg3) {
        field6621++;
        int var5 = class363.field4922[arg3];
        if (this.field6613[var5] != 0 && arg2.method2534(true, arg0) != null) {
            this.field6613[var5] = class191.method1230(arg0, arg1);
            this.method2759(0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIB)V")
    public final void method2753(int arg0, int arg1, byte arg2) {
        field6615++;
        if (arg2 < 101) {
            field6631 = null;
        }
        this.field6627[arg0] = arg1;
        this.method2759(0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZI[II[II)V")
    public final void method2754(boolean arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        this.field6627 = arg4;
        if (arg5 != 5) {
            this.method2752(-31, 76, null, 41);
        }
        this.field6617 = arg0;
        if (this.field6626 != arg1) {
            this.field6626 = arg1;
            this.field6619 = null;
        }
        this.field6613 = arg2;
        this.field6628 = arg3;
        field6625++;
        this.method2759(0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILqa;IIBLdc;Leb;IIILpp;)Lc;")
    public final class121 method2755(int arg0, int arg1, class162 arg2, int arg3, int arg4, byte arg5, class5 arg6, class439 arg7, int arg8, int arg9, int arg10, class267 arg11) {
        field6616++;
        int var13 = arg8;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg8 | 0x20;
            int var22 = arg6.field129[arg9];
            int var23 = var22 >>> 16;
            class504 var24 = arg11.method1606(var23, 73);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2876((byte) -120, var25);
                var14 |= var24.method2880((byte) 69, var25);
                var17 |= var24.method2878(20411, var25);
                var16 |= arg6.field142;
            }
            if ((arg6.field149 || class89.field1364) && arg1 != -1 && arg1 < arg6.field129.length) {
                int var26 = arg6.field129[arg1];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class504 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg11.method1606(var28 >>> 16, -90);
                }
                if (var29 != null) {
                    var15 |= var29.method2876((byte) -120, var28);
                    var14 |= var29.method2880((byte) 69, var28);
                    var17 |= var29.method2878(20411, var28);
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
        long var30 = (long) (arg3 << 16) | (long) arg4 << 32 | (long) arg10;
        class236 var32 = class165.field2408;
        class121 var33;
        synchronized (class165.field2408) {
            var33 = (class121) class165.field2408.method1456(var30, 112);
        }
        if (var33 == null || arg2.method564(var33.method854(), var13) != 0) {
            if (var33 != null) {
                var13 = arg2.method565(var13, var33.method854());
            }
            class118[] var35 = new class118[3];
            int var36 = 0;
            if (!arg7.method2534(true, arg10).method3055(30646) || !arg7.method2534(true, arg3).method3055(30646) || !arg7.method2534(true, arg4).method3055(30646)) {
                return null;
            }
            class118 var37 = arg7.method2534(true, arg10).method3051(0);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class118 var38 = arg7.method2534(true, arg3).method3051(0);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class118 var39 = arg7.method2534(true, arg4).method3051(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class118 var41 = new class118(var35, var36);
            var33 = arg2.method531(var41, var40, class379.field5183, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class59.field929[var42].length > this.field6627[var42]) {
                    var33.method865(class514.field7588[var42], class59.field929[var42][this.field6627[var42]]);
                }
                if (this.field6627[var42] < class73.field1105[var42].length) {
                    var33.method865(class253.field3351[var42], class73.field1105[var42][this.field6627[var42]]);
                }
            }
            var33.method860(var13);
            class236 var43 = class165.field2408;
            synchronized (class165.field2408) {
                class165.field2408.method1462(var33, var30, -34);
            }
        }
        if (arg6 == null) {
            return var33;
        } else {
            int var44 = 121 / ((arg5 + 54) / 58);
            class121 var45 = var33.method863((byte) 4, var13, true);
            return arg6.method26(var45, arg8, -78, arg1, arg0, arg9);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)V")
    public final void method2756(boolean arg0, byte arg1) {
        field6622++;
        this.field6617 = arg0;
        this.method2759(0);
        if (arg1 != -48) {
            this.field6628 = -15;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lrd;ILdc;IILdc;ILlk;Ltq;ZI[Lwu;ILkh;Lqa;Lpp;Leb;II)Lc;")
    public final class121 method2757(class221 arg0, int arg1, class5 arg2, int arg3, int arg4, class5 arg5, int arg6, class413 arg7, class442 arg8, boolean arg9, int arg10, class250[] arg11, int arg12, class13 arg13, class162 arg14, class267 arg15, class439 arg16, int arg17, int arg18) {
        field6623++;
        if (this.field6628 != -1) {
            return arg8.method2554(124, this.field6628).method2887(arg11, arg1, arg4, 75, arg5, arg15, arg6, arg12, arg13, arg2, arg17, arg14, arg3, arg0, arg10);
        }
        int var20 = arg10;
        long var21 = this.field6618;
        int[] var23 = this.field6613;
        if (arg2 != null && (arg2.field124 >= 0 || arg2.field145 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field6613[var24];
            }
            if (arg2.field124 >= 0) {
                if (arg2.field124 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class191.method1230(arg2.field124, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg2.field145 >= 0) {
                if (arg2.field145 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class191.method1230(arg2.field145, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg2 != null || arg5 != null;
        int var29 = arg11 == null ? 0 : arg11.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class303.field3996[var30] = null;
            if (arg11[var30] != null) {
                class5 var31 = arg15.method1601(arg11[var30].field3326, (byte) -128);
                if (var31.field129 != null) {
                    class425.field5810[var30] = var31;
                    var28 = true;
                    int var32 = arg11[var30].field3315;
                    int var33 = arg11[var30].field3319;
                    int var34 = var31.field129[var32];
                    class303.field3996[var30] = arg15.method1606(var34 >>> 16, arg18 + 89);
                    int var35 = var34 & 0xFFFF;
                    class50.field770[var30] = var35;
                    if (class303.field3996[var30] != null) {
                        var26 |= class303.field3996[var30].method2876((byte) -120, var35);
                        var25 |= class303.field3996[var30].method2880((byte) 69, var35);
                        var27 |= class303.field3996[var30].method2878(20411, var35);
                    }
                    if ((var31.field149 || class89.field1364) && var33 != -1 && var33 < var31.field129.length) {
                        class288.field3772[var30] = var31.field127[var32];
                        class127.field1848[var30] = arg11[var30].field3320;
                        int var36 = var31.field129[var33];
                        class208.field2860[var30] = arg15.method1606(var36 >>> 16, -61);
                        int var37 = var36 & 0xFFFF;
                        class388.field5273[var30] = var37;
                        if (class208.field2860[var30] != null) {
                            var26 |= class208.field2860[var30].method2876((byte) -120, var37);
                            var25 |= class208.field2860[var30].method2880((byte) 69, var37);
                            var27 |= class208.field2860[var30].method2878(20411, var37);
                        }
                    } else {
                        class288.field3772[var30] = 0;
                        class127.field1848[var30] = 0;
                        class208.field2860[var30] = null;
                        class388.field5273[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class504 var41 = null;
        class504 var42 = null;
        int var43 = arg18;
        int var44 = -1;
        int var45 = 0;
        class504 var46 = null;
        class504 var47 = null;
        if (var28) {
            var20 = arg10 | 0x20;
            if (arg2 != null) {
                int var48 = arg2.field129[arg1];
                int var49 = var48 >>> 16;
                var41 = arg15.method1606(var49, -66);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method2876((byte) -120, var38);
                    var25 |= var41.method2880((byte) 69, var38);
                    var27 |= var41.method2878(arg18 ^ 0xFFFFB044, var38);
                }
                if ((arg2.field149 || class89.field1364) && arg12 != -1 && arg12 < arg2.field129.length) {
                    int var50 = arg2.field129[arg12];
                    var40 = arg2.field127[arg1];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg15.method1606(var51, -90);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method2876((byte) -120, var39);
                        var25 |= var42.method2880((byte) 69, var39);
                        var27 |= var42.method2878(20411, var39);
                    }
                }
            }
            if (arg5 != null) {
                int var52 = arg5.field129[arg6];
                int var53 = var52 >>> 16;
                var46 = arg15.method1606(var53, 96);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method2876((byte) -120, var43);
                    var25 |= var46.method2880((byte) 69, var43);
                    var27 |= var46.method2878(20411, var43);
                }
                if ((arg5.field149 || class89.field1364) && arg4 != -1 && arg5.field129.length > arg4) {
                    var45 = arg5.field127[arg6];
                    int var54 = arg5.field129[arg4];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg15.method1606(var55, arg18 - 127);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method2876((byte) -120, var44);
                        var25 |= var47.method2880((byte) 69, var44);
                        var27 |= var47.method2878(20411, var44);
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
        class236 var56 = class388.field5270;
        class121 var57;
        synchronized (class388.field5270) {
            var57 = (class121) class388.field5270.method1456(var21, 123);
        }
        class20 var58 = null;
        if (this.field6626 != -1) {
            var58 = arg13.method131(this.field6626, (byte) 52);
        }
        if (var57 == null || arg14.method564(var57.method854(), var20) != 0 || var58 != null && var58.field349 != null && this.field6619 == null) {
            if (var57 != null) {
                var20 = arg14.method565(var20, var57.method854());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field6620 != -1L) {
                            class236 var88 = class388.field5270;
                            synchronized (class388.field5270) {
                                var57 = (class121) class388.field5270.method1456(this.field6620, 122);
                            }
                        }
                        if (var57 == null || arg14.method564(var57.method854(), var20) != 0 || var58 != null && var58.field349 != null && this.field6619 == null) {
                            return null;
                        }
                    } else {
                        class118[] var63 = new class118[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class118 var67 = arg7.method2390(66, var65 & 0x3FFFFFFF).method2783(this.field6617, false);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            } else if ((var65 & Integer.MIN_VALUE) != 0) {
                                class118 var66 = arg16.method2534(true, var65 & 0x3FFFFFFF).method3052(0);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            }
                        }
                        if (var58 != null && var58.field349 != null) {
                            for (int var68 = 0; var68 < var58.field349.length; var68++) {
                                if (var58.field349[var68] != null && var63[var68] != null) {
                                    int var69 = var58.field349[var68][0];
                                    int var70 = var58.field349[var68][1];
                                    int var71 = var58.field349[var68][2];
                                    int var72 = var58.field349[var68][3] << 3;
                                    int var73 = var58.field349[var68][4] << 3;
                                    int var74 = var58.field349[var68][5] << 3;
                                    if (this.field6619 == null) {
                                        this.field6619 = new int[var58.field349.length][];
                                    }
                                    if (this.field6619[var68] == null) {
                                        int[] var75 = this.field6619[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[12] = -var69;
                                            var75[13] = -var70;
                                            var75[0] = var75[4] = var75[8] = 32768;
                                            var75[14] = -var71;
                                        } else {
                                            int var76 = class305.field4022[var72];
                                            int var77 = class305.field4019[var72];
                                            int var78 = class305.field4022[var73];
                                            int var79 = class305.field4019[var73];
                                            int var80 = class305.field4022[var74];
                                            int var81 = class305.field4019[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[1] = -var81 * var78 + var79 * var82 + 16384 >> 15;
                                            var75[0] = var78 * var80 + (var79 * var83) + 16384 >> 15;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[5] = -var77;
                                            var75[7] = -var79 * -var81 + var78 * var82 + 16384 >> 15;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[13] = var75[7] * -var71 + var75[4] * -var70 + var75[1] * -var69 + 16384 >> 15;
                                            var75[14] = var75[2] * -var69 + var75[5] * -var70 + (var75[8] * -var71) + 16384 >> 15;
                                            var75[12] = var75[6] * -var71 + var75[3] * -var70 + var75[0] * -var69 + 16384 >> 15;
                                        }
                                        var75[11] = var71;
                                        var75[10] = var70;
                                        var75[9] = var69;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method823(var73, var72, var74, arg18 ^ 0x35);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method826(var71, var69, (byte) 110, var70);
                                    }
                                }
                            }
                        }
                        int var84 = var20 | 0x4000;
                        class118 var85 = new class118(var63, var63.length);
                        var57 = arg14.method531(var85, var84, class379.field5183, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (class59.field929[var86].length > this.field6627[var86]) {
                                var57.method865(class514.field7588[var86], class59.field929[var86][this.field6627[var86]]);
                            }
                            if (this.field6627[var86] < class73.field1105[var86].length) {
                                var57.method865(class253.field3351[var86], class73.field1105[var86][this.field6627[var86]]);
                            }
                        }
                        if (arg9) {
                            var57.method860(var20);
                            class236 var87 = class388.field5270;
                            synchronized (class388.field5270) {
                                class388.field5270.method1462(var57, var21, arg18 - 60);
                            }
                            this.field6620 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg16.method2534(true, var62 & 0x3FFFFFFF).method3048(true)) {
                        var60 = true;
                    }
                } else if (!arg7.method2390(arg18 + 109, var62 & 0x3FFFFFFF).method2770(this.field6617, (byte) 30)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class121 var89 = var57.method863((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class303.field3996[var90] != null) {
                var89.method878(arg18 ^ 0xFFFFFF9B, this.field6619 == null ? null : this.field6619[var90], class50.field770[var90], class127.field1848[var90] - 1, false, class303.field3996[var90], class208.field2860[var90], 0, var91, class388.field5273[var90], class288.field3772[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method843(arg3 - 1, var39, false, var47, var42, var40, var46, arg2.field131, var38, var45, var41, arg17 - 1, var44, var43, 56);
        } else if (var41 != null) {
            var89.method841(0, false, (byte) 96, var41, var38, var42, var39, var40, arg17 - 1);
        } else if (var46 != null) {
            var89.method841(0, false, (byte) -11, var46, var43, var47, var44, var45, arg3 - 1);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class303.field3996[var92] = null;
            class208.field2860[var92] = null;
            class425.field5810[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;Lpp;Ldc;IILrd;IILlk;Ltq;Leb;I)Lc;")
    public final class121 method2758(class162 arg0, class267 arg1, class5 arg2, int arg3, int arg4, class221 arg5, int arg6, int arg7, class413 arg8, class442 arg9, class439 arg10, int arg11) {
        field6624++;
        if (this.field6628 != -1) {
            return arg9.method2554(118, this.field6628).method2884(arg11, arg1, arg5, (byte) 84, arg0, arg3, arg4, arg6, arg2);
        }
        int var13 = arg4;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg2.field129[arg11];
            var13 = arg4 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class504 var25 = arg1.method1606(var23, 89);
            if (var25 != null) {
                var15 |= var25.method2876((byte) -120, var24);
                var14 |= var25.method2880((byte) 69, var24);
                var17 |= var25.method2878(20411, var24);
                var16 |= arg2.field142;
            }
            if ((arg2.field149 || class89.field1364) && arg6 != -1 && arg2.field129.length > arg6) {
                int var26 = arg2.field129[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class504 var29 = var23 == var27 ? var25 : arg1.method1606(var27, -98);
                if (var29 != null) {
                    var15 |= var29.method2876((byte) -120, var28);
                    var14 |= var29.method2880((byte) 69, var28);
                    var17 |= var29.method2878(20411, var28);
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
        if (arg7 != -28157) {
            this.field6617 = true;
        }
        class236 var30 = class165.field2408;
        class121 var31;
        synchronized (class165.field2408) {
            var31 = (class121) class165.field2408.method1456(this.field6618, 109);
        }
        if (var31 == null || arg0.method564(var31.method854(), var13) != 0) {
            if (var31 != null) {
                var13 = arg0.method565(var13, var31.method854());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6613[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg10.method2534(true, var35 & 0x3FFFFFFF).method3055(30646)) {
                        var33 = true;
                    }
                } else if (!arg8.method2390(arg7 + 28234, var35 & 0x3FFFFFFF).method2780(this.field6617, -5)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class118[] var36 = new class118[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6613[var38];
                if ((var39 & 0x40000000) != 0) {
                    class118 var41 = arg8.method2390(101, var39 & 0x3FFFFFFF).method2766(this.field6617, false);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class118 var40 = arg10.method2534(true, var39 & 0x3FFFFFFF).method3051(0);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class118 var42 = new class118(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg0.method531(var42, var43, class379.field5183, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class59.field929[var44].length > this.field6627[var44]) {
                    var31.method865(class514.field7588[var44], class59.field929[var44][this.field6627[var44]]);
                }
                if (class73.field1105[var44].length > this.field6627[var44]) {
                    var31.method865(class253.field3351[var44], class73.field1105[var44][this.field6627[var44]]);
                }
            }
            var31.method860(var13);
            class236 var45 = class165.field2408;
            synchronized (class165.field2408) {
                class165.field2408.method1462(var31, this.field6618, arg7 + 28115);
            }
        }
        if (arg2 == null) {
            return var31;
        } else {
            var31.method863((byte) 4, var13, true);
            return arg2.method26(var31, arg4, arg7 ^ 0x6DA8, arg6, arg3, arg11);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    private final void method2759(int arg0) {
        field6614++;
        this.field6618 = -1L;
        long[] var2 = class172.field2502;
        this.field6618 = this.field6618 >>> 8 ^ var2[(int) ((this.field6618 ^ (long) (this.field6626 >> 8)) & 0xFFL)];
        this.field6618 = var2[(int) (((long) this.field6626 ^ this.field6618) & 0xFFL)] ^ this.field6618 >>> 8;
        for (int var3 = arg0; var3 < 12; var3++) {
            this.field6618 = var2[(int) (((long) (this.field6613[var3] >> 24) ^ this.field6618) & 0xFFL)] ^ this.field6618 >>> 8;
            this.field6618 = var2[(int) ((this.field6618 ^ (long) (this.field6613[var3] >> 16)) & 0xFFL)] ^ this.field6618 >>> 8;
            this.field6618 = this.field6618 >>> 8 ^ var2[(int) ((this.field6618 ^ (long) (this.field6613[var3] >> 8)) & 0xFFL)];
            this.field6618 = this.field6618 >>> 8 ^ var2[(int) (((long) this.field6613[var3] ^ this.field6618) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6618 = this.field6618 >>> 8 ^ var2[(int) ((this.field6618 ^ (long) this.field6627[var4]) & 0xFFL)];
        }
        this.field6618 = this.field6618 >>> 8 ^ var2[(int) ((this.field6618 ^ (long) (this.field6617 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
    public static final boolean method2760(int arg0, int arg1, int arg2) {
        int var3 = 124 % ((arg1 - 44) / 43);
        field6630++;
        if (class426.method2459(121, arg0, arg2)) {
            return class445.method2563((byte) -115, arg2, arg0) | (arg2 & 0xB000) != 0 | class30.method247(arg2, arg0, 5888) ? true : (arg0 & 0x37) == 0 & (class425.method2447(arg2, arg0, (byte) 72) | class326.method1885(arg2, -1, arg0));
        } else {
            return false;
        }
    }

    static {
        new class304("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
        field6631 = new class304("glow1:", "leuchten1:", "brillant1:", "brilho1:");
    }
}
