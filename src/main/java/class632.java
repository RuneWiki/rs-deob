import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class632 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
    public static int[] field8926 = new int[3];

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Lks;")
    public static class460 field8931 = new class460("", 14);

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "C")
    public char field8928;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public int field8925;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field8929;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public int field8930;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method3608(boolean arg0) {
        field8926 = null;
        if (arg0) {
            field8926 = null;
        }
        field8931 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILrv;)V")
    private final void method3609(int arg0, int arg1, class120 arg2) {
        field8927++;
        if (arg0 == arg1) {
            this.field8928 = class262.method1721(arg2.method877(-252), arg0 ^ 0xFFFFFFC8);
        } else if (arg1 == 2) {
            this.field8930 = arg2.method898((byte) -97);
            this.field8925 = arg2.method842(2384);
            this.field8929 = arg2.method842(2384);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lrv;B)V")
    public final void method3610(class120 arg0, byte arg1) {
        if (arg1 >= -56) {
            this.field8929 = 102;
        }
        field8924++;
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                return;
            }
            this.method3609(1, var3, arg0);
        }
    }
}
