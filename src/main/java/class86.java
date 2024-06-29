import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class86 {

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Le;")
    public static class191 field1410 = class54.method368("Lade Sprites )2 ", 2047);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "S")
    public static short field1415 = 256;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "[I")
    public static int[] field1420 = new int[100];

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Le;")
    private static class191 field1419 = class54.method368("Connecting to update server", 2047);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Le;")
    public static class191 field1411 = field1419;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Le;")
    private static class191 field1418 = class54.method368("wishes to trade with you)3", 2047);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Le;")
    public static class191 field1416 = field1418;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lfa;")
    public static class80 field1412;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[I")
    public static int[] field1413;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static final void method529(byte arg0) {
        field1414++;
        if (class49.field894 == 5) {
            class49.field894 = 6;
            if (arg0 != 120) {
                method529((byte) -124);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method530(int arg0) {
        field1413 = null;
        field1419 = null;
        field1418 = null;
        field1411 = null;
        if (arg0 == 6) {
            field1416 = null;
            field1410 = null;
            field1412 = null;
            field1420 = null;
        }
    }
}
