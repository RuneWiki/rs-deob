import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class485 extends class32 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Lui;")
    private class193 field6785 = new class193();

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Lui;")
    private class193 field6790 = new class193();

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "[Z")
    private boolean[] field6793 = new boolean[112];

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lvj;")
    public static class373 field6778 = new class373(35, 8);

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field6791 = 0;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field6794;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 5)
    private final void method2815(int arg0, Component arg1) {
        this.method2817((byte) -122);
        field6774++;
        int var3 = -93 / ((arg0 + 20) / 59);
        this.field6794 = arg1;
        Method var4 = class165.field2032;
        if (var4 != null) {
            try {
                var4.invoke(this.field6794, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field6794.addKeyListener(this);
        this.field6794.addFocusListener(this);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IICB)V", line = 29)
    private final void method2816(int arg0, int arg1, char arg2, byte arg3) {
        field6786++;
        class271 var5 = new class271();
        var5.field3512 = arg2;
        var5.field3516 = arg1;
        var5.field3519 = arg0;
        var5.field3517 = class190.method1030(false);
        this.field6790.method1040(var5, -92);
        if (arg3 >= -19) {
            this.method188((byte) -111);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z", line = 55)
    public final boolean method185(int arg0, int arg1) {
        field6777++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 != 53) {
                this.method2816(78, 19, (char) 65507, (byte) 8);
            }
            return this.field6793[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 73)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6783++;
        this.method2818(arg0, (byte) -126, 0);
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V", line = 81)
    private final void method2817(byte arg0) {
        field6782++;
        if (this.field6794 == null) {
            return;
        }
        this.field6794.removeKeyListener(this);
        this.field6794.removeFocusListener(this);
        this.field6794 = null;
        if (arg0 >= -121) {
            return;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field6793[var2] = false;
        }
        this.field6785.method1048(-7730);
        this.field6790.method1048(-7730);
    }

    @OriginalMember(owner = "client!qi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 108)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2818(arg0, (byte) -126, 1);
        field6772++;
    }

    @OriginalMember(owner = "client!qi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 116)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6789++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class393.method2261(var2, (byte) 107)) {
            this.method2816(-1, 3, var2, (byte) -82);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V", line = 130)
    private final void method2818(KeyEvent arg0, byte arg1, int arg2) {
        if (arg1 >= -121) {
            return;
        }
        field6787++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class7.field54.length) {
            int var5 = class7.field54[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method2816(var6, arg2, '\u0000', (byte) -101);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V", line = 165)
    public final void method188(byte arg0) {
        field6792++;
        if (arg0 < 34) {
            this.method188((byte) 58);
        }
        this.method2817((byte) -123);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Ljs;", line = 176)
    public static final class275 method2819(int arg0, byte arg1) {
        field6776++;
        class275[] var2 = class379.method2199(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field3623 == arg0) {
                return var2[var3];
            }
        }
        if (arg1 > -22) {
            method2819(10, (byte) -120);
        }
        return null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 201)
    public static void method2820(boolean arg0) {
        field6778 = null;
        if (arg0) {
            field6788 = 7;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 211)
    public final synchronized void method187(byte arg0) {
        field6784++;
        this.field6785.method1048(-7730);
        class271 var2 = (class271) this.field6790.method1054((byte) -105);
        if (arg0 < 74) {
            return;
        }
        while (var2 != null) {
            var2.field3514 = this.method2821(false);
            if (var2.field3516 == 0) {
                if (!this.field6793[var2.field3519]) {
                    class271 var3 = new class271();
                    var3.field3517 = var2.field3517;
                    var3.field3516 = 0;
                    var3.field3519 = var2.field3519;
                    var3.field3514 = var2.field3514;
                    var3.field3512 = '\u0000';
                    this.field6785.method1040(var3, -113);
                    this.field6793[var2.field3519] = true;
                }
                var2.field3516 = 2;
                this.field6785.method1040(var2, -113);
            } else if (var2.field3516 == 1) {
                if (this.field6793[var2.field3519]) {
                    this.field6785.method1040(var2, -111);
                    this.field6793[var2.field3519] = false;
                }
            } else if (var2.field3516 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field6793[var4]) {
                        class271 var5 = new class271();
                        var5.field3514 = var2.field3514;
                        var5.field3517 = var2.field3517;
                        var5.field3519 = var4;
                        var5.field3516 = 1;
                        var5.field3512 = '\u0000';
                        this.field6785.method1040(var5, -104);
                        this.field6793[var4] = false;
                    }
                }
            } else if (var2.field3516 == 3) {
                this.field6785.method1040(var2, -101);
            }
            var2 = (class271) this.field6790.method1054((byte) -105);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Lvaa;", line = 302)
    public final class397 method183(byte arg0) {
        if (arg0 < 23) {
            return null;
        } else {
            field6781++;
            return (class397) this.field6785.method1054((byte) -105);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 379)
    public class485(Component arg0) {
        class108.method631(17348);
        this.method2815(-100, arg0);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I", line = 324)
    private final int method2821(boolean arg0) {
        field6773++;
        if (arg0) {
            field6788 = -47;
        }
        int var2 = 0;
        if (this.field6793[81]) {
            var2 |= 0x1;
        }
        if (this.field6793[82]) {
            var2 |= 0x4;
        }
        if (this.field6793[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 350)
    public final void focusGained(FocusEvent arg0) {
        field6779++;
    }

    @OriginalMember(owner = "client!qi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 359)
    public final synchronized void focusLost(FocusEvent arg0) {
        field6775++;
        this.method2816(0, -1, '\u0000', (byte) -98);
    }
}
