import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class83 {

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Le;")
    public static class191 field1388 = class54.method368("Cabbage", 2047);

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lwd;")
    public static class97 field1390 = new class97(512);

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field1394 = 0;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "J")
    public static long field1395 = 0L;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lt;")
    public static class247 field1392;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lcg;")
    public static class44 field1393;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BLng;IILng;)Lcg;")
    public static final class44 method522(byte arg0, class121 arg1, int arg2, int arg3, class121 arg4) {
        field1387++;
        if (arg0 >= -61) {
            method524((byte) 107);
        }
        return class121.method796(true, arg2, arg3, arg4) ? class59.method394(false, arg1.method826((byte) 35, arg2, arg3)) : null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)I")
    public abstract int method5(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public abstract void method6(int arg0);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIILeg;)V")
    public static final void method523(byte arg0, int arg1, int arg2, class33 arg3) {
        field1389++;
        if (class158.field2686 != null || class258.field4575) {
            return;
        }
        if (arg0 != -51) {
            method525(true);
        }
        if (arg3 == null || class11.method78(arg3, -20936) == null) {
            return;
        }
        class158.field2686 = arg3;
        class56.field1037 = class11.method78(arg3, -20936);
        class138.field2323 = false;
        class249.field4426 = 0;
        class258.field4580 = arg1;
        class61.field1107 = arg2;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static final void method524(byte arg0) {
        field1391++;
        if (arg0 < 52) {
            field1394 = 53;
        }
        class232.field4142.method985(0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public static void method525(boolean arg0) {
        field1393 = null;
        if (!arg0) {
            field1392 = null;
            field1390 = null;
            field1388 = null;
        }
    }
}
