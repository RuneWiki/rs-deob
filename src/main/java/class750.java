import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class750 extends class458 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "Lga;")
    private class420 field10397 = new class420();

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "Lga;")
    private class420 field10401 = new class420();

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "[Z")
    private boolean[] field10403 = new boolean[112];

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "Ljo;")
    public static class351 field10394 = new class351(37, 3);

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field10386;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field10388;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
    public static int field10389;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field10391;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field10396;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "Ljava/awt/Component;")
    private Component field10402;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "[Ls;")
    public static class292[] field10395;

    @OriginalMember(owner = "client!hn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 6)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field10386++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class727.method4082(var2, (byte) -20)) {
            this.method4166(var2, -24452, 3, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(CIII)V", line = 22)
    private final void method4166(char arg0, int arg1, int arg2, int arg3) {
        field10400++;
        if (arg1 != -24452) {
            field10395 = null;
        }
        class450 var5 = new class450();
        var5.field6454 = arg3;
        var5.field6455 = arg0;
        var5.field6450 = arg2;
        var5.field6458 = class109.method731(87);
        this.field10401.method2510(var5, false);
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 40)
    public static void method4167(int arg0) {
        field10394 = null;
        field10395 = null;
        if (arg0 != -1) {
            method4167(113);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V", line = 51)
    private final void method4168(int arg0, KeyEvent arg1, int arg2) {
        field10399++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class74.field996.length) {
            int var6 = class74.field996[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (~var5 != arg0) {
            this.method4166('\u0000', arg0 ^ 0x5F83, arg2, var5);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 85)
    private final void method4169(byte arg0) {
        field10385++;
        if (this.field10402 == null) {
            return;
        }
        this.field10402.removeKeyListener(this);
        if (arg0 >= -65) {
            this.method2734(126);
        }
        this.field10402.removeFocusListener(this);
        this.field10402 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field10403[var2] = false;
        }
        this.field10397.method2503(10);
        this.field10401.method2503(10);
    }

    @OriginalMember(owner = "client!hn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 113)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field10387++;
        this.method4168(-1, arg0, 1);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 122)
    public final void method2734(int arg0) {
        this.method4169((byte) -124);
        field10391++;
        if (arg0 >= -123) {
            this.field10397 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 133)
    public final synchronized void focusLost(FocusEvent arg0) {
        field10390++;
        this.method4166('\u0000', -24452, -1, 0);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I", line = 145)
    private final int method4170(byte arg0) {
        field10398++;
        int var2 = 50 / ((arg0 - 47) / 41);
        int var3 = 0;
        if (this.field10403[81]) {
            var3 |= 0x1;
        }
        if (this.field10403[82]) {
            var3 |= 0x4;
        }
        if (this.field10403[86]) {
            var3 |= 0x2;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 167)
    public final synchronized void method2735(int arg0) {
        field10396++;
        this.field10397.method2503(10);
        if (arg0 != 0) {
            return;
        }
        for (class450 var2 = (class450) this.field10401.method2507(-123); var2 != null; var2 = (class450) this.field10401.method2507(arg0 - 105)) {
            var2.field6453 = this.method4170((byte) 115);
            if (var2.field6450 == 0) {
                if (!this.field10403[var2.field6454]) {
                    class450 var5 = new class450();
                    var5.field6450 = 0;
                    var5.field6454 = var2.field6454;
                    var5.field6455 = '\u0000';
                    var5.field6453 = var2.field6453;
                    var5.field6458 = var2.field6458;
                    this.field10397.method2510(var5, false);
                    this.field10403[var2.field6454] = true;
                }
                var2.field6450 = 2;
                this.field10397.method2510(var2, false);
            } else if (var2.field6450 == 1) {
                if (this.field10403[var2.field6454]) {
                    this.field10397.method2510(var2, false);
                    this.field10403[var2.field6454] = false;
                }
            } else if (var2.field6450 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field10403[var3]) {
                        class450 var4 = new class450();
                        var4.field6450 = 1;
                        var4.field6455 = '\u0000';
                        var4.field6454 = var3;
                        var4.field6453 = var2.field6453;
                        var4.field6458 = var2.field6458;
                        this.field10397.method2510(var4, false);
                        this.field10403[var3] = false;
                    }
                }
            } else if (var2.field6450 == 3) {
                this.field10397.method2510(var2, false);
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 257)
    private final void method4171(Component arg0, byte arg1) {
        this.method4169((byte) -85);
        field10389++;
        this.field10402 = arg0;
        Method var3 = class590.field8340;
        if (var3 != null) {
            try {
                var3.invoke(this.field10402, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field10402.addKeyListener(this);
        if (arg1 != 60) {
            this.focusLost(null);
        }
        this.field10402.addFocusListener(this);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z", line = 284)
    public final boolean method2733(int arg0, int arg1) {
        field10384++;
        if (arg0 < 74) {
            return false;
        } else if (arg1 >= 0 && arg1 < 112) {
            return this.field10403[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 300)
    public final void focusGained(FocusEvent arg0) {
        field10388++;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 347)
    public class750(Component arg0) {
        class692.method3896((byte) -70);
        this.method4171(arg0, (byte) 60);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Lnfa;", line = 315)
    public final class706 method2731(int arg0) {
        if (arg0 == 0) {
            field10392++;
            return (class706) this.field10397.method2507(-98);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 326)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method4168(-1, arg0, 0);
        field10393++;
    }
}
