import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class27 {

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "Ll;")
    public static class22 field361 = class33.method229("details)3dat", -101);

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Ll;")
    public static class22 field363 = class33.method229("Estate Agent", -84);

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "Ll;")
    public static class22 field362 = class33.method229("Food Shop", -75);

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Ll;")
    public static class22 field365 = class33.method229("Makeover Mage", -116);

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "[[Lm;")
    public static class24[][] field364;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 11)
    public static void method200(byte arg0) {
        field363 = null;
        field361 = null;
        field365 = null;
        field364 = null;
        field362 = null;
        if (arg0 > -6) {
            method200((byte) -124);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 58)
    public static final void method201(int arg0) {
        int var1 = -105 / ((arg0 - 6) / 39);
        if (class13.field132 != null) {
            class13 var2 = class13.field132;
            synchronized (class13.field132) {
                class13.field132 = null;
            }
        }
    }
}
