import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class507 extends class322 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lbv;")
    private class568 field7061 = new class568();

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Lbv;")
    private class568 field7070 = new class568();

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "[Z")
    private boolean[] field7077 = new boolean[112];

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lgn;")
    public static class635 field7076 = new class635();

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lhda;")
    public static class245 field7063;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "Lim;")
    public static class353 field7078;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/awt/Component;")
    private Component field7079;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method2835(KeyEvent arg0, int arg1, int arg2) {
        field7068++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class442.field6085.length) {
            int var6 = class442.field6085[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 == 0) {
            return;
        }
        if (arg2 != -31079) {
            this.focusGained(null);
        }
        this.method2837('\u0000', var5, arg1, -120);
        arg0.consume();
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public static void method2836(int arg0) {
        if (arg0 != -12788) {
            method2836(87);
        }
        field7078 = null;
        field7076 = null;
        field7063 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(CIII)V")
    private final void method2837(char arg0, int arg1, int arg2, int arg3) {
        field7062++;
        class402 var5 = new class402();
        var5.field5499 = arg1;
        var5.field5498 = arg2;
        var5.field5495 = arg0;
        var5.field5492 = class348.method2175(-127);
        if (arg3 <= -119) {
            this.field7070.method3181(var5, true);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Lpm;")
    public final class129 method2003(boolean arg0) {
        field7059++;
        return arg0 ? (class129) this.field7061.method3184(-5295) : null;
    }

    @OriginalMember(owner = "client!dk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field7066++;
        this.method2837('\u0000', 0, -1, -121);
    }

    @OriginalMember(owner = "client!dk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field7075++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Z")
    public final boolean method2004(byte arg0, int arg1) {
        int var3 = 14 % ((arg0 - 37) / 42);
        field7073++;
        return arg1 >= 0 && arg1 < 112 ? this.field7077[arg1] : false;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    private final void method2838(int arg0) {
        field7064++;
        if (this.field7079 == null) {
            return;
        }
        this.field7079.removeKeyListener(this);
        this.field7079.removeFocusListener(this);
        this.field7079 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field7077[var2] = false;
        }
        if (arg0 == 25395) {
            this.field7061.method3178(-8299);
            this.field7070.method3178(arg0 ^ 0xFFFFBCA6);
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)I")
    private final int method2839(int arg0) {
        field7071++;
        int var2 = arg0;
        if (this.field7077[81]) {
            var2 = arg0 | 0x1;
        }
        if (this.field7077[82]) {
            var2 |= 0x4;
        }
        if (this.field7077[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field7060++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class590.method3409(var2, (byte) 126)) {
            this.method2837(var2, -1, 3, -121);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field7072++;
        this.method2835(arg0, 1, -31079);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public final synchronized void method2005(byte arg0) {
        field7074++;
        this.field7061.method3178(-8299);
        for (class402 var2 = (class402) this.field7070.method3184(-5295); var2 != null; var2 = (class402) this.field7070.method3184(-5295)) {
            var2.field5491 = this.method2839(0);
            if (var2.field5498 == 0) {
                if (!this.field7077[var2.field5499]) {
                    class402 var3 = new class402();
                    var3.field5498 = 0;
                    var3.field5499 = var2.field5499;
                    var3.field5491 = var2.field5491;
                    var3.field5492 = var2.field5492;
                    var3.field5495 = '\u0000';
                    this.field7061.method3181(var3, true);
                    this.field7077[var2.field5499] = true;
                }
                var2.field5498 = 2;
                this.field7061.method3181(var2, true);
            } else if (var2.field5498 == 1) {
                if (this.field7077[var2.field5499]) {
                    this.field7061.method3181(var2, true);
                    this.field7077[var2.field5499] = false;
                }
            } else if (var2.field5498 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field7077[var4]) {
                        class402 var5 = new class402();
                        var5.field5491 = var2.field5491;
                        var5.field5498 = 1;
                        var5.field5499 = var4;
                        var5.field5495 = '\u0000';
                        var5.field5492 = var2.field5492;
                        this.field7061.method3181(var5, true);
                        this.field7077[var4] = false;
                    }
                }
            } else if (var2.field5498 == 3) {
                this.field7061.method3181(var2, true);
            }
        }
        if (arg0 >= -72) {
            this.method2004((byte) 42, -110);
        }
    }

    @OriginalMember(owner = "client!dk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2835(arg0, 0, -31079);
        field7069++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method2002(int arg0) {
        field7065++;
        if (arg0 <= 72) {
            this.field7070 = null;
        }
        this.method2838(25395);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2840(int arg0, Component arg1) {
        field7067++;
        this.method2838(25395);
        this.field7079 = arg1;
        Method var3 = class279.field3651;
        if (arg0 >= -121) {
            this.focusLost(null);
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field7079, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field7079.addKeyListener(this);
        this.field7079.addFocusListener(this);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class507(Component arg0) {
        class508.method2844(119);
        this.method2840(-127, arg0);
    }
}
