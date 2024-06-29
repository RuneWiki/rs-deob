import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class340 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field5464 = 1;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "J")
    private long field5462;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "J")
    private long field5473;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Lnm;")
    public static class221 field5478;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Llm;")
    public static class230 field5465;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5477;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Z")
    public boolean field5472;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "[I")
    public int[] field5482;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[I")
    private int[] field5483;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[[I")
    private int[][] field5470;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 5)
    public static void method2392(int arg0) {
        if (arg0 != -592461009) {
            field5477 = (String) null;
        }
        field5477 = null;
        field5465 = null;
        field5478 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V", line = 25)
    public final void method2393(int arg0, byte arg1, int arg2) {
        this.field5482[arg2] = arg0;
        this.method2398(255);
        field5474++;
        if (arg1 < 47) {
            method2392(-95);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V", line = 41)
    public final void method2394(boolean arg0, int arg1) {
        if (arg1 == -19090) {
            field5481++;
            this.field5472 = arg0;
            this.method2398(255);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)V", line = 58)
    public final void method2395(int arg0, int arg1, byte arg2) {
        int var4 = class31.field470[arg0];
        field5463++;
        if (this.field5483[var4] == 0 || class120.method780(3, arg1) == null) {
            return;
        }
        this.field5483[var4] = class167.method1160(Integer.MIN_VALUE, arg1);
        if (arg2 != 64) {
            this.method2398(64);
        }
        this.method2398(arg2 ^ 0xBF);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZILsb;I)Lsm;", line = 79)
    public final class128 method2396(int arg0, boolean arg1, int arg2, class131 arg3, int arg4) {
        field5480++;
        if (!arg1) {
            return (class128) null;
        } else if (this.field5476 == -1) {
            class128 var6 = (class128) class195.field2988.method652(this.field5462, false);
            if (var6 == null) {
                boolean var7 = false;
                for (int var8 = 0; var8 < 12; var8++) {
                    int var9 = this.field5483[var8];
                    if ((var9 & 0x40000000) == 0) {
                        if ((var9 & Integer.MIN_VALUE) != 0 && !class120.method780(3, var9 & 0x3FFFFFFF).method362(0)) {
                            var7 = true;
                        }
                    } else if (!class322.method2311(var9 & 0x3FFFFFFF, -113).method723((byte) -114, this.field5472)) {
                        var7 = true;
                    }
                }
                if (var7) {
                    return null;
                }
                int var10 = 0;
                class135[] var11 = new class135[12];
                for (int var12 = 0; var12 < 12; var12++) {
                    int var13 = this.field5483[var12];
                    if ((var13 & 0x40000000) != 0) {
                        class135 var15 = class322.method2311(var13 & 0x3FFFFFFF, -124).method713(true, this.field5472);
                        if (var15 != null) {
                            var11[var10++] = var15;
                        }
                    } else if ((Integer.MIN_VALUE & var13) != 0) {
                        class135 var14 = class120.method780(3, var13 & 0x3FFFFFFF).method368(!arg1);
                        if (var14 != null) {
                            var11[var10++] = var14;
                        }
                    }
                }
                class135 var16 = new class135(var11, var10);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class96.field1387[var17].length > this.field5482[var17]) {
                        var16.method904(class210.field3201[var17], class96.field1387[var17][this.field5482[var17]]);
                    }
                    if (class32.field484[var17].length > this.field5482[var17]) {
                        var16.method904(class83.field1198[var17], class32.field484[var17][this.field5482[var17]]);
                    }
                }
                var6 = var16.method906(64, 768, -50, -10, -50);
                class195.field2988.method642(var6, this.field5462, -125);
            }
            if (arg3 != null) {
                var6 = arg3.method851(arg4, var6, 127, arg2, arg0);
            }
            return var6;
        } else {
            return class38.method307(this.field5476, 0).method982(0, arg2, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lsb;IIZLsb;IZIII[Lbi;I)Lsm;", line = 204)
    public final class128 method2397(class131 arg0, int arg1, int arg2, boolean arg3, class131 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class223[] arg10, int arg11) {
        field5469++;
        if (this.field5476 != -1) {
            return class38.method307(this.field5476, 0).method971(arg4, arg11, arg0, arg2, arg5, arg10, arg7, arg9, (byte) 95, arg1);
        }
        long var13 = this.field5462;
        int[] var15 = this.field5483;
        if (arg0 != null && (arg0.field1993 >= 0 || arg0.field2014 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field5483[var16];
            }
            if (arg0.field1993 >= 0) {
                if (arg0.field1993 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class167.method1160(arg0.field1993, 1073741824);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg0.field2014 >= 0) {
                if (arg0.field2014 == 65535) {
                    var13 ^= 0xFFFFFFFFL;
                    var15[3] = 0;
                } else {
                    var15[3] = class167.method1160(1073741824, arg0.field2014);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class128 var17 = (class128) class181.field2820.method652(var13, false);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var20 = var15[var19];
                if ((var20 & 0x40000000) == 0) {
                    if ((var20 & Integer.MIN_VALUE) != 0 && !class120.method780(arg8 ^ 0x3, var20 & 0x3FFFFFFF).method364(0)) {
                        var18 = true;
                    }
                } else if (!class322.method2311(var20 & 0x3FFFFFFF, arg8 - 119).method718(-26846, this.field5472)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field5473 != -1L) {
                    var17 = (class128) class181.field2820.method652(this.field5473, false);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class135[] var21 = new class135[12];
                for (int var22 = 0; var22 < 12; var22++) {
                    int var23 = var15[var22];
                    if ((var23 & 0x40000000) != 0) {
                        class135 var25 = class322.method2311(var23 & 0x3FFFFFFF, -117).method724(this.field5472, false);
                        if (var25 != null) {
                            var21[var22] = var25;
                        }
                    } else if ((Integer.MIN_VALUE & var23) != 0) {
                        class135 var24 = class120.method780(3, var23 & 0x3FFFFFFF).method366((byte) 127);
                        if (var24 != null) {
                            var21[var22] = var24;
                        }
                    }
                }
                class118 var26 = null;
                if (this.field5466 != -1) {
                    var26 = class308.method2149(this.field5466, (byte) -127);
                }
                if (var26 != null && var26.field1722 != null) {
                    for (int var27 = 0; var27 < var26.field1722.length; var27++) {
                        if (var26.field1722[var27] != null && var21[var27] != null) {
                            int var28 = var26.field1722[var27][0];
                            int var29 = var26.field1722[var27][1];
                            int var30 = var26.field1722[var27][2];
                            int var31 = var26.field1722[var27][3];
                            int var32 = var26.field1722[var27][4];
                            int var33 = var26.field1722[var27][5];
                            if (this.field5470 == null) {
                                this.field5470 = new int[var26.field1722.length][];
                            }
                            if (this.field5470[var27] == null) {
                                int[] var34 = this.field5470[var27] = new int[15];
                                if (var31 == 0 && var32 == 0 && var33 == 0) {
                                    var34[14] = -var30;
                                    var34[12] = -var28;
                                    var34[0] = var34[4] = var34[8] = 32768;
                                    var34[13] = -var29;
                                } else {
                                    int var35 = class272.field4480[var31] >> 1;
                                    int var36 = class272.field4480[var33] >> 1;
                                    int var37 = class272.field4470[var31] >> 1;
                                    int var38 = class272.field4470[var32] >> 1;
                                    int var39 = class272.field4470[var33] >> 1;
                                    int var40 = class272.field4480[var32] >> 1;
                                    var34[2] = var35 * var38 + 16384 >> 15;
                                    var34[5] = -var37;
                                    var34[8] = var35 * var40 + 16384 >> 15;
                                    int var41 = var36 * var37 + 16384 >> 15;
                                    var34[7] = var40 * var41 + -var38 * -var39 + 16384 >> 15;
                                    var34[14] = var34[2] * -var28 + (var34[5] * -var29 + (var34[8] * -var30)) + 16384 >> 15;
                                    var34[4] = var35 * var36 + 16384 >> 15;
                                    int var42 = var37 * var39 + 16384 >> 15;
                                    var34[0] = var38 * var42 + var36 * var40 + 16384 >> 15;
                                    var34[6] = -var38 * var36 + var40 * var42 + 16384 >> 15;
                                    var34[1] = -var39 * var40 + var38 * var41 + 16384 >> 15;
                                    var34[13] = var34[7] * -var30 + var34[1] * -var28 - (-(var34[4] * -var29) - 16384) >> 15;
                                    var34[3] = var35 * var39 + 16384 >> 15;
                                    var34[12] = var34[3] * -var29 + (var34[0] * -var28 + (var34[6] * -var30)) + 16384 >> 15;
                                }
                                var34[9] = var28;
                                var34[11] = var30;
                                var34[10] = var29;
                            }
                            if (var31 != 0 || var32 != 0 || var33 != 0) {
                                var21[var27].method908(var31, var32, var33);
                            }
                            if (var28 != 0 || var29 != 0 || var30 != 0) {
                                var21[var27].method914(var28, var29, var30);
                            }
                        }
                    }
                }
                class135 var43 = new class135(var21, var21.length);
                for (int var44 = 0; var44 < 5; var44++) {
                    if (this.field5482[var44] < class96.field1387[var44].length) {
                        var43.method904(class210.field3201[var44], class96.field1387[var44][this.field5482[var44]]);
                    }
                    if (class32.field484[var44].length > this.field5482[var44]) {
                        var43.method904(class83.field1198[var44], class32.field484[var44][this.field5482[var44]]);
                    }
                }
                var17 = var43.method906(64, 850, -30, -50, -30);
                if (class245.field3886) {
                    ((class22) var17).method139(false, false, true, true, false, false, true);
                }
                if (arg6) {
                    class181.field2820.method642(var17, var13, arg8 ^ 0xFFFFFF8B);
                    this.field5473 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg10 == null ? 0 : arg10.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg10[var50] != null) {
                class131 var51 = class68.method476((byte) 124, arg10[var50].field3450);
                if (var51.field1988 != null) {
                    var45 = true;
                    class125.field1869[var50] = var51;
                    int var52 = arg10[var50].field3451;
                    int var53 = arg10[var50].field3452;
                    int var54 = var51.field1988[var52];
                    class31.field468[var50] = class17.method114(var54 >>> 16, false);
                    int var55 = var54 & 0xFFFF;
                    class143.field2301[var50] = var55;
                    if (class31.field468[var50] != null) {
                        var47 |= class31.field468[var50].method1040(14678, var55);
                        var46 |= class31.field468[var50].method1041(var55, arg8);
                        var48 |= var51.field2005;
                    }
                    if ((var51.field1995 || class241.field3780) && var53 != -1 && var51.field1988.length > var53) {
                        class250.field3996[var50] = var51.field2002[var52];
                        class217.field3347[var50] = arg10[var50].field3445;
                        int var56 = var51.field1988[var53];
                        class343.field5514[var50] = class17.method114(var56 >>> 16, false);
                        int var57 = var56 & 0xFFFF;
                        class44.field644[var50] = var57;
                        if (class343.field5514[var50] != null) {
                            var47 |= class343.field5514[var50].method1040(14678, var57);
                            var46 |= class343.field5514[var50].method1041(var57, 0);
                        }
                    } else {
                        class250.field3996[var50] = 0;
                        class217.field3347[var50] = 0;
                        class343.field5514[var50] = null;
                        class44.field644[var50] = -1;
                    }
                }
            }
        }
        if (var45 || arg0 != null || arg4 != null) {
            int var58 = -1;
            int var59 = -1;
            int var60 = 0;
            class146 var61 = null;
            class146 var62 = null;
            if (arg0 != null) {
                int var63 = arg0.field1988[arg2];
                int var64 = var63 >>> 16;
                var58 = var63 & 0xFFFF;
                var61 = class17.method114(var64, false);
                if (var61 != null) {
                    var47 |= var61.method1040(14678, var58);
                    var46 |= var61.method1041(var58, 0);
                    var48 |= arg0.field2005;
                }
                if ((arg0.field1995 || class241.field3780) && arg9 != -1 && arg0.field1988.length > arg9) {
                    int var65 = arg0.field1988[arg9];
                    int var66 = var65 >>> 16;
                    var60 = arg0.field2002[arg2];
                    var59 = var65 & 0xFFFF;
                    if (var64 == var66) {
                        var62 = var61;
                    } else {
                        var62 = class17.method114(var59 >>> 16, false);
                    }
                    if (var62 != null) {
                        var47 |= var62.method1040(arg8 + 14678, var59);
                        var46 |= var62.method1041(var59, 0);
                    }
                }
            }
            int var67 = -1;
            int var68 = -1;
            int var69 = 0;
            class146 var70 = null;
            class146 var71 = null;
            if (arg4 != null) {
                int var72 = arg4.field1988[arg1];
                int var73 = var72 >>> 16;
                var71 = class17.method114(var73, false);
                var67 = var72 & 0xFFFF;
                if (var71 != null) {
                    var47 |= var71.method1040(14678, var67);
                    var46 |= var71.method1041(var67, arg8);
                    var48 |= arg4.field2005;
                }
                if ((arg4.field1995 || class241.field3780) && arg11 != -1 && arg4.field1988.length > arg11) {
                    int var74 = arg4.field1988[arg11];
                    int var75 = var74 >>> 16;
                    var68 = var74 & 0xFFFF;
                    var69 = arg4.field2002[arg1];
                    if (var73 == var75) {
                        var70 = var71;
                    } else {
                        var70 = class17.method114(var68 >>> 16, false);
                    }
                    if (var70 != null) {
                        var47 |= var70.method1040(14678, var68);
                        var46 |= var70.method1041(var68, 0);
                    }
                }
            }
            class128 var76 = var17.method181(!var46, !var47, !var48);
            int var77 = arg8;
            int var78 = 1;
            while (var77 < var49) {
                if (class31.field468[var77] != null) {
                    var76.method836(class31.field468[var77], class143.field2301[var77], class343.field5514[var77], class44.field644[var77], class217.field3347[var77] - 1, class250.field3996[var77], var78, class125.field1869[var77].field2005, this.field5470[var77]);
                }
                var78 <<= 0x1;
                var77++;
            }
            if (var61 != null && var71 != null) {
                var76.method835(var61, var58, var62, var59, arg5 - 1, var60, var71, var67, var70, var68, arg7 - 1, var69, arg0.field1998, arg4.field2005 | arg0.field2005);
            } else if (var61 != null) {
                var76.method838(var61, var58, var62, var59, arg5 - 1, var60, arg0.field2005);
            } else if (var71 != null) {
                var76.method838(var71, var67, var70, var68, arg7 - 1, var69, arg4.field2005);
            }
            for (int var79 = 0; var79 < var49; var79++) {
                class31.field468[var79] = null;
                class343.field5514[var79] = null;
                class125.field1869[var79] = null;
            }
            return var76;
        } else if (arg3) {
            return var17.method181(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 686)
    private final void method2398(int arg0) {
        long var2 = this.field5462;
        this.field5462 = -1L;
        field5475++;
        long[] var4 = class275.field4528;
        this.field5462 = this.field5462 >>> 8 ^ var4[(int) ((long) arg0 & ((long) (this.field5466 >> 8) ^ this.field5462))];
        this.field5462 = this.field5462 >>> 8 ^ var4[(int) ((this.field5462 ^ (long) this.field5466) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field5462 = var4[(int) ((this.field5462 ^ (long) (this.field5483[var5] >> 24)) & 0xFFL)] ^ this.field5462 >>> 8;
            this.field5462 = var4[(int) ((this.field5462 ^ (long) (this.field5483[var5] >> 16)) & 0xFFL)] ^ this.field5462 >>> 8;
            this.field5462 = var4[(int) ((this.field5462 ^ (long) (this.field5483[var5] >> 8)) & 0xFFL)] ^ this.field5462 >>> 8;
            this.field5462 = var4[(int) ((this.field5462 ^ (long) this.field5483[var5]) & 0xFFL)] ^ this.field5462 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field5462 = this.field5462 >>> 8 ^ var4[(int) (((long) this.field5482[var6] ^ this.field5462) & 0xFFL)];
        }
        this.field5462 = this.field5462 >>> 8 ^ var4[(int) ((this.field5462 ^ (long) (this.field5472 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field5462 != var2) {
            class181.field2820.method650(arg0 - 255, var2);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V", line = 728)
    public static final void method2399(byte arg0, int arg1) {
        class202.field3101.method644((byte) -95);
        class202.field3101 = new class98(arg1);
        field5479++;
        if (arg0 != 24) {
            field5464 = 106;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I", line = 741)
    public final int method2400(int arg0) {
        field5471++;
        if (arg0 >= -23) {
            this.field5462 = 14L;
        }
        return this.field5476 == -1 ? (this.field5482[0] << 25) + (this.field5483[0] << 15) + (this.field5483[11] << 5) + (this.field5483[8] << 10) + (this.field5482[4] << 20) + this.field5483[1] : class38.method307(this.field5476, 0).field2242 + 305419896;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIILsb;I)Lsm;", line = 761)
    public final class128 method2401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class131 arg6, int arg7) {
        field5468++;
        long var9 = (long) arg5 | (long) (arg1 << 16) | (long) arg7 << 32;
        if (arg0 != 768) {
            return (class128) null;
        }
        class128 var11 = (class128) class195.field2988.method652(var9, false);
        if (var11 == null) {
            class135[] var12 = new class135[3];
            int var13 = 0;
            if (!class120.method780(3, arg5).method362(0) || !class120.method780(3, arg1).method362(0) || !class120.method780(arg0 ^ 0x303, arg7).method362(arg0 - 768)) {
                return null;
            }
            class135 var14 = class120.method780(3, arg5).method368(false);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class135 var15 = class120.method780(arg0 ^ 0x303, arg1).method368(false);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class135 var16 = class120.method780(3, arg7).method368(false);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class135 var17 = new class135(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field5482[var18] < class96.field1387[var18].length) {
                    var17.method904(class210.field3201[var18], class96.field1387[var18][this.field5482[var18]]);
                }
                if (this.field5482[var18] < class32.field484[var18].length) {
                    var17.method904(class83.field1198[var18], class32.field484[var18][this.field5482[var18]]);
                }
            }
            var11 = var17.method906(64, 768, -50, -10, -50);
            class195.field2988.method642(var11, var9, arg0 - 846);
        }
        if (arg6 != null) {
            var11 = arg6.method851(arg3, var11, arg0 - 645, arg2, arg4);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZBI[II[I)V", line = 831)
    public final void method2402(boolean arg0, byte arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        if (arg1 <= 0) {
            return;
        }
        if (this.field5466 != arg4) {
            this.field5466 = arg4;
            this.field5470 = (int[][]) null;
        }
        field5467++;
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class102.field1466; var8++) {
                    class49 var9 = class120.method780(3, var8);
                    if (var9 != null && !var9.field709 && (arg0 ? class294.field4885[var7] : class68.field1056[var7]) == var9.field697) {
                        arg5[class31.field470[var7]] = class167.method1160(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field5472 = arg0;
        this.field5483 = arg5;
        this.field5476 = arg2;
        this.field5482 = arg3;
        this.method2398(255);
    }
}
