import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class12 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "[[B")
    public static byte[][] field137 = new byte[1000][];

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "Lca;")
    public static class5 field135 = new class5();

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "I")
    public static int field141 = 0;

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "Lt;")
    public static class36 field140 = new class36();

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "Lta;")
    public static class37 field139;

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "[B")
    public static byte[] field143;

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "[I")
    public static int[] field138;

    @OriginalMember(owner = "mapview!g", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 26)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class21.field238 != null) {
            class14.field152 = -1;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 59)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class21.field238 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class31.field460.length > var2) {
            var3 = class31.field460[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class14.field152 >= 0 && var3 >= 0) {
            class10.field109[class14.field152] = var3;
            class14.field152 = class14.field152 + 1 & 0x7F;
            if (class6.field71 == class14.field152) {
                class14.field152 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field136 + 1 & 0x7F;
            if (class23.field258 != var4) {
                class2.field22[field136] = var3;
                class9.field95[field136] = -1;
                field136 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!g", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 115)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!g", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 138)
    public final void keyTyped(KeyEvent arg0) {
        if (class21.field238 != null) {
            int var2 = class31.method185(arg0, true);
            if (var2 >= 0) {
                int var3 = field136 + 1 & 0x7F;
                if (class23.field258 != var3) {
                    class2.field22[field136] = -1;
                    class9.field95[field136] = var2;
                    field136 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!g", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 185)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class21.field238 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class31.field460.length > var2) {
                var3 = class31.field460[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class14.field152 >= 0 && var3 >= 0) {
                class10.field109[class14.field152] = ~var3;
                class14.field152 = class14.field152 + 1 & 0x7F;
                if (class6.field71 == class14.field152) {
                    class14.field152 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 257)
    public static void method54(int arg0) {
        int var1 = -60 / ((arg0 + 64) / 39);
        field139 = null;
        field138 = null;
        field135 = null;
        field137 = null;
        field140 = null;
        field143 = null;
    }
}
