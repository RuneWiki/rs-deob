import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class43 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[J")
    public static long[] field597;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Z")
    public static boolean field601;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "F")
    public static float field598;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
    public abstract boolean method271(boolean arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I")
    public abstract int method272(int arg0);

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static final void method273(byte arg0) {
        class285.field3824 = -1;
        if (arg0 > -124) {
            field601 = false;
        }
        field599++;
        class166.field2346 = 0;
        class473.field6909 = -1;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)C")
    public abstract char method274(int arg0);

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static void method275(int arg0) {
        field597 = null;
        if (arg0 != 100) {
            field597 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
    public abstract int method276(byte arg0);

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static final void method277(int arg0) {
        class467.field6832 = null;
        class344.field4742 = null;
        class433.field6309 = null;
        class327.field4476 = null;
        class176.field2505 = null;
        class106.field1442 = null;
        class234.field3238 = null;
        class504.field7418 = null;
        field596++;
        if (arg0 < 78) {
            return;
        }
        class354.field4830 = null;
        class359.field4908 = null;
        class252.field3506 = null;
        class34.field487 = null;
        class530.field7777 = null;
        class377.field5313 = null;
        class407.field5642 = null;
        class233.field3228 = null;
        class3.field26 = null;
        class117.field1579 = null;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)J")
    public abstract long method278(int arg0);

    static {
        new class83("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field597 = new long[100];
        field601 = false;
    }
}
