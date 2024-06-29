import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class277 extends class304 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lbq;")
    private class289 field3393 = new class289();

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Lbq;")
    private class289 field3405 = new class289();

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "[Z")
    private boolean[] field3406 = new boolean[112];

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Z")
    public static boolean field3388 = true;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field3407;

    @OriginalMember(owner = "client!mm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1655(0, (byte) 117, '\u0000', -1);
        field3396++;
    }

    @OriginalMember(owner = "client!mm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1660(0, false, arg0);
        field3404++;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I")
    private final int method1652(int arg0) {
        field3395++;
        int var2 = 0;
        if (this.field3406[81]) {
            var2 |= 0x1;
        }
        if (this.field3406[82]) {
            var2 |= 0x4;
        }
        if (this.field3406[86]) {
            var2 |= 0x2;
        }
        return arg0 < 18 ? -93 : var2;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V")
    private final void method1653(int arg0) {
        field3400++;
        if (this.field3407 == null) {
            return;
        }
        this.field3407.removeKeyListener(this);
        this.field3407.removeFocusListener(this);
        this.field3407 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field3406[var2] = false;
        }
        this.field3393.method1728(29632);
        this.field3405.method1728(29632);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public final void method1654(boolean arg0) {
        this.method1653(0);
        field3399++;
        if (arg0) {
            this.field3405 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3391++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBCI)V")
    private final void method1655(int arg0, byte arg1, char arg2, int arg3) {
        int var5 = 119 % ((arg1 + 1) / 60);
        field3390++;
        class410 var6 = new class410();
        var6.field5603 = arg0;
        var6.field5605 = arg3;
        var6.field5602 = arg2;
        var6.field5604 = class652.method3700(-1);
        this.field3405.method1721((byte) -42, var6);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public final synchronized void method1656(byte arg0) {
        this.field3393.method1728(29632);
        if (arg0 <= 110) {
            this.method1657(69, (byte) 88);
        }
        field3392++;
        for (class410 var2 = (class410) this.field3405.method1729(662); var2 != null; var2 = (class410) this.field3405.method1729(662)) {
            var2.field5596 = this.method1652(34);
            if (var2.field5605 == 0) {
                if (!this.field3406[var2.field5603]) {
                    class410 var3 = new class410();
                    var3.field5602 = '\u0000';
                    var3.field5596 = var2.field5596;
                    var3.field5603 = var2.field5603;
                    var3.field5604 = var2.field5604;
                    var3.field5605 = 0;
                    this.field3393.method1721((byte) -91, var3);
                    this.field3406[var2.field5603] = true;
                }
                var2.field5605 = 2;
                this.field3393.method1721((byte) 95, var2);
            } else if (var2.field5605 == 1) {
                if (this.field3406[var2.field5603]) {
                    this.field3393.method1721((byte) 116, var2);
                    this.field3406[var2.field5603] = false;
                }
            } else if (var2.field5605 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field3406[var4]) {
                        class410 var5 = new class410();
                        var5.field5604 = var2.field5604;
                        var5.field5603 = var4;
                        var5.field5596 = var2.field5596;
                        var5.field5605 = 1;
                        var5.field5602 = '\u0000';
                        this.field3393.method1721((byte) -91, var5);
                        this.field3406[var4] = false;
                    }
                }
            } else if (var2.field5605 == 3) {
                this.field3393.method1721((byte) -66, var2);
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Z")
    public final boolean method1657(int arg0, byte arg1) {
        field3401++;
        if (arg0 >= 0 && arg0 < 112) {
            if (arg1 != -40) {
                this.method1655(48, (byte) 79, (char) 65505, -60);
            }
            return this.field3406[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3386++;
        this.method1660(1, false, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Lq;")
    public final class426 method1658(int arg0) {
        if (arg0 != -14387) {
            this.method1654(false);
        }
        field3402++;
        return (class426) this.field3393.method1729(662);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;BI)I")
    public static final int method1659(String arg0, byte arg1, int arg2) {
        field3385++;
        if (arg1 <= 92) {
            method1659(null, (byte) -47, -38);
        }
        return class76.method543(arg2, arg0, true, (byte) 104);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZLjava/awt/event/KeyEvent;)V")
    private final void method1660(int arg0, boolean arg1, KeyEvent arg2) {
        field3397++;
        int var4 = arg2.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class145.field1605.length) {
            int var6 = class145.field1605[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
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
        this.method1655(var5, (byte) 99, '\u0000', arg0);
        arg2.consume();
        if (arg1) {
            field3388 = false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3389++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class632.method3626(126, var2)) {
            this.method1655(-1, (byte) 72, var2, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method1661(Component arg0, byte arg1) {
        this.method1653(0);
        field3398++;
        this.field3407 = arg0;
        if (arg1 <= 10) {
            return;
        }
        Method var3 = class546.field7845;
        if (var3 != null) {
            try {
                var3.invoke(this.field3407, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3407.addKeyListener(this);
        this.field3407.addFocusListener(this);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class277(Component arg0) {
        class627.method3594((byte) 115);
        this.method1661(arg0, (byte) 119);
    }
}
