import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class9 extends class301 implements MouseWheelListener {

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    private int field126 = 0;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)I", line = 5)
    public final synchronized int method68(byte arg0) {
        int var2 = this.field126;
        if (arg0 != 11) {
            this.field126 = 42;
        }
        this.field126 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 17)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field126 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 24)
    public final void method69(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -1) {
            this.field126 = -70;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 34)
    public final void method70(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -89) {
            this.field126 = 27;
        }
    }
}
