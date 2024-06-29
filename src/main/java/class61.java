import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class104 implements MouseWheelListener {

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field1234 = 0;

    @OriginalMember(owner = "client!ie", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1234 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method424(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -69) {
            this.method425(null, -96);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method425(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 255) {
            this.mouseWheelMoved(null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)I")
    public final synchronized int method426(byte arg0) {
        int var2 = this.field1234;
        this.field1234 = 0;
        if (arg0 != -118) {
            this.field1234 = -71;
        }
        return var2;
    }
}
