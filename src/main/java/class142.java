import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class142 extends class53 implements MouseWheelListener {

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    private int field2994 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method472(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 1) {
            this.field2994 = 112;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method468(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -4679) {
            this.method468(null, 21);
        }
    }

    @OriginalMember(owner = "client!oh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2994 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)I")
    public final synchronized int method471(boolean arg0) {
        if (arg0) {
            this.method468(null, 51);
        }
        int var2 = this.field2994;
        this.field2994 = 0;
        return var2;
    }
}
