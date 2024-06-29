import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class408 {

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public int field5665;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Lns;")
    public static class408 field5662 = new class408(1);

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lns;")
    public static class408 field5666 = new class408(2);

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lns;")
    public static class408 field5667 = new class408(4);

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "Lns;")
    public static class408 field5668 = new class408(1);

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lns;")
    public static class408 field5669 = new class408(2);

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "Lns;")
    public static class408 field5670 = new class408(4);

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "Lns;")
    public static class408 field5671 = new class408(2);

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Lns;")
    public static class408 field5672 = new class408(4);

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field5673 = 0;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 5)
    public static void method2385(int arg0) {
        field5672 = null;
        field5662 = null;
        field5671 = null;
        field5670 = null;
        field5669 = null;
        field5666 = null;
        field5668 = null;
        field5667 = null;
        if (arg0 != 2) {
            method2385(-9);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Ljava/lang/String;", line = 25)
    public static final String method2386(int arg0) {
        int var1 = -112 / ((45 - arg0) / 63);
        field5664++;
        if (class403.field5625 || class218.field3147 == null) {
            return "";
        } else if ((class218.field3147.field5965 == null || class218.field3147.field5965.length() == 0) && class218.field3147.field5952 != null && class218.field3147.field5952.length() > 0) {
            return class218.field3147.field5952;
        } else {
            return class218.field3147.field5965;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(FFFBLcq;IFIIIF)[B", line = 50)
    public static final byte[] method2387(float arg0, float arg1, float arg2, byte arg3, class470 arg4, int arg5, float arg6, int arg7, int arg8, int arg9, float arg10) {
        field5663++;
        byte[] var11 = new byte[arg5 * arg9 * arg7];
        class336.method2025(arg10, arg8, 0, arg0, arg1, arg5, arg4, 0, arg9, arg6, arg7, arg2, var11);
        if (arg3 < 111) {
            field5668 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!ns", name = "toString", descriptor = "()Ljava/lang/String;", line = 69)
    public final String toString() {
        field5661++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V", line = 77)
    private class408(int arg0) {
        this.field5665 = arg0;
    }
}
