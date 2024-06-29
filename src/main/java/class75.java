import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[J")
    public static long[] field1848 = new long[100];

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    public static int[] field1842 = new int[32];

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[Lr;")
    public static class118[] field1847 = new class118[100];

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lr;")
    public static class118 field1846 = class153.method1136(96, "jolt");

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lr;")
    private static class118 field1853 = class153.method1136(96, " seconds)3");

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lr;")
    public static class118 field1857 = field1853;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "[Lcb;")
    public static class17[] field1861;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lke;")
    public static class74 field1859;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Lff;")
    public static class42 field1858;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "[I")
    public static int[] field1849;

    @OriginalMember(owner = "client!kf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1851++;
        if (class151.field3395 != null) {
            class103.field2360 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class99.field2292.length) {
                var3 = class99.field2292[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class45.field1079 >= 0 && var3 >= 0) {
                class9.field215[class45.field1079] = ~var3;
                class45.field1079 = class45.field1079 + 1 & 0x7F;
                if (class83.field1988 == class45.field1079) {
                    class45.field1079 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lgd;")
    public static final class46 method631(int arg0, int arg1) {
        field1845++;
        class46 var2 = (class46) class132.field3027.method395((byte) -92, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 1 % ((arg0 + 66) / 59);
        byte[] var4 = class128.field2932.method350(14, -91, arg1);
        class46 var5 = new class46();
        if (var4 != null) {
            var5.method387((byte) -95, new class105(var4));
        }
        class132.field3027.method391(var5, (long) arg1, true);
        return var5;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V")
    public static final void method632(int arg0, boolean arg1) {
        field1856++;
        if (arg0 == -1 || !class23.method211(arg0, 0)) {
            return;
        }
        class74[] var2 = class63.field1446[arg0];
        int var3 = 0;
        if (!arg1) {
            field1860 = -90;
        }
        while (var3 < var2.length) {
            class74 var4 = var2[var3];
            if (var4.field1766 != null) {
                class136 var5 = new class136();
                var5.field3077 = var4;
                var5.field3067 = var4.field1766;
                class83.method681(var5, (byte) -93);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method633(boolean arg0) {
        field1848 = null;
        field1858 = null;
        field1861 = null;
        field1857 = null;
        field1842 = null;
        field1847 = null;
        if (arg0) {
            method634(-40, -75, -71);
        }
        field1853 = null;
        field1859 = null;
        field1846 = null;
        field1849 = null;
    }

    @OriginalMember(owner = "client!kf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class121.method953(arg0, true);
        if (var2 >= 0) {
            int var3 = class4.field63 + 1 & 0x7F;
            if (class110.field2559 != var3) {
                class65.field1483[class4.field63] = -1;
                class44.field1058[class4.field63] = var2;
                class4.field63 = var3;
            }
        }
        arg0.consume();
        field1843++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public static final int method634(int arg0, int arg1, int arg2) {
        field1841++;
        if (arg2 != 12345678) {
            method631(34, -5);
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1850++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lr;Lff;Lr;I)Ln;")
    public static final class90 method635(class118 arg0, class42 arg1, class118 arg2, int arg3) {
        field1855++;
        int var4 = arg1.method356(arg2, arg3 ^ arg3);
        int var5 = arg1.method351(5, arg0, var4);
        return class59.method532(124, arg1, var4, var5);
    }

    @OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1852++;
        if (class151.field3395 != null) {
            class45.field1079 = -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1844++;
        if (class151.field3395 == null) {
            return;
        }
        class103.field2360 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class99.field2292.length) {
            var3 = class99.field2292[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class45.field1079 >= 0 && var3 >= 0) {
            class9.field215[class45.field1079] = var3;
            class45.field1079 = class45.field1079 + 1 & 0x7F;
            if (class83.field1988 == class45.field1079) {
                class45.field1079 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class4.field63 + 1 & 0x7F;
            if (class110.field2559 != var4) {
                class65.field1483[class4.field63] = var3;
                class44.field1058[class4.field63] = -1;
                class4.field63 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1842[var1] = var0 - 1;
            var0 += var0;
        }
        field1860 = 0;
        field1861 = new class17[4];
        field1859 = null;
    }
}
