import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class345 extends class365 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "[Z")
    private boolean[] field4879 = new boolean[112];

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public static int field4874 = 0;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "Llg;")
    public static class237 field4887;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "Lud;")
    private class23 field4865;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "Lud;")
    private class23 field4873;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "Lud;")
    private class23 field4875;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field4864;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)I")
    public static final int method2198(int arg0) {
        field4871++;
        if ((double) class308.field4351 == 3.0D) {
            return 37;
        } else if ((double) class308.field4351 == 4.0D) {
            return 50;
        } else if ((double) class308.field4351 == 6.0D) {
            return 75;
        } else {
            if (arg0 != 0) {
                method2200(10);
            }
            return (double) class308.field4351 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)Lfp;")
    public final class176 method2199(int arg0) {
        int var2 = -42 / ((-arg0 - 31) / 57);
        field4880++;
        class23 var3;
        for (var3 = this.field4865; var3 != null && var3.field284 == -1; var3 = var3.field288) {
        }
        if (var3 == null) {
            this.field4865 = null;
        } else {
            this.field4865 = var3.field288;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4869++;
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)V")
    public static void method2200(int arg0) {
        if (arg0 == 0) {
            field4887 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
    public static final void method2201(int arg0, int arg1) {
        class18.field211.method1629(arg1, 116);
        if (arg0 <= 10) {
            method2201(-91, 21);
        }
        field4884++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
    private final void method2202(KeyEvent arg0, int arg1, byte arg2) {
        field4870++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class65.field749.length > var4) {
            int var6 = class65.field749[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2203(var5, arg1, 52, '\u0000');
            if (arg2 == -126) {
                arg0.consume();
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4886++;
        this.method2202(arg0, 0, (byte) -126);
    }

    @OriginalMember(owner = "client!uo", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2202(arg0, 1, (byte) -126);
        field4868++;
    }

    @OriginalMember(owner = "client!uo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4885++;
        this.method2203(0, -1, 30, '\u0000');
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIC)V")
    private final void method2203(int arg0, int arg1, int arg2, char arg3) {
        if (arg2 < 26) {
            this.field4875 = null;
        }
        field4877++;
        class23 var5 = new class23();
        var5.field298 = arg3;
        var5.field284 = arg1;
        var5.field291 = arg0;
        var5.field294 = class175.method1195(63);
        if (this.field4875 == null) {
            this.field4873 = var5;
        } else {
            this.field4875.field288 = var5;
        }
        this.field4875 = var5;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public final void method2204(int arg0) {
        this.method2211((byte) -124);
        if (arg0 > -53) {
            this.method2204(98);
        }
        field4882++;
    }

    @OriginalMember(owner = "client!uo", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4863++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class413.method2634(var2, 6541)) {
            this.method2203(-1, 2, 93, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2205(int arg0, Component arg1) {
        field4862++;
        this.method2211((byte) -72);
        this.field4864 = arg1;
        Method var3 = class185.field2691;
        int var4 = 75 % ((arg0 - 22) / 43);
        if (var3 != null) {
            try {
                var3.invoke(this.field4864, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field4864.addKeyListener(this);
        this.field4864.addFocusListener(this);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZZIII)I")
    public static final int method2206(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -15563) {
            return -93;
        }
        field4883++;
        class411 var5 = class144.method878(arg0, arg3, -92);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field5904.length; var7++) {
            if (var5.field5904[var7] >= 0 && class237.field3379 > var5.field5904[var7]) {
                class163 var8 = class50.method288(0, var5.field5904[var7]);
                int var9 = var8.method1094(arg2, arg4 ^ 0x6AD9, class401.method2555(arg2, 1024).field499);
                if (arg1) {
                    var6 += var5.field5902[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
    public static final void method2207(byte arg0) {
        class18.field211.method1618(0);
        if (arg0 != 121) {
            field4888 = 114;
        }
        field4876++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)Z")
    public final boolean method2208(boolean arg0, int arg1) {
        field4867++;
        if (arg0) {
            method2207((byte) 112);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field4879[arg1] : false;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    public final synchronized void method2209(byte arg0) {
        if (arg0 != -67) {
            field4888 = 29;
        }
        field4872++;
        for (class23 var2 = this.field4873; var2 != null; var2 = var2.field288) {
            if (var2.field284 == 0) {
                if (var2.field291 >= 0) {
                    var2.field295 = !this.field4879[var2.field291];
                }
                this.field4879[var2.field291] = true;
            } else if (var2.field284 == 1) {
                this.field4879[var2.field291] = false;
            } else if (var2.field284 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field4879[var3] = false;
                }
            }
        }
        this.field4865 = this.field4873;
        this.field4873 = null;
        this.field4875 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ldn;B)I")
    public static final int method2210(class302 arg0, byte arg1) {
        field4881++;
        String var2 = class359.method2309(0, arg0);
        int[] var3 = null;
        if (class174.method1191(arg0.field4247, (byte) -110)) {
            var3 = class50.method288(0, (int) arg0.field4250).field2295;
        } else if (class422.method2666(arg0.field4247, -8164)) {
            class77 var4 = class167.field2335[(int) arg0.field4250];
            if (var4 != null) {
                var3 = var4.field912.field1639;
            }
        } else if (class327.method2117(arg0.field4247, 19)) {
            if (arg0.field4247 == 1009) {
                var3 = class374.method2382((int) arg0.field4250, false).field1051;
            } else {
                var3 = class374.method2382((int) (arg0.field4250 >>> 32 & 0x7FFFFFFFL), false).field1051;
            }
        }
        if (arg1 < 17) {
            field4888 = -21;
        }
        if (var3 != null) {
            var2 = var2 + class309.method2047(0, var3);
        }
        return class371.field5232.method2255(var2, true, class170.field2351);
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V")
    private final void method2211(byte arg0) {
        field4866++;
        if (this.field4864 == null) {
            return;
        }
        this.field4864.removeKeyListener(this);
        this.field4864.removeFocusListener(this);
        this.field4864 = null;
        int var2 = -68 / ((5 - arg0) / 35);
        for (int var3 = 0; var3 < 112; var3++) {
            this.field4879[var3] = false;
        }
        this.field4873 = null;
        this.field4865 = null;
        this.field4875 = null;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class345(Component arg0) {
        class267.method1779(false);
        this.method2205(92, arg0);
    }

    static {
        new class362("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        new class362("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field4887 = new class237(16);
        field4888 = 0;
    }
}
