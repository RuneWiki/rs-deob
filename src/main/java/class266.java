import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class266 extends class236 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "Lkba;")
    private class108 field3518 = new class108();

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "Lkba;")
    private class108 field3528 = new class108();

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "[Z")
    private boolean[] field3530 = new boolean[112];

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field3520 = -2;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "Lvea;")
    public static class276 field3510 = new class276(1, 2, 2, 0);

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!oca", name = "v", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!oca", name = "y", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!oca", name = "B", descriptor = "Luaa;")
    public static class119 field3527;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "Ljava/awt/Component;")
    private Component field3529;

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "[I")
    public static int[] field3526;

    @OriginalMember(owner = "client!oca", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 4)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3524++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class10.method22((byte) 102, var2)) {
            this.method1595(3, -1, var2, false);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oca", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 19)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3506++;
        this.method1592((byte) 61, 1, arg0);
    }

    @OriginalMember(owner = "client!oca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 27)
    public final void focusGained(FocusEvent arg0) {
        field3525++;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 34)
    public static final boolean method1590(byte arg0, String arg1) {
        if (arg0 != 53) {
            field3526 = null;
        }
        field3511++;
        return class569.method3202(true, 30883, 10, arg1);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V", line = 47)
    public final void method1420(byte arg0) {
        if (arg0 <= -9) {
            this.method1591(128);
            field3508++;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V", line = 59)
    private final void method1591(int arg0) {
        field3507++;
        if (this.field3529 == null) {
            return;
        }
        this.field3529.removeKeyListener(this);
        this.field3529.removeFocusListener(this);
        this.field3529 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3530[var2] = false;
        }
        if (arg0 != 128) {
            field3510 = null;
        }
        this.field3518.method728((byte) 47);
        this.field3528.method728((byte) 47);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V", line = 94)
    private final void method1592(byte arg0, int arg1, KeyEvent arg2) {
        field3509++;
        int var4 = arg2.getKeyCode();
        if (arg0 != 61) {
            this.field3530 = null;
        }
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class653.field9094.length) {
            int var5 = class653.field9094[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1595(arg1, var6, '\u0000', false);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(B)I", line = 131)
    private final int method1593(byte arg0) {
        field3519++;
        int var2 = 0;
        if (this.field3530[81]) {
            var2 |= 0x1;
        }
        if (arg0 <= 32) {
            return -81;
        }
        if (this.field3530[82]) {
            var2 |= 0x4;
        }
        if (this.field3530[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V", line = 156)
    public final synchronized void method1421(byte arg0) {
        field3512++;
        this.field3518.method728((byte) 47);
        for (class42 var2 = (class42) this.field3528.method727(6494); var2 != null; var2 = (class42) this.field3528.method727(6494)) {
            var2.field428 = this.method1593((byte) 127);
            if (var2.field431 == 0) {
                if (!this.field3530[var2.field433]) {
                    class42 var5 = new class42();
                    var5.field430 = var2.field430;
                    var5.field428 = var2.field428;
                    var5.field431 = 0;
                    var5.field427 = '\u0000';
                    var5.field433 = var2.field433;
                    this.field3518.method725(var5, -20911);
                    this.field3530[var2.field433] = true;
                }
                var2.field431 = 2;
                this.field3518.method725(var2, -20911);
            } else if (var2.field431 == 1) {
                if (this.field3530[var2.field433]) {
                    this.field3518.method725(var2, -20911);
                    this.field3530[var2.field433] = false;
                }
            } else if (var2.field431 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field3530[var3]) {
                        class42 var4 = new class42();
                        var4.field428 = var2.field428;
                        var4.field433 = var3;
                        var4.field430 = var2.field430;
                        var4.field431 = 1;
                        var4.field427 = '\u0000';
                        this.field3518.method725(var4, -20911);
                        this.field3530[var3] = false;
                    }
                }
            } else if (var2.field431 == 3) {
                this.field3518.method725(var2, -20911);
            }
        }
        if (arg0 > -74) {
            method1598(102);
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V", line = 245)
    public static void method1594(int arg0) {
        if (arg0 != 3) {
            method1594(48);
        }
        field3510 = null;
        field3526 = null;
        field3527 = null;
    }

    @OriginalMember(owner = "client!oca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 257)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3513++;
        this.method1595(-1, 0, '\u0000', false);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IICZ)V", line = 266)
    private final void method1595(int arg0, int arg1, char arg2, boolean arg3) {
        field3522++;
        class42 var5 = new class42();
        var5.field433 = arg1;
        var5.field427 = arg2;
        var5.field431 = arg0;
        var5.field430 = class538.method2963(-47);
        if (arg3) {
            field3527 = null;
        }
        this.field3528.method725(var5, -20911);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(BI)V", line = 290)
    public static final void method1596(byte arg0, int arg1) {
        if (arg0 <= 88) {
            method1596((byte) -39, 78);
        }
        class554.field7826.method1569((byte) 62, arg1);
        field3516++;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 301)
    private final void method1597(Component arg0, int arg1) {
        this.method1591(128);
        field3515++;
        this.field3529 = arg0;
        Method var3 = class739.field10308;
        if (var3 != null) {
            try {
                var3.invoke(this.field3529, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3529.addKeyListener(this);
        this.field3529.addFocusListener(this);
        if (arg1 > -117) {
            this.keyReleased(null);
        }
    }

    @OriginalMember(owner = "client!oca", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 331)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1592((byte) 61, 0, arg0);
        field3523++;
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V", line = 339)
    public static final void method1598(int arg0) {
        field3514++;
        for (class189 var1 = (class189) class56.field574.method724(32); var1 != null; var1 = (class189) class56.field574.method723(94)) {
            if (var1.field2281) {
                var1.method315(79);
            } else {
                var1.field2280 = true;
                if (var1.field2269 >= 0 && var1.field2270 >= 0 && var1.field2269 < class272.field3589 && var1.field2270 < class3.field26) {
                    class756.method4208((byte) 109, var1);
                }
            }
        }
        for (class189 var2 = (class189) class103.field1381.method724(32); var2 != null; var2 = (class189) class103.field1381.method723(98)) {
            if (var2.field2281) {
                var2.method315(53);
            } else {
                var2.field2280 = true;
            }
        }
        int var3 = -114 % ((81 - arg0) / 36);
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 424)
    public class266(Component arg0) {
        class321.method1920(false);
        this.method1597(arg0, -124);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(II)Z", line = 389)
    public final boolean method1426(int arg0, int arg1) {
        field3521++;
        if (arg0 >= 0 && arg0 < 112) {
            return arg1 == 5503 ? this.field3530[arg0] : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)Ldb;", line = 405)
    public final class326 method1423(byte arg0) {
        if (arg0 != 31) {
            this.field3518 = null;
        }
        field3517++;
        return (class326) this.field3518.method727(6494);
    }
}
