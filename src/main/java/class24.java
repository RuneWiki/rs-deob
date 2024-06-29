import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class24 {

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "Lu;")
    public static class38 field228 = class28.method177("Saw Mill", (byte) -84);

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Lu;")
    public static class38 field231 = class28.method177("Find", (byte) -84);

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "Lu;")
    public static class38 field234 = class28.method177("Key", (byte) -84);

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "Lu;")
    public static class38 field233 = class28.method177("Altar", (byte) -84);

    @OriginalMember(owner = "mapview!la", name = "h", descriptor = "Lu;")
    public static class38 field235 = class28.method177("Loading", (byte) -84);

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "Lu;")
    public static class38 field237 = class28.method177("Combat Training", (byte) -84);

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field230;

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "[[Lpa;")
    public static class32[][] field236;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(B)V", line = 4)
    public static final void method133(byte arg0) {
        mapview.field339 = null;
        if (arg0 != -76) {
            field237 = null;
        }
        class17.field171 = null;
        class38.field485 = null;
        class18.field175 = null;
        class7.field62 = null;
        class16.field159 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)V", line = 74)
    public static void method134(int arg0) {
        field237 = null;
        field235 = null;
        field233 = null;
        field236 = null;
        field228 = null;
        field234 = null;
        field231 = null;
        if (arg0 >= 66) {
            field230 = null;
        }
    }
}
