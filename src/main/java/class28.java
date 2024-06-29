import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class28 extends class11 implements MouseWheelListener {

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    private int field483 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
    public final synchronized int method65(int arg0) {
        int var2 = this.field483;
        if (arg0 != 43) {
            this.field483 = 65;
        }
        this.field483 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method69(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 < 115) {
            this.method66(null, -31);
        }
    }

    @OriginalMember(owner = "client!ch", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field483 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method66(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -12542) {
            this.method65(-36);
        }
    }
}
