import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class59 extends class249 implements MouseWheelListener {

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    private int field1019 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)I", line = 5)
    public final synchronized int method459(byte arg0) {
        int var2 = this.field1019;
        if (arg0 <= 122) {
            this.method461((byte) 19, (Component) null);
        }
        this.field1019 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 18)
    public final void method460(Component arg0, int arg1) {
        if (arg1 != 0) {
            this.field1019 = 18;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 28)
    public final void method461(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        int var3 = 51 % ((34 - arg0) / 39);
    }

    @OriginalMember(owner = "client!bk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 37)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1019 += arg0.getWheelRotation();
    }
}
