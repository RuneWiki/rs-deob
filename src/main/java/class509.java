import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class509 extends class289 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "Lbu;")
    private class19 field7225 = new class19();

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "Lbu;")
    private class19 field7239 = new class19();

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "[Z")
    private boolean[] field7243 = new boolean[112];

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field7241;

    static {
        new class572("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field7234 = -1;
    }

    @OriginalMember(owner = "client!nu", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 3)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field7236++;
        this.method3033(arg0, 0, true);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 14)
    private final void method3027(Component arg0, int arg1) {
        this.method3028(false);
        field7240++;
        this.field7241 = arg0;
        Method var3 = class331.field4580;
        if (arg1 != 1) {
            this.method3033(null, -49, true);
        }
        if (var3 != null) {
            try {
                var3.invoke(this.field7241, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field7241.addKeyListener(this);
        this.field7241.addFocusListener(this);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(Z)V", line = 40)
    private final void method3028(boolean arg0) {
        field7242++;
        if (this.field7241 == null) {
            return;
        }
        this.field7241.removeKeyListener(this);
        this.field7241.removeFocusListener(this);
        this.field7241 = null;
        if (arg0) {
            this.method3033(null, 126, true);
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field7243[var2] = false;
        }
        this.field7225.method122((byte) 14);
        this.field7239.method122((byte) 14);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Ldi;", line = 69)
    public final class109 method1790(boolean arg0) {
        if (!arg0) {
            this.keyReleased(null);
        }
        field7238++;
        return (class109) this.field7225.method128(936);
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)I", line = 86)
    private final int method3029(int arg0) {
        field7232++;
        int var2 = 0;
        if (this.field7243[81]) {
            var2 |= 0x1;
        }
        if (arg0 >= -76) {
            this.field7239 = null;
        }
        if (this.field7243[82]) {
            var2 |= 0x4;
        }
        if (this.field7243[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([II[J)V", line = 115)
    public static final void method3030(int[] arg0, int arg1, long[] arg2) {
        field7223++;
        if (arg1 == 5675) {
            class134.method923(1, arg2.length - 1, 0, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 404)
    public class509(Component arg0) {
        class523.method3084((byte) -52);
        this.method3027(arg0, 1);
    }

    @OriginalMember(owner = "client!nu", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 130)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method3033(arg0, 1, true);
        field7230++;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V", line = 138)
    public final synchronized void method1789(int arg0) {
        if (arg0 != 77) {
            return;
        }
        field7235++;
        this.field7225.method122((byte) 14);
        for (class360 var2 = (class360) this.field7239.method128(936); var2 != null; var2 = (class360) this.field7239.method128(936)) {
            var2.field4894 = this.method3029(-94);
            if (var2.field4890 == 0) {
                if (!this.field7243[var2.field4893]) {
                    class360 var3 = new class360();
                    var3.field4893 = var2.field4893;
                    var3.field4888 = var2.field4888;
                    var3.field4890 = 0;
                    var3.field4895 = '\u0000';
                    var3.field4894 = var2.field4894;
                    this.field7225.method131(var3, 0);
                    this.field7243[var2.field4893] = true;
                }
                var2.field4890 = 2;
                this.field7225.method131(var2, arg0 - 77);
            } else if (var2.field4890 == 1) {
                if (this.field7243[var2.field4893]) {
                    this.field7225.method131(var2, 0);
                    this.field7243[var2.field4893] = false;
                }
            } else if (var2.field4890 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field7243[var4]) {
                        class360 var5 = new class360();
                        var5.field4888 = var2.field4888;
                        var5.field4893 = var4;
                        var5.field4894 = var2.field4894;
                        var5.field4895 = '\u0000';
                        var5.field4890 = 1;
                        this.field7225.method131(var5, arg0 ^ 0x4D);
                        this.field7243[var4] = false;
                    }
                }
            } else if (var2.field4890 == 3) {
                this.field7225.method131(var2, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 229)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field7224++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class467.method2818(75, var2)) {
            this.method3032(3, var2, 13469, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 244)
    public final void method1786(byte arg0) {
        this.method3028(false);
        if (arg0 > -122) {
            this.method1790(false);
        }
        field7228++;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILgw;)V", line = 255)
    public static final void method3031(int arg0, class148 arg1) {
        field7233++;
        if (arg1.field2146.length - arg1.field2177 < 1) {
            return;
        }
        int var2 = arg1.method1032((byte) -33);
        if (var2 < 0 || var2 > 1 || arg1.field2146.length - arg1.field2177 < 2) {
            return;
        }
        int var3 = arg1.method1045(true);
        if (arg0 != 3 || arg1.field2146.length - arg1.field2177 < var3 * 6) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method1045(true);
            int var6 = arg1.method1026(arg0 - 917302123);
            if (var5 < class624.field9201.length && class428.field5753[var5] && (class374.field5183.method2708(var5, arg0 + 16).field4209 != '1' || var6 >= -1 && var6 <= 1)) {
                class624.field9201[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ICII)V", line = 302)
    private final void method3032(int arg0, char arg1, int arg2, int arg3) {
        field7231++;
        class360 var5 = new class360();
        var5.field4890 = arg0;
        var5.field4893 = arg3;
        var5.field4895 = arg1;
        if (arg2 != 13469) {
            this.field7241 = null;
        }
        var5.field4888 = class598.method3538(true);
        this.field7239.method131(var5, 0);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)Z", line = 319)
    public final boolean method1788(int arg0, int arg1) {
        field7226++;
        if (arg1 >= 0 && arg1 < 112) {
            return arg0 == 16 ? this.field7243[arg1] : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 334)
    public final void focusGained(FocusEvent arg0) {
        field7237++;
    }

    @OriginalMember(owner = "client!nu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 341)
    public final synchronized void focusLost(FocusEvent arg0) {
        field7227++;
        this.method3032(-1, '\u0000', 13469, 0);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V", line = 357)
    private final void method3033(KeyEvent arg0, int arg1, boolean arg2) {
        field7229++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class303.field4178.length > var4) {
            int var5 = class303.field4178[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0 && arg2) {
            this.method3032(arg1, '\u0000', 13469, var6);
            arg0.consume();
        }
    }
}
