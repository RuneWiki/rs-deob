import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class137 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lrf;")
    private static class163 field2820 = class53.method392(-91, "Loaded update list");

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Lrf;")
    public static class163 field2821 = field2820;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lrf;")
    public static class163 field2827 = class53.method392(104, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Lrf;")
    public static class163 field2825 = class53.method392(119, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Lrf;")
    private static class163 field2826 = class53.method392(-112, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Lrf;")
    public static class163 field2819 = field2826;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
    public static int[] field2832 = new int[128];

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILfa;I)Lrf;")
    public static final class163 method900(int arg0, class52 arg1, int arg2) {
        if (arg0 != -1) {
            method901(true);
        }
        field2831++;
        try {
            class163 var3 = new class163();
            var3.field3341 = arg1.method354((byte) 27);
            if (var3.field3341 > arg2) {
                var3.field3341 = arg2;
            }
            var3.field3320 = new byte[var3.field3341];
            arg1.field1033 += class122.field2578.method1136(arg1.field1054, 32, 0, arg1.field1033, var3.field3320, var3.field3341);
            return var3;
        } catch (Exception var4) {
            return class100.field2100;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static final void method901(boolean arg0) {
        if (class162.field3266 == null || class210.field4094 == null) {
            class210.field4094 = new int[256];
            class162.field3266 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class162.field3266[var1] = (int) (Math.sin(var2) * 4096.0D);
                class210.field4094[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field2830++;
        if (arg0) {
            method900(-115, null, 99);
        }
    }

    @OriginalMember(owner = "client!og", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2818++;
        if (class175.field3528 != null) {
            int var2 = class147.method961(-3, arg0);
            if (var2 >= 0) {
                int var3 = class129.field2685 + 1 & 0x7F;
                if (class31.field626 != var3) {
                    class199.field3940[class129.field2685] = -1;
                    field2832[class129.field2685] = var2;
                    class129.field2685 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static final void method902(int arg0) {
        if (arg0 != 256) {
            field2832 = null;
        }
        class99.field2084.method399(false);
        class197.field3905.method399(false);
        field2829++;
    }

    @OriginalMember(owner = "client!og", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2822++;
        if (class175.field3528 == null) {
            return;
        }
        class149.field3069 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class163.field3326.length > var2) {
            var3 = class163.field3326[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class3.field31 >= 0 && var3 >= 0) {
            class201.field3970[class3.field31] = var3;
            class3.field31 = class3.field31 + 1 & 0x7F;
            if (class82.field1647 == class3.field31) {
                class3.field31 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class129.field2685 + 1 & 0x7F;
            if (class31.field626 != var4) {
                class199.field3940[class129.field2685] = var3;
                field2832[class129.field2685] = -1;
                class129.field2685 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!og", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2824++;
    }

    @OriginalMember(owner = "client!og", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2828++;
        if (class175.field3528 != null) {
            class149.field3069 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class163.field3326.length) {
                var3 = class163.field3326[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class3.field31 >= 0 && var3 >= 0) {
                class201.field3970[class3.field31] = ~var3;
                class3.field31 = class3.field31 + 1 & 0x7F;
                if (class82.field1647 == class3.field31) {
                    class3.field31 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public static void method903(boolean arg0) {
        if (arg0) {
            method903(false);
        }
        field2820 = null;
        field2827 = null;
        field2819 = null;
        field2825 = null;
        field2826 = null;
        field2832 = null;
        field2821 = null;
    }

    @OriginalMember(owner = "client!og", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class175.field3528 != null) {
            class3.field31 = -1;
        }
        field2823++;
    }
}
