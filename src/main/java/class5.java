import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class5 extends class18 {

    @OriginalMember(owner = "mapview!ca", name = "q", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "mapview!ca", name = "r", descriptor = "J")
    public static long field58 = 0L;

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "Lna;")
    public static class26 field54 = class33.method219("Clothes Shop", 118);

    @OriginalMember(owner = "mapview!ca", name = "u", descriptor = "Lna;")
    public static class26 field61 = class33.method219("Apothecary", 125);

    @OriginalMember(owner = "mapview!ca", name = "s", descriptor = "Lna;")
    public static class26 field59 = class33.method219("???", 78);

    @OriginalMember(owner = "mapview!ca", name = "p", descriptor = "Lna;")
    public static class26 field56 = class33.method219("Makeover Mage", 111);

    @OriginalMember(owner = "mapview!ca", name = "v", descriptor = "I")
    public static volatile int field62 = -1;

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "mapview!ca", name = "t", descriptor = "Lna;")
    public class26 field60;

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "(I)V", line = 4)
    public static void method32(int arg0) {
        field59 = null;
        field56 = null;
        field54 = null;
        int var1 = -110 / ((42 - arg0) / 62);
        field61 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "(I)B", line = 20)
    public static final byte method33(int arg0) {
        if (arg0 < 13) {
            method32(-58);
        }
        return class25.field383 == null ? 0 : class25.field383[class6.field65];
    }
}
