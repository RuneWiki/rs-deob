import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class353 extends class77 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "[Z")
    private boolean[] field4925 = new boolean[112];

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Ltm;")
    public static class112 field4907 = new class112("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field4917 = -2;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "Lbd;")
    public static class464 field4921 = new class464(13, 3);

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "[I")
    public static int[] field4926 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "Llm;")
    public static class84 field4927 = new class84("", 12);

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field4928 = new String[100];

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lmb;")
    private class162 field4910;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Lmb;")
    private class162 field4912;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "Lmb;")
    private class162 field4915;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lfc;")
    public static class343 field4923;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field4905;

    @OriginalMember(owner = "client!mj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4904++;
        this.method2128(-1, -98, 0, '\u0000');
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2125(Component arg0, int arg1) {
        this.method2127((byte) 12);
        field4914++;
        this.field4905 = arg0;
        Method var3 = class14.field237;
        if (var3 != null) {
            try {
                var3.invoke(this.field4905, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field4905.addKeyListener(this);
        this.field4905.addFocusListener(this);
        int var4 = -100 % ((43 - arg1) / 61);
    }

    @OriginalMember(owner = "client!mj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4924++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public final void method528(boolean arg0) {
        this.method2127((byte) 12);
        field4920++;
        if (!arg0) {
            this.field4910 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4911++;
        this.method2126(arg0, -1, 1);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lau;")
    public final class304 method529(int arg0) {
        if (arg0 > -17) {
            this.keyTyped((KeyEvent) null);
        }
        field4918++;
        class162 var2;
        for (var2 = this.field4910; var2 != null && var2.field2319 == -1; var2 = var2.field2323) {
        }
        if (var2 == null) {
            this.field4910 = null;
        } else {
            this.field4910 = var2.field2323;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
    public final boolean method531(int arg0, int arg1) {
        field4913++;
        if (arg0 >= 0 && arg0 < 112) {
            return arg1 <= 44 ? false : this.field4925[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method2126(KeyEvent arg0, int arg1, int arg2) {
        field4909++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class203.field2916.length > var4) {
            int var5 = class203.field2916[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (~var6 != arg1) {
            this.method2128(arg2, -28, var6, '\u0000');
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    private final void method2127(byte arg0) {
        field4922++;
        if (this.field4905 == null) {
            return;
        }
        this.field4905.removeKeyListener(this);
        this.field4905.removeFocusListener(this);
        if (arg0 != 12) {
            this.method531(110, -23);
        }
        this.field4905 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field4925[var2] = false;
        }
        this.field4915 = null;
        this.field4910 = null;
        this.field4912 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIC)V")
    private final void method2128(int arg0, int arg1, int arg2, char arg3) {
        field4906++;
        class162 var5 = new class162();
        if (arg1 >= -2) {
            return;
        }
        var5.field2319 = arg0;
        var5.field2331 = arg2;
        var5.field2330 = arg3;
        var5.field2329 = class193.method1237(-9581);
        if (this.field4912 == null) {
            this.field4915 = var5;
        } else {
            this.field4912.field2323 = var5;
        }
        this.field4912 = var5;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public static final void method2129(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        if (var3 != null && var3.field5621 != null) {
            var3.field5621 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4908++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class119.method747((byte) 54, var2)) {
            this.method2128(2, -73, -1, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4919++;
        this.method2126(arg0, -1, 0);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final synchronized void method530(int arg0) {
        field4916++;
        if (arg0 != -21260) {
            this.method2125((Component) null, 10);
        }
        for (class162 var2 = this.field4915; var2 != null; var2 = var2.field2323) {
            if (var2.field2319 == 0) {
                if (var2.field2331 >= 0) {
                    var2.field2325 = !this.field4925[var2.field2331];
                }
                this.field4925[var2.field2331] = true;
            } else if (var2.field2319 == 1) {
                this.field4925[var2.field2331] = false;
            } else if (var2.field2319 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field4925[var3] = false;
                }
            }
        }
        this.field4910 = this.field4915;
        this.field4912 = null;
        this.field4915 = null;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static void method2130(int arg0) {
        field4921 = null;
        field4928 = null;
        field4926 = null;
        field4923 = null;
        if (arg0 == 16519) {
            field4907 = null;
            field4927 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class353(Component arg0) {
        class320.method1930(28314);
        this.method2125(arg0, 121);
    }
}
