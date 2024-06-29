import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class512 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field7232 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public static final void method3093(Canvas arg0, byte arg1) {
        field7233++;
        Dimension var2 = arg0.getSize();
        if (arg1 != -26) {
            return;
        }
        class368.method2298(var2.width, var2.height, 0);
        if (class763.field10520 == 1) {
            class571.field8060.method475(arg0, class194.field2992, class549.field7896);
        } else {
            class571.field8060.method475(arg0, class355.field4991, class82.field908);
        }
    }
}
