import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class236 extends class200 {

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "B")
    public byte field4384;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "Lnf;")
    public class147 field4383;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "Lnf;")
    public static class147 field4386;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public static void method1537(int arg0) {
        field4386 = null;
        if (arg0 != 29392) {
            method1538(true);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
    public static final void method1538(boolean arg0) {
        if (arg0) {
            method1538(true);
        }
        class9.field194.method1179((byte) -96);
        field4381++;
    }
}
