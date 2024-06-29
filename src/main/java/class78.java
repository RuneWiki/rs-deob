import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class78 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Z")
    public static boolean field1407 = false;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Ltg;")
    public static class184 field1409 = class135.method812(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 3);

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Ltg;")
    private static class184 field1416 = class135.method812(" ", 3);

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Ltg;")
    public static class184 field1417 = field1416;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "Ltg;")
    private static class184 field1419 = class135.method812("Players", 3);

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Ltg;")
    public static class184 field1415 = class135.method812("Schrifts-=tze geladen)3", 3);

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Ltg;")
    public static class184 field1408 = field1419;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[Lsc;")
    public static class171[] field1406;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
    public static final void method446() {
        for (int var0 = 0; var0 < class10.field187; var0++) {
            class164 var1 = class205.field3945[var0];
            class3.method16(var1);
            class205.field3945[var0] = null;
        }
        class10.field187 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILvb;I)Loe;")
    public static final class137 method447(int arg0, class197 arg1, int arg2) {
        field1414++;
        if (class128.method781(-31807, arg2, arg1)) {
            if (arg0 != 0) {
                field1415 = null;
            }
            return class82.method460(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method448(byte arg0) {
        int var1 = 115 % ((-arg0 - 62) / 57);
        field1417 = null;
        field1419 = null;
        field1406 = null;
        field1408 = null;
        field1416 = null;
        field1409 = null;
        field1415 = null;
    }
}
