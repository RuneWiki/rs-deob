import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class195 extends class23 {

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    private int field3648 = -1;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "Ldc;")
    public static class37 field3638 = class185.method1233((byte) 86, "<col=ffb000>");

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "[I")
    public static int[] field3649 = new int[500];

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "Ldc;")
    public static class37 field3653 = class185.method1233((byte) 86, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field3650 = 0;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "[I")
    private int[] field3639;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public static final void method1297(boolean arg0, int arg1) {
        if (arg1 >= -29) {
            field3646 = 96;
        }
        ++field3640;
        class231.field4225 = arg0;
        if (!class231.field4225) {
            int var2 = (-class12.field167.field526 + class8.field100) / 16;
            class19.field315 = new int[var2][4];
            for (int var3 = 0; var3 < var2; ++var3) {
                for (int var14 = 0; ~var14 > -5; ++var14) {
                    class19.field315[var3][var14] = class12.field167.method237(50);
                }
            }
            int var4 = class12.field167.method230((byte) -102);
            int var5 = class12.field167.method196(125);
            boolean var6 = false;
            int var7 = class12.field167.method196(124);
            if ((~(var5 / 8) == -49 || var5 / 8 == 49) && ~(var4 / 8) == -49) {
                var6 = true;
            }
            int var8 = class12.field167.method227(-115);
            int var9 = class12.field167.method234((byte) 82);
            class118.field2117 = new byte[var2][];
            if (~(var5 / 8) == -49 && ~(var4 / 8) == -149) {
                var6 = true;
            }
            class50.field1003 = new byte[var2][];
            class151.field2862 = new int[var2];
            class142.field2745 = new int[var2];
            class199.field3708 = new int[var2];
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; (var5 - -6) / 8 >= var11; ++var11) {
                for (int var12 = (var4 + -6) / 8; ~((var4 + 6) / 8) <= ~var12; ++var12) {
                    int var13 = (var11 << 8) - -var12;
                    if (!var6 || ~var12 != -50 && var12 != 149 && ~var12 != -148 && var11 != 50 && (~var11 != -50 || ~var12 != -48)) {
                        class142.field2745[var10] = var13;
                        class151.field2862[var10] = class185.field3416.method1543(91, class80.method548(new class37[] { client.field669, class151.method1034((byte) -9, var11), class66.field1186, class151.method1034((byte) -9, var12) }, -98));
                        class199.field3708[var10] = class185.field3416.method1543(73, class80.method548(new class37[] { class96.field1689, class151.method1034((byte) -9, var11), class66.field1186, class151.method1034((byte) -9, var12) }, -33));
                    } else {
                        class142.field2745[var10] = var13;
                        class151.field2862[var10] = -1;
                        class199.field3708[var10] = -1;
                    }
                    ++var10;
                }
            }
            class103.method669(var8, var7, 31362, var9, var4, var5);
        } else {
            class12.field167.method1504(0);
            for (int var15 = 0; ~var15 > -5; ++var15) {
                for (int var35 = 0; ~var35 > -14; ++var35) {
                    for (int var36 = 0; ~var36 > -14; ++var36) {
                        int var37 = class12.field167.method1506((byte) 110, 1);
                        if (~var37 != -2) {
                            class214.field3999[var15][var35][var36] = -1;
                        } else {
                            class214.field3999[var15][var35][var36] = class12.field167.method1506((byte) 123, 26);
                        }
                    }
                }
            }
            class12.field167.method1502(-113);
            int var16 = (-class12.field167.field526 + class8.field100) / 16;
            class19.field315 = new int[var16][4];
            for (int var17 = 0; ~var16 < ~var17; ++var17) {
                for (int var34 = 0; var34 < 4; ++var34) {
                    class19.field315[var17][var34] = class12.field167.method226(119);
                }
            }
            int var18 = class12.field167.method207(65280);
            int var19 = class12.field167.method234((byte) 82);
            int var20 = class12.field167.method230((byte) -98);
            int var21 = class12.field167.method207(65280);
            int var22 = class12.field167.method215(-1797813752);
            class118.field2117 = new byte[var16][];
            class151.field2862 = new int[var16];
            class50.field1003 = new byte[var16][];
            class142.field2745 = new int[var16];
            class199.field3708 = new int[var16];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; ++var24) {
                for (int var25 = 0; var25 < 13; ++var25) {
                    for (int var26 = 0; var26 < 13; ++var26) {
                        int var27 = class214.field3999[var24][var25][var26];
                        if (~var27 != 0) {
                            int var28 = var27 >> 14 & 1023;
                            int var29 = (16381 & var27) >> 3;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; ~var23 < ~var31; ++var31) {
                                if (~class142.field2745[var31] == ~var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (~var30 != 0) {
                                class142.field2745[var23] = var30;
                                int var32 = 255 & var30 >> 8;
                                int var33 = var30 & 255;
                                class151.field2862[var23] = class185.field3416.method1543(107, class80.method548(new class37[] { client.field669, class151.method1034((byte) -9, var32), class66.field1186, class151.method1034((byte) -9, var33) }, -126));
                                class199.field3708[var23] = class185.field3416.method1543(125, class80.method548(new class37[] { class96.field1689, class151.method1034((byte) -9, var32), class66.field1186, class151.method1034((byte) -9, var33) }, -87));
                                ++var23;
                            }
                        }
                    }
                }
            }
            class103.method669(var22, var19, 31362, var18, var20, var21);
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)Z")
    private final boolean method1298(int arg0) {
        ++field3647;
        if (this.field3639 != null) {
            return true;
        } else {
            if (arg0 != 128) {
                method1299(37, (class37[]) null);
            }
            if (~this.field3648 <= -1) {
                int var2 = class199.field3705;
                int var3 = class235.field4276;
                int var4 = class88.field1538.method273(this.field3648, false) ? 64 : 128;
                this.field3639 = class88.field1538.method267(1, this.field3648);
                this.field3655 = var4;
                this.field3637 = var4;
                class23.method166(4096, var2, var3);
                return this.field3639 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field3648 = arg0.method230((byte) -123);
        }
        ++field3642;
        if (arg2 != 1000) {
            field3646 = 18;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ldc;)[Ldc;")
    public static final class37[] method1299(int arg0, class37[] arg1) {
        ++field3645;
        class37[] var2 = new class37[5];
        if (arg0 != 30113) {
            method1300(false);
        }
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = class80.method548(new class37[] { class151.method1034((byte) -9, var3), class102.field1754 }, arg0 + -30210);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class80.method548(new class37[] { var2[var3], arg1[var3] }, -35);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)V")
    public static void method1300(boolean arg0) {
        field3653 = null;
        if (arg0) {
            field3638 = null;
            field3649 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lwa;Lwa;ILwa;)V")
    public static final void method1301(class238 arg0, class238 arg1, int arg2, class238 arg3) {
        ++field3641;
        class75.field1335 = arg1.method1543(103, class35.field705);
        class83.field1481 = arg3.method1543(80, class10.field129);
        class6.field70 = arg3.method1543(119, class198.field3692);
        class64.field1163 = arg3.method1543(88, class9.field123);
        class112.field1991 = arg3.method1543(120, class211.field3952);
        class140.field2714 = arg3.method1543(117, class29.field541);
        class6.field69 = arg3.method1543(107, class220.field4095);
        class239.field4392 = arg3.method1543(68, class8.field96);
        class94.field1642 = arg3.method1543(95, class5.field39);
        int var4 = -51 % ((-31 - arg2) / 44);
        class158.field2996 = arg3.method1543(82, class77.field1354);
        class127.field2364 = arg3.method1543(100, class39.field810);
        class10.field131 = arg0.method1543(118, class153.field2897);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([Lmf;IIIZ)V")
    public static final void method1302(class136[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            class136 var6 = arg0[var5];
            if (var6 != null && ~var6.field2566 == ~arg3) {
                if (var6.field2544 != 0) {
                    if (var6.field2544 == 1) {
                        var6.field2638 = -var6.field2622 + arg2;
                    } else if (~var6.field2544 != -3) {
                        if (var6.field2544 == 3) {
                            if (var6.field2513 != 2) {
                                if (~var6.field2513 == -8) {
                                    var6.field2638 = var6.field2622 * 115 - -((var6.field2622 + -1) * var6.field2556);
                                }
                            } else {
                                var6.field2638 = (var6.field2622 + -1) * var6.field2556 + var6.field2622 * 32;
                            }
                        }
                    } else {
                        var6.field2638 = var6.field2622 * arg2 >> 14;
                    }
                } else {
                    var6.field2638 = var6.field2622;
                }
                if (var6.field2595 == 0) {
                    var6.field2509 = var6.field2615;
                } else if (~var6.field2595 == -2) {
                    var6.field2509 = -var6.field2615 + arg1;
                } else if (var6.field2595 != 2) {
                    if (~var6.field2595 == -4) {
                        if (var6.field2513 == 2) {
                            var6.field2509 = (var6.field2615 - 1) * var6.field2508 + var6.field2615 * 32;
                        } else if (~var6.field2513 == -8) {
                            var6.field2509 = (var6.field2615 + -1) * var6.field2508 + var6.field2615 * 12;
                        }
                    }
                } else {
                    var6.field2509 = var6.field2615 * arg1 >> 14;
                }
                if (class168.field3198 && (class107.method699(var6, 103) != 0 || var6.field2513 == 0)) {
                    if (~var6.field2509 > -6 && var6.field2638 < 5) {
                        var6.field2638 = 5;
                        var6.field2509 = 5;
                    } else {
                        if (var6.field2509 <= 0) {
                            var6.field2509 = 5;
                        }
                        if (~var6.field2638 >= -1) {
                            var6.field2638 = 5;
                        }
                    }
                }
                if (var6.field2652 != 0) {
                    if (var6.field2652 == 1) {
                        var6.field2636 = (-var6.field2509 + arg1) / 2 + var6.field2607;
                    } else if (~var6.field2652 == -3) {
                        var6.field2636 = -var6.field2509 + arg1 - var6.field2607;
                    } else if (~var6.field2652 != -4) {
                        if (~var6.field2652 != -5) {
                            var6.field2636 = -var6.field2509 + arg1 - (var6.field2607 * arg1 >> 14);
                        } else {
                            var6.field2636 = (var6.field2607 * arg1 >> 14) + (-var6.field2509 + arg1) / 2;
                        }
                    } else {
                        var6.field2636 = var6.field2607 * arg1 >> 14;
                    }
                } else {
                    var6.field2636 = var6.field2607;
                }
                if (~var6.field2661 == -1) {
                    var6.field2630 = var6.field2634;
                } else if (var6.field2661 == 1) {
                    var6.field2630 = (-var6.field2638 + arg2) / 2 + var6.field2634;
                } else if (~var6.field2661 != -3) {
                    if (~var6.field2661 != -4) {
                        if (~var6.field2661 == -5) {
                            var6.field2630 = (var6.field2634 * arg2 >> 14) + (-var6.field2638 + arg2) / 2;
                        } else {
                            var6.field2630 = -var6.field2638 + arg2 + -(var6.field2634 * arg2 >> 14);
                        }
                    } else {
                        var6.field2630 = var6.field2634 * arg2 >> 14;
                    }
                } else {
                    var6.field2630 = arg2 - var6.field2634 + -var6.field2638;
                }
                if (class168.field3198 && (class107.method699(var6, 105) != 0 || var6.field2513 == 0)) {
                    if (var6.field2636 < 0) {
                        var6.field2636 = 0;
                    } else if (~(var6.field2636 + var6.field2509) < ~arg1) {
                        var6.field2636 = -var6.field2509 + arg1;
                    }
                    if (var6.field2630 >= 0) {
                        if (arg2 < var6.field2630 - -var6.field2638) {
                            var6.field2630 = arg2 - var6.field2638;
                        }
                    } else {
                        var6.field2630 = 0;
                    }
                }
                if (~(var6.field2598 - var6.field2509) > ~var6.field2593) {
                    var6.field2593 = var6.field2598 - var6.field2509;
                }
                if (~var6.field2593 > -1) {
                    var6.field2593 = 0;
                }
                if (-var6.field2638 + var6.field2639 < var6.field2519) {
                    var6.field2519 = -var6.field2638 + var6.field2639;
                }
                if (~var6.field2519 > -1) {
                    var6.field2519 = 0;
                }
                if (var6.field2513 == 0) {
                    class129.method909(var6, arg4);
                }
            }
        }
        if (arg4) {
            ++field3643;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field3654;
        if (arg1 != 9) {
            return null;
        } else {
            int[][] var3 = super.field398.method1522(-29659, arg0);
            if (super.field398.field4303 && this.method1298(128)) {
                int var4 = (~class235.field4276 == ~this.field3655 ? arg0 : this.field3655 * arg0 / class235.field4276) * this.field3637;
                int[] var5 = var3[1];
                int[] var6 = var3[0];
                int[] var7 = var3[2];
                if (class199.field3705 == this.field3637) {
                    for (int var8 = 0; ~var8 > ~class199.field3705; ++var8) {
                        int var9 = this.field3639[var4++];
                        var7[var8] = class58.method449(var9, 255) << 4;
                        var5[var8] = class58.method449(var9, 65280) >> 4;
                        var6[var8] = class58.method449(var9 >> 12, 4080);
                    }
                } else {
                    for (int var10 = 0; ~class199.field3705 < ~var10; ++var10) {
                        int var11 = this.field3637 * var10 / class199.field3705;
                        int var12 = this.field3639[var4 + var11];
                        var7[var10] = class58.method449(255, var12) << 4;
                        var5[var10] = class58.method449(var12 >> 4, 4080);
                        var6[var10] = class58.method449(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)I")
    public final int method165(byte arg0) {
        if (arg0 != 15) {
            field3638 = null;
        }
        ++field3652;
        return this.field3648;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
    public final void method158(int arg0) {
        ++field3651;
        super.method158(arg0);
        this.field3639 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
    public static final int method1303(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 256 - arg1;
        if (arg2 != 1021638856) {
            method1300(false);
        }
        ++field3644;
        return ((arg3 & 16711935) * var4 - -((16711935 & arg0) * arg1) & -16711936) + ((65280 & arg0) * arg1 + (65280 & arg3) * var4 & 16711680) >> 8;
    }
}
