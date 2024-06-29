import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class583 extends class239 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!pda", name = "y", descriptor = "Lgca;")
    private class227 field8218 = new class227();

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "Lgca;")
    private class227 field8228 = new class227();

    @OriginalMember(owner = "client!pda", name = "K", descriptor = "Z")
    private boolean field8230;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "Z")
    public static boolean field8209 = true;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "Llh;")
    public static class487 field8211 = new class487(66, 2);

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field8201;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
    private int field8214;

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
    public static int field8219;

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    public static int field8220;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "I")
    public static int field8221;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
    private int field8222;

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
    public static int field8224;

    @OriginalMember(owner = "client!pda", name = "F", descriptor = "I")
    private int field8225;

    @OriginalMember(owner = "client!pda", name = "G", descriptor = "I")
    private int field8226;

    @OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
    private int field8227;

    @OriginalMember(owner = "client!pda", name = "J", descriptor = "I")
    private int field8229;

    @OriginalMember(owner = "client!pda", name = "L", descriptor = "Ljava/awt/Component;")
    private Component field8231;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "(I)Z", line = 4)
    public final boolean method1501(int arg0) {
        if (arg0 <= 117) {
            return true;
        } else {
            field8207++;
            return (this.field8225 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "(B)V", line = 15)
    public static void method3323(byte arg0) {
        field8211 = null;
        int var1 = 99 % ((arg0 - 20) / 61);
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)Z", line = 25)
    public final boolean method1490(int arg0) {
        field8206++;
        if (arg0 != -3) {
            this.field8225 = 23;
        }
        return (this.field8225 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIII)V", line = 36)
    private final void method3324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8212++;
        class584 var6 = new class584();
        var6.field8236 = arg0;
        var6.field8243 = arg3;
        var6.field8237 = arg4;
        var6.field8240 = arg1;
        var6.field8239 = class577.method3295((byte) 15);
        this.field8228.method1441(var6, arg2);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)I", line = 54)
    public final int method1491(byte arg0) {
        field8201++;
        if (arg0 < 101) {
            this.mouseClicked(null);
        }
        return this.field8214;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V", line = 70)
    public final void method1489(int arg0) {
        this.method3326(-120);
        if (arg0 != 2) {
            this.field8227 = 44;
        }
        field8215++;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(B)Lbs;", line = 90)
    public final class639 method1492(byte arg0) {
        if (arg0 == -85) {
            field8200++;
            return (class639) this.field8218.method1442(-10011);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 102)
    private final int method3325(MouseEvent arg0, int arg1) {
        if (arg1 <= 104) {
            this.field8230 = true;
        }
        field8208++;
        int var3 = arg0.getModifiers();
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

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)I", line = 145)
    public final int method1499(int arg0) {
        field8205++;
        if (arg0 != 8) {
            this.field8225 = 24;
        }
        return this.field8222;
    }

    @OriginalMember(owner = "client!pda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method3328(arg0.getY(), -72, arg0.getX());
        field8203++;
    }

    @OriginalMember(owner = "client!pda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 166)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field8219++;
        this.method3328(arg0.getY(), -99, arg0.getX());
    }

    @OriginalMember(owner = "client!pda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 175)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field8220++;
        this.method3328(arg0.getY(), 54, arg0.getX());
    }

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "(I)V", line = 183)
    private final void method3326(int arg0) {
        field8217++;
        if (this.field8231 == null) {
            return;
        }
        this.field8231.removeMouseMotionListener(this);
        this.field8231.removeMouseListener(this);
        this.field8228 = null;
        if (arg0 < -119) {
            this.field8222 = this.field8214 = this.field8225 = 0;
            this.field8218 = null;
            this.field8231 = null;
            this.field8229 = this.field8227 = this.field8226 = 0;
        }
    }

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "(B)V", line = 206)
    public final synchronized void method1494(byte arg0) {
        this.field8214 = this.field8227;
        if (arg0 != -29) {
            this.field8218 = null;
        }
        field8213++;
        this.field8222 = this.field8229;
        this.field8225 = this.field8226;
        class227 var2 = this.field8218;
        this.field8218 = this.field8228;
        this.field8228 = var2;
        this.field8228.method1444(-27547);
    }

    @OriginalMember(owner = "client!pda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 228)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field8216++;
        int var2 = this.method3325(arg0, 127);
        if ((var2 & this.field8226) == 0) {
            var2 = this.field8226;
        }
        if ((var2 & 0x1) != 0) {
            this.method3324(arg0.getX(), 3, 0, arg0.getY(), arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method3324(arg0.getX(), 5, 0, arg0.getY(), arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method3324(arg0.getX(), 4, 0, arg0.getY(), arg0.getClickCount());
        }
        this.field8226 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 259)
    private final void method3327(Component arg0, int arg1) {
        this.method3326(-125);
        field8204++;
        if (arg1 >= -101) {
            this.method3327(null, 47);
        }
        this.field8231 = arg0;
        this.field8231.addMouseListener(this);
        this.field8231.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!pda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 273)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3328(arg0.getY(), 94, arg0.getX());
        field8210++;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V", line = 283)
    private final void method3328(int arg0, int arg1, int arg2) {
        field8221++;
        int var4 = -126 % ((-arg1 - 5) / 44);
        this.field8229 = arg2;
        this.field8227 = arg0;
        if (this.field8230) {
            this.method3324(arg2, -1, 0, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 300)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field8202++;
        int var2 = this.method3325(arg0, 118);
        if (var2 == 1) {
            this.method3324(arg0.getX(), 0, 0, arg0.getY(), arg0.getClickCount());
        } else if (var2 == 4) {
            this.method3324(arg0.getX(), 2, 0, arg0.getY(), arg0.getClickCount());
        } else if (var2 == 2) {
            this.method3324(arg0.getX(), 1, 0, arg0.getY(), arg0.getClickCount());
        }
        this.field8226 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "(B)Z", line = 324)
    public final boolean method1496(byte arg0) {
        field8224++;
        int var2 = -33 / ((arg0 + 73) / 35);
        return (this.field8225 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!pda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 336)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field8223++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 361)
    public class583(Component arg0, boolean arg1) {
        this.method3327(arg0, -118);
        this.field8230 = arg1;
    }
}
