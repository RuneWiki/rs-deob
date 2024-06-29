import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class256 extends class65 implements MouseWheelListener {

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    private int field3315 = 0;

    @OriginalMember(owner = "client!ur", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3315 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method375(boolean arg0, Component arg1) {
        if (arg0) {
            this.method377((byte) -122);
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method372(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -96) {
            this.method372((byte) -45, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
    public final synchronized int method377(byte arg0) {
        int var2 = this.field3315;
        int var3 = 81 / ((-arg0 - 19) / 37);
        this.field3315 = 0;
        return var2;
    }
}
