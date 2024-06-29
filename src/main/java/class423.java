import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class423 extends class280 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "Loe;")
    private class183 field6017 = new class183();

    @OriginalMember(owner = "client!iga", name = "x", descriptor = "Loe;")
    private class183 field6029 = new class183();

    @OriginalMember(owner = "client!iga", name = "y", descriptor = "[Z")
    private boolean[] field6030 = new boolean[112];

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!iga", name = "q", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!iga", name = "r", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!iga", name = "s", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!iga", name = "t", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!iga", name = "v", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!iga", name = "w", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!iga", name = "B", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!iga", name = "A", descriptor = "Lq;")
    public static class394 field6032;

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "Ljava/awt/Component;")
    private Component field6031;

    @OriginalMember(owner = "client!iga", name = "u", descriptor = "[[B")
    public static byte[][] field6026;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V", line = 3)
    public final synchronized void method1686(int arg0) {
        field6023++;
        this.field6017.method1131((byte) -118);
        for (class541 var2 = (class541) this.field6029.method1137(arg0); var2 != null; var2 = (class541) this.field6029.method1137(-1)) {
            var2.field7864 = this.method2559((byte) -128);
            if (var2.field7858 == 0) {
                if (!this.field6030[var2.field7863]) {
                    class541 var3 = new class541();
                    var3.field7858 = 0;
                    var3.field7863 = var2.field7863;
                    var3.field7864 = var2.field7864;
                    var3.field7868 = var2.field7868;
                    var3.field7860 = '\u0000';
                    this.field6017.method1129(var3, 262144);
                    this.field6030[var2.field7863] = true;
                }
                var2.field7858 = 2;
                this.field6017.method1129(var2, 262144);
            } else if (var2.field7858 == 1) {
                if (this.field6030[var2.field7863]) {
                    this.field6017.method1129(var2, arg0 ^ 0xFFFBFFFF);
                    this.field6030[var2.field7863] = false;
                }
            } else if (var2.field7858 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field6030[var4]) {
                        class541 var5 = new class541();
                        var5.field7864 = var2.field7864;
                        var5.field7860 = '\u0000';
                        var5.field7868 = var2.field7868;
                        var5.field7858 = 1;
                        var5.field7863 = var4;
                        this.field6017.method1129(var5, 262144);
                        this.field6030[var4] = false;
                    }
                }
            } else if (var2.field7858 == 3) {
                this.field6017.method1129(var2, 262144);
            }
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 90)
    private final void method2553(Component arg0, int arg1) {
        field6022++;
        this.method2554((byte) 107);
        this.field6031 = arg0;
        Method var3 = class248.field3418;
        if (var3 != null) {
            try {
                var3.invoke(this.field6031, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg1 != 1) {
            this.method2558(null, 63, (byte) -88);
        }
        this.field6031.addKeyListener(this);
        this.field6031.addFocusListener(this);
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)V", line = 117)
    private final void method2554(byte arg0) {
        field6025++;
        if (this.field6031 == null) {
            return;
        }
        this.field6031.removeKeyListener(this);
        this.field6031.removeFocusListener(this);
        this.field6031 = null;
        if (arg0 <= 28) {
            return;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field6030[var2] = false;
        }
        this.field6017.method1131((byte) -97);
        this.field6029.method1131((byte) -73);
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(B)[Lop;", line = 145)
    public static final class172[] method2555(byte arg0) {
        field6012++;
        if (arg0 != 122) {
            field6032 = null;
        }
        return new class172[] { class469.field6560, class582.field8477, class601.field8665 };
    }

    @OriginalMember(owner = "client!iga", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 157)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field6014++;
        this.method2558(arg0, 1, (byte) 73);
    }

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "(B)V", line = 168)
    public static void method2556(byte arg0) {
        if (arg0 < 125) {
            method2556((byte) -61);
        }
        field6026 = null;
        field6032 = null;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(CIII)V", line = 179)
    private final void method2557(char arg0, int arg1, int arg2, int arg3) {
        field6020++;
        class541 var5 = new class541();
        var5.field7863 = arg1;
        var5.field7860 = arg0;
        if (arg2 != 0) {
            this.keyReleased(null);
        }
        var5.field7858 = arg3;
        var5.field7868 = class301.method1787((byte) 39);
        this.field6029.method1129(var5, 262144);
    }

    @OriginalMember(owner = "client!iga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 198)
    public final void focusGained(FocusEvent arg0) {
        field6027++;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(Z)V", line = 207)
    public final void method1684(boolean arg0) {
        field6016++;
        this.method2554((byte) 45);
        if (!arg0) {
            field6026 = null;
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 360)
    public class423(Component arg0) {
        class88.method697(32060);
        this.method2553(arg0, 1);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V", line = 226)
    private final void method2558(KeyEvent arg0, int arg1, byte arg2) {
        int var4 = -38 % ((arg2 - 1) / 58);
        field6028++;
        int var5 = arg0.getKeyCode();
        int var7;
        if (var5 == 0) {
            var7 = 0;
        } else if (var5 >= 0 && class586.field8510.length > var5) {
            int var6 = class586.field8510[var5];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var7 = 0;
            } else {
                var7 = var6 & 0xFFFFFF7F;
            }
        } else {
            var7 = 0;
        }
        if (var7 != 0) {
            this.method2557('\u0000', var7, 0, arg1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!iga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 265)
    public final synchronized void focusLost(FocusEvent arg0) {
        field6011++;
        this.method2557('\u0000', 0, 0, -1);
    }

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "(B)I", line = 284)
    private final int method2559(byte arg0) {
        field6015++;
        if (arg0 >= -2) {
            return 50;
        }
        int var2 = 0;
        if (this.field6030[81]) {
            var2 |= 0x1;
        }
        if (this.field6030[82]) {
            var2 |= 0x4;
        }
        if (this.field6030[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)Z", line = 311)
    public final boolean method1687(int arg0, int arg1) {
        field6013++;
        if (arg0 != -7653) {
            method2555((byte) -70);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field6030[arg1] : false;
    }

    @OriginalMember(owner = "client!iga", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 325)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2558(arg0, 0, (byte) 106);
        field6018++;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)Lbi;", line = 333)
    public final class446 method1683(boolean arg0) {
        if (!arg0) {
            this.method2558(null, 8, (byte) -52);
        }
        field6033++;
        return (class446) this.field6017.method1137(-1);
    }

    @OriginalMember(owner = "client!iga", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 346)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6019++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class184.method1148(var2, 85)) {
            this.method2557(var2, -1, 0, 3);
            arg0.consume();
        }
    }
}
