import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class382 extends class329 {

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public int field4820;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "Z")
    public boolean field4822;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public int field4826;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public int field4825;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public int field4827;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public int field4819;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field4823 = -1;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "Lpl;")
    public static class612 field4821;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "Z")
    public static boolean field4824;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V", line = 8)
    public static void method2066(byte arg0) {
        if (arg0 == -104) {
            field4821 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIIZ)V", line = 26)
    public class382(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4820 = arg0;
        this.field4822 = arg5;
        this.field4826 = arg4;
        this.field4825 = arg1;
        this.field4827 = arg3;
        this.field4819 = arg2;
    }
}
