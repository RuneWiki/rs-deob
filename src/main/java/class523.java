import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class523 extends class459 implements MouseWheelListener {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private int field7690 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method2662(int arg0, Component arg1) {
        int var3 = 89 / ((46 - arg0) / 37);
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method2665(byte arg0, Component arg1) {
        if (arg0 != 11) {
            this.mouseWheelMoved(null);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!nd", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field7690 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
    public final synchronized int method2663(int arg0) {
        int var2 = this.field7690;
        if (arg0 != -10497) {
            this.field7690 = -120;
        }
        this.field7690 = 0;
        return var2;
    }
}
