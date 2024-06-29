import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class249 {

    @OriginalMember(owner = "client!up", name = "c", descriptor = "[I")
    public static int[] field3197 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lpr;")
    public static class407 field3195 = new class407(55, 10);

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "J")
    public static long field3199;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V", line = 7)
    public static void method1432(int arg0) {
        if (arg0 != 13199) {
            field3201 = 112;
        }
        field3195 = null;
        field3197 = null;
    }

    @OriginalMember(owner = "client!up", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field3198++;
        throw new IllegalStateException();
    }
}
