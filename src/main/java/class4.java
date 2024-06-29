import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class42 implements MouseWheelListener {

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    private int field38 = 0;

    @OriginalMember(owner = "client!ac", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field38 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method11(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        int var3 = -93 / ((38 - arg0) / 58);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I")
    public final synchronized int method12(byte arg0) {
        if (arg0 < 59) {
            this.field38 = 30;
        }
        int var2 = this.field38;
        this.field38 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(BLjava/awt/Component;)V")
    public final void method13(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -24) {
            this.field38 = 10;
        }
    }
}
