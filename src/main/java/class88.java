import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 extends class142 implements MouseWheelListener {

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    private int field2052 = 0;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method726(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 1777027655) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!me", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2052 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)I")
    public final synchronized int method727(boolean arg0) {
        if (!arg0) {
            this.method728((byte) 58, null);
        }
        int var2 = this.field2052;
        this.field2052 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method728(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 >= -20) {
            this.field2052 = 50;
        }
    }
}
