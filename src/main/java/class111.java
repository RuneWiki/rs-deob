import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lsc;")
    public static class128 field2493 = class129.method1017(false, "logo");

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lsc;")
    public static class128 field2498 = class129.method1017(false, "Cabbage");

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lsc;")
    public static class128 field2500 = class129.method1017(false, "blinken1:");

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[Lsc;")
    public static class128[] field2502 = new class128[200];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method853(int arg0) {
        class97.field2260 = arg0;
        field2504++;
        class124.field2802 = 0;
        class119.method909((byte) 7);
        class71.method541(51);
        class142.method1162((byte) -78);
        class104.method778((byte) -107);
        for (int var1 = 0; var1 < class97.field2260; var1++) {
            int var3 = class124.field2799[var1];
            if (class29.field554 != class106.field2421[var3].field1006) {
                class106.field2421[var3] = null;
            }
        }
        if (class128.field2942 != class158.field3626.field1924) {
            throw new RuntimeException("gpp1 pos:" + class158.field3626.field1924 + " psize:" + class128.field2942);
        }
        for (int var2 = 0; var2 < class134.field3151; var2++) {
            if (class106.field2421[class65.field1441[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class134.field3151);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
    public static final Class method854(String arg0, byte arg1) throws ClassNotFoundException {
        field2499++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 < 9) {
            field2502 = null;
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2494++;
        if (class141.field3302 != null) {
            class18.field332 = -1;
        }
    }

    @OriginalMember(owner = "client!q", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class124.method943(false, arg0);
        field2501++;
        if (var2 >= 0) {
            int var3 = class141.field3315 + 1 & 0x7F;
            if (class148.field3418 != var3) {
                class94.field2204[class141.field3315] = -1;
                class132.field3052[class141.field3315] = var2;
                class141.field3315 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!q", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2497++;
        if (class141.field3302 == null) {
            return;
        }
        class68.field1524 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class2.field22.length) {
            var3 = class2.field22[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class18.field332 >= 0 && var3 >= 0) {
            class102.field2336[class18.field332] = var3;
            class18.field332 = class18.field332 + 1 & 0x7F;
            if (class18.field332 == class105.field2376) {
                class18.field332 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class141.field3315 + 1 & 0x7F;
            if (class148.field3418 != var4) {
                class94.field2204[class141.field3315] = var3;
                class132.field3052[class141.field3315] = -1;
                class141.field3315 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V")
    public static final void method855(int arg0, int arg1, int arg2, int arg3) {
        field2491++;
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class55.field1229[arg0][arg1 + var4][arg2 + var7] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class55.field1229[arg0][arg1][arg2 + var5] = class55.field1229[arg0][arg1 - 1][arg2 + var5];
            }
        }
        if (~arg2 < arg3) {
            for (int var6 = 1; var6 < 8; var6++) {
                class55.field1229[arg0][arg1 + var6][arg2] = class55.field1229[arg0][arg1 + var6][arg2 - 1];
            }
        }
        if (arg1 > 0 && class55.field1229[arg0][arg1 - 1][arg2] != 0) {
            class55.field1229[arg0][arg1][arg2] = class55.field1229[arg0][arg1 - 1][arg2];
        } else if (arg2 > 0 && class55.field1229[arg0][arg1][arg2 - 1] != 0) {
            class55.field1229[arg0][arg1][arg2] = class55.field1229[arg0][arg1][arg2 - 1];
        } else if (arg1 > 0 && arg2 > 0 && class55.field1229[arg0][arg1 - 1][arg2 - 1] != 0) {
            class55.field1229[arg0][arg1][arg2] = class55.field1229[arg0][arg1 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!q", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2496++;
        if (class141.field3302 != null) {
            class68.field1524 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class2.field22.length > var2) {
                var3 = class2.field22[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class18.field332 >= 0 && var3 >= 0) {
                class102.field2336[class18.field332] = ~var3;
                class18.field332 = class18.field332 + 1 & 0x7F;
                if (class18.field332 == class105.field2376) {
                    class18.field332 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2505++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method856(boolean arg0) {
        field2493 = null;
        if (arg0) {
            method857(-60, (byte) -4);
        }
        field2500 = null;
        field2502 = null;
        field2498 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)Lsc;")
    public static final class128 method857(int arg0, byte arg1) {
        field2503++;
        int var2 = 101 / ((arg1 - 43) / 47);
        return class128.method1005(arg0, 10, false, -61);
    }
}
