import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class226 extends class337 {

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    private int field3685 = 0;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    private int field3680 = 2048;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    private int field3687 = 10;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "Luq;")
    public static class114 field3684 = null;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "Lhn;")
    public static class509 field3690 = new class509(89, 6);

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "[I")
    private int[] field3681;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "[I")
    private int[] field3691;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "(I)V", line = 4)
    public static void method1605(int arg0) {
        field3690 = null;
        if (arg0 <= -58) {
            field3684 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BILhp;)V", line = 17)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 87 % ((arg0 - 82) / 40);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3685 = arg2.method1515((byte) 124);
                }
            } else {
                this.field3680 = arg2.method1511(117);
            }
        } else {
            this.field3687 = arg2.method1515((byte) 123);
        }
        ++field3682;
    }

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "(I)V", line = 62)
    public static final void method1606(int arg0) {
        ++field3692;
        if (~class360.field5346 != 0 && class368.field5409 != -1) {
            int var1 = ((class377.field5694 - class240.field3833) * class64.field787 >> 16) + class240.field3833;
            class64.field787 += var1;
            if (class64.field787 < 65535) {
                class532.field7786 = false;
                class359.field5330 = false;
            } else {
                class64.field787 = 65535;
                if (!class359.field5330) {
                    class532.field7786 = true;
                } else {
                    class532.field7786 = false;
                }
                class359.field5330 = true;
            }
            float var2 = (float) class64.field787 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class321.field4822 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class380.field5737[class360.field5346][var4][var5] * 3;
                int var22 = class380.field5737[class360.field5346][var4 - -1][var5] * 3;
                int var23 = (class380.field5737[class360.field5346][var4 + 2][var5] - class380.field5737[class360.field5346][var4 + 3][var5] - -class380.field5737[class360.field5346][var4 + 2][var5]) * 3;
                int var24 = class380.field5737[class360.field5346][var4][var5];
                int var25 = -var21 + var22;
                int var26 = -(var22 * 2) + var21 - -var23;
                int var27 = -var23 + var22 + -var24 + class380.field5737[class360.field5346][var4 - -2][var5];
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class473.field6831 = (int) var3[1] * -1;
            class71.field1024 = (int) var3[2] + -(class176.field2613 * 128);
            class412.field6180 = (int) var3[0] - class390.field5842 * 128;
            float[] var6 = new float[arg0];
            int var7 = class471.field6812 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class380.field5737[class368.field5409][var7][var8] * 3;
                int var15 = class380.field5737[class368.field5409][var7 + 1][var8] * 3;
                int var16 = (-class380.field5737[class368.field5409][var7 + 3][var8] - (-class380.field5737[class368.field5409][var7 + 2][var8] - class380.field5737[class368.field5409][var7 - -2][var8])) * 3;
                int var17 = class380.field5737[class368.field5409][var7][var8];
                int var18 = -var14 + var15;
                int var19 = var14 + var16 - var15 * 2;
                int var20 = class380.field5737[class368.field5409][var7 + 2][var8] - (-var15 + var17) - var16;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] + -var3[0];
            float var10 = (var6[1] + -var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class419.field6263 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 16383;
            class396.field5932 = 16383 & (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11));
            class364.field5380 = ((class380.field5737[class360.field5346][var4 + 2][3] + -class380.field5737[class360.field5346][var4][3]) * class64.field787 >> 16) + class380.field5737[class360.field5346][var4][3];
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 162)
    public class226() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "(I)V", line = 171)
    private final void method1607(int arg0) {
        ++field3688;
        this.field3681 = new int[this.field3687 + 1];
        this.field3691 = new int[this.field3687 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field3687;
        int var4 = this.field3680 * var3 >> 12;
        for (int var5 = 0; var5 < this.field3687; ++var5) {
            this.field3691[var5] = var2;
            this.field3681[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3691[this.field3687] = 4096;
        this.field3681[this.field3687] = this.field3681[0] + 4096;
        if (arg0 != 2) {
            this.method174((byte) -68);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 209)
    public final void method174(byte arg0) {
        this.method1607(2);
        if (arg0 <= 1) {
            method1606(-48);
        }
        ++field3686;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I", line = 231)
    public final int[] method179(int arg0, byte arg1) {
        ++field3689;
        if (arg1 != -11) {
            return null;
        } else {
            int[] var3 = super.field5007.method512(arg0, 0);
            if (super.field5007.field687) {
                int var4 = class505.field7381[arg0];
                if (this.field3685 == 0) {
                    short var5 = 0;
                    for (int var6 = 0; ~var6 > ~this.field3687; ++var6) {
                        if (var4 >= this.field3691[var6] && var4 < this.field3691[var6 + 1]) {
                            if (~var4 > ~this.field3681[var6]) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class414.method2602(var3, 0, class402.field5977, var5);
                } else {
                    for (int var7 = 0; ~var7 > ~class402.field5977; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class109.field1530[var7];
                        int var11 = this.field3685;
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (~var11 == -4) {
                                    var8 = (-var4 + var10 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var4 + var10 + -4096 >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; this.field3687 > var12; ++var12) {
                            if (~this.field3691[var12] >= ~var8 && this.field3691[var12 + 1] > var8) {
                                if (this.field3681[var12] > var8) {
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
