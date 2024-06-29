import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class606 extends class457 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "Lmr;")
    private class611 field8600 = new class611();

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "Lmr;")
    private class611 field8603 = new class611();

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "[Z")
    private boolean[] field8605 = new boolean[112];

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "[S")
    public static short[] field8601 = new short[] { 17, 58, 46, 10, 9, 21, 3, 50 };

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field8586;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!iw", name = "l", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!iw", name = "m", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field8606;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIZC)V", line = 3)
    private final void method3529(int arg0, int arg1, boolean arg2, char arg3) {
        field8588++;
        class466 var5 = new class466();
        var5.field6633 = arg0;
        if (arg2) {
            field8592 = -48;
        }
        var5.field6641 = arg3;
        var5.field6634 = arg1;
        var5.field6638 = class465.method2818(255);
        this.field8603.method3559(var5, (byte) 12);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Z", line = 20)
    public final boolean method2780(int arg0, int arg1) {
        if (arg1 < 61) {
            this.keyReleased(null);
        }
        field8598++;
        return arg0 >= 0 && arg0 < 112 ? this.field8605[arg0] : false;
    }

    @OriginalMember(owner = "client!iw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 34)
    public final void focusGained(FocusEvent arg0) {
        field8593++;
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)I", line = 43)
    private final int method3530(byte arg0) {
        field8597++;
        int var2 = 0;
        if (this.field8605[81]) {
            var2 |= 0x1;
        }
        if (this.field8605[82]) {
            var2 |= 0x4;
        }
        if (this.field8605[86]) {
            var2 |= 0x2;
        }
        if (arg0 != -128) {
            this.field8603 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!iw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 66)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field8602++;
        this.method3533(arg0, (byte) 123, 0);
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)Lcca;", line = 77)
    public final class462 method2785(int arg0) {
        int var2 = -37 / ((35 - arg0) / 44);
        field8594++;
        return (class462) this.field8600.method3563(0);
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(Z)V", line = 90)
    public final synchronized void method2784(boolean arg0) {
        field8587++;
        this.field8600.method3553(0);
        for (class466 var2 = (class466) this.field8603.method3563(0); var2 != null; var2 = (class466) this.field8603.method3563(0)) {
            var2.field6642 = this.method3530((byte) -128);
            if (var2.field6634 == 0) {
                if (!this.field8605[var2.field6633]) {
                    class466 var3 = new class466();
                    var3.field6638 = var2.field6638;
                    var3.field6641 = '\u0000';
                    var3.field6634 = 0;
                    var3.field6633 = var2.field6633;
                    var3.field6642 = var2.field6642;
                    this.field8600.method3559(var3, (byte) 12);
                    this.field8605[var2.field6633] = true;
                }
                var2.field6634 = 2;
                this.field8600.method3559(var2, (byte) 12);
            } else if (var2.field6634 == 1) {
                if (this.field8605[var2.field6633]) {
                    this.field8600.method3559(var2, (byte) 12);
                    this.field8605[var2.field6633] = false;
                }
            } else if (var2.field6634 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field8605[var4]) {
                        class466 var5 = new class466();
                        var5.field6641 = '\u0000';
                        var5.field6642 = var2.field6642;
                        var5.field6638 = var2.field6638;
                        var5.field6633 = var4;
                        var5.field6634 = 1;
                        this.field8600.method3559(var5, (byte) 12);
                        this.field8605[var4] = false;
                    }
                }
            } else if (var2.field6634 == 3) {
                this.field8600.method3559(var2, (byte) 12);
            }
        }
        if (!arg0) {
            this.field8605 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 179)
    private final void method3531(Component arg0, byte arg1) {
        this.method3534(false);
        field8591++;
        this.field8606 = arg0;
        if (arg1 < 82) {
            this.field8603 = null;
        }
        Method var3 = class300.field4109;
        if (var3 != null) {
            try {
                var3.invoke(this.field8606, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field8606.addKeyListener(this);
        this.field8606.addFocusListener(this);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 212)
    public final void method2782(int arg0) {
        if (arg0 != 0) {
            field8601 = null;
        }
        this.method3534(false);
        field8595++;
    }

    @OriginalMember(owner = "client!iw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 226)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field8590++;
        this.method3533(arg0, (byte) 125, 1);
    }

    @OriginalMember(owner = "client!iw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 234)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method3529(0, -1, false, '\u0000');
        field8589++;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 350)
    public class606(Component arg0) {
        class535.method3236((byte) 2);
        this.method3531(arg0, (byte) 125);
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)V", line = 245)
    public static void method3532(byte arg0) {
        if (arg0 < 94) {
            field8601 = null;
        }
        field8601 = null;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V", line = 257)
    private final void method3533(KeyEvent arg0, byte arg1, int arg2) {
        if (arg1 <= 119) {
            return;
        }
        field8599++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class43.field725.length) {
            int var5 = class43.field725[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method3529(var6, arg2, false, '\u0000');
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!iw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 299)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field8604++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class503.method3078(var2, 1009)) {
            this.method3529(-1, 3, false, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(Z)V", line = 314)
    private final void method3534(boolean arg0) {
        field8596++;
        if (this.field8606 == null) {
            return;
        }
        this.field8606.removeKeyListener(this);
        this.field8606.removeFocusListener(this);
        this.field8606 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field8605[var2] = false;
        }
        if (arg0) {
            this.method2782(33);
        }
        this.field8600.method3553(0);
        this.field8603.method3553(0);
    }
}
