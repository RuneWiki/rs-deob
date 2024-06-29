import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class452 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6413 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field6418 = 0;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Ltl;")
    public static class400 field6417 = new class400(5);

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field6412;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lqn;")
    public static class404 field6419;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Lui;")
    public static class451 field6420;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method2693(int arg0) {
        field6413 = null;
        field6417 = null;
        if (arg0 < 46) {
            field6419 = null;
        }
        field6420 = null;
        field6419 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
    public static final void method2694(int arg0, byte arg1) {
        field6412++;
        if (arg1 == 15) {
            class163.field2270 = 100;
            class47.field685 = -1;
            class132.field1843 = 3;
            class346.field5287 = arg0;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
    public static final void method2695(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class367.field5544 = arg2;
        class17.field231 = arg3;
        if (arg1 != 6685) {
            method2693(110);
        }
        field6414++;
        class48.field694 = arg4;
        class84.field1191 = arg0;
    }
}
