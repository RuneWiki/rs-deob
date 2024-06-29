import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class139 extends class279 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lam;")
    private class455 field1825 = new class455();

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Lam;")
    private class455 field1829 = new class455();

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "[Z")
    private boolean[] field1832 = new boolean[112];

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Leh;")
    public static class246 field1817 = new class246(99, 8);

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "Ljava/awt/Component;")
    private Component field1831;

    @OriginalMember(owner = "client!oc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 3)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field1816++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class541.method3179(var2, (byte) -67)) {
            this.method871(var2, -1, 124, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 21)
    public final void focusGained(FocusEvent arg0) {
        field1821++;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 29)
    public final synchronized void method864(int arg0) {
        this.field1825.method2656(71);
        field1818++;
        int var2 = -38 / ((arg0 - 56) / 56);
        for (class47 var3 = (class47) this.field1829.method2654(-1); var3 != null; var3 = (class47) this.field1829.method2654(-1)) {
            var3.field532 = this.method874(false);
            if (var3.field539 == 0) {
                if (!this.field1832[var3.field530]) {
                    class47 var4 = new class47();
                    var4.field529 = '\u0000';
                    var4.field532 = var3.field532;
                    var4.field539 = 0;
                    var4.field536 = var3.field536;
                    var4.field530 = var3.field530;
                    this.field1825.method2657(8492, var4);
                    this.field1832[var3.field530] = true;
                }
                var3.field539 = 2;
                this.field1825.method2657(8492, var3);
            } else if (var3.field539 == 1) {
                if (this.field1832[var3.field530]) {
                    this.field1825.method2657(8492, var3);
                    this.field1832[var3.field530] = false;
                }
            } else if (var3.field539 == -1) {
                for (int var5 = 0; var5 < 112; var5++) {
                    if (this.field1832[var5]) {
                        class47 var6 = new class47();
                        var6.field536 = var3.field536;
                        var6.field539 = 1;
                        var6.field532 = var3.field532;
                        var6.field529 = '\u0000';
                        var6.field530 = var5;
                        this.field1825.method2657(8492, var6);
                        this.field1832[var5] = false;
                    }
                }
            } else if (var3.field539 == 3) {
                this.field1825.method2657(8492, var3);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Lwo;", line = 118)
    public final class533 method865(int arg0) {
        if (arg0 < 66) {
            this.keyReleased(null);
        }
        field1813++;
        return (class533) this.field1825.method2654(-1);
    }

    @OriginalMember(owner = "client!oc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 130)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method871('\u0000', 0, 95, -1);
        field1820++;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V", line = 139)
    private final void method866(int arg0) {
        field1823++;
        if (this.field1831 == null || arg0 <= 0) {
            return;
        }
        this.field1831.removeKeyListener(this);
        this.field1831.removeFocusListener(this);
        this.field1831 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field1832[var2] = false;
        }
        this.field1825.method2656(104);
        this.field1829.method2656(90);
    }

    @OriginalMember(owner = "client!oc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 167)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1822++;
        this.method869((byte) -114, arg0, 0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z", line = 176)
    public static final boolean method867(byte arg0, int arg1) {
        if (arg0 != 84) {
            field1817 = null;
        }
        field1819++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V", line = 189)
    public static void method868(int arg0) {
        field1817 = null;
        if (arg0 != 1) {
            method868(15);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V", line = 199)
    private final void method869(byte arg0, KeyEvent arg1, int arg2) {
        field1814++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class234.field3412.length) {
            int var6 = class234.field3412[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (arg0 > -91) {
            this.focusGained(null);
        }
        if (var5 != 0) {
            this.method871('\u0000', var5, 111, arg2);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z", line = 238)
    public final boolean method870(int arg0, int arg1) {
        field1826++;
        if (arg0 >= 0 && arg0 < 112) {
            if (arg1 >= -112) {
                this.method865(75);
            }
            return this.field1832[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(CIII)V", line = 255)
    private final void method871(char arg0, int arg1, int arg2, int arg3) {
        field1824++;
        class47 var5 = new class47();
        var5.field530 = arg1;
        var5.field529 = arg0;
        var5.field539 = arg3;
        int var6 = 102 % ((52 - arg2) / 37);
        var5.field536 = class465.method2699((byte) 14);
        this.field1829.method2657(8492, var5);
    }

    @OriginalMember(owner = "client!oc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 272)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method869((byte) -116, arg0, 1);
        field1828++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 281)
    public final void method872(int arg0) {
        if (arg0 <= 126) {
            this.method865(103);
        }
        field1827++;
        this.method866(32);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 292)
    private final void method873(byte arg0, Component arg1) {
        field1830++;
        this.method866(89);
        this.field1831 = arg1;
        Method var3 = class151.field2174;
        if (var3 != null) {
            try {
                var3.invoke(this.field1831, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field1831.addKeyListener(this);
        int var4 = 50 % ((-arg0 - 48) / 41);
        this.field1831.addFocusListener(this);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 353)
    public class139(Component arg0) {
        class536.method3152(-106);
        this.method873((byte) -111, arg0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I", line = 323)
    private final int method874(boolean arg0) {
        if (arg0) {
            this.method869((byte) -93, null, 108);
        }
        field1815++;
        int var2 = 0;
        if (this.field1832[81]) {
            var2 |= 0x1;
        }
        if (this.field1832[82]) {
            var2 |= 0x4;
        }
        if (this.field1832[86]) {
            var2 |= 0x2;
        }
        return var2;
    }
}
