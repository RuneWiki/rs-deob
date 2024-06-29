import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class319 extends class249 implements MouseWheelListener {

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    private int field4861 = 0;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I", line = 5)
    public final synchronized int method1701(int arg0) {
        int var2 = this.field4861;
        this.field4861 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 15)
    public final void method1700(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != -52) {
            this.method1702(-80, (Component) null);
        }
    }

    @OriginalMember(owner = "client!gj", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 30)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field4861 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 37)
    public final void method1702(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 > -68) {
            this.method1701(75);
        }
    }
}
