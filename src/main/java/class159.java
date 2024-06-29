import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class159 extends class42 {

    @OriginalMember(owner = "client!og", name = "Qb", descriptor = "I")
    public int field2875 = -1;

    @OriginalMember(owner = "client!og", name = "Wb", descriptor = "Z")
    public boolean field2881 = false;

    @OriginalMember(owner = "client!og", name = "fc", descriptor = "I")
    public int field2890 = 0;

    @OriginalMember(owner = "client!og", name = "jc", descriptor = "I")
    public int field2894 = 0;

    @OriginalMember(owner = "client!og", name = "Zb", descriptor = "I")
    public int field2884 = -1;

    @OriginalMember(owner = "client!og", name = "ac", descriptor = "S")
    private short field2885 = 0;

    @OriginalMember(owner = "client!og", name = "oc", descriptor = "I")
    public int field2899 = 0;

    @OriginalMember(owner = "client!og", name = "qc", descriptor = "I")
    public int field2901 = 0;

    @OriginalMember(owner = "client!og", name = "hc", descriptor = "S")
    private short field2892 = 0;

    @OriginalMember(owner = "client!og", name = "bc", descriptor = "I")
    public int field2886 = 0;

    @OriginalMember(owner = "client!og", name = "Pb", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!og", name = "Ob", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!og", name = "Rb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!og", name = "Tb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!og", name = "Ub", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!og", name = "Xb", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!og", name = "Yb", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!og", name = "cc", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!og", name = "dc", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!og", name = "ec", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!og", name = "gc", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!og", name = "ic", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!og", name = "kc", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!og", name = "mc", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!og", name = "pc", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!og", name = "rc", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!og", name = "Sb", descriptor = "Lmb;")
    public class132 field2877;

    @OriginalMember(owner = "client!og", name = "nc", descriptor = "Lnb;")
    public static class143 field2898;

    @OriginalMember(owner = "client!og", name = "lc", descriptor = "Lug;")
    public class221 field2896;

    @OriginalMember(owner = "client!og", name = "Vb", descriptor = "Leg;")
    public class52 field2880;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
    public static void method1030(int arg0) {
        field2898 = null;
        if (arg0 != 7247) {
            field2874 = 67;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()I")
    public final int method55() {
        ++field2878;
        return super.field733;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z")
    public final boolean method291(int arg0) {
        ++field2900;
        if (arg0 < 2) {
            this.field2881 = false;
        }
        return this.field2880 != null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lkd;I)V")
    public final void method1031(class112 arg0, int arg1) {
        arg0.field2133 = arg1;
        ++field2902;
        int var3 = -1;
        int var4 = arg0.method716(-1308);
        if ((var4 & 2) == 2) {
            this.field2885 = (short) (arg0.method716(-1308) << 2);
            this.field2892 = (short) (arg0.method716(-1308) << 2);
        } else {
            this.field2892 = 0;
            this.field2885 = 0;
        }
        boolean var5 = ~(4 & var4) != -1;
        int var6 = var4 & 1;
        super.field679 = (var4 >> 3) + 1;
        this.field2875 = arg0.method734(true);
        int[] var7 = new int[12];
        this.field2884 = arg0.method734(true);
        this.field2890 = 0;
        for (int var8 = 0; ~var8 > -13; ++var8) {
            int var9 = arg0.method716(-1308);
            if (var9 == 0) {
                var7[var8] = 0;
            } else {
                int var10 = arg0.method716(-1308);
                int var11 = (var9 << 8) + var10;
                if (~var8 == -1 && ~var11 == -65536) {
                    var3 = arg0.method739(-125);
                    break;
                }
                if (var11 >= 32768) {
                    int var15 = class104.field1950[var11 + -32768];
                    var7[var8] = class219.method1368(1073741824, var15);
                    int var16 = class58.method389(0, var15).field4391;
                    if (var16 != 0) {
                        this.field2890 = var16;
                    }
                } else {
                    var7[var8] = class219.method1368(Integer.MIN_VALUE, var11 - 256);
                }
            }
        }
        int[] var12 = new int[5];
        for (int var13 = 0; ~var13 > -6; ++var13) {
            int var14 = arg0.method716(-1308);
            if (~var14 > -1 || ~var14 <= ~class155.field2846[var13].length) {
                var14 = 0;
            }
            var12[var13] = var14;
        }
        super.field715 = arg0.method739(arg1 + -124);
        if (super.field715 == 65535) {
            super.field715 = -1;
        }
        super.field712 = arg0.method739(96);
        if (~super.field712 == -65536) {
            super.field712 = -1;
        }
        super.field720 = super.field712;
        super.field727 = arg0.method739(107);
        if (~super.field727 == -65536) {
            super.field727 = -1;
        }
        super.field736 = arg0.method739(-123);
        if (~super.field736 == -65536) {
            super.field736 = -1;
        }
        super.field708 = arg0.method739(83);
        if (~super.field708 == -65536) {
            super.field708 = -1;
        }
        super.field702 = arg0.method739(-128);
        if (~super.field702 == -65536) {
            super.field702 = -1;
        }
        super.field685 = arg0.method739(arg1 + -128);
        if (~super.field685 == -65536) {
            super.field685 = -1;
        }
        this.field2877 = class164.method1057((byte) 11, arg0.method762((byte) -120)).method900(0);
        this.field2894 = arg0.method716(-1308);
        if (var5) {
            this.field2886 = arg0.method739(arg1 ^ 53);
        } else {
            this.field2886 = 0;
        }
        if (this.field2880 == null) {
            this.field2880 = new class52();
        }
        this.field2880.method357(var12, var6 == 1, var7, var3, (byte) -128);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZIIIIIIIIILug;I)V")
    private final void method1032(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class221 arg11, int arg12) {
        ++field2897;
        if (arg6 * arg6 + arg10 * arg10 <= 360000) {
            if (!arg1) {
                this.method291(-77);
            }
            int var14 = 2047 & (int) (325.949D * Math.atan2((double) arg10, (double) arg6));
            class221 var15 = class105.method647(arg11, arg0, super.field719, super.field673, super.field723, (byte) 12, var14);
            if (var15 != null) {
                var15.method52(0, arg9, arg2, arg8, arg3, arg7, arg5, arg4, -1L);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)Lbf;")
    public static final class18 method1033(byte arg0) {
        byte[] var1 = class10.field109[0];
        if (arg0 < 56) {
            method1033((byte) 41);
        }
        int var2 = class94.field1657[0] * class153.field2793[0];
        int[] var3 = new int[var2];
        ++field2891;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3[var4] = class118.field2244[class75.method450(255, var1[var4])];
        }
        class18 var5 = new class18(class153.field2792, class140.field2619, class23.field321[0], class30.field462[0], class94.field1657[0], class153.field2793[0], var3);
        class187.method1193(1);
        return var5;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBII)I")
    public static final int method1034(int arg0, byte arg1, int arg2, int arg3) {
        ++field2887;
        if (arg1 <= 15) {
            method1033((byte) -20);
        }
        if (~arg0 <= ~arg2) {
            return ~arg3 > ~arg0 ? arg3 : arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2893;
        if (this.field2880 != null) {
            class236 var11 = ~super.field695 != 0 && ~super.field713 == -1 ? class99.method619(super.field695, 4) : null;
            class236 var12 = super.field737 == -1 || this.field2881 || ~super.field737 == ~super.field715 && var11 != null ? null : class99.method619(super.field737, 4);
            class221 var13 = this.field2880.method354(super.field699, -89, super.field693, var11, var12);
            if (var13 != null) {
                super.field733 = var13.method55();
                if (class210.field3854 == this) {
                    for (int var14 = class203.field3742.length + -1; ~var14 <= -1; --var14) {
                        class59 var15 = class203.field3742[var14];
                        if (var15 != null && var15.field1008 != -1) {
                            if (~var15.field989 == -2 && var15.field1004 >= 0 && class11.field145.length > var15.field1004) {
                                class65 var16 = class11.field145[var15.field1004];
                                if (var16 != null) {
                                    int var17 = var16.field723 / 32 - class210.field3854.field723 / 32;
                                    int var18 = var16.field673 / 32 + -(class210.field3854.field673 / 32);
                                    this.method1032(var15.field1008, true, arg2, arg4, arg7, arg6, var17, arg5, arg3, arg1, var18, var13, arg0);
                                }
                            }
                            if (var15.field989 == 2) {
                                int var19 = (-class129.field2389 + var15.field986) * 4 - (-2 - -(class210.field3854.field673 / 32));
                                int var20 = (-class168.field3082 + var15.field988) * 4 - -2 + -(class210.field3854.field723 / 32);
                                this.method1032(var15.field1008, true, arg2, arg4, arg7, arg6, var20, arg5, arg3, arg1, var19, var13, arg0);
                            }
                            if (~var15.field989 == -11 && ~var15.field1004 <= -1 && var15.field1004 < class68.field1120.length) {
                                class159 var21 = class68.field1120[var15.field1004];
                                if (var21 != null) {
                                    int var22 = var21.field723 / 32 - class210.field3854.field723 / 32;
                                    int var23 = var21.field673 / 32 - class210.field3854.field673 / 32;
                                    this.method1032(var15.field1008, true, arg2, arg4, arg7, arg6, var22, arg5, arg3, arg1, var23, var13, arg0);
                                }
                            }
                        }
                    }
                }
                int var24 = 0;
                int var25 = 0;
                int var26 = 0;
                if (this.field2885 != 0 && ~this.field2892 != -1) {
                    int var27 = class50.field851[arg0];
                    int var28 = class50.field853[arg0];
                    short var29 = this.field2885;
                    short var30 = this.field2892;
                    int var31 = -var30 / 2;
                    int var32 = -var29 / 2;
                    int var33 = var28 * var31 - -(var27 * var32) >> 16;
                    int var34 = var27 * var31 + -(var28 * var32) >> 16;
                    int var35 = class195.method1239(super.field723 + var34, class139.field2615, false, super.field673 + var33);
                    int var36 = var29 / 2;
                    int var37 = -var30 / 2;
                    int var38 = var27 * var37 - var28 * var36 >> 16;
                    int var39 = var27 * var36 + var28 * var37 >> 16;
                    int var40 = var30 / 2;
                    int var41 = -var29 / 2;
                    int var42 = class195.method1239(super.field723 + var38, class139.field2615, false, super.field673 + var39);
                    int var43 = var27 * var41 + var28 * var40 >> 16;
                    int var44 = var27 * var40 + -(var28 * var41) >> 16;
                    int var45 = var29 / 2;
                    int var46 = class195.method1239(super.field723 + var44, class139.field2615, false, super.field673 + var43);
                    int var47 = var30 / 2;
                    int var48 = var27 * var45 + var28 * var47 >> 16;
                    int var49 = var27 * var47 + -(var28 * var45) >> 16;
                    int var50 = ~var35 <= ~var42 ? var42 : var35;
                    int var51 = class195.method1239(super.field723 + var49, class139.field2615, false, super.field673 + var48);
                    int var52 = ~var51 < ~var46 ? var46 : var51;
                    var24 = (int) (Math.atan2((double) (-var52 + var50), (double) var30) * 325.95D) & 2047;
                    if (var24 != 0) {
                        var13.method1389(var24);
                    }
                    int var53 = var35 + var51;
                    int var54 = var42 >= var51 ? var51 : var42;
                    if (~(var42 + var46) > ~var53) {
                        var53 = var42 + var46;
                    }
                    int var55 = var35 >= var46 ? var46 : var35;
                    var26 = 2047 & (int) (Math.atan2((double) (-var54 + var55), (double) var29) * 325.95D);
                    if (~var26 != -1) {
                        var13.method1375(var26);
                    }
                    var25 = (var53 >> 1) + -super.field719;
                    if (var25 != 0) {
                        var13.method1376(0, var25, 0);
                    }
                }
                class221 var56 = null;
                if (!this.field2881 && super.field731 != -1 && super.field740 != -1) {
                    class217 var57 = class108.method689(super.field731, 1);
                    var56 = var57.method1353((byte) 103, super.field740);
                    if (var56 != null) {
                        var56.method1376(0, -super.field717, 0);
                        if (var57.field3968) {
                            if (~var24 != -1) {
                                var56.method1389(var24);
                            }
                            if (~var26 != -1) {
                                var56.method1375(var26);
                            }
                            if (var25 != 0) {
                                var56.method1376(0, var25, 0);
                            }
                        }
                    }
                }
                class221 var58 = null;
                if (!this.field2881 && this.field2896 != null) {
                    if (~this.field2899 >= ~class30.field460) {
                        this.field2896 = null;
                    }
                    if (class30.field460 >= this.field2901 && ~class30.field460 > ~this.field2899) {
                        var58 = this.field2896;
                        var58.method1376(-super.field673 + this.field2883, -super.field719 + this.field2873, -super.field723 + this.field2895);
                        if (~super.field739 == -513) {
                            var58.method1385();
                        } else if (super.field739 != 1024) {
                            if (~super.field739 == -1537) {
                                var58.method1387();
                            }
                        } else {
                            var58.method1380();
                        }
                    }
                }
                if (var56 != null) {
                    var13 = ((class242) var13).method1540(var56);
                }
                if (var58 != null) {
                    var13 = ((class242) var13).method1540(var58);
                }
                var13.field4025 = true;
                var13.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                if (var58 != null) {
                    if (~super.field739 != -513) {
                        if (super.field739 == 1024) {
                            var58.method1380();
                        } else if (super.field739 == 1536) {
                            var58.method1385();
                        }
                    } else {
                        var58.method1387();
                    }
                    var58.method1376(-this.field2883 + super.field673, -this.field2873 + super.field719, -this.field2895 + super.field723);
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1035(int arg0, Component arg1) {
        ++field2876;
        arg1.removeMouseListener(class69.field1147);
        if (arg0 != 6967) {
            field2874 = -111;
        }
        arg1.removeMouseMotionListener(class69.field1147);
        arg1.removeFocusListener(class69.field1147);
        class82.field1384 = 0;
    }
}
