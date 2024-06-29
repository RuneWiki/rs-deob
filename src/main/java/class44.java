import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class44 extends class346 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lrh;")
    private class59 field564 = new class59();

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Lrh;")
    private class59 field592 = new class59();

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Z")
    private boolean field595;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[I")
    public static int[] field572 = new int[14];

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Lm;")
    public static class110 field571;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field594;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method258(int arg0) {
        if (arg0 != -7) {
            this.field563 = 89;
        }
        field561++;
        return (this.field569 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 17)
    private final void method259(Component arg0, int arg1) {
        if (arg1 != 4) {
            return;
        }
        this.method272((byte) 112);
        field566++;
        this.field594 = arg0;
        this.field594.addMouseListener(this);
        this.field594.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V", line = 31)
    public static void method260(int arg0) {
        field571 = null;
        if (arg0 > -18) {
            field572 = null;
        }
        field572 = null;
    }

    @OriginalMember(owner = "client!qg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 43)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field574++;
        this.method267(arg0.getX(), -29195, arg0.getY());
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(BI)V", line = 52)
    public static final void method261(byte arg0, int arg1) {
        field578++;
        class168.field2105 = 2;
        class644.field9129 = arg1;
        long var2 = 0L;
        if (arg0 != -29) {
            field571 = null;
        }
        if (class267.field3667 == null) {
            class689.method3818(35, 88);
        } else {
            class138 var4 = new class138(class326.method2093((byte) 8, class527.method2996(class267.field3667, (byte) -120)));
            long var5 = var4.method949(107);
            class12.field116 = var4.method949(113);
            class525.method2994(-1, class98.method538(var5, arg0 ^ -118), "", true);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 81)
    public final synchronized void method262(int arg0) {
        this.field569 = this.field591;
        field584++;
        this.field563 = this.field590;
        this.field585 = this.field593;
        class59 var2 = this.field564;
        this.field564 = this.field592;
        this.field592 = var2;
        this.field592.method365(-1);
        if (arg0 >= -124) {
            this.field594 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)V", line = 104)
    public static final void method263(int arg0) {
        field570++;
        if (arg0 != 30540) {
            return;
        }
        for (class121 var1 = (class121) class28.field278.method374((byte) 111); var1 != null; var1 = (class121) class28.field278.method372(-20740)) {
            class542 var2 = var1.field1563;
            if (var2.field7443) {
                var1.method175(30604);
                var2.method3060(0);
            } else if (class430.field5984 >= var2.field7428) {
                var2.method3056(class323.field4732, arg0 - 30426);
                if (var2.field7443) {
                    var1.method175(30604);
                } else {
                    class621.method3396(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V", line = 140)
    private final void method264(int arg0, int arg1, int arg2, int arg3) {
        field589++;
        if (arg1 != -1) {
            return;
        }
        class265 var5 = new class265();
        var5.field3633 = arg2;
        var5.field3644 = arg0;
        var5.field3642 = arg3;
        var5.field3646 = class669.method3713(0);
        this.field592.method378(var5, 31316);
    }

    @OriginalMember(owner = "client!qg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field577++;
        this.method267(arg0.getX(), -29195, arg0.getY());
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 174)
    private final int method265(byte arg0, MouseEvent arg1) {
        field582++;
        int var3 = arg1.getModifiers();
        int var4 = 16 % ((arg0 + 6) / 49);
        boolean var5 = (var3 & 0x10) != 0;
        boolean var6 = (var3 & 0x8) != 0;
        boolean var7 = (var3 & 0x4) != 0;
        if (var6 && (var5 || var7)) {
            var6 = false;
        }
        if (var5 && var7) {
            return 4;
        } else if (var5) {
            return 1;
        } else if (var6) {
            return 2;
        } else if (var7) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 207)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field580++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)Z", line = 222)
    public final boolean method266(int arg0) {
        field576++;
        if (arg0 > -22) {
            return false;
        } else {
            return (this.field569 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 233)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method267(arg0.getX(), -29195, arg0.getY());
        field562++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V", line = 242)
    private final void method267(int arg0, int arg1, int arg2) {
        if (arg1 != -29195) {
            this.mouseClicked(null);
        }
        this.field590 = arg2;
        this.field593 = arg0;
        field573++;
        if (this.field595) {
            this.method264(arg2, -1, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)I", line = 260)
    public final int method268(byte arg0) {
        field586++;
        if (arg0 >= -79) {
            this.method265((byte) 97, null);
        }
        return this.field585;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)I", line = 272)
    public final int method269(byte arg0) {
        field568++;
        if (arg0 != -25) {
            this.field590 = 109;
        }
        return this.field563;
    }

    @OriginalMember(owner = "client!qg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 287)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field587++;
        int var2 = this.method265((byte) 72, arg0);
        if ((var2 & this.field591) == 0) {
            var2 = this.field591;
        }
        if ((var2 & 0x1) != 0) {
            this.method264(arg0.getY(), -1, arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method264(arg0.getY(), -1, arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method264(arg0.getY(), -1, arg0.getX(), 4);
        }
        this.field591 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)Lsh;", line = 315)
    public static final class497 method270(int arg0, int arg1) {
        field579++;
        return arg1 <= arg0 && arg0 < 100 ? class286.field3868[arg0] : null;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Lbv;", line = 331)
    public final class8 method271(int arg0) {
        field583++;
        if (arg0 != -22792) {
            this.field564 = null;
        }
        return (class8) this.field564.method368(arg0 ^ 0xFFFFA694);
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V", line = 344)
    private final void method272(byte arg0) {
        field565++;
        if (this.field594 == null) {
            return;
        }
        this.field594.removeMouseMotionListener(this);
        if (arg0 < 9) {
            return;
        }
        this.field594.removeMouseListener(this);
        this.field585 = this.field563 = this.field569 = 0;
        this.field592 = null;
        this.field594 = null;
        this.field564 = null;
        this.field593 = this.field590 = this.field591 = 0;
    }

    @OriginalMember(owner = "client!qg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 367)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field575++;
        int var2 = this.method265((byte) 95, arg0);
        if (var2 == 1) {
            this.method264(arg0.getY(), -1, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method264(arg0.getY(), -1, arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method264(arg0.getY(), -1, arg0.getX(), 1);
        }
        this.field591 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)Z", line = 391)
    public final boolean method273(int arg0) {
        if (arg0 > -17) {
            return false;
        } else {
            field567++;
            return (this.field569 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 403)
    public final void method274(int arg0) {
        field588++;
        this.method272((byte) 69);
        if (arg0 != -4) {
            this.method273(-116);
        }
    }

    @OriginalMember(owner = "client!qg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 414)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method267(arg0.getX(), -29195, arg0.getY());
        field581++;
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 435)
    public class44(Component arg0, boolean arg1) {
        this.method259(arg0, 4);
        this.field595 = arg1;
    }
}
