import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class390 extends class734 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "Lro;")
    private class2 field5461 = new class2();

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "Lro;")
    private class2 field5465 = new class2();

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "[Z")
    private boolean[] field5467 = new boolean[112];

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "Lkaa;")
    public static class47 field5458 = new class47(30, 1);

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "Lkg;")
    public static class275 field5468 = new class275(9, 0, 4, 1);

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "Ldu;")
    public static class360 field5470 = new class360(64);

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "Lhda;")
    public static class752 field5471 = new class752(23, 7);

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field5469;

    @OriginalMember(owner = "client!bp", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 5)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field5459++;
        this.method2315(arg0, 1, false);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 18)
    public final synchronized void method2307(byte arg0) {
        field5457++;
        this.field5461.method23(10);
        if (arg0 != -92) {
            this.method2307((byte) -65);
        }
        for (class382 var2 = (class382) this.field5465.method10(false); var2 != null; var2 = (class382) this.field5465.method10(false)) {
            var2.field5314 = this.method2317(true);
            if (var2.field5307 == 0) {
                if (!this.field5467[var2.field5313]) {
                    class382 var5 = new class382();
                    var5.field5312 = var2.field5312;
                    var5.field5307 = 0;
                    var5.field5310 = '\u0000';
                    var5.field5313 = var2.field5313;
                    var5.field5314 = var2.field5314;
                    this.field5461.method11(var5, arg0 - 16);
                    this.field5467[var2.field5313] = true;
                }
                var2.field5307 = 2;
                this.field5461.method11(var2, -91);
            } else if (var2.field5307 == 1) {
                if (this.field5467[var2.field5313]) {
                    this.field5461.method11(var2, arg0 ^ 0x3A);
                    this.field5467[var2.field5313] = false;
                }
            } else if (var2.field5307 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field5467[var3]) {
                        class382 var4 = new class382();
                        var4.field5314 = var2.field5314;
                        var4.field5307 = 1;
                        var4.field5313 = var3;
                        var4.field5312 = var2.field5312;
                        var4.field5310 = '\u0000';
                        this.field5461.method11(var4, arg0 ^ 0x29);
                        this.field5467[var3] = false;
                    }
                }
            } else if (var2.field5307 == 3) {
                this.field5461.method11(var2, -93);
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 109)
    private final void method2308(int arg0, Component arg1) {
        field5452++;
        this.method2309(-128);
        this.field5469 = arg1;
        Method var3 = class192.field2882;
        if (var3 != null) {
            try {
                var3.invoke(this.field5469, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field5469.addKeyListener(this);
        this.field5469.addFocusListener(this);
        if (arg0 != -6159) {
            method2312(-89, false, 54);
        }
    }

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V", line = 136)
    private final void method2309(int arg0) {
        field5454++;
        if (this.field5469 == null) {
            return;
        }
        this.field5469.removeKeyListener(this);
        this.field5469.removeFocusListener(this);
        this.field5469 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field5467[var2] = false;
        }
        int var3 = -62 % ((-arg0 - 67) / 52);
        this.field5461.method23(10);
        this.field5465.method23(10);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 165)
    public final void method2310(int arg0) {
        if (arg0 == -1) {
            field5448++;
            this.method2309(arg0 ^ 0xFFFFFF80);
        }
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V", line = 176)
    public static void method2311(int arg0) {
        if (arg0 != -9959) {
            field5468 = null;
        }
        field5458 = null;
        field5471 = null;
        field5468 = null;
        field5470 = null;
    }

    @OriginalMember(owner = "client!bp", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 189)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5462++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class359.method2134(var2, -90)) {
            this.method2318(var2, 3, 0, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZI)Z", line = 206)
    public static final boolean method2312(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return false;
        } else {
            field5451++;
            return (arg0 & 0x8000) != 0;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)Z", line = 219)
    public final boolean method2313(boolean arg0, int arg1) {
        field5449++;
        if (arg1 >= 0 && arg1 < 112) {
            return arg0 ? this.field5467[arg1] : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 234)
    public final void focusGained(FocusEvent arg0) {
        field5450++;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 381)
    public class390(Component arg0) {
        class127.method1006(-94);
        this.method2308(-6159, arg0);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Z)V", line = 246)
    public static final void method2314(boolean arg0) {
        field5464++;
        class26.method246(255, -1, 2);
        if (arg0) {
            method2312(-91, false, 116);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IZ)V", line = 257)
    private final void method2315(KeyEvent arg0, int arg1, boolean arg2) {
        field5455++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class536.field7065.length > var4) {
            int var5 = class536.field7065[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0 && !arg2) {
            this.method2318('\u0000', arg1, 0, var6);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)Ltda;", line = 295)
    public final class638 method2316(int arg0) {
        if (arg0 != 20175) {
            field5470 = null;
        }
        field5456++;
        return (class638) this.field5461.method10(false);
    }

    @OriginalMember(owner = "client!bp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 306)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5466++;
        this.method2318('\u0000', -1, 0, 0);
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(Z)I", line = 318)
    private final int method2317(boolean arg0) {
        field5453++;
        int var2 = 0;
        if (this.field5467[81]) {
            var2 |= 0x1;
        }
        if (!arg0) {
            return -37;
        }
        if (this.field5467[82]) {
            var2 |= 0x4;
        }
        if (this.field5467[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(CIII)V", line = 343)
    private final void method2318(char arg0, int arg1, int arg2, int arg3) {
        field5460++;
        class382 var5 = new class382();
        var5.field5313 = arg3;
        var5.field5307 = arg1;
        if (arg2 != 0) {
            this.keyReleased(null);
        }
        var5.field5310 = arg0;
        var5.field5312 = class375.method2193(116);
        this.field5465.method11(var5, -128);
    }

    @OriginalMember(owner = "client!bp", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 368)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method2315(arg0, 0, false);
        field5463++;
    }
}
