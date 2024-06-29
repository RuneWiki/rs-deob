import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class255 extends class152 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "Lnj;")
    private class317 field4124 = new class317();

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Lnj;")
    private class317 field4140 = new class317();

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "[Z")
    private boolean[] field4142 = new boolean[112];

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field4125 = 0;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "Lss;")
    public static class213 field4139;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field4141;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "[I")
    public static int[] field4120;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)I")
    private final int method1744(byte arg0) {
        field4138++;
        if (arg0 < 60) {
            field4120 = null;
        }
        int var2 = 0;
        if (this.field4142[81]) {
            var2 |= 0x1;
        }
        if (this.field4142[82]) {
            var2 |= 0x4;
        }
        if (this.field4142[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
    public static void method1745(byte arg0) {
        int var1 = 46 / ((arg0 + 60) / 35);
        field4139 = null;
        field4120 = null;
    }

    @OriginalMember(owner = "client!hp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4135++;
    }

    @OriginalMember(owner = "client!hp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1750(0, -1, '\u0000', 127);
        field4137++;
    }

    @OriginalMember(owner = "client!hp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1751((byte) 118, 0, arg0);
        field4136++;
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
    private final void method1746(int arg0) {
        field4130++;
        if (this.field4141 == null) {
            return;
        }
        this.field4141.removeKeyListener(this);
        this.field4141.removeFocusListener(this);
        this.field4141 = null;
        for (int var2 = arg0; var2 < 112; var2++) {
            this.field4142[var2] = false;
        }
        this.field4124.method2120((byte) 27);
        this.field4140.method2120((byte) 27);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)Lgi;")
    public static final class437 method1747(int arg0, boolean arg1) {
        field4132++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class433.field6540[var2] == null || class433.field6540[var2][var3] == null) {
            boolean var4 = class385.method2479(0, var2);
            if (!var4) {
                return null;
            }
        }
        if (arg1) {
            method1745((byte) 14);
        }
        return class433.field6540[var2][var3];
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public final synchronized void method925(byte arg0) {
        field4134++;
        this.field4124.method2120((byte) 27);
        class270 var2 = (class270) this.field4140.method2127(-121);
        if (arg0 != -75) {
            this.field4141 = null;
        }
        while (var2 != null) {
            var2.field4306 = this.method1744((byte) 113);
            if (var2.field4314 == 0) {
                if (!this.field4142[var2.field4317]) {
                    class270 var5 = new class270();
                    var5.field4317 = var2.field4317;
                    var5.field4314 = 0;
                    var5.field4306 = var2.field4306;
                    var5.field4307 = var2.field4307;
                    var5.field4316 = '\u0000';
                    this.field4124.method2124(var5, (byte) -48);
                    this.field4142[var2.field4317] = true;
                }
                var2.field4314 = 2;
                this.field4124.method2124(var2, (byte) 88);
            } else if (var2.field4314 == 1) {
                if (this.field4142[var2.field4317]) {
                    this.field4124.method2124(var2, (byte) 102);
                    this.field4142[var2.field4317] = false;
                }
            } else if (var2.field4314 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field4142[var3]) {
                        class270 var4 = new class270();
                        var4.field4314 = 1;
                        var4.field4317 = var3;
                        var4.field4316 = '\u0000';
                        var4.field4307 = var2.field4307;
                        var4.field4306 = var2.field4306;
                        this.field4124.method2124(var4, (byte) -121);
                        this.field4142[var3] = false;
                    }
                }
            } else if (var2.field4314 == 3) {
                this.field4124.method2124(var2, (byte) -71);
            }
            var2 = (class270) this.field4140.method2127(-117);
        }
    }

    @OriginalMember(owner = "client!hp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4133++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class89.method614(false, var2)) {
            this.method1750(-1, 3, var2, 114);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)Lct;")
    public final class369 method926(int arg0) {
        if (arg0 != 21863) {
            this.field4142 = null;
        }
        field4123++;
        return (class369) this.field4124.method2127(arg0 - 21989);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
    public final boolean method927(int arg0, int arg1) {
        if (arg1 != -1234) {
            method1747(29, false);
        }
        field4129++;
        return arg0 >= 0 && arg0 < 112 ? this.field4142[arg0] : false;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public final void method924(int arg0) {
        if (arg0 != -10183) {
            this.method925((byte) 43);
        }
        this.method1746(0);
        field4126++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BII)V")
    public static final void method1748(byte arg0, int arg1, int arg2) {
        field4128++;
        class456 var3 = class233.method1654(arg2, 7, 7);
        var3.method2858(10250);
        if (arg0 > 113) {
            var3.field7042 = arg1;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method1749(Component arg0, int arg1) {
        this.method1746(0);
        field4121++;
        this.field4141 = arg0;
        Method var3 = class2.field34;
        if (var3 != null) {
            try {
                var3.invoke(this.field4141, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field4141.addKeyListener(this);
        this.field4141.addFocusListener(this);
        if (arg1 < 14) {
            method1747(115, true);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IICI)V")
    private final void method1750(int arg0, int arg1, char arg2, int arg3) {
        field4122++;
        if (arg3 < 105) {
            return;
        }
        class270 var5 = new class270();
        var5.field4316 = arg2;
        var5.field4314 = arg1;
        var5.field4317 = arg0;
        var5.field4307 = class246.method1705((byte) 28);
        this.field4140.method2124(var5, (byte) 92);
    }

    @OriginalMember(owner = "client!hp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method1751((byte) 116, 1, arg0);
        field4131++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V")
    private final void method1751(byte arg0, int arg1, KeyEvent arg2) {
        field4127++;
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class280.field4436.length > var4) {
            int var5 = class280.field4436[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
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
        this.method1750(var6, arg1, '\u0000', 110);
        arg2.consume();
        if (arg0 < 89) {
            this.field4140 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class255(Component arg0) {
        class279.method1881(-25125);
        this.method1749(arg0, 44);
    }

    static {
        new class213(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field4139 = new class213("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
    }
}
