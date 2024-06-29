import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class124 {

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Ljr;")
    public static class112 field2128 = new class112(3000000, 200);

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "Z")
    public static boolean field2129 = false;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field2130;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1058(String arg0, int arg1) {
        field2125++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class324.field4501; var2++) {
            if (arg0.equalsIgnoreCase(class514.field7147[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class393.field5774[var2])) {
                return true;
            }
        }
        if (arg1 != 28280) {
            field2129 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2126++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
    public final int method1059(int arg0) {
        field2123++;
        if (arg0 != 200) {
            this.field2127 = -78;
        }
        return this.field2127;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method1060(boolean arg0) {
        field2130 = null;
        field2128 = null;
        if (!arg0) {
            method1058(null, -16);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(II)V")
    public class124(int arg0, int arg1) {
        this.field2127 = arg0;
        this.field2124 = arg1;
    }
}
