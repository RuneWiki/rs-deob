import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class478 extends class335 {

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    private int field6649 = 5;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    private int field6657 = 1;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[S")
    private short[] field6653 = new short[512];

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    private int field6648 = 0;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    private int field6646 = 2;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "[B")
    private byte[] field6652 = new byte[512];

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private int field6659 = 5;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    private int field6656 = 2048;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "[I")
    public static int[] field6647 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!o", name = "O", descriptor = "J")
    public static long field6658 = 0L;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field6651 = 0;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class478() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I")
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            this.field6659 = 45;
        }
        ++field6650;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = 2048 - -(class686.field9697[arg1] * this.field6659);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class649.field8968 < ~var7; ++var7) {
                class365.field4822 = Integer.MAX_VALUE;
                class659.field9390 = Integer.MAX_VALUE;
                class426.field5746 = Integer.MAX_VALUE;
                class336.field4544 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class376.field4981[var7] * this.field6649);
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field6652[255 & (~this.field6659 < ~var11 ? var11 : -this.field6659 + var11)];
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = 2 * (this.field6652[var13 - -(this.field6649 > var14 ? var14 : -this.field6649 + var14) & 255] & 255);
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field6653[var15];
                        int var17 = -this.field6653[var27] + var4 + -(var11 << 12);
                        int var18 = this.field6657;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = var26 < var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class336.field4544 < ~var19) {
                            class365.field4822 = class659.field9390;
                            class659.field9390 = class426.field5746;
                            class426.field5746 = class336.field4544;
                            class336.field4544 = var19;
                        } else if (var19 < class426.field5746) {
                            class365.field4822 = class659.field9390;
                            class659.field9390 = class426.field5746;
                            class426.field5746 = var19;
                        } else if (class659.field9390 <= var19) {
                            if (var19 < class365.field4822) {
                                class365.field4822 = var19;
                            }
                        } else {
                            class365.field4822 = class659.field9390;
                            class659.field9390 = var19;
                        }
                    }
                }
                int var12 = this.field6646;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class336.field4544 + class426.field5746;
                                }
                            } else {
                                var3[var7] = class365.field4822;
                            }
                        } else {
                            var3[var7] = class659.field9390;
                        }
                    } else {
                        var3[var7] = class426.field5746;
                    }
                } else {
                    var3[var7] = class336.field4544;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field6659 = arg1.method930(255);
                                }
                            } else {
                                this.field6649 = arg1.method930(arg2 + 321);
                            }
                        } else {
                            this.field6657 = arg1.method930(arg2 + 321);
                        }
                    } else {
                        this.field6646 = arg1.method930(arg2 ^ -191);
                    }
                } else {
                    this.field6656 = arg1.method963(arg2 ^ 59);
                }
            } else {
                this.field6648 = arg1.method930(arg2 ^ -191);
            }
        } else {
            this.field6649 = this.field6659 = arg1.method930(255);
        }
        if (arg2 != -66) {
            method2753(10);
        }
        ++field6654;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    private final void method2751(boolean arg0) {
        if (arg0) {
            ++field6655;
            Random var2 = new Random((long) this.field6648);
            this.field6653 = new short[512];
            if (~this.field6656 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field6653[var3] = (short) class584.method3227(false, this.field6656, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lga;B)V")
    public static final void method2752(class332 arg0, byte arg1) {
        class220.field2871 = arg0;
        int var2 = 56 / ((-2 - arg1) / 32);
        ++field6645;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public static void method2753(int arg0) {
        field6647 = null;
        int var1 = -13 % ((arg0 - -56) / 52);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final void method317(byte arg0) {
        this.field6652 = class704.method3955(this.field6648, 7433);
        int var2 = 6 % ((58 - arg0) / 60);
        ++field6660;
        this.method2751(true);
    }
}
