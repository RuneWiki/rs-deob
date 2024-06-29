import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class427 extends class278 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[Z")
    private boolean[] field6147 = new boolean[112];

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
    public static int[] field6154 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "[B")
    public static byte[] field6157 = new byte[520];

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field6166 = 2;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lam;")
    private class310 field6143;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lam;")
    private class310 field6151;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lam;")
    private class310 field6153;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "Leg;")
    public static class394 field6156;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field6150;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "[Lpi;")
    public static class239[] field6158;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public final void method1688(byte arg0) {
        this.method2544(0);
        if (arg0 > 89) {
            field6144++;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Lva;")
    public static final class60 method2542(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        return var3 == null || var3.field3798 == null ? null : var3.field3798;
    }

    @OriginalMember(owner = "client!pj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2547(arg0, (byte) 82, 0);
        field6149++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Lbm;")
    public final class348 method1685(int arg0) {
        field6160++;
        if (arg0 != 16) {
            this.method1688((byte) -16);
        }
        class310 var2;
        for (var2 = this.field6153; var2 != null && var2.field4542 == -1; var2 = var2.field4534) {
        }
        if (var2 == null) {
            this.field6153 = null;
        } else {
            this.field6153 = var2.field4534;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public static void method2543(byte arg0) {
        field6156 = null;
        field6158 = null;
        field6157 = null;
        if (arg0 == 25) {
            field6154 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2548(-18169, '\u0000', 0, -1);
        field6165++;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
    private final void method2544(int arg0) {
        field6161++;
        if (this.field6150 == null) {
            return;
        }
        this.field6150.removeKeyListener(this);
        this.field6150.removeFocusListener(this);
        this.field6150 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field6147[var2] = false;
        }
        this.field6151 = null;
        this.field6143 = null;
        this.field6153 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2545(Component arg0, int arg1) {
        if (arg1 != 11717) {
            this.method1685(25);
        }
        this.method2544(0);
        field6169++;
        this.field6150 = arg0;
        Method var3 = class355.field5111;
        if (var3 != null) {
            try {
                var3.invoke(this.field6150, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6150.addKeyListener(this);
        this.field6150.addFocusListener(this);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIBIZ)I")
    public static final int method2546(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        field6168++;
        class458 var5 = class230.method1272((byte) -127, arg0, arg1);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (arg2 != 85) {
            field6156 = null;
        }
        for (int var7 = 0; var7 < var5.field6447.length; var7++) {
            if (var5.field6447[var7] >= 0 && var5.field6447[var7] < class422.field6096.field219) {
                class385 var8 = class422.field6096.method121(var5.field6447[var7], -1);
                int var9 = var8.method2327(arg3, -48, class422.field6084.method2076((byte) -122, arg3).field4519);
                if (arg4) {
                    var6 += var5.field6454[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6159++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Z")
    public final boolean method1689(byte arg0, int arg1) {
        if (arg0 != -118) {
            field6146 = -54;
        }
        field6164++;
        return arg1 >= 0 && arg1 < 112 ? this.field6147[arg1] : false;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
    private final void method2547(KeyEvent arg0, byte arg1, int arg2) {
        field6163++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class115.field1422.length > var4) {
            int var5 = class115.field1422[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
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
        if (arg1 != 82) {
            this.field6153 = null;
        }
        this.method2548(arg1 ^ 0xFFFFB955, '\u0000', var6, arg2);
        arg0.consume();
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public final synchronized void method1686(int arg0) {
        field6155++;
        int var2 = -127 / ((arg0 + 67) / 34);
        for (class310 var3 = this.field6151; var3 != null; var3 = var3.field4534) {
            if (var3.field4542 == 0) {
                if (var3.field4537 >= 0) {
                    var3.field4536 = !this.field6147[var3.field4537];
                }
                this.field6147[var3.field4537] = true;
            } else if (var3.field4542 == 1) {
                this.field6147[var3.field4537] = false;
            } else if (var3.field4542 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    this.field6147[var4] = false;
                }
            }
        }
        this.field6153 = this.field6151;
        this.field6143 = null;
        this.field6151 = null;
    }

    @OriginalMember(owner = "client!pj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6170++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class367.method2217(-115, var2)) {
            this.method2548(-18169, var2, -1, 2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ICII)V")
    private final void method2548(int arg0, char arg1, int arg2, int arg3) {
        field6162++;
        class310 var5 = new class310();
        var5.field4537 = arg2;
        var5.field4542 = arg3;
        var5.field4540 = arg1;
        var5.field4533 = class434.method2591(-19310);
        if (this.field6143 == null) {
            this.field6151 = var5;
        } else {
            this.field6143.field4534 = var5;
        }
        this.field6143 = var5;
        if (arg0 != -18169) {
            field6156 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2549(int arg0, String arg1) {
        field6167++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = arg0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class138.method660((byte) 5, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!pj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field6152++;
        this.method2547(arg0, (byte) 82, 1);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class427(Component arg0) {
        class352.method2134(-120);
        this.method2545(arg0, 11717);
    }
}
