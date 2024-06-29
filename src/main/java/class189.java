import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class189 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3058 = "Continue";

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lqd;")
    public static class173 field3059 = new class173(4);

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "[I")
    public static int[] field3062 = new int[14];

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Ldk;")
    public static class251 field3061;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method1345(int arg0) {
        field3062 = null;
        field3061 = null;
        if (arg0 != -26907) {
            field3058 = null;
        }
        field3058 = null;
        field3059 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lnd;I)Lnd;")
    public abstract class309 method1346(class309 arg0, int arg1);
}
