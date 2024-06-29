import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class245 extends class205 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lwba;")
    private class46 field3798 = new class46();

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lwba;")
    private class46 field3814 = new class46();

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "[Z")
    private boolean[] field3817 = new boolean[112];

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Z")
    public static boolean field3797 = false;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Z")
    public static volatile boolean field3808 = true;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field3815 = 765;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field3816;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)Z")
    public final boolean method1364(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1656((byte) 23);
        }
        field3801++;
        return arg1 >= 0 && arg1 < 112 ? this.field3817[arg1] : false;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public final void method1363(byte arg0) {
        field3800++;
        int var2 = -121 / ((61 - arg0) / 40);
        this.method1656((byte) 108);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final synchronized void method1360(byte arg0) {
        if (arg0 <= 19) {
            this.keyPressed(null);
        }
        this.field3798.method475(6);
        field3813++;
        for (class133 var2 = (class133) this.field3814.method483((byte) -118); var2 != null; var2 = (class133) this.field3814.method483((byte) -123)) {
            var2.field1969 = this.method1654((byte) -128);
            if (var2.field1971 == 0) {
                if (!this.field3817[var2.field1965]) {
                    class133 var3 = new class133();
                    var3.field1971 = 0;
                    var3.field1969 = var2.field1969;
                    var3.field1961 = '\u0000';
                    var3.field1965 = var2.field1965;
                    var3.field1967 = var2.field1967;
                    this.field3798.method474(var3, 6);
                    this.field3817[var2.field1965] = true;
                }
                var2.field1971 = 2;
                this.field3798.method474(var2, 6);
            } else if (var2.field1971 == 1) {
                if (this.field3817[var2.field1965]) {
                    this.field3798.method474(var2, 6);
                    this.field3817[var2.field1965] = false;
                }
            } else if (var2.field1971 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field3817[var4]) {
                        class133 var5 = new class133();
                        var5.field1961 = '\u0000';
                        var5.field1971 = 1;
                        var5.field1965 = var4;
                        var5.field1969 = var2.field1969;
                        var5.field1967 = var2.field1967;
                        this.field3798.method474(var5, 6);
                        this.field3817[var4] = false;
                    }
                }
            } else if (var2.field1971 == 3) {
                this.field3798.method474(var2, 6);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3806++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class475.method2786(var2, 93)) {
            this.method1655((byte) -122, var2, 3, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
    private final int method1654(byte arg0) {
        field3812++;
        if (arg0 > -117) {
            return -68;
        }
        int var2 = 0;
        if (this.field3817[81]) {
            var2 |= 0x1;
        }
        if (this.field3817[82]) {
            var2 |= 0x4;
        }
        if (this.field3817[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BCII)V")
    private final void method1655(byte arg0, char arg1, int arg2, int arg3) {
        field3804++;
        class133 var5 = new class133();
        var5.field1971 = arg2;
        if (arg0 > -99) {
            this.field3817 = null;
        }
        var5.field1961 = arg1;
        var5.field1965 = arg3;
        var5.field1967 = class490.method2840(true);
        this.field3814.method474(var5, 6);
    }

    @OriginalMember(owner = "client!wd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3805++;
        this.method1657(0, -102, arg0);
    }

    @OriginalMember(owner = "client!wd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3802++;
        this.method1655((byte) -110, '\u0000', -1, 0);
    }

    @OriginalMember(owner = "client!wd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1657(1, -93, arg0);
        field3807++;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V")
    private final void method1656(byte arg0) {
        field3811++;
        if (arg0 <= 18) {
            this.keyTyped(null);
        }
        if (this.field3816 == null) {
            return;
        }
        this.field3816.removeKeyListener(this);
        this.field3816.removeFocusListener(this);
        this.field3816 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3817[var2] = false;
        }
        this.field3798.method475(6);
        this.field3814.method475(6);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
    private final void method1657(int arg0, int arg1, KeyEvent arg2) {
        field3810++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class80.field1356.length > var4) {
            int var5 = class80.field1356[var4];
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
        if (arg1 > -43) {
            this.field3817 = null;
        }
        this.method1655((byte) -108, '\u0000', arg0, var6);
        arg2.consume();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1658(int arg0, Component arg1) {
        int var3 = -52 % ((-arg0 - 63) / 41);
        this.method1656((byte) 20);
        field3809++;
        this.field3816 = arg1;
        Method var4 = class4.field25;
        if (var4 != null) {
            try {
                var4.invoke(this.field3816, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field3816.addKeyListener(this);
        this.field3816.addFocusListener(this);
    }

    @OriginalMember(owner = "client!wd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3803++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lvr;")
    public final class121 method1365(int arg0) {
        if (arg0 == 4) {
            field3799++;
            return (class121) this.field3798.method483((byte) -114);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class245(Component arg0) {
        class238.method1620(61);
        this.method1658(-117, arg0);
    }
}
