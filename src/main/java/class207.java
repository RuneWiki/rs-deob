import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class207 extends class89 {

    @OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
    private int field3719 = 585;

    @OriginalMember(owner = "client!t", name = "R", descriptor = "I")
    public static int field3710 = 128;

    @OriginalMember(owner = "client!t", name = "V", descriptor = "Lha;")
    public static class46 field3714 = class271.method1828(":", -46);

    @OriginalMember(owner = "client!t", name = "X", descriptor = "I")
    public static int field3716 = -2;

    @OriginalMember(owner = "client!t", name = "Y", descriptor = "S")
    public static short field3717 = 1;

    @OriginalMember(owner = "client!t", name = "Z", descriptor = "Lha;")
    public static class46 field3718 = class271.method1828("leuchten3:", -46);

    @OriginalMember(owner = "client!t", name = "W", descriptor = "Lha;")
    public static class46 field3715 = class271.method1828("T", -46);

    @OriginalMember(owner = "client!t", name = "U", descriptor = "Lwf;")
    public static class16 field3713 = new class16(64);

    @OriginalMember(owner = "client!t", name = "S", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!t", name = "T", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!t", name = "bb", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!t", name = "cb", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
    public static final void method1463(int arg0, int arg1, int arg2, int arg3) {
        ++field3712;
        if (class38.field668 != arg1 && arg2 != 0 && class273.field4775 < 50 && ~arg0 != 0) {
            class54.field926[class273.field4775] = arg0;
            class180.field3205[class273.field4775] = arg2;
            class60.field998[class273.field4775] = arg3;
            class188.field3364[class273.field4775] = null;
            class50.field863[class273.field4775] = 0;
            ++class273.field4775;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 != -641641492) {
            method1464(2, -43, (class181) null, true);
        }
        if (arg2 == 0) {
            this.field3719 = arg0.method545((byte) -62);
        }
        ++field3711;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILpi;Z)Lkg;")
    public static final class21 method1464(int arg0, int arg1, class181 arg2, boolean arg3) {
        ++field3721;
        if (!class146.method1083(arg2, arg0, arg1, (byte) 28)) {
            return null;
        } else {
            if (!arg3) {
                method1465(false);
            }
            return class81.method641(false);
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
    public class207() {
        super(0, true);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V")
    public static void method1465(boolean arg0) {
        field3715 = null;
        field3713 = null;
        field3718 = null;
        if (arg0) {
            method1465(false);
        }
        field3714 = null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field3720;
        int var3 = -98 % ((arg1 - 51) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int var5 = class87.field1652[arg0];
            for (int var6 = 0; ~var6 > ~class241.field4284; ++var6) {
                int var7 = class259.field4523[var6];
                if (~this.field3719 > ~var7 && ~(-this.field3719 + 4096) < ~var7 && var5 > -this.field3719 + 2048 && this.field3719 + 2048 > var5) {
                    int var8 = 2048 - var7;
                    int var9 = ~var8 > -1 ? -var8 : var8;
                    int var10 = var9 << 12;
                    int var11 = var10 / (-this.field3719 + 2048);
                    var4[var6] = 4096 - var11;
                } else if (~(-this.field3719 + 2048) > ~var7 && ~var7 > ~(this.field3719 + 2048)) {
                    int var12 = var5 - 2048;
                    int var13 = var12 >= 0 ? var12 : -var12;
                    int var14 = var13 - this.field3719;
                    int var15 = var14 << 12;
                    var4[var6] = var15 / (2048 - this.field3719);
                } else if (var5 >= this.field3719 && var5 <= 4096 - this.field3719) {
                    if (~this.field3719 >= ~var7 && ~var7 >= ~(-this.field3719 + 4096)) {
                        var4[var6] = 0;
                    } else {
                        int var16 = -var5 + 2048;
                        int var17 = var16 < 0 ? -var16 : var16;
                        int var18 = var17 << 12;
                        int var19 = var18 / (2048 - this.field3719);
                        var4[var6] = 4096 - var19;
                    }
                } else {
                    int var20 = var7 + -2048;
                    int var21 = var20 >= 0 ? var20 : -var20;
                    int var22 = var21 - this.field3719;
                    int var23 = var22 << 12;
                    var4[var6] = var23 / (-this.field3719 + 2048);
                }
            }
        }
        return var4;
    }
}
