import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class287 extends class340 {

    @OriginalMember(owner = "client!ria", name = "u", descriptor = "Llga;")
    public static class712 field3821 = new class712(49, 4);

    @OriginalMember(owner = "client!ria", name = "x", descriptor = "Lmu;")
    public static class303 field3824 = new class303("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!ria", name = "y", descriptor = "F")
    public static float field3825;

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ria", name = "v", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ria", name = "w", descriptor = "Lfl;")
    public static class739 field3823;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "(I)V")
    public final void method1723(int arg0) {
        field3820++;
        if (arg0 != -1128) {
            field3821 = null;
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class287(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V")
    public final void method1724(OggPacket arg0, boolean arg1) {
        field3822++;
        if (arg1) {
            field3826 = 86;
        }
    }

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "(I)V")
    public static void method1725(int arg0) {
        field3823 = null;
        field3821 = null;
        field3824 = null;
        if (arg0 != 4) {
            field3824 = null;
        }
    }
}
