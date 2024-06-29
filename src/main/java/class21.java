import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class21 extends class59 {

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Ldj;")
    private static class44 field354 = class89.method650(255, "Please reload this page)3");

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Ldj;")
    private static class44 field356 = class89.method650(255, "Please use a different world)3");

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "Ldj;")
    public static class44 field358 = class89.method650(255, "http:)4)4");

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Ldj;")
    public static class44 field361 = field356;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Ldj;")
    public static class44 field362 = field354;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Ldj;")
    public static class44 field363 = field356;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Lnf;")
    public static class147 field359;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lgb;")
    public static class69 field357;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)I")
    public static final int method158(int arg0, int arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        field360++;
        if (arg1 != 15288) {
            field357 = null;
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method159(byte arg0) {
        field363 = null;
        field356 = null;
        field362 = null;
        if (arg0 != 1) {
            return;
        }
        field354 = null;
        field357 = null;
        field361 = null;
        field359 = null;
        field358 = null;
    }
}
