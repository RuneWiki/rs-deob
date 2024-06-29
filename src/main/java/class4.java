import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public abstract class class4 {

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "Lta;")
    public static class37 field43 = class20.method87(-90, "Mace Shop");

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "I")
    public static int field46 = 20;

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "Lta;")
    public static class37 field52 = class20.method87(-91, "Loading");

    @OriginalMember(owner = "mapview!c", name = "i", descriptor = "Lta;")
    public static class37 field49 = class20.method87(-99, "Agility Training");

    @OriginalMember(owner = "mapview!c", name = "g", descriptor = "Lta;")
    public static class37 field47 = class20.method87(-92, "100(U");

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Lta;")
    public static class37 field50 = class20.method87(-83, "Dungeon");

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "I")
    public static int field53 = 0;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "mapview!c", name = "h", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "J")
    public static long field44;

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "Lf;")
    public static class10 field45;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "Lba;")
    public static class3 field42;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(I)V", line = 7)
    public static void method14(int arg0) {
        field47 = null;
        field42 = null;
        field49 = null;
        field43 = null;
        if (arg0 == 20) {
            field50 = null;
            field45 = null;
            field52 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IJ)V", line = 23)
    public static final void method15(int arg0, long arg1) {
        if (arg0 != -9608) {
            field48 = -98;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 36)
    public static final void method16(int arg0, Component arg1) {
        arg1.removeMouseListener(class12.field140);
        arg1.removeMouseMotionListener(class12.field140);
        arg1.removeFocusListener(class12.field140);
        class21.field244 = arg0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III)I")
    public abstract int method17(int arg0, int arg1, int arg2);
}
