import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class156 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lve;")
    public static class233 field2282;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[[S")
    public static short[][] field2279;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2279 = null;
        if (arg0 != 16563) {
            field2279 = null;
        }
        field2282 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Ldb;")
    public static final class161 method1054(int arg0) {
        if (arg0 < 10) {
            return null;
        }
        field2277++;
        try {
            return (class161) Class.forName("aa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
