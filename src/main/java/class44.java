import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class44 extends class256 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "[Z")
    private boolean[] field659 = new boolean[112];

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[S")
    public static short[] field643 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[I")
    public static int[] field646 = new int[1];

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lvj;")
    public static class304 field644 = new class304("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lcs;")
    private class225 field647;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Lcs;")
    private class225 field654;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "Lcs;")
    private class225 field656;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "Lmk;")
    public static class39 field663;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Ljava/awt/Component;")
    private Component field657;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "[Lf;")
    public static class529[] field662;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Z")
    public final boolean method305(int arg0, byte arg1) {
        if (arg1 == 59) {
            field639++;
            return arg0 >= 0 && arg0 < 112 ? this.field659[arg0] : false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field653++;
        this.method306('\u0000', -1, 18031, 0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(CIII)V")
    private final void method306(char arg0, int arg1, int arg2, int arg3) {
        field652++;
        if (arg2 != 18031) {
            return;
        }
        class225 var5 = new class225();
        var5.field3034 = arg3;
        var5.field3029 = arg1;
        var5.field3027 = arg0;
        var5.field3040 = class498.method2854(-111);
        if (this.field654 == null) {
            this.field656 = var5;
        } else {
            this.field654.field3035 = var5;
        }
        this.field654 = var5;
    }

    @OriginalMember(owner = "client!dl", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field650++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class271.method1618(var2, (byte) -65)) {
            this.method306(var2, 2, 18031, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    public final synchronized void method307(int arg0) {
        field642++;
        for (class225 var2 = this.field656; var2 != null; var2 = var2.field3035) {
            if (var2.field3029 == 0) {
                if (var2.field3034 >= 0) {
                    var2.field3031 = !this.field659[var2.field3034];
                }
                this.field659[var2.field3034] = true;
            } else if (var2.field3029 == 1) {
                this.field659[var2.field3034] = false;
            } else if (var2.field3029 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field659[var3] = false;
                }
            }
        }
        this.field647 = this.field656;
        this.field654 = null;
        if (arg0 <= 58) {
            this.method305(-27, (byte) -88);
        }
        this.field656 = null;
    }

    @OriginalMember(owner = "client!dl", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field641++;
        this.method308(arg0, (byte) 69, 1);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
    private final void method308(KeyEvent arg0, byte arg1, int arg2) {
        field649++;
        if (arg1 != 69) {
            this.method309((byte) 85);
        }
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class108.field1571.length > var4) {
            int var5 = class108.field1571[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method306('\u0000', arg2, arg1 + 17962, var6);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public final void method309(byte arg0) {
        field645++;
        this.method314((byte) -126);
        if (arg0 < 20) {
            this.method306('<', 22, 80, 12);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method310(int arg0, Component arg1) {
        this.method314((byte) -123);
        field661++;
        this.field657 = arg1;
        if (arg0 < 107) {
            return;
        }
        Method var3 = class216.field2930;
        if (var3 != null) {
            try {
                var3.invoke(this.field657, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field657.addKeyListener(this);
        this.field657.addFocusListener(this);
    }

    @OriginalMember(owner = "client!dl", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method308(arg0, (byte) 69, 0);
        field640++;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Ldb;")
    public final class210 method311(byte arg0) {
        field658++;
        if (arg0 != -121) {
            this.keyPressed(null);
        }
        class225 var2;
        for (var2 = this.field647; var2 != null && var2.field3029 == -1; var2 = var2.field3035) {
        }
        if (var2 == null) {
            this.field647 = null;
        } else {
            this.field647 = var2.field3035;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public static void method312(int arg0) {
        field663 = null;
        field646 = null;
        field662 = null;
        field644 = null;
        field643 = null;
        if (arg0 != 128) {
            method313(false, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V")
    public static final void method313(boolean arg0, byte arg1) {
        class422.field5783++;
        class118.method822(53, class508.field7066);
        field660++;
        if (arg1 < 19) {
            method313(true, (byte) -112);
        }
        for (class301 var2 = (class301) class27.field457.method181((byte) -70); var2 != null; var2 = (class301) class27.field457.method179(1)) {
            if (!var2.method302(-25575)) {
                var2 = (class301) class27.field457.method181((byte) -70);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field3981 == 0) {
                class347.method2023(var2, arg0, true, (byte) -109);
            }
        }
        if (class71.field1072 != null) {
            class412.method2378(class71.field1072, (byte) -116);
            class71.field1072 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)V")
    private final void method314(byte arg0) {
        field655++;
        if (this.field657 == null) {
            return;
        }
        this.field657.removeKeyListener(this);
        this.field657.removeFocusListener(this);
        if (arg0 > -120) {
            this.field656 = null;
        }
        this.field657 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field659[var2] = false;
        }
        this.field647 = null;
        this.field654 = null;
        this.field656 = null;
    }

    @OriginalMember(owner = "client!dl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field651++;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class44(Component arg0) {
        class327.method1895(false);
        this.method310(116, arg0);
    }
}
