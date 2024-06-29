import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class142 extends class145 implements MouseWheelListener {

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    private int field2266 = 0;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
    public final synchronized int method998(byte arg0) {
        int var2 = this.field2266;
        this.field2266 = 0;
        return arg0 < 50 ? -98 : var2;
    }

    @OriginalMember(owner = "client!qh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2266 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method999(Component arg0, byte arg1) {
        if (arg1 > -108) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1000(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 >= -60) {
            this.method998((byte) -64);
        }
    }
}
