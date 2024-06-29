import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class16 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lu;")
    public static class38 field151 = class9.method45(-41, "50(U");

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "Lu;")
    public static class38 field153 = class9.method45(-41, "download");

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "Lu;")
    public static class38 field152 = class9.method45(-41, "Spice Shop");

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "Lu;")
    public static class38 field147 = class9.method45(-41, "Pub)4Bar");

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "Lu;")
    public static class38 field150 = class9.method45(-41, "Bank");

    @OriginalMember(owner = "mapview!ha", name = "i", descriptor = "Lu;")
    public static class38 field155 = class9.method45(-41, "(U");

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "mapview!ha", name = "j", descriptor = "[I")
    public static int[] field156;

    @OriginalMember(owner = "mapview!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 10)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class13.field126 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class14.field138.length > var2) {
            var3 = class14.field138[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class23.field212 >= 0 && var3 >= 0) {
            class35.field443[class23.field212] = var3;
            class23.field212 = class23.field212 + 1 & 0x7F;
            if (class23.field212 == field149) {
                class23.field212 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class9.field80 + 1 & 0x7F;
            if (class25.field221 != var4) {
                class9.field72[class9.field80] = var3;
                class33.field435[class9.field80] = -1;
                class9.field80 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 77)
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class13.method70(arg0, 32);
        if (var2 >= 0) {
            int var3 = class9.field80 + 1 & 0x7F;
            if (class25.field221 != var3) {
                class9.field72[class9.field80] = -1;
                class33.field435[class9.field80] = var2;
                class9.field80 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)V", line = 135)
    public static void method86(int arg0) {
        field155 = null;
        field152 = null;
        field156 = null;
        field151 = null;
        if (arg0 < -91) {
            field153 = null;
            field150 = null;
            field147 = null;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 167)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class13.field126 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class14.field138.length) {
                var3 = class14.field138[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class23.field212 >= 0 && var3 >= 0) {
                class35.field443[class23.field212] = ~var3;
                class23.field212 = class23.field212 + 1 & 0x7F;
                if (class23.field212 == field149) {
                    class23.field212 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 225)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 251)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class13.field126 != null) {
            class23.field212 = -1;
        }
    }
}
