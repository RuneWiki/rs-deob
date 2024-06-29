import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class79 {

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field1273 = 0;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field1275 = 50;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field1265 = new String[field1275];

    @OriginalMember(owner = "client!te", name = "f", descriptor = "[I")
    public static int[] field1259 = new int[field1275];

    @OriginalMember(owner = "client!te", name = "z", descriptor = "J")
    public static long field1279 = 0L;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    public static int[] field1257 = new int[field1275];

    @OriginalMember(owner = "client!te", name = "A", descriptor = "[I")
    public static int[] field1280 = new int[field1275];

    @OriginalMember(owner = "client!te", name = "E", descriptor = "[I")
    public static int[] field1284 = new int[field1275];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public static int[] field1255 = new int[field1275];

    @OriginalMember(owner = "client!te", name = "p", descriptor = "[I")
    public static int[] field1269 = new int[field1275];

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
    public static int[] field1272 = new int[field1275];

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "J")
    private long field1256;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "J")
    private long field1267;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lsb;")
    public static class230 field1270;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Z")
    public boolean field1254;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[I")
    public int[] field1271;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "[I")
    private int[] field1285;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "[[I")
    private int[][] field1281;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
    public final void method517(boolean arg0, int arg1) {
        this.field1254 = arg0;
        this.method520(70);
        if (arg1 != 0) {
            this.field1260 = 27;
        }
        field1263++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZLcc;III)Lfk;")
    public final class14 method518(int arg0, int arg1, int arg2, boolean arg3, class215 arg4, int arg5, int arg6, int arg7) {
        field1283++;
        if (!arg3) {
            this.method525((byte) 50);
        }
        long var9 = (long) (arg2 << 16) | (long) arg5 << 32 | (long) arg7;
        class14 var11 = (class14) class71.field1127.method1777(var9, (byte) 112);
        if (var11 == null) {
            int var12 = 0;
            class208[] var13 = new class208[3];
            if (!class115.method740(-19, arg7).method582(-1506) || !class115.method740(127, arg2).method582(-1506) || !class115.method740(-62, arg5).method582(-1506)) {
                return null;
            }
            class208 var14 = class115.method740(107, arg7).method578(0);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class208 var15 = class115.method740(114, arg2).method578(0);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class208 var16 = class115.method740(111, arg5).method578(0);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class208 var17 = new class208(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field1271[var18] < class76.field1227[var18].length) {
                    var17.method1340(class268.field4050[var18], class76.field1227[var18][this.field1271[var18]]);
                }
                if (class187.field2833[var18].length > this.field1271[var18]) {
                    var17.method1340(class115.field1756[var18], class187.field2833[var18][this.field1271[var18]]);
                }
            }
            var11 = var17.method1315(64, 768, -50, -10, -50);
            class71.field1127.method1784(var9, var11, 0);
        }
        if (arg4 != null) {
            var11 = arg4.method1376(arg6, var11, 127, arg1, arg0);
        }
        return var11;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZIILcc;IIILcc;[Lle;II)Lfk;")
    public final class14 method519(boolean arg0, int arg1, int arg2, class215 arg3, int arg4, int arg5, int arg6, class215 arg7, class44[] arg8, int arg9, int arg10) {
        field1282++;
        if (this.field1276 != -1) {
            return class267.method1783((byte) 125, this.field1276).method483(arg10, arg5, (byte) -96, arg4, arg7, arg8, arg2, arg1, arg3, arg6);
        }
        int[] var12 = this.field1285;
        long var13 = this.field1256;
        if (arg7 != null && (arg7.field3246 >= 0 || arg7.field3229 >= 0)) {
            var12 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var12[var15] = this.field1285[var15];
            }
            if (arg7.field3246 >= 0) {
                if (arg7.field3246 == 65535) {
                    var12[5] = 0;
                    var13 ^= 0xFFFFFFFF00000000L;
                } else {
                    var12[5] = class63.method428(1073741824, arg7.field3246);
                    var13 ^= (long) var12[5] << 32;
                }
            }
            if (arg7.field3229 >= 0) {
                if (arg7.field3229 == 65535) {
                    var12[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var12[3] = class63.method428(arg7.field3229, 1073741824);
                    var13 ^= (long) var12[3];
                }
            }
        }
        class14 var16 = (class14) class210.field3158.method1777(var13, (byte) 112);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var12[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((var43 & Integer.MIN_VALUE) != 0 && !class115.method740(arg9 - 65594, var43 & 0x3FFFFFFF).method584((byte) -106)) {
                        var17 = true;
                    }
                } else if (!class160.method999(var43 & 0x3FFFFFFF, 0).method291(this.field1254, -1)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field1267 != -1L) {
                    var16 = (class14) class210.field3158.method1777(this.field1267, (byte) 112);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class208[] var19 = new class208[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var12[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class208 var41 = class160.method999(var40 & 0x3FFFFFFF, 0).method292(this.field1254, (byte) 121);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class208 var42 = class115.method740(125, var40 & 0x3FFFFFFF).method580(arg9 ^ 0xFF89);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class158 var21 = null;
                if (this.field1260 != -1) {
                    var21 = class255.method1680(true, this.field1260);
                }
                if (var21 != null && var21.field2424 != null) {
                    for (int var22 = 0; var22 < var21.field2424.length; var22++) {
                        if (var21.field2424[var22] != null && var19[var22] != null) {
                            int var23 = var21.field2424[var22][1];
                            int var24 = var21.field2424[var22][0];
                            int var25 = var21.field2424[var22][3];
                            int var26 = var21.field2424[var22][2];
                            int var27 = var21.field2424[var22][5];
                            int var28 = var21.field2424[var22][4];
                            if (this.field1281 == null) {
                                this.field1281 = new int[var21.field2424.length][];
                            }
                            if (this.field1281[var22] == null) {
                                int[] var29 = this.field1281[var22] = new int[15];
                                if (var25 == 0 && var28 == 0 && var27 == 0) {
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var26;
                                    var29[13] = -var23;
                                    var29[12] = -var24;
                                } else {
                                    int var30 = class249.field3781[var25] >> 1;
                                    int var31 = class249.field3767[var25] >> 1;
                                    int var32 = class249.field3781[var28] >> 1;
                                    int var33 = class249.field3781[var27] >> 1;
                                    int var34 = class249.field3767[var27] >> 1;
                                    int var35 = class249.field3767[var28] >> 1;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    var29[5] = -var31;
                                    var29[3] = var30 * var34 + 16384 >> 15;
                                    var29[4] = var30 * var33 + 16384 >> 15;
                                    var29[2] = var30 * var35 + 16384 >> 15;
                                    int var36 = var31 * var33 + 16384 >> 15;
                                    var29[14] = var29[2] * -var24 + var29[8] * -var26 + var29[5] * -var23 + 16384 >> 15;
                                    var29[1] = -var34 * var32 - (-(var35 * var36) - 16384) >> 15;
                                    int var37 = var31 * var34 + 16384 >> 15;
                                    var29[7] = -var34 * -var35 + var32 * var36 + 16384 >> 15;
                                    var29[13] = var29[7] * -var26 + var29[4] * -var23 + var29[1] * -var24 + 16384 >> 15;
                                    var29[6] = -var35 * var33 + var32 * var37 + 16384 >> 15;
                                    var29[0] = var32 * var33 + var35 * var37 + 16384 >> 15;
                                    var29[12] = var29[0] * -var24 + (var29[3] * -var23) + var29[6] * -var26 + 16384 >> 15;
                                }
                                var29[11] = var26;
                                var29[10] = var23;
                                var29[9] = var24;
                            }
                            if (var25 != 0 || var28 != 0 || var27 != 0) {
                                var19[var22].method1330(var25, var28, var27);
                            }
                            if (var24 != 0 || var23 != 0 || var26 != 0) {
                                var19[var22].method1336(var24, var23, var26);
                            }
                        }
                    }
                }
                class208 var38 = new class208(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class76.field1227[var39].length > this.field1271[var39]) {
                        var38.method1340(class268.field4050[var39], class76.field1227[var39][this.field1271[var39]]);
                    }
                    if (class187.field2833[var39].length > this.field1271[var39]) {
                        var38.method1340(class115.field1756[var39], class187.field2833[var39][this.field1271[var39]]);
                    }
                }
                var16 = var38.method1315(64, 850, -30, -50, -30);
                if (arg0) {
                    class210.field3158.method1784(var13, var16, 0);
                    this.field1267 = var13;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg8 == null ? 0 : arg8.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg8[var49] != null) {
                class215 var72 = class276.method1829(arg8[var49].field702, 29223);
                if (var72.field3215 != null) {
                    var44 = true;
                    class230.field3466[var49] = var72;
                    int var73 = arg8[var49].field700;
                    int var74 = arg8[var49].field701;
                    int var75 = var72.field3215[var73];
                    class210.field3154[var49] = class92.method587(arg9 - 65536, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class230.field3469[var49] = var76;
                    if (class210.field3154[var49] != null) {
                        var46 |= class210.field3154[var49].method1553(var76, 10);
                        var45 |= class210.field3154[var49].method1557(var76, 117);
                        var47 |= var72.field3237;
                    }
                    if ((var72.field3241 || class258.field3932) && var74 != -1 && var74 < var72.field3215.length) {
                        class169.field2587[var49] = var72.field3219[var73];
                        class57.field907[var49] = arg8[var49].field699;
                        int var77 = var72.field3215[var74];
                        class287.field4286[var49] = class92.method587(-1, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class234.field3536[var49] = var78;
                        if (class287.field4286[var49] != null) {
                            var46 |= class287.field4286[var49].method1553(var78, 10);
                            var45 |= class287.field4286[var49].method1557(var78, 120);
                        }
                    } else {
                        class169.field2587[var49] = 0;
                        class57.field907[var49] = 0;
                        class287.field4286[var49] = null;
                        class234.field3536[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg7 == null && arg3 == null) {
            return var16;
        } else if (arg9 == 65535) {
            int var50 = -1;
            int var51 = -1;
            int var52 = 0;
            class247 var53 = null;
            class247 var54 = null;
            if (arg7 != null) {
                int var55 = arg7.field3215[arg6];
                int var56 = var55 >>> 16;
                var50 = var55 & 0xFFFF;
                var53 = class92.method587(-1, var56);
                if (var53 != null) {
                    var46 |= var53.method1553(var50, 10);
                    var45 |= var53.method1557(var50, 120);
                    var47 |= arg7.field3237;
                }
                if ((arg7.field3241 || class258.field3932) && arg1 != -1 && arg7.field3215.length > arg1) {
                    int var57 = arg7.field3215[arg1];
                    var52 = arg7.field3219[arg6];
                    int var58 = var57 >>> 16;
                    var51 = var57 & 0xFFFF;
                    if (var56 == var58) {
                        var54 = var53;
                    } else {
                        var54 = class92.method587(-1, var51 >>> 16);
                    }
                    if (var54 != null) {
                        var46 |= var54.method1553(var51, 10);
                        var45 |= var54.method1557(var51, 124);
                    }
                }
            }
            int var59 = -1;
            int var60 = -1;
            class247 var61 = null;
            class247 var62 = null;
            int var63 = 0;
            if (arg3 != null) {
                int var64 = arg3.field3215[arg10];
                int var65 = var64 >>> 16;
                var61 = class92.method587(-1, var65);
                var60 = var64 & 0xFFFF;
                if (var61 != null) {
                    var46 |= var61.method1553(var60, 10);
                    var45 |= var61.method1557(var60, 126);
                    var47 |= arg3.field3237;
                }
                if ((arg3.field3241 || class258.field3932) && arg4 != -1 && arg4 < arg3.field3215.length) {
                    int var66 = arg3.field3215[arg4];
                    int var67 = var66 >>> 16;
                    var59 = var66 & 0xFFFF;
                    var63 = arg3.field3219[arg10];
                    if (var65 == var67) {
                        var62 = var61;
                    } else {
                        var62 = class92.method587(-1, var59 >>> 16);
                    }
                    if (var62 != null) {
                        var46 |= var62.method1553(var59, arg9 ^ 0xFFF5);
                        var45 |= var62.method1557(var59, arg9 ^ 0xFF86);
                    }
                }
            }
            class14 var68 = var16.method107(!var45, !var46, !var47);
            int var69 = 0;
            int var70 = 1;
            while (var48 > var69) {
                if (class210.field3154[var69] != null) {
                    var68.method79(class210.field3154[var69], class230.field3469[var69], class287.field4286[var69], class234.field3536[var69], class57.field907[var69] - 1, class169.field2587[var69], var70, class230.field3466[var69].field3237, this.field1281[var69]);
                }
                var70 <<= 0x1;
                var69++;
            }
            if (var53 != null && var61 != null) {
                var68.method95(var53, var50, var54, var51, arg5 - 1, var52, var61, var60, var62, var59, arg2 - 1, var63, arg7.field3221, arg7.field3237 | arg3.field3237);
            } else if (var53 != null) {
                var68.method105(var53, var50, var54, var51, arg5 - 1, var52, arg7.field3237);
            } else if (var61 != null) {
                var68.method105(var61, var60, var62, var59, arg2 - 1, var63, arg3.field3237);
            }
            for (int var71 = 0; var71 < var48; var71++) {
                class210.field3154[var71] = null;
                class287.field4286[var71] = null;
                class230.field3466[var71] = null;
            }
            return var68;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    private final void method520(int arg0) {
        field1264++;
        long var2 = this.field1256;
        long[] var4 = class43.field694;
        this.field1256 = -1L;
        this.field1256 = var4[(int) ((this.field1256 ^ (long) (this.field1260 >> 8)) & 0xFFL)] ^ this.field1256 >>> 8;
        this.field1256 = var4[(int) ((this.field1256 ^ (long) this.field1260) & 0xFFL)] ^ this.field1256 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1256 = this.field1256 >>> 8 ^ var4[(int) (((long) (this.field1285[var5] >> 24) ^ this.field1256) & 0xFFL)];
            this.field1256 = this.field1256 >>> 8 ^ var4[(int) (((long) (this.field1285[var5] >> 16) ^ this.field1256) & 0xFFL)];
            this.field1256 = var4[(int) (((long) (this.field1285[var5] >> 8) ^ this.field1256) & 0xFFL)] ^ this.field1256 >>> 8;
            this.field1256 = this.field1256 >>> 8 ^ var4[(int) (((long) this.field1285[var5] ^ this.field1256) & 0xFFL)];
        }
        int var6 = -35 / ((arg0 + 32) / 49);
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1256 = this.field1256 >>> 8 ^ var4[(int) (((long) this.field1271[var7] ^ this.field1256) & 0xFFL)];
        }
        this.field1256 = this.field1256 >>> 8 ^ var4[(int) (((long) (this.field1254 ? 1 : 0) ^ this.field1256) & 0xFFL)];
        if (var2 != 0L && this.field1256 != var2) {
            class210.field3158.method1781(var2, true);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([IZ[IIIZ)V")
    public final void method521(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        field1266++;
        if (arg5) {
            return;
        }
        if (this.field1260 != arg3) {
            this.field1281 = null;
            this.field1260 = arg3;
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class232.field3503; var8++) {
                    class90 var9 = class115.method740(112, var8);
                    if (var9 != null && !var9.field1427 && var9.field1414 == (arg1 ? class69.field1091[var7] : class145.field2119[var7])) {
                        arg2[class214.field3214[var7]] = class63.method428(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1276 = arg4;
        this.field1271 = arg0;
        this.field1285 = arg2;
        this.field1254 = arg1;
        this.method520(78);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public final void method522(int arg0, int arg1, int arg2) {
        int var4 = class214.field3214[arg2];
        field1278++;
        if (this.field1285[var4] != arg1 && class115.method740(arg1 - 48, arg0) != null) {
            this.field1285[var4] = class63.method428(Integer.MIN_VALUE, arg0);
            this.method520(-83);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLcc;III)Lfk;")
    public final class14 method523(byte arg0, class215 arg1, int arg2, int arg3, int arg4) {
        field1258++;
        if (this.field1276 != -1) {
            return class267.method1783((byte) 113, this.field1276).method494(arg3, arg4, arg2, arg1, true);
        }
        class14 var6 = (class14) class71.field1127.method1777(this.field1256, (byte) 112);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field1285[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var17) != 0 && !class115.method740(-106, var17 & 0x3FFFFFFF).method582(-1506)) {
                        var7 = true;
                    }
                } else if (!class160.method999(var17 & 0x3FFFFFFF, 0).method297((byte) 90, this.field1254)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class208[] var9 = new class208[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field1285[var11];
                if ((var14 & 0x40000000) != 0) {
                    class208 var15 = class160.method999(var14 & 0x3FFFFFFF, 0).method281(0, this.field1254);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class208 var16 = class115.method740(104, var14 & 0x3FFFFFFF).method578(0);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                }
            }
            class208 var12 = new class208(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field1271[var13] < class76.field1227[var13].length) {
                    var12.method1340(class268.field4050[var13], class76.field1227[var13][this.field1271[var13]]);
                }
                if (class187.field2833[var13].length > this.field1271[var13]) {
                    var12.method1340(class115.field1756[var13], class187.field2833[var13][this.field1271[var13]]);
                }
            }
            var6 = var12.method1315(64, 768, -50, -10, -50);
            class71.field1127.method1784(this.field1256, var6, 0);
        }
        if (arg0 < 31) {
            this.method519(false, 12, -26, (class215) null, 118, 56, 70, (class215) null, (class44[]) null, -31, 94);
        }
        if (arg1 != null) {
            var6 = arg1.method1376(arg2, var6, 127, arg4, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method524(byte arg0) {
        field1272 = null;
        field1284 = null;
        field1259 = null;
        field1257 = null;
        field1280 = null;
        field1269 = null;
        if (arg0 != -127) {
            method527((byte) 100);
        }
        field1270 = null;
        field1255 = null;
        field1265 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)I")
    public final int method525(byte arg0) {
        if (arg0 == 72) {
            field1277++;
            return this.field1276 == -1 ? (this.field1285[0] << 15) + (this.field1285[11] << 5) + (this.field1271[4] << 20) + (this.field1285[8] << 10) + (this.field1271[0] << 25) + this.field1285[1] : 305419896 - -class267.method1783((byte) 93, this.field1276).field1142;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
    public final void method526(int arg0, byte arg1, int arg2) {
        if (arg1 < 23) {
            this.method518(43, -101, 65, false, (class215) null, 82, 114, 28);
        }
        field1268++;
        this.field1271[arg2] = arg0;
        this.method520(111);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    public static final void method527(byte arg0) {
        if (arg0 >= -29) {
            method527((byte) -82);
        }
        field1262++;
        if (class136.field1987 != -1) {
            class266.method1771(class136.field1987, (byte) 126);
        }
        for (int var1 = 0; var1 < class256.field3900; var1++) {
            if (class7.field105[var1]) {
                class1.field16[var1] = true;
            }
            class126.field1909[var1] = class7.field105[var1];
            class7.field105[var1] = false;
        }
        class120.field1814 = null;
        class75.field1220 = -1;
        class154.field2317 = -1;
        class30.field433 = class270.field4058;
        if (class136.field1987 != -1) {
            class256.field3900 = 0;
            class152.method919((byte) -76);
        }
        class111.method711();
        class180.field2741 = 0;
    }
}
