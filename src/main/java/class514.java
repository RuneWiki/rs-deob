import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class514 extends class439 {

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    private int field7263;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    private int field7264;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    private int field7259;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    private int field7257;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Lft;")
    public static class4 field7260 = new class4();

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIIII)V")
    public class514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7263 = arg0;
        this.field7264 = arg1;
        this.field7259 = arg3;
        this.field7257 = arg2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILav;BLkj;I)V")
    public static final void method2948(int arg0, class545 arg1, byte arg2, class484 arg3, int arg4) {
        if (arg2 == -124) {
            ++field7258;
            byte var5 = -1;
            if ((arg0 & 16384) != 0) {
                int var6 = class335.field4358;
                int var7 = arg3.method2122(false);
                int var8 = arg3.method2084((byte) -41);
                arg1.method2707(var6, var8, var7, true);
            }
            if (~(arg0 & 262144) != -1) {
                int var9 = arg3.method2091(255);
                int[] var10 = new int[var9];
                int[] var11 = new int[var9];
                int[] var12 = new int[var9];
                for (int var13 = 0; var9 > var13; ++var13) {
                    int var14 = arg3.method2103((byte) 74);
                    if (var14 == 65535) {
                        var14 = -1;
                    }
                    var10[var13] = var14;
                    var11[var13] = arg3.method2109(-17379);
                    var12[var13] = arg3.method2144((byte) 127);
                }
                class509.method2916(arg1, 0, var10, var11, var12);
            }
            if (~(1 & arg0) != -1) {
                class518.field7298[arg4] = arg3.method2127(120);
            }
            if (~(arg0 & 32768) != -1) {
                arg1.field6391 = arg3.method2110(0);
                arg1.field6413 = arg3.method2143((byte) -125);
                arg1.field6475 = arg3.method2124(-22);
                arg1.field6385 = arg3.method2124(arg2 ^ -49);
                arg1.field6408 = arg3.method2103((byte) 74) - -class335.field4358;
                arg1.field6405 = arg3.method2136(false) + class335.field4358;
                arg1.field6401 = arg3.method2084((byte) -41);
                arg1.field6489 = 0;
                if (arg1.field7985) {
                    arg1.field6486 = 0;
                    arg1.field6391 += arg1.field7987;
                    arg1.field6413 += arg1.field7978;
                    arg1.field6385 += arg1.field7978;
                    arg1.field6475 += arg1.field7987;
                } else {
                    arg1.field6475 += arg1.field6483[0];
                    arg1.field6385 += arg1.field6491[0];
                    arg1.field6413 += arg1.field6491[0];
                    arg1.field6391 += arg1.field6483[0];
                    arg1.field6486 = 1;
                }
            }
            if ((8 & arg0) != 0) {
                int var15 = arg3.method2114(105);
                int var16 = arg3.method2129(-116);
                int var17 = arg3.method2129(-104);
                int var18 = arg3.field4966;
                boolean var19 = ~(32768 & var15) != -1;
                if (arg1.field8023 != null && arg1.field8002 != null) {
                    boolean var20 = false;
                    if (var16 <= 1) {
                        if (!var19 && (class140.field1703 && !class161.field1948 || class582.field8467)) {
                            var20 = true;
                        } else if (class263.method1472((byte) 118, arg1.field8023)) {
                            var20 = true;
                        }
                    }
                    if (!var20 && ~class471.field6601 == -1) {
                        class431.field5845.field4966 = 0;
                        arg3.method2147(class431.field5845.field4929, (byte) 78, 0, var17);
                        class431.field5845.field4966 = 0;
                        int var21 = -1;
                        String var22;
                        if (!var19) {
                            var22 = class316.method1756(class589.method3417((byte) -118, class431.field5845), 0);
                        } else {
                            var15 &= 32767;
                            class402 var23 = class329.method1853(class431.field5845, arg2 ^ -23688);
                            var21 = var23.field5284;
                            var22 = var23.field5283.method357(class431.field5845, 91);
                        }
                        arg1.field6441 = var22.trim();
                        arg1.field6448 = 150;
                        arg1.field6464 = var15 >> 8;
                        arg1.field6453 = 255 & var15;
                        int var24;
                        if (~var16 != -2 && ~var16 != -3) {
                            var24 = !var19 ? 2 : 17;
                        } else {
                            var24 = var19 ? 17 : 1;
                        }
                        if (var16 == 2) {
                            class62.method365(var22, 0, (String) null, (byte) -29, "<img=1>" + arg1.method3193(true, arg2 ^ -40), var24, "<img=1>" + arg1.method3194(false, (byte) -97), var21);
                        } else if (~var16 == -2) {
                            class62.method365(var22, 0, (String) null, (byte) -29, "<img=0>" + arg1.method3193(true, 80), var24, "<img=0>" + arg1.method3194(false, (byte) 124), var21);
                        } else {
                            class62.method365(var22, 0, (String) null, (byte) -29, arg1.method3193(true, 92), var24, arg1.method3194(false, (byte) -26), var21);
                        }
                    }
                }
                arg3.field4966 = var17 + var18;
            }
            if (~(arg0 & 8192) != -1) {
                arg1.field7986 = ~arg3.method2084((byte) -41) == -2;
            }
            if ((65536 & arg0) != 0) {
                int var25 = arg3.method2114(90);
                int var26 = arg3.method2086(-55);
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var27 = arg3.method2129(arg2 ^ 39);
                arg1.method2699(var27, true, 0, var26, var25);
            }
            if (~(128 & arg0) != -1) {
                int var28 = arg3.method2136(false);
                if (~var28 == -65536) {
                    var28 = -1;
                }
                arg1.field6479 = var28;
            }
            if ((16 & arg0) != 0) {
                int var29 = arg3.method2114(82);
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var30 = arg3.method2091(255);
                class625.method3584(arg1, true, var30, var29);
            }
            if (~(arg0 & 512) != -1) {
                arg1.field6441 = arg3.method2133(false);
                if (arg1.field6441.charAt(0) == '~') {
                    arg1.field6441 = arg1.field6441.substring(1);
                    class589.method3415(arg1.field6441, 2, arg1.method3193(true, arg2 ^ -22), 0, false, arg1.method3194(false, (byte) -115));
                } else if (class103.field1265 == arg1) {
                    class589.method3415(arg1.field6441, 2, arg1.method3193(true, 106), 0, false, arg1.method3194(false, (byte) -29));
                }
                arg1.field6453 = 0;
                arg1.field6448 = 150;
                arg1.field6464 = 0;
            }
            if (~(arg0 & 64) != -1) {
                int var31 = arg3.method2122(false);
                int var32 = arg3.method2091(255);
                arg1.method2707(class335.field4358, var32, var31, true);
                arg1.field6414 = class335.field4358 + 300;
                arg1.field6433 = arg3.method2084((byte) -41);
            }
            if (~(256 & arg0) != -1) {
                var5 = arg3.method2124(-126);
            }
            if (~(arg0 & 2048) != -1) {
                int var33 = arg3.method2136(false);
                arg1.field6418 = arg3.method2129(-123);
                arg1.field6459 = arg3.method2129(-68);
                arg1.field6428 = ~(var33 & 32768) != -1;
                arg1.field6432 = var33 & 32767;
                arg1.field6424 = arg1.field6432 + arg1.field6418 + class335.field4358;
            }
            if ((1024 & arg0) != 0) {
                int var34 = arg3.method2136(false);
                if (var34 == 65535) {
                    var34 = -1;
                }
                int var35 = arg3.method2113((byte) 85);
                int var36 = arg3.method2091(255);
                arg1.method2699(var36, false, 0, var35, var34);
            }
            if ((4 & arg0) != 0) {
                int var37 = arg3.method2084((byte) -41);
                byte[] var38 = new byte[var37];
                class374 var39 = new class374(var38);
                arg3.method2117(arg2 ^ -30357, var37, 0, var38);
                class639.field9194[arg4] = var39;
                arg1.method3192(-19939, var39);
            }
            if (~(arg0 & 32) != -1) {
                arg1.field7984 = arg3.method2144((byte) 123);
                if (~arg1.field6486 == -1) {
                    arg1.method2705(arg1.field7984, false);
                    arg1.field7984 = -1;
                }
            }
            if ((arg0 & 131072) != 0) {
                arg1.field6434 = arg3.method2127(116);
                arg1.field6452 = arg3.method2143((byte) -105);
                arg1.field6450 = arg3.method2127(60);
                arg1.field6419 = (byte) arg3.method2109(-17379);
                arg1.field6425 = class335.field4358 + arg3.method2114(104);
                arg1.field6447 = class335.field4358 + arg3.method2136(false);
            }
            if (arg1.field7985) {
                if (var5 == 127) {
                    arg1.method3198(arg1.field7987, 0, arg1.field7978);
                } else {
                    byte var40;
                    if (~var5 != 0) {
                        var40 = var5;
                    } else {
                        var40 = class518.field7298[arg4];
                    }
                    arg1.method3196(arg1.field7978, (byte) 115, var40, arg1.field7987);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        ++field7265;
        if (arg2 != 46) {
            method2950((byte) -114);
        }
        int var4 = this.field7263 * arg1 >> 12;
        int var5 = this.field7257 * arg1 >> 12;
        int var6 = this.field7264 * arg0 >> 12;
        int var7 = this.field7259 * arg0 >> 12;
        class33.method190((byte) 51, var4, var7, super.field6076, var6, var5);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method2949(boolean arg0) {
        field7260 = null;
        if (arg0) {
            field7260 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static final void method2950(byte arg0) {
        if (arg0 < 38) {
            field7260 = null;
        }
        ++field7266;
        if (!class565.field8299.method3590(class529.field7429, -2) && ~class442.field6099 != ~class13.field104) {
            class367.method2053(class343.field4424, class522.field7330, 10, true, false);
        } else {
            class336.method1892(class210.field2560, true);
            if (~class442.field6099 != ~class413.field5367) {
                class40.method210(66);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lqa;ILet;)V")
    public static final void method2951(class206 arg0, int arg1, class509 arg2) {
        ++field7261;
        boolean var3 = class449.field6217.method2022(arg2.field7163, arg2.field7082, arg0, false, arg2.field7153 | arg1, arg2.field7192, arg2.field7107, !arg2.field7067 ? null : class103.field1265.field8002) == null;
        if (var3) {
            class464.field6498.method1040(new class207(arg2.field7082, arg2.field7163, arg2.field7107, -16777216 | arg2.field7153, arg2.field7192, arg2.field7067), -113);
            class87.method508(127, arg2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        int var4 = 81 % ((-75 - arg0) / 49);
        ++field7267;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)V")
    public final void method501(int arg0, byte arg1, int arg2) {
        if (arg1 > -78) {
            this.field7257 = 118;
        }
        ++field7262;
    }
}
