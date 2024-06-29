import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class630 extends class172 {

    @OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
    private int field8819 = -1;

    @OriginalMember(owner = "client!lia", name = "r", descriptor = "Ljn;")
    public static class134 field8822 = new class134(30, -2);

    @OriginalMember(owner = "client!lia", name = "p", descriptor = "B")
    private byte field8820;

    @OriginalMember(owner = "client!lia", name = "q", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!lia", name = "s", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILgga;)V")
    public final void method102(int arg0, class511 arg1) {
        field8823++;
        this.field8819 = arg1.method3002(arg0 ^ 0xFFFFF7FF);
        if (arg0 == 2048) {
            this.field8820 = arg1.method3030(arg0 ^ 0xFFFF9280);
        }
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(BLhia;)V")
    public final void method100(byte arg0, class48 arg1) {
        if (arg0 != 71) {
            field8822 = null;
        }
        arg1.method390(this.field8820, -2453, this.field8819);
        field8821++;
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)V")
    public static void method3618(int arg0) {
        field8822 = null;
        if (arg0 > -97) {
            field8822 = null;
        }
    }
}
