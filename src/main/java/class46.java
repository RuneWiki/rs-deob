import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class46 extends class143 implements MouseWheelListener {

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private int field953 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public final synchronized int method395(int arg0) {
        int var2 = this.field953;
        this.field953 = 0;
        if (arg0 >= -56) {
            this.field953 = -69;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method396(Component arg0, byte arg1) {
        if (arg1 != 124) {
            this.mouseWheelMoved(null);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method397(int arg0, Component arg1) {
        if (arg0 == 13474) {
            arg1.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!eb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field953 += arg0.getWheelRotation();
    }
}
