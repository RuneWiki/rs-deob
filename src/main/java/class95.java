import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class95 extends class135 implements MouseWheelListener {

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    private int field2198 = 0;

    @OriginalMember(owner = "client!oc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2198 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
    public final synchronized int method728(boolean arg0) {
        int var2 = this.field2198;
        if (arg0) {
            this.field2198 = 24;
        }
        this.field2198 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method729(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -1) {
            this.field2198 = 125;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method730(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 < 6) {
            this.field2198 = -15;
        }
    }
}
