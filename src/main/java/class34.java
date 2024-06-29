import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class120 implements MouseWheelListener {

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    private int field857 = 0;

    @OriginalMember(owner = "client!ee", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field857 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public final void method331(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = -46 / ((-arg1 - 54) / 43);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)I")
    public final synchronized int method332(boolean arg0) {
        if (!arg0) {
            this.field857 = 36;
        }
        int var2 = this.field857;
        this.field857 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method333(Component arg0, int arg1) {
        if (arg1 != -1418) {
            this.method331(null, 110);
        }
        arg0.addMouseWheelListener(this);
    }
}
