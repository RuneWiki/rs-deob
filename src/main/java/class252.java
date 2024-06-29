import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class252 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lrc;")
    public static class9 field4130 = new class9(260);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lna;")
    public static class146 field4132;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lai;")
    public static class195 field4135;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V")
    public static final void method1670(int arg0, int arg1, byte arg2) {
        if (arg2 >= -64) {
            field4135 = null;
        }
        field4126++;
        if (class110.method766(-13786, arg0)) {
            class273.method1797((byte) -106, arg1, class115.field2068[arg0]);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1671(byte arg0) {
        if (arg0 != 58) {
            method1670(-63, -46, (byte) 10);
        }
        field4132 = null;
        field4130 = null;
        field4135 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLbd;)V")
    public static final void method1672(boolean arg0, class81 arg1) {
        field4129++;
        if (class266.field4301 == arg1.field1469 || arg1.field1384 == -1 || arg1.field1393 != 0 || arg1.field1420 + 1 > class105.method714(arg1.field1384, (byte) 74).field2751[arg1.field1465]) {
            int var2 = arg1.field1469 - arg1.field1435;
            int var3 = class266.field4301 - arg1.field1435;
            int var4 = arg1.field1409 * 128 + (arg1.method528(-28) * 64);
            int var5 = arg1.field1452 * 128 + (arg1.method528(120) * 64);
            int var6 = arg1.field1466 * 128 + arg1.method528(11) * 64;
            int var7 = arg1.field1414 * 128 + (arg1.method528(-77) * 64);
            arg1.field1397 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field1458 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg1.field1407 == 0) {
            arg1.field1389 = 1024;
        }
        if (!arg0) {
            return;
        }
        arg1.field1419 = 0;
        if (arg1.field1407 == 1) {
            arg1.field1389 = 1536;
        }
        if (arg1.field1407 == 2) {
            arg1.field1389 = 0;
        }
        if (arg1.field1407 == 3) {
            arg1.field1389 = 512;
        }
        arg1.field1413 = arg1.field1389;
    }

    @OriginalMember(owner = "client!sf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4133++;
        if (class63.field1096 != null) {
            class51.field890 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class6.field68.length) {
                var3 = class6.field68[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class239.field3934 >= 0 && var3 >= 0) {
                class288.field4582[class239.field3934] = ~var3;
                class239.field3934 = class239.field3934 + 1 & 0x7F;
                if (class239.field3934 == class205.field3359) {
                    class239.field3934 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!sf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4134++;
    }

    @OriginalMember(owner = "client!sf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4128++;
        if (class63.field1096 != null) {
            class239.field3934 = -1;
        }
    }

    @OriginalMember(owner = "client!sf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class63.field1096 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class156.method1071(true, var2)) {
                int var3 = class261.field4265 + 1 & 0x7F;
                if (class113.field2043 != var3) {
                    class259.field4251[class261.field4265] = -1;
                    class46.field765[class261.field4265] = var2;
                    class261.field4265 = var3;
                }
            }
        }
        arg0.consume();
        field4131++;
    }

    @OriginalMember(owner = "client!sf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class63.field1096 != null) {
            class51.field890 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class6.field68.length) {
                var3 = class6.field68[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class239.field3934 >= 0 && var3 >= 0) {
                class288.field4582[class239.field3934] = var3;
                class239.field3934 = class239.field3934 + 1 & 0x7F;
                if (class239.field3934 == class205.field3359) {
                    class239.field3934 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class261.field4265 + 1 & 0x7F;
                if (class113.field2043 != var4) {
                    class259.field4251[class261.field4265] = var3;
                    class46.field765[class261.field4265] = '\u0000';
                    class261.field4265 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4127++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Laj;")
    public static final class116 method1673(int arg0) {
        field4136++;
        try {
            int var1 = 72 % ((arg0 - 19) / 44);
            return (class116) Class.forName("o").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class70();
        }
    }
}
