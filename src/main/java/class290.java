import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class290 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "Loa;")
    public static class99 field5068 = class221.method1463(2844, "www");

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Loa;")
    private static class99 field5080 = class221.method1463(2844, "May");

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Loa;")
    private static class99 field5070 = class221.method1463(2844, "Nov");

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Loa;")
    private static class99 field5078 = class221.method1463(2844, "Sep");

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Loa;")
    private static class99 field5091 = class221.method1463(2844, "Feb");

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Loa;")
    public static class99 field5087 = class221.method1463(2844, ")4");

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Loa;")
    private static class99 field5072 = class221.method1463(2844, "Dec");

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Loa;")
    private static class99 field5090 = class221.method1463(2844, "Jul");

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "[I")
    public static int[] field5093 = new int[25];

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "Loa;")
    private static class99 field5085 = class221.method1463(2844, "Apr");

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Loa;")
    private static class99 field5077 = class221.method1463(2844, "Jan");

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Loa;")
    private static class99 field5076 = class221.method1463(2844, "Jun");

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Loa;")
    public static class99 field5083 = class221.method1463(2844, "details");

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Loa;")
    private static class99 field5094 = class221.method1463(2844, "Aug");

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Loa;")
    private static class99 field5089 = class221.method1463(2844, "Oct");

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Loa;")
    private static class99 field5097 = class221.method1463(2844, "Mar");

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "[I")
    public static int[] field5073 = new int[100];

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[Loa;")
    public static class99[] field5074 = new class99[] { field5077, field5091, field5097, field5085, field5080, field5076, field5090, field5094, field5078, field5089, field5070, field5072 };

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lpi;")
    public static class139 field5071;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "[I")
    public static int[] field5082;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "[Lde;")
    public static class109[] field5095;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method1942(int arg0) {
        field5074 = null;
        field5076 = null;
        field5091 = null;
        field5072 = null;
        field5087 = null;
        field5090 = null;
        field5083 = null;
        field5089 = null;
        field5070 = null;
        field5080 = null;
        if (arg0 <= 98) {
            method1944(true);
        }
        field5077 = null;
        field5097 = null;
        field5071 = null;
        field5078 = null;
        field5095 = null;
        field5073 = null;
        field5085 = null;
        field5094 = null;
        field5093 = null;
        field5068 = null;
        field5082 = null;
    }

    @OriginalMember(owner = "client!ml", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class252.field4358 != null) {
            class37.field646 = -1;
        }
        field5096++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I")
    public static final int method1943(byte arg0, int arg1) {
        if (arg0 > -15) {
            method1944(false);
        }
        field5079++;
        return (arg1 & 0x3FBBB) >> 11;
    }

    @OriginalMember(owner = "client!ml", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field5075++;
        if (class252.field4358 == null) {
            return;
        }
        class152.field2670 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class73.field1217.length > var2) {
            var3 = class73.field1217[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class37.field646 >= 0 && var3 >= 0) {
            class169.field3013[class37.field646] = var3;
            class37.field646 = class37.field646 + 1 & 0x7F;
            if (class37.field646 == class217.field3773) {
                class37.field646 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class159.field2825 + 1 & 0x7F;
            if (class149.field2629 != var4) {
                class248.field4289[class159.field2825] = var3;
                class240.field4156[class159.field2825] = -1;
                class159.field2825 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ml", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field5069++;
        if (class252.field4358 != null) {
            int var2 = class228.method1495((byte) 123, arg0);
            if (var2 >= 0) {
                int var3 = class159.field2825 + 1 & 0x7F;
                if (class149.field2629 != var3) {
                    class248.field4289[class159.field2825] = -1;
                    class240.field4156[class159.field2825] = var2;
                    class159.field2825 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)Lde;")
    public static final class109 method1944(boolean arg0) {
        class109 var1 = new class109(class164.field2883, class88.field1520, field5082[0], class11.field94[0], class223.field3885[0], class193.field3395[0], class181.field3151[0], class173.field3062);
        if (!arg0) {
            method1943((byte) 43, 5);
        }
        class24.method181(!arg0);
        field5066++;
        return var1;
    }

    @OriginalMember(owner = "client!ml", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field5081++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLik;)Lnl;")
    public static final class95 method1945(byte arg0, class261 arg1) {
        if (arg0 != 127) {
            method1942(-3);
        }
        field5086++;
        return new class95(arg1.method1751(128), arg1.method1751(128), arg1.method1751(128), arg1.method1751(128), arg1.method1751(128), arg1.method1751(arg0 ^ 0xFF), arg1.method1751(128), arg1.method1751(128), arg1.method1747(false), arg1.method1693((byte) -124));
    }

    @OriginalMember(owner = "client!ml", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class252.field4358 != null) {
            class152.field2670 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class73.field1217.length) {
                var3 = class73.field1217[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class37.field646 >= 0 && var3 >= 0) {
                class169.field3013[class37.field646] = ~var3;
                class37.field646 = class37.field646 + 1 & 0x7F;
                if (class37.field646 == class217.field3773) {
                    class37.field646 = -1;
                }
            }
        }
        arg0.consume();
        field5092++;
    }
}
