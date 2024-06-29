import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class130 extends class280 {

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1991 = " from your ignore list first.";

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
    public static final void method935(int arg0) {
        if (arg0 != -1) {
            method937((String) null, (byte) -8);
        }
        class91.field1355.method1558(arg0 - 41);
        class265.field4292.method1558(-120);
        field1990++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
    public static void method936(boolean arg0) {
        field1991 = null;
        if (!arg0) {
            field1991 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method937(String arg0, byte arg1) {
        field1992++;
        if (class63.field940 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class63.field940.field1150; var2++) {
            if (class116.method849(class215.method1545(" ", arg1 - 16, class63.field940.field1153[var2], "<br>"), arg0, (byte) 26)) {
                return var2;
            }
        }
        if (arg1 != 15) {
            field1991 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class130() {
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I)V")
    public class130(int arg0) {
        this.field1989 = arg0;
    }
}
