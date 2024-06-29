import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class3 extends class115 {

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field105 = 127;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "[I")
    public static int[] field104 = new int[50];

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lok;")
    public static class149 field110;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 14)
    public static void method19(int arg0) {
        field110 = null;
        field104 = null;
        if (arg0 != 0) {
            method20(36, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[I)[I", line = 33)
    public static final int[] method20(int arg0, int[] arg1) {
        field107++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        if (arg0 >= -93) {
            method20(117, (int[]) null);
        }
        class25.method223(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method21(byte arg0);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Z")
    public abstract boolean method22(int arg0);
}
