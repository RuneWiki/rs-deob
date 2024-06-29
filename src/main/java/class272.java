import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class272 extends class357 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "[Z")
    private boolean[] field4122 = new boolean[112];

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "Llg;")
    public static class274 field4126 = new class274(16);

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "[I")
    public static int[] field4134 = new int[16];

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "Lbg;")
    public static class310 field4133 = new class310(74, 0);

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "Lkg;")
    private class170 field4114;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "Lkg;")
    private class170 field4124;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "Lkg;")
    private class170 field4128;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field4121;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIC)V", line = 5)
    private final void method1646(int arg0, int arg1, int arg2, char arg3) {
        field4113++;
        class170 var5 = new class170();
        if (arg2 != -9985) {
            return;
        }
        var5.field2636 = arg1;
        var5.field2643 = arg3;
        var5.field2640 = arg0;
        var5.field2644 = class344.method2111((byte) -107);
        if (this.field4114 == null) {
            this.field4128 = var5;
        } else {
            this.field4114.field2637 = var5;
        }
        this.field4114 = var5;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLjava/lang/String;)I", line = 30)
    public static final int method1647(byte arg0, String arg1) {
        field4118++;
        if (arg1 == null) {
            return -1;
        } else if (arg0 == -52) {
            for (int var2 = 0; var2 < class7.field79; var2++) {
                if (arg1.equalsIgnoreCase(class51.field767[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -113;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V", line = 57)
    public final void method1648(int arg0) {
        if (arg0 != -16880) {
            this.keyTyped(null);
        }
        field4115++;
        this.method1656((byte) 35);
    }

    @OriginalMember(owner = "client!fr", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 68)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1653(arg0, 1, 128);
        field4130++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIBIIII)V", line = 77)
    public static final void method1649(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4127++;
        for (class26 var7 = (class26) class310.field4673.method1319(91); var7 != null; var7 = (class26) class310.field4673.method1320((byte) -81)) {
            if (var7.field343 <= class369.field5424) {
                var7.method1297((byte) -123);
            } else {
                class52.method368(arg5, (var7.field338 << 7) + 64, 0, (var7.field345 << 7) + 64, var7.field346, arg0, arg1 >> 1, arg4 >> 1, var7.field347 * 2);
                class493.field7514.method2933(class161.field2529[0] + arg6, arg3 - -class161.field2529[1], var7.field339 | 0xFF000000, 0, 11252, var7.field341);
            }
        }
        if (arg2 > -72) {
            method1647((byte) -77, null);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z", line = 103)
    public final boolean method1650(int arg0, int arg1) {
        field4119++;
        if (arg1 != 27365) {
            field4133 = null;
        }
        return arg0 >= 0 && arg0 < 112 ? this.field4122[arg0] : false;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 118)
    public final synchronized void method1651(byte arg0) {
        field4131++;
        if (arg0 >= -104) {
            this.keyPressed(null);
        }
        for (class170 var2 = this.field4128; var2 != null; var2 = var2.field2637) {
            if (var2.field2640 == 0) {
                if (var2.field2636 >= 0) {
                    var2.field2634 = !this.field4122[var2.field2636];
                }
                this.field4122[var2.field2636] = true;
            } else if (var2.field2640 == 1) {
                this.field4122[var2.field2636] = false;
            } else if (var2.field2640 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field4122[var3] = false;
                }
            }
        }
        this.field4124 = this.field4128;
        this.field4128 = null;
        this.field4114 = null;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V", line = 170)
    public static void method1652(int arg0) {
        if (arg0 >= -87) {
            method1652(-68);
        }
        field4133 = null;
        field4134 = null;
        field4126 = null;
    }

    @OriginalMember(owner = "client!fr", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 184)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4123++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class78.method570(160, var2)) {
            this.method1646(2, -1, -9985, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 198)
    private final void method1653(KeyEvent arg0, int arg1, int arg2) {
        field4135++;
        if (arg2 != 128) {
            this.field4124 = null;
        }
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class106.field1862.length > var4) {
            int var5 = class106.field1862[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1646(arg1, var6, -9985, '\u0000');
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Lpg;", line = 234)
    public final class494 method1654(byte arg0) {
        field4125++;
        class170 var2;
        for (var2 = this.field4124; var2 != null && var2.field2640 == -1; var2 = var2.field2637) {
        }
        int var3 = 101 % ((-arg0 - 85) / 36);
        if (var2 == null) {
            this.field4124 = null;
        } else {
            this.field4124 = var2.field2637;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 255)
    public final void focusGained(FocusEvent arg0) {
        field4132++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 263)
    private final void method1655(Component arg0, int arg1) {
        field4129++;
        if (arg1 != -2) {
            method1649(-128, -19, (byte) 54, 41, 101, 57, 126);
        }
        this.method1656((byte) 55);
        this.field4121 = arg0;
        Method var3 = class260.field3949;
        if (var3 != null) {
            try {
                var3.invoke(this.field4121, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field4121.addKeyListener(this);
        this.field4121.addFocusListener(this);
    }

    @OriginalMember(owner = "client!fr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 288)
    public final synchronized void focusLost(FocusEvent arg0) {
        field4120++;
        this.method1646(-1, 0, -9985, '\u0000');
    }

    @OriginalMember(owner = "client!fr", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 302)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4116++;
        this.method1653(arg0, 0, 128);
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 317)
    public class272(Component arg0) {
        class188.method1168(58);
        this.method1655(arg0, -2);
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)V", line = 330)
    private final void method1656(byte arg0) {
        field4117++;
        if (this.field4121 == null) {
            return;
        }
        this.field4121.removeKeyListener(this);
        this.field4121.removeFocusListener(this);
        this.field4121 = null;
        if (arg0 < 31) {
            return;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field4122[var2] = false;
        }
        this.field4124 = null;
        this.field4128 = null;
        this.field4114 = null;
    }
}
