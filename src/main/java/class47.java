import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class47 extends class232 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "Lfha;")
    private class522 field680 = new class522();

    @OriginalMember(owner = "client!jea", name = "u", descriptor = "Lfha;")
    private class522 field692 = new class522();

    @OriginalMember(owner = "client!jea", name = "v", descriptor = "[Z")
    private boolean[] field693 = new boolean[112];

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "Lqk;")
    public static class148 field677 = new class148(116, -2);

    @OriginalMember(owner = "client!jea", name = "t", descriptor = "Lqk;")
    public static class148 field691 = new class148(6, 3);

    @OriginalMember(owner = "client!jea", name = "x", descriptor = "Ljf;")
    public static class640 field695 = new class640(13, 16);

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!jea", name = "p", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!jea", name = "q", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!jea", name = "r", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!jea", name = "s", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!jea", name = "w", descriptor = "Ljava/awt/Component;")
    private Component field694;

    @OriginalMember(owner = "client!jea", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 4)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method324(arg0, 85, 1);
        field675++;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)Z", line = 14)
    public final boolean method315(int arg0, int arg1) {
        field681++;
        int var3 = 96 / ((38 - arg0) / 32);
        return arg1 >= 0 && arg1 < 112 ? this.field693[arg1] : false;
    }

    @OriginalMember(owner = "client!jea", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 27)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field688++;
        this.method324(arg0, 116, 0);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BICI)V", line = 36)
    private final void method316(byte arg0, int arg1, char arg2, int arg3) {
        field676++;
        class683 var5 = new class683();
        var5.field9596 = arg2;
        var5.field9595 = arg1;
        var5.field9601 = arg3;
        var5.field9604 = class224.method1457((byte) -62);
        if (arg0 >= 37) {
            this.field692.method3116(29066, var5);
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 55)
    private final void method317(Component arg0, boolean arg1) {
        this.method321(0);
        field679++;
        this.field694 = arg0;
        Method var3 = class613.field8726;
        if (!arg1) {
            this.field692 = null;
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field694, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field694.addKeyListener(this);
        this.field694.addFocusListener(this);
    }

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "(I)I", line = 85)
    private final int method318(int arg0) {
        field689++;
        int var2 = 0;
        if (this.field693[81]) {
            var2 |= 0x1;
        }
        if (this.field693[82]) {
            var2 |= 0x4;
        }
        if (this.field693[86]) {
            var2 |= 0x2;
        }
        int var3 = -51 / ((-arg0 - 24) / 60);
        return var2;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V", line = 108)
    public final void method319(int arg0) {
        field684++;
        this.method321(0);
        if (arg0 != 31304) {
            this.method319(-22);
        }
    }

    @OriginalMember(owner = "client!jea", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 119)
    public final void focusGained(FocusEvent arg0) {
        field678++;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)Luea;", line = 128)
    public final class243 method320(int arg0) {
        field683++;
        if (arg0 <= 67) {
            field695 = null;
        }
        return (class243) this.field680.method3115(true);
    }

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "(I)V", line = 142)
    private final void method321(int arg0) {
        field685++;
        if (this.field694 == null) {
            return;
        }
        this.field694.removeKeyListener(this);
        this.field694.removeFocusListener(this);
        this.field694 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field693[var2] = false;
        }
        this.field680.method3122(arg0);
        this.field692.method3122(arg0);
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)V", line = 169)
    public final synchronized void method322(int arg0) {
        this.field680.method3122(arg0 ^ arg0);
        field687++;
        for (class683 var2 = (class683) this.field692.method3115(true); var2 != null; var2 = (class683) this.field692.method3115(true)) {
            var2.field9598 = this.method318(arg0 + 69);
            if (var2.field9601 == 0) {
                if (!this.field693[var2.field9595]) {
                    class683 var3 = new class683();
                    var3.field9604 = var2.field9604;
                    var3.field9595 = var2.field9595;
                    var3.field9598 = var2.field9598;
                    var3.field9601 = 0;
                    var3.field9596 = '\u0000';
                    this.field680.method3116(arg0 ^ 0x718A, var3);
                    this.field693[var2.field9595] = true;
                }
                var2.field9601 = 2;
                this.field680.method3116(29066, var2);
            } else if (var2.field9601 == 1) {
                if (this.field693[var2.field9595]) {
                    this.field680.method3116(29066, var2);
                    this.field693[var2.field9595] = false;
                }
            } else if (var2.field9601 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field693[var4]) {
                        class683 var5 = new class683();
                        var5.field9604 = var2.field9604;
                        var5.field9598 = var2.field9598;
                        var5.field9601 = 1;
                        var5.field9596 = '\u0000';
                        var5.field9595 = var4;
                        this.field680.method3116(arg0 + 29066, var5);
                        this.field693[var4] = false;
                    }
                }
            } else if (var2.field9601 == 3) {
                this.field680.method3116(29066, var2);
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 257)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method316((byte) 48, 0, '\u0000', -1);
        field682++;
    }

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "(I)V", line = 265)
    public static void method323(int arg0) {
        field691 = null;
        field677 = null;
        if (arg0 < 105) {
            field677 = null;
        }
        field695 = null;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 352)
    public class47(Component arg0) {
        class49.method332(13381);
        this.method317(arg0, true);
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 282)
    private final void method324(KeyEvent arg0, int arg1, int arg2) {
        field686++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class62.field837.length) {
            int var5 = class62.field837[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0 && arg1 >= 20) {
            this.method316((byte) 40, var6, '\u0000', arg2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jea", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 320)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field690++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class214.method1412(-1, var2)) {
            this.method316((byte) 59, -1, var2, 3);
            arg0.consume();
        }
    }
}
