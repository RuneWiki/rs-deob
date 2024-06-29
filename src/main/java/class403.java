import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class403 {

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "[I")
    public static int[] field5399 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Lwa;")
    public static class661 field5395 = new class661(32);

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
    public static int field5402 = 0;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Lad;")
    public static class19 field5401 = new class19(20);

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "Lfn;")
    public class290 field5396;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "[I")
    public int[] field5398;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
    public static final void method2266(byte arg0) {
        if (class421.field5601 == 3) {
            class585.method3308(4, arg0 + 22651);
        } else if (class421.field5601 == 7) {
            class585.method3308(8, 22731);
        } else if (class421.field5601 == 10) {
            class585.method3308(11, arg0 + 22651);
        }
        field5397++;
        if (arg0 != 80) {
            field5395 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static void method2267(int arg0) {
        if (arg0 != 19543) {
            method2266((byte) -88);
        }
        field5399 = null;
        field5401 = null;
        field5395 = null;
    }
}
