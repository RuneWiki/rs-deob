import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class360 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Z")
    public boolean field5021 = true;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "[Lbb;")
    public static class381[] field5022 = new class381[16];

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Lim;")
    public static class353 field5025 = new class353(99, 7);

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "C")
    private char field5027;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public int field5020;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Ljava/lang/String;")
    public String field5024;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLge;)V")
    public final void method2231(byte arg0, class551 arg1) {
        if (arg0 < 118) {
            field5025 = null;
        }
        while (true) {
            int var3 = arg1.method3045(-125);
            if (var3 == 0) {
                field5019++;
                return;
            }
            this.method2233(arg1, (byte) 9, var3);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Z")
    public final boolean method2232(int arg0) {
        field5018++;
        if (arg0 == -116) {
            return this.field5027 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lge;BI)V")
    private final void method2233(class551 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field5027 = class515.method2865(arg1 - 9, arg0.method3051((byte) -89));
        } else if (arg2 == 2) {
            this.field5020 = arg0.method3048(-4);
        } else if (arg2 == 4) {
            this.field5021 = false;
        } else if (arg2 == 5) {
            this.field5024 = arg0.method3077(-20739);
        }
        if (arg1 != 9) {
            this.method2231((byte) -74, null);
        }
        field5023++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static void method2234(byte arg0) {
        int var1 = 43 / ((arg0 - 4) / 57);
        field5022 = null;
        field5025 = null;
    }
}
