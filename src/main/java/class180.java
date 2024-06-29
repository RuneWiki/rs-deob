import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class180 extends class23 {

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    private int field3580 = 585;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Li;")
    public static class88 field3571 = class208.method1425(105, "Fps:");

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "Li;")
    public static class88 field3574 = class208.method1425(105, "null");

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "Li;")
    public static class88 field3579 = class208.method1425(105, "unzap");

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "Ldg;")
    public static class41 field3573;

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
    public static void method1283(int arg0) {
        field3573 = null;
        field3571 = null;
        field3579 = null;
        field3574 = null;
        if (arg0 != -5462) {
            field3571 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lnb;B)V")
    public static final void method1284(class144 arg0, byte arg1) {
        ++field3578;
        if (arg1 == -32) {
            class204.field3885 = arg0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field3575;
        if (arg1 == -3) {
            if (~arg2 == -1) {
                this.field3580 = arg0.method301(79);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field3576;
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 <= 19) {
            this.field3580 = -95;
        }
        if (super.field379.field3100) {
            int var4 = class111.field2023[arg0];
            for (int var5 = 0; ~var5 > ~class70.field1276; ++var5) {
                int var6 = class22.field351[var5];
                if (var6 > this.field3580 && ~(4096 - this.field3580) < ~var6 && var4 > -this.field3580 + 2048 && ~var4 > ~(this.field3580 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3580 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field3580 + 2048 < var6 && ~(2048 - -this.field3580) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field3580;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3580 + 2048);
                } else if (~var4 <= ~this.field3580 && ~var4 >= ~(-this.field3580 + 4096)) {
                    if (this.field3580 <= var6 && var6 <= -this.field3580 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field3580);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3580;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3580 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
    public static final void method1285(boolean arg0) {
        ++field3577;
        int var1 = class33.field536 + class240.field4458.field4123;
        if (!class247.field4513[96]) {
            if (class247.field4513[97]) {
                class85.field1531 += (-class85.field1531 + 24) / 2;
            } else {
                class85.field1531 /= 2;
            }
        } else {
            class85.field1531 += (-class85.field1531 + -24) / 2;
        }
        if (!class247.field4513[98]) {
            if (!class247.field4513[99]) {
                class55.field1022 /= 2;
            } else {
                class55.field1022 += (-class55.field1022 + -12) / 2;
            }
        } else {
            class55.field1022 += (-class55.field1022 + 12) / 2;
        }
        int var2 = class240.field4458.field4138 - -class223.field4201;
        if (-var2 + class37.field666 < -500 || class37.field666 - var2 > 500 || ~(-var1 + class233.field4368) > 499 || -var1 + class233.field4368 > 500) {
            class37.field666 = var2;
            class233.field4368 = var1;
        }
        if (class37.field666 != var2) {
            class37.field666 += (var2 - class37.field666) / 16;
        }
        class207.field3932 += class85.field1531 / 2;
        class64.field1173 += class55.field1022 / 2;
        if (~class233.field4368 != ~var1) {
            class233.field4368 += (-class233.field4368 + var1) / 16;
        }
        class136.method907((byte) -51);
        if (arg0) {
            field3579 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZII)I")
    public static final int method1286(boolean arg0, int arg1, int arg2) {
        ++field3572;
        if (arg0) {
            field3571 = null;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I")
    public static int method1287(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
