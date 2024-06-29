import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class221 extends class471 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "Lnt;")
    private class220 field3153 = new class220();

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "Lnt;")
    private class220 field3166 = new class220();

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "[Z")
    private boolean[] field3167 = new boolean[112];

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "Lqaa;")
    public static class27 field3157 = new class27(82, 0);

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "[I")
    public static int[] field3165 = new int[1];

    @OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!bea", name = "g", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!bea", name = "h", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field3168;

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "[I")
    public static int[] field3159;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)V", line = 7)
    private final void method1534(boolean arg0) {
        field3152++;
        if (this.field3168 == null) {
            return;
        }
        this.field3168.removeKeyListener(this);
        this.field3168.removeFocusListener(this);
        this.field3168 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3167[var2] = false;
        }
        if (!arg0) {
            this.field3153.method1530((byte) 108);
            this.field3166.method1530((byte) 91);
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 38)
    public final void method1535(int arg0) {
        if (arg0 != -2) {
            this.method1540(-93, -113);
        }
        this.method1534(false);
        field3164++;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;Z)V", line = 49)
    private final void method1536(int arg0, KeyEvent arg1, boolean arg2) {
        field3162++;
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class99.field1679.length) {
            int var5 = class99.field1679[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0 && arg2) {
            this.method1537(false, var6, '\u0000', arg0);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZICI)V", line = 85)
    private final void method1537(boolean arg0, int arg1, char arg2, int arg3) {
        field3154++;
        class18 var5 = new class18();
        var5.field234 = arg1;
        var5.field229 = arg3;
        if (arg0) {
            this.method1534(false);
        }
        var5.field228 = arg2;
        var5.field227 = class742.method4128(1);
        this.field3166.method1526(var5, -43);
    }

    @OriginalMember(owner = "client!bea", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 103)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1536(1, arg0, true);
        field3148++;
    }

    @OriginalMember(owner = "client!bea", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 112)
    public final void focusGained(FocusEvent arg0) {
        field3150++;
    }

    @OriginalMember(owner = "client!bea", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 119)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3158++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class756.method4198(-128, var2)) {
            this.method1537(false, -1, var2, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V", line = 134)
    public final synchronized void method1538(byte arg0) {
        this.field3153.method1530((byte) 105);
        if (arg0 != -6) {
            field3157 = null;
        }
        field3163++;
        for (class18 var2 = (class18) this.field3166.method1521(arg0 + 130); var2 != null; var2 = (class18) this.field3166.method1521(arg0 + 127)) {
            var2.field240 = this.method1542(arg0 + 88);
            if (var2.field229 == 0) {
                if (!this.field3167[var2.field234]) {
                    class18 var3 = new class18();
                    var3.field228 = '\u0000';
                    var3.field234 = var2.field234;
                    var3.field229 = 0;
                    var3.field227 = var2.field227;
                    var3.field240 = var2.field240;
                    this.field3153.method1526(var3, -39);
                    this.field3167[var2.field234] = true;
                }
                var2.field229 = 2;
                this.field3153.method1526(var2, -22);
            } else if (var2.field229 == 1) {
                if (this.field3167[var2.field234]) {
                    this.field3153.method1526(var2, -23);
                    this.field3167[var2.field234] = false;
                }
            } else if (var2.field229 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field3167[var4]) {
                        class18 var5 = new class18();
                        var5.field227 = var2.field227;
                        var5.field234 = var4;
                        var5.field228 = '\u0000';
                        var5.field229 = 1;
                        var5.field240 = var2.field240;
                        this.field3153.method1526(var5, -110);
                        this.field3167[var4] = false;
                    }
                }
            } else if (var2.field229 == 3) {
                this.field3153.method1526(var2, arg0 ^ 0xFFFFFF93);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 225)
    private final void method1539(boolean arg0, Component arg1) {
        this.method1534(false);
        if (!arg0) {
            field3159 = null;
        }
        field3149++;
        this.field3168 = arg1;
        Method var3 = class367.field5117;
        if (var3 != null) {
            try {
                var3.invoke(this.field3168, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3168.addKeyListener(this);
        this.field3168.addFocusListener(this);
    }

    @OriginalMember(owner = "client!bea", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 253)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3160++;
        this.method1536(0, arg0, true);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z", line = 262)
    public final boolean method1540(int arg0, int arg1) {
        field3161++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 <= 115) {
                this.focusLost(null);
            }
            return this.field3167[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)Lou;", line = 283)
    public final class602 method1541(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field3151++;
            return (class602) this.field3153.method1521(123);
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 348)
    public class221(Component arg0) {
        class731.method4071(120);
        this.method1539(true, arg0);
    }

    @OriginalMember(owner = "client!bea", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 300)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3147++;
        this.method1537(false, 0, '\u0000', -1);
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)I", line = 308)
    private final int method1542(int arg0) {
        field3155++;
        int var2 = 0;
        if (this.field3167[81]) {
            var2 |= 0x1;
        }
        if (this.field3167[arg0]) {
            var2 |= 0x4;
        }
        if (this.field3167[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)V", line = 332)
    public static void method1543(int arg0) {
        field3159 = null;
        field3165 = null;
        field3157 = null;
        int var1 = -83 % ((-arg0 - 30) / 53);
    }
}
