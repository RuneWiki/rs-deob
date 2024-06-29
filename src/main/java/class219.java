import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class219 extends class117 {

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3595 = "Loaded title screen";

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "Lbl;")
    public static class146 field3594;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V")
    public static final void method1511(boolean arg0) {
        class178.field2908 = 0;
        field3593++;
        class130.field2033 = arg0;
        class36.field527 = -1;
        class237.field3804 = 0;
        class86.field1418 = 0;
        class53.field883 = 0;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class219() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 2) {
            field3594 = null;
        }
        field3591++;
        return class243.field3869;
    }

    @OriginalMember(owner = "client!q", name = "j", descriptor = "(I)V")
    public static void method1512(int arg0) {
        field3595 = null;
        field3594 = null;
        if (arg0 != 0) {
            method1512(-116);
        }
    }
}
