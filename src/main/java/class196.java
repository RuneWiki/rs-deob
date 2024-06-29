import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class196 extends class441 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "[Z")
    private boolean[] field2810 = new boolean[112];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2807 = 1;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[[I")
    public static int[][] field2827;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Luf;")
    public static class310 field2828;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lkg;")
    private class177 field2816;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lkg;")
    private class177 field2820;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lkg;")
    private class177 field2823;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field2809;

    static {
        new class83("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field2827 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
        field2828 = new class310(53, 18);
        field2829 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 7)
    private final void method1209(Component arg0, int arg1) {
        field2822++;
        this.method1216(63);
        this.field2809 = arg0;
        Method var3 = class397.field5536;
        if (arg1 != 0) {
            field2829 = 28;
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field2809, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field2809.addKeyListener(this);
        this.field2809.addFocusListener(this);
    }

    @OriginalMember(owner = "client!nb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 35)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2825++;
        this.method1217(47, arg0, 1);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 43)
    public final void method1210(int arg0) {
        this.method1216(40);
        if (arg0 != -11614) {
            this.field2816 = null;
        }
        field2821++;
    }

    @OriginalMember(owner = "client!nb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 54)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field2814++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class364.method2051(var2, (byte) -57)) {
            this.method1218(false, 2, var2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V", line = 74)
    public static final void method1211(boolean arg0, int arg1) {
        class134.method883(true);
        field2826++;
        class319.method1805(2);
        class465.method2730(true, (byte) 67, arg1);
        class9.method57(class103.field1412, class418.field6109, class192.field2735, true);
        class87.method608(class418.field6109, -67, class192.field2735);
        class3.method11(-229, class354.field4830);
        if (arg0) {
            field2827 = null;
        }
        class386.method2222(arg0);
        class242.method1428((byte) 80);
        if (class137.field1958 == 10) {
            class401.method2323(false, -4630);
        } else if (class137.field1958 == 30) {
            class26.method186(25, 8);
        } else if (class137.field1958 == 5) {
            class422.method2520((byte) -126, class418.field6109, class192.field2735);
            return;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z", line = 103)
    public final boolean method1212(int arg0, int arg1) {
        field2817++;
        return ~arg1 <= arg0 && arg1 < 112 ? this.field2810[arg1] : false;
    }

    @OriginalMember(owner = "client!nb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 115)
    public final void focusGained(FocusEvent arg0) {
        field2812++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 123)
    public static void method1213(int arg0) {
        if (arg0 > -37) {
            field2828 = null;
        }
        field2827 = null;
        field2828 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 215)
    public class196(Component arg0) {
        class36.method236(73);
        this.method1209(arg0, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 138)
    public final synchronized void method1214(boolean arg0) {
        field2818++;
        class177 var2 = this.field2820;
        if (arg0) {
            field2829 = 84;
        }
        while (var2 != null) {
            if (var2.field2510 == 0) {
                if (var2.field2516 >= 0) {
                    var2.field2511 = !this.field2810[var2.field2516];
                }
                this.field2810[var2.field2516] = true;
            } else if (var2.field2510 == 1) {
                this.field2810[var2.field2516] = false;
            } else if (var2.field2510 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field2810[var3] = false;
                }
            }
            var2 = var2.field2519;
        }
        this.field2823 = this.field2820;
        this.field2820 = null;
        this.field2816 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lbd;", line = 191)
    public final class43 method1215(byte arg0) {
        field2811++;
        class177 var2;
        for (var2 = this.field2823; var2 != null && var2.field2510 == -1; var2 = var2.field2519) {
        }
        if (var2 == null) {
            this.field2823 = null;
        } else {
            this.field2823 = var2.field2519;
        }
        if (arg0 > -11) {
            this.field2820 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 224)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2819++;
        this.method1218(false, -1, '\u0000', 0);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 236)
    private final void method1216(int arg0) {
        field2815++;
        if (this.field2809 == null) {
            return;
        }
        this.field2809.removeKeyListener(this);
        this.field2809.removeFocusListener(this);
        this.field2809 = null;
        int var2 = 0;
        if (arg0 <= 14) {
            return;
        }
        while (var2 < 112) {
            this.field2810[var2] = false;
            var2++;
        }
        this.field2823 = null;
        this.field2820 = null;
        this.field2816 = null;
    }

    @OriginalMember(owner = "client!nb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 273)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2824++;
        this.method1217(44, arg0, 0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V", line = 284)
    private final void method1217(int arg0, KeyEvent arg1, int arg2) {
        if (arg0 <= 11) {
            this.field2810 = null;
        }
        field2813++;
        int var4 = arg1.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class195.field2784.length) {
            int var6 = class195.field2784[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1218(false, arg2, '\u0000', var5);
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZICI)V", line = 320)
    private final void method1218(boolean arg0, int arg1, char arg2, int arg3) {
        field2808++;
        class177 var5 = new class177();
        var5.field2510 = arg1;
        var5.field2520 = arg2;
        var5.field2516 = arg3;
        var5.field2514 = class333.method1850(-3562);
        if (this.field2816 == null) {
            this.field2820 = var5;
        } else {
            this.field2816.field2519 = var5;
        }
        if (arg0) {
            this.keyTyped(null);
        }
        this.field2816 = var5;
    }
}
