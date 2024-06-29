import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class120 extends class97 {

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public int field2599;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field2594 = 0;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lea;")
    public static class38 field2593 = class9.method46((byte) 127, "(U0a )2 in: ");

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "Lea;")
    public static class38 field2600 = class9.method46((byte) 126, "Abbrechen");

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "Lrc;")
    public static class155 field2598 = new class155(64);

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Ldd;")
    public static class32 field2595;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method917(byte arg0) {
        field2595 = null;
        field2598 = null;
        field2600 = null;
        int var1 = 73 / ((32 - arg0) / 63);
        field2593 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILdd;)Lfa;")
    public static final class47 method918(int arg0, int arg1, int arg2, class32 arg3) {
        field2592++;
        if (arg2 < 96) {
            field2597 = -67;
        }
        return class74.method592(arg0, arg3, (byte) 124, arg1) ? class141.method1023(125) : null;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II)V")
    public class120(int arg0, int arg1) {
        this.field2599 = arg1;
        this.field2591 = arg0;
    }
}
