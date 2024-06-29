import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class9 {

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "Lna;")
    public static class26 field175 = class30.method205((byte) 31, "Estate Agent");

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Lna;")
    public static class26 field177 = class30.method205((byte) 94, "Prev page");

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Lna;")
    public static class26 field178 = class30.method205((byte) 101, "Rare Trees");

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "Lna;")
    public static class26 field179 = class30.method205((byte) 59, "Mining Shop");

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "Lna;")
    public static class26 field176 = class30.method205((byte) 18, "overlay2)3dat");

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)I", line = 12)
    public static final int method76(byte arg0) {
        if (arg0 != -50) {
            method77(false);
        }
        if (class29.field393 == null) {
            return 0;
        } else if (class29.field393.field481 == null) {
            return class25.field343[class29.field393.field483 & 0xFF];
        } else {
            return class25.field343[class29.field393.field481[class19.field239] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Z)B", line = 33)
    public static final byte method77(boolean arg0) {
        if (!arg0) {
            method76((byte) 37);
        }
        return class16.field219 == null ? 0 : class16.field219[class19.field239];
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)V", line = 70)
    public static void method78(int arg0) {
        field175 = null;
        field178 = null;
        field176 = null;
        if (arg0 != 255) {
            field175 = null;
        }
        field177 = null;
        field179 = null;
    }
}
