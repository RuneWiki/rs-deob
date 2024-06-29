import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class180 extends class269 implements MouseWheelListener {

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    private int field2862 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 5)
    public final void method1263(int arg0, Component arg1) {
        if (arg0 != 65280) {
            this.field2862 = -90;
        }
        arg1.addMouseWheelListener(this);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 15)
    public final void method1264(byte arg0, Component arg1) {
        arg1.removeMouseWheelListener(this);
        int var3 = -118 / ((arg0 - 18) / 44);
    }

    @OriginalMember(owner = "client!tk", name = "mouseWheelMoved", descriptor = "(Ljava/awt/event/MouseWheelEvent;)V", line = 24)
    public final synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
        this.field2862 += arg0.getWheelRotation();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I", line = 32)
    public final synchronized int method1265(byte arg0) {
        int var2 = this.field2862;
        if (arg0 > -108) {
            this.method1264((byte) 102, (Component) null);
        }
        this.field2862 = 0;
        return var2;
    }
}
