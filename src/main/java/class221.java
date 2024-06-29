import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class221 extends class390 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "Loe;")
    private class183 field2875 = new class183();

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "Loe;")
    private class183 field2884 = new class183();

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "Z")
    private boolean field2885;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2855 = 0;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field2866 = 100;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "[F")
    public static float[] field2880 = new float[4];

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    private int field2854;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    private int field2871;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    private int field2879;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    private int field2882;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    private int field2883;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lfp;")
    public static class295 field2851;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "Ljava/awt/Component;")
    private Component field2886;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V", line = 4)
    public static void method1336(int arg0) {
        if (arg0 != -16715) {
            method1336(-107);
        }
        field2880 = null;
        field2851 = null;
    }

    @OriginalMember(owner = "client!ig", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 15)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1345((byte) 71, arg0.getX(), arg0.getY());
        field2862++;
    }

    @OriginalMember(owner = "client!ig", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2853++;
        this.method1345((byte) 104, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)V", line = 31)
    public static final void method1337(int arg0) {
        if (arg0 != 4) {
            field2851 = null;
        }
        field2874++;
        class333.field4435 = true;
    }

    @OriginalMember(owner = "client!ig", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 42)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2859++;
        int var2 = this.method1346(arg0, (byte) 23);
        if ((this.field2881 & var2) == 0) {
            var2 = this.field2881;
        }
        if ((var2 & 0x1) != 0) {
            this.method1342(arg0.getX(), 3, arg0.getY(), arg0.getClickCount(), -33);
        }
        if ((var2 & 0x4) != 0) {
            this.method1342(arg0.getX(), 5, arg0.getY(), arg0.getClickCount(), -59);
        }
        if ((var2 & 0x2) != 0) {
            this.method1342(arg0.getX(), 4, arg0.getY(), arg0.getClickCount(), -77);
        }
        this.field2881 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I", line = 73)
    public final int method1338(int arg0) {
        field2867++;
        if (arg0 != 1) {
            field2860 = 39;
        }
        return this.field2879;
    }

    @OriginalMember(owner = "client!ig", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 84)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1345((byte) 124, arg0.getX(), arg0.getY());
        field2863++;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 96)
    public final void method1339(int arg0) {
        if (arg0 == 1) {
            field2872++;
            this.method1341(100);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V", line = 109)
    public final synchronized void method1340(boolean arg0) {
        this.field2879 = this.field2882;
        field2868++;
        this.field2854 = this.field2883;
        this.field2871 = this.field2881;
        class183 var2 = this.field2875;
        this.field2875 = this.field2884;
        this.field2884 = var2;
        if (arg0) {
            this.method1349(106);
        }
        this.field2884.method1131((byte) -128);
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)V", line = 131)
    private final void method1341(int arg0) {
        field2864++;
        if (this.field2886 == null) {
            return;
        }
        this.field2886.removeMouseMotionListener(this);
        this.field2886.removeMouseListener(this);
        this.field2875 = null;
        this.field2886 = null;
        this.field2884 = null;
        this.field2883 = this.field2882 = this.field2881 = 0;
        if (arg0 > 81) {
            this.field2854 = this.field2879 = this.field2871 = 0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V", line = 156)
    private final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 > -26) {
            this.method1348(null, (byte) 57);
        }
        field2878++;
        class614 var6 = new class614();
        var6.field8835 = arg2;
        var6.field8832 = arg1;
        var6.field8840 = arg0;
        var6.field8837 = arg3;
        var6.field8843 = class301.method1787((byte) -98);
        this.field2884.method1129(var6, 262144);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)Z", line = 174)
    public final boolean method1343(int arg0) {
        field2852++;
        if (arg0 != 0) {
            this.field2881 = -89;
        }
        return (this.field2871 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Z", line = 185)
    public final boolean method1344(int arg0) {
        field2857++;
        if (arg0 < 33) {
            this.field2886 = null;
        }
        return (this.field2871 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)V", line = 198)
    private final void method1345(byte arg0, int arg1, int arg2) {
        this.field2883 = arg1;
        if (arg0 < 38) {
            this.field2885 = true;
        }
        this.field2882 = arg2;
        field2856++;
        if (this.field2885) {
            this.method1342(arg1, -1, arg2, 0, -88);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 222)
    private final int method1346(MouseEvent arg0, byte arg1) {
        field2876++;
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
        } else {
            int var7 = 89 % ((arg1 + 19) / 33);
            if (var5) {
                return 2;
            } else if (var6) {
                return 4;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z", line = 258)
    public final boolean method1347(byte arg0) {
        int var2 = 69 % ((arg0 - 4) / 58);
        field2865++;
        return (this.field2871 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 273)
    private final void method1348(Component arg0, byte arg1) {
        this.method1341(84);
        field2873++;
        this.field2886 = arg0;
        if (arg1 > 99) {
            this.field2886.addMouseListener(this);
            this.field2886.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I", line = 289)
    public final int method1349(int arg0) {
        field2861++;
        int var2 = 104 % ((arg0 + 53) / 55);
        return this.field2854;
    }

    @OriginalMember(owner = "client!ig", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 299)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field2877++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ig", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 313)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2869++;
        this.method1345((byte) 98, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!ig", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 321)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2858++;
        int var2 = this.method1346(arg0, (byte) 45);
        if (var2 == 1) {
            this.method1342(arg0.getX(), 0, arg0.getY(), arg0.getClickCount(), -68);
        } else if (var2 == 4) {
            this.method1342(arg0.getX(), 2, arg0.getY(), arg0.getClickCount(), -77);
        } else if (var2 == 2) {
            this.method1342(arg0.getX(), 1, arg0.getY(), arg0.getClickCount(), -105);
        }
        this.field2881 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Lek;", line = 353)
    public final class471 method1350(int arg0) {
        int var2 = -26 % ((74 - arg0) / 46);
        field2870++;
        return (class471) this.field2875.method1137(-1);
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 379)
    public class221(Component arg0, boolean arg1) {
        this.method1348(arg0, (byte) 113);
        this.field2885 = arg1;
    }
}
