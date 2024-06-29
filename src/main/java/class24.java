import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 extends RuntimeException {

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Ljava/lang/String;")
    public String field270;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field267;

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lt;")
    public static class35 field268 = class3.method28(false, "Tannery");

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "Lt;")
    public static class35 field272 = class3.method28(false, "Axe Shop");

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lt;")
    public static class35 field269 = class3.method28(false, "(U");

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Lt;")
    public static class35 field274 = class3.method28(false, "Helmet Shop");

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "Lt;")
    public static class35 field273 = class3.method28(false, "Windmill");

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "[Z")
    public static boolean[] field271 = new boolean[112];

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "[I")
    public static int[] field275;

    @OriginalMember(owner = "mapview!m", name = "j", descriptor = "[Ln;")
    public static class26[] field276;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)I", line = 7)
    public static final int method135(byte arg0) {
        if (arg0 != 7) {
            method136(false);
        }
        if (class7.field122 == null) {
            return 0;
        } else if (class7.field122.field102 == null) {
            return class23.field262[class7.field122.field104 & 0xFF];
        } else {
            return class23.field262[class7.field122.field102[class31.field392] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Z)V", line = 60)
    public static void method136(boolean arg0) {
        field276 = null;
        field273 = null;
        field269 = null;
        field275 = null;
        field274 = null;
        field268 = null;
        field271 = null;
        field272 = null;
        if (!arg0) {
            field271 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 79)
    public class24(Throwable arg0, String arg1) {
        this.field270 = arg1;
        this.field267 = arg0;
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 122)
    public static final void method137(Component arg0, boolean arg1) {
        if (arg1) {
            field275 = null;
        }
        arg0.removeMouseListener(class31.field393);
        arg0.removeMouseMotionListener(class31.field393);
        arg0.removeFocusListener(class31.field393);
    }
}
