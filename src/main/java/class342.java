import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class342 {

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "Lig;")
    private class218 field5009;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Lku;")
    public static class342 field5015 = new class342(0, 3, class218.field3054);

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Lku;")
    public static class342 field5016 = new class342(1, 3, class218.field3054);

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "Lku;")
    public static class342 field5017 = new class342(2, 4, class218.field3050);

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "Lku;")
    public static class342 field5018 = new class342(3, 1, class218.field3054);

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "Lku;")
    public static class342 field5019 = new class342(4, 2, class218.field3054);

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "Lku;")
    public static class342 field5020 = new class342(5, 3, class218.field3054);

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "Lku;")
    public static class342 field5021 = new class342(6, 4, class218.field3054);

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field5022 = class608.method3411((byte) -118, 16);

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)Lku;", line = 4)
    public static final class342 method2133(int arg0, byte arg1) {
        field5012++;
        if (arg0 == 0) {
            return field5015;
        } else if (arg0 == 1) {
            return field5016;
        } else if (arg0 == 2) {
            return field5017;
        } else if (arg0 == 3) {
            return field5018;
        } else if (arg0 == 4) {
            return field5019;
        } else if (arg0 == 5) {
            return field5020;
        } else if (arg0 == 6) {
            return field5021;
        } else {
            if (arg1 <= 7) {
                field5018 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "toString", descriptor = "()Ljava/lang/String;", line = 79)
    public final String toString() {
        field5013++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IILig;)V", line = 92)
    private class342(int arg0, int arg1, class218 arg2) {
        this.field5011 = arg1;
        this.field5010 = arg0;
        this.field5009 = arg2;
        this.field5014 = this.field5009.field3046 * this.field5011;
        if (this.field5010 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 108)
    public static void method2134(int arg0) {
        field5018 = null;
        field5021 = null;
        field5019 = null;
        if (arg0 < 39) {
            field5016 = null;
        }
        field5016 = null;
        field5017 = null;
        field5020 = null;
        field5015 = null;
    }
}
