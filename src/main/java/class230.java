import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class230 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3546 = new String[1000];

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "[I")
    public static int[] field3552 = new int[5];

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Ld;")
    public static class142 field3563 = new class142();

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "J")
    private long field3548;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "J")
    private long field3566;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Z")
    public boolean field3553;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
    private int[] field3547;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "[I")
    private int[] field3564;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[[I")
    private int[][] field3550;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 5)
    public static void method1628(byte arg0) {
        int var1 = 47 / ((arg0 + 57) / 62);
        field3563 = null;
        field3552 = null;
        field3546 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILng;IB)Laj;", line = 20)
    public final class1 method1629(int arg0, int arg1, class162 arg2, int arg3, byte arg4) {
        int var6 = -116 % ((arg4 + 79) / 37);
        field3569++;
        if (this.field3559 != -1) {
            return class10.method78(this.field3559, 2).method1323(arg0, arg3, (byte) 78, arg1, arg2);
        }
        class1 var7 = (class1) class146.field2223.method1432((byte) 92, this.field3548);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var10 = this.field3547[var9];
                if ((var10 & 0x40000000) == 0) {
                    if ((var10 & Integer.MIN_VALUE) != 0 && !class45.method410(-77, var10 & 0x3FFFFFFF).method1966((byte) 86)) {
                        var8 = true;
                    }
                } else if (!class225.method1603(var10 & 0x3FFFFFFF, 0).method1918(-73, this.field3553)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            int var11 = 0;
            class42[] var12 = new class42[12];
            for (int var13 = 0; var13 < 12; var13++) {
                int var14 = this.field3547[var13];
                if ((var14 & 0x40000000) != 0) {
                    class42 var16 = class225.method1603(var14 & 0x3FFFFFFF, 0).method1901(0, this.field3553);
                    if (var16 != null) {
                        var12[var11++] = var16;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class42 var15 = class45.method410(-49, var14 & 0x3FFFFFFF).method1959((byte) -89);
                    if (var15 != null) {
                        var12[var11++] = var15;
                    }
                }
            }
            class42 var17 = new class42(var12, var11);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class37.field558[var18].length > this.field3564[var18]) {
                    var17.method383(class304.field4761[var18], class37.field558[var18][this.field3564[var18]]);
                }
                if (this.field3564[var18] < class62.field948[var18].length) {
                    var17.method383(class92.field1333[var18], class62.field948[var18][this.field3564[var18]]);
                }
            }
            var7 = var17.method379(64, 768, -50, -10, -50);
            class146.field2223.method1436(false, var7, this.field3548);
        }
        if (arg2 != null) {
            var7 = arg2.method1163(arg0, var7, arg3, arg1, (byte) 108);
        }
        return var7;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIILng;III)Laj;", line = 141)
    public final class1 method1630(int arg0, int arg1, int arg2, int arg3, class162 arg4, int arg5, int arg6, int arg7) {
        long var9 = (long) arg0 | (long) arg1 << 32 | (long) (arg7 << 16);
        class1 var11 = (class1) class146.field2223.method1432((byte) 91, var9);
        field3545++;
        if (arg5 <= 109) {
            this.field3566 = -40L;
        }
        if (var11 == null) {
            class42[] var12 = new class42[3];
            int var13 = 0;
            if (!class45.method410(-85, arg0).method1966((byte) 79) || !class45.method410(46, arg7).method1966((byte) 70) || !class45.method410(-64, arg1).method1966((byte) 75)) {
                return null;
            }
            class42 var14 = class45.method410(76, arg0).method1959((byte) -89);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class42 var15 = class45.method410(-73, arg7).method1959((byte) -89);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class42 var16 = class45.method410(72, arg1).method1959((byte) -89);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class42 var17 = new class42(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field3564[var18] < class37.field558[var18].length) {
                    var17.method383(class304.field4761[var18], class37.field558[var18][this.field3564[var18]]);
                }
                if (this.field3564[var18] < class62.field948[var18].length) {
                    var17.method383(class92.field1333[var18], class62.field948[var18][this.field3564[var18]]);
                }
            }
            var11 = var17.method379(64, 768, -50, -10, -50);
            class146.field2223.method1436(false, var11, var9);
        }
        if (arg4 != null) {
            var11 = arg4.method1163(arg6, var11, arg2, arg3, (byte) 74);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([IZ[IZII)V", line = 209)
    public final void method1631(int[] arg0, boolean arg1, int[] arg2, boolean arg3, int arg4, int arg5) {
        field3551++;
        if (this.field3558 != arg5) {
            this.field3558 = arg5;
            this.field3550 = (int[][]) null;
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class287.field4427; var8++) {
                    class279 var9 = class45.method410(-67, var8);
                    if (var9 != null && !var9.field4281 && (arg1 ? class279.field4290[var7] : class177.field2641[var7]) == var9.field4279) {
                        arg2[class271.field4094[var7]] = class147.method1098(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field3547 = arg2;
        this.field3564 = arg0;
        if (!arg3) {
            this.method1635(87);
        }
        this.field3559 = arg4;
        this.field3553 = arg1;
        this.method1642(122);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ)V", line = 259)
    public final void method1632(int arg0, boolean arg1) {
        field3562++;
        this.field3553 = arg1;
        this.method1642(114);
        if (arg0 > -34) {
            this.method1642(96);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 271)
    public final void method1633(int arg0, int arg1, int arg2) {
        if (arg2 != -15998) {
            method1634(-63);
        }
        field3560++;
        this.field3564[arg0] = arg1;
        this.method1642(arg2 + 16123);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I", line = 290)
    public static final int method1634(int arg0) {
        field3554++;
        if (arg0 != 25) {
            method1634(-46);
        }
        return class58.field862.method1437(0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)I", line = 303)
    public final int method1635(int arg0) {
        if (arg0 != 128) {
            field3546 = (String[]) null;
        }
        field3565++;
        return this.field3559 == -1 ? (this.field3564[0] << 25) + (this.field3564[4] << 20) + (this.field3547[8] << 10) + (this.field3547[0] << 15) - (-(this.field3547[11] << 5) + -this.field3547[1]) : 305419896 - -class10.method78(this.field3559, 2).field2758;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BII)V", line = 318)
    public final void method1636(byte arg0, int arg1, int arg2) {
        field3549++;
        int var4 = class271.field4094[arg2];
        if (this.field3547[var4] == 0 || class45.method410(115, arg1) == null) {
            return;
        }
        if (arg0 <= 103) {
            this.field3548 = 25L;
        }
        this.field3547[var4] = class147.method1098(arg1, Integer.MIN_VALUE);
        this.method1642(124);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Loa;II)V", line = 340)
    public static final void method1637(class288 arg0, int arg1, int arg2) {
        if (arg2 != -18967) {
            return;
        }
        if (class312.field4852 < arg0.field4521) {
            class290.method2048(true, arg0);
        } else if (class312.field4852 <= arg0.field4474) {
            class135.method1033(arg0, 100);
        } else {
            class271.method1883(arg0, -122);
        }
        field3555++;
        if (arg0.field4507 < 128 || arg0.field4496 < 128 || arg0.field4507 >= 13184 || arg0.field4496 >= 13184) {
            arg0.field4526 = -1;
            arg0.field4439 = -1;
            arg0.field4521 = 0;
            arg0.field4474 = 0;
            arg0.field4507 = arg0.field4477[0] * 128 + arg0.method929(arg2 + 18979) * 64;
            arg0.field4496 = arg0.field4470[0] * 128 + arg0.method929(12) * 64;
            arg0.method2035((byte) -44);
        }
        if (class235.field3602 == arg0 && (arg0.field4507 < 1536 || arg0.field4496 < 1536 || arg0.field4507 >= 11776 || arg0.field4496 >= 11776)) {
            arg0.field4474 = 0;
            arg0.field4526 = -1;
            arg0.field4521 = 0;
            arg0.field4439 = -1;
            arg0.field4507 = arg0.field4477[0] * 128 + (arg0.method929(12) * 64);
            arg0.field4496 = arg0.field4470[0] * 128 + arg0.method929(12) * 64;
            arg0.method2035((byte) 116);
        }
        class34.method237(-122, arg0);
        class218.method1562(arg0, false);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I", line = 402)
    public static final int method1638(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        field3567++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 <= 80) {
            field3552 = (int[]) null;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 424)
    public static final void method1639(boolean arg0) {
        if (class305.field4771 == 10 && class36.field534) {
            class113.method889(124, 28);
        }
        field3570++;
        if (class305.field4771 == 30) {
            class113.method889(97, 25);
        }
        if (!arg0) {
            field3552 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z[Lek;IIII)V", line = 440)
    public static final void method1640(boolean arg0, class184[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field3561++;
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class184 var7 = arg1[var6];
            if (var7 != null && var7.field2974 == arg2) {
                class121.method927(arg5, (byte) 69, var7, arg0, arg3);
                class235.method1652(arg3, arg5, (byte) 24, var7);
                if ((var7.field2967 - var7.field2890) < var7.field2970) {
                    var7.field2970 = var7.field2967 - var7.field2890;
                }
                if (var7.field2808 > var7.field2882 - var7.field2904) {
                    var7.field2808 = var7.field2882 - var7.field2904;
                }
                if (var7.field2970 < 0) {
                    var7.field2970 = 0;
                }
                if (var7.field2808 < 0) {
                    var7.field2808 = 0;
                }
                if (var7.field2945 == 0) {
                    class184.method1339(var7, arg0, (byte) -128);
                }
            }
        }
        int var8 = 55 / ((-arg4 - 47) / 38);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILng;IIII[Lmf;Lng;ZI)Laj;", line = 488)
    public final class1 method1641(int arg0, int arg1, class162 arg2, int arg3, int arg4, int arg5, int arg6, class47[] arg7, class162 arg8, boolean arg9, int arg10) {
        field3556++;
        if (this.field3559 != -1) {
            return class10.method78(this.field3559, arg6 + 3).method1320(arg1, arg7, arg10, (byte) 31, arg2, arg3, arg8, arg5, arg0, arg4);
        }
        long var12 = this.field3548;
        int[] var14 = this.field3547;
        if (arg2 != null && (arg2.field2397 >= 0 || arg2.field2417 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3547[var15];
            }
            if (arg2.field2397 >= 0) {
                if (arg2.field2397 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class147.method1098(arg2.field2397, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg2.field2417 >= 0) {
                if (arg2.field2417 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class147.method1098(arg2.field2417, 1073741824);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class1 var16 = (class1) class58.field862.method1432((byte) 95, var12);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class45.method410(-118, var19 & 0x3FFFFFFF).method1965((byte) 87)) {
                        var17 = true;
                    }
                } else if (!class225.method1603(var19 & 0x3FFFFFFF, 0).method1898(-71, this.field3553)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3566 != -1L) {
                    var16 = (class1) class58.field862.method1432((byte) 126, this.field3566);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class42[] var20 = new class42[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class42 var24 = class225.method1603(var22 & 0x3FFFFFFF, 0).method1903(arg6 - 92, this.field3553);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((Integer.MIN_VALUE & var22) != 0) {
                        class42 var23 = class45.method410(arg6 - 111, var22 & 0x3FFFFFFF).method1964(40);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class132 var25 = null;
                if (this.field3558 != -1) {
                    var25 = class179.method1295(this.field3558, true);
                }
                if (var25 != null && var25.field2047 != null) {
                    for (int var26 = 0; var26 < var25.field2047.length; var26++) {
                        if (var25.field2047[var26] != null && var20[var26] != null) {
                            int var27 = var25.field2047[var26][0];
                            int var28 = var25.field2047[var26][1];
                            int var29 = var25.field2047[var26][3];
                            int var30 = var25.field2047[var26][2];
                            int var31 = var25.field2047[var26][5];
                            int var32 = var25.field2047[var26][4];
                            if (this.field3550 == null) {
                                this.field3550 = new int[var25.field2047.length][];
                            }
                            if (this.field3550[var26] == null) {
                                int[] var33 = this.field3550[var26] = new int[15];
                                if (var29 == 0 && var32 == 0 && var31 == 0) {
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[13] = -var28;
                                    var33[14] = -var30;
                                    var33[12] = -var27;
                                } else {
                                    int var34 = class56.field838[var29] >> 1;
                                    int var35 = class56.field830[var32] >> 1;
                                    int var36 = class56.field838[var32] >> 1;
                                    int var37 = class56.field830[var29] >> 1;
                                    int var38 = class56.field830[var31] >> 1;
                                    int var39 = class56.field838[var31] >> 1;
                                    var33[4] = var37 * var38 + 16384 >> 15;
                                    int var40 = var34 * var38 + 16384 >> 15;
                                    var33[7] = -var36 * -var39 + var35 * var40 + 16384 >> 15;
                                    var33[1] = -var39 * var35 + (var36 * var40) + 16384 >> 15;
                                    var33[13] = var33[7] * -var30 + (var33[4] * -var28 + var33[1] * -var27 + 16384) >> 15;
                                    var33[2] = var36 * var37 + 16384 >> 15;
                                    var33[8] = var35 * var37 + 16384 >> 15;
                                    var33[3] = var37 * var39 + 16384 >> 15;
                                    int var41 = var34 * var39 + 16384 >> 15;
                                    var33[0] = var35 * var38 + var36 * var41 + 16384 >> 15;
                                    var33[6] = var35 * var41 + (-var36 * var38 + 16384) >> 15;
                                    var33[5] = -var34;
                                    var33[14] = var33[5] * -var28 + var33[2] * -var27 + var33[8] * -var30 + 16384 >> 15;
                                    var33[12] = var33[6] * -var30 + var33[0] * -var27 + var33[3] * -var28 + 16384 >> 15;
                                }
                                var33[10] = var28;
                                var33[11] = var30;
                                var33[9] = var27;
                            }
                            if (var29 != 0 || var32 != 0 || var31 != 0) {
                                var20[var26].method399(var29, var32, var31);
                            }
                            if (var27 != 0 || var28 != 0 || var30 != 0) {
                                var20[var26].method394(var27, var28, var30);
                            }
                        }
                    }
                }
                class42 var42 = new class42(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (this.field3564[var43] < class37.field558[var43].length) {
                        var42.method383(class304.field4761[var43], class37.field558[var43][this.field3564[var43]]);
                    }
                    if (this.field3564[var43] < class62.field948[var43].length) {
                        var42.method383(class92.field1333[var43], class62.field948[var43][this.field3564[var43]]);
                    }
                }
                var16 = var42.method379(64, 850, -30, -50, -30);
                if (class36.field534) {
                    ((class165) var16).method1185(false, false, true, true, false, false, true);
                }
                if (arg9) {
                    class58.field862.method1436(false, var16, var12);
                    this.field3566 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg7 == null ? 0 : arg7.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg7[var49] != null) {
                class162 var50 = class173.method1259((byte) 119, arg7[var49].field720);
                if (var50.field2401 != null) {
                    var44 = true;
                    class299.field4689[var49] = var50;
                    int var51 = arg7[var49].field726;
                    int var52 = arg7[var49].field730;
                    int var53 = var50.field2401[var52];
                    class302.field4730[var49] = class41.method368(0, var53 >>> 16);
                    int var54 = var53 & 0xFFFF;
                    class260.field3856[var49] = var54;
                    if (class302.field4730[var49] != null) {
                        var46 |= class302.field4730[var49].method1149(var54, true);
                        var45 |= class302.field4730[var49].method1150(2, var54);
                        var47 |= var50.field2419;
                    }
                    if ((var50.field2411 || class16.field188) && var51 != -1 && var51 < var50.field2401.length) {
                        class97.field1437[var49] = var50.field2423[var52];
                        class17.field194[var49] = arg7[var49].field724;
                        int var55 = var50.field2401[var51];
                        class29.field349[var49] = class41.method368(0, var55 >>> 16);
                        int var56 = var55 & 0xFFFF;
                        class208.field3281[var49] = var56;
                        if (class29.field349[var49] != null) {
                            var46 |= class29.field349[var49].method1149(var56, true);
                            var45 |= class29.field349[var49].method1150(2, var56);
                        }
                    } else {
                        class97.field1437[var49] = 0;
                        class17.field194[var49] = 0;
                        class29.field349[var49] = null;
                        class208.field3281[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg2 == null && arg8 == null) {
            return var16;
        }
        int var57 = 0;
        int var58 = -1;
        int var59 = -1;
        class160 var60 = null;
        class160 var61 = null;
        if (arg2 != null) {
            int var62 = arg2.field2401[arg10];
            int var63 = var62 >>> 16;
            var59 = var62 & 0xFFFF;
            var60 = class41.method368(~arg6, var63);
            if (var60 != null) {
                var46 |= var60.method1149(var59, true);
                var45 |= var60.method1150(2, var59);
                var47 |= arg2.field2419;
            }
            if ((arg2.field2411 || class16.field188) && arg3 != -1 && arg2.field2401.length > arg3) {
                int var64 = arg2.field2401[arg3];
                var57 = arg2.field2423[arg10];
                int var65 = var64 >>> 16;
                var58 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var60;
                } else {
                    var61 = class41.method368(0, var58 >>> 16);
                }
                if (var61 != null) {
                    var46 |= var61.method1149(var58, true);
                    var45 |= var61.method1150(arg6 + 3, var58);
                }
            }
        }
        int var66 = -1;
        int var67 = arg6;
        class160 var68 = null;
        class160 var69 = null;
        int var70 = 0;
        if (arg8 != null) {
            int var71 = arg8.field2401[arg1];
            int var72 = var71 >>> 16;
            var66 = var71 & 0xFFFF;
            var68 = class41.method368(0, var72);
            if (var68 != null) {
                var46 |= var68.method1149(var66, true);
                var45 |= var68.method1150(arg6 ^ 0xFFFFFFFD, var66);
                var47 |= arg8.field2419;
            }
            if ((arg8.field2411 || class16.field188) && arg0 != -1 && arg0 < arg8.field2401.length) {
                int var73 = arg8.field2401[arg0];
                var70 = arg8.field2423[arg1];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var69 = var68;
                } else {
                    var69 = class41.method368(0, var67 >>> 16);
                }
                if (var69 != null) {
                    var46 |= var69.method1149(var67, true);
                    var45 |= var69.method1150(2, var67);
                }
            }
        }
        class1 var75 = var16.method30(!var45, !var46, !var47);
        int var76 = 0;
        int var77 = 1;
        while (var76 < var48) {
            if (class302.field4730[var76] != null) {
                var75.method24(class302.field4730[var76], class260.field3856[var76], class29.field349[var76], class208.field3281[var76], class17.field194[var76] - 1, class97.field1437[var76], var77, class299.field4689[var76].field2419, this.field3550[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var60 != null && var68 != null) {
            var75.method28(var60, var59, var61, var58, arg5 - 1, var57, var68, var66, var69, var67, arg4 - 1, var70, arg2.field2415, arg2.field2419 | arg8.field2419);
        } else if (var60 != null) {
            var75.method13(var60, var59, var61, var58, arg5 - 1, var57, arg2.field2419);
        } else if (var68 != null) {
            var75.method13(var68, var66, var69, var67, arg4 - 1, var70, arg8.field2419);
        }
        for (int var78 = 0; var78 < var48; var78++) {
            class302.field4730[var78] = null;
            class29.field349[var78] = null;
            class299.field4689[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 962)
    private final void method1642(int arg0) {
        field3557++;
        long var2 = this.field3548;
        if (arg0 < 108) {
            this.method1633(78, 86, -8);
        }
        this.field3548 = -1L;
        long[] var4 = class81.field1135;
        this.field3548 = this.field3548 >>> 8 ^ var4[(int) (((long) (this.field3558 >> 8) ^ this.field3548) & 0xFFL)];
        this.field3548 = this.field3548 >>> 8 ^ var4[(int) (((long) this.field3558 ^ this.field3548) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3548 = var4[(int) ((this.field3548 ^ (long) (this.field3547[var5] >> 24)) & 0xFFL)] ^ this.field3548 >>> 8;
            this.field3548 = this.field3548 >>> 8 ^ var4[(int) ((this.field3548 ^ (long) (this.field3547[var5] >> 16)) & 0xFFL)];
            this.field3548 = var4[(int) (((long) (this.field3547[var5] >> 8) ^ this.field3548) & 0xFFL)] ^ this.field3548 >>> 8;
            this.field3548 = var4[(int) (((long) this.field3547[var5] ^ this.field3548) & 0xFFL)] ^ this.field3548 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3548 = var4[(int) (((long) this.field3564[var6] ^ this.field3548) & 0xFFL)] ^ this.field3548 >>> 8;
        }
        this.field3548 = this.field3548 >>> 8 ^ var4[(int) (((long) (this.field3553 ? 1 : 0) ^ this.field3548) & 0xFFL)];
        if (var2 != 0L && this.field3548 != var2) {
            class58.field862.method1430(false, var2);
        }
    }
}
