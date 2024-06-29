import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class188 extends class591 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Lor;")
    private class594 field3144 = new class594();

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Lor;")
    private class594 field3146 = new class594();

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "[Z")
    private boolean[] field3148 = new boolean[112];

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Lrl;")
    public static class672 field3147 = new class672(12, 3);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field3149;

    @OriginalMember(owner = "client!oc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3138++;
        this.method1514(1, (byte) -26, arg0);
    }

    @OriginalMember(owner = "client!oc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1514(0, (byte) -26, arg0);
        field3134++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public final synchronized void method1510(byte arg0) {
        this.field3144.method3474(22090);
        field3129++;
        for (class664 var2 = (class664) this.field3146.method3471(0); var2 != null; var2 = (class664) this.field3146.method3471(0)) {
            var2.field9249 = this.method1512(-12);
            if (var2.field9254 == 0) {
                if (!this.field3148[var2.field9240]) {
                    class664 var4 = new class664();
                    var4.field9249 = var2.field9249;
                    var4.field9251 = var2.field9251;
                    var4.field9240 = var2.field9240;
                    var4.field9248 = '\u0000';
                    var4.field9254 = 0;
                    this.field3144.method3463((byte) -87, var4);
                    this.field3148[var2.field9240] = true;
                }
                var2.field9254 = 2;
                this.field3144.method3463((byte) -87, var2);
            } else if (var2.field9254 == 1) {
                if (this.field3148[var2.field9240]) {
                    this.field3144.method3463((byte) -87, var2);
                    this.field3148[var2.field9240] = false;
                }
            } else if (var2.field9254 == -1) {
                for (int var5 = 0; var5 < 112; var5++) {
                    if (this.field3148[var5]) {
                        class664 var6 = new class664();
                        var6.field9240 = var5;
                        var6.field9248 = '\u0000';
                        var6.field9251 = var2.field9251;
                        var6.field9254 = 1;
                        var6.field9249 = var2.field9249;
                        this.field3144.method3463((byte) -87, var6);
                        this.field3148[var5] = false;
                    }
                }
            } else if (var2.field9254 == 3) {
                this.field3144.method3463((byte) -87, var2);
            }
        }
        int var3 = 21 / ((arg0 + 59) / 44);
    }

    @OriginalMember(owner = "client!oc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1513(0, -1, 60, '\u0000');
        field3132++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field3147 = null;
        if (arg0 != 28820) {
            field3147 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)I")
    private final int method1512(int arg0) {
        field3136++;
        if (arg0 > -8) {
            return -69;
        }
        int var2 = 0;
        if (this.field3148[81]) {
            var2 |= 0x1;
        }
        if (this.field3148[82]) {
            var2 |= 0x4;
        }
        if (this.field3148[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIC)V")
    private final void method1513(int arg0, int arg1, int arg2, char arg3) {
        field3140++;
        class664 var5 = new class664();
        var5.field9254 = arg1;
        var5.field9240 = arg0;
        var5.field9248 = arg3;
        var5.field9251 = class112.method1033(-11752);
        this.field3146.method3463((byte) -87, var5);
        if (arg2 <= 14) {
            this.field3146 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V")
    private final void method1514(int arg0, byte arg1, KeyEvent arg2) {
        if (arg1 != -26) {
            this.field3149 = null;
        }
        field3137++;
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class49.field664.length > var4) {
            int var6 = class49.field664[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1513(var5, arg0, 118, '\u0000');
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
    public final boolean method1515(int arg0, int arg1) {
        int var3 = -92 / ((-arg1 - 9) / 43);
        field3139++;
        return arg0 >= 0 && arg0 < 112 ? this.field3148[arg0] : false;
    }

    @OriginalMember(owner = "client!oc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3145++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1516(int arg0, Component arg1) {
        this.method1519((byte) -108);
        field3141++;
        this.field3149 = arg1;
        if (arg0 != -113) {
            return;
        }
        Method var3 = class525.field7661;
        if (var3 != null) {
            try {
                var3.invoke(this.field3149, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3149.addKeyListener(this);
        this.field3149.addFocusListener(this);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
    public final void method1517(boolean arg0) {
        if (!arg0) {
            field3131++;
            this.method1519((byte) -127);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)Lvc;")
    public final class291 method1518(boolean arg0) {
        if (arg0) {
            this.field3146 = null;
        }
        field3142++;
        return (class291) this.field3144.method3471(0);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    private final void method1519(byte arg0) {
        field3135++;
        if (this.field3149 == null) {
            return;
        }
        this.field3149.removeKeyListener(this);
        this.field3149.removeFocusListener(this);
        this.field3149 = null;
        if (arg0 >= -92) {
            this.field3149 = null;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3148[var2] = false;
        }
        this.field3144.method3474(22090);
        this.field3146.method3474(22090);
    }

    @OriginalMember(owner = "client!oc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3133++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class87.method799(125, var2)) {
            this.method1513(-1, 3, 27, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class188(Component arg0) {
        class9.method189(-307);
        this.method1516(-113, arg0);
    }
}
