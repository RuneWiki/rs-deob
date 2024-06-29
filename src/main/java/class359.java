import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class359 extends class337 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "Lok;")
    private class266 field5038 = new class266();

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "Lok;")
    private class266 field5048 = new class266();

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "[Z")
    private boolean[] field5050 = new boolean[112];

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "Lhfa;")
    public static class329 field5040 = new class329();

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "Lbu;")
    public static class21 field5047 = new class21(100, 4);

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field5049;

    @OriginalMember(owner = "client!cs", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5035++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class236.method1581(var2, 255)) {
            this.method2272((byte) -40, -1, 3, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V")
    public final void method2135(boolean arg0) {
        if (!arg0) {
            this.focusLost(null);
        }
        field5031++;
        this.method2269(false);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2266(int arg0, Component arg1) {
        this.method2269(false);
        field5037++;
        this.field5049 = arg1;
        Method var3 = class477.field6686;
        if (var3 != null) {
            try {
                var3.invoke(this.field5049, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 <= -35) {
            this.field5049.addKeyListener(this);
            this.field5049.addFocusListener(this);
        }
    }

    @OriginalMember(owner = "client!cs", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field5044++;
        this.method2270(128, arg0, 0);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;II[B)I")
    public static final int method2267(String arg0, int arg1, int arg2, byte[] arg3) {
        field5030++;
        int var4 = arg1;
        int var5 = arg0.length();
        int var6 = 0;
        if (arg2 != 2) {
            field5047 = null;
        }
        while (var5 > var6) {
            int var7 = class290.method1860(arg0.charAt(var6), (byte) 107);
            int var8 = var5 <= (var6 + 1) ? -1 : class290.method1860(arg0.charAt(var6 + 1), (byte) 126);
            int var9 = var5 <= var6 + 2 ? -1 : class290.method1860(arg0.charAt(var6 + 2), (byte) 102);
            int var10 = var5 > (var6 + 3) ? class290.method1860(arg0.charAt(var6 + 3), (byte) 97) : -1;
            arg3[arg1++] = (byte) class746.method4158(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg3[arg1++] = (byte) class746.method4158(var9 >>> 2, class702.method3977(var8 << 4, 240));
            if (var10 == -1) {
                break;
            }
            arg3[arg1++] = (byte) class746.method4158(var10, class702.method3977(3, var9) << 6);
            var6 += 4;
        }
        return arg1 - var4;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
    public final synchronized void method2137(int arg0) {
        field5045++;
        if (arg0 > -49) {
            return;
        }
        this.field5038.method1729((byte) -122);
        for (class217 var2 = (class217) this.field5048.method1736(0); var2 != null; var2 = (class217) this.field5048.method1736(0)) {
            var2.field3372 = this.method2271(1);
            if (var2.field3366 == 0) {
                if (!this.field5050[var2.field3370]) {
                    class217 var5 = new class217();
                    var5.field3371 = '\u0000';
                    var5.field3370 = var2.field3370;
                    var5.field3369 = var2.field3369;
                    var5.field3366 = 0;
                    var5.field3372 = var2.field3372;
                    this.field5038.method1727(var5, (byte) 67);
                    this.field5050[var2.field3370] = true;
                }
                var2.field3366 = 2;
                this.field5038.method1727(var2, (byte) 69);
            } else if (var2.field3366 == 1) {
                if (this.field5050[var2.field3370]) {
                    this.field5038.method1727(var2, (byte) 83);
                    this.field5050[var2.field3370] = false;
                }
            } else if (var2.field3366 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field5050[var3]) {
                        class217 var4 = new class217();
                        var4.field3369 = var2.field3369;
                        var4.field3370 = var3;
                        var4.field3371 = '\u0000';
                        var4.field3366 = 1;
                        var4.field3372 = var2.field3372;
                        this.field5038.method1727(var4, (byte) 60);
                        this.field5050[var3] = false;
                    }
                }
            } else if (var2.field3366 == 3) {
                this.field5038.method1727(var2, (byte) 60);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5046++;
    }

    @OriginalMember(owner = "client!cs", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2270(128, arg0, 1);
        field5042++;
    }

    @OriginalMember(owner = "client!cs", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field5036++;
        this.method2272((byte) -92, 0, -1, '\u0000');
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V")
    public static void method2268(boolean arg0) {
        field5040 = null;
        field5047 = null;
        if (arg0) {
            field5040 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)Z")
    public final boolean method2138(int arg0, int arg1) {
        field5039++;
        if (arg0 >= 0 && arg0 < 112) {
            if (arg1 != -6759) {
                this.field5048 = null;
            }
            return this.field5050[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(Z)V")
    private final void method2269(boolean arg0) {
        field5041++;
        if (this.field5049 == null) {
            return;
        }
        if (arg0) {
            this.method2140(true);
        }
        this.field5049.removeKeyListener(this);
        this.field5049.removeFocusListener(this);
        this.field5049 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field5050[var2] = false;
        }
        this.field5038.method1729((byte) -127);
        this.field5048.method1729((byte) -121);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V")
    private final void method2270(int arg0, KeyEvent arg1, int arg2) {
        if (arg0 != 128) {
            this.focusLost(null);
        }
        field5043++;
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class205.field3180.length > var4) {
            int var5 = class205.field3180[var4];
            if (arg2 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method2272((byte) -31, var6, arg2, '\u0000');
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)I")
    private final int method2271(int arg0) {
        field5033++;
        int var2 = 0;
        if (this.field5050[81]) {
            var2 |= 0x1;
        }
        if (this.field5050[82]) {
            var2 |= 0x4;
        }
        if (arg0 != 1) {
            field5040 = null;
        }
        if (this.field5050[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)Lfo;")
    public final class542 method2140(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field5034++;
            return (class542) this.field5038.method1736(0);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BIIC)V")
    private final void method2272(byte arg0, int arg1, int arg2, char arg3) {
        field5032++;
        class217 var5 = new class217();
        var5.field3370 = arg1;
        var5.field3366 = arg2;
        var5.field3371 = arg3;
        var5.field3369 = class459.method2731(97);
        this.field5048.method1727(var5, (byte) 75);
        if (arg0 >= -8) {
            this.method2140(false);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class359(Component arg0) {
        class666.method3798(26);
        this.method2266(-117, arg0);
    }
}
