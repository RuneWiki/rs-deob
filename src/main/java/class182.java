import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class182 extends class134 implements MouseWheelListener {

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    private int field3010 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method957(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -84) {
            this.field3010 = -56;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)I")
    public final synchronized int method956(int arg0) {
        if (arg0 != 64) {
            this.field3010 = -115;
        }
        int var2 = this.field3010;
        this.field3010 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!wk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3010 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method959(int arg0, Component arg1) {
        if (arg0 != 2) {
            this.field3010 = -104;
        }
        arg1.removeMouseWheelListener(this);
    }
}
