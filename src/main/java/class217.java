import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class217 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Luf;")
    public static class291 field3089;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lvn;Z)V")
    public static final void method1493(class437 arg0, boolean arg1) {
        field3090++;
        if (!arg1) {
            method1494(9);
        }
        class36.field518 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method1494(int arg0) {
        field3089 = null;
        if (arg0 != 25999) {
            method1493((class437) null, false);
        }
    }
}
