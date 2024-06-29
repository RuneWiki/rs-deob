import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class445 extends class243 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!am", name = "v", descriptor = "[Z")
    private boolean[] field6646 = new boolean[112];

    @OriginalMember(owner = "client!am", name = "p", descriptor = "[Lcu;")
    public static class145[] field6640 = new class145[2048];

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Lrn;")
    public static class174 field6628 = new class174(16, 8);

    @OriginalMember(owner = "client!am", name = "z", descriptor = "[I")
    public static int[] field6650 = new int[1000];

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "Lbu;")
    public static class17 field6649;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lke;")
    private class422 field6630;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lke;")
    private class422 field6642;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Lke;")
    private class422 field6645;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field6648;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    private final void method2656(boolean arg0, Component arg1) {
        if (arg0) {
            field6640 = null;
        }
        field6636++;
        this.method2661(-116);
        this.field6648 = arg1;
        Method var3 = class293.field4184;
        if (var3 != null) {
            try {
                var3.invoke(this.field6648, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6648.addKeyListener(this);
        this.field6648.addFocusListener(this);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z")
    public final boolean method1584(int arg0, int arg1) {
        field6634++;
        if (arg0 == 14) {
            return arg1 >= 0 && arg1 < 112 ? this.field6646[arg1] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6641++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public static void method2657(int arg0) {
        field6650 = null;
        field6628 = null;
        field6640 = null;
        field6649 = null;
        if (arg0 != -7051) {
            field6628 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6633++;
        this.method2660(89, arg0, 0);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZCI)V")
    private final void method2658(int arg0, boolean arg1, char arg2, int arg3) {
        if (arg1) {
            this.method1585((byte) -77);
        }
        field6644++;
        class422 var5 = new class422();
        var5.field6305 = arg2;
        var5.field6298 = arg3;
        var5.field6302 = arg0;
        var5.field6303 = class211.method1419(12921);
        if (this.field6630 == null) {
            this.field6645 = var5;
        } else {
            this.field6630.field6300 = var5;
        }
        this.field6630 = var5;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
    public final synchronized void method1588(byte arg0) {
        int var2 = -91 / ((arg0 + 11) / 45);
        field6643++;
        for (class422 var3 = this.field6645; var3 != null; var3 = var3.field6300) {
            if (var3.field6298 == 0) {
                if (var3.field6302 >= 0) {
                    var3.field6299 = !this.field6646[var3.field6302];
                }
                this.field6646[var3.field6302] = true;
            } else if (var3.field6298 == 1) {
                this.field6646[var3.field6302] = false;
            } else if (var3.field6298 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    this.field6646[var4] = false;
                }
            }
        }
        this.field6642 = this.field6645;
        this.field6630 = null;
        this.field6645 = null;
    }

    @OriginalMember(owner = "client!am", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method2658(0, false, '\u0000', -1);
        field6632++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Z")
    public static final boolean method2659(int arg0, int arg1, int arg2) {
        if (arg2 != -15177) {
            method2657(119);
        }
        field6629++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!am", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field6635++;
        this.method2660(98, arg0, 1);
    }

    @OriginalMember(owner = "client!am", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6638++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class168.method1236(var2, (byte) 39)) {
            this.method2658(-1, false, var2, 2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
    private final void method2660(int arg0, KeyEvent arg1, int arg2) {
        field6647++;
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class520.field7730.length) {
            int var5 = class520.field7730[var4];
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
        this.method2658(var6, false, '\u0000', arg2);
        arg1.consume();
        if (arg0 <= 71) {
            method2657(96);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lec;")
    public final class156 method1585(byte arg0) {
        if (arg0 > -108) {
            field6628 = null;
        }
        field6631++;
        class422 var2;
        for (var2 = this.field6642; var2 != null && var2.field6298 == -1; var2 = var2.field6300) {
        }
        if (var2 == null) {
            this.field6642 = null;
        } else {
            this.field6642 = var2.field6300;
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    private final void method2661(int arg0) {
        field6637++;
        int var2 = 6 / ((arg0 - 15) / 59);
        if (this.field6648 == null) {
            return;
        }
        this.field6648.removeKeyListener(this);
        this.field6648.removeFocusListener(this);
        this.field6648 = null;
        for (int var3 = 0; var3 < 112; var3++) {
            this.field6646[var3] = false;
        }
        this.field6645 = null;
        this.field6630 = null;
        this.field6642 = null;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class445(Component arg0) {
        class393.method2435((byte) 126);
        this.method2656(false, arg0);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public final void method1586(byte arg0) {
        field6639++;
        this.method2661(77);
        int var2 = -117 / ((arg0 + 77) / 49);
    }
}
