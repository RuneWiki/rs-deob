import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class261 {

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field4009 = 0;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "[Lwg;")
    public static class220[] field4016 = new class220[14];

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "[I")
    public static int[] field4021 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    private int field4028;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "J")
    private long field4010;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "J")
    private long field4030;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lpe;")
    public static class253 field4020;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Z")
    public boolean field4022;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    public int[] field4011;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "[I")
    private int[] field4023;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "[[I")
    private int[][] field4012;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static final void method1760(int arg0) {
        class59.field964.method1540(59, (byte) -2);
        field4007++;
        class59.field964.method440(0L, -67);
        if (arg0 == 1) {
            class143.field2067++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lqc;ILwg;IILwg;IIZII)Lpb;")
    public final class2 method1761(class85[] arg0, int arg1, class220 arg2, int arg3, int arg4, class220 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field4013++;
        if (this.field4008 != -1) {
            return class114.method820((byte) -62, this.field4008).method1262(arg6, arg7, arg0, arg5, (byte) 57, arg1, arg9, arg2, arg4, arg3);
        }
        long var12 = this.field4010;
        int[] var14 = this.field4023;
        if (arg5 != null && (arg5.field3403 >= 0 || arg5.field3421 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field4023[var15];
            }
            if (arg5.field3403 >= 0) {
                if (arg5.field3403 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class186.method1215(1073741824, arg5.field3403);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg5.field3421 >= 0) {
                if (arg5.field3421 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class186.method1215(arg5.field3421, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class2 var16 = (class2) class159.field2317.method945(var12, true);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class55.method460(var43 & 0x3FFFFFFF, -120).method989((byte) 90)) {
                        var17 = true;
                    }
                } else if (!class140.method951((byte) -94, var43 & 0x3FFFFFFF).method106(this.field4022, 0)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field4030 != -1L) {
                    var16 = (class2) class159.field2317.method945(this.field4030, true);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class219[] var19 = new class219[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class219 var41 = class140.method951((byte) -94, var40 & 0x3FFFFFFF).method111(this.field4022, arg10 - 1073741823);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class219 var42 = class55.method460(var40 & 0x3FFFFFFF, arg10 ^ 0xC000005C).method997(54);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class110 var21 = null;
                if (this.field4028 != -1) {
                    var21 = class122.method865(this.field4028, (byte) 122);
                }
                if (var21 != null && var21.field1659 != null) {
                    for (int var22 = 0; var22 < var21.field1659.length; var22++) {
                        if (var21.field1659[var22] != null && var19[var22] != null) {
                            int var23 = var21.field1659[var22][1];
                            int var24 = var21.field1659[var22][0];
                            int var25 = var21.field1659[var22][3];
                            int var26 = var21.field1659[var22][2];
                            int var27 = var21.field1659[var22][4];
                            int var28 = var21.field1659[var22][5];
                            if (this.field4012 == null) {
                                this.field4012 = new int[var21.field1659.length][];
                            }
                            if (this.field4012[var22] == null) {
                                int[] var29 = this.field4012[var22] = new int[15];
                                if (var25 == 0 && var27 == 0 && var28 == 0) {
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var26;
                                    var29[12] = -var24;
                                    var29[13] = -var23;
                                } else {
                                    int var30 = class119.field1776[var25] >> 1;
                                    int var31 = class119.field1774[var25] >> 1;
                                    int var32 = class119.field1776[var27] >> 1;
                                    int var33 = class119.field1774[var27] >> 1;
                                    int var34 = class119.field1776[var28] >> 1;
                                    int var35 = var31 * var34 + 16384 >> 15;
                                    int var36 = class119.field1774[var28] >> 1;
                                    var29[2] = var30 * var33 + 16384 >> 15;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    int var37 = var31 * var36 + 16384 >> 15;
                                    var29[7] = -var33 * -var36 - (-(var32 * var35) - 16384) >> 15;
                                    var29[3] = var30 * var36 + 16384 >> 15;
                                    var29[0] = var32 * var34 + var33 * var37 + 16384 >> 15;
                                    var29[1] = var33 * var35 + -var36 * var32 + 16384 >> 15;
                                    var29[13] = var29[7] * -var26 + var29[4] * -var23 + var29[1] * -var24 + 16384 >> 15;
                                    var29[5] = -var31;
                                    var29[6] = -var33 * var34 + var32 * var37 + 16384 >> 15;
                                    var29[12] = var29[6] * -var26 + var29[3] * -var23 + var29[0] * -var24 + 16384 >> 15;
                                    var29[14] = var29[8] * -var26 + var29[2] * -var24 + var29[5] * -var23 + 16384 >> 15;
                                }
                                var29[11] = var26;
                                var29[10] = var23;
                                var29[9] = var24;
                            }
                            if (var25 != 0 || var27 != 0 || var28 != 0) {
                                var19[var22].method1495(var25, var27, var28);
                            }
                            if (var24 != 0 || var23 != 0 || var26 != 0) {
                                var19[var22].method1485(var24, var23, var26);
                            }
                        }
                    }
                }
                class219 var38 = new class219(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class206.field3086[var39].length > this.field4011[var39]) {
                        var38.method1476(class23.field380[var39], class206.field3086[var39][this.field4011[var39]]);
                    }
                    if (this.field4011[var39] < class137.field1995[var39].length) {
                        var38.method1476(class222.field3461[var39], class137.field1995[var39][this.field4011[var39]]);
                    }
                }
                var16 = var38.method1501(64, 850, -30, -50, -30);
                if (arg8) {
                    class159.field2317.method941(var16, var12, -8447);
                    this.field4030 = var12;
                }
            }
        }
        boolean var44 = false;
        if (arg10 != 1073741823) {
            this.method1768((byte) -61, -62, 15);
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg0 == null ? 0 : arg0.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg0[var49] != null) {
                class220 var72 = class108.method781(arg0[var49].field1309, -1);
                if (var72.field3413 != null) {
                    var44 = true;
                    class270.field4214[var49] = var72;
                    int var73 = arg0[var49].field1298;
                    int var74 = arg0[var49].field1307;
                    int var75 = var72.field3413[var73];
                    class130.field1921[var49] = class126.method880(1023, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class27.field523[var49] = var76;
                    if (class130.field1921[var49] != null) {
                        var47 |= class130.field1921[var49].method1032(var76, arg10 ^ 0xC0000060);
                        var45 |= class130.field1921[var49].method1033(var76, -1);
                        var46 |= var72.field3429;
                    }
                    if ((var72.field3423 || class253.field3900) && var74 != -1 && var72.field3413.length > var74) {
                        class223.field3471[var49] = var72.field3422[var73];
                        class278.field4292[var49] = arg0[var49].field1308;
                        int var77 = var72.field3413[var74];
                        class154.field2256[var49] = class126.method880(1023, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class156.field2284[var49] = var78;
                        if (class154.field2256[var49] != null) {
                            var47 |= class154.field2256[var49].method1032(var78, -112);
                            var45 |= class154.field2256[var49].method1033(var78, -1);
                        }
                    } else {
                        class223.field3471[var49] = 0;
                        class278.field4292[var49] = 0;
                        class154.field2256[var49] = null;
                        class156.field2284[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg5 == null && arg2 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class152 var53 = null;
        class152 var54 = null;
        if (arg5 != null) {
            int var55 = arg5.field3413[arg3];
            int var56 = var55 >>> 16;
            var53 = class126.method880(1023, var56);
            var51 = var55 & 0xFFFF;
            if (var53 != null) {
                var47 |= var53.method1032(var51, 114);
                var45 |= var53.method1033(var51, -1);
                var46 |= arg5.field3429;
            }
            if ((arg5.field3423 || class253.field3900) && arg6 != -1 && arg5.field3413.length > arg6) {
                int var57 = arg5.field3413[arg6];
                int var58 = var57 >>> 16;
                var50 = var57 & 0xFFFF;
                var52 = arg5.field3422[arg3];
                if (var56 == var58) {
                    var54 = var53;
                } else {
                    var54 = class126.method880(arg10 - 1073740800, var50 >>> 16);
                }
                if (var54 != null) {
                    var47 |= var54.method1032(var50, -108);
                    var45 |= var54.method1033(var50, arg10 - 1073741824);
                }
            }
        }
        int var59 = 0;
        class152 var60 = null;
        int var61 = -1;
        int var62 = -1;
        class152 var63 = null;
        if (arg2 != null) {
            int var64 = arg2.field3413[arg7];
            int var65 = var64 >>> 16;
            var60 = class126.method880(1023, var65);
            var62 = var64 & 0xFFFF;
            if (var60 != null) {
                var47 |= var60.method1032(var62, -99);
                var45 |= var60.method1033(var62, -1);
                var46 |= arg2.field3429;
            }
            if ((arg2.field3423 || class253.field3900) && arg1 != -1 && arg1 < arg2.field3413.length) {
                var59 = arg2.field3422[arg7];
                int var66 = arg2.field3413[arg1];
                int var67 = var66 >>> 16;
                var61 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var60;
                } else {
                    var63 = class126.method880(1023, var61 >>> 16);
                }
                if (var63 != null) {
                    var47 |= var63.method1032(var61, arg10 - 1073741724);
                    var45 |= var63.method1033(var61, arg10 ^ 0xC0000000);
                }
            }
        }
        class2 var68 = var16.method35(!var45, !var47, !var46);
        int var69 = 0;
        int var70 = 1;
        while (var69 < var48) {
            if (class130.field1921[var69] != null) {
                var68.method27(class130.field1921[var69], class27.field523[var69], class154.field2256[var69], class156.field2284[var69], class278.field4292[var69] - 1, class223.field3471[var69], var70, class270.field4214[var69].field3429, this.field4012[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var53 != null && var60 != null) {
            var68.method29(var53, var51, var54, var50, arg4 - 1, var52, var60, var62, var63, var61, arg9 - 1, var59, arg5.field3425, arg5.field3429 | arg2.field3429);
        } else if (var53 != null) {
            var68.method37(var53, var51, var54, var50, arg4 - 1, var52, arg5.field3429);
        } else if (var60 != null) {
            var68.method37(var60, var62, var63, var61, arg9 - 1, var59, arg2.field3429);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class130.field1921[var71] = null;
            class154.field2256[var71] = null;
            class270.field4214[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lca;")
    public static final class54 method1762(int arg0) {
        field4005++;
        class54 var1 = new class54(34);
        var1.method437(true, 11);
        var1.method437(true, class176.field2585);
        var1.method437(true, class14.field207 ? 1 : 0);
        var1.method437(true, class244.field3785 ? 1 : 0);
        var1.method437(true, class127.field1867 ? 1 : 0);
        var1.method437(true, class249.field3869 ? 1 : 0);
        var1.method437(true, class126.field1856 ? 1 : 0);
        var1.method437(true, class10.field145 ? 1 : 0);
        var1.method437(true, class17.field312 ? 1 : 0);
        var1.method437(true, class134.field1967 ? 1 : 0);
        if (arg0 >= -113) {
            field4021 = null;
        }
        var1.method437(true, class233.field3602);
        var1.method437(true, class54.field879 ? 1 : 0);
        var1.method437(true, class109.field1628 ? 1 : 0);
        var1.method437(true, class241.field3755 ? 1 : 0);
        var1.method437(true, class162.field2350);
        var1.method437(true, class25.field431 ? 1 : 0);
        var1.method437(true, class112.field1719);
        var1.method437(true, class188.field2789);
        var1.method437(true, class194.field2934);
        var1.method428(class145.field2097, (byte) 46);
        var1.method428(class49.field811, (byte) 46);
        var1.method437(true, class31.method212());
        var1.method453((byte) 122, class142.field2039);
        var1.method437(true, class124.field1840);
        var1.method437(true, class170.field2503 ? 1 : 0);
        var1.method437(true, class117.field1767 ? 1 : 0);
        var1.method437(true, class249.field3862);
        var1.method437(true, class131.field1939 ? 1 : 0);
        var1.method437(true, class23.field376 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static final void method1763(byte arg0) {
        field4029++;
        if (!class101.method741(arg0 - 6333) && class51.field832 != class260.field3986) {
            class12.method87(false, 789221, class260.field3986, class16.field297, class185.field2687.field493[0], false, class121.field1806, class185.field2687.field449[0]);
        } else if (arg0 == -92 && class260.field3986 != class213.field3283 && class148.method1003(-1, class260.field3986)) {
            class213.field3283 = class260.field3986;
            class267.method1809(29835);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public final void method1764(int arg0, int arg1, int arg2) {
        field4003++;
        if (arg2 >= -11) {
            field4019 = -60;
        }
        this.field4011[arg0] = arg1;
        this.method1772(118);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
    public final int method1765(int arg0) {
        field4004++;
        int var2 = 87 / ((arg0 + 44) / 63);
        return this.field4008 == -1 ? (this.field4023[11] << 5) + this.field4023[1] + (this.field4023[0] << 15) + (this.field4011[0] << 25) - (-(this.field4011[4] << 20) - (this.field4023[8] << 10)) : 305419896 - -class114.method820((byte) -62, this.field4008).field2850;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBILwg;IIII)Lpb;")
    public final class2 method1766(int arg0, byte arg1, int arg2, class220 arg3, int arg4, int arg5, int arg6, int arg7) {
        field4027++;
        if (arg1 != -52) {
            field4019 = 43;
        }
        long var9 = (long) arg4 | (long) arg0 << 32 | (long) (arg6 << 16);
        class2 var11 = (class2) class197.field2976.method945(var9, true);
        if (var11 == null) {
            int var12 = 0;
            class219[] var13 = new class219[3];
            if (!class55.method460(arg4, -90).method991(0) || !class55.method460(arg6, arg1 ^ 0x61).method991(0) || !class55.method460(arg0, -82).method991(arg1 ^ 0xFFFFFFCC)) {
                return null;
            }
            class219 var14 = class55.method460(arg4, -82).method995(arg1 + 175);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class219 var15 = class55.method460(arg6, arg1 - 71).method995(arg1 + 179);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class219 var16 = class55.method460(arg0, -110).method995(125);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class219 var17 = new class219(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4011[var18] < class206.field3086[var18].length) {
                    var17.method1476(class23.field380[var18], class206.field3086[var18][this.field4011[var18]]);
                }
                if (class137.field1995[var18].length > this.field4011[var18]) {
                    var17.method1476(class222.field3461[var18], class137.field1995[var18][this.field4011[var18]]);
                }
            }
            var11 = var17.method1501(64, 768, -50, -10, -50);
            class197.field2976.method941(var11, var9, arg1 - 8395);
        }
        if (arg3 != null) {
            var11 = arg3.method1507(arg7, var11, arg2, arg5, (byte) 76);
        }
        return var11;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZB)V")
    public final void method1767(boolean arg0, byte arg1) {
        field4015++;
        if (arg1 != -70) {
            method1771(-121, true);
        }
        this.field4022 = arg0;
        this.method1772(101);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)V")
    public final void method1768(byte arg0, int arg1, int arg2) {
        if (arg0 > -81) {
            return;
        }
        field4018++;
        int var4 = class151.field2207[arg1];
        if (this.field4023[var4] != 0 && class55.method460(arg2, -89) != null) {
            this.field4023[var4] = class186.method1215(arg2, Integer.MIN_VALUE);
            this.method1772(109);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        field4020 = null;
        field4021 = null;
        if (arg0 != -41) {
            field4016 = null;
        }
        field4016 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIILwg;I)Lpb;")
    public final class2 method1770(int arg0, int arg1, int arg2, class220 arg3, int arg4) {
        field4006++;
        if (this.field4008 != -1) {
            return class114.method820((byte) -62, this.field4008).method1265(arg0, (byte) 60, arg4, arg1, arg3);
        } else if (arg2 == 255) {
            class2 var6 = (class2) class197.field2976.method945(this.field4010, true);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var17 = this.field4023[var8];
                    if ((var17 & 0x40000000) == 0) {
                        if ((Integer.MIN_VALUE & var17) != 0 && !class55.method460(var17 & 0x3FFFFFFF, -102).method991(0)) {
                            var7 = true;
                        }
                    } else if (!class140.method951((byte) -94, var17 & 0x3FFFFFFF).method102(true, this.field4022)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                int var9 = 0;
                class219[] var10 = new class219[12];
                for (int var11 = 0; var11 < 12; var11++) {
                    int var14 = this.field4023[var11];
                    if ((var14 & 0x40000000) != 0) {
                        class219 var15 = class140.method951((byte) -94, var14 & 0x3FFFFFFF).method113(-25884, this.field4022);
                        if (var15 != null) {
                            var10[var9++] = var15;
                        }
                    } else if ((var14 & Integer.MIN_VALUE) != 0) {
                        class219 var16 = class55.method460(var14 & 0x3FFFFFFF, -104).method995(arg2 - 139);
                        if (var16 != null) {
                            var10[var9++] = var16;
                        }
                    }
                }
                class219 var12 = new class219(var10, var9);
                for (int var13 = 0; var13 < 5; var13++) {
                    if (class206.field3086[var13].length > this.field4011[var13]) {
                        var12.method1476(class23.field380[var13], class206.field3086[var13][this.field4011[var13]]);
                    }
                    if (class137.field1995[var13].length > this.field4011[var13]) {
                        var12.method1476(class222.field3461[var13], class137.field1995[var13][this.field4011[var13]]);
                    }
                }
                var6 = var12.method1501(64, 768, -50, -10, -50);
                class197.field2976.method941(var6, this.field4010, -8447);
            }
            if (arg3 != null) {
                var6 = arg3.method1507(arg1, var6, arg4, arg0, (byte) 76);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)I")
    public static final int method1771(int arg0, boolean arg1) {
        field4014++;
        if (arg1) {
            field4009 = -81;
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    private final void method1772(int arg0) {
        field4026++;
        long var2 = this.field4010;
        long[] var4 = class197.field2975;
        this.field4010 = -1L;
        this.field4010 = var4[(int) (((long) (this.field4028 >> 8) ^ this.field4010) & 0xFFL)] ^ this.field4010 >>> 8;
        this.field4010 = this.field4010 >>> 8 ^ var4[(int) ((this.field4010 ^ (long) this.field4028) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4010 = this.field4010 >>> 8 ^ var4[(int) ((this.field4010 ^ (long) (this.field4023[var5] >> 24)) & 0xFFL)];
            this.field4010 = this.field4010 >>> 8 ^ var4[(int) ((this.field4010 ^ (long) (this.field4023[var5] >> 16)) & 0xFFL)];
            this.field4010 = var4[(int) ((this.field4010 ^ (long) (this.field4023[var5] >> 8)) & 0xFFL)] ^ this.field4010 >>> 8;
            this.field4010 = var4[(int) ((this.field4010 ^ (long) this.field4023[var5]) & 0xFFL)] ^ this.field4010 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4010 = var4[(int) ((this.field4010 ^ (long) this.field4011[var6]) & 0xFFL)] ^ this.field4010 >>> 8;
        }
        if (arg0 <= 91) {
            field4024 = -67;
        }
        this.field4010 = var4[(int) ((this.field4010 ^ (long) (this.field4022 ? 1 : 0)) & 0xFFL)] ^ this.field4010 >>> 8;
        if (var2 != 0L && this.field4010 != var2) {
            class159.field2317.method948(116, var2);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZII[II[I)V")
    public final void method1773(boolean arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        if (arg1 >= -44) {
            method1771(71, true);
        }
        if (this.field4028 != arg2) {
            this.field4028 = arg2;
            this.field4012 = null;
        }
        field4017++;
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class88.field1336; var8++) {
                    class145 var9 = class55.method460(var8, -114);
                    if (var9 != null && !var9.field2113 && (arg0 ? client.field720[var7] : class265.field4140[var7]) == var9.field2100) {
                        arg5[class151.field2207[var7]] = class186.method1215(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field4022 = arg0;
        this.field4008 = arg4;
        this.field4023 = arg5;
        this.field4011 = arg3;
        this.method1772(117);
    }
}
