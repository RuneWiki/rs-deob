import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class90 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Lfja;")
    public static class783 field1365 = new class783(82, 0);

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1367 = 7000;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field1369 = field1367;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Lgv;")
    public class90 field1364;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lgv;")
    public class90 field1366;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
    public final void method731(byte arg0) {
        field1368++;
        if (this.field1366 == null) {
            return;
        }
        this.field1366.field1364 = this.field1364;
        if (arg0 == 39) {
            this.field1364.field1366 = this.field1366;
            this.field1364 = null;
            this.field1366 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V")
    public static void method732(byte arg0) {
        field1365 = null;
        if (arg0 != 17) {
            method732((byte) 126);
        }
    }
}
