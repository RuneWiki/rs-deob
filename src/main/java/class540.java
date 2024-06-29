import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class540 extends class529 {

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    private int field7601 = 4096;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    private int field7606 = 0;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field7599 = 0;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lqi;")
    public static class669 field7604 = new class669(9, 2);

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "Lmq;")
    public static class78 field7608 = new class78(98, 0);

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class540() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([IZ[ILdv;[I)V")
    public static final void method3073(int[] arg0, boolean arg1, int[] arg2, class124 arg3, int[] arg4) {
        ++field7603;
        if (arg1) {
            method3075(40);
        }
        for (int var5 = 0; arg0.length > var5; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; ~var7 != -1 && ~var9 > ~arg3.field320.length; ++var9) {
                if ((var7 & 1) != 0) {
                    if (var6 != -1) {
                        class747 var10 = class646.field8903.method643(var6, -105);
                        int var11 = var10.field10437;
                        class645 var12 = arg3.field320[var9];
                        if (var12 != null) {
                            if (var12.field8896 != var6) {
                                if (var10.field10447 >= class646.field8903.method643(var12.field8896, -78).field10447) {
                                    var12 = arg3.field320[var9] = null;
                                }
                            } else if (var11 == 0) {
                                var12 = arg3.field320[var9] = null;
                            } else if (~var11 != -2) {
                                if (~var11 == -3) {
                                    var12.field8894 = 0;
                                }
                            } else {
                                var12.field8890 = 0;
                                var12.field8887 = 0;
                                var12.field8888 = var8;
                                var12.field8894 = 0;
                                var12.field8889 = 1;
                                if (!arg3.field417) {
                                    class107.method729(0, var10, arg3, -4855);
                                }
                            }
                        }
                        if (var12 == null) {
                            class645 var13 = arg3.field320[var9] = new class645();
                            var13.field8894 = 0;
                            var13.field8890 = 0;
                            var13.field8889 = 1;
                            var13.field8896 = var6;
                            var13.field8888 = var8;
                            var13.field8887 = 0;
                            if (!arg3.field417) {
                                class107.method729(0, var10, arg3, -4855);
                            }
                        }
                    } else {
                        arg3.field320[var9] = null;
                    }
                }
                var7 >>>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        ++field7607;
        int[][] var3 = super.field7450.method2241(arg1 + -3, arg0);
        if (arg1 != 2) {
            this.method190(116, (byte) 93, (class179) null);
        }
        if (super.field7450.field5165) {
            int[][] var4 = this.method3026(0, arg0, arg1 + 18462);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class304.field3909 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (this.field7606 > var12) {
                    var8[var11] = this.field7606;
                } else if (~this.field7601 <= ~var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field7601;
                }
                if (var13 >= this.field7606) {
                    if (~var13 < ~this.field7601) {
                        var9[var11] = this.field7601;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field7606;
                }
                if (this.field7606 <= var14) {
                    if (~this.field7601 <= ~var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field7601;
                    }
                } else {
                    var10[var11] = this.field7606;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field7605;
        int var3 = -55 % ((arg1 - 27) / 49);
        int[] var4 = super.field7456.method1635(arg0, -92);
        if (super.field7456.field3449) {
            int[] var5 = this.method3028((byte) 112, arg0, 0);
            for (int var6 = 0; var6 < class304.field3909; ++var6) {
                int var7 = var5[var6];
                if (~var7 > ~this.field7606) {
                    var4[var6] = this.field7606;
                } else if (var7 > this.field7601) {
                    var4[var6] = this.field7601;
                } else {
                    var4[var6] = var7;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field7461 = ~arg2.method1094(255) == -2;
                }
            } else {
                this.field7601 = arg2.method1107(false);
            }
        } else {
            this.field7606 = arg2.method1107(false);
        }
        if (arg1 <= 45) {
            this.field7606 = 57;
        }
        ++field7600;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZII)V")
    public static final void method3074(boolean arg0, int arg1, int arg2) {
        ++field7598;
        if (class244.field3142 != 0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; ++var3) {
                    class551.field7752[var3] = arg2;
                }
            } else {
                class551.field7752[arg1] = arg2;
            }
        }
        class106.field1297.method3673(arg1, (byte) 92, arg2);
        if (!arg0) {
            field7608 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method3075(int arg0) {
        ++field7602;
        if (class730.field10222) {
            if (arg0 != 31275) {
                method3073((int[]) null, false, (int[]) null, (class124) null, (int[]) null);
            }
            while (true) {
                while (~class374.field5248 > ~class303.field3903.length) {
                    class266 var1 = class303.field3903[class374.field5248];
                    if (var1 != null && var1.field3374 == -1) {
                        if (class426.field6053 == null) {
                            class426.field6053 = class643.field8881.method1775(1000, var1.field3367);
                        }
                        int var2 = class426.field6053.field2272;
                        if (~var2 == 0) {
                            return;
                        }
                        var1.field3374 = var2;
                        ++class374.field5248;
                        class426.field6053 = null;
                    } else {
                        ++class374.field5248;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static void method3076(boolean arg0) {
        field7604 = null;
        field7608 = null;
        if (!arg0) {
            method3074(true, 40, -76);
        }
    }
}
