import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class382 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lbn;")
    public static class160 field5605 = new class160(66, 6);

    @OriginalMember(owner = "client!al", name = "d", descriptor = "Lei;")
    public static class289 field5608 = new class289(64);

    @OriginalMember(owner = "client!al", name = "f", descriptor = "[Lth;")
    public static class175[] field5610 = new class175[4];

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lvq;")
    public static class24 field5611 = new class24(7, -2);

    @OriginalMember(owner = "client!al", name = "c", descriptor = "B")
    public static byte field5607;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public static void method2421(byte arg0) {
        field5605 = null;
        field5611 = null;
        field5610 = null;
        field5608 = null;
        int var1 = 46 / ((arg0 + 17) / 42);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lal;")
    public static final class382 method2422(int arg0) {
        if (arg0 > -77) {
            field5611 = null;
        }
        field5609++;
        try {
            return (class382) Class.forName("cc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I")
    public static final int method2423(int arg0, int arg1, int arg2, int arg3) {
        field5606++;
        if (arg2 < 24) {
            return -53;
        } else if (arg3 > arg0) {
            return arg3;
        } else if (arg0 > arg1) {
            return arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lek;I)Lek;")
    public abstract class276 method2245(class276 arg0, int arg1);
}
