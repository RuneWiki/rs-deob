import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class231 extends class197 implements MouseWheelListener {

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    private int field4170 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method1412(byte arg0, Component arg1) {
        if (arg0 > -114) {
            this.field4170 = -81;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I")
    public final synchronized int method1410(boolean arg0) {
        if (!arg0) {
            this.field4170 = -121;
        }
        int var2 = this.field4170;
        this.field4170 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4170 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1417(Component arg0, byte arg1) {
        if (arg1 != 23) {
            this.field4170 = 105;
        }
        arg0.removeMouseWheelListener(this);
    }
}
