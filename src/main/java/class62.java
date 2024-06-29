import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class62 {

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Z")
    public static boolean field844 = true;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field847 = 127;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lph;")
    public static class204 field845 = new class204();

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lqe;")
    private static class168 field850 = class66.method448("Prepared sound engine", 32);

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lqe;")
    public static class168 field853 = field850;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lqe;")
    private static class168 field852 = class66.method448(" from your ignore list first)3", 85);

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field856 = -1;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lqe;")
    public static class168 field854 = field852;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Loe;")
    public static class256 field851;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[[[I")
    public static int[][][] field849;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lqg;")
    public static final class217 method416(int arg0) {
        field846++;
        class217 var1 = new class217(class243.field4225, class150.field2597, class33.field415[0], class54.field746[0], class85.field1332[0], class69.field978[0], class7.field84[0], class92.field1457);
        class246.method1613(0);
        if (arg0 != 24606) {
            method416(63);
        }
        return var1;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method417(boolean arg0) {
        field852 = null;
        field851 = null;
        if (!arg0) {
            return;
        }
        field850 = null;
        field845 = null;
        field849 = null;
        field853 = null;
        field854 = null;
    }
}
