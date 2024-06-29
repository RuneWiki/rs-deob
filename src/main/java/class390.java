import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class390 extends class148 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[Z")
    private boolean[] field5401 = new boolean[112];

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field5406 = 1;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lh;")
    public static class434 field5411 = new class434(68, 4);

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field5417 = 0;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field5423 = 0;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Lr;")
    public static class110 field5403;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lco;")
    private class68 field5399;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lco;")
    private class68 field5402;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Lco;")
    private class68 field5419;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field5410;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "[S")
    public static short[] field5418;

    @OriginalMember(owner = "client!ke", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 5)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field5408++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class178.method1016(var2, (byte) -122)) {
            this.method2389((byte) 42, var2, -1, 2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BCII)V", line = 21)
    private final void method2389(byte arg0, char arg1, int arg2, int arg3) {
        field5415++;
        class68 var5 = new class68();
        var5.field921 = arg2;
        var5.field927 = arg3;
        var5.field919 = arg1;
        if (arg0 != 42) {
            field5423 = 0;
        }
        var5.field926 = class440.method2583(arg0 + 25225);
        if (this.field5419 == null) {
            this.field5402 = var5;
        } else {
            this.field5419.field929 = var5;
        }
        this.field5419 = var5;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lbu;[[BI)V", line = 45)
    public static final void method2390(class17 arg0, byte[][] arg1, int arg2) {
        field5407++;
        if (arg2 != 8) {
            return;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class32 var11 = new class32(var10);
                int var12 = class306.field4050[var5] >> 8;
                int var13 = class306.field4050[var5] & 0xFF;
                int var14 = var12 * 64 - class162.field2260;
                int var15 = var13 * 64 - class266.field3511;
                class183.method1073(-1);
                arg0.method2839(var14, class60.field805, 29586, var11, var15, class266.field3511, class162.field2260);
                arg0.method104(var3, var15, var14, class98.field1432, var11, false);
                if (!arg0.field6802 && (class4.field60 / 8) == var12 && (class391.field5426 / 8) == var13) {
                    if (var3[0] == -1) {
                        class11.field147 = null;
                    } else {
                        class11.field147 = class391.field5430.method1643(var3[0], var3[1], var3[2], class135.field1973, var3[3], (byte) -113);
                        class143.field2057 = var3[4];
                    }
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class306.field4050[var6] >> 8) * 64 - class162.field2260;
            int var8 = (class306.field4050[var6] & 0xFF) * 64 - class266.field3511;
            byte[] var9 = arg1[var6];
            if (var9 == null && class391.field5426 < 800) {
                class183.method1073(-1);
                arg0.method2850(var8, var7, 64, (byte) -128, 64);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 120)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field5416++;
        this.method2392(arg0, 0, 128);
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V", line = 128)
    public static final void method2391(int arg0) {
        class76 var1 = class480.field6631;
        synchronized (class480.field6631) {
            class480.field6631.method502(arg0);
            if (arg0 != 0) {
                field5418 = null;
            }
        }
        field5404++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 141)
    private final void method2392(KeyEvent arg0, int arg1, int arg2) {
        field5422++;
        int var4 = arg0.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && class263.field3501.length > var4) {
            int var5 = class263.field3501[var4];
            if (arg1 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (var6 != 0 && arg2 == 128) {
            this.method2389((byte) 42, '\u0000', var6, arg1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 393)
    public class390(Component arg0) {
        class274.method1544(5486);
        this.method2394(arg0, (byte) 54);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V", line = 180)
    public final void method877(int arg0) {
        field5420++;
        if (arg0 == 14194) {
            this.method2395(60);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)I", line = 191)
    public static final int method2393(int arg0, int arg1, int arg2) {
        field5425++;
        if (arg0 == 1 || arg0 == 3) {
            return class441.field5951[arg2 & 0x3];
        } else {
            if (arg1 > -76) {
                field5417 = 28;
            }
            return class262.field3479[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!ke", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 205)
    public final void focusGained(FocusEvent arg0) {
        field5405++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 212)
    private final void method2394(Component arg0, byte arg1) {
        field5424++;
        this.method2395(83);
        this.field5410 = arg0;
        Method var3 = class241.field3224;
        if (var3 != null) {
            try {
                var3.invoke(this.field5410, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        this.field5410.addKeyListener(this);
        this.field5410.addFocusListener(this);
        int var4 = 36 / ((arg1 + 38) / 41);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 235)
    public final synchronized void method876(int arg0) {
        if (arg0 < 77) {
            this.field5410 = null;
        }
        field5421++;
        for (class68 var2 = this.field5402; var2 != null; var2 = var2.field929) {
            if (var2.field927 == 0) {
                if (var2.field921 >= 0) {
                    var2.field917 = !this.field5401[var2.field921];
                }
                this.field5401[var2.field921] = true;
            } else if (var2.field927 == 1) {
                this.field5401[var2.field921] = false;
            } else if (var2.field927 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    this.field5401[var3] = false;
                }
            }
        }
        this.field5399 = this.field5402;
        this.field5402 = null;
        this.field5419 = null;
    }

    @OriginalMember(owner = "client!ke", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 289)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method2392(arg0, 1, 128);
        field5409++;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V", line = 297)
    private final void method2395(int arg0) {
        field5413++;
        if (this.field5410 == null) {
            return;
        }
        this.field5410.removeKeyListener(this);
        this.field5410.removeFocusListener(this);
        this.field5410 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field5401[var2] = false;
        }
        this.field5402 = null;
        this.field5399 = null;
        this.field5419 = null;
        if (arg0 < 2) {
            this.focusGained((FocusEvent) null);
        }
    }

    @OriginalMember(owner = "client!ke", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 330)
    public final synchronized void focusLost(FocusEvent arg0) {
        field5412++;
        this.method2389((byte) 42, '\u0000', 0, -1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Z", line = 353)
    public final boolean method882(byte arg0, int arg1) {
        field5400++;
        int var3 = -64 / (arg0 / 59);
        return arg1 >= 0 && arg1 < 112 ? this.field5401[arg1] : false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lrk;", line = 368)
    public final class25 method881(boolean arg0) {
        if (!arg0) {
            field5423 = 127;
        }
        field5414++;
        class68 var2;
        for (var2 = this.field5399; var2 != null && var2.field927 == -1; var2 = var2.field929) {
        }
        if (var2 == null) {
            this.field5399 = null;
        } else {
            this.field5399 = var2.field929;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V", line = 412)
    public static void method2396(int arg0) {
        if (arg0 >= -80) {
            method2391(92);
        }
        field5411 = null;
        field5418 = null;
        field5403 = null;
    }
}
