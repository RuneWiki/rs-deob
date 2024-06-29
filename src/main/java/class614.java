import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class614 {

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field8762 = 0;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "Llc;")
    public static class435 field8766 = new class435(85, 6);

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "D")
    public static double field8763;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public static final void method3572(byte arg0, Canvas arg1) {
        if (arg0 > -7) {
            return;
        }
        field8765++;
        Dimension var2 = arg1.getSize();
        class56.method545(var2.width, var2.height, 0);
        if (class270.field3833 == 1) {
            class301.field4129.method318(arg1, class222.field3279, class492.field7090);
        } else {
            class301.field4129.method318(arg1, class271.field3851, class327.field4442);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
    public static void method3573(int arg0) {
        if (arg0 > 7) {
            field8766 = null;
        }
    }
}
