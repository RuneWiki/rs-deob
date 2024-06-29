import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class128 extends class27 implements MouseWheelListener {

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    private int field2814 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
    public final synchronized int method261(byte arg0) {
        int var2 = this.field2814;
        this.field2814 = 0;
        if (arg0 != 6) {
            this.field2814 = 108;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2814 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method263(byte arg0, Component arg1) {
        if (arg0 != 2) {
            this.method261((byte) -4);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method266(Component arg0, int arg1) {
        if (arg1 <= 6) {
            this.field2814 = -118;
        }
        arg0.removeMouseWheelListener(this);
    }
}
