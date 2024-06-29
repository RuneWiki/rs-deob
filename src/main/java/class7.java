import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class7 {

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Lua;")
    public static class41 field81 = class16.method86("Herbalist", true);

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Lua;")
    public static class41 field82 = class16.method86("details)3dat", true);

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lq;")
    public static class32 field83;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "[[[I")
    public static int[][][] field80;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)J", line = 7)
    public static final synchronized long method45(int arg0) {
        int var1 = 31 / ((arg0 - 30) / 59);
        long var2 = System.currentTimeMillis();
        if (class35.field437 > var2) {
            class19.field164 += class35.field437 - var2;
        }
        class35.field437 = var2;
        return class19.field164 + var2;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B)V", line = 61)
    public static void method46(byte arg0) {
        field82 = null;
        field80 = null;
        if (arg0 >= 40) {
            field81 = null;
            field83 = null;
        }
    }
}
