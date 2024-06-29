import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class61 extends class214 {

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "Lcs;")
    public static class351 field943 = new class351(35, 0);

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field946 = 328;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 4)
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V", line = 7)
    public static void method445(int arg0) {
        if (arg0 != -23082) {
            method446(-91, 13, (byte) 118, (class363) null);
        }
        field943 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)[I", line = 17)
    public final int[] method14(byte arg0, int arg1) {
        ++field944;
        if (arg0 != 123) {
            this.method448((byte) 31, -117, -1);
        }
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int var4 = class56.field909[arg1];
            for (int var5 = 0; ~class399.field5585 < ~var5; ++var5) {
                var3[var5] = this.method448((byte) 124, var4, class436.field5989[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIBLms;)V", line = 50)
    public static final void method446(int arg0, int arg1, byte arg2, class363 arg3) {
        ++field945;
        int var4 = 19 % ((arg2 - -14) / 58);
        class383.field5439 = arg0;
        class306.field4194 = arg1;
        class280.field3854 = arg3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)I", line = 67)
    public static final int method447(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field948;
        int var5 = arg4 & 15;
        if (arg1 != -15) {
            return 124;
        } else {
            int var6 = var5 >= 8 ? arg3 : arg2;
            int var7 = ~var5 > -5 ? arg3 : (~var5 != -13 && ~var5 != -15 ? arg0 : arg2);
            return (~(2 & var5) == -1 ? var7 : -var7) + ((1 & var5) == 0 ? var6 : -var6);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)I", line = 86)
    private final int method448(byte arg0, int arg1, int arg2) {
        if (arg0 < 123) {
            field943 = null;
        }
        ++field947;
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
