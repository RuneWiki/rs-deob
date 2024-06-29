import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class289 extends class397 {

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    private int field4131 = 4096;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "I")
    private int field4135 = 0;

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "I")
    private int field4134 = 2000;

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "I")
    private int field4136 = 16;

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "I")
    private int field4138 = 0;

    @OriginalMember(owner = "client!ks", name = "W", descriptor = "[I")
    public static int[] field4140 = new int[1];

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Lum;")
    public static class347 field4130 = new class347();

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ks", name = "X", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ks", name = "Z", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ks", name = "Y", descriptor = "Lbk;")
    public static class242 field4142;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IBLae;)V", line = 3)
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field4131 = arg2.method993((byte) -112);
                        }
                    } else {
                        this.field4138 = arg2.method993((byte) -88);
                    }
                } else {
                    this.field4136 = arg2.method941((byte) 126);
                }
            } else {
                this.field4134 = arg2.method993((byte) -98);
            }
        } else {
            this.field4135 = arg2.method941((byte) 125);
        }
        ++field4133;
        if (arg1 != 80) {
            this.field4138 = 46;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(Z)V", line = 66)
    public static final void method1749(boolean arg0) {
        ++field4132;
        class234 var1 = (class234) class117.field1517.method2096(-21400);
        if (arg0) {
            method1749(true);
        }
        while (var1 != null) {
            if (var1.field3272 > 0) {
                --var1.field3272;
            }
            if (~var1.field3272 != -1) {
                if (~var1.field3274 < -1) {
                    --var1.field3274;
                }
                if (~var1.field3274 == -1 && var1.field3283 >= 1 && var1.field3280 >= 1 && ~(class362.field5442 + -2) <= ~var1.field3283 && ~var1.field3280 >= ~(class203.field2813 + -2) && (var1.field3281 < 0 || class411.method2451(-103, var1.field3281, var1.field3275))) {
                    class399.method2382(var1.field3283, 110, var1.field3275, var1.field3284, var1.field3280, var1.field3279, var1.field3281, -1, var1.field3276);
                    var1.field3274 = -1;
                    if (var1.field3282 == var1.field3281 && ~var1.field3282 == 0) {
                        var1.method536(false);
                    } else if (~var1.field3282 == ~var1.field3281 && ~var1.field3285 == ~var1.field3279 && ~var1.field3278 == ~var1.field3275) {
                        var1.method536(false);
                    }
                }
            } else if (~var1.field3282 > -1 || class411.method2451(125, var1.field3282, var1.field3278)) {
                class399.method2382(var1.field3283, 85, var1.field3278, var1.field3284, var1.field3280, var1.field3285, var1.field3282, -1, var1.field3276);
                var1.method536(arg0);
            }
            var1 = (class234) class117.field1517.method2084((byte) 19);
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 262)
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)[I", line = 124)
    public final int[] method31(int arg0, int arg1) {
        ++field4141;
        if (arg0 != -780833076) {
            field4139 = 116;
        }
        int[] var3 = super.field5854.method465(arg1, 108);
        if (super.field5854.field991) {
            int var4 = this.field4131 >> 1;
            int[][] var5 = super.field5854.method461(10466);
            Random var6 = new Random((long) this.field4135);
            for (int var7 = 0; ~this.field4134 < ~var7; ++var7) {
                int var8 = this.field4131 > 0 ? this.field4138 - var4 - -class154.method931(var6, this.field4131, (byte) 8) : this.field4138;
                int var9 = (var8 & 4083) >> 4;
                int var10 = class154.method931(var6, class164.field2152, (byte) 8);
                int var11 = class154.method931(var6, class508.field7746, (byte) 8);
                int var12 = (class150.field1944[var9] * this.field4136 >> 12) + var10;
                int var13 = (class348.field5044[var9] * this.field4136 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class154.method931(var6, 4096, (byte) 8) >> 2) + 1024;
                    int var27 = ~var11 > ~var13 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class107.field1429 & var28;
                        int var31 = var21 & class340.field4948;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 266)
    public final void method24(int arg0) {
        class270.method1651((byte) -121);
        ++field4137;
        if (arg0 != 255) {
            method1750(100);
        }
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V", line = 284)
    public static void method1750(int arg0) {
        field4130 = null;
        field4140 = null;
        if (arg0 != -1) {
            field4142 = null;
        }
        field4142 = null;
    }
}
