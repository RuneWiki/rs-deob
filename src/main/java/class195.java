import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class195 extends class533 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Lrk;")
    private class419 field2935 = new class419();

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lrk;")
    private class419 field2940 = new class419();

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "[Z")
    private boolean[] field2945 = new boolean[112];

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "Lqp;")
    public static class586 field2937 = new class586(49, 6);

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lqp;")
    public static class586 field2941 = new class586(20, -1);

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Ljava/awt/Component;")
    private Component field2943;

    @OriginalMember(owner = "client!mi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 11)
    public final void focusGained(FocusEvent arg0) {
        field2926++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ICIB)V", line = 18)
    private final void method1252(int arg0, char arg1, int arg2, byte arg3) {
        field2932++;
        class392 var5 = new class392();
        var5.field5699 = arg1;
        var5.field5700 = arg0;
        var5.field5704 = arg2;
        if (arg3 <= 37) {
            this.method1258(122);
        }
        var5.field5706 = class450.method2719((byte) -50);
        this.field2940.method2492(var5, (byte) -117);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILjava/awt/event/KeyEvent;)V", line = 38)
    private final void method1253(byte arg0, int arg1, KeyEvent arg2) {
        field2930++;
        if (arg0 != 5) {
            this.field2935 = null;
        }
        int var4 = arg2.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class62.field728.length > var4) {
            int var5 = class62.field728[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0) {
            this.method1252(var6, '\u0000', arg1, (byte) 93);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I", line = 74)
    private final int method1254(int arg0) {
        field2927++;
        int var2 = 0;
        if (arg0 != 1504) {
            this.method1253((byte) 73, 76, null);
        }
        if (this.field2945[81]) {
            var2 |= 0x1;
        }
        if (this.field2945[82]) {
            var2 |= 0x4;
        }
        if (this.field2945[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 98)
    public static void method1255(int arg0) {
        field2941 = null;
        field2937 = null;
        if (arg0 != 2) {
            method1255(-51);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)V", line = 110)
    public static final void method1256(String arg0, int arg1, byte arg2, String arg3) {
        field2933++;
        class621.field9066 = arg1;
        class322.field4782 = 2;
        class18.method87(30245, false, arg3, arg0);
        if (arg2 < 80) {
            method1255(-16);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V", line = 123)
    public final void method1257(byte arg0) {
        if (arg0 < 68) {
            this.method1261(true);
        }
        this.method1261(true);
        field2942++;
    }

    @OriginalMember(owner = "client!mi", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 134)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1253((byte) 5, 0, arg0);
        field2944++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lnt;", line = 142)
    public final class454 method1258(int arg0) {
        field2928++;
        if (arg0 != 2048) {
            this.focusLost(null);
        }
        return (class454) this.field2935.method2498((byte) 38);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)Z", line = 153)
    public final boolean method1259(boolean arg0, int arg1) {
        field2934++;
        if (arg1 >= 0 && arg1 < 112) {
            return arg0 ? this.field2945[arg1] : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 169)
    private final void method1260(int arg0, Component arg1) {
        if (arg0 <= 99) {
            return;
        }
        field2929++;
        this.method1261(true);
        this.field2943 = arg1;
        Method var3 = class353.field5147;
        if (var3 != null) {
            try {
                var3.invoke(this.field2943, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field2943.addKeyListener(this);
        this.field2943.addFocusListener(this);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 364)
    public class195(Component arg0) {
        class174.method1166(false);
        this.method1260(112, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 198)
    private final void method1261(boolean arg0) {
        field2938++;
        if (this.field2943 == null) {
            return;
        }
        this.field2943.removeKeyListener(this);
        this.field2943.removeFocusListener(this);
        this.field2943 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field2945[var2] = false;
        }
        if (!arg0) {
            this.method1260(-13, null);
        }
        this.field2935.method2499(0);
        this.field2940.method2499(0);
    }

    @OriginalMember(owner = "client!mi", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 225)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2939++;
        this.method1253((byte) 5, 1, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 236)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2931++;
        this.method1252(0, '\u0000', -1, (byte) 118);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V", line = 246)
    public final synchronized void method1262(byte arg0) {
        this.field2935.method2499(0);
        field2936++;
        for (class392 var2 = (class392) this.field2940.method2498((byte) 76); var2 != null; var2 = (class392) this.field2940.method2498((byte) 84)) {
            var2.field5707 = this.method1254(1504);
            if (var2.field5704 == 0) {
                if (!this.field2945[var2.field5700]) {
                    class392 var5 = new class392();
                    var5.field5700 = var2.field5700;
                    var5.field5706 = var2.field5706;
                    var5.field5704 = 0;
                    var5.field5707 = var2.field5707;
                    var5.field5699 = '\u0000';
                    this.field2935.method2492(var5, (byte) 41);
                    this.field2945[var2.field5700] = true;
                }
                var2.field5704 = 2;
                this.field2935.method2492(var2, (byte) 86);
            } else if (var2.field5704 == 1) {
                if (this.field2945[var2.field5700]) {
                    this.field2935.method2492(var2, (byte) 54);
                    this.field2945[var2.field5700] = false;
                }
            } else if (var2.field5704 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field2945[var3]) {
                        class392 var4 = new class392();
                        var4.field5700 = var3;
                        var4.field5707 = var2.field5707;
                        var4.field5704 = 1;
                        var4.field5706 = var2.field5706;
                        var4.field5699 = '\u0000';
                        this.field2935.method2492(var4, (byte) 30);
                        this.field2945[var3] = false;
                    }
                }
            } else if (var2.field5704 == 3) {
                this.field2935.method2492(var2, (byte) 72);
            }
        }
        if (arg0 != -14) {
            this.method1253((byte) 124, -126, null);
        }
    }

    @OriginalMember(owner = "client!mi", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 345)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field2925++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class180.method1202((byte) 36, var2)) {
            this.method1252(-1, var2, 3, (byte) 57);
            arg0.consume();
        }
    }
}
