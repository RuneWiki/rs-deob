import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class374 extends class751 {

    @OriginalMember(owner = "client!bga", name = "D", descriptor = "I")
    private int field5397 = 0;

    @OriginalMember(owner = "client!bga", name = "F", descriptor = "I")
    private int field5399 = 4096;

    @OriginalMember(owner = "client!bga", name = "G", descriptor = "I")
    public static int field5400 = -1;

    @OriginalMember(owner = "client!bga", name = "A", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!bga", name = "C", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!bga", name = "E", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!bga", name = "H", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!bga", name = "B", descriptor = "Z")
    public static boolean field5395;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(IB)V")
    public static final void method2323(int arg0, byte arg1) {
        ++field5394;
        if (~class757.field10456 != ~arg0) {
            if (~arg0 == -14) {
                if (class669.field9400 == null) {
                    class623.method3559(class676.field9624, class336.field4992, false, class222.field3160);
                } else {
                    class467.method2756(class222.field3160, (byte) 125);
                }
            }
            if (arg0 != 13 && class435.field6187 != null) {
                class435.field6187.method201(29);
                class435.field6187 = null;
            }
            int var2 = 20 % ((arg1 - -91) / 33);
            if (~arg0 == -4) {
                class619.method3537(2028208128, class730.field10207 != class251.field3546);
            }
            if (~arg0 == -8) {
                class61.method373(class711.field10012 != class251.field3546, (byte) 20);
            }
            if (~arg0 == -6) {
                if (class669.field9400 != null) {
                    class772.method4243(true);
                } else {
                    class271.method1767(class676.field9624, true, class336.field4992);
                }
            } else if (arg0 != 6) {
                if (~arg0 != -10) {
                    if (~arg0 == -13) {
                        if (class669.field9400 == null) {
                            class271.method1767(class676.field9624, true, class336.field4992);
                        } else {
                            class772.method4243(true);
                        }
                    }
                } else if (class669.field9400 != null) {
                    class467.method2756(class222.field3160, (byte) 124);
                } else {
                    class623.method3559(class676.field9624, class336.field4992, false, class222.field3160);
                }
            } else if (class669.field9400 != null) {
                class467.method2756(class222.field3160, (byte) 120);
            } else {
                class623.method3559(class676.field9624, class336.field4992, false, class222.field3160);
            }
            if (class685.method3866(class757.field10456, -1)) {
                class518.field7400.field7650 = 2;
                class490.field6965.field7650 = 2;
                class179.field2712.field7650 = 2;
                class439.field6284.field7650 = 2;
                class145.field1851.field7650 = 2;
                class703.field9906.field7650 = 2;
                class171.field2443.field7650 = 2;
            }
            if (class685.method3866(arg0, -1)) {
                class341.field5059 = 1;
                class216.field3104 = 1;
                class358.field5207 = 0;
                class696.field9826 = 0;
                class671.field9407 = 0;
                class272.method1769(-374497842, true);
                class518.field7400.field7650 = 1;
                class490.field6965.field7650 = 1;
                class179.field2712.field7650 = 1;
                class439.field6284.field7650 = 1;
                class145.field1851.field7650 = 1;
                class703.field9906.field7650 = 1;
                class171.field2443.field7650 = 1;
            }
            if (~arg0 == -12 || ~arg0 == -4) {
                class783.method4289(-111);
            }
            boolean var3 = arg0 == 2 || class95.method672(arg0, 6) || class312.method2037((byte) 104, arg0);
            boolean var4 = ~class757.field10456 == -3 || class95.method672(class757.field10456, 6) || class312.method2037((byte) -121, class757.field10456);
            if (var3 != var4) {
                if (var3) {
                    class433.field6161 = class792.field10870;
                    if (~class145.field1852.field9025.method978((byte) -48) == -1) {
                        class427.method2543(2, false);
                    } else {
                        class574.method3338(class145.field1852.field9025.method978((byte) -112), 2, (byte) -34, class606.field8526, false, 0, class792.field10870);
                        class368.method2288(119);
                    }
                    class451.field6478.method4214(false, true);
                } else {
                    class427.method2543(2, false);
                    class451.field6478.method4214(true, true);
                }
            }
            if (class685.method3866(arg0, -1) || ~arg0 == -14) {
                class638.field8979.method444();
            }
            class757.field10456 = arg0;
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = -80 / ((arg0 - 25) / 63);
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field10415 = arg1.method842(2384) == 1;
                }
            } else {
                this.field5399 = arg1.method898((byte) -115);
            }
        } else {
            this.field5397 = arg1.method898((byte) -111);
        }
        ++field5396;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field5398;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            this.method147(-99, (byte) 113);
        }
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(arg0, (byte) -128, 0);
            for (int var5 = 0; class673.field9452 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field5397 >= ~var6) {
                    if (~var6 < ~this.field5399) {
                        var3[var5] = this.field5399;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field5397;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V")
    public class374() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)[[I")
    public final int[][] method147(int arg0, byte arg1) {
        ++field5401;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (arg1 != 57) {
            method2323(-49, (byte) -54);
        }
        if (super.field10409.field8481) {
            int[][] var4 = this.method4172(0, arg0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class673.field9452 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field5397) {
                    var8[var11] = this.field5397;
                } else if (var12 > this.field5399) {
                    var8[var11] = this.field5399;
                } else {
                    var8[var11] = var12;
                }
                if (~this.field5397 < ~var13) {
                    var9[var11] = this.field5397;
                } else if (~this.field5399 <= ~var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field5399;
                }
                if (this.field5397 > var14) {
                    var10[var11] = this.field5397;
                } else if (~var14 >= ~this.field5399) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field5399;
                }
            }
        }
        return var3;
    }
}
