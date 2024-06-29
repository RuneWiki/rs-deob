import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class71 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field1393 = -1;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
    public static int[] field1396 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lub;")
    public static class88 field1389 = new class88();

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lpj;")
    public static class237 field1398 = class33.method353("Weiter", 105);

    @OriginalMember(owner = "client!td", name = "m", descriptor = "[I")
    public static int[] field1399 = new int[200];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Lo;")
    public static class236 field1401;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method573(int arg0, int arg1) {
        class270 var2 = class202.method1368(-15, 11, arg1);
        field1392++;
        if (arg0 <= -56) {
            var2.method1795(-2113);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method574(byte arg0) {
        field1398 = null;
        field1399 = null;
        field1401 = null;
        field1389 = null;
        if (arg0 != -31) {
            method573(-28, -85);
        }
        field1396 = null;
    }
}
