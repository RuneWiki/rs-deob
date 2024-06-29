import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class24 extends class309 implements MouseWheelListener {

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    private int field565 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 4)
    public final void method159(byte arg0, Component arg1) {
        if (arg0 <= -119) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!od", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 15)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field565 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 23)
    public final void method160(int arg0, Component arg1) {
        int var3 = 110 / ((arg0 - 33) / 62);
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I", line = 32)
    public final synchronized int method161(int arg0) {
        int var2 = this.field565;
        if (arg0 != -13204) {
            this.method159((byte) -30, (Component) null);
        }
        this.field565 = 0;
        return var2;
    }
}
