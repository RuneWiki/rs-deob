import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class115 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Loa;")
    public static class98 field2586 = class38.method349(255, "cross");

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2592 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Loa;")
    public static class98 field2589 = class38.method349(255, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "Loa;")
    public static class98 field2588 = class38.method349(255, "http:)4)4");

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Loa;")
    public static class98 field2594 = class38.method349(255, "Benutzername: ");

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Loa;")
    public static class98 field2597 = class38.method349(255, "va");

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Loa;")
    public static class98 field2593 = class38.method349(255, "Duell akzeptieren");

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Loa;")
    public static class98 field2600 = class38.method349(255, "backbase2");

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "Loa;")
    private static class98 field2601 = class38.method349(255, "Login");

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Loa;")
    public static class98 field2596 = field2601;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Lmd;")
    public static class87 field2590;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static final void method925(byte arg0) {
        field2585++;
        class106.field2427.method734(-224779128);
        class17.field360.method734(arg0 - 224779192);
        class96.field2188.method734(arg0 - 224779192);
        if (arg0 != 64) {
            method927(null, 120);
        }
        class20.field434.method734(-224779128);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method926(boolean arg0) {
        field2601 = null;
        field2586 = null;
        field2594 = null;
        field2597 = null;
        field2588 = null;
        field2596 = null;
        if (arg0) {
            method926(false);
        }
        field2593 = null;
        field2600 = null;
        field2590 = null;
        field2589 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwb;I)V")
    public static final void method927(class148 arg0, int arg1) {
        arg0.field3637 = 0;
        if (arg0.field3646 == 0) {
            arg0.field3652 = 1024;
        }
        int var2 = arg0.field3602 - class119.field2680;
        field2595++;
        int var3 = arg0.field3660 * 64 + arg0.field3623 * 128;
        if (arg1 > -58) {
            field2593 = null;
        }
        if (arg0.field3646 == 1) {
            arg0.field3652 = 1536;
        }
        arg0.field3667 += (var3 - arg0.field3667) / var2;
        if (arg0.field3646 == 2) {
            arg0.field3652 = 0;
        }
        int var4 = arg0.field3660 * 64 + arg0.field3621 * 128;
        arg0.field3657 += (var4 - arg0.field3657) / var2;
        if (arg0.field3646 == 3) {
            arg0.field3652 = 512;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method928(int arg0, boolean arg1) {
        field2599++;
        if (arg1) {
            method928(-35, false);
        }
        if (arg0 == 100 && class46.field1059 > 0) {
            byte[] var2 = class124.field2767[--class46.field1059];
            class124.field2767[class46.field1059] = null;
            return var2;
        } else if (arg0 == 5000 && class101.field2332 > 0) {
            byte[] var3 = class19.field423[--class101.field2332];
            class19.field423[class101.field2332] = null;
            return var3;
        } else if (arg0 == 30000 && class121.field2706 > 0) {
            byte[] var4 = class8.field192[--class121.field2706];
            class8.field192[class121.field2706] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }
}
