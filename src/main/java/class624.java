import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class624 implements class234 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lla;")
    private class422 field8737;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Ljava/lang/String;")
    private String field8740;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8741 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Z")
    public static boolean field8743 = false;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lgba;")
    public static class702 field8742 = new class702(7500);

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field8745 = new String[200];

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "F")
    public static float field8746;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
    public final int method1161(byte arg0) {
        if (arg0 != 123) {
            method3531(14);
        }
        field8739++;
        return this.field8737.method2642(-29983, this.field8740) ? 100 : this.field8737.method2631(0, this.field8740);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method3531(int arg0) {
        if (arg0 == 200) {
            field8745 = null;
            field8742 = null;
            field8741 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lla;Ljava/lang/String;)V")
    public class624(class422 arg0, String arg1) {
        this.field8737 = arg0;
        this.field8740 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)Loi;")
    public final class696 method1156(boolean arg0) {
        field8738++;
        return arg0 ? class696.field9868 : null;
    }
}
