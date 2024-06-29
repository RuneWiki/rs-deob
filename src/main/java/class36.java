import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "Lia;")
    public static class15 field496 = class28.method196("Crafting Shop", false);

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "Lia;")
    public static class15 field500 = class28.method196("map", false);

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "Lia;")
    public static class15 field501 = class28.method196("fonts", false);

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Lia;")
    public static class15 field497 = class28.method196("map", false);

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "Lia;")
    public static class15 field502 = class28.method196("Shield Shop", false);

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "Lia;")
    public static class15 field498 = class28.method196("Requesting", false);

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "[[[I")
    public static int[][][] field499;

    @OriginalMember(owner = "mapview!t", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 17)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class12.field105 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class31.field433.length > var2) {
            var3 = class31.field433[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class12.field102 >= 0 && var3 >= 0) {
            class13.field121[class12.field102] = var3;
            class12.field102 = class12.field102 + 1 & 0x7F;
            if (class26.field367 == class12.field102) {
                class12.field102 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class9.field73 + 1 & 0x7F;
            if (class17.field164 != var4) {
                class27.field391[class9.field73] = var3;
                class2.field23[class9.field73] = -1;
                class9.field73 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)V", line = 83)
    public static final void method242(int arg0) {
        class39 var1 = class27.field384;
        synchronized (class27.field384) {
            class27.field387 = class5.field45;
            class1.field2 = class4.field33;
            if (arg0 != 11363) {
                field497 = null;
            }
            class10.field85 = class15.field140;
            class17.field171 = class34.field480;
            class4.field41 = class18.field183;
            mapview.field278 = class21.field243;
            class34.field480 = 0;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)V", line = 110)
    public static void method243(byte arg0) {
        field501 = null;
        field502 = null;
        field500 = null;
        if (arg0 == -85) {
            field497 = null;
            field496 = null;
            field498 = null;
            field499 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 136)
    public final void keyTyped(KeyEvent arg0) {
        if (class12.field105 != null) {
            int var2 = class10.method54(arg0, 45);
            if (var2 >= 0) {
                int var3 = class9.field73 + 1 & 0x7F;
                if (class17.field164 != var3) {
                    class27.field391[class9.field73] = -1;
                    class2.field23[class9.field73] = var2;
                    class9.field73 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Lia;Lia;Loa;BLoa;)Lm;", line = 235)
    public static final class22 method244(class15 arg0, class15 arg1, class27 arg2, byte arg3, class27 arg4) {
        int var5 = arg2.method187(arg0, (byte) 104);
        int var6 = arg2.method191(var5, arg1, 1);
        if (arg3 != -16) {
            field496 = null;
        }
        return class18.method138(true, arg4, var6, arg2, var5);
    }

    @OriginalMember(owner = "mapview!t", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 256)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class12.field105 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class31.field433.length > var2) {
                var3 = class31.field433[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class12.field102 >= 0 && var3 >= 0) {
                class13.field121[class12.field102] = ~var3;
                class12.field102 = class12.field102 + 1 & 0x7F;
                if (class26.field367 == class12.field102) {
                    class12.field102 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!t", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 292)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class12.field105 != null) {
            class12.field102 = -1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 316)
    public final void focusGained(FocusEvent arg0) {
    }
}
