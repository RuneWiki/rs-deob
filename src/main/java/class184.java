import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class184 extends class58 implements MouseWheelListener {

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    private int field3312 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method388(Component arg0, byte arg1) {
        if (arg1 <= 12) {
            this.method386(-78, null);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
    public final synchronized int method389(int arg0) {
        int var2 = this.field3312;
        if (arg0 != -14322) {
            this.mouseWheelMoved(null);
        }
        this.field3312 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3312 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method386(int arg0, Component arg1) {
        if (arg0 != -28698) {
            this.method389(-57);
        }
        arg1.addMouseWheelListener(this);
    }
}
