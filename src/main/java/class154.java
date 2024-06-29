import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class154 extends class16 implements MouseWheelListener {

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    private int field2408 = 0;

    @OriginalMember(owner = "client!oj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2408 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)I")
    public final synchronized int method114(boolean arg0) {
        if (arg0) {
            this.field2408 = 87;
        }
        int var2 = this.field2408;
        this.field2408 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method112(Component arg0, int arg1) {
        if (arg1 == -820088272) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method115(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 54) {
            this.field2408 = 52;
        }
    }
}
