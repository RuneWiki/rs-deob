import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class414 extends class376 implements MouseWheelListener {

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    private int field6189 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method2493(int arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        if (arg0 != 255) {
            this.field6189 = -117;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method2490(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != -43) {
            this.field6189 = 9;
        }
    }

    @OriginalMember(owner = "client!ca", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field6189 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
    public final synchronized int method2494(int arg0) {
        if (arg0 != -128) {
            this.field6189 = 120;
        }
        int var2 = this.field6189;
        this.field6189 = 0;
        return var2;
    }
}
