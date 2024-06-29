import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class374 extends class31 {

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/lang/Object;")
    private Object field5295;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field5296 = new String[100];

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "[Lau;")
    public static class304[] field5291 = new class304[128];

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "[C")
    public static char[] field5294 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "B")
    public static byte field5290;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "F")
    public static float field5298;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Lbo;")
    public static class471 field5299;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "[Lms;")
    public static class363[] field5297;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class374(Object arg0, int arg1) {
        super(arg1);
        this.field5295 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method248(byte arg0) {
        if (arg0 < 101) {
            field5297 = null;
        }
        field5292++;
        return this.field5295;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        if (arg0 == -26199) {
            field5293++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
    public static void method2239(int arg0) {
        field5294 = null;
        field5297 = null;
        field5291 = null;
        field5299 = null;
        field5296 = null;
        if (arg0 != 114) {
            field5299 = null;
        }
    }
}
