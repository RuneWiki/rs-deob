import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class647 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Ljava/lang/String;")
    public String field9177;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public int field9181;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lfc;")
    public static class235 field9183 = new class235(98, 6);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I")
    public static final int method3603(byte arg0, int arg1) {
        if (arg0 < 110) {
            return -67;
        } else {
            field9179++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method3604(int arg0) {
        field9183 = null;
        if (arg0 != 255) {
            field9183 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9180++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class647(String arg0, int arg1) {
        this.field9177 = arg0;
        this.field9181 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V")
    public static final void method3605(boolean arg0, int arg1) {
        if (class525.field7175 == null || arg1 > class525.field7175.length) {
            class525.field7175 = new int[arg1];
        }
        if (arg0) {
            method3603((byte) 122, 44);
        }
        field9178++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method3606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9182++;
        for (int var6 = arg2; var6 <= arg1; var6++) {
            for (int var7 = arg3; var7 <= arg4; var7++) {
                if (class561.field7570[var6][var7] == arg0 && class205.field3022[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg5 == 98) {
            return false;
        } else {
            return false;
        }
    }
}
