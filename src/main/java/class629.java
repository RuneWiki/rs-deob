import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class629 extends class29 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "Lmfa;")
    private class562 field8913 = new class562();

    @OriginalMember(owner = "client!bw", name = "F", descriptor = "Lmfa;")
    private class562 field8941 = new class562();

    @OriginalMember(owner = "client!bw", name = "J", descriptor = "Z")
    private boolean field8945;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "Lpr;")
    public static class407 field8927 = new class407(44, -2);

    @OriginalMember(owner = "client!bw", name = "H", descriptor = "I")
    public static int field8943 = 13156520;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    private int field8919;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    private int field8920;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    private int field8933;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!bw", name = "D", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
    private int field8940;

    @OriginalMember(owner = "client!bw", name = "G", descriptor = "I")
    private int field8942;

    @OriginalMember(owner = "client!bw", name = "I", descriptor = "I")
    private int field8944;

    @OriginalMember(owner = "client!bw", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field8946;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "Ljava/lang/String;")
    public static String field8937;

    @OriginalMember(owner = "client!bw", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field8932++;
        this.method3528(arg0.getX(), (byte) 94, arg0.getY());
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)Lve;")
    public final class460 method154(boolean arg0) {
        field8928++;
        if (!arg0) {
            field8937 = null;
        }
        return (class460) this.field8913.method3171(768);
    }

    @OriginalMember(owner = "client!bw", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field8934++;
        this.method3528(arg0.getX(), (byte) 124, arg0.getY());
    }

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V")
    public static final void method3522(int arg0) {
        class472.field6593 = arg0;
        for (int var1 = 0; var1 < class181.field2222; var1++) {
            for (int var2 = 0; var2 < class272.field3451; var2++) {
                if (class97.field1074[arg0][var1][var2] == null) {
                    class97.field1074[arg0][var1][var2] = new class287(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Z")
    public final boolean method158(int arg0) {
        field8924++;
        if (arg0 != -7948) {
            field8943 = -20;
        }
        return (this.field8919 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(Z)Z")
    public final boolean method160(boolean arg0) {
        field8922++;
        if (arg0) {
            this.method163((byte) 102);
        }
        return (this.field8919 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!bw", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field8935++;
        int var2 = this.method3523(arg0, 4);
        if ((var2 & this.field8940) == 0) {
            var2 = this.field8940;
        }
        if ((var2 & 0x1) != 0) {
            this.method3529(0, arg0.getX(), arg0.getY(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method3529(0, arg0.getX(), arg0.getY(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method3529(0, arg0.getX(), arg0.getY(), 4);
        }
        this.field8940 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bw", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method3528(arg0.getX(), (byte) 115, arg0.getY());
        field8918++;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method3523(MouseEvent arg0, int arg1) {
        field8931++;
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

    @OriginalMember(owner = "client!bw", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field8914++;
        this.method3528(arg0.getX(), (byte) 60, arg0.getY());
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 4) {
            return;
        }
        if (arg1 >= class326.field4246 && class163.field1942 >= arg1 && class326.field4246 <= arg4 && class163.field1942 >= arg4 && arg8 >= class326.field4246 && arg8 <= class163.field1942 && arg5 >= class326.field4246 && class163.field1942 >= arg5 && arg3 >= class58.field602 && arg3 <= class501.field7217 && arg7 >= class58.field602 && arg7 <= class501.field7217 && class58.field602 <= arg6 && arg6 <= class501.field7217 && class58.field602 <= arg2 && arg2 <= class501.field7217) {
            class252.method1446(arg9, arg7, arg2, arg5, arg1, -50, arg8, arg4, arg6, arg3);
        } else {
            class478.method2796(arg8, arg7, arg9, arg6, (byte) -50, arg2, arg5, arg3, arg1, arg4);
        }
        field8921++;
    }

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "(I)V")
    private final void method3525(int arg0) {
        field8917++;
        if (this.field8946 == null) {
            return;
        }
        this.field8946.removeMouseMotionListener(this);
        this.field8946.removeMouseListener(this);
        this.field8913 = null;
        this.field8933 = this.field8920 = this.field8919 = 0;
        this.field8946 = null;
        this.field8941 = null;
        this.field8944 = this.field8942 = this.field8940 = arg0;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V")
    public final synchronized void method163(byte arg0) {
        if (arg0 < 32) {
            field8943 = 12;
        }
        field8915++;
        this.field8919 = this.field8940;
        this.field8920 = this.field8942;
        this.field8933 = this.field8944;
        class562 var2 = this.field8913;
        this.field8913 = this.field8941;
        this.field8941 = var2;
        this.field8941.method3170((byte) 67);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Z")
    public final boolean method156(int arg0) {
        if (arg0 == 17289) {
            field8926++;
            return (this.field8919 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(B)V")
    public static void method3526(byte arg0) {
        field8937 = null;
        field8927 = null;
        if (arg0 != 74) {
            method3522(37);
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
    public final int method161(int arg0) {
        field8938++;
        if (arg0 != 31285) {
            this.method3523(null, -68);
        }
        return this.field8920;
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)I")
    public final int method162(int arg0) {
        if (arg0 == -26561) {
            field8939++;
            return this.field8933;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!bw", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field8930++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        field8936++;
        if (arg0 <= -9) {
            this.method3525(0);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    private final void method3527(boolean arg0, Component arg1) {
        this.method3525(0);
        field8925++;
        this.field8946 = arg1;
        this.field8946.addMouseListener(this);
        if (arg0) {
            this.field8946.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!bw", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field8929++;
        int var2 = this.method3523(arg0, 4);
        if (var2 == 1) {
            this.method3529(0, arg0.getX(), arg0.getY(), 0);
        } else if (var2 == 4) {
            this.method3529(0, arg0.getX(), arg0.getY(), 2);
        } else if (var2 == 2) {
            this.method3529(0, arg0.getX(), arg0.getY(), 1);
        }
        this.field8940 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IBI)V")
    private final void method3528(int arg0, byte arg1, int arg2) {
        if (arg1 <= 41) {
            this.field8920 = 90;
        }
        this.field8942 = arg2;
        field8916++;
        this.field8944 = arg0;
        if (this.field8945) {
            this.method3529(0, arg0, arg2, -1);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIII)V")
    private final void method3529(int arg0, int arg1, int arg2, int arg3) {
        field8923++;
        class427 var5 = new class427();
        var5.field5660 = arg2;
        var5.field5668 = arg3;
        var5.field5661 = arg1;
        if (arg0 != 0) {
            this.mouseClicked(null);
        }
        var5.field5669 = class641.method3604(false);
        this.field8941.method3164(var5, 256);
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class629(Component arg0, boolean arg1) {
        this.method3527(true, arg0);
        this.field8945 = arg1;
    }
}
