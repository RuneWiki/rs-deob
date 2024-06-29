import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class91 extends class133 implements MouseWheelListener {

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    private int field1546 = 0;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method614(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 0) {
            this.field1546 = 39;
        }
    }

    @OriginalMember(owner = "client!od", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1546 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method615(int arg0, Component arg1) {
        if (arg0 < -108) {
            arg1.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
    public final synchronized int method616(int arg0) {
        if (arg0 != 1000) {
            this.method616(21);
        }
        int var2 = this.field1546;
        this.field1546 = 0;
        return var2;
    }
}
