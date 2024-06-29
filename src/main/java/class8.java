import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public abstract class class8 {

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Lv;")
    public static class40 field98 = class24.method170("uitext has incorrect number of strings", (byte) 95);

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lv;")
    public static class40 field97 = class24.method170("Mining Site", (byte) 47);

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Lv;")
    public static class40 field95 = class24.method170("Dungeon", (byte) -113);

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "Lv;")
    public static class40 field104 = class24.method170("Magic Shop", (byte) 91);

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "Lv;")
    public static class40 field105 = class24.method170("Herbalist", (byte) 39);

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Lv;")
    public static class40 field96 = class24.method170("Find", (byte) 63);

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "I")
    public static volatile int field102 = 0;

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "I")
    public static volatile int field100 = -1;

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "I")
    public static volatile int field101 = 0;

    @OriginalMember(owner = "mapview!da", name = "n", descriptor = "[I")
    public static int[] field108 = new int[128];

    @OriginalMember(owner = "mapview!da", name = "m", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "mapview!da", name = "l", descriptor = "J")
    public static long field106;

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "[I")
    public static int[] field103;

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "[[B")
    public static byte[][] field99;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 11)
    public static final void method57(Component arg0, byte arg1) {
        arg0.removeMouseListener(class23.field261);
        if (arg1 >= -95) {
            field101 = 93;
        }
        arg0.removeMouseMotionListener(class23.field261);
        arg0.removeFocusListener(class23.field261);
        field102 = 0;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 31)
    public static void method58(int arg0) {
        field99 = null;
        if (arg0 >= -114) {
            method58(3);
        }
        field108 = null;
        field96 = null;
        field104 = null;
        field103 = null;
        field97 = null;
        field95 = null;
        field98 = null;
        field105 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(III)I")
    public abstract int method59(int arg0, int arg1, int arg2);
}
