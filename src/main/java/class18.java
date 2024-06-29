import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class18 {

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public int field185 = 0;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "[I")
    public static int[] field179 = new int[32];

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Ljava/lang/String;", line = 3)
    public static final String method114(int arg0, int arg1) {
        field183++;
        if (arg0 < 81) {
            method120(true, 90);
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 17)
    public static void method115(int arg0) {
        field179 = null;
        if (arg0 != 0) {
            method115(-92);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)Z", line = 29)
    public static final boolean method116(int arg0, int arg1, int arg2) {
        if (arg2 == 458752) {
            field182++;
            return (arg0 & 0x70000) != 0 | class113.method700(arg0, true, arg1) || class489.method2938(arg0, arg1, -20661);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lkea;IB)Lko;", line = 41)
    public static final class436 method117(class203 arg0, int arg1, byte arg2) {
        field186++;
        byte[] var3 = arg0.method1308((byte) -127, arg1);
        if (arg2 == 20) {
            return var3 == null ? null : new class436(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lrt;BI)V", line = 58)
    private final void method118(class194 arg0, byte arg1, int arg2) {
        if (arg2 == 5) {
            this.field185 = arg0.method1220(arg1 ^ 0xFFFFFF88);
        }
        if (arg1 != -9) {
            this.method119((byte) -119, null);
        }
        field184++;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLrt;)V", line = 76)
    public final void method119(byte arg0, class194 arg1) {
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                if (arg0 >= -94) {
                    field179 = null;
                }
                field181++;
                return;
            }
            this.method118(arg1, (byte) -9, var3);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZI)Leba;", line = 97)
    public static final class511 method120(boolean arg0, int arg1) {
        field178++;
        if (class529.field7659 && arg1 >= class190.field2385 && class359.field5090 >= arg1) {
            return arg0 ? null : class203.field2700[arg1 - class190.field2385];
        } else {
            return null;
        }
    }
}
