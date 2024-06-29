import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class239 extends class255 implements MouseWheelListener {

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    private int field4376 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)I")
    public final synchronized int method1693(boolean arg0) {
        int var2 = this.field4376;
        this.field4376 = 0;
        if (arg0) {
            this.field4376 = 114;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4376 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1694(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 4) {
            this.field4376 = -50;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1695(Component arg0, byte arg1) {
        if (arg1 != 107) {
            this.field4376 = 13;
        }
        arg0.addMouseWheelListener(this);
    }
}
