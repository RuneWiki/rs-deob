import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class205 extends class45 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "Lv;")
    private class165 field2871 = new class165();

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "Lv;")
    private class165 field2884 = new class165();

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "Z")
    private boolean field2887;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "Ljn;")
    public static class134 field2874 = new class134(84, -1);

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    private int field2858;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    private int field2863;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    private int field2882;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    private int field2883;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "Lrja;")
    public static class45 field2881;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field2886;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "[Lws;")
    public static class555[] field2880;

    @OriginalMember(owner = "client!gp", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2865++;
        int var2 = this.method1312(4, arg0);
        if ((this.field2882 & var2) == 0) {
            var2 = this.field2882;
        }
        if ((var2 & 0x1) != 0) {
            this.method1313(arg0.getY(), arg0.getClickCount(), arg0.getX(), 3, 2);
        }
        if ((var2 & 0x4) != 0) {
            this.method1313(arg0.getY(), arg0.getClickCount(), arg0.getX(), 5, 2);
        }
        if ((var2 & 0x2) != 0) {
            this.method1313(arg0.getY(), arg0.getClickCount(), arg0.getX(), 4, 2);
        }
        this.field2882 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gp", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2861++;
        int var2 = this.method1312(4, arg0);
        if (var2 == 1) {
            this.method1313(arg0.getY(), arg0.getClickCount(), arg0.getX(), 0, 2);
        } else if (var2 == 4) {
            this.method1313(arg0.getY(), arg0.getClickCount(), arg0.getX(), 2, 2);
        } else if (var2 == 2) {
            this.method1313(arg0.getY(), arg0.getClickCount(), arg0.getX(), 1, 2);
        }
        this.field2882 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
    private final void method1311(int arg0, int arg1, int arg2) {
        this.field2885 = arg1;
        field2873++;
        this.field2883 = arg0;
        if (arg2 == 1 && this.field2887) {
            this.method1313(arg1, 0, arg0, -1, 2);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)Z")
    public final boolean method353(byte arg0) {
        field2856++;
        if (arg0 > -42) {
            field2881 = null;
        }
        return (this.field2876 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method1312(int arg0, MouseEvent arg1) {
        field2864++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (arg0 & var3) != 0;
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

    @OriginalMember(owner = "client!gp", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1311(arg0.getX(), arg0.getY(), 1);
        field2877++;
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)Lpea;")
    public final class620 method359(int arg0) {
        field2859++;
        return arg0 == 0 ? (class620) this.field2871.method1034(arg0 + 20791) : null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I")
    public final int method351(int arg0) {
        field2860++;
        return arg0 == -25269 ? this.field2858 : -90;
    }

    @OriginalMember(owner = "client!gp", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2869++;
        this.method1311(arg0.getX(), arg0.getY(), 1);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
    private final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2879++;
        class766 var6 = new class766();
        var6.field10543 = arg3;
        if (arg4 != 2) {
            return;
        }
        var6.field10539 = arg1;
        var6.field10542 = arg2;
        var6.field10547 = arg0;
        var6.field10544 = class683.method3903((byte) 4);
        this.field2884.method1039(var6, arg4 - 2);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method1314(Component arg0, int arg1) {
        this.method1315(-3);
        field2866++;
        this.field2886 = arg0;
        this.field2886.addMouseListener(this);
        if (arg1 != 30877) {
            this.method359(-29);
        }
        this.field2886.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)V")
    private final void method1315(int arg0) {
        field2870++;
        if (this.field2886 == null) {
            return;
        }
        this.field2886.removeMouseMotionListener(this);
        this.field2886.removeMouseListener(this);
        if (arg0 != -3) {
            return;
        }
        this.field2884 = null;
        this.field2871 = null;
        this.field2883 = this.field2885 = this.field2882 = 0;
        this.field2886 = null;
        this.field2863 = this.field2858 = this.field2876 = 0;
    }

    @OriginalMember(owner = "client!gp", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1311(arg0.getX(), arg0.getY(), 1);
        field2878++;
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "(B)V")
    public final synchronized void method360(byte arg0) {
        this.field2863 = this.field2883;
        field2857++;
        this.field2858 = this.field2885;
        this.field2876 = this.field2882;
        class165 var2 = this.field2871;
        this.field2871 = this.field2884;
        this.field2884 = var2;
        this.field2884.method1046((byte) 127);
        int var3 = 117 / ((arg0 - 8) / 34);
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)Z")
    public final boolean method358(byte arg0) {
        field2875++;
        if (arg0 != -70) {
            this.method358((byte) 60);
        }
        return (this.field2876 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!gp", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2867++;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
    public final void method357(int arg0) {
        if (arg0 != 0) {
            this.method1312(58, null);
        }
        this.method1315(-3);
        field2868++;
    }

    @OriginalMember(owner = "client!gp", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2862++;
        this.method1311(arg0.getX(), arg0.getY(), 1);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z")
    public final boolean method352(byte arg0) {
        if (arg0 > -34) {
            this.field2863 = -94;
        }
        field2872++;
        return (this.field2876 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "(B)V")
    public static void method1316(byte arg0) {
        if (arg0 != 110) {
            method1316((byte) -107);
        }
        field2880 = null;
        field2874 = null;
        field2881 = null;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(B)I")
    public final int method354(byte arg0) {
        if (arg0 != -20) {
            this.mouseDragged(null);
        }
        field2855++;
        return this.field2863;
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class205(Component arg0, boolean arg1) {
        this.method1314(arg0, 30877);
        this.field2887 = arg1;
    }
}
