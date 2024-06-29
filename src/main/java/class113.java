import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class113 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field2709 = 0;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "Laf;")
    public static class7 field2715 = class48.method406(40, "Die Verbindung konnte");

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Laf;")
    public static class7 field2708 = class48.method406(40, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field2714 = 0;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Laf;")
    public static class7 field2718 = class48.method406(40, "Fertigkeit)2");

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Laf;")
    public static class7 field2716 = class48.method406(40, "60 Sekunden noch einmal)3)3)3");

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Lr;")
    public static class118 field2710;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[Lfd;")
    public static class40[] field2717;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
    public static void method889(boolean arg0) {
        field2708 = null;
        field2710 = null;
        field2717 = null;
        field2715 = null;
        field2718 = null;
        field2716 = null;
        if (arg0) {
            field2717 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method890(byte arg0) {
        if (arg0 != -97) {
            return;
        }
        class91.field2100.method1136(-27608);
        int var1 = class91.field2100.method1138(1, false);
        field2719++;
        if (var1 == 0) {
            return;
        }
        int var2 = class91.field2100.method1138(2, false);
        if (var2 == 0) {
            class21.field537[class98.field2325++] = 2047;
        } else if (var2 == 1) {
            int var3 = class91.field2100.method1138(3, false);
            class21.field531.method182(false, var3, (byte) -54);
            int var4 = class91.field2100.method1138(1, false);
            if (var4 == 1) {
                class21.field537[class98.field2325++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class91.field2100.method1138(3, false);
            class21.field531.method182(true, var5, (byte) 121);
            int var6 = class91.field2100.method1138(3, false);
            class21.field531.method182(true, var6, (byte) 113);
            int var7 = class91.field2100.method1138(1, false);
            if (var7 == 1) {
                class21.field537[class98.field2325++] = 2047;
            }
        } else if (var2 == 3) {
            class8.field186 = class91.field2100.method1138(2, false);
            int var8 = class91.field2100.method1138(1, false);
            if (var8 == 1) {
                class21.field537[class98.field2325++] = 2047;
            }
            int var9 = class91.field2100.method1138(7, false);
            int var10 = class91.field2100.method1138(7, false);
            int var11 = class91.field2100.method1138(1, false);
            class21.field531.method178(var9, (byte) -127, var10, var11 == 1);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method891(int arg0) {
        if (arg0 != -21888) {
            field2710 = null;
        }
        field2713++;
        if (class100.field2370.toLowerCase().indexOf("microsoft") != -1) {
            class121.field2851[192] = 58;
            class121.field2851[223] = 28;
            class121.field2851[189] = 26;
            class121.field2851[186] = 57;
            class121.field2851[222] = 59;
            class121.field2851[220] = 74;
            class121.field2851[221] = 43;
            class121.field2851[190] = 72;
            class121.field2851[187] = 27;
            class121.field2851[191] = 73;
            class121.field2851[219] = 42;
            class121.field2851[188] = 71;
            return;
        }
        class121.field2851[59] = 57;
        if (class100.field2368 == null) {
            class121.field2851[222] = 59;
            class121.field2851[192] = 58;
        } else {
            class121.field2851[192] = 28;
            class121.field2851[520] = 59;
            class121.field2851[222] = 58;
        }
        class121.field2851[47] = 73;
        class121.field2851[44] = 71;
        class121.field2851[91] = 42;
        class121.field2851[93] = 43;
        class121.field2851[46] = 72;
        class121.field2851[45] = 26;
        class121.field2851[61] = 27;
        class121.field2851[92] = 74;
    }

    @OriginalMember(owner = "client!qb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2711++;
    }

    @OriginalMember(owner = "client!qb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2706++;
        if (class82.field1882 != null) {
            class108.field2639 = -1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2720++;
        if (class82.field1882 == null) {
            return;
        }
        class137.field3280 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class121.field2851.length) {
            var3 = class121.field2851[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class108.field2639 >= 0 && var3 >= 0) {
            class119.field2822[class108.field2639] = var3;
            class108.field2639 = class108.field2639 + 1 & 0x7F;
            if (class120.field2835 == class108.field2639) {
                class108.field2639 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class143.field3395 + 1 & 0x7F;
            if (class64.field1415 != var4) {
                class55.field1332[class143.field3395] = var3;
                class22.field615[class143.field3395] = -1;
                class143.field3395 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
    public static final void method892(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 109) {
            return;
        }
        for (int var5 = 0; var5 < class83.field1951; var5++) {
            if (class86.field2002[var5] + class105.field2579[var5] > arg0 && class86.field2002[var5] < arg0 + arg3 && class96.field2294[var5] + class28.field730[var5] > arg2 && arg2 + arg4 > class96.field2294[var5]) {
                class2.field9[var5] = true;
            }
        }
        field2704++;
    }

    @OriginalMember(owner = "client!qb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class82.field1882 != null) {
            class137.field3280 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class121.field2851.length) {
                var3 = class121.field2851[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class108.field2639 >= 0 && var3 >= 0) {
                class119.field2822[class108.field2639] = ~var3;
                class108.field2639 = class108.field2639 + 1 & 0x7F;
                if (class120.field2835 == class108.field2639) {
                    class108.field2639 = -1;
                }
            }
        }
        arg0.consume();
        field2707++;
    }

    @OriginalMember(owner = "client!qb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2712++;
        int var2 = class55.method441(-1, arg0);
        if (var2 >= 0) {
            int var3 = class143.field3395 + 1 & 0x7F;
            if (class64.field1415 != var3) {
                class55.field1332[class143.field3395] = -1;
                class22.field615[class143.field3395] = var2;
                class143.field3395 = var3;
            }
        }
        arg0.consume();
    }
}
