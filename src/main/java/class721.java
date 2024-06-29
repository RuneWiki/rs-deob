import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class721 {

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "Lgg;")
    public static class114 field10157 = new class114(4);

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "Lus;")
    public static class328 field10158 = new class328(10, 8);

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "I")
    public static int field10159 = -1;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V", line = 6)
    public static void method3992(int arg0) {
        if (arg0 != 71) {
            method3992(35);
        }
        field10158 = null;
        field10157 = null;
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V", line = 24)
    public static final void method3993(int arg0) {
        field10155++;
        if (arg0 != 91) {
            field10157 = null;
        }
        if (class256.field3243.toLowerCase().indexOf("microsoft") != -1) {
            class681.field9308[219] = 42;
            class681.field9308[220] = 74;
            class681.field9308[191] = 73;
            class681.field9308[221] = 43;
            class681.field9308[223] = 28;
            class681.field9308[192] = 58;
            class681.field9308[187] = 27;
            class681.field9308[186] = 57;
            class681.field9308[222] = 59;
            class681.field9308[188] = 71;
            class681.field9308[190] = 72;
            class681.field9308[189] = 26;
            return;
        }
        class681.field9308[93] = 43;
        class681.field9308[46] = 72;
        class681.field9308[44] = 71;
        class681.field9308[91] = 42;
        class681.field9308[61] = 27;
        class681.field9308[45] = 26;
        class681.field9308[59] = 57;
        class681.field9308[92] = 74;
        class681.field9308[47] = 73;
        if (class256.field3241 == null) {
            class681.field9308[222] = 59;
            class681.field9308[192] = 58;
        } else {
            class681.field9308[222] = 58;
            class681.field9308[520] = 59;
            class681.field9308[192] = 28;
        }
    }

    @OriginalMember(owner = "client!bba", name = "toString", descriptor = "()Ljava/lang/String;", line = 78)
    public final String toString() {
        field10156++;
        throw new IllegalStateException();
    }
}
