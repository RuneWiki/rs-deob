import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class11 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field178 = 0;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Z")
    public static boolean field184 = false;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lec;")
    public static class28 field186 = class28.method210(-46, "(U3");

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lec;")
    public static class28 field183 = class28.method210(-46, "m");

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field185 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field187 = new Object();

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lec;")
    public static class28 field190 = class28.method210(-46, "Off");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lta;")
    public static class111 field179;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Ltd;")
    public static class114 field182;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lvb;")
    public static class122 field189;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lcc;")
    public static class16 field180;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field189 = null;
        field186 = null;
        field183 = null;
        field190 = null;
        field187 = null;
        if (arg0 != 0) {
            field185 = -17;
        }
        field182 = null;
        field180 = null;
        field179 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method59(int arg0) {
        field188++;
        class43.field941.method28(false);
        for (int var1 = 0; var1 < 32; var1++) {
            class12.field210[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class74.field1629[var2] = 0L;
        }
    }
}
