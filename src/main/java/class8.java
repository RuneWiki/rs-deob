import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public abstract class class8 {

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Lf;")
    public static class10 field74 = class23.method139("Vegetable Store", (byte) -83);

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Lf;")
    public static class10 field75 = class23.method139("overlay)3dat", (byte) -75);

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Lf;")
    public static class10 field78 = class23.method139("Loading", (byte) -110);

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lf;")
    public static class10 field76 = class23.method139("Find", (byte) -82);

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Lf;")
    public static class10 field77 = class23.method139("Fishing Shop", (byte) -109);

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Lf;")
    public static class10 field80 = class23.method139("Grand Exchange", (byte) -126);

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lf;")
    public static class10 field79 = class23.method139("POH Portal", (byte) -90);

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "[Lf;")
    public static class10[] field81;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z)Z", line = 17)
    public static final boolean method43(boolean arg0) {
        class27 var1 = class21.field235;
        synchronized (class21.field235) {
            if (class35.field488 == class21.field234) {
                return false;
            }
            class21.field236 = class37.field511[class35.field488];
            class35.field493 = class24.field259[class35.field488];
            class35.field488 = class35.field488 + 1 & 0x7F;
            if (!arg0) {
                field76 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)V", line = 54)
    public static void method44(byte arg0) {
        field74 = null;
        field79 = null;
        field78 = null;
        field76 = null;
        if (arg0 <= -18) {
            field75 = null;
            field81 = null;
            field77 = null;
            field80 = null;
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z[B)V")
    public abstract void method42(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)[B")
    public abstract byte[] method45(int arg0);
}
