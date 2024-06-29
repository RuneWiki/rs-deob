import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class479 extends class152 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "[Z")
    private boolean[] field6904 = new boolean[112];

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public static int field6897 = 0;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "Lve;")
    private class350 field6892;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "Lve;")
    private class350 field6905;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "Lve;")
    private class350 field6907;

    @OriginalMember(owner = "client!lt", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field6911;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)Z")
    public final boolean method1045(int arg0, byte arg1) {
        field6898++;
        int var3 = -8 % ((arg1 - 37) / 49);
        return arg0 >= 0 && arg0 < 112 ? this.field6904[arg0] : false;
    }

    @OriginalMember(owner = "client!lt", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2880(0, false, arg0);
        field6906++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2879(int arg0, Component arg1) {
        this.method2881(arg0);
        field6894++;
        this.field6911 = arg1;
        Method var3 = class352.field5208;
        if (var3 != null) {
            try {
                var3.invoke(this.field6911, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6911.addKeyListener(this);
        this.field6911.addFocusListener(this);
    }

    @OriginalMember(owner = "client!lt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field6899++;
        this.method2882(0, 0, -1, '\u0000');
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)Lup;")
    public final class183 method1048(int arg0) {
        field6901++;
        class350 var2;
        for (var2 = this.field6892; var2 != null && var2.field5177 == -1; var2 = var2.field5168) {
        }
        if (var2 == null) {
            this.field6892 = null;
        } else {
            this.field6892 = var2.field5168;
        }
        return arg0 == 0 ? var2 : null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
    private final void method2880(int arg0, boolean arg1, KeyEvent arg2) {
        field6903++;
        if (arg1) {
            return;
        }
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class446.field6544.length > var4) {
            int var6 = class446.field6544[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2882(0, var5, arg0, '\u0000');
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)V")
    private final void method2881(int arg0) {
        field6908++;
        if (this.field6911 == null) {
            return;
        }
        this.field6911.removeKeyListener(this);
        this.field6911.removeFocusListener(this);
        this.field6911 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field6904[var2] = false;
        }
        this.field6905 = null;
        this.field6892 = null;
        this.field6907 = null;
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V")
    public final void method1049(int arg0) {
        if (arg0 < 126) {
            this.field6892 = null;
        }
        this.method2881(0);
        field6900++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
    public final synchronized void method1047(int arg0) {
        field6895++;
        if (arg0 < 113) {
            this.field6892 = null;
        }
        for (class350 var2 = this.field6907; var2 != null; var2 = var2.field5168) {
            if (var2.field5177 == 0) {
                if (var2.field5178 >= 0) {
                    var2.field5172 = !this.field6904[var2.field5178];
                }
                this.field6904[var2.field5178] = true;
            } else if (var2.field5177 == 1) {
                this.field6904[var2.field5178] = false;
            } else if (var2.field5177 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field6904[var3] = false;
                }
            }
        }
        this.field6892 = this.field6907;
        this.field6905 = null;
        this.field6907 = null;
    }

    @OriginalMember(owner = "client!lt", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6909++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class388.method2427(-6469, var2)) {
            this.method2882(0, -1, 2, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIC)V")
    private final void method2882(int arg0, int arg1, int arg2, char arg3) {
        field6902++;
        class350 var5 = new class350();
        var5.field5177 = arg2;
        var5.field5180 = arg3;
        var5.field5178 = arg1;
        var5.field5167 = class493.method2937(-105);
        if (this.field6905 == null) {
            this.field6907 = var5;
        } else {
            this.field6905.field5168 = var5;
        }
        this.field6905 = var5;
        if (arg0 != 0) {
            this.method1049(29);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BIZ)V")
    public static final void method2883(byte arg0, int arg1, boolean arg2) {
        field6893++;
        class240 var3 = class516.method3061((byte) -30, arg2, arg1);
        if (arg0 != 1) {
            field6897 = 42;
        }
        if (var3 != null) {
            var3.method2677(-22491);
        }
    }

    @OriginalMember(owner = "client!lt", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field6910++;
        this.method2880(1, false, arg0);
    }

    @OriginalMember(owner = "client!lt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6896++;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class479(Component arg0) {
        class17.method143(42);
        this.method2879(0, arg0);
    }
}
