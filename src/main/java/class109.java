import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class109 extends class304 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!eda", name = "y", descriptor = "Ltm;")
    private class412 field1511 = new class412();

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "Ltm;")
    private class412 field1512 = new class412();

    @OriginalMember(owner = "client!eda", name = "A", descriptor = "[Z")
    private boolean[] field1513 = new boolean[112];

    @OriginalMember(owner = "client!eda", name = "g", descriptor = "Lss;")
    public static class457 field1493 = new class457();

    @OriginalMember(owner = "client!eda", name = "h", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!eda", name = "w", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!eda", name = "x", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!eda", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field1514;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BJ)V", line = 3)
    public static final void method822(byte arg0, long arg1) {
        field1508++;
        if (arg0 <= -103) {
            class295.field4285.setTime(new Date(arg1));
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V", line = 20)
    public final void method823(int arg0) {
        if (arg0 != -6009) {
            this.field1513 = null;
        }
        field1498++;
        this.method833(arg0 + 5951);
    }

    @OriginalMember(owner = "client!eda", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 34)
    public final synchronized void keyReleased(KeyEvent arg0) {
        this.method830(1, arg0, 32158);
        field1501++;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)I", line = 42)
    private final int method824(boolean arg0) {
        field1500++;
        int var2 = 0;
        if (this.field1513[81]) {
            var2 |= 0x1;
        }
        if (this.field1513[82]) {
            var2 |= 0x4;
        }
        if (arg0) {
            this.field1512 = null;
        }
        if (this.field1513[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)Lpfa;", line = 65)
    public final class313 method825(int arg0) {
        if (arg0 > -127) {
            return null;
        } else {
            field1506++;
            return (class313) this.field1511.method2543(-15114);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjp;)V", line = 76)
    public static final void method826(int arg0, class376 arg1) {
        field1499++;
        if ((arg1.field5518.length - arg1.field5459) < 1) {
            return;
        }
        int var2 = arg1.method2398(arg0 - 1372747260);
        if (var2 < 0 || var2 > 1 || arg1.field5518.length - arg1.field5459 < 2) {
            return;
        }
        int var3 = arg1.method2359(-1);
        if (var3 * 6 > arg1.field5518.length - arg1.field5459 || arg0 != 4) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method2359(-1);
            int var6 = arg1.method2384(arg0 + 71);
            if (var5 < class700.field9825.length && class197.field2639[var5] && (class362.field5282.method276(116, var5).field7174 != '1' || var6 >= -1 && var6 <= 1)) {
                class700.field9825[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)V", line = 127)
    public static void method827(byte arg0) {
        field1493 = null;
        int var1 = -3 % ((-arg0 - 74) / 45);
    }

    @OriginalMember(owner = "client!eda", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 136)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1507++;
        this.method830(0, arg0, 32158);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)Z", line = 144)
    public final boolean method828(int arg0, int arg1) {
        field1494++;
        if (arg1 >= 0 && arg1 < 112) {
            if (arg0 != -2) {
                field1493 = null;
            }
            return this.field1513[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eda", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 159)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field1497++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class85.method701(var2, 7546)) {
            this.method829(-1, 3, -116, var2);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIIC)V", line = 173)
    private final void method829(int arg0, int arg1, int arg2, char arg3) {
        field1502++;
        class496 var5 = new class496();
        var5.field6855 = arg1;
        var5.field6863 = arg3;
        int var6 = 21 / ((-arg2 - 76) / 37);
        var5.field6862 = arg0;
        var5.field6864 = class302.method1910(0);
        this.field1512.method2545(-127, var5);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;I)V", line = 195)
    private final void method830(int arg0, KeyEvent arg1, int arg2) {
        field1496++;
        int var4 = arg1.getKeyCode();
        int var6;
        if (var4 == 0) {
            var6 = 0;
        } else if (var4 >= 0 && var4 < class658.field9114.length) {
            int var5 = class658.field9114[var4];
            if (arg0 == 0 && (var5 & 0x80) != 0) {
                var6 = 0;
            } else {
                var6 = var5 & 0xFFFFFF7F;
            }
        } else {
            var6 = 0;
        }
        if (arg2 != 32158) {
            this.method831((byte) 18);
        }
        if (var6 != 0) {
            this.method829(var6, arg0, 92, '\u0000');
            arg1.consume();
        }
    }

    @OriginalMember(owner = "client!eda", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 237)
    public final void focusGained(FocusEvent arg0) {
        field1504++;
    }

    @OriginalMember(owner = "client!eda", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 245)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1505++;
        this.method829(0, -1, -118, '\u0000');
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V", line = 255)
    public final synchronized void method831(byte arg0) {
        if (arg0 <= 62) {
            return;
        }
        this.field1511.method2549(-117);
        field1503++;
        for (class496 var2 = (class496) this.field1512.method2543(-15114); var2 != null; var2 = (class496) this.field1512.method2543(-15114)) {
            var2.field6857 = this.method824(false);
            if (var2.field6855 == 0) {
                if (!this.field1513[var2.field6862]) {
                    class496 var5 = new class496();
                    var5.field6864 = var2.field6864;
                    var5.field6855 = 0;
                    var5.field6857 = var2.field6857;
                    var5.field6862 = var2.field6862;
                    var5.field6863 = '\u0000';
                    this.field1511.method2545(-126, var5);
                    this.field1513[var2.field6862] = true;
                }
                var2.field6855 = 2;
                this.field1511.method2545(-128, var2);
            } else if (var2.field6855 == 1) {
                if (this.field1513[var2.field6862]) {
                    this.field1511.method2545(-128, var2);
                    this.field1513[var2.field6862] = false;
                }
            } else if (var2.field6855 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field1513[var3]) {
                        class496 var4 = new class496();
                        var4.field6863 = '\u0000';
                        var4.field6864 = var2.field6864;
                        var4.field6862 = var3;
                        var4.field6857 = var2.field6857;
                        var4.field6855 = 1;
                        this.field1511.method2545(-128, var4);
                        this.field1513[var3] = false;
                    }
                }
            } else if (var2.field6855 == 3) {
                this.field1511.method2545(-126, var2);
            }
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 415)
    public class109(Component arg0) {
        class29.method215(1);
        this.method832(23181, arg0);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 354)
    private final void method832(int arg0, Component arg1) {
        field1509++;
        this.method833(-69);
        this.field1514 = arg1;
        Method var3 = class70.field994;
        if (var3 != null) {
            try {
                var3.invoke(this.field1514, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field1514.addKeyListener(this);
        if (arg0 != 23181) {
            this.method831((byte) 2);
        }
        this.field1514.addFocusListener(this);
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V", line = 384)
    private final void method833(int arg0) {
        field1495++;
        if (this.field1514 == null) {
            return;
        }
        this.field1514.removeKeyListener(this);
        this.field1514.removeFocusListener(this);
        this.field1514 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field1513[var2] = false;
        }
        int var3 = 117 / ((arg0 - 23) / 38);
        this.field1511.method2549(-99);
        this.field1512.method2549(-81);
    }
}
