import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class762 extends class316 {

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    private int field10497 = -1;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "J")
    public static long field10499 = 0L;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "F")
    public static float field10496;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field10495;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "Ljga;")
    public static class746 field10498;

    @OriginalMember(owner = "client!ww", name = "w", descriptor = "[Lfp;")
    public static class342[] field10501;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILso;)V", line = 7)
    public final void method148(int arg0, class494 arg1) {
        if (arg0 != -1001) {
            field10496 = -0.25197682F;
        }
        this.field10497 = arg1.method2998(true);
        field10500++;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V", line = 18)
    public static final void method4228(int arg0) throws class736 {
        if (arg0 <= 30) {
            method4229((byte) -66);
        }
        if (class763.field10520 == 1) {
            class571.field8060.method463(class387.field5362, class631.field8874);
        } else {
            class571.field8060.method463(0, 0);
        }
        field10495++;
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)V", line = 39)
    public static void method4229(byte arg0) {
        field10498 = null;
        if (arg0 != 22) {
            field10496 = -1.3300536F;
        }
        field10501 = null;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BLmda;)V", line = 50)
    public final void method152(byte arg0, class276 arg1) {
        field10494++;
        if (arg0 <= 80) {
            field10501 = null;
        }
        arg1.method1788(1073741823, this.field10497);
    }
}
