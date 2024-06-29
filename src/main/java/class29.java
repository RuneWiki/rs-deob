import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 extends class7 {

    @OriginalMember(owner = "mapview!oa", name = "r", descriptor = "Lt;")
    public static class35 field320 = class3.method28(false, "100(U");

    @OriginalMember(owner = "mapview!oa", name = "u", descriptor = "Lt;")
    public static class35 field323 = class3.method28(false, "Farming shop");

    @OriginalMember(owner = "mapview!oa", name = "s", descriptor = "[J")
    public static long[] field321 = new long[32];

    @OriginalMember(owner = "mapview!oa", name = "w", descriptor = "J")
    public static volatile long field325 = 0L;

    @OriginalMember(owner = "mapview!oa", name = "q", descriptor = "Lt;")
    public static class35 field319 = class3.method28(false, "Jewellery");

    @OriginalMember(owner = "mapview!oa", name = "x", descriptor = "[I")
    public static int[] field326 = new int[128];

    @OriginalMember(owner = "mapview!oa", name = "v", descriptor = "I")
    public static int field324 = 0;

    @OriginalMember(owner = "mapview!oa", name = "y", descriptor = "Lt;")
    public static class35 field327 = class3.method28(false, "Herbalist");

    @OriginalMember(owner = "mapview!oa", name = "A", descriptor = "Lt;")
    public static class35 field329 = class3.method28(false, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!oa", name = "t", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "mapview!oa", name = "z", descriptor = "[Ll;")
    public static class22[] field328;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "(B)V", line = 8)
    public static void method166(byte arg0) {
        field321 = null;
        field326 = null;
        field329 = null;
        field323 = null;
        field328 = null;
        field319 = null;
        field327 = null;
        field320 = null;
        if (arg0 != 72) {
            method166((byte) 106);
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 27)
    public static final void method167(int arg0) {
        int var1 = -74 / ((-arg0 - 60) / 63);
        if (++class2.field72 >= 64) {
            class16.field183++;
            class2.field72 = 0;
            if (class16.field183 < class33.field408 >> 6) {
                class16.method99(120);
            }
        }
        class31.field392 = (class2.field72 << 6) + field322;
    }

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "(B)B", line = 48)
    public static final byte method168(byte arg0) {
        if (arg0 <= 50) {
            return 30;
        } else if (class13.field173 == null) {
            return 0;
        } else {
            return class13.field173[class31.field392];
        }
    }
}
