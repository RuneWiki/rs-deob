import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class242 {

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field3753 = 2;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "[C")
    public static char[] field3739 = new char[128];

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "Z")
    public static boolean field3760 = true;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    private int field3735;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "J")
    private long field3738;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "J")
    private long field3754;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "Lmj;")
    public static class114 field3741;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Lag;")
    public static class188 field3750;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Z")
    public boolean field3752;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "[I")
    public int[] field3740;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[I")
    private int[] field3744;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "[[I")
    private int[][] field3756;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I")
    public final int method1632(byte arg0) {
        if (arg0 < 118) {
            method1642((byte) -49);
        }
        field3737++;
        return this.field3755 == -1 ? (this.field3740[0] << 25) + (this.field3740[4] << 20) + this.field3744[1] - (-(this.field3744[8] << 10) - (this.field3744[11] << 5) - (this.field3744[0] << 15)) : class253.method1689(this.field3755, -22396).field3366 + 305419896;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBZ[II[I)V")
    public final void method1633(int arg0, byte arg1, boolean arg2, int[] arg3, int arg4, int[] arg5) {
        if (this.field3735 != arg4) {
            this.field3756 = null;
            this.field3735 = arg4;
        }
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class105.field1687; var8++) {
                    class30 var9 = class292.method1966(arg1 ^ 0x61, var8);
                    if (var9 != null && !var9.field480 && (arg2 ? class190.field3023[var7] : class112.field1764[var7]) == var9.field483) {
                        arg5[class105.field1691[var7]] = class115.method840(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        if (arg1 != 98) {
            this.method1645(-93, 55, 110, -110, -34, (class223) null, 20, 53);
        }
        this.field3740 = arg3;
        this.field3744 = arg5;
        this.field3752 = arg2;
        field3734++;
        this.field3755 = arg0;
        this.method1639((byte) 121);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIZLf;ZIIIZI)V")
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, boolean arg4, class37 arg5, boolean arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field3747++;
        if (arg10) {
            return;
        }
        if (arg1 < 0 || arg1 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var14 = arg5.method333((byte) -59);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg5.method333((byte) -59);
                    return;
                }
                if (var14 <= 49) {
                    arg5.method333((byte) -59);
                }
            }
        }
        if (!arg4 && !arg6) {
            class191.field3041[arg8][arg1][arg7] = 0;
        }
        while (true) {
            int var12 = arg5.method333((byte) -59);
            if (var12 == 0) {
                if (arg4) {
                    class68.field1079[0][arg1 + arg0][arg3 + arg7] = class214.field3307[0][arg1 + arg0][arg3 + arg7];
                    return;
                } else if (arg8 == 0) {
                    class68.field1079[0][arg0 + arg1][arg3 + arg7] = -class266.method1814(arg2 + 932731, (byte) 91, arg11 + 556238) * 8;
                    return;
                } else {
                    class68.field1079[arg8][arg0 + arg1][arg7 + arg3] = class68.field1079[arg8 - 1][arg0 + arg1][arg3 + arg7] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg5.method333((byte) -59);
                if (!arg4) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg8 == 0) {
                        class68.field1079[0][arg0 + arg1][arg7 + arg3] = -var13 * 8;
                        return;
                    }
                    class68.field1079[arg8][arg1 + arg0][arg3 + arg7] = class68.field1079[arg8 - 1][arg0 + arg1][arg3 + arg7] - (var13 * 8);
                    return;
                }
                class68.field1079[0][arg0 + arg1][arg3 + arg7] = var13 * 8 + class214.field3307[0][arg0 + arg1][arg3 + arg7];
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg5.method333((byte) -59);
                } else {
                    class35.field575[arg8][arg1][arg7] = arg5.method322((byte) 94);
                    class72.field1139[arg8][arg1][arg7] = (byte) ((var12 - 2) / 4);
                    class105.field1684[arg8][arg1][arg7] = (byte) class3.method48(arg9 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!arg4 && !arg6) {
                    class191.field3041[arg8][arg1][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                class154.field2356[arg8][arg1][arg7] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V")
    public final void method1635(int arg0, boolean arg1) {
        this.field3752 = arg1;
        if (arg0 < 64) {
            method1642((byte) 112);
        }
        this.method1639((byte) 104);
        field3758++;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)[Lqd;")
    public static final class3[] method1636(byte arg0) {
        field3751++;
        if (arg0 >= -54) {
            field3753 = -100;
        }
        class3[] var1 = new class3[class163.field2489];
        for (int var2 = 0; var2 < class163.field2489; var2++) {
            int var3 = class270.field4281[var2] * class107.field1717[var2];
            byte[] var4 = class289.field4554[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class35.field560[class3.method48(var4[var6], 255)];
            }
            var1[var2] = new class49(class205.field3187, class174.field2581, class184.field2764[var2], class239.field3698[var2], class270.field4281[var2], class107.field1717[var2], var5);
        }
        class239.method1619(65306);
        return var1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)V")
    public final void method1637(int arg0, int arg1, int arg2) {
        if (arg1 != -9629) {
            this.method1637(-67, -42, 45);
        }
        field3743++;
        this.field3740[arg2] = arg0;
        this.method1639((byte) -96);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lqd;")
    public static final class3 method1638(int arg0) {
        field3749++;
        int var1 = class270.field4281[0] * class107.field1717[0];
        if (arg0 != 1104494287) {
            field3748 = 28;
        }
        byte[] var2 = class289.field4554[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class35.field560[class3.method48(var2[var4], 255)];
        }
        class49 var5 = new class49(class205.field3187, class174.field2581, class184.field2764[0], class239.field3698[0], class270.field4281[0], class107.field1717[0], var3);
        class239.method1619(65306);
        return var5;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V")
    private final void method1639(byte arg0) {
        int var2 = 76 / ((arg0 - 43) / 59);
        field3736++;
        long var3 = this.field3754;
        this.field3754 = -1L;
        long[] var5 = class234.field3616;
        this.field3754 = this.field3754 >>> 8 ^ var5[(int) (((long) (this.field3735 >> 8) ^ this.field3754) & 0xFFL)];
        this.field3754 = var5[(int) ((this.field3754 ^ (long) this.field3735) & 0xFFL)] ^ this.field3754 >>> 8;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field3754 = this.field3754 >>> 8 ^ var5[(int) ((this.field3754 ^ (long) (this.field3744[var6] >> 24)) & 0xFFL)];
            this.field3754 = this.field3754 >>> 8 ^ var5[(int) ((this.field3754 ^ (long) (this.field3744[var6] >> 16)) & 0xFFL)];
            this.field3754 = var5[(int) (((long) (this.field3744[var6] >> 8) ^ this.field3754) & 0xFFL)] ^ this.field3754 >>> 8;
            this.field3754 = var5[(int) (((long) this.field3744[var6] ^ this.field3754) & 0xFFL)] ^ this.field3754 >>> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field3754 = this.field3754 >>> 8 ^ var5[(int) (((long) this.field3740[var7] ^ this.field3754) & 0xFFL)];
        }
        this.field3754 = var5[(int) ((this.field3754 ^ (long) (this.field3752 ? 1 : 0)) & 0xFFL)] ^ this.field3754 >>> 8;
        if (var3 != 0L && this.field3754 != var3) {
            class167.field2523.method1776(115, var3);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lql;Lql;IIII[Llc;ZIII)Lrg;")
    public final class233 method1640(class223 arg0, class223 arg1, int arg2, int arg3, int arg4, int arg5, class85[] arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field3745++;
        if (this.field3755 != -1) {
            return class253.method1689(this.field3755, arg2 ^ 0xFFFFBB7A).method1450(arg5, arg2 - 5118, arg6, arg8, arg0, arg4, arg3, arg10, arg1, arg9);
        }
        long var12 = this.field3754;
        if (arg2 != 5118) {
            return null;
        }
        int[] var14 = this.field3744;
        if (arg1 != null && (arg1.field3491 >= 0 || arg1.field3482 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3744[var15];
            }
            if (arg1.field3491 >= 0) {
                if (arg1.field3491 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class115.method840(arg1.field3491, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg1.field3482 >= 0) {
                if (arg1.field3482 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class115.method840(arg1.field3482, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class233 var16 = (class233) class167.field2523.method1780(var12, (byte) -120);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var14[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var43) != 0 && !class292.method1966(arg2 - 5115, var43 & 0x3FFFFFFF).method245(19844)) {
                        var17 = true;
                    }
                } else if (!class32.method260(var43 & 0x3FFFFFFF, true).method875((byte) 30, this.field3752)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3738 != -1L) {
                    var16 = (class233) class167.field2523.method1780(this.field3738, (byte) -116);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class183[] var19 = new class183[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var14[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class183 var42 = class32.method260(var40 & 0x3FFFFFFF, true).method871(this.field3752, true);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class183 var41 = class292.method1966(arg2 - 5115, var40 & 0x3FFFFFFF).method244(arg2 - 15971);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    }
                }
                class8 var21 = null;
                if (this.field3735 != -1) {
                    var21 = class224.method1501((byte) -126, this.field3735);
                }
                if (var21 != null && var21.field137 != null) {
                    for (int var22 = 0; var22 < var21.field137.length; var22++) {
                        if (var21.field137[var22] != null && var19[var22] != null) {
                            int var23 = var21.field137[var22][0];
                            int var24 = var21.field137[var22][1];
                            int var25 = var21.field137[var22][3];
                            int var26 = var21.field137[var22][4];
                            int var27 = var21.field137[var22][2];
                            int var28 = var21.field137[var22][5];
                            if (this.field3756 == null) {
                                this.field3756 = new int[var21.field137.length][];
                            }
                            if (this.field3756[var22] == null) {
                                int[] var29 = this.field3756[var22] = new int[15];
                                if (var25 == 0 && var26 == 0 && var28 == 0) {
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var27;
                                    var29[12] = -var23;
                                    var29[13] = -var24;
                                } else {
                                    int var30 = class97.field1556[var25] >> 1;
                                    int var31 = class97.field1557[var25] >> 1;
                                    int var32 = class97.field1557[var26] >> 1;
                                    int var33 = class97.field1556[var26] >> 1;
                                    int var34 = class97.field1556[var28] >> 1;
                                    int var35 = var31 * var34 + 16384 >> 15;
                                    int var36 = class97.field1557[var28] >> 1;
                                    var29[3] = var30 * var36 + 16384 >> 15;
                                    var29[5] = -var31;
                                    var29[2] = var30 * var32 + 16384 >> 15;
                                    var29[1] = -var36 * var33 - (-(var32 * var35) - 16384) >> 15;
                                    int var37 = var31 * var36 + 16384 >> 15;
                                    var29[4] = var30 * var34 + 16384 >> 15;
                                    var29[6] = -var32 * var34 + var33 * var37 + 16384 >> 15;
                                    var29[0] = var32 * var37 + var33 * var34 + 16384 >> 15;
                                    var29[7] = -var32 * -var36 + var33 * var35 + 16384 >> 15;
                                    var29[13] = var29[4] * -var24 + var29[7] * -var27 + var29[1] * -var23 + 16384 >> 15;
                                    var29[8] = var30 * var33 + 16384 >> 15;
                                    var29[12] = var29[3] * -var24 + var29[6] * -var27 + var29[0] * -var23 + 16384 >> 15;
                                    var29[14] = var29[8] * -var27 + var29[5] * -var24 + var29[2] * -var23 + 16384 >> 15;
                                }
                                var29[9] = var23;
                                var29[11] = var27;
                                var29[10] = var24;
                            }
                            if (var25 != 0 || var26 != 0 || var28 != 0) {
                                var19[var22].method1227(var25, var26, var28);
                            }
                            if (var23 != 0 || var24 != 0 || var27 != 0) {
                                var19[var22].method1205(var23, var24, var27);
                            }
                        }
                    }
                }
                class183 var38 = new class183(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (this.field3740[var39] < class247.field3817[var39].length) {
                        var38.method1200(class237.field3665[var39], class247.field3817[var39][this.field3740[var39]]);
                    }
                    if (class56.field863[var39].length > this.field3740[var39]) {
                        var38.method1200(class55.field852[var39], class56.field863[var39][this.field3740[var39]]);
                    }
                }
                var16 = var38.method1210(64, 850, -30, -50, -30);
                if (arg7) {
                    class167.field2523.method1784(var16, false, var12);
                    this.field3738 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg6 == null ? 0 : arg6.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg6[var49] != null) {
                class223 var72 = class28.method224(arg6[var49].field1398, 82);
                if (var72.field3484 != null) {
                    var44 = true;
                    class109.field1731[var49] = var72;
                    int var73 = arg6[var49].field1392;
                    int var74 = var72.field3484[var73];
                    int var75 = arg6[var49].field1400;
                    class230.field3592[var49] = class198.method1324((byte) 119, var74 >>> 16);
                    int var76 = var74 & 0xFFFF;
                    class118.field1823[var49] = var76;
                    if (class230.field3592[var49] != null) {
                        var46 |= class230.field3592[var49].method1921(12651, var76);
                        var45 |= class230.field3592[var49].method1924(false, var76);
                        var47 |= var72.field3506;
                    }
                    if ((var72.field3498 || class53.field830) && var75 != -1 && var75 < var72.field3484.length) {
                        class291.field4579[var49] = var72.field3488[var73];
                        class68.field1083[var49] = arg6[var49].field1402;
                        int var77 = var72.field3484[var75];
                        class270.field4275[var49] = class198.method1324((byte) -51, var77 >>> 16);
                        int var78 = var77 & 0xFFFF;
                        class195.field3075[var49] = var78;
                        if (class270.field4275[var49] != null) {
                            var46 |= class270.field4275[var49].method1921(12651, var78);
                            var45 |= class270.field4275[var49].method1924(false, var78);
                        }
                    } else {
                        class291.field4579[var49] = 0;
                        class68.field1083[var49] = 0;
                        class270.field4275[var49] = null;
                        class195.field3075[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg1 == null && arg0 == null) {
            return var16;
        }
        int var50 = -1;
        class286 var51 = null;
        int var52 = -1;
        class286 var53 = null;
        int var54 = 0;
        if (arg1 != null) {
            int var55 = arg1.field3484[arg3];
            int var56 = var55 >>> 16;
            var50 = var55 & 0xFFFF;
            var51 = class198.method1324((byte) 107, var56);
            if (var51 != null) {
                var46 |= var51.method1921(12651, var50);
                var45 |= var51.method1924(false, var50);
                var47 |= arg1.field3506;
            }
            if ((arg1.field3498 || class53.field830) && arg5 != -1 && arg1.field3484.length > arg5) {
                int var57 = arg1.field3484[arg5];
                int var58 = var57 >>> 16;
                var52 = var57 & 0xFFFF;
                var54 = arg1.field3488[arg3];
                if (var56 == var58) {
                    var53 = var51;
                } else {
                    var53 = class198.method1324((byte) -107, var52 >>> 16);
                }
                if (var53 != null) {
                    var46 |= var53.method1921(12651, var52);
                    var45 |= var53.method1924(false, var52);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        class286 var61 = null;
        int var62 = 0;
        class286 var63 = null;
        if (arg0 != null) {
            int var64 = arg0.field3484[arg4];
            int var65 = var64 >>> 16;
            var61 = class198.method1324((byte) -126, var65);
            var60 = var64 & 0xFFFF;
            if (var61 != null) {
                var46 |= var61.method1921(12651, var60);
                var45 |= var61.method1924(false, var60);
                var47 |= arg0.field3506;
            }
            if ((arg0.field3498 || class53.field830) && arg10 != -1 && arg0.field3484.length > arg10) {
                int var66 = arg0.field3484[arg10];
                var62 = arg0.field3488[arg4];
                int var67 = var66 >>> 16;
                var59 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var61;
                } else {
                    var63 = class198.method1324((byte) -70, var59 >>> 16);
                }
                if (var63 != null) {
                    var46 |= var63.method1921(12651, var59);
                    var45 |= var63.method1924(false, var59);
                }
            }
        }
        class233 var68 = var16.method1545(!var45, !var46, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var69 < var48) {
            if (class230.field3592[var69] != null) {
                var68.method1547(class230.field3592[var69], class118.field1823[var69], class270.field4275[var69], class195.field3075[var69], class68.field1083[var69] - 1, class291.field4579[var69], var70, class109.field1731[var69].field3506, this.field3756[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var51 != null && var61 != null) {
            var68.method1556(var51, var50, var53, var52, arg8 - 1, var54, var61, var60, var63, var59, arg9 - 1, var62, arg1.field3493, arg1.field3506 | arg0.field3506);
        } else if (var51 != null) {
            var68.method1551(var51, var50, var53, var52, arg8 - 1, var54, arg1.field3506);
        } else if (var61 != null) {
            var68.method1551(var61, var60, var63, var59, arg9 - 1, var62, arg0.field3506);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class230.field3592[var71] = null;
            class270.field4275[var71] = null;
            class109.field1731[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIZII)V")
    public static final void method1641(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        for (int var6 = arg2; var6 <= arg1; var6++) {
            class263.method1788(arg4, -18732, arg0, class156.field2379[var6], arg5);
        }
        if (!arg3) {
            method1638(-82);
        }
        field3757++;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V")
    public static void method1642(byte arg0) {
        field3739 = null;
        if (arg0 < 65) {
            method1634(-88, 54, 38, -107, true, (class37) null, false, -36, 13, -114, false, -98);
        }
        field3750 = null;
        field3741 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
    public static final void method1643(int arg0, int arg1) {
        class23 var2 = class255.field3907[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class23 var4 = class255.field3907[var3][arg0][arg1] = class255.field3907[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field359--;
                for (int var5 = 0; var5 < var4.field360; var5++) {
                    class172 var6 = var4.field358[var5];
                    if ((var6.field2569 >> 29 & 0x3L) == 2L && var6.field2558 == arg0 && var6.field2560 == arg1) {
                        var6.field2553--;
                    }
                }
            }
        }
        if (class255.field3907[0][arg0][arg1] == null) {
            class255.field3907[0][arg0][arg1] = new class23(0, arg0, arg1);
        }
        class255.field3907[0][arg0][arg1].field343 = var2;
        class255.field3907[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lql;IIII)Lrg;")
    public final class233 method1644(class223 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3759++;
        if (this.field3755 != -1) {
            return class253.method1689(this.field3755, -22396).method1444(arg1, arg4, arg0, arg2, arg3 ^ 0x5B7D);
        }
        if (arg3 != 15) {
            this.field3740 = null;
        }
        class233 var6 = (class233) class6.field110.method1780(this.field3754, (byte) -125);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field3744[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class292.method1966(3, var17 & 0x3FFFFFFF).method243(-123)) {
                        var7 = true;
                    }
                } else if (!class32.method260(var17 & 0x3FFFFFFF, true).method870(this.field3752, false)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class183[] var9 = new class183[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field3744[var11];
                if ((var14 & 0x40000000) != 0) {
                    class183 var16 = class32.method260(var14 & 0x3FFFFFFF, true).method885(this.field3752, false);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class183 var15 = class292.method1966(arg3 ^ 0xC, var14 & 0x3FFFFFFF).method242(123);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                }
            }
            class183 var12 = new class183(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (class247.field3817[var13].length > this.field3740[var13]) {
                    var12.method1200(class237.field3665[var13], class247.field3817[var13][this.field3740[var13]]);
                }
                if (this.field3740[var13] < class56.field863[var13].length) {
                    var12.method1200(class55.field852[var13], class56.field863[var13][this.field3740[var13]]);
                }
            }
            var6 = var12.method1210(64, 768, -50, -10, -50);
            class6.field110.method1784(var6, false, this.field3754);
        }
        if (arg0 != null) {
            var6 = arg0.method1486(arg3 ^ 0xBE9770DF, arg2, arg1, arg4, var6);
        }
        return var6;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIILql;II)Lrg;")
    public final class233 method1645(int arg0, int arg1, int arg2, int arg3, int arg4, class223 arg5, int arg6, int arg7) {
        if (arg6 != 17754) {
            this.method1637(117, 23, -48);
        }
        field3742++;
        long var9 = (long) arg3 | (long) arg1 << 32 | (long) (arg0 << 16);
        class233 var11 = (class233) class6.field110.method1780(var9, (byte) -127);
        if (var11 == null) {
            class183[] var12 = new class183[3];
            int var13 = 0;
            if (!class292.method1966(3, arg3).method243(-74) || !class292.method1966(3, arg0).method243(96) || !class292.method1966(3, arg1).method243(55)) {
                return null;
            }
            class183 var14 = class292.method1966(3, arg3).method242(102);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class183 var15 = class292.method1966(3, arg0).method242(arg6 ^ 0xFFFFBAE0);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class183 var16 = class292.method1966(3, arg1).method242(-58);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class183 var17 = new class183(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3740[var18] < class247.field3817[var18].length) {
                    var17.method1200(class237.field3665[var18], class247.field3817[var18][this.field3740[var18]]);
                }
                if (this.field3740[var18] < class56.field863[var18].length) {
                    var17.method1200(class55.field852[var18], class56.field863[var18][this.field3740[var18]]);
                }
            }
            var11 = var17.method1210(64, 768, -50, -10, -50);
            class6.field110.method1784(var11, false, var9);
        }
        if (arg5 != null) {
            var11 = arg5.method1486(arg6 ^ 0xBE97358A, arg2, arg7, arg4, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)V")
    public final void method1646(int arg0, int arg1, int arg2) {
        int var4 = 46 % ((arg2 + 46) / 41);
        field3746++;
        int var5 = class105.field1691[arg1];
        if (this.field3744[var5] != 0 && class292.method1966(3, arg0) != null) {
            this.field3744[var5] = class115.method840(Integer.MIN_VALUE, arg0);
            this.method1639((byte) -96);
        }
    }
}
