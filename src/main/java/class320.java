import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class320 extends class325 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lmfa;")
    private class562 field4145 = new class562();

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lmfa;")
    private class562 field4150 = new class562();

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "[Z")
    private boolean[] field4154 = new boolean[112];

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lbca;")
    public static class604 field4147 = new class604("", 13);

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Lkfa;")
    public static class549 field4148 = new class549(8, -1);

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field4155 = 0;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field4153;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIC)V")
    private final void method1794(int arg0, byte arg1, int arg2, char arg3) {
        field4151++;
        class8 var5 = new class8();
        var5.field75 = arg3;
        var5.field64 = arg2;
        var5.field67 = arg0;
        if (arg1 != 106) {
            this.keyPressed(null);
        }
        var5.field74 = class641.method3604(false);
        this.field4150.method3164(var5, 256);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
    public static void method1795(boolean arg0) {
        field4147 = null;
        if (arg0) {
            field4148 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4144++;
        this.method1800(arg0, (byte) 10, 1);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjo;)V")
    public static final void method1796(int arg0, class303 arg1) {
        field4136++;
        class93.field1050 = arg1.method1716(true, "p11_full");
        class525.field7511 = arg1.method1716(true, "p12_full");
        class453.field6280 = arg1.method1716(true, "b12_full");
        if (arg0 != 32) {
            method1796(83, null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public final synchronized void method1797(byte arg0) {
        field4134++;
        if (arg0 != 0) {
            field4155 = -85;
        }
        this.field4145.method3170((byte) 81);
        for (class8 var2 = (class8) this.field4150.method3171(arg0 + 768); var2 != null; var2 = (class8) this.field4150.method3171(768)) {
            var2.field65 = this.method1804(0);
            if (var2.field67 == 0) {
                if (!this.field4154[var2.field64]) {
                    class8 var3 = new class8();
                    var3.field75 = '\u0000';
                    var3.field74 = var2.field74;
                    var3.field65 = var2.field65;
                    var3.field64 = var2.field64;
                    var3.field67 = 0;
                    this.field4145.method3164(var3, 256);
                    this.field4154[var2.field64] = true;
                }
                var2.field67 = 2;
                this.field4145.method3164(var2, 256);
            } else if (var2.field67 == 1) {
                if (this.field4154[var2.field64]) {
                    this.field4145.method3164(var2, 256);
                    this.field4154[var2.field64] = false;
                }
            } else if (var2.field67 == -1) {
                for (int var4 = 0; var4 < 112; var4++) {
                    if (this.field4154[var4]) {
                        class8 var5 = new class8();
                        var5.field67 = 1;
                        var5.field74 = var2.field74;
                        var5.field64 = var4;
                        var5.field65 = var2.field65;
                        var5.field75 = '\u0000';
                        this.field4145.method3164(var5, 256);
                        this.field4154[var4] = false;
                    }
                }
            } else if (var2.field67 == 3) {
                this.field4145.method3164(var2, 256);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lmj;")
    public final class597 method1798(byte arg0) {
        if (arg0 != 0) {
            this.method1794(-7, (byte) 18, -34, (char) 65453);
        }
        field4135++;
        return (class597) this.field4145.method3171(768);
    }

    @OriginalMember(owner = "client!rb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4139++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1799(Throwable arg0, int arg1) throws IOException {
        field4138++;
        String var2;
        if ((arg0 instanceof class545)) {
            class545 var3 = (class545) arg0;
            var2 = var3.field7804 + " | ";
            arg0 = var3.field7805;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                String var18 = var2 + "| " + var8;
                int var19 = -44 / ((-arg1 - 63) / 52);
                return var18;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;BI)V")
    private final void method1800(KeyEvent arg0, byte arg1, int arg2) {
        if (arg1 != 10) {
            field4155 = -105;
        }
        field4146++;
        int var4 = arg0.getKeyCode();
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && var4 < class530.field7599.length) {
            int var6 = class530.field7599[var4];
            if (arg2 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method1794(arg2, (byte) 106, var5, '\u0000');
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method1801(byte arg0, Component arg1) {
        this.method1802(112);
        field4140++;
        if (arg0 != -19) {
            this.method1802(-76);
        }
        this.field4153 = arg1;
        Method var3 = class556.field7928;
        if (var3 != null) {
            try {
                var3.invoke(this.field4153, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field4153.addKeyListener(this);
        this.field4153.addFocusListener(this);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    private final void method1802(int arg0) {
        field4142++;
        if (this.field4153 == null) {
            return;
        }
        this.field4153.removeKeyListener(this);
        this.field4153.removeFocusListener(this);
        this.field4153 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field4154[var2] = false;
        }
        this.field4145.method3170((byte) -109);
        if (arg0 == 112) {
            this.field4150.method3170((byte) 79);
        }
    }

    @OriginalMember(owner = "client!rb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method1800(arg0, (byte) 10, 0);
        field4143++;
    }

    @OriginalMember(owner = "client!rb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyTyped(KeyEvent arg0) {
        field4141++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class17.method71(-80, var2)) {
            this.method1794(3, (byte) 106, -1, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public final void method1803(boolean arg0) {
        if (arg0) {
            field4147 = null;
        }
        field4133++;
        this.method1802(112);
    }

    @OriginalMember(owner = "client!rb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method1794(-1, (byte) 106, 0, '\u0000');
        field4149++;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)I")
    private final int method1804(int arg0) {
        field4137++;
        int var2 = arg0;
        if (this.field4154[81]) {
            var2 = arg0 | 0x1;
        }
        if (this.field4154[82]) {
            var2 |= 0x4;
        }
        if (this.field4154[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Z")
    public final boolean method1805(byte arg0, int arg1) {
        if (arg0 > -50) {
            this.field4154 = null;
        }
        field4152++;
        return arg1 >= 0 && arg1 < 112 ? this.field4154[arg1] : false;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class320(Component arg0) {
        class25.method126((byte) -103);
        this.method1801((byte) -19, arg0);
    }
}
