import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class199 extends class277 implements MouseWheelListener {

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    private int field3305 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 4)
    public final void method1398(byte arg0, Component arg1) {
        if (arg0 > -49) {
            this.method1400((Component) null, -92);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)I", line = 15)
    public final synchronized int method1399(int arg0) {
        if (arg0 == -1) {
            int var2 = this.field3305;
            this.field3305 = 0;
            return var2;
        } else {
            return 71;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 27)
    public final void method1400(Component arg0, int arg1) {
        if (arg1 != -1) {
            this.method1398((byte) -56, (Component) null);
        }
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!lk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 37)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3305 += arg0.getWheelRotation();
    }
}
