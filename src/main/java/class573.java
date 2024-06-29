import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class573 extends class478 {

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    private int field8128 = 10;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    private int field8130 = 0;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    private int field8135 = 2048;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "Lsb;")
    public static class305 field8137 = new class305(11, 3);

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "Lmh;")
    public static class153 field8132;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "Ltf;")
    public static class701 field8139;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "[I")
    private int[] field8126;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "[I")
    private int[] field8138;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
    public static final void method3235(int arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class689.field9699[var1] = false;
        }
        ++field8133;
        class538.field7572 = 1;
        class649.field9139 = 0;
        class475.field6842 = 0;
        if (arg0 <= -4) {
            class510.field7319 = -1;
            class307.field3791 = -1;
            class597.field8414 = -1;
            class358.field4797 = -1;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method3236(String arg0, int arg1) {
        ++field8124;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = arg1; var2 < class699.field9804; ++var2) {
                if (arg0.equalsIgnoreCase(class703.field9867[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class362.field4859.field2893);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field8130 = arg1.method620((byte) -126);
                }
            } else {
                this.field8135 = arg1.method643((byte) -77);
            }
        } else {
            this.field8128 = arg1.method620((byte) -127);
        }
        ++field8134;
        if (arg0 != 255) {
            this.method34((byte) -127);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class573() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
    private final void method3237(int arg0) {
        ++field8129;
        if (arg0 != 1) {
            this.field8126 = null;
        }
        this.field8126 = new int[this.field8128 + 1];
        int var2 = 0;
        this.field8138 = new int[this.field8128 + 1];
        int var3 = 4096 / this.field8128;
        int var4 = this.field8135 * var3 >> 12;
        for (int var5 = 0; ~this.field8128 < ~var5; ++var5) {
            this.field8138[var5] = var2;
            this.field8126[var5] = var2 + var4;
            var2 += var3;
        }
        this.field8138[this.field8128] = 4096;
        this.field8126[this.field8128] = 4096 - -this.field8126[0];
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        this.method3237(1);
        if (arg0 == 23) {
            ++field8136;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
    public static void method3238(byte arg0) {
        field8132 = null;
        if (arg0 >= -108) {
            field8132 = null;
        }
        field8139 = null;
        field8137 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lr;Z)V")
    public static final void method3239(class564 arg0, boolean arg1) {
        ++field8125;
        class517.field7368 = new class651[class274.field3434.length];
        if (!arg1) {
            for (int var2 = 0; ~var2 > ~class274.field3434.length; ++var2) {
                int var3 = class274.field3434[var2];
                class463 var4 = class658.method3651(-126, var3, class489.field7119);
                class413 var5 = arg0.method998(var4, class550.method3119(class157.field1759, var3), true);
                class517.field7368[var2] = new class651(var5, var4);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)I")
    public static final int method3240(int arg0) {
        ++field8131;
        if (class274.field3434 == null) {
            return 0;
        } else {
            if (arg0 != 1) {
                method3238((byte) -8);
            }
            return class274.field3434.length * 2;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field8127;
        if (arg1 != -11323) {
            return null;
        } else {
            int[] var3 = super.field6886.method789(arg0, (byte) 126);
            if (super.field6886.field1592) {
                int var4 = class695.field9740[arg0];
                if (this.field8130 == 0) {
                    short var5 = 0;
                    for (int var6 = 0; ~this.field8128 < ~var6; ++var6) {
                        if (var4 >= this.field8138[var6] && var4 < this.field8138[var6 + 1]) {
                            if (~var4 > ~this.field8126[var6]) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class567.method3217(var3, 0, class436.field6154, var5);
                } else {
                    for (int var7 = 0; var7 < class436.field6154; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class684.field9645[var7];
                        int var11 = this.field8130;
                        if (var11 != 1) {
                            if (var11 != 2) {
                                if (var11 == 3) {
                                    var8 = (var10 - var4 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var4 + -4096 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; this.field8128 > var12; ++var12) {
                            if (~this.field8138[var12] >= ~var8 && var8 < this.field8138[var12 + 1]) {
                                if (~this.field8126[var12] < ~var8) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }
}
