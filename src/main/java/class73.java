import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class73 extends class66 implements MouseWheelListener {

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    private int field1007 = 0;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)I", line = 5)
    public final synchronized int method526(int arg0) {
        int var2 = this.field1007;
        this.field1007 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 14)
    public final void method524(Component arg0, int arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 != 64) {
            this.field1007 = -14;
        }
    }

    @OriginalMember(owner = "client!ei", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 25)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1007 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 32)
    public final void method522(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        if (arg1 < 94) {
            this.field1007 = -42;
        }
    }
}
