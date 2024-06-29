import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class24 extends class255 implements MouseWheelListener {

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    private int field407 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
    public final synchronized int method156(byte arg0) {
        int var2 = this.field407;
        this.field407 = 0;
        if (arg0 > -68) {
            this.method156((byte) 66);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method157(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -11639) {
            this.method157((Component) null, -17);
        }
    }

    @OriginalMember(owner = "client!lk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field407 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method158(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 2) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }
}
