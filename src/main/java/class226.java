import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class226 extends class84 {

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field3632 = new String[500];

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "Lcc;")
    public static class216 field3630 = new class216(64);

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "Ljava/lang/String;")
    public static String field3634 = "Take";

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIZ)I")
    private final int method1619(int arg0, int arg1, boolean arg2) {
        ++field3633;
        int var4 = arg1 - -(arg0 * 57);
        int var5 = var4 << 1 ^ var4;
        if (arg2) {
            this.method1619(-109, 105, true);
        }
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IB)C")
    public static final char method1620(int arg0, byte arg1) {
        ++field3629;
        int var2 = 255 & arg1;
        if (arg0 < 94) {
            return (char) 65509;
        } else if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && ~var2 > -161) {
                char var3 = class160.field2626[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
    public static void method1621(byte arg0) {
        field3630 = null;
        field3634 = null;
        int var1 = -72 % ((-40 - arg0) / 42);
        field3632 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 >= -125) {
            field3632 = null;
        }
        ++field3631;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int var4 = class26.field301[arg1];
            for (int var5 = 0; ~var5 > ~class20.field221; ++var5) {
                var3[var5] = this.method1619(var4, class184.field2967[var5], false) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
    public class226() {
        super(0, true);
    }
}
