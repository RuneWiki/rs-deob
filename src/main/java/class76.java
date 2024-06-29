import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class76 extends class176 {

    @OriginalMember(owner = "client!qb", name = "Ub", descriptor = "S")
    private short field1296 = 0;

    @OriginalMember(owner = "client!qb", name = "Xb", descriptor = "I")
    public int field1299 = 0;

    @OriginalMember(owner = "client!qb", name = "Rb", descriptor = "I")
    public int field1293 = 0;

    @OriginalMember(owner = "client!qb", name = "fc", descriptor = "I")
    public int field1307 = -1;

    @OriginalMember(owner = "client!qb", name = "ic", descriptor = "I")
    public int field1310 = 0;

    @OriginalMember(owner = "client!qb", name = "Pb", descriptor = "I")
    public int field1291 = -1;

    @OriginalMember(owner = "client!qb", name = "qc", descriptor = "I")
    public int field1318 = -1;

    @OriginalMember(owner = "client!qb", name = "hc", descriptor = "I")
    public int field1309 = -1;

    @OriginalMember(owner = "client!qb", name = "vc", descriptor = "Z")
    public boolean field1323 = false;

    @OriginalMember(owner = "client!qb", name = "pc", descriptor = "S")
    private short field1317 = 0;

    @OriginalMember(owner = "client!qb", name = "bc", descriptor = "I")
    private int field1303 = 0;

    @OriginalMember(owner = "client!qb", name = "yc", descriptor = "I")
    public int field1326 = -1;

    @OriginalMember(owner = "client!qb", name = "Bc", descriptor = "I")
    public int field1329 = 0;

    @OriginalMember(owner = "client!qb", name = "zc", descriptor = "I")
    public int field1327 = 0;

    @OriginalMember(owner = "client!qb", name = "Cc", descriptor = "I")
    public int field1330 = 0;

    @OriginalMember(owner = "client!qb", name = "Vb", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!qb", name = "Ob", descriptor = "Le;")
    public static class191 field1290 = class54.method368("3D)2Softwarebibliothek gestartet)3", 2047);

    @OriginalMember(owner = "client!qb", name = "wc", descriptor = "I")
    public static int field1324 = 0;

    @OriginalMember(owner = "client!qb", name = "mc", descriptor = "Le;")
    public static class191 field1314 = class54.method368("(U (X", 2047);

    @OriginalMember(owner = "client!qb", name = "Ac", descriptor = "Le;")
    public static class191 field1328 = class54.method368("Verbindung abgebrochen)3", 2047);

    @OriginalMember(owner = "client!qb", name = "Tb", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!qb", name = "Wb", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!qb", name = "Yb", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!qb", name = "Zb", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!qb", name = "ac", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!qb", name = "cc", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!qb", name = "dc", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!qb", name = "gc", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!qb", name = "jc", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!qb", name = "kc", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!qb", name = "lc", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!qb", name = "oc", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!qb", name = "rc", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!qb", name = "sc", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!qb", name = "tc", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!qb", name = "uc", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!qb", name = "xc", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!qb", name = "ec", descriptor = "Lod;")
    public class181 field1306;

    @OriginalMember(owner = "client!qb", name = "nc", descriptor = "Le;")
    public class191 field1315;

    @OriginalMember(owner = "client!qb", name = "Qb", descriptor = "Lee;")
    public class251 field1292;

    @OriginalMember(owner = "client!qb", name = "Sb", descriptor = "[I")
    public static int[] field1294;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lji;I)V")
    public final void method488(class225 arg0, int arg1) {
        ++field1295;
        arg0.field3996 = 0;
        int var3 = arg0.method1580(-101);
        int var4 = 1 & var3;
        boolean var5 = (var3 & 4) != 0;
        if (~(2 & var3) == -3) {
            this.field1317 = (short) (arg0.method1580(-19) << 2);
            this.field1296 = (short) (arg0.method1580(-106) << 2);
        } else {
            this.field1296 = 0;
            this.field1317 = 0;
        }
        if (arg1 > 14) {
            int var6 = super.method490((byte) -4);
            this.method1185(1, (7 & var3 >> 3) + 1);
            this.field1303 = 3 & var3 >> 6;
            super.field3003 += (-var6 + this.method490((byte) -4)) * 64;
            int[] var7 = new int[12];
            int var8 = -1;
            super.field2972 += 64 * (this.method490((byte) -4) - var6);
            this.field1318 = arg0.method1575(false);
            this.field1309 = arg0.method1575(false);
            this.field1310 = 0;
            for (int var9 = 0; var9 < 12; ++var9) {
                int var10 = arg0.method1580(-31);
                if (var10 == 0) {
                    var7[var9] = 0;
                } else {
                    int var11 = arg0.method1580(-104);
                    int var12 = (var10 << 8) + var11;
                    if (~var9 == -1 && var12 == 65535) {
                        var8 = arg0.method1593(true);
                        break;
                    }
                    if (var12 >= 32768) {
                        int var21 = class10.field118[var12 + -32768];
                        var7[var9] = class217.method1476(1073741824, var21);
                        int var22 = class100.method623(-1, var21).field2537;
                        if (var22 != 0) {
                            this.field1310 = var22;
                        }
                    } else {
                        var7[var9] = class217.method1476(Integer.MIN_VALUE, var12 + -256);
                    }
                }
            }
            int[] var13 = new int[5];
            for (int var14 = 0; ~var14 > -6; ++var14) {
                int var20 = arg0.method1580(-22);
                if (var20 < 0 || class200.field3582[var14].length <= var20) {
                    var20 = 0;
                }
                var13[var14] = var20;
            }
            super.field2974 = arg0.method1593(true);
            if (~super.field2974 == -65536) {
                super.field2974 = -1;
            }
            super.field3011 = arg0.method1593(true);
            if (~super.field3011 == -65536) {
                super.field3011 = -1;
            }
            super.field3012 = super.field3011;
            super.field3007 = arg0.method1593(true);
            if (super.field3007 == 65535) {
                super.field3007 = -1;
            }
            super.field2969 = arg0.method1593(true);
            if (super.field2969 == 65535) {
                super.field2969 = -1;
            }
            super.field2995 = arg0.method1593(true);
            if (~super.field2995 == -65536) {
                super.field2995 = -1;
            }
            super.field2970 = arg0.method1593(true);
            if (~super.field2970 == -65536) {
                super.field2970 = -1;
            }
            super.field2947 = arg0.method1593(true);
            if (super.field2947 == 65535) {
                super.field2947 = -1;
            }
            this.field1315 = class33.method225(arg0.method1605(-2033532384), false).method1345((byte) -18);
            this.field1330 = arg0.method1580(-84);
            if (!var5) {
                this.field1327 = 0;
            } else {
                this.field1327 = arg0.method1593(true);
            }
            int var15 = this.field1299;
            this.field1299 = arg0.method1580(-117);
            if (~this.field1299 != -1) {
                int var16 = this.field1307;
                int var17 = this.field1326;
                int var18 = this.field1291;
                this.field1291 = arg0.method1593(true);
                this.field1326 = arg0.method1593(true);
                this.field1307 = arg0.method1593(true);
                if (~this.field1299 != ~var15 || ~this.field1291 != ~var18 || this.field1326 != var17 || ~this.field1307 != ~var16) {
                    class52.method356(119, this);
                }
            } else {
                class250.method1743(-87, this);
            }
            if (this.field1306 == null) {
                this.field1306 = new class181();
            }
            int var19 = this.field1306.field3118;
            this.field1306.method1220(var13, var8, (byte) 121, var7, var4 == 1);
            if (~var8 != ~var19) {
                super.field3003 = super.field2953[0] * 128 - -(64 * this.method490((byte) -4));
                super.field2972 = super.field3014[0] * 128 + this.method490((byte) -4) * 64;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        if (arg0 != 50) {
            return true;
        } else {
            ++field1322;
            return this.field1306 != null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
    public final int method490(byte arg0) {
        ++field1305;
        if (arg0 != -4) {
            this.method126();
        }
        return this.field1306 != null && this.field1306.field3118 != -1 ? class135.method904(arg0 + -105, this.field1306.field3118).field3208 : super.method490((byte) -4);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BII)Le;")
    public static final class191 method491(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            method491(-61, (byte[]) null, 18, 49);
        }
        ++field1308;
        class191 var4 = new class191();
        var4.field3392 = new byte[arg0];
        var4.field3379 = 0;
        for (int var5 = arg2; var5 < arg2 - -arg0; ++var5) {
            if (~arg1[var5] != -1) {
                var4.field3392[var4.field3379++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()I")
    public final int method126() {
        ++field1312;
        return super.field2968;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBZ)V")
    public final void method492(int arg0, int arg1, byte arg2, boolean arg3) {
        super.method1184(arg3, arg0, 3, arg1, this.method490((byte) -4));
        int var5 = 120 / ((53 - arg2) / 34);
        ++field1298;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lee;IBIIIIIIIIII)V")
    private final void method493(class251 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field1300;
        if (arg2 != -95) {
            this.method489(24);
        }
        int var14 = arg7 * arg7 + arg10 * arg10;
        if (var14 >= 16 && ~var14 >= -360001) {
            int var15 = 2047 & (int) (Math.atan2((double) arg10, (double) arg7) * 325.949D);
            class251 var16 = class16.method125(arg0, arg2 + 188, arg8, var15, super.field2949, super.field2972, super.field3003);
            if (var16 != null) {
                var16.method127(0, arg3, arg11, arg12, arg4, arg6, arg1, arg5, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1304;
        if (this.field1306 != null) {
            class248 var11 = super.field3019 != -1 && ~super.field3016 == -1 ? class67.method445((byte) -61, super.field3019) : null;
            class248 var12 = ~super.field2977 == 0 || this.field1323 || ~super.field2977 == ~super.field2974 && var11 != null ? null : class67.method445((byte) -61, super.field2977);
            class251 var13 = this.field1306.method1214(super.field2958, super.field2976, var12, 13103, var11);
            if (var13 != null) {
                super.field2968 = var13.method126();
                if (class252.field4472 && (~this.field1306.field3118 == 0 || class135.method904(-123, this.field1306.field3118).field3191)) {
                    class251 var14 = class111.method713(240, var13, super.field2972, super.field2978, (byte) -71, arg0, 1, 0, 0, super.field2949, var12 == null ? super.field2958 : super.field2976, super.field3003, 160, var12 != null ? var12 : var11);
                    var14.method127(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                if (class175.field2946 == this) {
                    for (int var15 = class152.field2608.length + -1; var15 >= 0; --var15) {
                        class79 var16 = class152.field2608[var15];
                        if (var16 != null && var16.field1340 != -1) {
                            if (~var16.field1344 == -2 && var16.field1352 >= 0 && class115.field1901.length > var16.field1352) {
                                class156 var17 = class115.field1901[var16.field1352];
                                if (var17 != null) {
                                    int var18 = var17.field3003 / 32 - class175.field2946.field3003 / 32;
                                    int var19 = var17.field2972 / 32 + -(class175.field2946.field2972 / 32);
                                    this.method493(var13, arg6, (byte) -95, arg1, arg4, arg7, arg5, var19, var16.field1340, arg0, var18, arg2, arg3);
                                }
                            }
                            if (var16.field1344 == 2) {
                                int var20 = (var16.field1345 - class193.field3474) * 4 + 2 + -(class175.field2946.field2972 / 32);
                                int var21 = (-class225.field4061 + var16.field1353) * 4 + -(class175.field2946.field3003 / 32) + 2;
                                this.method493(var13, arg6, (byte) -95, arg1, arg4, arg7, arg5, var20, var16.field1340, arg0, var21, arg2, arg3);
                            }
                            if (var16.field1344 == 10 && ~var16.field1352 <= -1 && ~class245.field4357.length < ~var16.field1352) {
                                class76 var22 = class245.field4357[var16.field1352];
                                if (var22 != null) {
                                    int var23 = var22.field2972 / 32 - class175.field2946.field2972 / 32;
                                    int var24 = var22.field3003 / 32 + -(class175.field2946.field3003 / 32);
                                    this.method493(var13, arg6, (byte) -95, arg1, arg4, arg7, arg5, var23, var16.field1340, arg0, var24, arg2, arg3);
                                }
                            }
                        }
                    }
                }
                int var25 = 0;
                int var26 = 0;
                int var27 = 0;
                if (~this.field1317 != -1 && ~this.field1296 != -1) {
                    int var28 = class15.field204[arg0];
                    short var29 = this.field1296;
                    short var30 = this.field1317;
                    int var31 = -var29 / 2;
                    int var32 = class15.field206[arg0];
                    int var33 = -var30 / 2;
                    int var34 = var31 * var32 + -(var28 * var33) >> 16;
                    int var35 = var28 * var31 + var32 * var33 >> 16;
                    int var36 = var30 / 2;
                    int var37 = class222.method1546(class261.field4598, super.field3003 + var35, super.field2972 + var34, 247425607);
                    int var38 = -var29 / 2;
                    int var39 = var32 * var38 + -(var28 * var36) >> 16;
                    int var40 = var28 * var38 - -(var32 * var36) >> 16;
                    int var41 = class222.method1546(class261.field4598, super.field3003 + var40, super.field2972 + var39, 247425607);
                    int var42 = -var30 / 2;
                    int var43 = var29 / 2;
                    int var44 = var28 * var43 - -(var32 * var42) >> 16;
                    int var45 = var30 / 2;
                    int var46 = var32 * var43 - var28 * var42 >> 16;
                    int var47 = class222.method1546(class261.field4598, super.field3003 + var44, super.field2972 + var46, 247425607);
                    int var48 = var29 / 2;
                    int var49 = var32 * var48 - var28 * var45 >> 16;
                    int var50 = var28 * var48 + var32 * var45 >> 16;
                    int var51 = var37 < var41 ? var37 : var41;
                    int var52 = class222.method1546(class261.field4598, super.field3003 - -var50, super.field2972 + var49, 247425607);
                    int var53 = ~var47 < ~var37 ? var37 : var47;
                    int var54 = ~var52 < ~var41 ? var41 : var52;
                    int var55 = var52 > var47 ? var47 : var52;
                    int var56 = var37 + var52;
                    if (~var56 < ~(var41 + var47)) {
                        var56 = var41 + var47;
                    }
                    var25 = (int) (325.95D * Math.atan2((double) (-var55 + var51), (double) var29)) & 2047;
                    if (~var25 != -1) {
                        var13.method974(var25);
                    }
                    var26 = (int) (Math.atan2((double) (var53 - var54), (double) var30) * 325.95D) & 2047;
                    if (~var26 != -1) {
                        var13.method948(var26);
                    }
                    var27 = (var56 >> 1) + -super.field2949;
                    if (~var27 != -1) {
                        var13.method964(0, var27, 0);
                    }
                }
                class251 var57 = null;
                if (!this.field1323 && ~super.field3009 != 0 && super.field2959 != -1) {
                    class14 var58 = class47.method323(-4453, super.field3009);
                    var57 = var58.method96(true, super.field2959);
                    if (var57 != null) {
                        var57.method964(0, -super.field2956, 0);
                        if (var58.field185) {
                            if (~var25 != -1) {
                                var57.method974(var25);
                            }
                            if (~var26 != -1) {
                                var57.method948(var26);
                            }
                            if (var27 != 0) {
                                var57.method964(0, var27, 0);
                            }
                        }
                    }
                }
                class251 var59 = null;
                if (!this.field1323 && this.field1292 != null) {
                    if (~class135.field2267 <= ~this.field1329) {
                        this.field1292 = null;
                    }
                    if (~class135.field2267 <= ~this.field1293 && this.field1329 > class135.field2267) {
                        var59 = this.field1292;
                        var59.method964(-super.field3003 + this.field1302, -super.field2949 + this.field1313, this.field1311 - super.field2972);
                        if (~super.field2964 == -513) {
                            var59.method976();
                        } else if (super.field2964 == 1024) {
                            var59.method954();
                        } else if (super.field2964 == 1536) {
                            var59.method970();
                        }
                    }
                }
                if (var57 != null) {
                    var13 = ((class144) var13).method960(var57);
                }
                if (var59 != null) {
                    var13 = ((class144) var13).method960(var59);
                }
                var13.field4458 = true;
                var13.method127(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var59 != null) {
                    if (~super.field2964 != -513) {
                        if (~super.field2964 != -1025) {
                            if (super.field2964 == 1536) {
                                var59.method976();
                            }
                        } else {
                            var59.method954();
                        }
                    } else {
                        var59.method970();
                    }
                    var59.method964(super.field3003 - this.field1302, -this.field1313 + super.field2949, -this.field1311 + super.field2972);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)Le;")
    public final class191 method494(byte arg0) {
        int var2 = -8 / ((3 - arg0) / 33);
        class191 var3 = this.field1315;
        if (class8.field83 != null) {
            var3 = class228.method1629(new class191[] { class8.field83[this.field1303], var3 }, (byte) -57);
        }
        if (class227.field4089 != null) {
            var3 = class228.method1629(new class191[] { var3, class227.field4089[this.field1303] }, (byte) -76);
        }
        ++field1301;
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method495(int arg0) {
        field1328 = null;
        field1314 = null;
        field1294 = null;
        if (arg0 != 26305) {
            field1314 = null;
        }
        field1290 = null;
    }
}
