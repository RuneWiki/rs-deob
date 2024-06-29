import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class649 extends class256 {

    @OriginalMember(owner = "client!og", name = "C", descriptor = "S")
    public short field8623;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field8626 = 0;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "Ldu;")
    public static class360 field8627 = new class360(64);

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field8631;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "[[S")
    public static short[][] field8625;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(B)V", line = 4)
    public static void method3548(byte arg0) {
        if (arg0 < 82) {
            field8628 = 71;
        }
        field8627 = null;
        field8625 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method3549(int arg0, int arg1, int arg2) {
        ++field8624;
        if (arg0 != 23606) {
            method3548((byte) -40);
        }
        return (arg2 & 52) != 0;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Lha;B)Z", line = 31)
    public final boolean method1560(class59 arg0, byte arg1) {
        ++field8629;
        if (arg1 != 35) {
            field8626 = 125;
        }
        return class240.method1509(false, super.field3515, super.field3502 >> class140.field2224, this, super.field3505 >> class140.field2224);
    }

    @OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V", line = 45)
    public static final void method3550(int arg0) {
        ++field8621;
        if (class169.field2606 == null) {
            class169.field2606 = new int[65536];
            double var1 = 0.7D + -0.015D + 0.03D * Math.random();
            if (arg0 != -6747) {
                field8631 = -116;
            }
            for (int var3 = 0; ~var3 > -65537; ++var3) {
                double var4 = (double) ((var3 & 64933) >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) ((var3 & 941) >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (var3 & 127) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 + -(var6 * var8);
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (!(var20 * 6.0D < 1.0D)) {
                        if (var20 * 2.0D < 1.0D) {
                            var10 = var16;
                        } else if (var20 * 3.0D < 2.0D) {
                            var10 = (var16 - var18) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                        } else {
                            var10 = var18;
                        }
                    } else {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (-var18 + var16) * 6.0D * var4 + var18;
                    } else if (var4 * 2.0D < 1.0D) {
                        var12 = var16;
                    } else if (!(var4 * 3.0D < 2.0D)) {
                        var12 = var18;
                    } else {
                        var12 = (-var18 + var16) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                    }
                    if (var24 * 6.0D < 1.0D) {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    } else if (var24 * 2.0D < 1.0D) {
                        var14 = var16;
                    } else if (!(var24 * 3.0D < 2.0D)) {
                        var14 = var18;
                    } else {
                        var14 = (var16 - var18) * (-var24 + 0.6666666666666666D) * 6.0D + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var32 << 16) + (var33 << 8) + var34;
                class169.field2606[var3] = var35;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([Ltn;B)I", line = 164)
    public final int method1557(class87[] arg0, byte arg1) {
        if (arg1 != -58) {
            return 78;
        } else {
            ++field8630;
            int var3 = super.field3505 >> class140.field2224;
            int var4 = super.field3502 >> class140.field2224;
            int var5 = 0;
            if (class458.field6258 != var3) {
                if (class458.field6258 < var3) {
                    var5 += 2;
                }
            } else {
                ++var5;
            }
            if (~class610.field8134 != ~var4) {
                if (~var4 > ~class610.field8134) {
                    var5 += 6;
                }
            } else {
                var5 += 3;
            }
            int var6 = class327.field4665[var5];
            if (~(var6 & this.field8623) != -1) {
                return this.method1561(arg0, var3, (byte) 85, var4);
            } else if (~this.field8623 == -2 && ~var3 < -1) {
                return this.method1561(arg0, var3 + -1, (byte) 85, var4);
            } else if (this.field8623 == 4 && var3 <= class735.field10163) {
                return this.method1561(arg0, var3 + 1, (byte) 85, var4);
            } else if (this.field8623 == 8 && var4 > 0) {
                return this.method1561(arg0, var3, (byte) 85, var4 + -1);
            } else if (this.field8623 == 2 && ~class143.field2290 <= ~var4) {
                return this.method1561(arg0, var3, (byte) 85, var4 + 1);
            } else if (~this.field8623 == -17 && var3 > 0 && ~class143.field2290 <= ~var4) {
                return this.method1561(arg0, var3 - 1, (byte) 85, var4 - -1);
            } else if (~this.field8623 == -33 && ~class735.field10163 <= ~var3 && ~var4 >= ~class143.field2290) {
                return this.method1561(arg0, var3 - -1, (byte) 85, var4 - -1);
            } else if (~this.field8623 == -129 && ~var3 < -1 && ~var4 < -1) {
                return this.method1561(arg0, var3 + -1, (byte) 85, var4 + -1);
            } else if (~this.field8623 == -65 && var3 <= class735.field10163 && ~var4 < -1) {
                return this.method1561(arg0, var3 + 1, (byte) 85, var4 + -1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIII)V", line = 244)
    public class649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8623 = (short) arg5;
        super.field3515 = (byte) arg4;
        super.field3505 = arg0;
        super.field3508 = (byte) arg3;
        super.field3502 = arg2;
        super.field3510 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)Z", line = 258)
    public final boolean method1558(int arg0) {
        ++field8622;
        return arg0 > -100 ? true : class672.field9269[(super.field3505 >> class140.field2224) + -class458.field6258 + class183.field2779][(super.field3502 >> class140.field2224) + class183.field2779 - class610.field8134];
    }
}
