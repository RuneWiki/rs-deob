import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class107 extends class159 {

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Ljava/lang/String;")
    public String field1536;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Z")
    public static boolean field1532 = false;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field1539 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field1538 = 99;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 18)
    public static void method704(byte arg0) {
        field1539 = null;
        if (arg0 != -97) {
            method704((byte) -25);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 43)
    public class107() {
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 45)
    public class107(String arg0, int arg1) {
        this.field1536 = arg0;
    }
}
