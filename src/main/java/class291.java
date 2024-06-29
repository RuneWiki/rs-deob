import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class291 extends class82 implements MouseWheelListener {

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    private int field4975 = 0;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 4)
    public final void method583(boolean arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0) {
            this.method583(true, (Component) null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 14)
    public final void method579(int arg0, Component arg1) {
        if (arg0 != -26357) {
            this.field4975 = -76;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!sh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 25)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4975 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I", line = 33)
    public final synchronized int method582(int arg0) {
        int var2 = 33 / ((arg0 + 56) / 36);
        int var3 = this.field4975;
        this.field4975 = 0;
        return var3;
    }
}
