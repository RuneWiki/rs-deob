import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class361 extends class645 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "Lfea;")
    private class47 field5131 = new class47();

    @OriginalMember(owner = "client!qu", name = "u", descriptor = "Lfea;")
    private class47 field5138 = new class47();

    @OriginalMember(owner = "client!qu", name = "x", descriptor = "[Z")
    private boolean[] field5141 = new boolean[112];

    @OriginalMember(owner = "client!qu", name = "w", descriptor = "Z")
    public static boolean field5140 = false;

    @OriginalMember(owner = "client!qu", name = "r", descriptor = "Liu;")
    public static class517 field5135 = new class517(74, -1);

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!qu", name = "s", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!qu", name = "t", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "Lui;")
    public static class587 field5125;

    @OriginalMember(owner = "client!qu", name = "v", descriptor = "Ljava/awt/Component;")
    private Component field5139;

    @OriginalMember(owner = "client!qu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5137++;
    }

    @OriginalMember(owner = "client!qu", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field5130++;
        this.method2180(arg0, 1, true);
    }

    @OriginalMember(owner = "client!qu", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field5123++;
        this.method2180(arg0, 0, true);
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
    private final void method2175(boolean arg0) {
        field5128++;
        if (this.field5139 == null) {
            return;
        }
        this.field5139.removeKeyListener(this);
        this.field5139.removeFocusListener(this);
        this.field5139 = null;
        if (!arg0) {
            this.keyPressed(null);
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field5141[var2] = false;
        }
        this.field5131.method425(-104);
        this.field5138.method425(-34);
    }

    @OriginalMember(owner = "client!qu", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5126++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class46.method411(var2, true)) {
            this.method2178(-1, (byte) 107, var2, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)Lbs;")
    public final class200 method2176(boolean arg0) {
        if (!arg0) {
            this.method2180(null, -73, true);
        }
        field5121++;
        return (class200) this.field5131.method417((byte) 51);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    public final void method2177(int arg0) {
        this.method2175(true);
        field5134++;
        if (arg0 != 0) {
            this.keyTyped(null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBCI)V")
    private final void method2178(int arg0, byte arg1, char arg2, int arg3) {
        if (arg1 != 107) {
            this.keyTyped(null);
        }
        field5124++;
        class95 var5 = new class95();
        var5.field1660 = arg3;
        var5.field1673 = arg2;
        var5.field1669 = arg0;
        var5.field1671 = class508.method2860(false);
        this.field5138.method414(var5, (byte) 16);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public final synchronized void method2179(byte arg0) {
        field5129++;
        this.field5131.method425(-89);
        for (class95 var2 = (class95) this.field5138.method417((byte) 51); var2 != null; var2 = (class95) this.field5138.method417((byte) 51)) {
            var2.field1664 = this.method2182((byte) -85);
            if (var2.field1660 == 0) {
                if (!this.field5141[var2.field1669]) {
                    class95 var3 = new class95();
                    var3.field1664 = var2.field1664;
                    var3.field1669 = var2.field1669;
                    var3.field1660 = 0;
                    var3.field1671 = var2.field1671;
                    var3.field1673 = '\u0000';
                    this.field5131.method414(var3, (byte) 106);
                    this.field5141[var2.field1669] = true;
                }
                var2.field1660 = 2;
                this.field5131.method414(var2, (byte) 126);
            } else if (var2.field1660 == 1) {
                if (this.field5141[var2.field1669]) {
                    this.field5131.method414(var2, (byte) 102);
                    this.field5141[var2.field1669] = false;
                }
            } else if (var2.field1660 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field5141[var4]) {
                        class95 var5 = new class95();
                        var5.field1671 = var2.field1671;
                        var5.field1669 = var4;
                        var5.field1673 = '\u0000';
                        var5.field1660 = 1;
                        var5.field1664 = var2.field1664;
                        this.field5131.method414(var5, (byte) 55);
                        this.field5141[var4] = false;
                    }
                }
            } else if (var2.field1660 == 3) {
                this.field5131.method414(var2, (byte) 96);
            }
        }
        if (arg0 > -123) {
            this.method2175(true);
        }
    }

    @OriginalMember(owner = "client!qu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2178(0, (byte) 107, '\u0000', -1);
        field5136++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V")
    private final void method2180(KeyEvent arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method2184(42);
        }
        field5122++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class524.field7286.length > var4) {
            int var6 = class524.field7286[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2178(var5, (byte) 107, '\u0000', arg1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method2181(Component arg0, boolean arg1) {
        field5132++;
        this.method2175(arg1);
        if (!arg1) {
            return;
        }
        this.field5139 = arg0;
        Method var3 = class40.field565;
        if (var3 != null) {
            try {
                var3.invoke(this.field5139, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field5139.addKeyListener(this);
        this.field5139.addFocusListener(this);
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)I")
    private final int method2182(byte arg0) {
        field5127++;
        int var2 = 0;
        int var3 = 127 % ((arg0 + 39) / 40);
        if (this.field5141[81]) {
            var2 |= 0x1;
        }
        if (this.field5141[82]) {
            var2 |= 0x4;
        }
        if (this.field5141[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ)Z")
    public final boolean method2183(int arg0, boolean arg1) {
        field5133++;
        if (arg0 >= 0 && arg0 < 112) {
            if (arg1) {
                this.field5138 = null;
            }
            return this.field5141[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
    public static void method2184(int arg0) {
        field5135 = null;
        if (arg0 == 1) {
            field5125 = null;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class361(Component arg0) {
        class34.method308(-103);
        this.method2181(arg0, true);
    }

    static {
        new class567("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
