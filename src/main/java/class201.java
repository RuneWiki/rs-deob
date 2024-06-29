import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class201 extends class167 implements MouseWheelListener {

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    private int field3437 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1189(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 <= 56) {
            this.method1189(-105, (Component) null);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
    public final synchronized int method1195(byte arg0) {
        if (arg0 != 126) {
            this.field3437 = -12;
        }
        int var2 = this.field3437;
        this.field3437 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3437 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1192(Component arg0, int arg1) {
        int var3 = 75 / ((-arg1 - 26) / 43);
        arg0.removeMouseWheelListener(this);
    }
}
