import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class342 extends class631 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lhga;")
    private class158 field5082 = new class158();

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Lhga;")
    private class158 field5087 = new class158();

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[Z")
    private boolean[] field5097 = new boolean[112];

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lqfa;")
    public static class85 field5083 = new class85(85, 10);

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Ljk;")
    public static class588 field5099;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Ljava/awt/Component;")
    private Component field5093;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "[Lf;")
    public static class702[] field5098;

    @OriginalMember(owner = "client!he", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5094++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class661.method3760((byte) -115, var2)) {
            this.method2199(114, 3, var2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Z")
    public final boolean method2194(int arg0, byte arg1) {
        field5080++;
        int var3 = -10 % ((22 - arg1) / 35);
        return arg0 >= 0 && arg0 < 112 ? this.field5097[arg0] : false;
    }

    @OriginalMember(owner = "client!he", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field5079++;
        this.method2195(arg0, 1, -128);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method2195(KeyEvent arg0, int arg1, int arg2) {
        if (arg2 >= -127) {
            return;
        }
        field5089++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class234.field3495.length > var4) {
            int var6 = class234.field3495[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2199(-81, arg1, '\u0000', var5);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
    public static final boolean method2196(int arg0, int arg1, int arg2) {
        field5078++;
        if (arg2 != -13358) {
            method2200((byte) -81, null);
        }
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public static void method2197(int arg0) {
        if (arg0 < -71) {
            field5098 = null;
            field5083 = null;
            field5099 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2195(arg0, 0, -128);
        field5090++;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    private final void method2198(int arg0) {
        field5092++;
        if (this.field5093 == null) {
            return;
        }
        this.field5093.removeKeyListener(this);
        this.field5093.removeFocusListener(this);
        this.field5093 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field5097[var2] = false;
        }
        this.field5082.method1222((byte) -113);
        this.field5087.method1222((byte) -84);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IICI)V")
    private final void method2199(int arg0, int arg1, char arg2, int arg3) {
        field5084++;
        class366 var5 = new class366();
        int var6 = 96 / ((arg0 - 26) / 53);
        var5.field5433 = arg3;
        var5.field5426 = arg1;
        var5.field5420 = arg2;
        var5.field5431 = class525.method3074((byte) -101);
        this.field5087.method1229(var5, (byte) 120);
    }

    @OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2199(82, -1, '\u0000', 0);
        field5076++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLqh;)Lgr;")
    public static final class403 method2200(byte arg0, class61 arg1) {
        field5081++;
        int var2 = arg1.method723((byte) -25);
        int var3 = 28 % ((-arg0 - 38) / 52);
        return new class403(var2);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public final void method2201(byte arg0) {
        this.method2198(arg0 ^ 0xFFFFFF94);
        if (arg0 != -108) {
            this.focusGained(null);
        }
        field5075++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Lnr;")
    public final class53 method2202(byte arg0) {
        field5077++;
        return arg0 > -96 ? null : (class53) this.field5082.method1226(0);
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
    private final int method2203(int arg0) {
        if (arg0 < 18) {
            this.field5093 = null;
        }
        field5095++;
        int var2 = 0;
        if (this.field5097[81]) {
            var2 |= 0x1;
        }
        if (this.field5097[82]) {
            var2 |= 0x4;
        }
        if (this.field5097[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public final synchronized void method2204(int arg0) {
        field5085++;
        this.field5082.method1222((byte) -89);
        for (class366 var2 = (class366) this.field5087.method1226(0); var2 != null; var2 = (class366) this.field5087.method1226(0)) {
            var2.field5421 = this.method2203(101);
            if (var2.field5426 == 0) {
                if (!this.field5097[var2.field5433]) {
                    class366 var3 = new class366();
                    var3.field5421 = var2.field5421;
                    var3.field5420 = '\u0000';
                    var3.field5433 = var2.field5433;
                    var3.field5431 = var2.field5431;
                    var3.field5426 = 0;
                    this.field5082.method1229(var3, (byte) 120);
                    this.field5097[var2.field5433] = true;
                }
                var2.field5426 = 2;
                this.field5082.method1229(var2, (byte) 120);
            } else if (var2.field5426 == 1) {
                if (this.field5097[var2.field5433]) {
                    this.field5082.method1229(var2, (byte) 120);
                    this.field5097[var2.field5433] = false;
                }
            } else if (var2.field5426 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field5097[var4]) {
                        class366 var5 = new class366();
                        var5.field5426 = 1;
                        var5.field5420 = '\u0000';
                        var5.field5433 = var4;
                        var5.field5431 = var2.field5431;
                        var5.field5421 = var2.field5421;
                        this.field5082.method1229(var5, (byte) 120);
                        this.field5097[var4] = false;
                    }
                }
            } else if (var2.field5426 == 3) {
                this.field5082.method1229(var2, (byte) 120);
            }
        }
        if (arg0 < 59) {
            this.field5082 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    private final void method2205(Component arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field5086++;
        this.method2198(0);
        this.field5093 = arg0;
        Method var3 = class17.field792;
        if (var3 != null) {
            try {
                var3.invoke(this.field5093, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field5093.addKeyListener(this);
        this.field5093.addFocusListener(this);
    }

    @OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5088++;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class342(Component arg0) {
        class334.method2153(93);
        this.method2205(arg0, false);
    }
}
