import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class246 extends class195 implements MouseWheelListener {

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    private int field4108 = 0;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I", line = 5)
    public final synchronized int method1418(byte arg0) {
        int var2 = this.field4108;
        int var3 = 115 / ((arg0 - 75) / 51);
        this.field4108 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 16)
    public final void method1417(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 0) {
            this.method1420((Component) null, -26);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 26)
    public final void method1420(Component arg0, int arg1) {
        if (arg1 != 0) {
            this.field4108 = 65;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!wj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 42)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4108 += arg0.getWheelRotation();
    }
}
