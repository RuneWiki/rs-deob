import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class20 {

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "Lf;")
    public static class10 field186 = class23.method139("Achievement Start", (byte) -106);

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "[J")
    public static long[] field187 = new long[32];

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "I")
    public static int field183 = -1;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "Lf;")
    public static class10 field189 = class23.method139("Silver Shop", (byte) -69);

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "Lf;")
    public static class10 field188 = class23.method139("Quest Start", (byte) -91);

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "Lf;")
    public static class10 field190 = class23.method139("Farming patch", (byte) -68);

    @OriginalMember(owner = "mapview!k", name = "k", descriptor = "Lf;")
    public static class10 field193 = class23.method139("Requesting", (byte) -62);

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Lf;")
    public static class10 field191 = class23.method139("sprites", (byte) -107);

    @OriginalMember(owner = "mapview!k", name = "j", descriptor = "Lf;")
    public static class10 field192 = class23.method139("Crafting Shop", (byte) -125);

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "mapview!k", name = "l", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "[B")
    public static byte[] field185;

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(B)V", line = 55)
    public static void method129(byte arg0) {
        field190 = null;
        field193 = null;
        field185 = null;
        field188 = null;
        field191 = null;
        field192 = null;
        field187 = null;
        field186 = null;
        field189 = null;
        int var1 = -44 / ((-arg0 - 38) / 44);
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)B", line = 81)
    public static final byte method130(int arg0) {
        if (arg0 != -1) {
            method130(60);
        }
        return class37.field516 == null ? 0 : class37.field516[class41.field538];
    }
}
