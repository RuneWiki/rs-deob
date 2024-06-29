import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class321 extends class739 {

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    private int field4137 = -1;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "Lhg;")
    public static class693 field4141 = new class693(59, 4);

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field4144 = 0;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Lde;")
    public static class534 field4145 = new class534(64);

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "F")
    public static float field4148;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "[I")
    public int[] field4139;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)V", line = 3)
    public static final void method1885(byte arg0, int arg1) {
        ++field4138;
        if (class232.field3052 == null) {
            class232.field3052 = new byte[4][class409.field5183][class543.field7597];
        }
        if (arg1 == 16711680) {
            for (int var2 = 0; ~var2 > -5; ++var2) {
                for (int var3 = 0; ~var3 > ~class409.field5183; ++var3) {
                    for (int var4 = 0; class543.field7597 > var4; ++var4) {
                        class232.field3052[var2][var3][var4] = arg0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 40)
    public final void method1886(boolean arg0) {
        super.method1886(arg0);
        ++field4140;
        this.field4139 = null;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Z", line = 49)
    public final boolean method1887(int arg0) {
        ++field4136;
        if (this.field4139 != null) {
            return true;
        } else if (this.field4137 >= arg0) {
            class728 var2 = ~class553.field7718 > -1 ? class728.method4054(class75.field1064, this.field4137) : class728.method4059(class75.field1064, class553.field7718, this.field4137);
            var2.method4066();
            this.field4139 = var2.method4056();
            this.field4143 = var2.field10132;
            this.field4147 = var2.field10135;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V", line = 73)
    public static void method1888(int arg0) {
        field4141 = null;
        field4145 = null;
        if (arg0 != 0) {
            method1885((byte) 42, 72);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)I", line = 87)
    public final int method1889(boolean arg0) {
        if (arg0) {
            return -68;
        } else {
            ++field4146;
            return this.field4137;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lsl;II)V", line = 99)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 == -3) {
            if (arg1 == 0) {
                this.field4137 = arg0.method2566(-2);
            }
            ++field4142;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 119)
    public class321() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[[I", line = 125)
    public int[][] method223(byte arg0, int arg1) {
        ++field4135;
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (arg0 < 26) {
            field4145 = null;
        }
        if (super.field10312.field4922 && this.method1887(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field4147 * (~class549.field7672 != ~this.field4143 ? this.field4143 * arg1 / class549.field7672 : arg1);
            if (class29.field523 == this.field4147) {
                for (int var8 = 0; class29.field523 > var8; ++var8) {
                    int var9 = this.field4139[var7++];
                    var6[var8] = class702.method3949(var9, 255) << 4;
                    var5[var8] = class702.method3949(var9, 65280) >> 4;
                    var4[var8] = class702.method3949(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class29.field523 < ~var10; ++var10) {
                    int var11 = this.field4147 * var10 / class29.field523;
                    int var12 = this.field4139[var7 + var11];
                    var6[var10] = class702.method3949(var12, 255) << 4;
                    var5[var10] = class702.method3949(var12 >> 4, 4080);
                    var4[var10] = class702.method3949(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
