import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class200 extends class37 implements MouseWheelListener {

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    private int field3199 = 0;

    @OriginalMember(owner = "client!tl", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 4)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3199 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 15)
    public final void method309(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != -7257) {
            this.field3199 = -33;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)I", line = 26)
    public final synchronized int method311(int arg0) {
        if (arg0 > -110) {
            this.method311(-43);
        }
        int var2 = this.field3199;
        this.field3199 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(ILjava/awt/Component;)V", line = 38)
    public final void method313(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 0) {
            this.method309(-53, (Component) null);
        }
    }
}
