import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class84 extends class102 implements MouseWheelListener {

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    private int field2075 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method695(byte arg0, Component arg1) {
        int var3 = -16 / ((-arg0 - 73) / 34);
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method696(Component arg0, byte arg1) {
        int var3 = -23 / ((-arg1 - 45) / 57);
        arg0.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
    public final synchronized int method697(int arg0) {
        int var2 = this.field2075;
        int var3 = -3 / ((-arg0 - 37) / 46);
        this.field2075 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2075 += arg0.getWheelRotation();
    }
}
