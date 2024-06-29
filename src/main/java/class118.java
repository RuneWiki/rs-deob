import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class118 extends class5 implements MouseWheelListener {

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    private int field2137 = 0;

    @OriginalMember(owner = "client!bc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2137 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I", line = 12)
    public final synchronized int method27(int arg0) {
        if (arg0 != -9244) {
            this.field2137 = 115;
        }
        int var2 = this.field2137;
        this.field2137 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(BLjava/awt/Component;)V", line = 25)
    public final void method33(byte arg0, Component arg1) {
        if (arg0 > -124) {
            this.method33((byte) -27, (Component) null);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 38)
    public final void method28(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 32) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
    }
}
