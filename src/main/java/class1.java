import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class15 {

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "Lna;")
    public static class26 field105 = class30.method205((byte) 53, "Combat Training");

    @OriginalMember(owner = "mapview!a", name = "s", descriptor = "Lna;")
    public static class26 field106 = class30.method205((byte) 79, "Achievement Start");

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "Lna;")
    public class26 field103;

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "[I")
    public static int[] field101;

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(I)V", line = 28)
    public static void method26(int arg0) {
        if (arg0 != -3) {
            method27(null, (byte) 25);
        }
        field101 = null;
        field106 = null;
        field105 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([Lna;B)Lna;", line = 52)
    public static final class26 method27(class26[] arg0, byte arg1) {
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg1 == -83) {
            return class15.method101(arg0, 0, false, arg0.length);
        } else {
            return (class26) null;
        }
    }
}
