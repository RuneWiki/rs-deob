import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class303 extends class37 implements MouseWheelListener {

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    private int field4956 = 0;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method227(int arg0, Component arg1) {
        if (arg0 != -64) {
            this.method233(10);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
    public final synchronized int method233(int arg0) {
        int var2 = this.field4956;
        if (arg0 == -18681) {
            this.field4956 = 0;
            return var2;
        } else {
            return 41;
        }
    }

    @OriginalMember(owner = "client!km", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4956 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method232(int arg0, Component arg1) {
        if (arg0 > -10) {
            this.field4956 = -37;
        }
        arg1.removeMouseWheelListener(this);
    }
}
