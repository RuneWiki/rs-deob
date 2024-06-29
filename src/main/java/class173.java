import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class173 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Ljd;")
    public static class86 field3174 = class122.method868("::noclip", true);

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Ljd;")
    private static class86 field3175 = class122.method868("You can(Wt add yourself to your own ignore list)3", true);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljd;")
    public static class86 field3168 = field3175;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "[J")
    public static long[] field3176 = new long[32];

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Z")
    public static boolean field3177 = true;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[[B")
    public static byte[][] field3169;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    public static final int method1235(int arg0, int arg1) {
        field3172++;
        if (arg0 != 32) {
            method1237(53);
        }
        return arg1 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public static final int method1236(int arg0) {
        if (arg0 >= -29) {
            field3174 = null;
        }
        field3170++;
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method1237(int arg0) {
        field3168 = null;
        field3174 = null;
        field3169 = null;
        field3176 = null;
        field3175 = null;
        if (arg0 != 32) {
            method1236(96);
        }
    }
}
