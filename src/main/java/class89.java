import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class89 extends class222 implements MouseWheelListener {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private int field1794 = 0;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 4)
    public final void method810(Component arg0, int arg1) {
        arg0.addMouseWheelListener(this);
        int var3 = 85 % ((arg1 + 15) / 37);
    }

    @OriginalMember(owner = "client!kc", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 13)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field1794 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 21)
    public final void method811(Component arg0, byte arg1) {
        arg0.removeMouseWheelListener(this);
        if (arg1 >= -117) {
            this.field1794 = 36;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I", line = 34)
    public final synchronized int method812(int arg0) {
        if (arg0 != 19706) {
            this.method811(null, (byte) -114);
        }
        int var2 = this.field1794;
        this.field1794 = 0;
        return var2;
    }
}
