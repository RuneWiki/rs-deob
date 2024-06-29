import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class479 extends class470 {

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    private int field6756;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    private int field6760;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    private int field6753;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Lnj;")
    public static class204 field6754 = new class204(5000);

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Lej;")
    public static class104 field6762 = new class104("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lqa;")
    public static class207 field6759;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        int var4 = 54 / ((-1 - arg0) / 39);
        ++field6758;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)V")
    public final void method313(int arg0, byte arg1, int arg2) {
        ++field6757;
        int var4 = this.field6756 * arg2 >> 12;
        int var5 = this.field6755 * arg2 >> 12;
        if (arg1 <= -99) {
            int var6 = this.field6760 * arg0 >> 12;
            int var7 = this.field6753 * arg0 >> 12;
            class618.method3601(var6, super.field6609, var7, var5, (byte) 75, var4);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
    public static void method2791(int arg0) {
        field6759 = null;
        if (arg0 != 1780193356) {
            method2791(-89);
        }
        field6754 = null;
        field6762 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        ++field6761;
        if (arg2 > -95) {
            this.field6753 = 48;
        }
        int var4 = this.field6756 * arg1 >> 12;
        int var5 = this.field6755 * arg1 >> 12;
        int var6 = this.field6760 * arg0 >> 12;
        int var7 = this.field6753 * arg0 >> 12;
        class576.method3280(var7, var5, var4, var6, -97, super.field6609, super.field6612, super.field6611);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIII)V")
    public class479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6755 = arg2;
        this.field6756 = arg0;
        this.field6760 = arg1;
        this.field6753 = arg3;
    }
}
