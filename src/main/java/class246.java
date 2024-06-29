import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class246 extends class78 implements MouseWheelListener {

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    private int field4158 = 0;

    @OriginalMember(owner = "client!ul", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4158 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 11)
    public final void method559(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != 17330) {
            this.method555((byte) -108, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 25)
    public final void method555(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 <= 4) {
            this.method555((byte) -95, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)I", line = 36)
    public final synchronized int method558(boolean arg0) {
        int var2 = this.field4158;
        if (!arg0) {
            this.field4158 = 121;
        }
        this.field4158 = 0;
        return var2;
    }
}
