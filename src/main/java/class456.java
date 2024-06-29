import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class456 extends class601 {

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field6315 = 0;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "[Lfd;")
    public static class298[] field6317;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BII)Z", line = 4)
    public static final boolean method2786(byte arg0, int arg1, int arg2) {
        ++field6319;
        int var3 = 125 / ((35 - arg0) / 61);
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)I", line = 17)
    public final int method36(int arg0, byte arg1) {
        ++field6314;
        if (arg1 != 22) {
            method2786((byte) -113, 17, 21);
        }
        return !class123.method764(super.field8137.field4789.method963(0), (byte) -89) ? 3 : 1;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V", line = 34)
    public final void method43(int arg0, int arg1) {
        ++field6316;
        int var3 = 15 / ((22 - arg0) / 34);
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(ILqea;)V", line = 44)
    public class456(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IB)I", line = 47)
    public static final int method2787(int arg0, byte arg1) {
        if (arg1 != -74) {
            field6323 = 47;
        }
        ++field6322;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V", line = 59)
    public static void method2788(int arg0) {
        field6317 = null;
        if (arg0 != 6) {
            method2789((byte) 17);
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V", line = 77)
    public static final void method2789(byte arg0) {
        ++field6313;
        if (arg0 >= 120) {
            if (class577.field7932 == null) {
                class577.field7932 = new int[65536];
                double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
                for (int var3 = 0; ~var3 > -65537; ++var3) {
                    double var4 = (double) (63 & var3 >> 10) / 64.0D + 0.0078125D;
                    double var6 = (double) (var3 >> 7 & 7) / 8.0D + 0.0625D;
                    double var8 = (double) (127 & var3) / 128.0D;
                    double var10 = var8;
                    double var12 = var8;
                    double var14 = var8;
                    if (var6 != 0.0D) {
                        double var16;
                        if (var8 < 0.5D) {
                            var16 = (var6 + 1.0D) * var8;
                        } else {
                            var16 = var6 + var8 - var6 * var8;
                        }
                        double var18 = var8 * 2.0D + -var16;
                        double var20 = var4 + 0.3333333333333333D;
                        if (var20 > 1.0D) {
                            --var20;
                        }
                        double var24 = var4 - 0.3333333333333333D;
                        if (!(var20 * 6.0D < 1.0D)) {
                            if (!(var20 * 2.0D < 1.0D)) {
                                if (!(var20 * 3.0D < 2.0D)) {
                                    var10 = var18;
                                } else {
                                    var10 = (-var18 + var16) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                                }
                            } else {
                                var10 = var16;
                            }
                        } else {
                            var10 = (var16 - var18) * 6.0D * var20 + var18;
                        }
                        if (var24 < 0.0D) {
                            ++var24;
                        }
                        if (var4 * 6.0D < 1.0D) {
                            var12 = (var16 - var18) * 6.0D * var4 + var18;
                        } else if (var4 * 2.0D < 1.0D) {
                            var12 = var16;
                        } else if (var4 * 3.0D < 2.0D) {
                            var12 = (0.6666666666666666D - var4) * (-var18 + var16) * 6.0D + var18;
                        } else {
                            var12 = var18;
                        }
                        if (var24 * 6.0D < 1.0D) {
                            var14 = (var16 - var18) * 6.0D * var24 + var18;
                        } else if (!(var24 * 2.0D < 1.0D)) {
                            if (var24 * 3.0D < 2.0D) {
                                var14 = (-var18 + var16) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                            } else {
                                var14 = var18;
                            }
                        } else {
                            var14 = var16;
                        }
                    }
                    double var26 = Math.pow(var10, var1);
                    double var28 = Math.pow(var12, var1);
                    double var30 = Math.pow(var14, var1);
                    int var32 = (int) (var26 * 256.0D);
                    int var33 = (int) (var28 * 256.0D);
                    int var34 = (int) (var30 * 256.0D);
                    int var35 = (var32 << 16) + (var33 << 8) - -var34;
                    class577.field7932[var3] = var35;
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Z", line = 190)
    public final boolean method2790(int arg0) {
        if (arg0 != 2048) {
            method2789((byte) -30);
        }
        ++field6320;
        return class123.method764(super.field8137.field4789.method963(arg0 + -2048), (byte) -78);
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)I", line = 205)
    public final int method2791(int arg0) {
        if (arg0 != 0) {
            field6315 = -2;
        }
        ++field6318;
        return super.field8131;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lqea;)V", line = 216)
    public class456(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I", line = 220)
    public final int method45(int arg0) {
        ++field6324;
        return arg0 != 8976 ? -77 : 0;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 234)
    public final void method41(byte arg0) {
        if (super.field8137.field4789.method962(0) && !class123.method764(super.field8137.field4789.method963(0), (byte) -29)) {
            super.field8131 = 0;
        }
        ++field6321;
        int var2 = 88 / ((59 - arg0) / 33);
        if (~super.field8131 > -1 || super.field8131 > 2) {
            super.field8131 = this.method45(8976);
        }
    }
}
