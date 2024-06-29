import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class566 {

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    private int field7820;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "Ldv;")
    public static class566 field7823 = new class566(27, 8);

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "[I")
    public static int[] field7826 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "Llt;")
    public static class580 field7825 = new class580();

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Z")
    public static boolean field7827 = false;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Lan;")
    public static class21 field7830;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "[I")
    public static int[] field7828;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public static void method3221(byte arg0) {
        if (arg0 >= -88) {
            method3223(-116, 45, 98);
        }
        field7828 = null;
        field7830 = null;
        field7823 = null;
        field7825 = null;
        field7826 = null;
    }

    @OriginalMember(owner = "client!dv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7821++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)I")
    public final int method3222(byte arg0) {
        if (arg0 != -80) {
            method3221((byte) -11);
        }
        field7824++;
        return this.field7820;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(II)V")
    public class566(int arg0, int arg1) {
        this.field7820 = arg0;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
    public static final boolean method3223(int arg0, int arg1, int arg2) {
        if (arg1 > -19) {
            method3221((byte) -36);
        }
        field7822++;
        return (arg2 & 0x10000) != 0;
    }
}
