import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class58 {

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljava/lang/String;")
    public static String field855 = "Cancel";

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljf;")
    public static class216 field857 = new class216(5);

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ljava/lang/String;")
    public static String field861 = "yellow:";

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[J")
    public static long[] field863 = new long[100];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "J")
    public long field859;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lsc;")
    public class248 field856;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
    public static final void method374(byte arg0, int arg1) {
        if (arg0 > -26) {
            return;
        }
        field852++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class226.method1597(false);
        } else if (arg1 == 2) {
            class78.method535(-26);
        } else if (arg1 == 3) {
            class235.method1652(-12);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method375(int arg0) {
        field855 = null;
        field857 = null;
        if (arg0 > -45) {
            field857 = null;
        }
        field863 = null;
        field861 = null;
    }
}
