import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class92 extends class292 implements MouseWheelListener {

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    private int field1148 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 4)
    public final void method544(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 <= 71) {
            this.field1148 = -26;
        }
    }

    @OriginalMember(owner = "client!pf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 15)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1148 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 23)
    public final void method545(int arg0, Component arg1) {
        int var3 = 46 / ((arg0 - 32) / 55);
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I", line = 35)
    public final synchronized int method546(int arg0) {
        int var2 = this.field1148;
        this.field1148 = 0;
        if (arg0 <= 97) {
            this.method545(-24, (Component) null);
        }
        return var2;
    }
}
