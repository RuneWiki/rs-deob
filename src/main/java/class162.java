import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class162 extends class488 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!or", name = "m", descriptor = "[Z")
    private boolean[] field2234 = new boolean[112];

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public static int field2235 = -1;

    @OriginalMember(owner = "client!or", name = "A", descriptor = "J")
    public static long field2248 = 0L;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "Z")
    public static boolean field2245 = false;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!or", name = "y", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "Lel;")
    private class128 field2237;

    @OriginalMember(owner = "client!or", name = "z", descriptor = "Lel;")
    private class128 field2247;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "Lel;")
    private class128 field2250;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field2236;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IBIIIII)I")
    public static final int method1095(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -80) {
            method1095(-58, (byte) -115, 109, 54, 13, 36, 71);
        }
        int var7 = arg2 & 0x3;
        field2229++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 7 - arg4 - (arg6 + -1);
        } else {
            return 1 + 7 - arg3 - arg0;
        }
    }

    @OriginalMember(owner = "client!or", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2243++;
        this.method1098(1, arg0, (byte) 60);
    }

    @OriginalMember(owner = "client!or", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field2231++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class70.method614(0, var2)) {
            this.method1101(-1, var2, -1, 2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1096(int arg0, Component arg1) {
        field2244++;
        this.method1102(31626);
        this.field2236 = arg1;
        Method var3 = class153.field2139;
        if (arg0 != -27309) {
            this.focusGained((FocusEvent) null);
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field2236, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field2236.addKeyListener(this);
        this.field2236.addFocusListener(this);
    }

    @OriginalMember(owner = "client!or", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1101(0, '\u0000', -1, -1);
        field2230++;
    }

    @OriginalMember(owner = "client!or", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2249++;
        this.method1098(0, arg0, (byte) 68);
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public final synchronized void method1097(int arg0) {
        field2233++;
        for (class128 var2 = this.field2247; var2 != null; var2 = var2.field1784) {
            if (var2.field1781 == 0) {
                if (var2.field1789 >= 0) {
                    var2.field1783 = !this.field2234[var2.field1789];
                }
                this.field2234[var2.field1789] = true;
            } else if (var2.field1781 == 1) {
                this.field2234[var2.field1789] = false;
            } else if (var2.field1781 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    this.field2234[var4] = false;
                }
            }
        }
        this.field2250 = this.field2247;
        int var3 = 75 / ((49 - arg0) / 55);
        this.field2247 = null;
        this.field2237 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;B)V")
    private final void method1098(int arg0, KeyEvent arg1, byte arg2) {
        field2239++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class94.field1301.length > var4) {
            int var6 = class94.field1301[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (arg2 <= 17) {
            this.method1099(-45);
        }
        if (var5 != 0) {
            this.method1101(var5, '\u0000', -1, arg0);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lvm;")
    public final class293 method1099(int arg0) {
        field2232++;
        class128 var2;
        for (var2 = this.field2250; var2 != null && var2.field1781 == -1; var2 = var2.field1784) {
        }
        if (arg0 != 0) {
            return null;
        }
        if (var2 == null) {
            this.field2250 = null;
        } else {
            this.field2250 = var2.field1784;
        }
        return var2;
    }

    @OriginalMember(owner = "client!or", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2238++;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)Z")
    public final boolean method1100(boolean arg0, int arg1) {
        field2246++;
        if (arg0) {
            return false;
        } else if (arg1 >= 0 && arg1 < 112) {
            return this.field2234[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ICII)V")
    private final void method1101(int arg0, char arg1, int arg2, int arg3) {
        field2242++;
        if (arg2 != -1) {
            this.method1097(-30);
        }
        class128 var5 = new class128();
        var5.field1776 = arg1;
        var5.field1781 = arg3;
        var5.field1789 = arg0;
        var5.field1779 = class435.method2539(-10659);
        if (this.field2237 == null) {
            this.field2247 = var5;
        } else {
            this.field2237.field1784 = var5;
        }
        this.field2237 = var5;
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
    private final void method1102(int arg0) {
        if (arg0 != 31626) {
            return;
        }
        field2241++;
        if (this.field2236 == null) {
            return;
        }
        this.field2236.removeKeyListener(this);
        this.field2236.removeFocusListener(this);
        this.field2236 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field2234[var2] = false;
        }
        this.field2247 = null;
        this.field2237 = null;
        this.field2250 = null;
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public final void method1103(int arg0) {
        field2240++;
        int var2 = 53 % ((16 - arg0) / 58);
        this.method1102(31626);
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class162(Component arg0) {
        class49.method355(58);
        this.method1096(-27309, arg0);
    }
}
