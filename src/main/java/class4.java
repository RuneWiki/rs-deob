import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class4 extends class127 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lwq;")
    private class92 field48 = new class92();

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lwq;")
    private class92 field68 = new class92();

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Z")
    private boolean field69;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Liq;")
    public static class362 field30 = new class362(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field58 = 0;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "[I")
    public static int[] field61 = new int[2500];

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    private int field43;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    private int field47;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    private int field65;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    private int field67;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Ltq;")
    public static class376 field32;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Ljava/awt/Component;")
    private Component field70;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Ljava/awt/Image;")
    public static Image field45;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)I")
    public final int method17(int arg0) {
        field64++;
        if (arg0 != 20417) {
            this.field69 = false;
        }
        return this.field36;
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)I")
    public final int method18(int arg0) {
        field53++;
        if (arg0 != 1) {
            this.method32(true);
        }
        return this.field43;
    }

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "(I)V")
    public final synchronized void method19(int arg0) {
        this.field47 = this.field65;
        this.field43 = this.field66;
        this.field36 = this.field67;
        field49++;
        class92 var2 = this.field48;
        this.field48 = this.field68;
        this.field68 = var2;
        this.field68.method505((byte) 44);
        if (arg0 != -4) {
            this.field69 = false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field59++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method20(Component arg0, int arg1) {
        this.method31(0);
        field34++;
        this.field70 = arg0;
        if (arg1 != 8827) {
            this.mouseMoved((MouseEvent) null);
        }
        this.field70.addMouseListener(this);
        this.field70.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ltq;Ltq;ILgp;)V")
    public static final void method21(class376 arg0, class376 arg1, int arg2, class30 arg3) {
        class288.field4045 = arg0;
        class101.field1227 = arg3;
        field46++;
        class99.field1211 = arg1;
        if (arg2 != 1) {
            field58 = -48;
        }
        if (class99.field1211 != null) {
            class422.field6029 = class99.field1211.method2415(1, (byte) 56);
        }
        if (class288.field4045 != null) {
            class141.field1743 = class288.field4045.method2415(1, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!ie", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field37++;
        this.method25(arg0, (byte) 123);
    }

    @OriginalMember(owner = "client!ie", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field50++;
        int var2 = this.method27(arg0, 1);
        if ((var2 & this.field65) == 0) {
            var2 = this.field65;
        }
        if ((var2 & 0x1) != 0) {
            this.method30(arg0.getY(), 0, arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method30(arg0.getY(), 0, arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method30(arg0.getY(), 0, arg0.getX(), 4);
        }
        this.field65 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "(I)V")
    public static void method22(int arg0) {
        if (arg0 != 0) {
            method26(119, -46);
        }
        field61 = null;
        field30 = null;
        field45 = null;
        field32 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z")
    public final boolean method23(int arg0) {
        if (arg0 != -30204) {
            method29((String) null, 103);
        }
        field40++;
        return (this.field47 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ie", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method25(arg0, (byte) 123);
        field35++;
    }

    @OriginalMember(owner = "client!ie", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field42++;
        int var2 = this.method27(arg0, 1);
        if (var2 == 1) {
            this.method30(arg0.getY(), 0, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method30(arg0.getY(), 0, arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method30(arg0.getY(), 0, arg0.getX(), 1);
        }
        this.field65 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Z")
    public final boolean method24(int arg0) {
        field39++;
        if (arg0 != 0) {
            this.method27((MouseEvent) null, -44);
        }
        return (this.field47 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ie", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field66 = -1;
        this.field67 = -1;
        field51++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V")
    private final void method25(MouseEvent arg0, byte arg1) {
        field56++;
        this.field67 = arg0.getX();
        this.field66 = arg0.getY();
        if (arg1 != 123) {
            this.field67 = -77;
        }
        if (this.field69) {
            this.method30(arg0.getY(), arg1 - 123, arg0.getX(), -1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method26(int arg0, int arg1) {
        if (arg0 == 6592) {
            field55++;
            return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF59) >> 8) + "." + (arg1 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method27(MouseEvent arg0, int arg1) {
        field60++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (arg1 != 1) {
            this.method25((MouseEvent) null, (byte) 52);
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

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "(I)Lka;")
    public final class276 method28(int arg0) {
        field33++;
        int var2 = 49 / ((arg0 + 25) / 56);
        return (class276) this.field48.method513(-2);
    }

    @OriginalMember(owner = "client!ie", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method25(arg0, (byte) 123);
        field57++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method29(String arg0, int arg1) {
        if (arg1 != 10) {
            field45 = null;
        }
        field44++;
        return class337.method2172(10, true, arg0, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
    private final void method30(int arg0, int arg1, int arg2, int arg3) {
        field54++;
        class422 var5 = new class422();
        var5.field6019 = arg0;
        var5.field6025 = arg2;
        var5.field6033 = arg3;
        if (arg1 != 0) {
            this.method27((MouseEvent) null, 94);
        }
        var5.field6023 = class175.method1195(72);
        this.field68.method509((byte) 107, var5);
    }

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "(I)V")
    private final void method31(int arg0) {
        field41++;
        if (this.field70 == null) {
            return;
        }
        this.field70.removeMouseListener(this);
        this.field70.removeMouseMotionListener(this);
        this.field48 = null;
        this.field67 = this.field66 = this.field65 = 0;
        this.field68 = null;
        this.field70 = null;
        this.field36 = this.field43 = this.field47 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Z")
    public final boolean method32(boolean arg0) {
        field38++;
        if (arg0) {
            this.mousePressed((MouseEvent) null);
        }
        return (this.field47 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method33(int arg0) {
        field31++;
        if (arg0 != 6) {
            this.mouseMoved((MouseEvent) null);
        }
        this.method31(arg0 - 6);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class4(Component arg0, boolean arg1) {
        this.method20(arg0, 8827);
        this.field69 = arg1;
    }
}
