import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class295 {

    @OriginalMember(owner = "client!st", name = "e", descriptor = "Z")
    public static boolean field4199 = false;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Liv;")
    public static class64 field4196 = new class64(38, 12);

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "Lf;")
    public static class529 field4197;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "[I")
    public static int[] field4201;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "[I")
    public static int[] field4202;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "[[B")
    public static byte[][] field4195;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method1877(int arg0, int arg1, int arg2) {
        field4198++;
        if (arg1 != 38) {
            field4196 = null;
        }
        return class445.method2659(arg0, arg2, -15177) || class281.method1797(arg2, arg0, arg1 ^ 0xFFFFEE64);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V", line = 25)
    public static void method1878(byte arg0) {
        field4197 = null;
        field4201 = null;
        field4202 = null;
        field4196 = null;
        if (arg0 >= -42) {
            method1878((byte) 83);
        }
        field4195 = null;
    }
}
