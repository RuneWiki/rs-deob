import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class220 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[[I")
    public static int[][] field3235 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    private int field3255;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "J")
    private long field3239;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "J")
    private long field3253;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Z")
    public boolean field3236;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "[I")
    private int[] field3240;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[I")
    private int[] field3249;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
    public static int[] field3254;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[[I")
    private int[][] field3238;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[III[IZ)V")
    public final void method1408(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, boolean arg5) {
        if (this.field3255 != arg0) {
            this.field3255 = arg0;
            this.field3238 = null;
        }
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class79.field1229; var8++) {
                    class102 var9 = class69.method475(var8, (byte) -126);
                    if (var9 != null && !var9.field1516 && var9.field1517 == (arg5 ? class109.field1566[var7] : class262.field3952[var7])) {
                        arg1[class113.field1620[var7]] = class163.method1093(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3243 = arg2;
        this.field3249 = arg1;
        this.field3236 = arg5;
        this.field3240 = arg4;
        if (arg3 != 25954) {
            this.method1417((class235[]) null, -56, 35, (byte) -33, 113, 72, true, (class196) null, (class196) null, -24, 46);
        }
        field3244++;
        this.method1411(12664);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILfc;II)Lpa;")
    public final class2 method1409(int arg0, int arg1, class196 arg2, int arg3, int arg4) {
        field3242++;
        if (this.field3243 != -1) {
            return class14.method115(this.field3243, (byte) -113).method1818(arg2, arg1, arg3, arg0, 31985);
        }
        class2 var6 = (class2) class166.field2421.method263((byte) 125, this.field3253);
        if (arg4 != -1469917272) {
            return null;
        }
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field3249[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class69.method475(var17 & 0x3FFFFFFF, (byte) 108).method679(-12564)) {
                        var7 = true;
                    }
                } else if (!class259.method1735(var17 & 0x3FFFFFFF, arg4 + 1469902605).method1838(67, this.field3236)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class127[] var9 = new class127[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field3249[var11];
                if ((var14 & 0x40000000) != 0) {
                    class127 var16 = class259.method1735(var14 & 0x3FFFFFFF, -14667).method1834(false, this.field3236);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class127 var15 = class69.method475(var14 & 0x3FFFFFFF, (byte) 36).method677((byte) -85);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                }
            }
            class127 var12 = new class127(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (class224.field3348[var13].length > this.field3240[var13]) {
                    var12.method869(class15.field226[var13], class224.field3348[var13][this.field3240[var13]]);
                }
                if (class156.field2279[var13].length > this.field3240[var13]) {
                    var12.method869(class237.field3578[var13], class156.field2279[var13][this.field3240[var13]]);
                }
            }
            var6 = var12.method863(64, 768, -50, -10, -50);
            class166.field2421.method255(this.field3253, var6, (byte) -124);
        }
        if (arg2 != null) {
            var6 = arg2.method1253(-11163, var6, arg1, arg3, arg0);
        }
        return var6;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public final void method1410(int arg0, int arg1, int arg2) {
        field3241++;
        int var4 = class113.field1620[arg1];
        if (this.field3249[var4] != arg0 && class69.method475(arg2, (byte) 77) != null) {
            this.field3249[var4] = class163.method1093(arg2, Integer.MIN_VALUE);
            this.method1411(12664);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    private final void method1411(int arg0) {
        field3250++;
        long var2 = this.field3253;
        this.field3253 = -1L;
        if (arg0 != 12664) {
            return;
        }
        long[] var4 = class206.field2987;
        this.field3253 = this.field3253 >>> 8 ^ var4[(int) ((this.field3253 ^ (long) (this.field3255 >> 8)) & 0xFFL)];
        this.field3253 = var4[(int) (((long) this.field3255 ^ this.field3253) & 0xFFL)] ^ this.field3253 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3253 = var4[(int) ((this.field3253 ^ (long) (this.field3249[var5] >> 24)) & 0xFFL)] ^ this.field3253 >>> 8;
            this.field3253 = var4[(int) (((long) (this.field3249[var5] >> 16) ^ this.field3253) & 0xFFL)] ^ this.field3253 >>> 8;
            this.field3253 = var4[(int) (((long) (this.field3249[var5] >> 8) ^ this.field3253) & 0xFFL)] ^ this.field3253 >>> 8;
            this.field3253 = this.field3253 >>> 8 ^ var4[(int) ((this.field3253 ^ (long) this.field3249[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3253 = var4[(int) ((this.field3253 ^ (long) this.field3240[var6]) & 0xFFL)] ^ this.field3253 >>> 8;
        }
        this.field3253 = var4[(int) (((long) (this.field3236 ? 1 : 0) ^ this.field3253) & 0xFFL)] ^ this.field3253 >>> 8;
        if (var2 != 0L && this.field3253 != var2) {
            class39.field582.method262(var2, 3003);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method1412(int arg0) {
        field3235 = null;
        field3254 = null;
        int var1 = 75 % ((-arg0 - 22) / 58);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILfc;IIBII)Lpa;")
    public final class2 method1413(int arg0, int arg1, class196 arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3248++;
        long var9 = (long) arg3 | (long) (arg0 << 16) | (long) arg4 << 32;
        class2 var11 = (class2) class166.field2421.method263((byte) 118, var9);
        if (var11 == null) {
            int var12 = 0;
            class127[] var13 = new class127[3];
            if (!class69.method475(arg3, (byte) 112).method679(-12564) || !class69.method475(arg0, (byte) -86).method679(-12564) || !class69.method475(arg4, (byte) 113).method679(-12564)) {
                return null;
            }
            class127 var14 = class69.method475(arg3, (byte) 67).method677((byte) -85);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class127 var15 = class69.method475(arg0, (byte) 64).method677((byte) -85);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class127 var16 = class69.method475(arg4, (byte) -74).method677((byte) -85);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class127 var17 = new class127(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3240[var18] < class224.field3348[var18].length) {
                    var17.method869(class15.field226[var18], class224.field3348[var18][this.field3240[var18]]);
                }
                if (this.field3240[var18] < class156.field2279[var18].length) {
                    var17.method869(class237.field3578[var18], class156.field2279[var18][this.field3240[var18]]);
                }
            }
            var11 = var17.method863(64, 768, -50, -10, -50);
            class166.field2421.method255(var9, var11, (byte) -125);
        }
        int var19 = 13 % ((-arg5 - 12) / 49);
        if (arg2 != null) {
            var11 = arg2.method1253(-11163, var11, arg7, arg6, arg1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)V")
    public final void method1414(int arg0, int arg1, int arg2) {
        this.field3240[arg1] = arg0;
        field3245++;
        int var4 = 88 / ((arg2 + 6) / 63);
        this.method1411(12664);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I")
    public final int method1415(byte arg0) {
        field3247++;
        if (arg0 >= -68) {
            this.field3253 = -122L;
        }
        return this.field3243 == -1 ? (this.field3249[0] << 15) + (this.field3240[0] << 25) + (this.field3240[4] << 20) + (this.field3249[8] << 10) + (this.field3249[11] << 5) + this.field3249[1] : 305419896 - -class14.method115(this.field3243, (byte) -113).field4262;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I")
    public static final int method1416(int arg0, byte arg1) {
        field3237++;
        double var2 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 & 0xFF) / 256.0D;
        double var6 = (double) ((arg0 & 0xFFD799) >> 16) / 256.0D;
        double var8 = var6;
        if (var2 > var6) {
            var8 = var2;
        }
        if (var8 < var4) {
            var8 = var4;
        }
        double var10 = var6;
        double var12 = 0.0D;
        double var14 = 0.0D;
        if (var2 < var6) {
            var10 = var2;
        }
        if (var10 > var4) {
            var10 = var4;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var6 == var8) {
                var14 = (var2 - var4) / (var8 - var10);
            } else if (var2 == var8) {
                var14 = (var4 - var6) / (var8 - var10) + 2.0D;
            } else if (var4 == var8) {
                var14 = (var6 - var2) / (var8 - var10) + 4.0D;
            }
            if (var16 < 0.5D) {
                var12 = (var8 - var10) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        double var18 = var14 / 6.0D;
        if (arg1 != -47) {
            method1416(97, (byte) -38);
        }
        int var20 = (int) (var16 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var12 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var20 > 243) {
            var22 >>= 0x4;
        } else if (var20 > 217) {
            var22 >>= 0x3;
        } else if (var20 > 192) {
            var22 >>= 0x2;
        } else if (var20 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) - (-(var22 >> 5 << 7) - (var20 >> 1));
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lmi;IIBIIZLfc;Lfc;II)Lpa;")
    public final class2 method1417(class235[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, class196 arg7, class196 arg8, int arg9, int arg10) {
        field3251++;
        if (this.field3243 != -1) {
            return class14.method115(this.field3243, (byte) -113).method1824((byte) -50, arg4, arg10, arg1, arg0, arg7, arg9, arg5, arg2, arg8);
        }
        long var12 = this.field3253;
        int[] var14 = this.field3249;
        if (arg8 != null && (arg8.field2824 >= 0 || arg8.field2828 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3249[var15];
            }
            if (arg8.field2824 >= 0) {
                if (arg8.field2824 == 65535) {
                    var12 ^= 0xFFFFFFFF00000000L;
                    var14[5] = 0;
                } else {
                    var14[5] = class163.method1093(arg8.field2824, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg8.field2828 >= 0) {
                if (arg8.field2828 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class163.method1093(arg8.field2828, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class2 var16 = (class2) class39.field582.method263((byte) 115, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((var43 & Integer.MIN_VALUE) != 0 && !class69.method475(var43 & 0x3FFFFFFF, (byte) -73).method676((byte) 114)) {
                        var17 = true;
                    }
                } else if (!class259.method1735(var43 & 0x3FFFFFFF, -14667).method1833(this.field3236, arg3 + 12)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3239 != -1L) {
                    var16 = (class2) class39.field582.method263((byte) 125, this.field3239);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class127[] var19 = new class127[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class127 var42 = class259.method1735(var40 & 0x3FFFFFFF, -14667).method1844(this.field3236, 0);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class127 var41 = class69.method475(var40 & 0x3FFFFFFF, (byte) -82).method686(0);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    }
                }
                class35 var21 = null;
                if (this.field3255 != -1) {
                    var21 = class35.method244((byte) 39, this.field3255);
                }
                if (var21 != null && var21.field520 != null) {
                    for (int var22 = 0; var22 < var21.field520.length; var22++) {
                        if (var21.field520[var22] != null && var19[var22] != null) {
                            int var23 = var21.field520[var22][0];
                            int var24 = var21.field520[var22][1];
                            int var25 = var21.field520[var22][2];
                            int var26 = var21.field520[var22][4];
                            int var27 = var21.field520[var22][3];
                            int var28 = var21.field520[var22][5];
                            if (this.field3238 == null) {
                                this.field3238 = new int[var21.field520.length][];
                            }
                            if (this.field3238[var22] == null) {
                                int[] var29 = this.field3238[var22] = new int[15];
                                if (var27 == 0 && var26 == 0 && var28 == 0) {
                                    var29[14] = -var25;
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[12] = -var23;
                                    var29[13] = -var24;
                                } else {
                                    int var30 = class18.field259[var27] >> 1;
                                    int var31 = class18.field261[var26] >> 1;
                                    int var32 = class18.field259[var26] >> 1;
                                    int var33 = class18.field261[var27] >> 1;
                                    int var34 = class18.field259[var28] >> 1;
                                    int var35 = class18.field261[var28] >> 1;
                                    var29[8] = var30 * var32 + 16384 >> 15;
                                    var29[3] = var30 * var35 + 16384 >> 15;
                                    var29[5] = -var33;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    int var36 = var33 * var34 + 16384 >> 15;
                                    int var37 = var33 * var35 + 16384 >> 15;
                                    var29[7] = -var31 * -var35 + var32 * var36 + 16384 >> 15;
                                    var29[6] = var32 * var37 + (-var31 * var34 + 16384) >> 15;
                                    var29[0] = var31 * var37 + var32 * var34 + 16384 >> 15;
                                    var29[12] = var29[6] * -var25 + var29[3] * -var24 + var29[0] * -var23 + 16384 >> 15;
                                    var29[2] = var30 * var31 + 16384 >> 15;
                                    var29[14] = var29[2] * -var23 + 16384 - (-(var29[5] * -var24) - var29[8] * -var25) >> 15;
                                    var29[1] = -var35 * var32 + var31 * var36 + 16384 >> 15;
                                    var29[13] = var29[1] * -var23 + (var29[4] * -var24) + var29[7] * -var25 + 16384 >> 15;
                                }
                                var29[9] = var23;
                                var29[10] = var24;
                                var29[11] = var25;
                            }
                            if (var27 != 0 || var26 != 0 || var28 != 0) {
                                var19[var22].method873(var27, var26, var28);
                            }
                            if (var23 != 0 || var24 != 0 || var25 != 0) {
                                var19[var22].method871(var23, var24, var25);
                            }
                        }
                    }
                }
                class127 var38 = new class127(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class224.field3348[var39].length > this.field3240[var39]) {
                        var38.method869(class15.field226[var39], class224.field3348[var39][this.field3240[var39]]);
                    }
                    if (this.field3240[var39] < class156.field2279[var39].length) {
                        var38.method869(class237.field3578[var39], class156.field2279[var39][this.field3240[var39]]);
                    }
                }
                var16 = var38.method863(64, 850, -30, -50, -30);
                if (arg6) {
                    class39.field582.method255(var12, var16, (byte) -127);
                    this.field3239 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg0 == null ? 0 : arg0.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg0[var49] != null) {
                class196 var72 = class70.method478(arg0[var49].field3553, false);
                if (var72.field2818 != null) {
                    class19.field266[var49] = var72;
                    var44 = true;
                    int var73 = arg0[var49].field3543;
                    int var74 = arg0[var49].field3544;
                    int var75 = var72.field2818[var73];
                    class55.field837[var49] = class172.method1134(false, var75 >>> 16);
                    int var76 = var75 & 0xFFFF;
                    class261.field3938[var49] = var76;
                    if (class55.field837[var49] != null) {
                        var45 |= class55.field837[var49].method1611(arg3 + 17, var76);
                        var46 |= class55.field837[var49].method1609((byte) 76, var76);
                        var47 |= var72.field2823;
                    }
                    if ((var72.field2813 || class5.field80) && var74 != -1 && var74 < var72.field2818.length) {
                        class15.field225[var49] = var72.field2825[var73];
                        class43.field613[var49] = arg0[var49].field3554;
                        int var77 = var72.field2818[var74];
                        class256.field3881[var49] = class172.method1134(false, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class111.field1594[var49] = var78;
                        if (class256.field3881[var49] != null) {
                            var45 |= class256.field3881[var49].method1611(4, var78);
                            var46 |= class256.field3881[var49].method1609((byte) 103, var78);
                        }
                    } else {
                        class15.field225[var49] = 0;
                        class43.field613[var49] = 0;
                        class256.field3881[var49] = null;
                        class111.field1594[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg8 == null && arg7 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class246 var53 = null;
        class246 var54 = null;
        if (arg8 != null) {
            int var55 = arg8.field2818[arg10];
            int var56 = var55 >>> 16;
            var53 = class172.method1134(false, var56);
            var50 = var55 & 0xFFFF;
            if (var53 != null) {
                var45 |= var53.method1611(4, var50);
                var46 |= var53.method1609((byte) 101, var50);
                var47 |= arg8.field2823;
            }
            if ((arg8.field2813 || class5.field80) && arg5 != -1 && arg5 < arg8.field2818.length) {
                int var57 = arg8.field2818[arg5];
                var52 = arg8.field2825[arg10];
                int var58 = var57 >>> 16;
                var51 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var54 = var53;
                } else {
                    var54 = class172.method1134(false, var51 >>> 16);
                }
                if (var54 != null) {
                    var45 |= var54.method1611(4, var51);
                    var46 |= var54.method1609((byte) 81, var51);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        int var61 = 0;
        class246 var62 = null;
        class246 var63 = null;
        if (arg7 != null) {
            int var64 = arg7.field2818[arg4];
            int var65 = var64 >>> 16;
            var59 = var64 & 0xFFFF;
            var63 = class172.method1134(false, var65);
            if (var63 != null) {
                var45 |= var63.method1611(4, var59);
                var46 |= var63.method1609((byte) 113, var59);
                var47 |= arg7.field2823;
            }
            if ((arg7.field2813 || class5.field80) && arg9 != -1 && arg9 < arg7.field2818.length) {
                int var66 = arg7.field2818[arg9];
                var61 = arg7.field2825[arg4];
                int var67 = var66 >>> 16;
                var60 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var62 = var63;
                } else {
                    var62 = class172.method1134(false, var60 >>> 16);
                }
                if (var62 != null) {
                    var45 |= var62.method1611(4, var60);
                    var46 |= var62.method1609((byte) 113, var60);
                }
            }
        }
        class2 var68 = var16.method26(!var46, !var45, !var47);
        if (arg3 != -13) {
            this.method1408(43, (int[]) null, 67, 108, (int[]) null, false);
        }
        int var69 = 1;
        for (int var70 = 0; var70 < var48; var70++) {
            if (class55.field837[var70] != null) {
                var68.method27(class55.field837[var70], class261.field3938[var70], class256.field3881[var70], class111.field1594[var70], class43.field613[var70] - 1, class15.field225[var70], var69, class19.field266[var70].field2823, this.field3238[var70]);
            }
            var69 <<= 0x1;
        }
        if (var53 != null && var63 != null) {
            var68.method40(var53, var50, var54, var51, arg2 - 1, var52, var63, var59, var62, var60, arg1 - 1, var61, arg8.field2835, arg7.field2823 | arg8.field2823);
        } else if (var53 != null) {
            var68.method17(var53, var50, var54, var51, arg2 - 1, var52, arg8.field2823);
        } else if (var63 != null) {
            var68.method17(var63, var59, var62, var60, arg1 - 1, var61, arg7.field2823);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class55.field837[var71] = null;
            class256.field3881[var71] = null;
            class19.field266[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
    public final void method1418(int arg0, boolean arg1) {
        field3246++;
        this.field3236 = arg1;
        if (arg0 != 5) {
            this.method1413(46, -99, (class196) null, -79, -70, (byte) -119, 1, 96);
        }
        this.method1411(arg0 + 12659);
    }
}
