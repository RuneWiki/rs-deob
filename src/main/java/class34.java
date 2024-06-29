import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[Lhe;")
    public static class54[] field842 = new class54[500];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lhe;")
    public static class54 field844 = class6.method58("Wir vermuten)1 dass Ihr Konto gestohlen wurde", false);

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "Lhe;")
    public static class54 field858 = class6.method58(":tradereq:", false);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lhe;")
    private static class54 field849 = class6.method58("Try again in 60 secs)3)3)3", false);

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field857 = -1;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lhe;")
    public static class54 field852 = class6.method58("k", false);

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field856 = 127;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lhe;")
    public static class54 field854 = class6.method58("Benutzen Sie die (WPasswort -=ndern(W Option", false);

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field855 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lhe;")
    public static class54 field850 = field849;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "[J")
    public static long[] field863 = new long[100];

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "[I")
    public static int[] field853 = new int[100];

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Lhe;")
    public static class54 field864 = class6.method58("<)4col> x", false);

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lse;")
    public static class130 field843 = new class130();

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Leb;")
    public static class31 field862;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method252(int arg0) {
        field849 = null;
        field842 = null;
        field862 = null;
        field854 = null;
        field863 = null;
        field858 = null;
        field852 = null;
        if (arg0 > -73) {
            method254(4, (byte) 123, -124, 90);
        }
        field844 = null;
        field843 = null;
        field864 = null;
        field850 = null;
        field853 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
    public static int method253(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ee", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class100.field2527 != null) {
            class132.field2994 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class28.field737.length > var2) {
                var3 = class28.field737[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class85.field2124 >= 0 && var3 >= 0) {
                class155.field3507[class85.field2124] = var3;
                class85.field2124 = class85.field2124 + 1 & 0x7F;
                if (class95.field2398 == class85.field2124) {
                    class85.field2124 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class132.field2995 + 1 & 0x7F;
                if (class84.field2088 != var4) {
                    class115.field2733[class132.field2995] = var3;
                    class51.field1235[class132.field2995] = -1;
                    class132.field2995 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field861++;
    }

    @OriginalMember(owner = "client!ee", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field859++;
        if (class100.field2527 != null) {
            class132.field2994 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class28.field737.length > var2) {
                var3 = class28.field737[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class85.field2124 >= 0 && var3 >= 0) {
                class155.field3507[class85.field2124] = ~var3;
                class85.field2124 = class85.field2124 + 1 & 0x7F;
                if (class95.field2398 == class85.field2124) {
                    class85.field2124 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBII)I")
    public static final int method254(int arg0, byte arg1, int arg2, int arg3) {
        field845++;
        if (arg1 != 18) {
            return 67;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ee", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field846++;
    }

    @OriginalMember(owner = "client!ee", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class66.method511(arg0, 111);
        if (var2 >= 0) {
            int var3 = class132.field2995 + 1 & 0x7F;
            if (class84.field2088 != var3) {
                class115.field2733[class132.field2995] = -1;
                class51.field1235[class132.field2995] = var2;
                class132.field2995 = var3;
            }
        }
        field848++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method255(boolean arg0, String arg1) throws ClassNotFoundException {
        field847++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else {
            if (arg0) {
                method252(30);
            }
            if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field860++;
        if (class100.field2527 != null) {
            class85.field2124 = -1;
        }
    }
}
