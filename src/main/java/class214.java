import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class214 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[Z")
    public static boolean[] field3275 = new boolean[100];

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[[I")
    public static int[][] field3282 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[[B")
    public static byte[][] field3281 = new byte[1000][];

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Lub;")
    public static class92 field3288;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient;")
    public static client field3283;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3286;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[I")
    public static int[] field3290;

    @OriginalMember(owner = "client!ih", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3287++;
        if (class236.field3730 != null) {
            class53.field837 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class136.field2056.length) {
                var3 = class136.field2056[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class164.field2477 >= 0 && var3 >= 0) {
                class170.field2580[class164.field2477] = ~var3;
                class164.field2477 = class164.field2477 + 1 & 0x7F;
                if (class269.field4258 == class164.field2477) {
                    class164.field2477 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ih", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class236.field3730 != null) {
            class164.field2477 = -1;
        }
        field3274++;
    }

    @OriginalMember(owner = "client!ih", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class236.field3730 != null) {
            class53.field837 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class136.field2056.length) {
                var3 = class136.field2056[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class164.field2477 >= 0 && var3 >= 0) {
                class170.field2580[class164.field2477] = var3;
                class164.field2477 = class164.field2477 + 1 & 0x7F;
                if (class269.field4258 == class164.field2477) {
                    class164.field2477 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class296.field4690 + 1 & 0x7F;
                if (class130.field1927 != var4) {
                    class176.field2722[class296.field4690] = var3;
                    class277.field4399[class296.field4690] = '\u0000';
                    class296.field4690 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3289++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lub;I)I")
    public static final int method1477(class92 arg0, int arg1) {
        if (arg1 != 85) {
            field3288 = null;
        }
        field3277++;
        int var2 = 0;
        if (arg0.method697(62, class101.field1580)) {
            var2++;
        }
        if (arg0.method697(-111, class236.field3731)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public static void method1478(boolean arg0) {
        field3288 = null;
        field3290 = null;
        field3286 = null;
        field3275 = null;
        field3282 = null;
        field3283 = null;
        if (arg0) {
            field3281 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)Lp;")
    public static final class303 method1479(int arg0, int arg1) {
        field3279++;
        if (arg1 != 0) {
            method1478(false);
        }
        return (class303) class112.field1719.method2043((long) arg0, -1);
    }

    @OriginalMember(owner = "client!ih", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3280++;
    }

    @OriginalMember(owner = "client!ih", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class236.field3730 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class73.method573(var2, 128)) {
                int var3 = class296.field4690 + 1 & 0x7F;
                if (class130.field1927 != var3) {
                    class176.field2722[class296.field4690] = -1;
                    class277.field4399[class296.field4690] = var2;
                    class296.field4690 = var3;
                }
            }
        }
        field3285++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
    public static final void method1480(int arg0, int arg1) {
        field3276++;
        class281.field4433.method1166((byte) 23, arg0);
        class41.field683.method1166((byte) 23, arg0);
        if (arg1 >= -50) {
            method1481((byte) -48, -118, '\u0000', (StringBuffer) null);
        }
        class250.field4009.method1166((byte) 23, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BICLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1481(byte arg0, int arg1, char arg2, StringBuffer arg3) {
        int var4 = arg3.length();
        field3284++;
        arg3.setLength(arg1);
        int var5 = var4;
        if (arg0 > -52) {
            method1481((byte) -15, -34, 'm', (StringBuffer) null);
        }
        while (arg1 > var5) {
            arg3.setCharAt(var5, arg2);
            var5++;
        }
        return arg3;
    }
}
