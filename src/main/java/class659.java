import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class659 extends class198 {

    @OriginalMember(owner = "client!il", name = "v", descriptor = "J")
    private long field9288 = -1L;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "Ljava/lang/String;")
    private String field9287 = null;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "Lin;")
    public static class380 field9290 = new class380(9, 10);

    @OriginalMember(owner = "client!il", name = "w", descriptor = "F")
    public static float field9289;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILlm;)V", line = 3)
    public final void method858(int arg0, class50 arg1) {
        if (arg0 != 3) {
            field9290 = null;
        }
        arg1.method390(arg0 ^ 0x2C, this.field9288, this.field9287);
        field9284++;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 22)
    public static final void method3692(int arg0) {
        if (arg0 != 3) {
            field9289 = 0.7942152F;
        }
        class768.field10604.method240(false);
        field9291++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLol;)V", line = 35)
    public final void method855(boolean arg0, class431 arg1) {
        field9285++;
        if (!arg0) {
            this.method855(false, null);
        }
        if (arg1.method2557(14929) != 255) {
            arg1.field5983--;
            this.field9288 = arg1.method2567((byte) -123);
        }
        this.field9287 = arg1.method2578(1712145680);
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V", line = 59)
    public static void method3693(int arg0) {
        field9290 = null;
        if (arg0 != 10370) {
            field9290 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)Z", line = 69)
    public static final boolean method3694(int arg0, int arg1) {
        field9286++;
        if (arg0 != 9) {
            field9289 = -0.6418319F;
        }
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }
}
