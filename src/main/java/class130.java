import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class130 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1896 = "wave2:";

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field1909 = 0;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1911 = "Drop";

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1910 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lde;")
    public static class109 field1907;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Z")
    public static boolean field1898;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    public static int[] field1908;

    @OriginalMember(owner = "client!lb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class103.field1597 != null) {
            class2.field16 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class76.field1077.length > var2) {
                var3 = class76.field1077[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class6.field101 >= 0 && var3 >= 0) {
                class149.field2205[class6.field101] = var3;
                class6.field101 = class6.field101 + 1 & 0x7F;
                if (class90.field1378 == class6.field101) {
                    class6.field101 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class86.field1362 + 1 & 0x7F;
                if (class204.field3195 != var4) {
                    class253.field4054[class86.field1362] = var3;
                    class182.field2885[class86.field1362] = '\u0000';
                    class86.field1362 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1895++;
    }

    @OriginalMember(owner = "client!lb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1906++;
        if (class103.field1597 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class228.method1562(var2, (byte) 120)) {
                int var3 = class86.field1362 + 1 & 0x7F;
                if (class204.field3195 != var3) {
                    class253.field4054[class86.field1362] = -1;
                    class182.field2885[class86.field1362] = var2;
                    class86.field1362 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method882(int arg0) {
        int var1 = 0;
        if (arg0 != 4462) {
            return;
        }
        while (var1 < class164.field2553) {
            int var2 = class84.field1316[var1];
            class186 var3 = class153.field2277[var2];
            int var4 = class235.field3766.method201(255);
            if ((var4 & 0x4) != 0) {
                var4 += class235.field3766.method201(255) << 8;
            }
            class65.method445(var4, var2, var3, (byte) -60);
            var1++;
        }
        field1901++;
    }

    @OriginalMember(owner = "client!lb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1900++;
        if (class103.field1597 != null) {
            class6.field101 = -1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class25.field340 * arg3 + class153.field2282 * arg0 >> 16;
        int var6 = class153.field2282 * arg3 - class25.field340 * arg0 >> 16;
        int var7 = class250.field4009 * arg1 + field1904 * var6 >> 16;
        int var8 = field1904 * arg1 - class250.field4009 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class250.field4009 * arg2 + field1904 * var6 >> 16;
        int var12 = field1904 * arg2 - class250.field4009 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class80.field1161 && var13 < class80.field1161) {
            return false;
        } else if (var9 > class181.field2873 && var13 > class181.field2873) {
            return false;
        } else if (var10 < class189.field2982 && var14 < class189.field2982) {
            return false;
        } else {
            return var10 <= class242.field3876 || var14 <= class242.field3876;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)I")
    public static final int method884(byte arg0, int arg1) {
        field1902++;
        if (arg0 != -7) {
            field1904 = -2;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!lb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1897++;
    }

    @OriginalMember(owner = "client!lb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1905++;
        if (class103.field1597 != null) {
            class2.field16 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class76.field1077.length > var2) {
                var3 = class76.field1077[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class6.field101 >= 0 && var3 >= 0) {
                class149.field2205[class6.field101] = ~var3;
                class6.field101 = class6.field101 + 1 & 0x7F;
                if (class90.field1378 == class6.field101) {
                    class6.field101 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method885(boolean arg0) {
        field1907 = null;
        field1911 = null;
        field1910 = null;
        field1896 = null;
        if (arg0) {
            method883(-8, -19, 106, 113, -41);
        }
        field1908 = null;
    }
}
