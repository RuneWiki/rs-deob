import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class84 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1277 = "Opened title screen";

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1279 = "red:";

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "[I")
    public static int[] field1273;

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[[[I")
    public static int[][][] field1282;

    @OriginalMember(owner = "client!vm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 4)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1276++;
        if (class289.field4555 != null) {
            class151.field2317 = -1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 27)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1278++;
        if (class289.field4555 != null) {
            class42.field586 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class161.field2639.length) {
                var3 = class161.field2639[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class151.field2317 >= 0 && var3 >= 0) {
                class256.field4064[class151.field2317] = ~var3;
                class151.field2317 = class151.field2317 + 1 & 0x7F;
                if (class151.field2317 == class142.field2119) {
                    class151.field2317 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I", line = 62)
    public static final int method618(int arg0, int arg1) {
        field1275++;
        if (arg0 < 17) {
            field1279 = (String) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!vm", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 73)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1284++;
        if (class289.field4555 == null) {
            return;
        }
        class42.field586 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class161.field2639.length > var2) {
            var3 = class161.field2639[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class151.field2317 >= 0 && var3 >= 0) {
            class256.field4064[class151.field2317] = var3;
            class151.field2317 = class151.field2317 + 1 & 0x7F;
            if (class151.field2317 == class142.field2119) {
                class151.field2317 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class119.field1832 + 1 & 0x7F;
            if (class99.field1518 != var4) {
                class170.field2715[class119.field1832] = var3;
                class305.field4761[class119.field1832] = '\u0000';
                class119.field1832 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 134)
    public static void method619(int arg0) {
        field1273 = null;
        if (arg0 == 65535) {
            field1279 = null;
            field1282 = (int[][][]) null;
            field1277 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLkb;)V", line = 150)
    public static final void method620(byte arg0, class39 arg1) {
        field1281++;
        if (arg0 != 109) {
            method621(66, 37, 1, (class132) null, 126, 23, -57);
        }
        class187.field3038 = arg1;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIILlg;III)V", line = 164)
    public static final void method621(int arg0, int arg1, int arg2, class132 arg3, int arg4, int arg5, int arg6) {
        field1283++;
        if (arg1 == -12200) {
            class264.method1882(arg6, arg2, arg5, arg4, arg3.field1944, false, arg3.field1980, arg0);
        }
    }

    @OriginalMember(owner = "client!vm", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 176)
    public final void keyTyped(KeyEvent arg0) {
        if (class289.field4555 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class293.method2047(var2, -3)) {
                int var3 = class119.field1832 + 1 & 0x7F;
                if (class99.field1518 != var3) {
                    class170.field2715[class119.field1832] = -1;
                    class305.field4761[class119.field1832] = var2;
                    class119.field1832 = var3;
                }
            }
        }
        field1274++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!vm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 205)
    public final void focusGained(FocusEvent arg0) {
        field1280++;
    }
}
