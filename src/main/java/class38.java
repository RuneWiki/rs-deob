import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class38 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field711 = 0;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[Ltg;")
    public static class184[] field719 = new class184[500];

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Ltg;")
    public static class184 field723 = class135.method812(" )2> ", 3);

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Ltg;")
    private static class184 field722 = class135.method812("Select a world", 3);

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ltg;")
    public static class184 field713 = field722;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Ltg;")
    public static class184 field714 = class135.method812("Null", 3);

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Ltg;")
    public static class184 field718 = class135.method812(" loggt sich ein)3", 3);

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Ltg;")
    public static class184 field725 = class135.method812("Lade Schrifts-=tze )2 ", 3);

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field727 = 0;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Ltg;")
    private static class184 field728 = class135.method812("M", 3);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Ltg;")
    public static class184 field712 = field728;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Ltg;")
    public static class184 field731 = field728;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field716 = 0;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Ltg;")
    public static class184 field732 = class135.method812(" steht bereits auf Ihrer Freunde)2Liste(Q", 3);

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Ltg;")
    public static class184 field724 = class135.method812("Titelbild geladen)3", 3);

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!dh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class46.field866 != null) {
            field727 = -1;
        }
        field726++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method225(int arg0) {
        field731 = null;
        field725 = null;
        field723 = null;
        field724 = null;
        field719 = null;
        field713 = null;
        field712 = null;
        field728 = null;
        field718 = null;
        if (arg0 == -129) {
            field732 = null;
            field722 = null;
            field714 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class46.field866 != null) {
            class74.field1383 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class156.field2792.length > var2) {
                var3 = class156.field2792[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field727 >= 0 && var3 >= 0) {
                class122.field2195[field727] = ~var3;
                field727 = field727 + 1 & 0x7F;
                if (field727 == class129.field2345) {
                    field727 = -1;
                }
            }
        }
        field730++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!dh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class46.field866 != null) {
            int var2 = class108.method669(-257, arg0);
            if (var2 >= 0) {
                int var3 = class62.field1176 + 1 & 0x7F;
                if (class62.field1172 != var3) {
                    class116.field2102[class62.field1176] = -1;
                    class187.field3608[class62.field1176] = var2;
                    class62.field1176 = var3;
                }
            }
        }
        arg0.consume();
        field717++;
    }

    @OriginalMember(owner = "client!dh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field721++;
    }

    @OriginalMember(owner = "client!dh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field720++;
        if (class46.field866 == null) {
            return;
        }
        class74.field1383 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class156.field2792.length) {
            var3 = class156.field2792[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field727 >= 0 && var3 >= 0) {
            class122.field2195[field727] = var3;
            field727 = field727 + 1 & 0x7F;
            if (field727 == class129.field2345) {
                field727 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class62.field1176 + 1 & 0x7F;
            if (class62.field1172 != var4) {
                class116.field2102[class62.field1176] = var3;
                class187.field3608[class62.field1176] = -1;
                class62.field1176 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static final void method226(int arg0) {
        class21.field394.method111((byte) -63);
        field729++;
        int var1 = class21.field394.method115(1, 104);
        if (var1 == 0) {
            return;
        }
        int var2 = class21.field394.method115(2, 104);
        if (var2 == 0) {
            class103.field1881[class87.field1610++] = 2047;
        } else if (var2 == 1) {
            int var3 = class21.field394.method115(3, 104);
            class46.field872.method208(var3, false, false);
            int var4 = class21.field394.method115(1, 104);
            if (var4 == 1) {
                class103.field1881[class87.field1610++] = 2047;
            }
        } else {
            int var5 = -40 % ((arg0 - 80) / 42);
            if (var2 == 2) {
                int var6 = class21.field394.method115(3, 104);
                class46.field872.method208(var6, false, true);
                int var7 = class21.field394.method115(3, 104);
                class46.field872.method208(var7, false, true);
                int var8 = class21.field394.method115(1, 104);
                if (var8 == 1) {
                    class103.field1881[class87.field1610++] = 2047;
                }
            } else if (var2 == 3) {
                class47.field892 = class21.field394.method115(2, 104);
                int var9 = class21.field394.method115(1, 104);
                int var10 = class21.field394.method115(7, 104);
                int var11 = class21.field394.method115(7, 104);
                int var12 = class21.field394.method115(1, 104);
                if (var12 == 1) {
                    class103.field1881[class87.field1610++] = 2047;
                }
                class46.field872.method212(-9740, var11, var10, var9 == 1);
            }
        }
    }
}
