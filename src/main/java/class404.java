import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class404 extends class261 {

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Lpg;")
    public static class492 field6111 = new class492(21, 0);

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "Lbr;")
    public static class380 field6112 = new class380();

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "F")
    public static float field6113;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
    public static void method2475(byte arg0) {
        field6112 = null;
        field6111 = null;
        if (arg0 <= 19) {
            field6114 = 49;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILvj;)Lnp;")
    public static final class115 method2476(int arg0, int arg1, class153 arg2) {
        field6110++;
        class115 var3;
        if (class140.field2033 == null) {
            var3 = new class115();
        } else {
            var3 = class140.field2033;
            class140.field2033 = class140.field2033.field1600;
            class501.field7488--;
            var3.field1600 = null;
        }
        var3.field1595 = arg0;
        var3.field1594 = arg2;
        if (arg1 != -27543) {
            method2476(91, -104, null);
        }
        return var3;
    }
}
