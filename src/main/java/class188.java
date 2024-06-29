import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class188 extends class51 {

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    private int field3744 = 5;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    private int field3732 = 2;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
    private int field3738 = 2048;

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "I")
    private int field3748 = 5;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    private int field3737 = 0;

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "I")
    private int field3750 = 25;

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "I")
    private int field3751 = 1;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "Lea;")
    public static class38 field3736 = class9.method46((byte) 119, "(U3");

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "Lrc;")
    public static class155 field3745 = new class155(50);

    @OriginalMember(owner = "client!v", name = "yb", descriptor = "Lea;")
    public static class38 field3753 = class9.method46((byte) 116, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!v", name = "Bb", descriptor = "Lpg;")
    public static class141 field3756 = new class141();

    @OriginalMember(owner = "client!v", name = "Cb", descriptor = "I")
    public static int field3757 = 0;

    @OriginalMember(owner = "client!v", name = "Db", descriptor = "Lea;")
    public static class38 field3758 = class9.method46((byte) 107, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    private int field3729;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!v", name = "Ab", descriptor = "J")
    public static long field3755;

    @OriginalMember(owner = "client!v", name = "zb", descriptor = "Lob;")
    public static class127 field3754;

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "[[I")
    private int[][] field3746;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        ++field3728;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3748 = arg0.method509(126);
                                }
                            } else {
                                this.field3744 = arg0.method509(117);
                            }
                        } else {
                            this.field3751 = arg0.method509(127);
                        }
                    } else {
                        this.field3732 = arg0.method509(121);
                    }
                } else {
                    this.field3738 = arg0.method511(-127);
                }
            } else {
                this.field3737 = arg0.method509(116);
            }
        } else {
            this.field3744 = this.field3748 = arg0.method509(125);
        }
        if (!arg2) {
            method1264(-109, 59, -114, (class106) null, -17, 116);
        }
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
    public static final void method1263(int arg0) {
        ++field3739;
        if (arg0 != 22884) {
            field3757 = 51;
        }
        class192.field3794.method173(false);
        int var1 = class192.field3794.method176(1, arg0 ^ 22834);
        if (var1 != 0) {
            int var2 = class192.field3794.method176(2, 72);
            if (var2 == 0) {
                class96.field2163[class90.field2056++] = 2047;
            } else if (var2 == 1) {
                int var3 = class192.field3794.method176(3, 17);
                class195.field3842.method106(false, -3523, var3);
                int var4 = class192.field3794.method176(1, 34);
                if (var4 == 1) {
                    class96.field2163[class90.field2056++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class192.field3794.method176(3, 62);
                class195.field3842.method106(true, -3523, var5);
                int var6 = class192.field3794.method176(3, 125);
                class195.field3842.method106(true, -3523, var6);
                int var7 = class192.field3794.method176(1, 87);
                if (~var7 == -2) {
                    class96.field2163[class90.field2056++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class192.field3794.method176(1, 54);
                if (var8 == 1) {
                    class96.field2163[class90.field2056++] = 2047;
                }
                int var9 = class192.field3794.method176(1, 22);
                int var10 = class192.field3794.method176(7, 60);
                class10.field224 = class192.field3794.method176(2, 115);
                int var11 = class192.field3794.method176(7, 22);
                class195.field3842.method110(var11, var10, var9 == 1, arg0 + -23009);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILlh;II)V")
    public static final void method1264(int arg0, int arg1, int arg2, class106 arg3, int arg4, int arg5) {
        ++field3752;
        if (arg0 != 0) {
            method1263(-107);
        }
        class45 var6 = new class45();
        int var7 = arg3.field2393;
        var6.field1103 = arg1;
        var6.field1109 = arg3.field2354;
        var6.field1095 = arg3.field2376;
        var6.field1092 = arg4 * 128;
        var6.field1108 = arg3.field2389;
        var6.field1114 = arg5 * 128;
        var6.field1105 = arg3.field2367 * 128;
        var6.field1110 = arg3.field2371;
        int var8 = arg3.field2405;
        if (arg2 == 1 || ~arg2 == -4) {
            var7 = arg3.field2405;
            var8 = arg3.field2393;
        }
        var6.field1107 = (arg5 - -var8) * 128;
        var6.field1113 = (arg4 - -var7) * 128;
        if (arg3.field2364 != null) {
            var6.field1101 = arg3;
            var6.method330(-870);
        }
        class14.field298.method1014((byte) -100, var6);
        if (var6.field1095 != null) {
            var6.field1118 = var6.field1108 - -((int) ((double) (-var6.field1108 + var6.field1109) * Math.random()));
        }
    }

    @OriginalMember(owner = "client!v", name = "j", descriptor = "(I)V")
    public static final void method1265(int arg0) {
        ++field3734;
        for (int var1 = 0; var1 < class90.field2056; ++var1) {
            int var2 = class96.field2163[var1];
            class144 var3 = class175.field3550[var2];
            int var4 = class192.field3794.method509(117);
            if ((32 & var4) != 0) {
                var4 += class192.field3794.method509(117) << 8;
            }
            class59.method429(88, var3, var4, var2);
        }
        if (arg0 <= 46) {
            field3757 = -119;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        int[] var3 = super.field1312.method827(arg1, true);
        ++field3730;
        if (arg0 >= -125) {
            method1264(116, -24, 120, (class106) null, -18, 13);
        }
        if (super.field1312.field2271) {
            int var4 = class170.field3490[arg1];
            int var5 = this.field3732;
            if (~var5 != -3) {
                if (var5 == 1) {
                    for (int var6 = 0; ~var6 > ~class86.field2008; ++var6) {
                        int var7 = class196.field3854[var6];
                        var3[var6] = this.method1266(var7, true, var4, 2)[1];
                    }
                } else {
                    for (int var8 = 0; ~var8 > ~class86.field2008; ++var8) {
                        int var9 = class196.field3854[var8];
                        var3[var8] = this.method1266(var9, true, var4, 1)[0];
                    }
                }
            } else {
                for (int var10 = 0; class86.field2008 > var10; ++var10) {
                    int var11 = class196.field3854[var10];
                    int[] var12 = this.method1266(var11, true, var4, 2);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII)[I")
    private final int[] method1266(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3733;
        if (!arg1) {
            field3757 = -81;
        }
        int[] var5 = new int[arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field3743 + arg0;
        int var8 = this.field3740 + arg2;
        if (var7 > 4096) {
            var7 -= 4096;
        }
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var9 = this.field3744 * var7 >> 12;
        int var10 = this.field3748 * var8 >> 12;
        int var11 = Integer.MAX_VALUE;
        int var12 = -1;
        int var13 = -1;
        int var14 = Integer.MAX_VALUE;
        int var15 = this.field3744 <= 2 ? this.field3744 - 1 : 2;
        int var16 = this.field3748 <= 2 ? this.field3748 + -1 : 2;
        for (int var17 = -var15; ~var17 >= ~var15; ++var17) {
            for (int var25 = -var16; ~var25 >= ~var16; ++var25) {
                int var26 = var9 + var17;
                if (var26 < 0) {
                    var26 += this.field3744;
                }
                int var27 = var10 + var25;
                if (~this.field3744 >= ~var26) {
                    var26 -= this.field3744;
                }
                if (var27 < 0) {
                    var27 += this.field3748;
                }
                if (this.field3748 <= var27) {
                    var27 -= this.field3748;
                }
                int var28 = this.field3744 * var27 - -var26;
                int var29 = this.field3746[var28][0];
                int var30 = this.field3746[var28][1];
                int var31 = -var29 + var7;
                if (~var31 > -1) {
                    var31 = -var31;
                }
                int var32 = -var30 + var8;
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (var32 > 2048) {
                    var32 = -var32 + 4096;
                }
                if (var31 > 2048) {
                    var31 = -var31 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (var33 < var11) {
                    if (~var12 != 0) {
                        var14 = var11;
                        var12 = var13;
                    } else {
                        var14 = var33;
                        var12 = var28;
                    }
                    var13 = var28;
                    var11 = var33;
                } else if (~var12 == ~var13 && ~var12 != ~var28 || ~var33 > ~var14 && ~var13 != ~var28) {
                    var12 = var28;
                    var14 = var33;
                }
            }
        }
        int var18 = -this.field3746[var13][0] + var7;
        int var19 = var8 - this.field3746[var13][1];
        if (~var18 > -1) {
            var18 = -var18;
        }
        if (~var18 < -2049) {
            var18 = -var18 + 4096;
        }
        int var20 = var7 - this.field3746[var12][0];
        if (~var20 > -1) {
            var20 = -var20;
        }
        int var21 = -this.field3746[var12][1] + var8;
        if (~var20 < -2049) {
            var20 = -var20 + 4096;
        }
        if (var19 < 0) {
            var19 = -var19;
        }
        if (var19 > 2048) {
            var19 = -var19 + 4096;
        }
        if (var21 < 0) {
            var21 = -var21;
        }
        if (var21 > 2048) {
            var21 = -var21 + 4096;
        }
        int var22 = this.field3751;
        int var23;
        int var24;
        if (~var22 != -2) {
            if (~var22 == -3) {
                var23 = Math.max(var18, var19);
                var24 = Math.max(var20, var21);
            } else {
                var24 = var20 * var20 + var21 * var21;
                var23 = var18 * var18 - -(var19 * var19);
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 - -(var19 * var19)));
            var24 = (int) Math.sqrt((double) (var20 * var20 - -(var21 * var21)));
        }
        if (arg3 > 1) {
            var5[1] = this.field3729 * var24;
        }
        var5[0] = this.field3729 * var23;
        return var5;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public static void method1267(byte arg0) {
        field3736 = null;
        field3754 = null;
        field3753 = null;
        if (arg0 != -76) {
            method1267((byte) -3);
        }
        field3745 = null;
        field3756 = null;
        field3758 = null;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)Lr;")
    public static final class152 method1268(int arg0, int arg1) {
        int var2 = 42 % ((arg0 - -26) / 44);
        class152 var3 = (class152) class67.field1643.method1078((byte) 22, (long) arg1);
        ++field3731;
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class38.field797.method215(arg1, 9, 1);
            class152 var5 = new class152();
            var5.field3157 = arg1;
            if (var4 != null) {
                var5.method1066((byte) 30, new class66(var4));
            }
            var5.method1067(false);
            class67.field1643.method1076((long) arg1, -4, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(I)V")
    private final void method1269(int arg0) {
        ++field3749;
        if (arg0 != -4096) {
            this.field3743 = 78;
        }
        Random var2 = new Random((long) this.field3737);
        int var3 = 4096 / this.field3748;
        this.field3750 = this.field3748 * this.field3744;
        this.field3746 = new int[this.field3750][2];
        this.field3740 = var3 >> 1;
        int var4 = this.field3740 * this.field3738 >> 12;
        int var5 = 4096 / this.field3744;
        this.field3743 = var5 >> 1;
        int var6 = this.field3743 * this.field3738 >> 12;
        for (int var7 = 0; ~var7 > ~this.field3748; ++var7) {
            int var8 = var3 * var7;
            for (int var9 = 0; var9 < this.field3744; ++var9) {
                int var10 = this.field3744 * var7 - -var9;
                int var11 = var6 * (-4096 + class54.method393(8192, var2, (byte) -57)) >> 12;
                int var12 = var4 * (-4096 + class54.method393(8192, var2, (byte) -74)) >> 12;
                this.field3746[var10][0] = var5 * var9 + var11;
                this.field3746[var10][1] = var12 - -var8;
            }
        }
        this.field3729 = this.field3744 > this.field3748 ? this.field3744 : this.field3748;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public final void method235(int arg0) {
        this.method1269(arg0 ^ 4094);
        ++field3747;
        if (arg0 != -2) {
            this.field3744 = -42;
        }
    }
}
