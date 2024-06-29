import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class224 extends class472 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!su", name = "v", descriptor = "Ljia;")
    private class645 field3282 = new class645();

    @OriginalMember(owner = "client!su", name = "y", descriptor = "Ljia;")
    private class645 field3285 = new class645();

    @OriginalMember(owner = "client!su", name = "B", descriptor = "[Z")
    private boolean[] field3288 = new boolean[112];

    @OriginalMember(owner = "client!su", name = "n", descriptor = "Lfja;")
    public static class783 field3274 = new class783(74, 6);

    @OriginalMember(owner = "client!su", name = "r", descriptor = "Lwu;")
    public static class394 field3278 = null;

    @OriginalMember(owner = "client!su", name = "x", descriptor = "I")
    public static int field3284 = 0;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!su", name = "h", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!su", name = "k", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!su", name = "z", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!su", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field3287;

    @OriginalMember(owner = "client!su", name = "w", descriptor = "[Lwaa;")
    public static class732[] field3283;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "[[[Lni;")
    public static class549[][][] field3279;

    @OriginalMember(owner = "client!su", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3286++;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public final synchronized void method1527(int arg0) {
        field3272++;
        this.field3282.method3590((byte) -116);
        if (arg0 != 18696) {
            field3278 = null;
        }
        for (class708 var2 = (class708) this.field3285.method3584(arg0 + 4591); var2 != null; var2 = (class708) this.field3285.method3584(23287)) {
            var2.field9734 = this.method1532(5);
            if (var2.field9736 == 0) {
                if (!this.field3288[var2.field9731]) {
                    class708 var5 = new class708();
                    var5.field9736 = 0;
                    var5.field9735 = var2.field9735;
                    var5.field9731 = var2.field9731;
                    var5.field9738 = '\u0000';
                    var5.field9734 = var2.field9734;
                    this.field3282.method3594((byte) 98, var5);
                    this.field3288[var2.field9731] = true;
                }
                var2.field9736 = 2;
                this.field3282.method3594((byte) -24, var2);
            } else if (var2.field9736 == 1) {
                if (this.field3288[var2.field9731]) {
                    this.field3282.method3594((byte) 124, var2);
                    this.field3288[var2.field9731] = false;
                }
            } else if (var2.field9736 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field3288[var3]) {
                        class708 var4 = new class708();
                        var4.field9734 = var2.field9734;
                        var4.field9736 = 1;
                        var4.field9731 = var3;
                        var4.field9738 = '\u0000';
                        var4.field9735 = var2.field9735;
                        this.field3282.method3594((byte) 122, var4);
                        this.field3288[var3] = false;
                    }
                }
            } else if (var2.field9736 == 3) {
                this.field3282.method3594((byte) 124, var2);
            }
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1528(int arg0, Component arg1) {
        field3275++;
        this.method1537((byte) 94);
        this.field3287 = arg1;
        Method var3 = class742.field10246;
        if (arg0 > -38) {
            field3279 = null;
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field3287, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field3287.addKeyListener(this);
        this.field3287.addFocusListener(this);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
    public final void method1529(boolean arg0) {
        if (arg0) {
            method1538(false);
        }
        field3263++;
        this.method1537((byte) 126);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Lofa;")
    public final class349 method1530(byte arg0) {
        if (arg0 >= -81) {
            this.method1530((byte) 4);
        }
        field3273++;
        return (class349) this.field3282.method3584(23287);
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(II)Z")
    public final boolean method1531(int arg0, int arg1) {
        field3270++;
        if (arg0 < 64) {
            field3278 = null;
        }
        return arg1 >= 0 && arg1 < 112 ? this.field3288[arg1] : false;
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(I)I")
    private final int method1532(int arg0) {
        field3266++;
        int var2 = 0;
        if (arg0 != 5) {
            field3283 = null;
        }
        if (this.field3288[81]) {
            var2 |= 0x1;
        }
        if (this.field3288[82]) {
            var2 |= 0x4;
        }
        if (this.field3288[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!su", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1535(105, 0, arg0);
        field3264++;
    }

    @OriginalMember(owner = "client!su", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3281++;
        this.method1535(52, 1, arg0);
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(II)Z")
    public static final boolean method1533(int arg0, int arg1) {
        if (arg1 == -6) {
            field3267++;
            return arg0 == 3 || arg0 == 5 || arg0 == 6;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)[I")
    public static final int[] method1534(byte arg0, int arg1) {
        field3265++;
        class127.method1087((byte) 83, class258.method1685(arg1, (byte) -49));
        int[] var2 = new int[] { class60.field821.get(5), class60.field821.get(2), 0 };
        if (arg0 != 75) {
            method1539(false);
        }
        var2[2] = class60.field821.get(1);
        return var2;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
    private final void method1535(int arg0, int arg1, KeyEvent arg2) {
        field3280++;
        if (arg0 < 24) {
            return;
        }
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class414.field5667.length > var4) {
            int var5 = class414.field5667[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1536(arg1, var6, true, '\u0000');
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZC)V")
    private final void method1536(int arg0, int arg1, boolean arg2, char arg3) {
        if (!arg2) {
            field3278 = null;
        }
        field3271++;
        class708 var5 = new class708();
        var5.field9736 = arg0;
        var5.field9738 = arg3;
        var5.field9731 = arg1;
        var5.field9735 = class197.method1423(1);
        this.field3285.method3594((byte) 102, var5);
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V")
    private final void method1537(byte arg0) {
        field3268++;
        if (this.field3287 == null || arg0 < 88) {
            return;
        }
        this.field3287.removeKeyListener(this);
        this.field3287.removeFocusListener(this);
        this.field3287 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field3288[var2] = false;
        }
        this.field3282.method3590((byte) 82);
        this.field3285.method3590((byte) 50);
    }

    @OriginalMember(owner = "client!su", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field3277++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class65.method461(var2, -108)) {
            this.method1536(3, -1, true, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Z)V")
    public static void method1538(boolean arg0) {
        field3274 = null;
        field3283 = null;
        field3278 = null;
        field3279 = null;
        if (!arg0) {
            field3278 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "c", descriptor = "(Z)V")
    public static final void method1539(boolean arg0) {
        field3269++;
        class608.field8484.method273(127);
        if (!arg0) {
            field3279 = null;
        }
    }

    @OriginalMember(owner = "client!su", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3276++;
        this.method1536(-1, 0, true, '\u0000');
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class224(Component arg0) {
        class101.method885(190);
        this.method1528(-51, arg0);
    }
}
