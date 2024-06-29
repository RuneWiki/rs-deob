import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1265 = 0;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Lo;")
    public static class84 field1269 = class15.method124("null", 255);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
    public static int[] field1261 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[I")
    public static int[] field1273 = new int[1000];

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lo;")
    public static class84 field1266 = class15.method124("Cancel", 255);

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Z")
    public static boolean field1271 = false;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lo;")
    public static class84 field1277 = class15.method124("Please wait)3)3)3", 255);

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lo;")
    public static class84 field1270 = class15.method124("::hiddenbuttontest", 255);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ka", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 48)
    public final void keyTyped(KeyEvent arg0) {
        field1263++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I", line = 61)
    public static final int method484(int arg0, int arg1, int arg2) {
        field1264++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 == 12800 ? (arg2 & 0xFF80) + var3 : 61;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 87)
    public static final void method485(byte arg0) {
        class109.field2362.method742(4);
        field1275++;
        if (arg0 > -42) {
            field1265 = -113;
        }
    }

    @OriginalMember(owner = "client!ka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 105)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1276++;
        if (class85.field1929 != null) {
            class44.field915 = -1;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I", line = 138)
    public static int method486(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ka", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1262++;
        if (class85.field1929 != null) {
            class17.field306 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class125.field2778.length > var2) {
                var3 = class125.field2778[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class44.field915 >= 0 && var3 >= 0) {
                class89.field2013[class44.field915] = ~var3;
                class44.field915 = class44.field915 + 1 & 0x7F;
                if (class44.field915 == class115.field2511) {
                    class44.field915 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 187)
    public final void focusGained(FocusEvent arg0) {
        field1272++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 222)
    public static void method487(int arg0) {
        field1266 = null;
        field1261 = null;
        field1273 = null;
        if (arg0 == 0) {
            field1269 = null;
            field1277 = null;
            field1270 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 265)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class85.field1929 != null) {
            class17.field306 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class125.field2778.length) {
                var3 = class125.field2778[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class50.method431(arg0, 98);
            }
            if (class44.field915 >= 0 && var3 >= 0) {
                class89.field2013[class44.field915] = var3;
                class44.field915 = class44.field915 + 1 & 0x7F;
                if (class44.field915 == class115.field2511) {
                    class44.field915 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class114.field2465 + 1 & 0x7F;
                if (class54.field1118 != var5) {
                    class107.field2269[class114.field2465] = var3;
                    class122.field2732[class114.field2465] = var4;
                    class114.field2465 = var5;
                }
            }
        }
        arg0.consume();
        field1267++;
    }
}
