import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class39 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lrc;")
    private static class105 field899 = class43.method374("Malformed login packet)3", 0);

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lrc;")
    public static class105 field895 = class43.method374("weiss:", 0);

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lrc;")
    private static class105 field901 = class43.method374("Unable to find ", 0);

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field897 = -1;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Lrc;")
    public static class105 field906 = field899;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lrc;")
    private static class105 field902 = class43.method374("Add friend", 0);

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Lrc;")
    public static class105 field907 = field901;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lrc;")
    private static class105 field900 = class43.method374("Take", 0);

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lrc;")
    private static class105 field896 = class43.method374("flash2:", 0);

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lrc;")
    public static class105 field894 = field896;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lrc;")
    public static class105 field889 = field902;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "Lrc;")
    public static class105 field909 = field900;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[B")
    public static byte[] field910 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "[[I")
    public static int[][] field903;

    @OriginalMember(owner = "client!gb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 4)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class76.field1706 != null) {
            class14.field274 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class14.field279.length > var2) {
                var3 = class14.field279[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class10.field207 >= 0 && var3 >= 0) {
                class87.field1983[class10.field207] = ~var3;
                class10.field207 = class10.field207 + 1 & 0x7F;
                if (class65.field1468 == class10.field207) {
                    class10.field207 = -1;
                }
            }
        }
        field912++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!gb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 44)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field913++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIILpb;)Leb;", line = 53)
    public static final class27 method362(byte arg0, int arg1, int arg2, class92 arg3) {
        if (arg0 > -26) {
            field901 = null;
        }
        field898++;
        return class58.method466(arg1, arg2, (byte) 122, arg3) ? class10.method131(27043) : null;
    }

    @OriginalMember(owner = "client!gb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 124)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class76.field1706 != null) {
            class14.field274 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class14.field279.length > var2) {
                var3 = class14.field279[var2];
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
                var4 = class128.method1031(-39, arg0);
            }
            if (class10.field207 >= 0 && var3 >= 0) {
                class87.field1983[class10.field207] = var3;
                class10.field207 = class10.field207 + 1 & 0x7F;
                if (class65.field1468 == class10.field207) {
                    class10.field207 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class134.field3264 + 1 & 0x7F;
                if (class22.field536 != var5) {
                    class106.field2429[class134.field3264] = var3;
                    class112.field2641[class134.field3264] = var4;
                    class134.field3264 = var5;
                }
            }
        }
        arg0.consume();
        field911++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lpb;II)Lbd;", line = 182)
    public static final class11 method363(class92 arg0, int arg1, int arg2) {
        if (arg2 != -3498) {
            method364(80);
        }
        field890++;
        return class76.method643(arg1, 31645, arg0) ? class57.method458((byte) 75) : null;
    }

    @OriginalMember(owner = "client!gb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 228)
    public final void focusGained(FocusEvent arg0) {
        field905++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 249)
    public static void method364(int arg0) {
        field900 = null;
        field896 = null;
        field899 = null;
        field901 = null;
        if (arg0 != -25573) {
            field893 = 41;
        }
        field907 = null;
        field895 = null;
        field902 = null;
        field906 = null;
        field909 = null;
        field894 = null;
        field903 = null;
        field910 = null;
        field889 = null;
    }

    @OriginalMember(owner = "client!gb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 320)
    public final synchronized void focusLost(FocusEvent arg0) {
        field892++;
        if (class76.field1706 != null) {
            class10.field207 = -1;
        }
    }
}
