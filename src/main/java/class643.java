import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class643 extends class504 {

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    private int field8228 = -1;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "[I")
    public static int[] field8230 = new int[1];

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "Lvba;")
    public static class765 field8232;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
    public static void method3481(byte arg0) {
        field8232 = null;
        field8230 = null;
        if (arg0 > -41) {
            field8230 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lqc;Z)V")
    public final void method1003(class400 arg0, boolean arg1) {
        field8231++;
        arg0.method2309(this.field8228, 24105);
        if (arg1) {
            this.method1003(null, false);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILmc;)V")
    public final void method1006(int arg0, class234 arg1) {
        if (arg0 != 1243) {
            this.field8228 = 56;
        }
        this.field8228 = arg1.method1553((byte) -107);
        field8233++;
        arg1.method1509(true);
        if (arg1.method1509(true) != 255) {
            arg1.field3133--;
            arg1.method1516(-11290);
        }
    }
}
