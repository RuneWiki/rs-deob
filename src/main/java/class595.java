import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class595 extends class642 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Lgj;")
    private class593 field7855 = new class593();

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "Lgj;")
    private class593 field7870 = new class593();

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "[Z")
    private boolean[] field7873 = new boolean[112];

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "Ldb;")
    public static class298 field7862 = new class298(79, -1);

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "[C")
    private static char[] field7865 = new char[64];

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field7854;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field7874;

    @OriginalMember(owner = "client!qt", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method3279(arg0, 0, -102);
        field7866++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ICII)V")
    private final void method3270(int arg0, char arg1, int arg2, int arg3) {
        if (arg3 != 81) {
            return;
        }
        field7860++;
        class428 var5 = new class428();
        var5.field5875 = arg1;
        var5.field5869 = arg2;
        var5.field5872 = arg0;
        var5.field5871 = class681.method3802(-23600);
        this.field7870.method3265(var5, (byte) -88);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Z")
    public final boolean method3271(int arg0, int arg1) {
        field7868++;
        return arg1 <= arg0 && arg0 < 112 ? this.field7873[arg0] : false;
    }

    @OriginalMember(owner = "client!qt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field7856++;
        this.method3270(0, '\u0000', -1, 81);
    }

    @OriginalMember(owner = "client!qt", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field7872++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class689.method3826(-3476, var2)) {
            this.method3270(-1, var2, 3, 81);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public final synchronized void method3272(int arg0) {
        field7858++;
        if (arg0 != 0) {
            this.method3279(null, -18, -42);
        }
        this.field7855.method3255((byte) -127);
        for (class428 var2 = (class428) this.field7870.method3262(-121); var2 != null; var2 = (class428) this.field7870.method3262(-120)) {
            var2.field5870 = this.method3275(2);
            if (var2.field5869 == 0) {
                if (!this.field7873[var2.field5872]) {
                    class428 var5 = new class428();
                    var5.field5870 = var2.field5870;
                    var5.field5869 = 0;
                    var5.field5872 = var2.field5872;
                    var5.field5871 = var2.field5871;
                    var5.field5875 = '\u0000';
                    this.field7855.method3265(var5, (byte) -121);
                    this.field7873[var2.field5872] = true;
                }
                var2.field5869 = 2;
                this.field7855.method3265(var2, (byte) -70);
            } else if (var2.field5869 == 1) {
                if (this.field7873[var2.field5872]) {
                    this.field7855.method3265(var2, (byte) -105);
                    this.field7873[var2.field5872] = false;
                }
            } else if (var2.field5869 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field7873[var3]) {
                        class428 var4 = new class428();
                        var4.field5869 = 1;
                        var4.field5871 = var2.field5871;
                        var4.field5870 = var2.field5870;
                        var4.field5875 = '\u0000';
                        var4.field5872 = var3;
                        this.field7855.method3265(var4, (byte) -128);
                        this.field7873[var3] = false;
                    }
                }
            } else if (var2.field5869 == 3) {
                this.field7855.method3265(var2, (byte) -83);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method3279(arg0, 1, -84);
        field7867++;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
    public final void method3273(int arg0) {
        this.method3278(34037);
        field7853++;
        int var2 = 71 % ((78 - arg0) / 42);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Lvc;")
    public final class293 method3274(byte arg0) {
        field7863++;
        return arg0 == -30 ? (class293) this.field7855.method3262(arg0 - 93) : null;
    }

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)I")
    private final int method3275(int arg0) {
        field7857++;
        int var2 = 0;
        if (arg0 != 2) {
            return -1;
        }
        if (this.field7873[81]) {
            var2 |= 0x1;
        }
        if (this.field7873[82]) {
            var2 |= 0x4;
        }
        if (this.field7873[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method3276(int arg0, Component arg1) {
        this.method3278(34037);
        if (arg0 != 930374533) {
            this.field7855 = null;
        }
        field7864++;
        this.field7874 = arg1;
        Method var3 = class519.field6919;
        if (var3 != null) {
            try {
                var3.invoke(this.field7874, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field7874.addKeyListener(this);
        this.field7874.addFocusListener(this);
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)V")
    public static void method3277(int arg0) {
        if (arg0 != 112) {
            method3277(-75);
        }
        field7862 = null;
        field7865 = null;
    }

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "(I)V")
    private final void method3278(int arg0) {
        field7854++;
        if (this.field7874 == null) {
            return;
        }
        this.field7874.removeKeyListener(this);
        this.field7874.removeFocusListener(this);
        this.field7874 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field7873[var2] = false;
        }
        if (arg0 != 34037) {
            this.method3275(-91);
        }
        this.field7855.method3255((byte) -120);
        this.field7870.method3255((byte) -109);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
    private final void method3279(KeyEvent arg0, int arg1, int arg2) {
        field7852++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class465.field6270.length) {
            int var6 = class465.field6270[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 == 0) {
            return;
        }
        this.method3270(var5, '\u0000', arg1, 81);
        arg0.consume();
        if (arg2 > -73) {
            field7869 = 110;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZLdv;)V")
    public static final void method3280(int arg0, boolean arg1, class616 arg2) {
        field7859++;
        if (class273.field3798 >= 50 || arg2 == null || arg2.field8166 == null || arg2.field8166.length <= arg0 || arg2.field8166[arg0] == null || arg1) {
            return;
        }
        int var3 = arg2.field8166[arg0][0];
        int var4 = var3 >> 8;
        if (arg2.field8166[arg0].length > 1) {
            int var5 = (int) ((double) arg2.field8166[arg0].length * Math.random());
            if (var5 > 0) {
                var4 = arg2.field8166[arg0][var5];
            }
        }
        int var6 = (var3 & 0xF4) >> 5;
        if (arg2.field8168) {
            class505.method2800(0, 255, true, var4, false, var6);
        } else {
            class506.method2810(var6, -51, 255, 0, var4);
        }
    }

    @OriginalMember(owner = "client!qt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field7871++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(BIIIZILno;[B)Lmn;")
    public static final class340 method3281(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class658 arg6, byte[] arg7) {
        if (arg0 != 82) {
            field7865 = null;
        }
        field7861++;
        if (!arg6.field9273 && (!class230.method1441(true, arg5) || !class230.method1441(true, arg3))) {
            return arg6.field9310 ? new class340(arg6, 34037, arg1, arg5, arg3, arg4, arg7, arg2) : new class340(arg6, arg1, arg5, arg3, class587.method3231(true, arg5), class587.method3231(true, arg3), arg7, arg2);
        } else {
            return new class340(arg6, 3553, arg1, arg5, arg3, arg4, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class595(Component arg0) {
        class252.method1534(true);
        this.method3276(930374533, arg0);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field7865[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field7865[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field7865[var2] = (char) (var2 - 4);
        }
        field7865[62] = '*';
        field7865[63] = '-';
    }
}
