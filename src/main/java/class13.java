import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Ll;")
    public static class22 field133 = class33.method229("Requesting", -79);

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Lg;")
    public static class13 field132 = new class13();

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "Ll;")
    public static class22 field137 = class33.method229("Skirt Shop", -46);

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "Ll;")
    public static class22 field138 = class33.method229("Pub)4Bar", -42);

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "Ll;")
    public static class22 field142 = class33.method229("Please wait)3)3)3 Rendering Map", -39);

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "Ll;")
    public static class22 field141 = class33.method229("Jewellery", -41);

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "Ll;")
    public static class22 field139 = class33.method229("Candle Shop", -115);

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "Ll;")
    public static class22 field143 = class33.method229("Scimitar Shop", -105);

    @OriginalMember(owner = "mapview!g", name = "n", descriptor = "Ll;")
    public static class22 field145 = class33.method229("Helmet Shop", -126);

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "mapview!g", name = "m", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field136;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "[Lba;")
    public static class4[] field135;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "[[[I")
    public static int[][][] field134;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(BLea;II)[Lba;", line = 6)
    public static final class4[] method66(byte arg0, class10 arg1, int arg2, int arg3) {
        if (arg0 <= 35) {
            return (class4[]) null;
        } else if (class34.method233(arg1, true, arg3, arg2)) {
            return class17.method98(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 23)
    public static void method67(int arg0) {
        field135 = null;
        field143 = null;
        field136 = null;
        field137 = null;
        field139 = null;
        field142 = null;
        field134 = null;
        field133 = null;
        field141 = null;
        field138 = null;
        if (arg0 != -1) {
            field140 = -107;
        }
        field132 = null;
        field145 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 63)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!g", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 71)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (field132 != null) {
            class29.field399 = -1;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 139)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!g", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 168)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field132 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class1.field8.length > var2) {
                var3 = class1.field8[var2];
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
                var4 = class35.method236(arg0, (byte) 109);
            }
            if (class29.field399 >= 0 && var3 >= 0) {
                class1.field1[class29.field399] = var3;
                class29.field399 = class29.field399 + 1 & 0x7F;
                if (class29.field399 == field140) {
                    class29.field399 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class17.field171 + 1 & 0x7F;
                if (class35.field472 != var5) {
                    class8.field67[class17.field171] = var3;
                    class16.field164[class17.field171] = var4;
                    class17.field171 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!g", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 237)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field132 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class1.field8.length > var2) {
                var3 = class1.field8[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class29.field399 >= 0 && var3 >= 0) {
                class1.field1[class29.field399] = ~var3;
                class29.field399 = class29.field399 + 1 & 0x7F;
                if (class29.field399 == field140) {
                    class29.field399 = -1;
                }
            }
        }
        arg0.consume();
    }
}
