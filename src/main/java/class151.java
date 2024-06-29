import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class151 extends class200 {

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field2781 = 0;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field2777 = 0;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field2780 = -1;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field2784 = -1;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lsb;")
    private static class98 field2782 = class47.method368("Loading textures )2 ", 0);

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lsb;")
    public static class98 field2783 = field2782;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method1113(boolean arg0) {
        if (!arg0) {
            field2780 = -123;
        }
        field2783 = null;
        field2782 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)I")
    public static final int method1114(byte arg0) {
        field2785++;
        int var1 = -50 % ((arg0 + 2) / 33);
        return 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([S[Lsb;B)V")
    public static final void method1115(short[] arg0, class98[] arg1, byte arg2) {
        class237.method1622(71, arg0, 0, arg1, arg1.length - 1);
        field2779++;
        if (arg2 <= 28) {
            field2783 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lgf;Ltg;Ltg;I)V")
    public static final void method1116(class94 arg0, class75 arg1, class75 arg2, int arg3) {
        field2778++;
        if (arg3 != 18265) {
            method1116((class94) null, (class75) null, (class75) null, -120);
        }
        class1.field4 = arg2;
        class129.field2303 = arg1;
        class182.field3132 = arg0;
    }
}
