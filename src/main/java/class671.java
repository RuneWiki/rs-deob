import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class671 extends class185 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "Luh;")
    private class168 field9165 = new class168();

    @OriginalMember(owner = "client!vfa", name = "v", descriptor = "Luh;")
    private class168 field9166 = new class168();

    @OriginalMember(owner = "client!vfa", name = "w", descriptor = "[Z")
    private boolean[] field9167 = new boolean[112];

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "Lmu;")
    public static class303 field9152 = new class303(14, 2);

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!vfa", name = "m", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!vfa", name = "q", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "I")
    public static int field9164;

    @OriginalMember(owner = "client!vfa", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field9168;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)Lll;", line = 7)
    public final class366 method1347(int arg0) {
        if (arg0 != 0) {
            this.field9167 = null;
        }
        field9149++;
        return (class366) this.field9165.method1271(8);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)Z", line = 19)
    public final boolean method1346(int arg0, int arg1) {
        if (arg1 >= -120) {
            this.method3767((byte) 119);
        }
        field9163++;
        return arg0 >= 0 && arg0 < 112 ? this.field9167[arg0] : false;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 36)
    private final void method3767(byte arg0) {
        if (arg0 != -104) {
            return;
        }
        field9157++;
        if (this.field9168 == null) {
            return;
        }
        this.field9168.removeKeyListener(this);
        this.field9168.removeFocusListener(this);
        this.field9168 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field9167[var2] = false;
        }
        this.field9165.method1270(116);
        this.field9166.method1270(arg0 ^ 0xFFFFFFE4);
    }

    @OriginalMember(owner = "client!vfa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 66)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field9150++;
        this.method3768(arg0, 0, 0);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 76)
    private final void method3768(KeyEvent arg0, int arg1, int arg2) {
        field9162++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class492.field6818.length) {
            int var5 = class492.field6818[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (arg1 != var6) {
            this.method3769(var6, 128, '\u0000', arg2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V", line = 111)
    public final void method1348(int arg0) {
        field9154++;
        this.method3767((byte) -104);
        if (arg0 != 14174) {
            this.field9166 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IICI)V", line = 122)
    private final void method3769(int arg0, int arg1, char arg2, int arg3) {
        field9156++;
        class663 var5 = new class663();
        var5.field9076 = arg3;
        var5.field9072 = arg0;
        var5.field9066 = arg2;
        var5.field9069 = class554.method3190(-102);
        this.field9166.method1273(var5, -20180);
        if (arg1 != 128) {
            this.field9168 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 139)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field9153++;
        this.method3768(arg0, 0, 1);
    }

    @OriginalMember(owner = "client!vfa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 148)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field9151++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class514.method3009(-125, var2)) {
            this.method3769(-1, 128, var2, 3);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 162)
    public final void focusGained(FocusEvent arg0) {
        field9164++;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIB)V", line = 169)
    public static final void method3770(int arg0, int arg1, int arg2, byte arg3) {
        field9160++;
        class387 var4 = class168.field2643[arg1][arg2];
        if (arg3 == -13) {
            class670.method3762(false, arg0, var4 == null ? class497.field6955 : var4);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)I", line = 183)
    private final int method3771(byte arg0) {
        field9155++;
        int var2 = 0;
        if (this.field9167[81]) {
            var2 |= 0x1;
        }
        if (arg0 != 127) {
            return 25;
        }
        if (this.field9167[82]) {
            var2 |= 0x4;
        }
        if (this.field9167[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 207)
    public final synchronized void method1345(int arg0) {
        field9158++;
        this.field9165.method1270(110);
        if (arg0 < 51) {
            return;
        }
        for (class663 var2 = (class663) this.field9166.method1271(8); var2 != null; var2 = (class663) this.field9166.method1271(8)) {
            var2.field9071 = this.method3771((byte) 127);
            if (var2.field9076 == 0) {
                if (!this.field9167[var2.field9072]) {
                    class663 var3 = new class663();
                    var3.field9072 = var2.field9072;
                    var3.field9076 = 0;
                    var3.field9066 = '\u0000';
                    var3.field9071 = var2.field9071;
                    var3.field9069 = var2.field9069;
                    this.field9165.method1273(var3, -20180);
                    this.field9167[var2.field9072] = true;
                }
                var2.field9076 = 2;
                this.field9165.method1273(var2, -20180);
            } else if (var2.field9076 == 1) {
                if (this.field9167[var2.field9072]) {
                    this.field9165.method1273(var2, -20180);
                    this.field9167[var2.field9072] = false;
                }
            } else if (var2.field9076 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field9167[var4]) {
                        class663 var5 = new class663();
                        var5.field9066 = '\u0000';
                        var5.field9072 = var4;
                        var5.field9071 = var2.field9071;
                        var5.field9076 = 1;
                        var5.field9069 = var2.field9069;
                        this.field9165.method1273(var5, -20180);
                        this.field9167[var4] = false;
                    }
                }
            } else if (var2.field9076 == 3) {
                this.field9165.method1273(var2, -20180);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 299)
    public final synchronized void focusLost(FocusEvent arg0) {
        field9161++;
        this.method3769(0, 128, '\u0000', -1);
    }

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(I)V", line = 307)
    public static void method3772(int arg0) {
        field9152 = null;
        if (arg0 != 14645) {
            method3772(1);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 320)
    private final void method3773(Component arg0, int arg1) {
        this.method3767((byte) -104);
        if (arg1 != 2) {
            method3772(-19);
        }
        field9159++;
        this.field9168 = arg0;
        Method var3 = class158.field2531;
        if (var3 != null) {
            try {
                var3.invoke(this.field9168, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field9168.addKeyListener(this);
        this.field9168.addFocusListener(this);
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 361)
    public class671(Component arg0) {
        class548.method3159((byte) -82);
        this.method3773(arg0, 2);
    }
}
