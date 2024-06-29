import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class89 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Z")
    public static boolean field1418 = false;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Z")
    public static boolean field1425 = true;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lf;")
    public static class227 field1420 = new class227(128);

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1427 = "Allocated memory";

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lkj;")
    public static class114 field1424;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Lwf;")
    public static class17 field1426;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lqi;")
    public static class217 field1423;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method688(int arg0, int arg1) {
        field1416++;
        if (arg0 != 1000000) {
            field1420 = null;
        }
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class160.field2618 + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class50.field926 + "</col>";
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method689(int arg0) {
        field1422++;
        if (class254.field4055 == 2) {
            if (class251.field3997 == class104.field1584 && class283.field4489 == class180.field3002) {
                class254.field4055 = 0;
                if (class232.field3678 && class13.field184[81] && class42.field776 > 2) {
                    class56.method448((byte) -126, class42.field776 - 2);
                } else {
                    class56.method448((byte) -122, class42.field776 - 1);
                }
            }
        } else if (class269.field4320 == class251.field3997 && class180.field3002 == class111.field1707) {
            class254.field4055 = 0;
            if (class232.field3678 && class13.field184[81] && class42.field776 > 2) {
                class56.method448((byte) -125, class42.field776 - 2);
            } else {
                class56.method448((byte) -126, class42.field776 - 1);
            }
        } else {
            class104.field1584 = class269.field4320;
            class283.field4489 = class111.field1707;
            class254.field4055 = 2;
        }
        if (arg0 != 0) {
            method689(-58);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static void method690(int arg0) {
        field1427 = null;
        if (arg0 != -1) {
            method689(-19);
        }
        field1424 = null;
        field1423 = null;
        field1420 = null;
        field1426 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lsb;B)I")
    public static final int method691(class124 arg0, byte arg1) {
        field1419++;
        int var2 = 0;
        if (arg0.method899(class278.field4408, -128)) {
            var2++;
        }
        if (arg0.method899(class82.field1368, -106)) {
            var2++;
        }
        if (arg0.method899(class169.field2762, -77)) {
            var2++;
        }
        if (arg0.method899(class6.field72, -126)) {
            var2++;
        }
        if (arg0.method899(class249.field3971, -124)) {
            var2++;
        }
        if (arg0.method899(class169.field2761, -103)) {
            var2++;
        }
        if (arg0.method899(class118.field1984, -97)) {
            var2++;
        }
        int var3 = 93 % ((-arg1 - 46) / 54);
        if (arg0.method899(field1417, -111)) {
            var2++;
        }
        if (arg0.method899(class210.field3373, -113)) {
            var2++;
        }
        if (arg0.method899(class259.field4130, -84)) {
            var2++;
        }
        if (arg0.method899(class217.field3489, -100)) {
            var2++;
        }
        if (arg0.method899(class283.field4503, -110)) {
            var2++;
        }
        if (arg0.method899(class130.field2160, -102)) {
            var2++;
        }
        if (arg0.method899(class116.field1940, -127)) {
            var2++;
        }
        if (arg0.method899(class35.field599, -93)) {
            var2++;
        }
        return var2;
    }
}
