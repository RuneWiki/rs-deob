import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class31 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Ld;")
    public static class7 field453 = class37.method242("world", 1333943984);

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "I")
    public static int field455 = 0;

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "Ld;")
    public static class7 field457 = class37.method242("Food Shop", 1333943984);

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "Ld;")
    public static class7 field456 = class37.method242("37(U", 1333943984);

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "I")
    public static volatile int field454 = 0;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "Ld;")
    public static class7 field452 = class37.method242("_", 1333943984);

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "Ld;")
    public static class7 field458 = class37.method242("Gem Shop", 1333943984);

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "I")
    public static int field459 = -1;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "mapview!q", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 17)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class8.field94 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class1.field6.length > var2) {
                var3 = class1.field6[var2];
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
                var4 = class27.method192(arg0, (byte) 76);
            }
            if (class37.field506 >= 0 && var3 >= 0) {
                class29.field428[class37.field506] = var3;
                class37.field506 = class37.field506 + 1 & 0x7F;
                if (class37.field506 == class1.field2) {
                    class37.field506 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = field455 + 1 & 0x7F;
                if (class21.field212 != var5) {
                    class36.field498[field455] = var3;
                    class16.field171[field455] = var4;
                    field455 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(I)V", line = 86)
    public static final void method216(int arg0) {
        class32.field467 = null;
        int var1 = -23 % ((arg0 + 50) / 37);
        class25.field242 = null;
        class11.field117 = null;
        class4.field56 = null;
        class7.field81 = null;
        class14.field139 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 100)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(IIBII)V", line = 117)
    public static final void method217(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = arg1 >> 6;
        int var6 = arg3 >> 6;
        if (class2.field12[arg0][var6][var5] == null) {
            class2.field12[arg0][var6][var5] = new byte[4096];
        }
        if (arg4 == -1) {
            class2.field12[arg0][var6][var5][(class21.method148(63, arg3) << 6) + class21.method148(arg1, 63)] = arg2;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 135)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class8.field94 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class1.field6.length) {
                var3 = class1.field6[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class37.field506 >= 0 && var3 >= 0) {
                class29.field428[class37.field506] = ~var3;
                class37.field506 = class37.field506 + 1 & 0x7F;
                if (class37.field506 == class1.field2) {
                    class37.field506 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!q", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 180)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class8.field94 != null) {
            class37.field506 = -1;
        }
    }

    @OriginalMember(owner = "mapview!q", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 195)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 219)
    public static final void method218(byte arg0) {
        if (class5.field77.toLowerCase().indexOf("microsoft") == -1) {
            class1.field6[91] = 42;
            class1.field6[59] = 57;
            class1.field6[61] = 27;
            class1.field6[92] = 74;
            class1.field6[93] = 43;
            class1.field6[47] = 73;
            class1.field6[45] = 26;
            class1.field6[46] = 72;
            class1.field6[44] = 71;
            if (class5.field73 == null) {
                class1.field6[222] = 59;
                class1.field6[192] = 58;
            } else {
                class1.field6[192] = 28;
                class1.field6[222] = 58;
                class1.field6[520] = 59;
            }
        } else {
            class1.field6[192] = 58;
            class1.field6[222] = 59;
            class1.field6[188] = 71;
            class1.field6[186] = 57;
            class1.field6[223] = 28;
            class1.field6[220] = 74;
            class1.field6[187] = 27;
            class1.field6[191] = 73;
            class1.field6[189] = 26;
            class1.field6[219] = 42;
            class1.field6[221] = 43;
            class1.field6[190] = 72;
        }
        if (arg0 != -84) {
            method217(80, 125, (byte) 2, 21, 68);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Lba;Ld;Ld;Z)[Lla;", line = 275)
    public static final class23[] method219(class4 arg0, class7 arg1, class7 arg2, boolean arg3) {
        if (arg3) {
            return (class23[]) null;
        } else {
            int var4 = arg0.method27(false, arg1);
            int var5 = arg0.method25((byte) -30, var4, arg2);
            return class3.method24((byte) -61, arg0, var5, var4);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(I)V", line = 351)
    public static void method220(int arg0) {
        field458 = null;
        if (arg0 < 4) {
            field459 = -11;
        }
        field456 = null;
        field453 = null;
        field457 = null;
        field452 = null;
    }
}
