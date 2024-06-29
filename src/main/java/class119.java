import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class119 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lrd;")
    private static class117 field2920 = class95.method812("Existing user", (byte) 8);

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lrd;")
    public static class117 field2925 = class95.method812(" loggt sich ein)3", (byte) 8);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    public static int[] field2919 = new int[100];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field2922 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lrd;")
    public static class117 field2918 = field2920;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lmb;")
    public static class85 field2924 = new class85(260);

    @OriginalMember(owner = "client!s", name = "r", descriptor = "Lrd;")
    private static class117 field2933 = class95.method812("Off", (byte) 8);

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lrd;")
    public static class117 field2932 = field2933;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lra;")
    public static class114 field2917;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lm;")
    public static class83 field2923;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[Lra;")
    public static class114[] field2929;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method982(int arg0) {
        field2929 = null;
        field2925 = null;
        if (arg0 != 83) {
            field2933 = null;
        }
        field2918 = null;
        field2917 = null;
        field2919 = null;
        field2923 = null;
        field2924 = null;
        field2933 = null;
        field2932 = null;
        field2920 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILl;I)V")
    public static final void method983(int arg0, int arg1, class76 arg2, int arg3) {
        field2928++;
        int var4 = arg3 * arg3 + arg1 * arg1;
        if (arg0 != -1) {
            method984(13);
        }
        if (var4 <= 4225 || var4 >= 90000) {
            class135.method1099(arg2, arg3, (byte) 40, arg1);
            return;
        }
        int var5 = class132.field3172 + class99.field2459 & 0x7FF;
        int var6 = class129.field3135[var5];
        int var7 = var6 * 256 / (class14.field277 + 256);
        int var8 = class129.field3131[var5];
        int var9 = var8 * 256 / (class14.field277 + 256);
        int var10 = arg1 * var9 - arg3 * var7 >> 16;
        int var11 = arg1 * var7 + arg3 * var9 >> 16;
        double var12 = Math.atan2((double) var11, (double) var10);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class71.field1983.method719(var14 + 84 + 4, -var15 + 83 + -20, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!s", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class72.field2001 != null) {
            class36.field1060 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class99.field2455.length) {
                var3 = class99.field2455[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class49.field1430 >= 0 && var3 >= 0) {
                class41.field1172[class49.field1430] = ~var3;
                class49.field1430 = class49.field1430 + 1 & 0x7F;
                if (class49.field1430 == class16.field373) {
                    class49.field1430 = -1;
                }
            }
        }
        field2931++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static final void method984(int arg0) {
        field2930++;
        class85.field2209.method766(5);
        if (arg0 != -4226) {
            field2920 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2921++;
    }

    @OriginalMember(owner = "client!s", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2916++;
        if (class72.field2001 != null) {
            class49.field1430 = -1;
        }
    }

    @OriginalMember(owner = "client!s", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field2927++;
    }

    @OriginalMember(owner = "client!s", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class72.field2001 != null) {
            class36.field1060 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class99.field2455.length > var2) {
                var3 = class99.field2455[var2];
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
                var4 = class79.method742((byte) 126, arg0);
            }
            if (class49.field1430 >= 0 && var3 >= 0) {
                class41.field1172[class49.field1430] = var3;
                class49.field1430 = class49.field1430 + 1 & 0x7F;
                if (class49.field1430 == class16.field373) {
                    class49.field1430 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class39.field1136 + 1 & 0x7F;
                if (class117.field2870 != var5) {
                    class65.field1861[class39.field1136] = var3;
                    class143.field3403[class39.field1136] = var4;
                    class39.field1136 = var5;
                }
            }
        }
        arg0.consume();
        field2926++;
    }
}
