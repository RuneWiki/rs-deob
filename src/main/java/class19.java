import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class19 extends class330 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lbv;")
    private class568 field218 = new class568();

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Lbv;")
    private class568 field238 = new class568();

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Z")
    private boolean field239;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field240;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lsda;")
    public final class7 method88(int arg0) {
        if (arg0 == 14211) {
            field215++;
            return (class7) this.field218.method3184(-5295);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field230++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public final void method89(boolean arg0) {
        if (arg0) {
            this.method96(0);
            field210++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method97(arg0.getY(), (byte) 65, arg0.getX());
        field222++;
    }

    @OriginalMember(owner = "client!ad", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method97(arg0.getY(), (byte) 65, arg0.getX());
        field233++;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Z")
    public final boolean method90(int arg0) {
        if (arg0 == 16) {
            field228++;
            return (this.field227 & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method91(Component arg0, byte arg1) {
        this.method96(0);
        field225++;
        this.field240 = arg0;
        if (arg1 == -127) {
            this.field240.addMouseListener(this);
            this.field240.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field221++;
        int var2 = this.method95(arg0, 4);
        if ((var2 & this.field235) == 0) {
            var2 = this.field235;
        }
        if ((var2 & 0x1) != 0) {
            this.method101(3, (byte) -123, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method101(5, (byte) -108, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method101(4, (byte) -109, arg0.getY(), arg0.getX());
        }
        this.field235 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
    public final int method92(int arg0) {
        if (arg0 != 8) {
            this.field232 = -40;
        }
        field217++;
        return this.field229;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        if (arg0 == 15997) {
            field224++;
            return (this.field227 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
    public static final void method94(int arg0) {
        class503.field7000 = arg0;
        class80.field1086 = arg0;
        class558.field7816 = arg0;
        class585.field8458 = arg0;
        field236++;
    }

    @OriginalMember(owner = "client!ad", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method97(arg0.getY(), (byte) 65, arg0.getX());
        field226++;
    }

    @OriginalMember(owner = "client!ad", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field219++;
        int var2 = this.method95(arg0, 4);
        if (var2 == 1) {
            this.method101(0, (byte) -108, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method101(2, (byte) -110, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method101(1, (byte) -126, arg0.getY(), arg0.getX());
        }
        this.field235 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method97(arg0.getY(), (byte) 65, arg0.getX());
        field214++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method95(MouseEvent arg0, int arg1) {
        field213++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (arg1 & var3) != 0;
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

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    private final void method96(int arg0) {
        field231++;
        if (this.field240 == null) {
            return;
        }
        this.field240.removeMouseMotionListener(this);
        this.field240.removeMouseListener(this);
        this.field240 = null;
        this.field218 = null;
        this.field234 = this.field237 = this.field235 = arg0;
        this.field238 = null;
        this.field232 = this.field229 = this.field227 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBI)V")
    private final void method97(int arg0, byte arg1, int arg2) {
        this.field234 = arg2;
        if (arg1 != 65) {
            return;
        }
        field216++;
        this.field237 = arg0;
        if (this.field239) {
            this.method101(-1, (byte) -113, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)Z")
    public final boolean method98(boolean arg0) {
        field211++;
        if (!arg0) {
            this.method101(-126, (byte) 55, 70, 54);
        }
        return (this.field227 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public final synchronized void method99(int arg0) {
        this.field229 = this.field237;
        this.field232 = this.field234;
        int var2 = 93 % ((12 - arg0) / 58);
        this.field227 = this.field235;
        field220++;
        class568 var3 = this.field218;
        this.field218 = this.field238;
        this.field238 = var3;
        this.field238.method3178(-8299);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)I")
    public final int method100(byte arg0) {
        if (arg0 > -41) {
            this.field238 = null;
        }
        field212++;
        return this.field232;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBII)V")
    private final void method101(int arg0, byte arg1, int arg2, int arg3) {
        field223++;
        class428 var5 = new class428();
        var5.field5844 = arg3;
        var5.field5840 = arg0;
        var5.field5843 = arg2;
        var5.field5836 = class348.method2175(-116);
        if (arg1 >= -106) {
            this.field218 = null;
        }
        this.field238.method3181(var5, true);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class19(Component arg0, boolean arg1) {
        this.method91(arg0, (byte) -127);
        this.field239 = arg1;
    }
}
