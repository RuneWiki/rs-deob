import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class511 extends class263 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Lvp;")
    private class123 field7464 = new class123();

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "Lvp;")
    private class123 field7483 = new class123();

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "Z")
    private boolean field7486;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "Lki;")
    public static class498 field7457 = new class498(77, 3);

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "[[I")
    public static int[][] field7468;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Lne;")
    public static class207 field7465;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "Lri;")
    public static class73 field7476;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "Llt;")
    public static class475 field7477;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    private int field7451;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    private int field7470;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
    private int field7475;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    private int field7480;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    private int field7481;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    private int field7482;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "Ljava/awt/Component;")
    private Component field7485;

    static {
        new class475("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field7468 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
        field7465 = new class207("WTI", 5);
        field7476 = new class73(66, 2);
        field7477 = new class475("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        field7487 = 1339;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)V", line = 3)
    private final void method3017(int arg0, int arg1, int arg2, int arg3) {
        field7449++;
        class40 var5 = new class40();
        var5.field577 = arg1;
        var5.field579 = arg2;
        var5.field582 = arg0;
        var5.field578 = class256.method1708((byte) 118);
        if (arg3 <= -91) {
            this.field7483.method809(var5, false);
        }
    }

    @OriginalMember(owner = "client!bo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 20)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field7460++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)I", line = 31)
    public final int method1751(int arg0) {
        if (arg0 != 32) {
            this.field7464 = null;
        }
        field7467++;
        return this.field7470;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 46)
    private final void method3018(int arg0, MouseEvent arg1) {
        if (arg0 >= -44) {
            this.method3022(null, (byte) -28);
        }
        field7478++;
        this.field7480 = arg1.getX();
        this.field7481 = arg1.getY();
        if (this.field7486) {
            this.method3017(arg1.getX(), arg1.getY(), -1, -123);
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)I", line = 66)
    public final int method1749(byte arg0) {
        if (arg0 >= -122) {
            this.method1749((byte) -86);
        }
        field7479++;
        return this.field7475;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IC)C", line = 80)
    public static final char method3019(int arg0, char arg1) {
        field7450++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) ((char) arg0 == arg1 ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!bo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 105)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method3018(-100, arg0);
        field7469++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvl;", line = 114)
    public static final class11 method3020(Throwable arg0, String arg1) {
        field7466++;
        class11 var2;
        if ((arg0 instanceof class11)) {
            var2 = (class11) arg0;
            var2.field139 = var2.field139 + ' ' + arg1;
        } else {
            var2 = new class11(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V", line = 131)
    private final void method3021(int arg0) {
        field7453++;
        int var2 = -73 % ((arg0 + 4) / 56);
        if (this.field7485 == null) {
            return;
        }
        this.field7485.removeMouseListener(this);
        this.field7485.removeMouseMotionListener(this);
        this.field7483 = null;
        this.field7485 = null;
        this.field7480 = this.field7481 = this.field7482 = 0;
        this.field7464 = null;
        this.field7470 = this.field7475 = this.field7451 = 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 154)
    private final void method3022(Component arg0, byte arg1) {
        field7459++;
        this.method3021(-61);
        if (arg1 == 69) {
            this.field7485 = arg0;
            this.field7485.addMouseListener(this);
            this.field7485.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 169)
    private final int method3023(int arg0, MouseEvent arg1) {
        field7463++;
        int var3 = arg1.getModifiers();
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
        } else {
            if (arg0 != 8323) {
                field7484 = -39;
            }
            return var6 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 204)
    public final synchronized void method1745(int arg0) {
        this.field7470 = this.field7480;
        if (arg0 < 7) {
            method3019(87, '\u000e');
        }
        field7456++;
        this.field7475 = this.field7481;
        this.field7451 = this.field7482;
        class123 var2 = this.field7464;
        this.field7464 = this.field7483;
        this.field7483 = var2;
        this.field7483.method817(-4);
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z", line = 228)
    public final boolean method1750(int arg0) {
        field7473++;
        if (arg0 != -22375) {
            method3024(75);
        }
        return (this.field7451 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z", line = 239)
    public final boolean method1744(int arg0) {
        if (arg0 != 32) {
            field7477 = null;
        }
        field7471++;
        return (this.field7451 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 250)
    public final void method1746(byte arg0) {
        int var2 = -51 / ((arg0 + 22) / 59);
        this.method3021(64);
        field7452++;
    }

    @OriginalMember(owner = "client!bo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 260)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field7461++;
        this.method3018(-98, arg0);
    }

    @OriginalMember(owner = "client!bo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 272)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field7462++;
        this.field7481 = -1;
        this.field7480 = -1;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z", line = 283)
    public final boolean method1748(byte arg0) {
        field7472++;
        int var2 = -26 / ((arg0 - 46) / 57);
        return (this.field7451 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 293)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field7474++;
        this.method3018(-127, arg0);
    }

    @OriginalMember(owner = "client!bo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 301)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field7455++;
        int var2 = this.method3023(8323, arg0);
        if (var2 == 1) {
            this.method3017(arg0.getX(), arg0.getY(), 0, -118);
        } else if (var2 == 4) {
            this.method3017(arg0.getX(), arg0.getY(), 2, -114);
        } else if (var2 == 2) {
            this.method3017(arg0.getX(), arg0.getY(), 1, -94);
        }
        this.field7482 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Lvq;", line = 334)
    public final class320 method1752(int arg0) {
        field7458++;
        if (arg0 < 18) {
            this.mouseDragged(null);
        }
        return (class320) this.field7464.method815(-119);
    }

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "(I)V", line = 345)
    public static void method3024(int arg0) {
        field7457 = null;
        if (arg0 == -23850) {
            field7476 = null;
            field7477 = null;
            field7468 = null;
            field7465 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 360)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field7454++;
        int var2 = this.method3023(8323, arg0);
        if ((this.field7482 & var2) == 0) {
            var2 = this.field7482;
        }
        if ((var2 & 0x1) != 0) {
            this.method3017(arg0.getX(), arg0.getY(), 3, -102);
        }
        if ((var2 & 0x4) != 0) {
            this.method3017(arg0.getX(), arg0.getY(), 5, -94);
        }
        if ((var2 & 0x2) != 0) {
            this.method3017(arg0.getX(), arg0.getY(), 4, -106);
        }
        this.field7482 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 428)
    public class511(Component arg0, boolean arg1) {
        this.method3022(arg0, (byte) 69);
        this.field7486 = arg1;
    }
}
