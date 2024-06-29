import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class45 extends class394 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Lfca;")
    private class661 field510 = new class661();

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lfca;")
    private class661 field518 = new class661();

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "[Z")
    private boolean[] field521 = new boolean[112];

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "J")
    public static long field503;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field523;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "[I")
    public static int[] field507;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[[S")
    public static short[][] field513;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method269(int arg0, Component arg1) {
        field508++;
        this.method277((byte) 94);
        this.field523 = arg1;
        Method var3 = class775.field10563;
        if (var3 != null) {
            try {
                var3.invoke(this.field523, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field523.addKeyListener(this);
        if (arg0 == 21024) {
            this.field523.addFocusListener(this);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Lmr;")
    public final class637 method270(int arg0) {
        field509++;
        if (arg0 != 122) {
            method275((byte) -106, -113);
        }
        return (class637) this.field510.method3599(-74);
    }

    @OriginalMember(owner = "client!wh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method272(-1, (byte) 112, '\u0000', 0);
        field516++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)Z")
    public final boolean method271(byte arg0, int arg1) {
        field505++;
        if (arg1 >= 0 && arg1 < 112) {
            return arg0 < 89 ? true : this.field521[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBCI)V")
    private final void method272(int arg0, byte arg1, char arg2, int arg3) {
        field506++;
        if (arg1 < 83) {
            this.method271((byte) 29, 91);
        }
        class63 var5 = new class63();
        var5.field832 = arg2;
        var5.field826 = arg0;
        var5.field831 = arg3;
        var5.field823 = class502.method2786(-7114);
        this.field518.method3593(var5, 15);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lda;)V")
    public static final void method273(class420 arg0) {
        class28.field243 = arg0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public final synchronized void method274(boolean arg0) {
        field502++;
        this.field510.method3594(119);
        class63 var2 = (class63) this.field518.method3599(-64);
        if (arg0) {
            return;
        }
        while (var2 != null) {
            var2.field824 = this.method281((byte) 118);
            if (var2.field826 == 0) {
                if (!this.field521[var2.field831]) {
                    class63 var5 = new class63();
                    var5.field824 = var2.field824;
                    var5.field832 = '\u0000';
                    var5.field826 = 0;
                    var5.field823 = var2.field823;
                    var5.field831 = var2.field831;
                    this.field510.method3593(var5, 15);
                    this.field521[var2.field831] = true;
                }
                var2.field826 = 2;
                this.field510.method3593(var2, 15);
            } else if (var2.field826 == 1) {
                if (this.field521[var2.field831]) {
                    this.field510.method3593(var2, 15);
                    this.field521[var2.field831] = false;
                }
            } else if (var2.field826 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field521[var3]) {
                        class63 var4 = new class63();
                        var4.field832 = '\u0000';
                        var4.field831 = var3;
                        var4.field826 = 1;
                        var4.field824 = var2.field824;
                        var4.field823 = var2.field823;
                        this.field510.method3593(var4, 15);
                        this.field521[var3] = false;
                    }
                }
            } else if (var2.field826 == 3) {
                this.field510.method3593(var2, 15);
            }
            var2 = (class63) this.field518.method3599(-86);
        }
    }

    @OriginalMember(owner = "client!wh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field522++;
    }

    @OriginalMember(owner = "client!wh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method280(arg0, -1, 0);
        field515++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(BI)Llia;")
    public static final class200 method275(byte arg0, int arg1) {
        if (arg0 >= -25) {
            return null;
        } else {
            field512++;
            return new class200(arg1, false);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    public final void method276(byte arg0) {
        field517++;
        if (arg0 != -23) {
            field507 = null;
        }
        this.method277((byte) 113);
    }

    @OriginalMember(owner = "client!wh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field524++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class453.method2578(var2, true)) {
            this.method272(3, (byte) 96, var2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    private final void method277(byte arg0) {
        field520++;
        if (this.field523 == null) {
            return;
        }
        this.field523.removeKeyListener(this);
        this.field523.removeFocusListener(this);
        this.field523 = null;
        int var2 = 0;
        if (arg0 <= 38) {
            field513 = null;
        }
        while (var2 < 112) {
            this.field521[var2] = false;
            var2++;
        }
        this.field510.method3594(125);
        this.field518.method3594(-110);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static final void method278(int arg0) {
        field511++;
        class311.field3893.method2919(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static void method279(int arg0) {
        field513 = null;
        field507 = null;
        if (arg0 != -1202) {
            method273(null);
        }
    }

    @OriginalMember(owner = "client!wh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field519++;
        this.method280(arg0, -1, 1);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method280(KeyEvent arg0, int arg1, int arg2) {
        field504++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class774.field10550.length) {
            int var5 = class774.field10550[var4];
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
        this.method272(arg2, (byte) 91, '\u0000', var6);
        arg0.consume();
        if (arg1 != -1) {
            field507 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I")
    private final int method281(byte arg0) {
        if (arg0 < 50) {
            method279(17);
        }
        field514++;
        int var2 = 0;
        if (this.field521[81]) {
            var2 |= 0x1;
        }
        if (this.field521[82]) {
            var2 |= 0x4;
        }
        if (this.field521[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class45(Component arg0) {
        class67.method390(-21079);
        this.method269(21024, arg0);
    }
}
