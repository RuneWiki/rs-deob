import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class262 extends class447 {

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lc;")
    public class100 field3583;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field3584 = 16777215;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "Lsr;")
    public static class136 field3587;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lqj;")
    public static class296 field3578;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Lqj;")
    public static class296 field3582;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[[I")
    public static int[][] field3580;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "[[S")
    public static short[][] field3579;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JI)V")
    public static final void method1611(long arg0, int arg1) {
        class442.field6400.field5273 = 0;
        field3581++;
        class442.field6400.method2396(21, 12450);
        if (arg1 != 128) {
            return;
        }
        class442.field6400.method2409(arg0, true);
        class76.field1194 = 0;
        class221.field2961 = 0;
        class282.field3867 = 1;
        class165.field2352 = -3;
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1271(byte arg0);

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(B)Z")
    public abstract boolean method1273(byte arg0);

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field3579 = null;
        field3582 = null;
        if (arg0 == -1) {
            field3587 = null;
            field3578 = null;
            field3580 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lrg;II)Ljava/lang/String;")
    public static final String method1613(class383 arg0, int arg1, int arg2) {
        field3585++;
        if (!client.method1119(arg0).method1643(arg1, -124) && arg0.field5489 == null) {
            return null;
        } else if (arg0.field5482 == null || arg1 >= arg0.field5482.length || arg0.field5482[arg1] == null || arg0.field5482[arg1].trim().length() == 0) {
            return class280.field3829 ? "Hidden-" + arg1 : null;
        } else if (arg2 == 30667) {
            return arg0.field5482[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljj;ZI)V")
    public static final void method1614(class61 arg0, boolean arg1, int arg2) {
        field3586++;
        int var3 = -1;
        int var4 = 0;
        if (class35.field541 < arg0.field912) {
            class353.method2286(8192, arg0);
        } else if (class35.field541 > arg0.field922) {
            class401.method2587(arg0, false, 0);
            var3 = class229.field3050;
            var4 = class83.field1283;
        } else {
            class346.method2219(12288, arg0);
        }
        if (arg0.field6197 < 128 || arg0.field6192 < 128 || arg0.field6197 >= (class432.field6220 * 128 - 128) || class267.field3646 * 128 - 128 <= arg0.field6192) {
            arg0.field912 = 0;
            arg0.field931 = -1;
            arg0.field922 = 0;
            arg0.field877 = -1;
            arg0.field6197 = arg0.field956[0] * 128 + arg0.method410((byte) 113) * 64;
            arg0.field6192 = arg0.field944[0] * 128 + arg0.method410((byte) 110) * 64;
            arg0.method397(124);
        }
        if (class307.field4211 == arg0 && (arg0.field6197 < 1536 || arg0.field6192 < 1536 || class432.field6220 * 128 - 1536 <= arg0.field6197 || arg0.field6192 >= ((class267.field3646 - 12) * 128))) {
            arg0.field877 = -1;
            arg0.field931 = -1;
            arg0.field912 = 0;
            arg0.field922 = 0;
            arg0.field6197 = arg0.field956[0] * 128 + (arg0.method410((byte) 91) * 64);
            arg0.field6192 = arg0.field944[0] * 128 + arg0.method410((byte) 117) * 64;
            arg0.method397(125);
        }
        if (arg1) {
            int var5 = class9.method60(arg0, (byte) -82);
            class374.method2446((byte) -105, var3, arg0, var5, var4);
            class58.method385((byte) -125, arg0);
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lc;)V")
    public class262(class100 arg0) {
        this.field3583 = arg0;
    }
}
