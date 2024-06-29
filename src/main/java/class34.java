import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class34 extends class7 {

    @OriginalMember(owner = "mapview!w", name = "v", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "mapview!w", name = "w", descriptor = "Lt;")
    public static class35 field428 = class3.method28(false, "Next page");

    @OriginalMember(owner = "mapview!w", name = "x", descriptor = "Lt;")
    public static class35 field429 = class3.method28(false, "Cooking Range");

    @OriginalMember(owner = "mapview!w", name = "y", descriptor = "Lt;")
    public static class35 field430 = class3.method28(false, "Mining Site");

    @OriginalMember(owner = "mapview!w", name = "t", descriptor = "J")
    public static long field425;

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "Lt;")
    public class35 field424;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "Lc;")
    public static class5 field423;

    @OriginalMember(owner = "mapview!w", name = "u", descriptor = "[I")
    public static int[] field426;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "[[Lca;")
    public static class6[][] field422;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(B)V", line = 5)
    public static void method200(byte arg0) {
        field430 = null;
        field426 = null;
        field428 = null;
        field422 = null;
        field429 = null;
        if (arg0 <= -6) {
            field423 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IILpa;I)Lma;", line = 57)
    public static final class25 method201(int arg0, int arg1, class31 arg2, int arg3) {
        if (class33.method195(arg1, arg3, -82, arg2)) {
            return arg0 <= 22 ? (class25) null : class5.method43((byte) 111);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "(B)Lna;", line = 96)
    public static final class27 method202(byte arg0) {
        if (arg0 >= -70) {
            field428 = null;
        }
        try {
            return (class27) Class.forName("fa").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class21();
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)B", line = 113)
    public static final byte method203(int arg0) {
        if (arg0 != 0) {
            method201(79, -66, null, 120);
        }
        return class36.field445 == null ? 0 : class36.field445[class31.field392];
    }
}
