import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public class class8 {

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Lw;")
    public static class38 field57 = class35.method219("Windmill", true);

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "Lw;")
    public static class38 field60 = class35.method219("???", true);

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "I")
    public static volatile int field58 = 0;

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "Z")
    public static boolean field62 = true;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Lw;")
    public static class38 field55 = class35.method219("Potters Wheel", true);

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "Lw;")
    public static class38 field59 = class35.method219("Herbalist", true);

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "Lw;")
    public static class38 field61 = class35.method219("Brewery", true);

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "Lw;")
    public static class38 field63 = class35.method219(" )2 ", true);

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "Lw;")
    public static class38 field64 = class35.method219("codeversion", true);

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "J")
    public static long field56;

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "[I")
    public static int[] field65;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)Lma;", line = 31)
    public static final class23 method34(int arg0) {
        if (arg0 != 10) {
            method35((byte) -112);
        }
        try {
            return (class23) Class.forName("ea").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class31();
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)V", line = 45)
    public static void method35(byte arg0) {
        field63 = null;
        if (arg0 <= 2) {
            return;
        }
        field65 = null;
        field59 = null;
        field60 = null;
        field61 = null;
        field55 = null;
        field64 = null;
        field57 = null;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(JI)V", line = 70)
    public static final void method36(long arg0, int arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % (long) arg1 == 0L) {
            class1.method1(6272, arg0 - 1L);
            class1.method1(6272, 1L);
        } else {
            class1.method1(6272, arg0);
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method37(boolean arg0) {
        if (arg0) {
            method35((byte) 86);
        }
        if (class27.field374 != null) {
            class33 var1 = class27.field374;
            synchronized (class27.field374) {
                class27.field374 = null;
            }
        }
    }
}
