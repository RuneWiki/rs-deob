import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class568 {

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Llj;")
    private class6 field7411;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    private int field7413;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public int field7416;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public int field7418;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "Liv;")
    public static class568 field7414 = new class568(0, 3, class6.field52);

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Liv;")
    public static class568 field7415 = new class568(1, 3, class6.field52);

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "Liv;")
    public static class568 field7417 = new class568(2, 4, class6.field48);

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "Liv;")
    public static class568 field7419 = new class568(3, 1, class6.field52);

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "Liv;")
    public static class568 field7420 = new class568(4, 2, class6.field52);

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "Liv;")
    public static class568 field7421 = new class568(5, 3, class6.field52);

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "Liv;")
    private static class568 field7422 = new class568(6, 4, class6.field52);

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public static int field7423 = class127.method924(12, 16);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "Liaa;")
    public static class99 field7424;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)[Liv;", line = 3)
    public static final class568[] method3037(int arg0) {
        field7412++;
        return arg0 == 3 ? new class568[] { field7414, field7415, field7417, field7419, field7420, field7421, field7422 } : null;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V", line = 15)
    public static void method3038(int arg0) {
        field7421 = null;
        field7419 = null;
        if (arg0 < 8) {
            method3037(51);
        }
        field7417 = null;
        field7420 = null;
        field7424 = null;
        field7414 = null;
        field7415 = null;
        field7422 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lfd;Z)Ljava/lang/String;", line = 32)
    public static final String method3039(class418 arg0, boolean arg1) {
        field7409++;
        return arg1 ? null : class96.method728(0, 32767, arg0);
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;", line = 48)
    public final String toString() {
        field7410++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(IILlj;)V", line = 68)
    private class568(int arg0, int arg1, class6 arg2) {
        this.field7411 = arg2;
        this.field7413 = arg1;
        this.field7416 = arg0;
        this.field7418 = this.field7411.field43 * this.field7413;
        if (this.field7416 >= 16) {
            throw new RuntimeException();
        }
    }
}
