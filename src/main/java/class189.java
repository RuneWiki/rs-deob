import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class189 extends class601 {

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[S")
    private short[] field2619 = new short[512];

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    private int field2626 = 2048;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    private int field2628 = 5;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "[B")
    private byte[] field2627 = new byte[512];

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    private int field2625 = 1;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    private int field2623 = 5;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    private int field2631 = 0;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    private int field2632 = 2;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I", line = 7)
    public final int[] method261(int arg0, byte arg1) {
        ++field2630;
        if (arg1 >= -76) {
            this.method1320(-32);
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int var4 = 2048 - -(class427.field5623[arg0] * this.field2628);
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; class418.field5518 > var7; ++var7) {
                class535.field6745 = Integer.MAX_VALUE;
                class362.field4410 = Integer.MAX_VALUE;
                class480.field6215 = Integer.MAX_VALUE;
                class740.field10033 = Integer.MAX_VALUE;
                int var8 = class64.field839[var7] * this.field2623 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field2627[255 & (this.field2628 <= var11 ? -this.field2628 + var11 : var11)];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field2627[255 & (~this.field2623 >= ~var14 ? -this.field2623 + var14 : var14) + var13] & 255) * 2;
                        int var10000 = var8 - (var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field2619[var15];
                        int var17 = var4 - this.field2619[var27] + -(var11 << 12);
                        int var18 = this.field2625;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = var16 >= 0 ? var16 : -var16;
                                var19 = var25 < var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class740.field10033 >= ~var19) {
                            if (class480.field6215 <= var19) {
                                if (~var19 > ~class362.field4410) {
                                    class535.field6745 = class362.field4410;
                                    class362.field4410 = var19;
                                } else if (~var19 > ~class535.field6745) {
                                    class535.field6745 = var19;
                                }
                            } else {
                                class535.field6745 = class362.field4410;
                                class362.field4410 = class480.field6215;
                                class480.field6215 = var19;
                            }
                        } else {
                            class535.field6745 = class362.field4410;
                            class362.field4410 = class480.field6215;
                            class480.field6215 = class740.field10033;
                            class740.field10033 = var19;
                        }
                    }
                }
                int var12 = this.field2632;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class740.field10033 + class480.field6215;
                                }
                            } else {
                                var3[var7] = class535.field6745;
                            }
                        } else {
                            var3[var7] = class362.field4410;
                        }
                    } else {
                        var3[var7] = class480.field6215;
                    }
                } else {
                    var3[var7] = class740.field10033;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V", line = 215)
    private final void method1320(int arg0) {
        ++field2621;
        if (arg0 == 18306) {
            Random var2 = new Random((long) this.field2631);
            this.field2619 = new short[512];
            if (~this.field2626 < -1) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field2619[var3] = (short) class419.method2416(this.field2626, var2, (byte) 60);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 477)
    public class189() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmc;Lmv;I)Lht;", line = 247)
    public static final class413 method1321(class234 arg0, class48 arg1, int arg2) {
        if (arg2 != 1) {
            return null;
        } else {
            ++field2622;
            class413 var3 = new class413(arg1);
            int var4 = arg0.method1509(true);
            boolean var5 = (var4 & 1) != 0;
            boolean var6 = ~(2 & var4) != -1;
            boolean var7 = (var4 & 4) != 0;
            if (var5) {
                var3.field5473[0] = arg0.method1553((byte) 39);
                var3.field5477[0] = arg0.method1553((byte) -111);
                if (arg1.field609 != -1 || arg1.field593 != -1) {
                    var3.field5473[1] = arg0.method1553((byte) 67);
                    var3.field5477[1] = arg0.method1553((byte) 50);
                }
                if (arg1.field594 != -1 || arg1.field631 != -1) {
                    var3.field5473[2] = arg0.method1553((byte) 98);
                    var3.field5477[2] = arg0.method1553((byte) 88);
                }
            }
            boolean var8 = ~(8 & var4) != -1;
            if (var6) {
                var3.field5474[0] = arg0.method1553((byte) 19);
                var3.field5475[0] = arg0.method1553((byte) 95);
                if (~arg1.field556 != 0 || ~arg1.field639 != 0) {
                    var3.field5474[1] = arg0.method1553((byte) -119);
                    var3.field5475[1] = arg0.method1553((byte) 82);
                }
            }
            if (var7) {
                int var9 = arg0.method1553((byte) -120);
                int[] var10 = new int[] { class249.method1625(15, var9), class249.method1625(var9, 240) >> 4, class249.method1625(15, var9 >> 8), class249.method1625(15, var9 >> 12) };
                for (int var11 = 0; ~var11 > -5; ++var11) {
                    if (var10[var11] != 15) {
                        var3.field5471[var10[var11]] = (short) arg0.method1553((byte) -109);
                    }
                }
            }
            if (var8) {
                int var12 = arg0.method1509(true);
                int[] var13 = new int[] { class249.method1625(var12, 15), class249.method1625(var12 >> 4, 15) };
                for (int var14 = 0; var14 < 2; ++var14) {
                    if (~var13[var14] != -16) {
                        var3.field5469[var13[var14]] = (short) arg0.method1553((byte) 117);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 345)
    public final void method292(byte arg0) {
        this.field2627 = class777.method4256(this.field2631, true);
        ++field2629;
        if (arg0 > 44) {
            this.method1320(18306);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmc;II)V", line = 357)
    public final void method259(class234 arg0, int arg1, int arg2) {
        ++field2620;
        int var4 = 122 / ((arg2 - 40) / 52);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field2628 = arg0.method1509(true);
                                }
                            } else {
                                this.field2623 = arg0.method1509(true);
                            }
                        } else {
                            this.field2625 = arg0.method1509(true);
                        }
                    } else {
                        this.field2632 = arg0.method1509(true);
                    }
                } else {
                    this.field2626 = arg0.method1553((byte) -121);
                }
            } else {
                this.field2631 = arg0.method1509(true);
            }
        } else {
            this.field2623 = this.field2628 = arg0.method1509(true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIB)V", line = 446)
    public static final void method1322(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > 104) {
            int var4 = arg0 << 3;
            ++field2624;
            int var5 = arg2 << 3;
            int var6 = arg1 << 3;
            if (~class507.field6476 == -3) {
                class463.field6022 = var4;
                class511.field6521 = var5;
                class232.field3122 = var6;
            }
            class698.field9250 = (float) var6;
            class297.field3762 = (float) var4;
            class291.method1757(-4);
            class650.field8286 = true;
        }
    }
}
