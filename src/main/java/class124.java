import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class124 extends class98 implements MouseWheelListener {

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    private int field1592 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)I")
    public final synchronized int method536(int arg0) {
        int var2 = -35 / ((arg0 - 25) / 55);
        int var3 = this.field1592;
        this.field1592 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method535(Component arg0, int arg1) {
        if (arg1 != -9140) {
            this.field1592 = -40;
        }
        arg0.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!lc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1592 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method537(Component arg0, byte arg1) {
        if (arg1 <= 14) {
            this.field1592 = 114;
        }
        arg0.addMouseWheelListener(this);
    }
}
