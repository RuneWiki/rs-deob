import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class23 {

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "Lh;")
    public static class15 field313 = class18.method153("mapfunction", 1);

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "Lh;")
    public static class15 field314 = class18.method153("Rare Trees", 1);

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "Lh;")
    public static class15 field316 = class18.method153("Amulet Shop", 1);

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "I")
    public static volatile int field315 = 0;

    @OriginalMember(owner = "mapview!ia", name = "h", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "J")
    public static long field312;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "[B")
    public static byte[] field311;

    @OriginalMember(owner = "mapview!ia", name = "g", descriptor = "[I")
    public static int[] field317;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)V", line = 8)
    public static void method183(int arg0) {
        field311 = null;
        field314 = null;
        field313 = null;
        field316 = null;
        if (arg0 == -4013) {
            field317 = null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)V", line = 34)
    public static final void method184(int arg0) {
        if (class21.field288 != null) {
            class25 var1 = class21.field288;
            synchronized (class21.field288) {
                class21.field288 = null;
            }
        }
        int var3 = 76 % ((77 - arg0) / 49);
    }
}
