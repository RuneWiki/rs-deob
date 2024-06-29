import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class243 extends class285 implements MouseWheelListener {

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    private int field3243 = 0;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)I")
    public final synchronized int method1489(byte arg0) {
        int var2 = this.field3243;
        if (arg0 != 78) {
            this.field3243 = 31;
        }
        this.field3243 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method1490(byte arg0, Component arg1) {
        int var3 = 79 / ((55 - arg0) / 59);
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public final void method1491(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        int var3 = 47 / ((arg1 + 57) / 47);
    }

    @OriginalMember(owner = "client!uv", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field3243 += arg0.getWheelRotation();
    }
}
