import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class6 extends RuntimeException {

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Ljava/lang/String;")
    public String field64;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field59;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "[J")
    public static long[] field58 = new long[32];

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "La;")
    public static class1 field63 = class3.method36("50(U", -125);

    @OriginalMember(owner = "mapview!d", name = "h", descriptor = "La;")
    public static class1 field65 = class3.method36("uitext has incorrect number of strings", -84);

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "La;")
    public static class1 field61 = class3.method36("Cooking Range", -84);

    @OriginalMember(owner = "mapview!d", name = "k", descriptor = "La;")
    public static class1 field68 = class3.method36("world", -85);

    @OriginalMember(owner = "mapview!d", name = "i", descriptor = "La;")
    public static class1 field66 = class3.method36(" ", -94);

    @OriginalMember(owner = "mapview!d", name = "j", descriptor = "La;")
    public static class1 field67 = class3.method36("Shield Shop", -126);

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field62;

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "[I")
    public static int[] field60;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)I", line = 10)
    public static final int method47(byte arg0) {
        if (arg0 != -112) {
            method49((byte) -121);
        }
        if (class7.field74 == null) {
            return 0;
        } else if (class7.field74.field509 == null) {
            return class7.field69[class7.field74.field517 & 0xFF];
        } else {
            return class7.field69[class7.field74.field509[class5.field47] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(B)[La;", line = 39)
    public static final class1[] method48(byte arg0) {
        if (arg0 <= 108) {
            method49((byte) 80);
        }
        return new class1[] { class4.field46, class2.field19, class41.field520, class30.field414, class2.field25, class5.field50, class26.field373, class21.field203, class7.field72, class28.field391, class25.field324, class27.field386, class36.field481, mapview.field272 };
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(B)V", line = 59)
    public static void method49(byte arg0) {
        field61 = null;
        field63 = null;
        field65 = null;
        field68 = null;
        field62 = null;
        if (arg0 == 10) {
            field60 = null;
            field66 = null;
            field67 = null;
            field58 = null;
        }
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 80)
    public class6(Throwable arg0, String arg1) {
        this.field64 = arg1;
        this.field59 = arg0;
    }
}
