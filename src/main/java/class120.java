import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class120 extends class29 {

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "Ler;")
    public class231 field1607;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "[B")
    public static byte[] field1606 = new byte[520];

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field1608 = 0;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "Lvq;")
    public static class24 field1604 = new class24(82, 0);

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "[I")
    public static int[] field1612 = new int[3];

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "[Lpk;")
    public static class157[] field1613;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILat;)V")
    public static final void method818(byte arg0, int arg1, class256 arg2) {
        if (class106.field1434 != null) {
            try {
                class106.field1434.method2853(0L, false);
                class106.field1434.method2849(arg2.field3764, 24, (byte) -123, arg1);
            } catch (Exception var3) {
            }
        }
        if (arg0 != 4) {
            method819(true);
        }
        field1609++;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V")
    public static void method819(boolean arg0) {
        field1604 = null;
        if (arg0) {
            field1606 = null;
            field1612 = null;
            field1613 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ler;)V")
    public class120(class231 arg0) {
        this.field1607 = arg0;
    }
}
