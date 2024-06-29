import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lod;")
    public static class101 field1511 = class46.method335(68, "(Z");

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Z")
    public static boolean field1509 = false;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1502 = 0;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
    public static int[] field1512 = new int[32];

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lob;")
    public static class99 field1504 = new class99();

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Lod;")
    private static class101 field1515 = class46.method335(-90, "No response from server)3");

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lod;")
    public static class101 field1517 = class46.method335(105, "Hier wechseln");

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Lod;")
    public static class101 field1519 = class46.method335(-93, "rect_debug=");

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lod;")
    public static class101 field1518 = class46.method335(85, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lod;")
    public static class101 field1520 = field1515;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "J")
    public static long field1521;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lc;")
    public static class15 field1506;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "[Z")
    public static boolean[] field1501;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "[[B")
    public static byte[][] field1503;

    @OriginalMember(owner = "client!je", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1510++;
        int var2 = class27.method222(arg0, 0);
        if (var2 >= 0) {
            int var3 = class61.field1355 + 1 & 0x7F;
            if (class40.field958 != var3) {
                class44.field1053[class61.field1355] = -1;
                class99.field2152[class61.field1355] = var2;
                class61.field1355 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!je", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class132.field3005 != null) {
            class64.field1467 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class155.field3555.length > var2) {
                var3 = class155.field3555[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class145.field3338 >= 0 && var3 >= 0) {
                class6.field87[class145.field3338] = ~var3;
                class145.field3338 = class145.field3338 + 1 & 0x7F;
                if (class73.field1588 == class145.field3338) {
                    class145.field3338 = -1;
                }
            }
        }
        field1497++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class132.field3005 != null) {
            class145.field3338 = -1;
        }
        field1514++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1506 = null;
        field1517 = null;
        field1503 = null;
        field1512 = null;
        field1515 = null;
        field1518 = null;
        if (arg0 != -20468) {
            method451(-58);
        }
        field1519 = null;
        field1501 = null;
        field1520 = null;
        field1504 = null;
        field1511 = null;
    }

    @OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1505++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IJ)Lod;")
    public static final class101 method452(int arg0, long arg1) {
        field1500++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg0 < 89) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var3 /= 37L;
                var5++;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class39.field933[(int) (var8 - arg1 * 37L)];
            }
            class101 var7 = new class101();
            var7.field2223 = var6;
            var7.field2231 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!je", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class132.field3005 != null) {
            class64.field1467 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class155.field3555.length > var2) {
                var3 = class155.field3555[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class145.field3338 >= 0 && var3 >= 0) {
                class6.field87[class145.field3338] = var3;
                class145.field3338 = class145.field3338 + 1 & 0x7F;
                if (class73.field1588 == class145.field3338) {
                    class145.field3338 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class61.field1355 + 1 & 0x7F;
                if (class40.field958 != var4) {
                    class44.field1053[class61.field1355] = var3;
                    class99.field2152[class61.field1355] = -1;
                    class61.field1355 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1499++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLtf;)V")
    public static final void method453(byte arg0, class138 arg1) {
        if (arg0 < 75) {
            field1502 = 94;
        }
        if (class95.field2051 != null) {
            try {
                class95.field2051.method213(0L, -1829);
                class95.field2051.method207(24, (byte) -96, arg1.field3213, arg1.field3175);
            } catch (Exception var2) {
            }
        }
        arg1.field3175 += 24;
        field1507++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I")
    public static final int method454(int arg0, int arg1) {
        if (arg0 >= -42) {
            return 43;
        }
        field1498++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }
}
