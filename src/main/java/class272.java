import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class272 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field4795 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4796 = 0;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lqk;")
    public static class207 field4798 = class24.method212(255, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lqk;")
    public static class207 field4797 = class24.method212(255, "headicons_pk");

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field4794;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method1850(int arg0) {
        field4798 = null;
        field4797 = null;
        if (arg0 <= -28) {
            field4794 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1851(int arg0, String arg1) {
        field4793++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg0 != 27825) {
            field4798 = null;
        }
    }
}
