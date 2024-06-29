import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class86 extends class25 {

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lmc;")
    public class184 field1439;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field1440 = 0;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Lvh;")
    public static class252 field1441 = new class252();

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "Lvh;")
    public static class252 field1442 = new class252();

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field1444 = 0;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static volatile int field1443 = 0;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILu;)I")
    public static final int method660(int arg0, class111 arg1) {
        field1438++;
        if (arg0 > -39) {
            field1440 = -78;
        }
        int var2 = 0;
        if (arg1.method827(class143.field2398, -85)) {
            var2++;
        }
        if (arg1.method827(class228.field3983, -90)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lmc;)V")
    public class86(class184 arg0) {
        this.field1439 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method661(int arg0) {
        if (arg0 == -25180) {
            field1441 = null;
            field1442 = null;
        }
    }
}
