import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class93 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1744 = 0;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public static int[] field1746 = new int[2000];

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lrd;")
    public static class173 field1748 = class133.method843("Ein kostenloses Spielkonto erstellen)3", 36);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static volatile int field1745 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lqf;")
    public static class165 field1749 = null;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lrd;")
    public static class173 field1753 = class133.method843("<br>(X", -72);

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lrd;")
    public static class173 field1750 = class133.method843("Fps:", 117);

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "La;")
    public static class1 field1747;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)Lrd;")
    public static final class173 method588(int arg0, boolean arg1) {
        field1752++;
        if (!arg1) {
            method589(96);
        }
        return class190.method1272(arg0, (byte) -70, false, 10);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1749 = null;
        field1747 = null;
        field1753 = null;
        field1750 = null;
        if (arg0 >= 93) {
            field1746 = null;
            field1748 = null;
        }
    }
}
