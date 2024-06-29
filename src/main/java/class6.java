import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public abstract class class6 {

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Ls;")
    public static class34 field37 = class9.method35("Prev page", 220);

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Ls;")
    public static class34 field40 = class9.method35("fonts", 220);

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "[[B")
    public static byte[][] field38 = new byte[1000][];

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Ls;")
    public static class34 field41 = class9.method35("Next page", 220);

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Lsa;")
    public static class35 field39 = new class35();

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Ls;")
    public static class34 field44 = class9.method35("Prev page", 220);

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "I")
    public static volatile int field43 = -1;

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "Ls;")
    public static class34 field45 = class9.method35(" )2 ", 220);

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Ls;")
    public static class34 field42 = class9.method35("???", 220);

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Ls;")
    public static class34 field47 = class9.method35("Combat Training", 220);

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "Lq;")
    public static class32 field46;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 8)
    public static void method17(int arg0) {
        field40 = null;
        field46 = null;
        if (arg0 != -1) {
            return;
        }
        field39 = null;
        field38 = null;
        field41 = null;
        field37 = null;
        field45 = null;
        field44 = null;
        field47 = null;
        field42 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(III)I")
    public abstract int method18(int arg0, int arg1, int arg2);
}
