import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class505 extends class758 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "Lqia;")
    private class547 field7133 = new class547();

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "Lqia;")
    private class547 field7135 = new class547();

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "[Z")
    private boolean[] field7137 = new boolean[112];

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "[[Z")
    public static boolean[][] field7114 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Lus;")
    public static class328 field7122 = new class328(23, 7);

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "Lkha;")
    public static class687 field7136;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field7138;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "Z")
    public static boolean field7128;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 3)
    private final void method2915(int arg0, Component arg1) {
        this.method2917(32331);
        if (arg0 != 16650) {
            this.method2922(-79, (byte) -94, (char) 65419, -86);
        }
        field7129++;
        this.field7138 = arg1;
        Method var3 = class256.field3241;
        if (var3 != null) {
            try {
                var3.invoke(this.field7138, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field7138.addKeyListener(this);
        this.field7138.addFocusListener(this);
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V", line = 30)
    public static void method2916(int arg0) {
        field7122 = null;
        if (arg0 == -25690) {
            field7114 = null;
            field7136 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 42)
    private final void method2917(int arg0) {
        field7123++;
        if (this.field7138 == null) {
            return;
        }
        this.field7138.removeKeyListener(this);
        if (arg0 != 32331) {
            return;
        }
        this.field7138.removeFocusListener(this);
        this.field7138 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field7137[var2] = false;
        }
        this.field7133.method3114(true);
        this.field7135.method3114(true);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Ljfa;", line = 71)
    public final class122 method2918(int arg0) {
        if (arg0 <= 33) {
            return null;
        } else {
            field7117++;
            return (class122) this.field7133.method3115(1210318848);
        }
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 86)
    public final synchronized void method2919(int arg0) {
        if (arg0 != 16956) {
            method2921(58, null);
        }
        this.field7133.method3114(true);
        field7130++;
        for (class261 var2 = (class261) this.field7135.method3115(1210318848); var2 != null; var2 = (class261) this.field7135.method3115(1210318848)) {
            var2.field3321 = this.method2920((byte) 50);
            if (var2.field3308 == 0) {
                if (!this.field7137[var2.field3314]) {
                    class261 var3 = new class261();
                    var3.field3310 = '\u0000';
                    var3.field3315 = var2.field3315;
                    var3.field3321 = var2.field3321;
                    var3.field3308 = 0;
                    var3.field3314 = var2.field3314;
                    this.field7133.method3110(var3, 1);
                    this.field7137[var2.field3314] = true;
                }
                var2.field3308 = 2;
                this.field7133.method3110(var2, 1);
            } else if (var2.field3308 == 1) {
                if (this.field7137[var2.field3314]) {
                    this.field7133.method3110(var2, arg0 - 16955);
                    this.field7137[var2.field3314] = false;
                }
            } else if (var2.field3308 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field7137[var4]) {
                        class261 var5 = new class261();
                        var5.field3310 = '\u0000';
                        var5.field3315 = var2.field3315;
                        var5.field3321 = var2.field3321;
                        var5.field3308 = 1;
                        var5.field3314 = var4;
                        this.field7133.method3110(var5, 1);
                        this.field7137[var4] = false;
                    }
                }
            } else if (var2.field3308 == 3) {
                this.field7133.method3110(var2, 1);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 179)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field7125++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class522.method3002(0, var2)) {
            this.method2922(-1, (byte) 98, var2, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 200)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field7118++;
        this.method2923(1, arg0, -15697);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I", line = 208)
    private final int method2920(byte arg0) {
        field7116++;
        int var2 = 0;
        if (this.field7137[81]) {
            var2 |= 0x1;
        }
        if (this.field7137[82]) {
            var2 |= 0x4;
        }
        if (arg0 < 14) {
            this.method2923(6, null, 91);
        }
        if (this.field7137[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 232)
    public final synchronized void focusLost(FocusEvent arg0) {
        field7131++;
        this.method2922(0, (byte) 106, '\u0000', -1);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILtn;)Lpd;", line = 242)
    public static final class619 method2921(int arg0, class179 arg1) {
        if (arg0 != 18413) {
            return null;
        }
        field7132++;
        class761 var2 = class412.method2441(-66)[arg1.method1094(255)];
        class407 var3 = class237.method1481(91)[arg1.method1094(255)];
        int var4 = arg1.method1137((byte) -115);
        int var5 = arg1.method1137((byte) -116);
        int var6 = arg1.method1107(false);
        int var7 = arg1.method1107(false);
        int var8 = arg1.method1137((byte) -81);
        int var9 = arg1.method1095((byte) 124);
        int var10 = arg1.method1095((byte) 116);
        return new class619(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBCI)V", line = 271)
    private final void method2922(int arg0, byte arg1, char arg2, int arg3) {
        field7119++;
        class261 var5 = new class261();
        var5.field3308 = arg3;
        var5.field3310 = arg2;
        var5.field3314 = arg0;
        var5.field3315 = class97.method654((byte) 101);
        this.field7135.method3110(var5, 1);
        if (arg1 <= 95) {
            field7128 = false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V", line = 290)
    private final void method2923(int arg0, KeyEvent arg1, int arg2) {
        field7127++;
        if (arg2 != -15697) {
            return;
        }
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class681.field9308.length > var4) {
            int var5 = class681.field9308[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method2922(var6, (byte) 102, '\u0000', arg0);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)Z", line = 326)
    public final boolean method2924(int arg0, int arg1) {
        if (arg0 != -30303) {
            this.focusLost(null);
        }
        field7124++;
        return arg1 >= 0 && arg1 < 112 ? this.field7137[arg1] : false;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 340)
    public final void method2925(int arg0) {
        this.method2917(32331);
        if (arg0 != -22009) {
            field7114 = null;
        }
        field7126++;
    }

    @OriginalMember(owner = "client!qn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 351)
    public final void focusGained(FocusEvent arg0) {
        field7120++;
    }

    @OriginalMember(owner = "client!qn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 361)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2923(0, arg0, -15697);
        field7121++;
    }

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I", line = 370)
    public static final int method2926(int arg0) {
        field7115++;
        if ((double) class341.field4414 == 3.0D) {
            return 37;
        } else if ((double) class341.field4414 == 4.0D) {
            return 50;
        } else if ((double) class341.field4414 == 6.0D) {
            return 75;
        } else {
            if (arg0 != -129) {
                field7122 = null;
            }
            return (double) class341.field4414 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 416)
    public class505(Component arg0) {
        class721.method3993(91);
        this.method2915(16650, arg0);
    }
}
