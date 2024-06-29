import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class160 extends class63 implements MouseWheelListener {

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    private int field3173 = 0;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
    public final synchronized int method378(int arg0) {
        if (arg0 > -44) {
            this.field3173 = 127;
        }
        int var2 = this.field3173;
        this.field3173 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method377(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        int var3 = -124 / ((arg1 + 46) / 60);
    }

    @OriginalMember(owner = "client!qh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3173 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method379(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 3) {
            this.field3173 = 33;
        }
    }
}
