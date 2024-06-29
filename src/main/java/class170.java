import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class170 {

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "Lsi;")
    public static class559 field2330 = new class559();

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Lon;")
    public static final class335 method1100(byte arg0) {
        field2328++;
        try {
            return new class217();
        } catch (Throwable var3) {
            try {
                int var1 = -78 / ((-arg0 - 86) / 40);
                return (class335) Class.forName("aw").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class26();
            }
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2330 = null;
        if (arg0 <= 50) {
            method1101(22);
        }
    }
}
