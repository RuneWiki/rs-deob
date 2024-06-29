import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class332 extends class235 implements MouseWheelListener {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    private int field5175 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 4)
    public final void method1703(int arg0, Component arg1) {
        arg1.addMouseWheelListener(this);
        if (arg0 != 1000) {
            this.field5175 = 34;
        }
    }

    @OriginalMember(owner = "client!qe", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 14)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field5175 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I", line = 22)
    public final synchronized int method1700(int arg0) {
        int var2 = this.field5175;
        if (arg0 >= -35) {
            return -26;
        } else {
            this.field5175 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 34)
    public final void method1701(byte arg0, Component arg1) {
        if (arg0 > 28) {
            arg1.removeMouseWheelListener(this);
        }
    }
}
