import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class34 extends RuntimeException {

    @OriginalMember(owner = "mapview!s", name = "m", descriptor = "Ljava/lang/String;")
    public String field434;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field425;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Lba;")
    public static class4 field422 = class14.method105((byte) -110, "Food Shop");

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Lba;")
    public static class4 field424 = class14.method105((byte) -118, "100(U");

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Lba;")
    public static class4 field423 = class14.method105((byte) -115, "codeversion");

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Lba;")
    public static class4 field426 = class14.method105((byte) -101, "Enter place name to find");

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "I")
    public static volatile int field431 = 0;

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Lba;")
    public static class4 field429 = class14.method105((byte) -71, "overlay)3dat");

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "Lba;")
    public static class4 field428 = class14.method105((byte) -116, "Shield Shop");

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "Lba;")
    public static class4 field427 = class14.method105((byte) -71, "Silver Shop");

    @OriginalMember(owner = "mapview!s", name = "l", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "[I")
    public static int[] field430;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "[I")
    public static int[] field432;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 8)
    public static final void method220(Component arg0, int arg1) {
        arg0.addMouseListener(class35.field435);
        if (arg1 == -19202) {
            arg0.addMouseMotionListener(class35.field435);
            arg0.addFocusListener(class35.field435);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 65)
    public static void method221(int arg0) {
        field423 = null;
        field427 = null;
        field429 = null;
        field424 = null;
        field432 = null;
        field426 = null;
        field422 = null;
        field428 = null;
        if (arg0 != 64) {
            method220(null, -40);
        }
        field430 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 82)
    public class34(Throwable arg0, String arg1) {
        this.field434 = arg1;
        this.field425 = arg0;
    }
}
