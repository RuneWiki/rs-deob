import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class105 extends class85 implements MouseWheelListener {

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    private int field1462 = 0;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)I", line = 5)
    public final synchronized int method759(byte arg0) {
        int var2 = this.field1462;
        if (arg0 < 92) {
            return -3;
        } else {
            this.field1462 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!as", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 21)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1462 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 30)
    public final void method756(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 < 85) {
            this.field1462 = -3;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 40)
    public final void method760(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 0) {
            this.method760(null, 28);
        }
    }
}
