import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class479 extends class100 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Lbq;")
    private class289 field6836 = new class289();

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "Lbq;")
    private class289 field6858 = new class289();

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "Z")
    private boolean field6864;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "[I")
    public static int[] field6841 = new int[25];

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Lmk;")
    public static class54 field6847 = new class54();

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "Z")
    public static boolean field6857 = false;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    private int field6830;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    private int field6840;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    private int field6848;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    private int field6860;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    private int field6861;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    private int field6862;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field6863;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Z", line = 6)
    public final boolean method692(boolean arg0) {
        field6837++;
        if (arg0) {
            this.method2882((byte) 93, 21, -98, -97, -14);
        }
        return (this.field6840 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 25)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field6854++;
        this.method2879(arg0.getY(), arg0.getX(), (byte) 34);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 33)
    private final void method2878(int arg0, Component arg1) {
        field6834++;
        this.method2885(90);
        this.field6863 = arg1;
        if (arg0 == -1) {
            this.field6863.addMouseListener(this);
            this.field6863.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)Lu;", line = 53)
    public final class73 method695(boolean arg0) {
        field6855++;
        if (arg0) {
            this.method693((byte) 68);
        }
        return (class73) this.field6836.method1729(662);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V", line = 66)
    private final void method2879(int arg0, int arg1, byte arg2) {
        this.field6861 = arg0;
        if (arg2 < 5) {
            this.field6862 = 65;
        }
        this.field6860 = arg1;
        field6849++;
        if (this.field6864) {
            this.method2882((byte) 122, 0, arg0, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I", line = 84)
    public final int method694(byte arg0) {
        field6845++;
        int var2 = 123 / ((18 - arg0) / 62);
        return this.field6848;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V", line = 94)
    public final void method693(byte arg0) {
        field6850++;
        this.method2885(119);
        if (arg0 < 36) {
            field6847 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V", line = 106)
    public static final void method2880(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            method2880(50, -114, -127, -80, 21);
        }
        field6846++;
        int var5 = class494.field7003;
        int var6 = class14.field126;
        if (class397.field5443) {
            var5 += class389.method2400(78);
            var6 += class752.method4192(arg4 ^ 0x1);
        }
        if (class59.field614 == 1) {
            class131 var7 = class568.field8080[class508.field7233 / 100];
            var7.method824(var5 - 8, var6 + -8);
            class16.method75(var6 - 8, (byte) 16, var7.method510() + var6 - 8, var5 + -8, var7.method501() + var5 - 8);
        }
        if (class59.field614 == 2) {
            class131 var8 = class568.field8080[class508.field7233 / 100 + 4];
            var8.method824(var5 - 8, var6 + -8);
            class16.method75(var6 - 8, (byte) 105, var6 + var8.method510() - 8, var5 + -8, var8.method501() + (var5 - 8));
        }
        class411.method2521(-106);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V", line = 146)
    public final synchronized void method701(int arg0) {
        if (arg0 != 6971) {
            return;
        }
        this.field6840 = this.field6862;
        this.field6830 = this.field6861;
        field6844++;
        this.field6848 = this.field6860;
        class289 var2 = this.field6836;
        this.field6836 = this.field6858;
        this.field6858 = var2;
        this.field6858.method1728(29632);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V", line = 168)
    public static void method2881(int arg0) {
        field6841 = null;
        if (arg0 != 17369) {
            method2881(39);
        }
        field6847 = null;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)Z", line = 180)
    public final boolean method698(boolean arg0) {
        if (arg0) {
            field6829++;
            return (this.field6840 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 191)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field6831++;
        this.method2879(arg0.getY(), arg0.getX(), (byte) 37);
    }

    @OriginalMember(owner = "client!bi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 199)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2879(arg0.getY(), arg0.getX(), (byte) 113);
        field6833++;
    }

    @OriginalMember(owner = "client!bi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 207)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field6859++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIIII)V", line = 217)
    private final void method2882(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6851++;
        class267 var6 = new class267();
        var6.field3312 = arg3;
        var6.field3311 = arg4;
        var6.field3315 = arg2;
        var6.field3317 = arg1;
        if (arg0 < 113) {
            this.mouseMoved(null);
        }
        var6.field3325 = class652.method3700(-1);
        this.field6858.method1721((byte) -105, var6);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 235)
    private final int method2883(int arg0, MouseEvent arg1) {
        field6839++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (arg0 <= 39) {
            this.method2885(-9);
        }
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

    @OriginalMember(owner = "client!bi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 273)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2879(arg0.getY(), arg0.getX(), (byte) 32);
        field6838++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V", line = 287)
    public static final void method2884(int arg0, boolean arg1) {
        if (arg0 != -1) {
            field6841 = null;
        }
        field6843++;
        if (arg1) {
            if (class327.field4245 != -1) {
                class451.method2777(class327.field4245, (byte) 111);
            }
            for (class424 var2 = (class424) class153.field1688.method1753(0); var2 != null; var2 = (class424) class153.field1688.method1755(arg0 ^ 0x63)) {
                if (!var2.method863(arg0 + 67)) {
                    var2 = (class424) class153.field1688.method1753(~arg0);
                    if (var2 == null) {
                        break;
                    }
                }
                class441.method2749(0, true, var2, false);
            }
            class327.field4245 = -1;
            class153.field1688 = new class295(8);
            class507.method3009(true);
            class327.field4245 = class633.field9105;
            class296.method1762(arg0 ^ 0xFFFFFF95, false);
            class486.method2933(true);
            class133.method852(class327.field4245);
        }
        class329.field4261 = true;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V", line = 334)
    private final void method2885(int arg0) {
        field6832++;
        if (this.field6863 == null) {
            return;
        }
        if (arg0 <= 82) {
            this.mouseClicked(null);
        }
        this.field6863.removeMouseMotionListener(this);
        this.field6863.removeMouseListener(this);
        this.field6863 = null;
        this.field6858 = null;
        this.field6836 = null;
        this.field6860 = this.field6861 = this.field6862 = 0;
        this.field6848 = this.field6830 = this.field6840 = 0;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)Z", line = 358)
    public final boolean method699(byte arg0) {
        field6856++;
        if (arg0 < 116) {
            this.mouseClicked(null);
        }
        return (this.field6840 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I", line = 371)
    public final int method691(byte arg0) {
        if (arg0 > -100) {
            return 99;
        } else {
            field6852++;
            return this.field6830;
        }
    }

    @OriginalMember(owner = "client!bi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 382)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6853++;
        int var2 = this.method2883(127, arg0);
        if (var2 == 1) {
            this.method2882((byte) 127, arg0.getClickCount(), arg0.getY(), arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method2882((byte) 120, arg0.getClickCount(), arg0.getY(), arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method2882((byte) 125, arg0.getClickCount(), arg0.getY(), arg0.getX(), 1);
        }
        this.field6862 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 412)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6835++;
        int var2 = this.method2883(98, arg0);
        if ((var2 & this.field6862) == 0) {
            var2 = this.field6862;
        }
        if ((var2 & 0x1) != 0) {
            this.method2882((byte) 118, arg0.getClickCount(), arg0.getY(), arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2882((byte) 114, arg0.getClickCount(), arg0.getY(), arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2882((byte) 123, arg0.getClickCount(), arg0.getY(), arg0.getX(), 4);
        }
        this.field6862 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 458)
    public class479(Component arg0, boolean arg1) {
        this.method2878(-1, arg0);
        this.field6864 = arg1;
    }
}
