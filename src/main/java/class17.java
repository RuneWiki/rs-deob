import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class32 {

    @OriginalMember(owner = "client!db", name = "G", descriptor = "Lff;")
    public class18 field263;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "Lqk;")
    public static class207 field264 = class24.method212(255, "<br>");

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lke;")
    public static class107 field262 = new class107(5000);

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field266 = 1;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "Lqk;")
    public static class207 field265 = class24.method212(255, "Number of player models in cache:");

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "[I")
    public static int[] field269;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static void method104(int arg0) {
        if (arg0 != 6703) {
            field265 = null;
        }
        field264 = null;
        field262 = null;
        field265 = null;
        field269 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lff;)V")
    public class17(class18 arg0) {
        this.field263 = arg0;
    }
}
