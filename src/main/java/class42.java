import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class42 extends class139 implements MouseWheelListener {

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    private int field722 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method315(Component arg0, byte arg1) {
        if (arg1 == 104) {
            arg0.addMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public final void method316(boolean arg0, Component arg1) {
        if (arg0) {
            this.field722 = -83;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!gg", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field722 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
    public final synchronized int method317(byte arg0) {
        if (arg0 > -83) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        int var2 = this.field722;
        this.field722 = 0;
        return var2;
    }
}
