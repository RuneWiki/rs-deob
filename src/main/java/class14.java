import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class14 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "[[B")
    public static byte[][] field189 = new byte[50][];

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Lk;")
    public static class21 field191 = method92((byte) 57, "Altar");

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "I")
    public static volatile int field190 = 0;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field193;

    @OriginalMember(owner = "mapview!ga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class28.field341 != null) {
            class2.field73 = arg0.getX();
            class12.field180 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Lk;BLm;Lk;)Lba;", line = 24)
    public static final class4 method90(class21 arg0, byte arg1, class25 arg2, class21 arg3) {
        if (arg1 > -16) {
            return (class4) null;
        } else {
            int var4 = arg2.method163(arg3, 3346);
            int var5 = arg2.method166(0, arg0, var4);
            return class22.method149(var5, var4, arg2, 121);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)V", line = 38)
    public static void method91(byte arg0) {
        field193 = null;
        field189 = null;
        field191 = null;
        if (arg0 != 94) {
            field190 = -61;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 52)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class28.field341 != null) {
            class8.field142 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 74)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class28.field341 != null) {
            class2.field73 = arg0.getX();
            class12.field180 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 93)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class28.field341 != null) {
            class2.field73 = arg0.getX();
            class12.field180 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(BLjava/lang/String;)Lk;", line = 114)
    public static final class21 method92(byte arg0, String arg1) {
        if (arg0 != 57) {
            return (class21) null;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class21 var5 = new class21();
        var5.field259 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field259[var5.field256++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field259[var5.field256++] = (byte) var6;
            }
        }
        var5.method136(0);
        return var5.method133(arg0 + 29);
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 154)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class28.field341 != null) {
            class2.field73 = -1;
            class12.field180 = -1;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 186)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class28.field341 != null) {
            class6.field125 = arg0.getX();
            mapview.field40 = arg0.getY();
            if (arg0.isMetaDown()) {
                field190 = 2;
                class8.field142 = 2;
            } else {
                field190 = 1;
                class8.field142 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 230)
    public static final void method93(Component arg0, byte arg1) {
        if (arg1 > -123) {
            method92((byte) -81, null);
        }
        arg0.addMouseListener(class28.field341);
        arg0.addMouseMotionListener(class28.field341);
    }

    @OriginalMember(owner = "mapview!ga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 242)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
