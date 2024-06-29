import java.awt.Component;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class754 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Ljava/awt/Robot;")
    private Robot field10498 = new Robot();

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field10499;

    @OriginalMember(owner = "client!f", name = "setcustomcursor", descriptor = "(Ljava/awt/Component;[IIILjava/awt/Point;)V", line = 7)
    public final void setcustomcursor(Component arg0, int[] arg1, int arg2, int arg3, Point arg4) {
        if (arg1 == null) {
            arg0.setCursor(null);
        } else {
            BufferedImage var6 = new BufferedImage(arg2, arg3, 2);
            var6.setRGB(0, 0, arg2, arg3, arg1, 0, arg2);
            arg0.setCursor(arg0.getToolkit().createCustomCursor(var6, arg4, null));
        }
    }

    @OriginalMember(owner = "client!f", name = "movemouse", descriptor = "(II)V", line = 23)
    public final void movemouse(int arg0, int arg1) {
        this.field10498.mouseMove(arg0, arg1);
    }

    @OriginalMember(owner = "client!f", name = "showcursor", descriptor = "(Ljava/awt/Component;Z)V", line = 30)
    public final void showcursor(Component arg0, boolean arg1) {
        if (arg1) {
            arg0 = null;
        } else if (arg0 == null) {
            throw new NullPointerException();
        }
        if (this.field10499 == arg0) {
            return;
        }
        if (this.field10499 != null) {
            this.field10499.setCursor(null);
            this.field10499 = null;
        }
        if (arg0 != null) {
            arg0.setCursor(arg0.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
            this.field10499 = arg0;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 60)
    public class754() throws Exception {
    }
}
