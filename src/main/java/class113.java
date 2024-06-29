import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class113 extends class156 {

    @OriginalMember(owner = "client!me", name = "wb", descriptor = "Lsd;")
    public static class166 field2203 = class135.method935(":assistreq:", 0);

    @OriginalMember(owner = "client!me", name = "yb", descriptor = "Lsd;")
    public static class166 field2205 = class135.method935(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "[Z")
    public static boolean[] field2196 = new boolean[8];

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "Lsd;")
    public static class166 field2198 = class135.method935("Hidden)2use", 0);

    @OriginalMember(owner = "client!me", name = "vb", descriptor = "Lsd;")
    private static class166 field2202 = class135.method935("Connection timed out)3", 0);

    @OriginalMember(owner = "client!me", name = "Cb", descriptor = "I")
    public static int field2209 = 0;

    @OriginalMember(owner = "client!me", name = "Bb", descriptor = "[J")
    public static long[] field2208 = new long[100];

    @OriginalMember(owner = "client!me", name = "sb", descriptor = "Lsd;")
    public static class166 field2199 = class135.method935("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!me", name = "Ab", descriptor = "Lsd;")
    public static class166 field2207 = field2202;

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!me", name = "tb", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!me", name = "xb", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!me", name = "zb", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILff;IIII)V")
    public static final void method826(int arg0, int arg1, int arg2, class53 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2197;
        if (arg7 < 12) {
            field2205 = null;
        }
        if (arg5 >= 0 && arg5 < 104 && ~arg4 <= -1 && ~arg4 > -105) {
            class122.field2387[arg6][arg5][arg4] = 0;
            while (true) {
                int var8 = arg3.method400(255);
                if (~var8 == -1) {
                    if (~arg6 != -1) {
                        class74.field1511[arg6][arg5][arg4] = class74.field1511[arg6 + -1][arg5][arg4] + -240;
                        return;
                    } else {
                        class74.field1511[0][arg5][arg4] = 8 * -class69.method559(arg4 + 556238 + arg2, (byte) -127, 932731 - -arg5 - -arg0);
                        return;
                    }
                }
                if (~var8 == -2) {
                    int var9 = arg3.method400(255);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg6 != 0) {
                        class74.field1511[arg6][arg5][arg4] = class74.field1511[arg6 + -1][arg5][arg4] + -(var9 * 8);
                        return;
                    }
                    class74.field1511[0][arg5][arg4] = -var9 * 8;
                    return;
                }
                if (var8 <= 49) {
                    class190.field3620[arg6][arg5][arg4] = arg3.method388(-29381);
                    class187.field3572[arg6][arg5][arg4] = (byte) ((var8 + -2) / 4);
                    class150.field2917[arg6][arg5][arg4] = (byte) class22.method151(3, arg1 + -2 + var8);
                } else if (~var8 >= -82) {
                    class122.field2387[arg6][arg5][arg4] = (byte) (var8 + -49);
                } else {
                    class102.field1981[arg6][arg5][arg4] = (byte) (var8 + -81);
                }
            }
        } else {
            while (true) {
                int var10 = arg3.method400(255);
                if (var10 == 0) {
                    return;
                }
                if (~var10 == -2) {
                    arg3.method400(255);
                    return;
                }
                if (~var10 >= -50) {
                    arg3.method400(255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field2201;
            int[][] var3 = super.field1207.method528(58, arg1);
            if (super.field1207.field1320 && this.method1046((byte) -60)) {
                int[] var4 = var3[2];
                int[] var5 = var3[1];
                int[] var6 = var3[0];
                int var7 = arg1 % super.field2978 * super.field2978;
                for (int var8 = 0; class98.field1879 > var8; ++var8) {
                    int var9 = super.field2985[var8 % super.field2980 + var7];
                    var4[var8] = class22.method151(255, var9) << 4;
                    var5[var8] = class22.method151(65280, var9) >> 4;
                    var6[var8] = class22.method151(var9 >> 12, 4080);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIII)I")
    public static final int method827(int arg0, int arg1, int arg2, int arg3) {
        ++field2206;
        if (~(class122.field2387[arg3][arg2][arg0] & 8) != -1) {
            return 0;
        } else if (arg3 > 0 && ~(class122.field2387[1][arg2][arg0] & 2) != -1) {
            return arg3 + -1;
        } else {
            int var4 = -64 % ((75 - arg1) / 47);
            return arg3;
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)Z")
    public static final boolean method828(int arg0) {
        ++field2200;
        long var1 = class100.method748((byte) 35);
        int var3 = (int) (-class19.field330 + var1);
        if (~var3 < -201) {
            var3 = 200;
        }
        class19.field330 = var1;
        class41.field727 += var3;
        if (~class120.field2357 == arg0 && ~class137.field2677 == -1 && class34.field629 == 0 && class184.field3518 == 0) {
            return true;
        } else if (class156.field2997 == null) {
            return false;
        } else {
            try {
                if (~class41.field727 < -30001) {
                    throw new IOException();
                } else {
                    while (~class137.field2677 > -21 && ~class184.field3518 < -1) {
                        class89 var4 = (class89) class6.field124.method221(0);
                        class53 var5 = new class53(4);
                        var5.method429(1, (byte) 122);
                        var5.method392(arg0 ^ 113, (int) var4.field2541);
                        class156.field2997.method15(4, 0, (byte) -81, var5.field988);
                        class178.field3370.method216(var4, 12682, var4.field2541);
                        --class184.field3518;
                        ++class137.field2677;
                    }
                    while (~class120.field2357 > -21 && class34.field629 > 0) {
                        class89 var6 = (class89) class136.field2656.method776(139);
                        class53 var7 = new class53(4);
                        var7.method429(0, (byte) 103);
                        var7.method392(arg0 ^ -15, (int) var6.field2541);
                        class156.field2997.method15(4, 0, (byte) -92, var7.field988);
                        var6.method116(arg0 + 257);
                        class45.field808.method216(var6, arg0 + 12683, var6.field2541);
                        ++class120.field2357;
                        --class34.field629;
                    }
                    for (int var8 = 0; var8 < 100; ++var8) {
                        int var9 = class156.field2997.method16((byte) -13);
                        if (~var9 > -1) {
                            throw new IOException();
                        }
                        if (~var9 == -1) {
                            break;
                        }
                        class41.field727 = 0;
                        byte var10 = 0;
                        if (class145.field2837 != null) {
                            if (~class179.field3389 == -1) {
                                var10 = 1;
                            }
                        } else {
                            var10 = 8;
                        }
                        if (~var10 < -1) {
                            int var11 = var10 - class22.field383.field1000;
                            if (~var9 > ~var11) {
                                var11 = var9;
                            }
                            class156.field2997.method13(class22.field383.field988, true, class22.field383.field1000, var11);
                            if (class128.field2514 != 0) {
                                for (int var12 = 0; var12 < var11; ++var12) {
                                    class22.field383.field988[class22.field383.field1000 - -var12] = (byte) class178.method1209(class22.field383.field988[class22.field383.field1000 + var12], class128.field2514);
                                }
                            }
                            class22.field383.field1000 += var11;
                            if (~var10 < ~class22.field383.field1000) {
                                break;
                            }
                            if (class145.field2837 == null) {
                                class22.field383.field1000 = 0;
                                int var13 = class22.field383.method400(255);
                                int var14 = class22.field383.method405(arg0 ^ -3);
                                int var15 = class22.field383.method400(255);
                                int var16 = class22.field383.method419(-4);
                                long var17 = (long) ((var13 << 16) + var14);
                                class89 var19 = (class89) class178.field3370.method224(-1, var17);
                                class111.field2148 = true;
                                if (var19 == null) {
                                    var19 = (class89) class45.field808.method224(-1, var17);
                                    class111.field2148 = false;
                                }
                                if (var19 == null) {
                                    throw new IOException();
                                }
                                class145.field2837 = var19;
                                int var20 = var15 == 0 ? 5 : 9;
                                class60.field1237 = new class53(var16 + var20 + class145.field2837.field1745);
                                class60.field1237.method429(var15, (byte) 115);
                                class60.field1237.method438(423055928, var16);
                                class22.field383.field1000 = 0;
                                class179.field3389 = 8;
                            } else if (~class179.field3389 == -1) {
                                if (~class22.field383.field988[0] != 0) {
                                    class145.field2837 = null;
                                } else {
                                    class22.field383.field1000 = 0;
                                    class179.field3389 = 1;
                                }
                            }
                        } else {
                            int var21 = class60.field1237.field988.length - class145.field2837.field1745;
                            int var22 = -class179.field3389 + 512;
                            if (-class60.field1237.field1000 + var21 < var22) {
                                var22 = -class60.field1237.field1000 + var21;
                            }
                            if (var9 < var22) {
                                var22 = var9;
                            }
                            class156.field2997.method13(class60.field1237.field988, true, class60.field1237.field1000, var22);
                            if (class128.field2514 != 0) {
                                for (int var23 = 0; ~var22 < ~var23; ++var23) {
                                    class60.field1237.field988[class60.field1237.field1000 + var23] = (byte) class178.method1209(class60.field1237.field988[class60.field1237.field1000 + var23], class128.field2514);
                                }
                            }
                            class179.field3389 += var22;
                            class60.field1237.field1000 += var22;
                            if (~class60.field1237.field1000 != ~var21) {
                                if (class179.field3389 != 512) {
                                    break;
                                }
                                class179.field3389 = 0;
                            } else {
                                if (~class145.field2837.field2541 != -16711936L) {
                                    class150.field2925.reset();
                                    class150.field2925.update(class60.field1237.field988, 0, var21);
                                    int var24 = (int) class150.field2925.getValue();
                                    if (class145.field2837.field1747 != var24) {
                                        try {
                                            class156.field2997.method12((byte) 93);
                                        } catch (Exception var30) {
                                        }
                                        class128.field2514 = (byte) ((int) (255.0D * Math.random() + 1.0D));
                                        class156.field2997 = null;
                                        ++class130.field2553;
                                        return false;
                                    }
                                    class130.field2553 = 0;
                                    class58.field1193 = 0;
                                    class145.field2837.field1749.method144(class111.field2148, (16711680L & class145.field2837.field2541) == 16711680L, class60.field1237.field988, (int) (65535L & class145.field2837.field2541), false);
                                } else {
                                    class2.field2 = class60.field1237;
                                    for (int var25 = 0; var25 < 256; ++var25) {
                                        class22 var26 = class182.field3453[var25];
                                        if (var26 != null) {
                                            class2.field2.field1000 = var25 * 8 + 5;
                                            int var27 = class2.field2.method419(arg0 + -3);
                                            int var28 = class2.field2.method419(-4);
                                            var26.method152(255, var28, var27);
                                        }
                                    }
                                }
                                class145.field2837.method915(arg0 + 1);
                                if (!class111.field2148) {
                                    --class120.field2357;
                                } else {
                                    --class137.field2677;
                                }
                                class145.field2837 = null;
                                class179.field3389 = 0;
                                class60.field1237 = null;
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException var31) {
                try {
                    class156.field2997.method12((byte) 117);
                } catch (Exception var29) {
                }
                ++class58.field1193;
                class156.field2997 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
    public static void method829(boolean arg0) {
        field2198 = null;
        field2199 = null;
        field2205 = null;
        field2196 = null;
        field2203 = null;
        if (arg0) {
            method827(-22, 77, -77, 50);
        }
        field2207 = null;
        field2208 = null;
        field2202 = null;
    }
}
