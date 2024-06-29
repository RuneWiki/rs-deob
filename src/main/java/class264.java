import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class264 {

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field4238 = -1;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    private int field4234;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "J")
    private long field4229;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "J")
    private long field4248;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Z")
    public boolean field4241;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
    public static int[] field4231;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[I")
    private int[] field4239;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "[I")
    public int[] field4246;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "[[I")
    private int[][] field4232;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public final void method1769(boolean arg0, int arg1) {
        this.field4241 = arg0;
        this.method1774(255);
        field4236++;
        if (arg1 > -13) {
            field4230 = -49;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILlc;IB)Lk;")
    public final class37 method1770(int arg0, int arg1, class307 arg2, int arg3, byte arg4) {
        if (arg4 != 84) {
            return null;
        }
        field4247++;
        if (this.field4235 != -1) {
            return class234.method1586(this.field4235, true).method1704(arg0, arg1, arg3, true, arg2);
        }
        class37 var6 = (class37) class94.field1519.method1261(arg4 ^ 0x54, this.field4248);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field4239[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class290.method1934(var17 & 0x3FFFFFFF, -43).method2072((byte) 126)) {
                        var7 = true;
                    }
                } else if (!class81.method562(var17 & 0x3FFFFFFF, arg4 - 20442).method813(this.field4241, false)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var9 = 0;
            class166[] var10 = new class166[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field4239[var11];
                if ((var14 & 0x40000000) != 0) {
                    class166 var15 = class81.method562(var14 & 0x3FFFFFFF, -20358).method806(this.field4241, 14110);
                    if (var15 != null) {
                        var10[var9++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class166 var16 = class290.method1934(var14 & 0x3FFFFFFF, -100).method2077(40);
                    if (var16 != null) {
                        var10[var9++] = var16;
                    }
                }
            }
            class166 var12 = new class166(var10, var9);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field4246[var13] < class241.field3848[var13].length) {
                    var12.method1203(class168.field2741[var13], class241.field3848[var13][this.field4246[var13]]);
                }
                if (class55.field903[var13].length > this.field4246[var13]) {
                    var12.method1203(class245.field3901[var13], class55.field903[var13][this.field4246[var13]]);
                }
            }
            var6 = var12.method1205(64, 768, -50, -10, -50);
            class94.field1519.method1264(-1, this.field4248, var6);
        }
        if (arg2 != null) {
            var6 = arg2.method2049(var6, arg0, arg1, false, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BI)Lfm;")
    public static final class93 method1771(byte[] arg0, int arg1) {
        field4233++;
        if (arg1 != 8) {
            method1776((byte) -107);
        }
        if (arg0 == null) {
            return null;
        } else {
            class217 var2 = new class217(arg0, class273.field4380, class314.field5058, class246.field3916, class60.field976, class70.field1192);
            class28.method156(-27424);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
    public final int method1772(byte arg0) {
        int var2 = 14 % ((-arg0 - 39) / 58);
        field4240++;
        return this.field4235 == -1 ? (this.field4246[0] << 25) + (this.field4239[0] << 15) + (this.field4246[4] << 20) + (this.field4239[11] << 5) + (this.field4239[8] << 10) + this.field4239[1] : class234.method1586(this.field4235, true).field4039 + 305419896;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIZLlc;II[Ltf;Llc;III)Lk;")
    public final class37 method1773(int arg0, boolean arg1, int arg2, boolean arg3, class307 arg4, int arg5, int arg6, class313[] arg7, class307 arg8, int arg9, int arg10, int arg11) {
        field4227++;
        if (this.field4235 != -1) {
            return class234.method1586(this.field4235, true).method1701(0, arg5, arg4, arg2, arg7, arg8, arg6, arg11, arg10, arg0);
        }
        long var13 = this.field4248;
        int[] var15 = this.field4239;
        if (arg8 != null && (arg8.field4918 >= 0 || arg8.field4901 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field4239[var16];
            }
            if (arg8.field4918 >= 0) {
                if (arg8.field4918 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class173.method1263(1073741824, arg8.field4918);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg8.field4901 >= 0) {
                if (arg8.field4901 == 65535) {
                    var15[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var15[3] = class173.method1263(arg8.field4901, 1073741824);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class37 var17 = (class37) class243.field3871.method1261(0, var13);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var44 = var15[var19];
                if ((var44 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var44) != 0 && !class290.method1934(var44 & 0x3FFFFFFF, -72).method2068((byte) 116)) {
                        var18 = true;
                    }
                } else if (!class81.method562(var44 & 0x3FFFFFFF, -20358).method812(this.field4241, arg9 + 64)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field4229 != -1L) {
                    var17 = (class37) class243.field3871.method1261(0, this.field4229);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class166[] var20 = new class166[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var41 = var15[var21];
                    if ((var41 & 0x40000000) != 0) {
                        class166 var43 = class81.method562(var41 & 0x3FFFFFFF, -20358).method811(this.field4241, -112);
                        if (var43 != null) {
                            var20[var21] = var43;
                        }
                    } else if ((var41 & Integer.MIN_VALUE) != 0) {
                        class166 var42 = class290.method1934(var41 & 0x3FFFFFFF, arg9 ^ 0x3B).method2074(59);
                        if (var42 != null) {
                            var20[var21] = var42;
                        }
                    }
                }
                class182 var22 = null;
                if (this.field4234 != -1) {
                    var22 = class97.method666(this.field4234, (byte) -109);
                }
                if (var22 != null && var22.field2990 != null) {
                    for (int var23 = 0; var23 < var22.field2990.length; var23++) {
                        if (var22.field2990[var23] != null && var20[var23] != null) {
                            int var24 = var22.field2990[var23][0];
                            int var25 = var22.field2990[var23][1];
                            int var26 = var22.field2990[var23][3];
                            int var27 = var22.field2990[var23][5];
                            int var28 = var22.field2990[var23][4];
                            int var29 = var22.field2990[var23][2];
                            if (this.field4232 == null) {
                                this.field4232 = new int[var22.field2990.length][];
                            }
                            if (this.field4232[var23] == null) {
                                int[] var30 = this.field4232[var23] = new int[15];
                                if (var26 == 0 && var28 == 0 && var27 == 0) {
                                    var30[12] = -var24;
                                    var30[13] = -var25;
                                    var30[14] = -var29;
                                    var30[0] = var30[4] = var30[8] = 32768;
                                } else {
                                    int var31 = class302.field4824[var26] >> 1;
                                    int var32 = class302.field4824[var28] >> 1;
                                    int var33 = class302.field4823[var28] >> 1;
                                    int var34 = class302.field4823[var26] >> 1;
                                    int var35 = class302.field4823[var27] >> 1;
                                    int var36 = class302.field4824[var27] >> 1;
                                    var30[5] = -var34;
                                    var30[2] = var31 * var33 + 16384 >> 15;
                                    int var37 = var34 * var36 + 16384 >> 15;
                                    var30[7] = -var33 * -var35 + (var32 * var37) + 16384 >> 15;
                                    var30[4] = var31 * var36 + 16384 >> 15;
                                    var30[3] = var31 * var35 + 16384 >> 15;
                                    var30[8] = var31 * var32 + 16384 >> 15;
                                    var30[1] = -var35 * var32 + (var33 * var37) + 16384 >> 15;
                                    var30[13] = var30[7] * -var29 + var30[4] * -var25 + var30[1] * -var24 + 16384 >> 15;
                                    int var38 = var34 * var35 + 16384 >> 15;
                                    var30[14] = var30[2] * -var24 + var30[5] * -var25 + (var30[8] * -var29) + 16384 >> 15;
                                    var30[0] = var32 * var36 + var33 * var38 + 16384 >> 15;
                                    var30[6] = -var33 * var36 + (var32 * var38 + 16384) >> 15;
                                    var30[12] = var30[3] * -var25 + var30[0] * -var24 + (var30[6] * -var29) + 16384 >> 15;
                                }
                                var30[11] = var29;
                                var30[9] = var24;
                                var30[10] = var25;
                            }
                            if (var26 != 0 || var28 != 0 || var27 != 0) {
                                var20[var23].method1213(var26, var28, var27);
                            }
                            if (var24 != 0 || var25 != 0 || var29 != 0) {
                                var20[var23].method1206(var24, var25, var29);
                            }
                        }
                    }
                }
                class166 var39 = new class166(var20, var20.length);
                for (int var40 = 0; var40 < 5; var40++) {
                    if (class241.field3848[var40].length > this.field4246[var40]) {
                        var39.method1203(class168.field2741[var40], class241.field3848[var40][this.field4246[var40]]);
                    }
                    if (this.field4246[var40] < class55.field903[var40].length) {
                        var39.method1203(class245.field3901[var40], class55.field903[var40][this.field4246[var40]]);
                    }
                }
                var17 = var39.method1205(64, 850, -30, -50, -30);
                if (arg1) {
                    class243.field3871.method1264(-1, var13, var17);
                    this.field4229 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg7 == null ? 0 : arg7.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg7[var50] != null) {
                class307 var73 = class22.method121(arg7[var50].field4993, true);
                if (var73.field4895 != null) {
                    var46 = true;
                    class204.field3252[var50] = var73;
                    int var74 = arg7[var50].field4987;
                    int var75 = var73.field4895[var74];
                    int var76 = arg7[var50].field4983;
                    class149.field2332[var50] = class312.method2084(var75 >>> 16, 0);
                    int var77 = var75 & 0xFFFF;
                    class132.field2082[var50] = var77;
                    if (class149.field2332[var50] != null) {
                        var47 |= class149.field2332[var50].method2034(arg9 - 125, var77);
                        var45 |= class149.field2332[var50].method2035(var77, 79);
                        var48 |= var73.field4919;
                    }
                    if ((var73.field4903 || class174.field2846) && var76 != -1 && var76 < var73.field4895.length) {
                        class281.field4497[var50] = var73.field4891[var74];
                        class218.field3589[var50] = arg7[var50].field4984;
                        int var78 = var73.field4895[var76];
                        class105.field1671[var50] = class312.method2084(var78 >>> 16, class98.method672(arg9, -1));
                        int var79 = var78 & 0xFFFF;
                        class112.field1761[var50] = var79;
                        if (class105.field1671[var50] != null) {
                            var47 |= class105.field1671[var50].method2034(-107, var79);
                            var45 |= class105.field1671[var50].method2035(var79, 88);
                        }
                    } else {
                        class281.field4497[var50] = 0;
                        class218.field3589[var50] = 0;
                        class105.field1671[var50] = null;
                        class112.field1761[var50] = -1;
                    }
                }
            }
        }
        if (var46 || arg8 != null || arg4 != null) {
            int var51 = 0;
            int var52 = -1;
            int var53 = -1;
            class304 var54 = null;
            class304 var55 = null;
            if (arg8 != null) {
                int var56 = arg8.field4895[arg0];
                int var57 = var56 >>> 16;
                var53 = var56 & 0xFFFF;
                var55 = class312.method2084(var57, 0);
                if (var55 != null) {
                    var47 |= var55.method2034(arg9 - 121, var53);
                    var45 |= var55.method2035(var53, 115);
                    var48 |= arg8.field4919;
                }
                if ((arg8.field4903 || class174.field2846) && arg2 != -1 && arg2 < arg8.field4895.length) {
                    var51 = arg8.field4891[arg0];
                    int var58 = arg8.field4895[arg2];
                    int var59 = var58 >>> 16;
                    var52 = var58 & 0xFFFF;
                    if (var57 == var59) {
                        var54 = var55;
                    } else {
                        var54 = class312.method2084(var52 >>> 16, 0);
                    }
                    if (var54 != null) {
                        var47 |= var54.method2034(arg9 ^ 0x6A, var52);
                        var45 |= var54.method2035(var52, 91);
                    }
                }
            }
            int var60 = -1;
            int var61 = arg9;
            int var62 = 0;
            class304 var63 = null;
            class304 var64 = null;
            if (arg4 != null) {
                int var65 = arg4.field4895[arg6];
                int var66 = var65 >>> 16;
                var60 = var65 & 0xFFFF;
                var63 = class312.method2084(var66, 0);
                if (var63 != null) {
                    var47 |= var63.method2034(-115, var60);
                    var45 |= var63.method2035(var60, 101);
                    var48 |= arg4.field4919;
                }
                if ((arg4.field4903 || class174.field2846) && arg10 != -1 && arg10 < arg4.field4895.length) {
                    var62 = arg4.field4891[arg6];
                    int var67 = arg4.field4895[arg10];
                    int var68 = var67 >>> 16;
                    var61 = var67 & 0xFFFF;
                    if (var66 == var68) {
                        var64 = var63;
                    } else {
                        var64 = class312.method2084(var61 >>> 16, 0);
                    }
                    if (var64 != null) {
                        var47 |= var64.method2034(-120, var61);
                        var45 |= var64.method2035(var61, 125);
                    }
                }
            }
            class37 var69 = var17.method175(!var45, !var47, !var48);
            int var70 = 0;
            int var71 = 1;
            while (var70 < var49) {
                if (class149.field2332[var70] != null) {
                    var69.method233(class149.field2332[var70], class132.field2082[var70], class105.field1671[var70], class112.field1761[var70], class218.field3589[var70] - 1, class281.field4497[var70], var71, class204.field3252[var70].field4919, this.field4232[var70]);
                }
                var70++;
                var71 <<= 0x1;
            }
            if (var55 != null && var63 != null) {
                var69.method232(var55, var53, var54, var52, arg5 - 1, var51, var63, var60, var64, var61, arg11 - 1, var62, arg8.field4894, arg4.field4919 | arg8.field4919);
            } else if (var55 != null) {
                var69.method230(var55, var53, var54, var52, arg5 - 1, var51, arg8.field4919);
            } else if (var63 != null) {
                var69.method230(var63, var60, var64, var61, arg11 - 1, var62, arg4.field4919);
            }
            for (int var72 = 0; var72 < var49; var72++) {
                class149.field2332[var72] = null;
                class105.field1671[var72] = null;
                class204.field3252[var72] = null;
            }
            return var69;
        } else if (arg3) {
            return var17.method175(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    private final void method1774(int arg0) {
        field4243++;
        long var2 = this.field4248;
        this.field4248 = -1L;
        long[] var4 = class180.field2939;
        this.field4248 = this.field4248 >>> 8 ^ var4[(int) ((this.field4248 ^ (long) (this.field4234 >> 8)) & (long) arg0)];
        this.field4248 = var4[(int) ((this.field4248 ^ (long) this.field4234) & 0xFFL)] ^ this.field4248 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4248 = var4[(int) (((long) (this.field4239[var5] >> 24) ^ this.field4248) & 0xFFL)] ^ this.field4248 >>> 8;
            this.field4248 = var4[(int) ((this.field4248 ^ (long) (this.field4239[var5] >> 16)) & 0xFFL)] ^ this.field4248 >>> 8;
            this.field4248 = var4[(int) (((long) (this.field4239[var5] >> 8) ^ this.field4248) & 0xFFL)] ^ this.field4248 >>> 8;
            this.field4248 = var4[(int) (((long) this.field4239[var5] ^ this.field4248) & 0xFFL)] ^ this.field4248 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4248 = this.field4248 >>> 8 ^ var4[(int) (((long) this.field4246[var6] ^ this.field4248) & 0xFFL)];
        }
        this.field4248 = var4[(int) ((this.field4248 ^ (long) (this.field4241 ? 1 : 0)) & 0xFFL)] ^ this.field4248 >>> 8;
        if (var2 != 0L && this.field4248 != var2) {
            class243.field3871.method1254((byte) -100, var2);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lwd;B)V")
    public static final void method1775(class162 arg0, byte arg1) {
        field4242++;
        int var2 = 72 % ((arg1 + 69) / 52);
        byte[] var3 = new byte[24];
        if (class87.field1433 != null) {
            try {
                class87.field1433.method580(false, 0L);
                class87.field1433.method581((byte) 0, var3);
                int var4;
                for (var4 = 0; var4 < 24 && var3[var4] == 0; var4++) {
                }
                if (var4 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var3[var5] = -1;
                }
            }
        }
        arg0.method1131(24, var3, 0, 2);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    public static void method1776(byte arg0) {
        if (arg0 >= -96) {
            field4238 = -30;
        }
        field4231 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
    public final void method1777(int arg0, int arg1, int arg2) {
        field4249++;
        int var4 = class111.field1745[arg2];
        if (this.field4239[var4] == 0 || class290.method1934(arg0, -114) == null) {
            return;
        }
        this.field4239[var4] = class173.method1263(arg0, Integer.MIN_VALUE);
        if (arg1 != 1075252815) {
            field4238 = -36;
        }
        this.method1774(arg1 - 1075252560);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II[IZI[I)V")
    public final void method1778(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int[] arg5) {
        field4226++;
        if (this.field4234 != arg4) {
            this.field4234 = arg4;
            this.field4232 = null;
        }
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class198.field3187; var8++) {
                    class310 var9 = class290.method1934(var8, arg1 + 31859);
                    if (var9 != null && !var9.field4952 && (arg3 ? class151.field2351[var7] : class167.field2723[var7]) == var9.field4947) {
                        arg5[class111.field1745[var7]] = class173.method1263(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4246 = arg2;
        if (arg1 == -31959) {
            this.field4235 = arg0;
            this.field4241 = arg3;
            this.field4239 = arg5;
            this.method1774(255);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIILlc;II)Lk;")
    public final class37 method1779(int arg0, int arg1, int arg2, int arg3, int arg4, class307 arg5, int arg6, int arg7) {
        if (arg4 != -895369968) {
            return null;
        }
        field4237++;
        long var9 = (long) (arg7 << 16) | (long) arg3 << 32 | (long) arg1;
        class37 var11 = (class37) class94.field1519.method1261(0, var9);
        if (var11 == null) {
            class166[] var12 = new class166[3];
            int var13 = 0;
            if (!class290.method1934(arg1, -62).method2072((byte) 127) || !class290.method1934(arg7, -116).method2072((byte) 123) || !class290.method1934(arg3, -20).method2072((byte) 119)) {
                return null;
            }
            class166 var14 = class290.method1934(arg1, -62).method2077(arg4 + 895370008);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class166 var15 = class290.method1934(arg7, -27).method2077(40);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class166 var16 = class290.method1934(arg3, -64).method2077(40);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class166 var17 = new class166(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class241.field3848[var18].length > this.field4246[var18]) {
                    var17.method1203(class168.field2741[var18], class241.field3848[var18][this.field4246[var18]]);
                }
                if (class55.field903[var18].length > this.field4246[var18]) {
                    var17.method1203(class245.field3901[var18], class55.field903[var18][this.field4246[var18]]);
                }
            }
            var11 = var17.method1205(64, 768, -50, -10, -50);
            class94.field1519.method1264(-1, var9, var11);
        }
        if (arg5 != null) {
            var11 = arg5.method2049(var11, arg0, arg6, false, arg2);
        }
        return var11;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)V")
    public final void method1780(int arg0, int arg1, int arg2) {
        this.field4246[arg2] = arg0;
        this.method1774(255);
        if (arg1 != Integer.MIN_VALUE) {
            this.field4239 = null;
        }
        field4244++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIIIBII)V")
    public static final void method1781(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class170.field2762 = arg1;
        field4228++;
        class306.field4887 = arg6;
        class50.field853 = arg2;
        class229.field3713 = arg3;
        if (arg4 != 76) {
            field4245 = 51;
        }
        class215.field3555 = arg5;
        if (arg0 && class306.field4887 >= 100) {
            class104.field1666 = class170.field2762 * 128 + 64;
            class148.field2314 = class50.field853 * 128 + 64;
            class46.field776 = class155.method1060((byte) -12, class56.field941, class104.field1666, class148.field2314) - class229.field3713;
        }
        class120.field1919 = 2;
    }
}
