import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class340 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Ljp;")
    public static class55 field5088;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method2196(byte arg0) {
        field5088 = null;
        if (arg0 != 44) {
            field5088 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public static final void method2197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5089++;
        if (arg4 <= arg1) {
            class262.method1831(arg1, class402.field5946[arg2], (byte) 43, arg0, arg4);
        } else {
            class262.method1831(arg4, class402.field5946[arg2], (byte) 43, arg0, arg1);
        }
        if (arg3 != -26207) {
            field5088 = null;
        }
    }

    static {
        new class179("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field5088 = new class55(84, 0);
    }
}
