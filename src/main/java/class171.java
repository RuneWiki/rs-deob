import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class171 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lrd;")
    public static class173 field3304 = class133.method843("leuchten3:", 23);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lrd;")
    private static class173 field3306 = class133.method843(" from your friend list first)3", -121);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lrd;")
    public static class173 field3310 = class133.method843(")2", -89);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3309 = -1;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lrd;")
    private static class173 field3313 = class133.method843("Loaded textures", -125);

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lrd;")
    public static class173 field3315 = field3306;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lrd;")
    public static class173 field3312 = field3313;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lld;")
    public static class113 field3308;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[I")
    public static int[] field3311;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lta;")
    public static final class190 method1100(int arg0) {
        field3314++;
        if (arg0 != -1) {
            return null;
        }
        try {
            return (class190) Class.forName("eh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method1101(int arg0, int arg1) {
        if (arg0 < 41) {
            field3309 = -121;
        }
        for (class76 var2 = (class76) class57.field1126.method684((byte) -76); var2 != null; var2 = (class76) class57.field1126.method678(false)) {
            if ((var2.field2437 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method824((byte) -126);
            }
        }
        field3307++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field3315 = null;
        if (arg0 != -19967) {
            field3305 = 115;
        }
        field3310 = null;
        field3312 = null;
        field3304 = null;
        field3306 = null;
        field3313 = null;
        field3311 = null;
        field3308 = null;
    }
}
