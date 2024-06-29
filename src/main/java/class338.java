import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class338 extends class540 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lgk;")
    private class616 field4261 = new class616();

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "Lgk;")
    private class616 field4264 = new class616();

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "[Z")
    private boolean[] field4267 = new boolean[112];

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Lcq;")
    public static class110 field4255;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient;")
    public static client field4252;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field4268;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[[B")
    public static byte[][] field4249;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I")
    private final int method1937(int arg0) {
        field4259++;
        int var2 = 0;
        if (this.field4267[81]) {
            var2 |= 0x1;
        }
        if (this.field4267[82]) {
            var2 |= 0x4;
        }
        if (arg0 > -124) {
            this.field4261 = null;
        }
        if (this.field4267[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
    public static void method1938(byte arg0) {
        field4249 = null;
        field4252 = null;
        field4255 = null;
        if (arg0 != 46) {
            method1938((byte) -107);
        }
    }

    @OriginalMember(owner = "client!lm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4266++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class183.method1107(false, var2)) {
            this.method1946(var2, -1, 3, 0);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public final synchronized void method1939(int arg0) {
        this.field4261.method3438(16);
        field4263++;
        class389 var2 = (class389) this.field4264.method3440((byte) 113);
        if (arg0 != 751421314) {
            return;
        }
        while (var2 != null) {
            var2.field5259 = this.method1937(-128);
            if (var2.field5266 == 0) {
                if (!this.field4267[var2.field5267]) {
                    class389 var5 = new class389();
                    var5.field5265 = '\u0000';
                    var5.field5271 = var2.field5271;
                    var5.field5266 = 0;
                    var5.field5267 = var2.field5267;
                    var5.field5259 = var2.field5259;
                    this.field4261.method3425(var5, false);
                    this.field4267[var2.field5267] = true;
                }
                var2.field5266 = 2;
                this.field4261.method3425(var2, false);
            } else if (var2.field5266 == 1) {
                if (this.field4267[var2.field5267]) {
                    this.field4261.method3425(var2, false);
                    this.field4267[var2.field5267] = false;
                }
            } else if (var2.field5266 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field4267[var3]) {
                        class389 var4 = new class389();
                        var4.field5271 = var2.field5271;
                        var4.field5267 = var3;
                        var4.field5265 = '\u0000';
                        var4.field5259 = var2.field5259;
                        var4.field5266 = 1;
                        this.field4261.method3425(var4, false);
                        this.field4267[var3] = false;
                    }
                }
            } else if (var2.field5266 == 3) {
                this.field4261.method3425(var2, false);
            }
            var2 = (class389) this.field4264.method3440((byte) 108);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;Z)V")
    private final void method1940(int arg0, KeyEvent arg1, boolean arg2) {
        if (arg2) {
            field4252 = null;
        }
        field4247++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class9.field93.length) {
            int var6 = class9.field93[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1946('\u0000', var5, arg0, 0);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
    private final void method1941(int arg0) {
        field4246++;
        if (this.field4268 == null) {
            return;
        }
        this.field4268.removeKeyListener(this);
        this.field4268.removeFocusListener(this);
        this.field4268 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field4267[var2] = false;
        }
        int var3 = -29 % ((29 - arg0) / 54);
        this.field4261.method3438(16);
        this.field4264.method3438(16);
    }

    @OriginalMember(owner = "client!lm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4256++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
    public static final void method1942(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -56 % ((arg0 - 43) / 45);
        class93.field949 = arg1;
        class72.field740 = arg2;
        class412.field5526 = arg3;
        field4251++;
        class360.field4834 = arg4;
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)Lkk;")
    public final class159 method1943(int arg0) {
        if (arg0 == -1656632478) {
            field4250++;
            return (class159) this.field4261.method3440((byte) 117);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1946('\u0000', 0, -1, 0);
        field4262++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method1944(Component arg0, boolean arg1) {
        field4257++;
        this.method1941(-93);
        this.field4268 = arg0;
        Method var3 = class464.field6606;
        if (var3 != null) {
            try {
                var3.invoke(this.field4268, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (!arg1) {
            this.method1946('w', 40, 65, -12);
        }
        this.field4268.addKeyListener(this);
        this.field4268.addFocusListener(this);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)Z")
    public final boolean method1945(int arg0, boolean arg1) {
        field4258++;
        if (arg0 >= 0 && arg0 < 112) {
            return arg1 ? false : this.field4267[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1940(0, arg0, false);
        field4248++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(CIII)V")
    private final void method1946(char arg0, int arg1, int arg2, int arg3) {
        field4253++;
        class389 var5 = new class389();
        var5.field5265 = arg0;
        if (arg3 != 0) {
            this.keyReleased(null);
        }
        var5.field5266 = arg2;
        var5.field5267 = arg1;
        var5.field5271 = class557.method3157(-58);
        this.field4264.method3425(var5, false);
    }

    @OriginalMember(owner = "client!lm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1940(1, arg0, false);
        field4260++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final void method1947(int arg0) {
        field4265++;
        if (arg0 != -24139) {
            field4252 = null;
        }
        this.method1941(115);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class338(Component arg0) {
        class324.method1828((byte) 12);
        this.method1944(arg0, true);
    }
}
