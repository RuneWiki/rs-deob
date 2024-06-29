import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class443 extends class108 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[I")
    public static int[] field6475 = new int[2];

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "F")
    public static float field6472;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "J")
    public long field6471;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lke;")
    public class443 field6470;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lke;")
    public class443 field6478;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field6474;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "[I")
    public static int[] field6477;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Z", line = 7)
    public final boolean method2617(byte arg0) {
        if (arg0 != -95) {
            field6474 = null;
        }
        field6476++;
        return this.field6470 != null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 22)
    public static void method2618(int arg0) {
        if (arg0 == 2) {
            field6475 = null;
            field6474 = null;
            field6477 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 34)
    public final void method2619(boolean arg0) {
        field6473++;
        if (this.field6470 == null) {
            return;
        }
        if (!arg0) {
            method2618(102);
        }
        this.field6470.field6478 = this.field6478;
        this.field6478.field6470 = this.field6470;
        this.field6478 = null;
        this.field6470 = null;
    }
}
