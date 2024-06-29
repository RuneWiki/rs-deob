import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class660 extends class56 {

    @OriginalMember(owner = "client!bca", name = "H", descriptor = "I")
    private int field9028 = 1024;

    @OriginalMember(owner = "client!bca", name = "E", descriptor = "I")
    private int field9025 = 409;

    @OriginalMember(owner = "client!bca", name = "L", descriptor = "I")
    private int field9032 = 1024;

    @OriginalMember(owner = "client!bca", name = "J", descriptor = "I")
    private int field9030 = 0;

    @OriginalMember(owner = "client!bca", name = "P", descriptor = "I")
    private int field9036 = 1024;

    @OriginalMember(owner = "client!bca", name = "Q", descriptor = "I")
    private int field9037 = 1024;

    @OriginalMember(owner = "client!bca", name = "I", descriptor = "I")
    private int field9029 = 0;

    @OriginalMember(owner = "client!bca", name = "U", descriptor = "I")
    private int field9041 = 2048;

    @OriginalMember(owner = "client!bca", name = "T", descriptor = "I")
    private int field9040 = 819;

    @OriginalMember(owner = "client!bca", name = "N", descriptor = "Lqfa;")
    public static class98 field9034 = new class98(82, 6);

    @OriginalMember(owner = "client!bca", name = "D", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!bca", name = "G", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!bca", name = "K", descriptor = "I")
    private int field9031;

    @OriginalMember(owner = "client!bca", name = "M", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!bca", name = "O", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!bca", name = "R", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!bca", name = "V", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!bca", name = "S", descriptor = "Lkd;")
    public static class280 field9039;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V", line = 5)
    public static final void method3618(int arg0, int arg1) {
        class750.field10412 = false;
        class681.field9343 = arg0;
        class318.field4412 = -1;
        class213.field2801 = -1;
        class561.field7881 = null;
        ++field9035;
        class444.field6316 = 0;
        class469.field6659 = arg1;
        class226.field3049 = null;
    }

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "(I)V", line = 30)
    public static void method3619(int arg0) {
        field9034 = null;
        if (arg0 != 0) {
            method3618(-71, 122);
        }
        field9039 = null;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V", line = 377)
    public class660() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I[[IBIIILjava/util/Random;)V", line = 51)
    private final void method3620(int arg0, int[][] arg1, byte arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field9042;
        int var8 = ~this.field9032 >= -1 ? 4096 : 4096 - class111.method790(this.field9032, arg6, (byte) -119);
        int var9 = 76 % ((arg2 - 6) / 52);
        int var10 = this.field9031 * this.field9028 >> 12;
        int var11 = this.field9031 - (var10 > 0 ? class111.method790(var10, arg6, (byte) -119) : 0);
        if (arg5 >= class328.field4576) {
            arg5 -= class328.field4576;
        }
        if (var11 <= 0) {
            if (arg0 + arg5 > class328.field4576) {
                int var12 = class328.field4576 - arg5;
                for (int var13 = 0; var13 < arg4; ++var13) {
                    int[] var14 = arg1[arg3 + var13];
                    class255.method1691(var14, arg5, var12, var8);
                    class255.method1691(var14, 0, -var12 + arg0, var8);
                }
            } else {
                for (int var15 = 0; var15 < arg4; ++var15) {
                    class255.method1691(arg1[arg3 + var15], arg5, arg0, var8);
                }
            }
        } else if (~arg4 < -1 && arg0 > 0) {
            int var16 = arg0 / 2;
            int var17 = arg4 / 2;
            int var18 = ~var11 < ~var16 ? var16 : var11;
            int var19 = var11 <= var17 ? var11 : var17;
            int var20 = arg5 - -var18;
            int var21 = arg0 - var18 * 2;
            for (int var22 = 0; arg4 > var22; ++var22) {
                int[] var23 = arg1[var22 - -arg3];
                if (~var22 > ~var19) {
                    int var24 = var8 * var22 / var19;
                    if (this.field9030 == 0) {
                        for (int var25 = 0; ~var18 < ~var25; ++var25) {
                            int var26 = var8 * var25 / var18;
                            var23[class286.method1877(class445.field6318, arg5 + var25)] = var23[class286.method1877(class445.field6318, arg0 + arg5 - var25 + -1)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; var18 > var27; ++var27) {
                            int var29 = var8 * var27 / var18;
                            var23[class286.method1877(arg5 + var27, class445.field6318)] = var23[class286.method1877(class445.field6318, -var27 + arg0 + arg5 + -1)] = ~var29 <= ~var24 ? var24 : var29;
                        }
                    }
                    if (class328.field4576 >= var20 + var21) {
                        class255.method1691(var23, var20, var21, var24);
                    } else {
                        int var28 = -var20 + class328.field4576;
                        class255.method1691(var23, var20, var28, var24);
                        class255.method1691(var23, 0, -var28 + var21, var24);
                    }
                } else {
                    int var30 = arg4 + -1 - var22;
                    if (~var30 > ~var19) {
                        int var31 = var8 * var30 / var19;
                        if (this.field9030 == 0) {
                            for (int var32 = 0; ~var18 < ~var32; ++var32) {
                                int var33 = var8 * var32 / var18;
                                var23[class286.method1877(class445.field6318, arg5 + var32)] = var23[class286.method1877(arg0 - 1 + -var32 + arg5, class445.field6318)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; ~var18 < ~var34; ++var34) {
                                int var36 = var8 * var34 / var18;
                                var23[class286.method1877(class445.field6318, arg5 + var34)] = var23[class286.method1877(class445.field6318, -var34 + arg0 + arg5 + -1)] = var36 >= var31 ? var31 : var36;
                            }
                        }
                        if (class328.field4576 >= var20 + var21) {
                            class255.method1691(var23, var20, var21, var31);
                        } else {
                            int var35 = -var20 + class328.field4576;
                            class255.method1691(var23, var20, var35, var31);
                            class255.method1691(var23, 0, var21 - var35, var31);
                        }
                    } else {
                        for (int var37 = 0; ~var18 < ~var37; ++var37) {
                            var23[class286.method1877(arg5 + var37, class445.field6318)] = var23[class286.method1877(arg0 + arg5 - 1 + -var37, class445.field6318)] = var8 * var37 / var18;
                        }
                        if (~(var20 + var21) < ~class328.field4576) {
                            int var38 = -var20 + class328.field4576;
                            class255.method1691(var23, var20, var38, var8);
                            class255.method1691(var23, 0, -var38 + var21, var8);
                        } else {
                            class255.method1691(var23, var20, var21, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lqm;Ljava/lang/String;ZILda;Lha;)V", line = 251)
    public static final void method3621(class143 arg0, String arg1, boolean arg2, int arg3, class59 arg4, class58 arg5) {
        ++field9026;
        boolean var6 = !class472.field6694 || class322.method2073(402);
        if (var6) {
            if (class472.field6694 && var6) {
                class143 var7 = class293.field4121;
                class59 var8 = arg5.method459(var7, class148.field2120, true);
                int var9 = var7.method998(174, 250, arg1, (class88[]) null);
                int var10 = var7.method996(0, arg1, 250, var7.field2035, (class88[]) null);
                int var11 = class192.field2564.field2657;
                int var12 = var11 + 4;
                int var13 = var12 * 2 + var9;
                int var14 = var12 * 2 + var10;
                if (~class2.field15 < ~var14) {
                    var14 = class2.field15;
                }
                if (~var13 > ~class221.field2884) {
                    var13 = class221.field2884;
                }
                int var15 = class522.field7402.method12(class192.field2561, var13, -115) + class716.field9962;
                int var16 = class658.field9018.method826(var14, 0, class191.field2553) + class270.field3861;
                if (class589.field8295) {
                    var15 += class171.method1102(5467);
                    var16 += class575.method3288((byte) -119);
                }
                arg5.method484(class213.field2804, false).method673(class727.field10177.field2657 + var15, var16 - -class727.field10177.field2664, -(class727.field10177.field2657 * 2) + var13, var14 - class727.field10177.field2664 * 2, 1, 0, 0);
                arg5.method484(class727.field10177, true).method658(var15, var16);
                class727.field10177.method1239();
                arg5.method484(class727.field10177, true).method658(var15 - var11 + var13, var16);
                class727.field10177.method1240();
                arg5.method484(class727.field10177, true).method658(-var11 + var15 + var13, var16 - -var14 + -var11);
                class727.field10177.method1239();
                arg5.method484(class727.field10177, true).method658(var15, var16 - (-var14 + var11));
                class727.field10177.method1240();
                arg5.method484(class192.field2564, true).method666(var15, class727.field10177.field2664 + var16, var11, -(class727.field10177.field2664 * 2) + var14);
                class192.field2564.method1238();
                arg5.method484(class192.field2564, true).method666(var15 - -class727.field10177.field2657, var16, var13 - class727.field10177.field2657 * 2, var11);
                class192.field2564.method1238();
                arg5.method484(class192.field2564, true).method666(var13 + var15 + -var11, var16 - -class727.field10177.field2664, var11, -(class727.field10177.field2664 * 2) + var14);
                class192.field2564.method1238();
                arg5.method484(class192.field2564, true).method666(class727.field10177.field2657 + var15, -var11 + var14 + var16, -(class727.field10177.field2657 * 2) + var13, var11);
                class192.field2564.method1238();
                var8.method510(var12 + var16, 0, -(var12 * 2) + var13, (class88[]) null, 0, class560.field7873 | -16777216, (class486) null, 1, -1, -(var12 * 2) + var14, 1, 0, var15 - -var12, (int[]) null, arg1, (byte) 100);
                class721.method4050(var13, var14, -17012, var16, var15);
            } else {
                int var17 = arg0.method998(174, 250, arg1, (class88[]) null);
                int var18 = arg0.method1000((byte) 114, arg1, (class88[]) null, 250) * 13;
                byte var19 = 4;
                int var20 = var19 + 6;
                int var21 = 6 - -var19;
                arg5.method431(-var19 + var20, -var19 + var21, var17 + var19 + var19, var18 + var19 + var19, -16777216, 0);
                arg5.method445(-var19 + var20, -var19 + var21, var17 + var19 - -var19, var18 + var19 + var19, -1, 0);
                arg4.method510(var21, 0, var17, (class88[]) null, 0, -1, (class486) null, 1, -1, var18, 1, 0, var20, (int[]) null, arg1, (byte) 100);
                class721.method4050(var19 + var19 + var17, var18 + var19 + var19, -17012, var21 - var19, -var19 + var20);
            }
            int var22 = 127 / ((59 - arg3) / 45);
            if (arg2) {
                try {
                    if (class589.field8295) {
                        class124.method842((byte) 95);
                    } else {
                        arg5.method452(0);
                    }
                } catch (class76 var23) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V", line = 358)
    public final void method364(int arg0) {
        if (arg0 != 7) {
            method3618(91, 11);
        }
        ++field9024;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILee;I)V", line = 382)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 == 3731) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (arg2 != 6) {
                                        if (arg2 != 7) {
                                            if (arg2 == 8) {
                                                this.field9032 = arg1.method3757((byte) -65);
                                            }
                                        } else {
                                            this.field9028 = arg1.method3757((byte) -65);
                                        }
                                    } else {
                                        this.field9030 = arg1.method3750((byte) 35);
                                    }
                                } else {
                                    this.field9036 = arg1.method3757((byte) -65);
                                }
                            } else {
                                this.field9040 = arg1.method3757((byte) -65);
                            }
                        } else {
                            this.field9025 = arg1.method3757((byte) -65);
                        }
                    } else {
                        this.field9041 = arg1.method3757((byte) -65);
                    }
                } else {
                    this.field9037 = arg1.method3757((byte) -65);
                }
            } else {
                this.field9029 = arg1.method3750((byte) 35);
            }
            ++field9027;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IZ)[I", line = 483)
    public final int[] method24(int arg0, boolean arg1) {
        ++field9033;
        if (!arg1) {
            method3618(109, 119);
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int[][] var4 = super.field673.method3269(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class328.field4576 * this.field9037 >> 12;
            int var15 = class328.field4576 * this.field9041 >> 12;
            int var16 = class226.field3050 * this.field9025 >> 12;
            int var17 = class226.field3050 * this.field9040 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field9031 = class328.field4576 / 8 * this.field9036 >> 12;
                int var18 = 1 - -(class328.field4576 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field9029);
                while (true) {
                    while (true) {
                        int var22 = class111.method790(-var14 + var15, var21, (byte) -119) + var14;
                        int var23 = class111.method790(-var16 + var17, var21, (byte) -119) + var16;
                        int var24 = var8 + var22;
                        if (~class328.field4576 > ~var24) {
                            var24 = class328.field4576;
                            var22 = class328.field4576 - var8;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class328.field4576;
                            }
                            if (class328.field4576 < var29) {
                                var29 -= class328.field4576;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && ~var30[1] <= ~var29) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class328.field4576;
                                        }
                                        if (~class328.field4576 > ~var31) {
                                            var31 -= class328.field4576;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class328.field4576;
                                                    } else {
                                                        var39 = Math.min(var29, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method3620(var39 - var38, var4, (byte) -75, var35, var25 - var35, var38 - -var7, var21);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (var23 + var25 > class226.field3050) {
                            var23 = -var25 + class226.field3050;
                        } else {
                            var10 = false;
                        }
                        if (~class328.field4576 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[2] = var25 - -var23;
                            var41[1] = var24;
                            this.method3620(var22, var4, (byte) 71, var25, var23, var6 + var8, var21);
                            var8 = var24;
                        } else {
                            this.method3620(var22, var4, (byte) 99, var25, var23, var6 + var8, var21);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[0] = var8;
                            var42[2] = var25 - -var23;
                            var42[1] = var24;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var7 = var6;
                            var13 = 0;
                            var6 = class111.method790(class328.field4576, var21, (byte) -119);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class328.field4576 + var5;
                            }
                            if (var44 > class328.field4576) {
                                var44 -= class328.field4576;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && var45[1] >= var44) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
