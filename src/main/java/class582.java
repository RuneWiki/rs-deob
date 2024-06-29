import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class582 extends class52 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gba", name = "v", descriptor = "Leea;")
    private class114 field8385 = new class114();

    @OriginalMember(owner = "client!gba", name = "x", descriptor = "Leea;")
    private class114 field8387 = new class114();

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "[Z")
    private boolean[] field8389 = new boolean[112];

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!gba", name = "u", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!gba", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field8388;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 5)
    private final void method3373(Component arg0, byte arg1) {
        this.method3374(112);
        field8380++;
        int var3 = 114 % ((-arg1 - 2) / 52);
        this.field8388 = arg0;
        Method var4 = class545.field7797;
        if (var4 != null) {
            try {
                var4.invoke(this.field8388, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field8388.addKeyListener(this);
        this.field8388.addFocusListener(this);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)Z", line = 31)
    public final boolean method284(int arg0, int arg1) {
        field8375++;
        int var3 = 108 % ((-arg0 - 17) / 48);
        return arg1 >= 0 && arg1 < 112 ? this.field8389[arg1] : false;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V", line = 48)
    private final void method3374(int arg0) {
        field8376++;
        if (this.field8388 == null) {
            return;
        }
        this.field8388.removeKeyListener(this);
        this.field8388.removeFocusListener(this);
        this.field8388 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field8389[var2] = false;
        }
        if (arg0 != 112) {
            field8384 = -48;
        }
        this.field8385.method718(-116);
        this.field8387.method718(-121);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIC)V", line = 77)
    private final void method3375(int arg0, int arg1, int arg2, char arg3) {
        field8368++;
        class342 var5 = new class342();
        var5.field4883 = arg3;
        var5.field4881 = arg1;
        var5.field4873 = arg2;
        var5.field4878 = class84.method550((byte) -103);
        int var6 = 103 % ((arg0 - 1) / 50);
        this.field8387.method706(var5, true);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IBI)Z", line = 96)
    public static final boolean method3376(int arg0, byte arg1, int arg2) {
        field8379++;
        if (arg1 >= -104) {
            method3376(55, (byte) 85, -94);
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!gba", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 108)
    public final void focusGained(FocusEvent arg0) {
        field8377++;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 116)
    public static final void method3377(String arg0, int arg1, int arg2) {
        field8371++;
        class159.field1963++;
        class308.method2044(class377.field5742, -7434);
        class468.field6960.method1205((byte) -69, arg2 + class456.method2816(-103, arg0));
        class468.field6960.method1202((byte) 84, arg1);
        class468.field6960.method1237(arg2 ^ 0x3E8ABD51, arg0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IBIII)Z", line = 128)
    public static final boolean method3378(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field8378++;
        if ((class443.field6617[0][arg0][arg2] & 0x2) != 0) {
            return true;
        } else if ((class443.field6617[arg4][arg0][arg2] & 0x10) == 0) {
            if (arg1 != -74) {
                method3378(-75, (byte) -70, -107, 81, 14);
            }
            return arg3 == class408.method2584(arg2, -116, arg0, arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V", line = 149)
    public final void method285(int arg0) {
        field8386++;
        if (arg0 != 1) {
            this.method284(-37, 42);
        }
        this.method3374(arg0 + 111);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)Lcba;", line = 162)
    public final class478 method286(byte arg0) {
        if (arg0 != -87) {
            this.keyPressed(null);
        }
        field8372++;
        return (class478) this.field8385.method714(true);
    }

    @OriginalMember(owner = "client!gba", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 173)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field8381++;
        this.method3379(0, 0, arg0);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V", line = 181)
    private final void method3379(int arg0, int arg1, KeyEvent arg2) {
        field8373++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class479.field7045.length) {
            int var5 = class479.field7045[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 == 0) {
            return;
        }
        this.method3375(99, var6, arg0, '\u0000');
        arg2.consume();
        if (arg1 != 0) {
            this.field8389 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)I", line = 219)
    private final int method3380(int arg0) {
        field8370++;
        int var2 = 0;
        if (this.field8389[81]) {
            var2 |= 0x1;
        }
        if (arg0 != -14723) {
            this.field8389 = null;
        }
        if (this.field8389[82]) {
            var2 |= 0x4;
        }
        if (this.field8389[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gba", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 242)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field8383++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class212.method1388(0, var2)) {
            this.method3375(115, -1, 3, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 377)
    public class582(Component arg0) {
        class342.method2202(26);
        this.method3373(arg0, (byte) 123);
    }

    @OriginalMember(owner = "client!gba", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 261)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method3379(1, 0, arg0);
        field8382++;
    }

    @OriginalMember(owner = "client!gba", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 270)
    public final synchronized void focusLost(FocusEvent arg0) {
        field8374++;
        this.method3375(-99, 0, -1, '\u0000');
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V", line = 278)
    public final synchronized void method287(byte arg0) {
        this.field8385.method718(-114);
        if (arg0 >= -85) {
            return;
        }
        field8369++;
        for (class342 var2 = (class342) this.field8387.method714(true); var2 != null; var2 = (class342) this.field8387.method714(true)) {
            var2.field4872 = this.method3380(-14723);
            if (var2.field4873 == 0) {
                if (!this.field8389[var2.field4881]) {
                    class342 var3 = new class342();
                    var3.field4872 = var2.field4872;
                    var3.field4878 = var2.field4878;
                    var3.field4873 = 0;
                    var3.field4883 = '\u0000';
                    var3.field4881 = var2.field4881;
                    this.field8385.method706(var3, true);
                    this.field8389[var2.field4881] = true;
                }
                var2.field4873 = 2;
                this.field8385.method706(var2, true);
            } else if (var2.field4873 == 1) {
                if (this.field8389[var2.field4881]) {
                    this.field8385.method706(var2, true);
                    this.field8389[var2.field4881] = false;
                }
            } else if (var2.field4873 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field8389[var4]) {
                        class342 var5 = new class342();
                        var5.field4883 = '\u0000';
                        var5.field4881 = var4;
                        var5.field4873 = 1;
                        var5.field4878 = var2.field4878;
                        var5.field4872 = var2.field4872;
                        this.field8385.method706(var5, true);
                        this.field8389[var4] = false;
                    }
                }
            } else if (var2.field4873 == 3) {
                this.field8385.method706(var2, true);
            }
        }
    }
}
