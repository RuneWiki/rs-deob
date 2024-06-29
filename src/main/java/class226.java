import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class226 extends class202 {

    @OriginalMember(owner = "client!am", name = "L", descriptor = "[I")
    public static int[] field3778 = new int[100];

    @OriginalMember(owner = "client!am", name = "M", descriptor = "F")
    public static float field3779;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field3777;
        int[] var3 = super.field3064.method2452((byte) 99, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field3064.field5837) {
                int var4 = class521.field7716[arg0];
                for (int var5 = 0; class276.field4375 > var5; ++var5) {
                    var3[var5] = this.method1628(var4, class476.field7271[var5], 100) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class226() {
        super(0, true);
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(III)I")
    private final int method1628(int arg0, int arg1, int arg2) {
        ++field3775;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return arg2 != 100 ? -83 : 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILmn;)Lwd;")
    public static final class120 method1629(int arg0, int arg1, class162 arg2) {
        ++field3776;
        byte[] var3 = arg2.method1010(arg1, (byte) 121);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 27) {
                method1629(114, -120, (class162) null);
            }
            return new class120(var3);
        }
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V")
    public static void method1630(int arg0) {
        field3778 = null;
        if (arg0 >= -74) {
            method1629(30, 49, (class162) null);
        }
    }
}
