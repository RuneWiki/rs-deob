import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 extends class89 {

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lha;")
    public static class46 field68 = class271.method1828("Hidden)2use", -46);

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field66 = 0;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "[I")
    public static int[] field69 = new int[500];

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "Lha;")
    public static class46 field73 = class271.method1828("Liste der Welten geladen", -46);

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "Z")
    public static boolean field74 = false;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field75 = -16 + (int) (Math.random() * 33.0D);

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public static int field76 = 0;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static void method15(int arg0) {
        field73 = null;
        field69 = null;
        if (arg0 > -31) {
            method15(88);
        }
        field68 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = 28 / ((arg1 - 51) / 44);
        ++field71;
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int var5 = class87.field1652[arg0];
            for (int var6 = 0; ~class241.field4284 < ~var6; ++var6) {
                var4[var6] = this.method16((byte) -41, var5, class259.field4523[var6]) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(BII)I")
    private final int method16(byte arg0, int arg1, int arg2) {
        if (arg0 >= -36) {
            return -36;
        } else {
            ++field67;
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 << 1 ^ var4;
            return -(((var5 * 15731 * var5 - -789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }
}
