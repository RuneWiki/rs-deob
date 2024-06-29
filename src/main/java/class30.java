import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 extends class330 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lui;")
    private class193 field205 = new class193();

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "Lui;")
    private class193 field231 = new class193();

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "Z")
    private boolean field234;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "[S")
    public static short[] field224 = new short[256];

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "Ljava/awt/Component;")
    private Component field233;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V", line = 3)
    public static void method165(int arg0) {
        field224 = null;
        if (arg0 != 0) {
            field224 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 15)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method172((byte) 102, arg0.getX(), arg0.getY());
        field214++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)Z", line = 23)
    public final boolean method166(boolean arg0) {
        if (arg0) {
            this.method174(-90);
        }
        field204++;
        return (this.field217 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 34)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method172((byte) 120, arg0.getX(), arg0.getY());
        field229++;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I", line = 43)
    public final int method167(int arg0) {
        if (arg0 != 64) {
            this.method177(-63, true, -14, -62);
        }
        field232++;
        return this.field211;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V", line = 59)
    public final synchronized void method168(byte arg0) {
        this.field210 = this.field218;
        if (arg0 >= -11) {
            this.field210 = 13;
        }
        this.field217 = this.field226;
        this.field211 = this.field222;
        field213++;
        class193 var2 = this.field205;
        this.field205 = this.field231;
        this.field231 = var2;
        this.field231.method1048(-7730);
    }

    @OriginalMember(owner = "client!rk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 81)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field209++;
        this.method172((byte) 127, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)I", line = 90)
    public final int method169(int arg0) {
        field207++;
        int var2 = 4 / ((arg0 + 29) / 45);
        return this.field210;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 100)
    private final void method170(Component arg0, int arg1) {
        if (arg1 >= -48) {
            this.field222 = 122;
        }
        this.method171((byte) 114);
        field216++;
        this.field233 = arg0;
        this.field233.addMouseListener(this);
        this.field233.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(B)V", line = 115)
    private final void method171(byte arg0) {
        field212++;
        if (this.field233 == null) {
            return;
        }
        this.field233.removeMouseMotionListener(this);
        this.field233.removeMouseListener(this);
        this.field211 = this.field210 = this.field217 = 0;
        if (arg0 != 114) {
            this.field211 = 82;
        }
        this.field231 = null;
        this.field222 = this.field218 = this.field226 = 0;
        this.field233 = null;
        this.field205 = null;
    }

    @OriginalMember(owner = "client!rk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method172((byte) 91, arg0.getX(), arg0.getY());
        field215++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V", line = 148)
    private final void method172(byte arg0, int arg1, int arg2) {
        this.field222 = arg1;
        this.field218 = arg2;
        field227++;
        if (this.field234) {
            this.method177(-1, false, arg2, arg1);
        }
        if (arg0 < 83) {
            this.method176(-114);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 352)
    public class30(Component arg0, boolean arg1) {
        this.method170(arg0, -70);
        this.field234 = arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 175)
    private final int method173(MouseEvent arg0, int arg1) {
        field221++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (arg1 & var3) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 208)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field206++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 222)
    public final void method174(int arg0) {
        this.method171((byte) 114);
        field220++;
        if (arg0 >= -98) {
            this.method171((byte) -64);
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Z", line = 233)
    public final boolean method175(int arg0) {
        if (arg0 != 20) {
            this.mouseExited(null);
        }
        field230++;
        return (this.field217 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 246)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field223++;
        int var2 = this.method173(arg0, 4);
        if ((this.field226 & var2) == 0) {
            var2 = this.field226;
        }
        if ((var2 & 0x1) != 0) {
            this.method177(3, false, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method177(5, false, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method177(4, false, arg0.getY(), arg0.getX());
        }
        this.field226 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)Z", line = 273)
    public final boolean method176(int arg0) {
        if (arg0 > -57) {
            return false;
        } else {
            field225++;
            return (this.field217 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZII)V", line = 293)
    private final void method177(int arg0, boolean arg1, int arg2, int arg3) {
        field228++;
        class119 var5 = new class119();
        var5.field1499 = arg3;
        var5.field1492 = arg2;
        var5.field1494 = arg0;
        var5.field1500 = class190.method1030(arg1);
        this.field231.method1040(var5, -114);
    }

    @OriginalMember(owner = "client!rk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 310)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field208++;
        int var2 = this.method173(arg0, 4);
        if (var2 == 1) {
            this.method177(0, false, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method177(2, false, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method177(1, false, arg0.getY(), arg0.getX());
        }
        this.field226 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)Luf;", line = 335)
    public final class379 method178(byte arg0) {
        if (arg0 < 2) {
            this.mouseMoved(null);
        }
        field219++;
        return (class379) this.field205.method1054((byte) -105);
    }
}
