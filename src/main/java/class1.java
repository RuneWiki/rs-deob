import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class119 {

    @OriginalMember(owner = "client!a", name = "Ic", descriptor = "I")
    public int field14 = 0;

    @OriginalMember(owner = "client!a", name = "xc", descriptor = "I")
    public int field3 = 0;

    @OriginalMember(owner = "client!a", name = "Hc", descriptor = "I")
    public int field13 = -1;

    @OriginalMember(owner = "client!a", name = "Jc", descriptor = "S")
    private short field15 = 0;

    @OriginalMember(owner = "client!a", name = "Oc", descriptor = "S")
    private short field20 = 0;

    @OriginalMember(owner = "client!a", name = "Ec", descriptor = "I")
    public int field10 = 0;

    @OriginalMember(owner = "client!a", name = "wc", descriptor = "Z")
    public boolean field2 = false;

    @OriginalMember(owner = "client!a", name = "Bc", descriptor = "I")
    public int field7 = 0;

    @OriginalMember(owner = "client!a", name = "Tc", descriptor = "I")
    public int field25 = -1;

    @OriginalMember(owner = "client!a", name = "Pc", descriptor = "I")
    public int field21 = 0;

    @OriginalMember(owner = "client!a", name = "Wc", descriptor = "Led;")
    public static class43 field28 = class191.method1219("Wir vermuten)1 dass Ihr Konto gestohlen wurde", false);

    @OriginalMember(owner = "client!a", name = "Uc", descriptor = "Ljg;")
    public static class89 field26 = new class89(new byte[5000]);

    @OriginalMember(owner = "client!a", name = "Yc", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "client!a", name = "Zc", descriptor = "Ln;")
    public static class118 field31 = new class118();

    @OriginalMember(owner = "client!a", name = "dd", descriptor = "Led;")
    private static class43 field35 = class191.method1219("level)2", false);

    @OriginalMember(owner = "client!a", name = "ed", descriptor = "Led;")
    public static class43 field36 = class191.method1219("null", false);

    @OriginalMember(owner = "client!a", name = "fd", descriptor = "Led;")
    public static class43 field37 = field35;

    @OriginalMember(owner = "client!a", name = "gd", descriptor = "Led;")
    private static class43 field38 = class191.method1219("Please wait )2 attempting to reestablish)3", false);

    @OriginalMember(owner = "client!a", name = "cd", descriptor = "Led;")
    public static class43 field34 = field38;

    @OriginalMember(owner = "client!a", name = "Fc", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!a", name = "Gc", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!a", name = "Kc", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!a", name = "Lc", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!a", name = "Mc", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!a", name = "Nc", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!a", name = "Qc", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!a", name = "Vc", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!a", name = "Xc", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!a", name = "ad", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!a", name = "yc", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!a", name = "zc", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!a", name = "Cc", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!a", name = "Dc", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!a", name = "bd", descriptor = "J")
    public static long field33;

    @OriginalMember(owner = "client!a", name = "Ac", descriptor = "Lw;")
    public class199 field6;

    @OriginalMember(owner = "client!a", name = "Rc", descriptor = "Led;")
    public class43 field23;

    @OriginalMember(owner = "client!a", name = "Sc", descriptor = "Lia;")
    public class75 field24;

    @OriginalMember(owner = "client!a", name = "vc", descriptor = "[[B")
    public static byte[][] field1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9;
        int var6 = class137.field2842.method1113(arg5, arg1, arg3);
        if (arg2 < 71) {
            field32 = 28;
        }
        if (~var6 != -1) {
            int var7 = class137.field2842.method1125(arg5, arg1, arg3, var6);
            int var8 = (210 & var7) >> 6;
            int var9 = var7 & 31;
            int[] var10 = class9.field161.field2388;
            int var11 = arg0;
            if (~var6 < -1) {
                var11 = arg4;
            }
            int var12 = (103 - arg3) * 512 * 4 + (24624 - -(arg1 * 4));
            int var13 = (var6 & 536860157) >> 14;
            class23 var14 = class92.method592(var13, (byte) 39);
            if (var14.field431 != -1) {
                class179 var15 = class66.field1330[var14.field431];
                if (var15 != null) {
                    int var16 = (var14.field423 * 4 + -var15.field3574) / 2;
                    int var17 = (var14.field424 * 4 - var15.field3576) / 2;
                    var15.method1163(arg1 * 4 + 48 + var16, (-arg3 + 104 + -var14.field424) * 4 + 48 + var17);
                }
            } else {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 - -1536] = var11;
                    } else if (~var8 != -2) {
                        if (~var8 != -3) {
                            if (~var8 == -4) {
                                var10[var12 - -1536] = var11;
                                var10[var12 - -1536 + 1] = var11;
                                var10[var12 + 2 - -1536] = var11;
                                var10[var12 + 1536 - -3] = var11;
                            }
                        } else {
                            var10[var12 + 3] = var11;
                            var10[var12 + 3 + 512] = var11;
                            var10[var12 + 1027] = var11;
                            var10[var12 + 1539] = var11;
                        }
                    } else {
                        var10[var12] = var11;
                        var10[var12 - -1] = var11;
                        var10[var12 - -2] = var11;
                        var10[var12 + 3] = var11;
                    }
                }
                if (~var9 == -4) {
                    if (~var8 == -1) {
                        var10[var12] = var11;
                    } else if (~var8 != -2) {
                        if (~var8 != -3) {
                            if (~var8 == -4) {
                                var10[var12 + 1536] = var11;
                            }
                        } else {
                            var10[var12 + 3 + 1536] = var11;
                        }
                    } else {
                        var10[var12 - -3] = var11;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var10[var12] = var11;
                        var10[var12 + 512] = var11;
                        var10[var12 + 1024] = var11;
                        var10[var12 + 1536] = var11;
                    } else if (~var8 == -1) {
                        var10[var12] = var11;
                        var10[var12 + 1] = var11;
                        var10[var12 + 2] = var11;
                        var10[var12 + 3] = var11;
                    } else if (~var8 == -2) {
                        var10[var12 + 3] = var11;
                        var10[var12 + 512 + 3] = var11;
                        var10[var12 + 3 + 1024] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    } else if (~var8 == -3) {
                        var10[var12 - -1536] = var11;
                        var10[var12 - -1536 + 1] = var11;
                        var10[var12 + 1538] = var11;
                        var10[var12 + 3 + 1536] = var11;
                    }
                }
            }
        }
        int var18 = class137.field2842.method1137(arg5, arg1, arg3);
        if (var18 != 0) {
            int var19 = class137.field2842.method1125(arg5, arg1, arg3, var18);
            int var20 = var18 >> 14 & 32767;
            int var21 = (var19 & 211) >> 6;
            class23 var22 = class92.method592(var20, (byte) 45);
            int var23 = var19 & 31;
            if (var22.field431 != -1) {
                class179 var24 = class66.field1330[var22.field431];
                if (var24 != null) {
                    int var25 = (var22.field424 * 4 + -var24.field3576) / 2;
                    int var26 = (var22.field423 * 4 + -var24.field3574) / 2;
                    var24.method1163(arg1 * 4 + 48 - -var26, (-var22.field424 + -arg3 + 104) * 4 + var25 + 48);
                }
            } else if (~var23 == -10) {
                int var27 = 15658734;
                if (~var18 < -1) {
                    var27 = 15597568;
                }
                int var28 = (-arg3 + 103) * 512 * 4 + arg1 * 4 + 24624;
                int[] var29 = class9.field161.field2388;
                if (~var21 != -1 && ~var21 != -3) {
                    var29[var28] = var27;
                    var29[var28 + 512 + 1] = var27;
                    var29[var28 + 1026] = var27;
                    var29[var28 - -1536 + 3] = var27;
                } else {
                    var29[var28 - -1536] = var27;
                    var29[var28 + 1024 + 1] = var27;
                    var29[var28 + 512 - -2] = var27;
                    var29[var28 + 3] = var27;
                }
            }
        }
        int var30 = class137.field2842.method1136(arg5, arg1, arg3);
        if (~var30 != -1) {
            int var31 = (536858854 & var30) >> 14;
            class23 var32 = class92.method592(var31, (byte) 70);
            if (~var32.field431 != 0) {
                class179 var33 = class66.field1330[var32.field431];
                if (var33 != null) {
                    int var34 = (var32.field423 * 4 - var33.field3574) / 2;
                    int var35 = (var32.field424 * 4 + -var33.field3576) / 2;
                    var33.method1163(arg1 * 4 + 48 + var34, (-arg3 + 104 - var32.field424) * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4;
        if (this.field24 != null) {
            class205 var10 = ~super.field2351 != 0 && ~super.field2355 == -1 ? class175.method1101(super.field2351, true) : null;
            class205 var11 = ~super.field2344 == 0 || this.field2 || super.field2344 == super.field2326 && var10 != null ? null : class175.method1101(super.field2344, true);
            class199 var12 = this.field24.method471(super.field2360, var11, -6, super.field2346, var10);
            if (var12 != null) {
                var12.method1304();
                super.field1819 = var12.field1819;
                if (~this.field15 != -1 && this.field20 != 0) {
                    int var13 = class135.field2797[arg0];
                    int var14 = class135.field2798[arg0];
                    short var15 = this.field15;
                    int var16 = -var15 / 2;
                    short var17 = this.field20;
                    int var18 = -var17 / 2;
                    int var19 = var13 * var18 - -(var14 * var16) >> 16;
                    int var20 = var14 * var18 + -(var13 * var16) >> 16;
                    int var21 = var15 / 2;
                    int var22 = -var17 / 2;
                    int var23 = class108.method668(super.field2328 + var20, super.field2347 + var19, -128, class93.field1839);
                    int var24 = var13 * var22 + var14 * var21 >> 16;
                    int var25 = var14 * var22 + -(var13 * var21) >> 16;
                    int var26 = class108.method668(super.field2328 + var25, super.field2347 + var24, -128, class93.field1839);
                    int var27 = -var15 / 2;
                    int var28 = var17 / 2;
                    int var29 = var13 * var28 + var14 * var27 >> 16;
                    int var30 = var14 * var28 + -(var13 * var27) >> 16;
                    int var31 = class108.method668(super.field2328 + var30, super.field2347 + var29, -128, class93.field1839);
                    int var32 = var15 / 2;
                    int var33 = var17 / 2;
                    int var34 = var13 * var33 - -(var14 * var32) >> 16;
                    int var35 = ~var26 < ~var23 ? var23 : var26;
                    int var36 = var14 * var33 + -(var13 * var32) >> 16;
                    int var37 = class108.method668(super.field2328 + var36, super.field2347 + var34, -127, class93.field1839);
                    int var38 = var31 >= var37 ? var37 : var31;
                    int var39 = ~var26 <= ~var37 ? var37 : var26;
                    int var40 = var23 >= var31 ? var31 : var23;
                    int var41 = (var35 + var38 + var39 + var40) / 4;
                    int var42 = 2047 & (int) (320.0D * Math.atan2((double) (var35 - var38), (double) var17));
                    var12.method1300(var42);
                    int var43 = (int) (Math.atan2((double) (var40 - var39), (double) var15) * 320.0D) & 2047;
                    var12.method1303(var43);
                    var12.method1297(0, var41 - super.field2338, 0);
                }
                class199 var44 = null;
                if (!this.field2 && ~super.field2364 != 0 && super.field2325 != -1) {
                    var44 = class16.method70(-1, super.field2364).method1237(-110, super.field2325);
                    if (var44 != null) {
                        var44.method1297(0, -super.field2366, 0);
                    }
                }
                class199 var45 = null;
                if (!this.field2 && this.field6 != null) {
                    if (this.field3 <= client.field559) {
                        this.field6 = null;
                    }
                    if (~this.field7 >= ~client.field559 && ~this.field3 < ~client.field559) {
                        var45 = this.field6;
                        var45.method1297(-super.field2347 + this.field5, -super.field2338 + this.field17, this.field11 - super.field2328);
                        if (super.field2372 == 512) {
                            var45.method1298();
                            var45.method1298();
                            var45.method1298();
                        } else if (super.field2372 == 1024) {
                            var45.method1298();
                            var45.method1298();
                        } else if (super.field2372 == 1536) {
                            var45.method1298();
                        }
                    }
                }
                if (var44 != null) {
                    var12 = ((class63) var12).method393(var44);
                }
                if (var45 != null) {
                    var12 = ((class63) var12).method393(var45);
                }
                var12.field3921 = true;
                var12.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var45 != null) {
                    if (super.field2372 != 512) {
                        if (~super.field2372 == -1025) {
                            var45.method1298();
                            var45.method1298();
                        } else if (super.field2372 == 1536) {
                            var45.method1298();
                            var45.method1298();
                            var45.method1298();
                        }
                    } else {
                        var45.method1298();
                    }
                    var45.method1297(-this.field5 + super.field2347, super.field2338 - this.field17, super.field2328 - this.field11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method3(byte arg0) {
        field28 = null;
        field31 = null;
        if (arg0 != -19) {
            field31 = null;
        }
        field38 = null;
        field34 = null;
        field35 = null;
        field37 = null;
        field1 = null;
        field26 = null;
        field36 = null;
    }

    @OriginalMember(owner = "client!a", name = "k", descriptor = "(I)Z")
    public final boolean method4(int arg0) {
        int var2 = -115 % ((-22 - arg0) / 34);
        ++field16;
        return this.field24 != null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljg;B)V")
    public final void method5(class89 arg0, byte arg1) {
        arg0.field1727 = 0;
        int var3 = -1;
        int var4 = arg0.method538((byte) 80);
        ++field29;
        boolean var5 = (4 & var4) != 0;
        int var6 = var4 & 1;
        if (~(var4 & 2) == -3) {
            this.field15 = (short) (arg0.method538((byte) -100) << 2);
            this.field20 = (short) (arg0.method538((byte) -63) << 2);
        } else {
            this.field15 = 0;
            this.field20 = 0;
        }
        super.field2327 = (var4 >> 3) - -1;
        int[] var7 = new int[12];
        this.field13 = arg0.method577((byte) 30);
        this.field25 = arg0.method577((byte) 30);
        this.field10 = 0;
        for (int var8 = 0; var8 < 12; ++var8) {
            int var9 = arg0.method538((byte) -39);
            if (var9 == 0) {
                var7[var8] = 0;
            } else {
                int var10 = arg0.method538((byte) 88);
                var7[var8] = (var9 << 8) + var10;
                if (~var8 == -1 && var7[0] == 65535) {
                    var3 = arg0.method555(-1113627096);
                    break;
                }
                if (~var7[var8] <= -513) {
                    int var15 = class2.method18(var7[var8] + -512, 0).field896;
                    if (var15 != 0) {
                        this.field10 = var15;
                    }
                }
            }
        }
        int[] var11 = new int[5];
        for (int var12 = 0; var12 < 5; ++var12) {
            int var14 = arg0.method538((byte) -81);
            if (~var14 > -1 || var14 >= class44.field869[var12].length) {
                var14 = 0;
            }
            var11[var12] = var14;
        }
        super.field2326 = arg0.method555(-1113627096);
        if (~super.field2326 == -65536) {
            super.field2326 = -1;
        }
        super.field2371 = arg0.method555(-1113627096);
        if (~super.field2371 == -65536) {
            super.field2371 = -1;
        }
        int var13 = 88 % ((80 - arg1) / 45);
        super.field2320 = super.field2371;
        super.field2323 = arg0.method555(-1113627096);
        if (~super.field2323 == -65536) {
            super.field2323 = -1;
        }
        super.field2378 = arg0.method555(-1113627096);
        if (~super.field2378 == -65536) {
            super.field2378 = -1;
        }
        super.field2361 = arg0.method555(-1113627096);
        if (super.field2361 == 65535) {
            super.field2361 = -1;
        }
        super.field2334 = arg0.method555(-1113627096);
        if (super.field2334 == 65535) {
            super.field2334 = -1;
        }
        super.field2336 = arg0.method555(-1113627096);
        if (~super.field2336 == -65536) {
            super.field2336 = -1;
        }
        this.field23 = class9.method47(arg0.method561((byte) 63), (byte) -106).method273(-64);
        this.field21 = arg0.method538((byte) -48);
        if (var5) {
            this.field14 = arg0.method555(-1113627096);
        }
        if (this.field24 == null) {
            this.field24 = new class75();
        }
        this.field24.method465((byte) 61, var11, ~var6 == -2, var3, var7);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([Lob;II)V")
    public static final void method6(class129[] arg0, int arg1, int arg2) {
        for (int var3 = arg1; ~var3 > ~arg0.length; ++var3) {
            class129 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2690 == 0) {
                    if (var4.field2626 != null) {
                        method6(var4.field2626, 0, arg2);
                    }
                    class137 var5 = (class137) class15.field227.method75((long) var4.field2664, 15);
                    if (var5 != null) {
                        class67.method416((byte) -65, arg2, var5.field2850);
                    }
                }
                if (~arg2 == -1 && var4.field2583 != null) {
                    class115 var6 = new class115();
                    var6.field2238 = var4.field2583;
                    var6.field2249 = var4;
                    class203.method1311(var6, 3538);
                }
                if (~arg2 == -2 && var4.field2657 != null) {
                    if (~var4.field2661 <= -1) {
                        class129 var7 = class124.method801((byte) -36, var4.field2664);
                        if (var7 == null || var7.field2626 == null || var7.field2626.length <= var4.field2661 || var7.field2626[var4.field2661] != var4) {
                            continue;
                        }
                    }
                    class115 var8 = new class115();
                    var8.field2238 = var4.field2657;
                    var8.field2249 = var4;
                    class203.method1311(var8, 3538);
                }
            }
        }
        ++field8;
    }
}
