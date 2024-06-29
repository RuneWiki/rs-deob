import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class28 {

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Ll;")
    public static class22 field366 = class33.method229("Silk Trader", -96);

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "I")
    public static int field368 = -1;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Ll;")
    public static class22 field371 = class33.method229("Water Source", -98);

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "[[B")
    public static byte[][] field369 = new byte[1000][];

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Z")
    public static boolean field367 = false;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Lb;")
    public static class3 field370;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)J", line = 33)
    public static final synchronized long method202(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (class30.field422 > var1) {
            class23.field224 += class30.field422 - var1;
        }
        class30.field422 = var1;
        int var3 = 19 % ((arg0 + 9) / 42);
        return var1 + class23.field224;
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(B)V", line = 52)
    public static void method203(byte arg0) {
        field370 = null;
        field369 = null;
        field371 = null;
        if (arg0 != 70) {
            field369 = null;
        }
        field366 = null;
    }
}
