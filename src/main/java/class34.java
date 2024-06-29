import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class54 implements MouseWheelListener {

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    private int field742 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I")
    public final synchronized int method244(int arg0) {
        int var2 = this.field742;
        if (arg0 == -1285749808) {
            this.field742 = 0;
            return var2;
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!ee", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field742 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(ILjava/awt/Component;)V")
    public final void method245(int arg0, Component arg1) {
        if (arg0 >= -120) {
            this.method244(55);
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method246(int arg0, Component arg1) {
        if (arg0 <= 84) {
            this.field742 = 121;
        }
        arg1.removeMouseWheelListener(this);
    }
}
