import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class389 extends class328 {

    @OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
    private int field5798 = 2048;

    @OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
    private int field5797 = 1;

    @OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
    private int field5800 = 2;

    @OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
    private int field5799 = 5;

    @OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
    private int field5806 = 5;

    @OriginalMember(owner = "client!sv", name = "R", descriptor = "[B")
    private byte[] field5812 = new byte[512];

    @OriginalMember(owner = "client!sv", name = "P", descriptor = "I")
    private int field5810 = 0;

    @OriginalMember(owner = "client!sv", name = "F", descriptor = "[S")
    private short[] field5801 = new short[512];

    @OriginalMember(owner = "client!sv", name = "O", descriptor = "Liu;")
    public static class517 field5809 = new class517(59, -1);

    @OriginalMember(owner = "client!sv", name = "G", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!sv", name = "M", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field5807;
        if (arg0 <= -97) {
            this.field5812 = class175.method1202(255, this.field5810);
            this.method2357(-1);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field5808;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int var4 = class638.field9258[arg0] * this.field5806 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class449.field6539 < ~var7; ++var7) {
                class359.field5098 = Integer.MAX_VALUE;
                class182.field2625 = Integer.MAX_VALUE;
                class125.field1985 = Integer.MAX_VALUE;
                class464.field6705 = Integer.MAX_VALUE;
                int var8 = class206.field2924[var7] * this.field5799 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = 255 & this.field5812[(~var11 > ~this.field5806 ? var11 : -this.field5806 + var11) & 255];
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = (this.field5812[255 & var13 + (var14 >= this.field5799 ? -this.field5799 + var14 : var14)] & 255) * 2;
                        int var10000 = -(var14 << 12);
                        int var28 = var15 + 1;
                        int var16 = var10000 - this.field5801[var15] + var8;
                        int var17 = -(var11 << 12) + -this.field5801[var28] + var4;
                        int var18 = this.field5797;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (var16 < 0 ? -var16 : var16) - -(~var17 > -1 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 <= -1 ? var17 : -var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = ~var25 <= ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class464.field6705) {
                            if (class125.field1985 > var19) {
                                class359.field5098 = class182.field2625;
                                class182.field2625 = class125.field1985;
                                class125.field1985 = var19;
                            } else if (~var19 > ~class182.field2625) {
                                class359.field5098 = class182.field2625;
                                class182.field2625 = var19;
                            } else if (var19 < class359.field5098) {
                                class359.field5098 = var19;
                            }
                        } else {
                            class359.field5098 = class182.field2625;
                            class182.field2625 = class125.field1985;
                            class125.field1985 = class464.field6705;
                            class464.field6705 = var19;
                        }
                    }
                }
                int var12 = this.field5800;
                if (var12 != 0) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class464.field6705 + class125.field1985;
                                }
                            } else {
                                var3[var7] = class359.field5098;
                            }
                        } else {
                            var3[var7] = class182.field2625;
                        }
                    } else {
                        var3[var7] = class125.field1985;
                    }
                } else {
                    var3[var7] = class464.field6705;
                }
            }
        }
        int var27 = -43 % ((arg1 - 48) / 56);
        return var3;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Laj;I)I")
    public static final int method2354(class261 arg0, int arg1) {
        int var2 = -16 / ((-46 - arg1) / 32);
        ++field5804;
        int var3 = arg0.method1660(-127, 2);
        int var4;
        if (~var3 != -1) {
            if (var3 == 1) {
                var4 = arg0.method1660(-128, 5);
            } else if (var3 != 2) {
                var4 = arg0.method1660(86, 11);
            } else {
                var4 = arg0.method1660(-126, 8);
            }
        } else {
            var4 = 0;
        }
        return var4;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
    public class389() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IB)V")
    public static final void method2355(int arg0, byte arg1) {
        if (arg1 == 113) {
            class62.field856 = 3;
            ++field5803;
            class47.field663 = arg0;
            class454.field6570 = -1;
            class608.field8634 = 100;
        }
    }

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)V")
    public static void method2356(int arg0) {
        if (arg0 != -1) {
            method2356(24);
        }
        field5809 = null;
    }

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
    private final void method2357(int arg0) {
        ++field5805;
        Random var2 = new Random((long) this.field5810);
        this.field5801 = new short[512];
        if (arg0 > ~this.field5798) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field5801[var3] = (short) class407.method2472(-95, var2, this.field5798);
            }
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field5806 = arg2.method1738(255);
                                }
                            } else {
                                this.field5799 = arg2.method1738(255);
                            }
                        } else {
                            this.field5797 = arg2.method1738(255);
                        }
                    } else {
                        this.field5800 = arg2.method1738(255);
                    }
                } else {
                    this.field5798 = arg2.method1745(32132);
                }
            } else {
                this.field5810 = arg2.method1738(255);
            }
        } else {
            this.field5799 = this.field5806 = arg2.method1738(255);
        }
        if (arg0 <= 75) {
            field5809 = null;
        }
        ++field5802;
    }
}
