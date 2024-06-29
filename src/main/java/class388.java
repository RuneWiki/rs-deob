import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class388 extends class233 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lmba;")
    private class646 field5580 = new class646();

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Lmba;")
    private class646 field5605 = new class646();

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "Z")
    private boolean field5609;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lkr;")
    public static class602 field5582 = new class602(98, 4);

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "S")
    public static short field5602 = 32767;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    private int field5581;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    private int field5587;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    private int field5603;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    private int field5604;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    private int field5606;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    private int field5607;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Lcea;")
    public static class96 field5601;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field5608;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
    public final int method1556(int arg0) {
        field5583++;
        if (arg0 != 20) {
            this.mouseDragged(null);
        }
        return this.field5587;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)Z")
    public final boolean method1560(boolean arg0) {
        if (!arg0) {
            this.method2442(106, false, 15);
        }
        field5579++;
        return (this.field5603 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V")
    public static void method2437(int arg0) {
        field5601 = null;
        field5582 = null;
        if (arg0 >= -50) {
            field5601 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2438(int arg0, MouseEvent arg1) {
        field5595++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != arg0;
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

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I")
    public final int method1553(byte arg0) {
        if (arg0 < 59) {
            return 111;
        } else {
            field5589++;
            return this.field5581;
        }
    }

    @OriginalMember(owner = "client!cg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5593++;
        int var2 = this.method2438(0, arg0);
        if (var2 == 1) {
            this.method2439(-91, arg0.getClickCount(), arg0.getY(), 0, arg0.getX());
        } else if (var2 == 4) {
            this.method2439(-113, arg0.getClickCount(), arg0.getY(), 2, arg0.getX());
        } else if (var2 == 2) {
            this.method2439(-121, arg0.getClickCount(), arg0.getY(), 1, arg0.getX());
        }
        this.field5604 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)Z")
    public final boolean method1559(boolean arg0) {
        field5576++;
        if (arg0) {
            return (this.field5603 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    private final void method2439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5594++;
        class643 var6 = new class643();
        var6.field8615 = arg3;
        var6.field8624 = arg1;
        var6.field8621 = arg2;
        if (arg0 >= -12) {
            this.field5604 = -59;
        }
        var6.field8612 = arg4;
        var6.field8620 = class97.method664((byte) -50);
        this.field5605.method3610(9289, var6);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V")
    public static final void method2440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5585++;
        int var6 = arg5 - arg2;
        int var7 = arg4 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class158.method993(arg1, arg5, arg2, arg0, true);
            }
        } else if (var6 == 0) {
            class299.method1975(arg2, arg0, arg1, arg4, 67);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                int var10 = arg4;
                arg0 = arg2;
                arg2 = var9;
                arg4 = arg5;
                arg5 = var10;
            }
            if (arg0 > arg4) {
                int var11 = arg0;
                int var12 = arg2;
                arg0 = arg4;
                arg4 = var11;
                arg2 = arg5;
                arg5 = var12;
            }
            int var13 = arg2;
            int var14 = arg4 - arg0;
            int var15 = 24 % (arg3 / 49);
            int var16 = arg5 - arg2;
            int var17 = -(var14 >> 1);
            if (var16 < 0) {
                var16 = -var16;
            }
            int var18 = arg5 <= arg2 ? -1 : 1;
            if (var8) {
                for (int var20 = arg0; var20 <= arg4; var20++) {
                    var17 += var16;
                    class538.field7454[var20][var13] = arg1;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var18;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg4; var19++) {
                    class538.field7454[var13][var19] = arg1;
                    var17 += var16;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2441(int arg0, Component arg1) {
        this.method2443(0);
        field5596++;
        this.field5608 = arg1;
        this.field5608.addMouseListener(this);
        this.field5608.addMouseMotionListener(this);
        if (arg0 != 16245) {
            this.field5606 = -21;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZI)V")
    private final void method2442(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field5608 = null;
        }
        this.field5606 = arg2;
        this.field5607 = arg0;
        field5599++;
        if (this.field5609) {
            this.method2439(-60, 0, arg0, -1, arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Lq;")
    public final class674 method1552(boolean arg0) {
        if (arg0) {
            field5578++;
            return (class674) this.field5580.method3623(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
    public final synchronized void method1554(byte arg0) {
        this.field5587 = this.field5607;
        int var2 = -29 % ((-arg0 - 14) / 48);
        this.field5603 = this.field5604;
        field5586++;
        this.field5581 = this.field5606;
        class646 var3 = this.field5580;
        this.field5580 = this.field5605;
        this.field5605 = var3;
        this.field5605.method3615((byte) 127);
    }

    @OriginalMember(owner = "client!cg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2442(arg0.getY(), false, arg0.getX());
        field5598++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public final void method1551(int arg0) {
        this.method2443(0);
        field5588++;
        if (arg0 <= 96) {
            this.field5587 = 83;
        }
    }

    @OriginalMember(owner = "client!cg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2442(arg0.getY(), false, arg0.getX());
        field5592++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z")
    public final boolean method1555(int arg0) {
        if (arg0 != -25195) {
            field5597 = -28;
        }
        field5584++;
        return (this.field5603 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field5575++;
        this.method2442(arg0.getY(), false, arg0.getX());
    }

    @OriginalMember(owner = "client!cg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5590++;
        int var2 = this.method2438(0, arg0);
        if ((this.field5604 & var2) == 0) {
            var2 = this.field5604;
        }
        if ((var2 & 0x1) != 0) {
            this.method2439(-27, arg0.getClickCount(), arg0.getY(), 3, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2439(-56, arg0.getClickCount(), arg0.getY(), 5, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2439(-69, arg0.getClickCount(), arg0.getY(), 4, arg0.getX());
        }
        this.field5604 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5600++;
        this.method2442(arg0.getY(), false, arg0.getX());
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    private final void method2443(int arg0) {
        field5591++;
        if (this.field5608 == null) {
            return;
        }
        this.field5608.removeMouseMotionListener(this);
        this.field5608.removeMouseListener(this);
        this.field5581 = this.field5587 = this.field5603 = arg0;
        this.field5608 = null;
        this.field5606 = this.field5607 = this.field5604 = 0;
        this.field5580 = null;
        this.field5605 = null;
    }

    @OriginalMember(owner = "client!cg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5577++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class388(Component arg0, boolean arg1) {
        this.method2441(16245, arg0);
        this.field5609 = arg1;
    }
}
