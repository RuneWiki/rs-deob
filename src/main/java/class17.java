import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 extends class722 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Lifa;")
    private class450 field313 = new class450();

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "Lifa;")
    private class450 field326 = new class450();

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "[Z")
    private boolean[] field329 = new boolean[112];

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "[S")
    public static short[] field307 = new short[256];

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field306 = 2;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Ltja;")
    public static class288 field308 = new class288(64);

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "D")
    public static double field323;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Ljava/awt/Component;")
    private Component field327;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public static void method206(byte arg0) {
        field307 = null;
        field308 = null;
        if (arg0 < 92) {
            field308 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method207(int arg0, Component arg1) {
        field320++;
        int var3 = -56 % ((arg0 - 35) / 51);
        this.method218((byte) -90);
        this.field327 = arg1;
        Method var4 = class675.field9258;
        if (var4 != null) {
            try {
                var4.invoke(this.field327, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field327.addKeyListener(this);
        this.field327.addFocusListener(this);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
    public static final boolean method208(int arg0, int arg1, int arg2) {
        field315++;
        if (arg0 != -6409) {
            method206((byte) -39);
        }
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
    private final int method209(int arg0) {
        if (arg0 != 34844) {
            this.method207(-128, null);
        }
        field303++;
        int var2 = 0;
        if (this.field329[81]) {
            var2 |= 0x1;
        }
        if (this.field329[82]) {
            var2 |= 0x4;
        }
        if (this.field329[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Lwaa;")
    public final class732 method210(int arg0) {
        if (arg0 < 52) {
            return null;
        } else {
            field325++;
            return (class732) this.field313.method2730(-31260);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z")
    public static final boolean method211(int arg0, int arg1) {
        if (arg1 != -25658) {
            method208(62, 4, 121);
        }
        field305++;
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public final synchronized void method212(byte arg0) {
        if (arg0 >= -24) {
            this.method219(null, 111, (byte) -102);
        }
        this.field313.method2729(-48);
        field319++;
        for (class241 var2 = (class241) this.field326.method2730(-31260); var2 != null; var2 = (class241) this.field326.method2730(-31260)) {
            var2.field2848 = this.method209(34844);
            if (var2.field2834 == 0) {
                if (!this.field329[var2.field2849]) {
                    class241 var3 = new class241();
                    var3.field2832 = var2.field2832;
                    var3.field2847 = '\u0000';
                    var3.field2848 = var2.field2848;
                    var3.field2849 = var2.field2849;
                    var3.field2834 = 0;
                    this.field313.method2732(var3, 21939);
                    this.field329[var2.field2849] = true;
                }
                var2.field2834 = 2;
                this.field313.method2732(var2, 21939);
            } else if (var2.field2834 == 1) {
                if (this.field329[var2.field2849]) {
                    this.field313.method2732(var2, 21939);
                    this.field329[var2.field2849] = false;
                }
            } else if (var2.field2834 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field329[var4]) {
                        class241 var5 = new class241();
                        var5.field2834 = 1;
                        var5.field2848 = var2.field2848;
                        var5.field2832 = var2.field2832;
                        var5.field2849 = var4;
                        var5.field2847 = '\u0000';
                        this.field313.method2732(var5, 21939);
                        this.field329[var4] = false;
                    }
                }
            } else if (var2.field2834 == 3) {
                this.field313.method2732(var2, 21939);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public final void method213(int arg0) {
        this.method218((byte) -90);
        if (arg0 == -1) {
            field312++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(CIIB)V")
    private final void method214(char arg0, int arg1, int arg2, byte arg3) {
        field322++;
        class241 var5 = new class241();
        var5.field2834 = arg1;
        var5.field2849 = arg2;
        var5.field2847 = arg0;
        var5.field2832 = class349.method2069(true);
        if (arg3 == 54) {
            this.field326.method2732(var5, 21939);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)I")
    public static final int method215(byte arg0, int arg1) {
        field311++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg0 != -97) {
            return -100;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z")
    public final boolean method216(int arg0, int arg1) {
        field316++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 >= -13) {
                this.keyPressed(null);
            }
            return this.field329[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field324++;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public static final void method217(int arg0) {
        field314++;
        for (int var1 = 0; var1 < 5; var1++) {
            class461.field6476[var1] = false;
        }
        class718.field10090 = 0;
        class719.field10094 = -1;
        class131.field1617 = -1;
        class7.field100 = 1;
        int var2 = -1 / ((arg0 - 61) / 44);
        class404.field5329 = 0;
        class267.field3160 = -1;
        client.field3934 = -1;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
    private final void method218(byte arg0) {
        field317++;
        if (this.field327 == null) {
            return;
        }
        this.field327.removeKeyListener(this);
        this.field327.removeFocusListener(this);
        this.field327 = null;
        if (arg0 != -90) {
            return;
        }
        for (int var2 = 0; var2 < 112; var2++) {
            this.field329[var2] = false;
        }
        this.field313.method2729(-48);
        this.field326.method2729(-48);
    }

    @OriginalMember(owner = "client!kh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method219(arg0, 0, (byte) 119);
        field310++;
    }

    @OriginalMember(owner = "client!kh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method214('\u0000', -1, 0, (byte) 54);
        field304++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;IB)V")
    private final void method219(KeyEvent arg0, int arg1, byte arg2) {
        field318++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class164.field2006.length > var4) {
            int var6 = class164.field2006[var4];
            if (arg1 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method214('\u0000', arg1, var5, (byte) 54);
            if (arg2 == 119) {
                arg0.consume();
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method219(arg0, 1, (byte) 119);
        field309++;
    }

    @OriginalMember(owner = "client!kh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field321++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class756.method4216(0, var2)) {
            this.method214(var2, 3, -1, (byte) 54);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class17(Component arg0) {
        class88.method808((byte) 95);
        this.method207(-105, arg0);
    }
}
