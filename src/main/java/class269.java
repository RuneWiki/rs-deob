import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class269 extends class430 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "Ldc;")
    private class302 field3520 = new class302();

    @OriginalMember(owner = "client!hw", name = "x", descriptor = "Ldc;")
    private class302 field3529 = new class302();

    @OriginalMember(owner = "client!hw", name = "A", descriptor = "[Z")
    private boolean[] field3532 = new boolean[112];

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!hw", name = "w", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!hw", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field3533;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIC)V")
    private final void method1605(int arg0, int arg1, int arg2, char arg3) {
        if (arg2 > -59) {
            this.field3532 = null;
        }
        field3515++;
        class675 var5 = new class675();
        var5.field9517 = arg1;
        var5.field9521 = arg0;
        var5.field9519 = arg3;
        var5.field9518 = class60.method371(false);
        this.field3529.method1909(var5, (byte) -81);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1606(int arg0, Component arg1) {
        this.method1615(false);
        field3525++;
        this.field3533 = arg1;
        if (arg0 != -113) {
            this.keyTyped(null);
        }
        Method var3 = class226.field2985;
        if (var3 != null) {
            try {
                var3.invoke(this.field3533, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3533.addKeyListener(this);
        this.field3533.addFocusListener(this);
    }

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "(I)I")
    private final int method1607(int arg0) {
        field3523++;
        if (arg0 <= 88) {
            method1610(null, null);
        }
        int var2 = 0;
        if (this.field3532[81]) {
            var2 |= 0x1;
        }
        if (this.field3532[82]) {
            var2 |= 0x4;
        }
        if (this.field3532[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3519++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class572.method3285(var2, (byte) 84)) {
            this.method1605(-1, 3, -90, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3517++;
        this.method1605(0, -1, -104, '\u0000');
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
    public static final void method1608(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        if (var3 != null) {
            class355.method2197(var3.field672);
            if (var3.field672 != null) {
                var3.field672 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3516++;
        this.method1612(1, false, arg0);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
    public final boolean method1609(int arg0, int arg1) {
        field3528++;
        if (arg1 != -27453) {
            field3522 = -86;
        }
        return arg0 >= 0 && arg0 < 112 ? this.field3532[arg0] : false;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llba;")
    public static final class198 method1610(Throwable arg0, String arg1) {
        field3527++;
        class198 var2;
        if (arg0 instanceof class198) {
            var2 = (class198) arg0;
            var2.field2706 = var2.field2706 + ' ' + arg1;
        } else {
            var2 = new class198(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3531++;
    }

    @OriginalMember(owner = "client!hw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1612(0, false, arg0);
        field3514++;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
    public final void method1611(byte arg0) {
        if (arg0 > 119) {
            this.method1615(false);
            field3521++;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
    private final void method1612(int arg0, boolean arg1, KeyEvent arg2) {
        field3518++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class218.field2906.length > var4) {
            int var5 = class218.field2906[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0 && !arg1) {
            this.method1605(var6, arg0, -91, '\u0000');
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
    public final synchronized void method1613(int arg0) {
        this.field3520.method1905(0);
        field3530++;
        int var2 = -127 % ((60 - arg0) / 38);
        for (class675 var3 = (class675) this.field3529.method1902(114); var3 != null; var3 = (class675) this.field3529.method1902(101)) {
            var3.field9520 = this.method1607(115);
            if (var3.field9517 == 0) {
                if (!this.field3532[var3.field9521]) {
                    class675 var4 = new class675();
                    var4.field9518 = var3.field9518;
                    var4.field9520 = var3.field9520;
                    var4.field9521 = var3.field9521;
                    var4.field9517 = 0;
                    var4.field9519 = '\u0000';
                    this.field3520.method1909(var4, (byte) -81);
                    this.field3532[var3.field9521] = true;
                }
                var3.field9517 = 2;
                this.field3520.method1909(var3, (byte) -81);
            } else if (var3.field9517 == 1) {
                if (this.field3532[var3.field9521]) {
                    this.field3520.method1909(var3, (byte) -81);
                    this.field3532[var3.field9521] = false;
                }
            } else if (var3.field9517 == -1) {
                for (int var5 = 0; var5 < 112; var5++) {
                    if (this.field3532[var5]) {
                        class675 var6 = new class675();
                        var6.field9521 = var5;
                        var6.field9519 = '\u0000';
                        var6.field9517 = 1;
                        var6.field9518 = var3.field9518;
                        var6.field9520 = var3.field9520;
                        this.field3520.method1909(var6, (byte) -81);
                        this.field3532[var5] = false;
                    }
                }
            } else if (var3.field9517 == 3) {
                this.field3520.method1909(var3, (byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)Lwda;")
    public final class439 method1614(int arg0) {
        if (arg0 > -44) {
            this.method1605(67, 13, 69, (char) 65449);
        }
        field3526++;
        return (class439) this.field3520.method1902(113);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
    private final void method1615(boolean arg0) {
        field3524++;
        if (this.field3533 == null) {
            return;
        }
        this.field3533.removeKeyListener(this);
        this.field3533.removeFocusListener(this);
        this.field3533 = null;
        if (arg0) {
            return;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3532[var2] = false;
        }
        this.field3520.method1905(0);
        this.field3529.method1905(0);
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class269(Component arg0) {
        class203.method1312((byte) 122);
        this.method1606(-113, arg0);
    }
}
