import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class90 extends class180 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "[Z")
    private boolean[] field1240 = new boolean[112];

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "Lbw;")
    private class483 field1228;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Lbw;")
    private class483 field1231;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "Lbw;")
    private class483 field1236;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field1244;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BICI)V")
    private final void method792(byte arg0, int arg1, char arg2, int arg3) {
        int var5 = 43 % ((arg0 - 49) / 62);
        field1234++;
        class483 var6 = new class483();
        var6.field7107 = arg3;
        var6.field7110 = arg1;
        var6.field7109 = arg2;
        var6.field7103 = class437.method2644(-86);
        if (this.field1231 == null) {
            this.field1228 = var6;
        } else {
            this.field1231.field7105 = var6;
        }
        this.field1231 = var6;
    }

    @OriginalMember(owner = "client!vr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method792((byte) -127, -1, '\u0000', 0);
        field1238++;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(III)I")
    public static final int method793(int arg0, int arg1, int arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        field1225++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg2 == -1 ? arg0 : 111;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
    public final synchronized void method794(int arg0) {
        field1243++;
        for (class483 var2 = this.field1228; var2 != null; var2 = var2.field7105) {
            if (var2.field7110 == 0) {
                if (var2.field7107 >= 0) {
                    var2.field7108 = !this.field1240[var2.field7107];
                }
                this.field1240[var2.field7107] = true;
            } else if (var2.field7110 == 1) {
                this.field1240[var2.field7107] = false;
            } else if (var2.field7110 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field1240[var3] = false;
                }
            }
        }
        if (arg0 < 13) {
            this.field1244 = null;
        }
        this.field1236 = this.field1228;
        this.field1231 = null;
        this.field1228 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lri;")
    public final class74 method795(int arg0) {
        field1245++;
        class483 var2 = this.field1236;
        if (arg0 != 26817) {
            this.focusLost(null);
        }
        while (var2 != null && var2.field7110 == -1) {
            var2 = var2.field7105;
        }
        if (var2 == null) {
            this.field1236 = null;
        } else {
            this.field1236 = var2.field7105;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Z")
    public final boolean method796(int arg0, int arg1) {
        field1230++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 >= -70) {
                method793(5, 106, -32);
            }
            return this.field1240[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public final void method797(int arg0) {
        this.method800((byte) -87);
        if (arg0 > -86) {
            this.field1228 = null;
        }
        field1239++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
    private final void method798(KeyEvent arg0, byte arg1, int arg2) {
        field1226++;
        if (arg1 > -97) {
            this.keyPressed(null);
        }
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class523.field7685.length > var4) {
            int var6 = class523.field7685[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method792((byte) -23, arg2, '\u0000', var5);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method799(int arg0, Component arg1) {
        this.method800((byte) -87);
        field1233++;
        if (arg0 != 0) {
            this.field1228 = null;
        }
        this.field1244 = arg1;
        Method var3 = class419.field6193;
        if (var3 != null) {
            try {
                var3.invoke(this.field1244, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field1244.addKeyListener(this);
        this.field1244.addFocusListener(this);
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
    private final void method800(byte arg0) {
        field1241++;
        if (this.field1244 == null) {
            return;
        }
        this.field1244.removeKeyListener(this);
        this.field1244.removeFocusListener(this);
        this.field1244 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field1240[var2] = false;
        }
        this.field1228 = null;
        this.field1231 = null;
        if (arg0 != -87) {
            this.method797(97);
        }
        this.field1236 = null;
    }

    @OriginalMember(owner = "client!vr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1237++;
    }

    @OriginalMember(owner = "client!vr", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method798(arg0, (byte) -105, 1);
        field1242++;
    }

    @OriginalMember(owner = "client!vr", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field1229++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class29.method234(false, var2)) {
            this.method792((byte) 124, 2, var2, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vr", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method798(arg0, (byte) -116, 0);
        field1227++;
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class90(Component arg0) {
        class126.method988((byte) -106);
        this.method799(0, arg0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(FFIIF)F")
    public static final float method801(float arg0, float arg1, int arg2, int arg3, float arg4) {
        field1232++;
        if (arg2 != -129) {
            method793(109, -89, -119);
        }
        float[] var5 = class524.field7703[arg3];
        return var5[2] * arg4 + var5[1] * arg1 + var5[0] * arg0;
    }

    static {
        new class331("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
    }
}
