import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class85 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
    public static int[] field1489 = new int[32];

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1488 = 0;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "J")
    public static long field1499;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Z")
    public static boolean field1497;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "[I")
    public static int[] field1498;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lsb;")
    private static class98 field1506;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lsb;")
    public static class98 field1503;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "Lsb;")
    public static class98 field1500;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lwa;")
    public static class219 field1505;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lq;")
    public static class148 field1501;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1504;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1507;

    @OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1496++;
        if (class197.field3394 != null) {
            class153.field2803 = -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II[Lq;)V")
    public static final void method634(int arg0, int arg1, class148[] arg2) {
        if (arg0 != 1) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class148 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2665 == 0) {
                    if (var4.field2751 != null) {
                        method634(1, arg1, var4.field2751);
                    }
                    class34 var5 = (class34) class243.field4209.method1511((byte) -127, (long) var4.field2728);
                    if (var5 != null) {
                        class235.method1610(var5.field596, 24148, arg1);
                    }
                }
                if (arg1 == 0 && var4.field2718 != null) {
                    class28 var6 = new class28();
                    var6.field514 = var4.field2718;
                    var6.field517 = var4;
                    class192.method1327(var6, 200000);
                }
                if (arg1 == 1 && var4.field2662 != null) {
                    if (var4.field2651 >= 0) {
                        class148 var7 = class62.method455(-854073200, var4.field2728);
                        if (var7 == null || var7.field2751 == null || var7.field2751.length <= var4.field2651 || var7.field2751[var4.field2651] != var4) {
                            continue;
                        }
                    }
                    class28 var8 = new class28();
                    var8.field517 = var4;
                    var8.field514 = var4.field2662;
                    class192.method1327(var8, 200000);
                }
            }
        }
        field1491++;
    }

    @OriginalMember(owner = "client!kf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1492++;
        if (class197.field3394 != null) {
            class8.field188 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class190.field3289.length) {
                var3 = class190.field3289[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class153.field2803 >= 0 && var3 >= 0) {
                class154.field2819[class153.field2803] = ~var3;
                class153.field2803 = class153.field2803 + 1 & 0x7F;
                if (class36.field604 == class153.field2803) {
                    class153.field2803 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!kf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1490++;
        if (class197.field3394 == null) {
            return;
        }
        class8.field188 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class190.field3289.length) {
            var3 = class190.field3289[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class153.field2803 >= 0 && var3 >= 0) {
            class154.field2819[class153.field2803] = var3;
            class153.field2803 = class153.field2803 + 1 & 0x7F;
            if (class36.field604 == class153.field2803) {
                class153.field2803 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class161.field2909 + 1 & 0x7F;
            if (class147.field2573 != var4) {
                class32.field567[class161.field2909] = var3;
                class142.field2516[class161.field2909] = -1;
                class161.field2909 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1493++;
    }

    @OriginalMember(owner = "client!kf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1494++;
        if (class197.field3394 != null) {
            int var2 = class238.method1629(-101, arg0);
            if (var2 >= 0) {
                int var3 = class161.field2909 + 1 & 0x7F;
                if (class147.field2573 != var3) {
                    class32.field567[class161.field2909] = -1;
                    class142.field2516[class161.field2909] = var2;
                    class161.field2909 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method635(int arg0) {
        if (arg0 > -62) {
            method634(63, -55, (class148[]) null);
        }
        field1505 = null;
        field1501 = null;
        field1489 = null;
        field1500 = null;
        field1504 = null;
        field1498 = null;
        field1507 = null;
        field1506 = null;
        field1503 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static final void method636(int arg0) {
        class211.field3606.method1554((byte) -109);
        field1495++;
        if (arg0 <= 85) {
            field1500 = null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1489[var1] = var0 - 1;
            var0 += var0;
        }
        field1499 = 0L;
        field1497 = true;
        field1498 = new int[] { 1, 2, 4, 8 };
        field1506 = class47.method368("yellow:", 0);
        field1502 = 1;
        field1503 = field1506;
        field1500 = field1506;
        field1505 = new class219(16);
    }
}
