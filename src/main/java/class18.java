import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Z")
    public static volatile boolean field194 = true;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Ld;")
    public static class7 field196 = class38.method251((byte) -96, "u_pass");

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "Ld;")
    public static class7 field198 = class38.method251((byte) -104, "Short)2cut");

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "J")
    public static long field197;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Ljava/io/DataInputStream;")
    public static DataInputStream field193;

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "[I")
    public static int[] field199;

    @OriginalMember(owner = "mapview!j", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 11)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class21.field236 != null) {
            class20.field228 = -1;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 39)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 75)
    public static void method127(int arg0) {
        field193 = null;
        field199 = null;
        int var1 = 54 % ((arg0 + 33) / 46);
        field198 = null;
        field196 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 100)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class21.field236 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class31.field443.length > var2) {
                var3 = class31.field443[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class20.field228 >= 0 && var3 >= 0) {
                class36.field478[class20.field228] = ~var3;
                class20.field228 = class20.field228 + 1 & 0x7F;
                if (class30.field439 == class20.field228) {
                    class20.field228 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!j", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 177)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!j", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 198)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class21.field236 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class31.field443.length) {
                var3 = class31.field443[var2];
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
                var4 = class17.method124(0, arg0);
            }
            if (class20.field228 >= 0 && var3 >= 0) {
                class36.field478[class20.field228] = var3;
                class20.field228 = class20.field228 + 1 & 0x7F;
                if (class30.field439 == class20.field228) {
                    class20.field228 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class8.field96 + 1 & 0x7F;
                if (class2.field7 != var5) {
                    class35.field473[class8.field96] = var3;
                    class11.field128[class8.field96] = var4;
                    class8.field96 = var5;
                }
            }
        }
        arg0.consume();
    }
}
