import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class43 extends class259 {

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Lpi;")
    public static class201 field566 = new class201(64);

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field570 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field571 = 0;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "B")
    public byte field563;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Ljava/lang/String;")
    public String field562;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ljava/lang/String;")
    public String field565;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
    public static void method264(int arg0) {
        if (arg0 == 0) {
            field570 = null;
            field566 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)Lfi;")
    public static final class229 method265(int arg0) {
        if (arg0 == 0) {
            field561++;
            return class33.field407 < class290.field4625.length ? class290.field4625[class33.field407++] : null;
        } else {
            return null;
        }
    }
}
