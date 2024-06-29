import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class316 {

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "Z")
    public static boolean field4607 = false;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Lig;")
    public static class206 field4608 = new class206(36, 4);

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[[Lfm;")
    public static class636[][] field4605;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lrt;I)Lbi;")
    public static final class414 method2078(class194 arg0, int arg1) {
        if (arg1 == 4) {
            field4606++;
            return new class414(arg0.method1233(65280), arg0.method1233(65280), arg0.method1233(65280), arg0.method1233(65280), arg0.method1180(-832631516), arg0.method1180(-832631516), arg0.method1177(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method2079(int arg0) {
        if (arg0 != 36) {
            method2079(-14);
        }
        field4605 = null;
        field4608 = null;
    }
}
