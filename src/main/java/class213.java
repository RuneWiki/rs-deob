import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class213 extends class215 {

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    private int field3414 = 6;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "I")
    public static int field3417 = 0;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "[I")
    public static int[] field3426 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "Z")
    public static boolean field3429 = true;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!ea", name = "U", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "Lib;")
    public static class56 field3428;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "[Lib;")
    public static class56[] field3422;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
    public static void method1492(int arg0) {
        field3428 = null;
        field3422 = null;
        int var1 = -79 / ((46 - arg0) / 61);
        field3426 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1493(String arg0, byte arg1) {
        ++field3413;
        int var2 = 40 % ((arg1 - -42) / 37);
        String var3 = class145.method1013(class185.method1296((byte) -103, arg0), 32);
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class213() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
    public static final void method1494(byte arg0) {
        class27.field365.method1701((byte) 40);
        if (arg0 <= -107) {
            ++field3418;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILwb;B)V")
    public static final void method1495(int arg0, int arg1, class123 arg2, byte arg3) {
        ++field3415;
        if (class5.field75 == null && !class262.field4250) {
            if (arg2 != null && class99.method613(arg2, false) != null) {
                class5.field75 = arg2;
                class150.field2343 = class99.method613(arg2, false);
                int var4 = -98 % ((arg3 - -17) / 49);
                class262.field4244 = 0;
                class293.field4652 = false;
                class148.field2331 = arg1;
                class189.field3069 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field3430;
            int[] var3 = super.field3445.method1755(arg0, (byte) 109);
            if (super.field3445.field4163) {
                int[] var4 = this.method1503(-1, 0, arg0);
                int[] var5 = this.method1503(-1, 1, arg0);
                int var6 = this.field3414;
                if (~var6 != -2) {
                    if (var6 != 2) {
                        if (~var6 != -4) {
                            if (~var6 != -5) {
                                if (~var6 != -6) {
                                    if (~var6 != -7) {
                                        if (~var6 != -8) {
                                            if (var6 != 8) {
                                                if (~var6 != -10) {
                                                    if (var6 != 10) {
                                                        if (var6 != 11) {
                                                            if (~var6 == -13) {
                                                                for (int var7 = 0; ~class244.field4015 < ~var7; ++var7) {
                                                                    int var8 = var5[var7];
                                                                    int var9 = var4[var7];
                                                                    var3[var7] = -(var8 * var9 >> 11) + var9 - -var8;
                                                                }
                                                            }
                                                        } else {
                                                            for (int var10 = 0; class244.field4015 > var10; ++var10) {
                                                                int var11 = var5[var10];
                                                                int var12 = var4[var10];
                                                                var3[var10] = ~var11 <= ~var12 ? -var12 + var11 : -var11 + var12;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var13 = 0; ~var13 > ~class244.field4015; ++var13) {
                                                            int var14 = var5[var13];
                                                            int var15 = var4[var13];
                                                            var3[var13] = var15 <= var14 ? var14 : var15;
                                                        }
                                                    }
                                                } else {
                                                    for (int var16 = 0; var16 < class244.field4015; ++var16) {
                                                        int var17 = var4[var16];
                                                        int var18 = var5[var16];
                                                        var3[var16] = var18 <= var17 ? var18 : var17;
                                                    }
                                                }
                                            } else {
                                                for (int var19 = 0; ~var19 > ~class244.field4015; ++var19) {
                                                    int var20 = var4[var19];
                                                    var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                                }
                                            }
                                        } else {
                                            for (int var21 = 0; class244.field4015 > var21; ++var21) {
                                                int var22 = var4[var21];
                                                var3[var21] = ~var22 == -4097 ? 4096 : (var5[var21] << 12) / (-var22 + 4096);
                                            }
                                        }
                                    } else {
                                        for (int var23 = 0; var23 < class244.field4015; ++var23) {
                                            int var24 = var5[var23];
                                            var3[var23] = var24 < 2048 ? var4[var23] * var24 >> 11 : 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11);
                                        }
                                    }
                                } else {
                                    for (int var25 = 0; var25 < class244.field4015; ++var25) {
                                        var3[var25] = 4096 - ((-var4[var25] + 4096) * (-var5[var25] + 4096) >> 12);
                                    }
                                }
                            } else {
                                for (int var26 = 0; ~class244.field4015 < ~var26; ++var26) {
                                    int var27 = var5[var26];
                                    var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                                }
                            }
                        } else {
                            for (int var28 = 0; ~class244.field4015 < ~var28; ++var28) {
                                var3[var28] = var4[var28] * var5[var28] >> 12;
                            }
                        }
                    } else {
                        for (int var29 = 0; var29 < class244.field4015; ++var29) {
                            var3[var29] = var4[var29] + -var5[var29];
                        }
                    }
                } else {
                    for (int var30 = 0; ~var30 > ~class244.field4015; ++var30) {
                        var3[var30] = var4[var30] + var5[var30];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3427;
        if (~arg0 == ~arg4 && arg2 == arg6 && arg1 == arg8 && ~arg3 == ~arg7) {
            class230.method1633(arg3, arg2, arg1, arg4, true, arg5);
        } else {
            int var10 = arg4;
            int var11 = arg2;
            int var12 = arg4 * 3;
            int var13 = arg0 * 3;
            int var14 = arg2 * 3;
            int var15 = arg6 * 3;
            int var16 = arg8 * 3;
            int var17 = arg7 * 3;
            int var18 = arg1 - -var13 + -var16 + -arg4;
            int var19 = -var17 + arg3 + var15 + -arg2;
            int var20 = -var13 + var16 + -var13 + var12;
            int var21 = -var15 + var14 + -var15 + var17;
            int var22 = -var14 + var15;
            int var23 = -var12 + var13;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var23 * var24;
                int var32 = (var27 + var30 - -var31 >> 12) + arg4;
                int var33 = var22 * var24;
                int var34 = (var28 + var29 - -var33 >> 12) + arg2;
                class230.method1633(var34, var11, var32, var10, true, arg5);
                var10 = var32;
                var11 = var34;
            }
        }
        if (arg9 != 4096) {
            field3428 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)[[I")
    public final int[][] method46(int arg0, int arg1) {
        int[][] var3 = super.field3461.method1126(1, arg1);
        if (super.field3461.field2591) {
            int[][] var4 = this.method1504(-112, 0, arg1);
            int[][] var5 = this.method1504(-88, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3414;
            if (var15 != 1) {
                if (~var15 != -3) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (var15 != 6) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (~var15 != -11) {
                                                    if (var15 != 11) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; class244.field4015 > var16; ++var16) {
                                                                int var17 = var9[var16];
                                                                int var18 = var11[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var10[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var14[var16];
                                                                var6[var16] = var17 - -var19 + -(var17 * var19 >> 11);
                                                                var7[var16] = var20 - (-var21 - -(var20 * var21 >> 11));
                                                                var8[var16] = var18 + var22 + -(var18 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class244.field4015; ++var23) {
                                                            int var24 = var9[var23];
                                                            int var25 = var13[var23];
                                                            int var26 = var10[var23];
                                                            int var27 = var11[var23];
                                                            int var28 = var12[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var24 < ~var28 ? -var28 + var24 : -var24 + var28;
                                                            var7[var23] = ~var25 > ~var26 ? -var25 + var26 : -var26 + var25;
                                                            var8[var23] = ~var27 < ~var29 ? -var29 + var27 : -var27 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; ~var30 > ~class244.field4015; ++var30) {
                                                        int var31 = var14[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var13[var30];
                                                        var6[var30] = var35 <= var32 ? var32 : var35;
                                                        var7[var30] = ~var36 > ~var34 ? var34 : var36;
                                                        var8[var30] = ~var33 < ~var31 ? var33 : var31;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class244.field4015; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var10[var37];
                                                    int var41 = var12[var37];
                                                    int var42 = var9[var37];
                                                    int var43 = var14[var37];
                                                    var6[var37] = var42 >= var41 ? var41 : var42;
                                                    var7[var37] = var40 < var38 ? var40 : var38;
                                                    var8[var37] = var43 <= var39 ? var43 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class244.field4015; ++var44) {
                                                int var45 = var11[var44];
                                                int var46 = var10[var44];
                                                int var47 = var9[var44];
                                                var6[var44] = ~var47 != -1 ? 4096 - (-var12[var44] + 4096 << 12) / var47 : 0;
                                                var7[var44] = var46 == 0 ? 0 : -((4096 - var13[var44] << 12) / var46) + 4096;
                                                var8[var44] = var45 == 0 ? 0 : -((-var14[var44] + 4096 << 12) / var45) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class244.field4015 > var48; ++var48) {
                                            int var49 = var9[var48];
                                            int var50 = var11[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var49 != 4096 ? (var12[var48] << 12) / (-var49 + 4096) : 4096;
                                            var7[var48] = ~var51 == -4097 ? 4096 : (var13[var48] << 12) / (-var51 + 4096);
                                            var8[var48] = ~var50 != -4097 ? (var14[var48] << 12) / (-var50 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class244.field4015; ++var52) {
                                        int var53 = var12[var52];
                                        int var54 = var14[var52];
                                        int var55 = var13[var52];
                                        var6[var52] = ~var53 <= -2049 ? -((-var9[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var9[var52] * var53 >> 11;
                                        var7[var52] = var55 < 2048 ? var10[var52] * var55 >> 11 : -((-var10[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                        var8[var52] = var54 >= 2048 ? -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096 : var11[var52] * var54 >> 11;
                                    }
                                }
                            } else {
                                for (int var56 = 0; class244.field4015 > var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~class244.field4015 < ~var57; ++var57) {
                                int var58 = var13[var57];
                                int var59 = var14[var57];
                                int var60 = var12[var57];
                                var6[var57] = var60 == 0 ? 4096 : (var9[var57] << 12) / var60;
                                var7[var57] = var58 == 0 ? 4096 : (var10[var57] << 12) / var58;
                                var8[var57] = ~var59 == -1 ? 4096 : (var11[var57] << 12) / var59;
                            }
                        }
                    } else {
                        for (int var61 = 0; class244.field4015 > var61; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~class244.field4015 < ~var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class244.field4015 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        if (arg0 != -1) {
            field3428 = null;
        }
        ++field3420;
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)V")
    public static final void method1497(int arg0, int arg1) {
        ++field3416;
        if (~arg1 <= -1 && ~arg1 > ~class297.field4698.length) {
            int var2 = -3 / ((arg0 - -5) / 51);
            class297.field4698[arg1] = !class297.field4698[arg1];
        }
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)V")
    public static final void method1498(int arg0) {
        ++field3425;
        if (class35.field448 != 0) {
            try {
                if (~(++class14.field184) < -1501) {
                    if (class28.field400 != null) {
                        class28.field400.method1210(-1);
                        class28.field400 = null;
                    }
                    if (class235.field3883 >= 1) {
                        class35.field448 = 0;
                        class50.field650 = -5;
                        return;
                    }
                    class35.field448 = 1;
                    ++class235.field3883;
                    class14.field184 = 0;
                    if (class70.field873 == class183.field2906) {
                        class70.field873 = class23.field303;
                    } else {
                        class70.field873 = class183.field2906;
                    }
                }
                if (class35.field448 == 1) {
                    class108.field1455 = class194.field3107.method269((byte) 93, class70.field873, class131.field2092);
                    class35.field448 = 2;
                }
                if (arg0 >= -24) {
                    method1494((byte) 92);
                }
                if (~class35.field448 == -3) {
                    if (class108.field1455.field3995 == 2) {
                        throw new IOException();
                    }
                    if (~class108.field1455.field3995 != -2) {
                        return;
                    }
                    class28.field400 = new class175((Socket) class108.field1455.field3992, class194.field3107);
                    class108.field1455 = null;
                    class28.field400.method1211(class4.field57.field1228, true, 0, class4.field57.field1218);
                    if (class128.field2048 != null) {
                        class128.field2048.method155(0);
                    }
                    if (class47.field597 != null) {
                        class47.field597.method155(0);
                    }
                    int var1 = class28.field400.method1216((byte) 29);
                    if (class128.field2048 != null) {
                        class128.field2048.method155(0);
                    }
                    if (class47.field597 != null) {
                        class47.field597.method155(0);
                    }
                    if (var1 != 101) {
                        class50.field650 = var1;
                        class35.field448 = 0;
                        class28.field400.method1210(-1);
                        class28.field400 = null;
                        return;
                    }
                    class35.field448 = 3;
                }
                if (~class35.field448 == -4) {
                    if (~class28.field400.method1217(-116) <= -3) {
                        int var2 = class28.field400.method1216((byte) 29) << 8 | class28.field400.method1216((byte) 29);
                        class251.method1728(var2, 0);
                        if (class115.field1638 == -1) {
                            class50.field650 = 6;
                            class35.field448 = 0;
                            class28.field400.method1210(-1);
                            class28.field400 = null;
                        } else {
                            class35.field448 = 0;
                            class28.field400.method1210(-1);
                            class28.field400 = null;
                            class56.method319((byte) -118);
                        }
                    }
                }
            } catch (IOException var3) {
                if (class28.field400 != null) {
                    class28.field400.method1210(-1);
                    class28.field400 = null;
                }
                if (~class235.field3883 <= -2) {
                    class35.field448 = 0;
                    class50.field650 = -4;
                } else {
                    class35.field448 = 1;
                    ++class235.field3883;
                    class14.field184 = 0;
                    if (~class70.field873 != ~class183.field2906) {
                        class70.field873 = class183.field2906;
                    } else {
                        class70.field873 = class23.field303;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)V")
    public static final void method1499(byte arg0) {
        ++field3423;
        if (arg0 < 55) {
            field3422 = null;
        }
        if (!class108.field1503) {
            class108.field1503 = true;
            class253.field4120 = true;
            if (class129.field2065) {
                class226.field3639 = (float) (-128 & (int) class226.field3639 - -191);
            } else {
                class67.field847 += (-class67.field847 + 24.0F) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
    public static final void method1500(int arg0, byte arg1) {
        class36.field463.method1695(arg0, 0);
        ++field3424;
        class36.field466.method1695(arg0, 0);
        if (arg1 != 101) {
            method1498(-16);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field3431;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field3453 = arg2.method584(arg0 + -1521146093) == 1;
            }
        } else {
            this.field3414 = arg2.method584(255);
        }
        if (arg0 != 1521146348) {
            method1495(-122, 37, (class123) null, (byte) 88);
        }
    }
}
