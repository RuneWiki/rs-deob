import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class518 extends class330 {

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    private int field7143 = 2048;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    private int field7150 = 5;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    private int field7145 = 2;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    private int field7147 = 1;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "[S")
    private short[] field7142 = new short[512];

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    private int field7152 = 5;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    private int field7153 = 0;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "[B")
    private byte[] field7155 = new byte[512];

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field7144 = -1;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 43)
    public class518() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V", line = 9)
    private final void method3097(boolean arg0) {
        ++field7148;
        Random var2 = new Random((long) this.field7153);
        this.field7142 = new short[512];
        if (~this.field7143 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field7142[var3] = (short) class427.method2573(var2, this.field7143, -119);
            }
        }
        if (!arg0) {
            this.field7142 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V", line = 46)
    public final void method653(byte arg0) {
        ++field7151;
        this.field7155 = class750.method4151(0, this.field7153);
        this.method3097(true);
        int var2 = 61 % ((arg0 - 50) / 41);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[I", line = 78)
    public final int[] method464(int arg0, boolean arg1) {
        ++field7146;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int var4 = class300.field4352[arg0] * this.field7152 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class80.field901 < ~var7; ++var7) {
                class743.field10241 = Integer.MAX_VALUE;
                class188.field2340 = Integer.MAX_VALUE;
                class124.field1631 = Integer.MAX_VALUE;
                class255.field3777 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class404.field5705[var7] * this.field7150);
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = this.field7155[(~this.field7152 >= ~var11 ? -this.field7152 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (255 & this.field7155[var13 - -(var14 >= this.field7150 ? var14 - this.field7150 : var14) & 255]);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - (this.field7142[var15] - var8);
                        int var17 = -(var11 << 12) + var4 + -this.field7142[var27];
                        int var18 = this.field7147;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (var16 < 0 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = ~var26 <= ~var25 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class255.field3777) {
                            if (class124.field1631 <= var19) {
                                if (class188.field2340 <= var19) {
                                    if (~class743.field10241 < ~var19) {
                                        class743.field10241 = var19;
                                    }
                                } else {
                                    class743.field10241 = class188.field2340;
                                    class188.field2340 = var19;
                                }
                            } else {
                                class743.field10241 = class188.field2340;
                                class188.field2340 = class124.field1631;
                                class124.field1631 = var19;
                            }
                        } else {
                            class743.field10241 = class188.field2340;
                            class188.field2340 = class124.field1631;
                            class124.field1631 = class255.field3777;
                            class255.field3777 = var19;
                        }
                    }
                }
                int var12 = this.field7145;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class255.field3777 + class124.field1631;
                                }
                            } else {
                                var3[var7] = class743.field10241;
                            }
                        } else {
                            var3[var7] = class188.field2340;
                        }
                    } else {
                        var3[var7] = class124.field1631;
                    }
                } else {
                    var3[var7] = class255.field3777;
                }
            }
        }
        if (arg1) {
            this.field7147 = 51;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lgga;IB)V", line = 291)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field7149;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field7152 = arg0.method3013(104);
                                }
                            } else {
                                this.field7150 = arg0.method3013(10);
                            }
                        } else {
                            this.field7147 = arg0.method3013(94);
                        }
                    } else {
                        this.field7145 = arg0.method3013(-107);
                    }
                } else {
                    this.field7143 = arg0.method3002(-1);
                }
            } else {
                this.field7153 = arg0.method3013(117);
            }
        } else {
            this.field7150 = this.field7152 = arg0.method3013(28);
        }
        int var5 = -107 % ((arg2 - -41) / 42);
    }
}
