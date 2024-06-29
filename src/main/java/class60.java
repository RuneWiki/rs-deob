import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class60 extends class101 {

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "Z")
    public static boolean field795 = false;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "Ln;")
    public static class9 field796 = new class9();

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field797 = 0;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "B")
    public byte field791;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Ljava/lang/String;")
    public String field792;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Ljava/lang/String;")
    public String field793;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 10)
    public static void method405(int arg0) {
        if (arg0 != 0) {
            field795 = false;
        }
        field796 = null;
    }
}
