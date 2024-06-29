import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class36 extends class258 implements MouseWheelListener {

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    private int field556 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public final synchronized int method265(int arg0) {
        int var2 = this.field556;
        if (arg0 >= -35) {
            return -93;
        } else {
            this.field556 = 0;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public final void method266(Component arg0, byte arg1) {
        arg0.addMouseWheelListener(this);
        int var3 = 45 % ((-arg1 - 76) / 35);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public final void method267(int arg0, Component arg1) {
        if (arg0 != 11198) {
            this.field556 = 53;
        }
        arg1.removeMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!kh", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V")
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field556 += arg0.getWheelRotation();
    }
}
