import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class209 extends class54 {

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field3151 = 2301979;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "[[Ljf;")
    public static class86[][] field3152;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V", line = 9)
    public static void method1430(byte arg0) {
        if (arg0 >= -30) {
            field3152 = (class86[][]) ((class86[][]) null);
        }
        field3152 = (class86[][]) null;
    }
}
