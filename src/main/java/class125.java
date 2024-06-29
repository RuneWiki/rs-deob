import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class125 extends class210 implements MouseWheelListener {

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    private int field2310 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method896(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = -43 / ((1 - arg1) / 32);
    }

    @OriginalMember(owner = "client!qi", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2310 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Ljava/awt/Component;B)V")
    public final void method897(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 > -60) {
            this.method896((Component) null, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
    public final synchronized int method898(byte arg0) {
        if (arg0 != 73) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        int var2 = this.field2310;
        this.field2310 = 0;
        return var2;
    }
}
