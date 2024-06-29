import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class207 extends class89 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lsu;")
    private class192 field3053 = new class192();

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "Lsu;")
    private class192 field3066 = new class192();

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "[Z")
    private boolean[] field3071 = new boolean[112];

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lada;")
    public static class149 field3062;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field3069;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Lgm;")
    public final class109 method664(byte arg0) {
        field3070++;
        if (arg0 != -126) {
            this.method664((byte) 24);
        }
        return (class109) this.field3053.method1272(0);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method1367(Component arg0, byte arg1) {
        field3055++;
        this.method1372(arg1 ^ 0x4C);
        this.field3069 = arg0;
        Method var3 = class79.field1089;
        if (var3 != null) {
            try {
                var3.invoke(this.field3069, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3069.addKeyListener(this);
        this.field3069.addFocusListener(this);
        if (arg1 != 39) {
            this.field3066 = null;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBIC)V")
    private final void method1368(int arg0, byte arg1, int arg2, char arg3) {
        if (arg1 >= -111) {
            this.method1367(null, (byte) 47);
        }
        field3060++;
        class546 var5 = new class546();
        var5.field7404 = arg3;
        var5.field7405 = arg0;
        var5.field7398 = arg2;
        var5.field7395 = class680.method3756(-23);
        this.field3066.method1273(var5, (byte) 122);
    }

    @OriginalMember(owner = "client!rt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3058++;
    }

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "(B)I")
    public static final int method1369(byte arg0) {
        field3052++;
        return arg0 > -103 ? -110 : 46;
    }

    @OriginalMember(owner = "client!rt", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3054++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class287.method1730((byte) -114, var2)) {
            this.method1368(-1, (byte) -115, 3, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
    private final int method1370(boolean arg0) {
        field3063++;
        int var2 = 0;
        if (this.field3071[81]) {
            var2 |= 0x1;
        }
        if (this.field3071[82]) {
            var2 |= 0x4;
        }
        if (arg0) {
            if (this.field3071[86]) {
                var2 |= 0x2;
            }
            return var2;
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!rt", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3061++;
        this.method1373(1, true, arg0);
    }

    @OriginalMember(owner = "client!rt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1368(0, (byte) -113, -1, '\u0000');
        field3057++;
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)V")
    public static void method1371(byte arg0) {
        if (arg0 != -41) {
            field3062 = null;
        }
        field3062 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
    private final void method1372(int arg0) {
        field3059++;
        if (this.field3069 == null) {
            return;
        }
        this.field3069.removeKeyListener(this);
        this.field3069.removeFocusListener(this);
        this.field3069 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3071[var2] = false;
        }
        this.field3053.method1269((byte) 96);
        if (arg0 >= 63) {
            this.field3066.method1269((byte) 114);
        }
    }

    @OriginalMember(owner = "client!rt", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3064++;
        this.method1373(0, true, arg0);
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
    public final synchronized void method667(byte arg0) {
        field3067++;
        this.field3053.method1269((byte) 86);
        class546 var2 = (class546) this.field3066.method1272(0);
        int var3 = 20 % ((arg0 - 18) / 42);
        while (var2 != null) {
            var2.field7396 = this.method1370(true);
            if (var2.field7398 == 0) {
                if (!this.field3071[var2.field7405]) {
                    class546 var4 = new class546();
                    var4.field7398 = 0;
                    var4.field7404 = '\u0000';
                    var4.field7405 = var2.field7405;
                    var4.field7395 = var2.field7395;
                    var4.field7396 = var2.field7396;
                    this.field3053.method1273(var4, (byte) 122);
                    this.field3071[var2.field7405] = true;
                }
                var2.field7398 = 2;
                this.field3053.method1273(var2, (byte) 122);
            } else if (var2.field7398 == 1) {
                if (this.field3071[var2.field7405]) {
                    this.field3053.method1273(var2, (byte) 122);
                    this.field3071[var2.field7405] = false;
                }
            } else if (var2.field7398 == -1) {
                for (int var5 = 0; var5 < 112; var5++) {
                    if (this.field3071[var5]) {
                        class546 var6 = new class546();
                        var6.field7404 = '\u0000';
                        var6.field7396 = var2.field7396;
                        var6.field7395 = var2.field7395;
                        var6.field7398 = 1;
                        var6.field7405 = var5;
                        this.field3053.method1273(var6, (byte) 122);
                        this.field3071[var5] = false;
                    }
                }
            } else if (var2.field7398 == 3) {
                this.field3053.method1273(var2, (byte) 122);
            }
            var2 = (class546) this.field3066.method1272(0);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)Z")
    public final boolean method666(int arg0, int arg1) {
        field3068++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 != 50) {
                this.field3053 = null;
            }
            return this.field3071[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
    private final void method1373(int arg0, boolean arg1, KeyEvent arg2) {
        field3056++;
        if (!arg1) {
            this.field3053 = null;
        }
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class656.field9238.length) {
            int var6 = class656.field9238[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1368(var5, (byte) -114, arg0, '\u0000');
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
    public final void method669(byte arg0) {
        this.method1372(103);
        int var2 = -29 / ((arg0 - 53) / 57);
        field3065++;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class207(Component arg0) {
        class189.method1259(-9381);
        this.method1367(arg0, (byte) 39);
    }
}
