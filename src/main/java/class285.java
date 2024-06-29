import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class285 extends class215 implements MouseWheelListener {

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    private int field4443 = 0;

    @OriginalMember(owner = "client!eb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 10)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4443 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 17)
    public final void method1539(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 > -35) {
            this.field4443 = -55;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 27)
    public final void method1536(Component arg0, boolean arg1) {
        if (!arg1) {
            this.mouseWheelMoved((MouseWheelEvent) null);
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I", line = 38)
    public final synchronized int method1542(int arg0) {
        int var2 = -80 % ((-arg0 - 19) / 50);
        int var3 = this.field4443;
        this.field4443 = 0;
        return var3;
    }
}
