import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class295 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field4546 = 0;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lmn;")
    public static class161 field4547 = null;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    private int field4554;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "J")
    private long field4542;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "J")
    private long field4545;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Z")
    public boolean field4553;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
    public int[] field4550;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
    private int[] field4562;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "[[I")
    private int[][] field4555;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([IZI[IBI)V", line = 4)
    public final void method2036(int[] arg0, boolean arg1, int arg2, int[] arg3, byte arg4, int arg5) {
        field4563++;
        if (this.field4554 != arg5) {
            this.field4554 = arg5;
            this.field4555 = (int[][]) null;
        }
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class47.field656; var8++) {
                    class129 var9 = class215.method1543(var8, 105);
                    if (var9 != null && !var9.field1952 && (arg1 ? class178.field2834[var7] : class265.field4134[var7]) == var9.field1967) {
                        arg0[class312.field4838[var7]] = class261.method1835(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4552 = arg2;
        this.field4550 = arg3;
        this.field4553 = arg1;
        this.field4562 = arg0;
        int var10 = -30 / ((42 - arg4) / 52);
        this.method2043((byte) 123);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILbd;Lbd;I[Ljh;IIIIIZ)Lr;", line = 57)
    public final class74 method2037(int arg0, class28 arg1, class28 arg2, int arg3, class69[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field4564++;
        if (this.field4552 != -1) {
            return class242.method1676(this.field4552, 64).method2318(arg2, arg6, arg1, arg5 ^ 0xFAC1EFC2, arg9, arg8, arg3, arg7, arg4, arg0);
        }
        long var12 = this.field4542;
        int[] var14 = this.field4562;
        if (arg1 != null && (arg1.field318 >= 0 || arg1.field343 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field4562[var15];
            }
            if (arg1.field318 >= 0) {
                if (arg1.field318 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class261.method1835(arg1.field318, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg1.field343 >= 0) {
                if (arg1.field343 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class261.method1835(1073741824, arg1.field343);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class74 var16 = (class74) class4.field45.method747(var12, (byte) 100);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class215.method1543(var19 & 0x3FFFFFFF, 96).method992(-27106)) {
                        var17 = true;
                    }
                } else if (!class222.method1576(var19 & 0x3FFFFFFF, (byte) 92).method819(112, this.field4553)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field4545 != -1L) {
                    var16 = (class74) class4.field45.method747(this.field4545, (byte) 92);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class128[] var20 = new class128[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class128 var24 = class222.method1576(var22 & 0x3FFFFFFF, (byte) 92).method818(this.field4553, 0);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((Integer.MIN_VALUE & var22) != 0) {
                        class128 var23 = class215.method1543(var22 & 0x3FFFFFFF, 94).method984(-13746);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class258 var25 = null;
                if (this.field4554 != -1) {
                    var25 = class32.method259(this.field4554, false);
                }
                if (var25 != null && var25.field3978 != null) {
                    for (int var26 = 0; var26 < var25.field3978.length; var26++) {
                        if (var25.field3978[var26] != null && var20[var26] != null) {
                            int var27 = var25.field3978[var26][0];
                            int var28 = var25.field3978[var26][2];
                            int var29 = var25.field3978[var26][3];
                            int var30 = var25.field3978[var26][5];
                            int var31 = var25.field3978[var26][4];
                            int var32 = var25.field3978[var26][1];
                            if (this.field4555 == null) {
                                this.field4555 = new int[var25.field3978.length][];
                            }
                            if (this.field4555[var26] == null) {
                                int[] var33 = this.field4555[var26] = new int[15];
                                if (var29 == 0 && var31 == 0 && var30 == 0) {
                                    var33[13] = -var32;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[14] = -var28;
                                    var33[12] = -var27;
                                } else {
                                    int var34 = class164.field2664[var29] >> 1;
                                    int var35 = class164.field2650[var29] >> 1;
                                    int var36 = class164.field2664[var31] >> 1;
                                    int var37 = class164.field2650[var31] >> 1;
                                    int var38 = class164.field2664[var30] >> 1;
                                    int var39 = class164.field2650[var30] >> 1;
                                    var33[2] = var34 * var37 + 16384 >> 15;
                                    int var40 = var35 * var38 + 16384 >> 15;
                                    var33[7] = var36 * var40 + -var37 * -var39 + 16384 >> 15;
                                    var33[5] = -var35;
                                    var33[4] = var34 * var38 + 16384 >> 15;
                                    int var41 = var35 * var39 + 16384 >> 15;
                                    var33[8] = var34 * var36 + 16384 >> 15;
                                    var33[0] = var36 * var38 + var37 * var41 + 16384 >> 15;
                                    var33[1] = -var39 * var36 + var37 * var40 + 16384 >> 15;
                                    var33[6] = -var37 * var38 - (-(var36 * var41) - 16384) >> 15;
                                    var33[13] = var33[1] * -var27 + var33[4] * -var32 - (-(var33[7] * -var28) - 16384) >> 15;
                                    var33[3] = var34 * var39 + 16384 >> 15;
                                    var33[12] = var33[6] * -var28 + var33[3] * -var32 + var33[0] * -var27 + 16384 >> 15;
                                    var33[14] = var33[2] * -var27 + 16384 - (-(var33[5] * -var32) - (var33[8] * -var28)) >> 15;
                                }
                                var33[11] = var28;
                                var33[9] = var27;
                                var33[10] = var32;
                            }
                            if (var29 != 0 || var31 != 0 || var30 != 0) {
                                var20[var26].method981(var29, var31, var30);
                            }
                            if (var27 != 0 || var32 != 0 || var28 != 0) {
                                var20[var26].method973(var27, var32, var28);
                            }
                        }
                    }
                }
                class128 var42 = new class128(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class122.field1870[var43].length > this.field4550[var43]) {
                        var42.method978(class230.field3501[var43], class122.field1870[var43][this.field4550[var43]]);
                    }
                    if (this.field4550[var43] < class207.field3168[var43].length) {
                        var42.method978(class202.field3107[var43], class207.field3168[var43][this.field4550[var43]]);
                    }
                }
                var16 = var42.method967(64, 850, -30, -50, -30);
                if (class73.field1058) {
                    ((class140) var16).method1057(false, false, true, true, false, false, true);
                }
                if (arg10) {
                    class4.field45.method744(var16, -15692, var12);
                    this.field4545 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg4 == null ? 0 : arg4.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg4[var49] != null) {
                class28 var50 = client.method1010(arg4[var49].field978, (byte) 126);
                if (var50.field312 != null) {
                    var44 = true;
                    class79.field1149[var49] = var50;
                    int var51 = arg4[var49].field988;
                    int var52 = arg4[var49].field992;
                    int var53 = var50.field312[var52];
                    class267.field4158[var49] = class110.method839(var53 >>> 16, -121);
                    int var54 = var53 & 0xFFFF;
                    class232.field3532[var49] = var54;
                    if (class267.field4158[var49] != null) {
                        var45 |= class267.field4158[var49].method90(var54, 122);
                        var48 |= class267.field4158[var49].method93(var54, (byte) -117);
                        var46 |= var50.field331;
                    }
                    if ((var50.field326 || class231.field3527) && var51 != -1 && var50.field312.length > var51) {
                        class7.field113[var49] = var50.field328[var52];
                        class318.field4912[var49] = arg4[var49].field981;
                        int var55 = var50.field312[var51];
                        class234.field3564[var49] = class110.method839(var55 >>> 16, -104);
                        int var56 = var55 & 0xFFFF;
                        class34.field490[var49] = var56;
                        if (class234.field3564[var49] != null) {
                            var45 |= class234.field3564[var49].method90(var56, 120);
                            var48 |= class234.field3564[var49].method93(var56, (byte) -122);
                        }
                    } else {
                        class7.field113[var49] = 0;
                        class318.field4912[var49] = 0;
                        class234.field3564[var49] = null;
                        class34.field490[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg1 == null && arg2 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = -1;
        int var59 = 0;
        class10 var60 = null;
        class10 var61 = null;
        if (arg1 != null) {
            int var62 = arg1.field312[arg3];
            int var63 = var62 >>> 16;
            var57 = var62 & 0xFFFF;
            var60 = class110.method839(var63, -109);
            if (var60 != null) {
                var45 |= var60.method90(var57, 109);
                var48 |= var60.method93(var57, (byte) 94);
                var46 |= arg1.field331;
            }
            if ((arg1.field326 || class231.field3527) && arg9 != -1 && arg1.field312.length > arg9) {
                int var64 = arg1.field312[arg9];
                int var65 = var64 >>> 16;
                var58 = var64 & 0xFFFF;
                var59 = arg1.field328[arg3];
                if (var63 == var65) {
                    var61 = var60;
                } else {
                    var61 = class110.method839(var58 >>> 16, arg5 ^ 0x53E781C);
                }
                if (var61 != null) {
                    var45 |= var61.method90(var58, 107);
                    var48 |= var61.method93(var58, (byte) -125);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        class10 var69 = null;
        class10 var70 = null;
        if (arg2 != null) {
            int var71 = arg2.field312[arg8];
            int var72 = var71 >>> 16;
            var70 = class110.method839(var72, -94);
            var67 = var71 & 0xFFFF;
            if (var70 != null) {
                var45 |= var70.method90(var67, 115);
                var48 |= var70.method93(var67, (byte) -125);
                var46 |= arg2.field331;
            }
            if ((arg2.field326 || class231.field3527) && arg0 != -1 && arg2.field312.length > arg0) {
                int var73 = arg2.field312[arg0];
                int var74 = var73 >>> 16;
                var68 = arg2.field328[arg8];
                var66 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var69 = var70;
                } else {
                    var69 = class110.method839(var66 >>> 16, -98);
                }
                if (var69 != null) {
                    var45 |= var69.method90(var66, arg5 + 87980243);
                    var48 |= var69.method93(var66, (byte) -118);
                }
            }
        }
        class74 var75 = var16.method586(!var48, !var45, !var46);
        int var76 = 0;
        int var77 = 1;
        while (var47 > var76) {
            if (class267.field4158[var76] != null) {
                var75.method569(class267.field4158[var76], class232.field3532[var76], class234.field3564[var76], class34.field490[var76], class318.field4912[var76] - 1, class7.field113[var76], var77, class79.field1149[var76].field331, this.field4555[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var60 != null && var70 != null) {
            var75.method560(var60, var57, var61, var58, arg7 - 1, var59, var70, var67, var69, var66, arg6 - 1, var68, arg1.field341, arg1.field331 | arg2.field331);
        } else if (var60 != null) {
            var75.method584(var60, var57, var61, var58, arg7 - 1, var59, arg1.field331);
        } else if (var70 != null) {
            var75.method584(var70, var67, var69, var66, arg6 - 1, var68, arg2.field331);
        }
        for (int var78 = 0; var78 < var47; var78++) {
            class267.field4158[var78] = null;
            class234.field3564[var78] = null;
            class79.field1149[var78] = null;
        }
        if (arg5 != -87980144) {
            this.field4553 = true;
        }
        return var75;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 526)
    public static final void method2038(int arg0) {
        field4548++;
        class302.field4627.method750((byte) 92);
        if (arg0 != 14) {
            field4557 = -44;
        }
        class129.field1969.method750((byte) 83);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIIZI[Lmn;)V", line = 540)
    public static final void method2039(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, class161[] arg5) {
        int var6 = 0;
        if (arg3) {
            field4546 = 104;
        }
        while (var6 < arg5.length) {
            class161 var7 = arg5[var6];
            if (var7 != null && var7.field2566 == arg2) {
                class144.method1096(-27744, arg0, var7, arg4, arg1);
                class269.method1881(var7, arg1, false, arg4);
                if (var7.field2441 - var7.field2490 < var7.field2546) {
                    var7.field2546 = var7.field2441 - var7.field2490;
                }
                if (var7.field2546 < 0) {
                    var7.field2546 = 0;
                }
                if ((var7.field2623 - var7.field2619) < var7.field2573) {
                    var7.field2573 = var7.field2623 - var7.field2619;
                }
                if (var7.field2573 < 0) {
                    var7.field2573 = 0;
                }
                if (var7.field2590 == 0) {
                    class255.method1793((byte) -108, var7, arg0);
                }
            }
            var6++;
        }
        field4551++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V", line = 584)
    public final void method2040(int arg0, boolean arg1) {
        this.field4553 = arg1;
        field4556++;
        this.method2043((byte) 99);
        if (arg0 != 2) {
            method2042(49);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V", line = 598)
    public final void method2041(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.method2048((class28) null, true, 1, 57, 30);
        }
        field4561++;
        int var4 = class312.field4838[arg0];
        if (this.field4562[var4] != 0 && class215.method1543(arg2, -87) != null) {
            this.field4562[var4] = class261.method1835(Integer.MIN_VALUE, arg2);
            this.method2043((byte) 111);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 628)
    public static final void method2042(int arg0) {
        if (class307.field4786 < 128.0F) {
            class307.field4786 = 128.0F;
        }
        if (class307.field4786 > 383.0F) {
            class307.field4786 = 383.0F;
        }
        field4559++;
        while (class243.field3695 >= 2048.0F) {
            class243.field3695 -= 2048.0F;
        }
        if (arg0 != 8) {
            field4546 = -82;
        }
        int var1 = class198.field3034 >> 7;
        int var2 = class87.field1242 >> 7;
        while (class243.field3695 < 0.0F) {
            class243.field3695 += 2048.0F;
        }
        int var3 = class328.method2291(class265.field4112, class87.field1242, class198.field3034, arg0 ^ 0x65);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class265.field4112;
                    if (var7 < 3 && (class324.field5005[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - (class203.field3111[var7][var5][var6] - ((class78.field1142[var7][var5][var6] & 0xFF) * 8));
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class15.field200) {
            class15.field200 += (var9 - class15.field200) / 24;
        } else if (class15.field200 > var9) {
            class15.field200 += (var9 - class15.field200) / 80;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 710)
    private final void method2043(byte arg0) {
        field4549++;
        long var2 = this.field4542;
        long[] var4 = class332.field5178;
        this.field4542 = -1L;
        this.field4542 = this.field4542 >>> 8 ^ var4[(int) ((this.field4542 ^ (long) (this.field4554 >> 8)) & 0xFFL)];
        this.field4542 = this.field4542 >>> 8 ^ var4[(int) (((long) this.field4554 ^ this.field4542) & 0xFFL)];
        if (arg0 < 97) {
            method2039(false, 0, -79, true, 116, (class161[]) null);
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4542 = this.field4542 >>> 8 ^ var4[(int) ((this.field4542 ^ (long) (this.field4562[var5] >> 24)) & 0xFFL)];
            this.field4542 = var4[(int) ((this.field4542 ^ (long) (this.field4562[var5] >> 16)) & 0xFFL)] ^ this.field4542 >>> 8;
            this.field4542 = this.field4542 >>> 8 ^ var4[(int) ((this.field4542 ^ (long) (this.field4562[var5] >> 8)) & 0xFFL)];
            this.field4542 = var4[(int) (((long) this.field4562[var5] ^ this.field4542) & 0xFFL)] ^ this.field4542 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4542 = var4[(int) ((this.field4542 ^ (long) this.field4550[var6]) & 0xFFL)] ^ this.field4542 >>> 8;
        }
        this.field4542 = var4[(int) (((long) (this.field4553 ? 1 : 0) ^ this.field4542) & 0xFFL)] ^ this.field4542 >>> 8;
        if (var2 != 0L && this.field4542 != var2) {
            class4.field45.method749(0, var2);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BILbd;IIIII)Lr;", line = 754)
    public final class74 method2044(byte arg0, int arg1, class28 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var9 = (long) arg1 | (long) (arg6 << 16) | (long) arg3 << 32;
        field4544++;
        class74 var11 = (class74) class95.field1353.method747(var9, (byte) 105);
        if (var11 == null) {
            class128[] var12 = new class128[3];
            int var13 = 0;
            if (!class215.method1543(arg1, -64).method993((byte) -37) || !class215.method1543(arg6, -58).method993((byte) 10) || !class215.method1543(arg3, 85).method993((byte) -125)) {
                return null;
            }
            class128 var14 = class215.method1543(arg1, -30).method983((byte) -108);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class128 var15 = class215.method1543(arg6, arg0 ^ 0x14).method983((byte) -109);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class128 var16 = class215.method1543(arg3, 122).method983((byte) -117);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class128 var17 = new class128(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4550[var18] < class122.field1870[var18].length) {
                    var17.method978(class230.field3501[var18], class122.field1870[var18][this.field4550[var18]]);
                }
                if (class207.field3168[var18].length > this.field4550[var18]) {
                    var17.method978(class202.field3107[var18], class207.field3168[var18][this.field4550[var18]]);
                }
            }
            var11 = var17.method967(64, 768, -50, -10, -50);
            class95.field1353.method744(var11, -15692, var9);
        }
        if (arg0 != 102) {
            this.field4552 = 65;
        }
        if (arg2 != null) {
            var11 = arg2.method218(arg7, var11, 65535, arg5, arg4);
        }
        return var11;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I", line = 832)
    public final int method2045(boolean arg0) {
        field4558++;
        if (arg0) {
            return -24;
        } else if (this.field4552 == -1) {
            return (this.field4550[4] << 20) + (this.field4550[0] << 25) + (this.field4562[8] << 10) + (this.field4562[0] << 15) - (-(this.field4562[11] << 5) + -this.field4562[1]);
        } else {
            return class242.method1676(this.field4552, 64).field5147 + 305419896;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZI)V", line = 849)
    public final void method2046(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method2043((byte) 61);
        }
        this.field4550[arg2] = arg0;
        field4543++;
        this.method2043((byte) 114);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V", line = 864)
    public static void method2047(byte arg0) {
        field4547 = null;
        if (arg0 < 13) {
            method2042(116);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lbd;ZIII)Lr;", line = 874)
    public final class74 method2048(class28 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4560++;
        if (this.field4552 != -1) {
            return class242.method1676(this.field4552, 64).method2320(arg2, arg3, arg4, (byte) 107, arg0);
        } else if (arg1) {
            return (class74) null;
        } else {
            class74 var6 = (class74) class95.field1353.method747(this.field4542, (byte) 111);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var9 = this.field4562[var8];
                    if ((var9 & 0x40000000) == 0) {
                        if ((Integer.MIN_VALUE & var9) != 0 && !class215.method1543(var9 & 0x3FFFFFFF, 117).method993((byte) -63)) {
                            var7 = true;
                        }
                    } else if (!class222.method1576(var9 & 0x3FFFFFFF, (byte) 92).method816(this.field4553, -128)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                int var10 = 0;
                class128[] var11 = new class128[12];
                for (int var12 = 0; var12 < 12; var12++) {
                    int var13 = this.field4562[var12];
                    if ((var13 & 0x40000000) != 0) {
                        class128 var14 = class222.method1576(var13 & 0x3FFFFFFF, (byte) 92).method814(this.field4553, 0);
                        if (var14 != null) {
                            var11[var10++] = var14;
                        }
                    } else if ((Integer.MIN_VALUE & var13) != 0) {
                        class128 var15 = class215.method1543(var13 & 0x3FFFFFFF, 82).method983((byte) -120);
                        if (var15 != null) {
                            var11[var10++] = var15;
                        }
                    }
                }
                class128 var16 = new class128(var11, var10);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field4550[var17] < class122.field1870[var17].length) {
                        var16.method978(class230.field3501[var17], class122.field1870[var17][this.field4550[var17]]);
                    }
                    if (class207.field3168[var17].length > this.field4550[var17]) {
                        var16.method978(class202.field3107[var17], class207.field3168[var17][this.field4550[var17]]);
                    }
                }
                var6 = var16.method967(64, 768, -50, -10, -50);
                class95.field1353.method744(var6, -15692, this.field4542);
            }
            if (arg0 != null) {
                var6 = arg0.method218(arg2, var6, 65535, arg4, arg3);
            }
            return var6;
        }
    }
}
