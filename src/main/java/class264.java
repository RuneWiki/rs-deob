import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class264 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field3634 = new int[32];

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lan;")
    public static class22 field3635 = new class22();

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
    public final int method1603(int arg0) {
        if (arg0 != 32767) {
            method1605((byte) -37);
        }
        field3637++;
        return this.field3632;
    }

    @OriginalMember(owner = "client!sb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3633++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILun;)Ljava/lang/String;")
    public static final String method1604(int arg0, class389 arg1) {
        field3631++;
        if (arg0 <= 60) {
            method1604(-6, null);
        }
        return class302.method1793(32767, 0, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1605(byte arg0) {
        field3634 = null;
        if (arg0 < 46) {
            method1605((byte) -15);
        }
        field3635 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class264(String arg0, int arg1) {
        this.field3632 = arg1;
    }
}
