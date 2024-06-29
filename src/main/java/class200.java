import java.awt.FontMetrics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class200 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3046;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "[Lud;")
    public static class2[] field3044;

    @OriginalMember(owner = "client!ij", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class284.field4244 != null) {
            class239.field3598 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class52.field845.length) {
                var3 = class52.field845[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class174.field2655 >= 0 && var3 >= 0) {
                class220.field3316[class174.field2655] = ~var3;
                class174.field2655 = class174.field2655 + 1 & 0x7F;
                if (class97.field1528 == class174.field2655) {
                    class174.field2655 = -1;
                }
            }
        }
        arg0.consume();
        field3043++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static final void method1254(byte arg0) {
        int var1 = 41 / ((arg0 + 45) / 36);
        field3033++;
        boolean var2 = false;
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < class218.field3278 - 1; var3++) {
                if (class84.field1339[var3] < 1000 && class84.field1339[var3 + 1] > 1000) {
                    var2 = false;
                    String var4 = class46.field754[var3];
                    class46.field754[var3] = class46.field754[var3 + 1];
                    class46.field754[var3 + 1] = var4;
                    String var5 = class199.field3021[var3];
                    class199.field3021[var3] = class199.field3021[var3 + 1];
                    class199.field3021[var3 + 1] = var5;
                    int var6 = class71.field1135[var3];
                    class71.field1135[var3] = class71.field1135[var3 + 1];
                    class71.field1135[var3 + 1] = var6;
                    int var7 = class58.field916[var3];
                    class58.field916[var3] = class58.field916[var3 + 1];
                    class58.field916[var3 + 1] = var7;
                    int var8 = client.field2371[var3];
                    client.field2371[var3] = client.field2371[var3 + 1];
                    client.field2371[var3 + 1] = var8;
                    short var9 = class84.field1339[var3];
                    class84.field1339[var3] = class84.field1339[var3 + 1];
                    class84.field1339[var3 + 1] = var9;
                    long var10 = class229.field3459[var3];
                    class229.field3459[var3] = class229.field3459[var3 + 1];
                    class229.field3459[var3 + 1] = var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method1255(long arg0, boolean arg1) {
        field3040++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1) {
                field3042 = -39;
            }
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class198.field3003[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ij", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class284.field4244 != null) {
            class174.field2655 = -1;
        }
        field3041++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZLrf;II)V")
    public static final void method1256(boolean arg0, class289 arg1, int arg2, int arg3) {
        field3037++;
        if (class276.field4158 != null || class218.field3275 || arg1 == null || class42.method278(-107, arg1) == null) {
            return;
        }
        class276.field4158 = arg1;
        class15.field183 = class42.method278(-122, arg1);
        class48.field773 = arg2;
        class188.field2878 = 0;
        class183.field2769 = arg3;
        class262.field3967 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3036++;
        if (class284.field4244 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class196.method1225(var2, -30394)) {
                int var3 = class39.field531 + 1 & 0x7F;
                if (class176.field2695 != var3) {
                    class52.field838[class39.field531] = -1;
                    class261.field3964[class39.field531] = var2;
                    class39.field531 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lsk;III)V")
    public static final void method1257(class114 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class197.field2997) {
            class270 var4 = class33.field487[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4063 != null && var4.field4063.field1684.method738()) {
                arg0.method736(var4.field4063.field1684, 128, 0, 0, true);
            }
        }
        if (arg3 < class197.field2997) {
            class270 var5 = class33.field487[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4063 != null && var5.field4063.field1684.method738()) {
                arg0.method736(var5.field4063.field1684, 0, 0, 128, true);
            }
        }
        if (arg2 < class197.field2997 && arg3 < class92.field1448) {
            class270 var6 = class33.field487[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4063 != null && var6.field4063.field1684.method738()) {
                arg0.method736(var6.field4063.field1684, 128, 0, 128, true);
            }
        }
        if (arg2 < class197.field2997 && arg3 > 0) {
            class270 var7 = class33.field487[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4063 != null && var7.field4063.field1684.method738()) {
                arg0.method736(var7.field4063.field1684, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public static final void method1258(int arg0, int arg1) {
        field3034++;
        int var2 = -19 / ((arg0 + 77) / 42);
        for (class82 var3 = class221.field3326.method1665(16); var3 != null; var3 = class221.field3326.method1659((byte) -118)) {
            if (((long) arg1) == (var3.field1321 >> 48 & 0xFFFFL)) {
                var3.method538(89);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3045++;
    }

    @OriginalMember(owner = "client!ij", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class284.field4244 != null) {
            class239.field3598 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class52.field845.length > var2) {
                var3 = class52.field845[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class174.field2655 >= 0 && var3 >= 0) {
                class220.field3316[class174.field2655] = var3;
                class174.field2655 = class174.field2655 + 1 & 0x7F;
                if (class97.field1528 == class174.field2655) {
                    class174.field2655 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class39.field531 + 1 & 0x7F;
                if (class176.field2695 != var4) {
                    class52.field838[class39.field531] = var3;
                    class261.field3964[class39.field531] = '\u0000';
                    class39.field531 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3039++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method1259(int arg0) {
        field3044 = null;
        if (arg0 != 0) {
            field3044 = null;
        }
        field3046 = null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1260(int arg0, int arg1) {
        String var2 = Integer.toString(arg0);
        field3035++;
        int var3 = var2.length() - 3;
        if (arg1 != 0) {
            return null;
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class129.field1926 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class116.field1764 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }
}
