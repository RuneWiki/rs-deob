import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class538 {

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Z")
    public boolean field7105 = true;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "Ldb;")
    public static class298 field7098 = new class298(92, 10);

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "Ljv;")
    public static class73 field7103 = new class73("", 17);

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "C")
    private char field7104;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public int field7101;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Ljava/lang/String;")
    public String field7106;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)Z")
    public final boolean method2974(boolean arg0) {
        field7100++;
        if (!arg0) {
            this.method2976(115, null, -66);
        }
        return this.field7104 == 's';
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method2975(int arg0) {
        field7098 = null;
        field7103 = null;
        if (arg0 != 10) {
            field7098 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILeh;I)V")
    private final void method2976(int arg0, class335 arg1, int arg2) {
        if (arg2 != 14222) {
            method2975(36);
        }
        field7099++;
        if (arg0 == 1) {
            this.field7104 = class697.method3859(arg1.method2040(arg2 - 14336), false);
        } else if (arg0 == 2) {
            this.field7101 = arg1.method2045(-98);
        } else if (arg0 == 4) {
            this.field7105 = false;
        } else if (arg0 == 5) {
            this.field7106 = arg1.method2029((byte) -73);
            return;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BLeh;)V")
    public final void method2977(byte arg0, class335 arg1) {
        field7102++;
        int var3 = 87 / ((-arg0 - 49) / 60);
        while (true) {
            int var4 = arg1.method2034(255);
            if (var4 == 0) {
                return;
            }
            this.method2976(var4, arg1, 14222);
        }
    }
}
