import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class38 extends class383 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Lau;")
    private class692 field515 = new class692();

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Lau;")
    private class692 field525 = new class692();

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "Z")
    private boolean field527;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field510 = -1;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "J")
    public static long field499;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field526;

    @OriginalMember(owner = "client!sc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field508++;
        int var2 = this.method318((byte) -120, arg0);
        if ((this.field524 & var2) == 0) {
            var2 = this.field524;
        }
        if ((var2 & 0x1) != 0) {
            this.method311(arg0.getY(), arg0.getX(), arg0.getClickCount(), 3, 0);
        }
        if ((var2 & 0x4) != 0) {
            this.method311(arg0.getY(), arg0.getX(), arg0.getClickCount(), 5, 0);
        }
        if ((var2 & 0x2) != 0) {
            this.method311(arg0.getY(), arg0.getX(), arg0.getClickCount(), 4, 0);
        }
        this.field524 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field494++;
        this.method319((byte) 127, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!sc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method319((byte) 126, arg0.getX(), arg0.getY());
        field496++;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)Z")
    public final boolean method309(byte arg0) {
        field500++;
        if (arg0 <= 20) {
            return true;
        } else {
            return (this.field504 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)I")
    public final int method310(boolean arg0) {
        if (arg0) {
            return -80;
        } else {
            field512++;
            return this.field503;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    private final void method311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field518++;
        class41 var6 = new class41();
        var6.field559 = arg0;
        var6.field557 = arg1;
        var6.field545 = arg3;
        var6.field551 = arg2;
        var6.field553 = class254.method1619(true);
        this.field525.method3904(var6, arg4);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public final synchronized void method312(int arg0) {
        this.field504 = this.field524;
        this.field503 = this.field521;
        field507++;
        this.field495 = this.field522;
        class692 var2 = this.field515;
        this.field515 = this.field525;
        this.field525 = var2;
        if (arg0 == 0) {
            this.field525.method3896(3);
        }
    }

    @OriginalMember(owner = "client!sc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field514++;
        int var2 = this.method318((byte) -121, arg0);
        if (var2 == 1) {
            this.method311(arg0.getY(), arg0.getX(), arg0.getClickCount(), 0, 0);
        } else if (var2 == 4) {
            this.method311(arg0.getY(), arg0.getX(), arg0.getClickCount(), 2, 0);
        } else if (var2 == 2) {
            this.method311(arg0.getY(), arg0.getX(), arg0.getClickCount(), 1, 0);
        }
        this.field524 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field497++;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lrl;")
    public final class634 method313(byte arg0) {
        if (arg0 != -73) {
            this.method311(-41, 29, -87, 3, -44);
        }
        field502++;
        return (class634) this.field515.method3906(0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method314(byte arg0) {
        if (arg0 < 59) {
            this.method312(-104);
        }
        this.method323(0);
        field506++;
    }

    @OriginalMember(owner = "client!sc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field517++;
        this.method319((byte) 126, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)[Llfa;")
    public static final class313[] method315(int arg0) {
        if (arg0 >= -37) {
            return null;
        } else {
            field523++;
            return new class313[] { class561.field8183, class561.field8186, class561.field8187, class561.field8188, class561.field8189, class561.field8190, class561.field8191, class561.field8192, class561.field8193, class561.field8194, class561.field8195, class561.field8196, class561.field8197, class561.field8198 };
        }
    }

    @OriginalMember(owner = "client!sc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field505++;
        this.method319((byte) 126, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Z")
    public final boolean method316(int arg0) {
        if (arg0 != 26007) {
            this.field527 = false;
        }
        field513++;
        return (this.field504 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method317(byte arg0, Component arg1) {
        if (arg0 != 80) {
            return;
        }
        field520++;
        this.method323(arg0 - 80);
        this.field526 = arg1;
        this.field526.addMouseListener(this);
        this.field526.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I")
    private final int method318(byte arg0, MouseEvent arg1) {
        field509++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        if (arg0 >= -111) {
            method315(5);
        }
        boolean var6 = (var3 & 0x4) != 0;
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

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)V")
    private final void method319(byte arg0, int arg1, int arg2) {
        this.field521 = arg1;
        if (arg0 <= 125) {
            this.method322(-6);
        }
        field511++;
        this.field522 = arg2;
        if (this.field527) {
            this.method311(arg2, arg1, 0, -1, 0);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;BLjava/io/File;)V")
    public static final void method320(String arg0, byte arg1, File arg2) {
        if (arg1 != -5) {
            method315(95);
        }
        class31.field456.put(arg0, arg2);
        field498++;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
    public final int method321(int arg0) {
        if (arg0 < 105) {
            return 121;
        } else {
            field519++;
            return this.field495;
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Z")
    public final boolean method322(int arg0) {
        field501++;
        if (arg0 != 32) {
            this.method313((byte) -115);
        }
        return (this.field504 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)V")
    private final void method323(int arg0) {
        field516++;
        if (this.field526 == null) {
            return;
        }
        this.field526.removeMouseMotionListener(this);
        this.field526.removeMouseListener(this);
        this.field521 = this.field522 = this.field524 = 0;
        this.field515 = null;
        this.field526 = null;
        this.field525 = null;
        this.field503 = this.field495 = this.field504 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class38(Component arg0, boolean arg1) {
        this.method317((byte) 80, arg0);
        this.field527 = arg1;
    }
}
