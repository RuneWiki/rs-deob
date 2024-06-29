import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class679 {

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "J")
    public static long field9483 = 20000000L;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "[[Ljava/lang/String;")
    public static String[][] field9487 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field9489;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "Ljf;")
    public static class218 field9486;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "Ljba;")
    public static class402 field9485;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "[I")
    public static int[] field9480;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "[Lod;")
    public static class509[] field9482;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILmg;)I")
    public static final int method3826(int arg0, class151 arg1) {
        field9484++;
        if (arg0 != 34066) {
            method3826(89, null);
        }
        if (class294.field3871 == arg1) {
            return 9216;
        } else if (class545.field7603 == arg1) {
            return 34065;
        } else if (class262.field3296 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)I")
    public static final int method3827(int arg0, int arg1) {
        field9481++;
        if (arg0 != 9216) {
            method3827(66, 5);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)[Lfia;")
    public static final class577[] method3828(byte arg0) {
        field9488++;
        return arg0 == -39 ? new class577[] { class638.field8800, class165.field2310, class725.field10109, class139.field1990, class603.field8372, class339.field4290, class552.field7712, class276.field3461, class244.field3154, class69.field974, class536.field7429, class176.field2467, class630.field8701, class553.field7717 } : null;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V")
    public static void method3829(byte arg0) {
        field9485 = null;
        field9486 = null;
        if (arg0 != -26) {
            field9486 = null;
        }
        field9482 = null;
        field9480 = null;
        field9487 = null;
    }
}
