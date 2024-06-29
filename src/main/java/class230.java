import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class230 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field3169 = -1;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3170 = "Loaded config";

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "Ltq;")
    public static class250 field3172 = new class250(new byte[5000]);

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3173 = "";

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "[Z")
    public static boolean[] field3176 = new boolean[200];

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!nn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3165++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3168++;
        if ((class282.field3872[0][arg3][arg0] & 0x2) != 0) {
            return true;
        } else if (arg4 >= -84) {
            return false;
        } else if ((class282.field3872[arg1][arg3][arg0] & 0x10) == 0) {
            return class423.method2633(arg1, (byte) -99, arg0, arg3) == arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nn", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3166++;
        if (class179.field2246 == null) {
            return;
        }
        class225.field3055 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class274.field3699.length > var2) {
            var3 = class274.field3699[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class128.field1659 >= 0 && var3 >= 0) {
            class420.field6137[class128.field1659] = var3;
            class128.field1659 = class128.field1659 + 1 & 0x7F;
            if (class23.field221 == class128.field1659) {
                class128.field1659 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class339.field4515 + 1 & 0x7F;
            if (class219.field2927 != var4) {
                class195.field2630[class339.field4515] = var3;
                class330.field4401[class339.field4515] = '\u0000';
                class339.field4515 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method1250(byte arg0) {
        if (arg0 != 100) {
            method1251((byte) 18, -119, -55, 126, -56, 112);
        }
        field3173 = null;
        field3172 = null;
        field3170 = null;
        field3176 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BIIIII)Z")
    public static final boolean method1251(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3163++;
        if (arg0 != 77) {
            method1252(83, (class322) null, -58, -109);
        }
        for (int var6 = arg3; var6 <= arg2; var6++) {
            for (int var7 = arg5; var7 <= arg4; var7++) {
                if (class203.field2722[var6][var7] == arg1 && class182.field2305[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nn", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3174++;
        if (class179.field2246 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class68.method385(91, var2)) {
                int var3 = class339.field4515 + 1 & 0x7F;
                if (class219.field2927 != var3) {
                    class195.field2630[class339.field4515] = -1;
                    class330.field4401[class339.field4515] = var2;
                    class339.field4515 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!nn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class179.field2246 != null) {
            class128.field1659 = -1;
        }
        field3171++;
    }

    @OriginalMember(owner = "client!nn", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class179.field2246 != null) {
            class225.field3055 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class274.field3699.length) {
                var3 = class274.field3699[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class128.field1659 >= 0 && var3 >= 0) {
                class420.field6137[class128.field1659] = ~var3;
                class128.field1659 = class128.field1659 + 1 & 0x7F;
                if (class23.field221 == class128.field1659) {
                    class128.field1659 = -1;
                }
            }
        }
        field3167++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILvm;II)V")
    public static final void method1252(int arg0, class322 arg1, int arg2, int arg3) {
        field3164++;
        class235.field3242 = arg1;
        class21.field197 = new class89[arg2][arg3];
        if (arg0 != -22602) {
            method1250((byte) -122);
        }
        if (class295.field4000 != null) {
            class75.field826 = class279.method1545(class295.field4000[3], class295.field4000[2], class295.field4000[4], class295.field4000[1], class295.field4000[5], false, class295.field4000[0]);
        }
        class129.field1665 = new class89();
        class106.method563(arg0 + 22478);
    }
}
