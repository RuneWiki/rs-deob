import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class453 extends class211 implements MouseWheelListener {

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    private int field6478 = 0;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 8)
    public final void method1426(int arg0, Component arg1) {
        if (arg0 != -29615) {
            this.field6478 = 15;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I", line = 21)
    public final synchronized int method1425(byte arg0) {
        if (arg0 > -9) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        int var2 = this.field6478;
        this.field6478 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 33)
    public final void method1424(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 > -122) {
            this.method1424((Component) null, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!ms", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 43)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field6478 += arg0.getWheelRotation();
    }
}
