import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class544 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Z")
    private boolean field7453 = false;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    private int field7462 = -1;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field7460 = new String[0];

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    private int field7461;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lcb;")
    public static class318 field7456 = new class318(47, -2);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method3061(int arg0) {
        field7469++;
        String[] var2 = new String[this.field7462 + 1];
        if (arg0 <= 61) {
            return null;
        } else {
            class657.method3640(this.field7460, 0, var2, 0, this.field7462 + 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static void method3062(int arg0) {
        field7456 = null;
        if (arg0 != -1) {
            method3062(-115);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method3063(int arg0, String arg1, int arg2) {
        field7457++;
        if (arg0 > this.field7462) {
            this.field7462 = arg0;
        }
        if (arg0 >= this.field7460.length) {
            this.method3068(arg0, (byte) 124);
        }
        if (arg2 == -1) {
            this.field7460[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IC)Z")
    public static final boolean method3064(int arg0, char arg1) {
        if (arg0 != -91) {
            field7454 = 115;
        }
        field7467++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method3065(int arg0) {
        int var1 = -84 / ((arg0 + 63) / 61);
        for (class69 var2 = (class69) class37.field371.method374((byte) 87); var2 != null; var2 = (class69) class37.field371.method372(-20740)) {
            if (class521.method2978(0, var2.field902)) {
                class417.method2424(var2, 3);
            }
        }
        field7466++;
        if (class179.field2242 == 1) {
            class477.method2671(7);
            return;
        }
        class87.method490(class169.field2116, class326.field4744, field7454, class353.field5151, -29041);
        int var3 = class446.field6129.method3312(-23728, class243.field3235.method1491(class350.field5121, (byte) 127));
        for (class69 var4 = (class69) class37.field371.method374((byte) 62); var4 != null; var4 = (class69) class37.field371.method372(-20740)) {
            int var5 = class301.method1807(var4, -32441);
            if (var5 > var3) {
                var3 = var5;
            }
        }
        class169.field2116 = class179.field2242 * 16 + (class565.field7842 ? 26 : 22);
        class353.field5151 = var3 + 8;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)I")
    private final int method3066(byte arg0, int arg1) {
        if (arg0 < 43) {
            return 41;
        }
        field7463++;
        int var3 = this.field7460.length;
        while (var3 <= arg1) {
            if (!this.field7453) {
                var3 += this.field7461;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field7461 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7465++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field7462; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field7460[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method3067(String arg0, byte arg1) {
        field7455++;
        if (arg1 <= 111) {
            this.field7461 = 37;
        }
        this.method3063(this.field7462 + 1, arg0, -1);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB)V")
    private final void method3068(int arg0, byte arg1) {
        field7459++;
        String[] var3 = new String[this.method3066((byte) 105, arg0)];
        class657.method3640(this.field7460, 0, var3, 0, this.field7460.length);
        if (arg1 == 124) {
            this.field7460 = var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static final void method3069(int arg0) {
        if (arg0 != -1) {
            method3062(95);
        }
        field7468++;
        class314.field4518 = null;
        class248.field3336 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IZ)V")
    public class544(int arg0, boolean arg1) {
        this.field7461 = arg0;
        this.field7453 = arg1;
    }
}
