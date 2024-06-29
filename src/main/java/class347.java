import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class347 extends class95 {

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4784 = null;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    public static int field4787 = 0;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field4785 = 0;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "[I")
    public static int[] field4789 = new int[13];

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Lnl;")
    public static class435 field4786;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILjava/lang/Object;Lis;)V")
    public static final void method2155(int arg0, Object arg1, class65 arg2) {
        field4788++;
        if (arg2.field955 == null) {
            return;
        }
        if (arg0 > -74) {
            method2156((byte) 114);
        }
        for (int var3 = 0; var3 < 50 && arg2.field955.peekEvent() != null; var3++) {
            class89.method752(0, 1L);
        }
        if (arg1 != null) {
            arg2.field955.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V")
    public static void method2156(byte arg0) {
        field4786 = null;
        field4789 = null;
        field4784 = null;
        int var1 = -110 % ((67 - arg0) / 39);
    }
}
