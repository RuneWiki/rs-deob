import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class258 extends class161 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "Laq;")
    private class90 field3623 = new class90();

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "Laq;")
    private class90 field3632 = new class90();

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "Z")
    private boolean field3635;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    private int field3628;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    private int field3630;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "Lnq;")
    public static class268 field3626;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "Ljava/awt/Component;")
    private Component field3636;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "Z")
    public static boolean field3620;

    static {
        new class442("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)V", line = 6)
    public final synchronized void method1069(boolean arg0) {
        this.field3628 = this.field3634;
        this.field3602 = this.field3633;
        this.field3621 = this.field3630;
        field3622++;
        class90 var2 = this.field3623;
        this.field3623 = this.field3632;
        this.field3632 = var2;
        this.field3632.method644(arg0);
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)I", line = 25)
    public final int method1071(byte arg0) {
        field3616++;
        return arg0 == -12 ? this.field3621 : -53;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)V", line = 36)
    private final void method1699(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -16 % ((arg2 + 11) / 50);
        field3610++;
        class42 var6 = new class42();
        var6.field616 = arg0;
        var6.field604 = arg1;
        var6.field609 = arg3;
        var6.field613 = class385.method2442(-6631);
        this.field3632.method643(var6, -68);
    }

    @OriginalMember(owner = "client!bn", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3615++;
        this.method1701(arg0, -127);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)V", line = 62)
    public static final void method1700(int arg0, boolean arg1) {
        field3603++;
        int var2 = 63 % ((arg0 - 41) / 58);
        byte var3;
        byte[][] var4;
        if (arg1) {
            var3 = 1;
            var4 = class67.field1014;
        } else {
            var4 = class161.field2249;
            var3 = 4;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class285.method1860(12);
            for (int var6 = 0; var6 < class211.field2954 >> 3; var6++) {
                for (int var7 = 0; var7 < (class290.field4061 >> 3); var7++) {
                    int var8 = class210.field2941[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFCDB8) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class155.field2191.length; var14++) {
                                if (class155.field2191[var14] == var13 && var4[var14] != null) {
                                    class59.method464(class64.field949, var4[var14], var9, class426.field5999, var5, arg1, (var11 & 0x7) * 8, 117, var6 * 8, (var12 & 0x7) * 8, var10, var7 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)Z", line = 145)
    public final boolean method1070(int arg0) {
        field3605++;
        if (arg0 == 19822) {
            return (this.field3602 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 156)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3624++;
        this.method1701(arg0, -120);
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)Z", line = 165)
    public final boolean method1072(byte arg0) {
        int var2 = 71 % ((-arg0 - 72) / 39);
        field3617++;
        return (this.field3602 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!bn", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 178)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field3630 = -1;
        field3611++;
        this.field3634 = -1;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(B)Lum;", line = 189)
    public final class307 method1073(byte arg0) {
        if (arg0 == -13) {
            field3625++;
            return (class307) this.field3623.method633(arg0 ^ 0x72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)I", line = 200)
    public final int method1068(byte arg0) {
        field3612++;
        int var2 = -49 % ((arg0 - 19) / 53);
        return this.field3628;
    }

    @OriginalMember(owner = "client!bn", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 212)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1701(arg0, -70);
        field3607++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V", line = 222)
    private final void method1701(MouseEvent arg0, int arg1) {
        this.field3630 = arg0.getX();
        field3631++;
        if (arg1 > -65) {
            field3626 = null;
        }
        this.field3634 = arg0.getY();
        if (this.field3635) {
            this.method1699(arg0.getY(), arg0.getX(), -110, -1);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 242)
    private final void method1702(Component arg0, boolean arg1) {
        this.method1704((byte) 57);
        field3618++;
        this.field3636 = arg0;
        this.field3636.addMouseListener(this);
        this.field3636.addMouseMotionListener(this);
        if (arg1) {
            this.field3630 = -96;
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 260)
    public static void method1703(int arg0) {
        if (arg0 == 8) {
            field3626 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V", line = 270)
    private final void method1704(byte arg0) {
        field3608++;
        if (this.field3636 == null) {
            return;
        }
        this.field3636.removeMouseListener(this);
        this.field3636.removeMouseMotionListener(this);
        this.field3636 = null;
        this.field3623 = null;
        if (arg0 == 57) {
            this.field3632 = null;
            this.field3630 = this.field3634 = this.field3633 = 0;
            this.field3621 = this.field3628 = this.field3602 = 0;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 292)
    private final int method1705(int arg0, MouseEvent arg1) {
        field3606++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = ~(var3 & 0x4) != arg0;
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

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 328)
    public final void method1064(boolean arg0) {
        if (!arg0) {
            this.method1705(75, (MouseEvent) null);
        }
        field3609++;
        this.method1704((byte) 57);
    }

    @OriginalMember(owner = "client!bn", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 341)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3619++;
        int var2 = this.method1705(-1, arg0);
        if (var2 == 1) {
            this.method1699(arg0.getY(), arg0.getX(), 58, 0);
        } else if (var2 == 4) {
            this.method1699(arg0.getY(), arg0.getX(), -92, 2);
        } else if (var2 == 2) {
            this.method1699(arg0.getY(), arg0.getX(), -121, 1);
        }
        this.field3633 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Z", line = 369)
    public final boolean method1066(byte arg0) {
        field3614++;
        int var2 = 63 / ((arg0 - 29) / 53);
        return (this.field3602 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bn", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 385)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field3613++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bn", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 396)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3604++;
        int var2 = this.method1705(-1, arg0);
        if ((var2 & this.field3633) == 0) {
            var2 = this.field3633;
        }
        if ((var2 & 0x1) != 0) {
            this.method1699(arg0.getY(), arg0.getX(), 108, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1699(arg0.getY(), arg0.getX(), -95, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1699(arg0.getY(), arg0.getX(), -69, 4);
        }
        this.field3633 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 446)
    public class258(Component arg0, boolean arg1) {
        this.method1702(arg0, false);
        this.field3635 = arg1;
    }
}
