import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class513 {

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Z")
    public boolean field7321 = true;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field7316 = 0;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "C")
    private char field7319;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public int field7315;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Leq;")
    public static class209 field7322;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "Ljava/lang/String;")
    public String field7320;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z")
    public final boolean method3063(byte arg0) {
        if (arg0 >= -87) {
            return true;
        } else {
            field7318++;
            return this.field7319 == 's';
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILud;)V")
    public final void method3064(int arg0, class35 arg1) {
        field7317++;
        while (true) {
            int var3 = arg1.method273(255);
            if (var3 == 0) {
                if (arg0 == -17447) {
                    return;
                } else {
                    this.method3064(-47, null);
                    return;
                }
            }
            this.method3066(arg1, var3, -2);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method3065(int arg0) {
        if (arg0 < 62) {
            field7316 = -70;
        }
        field7322 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lud;II)V")
    private final void method3066(class35 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field7319 = class27.method199(16, arg0.method277((byte) -114));
        } else if (arg1 == 2) {
            this.field7315 = arg0.method234((byte) -127);
        } else if (arg1 == 4) {
            this.field7321 = false;
        } else if (arg1 == 5) {
            this.field7320 = arg0.method272(2);
        }
        field7323++;
    }
}
