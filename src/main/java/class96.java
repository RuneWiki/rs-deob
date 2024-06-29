import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class96 {

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1390 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1386 = -1;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
    public static int[] field1388 = new int[1000];

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lhq;")
    public static class175 field1387;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lid;")
    public static class242 field1389;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lrk;")
    public static class427 field1394;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lkb;")
    public static class80 field1391;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method816(byte arg0) {
        field1387 = null;
        field1388 = null;
        if (arg0 >= 38) {
            field1394 = null;
            field1389 = null;
            field1391 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
    public static final void method817(int arg0, boolean arg1) {
        field1392++;
        class438.field6268.method2534(0, arg0);
        if (arg1) {
            method816((byte) 65);
        }
    }
}
