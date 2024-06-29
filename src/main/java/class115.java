import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class115 extends class312 implements MouseWheelListener {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    private int field1720 = 0;

    @OriginalMember(owner = "client!m", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1720 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public final void method730(byte arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 108) {
            this.field1720 = -19;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method731(int arg0, Component arg1) {
        if (arg0 == -547) {
            arg1.removeMouseWheelListener(this);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
    public final synchronized int method732(int arg0) {
        int var2 = this.field1720;
        this.field1720 = arg0;
        return var2;
    }
}
