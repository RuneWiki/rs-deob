import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class195 extends class512 {

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "[B")
    private byte[] field3042 = new byte[512];

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    private int field3046 = 0;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    private int field3044 = 2048;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    private int field3047 = 1;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    private int field3051 = 5;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "I")
    private int field3048 = 2;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
    private int field3052 = 5;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "[S")
    private short[] field3049 = new short[512];

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
    public static int field3050 = 0;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)V")
    private final void method1299(byte arg0) {
        ++field3043;
        if (arg0 == 104) {
            Random var2 = new Random((long) this.field3046);
            this.field3049 = new short[512];
            if (this.field3044 > 0) {
                for (int var3 = 0; var3 < 512; ++var3) {
                    this.field3049[var3] = (short) class235.method1620(var2, this.field3044, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        int var3 = 56 / ((arg1 - 43) / 48);
        ++field3055;
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int var5 = class412.field6233[arg0] * this.field3052 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; var8 < class402.field6113; ++var8) {
                class457.field6805 = Integer.MAX_VALUE;
                class97.field1618 = Integer.MAX_VALUE;
                class93.field1557 = Integer.MAX_VALUE;
                class366.field5688 = Integer.MAX_VALUE;
                int var9 = class276.field4540[var8] * this.field3051 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; var7 >= var12; ++var12) {
                    int var14 = 255 & this.field3042[255 & (this.field3052 > var12 ? var12 : var12 - this.field3052)];
                    for (int var15 = var10 - 1; var11 >= var15; ++var15) {
                        int var16 = (255 & this.field3042[255 & (this.field3051 <= var15 ? -this.field3051 + var15 : var15) + var14]) * 2;
                        int var28 = var16 + 1;
                        int var17 = -this.field3049[var16] + -(var15 << 12) + var9;
                        int var18 = var5 - (var12 << 12) - this.field3049[var28];
                        int var19 = this.field3047;
                        int var20;
                        if (~var19 != -2) {
                            if (~var19 != -4) {
                                if (~var19 != -5) {
                                    if (~var19 != -6) {
                                        if (~var19 == -3) {
                                            var20 = (~var17 > -1 ? -var17 : var17) + (var18 < 0 ? -var18 : var18);
                                        } else {
                                            var20 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 * var17 + var18 * var18) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var21 = var17 * var17;
                                        int var22 = var18 * var18;
                                        var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = (int) (Math.sqrt((double) ((float) (var18 < 0 ? -var18 : var18) / 4096.0F)) * 4096.0D);
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = ~var18 > -1 ? -var18 : var18;
                                int var27 = var17 < 0 ? -var17 : var17;
                                var20 = ~var27 >= ~var26 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (~var20 > ~class366.field5688) {
                            class457.field6805 = class97.field1618;
                            class97.field1618 = class93.field1557;
                            class93.field1557 = class366.field5688;
                            class366.field5688 = var20;
                        } else if (~var20 > ~class93.field1557) {
                            class457.field6805 = class97.field1618;
                            class97.field1618 = class93.field1557;
                            class93.field1557 = var20;
                        } else if (var20 < class97.field1618) {
                            class457.field6805 = class97.field1618;
                            class97.field1618 = var20;
                        } else if (~var20 > ~class457.field6805) {
                            class457.field6805 = var20;
                        }
                    }
                }
                int var13 = this.field3048;
                if (var13 != 0) {
                    if (var13 != 1) {
                        if (~var13 != -4) {
                            if (var13 != 4) {
                                if (var13 == 2) {
                                    var4[var8] = -class366.field5688 + class93.field1557;
                                }
                            } else {
                                var4[var8] = class457.field6805;
                            }
                        } else {
                            var4[var8] = class97.field1618;
                        }
                    } else {
                        var4[var8] = class93.field1557;
                    }
                } else {
                    var4[var8] = class366.field5688;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (arg0 != 12388) {
            this.field3042 = null;
        }
        this.field3042 = class78.method569((byte) -95, this.field3046);
        ++field3054;
        this.method1299((byte) 104);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)Z")
    public static final boolean method1300(int arg0, int arg1, int arg2) {
        if (arg1 >= -4) {
            method1300(112, -31, -85);
        }
        ++field3053;
        return ~(arg0 & 2048) != -1 && (55 & arg2) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field3045;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3052 = arg2.method126((byte) -125);
                                }
                            } else {
                                this.field3051 = arg2.method126((byte) -103);
                            }
                        } else {
                            this.field3047 = arg2.method126((byte) -118);
                        }
                    } else {
                        this.field3048 = arg2.method126((byte) -100);
                    }
                } else {
                    this.field3044 = arg2.method132(110);
                }
            } else {
                this.field3046 = arg2.method126((byte) -82);
            }
        } else {
            this.field3051 = this.field3052 = arg2.method126((byte) -105);
        }
        if (!arg0) {
            method1300(119, -17, -90);
        }
    }
}
