import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class99 extends class129 implements MouseWheelListener {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    private int field1565 = 0;

    @OriginalMember(owner = "client!oe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1565 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public final void method782(Component arg0, boolean arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1) {
            this.field1565 = 105;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
    public final synchronized int method783(int arg0) {
        int var2 = this.field1565;
        this.field1565 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method784(byte arg0, Component arg1) {
        int var3 = -97 / ((80 - arg0) / 34);
        arg1.addMouseWheelListener(this);
    }
}
