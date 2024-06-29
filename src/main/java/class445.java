import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class445 extends class43 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Ltg;")
    private class605 field6462 = new class605();

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Ltg;")
    private class605 field6468 = new class605();

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[Z")
    private boolean[] field6470 = new boolean[112];

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public static int field6459;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field6472;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V", line = 5)
    private final void method2717(byte arg0) {
        field6467++;
        if (this.field6472 == null) {
            return;
        }
        this.field6472.removeKeyListener(this);
        this.field6472.removeFocusListener(this);
        this.field6472 = null;
        if (arg0 > -86) {
            this.keyPressed(null);
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field6470[var2] = false;
        }
        this.field6462.method3465(0);
        this.field6468.method3465(0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIII[BIIZ)V", line = 34)
    public static final void method2718(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8) {
        if (arg8) {
            method2718(null, -94, 84, -107, -103, null, 9, 21, true);
        }
        field6463++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg2++]);
                int var14 = arg4++;
                arg5[var14] = (byte) (arg5[var14] - arg0[arg2++]);
                int var15 = arg4++;
                arg5[var15] = (byte) (arg5[var15] - arg0[arg2++]);
                int var16 = arg4++;
                arg5[var16] = (byte) (arg5[var16] - arg0[arg2++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg2++]);
            }
            arg2 += arg3;
            arg4 += arg7;
        }
    }

    @OriginalMember(owner = "client!gb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 80)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field6459++;
        this.method2719(arg0, 1, 0);
    }

    @OriginalMember(owner = "client!gb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 88)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2719(arg0, 0, 0);
        field6452++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 97)
    private final void method2719(KeyEvent arg0, int arg1, int arg2) {
        field6466++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (arg2 == var4) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class496.field7190.length) {
            int var6 = class496.field7190[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method2721(arg1, '\u0000', arg2 ^ 0x5D93, var5);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 129)
    public final void method454(byte arg0) {
        this.method2717((byte) -122);
        field6453++;
        int var2 = -118 % ((arg0 - 3) / 62);
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)I", line = 143)
    private final int method2720(int arg0) {
        field6457++;
        int var2 = 0;
        if (arg0 >= -56) {
            this.keyReleased(null);
        }
        if (this.field6470[81]) {
            var2 |= 0x1;
        }
        if (this.field6470[82]) {
            var2 |= 0x4;
        }
        if (this.field6470[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ICII)V", line = 167)
    private final void method2721(int arg0, char arg1, int arg2, int arg3) {
        field6461++;
        class473 var5 = new class473();
        var5.field6869 = arg3;
        if (arg2 != 23955) {
            this.field6462 = null;
        }
        var5.field6867 = arg1;
        var5.field6864 = arg0;
        var5.field6866 = class18.method109(-11121);
        this.field6468.method3472(126, var5);
    }

    @OriginalMember(owner = "client!gb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 185)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field6464++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class486.method2950(var2, 92)) {
            this.method2721(3, var2, 23955, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V", line = 200)
    public final synchronized void method458(byte arg0) {
        this.field6462.method3465(0);
        field6465++;
        for (class473 var2 = (class473) this.field6468.method3466(0); var2 != null; var2 = (class473) this.field6468.method3466(0)) {
            var2.field6862 = this.method2720(-76);
            if (var2.field6864 == 0) {
                if (!this.field6470[var2.field6869]) {
                    class473 var5 = new class473();
                    var5.field6867 = '\u0000';
                    var5.field6864 = 0;
                    var5.field6862 = var2.field6862;
                    var5.field6866 = var2.field6866;
                    var5.field6869 = var2.field6869;
                    this.field6462.method3472(109, var5);
                    this.field6470[var2.field6869] = true;
                }
                var2.field6864 = 2;
                this.field6462.method3472(102, var2);
            } else if (var2.field6864 == 1) {
                if (this.field6470[var2.field6869]) {
                    this.field6462.method3472(arg0 ^ 0x1, var2);
                    this.field6470[var2.field6869] = false;
                }
            } else if (var2.field6864 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field6470[var3]) {
                        class473 var4 = new class473();
                        var4.field6862 = var2.field6862;
                        var4.field6867 = '\u0000';
                        var4.field6869 = var3;
                        var4.field6864 = 1;
                        var4.field6866 = var2.field6866;
                        this.field6462.method3472(109, var4);
                        this.field6470[var3] = false;
                    }
                }
            } else if (var2.field6864 == 3) {
                this.field6462.method3472(110, var2);
            }
        }
        if (arg0 != 105) {
            this.keyTyped(null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 293)
    public final void focusGained(FocusEvent arg0) {
        field6469++;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 377)
    public class445(Component arg0) {
        class232.method1613((byte) -20);
        this.method2722(-1, arg0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 306)
    private final void method2722(int arg0, Component arg1) {
        field6460++;
        this.method2717((byte) -95);
        this.field6472 = arg1;
        if (arg0 != -1) {
            field6456 = 83;
        }
        Method var3 = class731.field10248;
        if (var3 != null) {
            try {
                var3.invoke(this.field6472, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field6472.addKeyListener(this);
        this.field6472.addFocusListener(this);
    }

    @OriginalMember(owner = "client!gb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 333)
    public final synchronized void focusLost(FocusEvent arg0) {
        field6455++;
        this.method2721(-1, '\u0000', 23955, 0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lao;", line = 343)
    public final class62 method456(int arg0) {
        if (arg0 >= -9) {
            this.keyPressed(null);
        }
        field6471++;
        return (class62) this.field6462.method3466(0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z", line = 363)
    public final boolean method455(int arg0, int arg1) {
        field6458++;
        if (arg0 != -14469) {
            this.method2722(42, null);
        }
        return arg1 >= 0 && arg1 < 112 ? this.field6470[arg1] : false;
    }
}
