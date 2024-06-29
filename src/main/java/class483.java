import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class483 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Z")
    public boolean field7031 = true;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "[[S")
    public static short[][] field7040 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "C")
    private char field7034;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field7035;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljava/lang/String;")
    public String field7033;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2893(int arg0, String arg1) {
        field7032++;
        String var2 = class420.method2473(class216.method1386(-30907, arg1), 121);
        if (arg0 != 4634) {
            method2895(-60, -55, -82);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILbt;)V")
    private final void method2894(int arg0, int arg1, class88 arg2) {
        if (arg1 != 16711680) {
            return;
        }
        if (arg0 == 1) {
            this.field7034 = class148.method1027(arg2.method575(-47), (byte) 119);
        } else if (arg0 == 2) {
            this.field7035 = arg2.method578(116);
        } else if (arg0 == 4) {
            this.field7031 = false;
        } else if (arg0 == 5) {
            this.field7033 = arg2.method591(20557);
        }
        field7036++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
    public static final int method2895(int arg0, int arg1, int arg2) {
        field7041++;
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & arg2) >>> 8;
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
    public final boolean method2896(byte arg0) {
        int var2 = 63 / ((-arg0 - 25) / 46);
        field7038++;
        return this.field7034 == 's';
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method2897(int arg0) {
        field7040 = null;
        if (arg0 != -1804455320) {
            field7040 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lbt;I)V")
    public final void method2898(class88 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method617(2);
            if (var3 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field7037++;
                return;
            }
            this.method2894(var3, 16711680, arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZ)V")
    public static final void method2899(byte arg0, boolean arg1) {
        class201.field2639++;
        class420.method2472((byte) -101, class119.field1665);
        field7039++;
        for (class367 var2 = (class367) class381.field4963.method2087(arg0 ^ 0x1B); var2 != null; var2 = (class367) class381.field4963.method2091(-127)) {
            if (!var2.method3019(-127)) {
                var2 = (class367) class381.field4963.method2087(0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4721 == 0) {
                class176.method1142(arg1, (byte) -87, true, var2);
            }
        }
        if (arg0 == 27 && class310.field4000 != null) {
            class415.method2440(10, class310.field4000);
            class310.field4000 = null;
        }
    }
}
