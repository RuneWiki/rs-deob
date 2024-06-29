import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class225 extends class288 {

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field3561 = 1;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "[Z")
    public static boolean[] field3570 = new boolean[100];

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "Lpc;")
    public static class79 field3572;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
    public static final void method1486(byte arg0, int arg1) {
        ++field3564;
        class283 var2 = class46.method360(7, -122, arg1);
        if (arg0 < 124) {
            field3562 = -98;
        }
        var2.method1900(true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIZIIIII)V")
    public static final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3566;
        int var12 = arg0 - arg2;
        int var13 = -arg8 + arg9;
        int var14 = -1;
        if (class11.field156 > 0) {
            if (class129.field2165 > 10) {
                var14 = 50 - class129.field2165 * 5 + 50;
            } else {
                var14 = class129.field2165 * 5;
            }
        }
        int var15 = 983040 / arg1;
        if (arg3 <= 111) {
            field3570 = null;
        }
        int var16 = 983040 / arg7;
        for (int var17 = -var16; var13 + var16 > var17; ++var17) {
            int var19 = arg7 * var17 + arg10 >> 16;
            int var20 = (var17 + 1) * arg7 + arg10 >> 16;
            int var21 = -var19 + var20;
            if (var21 > 0) {
                int var10000 = arg4 + var20;
                int var23 = var17 - -arg8 >> 6;
                int var24 = arg4 + var19;
                if (~var23 <= -1 && class22.field279.length + -1 >= var23) {
                    int[][] var25 = class22.field279[var23];
                    for (int var26 = -var15; var12 + var15 > var26; ++var26) {
                        int var27 = arg5 - -(arg1 * var26) >> 16;
                        int var28 = (var26 + 1) * arg1 + arg5 >> 16;
                        int var29 = -var27 + var28;
                        if (~var29 < -1) {
                            int var30 = arg11 + var27;
                            var10000 = arg11 + var28;
                            int var32 = arg2 + var26 >> 6;
                            if (~var32 <= -1 && ~var32 >= ~(var25.length + -1) && var25[var32] != null) {
                                int var33 = (var26 - -arg2 << 6 & 4032) + (63 & arg8 + var17);
                                int var34 = var25[var32][var33];
                                if (~var34 != -1) {
                                    class94 var35 = class119.method842(-56, var34 + -1);
                                    if (!class99.field1499[var35.field1337]) {
                                        if (var14 != -1 && class144.field2330 == var35.field1337) {
                                            class22 var36 = new class22();
                                            var36.field278 = var24;
                                            var36.field275 = var35.field1337;
                                            var36.field273 = var30;
                                            class99.field1485.method363(33, var36);
                                        } else {
                                            class297.field4691[var35.field1337].method174(var24 + -7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class22 var18 = (class22) class99.field1485.method365(3); var18 != null; var18 = (class22) class99.field1485.method372((byte) 7)) {
            class63.method488(var18.field278, var18.field273, 15, 16776960, var14);
            class63.method488(var18.field278, var18.field273, 13, 16776960, var14);
            class63.method488(var18.field278, var18.field273, 11, 16776960, var14);
            class63.method488(var18.field278, var18.field273, 9, 16776960, var14);
            class297.field4691[var18.field275].method174(var18.field278 + -7, var18.field273 + -7);
        }
        class99.field1485.method371(3);
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public static void method1488(int arg0) {
        if (arg0 >= -17) {
            field3572 = null;
        }
        field3572 = null;
        field3570 = null;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    public static final void method1489(byte arg0) {
        ++field3573;
        class45.method346((byte) 25, class238.field3815);
        ++class170.field2753;
        if (class189.field3020 && class44.field524) {
            int var1 = class109.field1893;
            int var2 = var1 - class278.field4454;
            int var3 = class250.field4000;
            if (class206.field3305 > var2) {
                var2 = class206.field3305;
            }
            if (class238.field3815.field1691 + var2 > class206.field3305 + class264.field4212.field1691) {
                var2 = class206.field3305 + class264.field4212.field1691 + -class238.field3815.field1691;
            }
            int var4 = var3 - class230.field3662;
            if (~class44.field528 < ~var4) {
                var4 = class44.field528;
            }
            if (arg0 >= 53) {
                int var5 = var2 - -class264.field4212.field1590 + -class206.field3305;
                if (class238.field3815.field1693 + var4 > class44.field528 + class264.field4212.field1693) {
                    var4 = class44.field528 - class238.field3815.field1693 + class264.field4212.field1693;
                }
                int var6 = -class205.field3284 + var4;
                int var7 = -class129.field2162 + var2;
                int var8 = class238.field3815.field1715;
                int var9 = -class44.field528 + class264.field4212.field1639 + var4;
                if (class238.field3815.field1702 < class170.field2753 && (var8 < var7 || var7 < -var8 || ~var6 < ~var8 || -var8 > var6)) {
                    class78.field1069 = true;
                }
                if (class238.field3815.field1556 != null && class78.field1069) {
                    class173 var10 = new class173();
                    var10.field2796 = class238.field3815;
                    var10.field2798 = class238.field3815.field1556;
                    var10.field2789 = var5;
                    var10.field2785 = var9;
                    class223.method1480(8170, var10);
                }
                if (class205.field3293 == 0) {
                    if (class78.field1069) {
                        if (class238.field3815.field1548 != null) {
                            class173 var11 = new class173();
                            var11.field2798 = class238.field3815.field1548;
                            var11.field2785 = var9;
                            var11.field2789 = var5;
                            var11.field2804 = class33.field396;
                            var11.field2796 = class238.field3815;
                            class223.method1480(8170, var11);
                        }
                        if (class33.field396 != null && client.method1505(class238.field3815) != null) {
                            class83.field1148.method1238(151, -136478397);
                            ++class146.field2357;
                            class83.field1148.method1761(class33.field396.field1680, 4334);
                            class83.field1148.method1789((byte) -38, class238.field3815.field1659);
                            class83.field1148.method1769(128, class238.field3815.field1680);
                            class83.field1148.method1764((byte) -103, class33.field396.field1659);
                        }
                    } else if ((~class224.field3556 == -2 || class140.method960(class202.field3248 + -1, (byte) -102)) && class202.field3248 > 2) {
                        class26.method183(0);
                    } else if (class202.field3248 > 0) {
                        class129.method896(16);
                    }
                    class238.field3815 = null;
                }
            }
        } else {
            if (~class170.field2753 < -2) {
                class238.field3815 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
    public class225() {
        super(3, false);
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)I")
    public static final int method1490(byte arg0) {
        int var1 = -12 % ((9 - arg0) / 50);
        ++field3565;
        return class79.field1092.method1835(18996);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method20((class264) null, (byte) 115, -103);
        }
        ++field3567;
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int[] var4 = this.method1931((byte) -127, 2, arg1);
            int[][] var5 = this.method1930(0, arg1, (byte) 111);
            int[][] var6 = this.method1930(1, arg1, (byte) 96);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var6[0];
            int[] var11 = var5[2];
            int[] var12 = var5[1];
            int[] var13 = var3[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class186.field2986; ++var16) {
                int var17 = var4[var16];
                if (~var17 == -4097) {
                    var7[var16] = var9[var16];
                    var8[var16] = var12[var16];
                    var13[var16] = var11[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var9[var16] * var17 - -(var10[var16] * var18) >> 12;
                    var8[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                    var13[var16] = var11[var16] * var17 - -(var15[var16] * var18) >> 12;
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var14[var16];
                    var13[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field4609.method579((byte) -62, arg1);
            if (super.field4609.field1059) {
                int[] var4 = this.method1931((byte) -116, 0, arg1);
                int[] var5 = this.method1931((byte) -120, 1, arg1);
                int[] var6 = this.method1931((byte) -126, 2, arg1);
                for (int var7 = 0; ~var7 > ~class186.field2986; ++var7) {
                    int var8 = var6[var7];
                    if (var8 == 4096) {
                        var3[var7] = var4[var7];
                    } else if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                }
            }
            ++field3563;
            return var3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field3571;
        if (arg1 == -19) {
            if (arg2 == 0) {
                super.field4612 = arg0.method1779(-49) == 1;
            }
        }
    }
}
