import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class642 extends class172 {

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    private int field9021 = -1;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "Lqk;")
    public static class1 field9020 = new class1(3, 7);

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILgga;)V", line = 5)
    public final void method102(int arg0, class511 arg1) {
        field9018++;
        if (arg0 != 2048) {
            field9020 = null;
        }
        this.field9021 = arg1.method3002(-1);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLhia;)V", line = 17)
    public final void method100(byte arg0, class48 arg1) {
        if (arg0 != 71) {
            field9020 = null;
        }
        field9019++;
        arg1.method398(this.field9021, -584);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 29)
    public static void method3688(int arg0) {
        field9020 = null;
        if (arg0 != -20771) {
            method3688(9);
        }
    }
}
