import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class444 extends class278 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!am", name = "n", descriptor = "[Z")
    private boolean[] field6517 = new boolean[112];

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lbe;")
    private class29 field6510;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "Lbe;")
    private class29 field6523;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Lbe;")
    private class29 field6524;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field6521;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[Lf;")
    public static class528[] field6515;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public static void method2696(byte arg0) {
        field6515 = null;
        if (arg0 <= 78) {
            method2696((byte) 87);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
    private final void method2697(int arg0, int arg1, KeyEvent arg2) {
        field6516++;
        int var4 = arg2.getKeyCode();
        if (arg1 != 2) {
            return;
        }
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class292.field4182.length > var4) {
            int var5 = class292.field4182[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method2700('\u0000', arg0, var6, 52);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2698(Component arg0, int arg1) {
        this.method2699((byte) -120);
        field6522++;
        this.field6521 = arg0;
        Method var3 = class312.field4480;
        if (var3 != null) {
            try {
                var3.invoke(this.field6521, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6521.addKeyListener(this);
        if (arg1 != -129) {
            field6515 = null;
        }
        this.field6521.addFocusListener(this);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Z")
    public final boolean method1767(int arg0, byte arg1) {
        field6513++;
        if (arg0 >= 0 && arg0 < 112) {
            int var3 = 13 % ((arg1 + 70) / 32);
            return this.field6517[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field6508++;
        this.method2697(0, 2, arg0);
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
    private final void method2699(byte arg0) {
        field6509++;
        if (this.field6521 == null) {
            return;
        }
        this.field6521.removeKeyListener(this);
        this.field6521.removeFocusListener(this);
        this.field6521 = null;
        int var2 = 0;
        int var3 = -106 % ((arg0 + 49) / 46);
        while (var2 < 112) {
            this.field6517[var2] = false;
            var2++;
        }
        this.field6523 = null;
        this.field6524 = null;
        this.field6510 = null;
    }

    @OriginalMember(owner = "client!am", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field6507++;
        this.method2700('\u0000', -1, 0, 93);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Lth;")
    public final class420 method1766(int arg0) {
        field6511++;
        if (arg0 != -9422) {
            return null;
        }
        class29 var2;
        for (var2 = this.field6523; var2 != null && var2.field474 == -1; var2 = var2.field464) {
        }
        if (var2 == null) {
            this.field6523 = null;
        } else {
            this.field6523 = var2.field464;
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public final void method1770(int arg0) {
        this.method2699((byte) 92);
        if (arg0 <= 99) {
            this.keyPressed(null);
        }
        field6520++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public final synchronized void method1769(byte arg0) {
        field6519++;
        for (class29 var2 = this.field6510; var2 != null; var2 = var2.field464) {
            if (var2.field474 == 0) {
                if (var2.field463 >= 0) {
                    var2.field478 = !this.field6517[var2.field463];
                }
                this.field6517[var2.field463] = true;
            } else if (var2.field474 == 1) {
                this.field6517[var2.field463] = false;
            } else if (var2.field474 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field6517[var3] = false;
                }
            }
        }
        this.field6523 = this.field6510;
        this.field6524 = null;
        this.field6510 = null;
        if (arg0 != 36) {
            this.field6521 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(CIII)V")
    private final void method2700(char arg0, int arg1, int arg2, int arg3) {
        field6512++;
        int var5 = -70 / ((arg3 + 11) / 40);
        class29 var6 = new class29();
        var6.field474 = arg1;
        var6.field471 = arg0;
        var6.field463 = arg2;
        var6.field466 = class464.method2773((byte) 103);
        if (this.field6524 == null) {
            this.field6510 = var6;
        } else {
            this.field6524.field464 = var6;
        }
        this.field6524 = var6;
    }

    @OriginalMember(owner = "client!am", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6514++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class55.method397(-19623, var2)) {
            this.method2700(var2, 2, -1, -75);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lci;BLjava/lang/Object;)V")
    public static final void method2701(class312 arg0, byte arg1, Object arg2) {
        field6525++;
        if (arg0.field4465 == null || arg1 != 98) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field4465.peekEvent() != null; var3++) {
            class185.method1285(123, 1L);
        }
        if (arg2 != null) {
            arg0.field4465.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class444(Component arg0) {
        class274.method1747(46);
        this.method2698(arg0, -129);
    }

    @OriginalMember(owner = "client!am", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field6518++;
    }

    @OriginalMember(owner = "client!am", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field6526++;
        this.method2697(1, 2, arg0);
    }
}
