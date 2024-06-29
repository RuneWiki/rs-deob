import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class371 {

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "S")
    public static short field4785 = 32767;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Lrca;")
    public class30 field4781;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "[I")
    public int[] field4783;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lufa;ILjava/lang/Object;)V", line = 13)
    public static final void method2138(class140 arg0, int arg1, Object arg2) {
        field4782++;
        if (arg0.field1829 == null) {
            return;
        }
        for (int var3 = arg1; var3 < 50 && arg0.field1829.peekEvent() != null; var3++) {
            class122.method905(1L, arg1 ^ 0xFFFFE7FF);
        }
        try {
            if (arg2 != null) {
                arg0.field1829.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }
}
