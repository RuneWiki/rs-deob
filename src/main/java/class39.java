import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class39 extends RuntimeException {

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "Ljava/lang/String;")
    public String field492;

    @OriginalMember(owner = "mapview!ua", name = "j", descriptor = "Ljava/lang/Throwable;")
    public Throwable field500;

    @OriginalMember(owner = "mapview!ua", name = "e", descriptor = "Lna;")
    public static class26 field495 = class30.method205((byte) 30, "Hunter Store");

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "I")
    public static int field494 = -1;

    @OriginalMember(owner = "mapview!ua", name = "i", descriptor = "Lna;")
    public static class26 field499 = class30.method205((byte) 16, "Dairy Churn");

    @OriginalMember(owner = "mapview!ua", name = "h", descriptor = "I")
    public static int field498 = 0;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "Lna;")
    public static class26 field491 = class30.method205((byte) 46, "Requesting");

    @OriginalMember(owner = "mapview!ua", name = "k", descriptor = "Lna;")
    public static class26 field501 = class30.method205((byte) 29, "Herbalist");

    @OriginalMember(owner = "mapview!ua", name = "g", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "Ljava/awt/Image;")
    public static Image field493;

    @OriginalMember(owner = "mapview!ua", name = "f", descriptor = "[[Lta;")
    public static class37[][] field496;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)V", line = 16)
    public static void method250(byte arg0) {
        field499 = null;
        field495 = null;
        field493 = null;
        field496 = null;
        field491 = null;
        field501 = null;
        if (arg0 != 17) {
            field494 = 111;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 66)
    public class39(Throwable arg0, String arg1) {
        this.field492 = arg1;
        this.field500 = arg0;
    }
}
