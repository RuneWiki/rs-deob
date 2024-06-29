import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class247 extends class31 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!uha", name = "r", descriptor = "Lfh;")
    private class653 field3183 = new class653();

    @OriginalMember(owner = "client!uha", name = "t", descriptor = "Lfh;")
    private class653 field3185 = new class653();

    @OriginalMember(owner = "client!uha", name = "v", descriptor = "[Z")
    private boolean[] field3187 = new boolean[112];

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!uha", name = "g", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!uha", name = "h", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!uha", name = "i", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!uha", name = "j", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!uha", name = "k", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!uha", name = "l", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!uha", name = "m", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!uha", name = "n", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!uha", name = "o", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!uha", name = "p", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!uha", name = "q", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!uha", name = "s", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!uha", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field3186;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)Z")
    public final boolean method207(int arg0, int arg1) {
        if (arg1 == 20541) {
            field3179++;
            return arg0 >= 0 && arg0 < 112 ? this.field3187[arg0] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1531((byte) -67, arg0, 0);
        field3170++;
    }

    @OriginalMember(owner = "client!uha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3180++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class54.method399(var2, (byte) -87)) {
            this.method1529(var2, -121, -1, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)V")
    private final void method1528(int arg0) {
        field3175++;
        if (this.field3186 == null) {
            return;
        }
        if (arg0 <= 49) {
            this.method1531((byte) -111, null, 120);
        }
        this.field3186.removeKeyListener(this);
        this.field3186.removeFocusListener(this);
        this.field3186 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3187[var2] = false;
        }
        this.field3183.method3668(0);
        this.field3185.method3668(0);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)V")
    public final synchronized void method210(byte arg0) {
        if (arg0 != -17) {
            this.method209(114);
        }
        this.field3183.method3668(0);
        field3178++;
        for (class365 var2 = (class365) this.field3185.method3665(23290); var2 != null; var2 = (class365) this.field3185.method3665(23290)) {
            var2.field4696 = this.method1532(0);
            if (var2.field4698 == 0) {
                if (!this.field3187[var2.field4706]) {
                    class365 var5 = new class365();
                    var5.field4701 = '\u0000';
                    var5.field4702 = var2.field4702;
                    var5.field4696 = var2.field4696;
                    var5.field4706 = var2.field4706;
                    var5.field4698 = 0;
                    this.field3183.method3671(var5, false);
                    this.field3187[var2.field4706] = true;
                }
                var2.field4698 = 2;
                this.field3183.method3671(var2, false);
            } else if (var2.field4698 == 1) {
                if (this.field3187[var2.field4706]) {
                    this.field3183.method3671(var2, false);
                    this.field3187[var2.field4706] = false;
                }
            } else if (var2.field4698 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field3187[var3]) {
                        class365 var4 = new class365();
                        var4.field4696 = var2.field4696;
                        var4.field4701 = '\u0000';
                        var4.field4706 = var3;
                        var4.field4702 = var2.field4702;
                        var4.field4698 = 1;
                        this.field3183.method3671(var4, false);
                        this.field3187[var3] = false;
                    }
                }
            } else if (var2.field4698 == 3) {
                this.field3183.method3671(var2, false);
            }
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(CIII)V")
    private final void method1529(char arg0, int arg1, int arg2, int arg3) {
        field3184++;
        class365 var5 = new class365();
        var5.field4698 = arg3;
        var5.field4701 = arg0;
        var5.field4706 = arg2;
        var5.field4702 = class446.method2525(500);
        this.field3185.method3671(var5, false);
        if (arg1 >= -102) {
            this.method1531((byte) -125, null, -113);
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)V")
    public static final void method1530(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class498.field7019 != null) {
            class498.field7019[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class197.field2682 != null) {
            class197.field2682[arg0][arg1] = (short) arg3;
        }
        if (class223.field2984 != null) {
            class223.field2984[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;I)V")
    private final void method1531(byte arg0, KeyEvent arg1, int arg2) {
        field3171++;
        int var4 = arg1.getKeyCode();
        if (arg0 != -67) {
            this.method1531((byte) -66, null, -117);
        }
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class589.field8254.length) {
            int var6 = class589.field8254[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1529('\u0000', -114, var5, arg2);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)I")
    private final int method1532(int arg0) {
        field3181++;
        int var2 = arg0;
        if (this.field3187[81]) {
            var2 = arg0 | 0x1;
        }
        if (this.field3187[82]) {
            var2 |= 0x4;
        }
        if (this.field3187[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1531((byte) -67, arg0, 1);
        field3177++;
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method1533(Component arg0, int arg1) {
        this.method1528(61);
        if (arg1 != 12445) {
            this.field3183 = null;
        }
        field3182++;
        this.field3186 = arg0;
        Method var3 = class465.field6238;
        if (var3 != null) {
            try {
                var3.invoke(this.field3186, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3186.addKeyListener(this);
        this.field3186.addFocusListener(this);
    }

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)Lno;")
    public final class704 method208(int arg0) {
        field3174++;
        if (arg0 < 110) {
            this.field3186 = null;
        }
        return (class704) this.field3183.method3665(23290);
    }

    @OriginalMember(owner = "client!uha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3172++;
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
    public final void method209(int arg0) {
        field3176++;
        this.method1528(74);
        if (arg0 >= -86) {
            this.field3185 = null;
        }
    }

    @OriginalMember(owner = "client!uha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1529('\u0000', -126, 0, -1);
        field3173++;
    }

    @OriginalMember(owner = "client!uha", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class247(Component arg0) {
        class2.method5(11336);
        this.method1533(arg0, 12445);
    }
}
