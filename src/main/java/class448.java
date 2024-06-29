import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class448 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public int field6351 = -1;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lsd;")
    public static class74 field6354 = new class74(40, -1);

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "J")
    public static long field6362 = 0L;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field6363 = 0;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "[Lqo;")
    public static class137[] field6366 = new class137[32768];

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    private int field6361;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "J")
    private long field6350;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "J")
    private long field6364;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Z")
    public boolean field6352;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
    private int[] field6349;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[I")
    public int[] field6368;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[[I")
    private int[][] field6365;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([II[IZIB)V", line = 6)
    public final void method2627(int[] arg0, int arg1, int[] arg2, boolean arg3, int arg4, byte arg5) {
        this.field6352 = arg3;
        field6357++;
        this.field6349 = arg2;
        if (arg5 < 51) {
            this.field6368 = null;
        }
        this.field6368 = arg0;
        this.field6351 = arg1;
        if (this.field6361 != arg4) {
            this.field6361 = arg4;
            this.field6365 = null;
        }
        this.method2635((byte) 83);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILoj;Lhu;IIILoi;BILdd;I)Lqh;", line = 28)
    public final class352 method2628(int arg0, int arg1, class280 arg2, class207 arg3, int arg4, int arg5, int arg6, class129 arg7, byte arg8, int arg9, class229 arg10, int arg11) {
        field6367++;
        if (arg8 >= -53) {
            this.method2634(54, -119, 100);
        }
        int var13 = arg0;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            Object var20 = null;
            var13 = arg0 | 0x20;
            int var21 = arg3.field2853[arg6];
            int var22 = var21 >>> 16;
            class170 var23 = arg10.method1265(var22, -8990);
            int var24 = var21 & 0xFFFF;
            if (var23 != null) {
                var15 |= var23.method826(var24, (byte) -97);
                var14 |= var23.method831(var24, (byte) 93);
                var16 |= arg3.field2846;
            }
            if ((arg3.field2867 || class445.field6334) && arg1 != -1 && arg3.field2853.length > arg1) {
                int var25 = arg3.field2853[arg1];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class170 var28;
                if (var22 == var26) {
                    var28 = var23;
                } else {
                    var28 = arg10.method1265(var27 >>> 16, -8990);
                }
                if (var28 != null) {
                    var15 |= var28.method826(var27, (byte) -97);
                    var14 |= var28.method831(var27, (byte) 93);
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
        }
        long var29 = (long) arg4 | (long) arg11 << 32 | (long) (arg9 << 16);
        class210 var31 = class460.field6497;
        class352 var32;
        synchronized (class460.field6497) {
            var32 = (class352) class460.field6497.method1163((byte) 110, var29);
        }
        if (var32 == null || arg2.method1473(var32.method1719(), var13) != 0) {
            if (var32 != null) {
                var13 = arg2.method1443(var13, var32.method1719());
            }
            class10[] var34 = new class10[3];
            int var35 = 0;
            if (!arg7.method616(arg4, 125).method1282(-17116) || !arg7.method616(arg9, 127).method1282(-17116) || !arg7.method616(arg11, 125).method1282(-17116)) {
                return null;
            }
            class10 var36 = arg7.method616(arg4, -27).method1288(-16988);
            if (var36 != null) {
                var34[var35++] = var36;
            }
            class10 var37 = arg7.method616(arg9, -49).method1288(-16988);
            if (var37 != null) {
                var34[var35++] = var37;
            }
            class10 var38 = arg7.method616(arg11, -81).method1288(-16988);
            if (var38 != null) {
                var34[var35++] = var38;
            }
            int var39 = var13 | 0x2000;
            class10 var40 = new class10(var34, var35);
            var32 = arg2.method1346(var40, var39, class27.field360, 64, 768);
            for (int var41 = 0; var41 < 5; var41++) {
                if (this.field6368[var41] < class178.field2155[var41].length) {
                    var32.method1747(class368.field5265[var41], class178.field2155[var41][this.field6368[var41]]);
                }
                if (class78.field935[var41].length > this.field6368[var41]) {
                    var32.method1747(class422.field6094[var41], class78.field935[var41][this.field6368[var41]]);
                }
            }
            var32.method1732(var13);
            class210 var42 = class460.field6497;
            synchronized (class460.field6497) {
                class460.field6497.method1172(var29, 1, var32);
            }
        }
        if (arg3 == null) {
            return var32;
        } else {
            class352 var43 = var32.method1749((byte) 4, var13, true);
            return arg3.method1148(var43, arg0, arg6, -1, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 169)
    public static void method2629(byte arg0) {
        field6366 = null;
        if (arg0 != 51) {
            method2629((byte) -29);
        }
        field6354 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lhu;Lqm;IZLoi;Loj;III[Lde;ILqr;IILdd;Lhu;ILeh;Lcb;)Lqh;", line = 186)
    public final class352 method2630(class207 arg0, class311 arg1, int arg2, boolean arg3, class129 arg4, class280 arg5, int arg6, int arg7, int arg8, class178[] arg9, int arg10, class18 arg11, int arg12, int arg13, class229 arg14, class207 arg15, int arg16, class130 arg17, class420 arg18) {
        field6353++;
        if (this.field6351 != -1) {
            return arg18.method2507((byte) -88, this.field6351).method2816(arg14, arg16, arg17, arg2, arg10, arg5, arg6, arg9, arg15, arg8, arg0, arg12, arg7, arg1, (byte) -81);
        }
        int var20 = arg6;
        long var21 = this.field6364;
        int[] var23 = this.field6349;
        if (arg15 != null && (arg15.field2865 >= 0 || arg15.field2851 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field6349[var24];
            }
            if (arg15.field2865 >= 0) {
                if (arg15.field2865 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class292.method1841(arg15.field2865, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg15.field2851 >= 0) {
                if (arg15.field2851 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class292.method1841(arg15.field2851, 1073741824);
                    var21 ^= (long) var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = arg15 != null || arg0 != null;
        int var28 = arg9 == null ? 0 : arg9.length;
        for (int var29 = 0; var29 < var28; var29++) {
            class66.field833[var29] = null;
            if (arg9[var29] != null) {
                class207 var30 = arg14.method1267(-93, arg9[var29].field2143);
                if (var30.field2853 != null) {
                    class231.field3210[var29] = var30;
                    var27 = true;
                    int var31 = arg9[var29].field2147;
                    int var32 = arg9[var29].field2144;
                    int var33 = var30.field2853[var31];
                    class66.field833[var29] = arg14.method1265(var33 >>> 16, -8990);
                    int var34 = var33 & 0xFFFF;
                    class40.field475[var29] = var34;
                    if (class66.field833[var29] != null) {
                        var26 |= class66.field833[var29].method826(var34, (byte) -97);
                        var25 |= class66.field833[var29].method831(var34, (byte) 93);
                    }
                    if ((var30.field2867 || class445.field6334) && var32 != -1 && var30.field2853.length > var32) {
                        class35.field439[var29] = var30.field2843[var31];
                        class293.field4355[var29] = arg9[var29].field2145;
                        int var35 = var30.field2853[var32];
                        class103.field1251[var29] = arg14.method1265(var35 >>> 16, -8990);
                        int var36 = var35 & 0xFFFF;
                        class128.field1584[var29] = var36;
                        if (class103.field1251[var29] != null) {
                            var26 |= class103.field1251[var29].method826(var36, (byte) -97);
                            var25 |= class103.field1251[var29].method831(var36, (byte) 93);
                        }
                    } else {
                        class35.field439[var29] = 0;
                        class293.field4355[var29] = 0;
                        class103.field1251[var29] = null;
                        class128.field1584[var29] = -1;
                    }
                }
            }
        }
        int var37 = -1;
        int var38 = -1;
        int var39 = 0;
        class170 var40 = null;
        class170 var41 = null;
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        if (arg13 != -7898) {
            this.method2630((class207) null, (class311) null, -70, true, (class129) null, (class280) null, 38, -115, 7, (class178[]) null, 17, (class18) null, 24, 38, (class229) null, (class207) null, -46, (class130) null, (class420) null);
        }
        class170 var45 = null;
        class170 var46 = null;
        if (var27) {
            var20 = arg6 | 0x20;
            if (arg15 != null) {
                int var47 = arg15.field2853[arg16];
                int var48 = var47 >>> 16;
                var37 = var47 & 0xFFFF;
                var40 = arg14.method1265(var48, -8990);
                if (var40 != null) {
                    var26 |= var40.method826(var37, (byte) -97);
                    var25 |= var40.method831(var37, (byte) 93);
                }
                if ((arg15.field2867 || class445.field6334) && arg8 != -1 && arg15.field2853.length > arg8) {
                    int var49 = arg15.field2853[arg8];
                    var39 = arg15.field2843[arg16];
                    int var50 = var49 >>> 16;
                    var38 = var49 & 0xFFFF;
                    var41 = var48 == var50 ? var40 : arg14.method1265(var50, -8990);
                    if (var41 != null) {
                        var26 |= var41.method826(var38, (byte) -97);
                        var25 |= var41.method831(var38, (byte) 93);
                    }
                }
            }
            if (arg0 != null) {
                int var51 = arg0.field2853[arg7];
                int var52 = var51 >>> 16;
                var42 = var51 & 0xFFFF;
                var45 = arg14.method1265(var52, -8990);
                if (var45 != null) {
                    var26 |= var45.method826(var42, (byte) -97);
                    var25 |= var45.method831(var42, (byte) 93);
                }
                if ((arg0.field2867 || class445.field6334) && arg10 != -1 && arg10 < arg0.field2853.length) {
                    var44 = arg0.field2843[arg7];
                    int var53 = arg0.field2853[arg10];
                    int var54 = var53 >>> 16;
                    var46 = var52 == var54 ? var45 : arg14.method1265(var54, -8990);
                    var43 = var53 & 0xFFFF;
                    if (var46 != null) {
                        var26 |= var46.method826(var43, (byte) -97);
                        var25 |= var46.method831(var43, (byte) 93);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
        }
        class210 var55 = class189.field2588;
        class352 var56;
        synchronized (class189.field2588) {
            var56 = (class352) class189.field2588.method1163((byte) 108, var21);
        }
        class349 var57 = null;
        if (this.field6361 != -1) {
            var57 = arg1.method1930(982820868, this.field6361);
        }
        if (var56 == null || arg5.method1473(var56.method1719(), var20) != 0 || var57 != null && var57.field4965 != null && this.field6365 == null) {
            if (var56 != null) {
                var20 = arg5.method1443(var20, var56.method1719());
            }
            boolean var59 = false;
            int var60 = 0;
            while (true) {
                if (var60 >= 12) {
                    if (var59) {
                        if (this.field6350 != -1L) {
                            class210 var62 = class189.field2588;
                            synchronized (class189.field2588) {
                                var56 = (class352) class189.field2588.method1163((byte) 126, this.field6350);
                            }
                        }
                        if (var56 == null || arg5.method1473(var56.method1719(), var20) != 0 || var57 != null && var57.field4965 != null && this.field6365 == null) {
                            return null;
                        }
                    } else {
                        class10[] var63 = new class10[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class10 var67 = arg11.method121(var65 & 0x3FFFFFFF, arg13 ^ 0x1ED9).method2317(this.field6352, 112);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            } else if ((Integer.MIN_VALUE & var65) != 0) {
                                class10 var66 = arg4.method616(var65 & 0x3FFFFFFF, 125).method1284((byte) -87);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            }
                        }
                        if (var57 != null && var57.field4965 != null) {
                            for (int var68 = 0; var68 < var57.field4965.length; var68++) {
                                if (var57.field4965[var68] != null && var63[var68] != null) {
                                    int var69 = var57.field4965[var68][0];
                                    int var70 = var57.field4965[var68][1];
                                    int var71 = var57.field4965[var68][2];
                                    int var72 = var57.field4965[var68][3] << 3;
                                    int var73 = var57.field4965[var68][4] << 3;
                                    int var74 = var57.field4965[var68][5] << 3;
                                    if (this.field6365 == null) {
                                        this.field6365 = new int[var57.field4965.length][];
                                    }
                                    if (this.field6365[var68] == null) {
                                        int[] var75 = this.field6365[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[12] = -var69;
                                            var75[14] = -var71;
                                            var75[13] = -var70;
                                            var75[0] = var75[4] = var75[8] = 32768;
                                        } else {
                                            int var76 = class16.field214[var72];
                                            int var77 = class16.field212[var72];
                                            int var78 = class16.field214[var73];
                                            int var79 = class16.field212[var73];
                                            int var80 = class16.field214[var74];
                                            int var81 = class16.field212[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[1] = var79 * var82 + (-var81 * var78 + 16384) >> 15;
                                            var75[5] = -var77;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[7] = -var79 * -var81 + var78 * var82 + 16384 >> 15;
                                            var75[0] = var78 * var80 + (var79 * var83 + 16384) >> 15;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[14] = var75[2] * -var69 + 16384 - (-(var75[5] * -var70) + -(var75[8] * -var71)) >> 15;
                                            var75[13] = var75[1] * -var69 + (var75[4] * -var70 - (-(var75[7] * -var71) - 16384)) >> 15;
                                            var75[12] = var75[0] * -var69 - (-(var75[6] * -var71) - (var75[3] * -var70) - 16384) >> 15;
                                        }
                                        var75[9] = var69;
                                        var75[11] = var71;
                                        var75[10] = var70;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method78(25101, var72, var73, var74);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method75(false, var71, var69, var70);
                                    }
                                }
                            }
                        }
                        int var84 = var20 | 0x2000;
                        class10 var85 = new class10(var63, var63.length);
                        var56 = arg5.method1346(var85, var84, class27.field360, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (class178.field2155[var86].length > this.field6368[var86]) {
                                var56.method1747(class368.field5265[var86], class178.field2155[var86][this.field6368[var86]]);
                            }
                            if (this.field6368[var86] < class78.field935[var86].length) {
                                var56.method1747(class422.field6094[var86], class78.field935[var86][this.field6368[var86]]);
                            }
                        }
                        if (arg3) {
                            var56.method1732(var20);
                            class210 var87 = class189.field2588;
                            synchronized (class189.field2588) {
                                class189.field2588.method1172(var21, 1, var56);
                            }
                            this.field6350 = var21;
                        }
                    }
                    break;
                }
                int var61 = var23[var60];
                if ((var61 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var61) != 0 && !arg4.method616(var61 & 0x3FFFFFFF, 125).method1286((byte) 63)) {
                        var59 = true;
                    }
                } else if (!arg11.method121(var61 & 0x3FFFFFFF, -1).method2321(this.field6352, -113)) {
                    var59 = true;
                }
                var60++;
            }
        }
        class352 var88 = var56.method1749((byte) 4, var20, true);
        if (!var27) {
            return var88;
        }
        int var89 = 0;
        int var90 = 1;
        while (var89 < var28) {
            if (class66.field833[var89] != null) {
                var88.method2130((byte) -128, class103.field1251[var89], 0, class35.field439[var89], class40.field475[var89], var90, class128.field1584[var89], class293.field4355[var89] - 1, this.field6365 == null ? null : this.field6365[var89], class66.field833[var89], false);
            }
            var89++;
            var90 <<= 0x1;
        }
        if (var40 != null && var45 != null) {
            var88.method2140(var46, (byte) -74, arg15.field2845, arg2 - 1, arg12 + -1, var40, var41, var38, var44, var43, false, var42, var45, var37, var39);
        } else if (var40 != null) {
            var88.method2136(0, (byte) 34, var38, false, var39, var41, arg12 - 1, var37, var40);
        } else if (var45 != null) {
            var88.method2136(0, (byte) -108, var43, false, var44, var46, arg2 - 1, var42, var45);
        }
        for (int var91 = 0; var91 < var28; var91++) {
            class66.field833[var91] = null;
            class103.field1251[var91] = null;
            class231.field3210[var91] = null;
        }
        return var88;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZZ)V", line = 678)
    public final void method2631(boolean arg0, boolean arg1) {
        field6356++;
        if (arg1) {
            this.method2632(-109, (class420) null, (class207) null, -25, (class229) null, (class130) null, -66, -46, 43, (class280) null, (class18) null, (class129) null);
        }
        this.field6352 = arg0;
        this.method2635((byte) 83);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILcb;Lhu;ILdd;Leh;IIILoj;Lqr;Loi;)Lqh;", line = 697)
    public final class352 method2632(int arg0, class420 arg1, class207 arg2, int arg3, class229 arg4, class130 arg5, int arg6, int arg7, int arg8, class280 arg9, class18 arg10, class129 arg11) {
        field6358++;
        if (this.field6351 != -1) {
            return arg1.method2507((byte) 93, this.field6351).method2821(true, arg4, arg5, arg2, arg9, arg7, arg0, arg3, arg6);
        }
        int var13 = arg7;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            int var20 = arg2.field2853[arg0];
            var13 = arg7 | 0x20;
            Object var21 = null;
            int var22 = var20 >>> 16;
            int var23 = var20 & 0xFFFF;
            class170 var24 = arg4.method1265(var22, arg8 ^ 0xFFFF9FBD);
            if (var24 != null) {
                var15 |= var24.method826(var23, (byte) -97);
                var14 |= var24.method831(var23, (byte) 93);
                var16 |= arg2.field2846;
            }
            if ((arg2.field2867 || class445.field6334) && arg6 != -1 && arg6 < arg2.field2853.length) {
                int var25 = arg2.field2853[arg6];
                int var26 = var25 >>> 16;
                class170 var27 = var22 == var26 ? var24 : arg4.method1265(var26, -8990);
                int var28 = var25 & 0xFFFF;
                if (var27 != null) {
                    var15 |= var27.method826(var28, (byte) -97);
                    var14 |= var27.method831(var28, (byte) 93);
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
        }
        class210 var29 = class460.field6497;
        class352 var30;
        synchronized (class460.field6497) {
            var30 = (class352) class460.field6497.method1163((byte) -116, this.field6364);
        }
        if (var30 == null || arg9.method1473(var30.method1719(), var13) != 0) {
            if (var30 != null) {
                var13 = arg9.method1443(var13, var30.method1719());
            }
            boolean var32 = false;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field6349[var33];
                if ((var34 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var34) != 0 && !arg11.method616(var34 & 0x3FFFFFFF, arg8 ^ 0xFFFFBCCB).method1282(-17116)) {
                        var32 = true;
                    }
                } else if (!arg10.method121(var34 & 0x3FFFFFFF, -1).method2329(this.field6352, true)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class10[] var35 = new class10[12];
            int var36 = 0;
            for (int var37 = 0; var37 < 12; var37++) {
                int var38 = this.field6349[var37];
                if ((var38 & 0x40000000) != 0) {
                    class10 var39 = arg10.method121(var38 & 0x3FFFFFFF, -1).method2326(20040, this.field6352);
                    if (var39 != null) {
                        var35[var36++] = var39;
                    }
                } else if ((Integer.MIN_VALUE & var38) != 0) {
                    class10 var40 = arg11.method616(var38 & 0x3FFFFFFF, -9).method1288(arg8 ^ 0xFFFFFEFB);
                    if (var40 != null) {
                        var35[var36++] = var40;
                    }
                }
            }
            class10 var41 = new class10(var35, var36);
            int var42 = var13 | 0x2000;
            var30 = arg9.method1346(var41, var42, class27.field360, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (class178.field2155[var43].length > this.field6368[var43]) {
                    var30.method1747(class368.field5265[var43], class178.field2155[var43][this.field6368[var43]]);
                }
                if (this.field6368[var43] < class78.field935[var43].length) {
                    var30.method1747(class422.field6094[var43], class78.field935[var43][this.field6368[var43]]);
                }
            }
            var30.method1732(var13);
            class210 var44 = class460.field6497;
            synchronized (class460.field6497) {
                class460.field6497.method1172(this.field6364, 1, var30);
            }
        }
        if (arg8 != 17247) {
            return null;
        } else if (arg2 == null) {
            return var30;
        } else {
            var30.method1749((byte) 4, var13, true);
            return arg2.method1148(var30, arg7, arg0, -1, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILoi;)V", line = 885)
    public final void method2633(int arg0, int arg1, int arg2, class129 arg3) {
        field6359++;
        int var5 = class234.field3245[arg1];
        if (this.field6349[var5] != 0 && arg3.method616(arg2, 127) != null) {
            int var6 = 47 / ((arg0 - 4) / 62);
            this.field6349[var5] = class292.method1841(arg2, Integer.MIN_VALUE);
            this.method2635((byte) 83);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V", line = 911)
    public final void method2634(int arg0, int arg1, int arg2) {
        this.field6368[arg0] = arg1;
        if (arg2 != -268450832) {
            this.field6350 = 49L;
        }
        field6360++;
        this.method2635((byte) 83);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 934)
    private final void method2635(byte arg0) {
        field6355++;
        long[] var2 = class274.field3906;
        this.field6364 = -1L;
        this.field6364 = this.field6364 >>> 8 ^ var2[(int) (((long) (this.field6361 >> 8) ^ this.field6364) & 0xFFL)];
        this.field6364 = var2[(int) ((this.field6364 ^ (long) this.field6361) & 0xFFL)] ^ this.field6364 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6364 = this.field6364 >>> 8 ^ var2[(int) (((long) (this.field6349[var3] >> 24) ^ this.field6364) & 0xFFL)];
            this.field6364 = this.field6364 >>> 8 ^ var2[(int) ((this.field6364 ^ (long) (this.field6349[var3] >> 16)) & 0xFFL)];
            this.field6364 = var2[(int) ((this.field6364 ^ (long) (this.field6349[var3] >> 8)) & 0xFFL)] ^ this.field6364 >>> 8;
            this.field6364 = var2[(int) ((this.field6364 ^ (long) this.field6349[var3]) & 0xFFL)] ^ this.field6364 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6364 = this.field6364 >>> 8 ^ var2[(int) ((this.field6364 ^ (long) this.field6368[var4]) & 0xFFL)];
        }
        this.field6364 = this.field6364 >>> 8 ^ var2[(int) ((this.field6364 ^ (long) (this.field6352 ? 1 : 0)) & 0xFFL)];
        if (arg0 != 83) {
            this.field6365 = null;
        }
    }
}
