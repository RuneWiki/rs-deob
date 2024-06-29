import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class10 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lhh;")
    public static class163 field161 = class137.method1065("b12_full", 17);

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field167 = 0;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lhh;")
    private static class163 field168 = class137.method1065("FULL", 17);

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lhh;")
    public static class163 field169 = field168;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Lee;")
    public static class108 field163;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public static final int method66(int arg0, int arg1) {
        field164++;
        int var2 = 113 % ((arg1 + 9) / 40);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method67(byte arg0) {
        field161 = null;
        field169 = null;
        field163 = null;
        field168 = null;
        if (arg0 < 89) {
            field167 = -1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
    public static final int method68(int arg0, int arg1) {
        field165++;
        if (arg0 != 127) {
            field161 = null;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
    public static final void method69(int arg0, int arg1) {
        class175.field3192 = arg0;
        class27.field419 = -1;
        field166++;
        class169.field3086 = arg1;
        class227.method1583((byte) 84);
    }
}
