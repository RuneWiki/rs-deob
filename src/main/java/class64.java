import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class64 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "J")
    private long field833;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "J")
    private long field835;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
    public boolean field825;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "[I")
    private int[] field844;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
    public int[] field846;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[[I")
    private int[][] field847;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 5)
    private final void method425(byte arg0) {
        if (arg0 > -1) {
            this.field849 = 25;
        }
        field838++;
        long var2 = this.field835;
        this.field835 = -1L;
        long[] var4 = class72.field987;
        this.field835 = this.field835 >>> 8 ^ var4[(int) (((long) (this.field842 >> 8) ^ this.field835) & 0xFFL)];
        this.field835 = var4[(int) (((long) this.field842 ^ this.field835) & 0xFFL)] ^ this.field835 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field835 = var4[(int) ((this.field835 ^ (long) (this.field844[var5] >> 24)) & 0xFFL)] ^ this.field835 >>> 8;
            this.field835 = var4[(int) (((long) (this.field844[var5] >> 16) ^ this.field835) & 0xFFL)] ^ this.field835 >>> 8;
            this.field835 = this.field835 >>> 8 ^ var4[(int) ((this.field835 ^ (long) (this.field844[var5] >> 8)) & 0xFFL)];
            this.field835 = var4[(int) (((long) this.field844[var5] ^ this.field835) & 0xFFL)] ^ this.field835 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field835 = var4[(int) ((this.field835 ^ (long) this.field846[var6]) & 0xFFL)] ^ this.field835 >>> 8;
        }
        this.field835 = this.field835 >>> 8 ^ var4[(int) (((long) (this.field825 ? 1 : 0) ^ this.field835) & 0xFFL)];
        if (var2 != 0L && this.field835 != var2) {
            class327.field4938.method719(-91, var2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lkm;IIB)[Lbc;", line = 47)
    private static final class4[] method426(class133 arg0, int arg1, int arg2, byte arg3) {
        field841++;
        if (class129.method931(arg1, arg2, arg0, (byte) 101)) {
            int var4 = 123 / ((arg3 + 56) / 55);
            return class189.method1324(-117);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)V", line = 62)
    public static final void method427(byte arg0, int arg1) {
        field827++;
        class143 var2 = class163.method1176((byte) -59, arg1, 6);
        var2.method1038(0);
        if (arg0 < 73) {
            method428(18);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 76)
    public static final void method428(int arg0) {
        field837++;
        if (class124.field1674 < 128.0F) {
            class124.field1674 = 128.0F;
        }
        int var1 = class111.field1505 >> 7;
        if (class124.field1674 > 383.0F) {
            class124.field1674 = 383.0F;
        }
        int var2 = class17.field228 >> 7;
        while (class89.field1257 >= 2048.0F) {
            class89.field1257 -= 2048.0F;
        }
        while (class89.field1257 < 0.0F) {
            class89.field1257 += 2048.0F;
        }
        int var3 = class135.method985(class17.field228, class251.field3603, class111.field1505, (byte) -86);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class251.field3603;
                    if (var7 < 3 && (class240.field3406[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 + ((class307.field4599[var7][var5][var6] & 0xFF) * 8) - class333.field5020[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        if (arg0 < 81) {
            return;
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class93.field1286) {
            class93.field1286 += (var9 - class93.field1286) / 24;
        } else if (class93.field1286 > var9) {
            class93.field1286 += (var9 - class93.field1286) / 80;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILkm;)V", line = 157)
    public static final void method429(int arg0, class133 arg1) {
        class77.field1089 = class318.method2229(0, -118, arg1, class45.field550);
        class332.field4999 = class119.method867(128, 0, arg1, class68.field940);
        field840++;
        class35.field406 = class119.method867(128, 0, arg1, class240.field3404);
        class293.field4360 = class119.method867(128, 0, arg1, class79.field1138);
        class289.field4312 = class119.method867(128, 0, arg1, class343.field5150);
        class286.field4252 = class119.method867(arg0 ^ 0xFFFF89E6, 0, arg1, class272.field4080);
        class6.field53 = class119.method867(128, 0, arg1, class161.field2216);
        class208.field2998 = class143.method1037(arg1, -114, 0, class314.field4739);
        class269.field3997 = class333.method2319(0, class17.field241, arg1, arg0 ^ arg0);
        class216.field3090 = class333.method2319(0, class115.field1558, arg1, 0);
        class63.field819 = method426(arg1, 0, class157.field2169, (byte) -115);
        class141.field1935 = method426(arg1, 0, class266.field3872, (byte) 127);
        class37.field426.method1905(class141.field1935, (int[]) null);
        class312.field4716.method1905(class141.field1935, (int[]) null);
        class204.field2946.method1905(class141.field1935, (int[]) null);
        if (class67.field908) {
            class322.field4890 = class270.method1860(arg1, class232.field3281, 0, 11107);
            for (int var2 = 0; var2 < class322.field4890.length; var2++) {
                class322.field4890[var2].method1782();
            }
        }
        class178 var3 = class315.method2151(arg1, class70.field949, -97, 0);
        var3.method1227();
        if (class67.field908) {
            class241.field3438 = new class328(var3);
        } else {
            class241.field3438 = var3;
        }
        class178[] var4 = class318.method2229(0, -92, arg1, class188.field2597);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1227();
        }
        if (class67.field908) {
            class153.field2127 = new class170[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class153.field2127[var6] = new class328(var4[var6]);
            }
        } else {
            class153.field2127 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class77.field1089.length; var11++) {
            class77.field1089[var11].method1236(var8 + var10, var7 - -var10, var9 + var10);
        }
        if (class67.field908) {
            class148.field2056 = new class170[class77.field1089.length];
            for (int var12 = 0; var12 < class77.field1089.length; var12++) {
                class148.field2056[var12] = new class328(class77.field1089[var12]);
            }
        } else {
            class148.field2056 = class77.field1089;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILom;[Lac;IIILom;IZIB)Lq;", line = 251)
    public final class345 method430(int arg0, class125 arg1, class108[] arg2, int arg3, int arg4, int arg5, class125 arg6, int arg7, boolean arg8, int arg9, byte arg10) {
        field830++;
        if (this.field849 != -1) {
            return class327.method2285(this.field849, true).method1255(arg0, arg7, false, arg2, arg3, arg1, arg6, arg5, arg9, arg4);
        }
        int[] var12 = this.field844;
        long var13 = this.field835;
        if (arg1 != null && (arg1.field1691 >= 0 || arg1.field1688 >= 0)) {
            var12 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var12[var15] = this.field844[var15];
            }
            if (arg1.field1691 >= 0) {
                if (arg1.field1691 == 65535) {
                    var12[5] = 0;
                    var13 ^= 0xFFFFFFFF00000000L;
                } else {
                    var12[5] = class190.method1334(1073741824, arg1.field1691);
                    var13 ^= (long) var12[5] << 32;
                }
            }
            if (arg1.field1688 >= 0) {
                if (arg1.field1688 == 65535) {
                    var12[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var12[3] = class190.method1334(arg1.field1688, 1073741824);
                    var13 ^= (long) var12[3];
                }
            }
        }
        class345 var16 = (class345) class327.field4938.method716(var13, false);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var12[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class314.method2146(true, var19 & 0x3FFFFFFF).method608(0)) {
                        var17 = true;
                    }
                } else if (!class115.method854((byte) -68, var19 & 0x3FFFFFFF).method1395(this.field825, 50)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field833 != -1L) {
                    var16 = (class345) class327.field4938.method716(this.field833, false);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class308[] var20 = new class308[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var12[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class308 var23 = class115.method854((byte) -82, var22 & 0x3FFFFFFF).method1409(this.field825, -76);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class308 var24 = class314.method2146(true, var22 & 0x3FFFFFFF).method601((byte) 107);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    }
                }
                class194 var25 = null;
                if (this.field842 != -1) {
                    var25 = class234.method1616(14, this.field842);
                }
                if (var25 != null && var25.field2697 != null) {
                    for (int var26 = 0; var26 < var25.field2697.length; var26++) {
                        if (var25.field2697[var26] != null && var20[var26] != null) {
                            int var27 = var25.field2697[var26][2];
                            int var28 = var25.field2697[var26][0];
                            int var29 = var25.field2697[var26][1];
                            int var30 = var25.field2697[var26][5];
                            int var31 = var25.field2697[var26][3];
                            int var32 = var25.field2697[var26][4];
                            if (this.field847 == null) {
                                this.field847 = new int[var25.field2697.length][];
                            }
                            if (this.field847[var26] == null) {
                                int[] var33 = this.field847[var26] = new int[15];
                                if (var31 == 0 && var32 == 0 && var30 == 0) {
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[12] = -var28;
                                    var33[13] = -var29;
                                    var33[14] = -var27;
                                } else {
                                    int var34 = class184.field2532[var31] >> 1;
                                    int var35 = class184.field2538[var31] >> 1;
                                    int var36 = class184.field2532[var32] >> 1;
                                    int var37 = class184.field2538[var32] >> 1;
                                    int var38 = class184.field2532[var30] >> 1;
                                    int var39 = class184.field2538[var30] >> 1;
                                    var33[8] = var34 * var36 + 16384 >> 15;
                                    var33[4] = var34 * var38 + 16384 >> 15;
                                    var33[5] = -var35;
                                    var33[3] = var34 * var39 + 16384 >> 15;
                                    int var40 = var35 * var38 + 16384 >> 15;
                                    var33[1] = -var39 * var36 + var37 * var40 + 16384 >> 15;
                                    var33[2] = var34 * var37 + 16384 >> 15;
                                    int var41 = var35 * var39 + 16384 >> 15;
                                    var33[0] = var36 * var38 + var37 * var41 + 16384 >> 15;
                                    var33[7] = var36 * var40 + (-var37 * -var39 + 16384) >> 15;
                                    var33[6] = -var37 * var38 + var36 * var41 + 16384 >> 15;
                                    var33[13] = var33[7] * -var27 + var33[4] * -var29 + var33[1] * -var28 + 16384 >> 15;
                                    var33[12] = var33[3] * -var29 + var33[0] * -var28 + var33[6] * -var27 + 16384 >> 15;
                                    var33[14] = var33[2] * -var28 + (var33[5] * -var29 + (var33[8] * -var27)) + 16384 >> 15;
                                }
                                var33[10] = var29;
                                var33[9] = var28;
                                var33[11] = var27;
                            }
                            if (var31 != 0 || var32 != 0 || var30 != 0) {
                                var20[var26].method2110(var31, var32, var30);
                            }
                            if (var28 != 0 || var29 != 0 || var27 != 0) {
                                var20[var26].method2108(var28, var29, var27);
                            }
                        }
                    }
                }
                class308 var42 = new class308(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class194.field2694[var43].length > this.field846[var43]) {
                        var42.method2095(class251.field3604[var43], class194.field2694[var43][this.field846[var43]]);
                    }
                    if (this.field846[var43] < class166.field2271[var43].length) {
                        var42.method2095(class332.field4997[var43], class166.field2271[var43][this.field846[var43]]);
                    }
                }
                var16 = var42.method2097(64, 850, -30, -50, -30);
                if (class67.field908) {
                    ((class267) var16).method1817(false, false, true, true, false, false, true);
                }
                if (arg8) {
                    class327.field4938.method721(var13, var16, 0);
                    this.field833 = var13;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg2 == null ? 0 : arg2.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg2[var49] != null) {
                class125 var50 = class52.method361(true, arg2[var49].field1465);
                if (var50.field1707 != null) {
                    class296.field4386[var49] = var50;
                    var46 = true;
                    int var51 = arg2[var49].field1457;
                    int var52 = arg2[var49].field1454;
                    int var53 = var50.field1707[var51];
                    class108.field1455[var49] = class168.method1189(1, var53 >>> 16);
                    int var54 = var53 & 0xFFFF;
                    class70.field950[var49] = var54;
                    if (class108.field1455[var49] != null) {
                        var45 |= class108.field1455[var49].method357(-1, var54);
                        var44 |= class108.field1455[var49].method359(var54, -12124);
                        var48 |= var50.field1713;
                    }
                    if ((var50.field1685 || class101.field1396) && var52 != -1 && var52 < var50.field1707.length) {
                        class262.field3850[var49] = var50.field1706[var51];
                        class314.field4741[var49] = arg2[var49].field1456;
                        int var55 = var50.field1707[var52];
                        class159.field2181[var49] = class168.method1189(1, var55 >>> 16);
                        int var56 = var55 & 0xFFFF;
                        class20.field264[var49] = var56;
                        if (class159.field2181[var49] != null) {
                            var45 |= class159.field2181[var49].method357(-1, var56);
                            var44 |= class159.field2181[var49].method359(var56, -12124);
                        }
                    } else {
                        class262.field3850[var49] = 0;
                        class314.field4741[var49] = 0;
                        class159.field2181[var49] = null;
                        class20.field264[var49] = -1;
                    }
                }
            }
        }
        if (!var46 && arg1 == null && arg6 == null) {
            return var16;
        }
        int var57 = -1;
        class52 var58 = null;
        int var59 = 0;
        class52 var60 = null;
        int var61 = -1;
        if (arg1 != null) {
            int var62 = arg1.field1707[arg9];
            int var63 = var62 >>> 16;
            var60 = class168.method1189(1, var63);
            var61 = var62 & 0xFFFF;
            if (var60 != null) {
                var45 |= var60.method357(-1, var61);
                var44 |= var60.method359(var61, -12124);
                var48 |= arg1.field1713;
            }
            if ((arg1.field1685 || class101.field1396) && arg4 != -1 && arg1.field1707.length > arg4) {
                var59 = arg1.field1706[arg9];
                int var64 = arg1.field1707[arg4];
                int var65 = var64 >>> 16;
                var57 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var58 = var60;
                } else {
                    var58 = class168.method1189(1, var57 >>> 16);
                }
                if (var58 != null) {
                    var45 |= var58.method357(-1, var57);
                    var44 |= var58.method359(var57, -12124);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        class52 var69 = null;
        class52 var70 = null;
        if (arg6 != null) {
            int var71 = arg6.field1707[arg5];
            int var72 = var71 >>> 16;
            var66 = var71 & 0xFFFF;
            var69 = class168.method1189(1, var72);
            if (var69 != null) {
                var45 |= var69.method357(-1, var66);
                var44 |= var69.method359(var66, -12124);
                var48 |= arg6.field1713;
            }
            if ((arg6.field1685 || class101.field1396) && arg3 != -1 && arg6.field1707.length > arg3) {
                var68 = arg6.field1706[arg5];
                int var73 = arg6.field1707[arg3];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var70 = var69;
                } else {
                    var70 = class168.method1189(1, var67 >>> 16);
                }
                if (var70 != null) {
                    var45 |= var70.method357(-1, var67);
                    var44 |= var70.method359(var67, -12124);
                }
            }
        }
        class345 var75 = var16.method338(!var44, !var45, !var48);
        int var76 = 0;
        int var77 = 1;
        while (var76 < var47) {
            if (class108.field1455[var76] != null) {
                var75.method2387(class108.field1455[var76], class70.field950[var76], class159.field2181[var76], class20.field264[var76], class314.field4741[var76] - 1, class262.field3850[var76], var77, class296.field4386[var76].field1713, this.field847[var76]);
            }
            var77 <<= 0x1;
            var76++;
        }
        if (var60 != null && var69 != null) {
            var75.method2385(var60, var61, var58, var57, arg0 - 1, var59, var69, var66, var70, var67, arg7 - 1, var68, arg1.field1704, arg6.field1713 | arg1.field1713);
        } else if (var60 != null) {
            var75.method2383(var60, var61, var58, var57, arg0 - 1, var59, arg1.field1713);
        } else if (var69 != null) {
            var75.method2383(var69, var66, var70, var67, arg7 - 1, var68, arg6.field1713);
        }
        int var78 = 0;
        if (arg10 <= 40) {
            return (class345) null;
        }
        while (var47 > var78) {
            class108.field1455[var78] = null;
            class159.field2181[var78] = null;
            class296.field4386[var78] = null;
            var78++;
        }
        return var75;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBLom;IIII)Lq;", line = 732)
    public final class345 method431(int arg0, int arg1, byte arg2, class125 arg3, int arg4, int arg5, int arg6, int arg7) {
        field831++;
        long var9 = (long) arg7 << 32 | (long) (arg4 << 16) | (long) arg1;
        class345 var11 = (class345) class289.field4294.method716(var9, false);
        if (var11 == null) {
            class308[] var12 = new class308[3];
            int var13 = 0;
            if (!class314.method2146(true, arg1).method606((byte) 4) || !class314.method2146(true, arg4).method606((byte) 4) || !class314.method2146(true, arg7).method606((byte) 4)) {
                return null;
            }
            class308 var14 = class314.method2146(true, arg1).method604(true);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class308 var15 = class314.method2146(true, arg4).method604(true);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class308 var16 = class314.method2146(true, arg7).method604(true);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class308 var17 = new class308(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field846[var18] < class194.field2694[var18].length) {
                    var17.method2095(class251.field3604[var18], class194.field2694[var18][this.field846[var18]]);
                }
                if (this.field846[var18] < class166.field2271[var18].length) {
                    var17.method2095(class332.field4997[var18], class166.field2271[var18][this.field846[var18]]);
                }
            }
            var11 = var17.method2097(64, 768, -50, -10, -50);
            class289.field4294.method721(var9, var11, 0);
        }
        if (arg2 != -101) {
            this.field842 = 19;
        }
        if (arg3 != null) {
            var11 = arg3.method899(arg5, true, arg6, arg0, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I", line = 800)
    public final int method432(int arg0) {
        if (arg0 > -20) {
            field826 = -55;
        }
        field848++;
        return this.field849 == -1 ? (this.field846[4] << 20) + (this.field846[0] << 25) + ((this.field844[0] << 15) - (-(this.field844[8] << 10) - (this.field844[11] << 5))) + this.field844[1] : 305419896 - -class327.method2285(this.field849, true).field2488;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V", line = 815)
    public final void method433(int arg0, int arg1, int arg2) {
        if (arg1 != 11618) {
            return;
        }
        field839++;
        int var4 = class162.field2237[arg2];
        if (this.field844[var4] != 0 && class314.method2146(true, arg0) != null) {
            this.field844[var4] = class190.method1334(Integer.MIN_VALUE, arg0);
            this.method425((byte) -45);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIB)I", line = 842)
    public static final int method434(int arg0, int arg1, int arg2, byte arg3) {
        field832++;
        if (arg1 == arg2) {
            return arg1;
        }
        if (arg3 != 71) {
            field836 = 121;
        }
        int var4 = 128 - arg0;
        int var5 = ((arg1 & 0xFF00FF00) >>> 7) * var4 + ((arg2 & 0xFF00FF00) >>> 7) * arg0 & 0xFF00FF00;
        int var6 = (arg1 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg0 & 0xFF00FF00;
        return (var6 >> 7) + var5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILom;II)Lq;", line = 864)
    public final class345 method435(int arg0, int arg1, class125 arg2, int arg3, int arg4) {
        if (arg3 <= 92) {
            this.method435(73, -114, (class125) null, -47, 65);
        }
        field828++;
        if (this.field849 != -1) {
            return class327.method2285(this.field849, true).method1264((byte) -79, arg2, arg0, arg1, arg4);
        }
        class345 var6 = (class345) class289.field4294.method716(this.field835, false);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field844[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var9) != 0 && !class314.method2146(true, var9 & 0x3FFFFFFF).method606((byte) 4)) {
                        var7 = true;
                    }
                } else if (!class115.method854((byte) 96, var9 & 0x3FFFFFFF).method1396(false, this.field825)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class308[] var10 = new class308[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field844[var12];
                if ((var13 & 0x40000000) != 0) {
                    class308 var14 = class115.method854((byte) 30, var13 & 0x3FFFFFFF).method1406(-26702, this.field825);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class308 var15 = class314.method2146(true, var13 & 0x3FFFFFFF).method604(true);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                }
            }
            class308 var16 = new class308(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class194.field2694[var17].length > this.field846[var17]) {
                    var16.method2095(class251.field3604[var17], class194.field2694[var17][this.field846[var17]]);
                }
                if (this.field846[var17] < class166.field2271[var17].length) {
                    var16.method2095(class332.field4997[var17], class166.field2271[var17][this.field846[var17]]);
                }
            }
            var6 = var16.method2097(64, 768, -50, -10, -50);
            class289.field4294.method721(this.field835, var6, 0);
        }
        if (arg2 != null) {
            var6 = arg2.method899(arg4, true, arg1, arg0, var6);
        }
        return var6;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[I[IIZ)V", line = 984)
    public final void method436(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, boolean arg5) {
        if (arg1 != 3610) {
            method429(10, (class133) null);
        }
        if (this.field842 != arg4) {
            this.field842 = arg4;
            this.field847 = (int[][]) null;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class239.field3390; var8++) {
                    class78 var9 = class314.method2146(true, var8);
                    if (var9 != null && !var9.field1123 && (arg5 ? class22.field284[var7] : class142.field1939[var7]) == var9.field1129) {
                        arg3[class162.field2237[var7]] = class190.method1334(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field846 = arg2;
        this.field849 = arg0;
        this.field825 = arg5;
        field829++;
        this.field844 = arg3;
        this.method425((byte) -26);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;JIIIZLjava/lang/String;ZBI)V", line = 1035)
    public static final void method437(boolean arg0, String arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6, String arg7, boolean arg8, byte arg9, int arg10) {
        field845++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class316 var14 = new class316(128);
        var14.method2184((byte) 89, 10);
        var14.method2189(-1, (arg0 ? 4 : 0) | (arg8 ? 1 : 0) | (arg6 ? 2 : 0));
        var14.method2202(arg2, arg9 - 194);
        var14.method2188(arg9 + 173, var12[0]);
        var14.method2157((byte) -39, arg7);
        var14.method2188(255, var12[1]);
        var14.method2189(arg9 ^ 0xFFFFFFAD, class169.field2297);
        var14.method2184((byte) 89, arg10);
        var14.method2184((byte) 89, arg3);
        var14.method2188(arg9 ^ 0xAD, var12[2]);
        var14.method2189(arg9 ^ 0xFFFFFFAD, arg5);
        var14.method2189(-1, arg4);
        var14.method2188(arg9 + 173, var12[3]);
        var14.method2216(class338.field5079, true, class39.field436);
        class316 var15 = new class316(350);
        var15.method2157((byte) -20, arg1);
        int var16 = 8 - class312.method2139(arg9 - 173, arg1) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2184((byte) 89, (int) (Math.random() * 255.0D));
        }
        var15.method2154(var12, (byte) 31);
        class90.field1264.field4777 = 0;
        class90.field1264.method2184((byte) 89, 22);
        class90.field1264.method2189(-1, var14.field4777 + var15.field4777 + 2);
        class90.field1264.method2189(-1, 541);
        class90.field1264.method2218(67, 0, var14.field4777, var14.field4798);
        class90.field1264.method2218(55, 0, var15.field4777, var15.field4798);
        class174.field2375 = 0;
        class275.field4128 = 1;
        class243.field3485 = -3;
        if (arg9 != 82) {
            method434(98, -46, -36, (byte) 93);
        }
        class63.field817 = 0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V", line = 1094)
    public final void method438(int arg0, int arg1, int arg2) {
        this.field846[arg2] = arg0;
        field834++;
        this.method425((byte) -115);
        int var4 = 45 % ((-arg1 - 26) / 34);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V", line = 1114)
    public final void method439(boolean arg0, int arg1) {
        this.field825 = arg0;
        this.method425((byte) -95);
        if (arg1 != 0) {
            field836 = 85;
        }
        field843++;
    }
}
