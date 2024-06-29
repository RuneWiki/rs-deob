import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class453 {

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
    public static int[] field7023;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lsr;")
    public static class435 field7020;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Llp;")
    public static class53 field7022;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lgr;")
    public static final class464 method2852(int arg0) {
        field7019++;
        try {
            if (arg0 != 5) {
                field7018 = 79;
            }
            return new class27();
        } catch (Throwable var2) {
            try {
                return (class464) Class.forName("nq").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class106();
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(FFIF)F")
    public static final float method2853(float arg0, float arg1, int arg2, float arg3) {
        field7021++;
        if (arg2 != 5) {
            field7022 = null;
        }
        return (arg3 - arg1) * arg0 + arg1;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method2854(int arg0) {
        field7023 = null;
        if (arg0 != -3878) {
            field7023 = null;
        }
        field7022 = null;
        field7020 = null;
    }

    static {
        new class213(" days.", " Tage.", " jours.", " dias.");
        field7023 = new int[5];
    }
}
