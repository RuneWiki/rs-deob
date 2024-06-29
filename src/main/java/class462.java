import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class462 extends class517 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Ldm;")
    private class46 field6479 = new class46();

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Ldm;")
    private class46 field6493 = new class46();

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "[Z")
    private boolean[] field6495 = new boolean[112];

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field6478 = 0;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Ljava/awt/Component;")
    private Component field6496;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2690(byte arg0, Component arg1) {
        this.method2696(true);
        field6494++;
        this.field6496 = arg1;
        Method var3 = class288.field3980;
        if (var3 != null) {
            try {
                var3.invoke(this.field6496, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 != -37) {
            field6488 = 73;
        }
        this.field6496.addKeyListener(this);
        this.field6496.addFocusListener(this);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z")
    public final boolean method2691(int arg0, int arg1) {
        field6481++;
        if (arg0 >= 0 && arg0 < 112) {
            return arg1 == 19521 ? this.field6495[arg0] : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)I")
    private final int method2692(boolean arg0) {
        field6491++;
        if (!arg0) {
            this.field6493 = null;
        }
        int var2 = 0;
        if (this.field6495[81]) {
            var2 |= 0x1;
        }
        if (this.field6495[82]) {
            var2 |= 0x4;
        }
        if (this.field6495[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BCII)V")
    private final void method2693(byte arg0, char arg1, int arg2, int arg3) {
        field6485++;
        class561 var5 = new class561();
        var5.field7772 = arg1;
        var5.field7773 = arg3;
        var5.field7778 = arg2;
        var5.field7766 = class488.method2835(30160);
        if (arg0 != 13) {
            this.method2698(97);
        }
        this.field6493.method463(var5, -117);
    }

    @OriginalMember(owner = "client!ac", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6483++;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public static final void method2694(int arg0) {
        field6476++;
        if (!class491.field6875.method2608(class103.field1570, (byte) -97) && class67.field1116 != class206.field2901) {
            class228.method1451(class193.field2733, 10, class88.field1390, 28221, false);
            return;
        }
        class456.method2670(class69.field1165, 0);
        if (class235.field3303 != class206.field2901) {
            class78.method602((byte) 105);
        }
        if (arg0 != 86) {
            field6488 = -119;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Laca;")
    public final class620 method2695(int arg0) {
        if (arg0 == -65) {
            field6477++;
            return (class620) this.field6479.method459(3553);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field6492++;
        this.method2693((byte) 13, '\u0000', -1, 0);
    }

    @OriginalMember(owner = "client!ac", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2699(0, arg0, 0);
        field6489++;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    private final void method2696(boolean arg0) {
        field6484++;
        if (this.field6496 == null) {
            return;
        }
        this.field6496.removeKeyListener(this);
        this.field6496.removeFocusListener(this);
        this.field6496 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field6495[var2] = false;
        }
        this.field6479.method465(arg0);
        this.field6493.method465(arg0);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method2697(int arg0) {
        field6486++;
        if (arg0 != -123) {
            this.field6495 = null;
        }
        this.method2696(true);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public final synchronized void method2698(int arg0) {
        field6487++;
        this.field6479.method465(true);
        class561 var2 = (class561) this.field6493.method459(3553);
        int var3 = 86 % ((-arg0 - 29) / 57);
        while (var2 != null) {
            var2.field7768 = this.method2692(true);
            if (var2.field7778 == 0) {
                if (!this.field6495[var2.field7773]) {
                    class561 var6 = new class561();
                    var6.field7768 = var2.field7768;
                    var6.field7778 = 0;
                    var6.field7772 = '\u0000';
                    var6.field7766 = var2.field7766;
                    var6.field7773 = var2.field7773;
                    this.field6479.method463(var6, -97);
                    this.field6495[var2.field7773] = true;
                }
                var2.field7778 = 2;
                this.field6479.method463(var2, -93);
            } else if (var2.field7778 == 1) {
                if (this.field6495[var2.field7773]) {
                    this.field6479.method463(var2, -101);
                    this.field6495[var2.field7773] = false;
                }
            } else if (var2.field7778 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field6495[var4]) {
                        class561 var5 = new class561();
                        var5.field7768 = var2.field7768;
                        var5.field7772 = '\u0000';
                        var5.field7773 = var4;
                        var5.field7766 = var2.field7766;
                        var5.field7778 = 1;
                        this.field6479.method463(var5, -117);
                        this.field6495[var4] = false;
                    }
                }
            } else if (var2.field7778 == 3) {
                this.field6479.method463(var2, -120);
            }
            var2 = (class561) this.field6493.method459(3553);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
    private final void method2699(int arg0, KeyEvent arg1, int arg2) {
        field6474++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class385.field5164.length) {
            int var6 = class385.field5164[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2693((byte) 13, (char) arg2, arg0, var5);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!ac", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2699(1, arg0, 0);
        field6482++;
    }

    @OriginalMember(owner = "client!ac", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6475++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class224.method1439(113, var2)) {
            this.method2693((byte) 13, var2, 3, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class462(Component arg0) {
        class155.method1007(61);
        this.method2690((byte) -37, arg0);
    }
}
