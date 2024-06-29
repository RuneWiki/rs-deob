import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class283 extends class79 implements MouseWheelListener {

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    private int field4062 = 0;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 4)
    public final void method690(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -9) {
            this.field4062 = -92;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(BLjava/awt/Component;)V", line = 14)
    public final void method691(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 < 5) {
            this.method691((byte) -71, (Component) null);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I", line = 26)
    public final synchronized int method693(byte arg0) {
        if (arg0 == -90) {
            int var2 = this.field4062;
            this.field4062 = 0;
            return var2;
        } else {
            return -16;
        }
    }

    @OriginalMember(owner = "client!vr", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 38)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4062 += arg0.getWheelRotation();
    }
}
