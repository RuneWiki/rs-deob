import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class226 {

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field4093 = 0;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Llc;")
    private static class143 field4091 = class66.method374("Discard", -1);

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[J")
    public static long[] field4089 = new long[32];

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Llc;")
    public static class143 field4084 = class66.method374("OK", -1);

    @OriginalMember(owner = "client!id", name = "g", descriptor = "S")
    public static short field4090 = 1;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Llc;")
    public static class143 field4092 = field4091;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Llc;")
    public static class143 field4085 = null;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1547(int arg0) {
        field4084 = null;
        field4085 = null;
        if (arg0 != 32) {
            field4089 = null;
        }
        field4089 = null;
        field4092 = null;
        field4091 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method1548(int arg0) {
        class32.field544.method823(true);
        if (arg0 != 32) {
            method1549(-86, -104);
        }
        field4088++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
    public static final int method1549(int arg0, int arg1) {
        field4087++;
        if (arg0 != -21387) {
            field4084 = null;
        }
        return arg1 >>> 7;
    }
}
