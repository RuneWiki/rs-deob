import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class216 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[F")
    public static float[] field2528 = new float[4];

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lhd;")
    public static class694 field2530 = new class694(8);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[Lxa;")
    public static class468[] field2533;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)Llt;")
    public static final class632 method1253(byte arg0) {
        field2527++;
        if (arg0 > -40) {
            field2528 = null;
        }
        try {
            return (class632) Class.forName("bga").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[IIZLjaa;I)Lhq;")
    public static final class148 method1254(byte arg0, int[] arg1, int arg2, boolean arg3, class576 arg4, int arg5) {
        field2529++;
        if (arg0 != 10) {
            return null;
        } else if (!arg4.field7709 && (!class182.method1084((byte) -128, arg5) || !class182.method1084((byte) -49, arg2))) {
            return arg4.field7651 ? new class148(arg4, 34037, arg5, arg2, arg3, arg1) : new class148(arg4, arg5, arg2, class560.method2979(arg5, (byte) 22), class560.method2979(arg2, (byte) 57), arg1);
        } else {
            return new class148(arg4, 3553, arg5, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1255(int arg0) {
        field2528 = null;
        field2533 = null;
        if (arg0 != -15220) {
            method1255(-46);
        }
        field2530 = null;
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2532++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(II)V")
    public class216(int arg0, int arg1) {
        this.field2531 = arg1;
    }
}
