import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class206 extends class340 implements MouseWheelListener {

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    private int field2905 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method1395(int arg0, Component arg1) {
        if (arg0 != 128) {
            this.field2905 = -123;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!pb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2905 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
    public final synchronized int method1396(int arg0) {
        int var2 = this.field2905;
        this.field2905 = 0;
        return arg0 < 50 ? 115 : var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method1397(Component arg0, byte arg1) {
        if (arg1 >= 13) {
            arg0.removeMouseWheelListener(this);
        }
    }
}
