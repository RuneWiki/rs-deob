import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class202 extends class41 {

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "[B")
    public byte[] field3481;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "Lsc;")
    public static class181 field3478 = class149.method967(255, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "[I")
    public static int[] field3479;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lsc;IBLsc;)V")
    public static final void method1357(class181 arg0, int arg1, byte arg2, class181 arg3) {
        if (arg2 > -97) {
            field3478 = null;
        }
        field3480++;
        class221.method1467((class181) null, arg3, -6700, arg0, arg1, -1);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static void method1358(boolean arg0) {
        field3478 = null;
        if (arg0) {
            field3478 = null;
        }
        field3479 = null;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "([B)V")
    public class202(byte[] arg0) {
        this.field3481 = arg0;
    }
}
