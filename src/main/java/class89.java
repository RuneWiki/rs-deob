import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class89 extends class71 implements MouseWheelListener {

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    private int field1659 = 0;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 4)
    public final void method542(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 != -125) {
            this.field1659 = -74;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 15)
    public final void method548(byte arg0, Component arg1) {
        int var3 = -69 / ((arg0 - 31) / 63);
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!b", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 23)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1659 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I", line = 34)
    public final synchronized int method549(byte arg0) {
        if (arg0 >= -18) {
            this.method548((byte) -5, (Component) null);
        }
        int var2 = this.field1659;
        this.field1659 = 0;
        return var2;
    }
}
