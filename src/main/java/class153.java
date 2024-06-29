import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class153 extends class342 implements MouseWheelListener {

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    private int field2412 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I", line = 9)
    public final synchronized int method1070(byte arg0) {
        if (arg0 != -114) {
            this.field2412 = -46;
        }
        int var2 = this.field2412;
        this.field2412 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 21)
    public final void method1071(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 >= -1) {
            this.field2412 = -109;
        }
    }

    @OriginalMember(owner = "client!jb", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 31)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2412 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 38)
    public final void method1072(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 0) {
            this.field2412 = -9;
        }
    }
}
