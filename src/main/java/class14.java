import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class14 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Z")
    public static boolean field221 = false;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field222 = 0;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Ldj;")
    public static class304 field224;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field223;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 4)
    public static void method89(byte arg0) {
        field223 = null;
        field224 = null;
        if (arg0 >= -21) {
            field223 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V", line = 30)
    public static final void method90(int arg0, int[] arg1, Object[] arg2) {
        if (arg0 > -20) {
            field223 = null;
        }
        field225++;
        class425.method2666(arg1, true, arg1.length - 1, 0, arg2);
    }
}
