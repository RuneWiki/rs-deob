import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class254 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "J")
    public long field4498 = 0L;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Le;")
    public static class191 field4496 = class54.method368("<)4col> x", 2047);

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Le;")
    public static class191 field4505 = class54.method368(")1", 2047);

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[B")
    public static byte[] field4500 = new byte[32896];

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Le;")
    public static class191 field4507;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public int field4501;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field4504;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lbe;")
    public class16 field4493;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lbe;")
    public class16 field4499;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lwd;")
    public static class97 field4494;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[Leg;")
    public static class33[] field4503;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Z")
    public static final boolean method1759(int arg0, int arg1) {
        if (arg0 == 178246909) {
            field4497++;
            return (arg1 >> 29 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1760(byte arg0) {
        field4507 = null;
        field4505 = null;
        field4503 = null;
        if (arg0 == 43) {
            field4500 = null;
            field4494 = null;
            field4496 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4500[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field4506 = 0;
        field4507 = class54.method368(")1 ", 2047);
    }
}
