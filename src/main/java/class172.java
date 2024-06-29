import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class172 {

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Leg;")
    public static class188 field2619 = new class188(64);

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2627 = "shake:";

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    private int field2611;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "J")
    private long field2606;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "J")
    private long field2610;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Lwf;")
    public static class306 field2609;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Z")
    public boolean field2608;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
    private int[] field2605;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[I")
    public static int[] field2613;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
    public int[] field2616;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field2626;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "[[I")
    private int[][] field2623;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIILgh;)Lg;", line = 9)
    public final class295 method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class222 arg7) {
        field2620++;
        int var9 = 44 % ((arg0 - 26) / 34);
        long var10 = (long) arg5 << 32 | (long) (arg2 << 16) | (long) arg3;
        class295 var12 = (class295) class245.field3850.method1294(var10, 118);
        if (var12 == null) {
            int var13 = 0;
            class114[] var14 = new class114[3];
            if (!class319.method2166((byte) -64, arg3).method1754(0) || !class319.method2166((byte) -64, arg2).method1754(0) || !class319.method2166((byte) -64, arg5).method1754(0)) {
                return null;
            }
            class114 var15 = class319.method2166((byte) -64, arg3).method1752(0);
            if (var15 != null) {
                var14[var13++] = var15;
            }
            class114 var16 = class319.method2166((byte) -64, arg2).method1752(0);
            if (var16 != null) {
                var14[var13++] = var16;
            }
            class114 var17 = class319.method2166((byte) -64, arg5).method1752(0);
            if (var17 != null) {
                var14[var13++] = var17;
            }
            class114 var18 = new class114(var14, var13);
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field2616[var19] < class84.field1282[var19].length) {
                    var18.method783(class204.field3085[var19], class84.field1282[var19][this.field2616[var19]]);
                }
                if (this.field2616[var19] < class210.field3338[var19].length) {
                    var18.method783(class22.field281[var19], class210.field3338[var19][this.field2616[var19]]);
                }
            }
            var12 = var18.method769(64, 768, -50, -10, -50);
            class245.field3850.method1292(var10, 69, var12);
        }
        if (arg7 != null) {
            var12 = arg7.method1497(arg4, (byte) -76, arg1, arg6, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 76)
    private final void method1162(byte arg0) {
        field2614++;
        long var2 = this.field2610;
        this.field2610 = -1L;
        long[] var4 = class159.field2476;
        this.field2610 = var4[(int) ((this.field2610 ^ (long) (this.field2611 >> 8)) & 0xFFL)] ^ this.field2610 >>> 8;
        this.field2610 = var4[(int) (((long) this.field2611 ^ this.field2610) & 0xFFL)] ^ this.field2610 >>> 8;
        if (arg0 != 114) {
            field2628 = 35;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2610 = this.field2610 >>> 8 ^ var4[(int) (((long) (this.field2605[var5] >> 24) ^ this.field2610) & 0xFFL)];
            this.field2610 = var4[(int) (((long) (this.field2605[var5] >> 16) ^ this.field2610) & 0xFFL)] ^ this.field2610 >>> 8;
            this.field2610 = this.field2610 >>> 8 ^ var4[(int) ((this.field2610 ^ (long) (this.field2605[var5] >> 8)) & 0xFFL)];
            this.field2610 = var4[(int) ((this.field2610 ^ (long) this.field2605[var5]) & 0xFFL)] ^ this.field2610 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2610 = this.field2610 >>> 8 ^ var4[(int) (((long) this.field2616[var6] ^ this.field2610) & 0xFFL)];
        }
        this.field2610 = var4[(int) ((this.field2610 ^ (long) (this.field2608 ? 1 : 0)) & 0xFFL)] ^ this.field2610 >>> 8;
        if (var2 != 0L && this.field2610 != var2) {
            class163.field2515.method1289(var2, 255);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBLgh;Lgh;II[Loi;IZ)Lg;", line = 118)
    public final class295 method1163(int arg0, int arg1, int arg2, byte arg3, class222 arg4, class222 arg5, int arg6, int arg7, class262[] arg8, int arg9, boolean arg10) {
        field2607++;
        if (this.field2612 != -1) {
            return class71.method511(this.field2612, 10).method1957((byte) 109, arg6, arg8, arg0, arg1, arg9, arg5, arg7, arg2, arg4);
        }
        long var12 = this.field2610;
        int[] var14 = this.field2605;
        if (arg4 != null && (arg4.field3524 >= 0 || arg4.field3545 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field2605[var15];
            }
            if (arg4.field3524 >= 0) {
                if (arg4.field3524 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class276.method1810(1073741824, arg4.field3524);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg4.field3545 >= 0) {
                if (arg4.field3545 == 65535) {
                    var14[3] = 0;
                    var12 ^= 0xFFFFFFFFL;
                } else {
                    var14[3] = class276.method1810(1073741824, arg4.field3545);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class295 var16 = (class295) class163.field2515.method1294(var12, 117);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class319.method2166((byte) -64, var19 & 0x3FFFFFFF).method1760(-46)) {
                        var17 = true;
                    }
                } else if (!class160.method1106(var19 & 0x3FFFFFFF, -91).method1904(this.field2608, -1)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field2606 != -1L) {
                    var16 = (class295) class163.field2515.method1294(this.field2606, 120);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class114[] var20 = new class114[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class114 var24 = class160.method1106(var22 & 0x3FFFFFFF, -74).method1895(17942, this.field2608);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((var22 & Integer.MIN_VALUE) != 0) {
                        class114 var23 = class319.method2166((byte) -64, var22 & 0x3FFFFFFF).method1755((byte) -32);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class309 var25 = null;
                if (this.field2611 != -1) {
                    var25 = class89.method616(this.field2611, -125);
                }
                if (var25 != null && var25.field4891 != null) {
                    for (int var26 = 0; var26 < var25.field4891.length; var26++) {
                        if (var25.field4891[var26] != null && var20[var26] != null) {
                            int var27 = var25.field4891[var26][1];
                            int var28 = var25.field4891[var26][0];
                            int var29 = var25.field4891[var26][2];
                            int var30 = var25.field4891[var26][4];
                            int var31 = var25.field4891[var26][3];
                            int var32 = var25.field4891[var26][5];
                            if (this.field2623 == null) {
                                this.field2623 = new int[var25.field4891.length][];
                            }
                            if (this.field2623[var26] == null) {
                                int[] var33 = this.field2623[var26] = new int[15];
                                if (var31 == 0 && var30 == 0 && var32 == 0) {
                                    var33[14] = -var29;
                                    var33[12] = -var28;
                                    var33[13] = -var27;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                } else {
                                    int var34 = class12.field121[var31] >> 1;
                                    int var35 = class12.field127[var31] >> 1;
                                    int var36 = class12.field127[var30] >> 1;
                                    int var37 = class12.field121[var30] >> 1;
                                    int var38 = class12.field127[var32] >> 1;
                                    int var39 = class12.field121[var32] >> 1;
                                    var33[5] = -var34;
                                    var33[4] = var35 * var38 + 16384 >> 15;
                                    int var40 = var34 * var38 + 16384 >> 15;
                                    var33[8] = var35 * var36 + 16384 >> 15;
                                    var33[2] = var35 * var37 + 16384 >> 15;
                                    var33[7] = -var37 * -var39 + (var36 * var40) + 16384 >> 15;
                                    int var41 = var34 * var39 + 16384 >> 15;
                                    var33[1] = var37 * var40 + (-var39 * var36 + 16384) >> 15;
                                    var33[6] = -var37 * var38 + var36 * var41 + 16384 >> 15;
                                    var33[14] = var33[8] * -var29 + var33[5] * -var27 + var33[2] * -var28 + 16384 >> 15;
                                    var33[13] = var33[1] * -var28 + var33[4] * -var27 + var33[7] * -var29 + 16384 >> 15;
                                    var33[3] = var35 * var39 + 16384 >> 15;
                                    var33[0] = var36 * var38 + (var37 * var41) + 16384 >> 15;
                                    var33[12] = var33[6] * -var29 + (var33[0] * -var28 + (var33[3] * -var27)) + 16384 >> 15;
                                }
                                var33[9] = var28;
                                var33[10] = var27;
                                var33[11] = var29;
                            }
                            if (var31 != 0 || var30 != 0 || var32 != 0) {
                                var20[var26].method761(var31, var30, var32);
                            }
                            if (var28 != 0 || var27 != 0 || var29 != 0) {
                                var20[var26].method789(var28, var27, var29);
                            }
                        }
                    }
                }
                class114 var42 = new class114(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class84.field1282[var43].length > this.field2616[var43]) {
                        var42.method783(class204.field3085[var43], class84.field1282[var43][this.field2616[var43]]);
                    }
                    if (class210.field3338[var43].length > this.field2616[var43]) {
                        var42.method783(class22.field281[var43], class210.field3338[var43][this.field2616[var43]]);
                    }
                }
                var16 = var42.method769(64, 850, -30, -50, -30);
                if (class333.field5166) {
                    ((class340) var16).method2379(false, false, true, true, false, false, true);
                }
                if (arg10) {
                    class163.field2515.method1292(var12, 127, var16);
                    this.field2606 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg8 == null ? 0 : arg8.length;
        int var49 = 0;
        if (arg3 >= -24) {
            field2619 = (class188) null;
        }
        while (var48 > var49) {
            if (arg8[var49] != null) {
                class222 var50 = class118.method809((byte) 113, arg8[var49].field4057);
                if (var50.field3529 != null) {
                    class294.field4525[var49] = var50;
                    int var51 = arg8[var49].field4053;
                    var44 = true;
                    int var52 = arg8[var49].field4054;
                    int var53 = var50.field3529[var52];
                    class43.field602[var49] = class96.method658(var53 >>> 16, (byte) 124);
                    int var54 = var53 & 0xFFFF;
                    class152.field2408[var49] = var54;
                    if (class43.field602[var49] != null) {
                        var47 |= class43.field602[var49].method614((byte) 90, var54);
                        var45 |= class43.field602[var49].method613((byte) 114, var54);
                        var46 |= var50.field3554;
                    }
                    if ((var50.field3538 || class129.field2024) && var51 != -1 && var51 < var50.field3529.length) {
                        class45.field639[var49] = var50.field3522[var52];
                        class37.field460[var49] = arg8[var49].field4048;
                        int var55 = var50.field3529[var51];
                        class237.field3797[var49] = class96.method658(var55 >>> 16, (byte) 126);
                        int var56 = var55 & 0xFFFF;
                        class93.field1435[var49] = var56;
                        if (class237.field3797[var49] != null) {
                            var47 |= class237.field3797[var49].method614((byte) 17, var56);
                            var45 |= class237.field3797[var49].method613((byte) 122, var56);
                        }
                    } else {
                        class45.field639[var49] = 0;
                        class37.field460[var49] = 0;
                        class237.field3797[var49] = null;
                        class93.field1435[var49] = -1;
                    }
                }
            }
            var49++;
        }
        if (!var44 && arg4 == null && arg5 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = -1;
        class89 var59 = null;
        class89 var60 = null;
        int var61 = 0;
        if (arg4 != null) {
            int var62 = arg4.field3529[arg1];
            int var63 = var62 >>> 16;
            var60 = class96.method658(var63, (byte) 113);
            var57 = var62 & 0xFFFF;
            if (var60 != null) {
                var47 |= var60.method614((byte) 32, var57);
                var45 |= var60.method613((byte) 103, var57);
                var46 |= arg4.field3554;
            }
            if ((arg4.field3538 || class129.field2024) && arg6 != -1 && arg4.field3529.length > arg6) {
                var61 = arg4.field3522[arg1];
                int var64 = arg4.field3529[arg6];
                int var65 = var64 >>> 16;
                var58 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var59 = var60;
                } else {
                    var59 = class96.method658(var58 >>> 16, (byte) 117);
                }
                if (var59 != null) {
                    var47 |= var59.method614((byte) 66, var58);
                    var45 |= var59.method613((byte) -60, var58);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        class89 var69 = null;
        class89 var70 = null;
        if (arg5 != null) {
            int var71 = arg5.field3529[arg9];
            int var72 = var71 >>> 16;
            var69 = class96.method658(var72, (byte) 124);
            var66 = var71 & 0xFFFF;
            if (var69 != null) {
                var47 |= var69.method614((byte) 17, var66);
                var45 |= var69.method613((byte) -89, var66);
                var46 |= arg5.field3554;
            }
            if ((arg5.field3538 || class129.field2024) && arg7 != -1 && arg7 < arg5.field3529.length) {
                var68 = arg5.field3522[arg9];
                int var73 = arg5.field3529[arg7];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var70 = var69;
                } else {
                    var70 = class96.method658(var67 >>> 16, (byte) 121);
                }
                if (var70 != null) {
                    var47 |= var70.method614((byte) 64, var67);
                    var45 |= var70.method613((byte) -91, var67);
                }
            }
        }
        class295 var75 = var16.method989(!var45, !var47, !var46);
        int var76 = 0;
        int var77 = 1;
        while (var48 > var76) {
            if (class43.field602[var76] != null) {
                var75.method1932(class43.field602[var76], class152.field2408[var76], class237.field3797[var76], class93.field1435[var76], class37.field460[var76] - 1, class45.field639[var76], var77, class294.field4525[var76].field3554, this.field2623[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var60 != null && var69 != null) {
            var75.method1937(var60, var57, var59, var58, arg2 - 1, var61, var69, var66, var70, var67, arg0 - 1, var68, arg4.field3533, arg5.field3554 | arg4.field3554);
        } else if (var60 != null) {
            var75.method1935(var60, var57, var59, var58, arg2 - 1, var61, arg4.field3554);
        } else if (var69 != null) {
            var75.method1935(var69, var66, var70, var67, arg0 - 1, var68, arg5.field3554);
        }
        for (int var78 = 0; var78 < var48; var78++) {
            class43.field602[var78] = null;
            class237.field3797[var78] = null;
            class294.field4525[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 604)
    public static void method1164(byte arg0) {
        int var1 = 43 / ((21 - arg0) / 51);
        field2609 = null;
        field2626 = null;
        field2619 = null;
        field2613 = null;
        field2627 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III[IZ[I)V", line = 621)
    public final void method1165(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
        if (this.field2611 != arg2) {
            this.field2623 = (int[][]) null;
            this.field2611 = arg2;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class118.field1826; var8++) {
                    class265 var9 = class319.method2166((byte) -64, var8);
                    if (var9 != null && !var9.field4091 && (arg4 ? class123.field1925[var7] : class139.field2153[var7]) == var9.field4084) {
                        arg3[class215.field3394[var7]] = class276.method1810(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        field2621++;
        this.field2608 = arg4;
        this.field2605 = arg3;
        this.field2616 = arg5;
        int var10 = 34 / ((-arg0 - 43) / 50);
        this.field2612 = arg1;
        this.method1162((byte) 114);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLgh;III)Lg;", line = 672)
    public final class295 method1166(byte arg0, class222 arg1, int arg2, int arg3, int arg4) {
        field2615++;
        if (this.field2612 != -1) {
            return class71.method511(this.field2612, arg0 + 75).method1965(arg4, arg1, arg3, true, arg2);
        }
        class295 var6 = (class295) class245.field3850.method1294(this.field2610, 116);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field2605[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((var9 & Integer.MIN_VALUE) != 0 && !class319.method2166((byte) -64, var9 & 0x3FFFFFFF).method1754(arg0 + 65)) {
                        var7 = true;
                    }
                } else if (!class160.method1106(var9 & 0x3FFFFFFF, -79).method1902(this.field2608, -98)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class114[] var10 = new class114[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field2605[var12];
                if ((var13 & 0x40000000) != 0) {
                    class114 var15 = class160.method1106(var13 & 0x3FFFFFFF, arg0 ^ 0xD).method1898((byte) 100, this.field2608);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class114 var14 = class319.method2166((byte) -64, var13 & 0x3FFFFFFF).method1752(0);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                }
            }
            class114 var16 = new class114(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class84.field1282[var17].length > this.field2616[var17]) {
                    var16.method783(class204.field3085[var17], class84.field1282[var17][this.field2616[var17]]);
                }
                if (this.field2616[var17] < class210.field3338[var17].length) {
                    var16.method783(class22.field281[var17], class210.field3338[var17][this.field2616[var17]]);
                }
            }
            var6 = var16.method769(64, 768, -50, -10, -50);
            class245.field3850.method1292(this.field2610, arg0 ^ 0x17, var6);
        }
        if (arg1 != null) {
            var6 = arg1.method1497(arg3, (byte) -41, arg4, arg2, var6);
        }
        if (arg0 != -65) {
            field2619 = (class188) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V", line = 788)
    public final void method1167(int arg0, int arg1, int arg2) {
        if (arg1 != -10) {
            this.method1170(103);
        }
        field2617++;
        int var4 = class215.field3394[arg2];
        if (this.field2605[var4] != 0 && class319.method2166((byte) -64, arg0) != null) {
            this.field2605[var4] = class276.method1810(arg0, Integer.MIN_VALUE);
            this.method1162((byte) 114);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)V", line = 808)
    public final void method1168(int arg0, boolean arg1) {
        field2622++;
        if (arg0 >= -1) {
            this.method1168(-32, true);
        }
        this.field2608 = arg1;
        this.method1162((byte) 114);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)V", line = 820)
    public final void method1169(int arg0, int arg1, int arg2) {
        this.field2616[arg2] = arg1;
        field2624++;
        this.method1162((byte) 114);
        if (arg0 != 1073741823) {
            field2628 = 120;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I", line = 836)
    public final int method1170(int arg0) {
        field2625++;
        if (arg0 == 16537) {
            return this.field2612 == -1 ? (this.field2616[0] << 25) + (this.field2605[0] << 15) + (this.field2605[11] << 5) + this.field2605[1] - (-(this.field2616[4] << 20) - (this.field2605[8] << 10)) : class71.method511(this.field2612, arg0 ^ 0x4093).field4606 + 305419896;
        } else {
            return -53;
        }
    }
}
