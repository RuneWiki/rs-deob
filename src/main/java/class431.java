import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class431 extends class215 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "Lnv;")
    private class44 field6395 = new class44();

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "Lnv;")
    private class44 field6412 = new class44();

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "Z")
    private boolean field6413;

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "Z")
    public static boolean field6390 = false;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Z")
    public static boolean field6386 = false;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "F")
    public static float field6389;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    private int field6385;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    private int field6396;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "I")
    private int field6402;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    private int field6409;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    private int field6410;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    private int field6411;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field6414;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "(I)V", line = 3)
    private final void method2681(int arg0) {
        field6398++;
        if (this.field6414 == null) {
            return;
        }
        this.field6414.removeMouseMotionListener(this);
        if (arg0 <= 32) {
            return;
        }
        this.field6414.removeMouseListener(this);
        this.field6385 = this.field6396 = this.field6402 = 0;
        this.field6414 = null;
        this.field6412 = null;
        this.field6410 = this.field6409 = this.field6411 = 0;
        this.field6395 = null;
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)Z", line = 26)
    public final boolean method1480(int arg0) {
        if (arg0 > -16) {
            this.mouseClicked(null);
        }
        field6400++;
        return (this.field6402 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 38)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6394++;
        int var2 = this.method2682(arg0, 1);
        if (var2 == 1) {
            this.method2685(0, arg0.getY(), arg0.getX(), (byte) 19);
        } else if (var2 == 4) {
            this.method2685(2, arg0.getY(), arg0.getX(), (byte) 66);
        } else if (var2 == 2) {
            this.method2685(1, arg0.getY(), arg0.getX(), (byte) 66);
        }
        this.field6411 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 62)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field6383++;
        this.method2683((byte) -81, arg0);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Lbq;", line = 70)
    public final class345 method1473(int arg0) {
        field6408++;
        if (arg0 != -23330) {
            this.field6402 = 60;
        }
        return (class345) this.field6395.method298(arg0 ^ 0x5B08);
    }

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)V", line = 83)
    public final void method1481(int arg0) {
        if (arg0 != -10462) {
            this.mouseDragged(null);
        }
        field6407++;
        this.method2681(arg0 + 10531);
    }

    @OriginalMember(owner = "client!eo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 94)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6388++;
        int var2 = this.method2682(arg0, 1);
        if ((this.field6411 & var2) == 0) {
            var2 = this.field6411;
        }
        if ((var2 & 0x1) != 0) {
            this.method2685(3, arg0.getY(), arg0.getX(), (byte) 126);
        }
        if ((var2 & 0x4) != 0) {
            this.method2685(5, arg0.getY(), arg0.getX(), (byte) 64);
        }
        if ((var2 & 0x2) != 0) {
            this.method2685(4, arg0.getY(), arg0.getX(), (byte) 58);
        }
        this.field6411 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I", line = 123)
    public final int method1475(byte arg0) {
        int var2 = 62 / ((arg0 + 56) / 51);
        field6399++;
        return this.field6385;
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Z", line = 137)
    public final boolean method1479(int arg0) {
        if (arg0 == 0) {
            field6384++;
            return (this.field6402 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 150)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field6409 = -1;
        this.field6410 = -1;
        field6382++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 162)
    private final int method2682(MouseEvent arg0, int arg1) {
        field6401++;
        int var3 = arg0.getModifiers();
        if (arg1 != 1) {
            return 63;
        }
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
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

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V", line = 204)
    private final void method2683(byte arg0, MouseEvent arg1) {
        this.field6410 = arg1.getX();
        field6405++;
        this.field6409 = arg1.getY();
        if (this.field6413) {
            this.method2685(-1, arg1.getY(), arg1.getX(), (byte) 16);
        }
        int var3 = -87 / ((27 - arg0) / 58);
    }

    @OriginalMember(owner = "client!eo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 229)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field6397++;
        this.method2683((byte) 111, arg0);
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V", line = 237)
    public final synchronized void method1483(byte arg0) {
        field6391++;
        this.field6385 = this.field6410;
        this.field6396 = this.field6409;
        this.field6402 = this.field6411;
        class44 var2 = this.field6395;
        this.field6395 = this.field6412;
        this.field6412 = var2;
        if (arg0 >= -1) {
            field6386 = true;
        }
        this.field6412.method291(false);
    }

    @OriginalMember(owner = "client!eo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 265)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6404++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "(I)Z", line = 277)
    public final boolean method1485(int arg0) {
        field6393++;
        if (arg0 >= -118) {
            this.field6395 = null;
        }
        return (this.field6402 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 288)
    private final void method2684(Component arg0, int arg1) {
        if (arg1 <= 110) {
            this.method2681(0);
        }
        this.method2681(74);
        field6403++;
        this.field6414 = arg0;
        this.field6414.addMouseListener(this);
        this.field6414.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIB)V", line = 305)
    private final void method2685(int arg0, int arg1, int arg2, byte arg3) {
        field6387++;
        class283 var5 = new class283();
        var5.field4410 = arg2;
        var5.field4416 = arg1;
        var5.field4420 = arg0;
        var5.field4418 = class375.method2397((byte) -75);
        if (arg3 >= 12) {
            this.field6412.method292((byte) 121, var5);
        }
    }

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "(I)I", line = 323)
    public final int method1484(int arg0) {
        if (arg0 != -22647) {
            this.field6385 = 71;
        }
        field6392++;
        return this.field6396;
    }

    @OriginalMember(owner = "client!eo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 337)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field6406++;
        this.method2683((byte) -82, arg0);
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 357)
    public class431(Component arg0, boolean arg1) {
        this.method2684(arg0, 112);
        this.field6413 = arg1;
    }
}
