import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class172 extends class186 {

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    private int field3090 = -32768;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lqe;")
    private static class179 field3073 = class206.method1380("Location", (byte) -27);

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "Lqe;")
    public static class179 field3077 = field3073;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "Lqe;")
    public static class179 field3082 = class206.method1380("sl_button", (byte) -128);

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[J")
    public static long[] field3074 = new long[1000];

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "Lqe;")
    private static class179 field3081 = class206.method1380("Please enter your password)3", (byte) -127);

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field3086 = 0;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "Lqe;")
    public static class179 field3076 = field3081;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "Lqe;")
    private static class179 field3089 = class206.method1380("Please wait)3)3)3", (byte) 112);

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Lqe;")
    public static class179 field3084 = field3089;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1089(byte arg0) {
        field3074 = null;
        field3081 = null;
        field3077 = null;
        field3082 = null;
        field3084 = null;
        if (arg0 >= -60) {
            method1091(true);
        }
        field3073 = null;
        field3076 = null;
        field3089 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class75 var11 = class131.method835((byte) -20, this.field3075).method109(this.field3080, (byte) -96, null, 0);
        field3087++;
        if (var11 != null) {
            var11.method286(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3090 = var11.method295();
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lqe;B)V")
    public static final void method1090(class179 arg0, byte arg1) {
        try {
            class44.field957.getAppletContext().showDocument(arg0.method1135((byte) -117, class44.field957.getCodeBase()), "_blank");
        } catch (Exception var2) {
        }
        if (arg1 != 42) {
            method1090(null, (byte) 67);
        }
        field3079++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static final void method1091(boolean arg0) {
        field3083++;
        Object var1 = class191.field3565;
        synchronized (class191.field3565) {
            if (class120.field2242 != 0) {
                class120.field2242 = 1;
                try {
                    class191.field3565.wait();
                } catch (InterruptedException var2) {
                }
            }
            if (!arg0) {
                method1089((byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BILeh;)Llg;")
    public static final class126 method1092(byte arg0, int arg1, class52 arg2) {
        field3078++;
        if (class185.method1205(19263, arg2, arg1)) {
            return arg0 == 116 ? class201.method1335(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()I")
    public final int method295() {
        field3085++;
        return this.field3090;
    }
}
