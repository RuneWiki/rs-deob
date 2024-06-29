import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class396 {

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "Ljn;")
    public static class134 field5617 = new class134(78, 3);

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5622 = new String[200];

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field5621 = 0;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!qha", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field5619++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z)V", line = 16)
    public static void method2440(boolean arg0) {
        field5622 = null;
        field5617 = null;
        if (arg0) {
            field5617 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)I", line = 31)
    public final int method2441(int arg0) {
        field5618++;
        if (arg0 != 3) {
            field5622 = null;
        }
        return this.field5620;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V", line = 53)
    public static final void method2442(int arg0) {
        if (arg0 >= -66) {
            method2442(3);
        }
        field5623++;
        class194.field2417.method1801(-64);
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 64)
    public class396(String arg0, int arg1) {
        this.field5620 = arg1;
    }
}
