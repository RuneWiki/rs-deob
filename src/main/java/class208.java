import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class208 extends class27 {

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "[[B")
    public static byte[][] field3041;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "[[I")
    public static int[][] field3040;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        field3039++;
        if (this.field379.field1171) {
            int[] var4 = this.method164(arg1, 24, 2);
            int[][] var5 = this.method168(0, arg0 + 28825, arg1);
            int[][] var6 = this.method168(1, 67, arg1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var3[2];
            int[] var11 = var5[1];
            int[] var12 = var6[1];
            int[] var13 = var5[2];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class209.field3053; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var8[var16] = var11[var16];
                    var10[var16] = var13[var16];
                } else if (var17 == 0) {
                    var7[var16] = var14[var16];
                    var8[var16] = var12[var16];
                    var10[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var14[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var12[var16] * var18 >> 12;
                    var10[var16] = var13[var16] * var17 + (var15[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILsb;I)V", line = 84)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field376 = arg1.method1319(255) == 1;
        }
        if (arg0 != -5836) {
            field3041 = (byte[][]) ((byte[][]) null);
        }
        field3044++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I", line = 100)
    public final int[] method18(int arg0, byte arg1) {
        field3045++;
        if (arg1 != -62) {
            return (int[]) null;
        }
        int[] var3 = this.field375.method2087(-122, arg0);
        if (this.field375.field4382) {
            int[] var4 = this.method164(arg0, 91, 0);
            int[] var5 = this.method164(arg0, 64, 1);
            int[] var6 = this.method164(arg0, 78, 2);
            for (int var7 = 0; var7 < class209.field3053; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lph;Lph;Z)V", line = 150)
    public static final void method1519(class361 arg0, class361 arg1, boolean arg2) {
        if (arg2) {
            method1522((byte) -46);
        }
        class89.field1244 = arg1;
        class133.field1947 = arg0;
        field3037++;
        class211.field3062 = class89.field1244.method2539(true, 3);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZLph;Lph;)Lkc;", line = 165)
    public static final class29 method1520(int arg0, int arg1, boolean arg2, class361 arg3, class361 arg4) {
        field3036++;
        if (arg2) {
            return class62.method508(0, arg1, arg0, arg4) ? class32.method231(1, arg3.method2520(arg1, arg0, (byte) -25)) : null;
        } else {
            return (class29) null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 179)
    public class208() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[BIIZIBIII[Lo;)[I", line = 187)
    public static final int[] method1521(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class96[] arg10) {
        field3038++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg7 & 0x7) * 8;
        if (!arg4) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class9.method54(arg5, true, var14 & 0x7, var13 & 0x7) + arg8;
                    int var16 = arg3 + class180.method1247(arg5, var13 & 0x7, var14 & 0x7, true);
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg10[arg9].field1349[var15][var16] = class287.method2076(arg10[arg9].field1349[var15][var16], -2097153);
                    }
                }
            }
        }
        byte var17;
        if (arg4) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        if (arg6 <= 17) {
            return (int[]) null;
        }
        class190 var18 = new class190(arg1);
        int var19 = arg7 & 0x1FFFFFF8 << 3;
        int var20 = arg2 & 0x1FFFFFF8 << 3;
        byte var21 = 0;
        byte var22 = 0;
        if (arg5 == 1) {
            var22 = 1;
        } else if (arg5 == 2) {
            var22 = 1;
            var21 = 1;
        } else if (arg5 == 3) {
            var21 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg0 != var23 || var24 < var11 || (var11 + 8) < var24 || var12 > var25 || var25 > (var12 + 8)) {
                        class165.method1178(false, -1, var18, 0, 0, arg4, 0, -1, 0, 0, 0, 0);
                    } else if (var11 + 8 == var24 || (var12 + 8) == var25) {
                        int var32;
                        int var33;
                        if (arg5 == 0) {
                            var32 = arg8 + var24 - var11;
                            var33 = arg3 + var25 - var12;
                        } else if (arg5 == 1) {
                            var32 = arg8 + var25 - var12;
                            var33 = arg3 + var11 + 8 - var24;
                        } else if (arg5 == 2) {
                            var32 = arg8 - (var24 - var11 - 8);
                            var33 = var12 + arg3 + 8 - var25;
                        } else {
                            var32 = arg8 + var12 + 8 - var25;
                            var33 = var24 + arg3 - var11;
                        }
                        class165.method1178(true, var33, var18, arg9, 0, arg4, 0, var32, 0, 0, var19 + var25, var20 + var24);
                    } else {
                        int var26 = class9.method54(arg5, true, var25 & 0x7, var24 & 0x7) + arg8;
                        int var27 = arg3 + class180.method1247(arg5, var24 & 0x7, var25 & 0x7, true);
                        class165.method1178(false, var27, var18, arg9, arg5, arg4, var21, var26, 0, var22, var19 + var25, var20 + var24);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg5 == 0) {
                                var30 = arg8 + var28 - var11;
                                var31 = var29 + arg3 - var12;
                            } else if (arg5 == 1) {
                                var30 = var29 + arg8 - var12;
                                var31 = var11 + arg3 + 8 - var28;
                            } else if (arg5 == 2) {
                                var30 = arg8 + var11 + 8 - var28;
                                var31 = arg3 - (var29 - var12 - 8);
                            } else {
                                var30 = var12 + arg8 + 8 - var29;
                                var31 = arg3 + var28 - var11;
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class132.field1930[arg9][var30][var31] = class132.field1930[arg9][var21 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var18.field2718.length > var18.field2776) {
            int var36 = var18.method1319(255);
            if (var36 == 128) {
                var35 = true;
                class343.field5299[0] = var18.method1317((byte) 64);
                class343.field5299[1] = var18.method1347((byte) 61);
                class343.field5299[2] = var18.method1347((byte) 61);
                class343.field5299[3] = var18.method1347((byte) 61);
                class343.field5299[4] = var18.method1317((byte) 35);
            } else {
                if (var36 != 129) {
                    var18.field2776--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var18.method1322(9813);
                    if (var38 == 0) {
                        if (arg0 >= var37) {
                            int var39 = arg8;
                            if (arg8 < 0) {
                                var39 = 0;
                            } else if (arg8 >= 104) {
                                var39 = 104;
                            }
                            int var40 = arg8 + 7;
                            if (var40 < 0) {
                                var40 = 0;
                            } else if (var40 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg3;
                            if (arg3 < 0) {
                                var41 = 0;
                            } else if (arg3 >= 104) {
                                var41 = 104;
                            }
                            int var42 = arg3 + 7;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            while (var39 < var40) {
                                while (var41 < var42) {
                                    class286.field4309[arg9][var39][var41] = 0;
                                    var41++;
                                }
                                var39++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var43 = 0; var43 < 64; var43 += 4) {
                            for (int var44 = 0; var44 < 64; var44 += 4) {
                                byte var45 = var18.method1322(9813);
                                if (var37 <= arg0) {
                                    for (int var46 = var43; var46 < var43 + 4; var46++) {
                                        for (int var47 = var44; var47 < (var44 + 4); var47++) {
                                            if (var11 <= var46 && var11 + 8 > var46 && var12 <= var47 && var12 + 8 > var12) {
                                                int var48 = class9.method54(arg5, true, var47 & 0x7, var46 & 0x7) + arg8;
                                                int var49 = arg3 + class180.method1247(arg5, var46 & 0x7, var47 & 0x7, true);
                                                if (var48 >= 0 && var48 < 104 && var49 >= 0 && var49 < 104) {
                                                    class286.field4309[arg9][var48][var49] = var45;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 == 2) {
                    }
                }
            }
        }
        if (class141.field2031 && !arg4) {
            class2 var50 = null;
            while (true) {
                while (var18.field2776 < var18.field2718.length) {
                    int var51 = var18.method1319(255);
                    if (var51 == 0) {
                        var50 = new class2(var18);
                    } else if (var51 == 1) {
                        int var52 = var18.method1319(255);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class277 var54 = new class277(var18);
                                if (var54.field4196 == 31) {
                                    class207 var55 = class20.method127((byte) -91, var18.method1317((byte) 98));
                                    var54.method2026(var55.field3030, var55.field3023, var55.field3024, var55.field3033, 0);
                                }
                                int var56 = var54.field4222 >> 7;
                                int var57 = var54.field4208 >> 7;
                                if (var54.field4214 == arg0 && var56 >= var11 && var11 + 8 > var56 && var12 <= var57 && var57 < var12 + 8) {
                                    int var58 = (arg8 << 7) + class149.method1049(var54.field4222 & 0x3FF, arg5, var54.field4208 & 0x3FF, 94);
                                    int var59 = class321.method2234(var54.field4208 & 0x3FF, 128, var54.field4222 & 0x3FF, arg5) + (arg3 << 7);
                                    var54.field4222 = var58;
                                    int var60 = var54.field4222 >> 7;
                                    var54.field4208 = var59;
                                    int var61 = var54.field4208 >> 7;
                                    if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                                        var54.field4218 = (class230.field3491[1][var60][var61] & 0x2) != 0;
                                        var54.field4224 = class132.field1930[var54.field4214][var60][var61] - var54.field4224;
                                        class268.method1976(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class2();
                        }
                        var50.method10(var18, -106);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class2();
                }
                class73.field1070[arg8 >> 3][arg3 >> 3] = var50;
                break;
            }
        }
        if (!var34) {
            int var62 = arg8 + 7;
            int var63 = arg3 + 7;
            for (int var64 = arg8; var64 < var62; var64++) {
                for (int var65 = arg3; var65 < var63; var65++) {
                    class286.field4309[arg9][var64][var65] = 0;
                }
            }
        }
        return var35 ? class343.field5299 : null;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V", line = 652)
    public static final void method1522(byte arg0) {
        class256.field3833.method2317(arg0 ^ 0x3B);
        class131.field1889 = 1;
        field3043++;
        class124.field1807 = null;
        if (arg0 != -39) {
            field3041 = (byte[][]) ((byte[][]) null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V", line = 672)
    public static void method1523(int arg0) {
        field3040 = (int[][]) null;
        field3041 = (byte[][]) null;
        if (arg0 != 19121) {
            field3041 = (byte[][]) ((byte[][]) null);
        }
    }
}
