import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class9 {

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "La;")
    public static class1 field89 = class3.method36("Crafting Shop", -97);

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "La;")
    public static class1 field93 = class3.method36("Skirt Shop", -97);

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "La;")
    public static class1 field94 = class3.method36("General Store", -91);

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "La;")
    public static class1 field92 = class3.method36("Vegetable Store", -109);

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "La;")
    public static class1 field91 = class3.method36("Next page", -95);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)V", line = 5)
    public static void method58(byte arg0) {
        int var1 = 100 / ((6 - arg0) / 63);
        field89 = null;
        field92 = null;
        field94 = null;
        field93 = null;
        field91 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(B)B", line = 24)
    public static final byte method59(byte arg0) {
        if (arg0 == 48) {
            return class33.field450 == null ? 0 : class33.field450[class5.field47];
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(B)J", line = 40)
    public static final synchronized long method60(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 >= -33) {
            method59((byte) -67);
        }
        if (var1 < class30.field415) {
            class24.field223 += class30.field415 - var1;
        }
        class30.field415 = var1;
        return class24.field223 + var1;
    }
}
