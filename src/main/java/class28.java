import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class28 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "I")
    public static int field358 = 0;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Ln;")
    public static class26 field360 = class9.method82(255, "Mining Site");

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Ln;")
    public static class26 field364 = class9.method82(255, "Jewellery");

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Ln;")
    public static class26 field361 = class9.method82(255, "Quest Start");

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "I")
    public static volatile int field363 = -1;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[I")
    public static int[] field359 = new int[128];

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Ln;")
    public static class26 field365 = class9.method82(255, "Short)2cut");

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "[[B")
    public static byte[][] field366 = new byte[50][];

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "Ln;")
    public static class26 field370 = class9.method82(255, "Altar");

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "Laa;")
    public static class2 field369;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Ld;")
    public static class7 field362;

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "[I")
    public static int[] field367;

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "[I")
    public static int[] field368;

    @OriginalMember(owner = "mapview!o", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 28)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!o", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 70)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class35.field419 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class16.field245.length) {
                var3 = class16.field245[var2];
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
                var4 = class30.method212(-1, arg0);
            }
            if (class5.field125 >= 0 && var3 >= 0) {
                class11.field201[class5.field125] = var3;
                class5.field125 = class5.field125 + 1 & 0x7F;
                if (class5.field125 == class4.field118) {
                    class5.field125 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class14.field229 + 1 & 0x7F;
                if (class11.field204 != var5) {
                    class29.field375[class14.field229] = var3;
                    field359[class14.field229] = var4;
                    class14.field229 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 166)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class35.field419 != null) {
            class5.field125 = -1;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 197)
    public static void method203(int arg0) {
        field361 = null;
        field368 = null;
        field365 = null;
        field366 = null;
        field362 = null;
        field367 = null;
        if (arg0 < 37) {
            method203(9);
        }
        field360 = null;
        field364 = null;
        field370 = null;
        field369 = null;
        field359 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 218)
    public static final void method204(Component arg0, int arg1) {
        arg0.removeKeyListener(class35.field419);
        arg0.removeFocusListener(class35.field419);
        if (arg1 != -1) {
            method206(-62, 99, null, true);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 239)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!o", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 243)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class35.field419 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class16.field245.length > var2) {
                var3 = class16.field245[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class5.field125 >= 0 && var3 >= 0) {
                class11.field201[class5.field125] = ~var3;
                class5.field125 = class5.field125 + 1 & 0x7F;
                if (class5.field125 == class4.field118) {
                    class5.field125 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(I)I", line = 283)
    public static final int method205(int arg0) {
        if (arg0 >= -56) {
            method203(-19);
        }
        if (class36.field443 == null) {
            return 0;
        } else if (class36.field443.field187 == null) {
            return class6.field146[class36.field443.field186 & 0xFF];
        } else {
            return class6.field146[class36.field443.field187[class18.field262] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(II[Ln;Z)Ln;", line = 303)
    public static final class26 method206(int arg0, int arg1, class26[] arg2, boolean arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = mapview.field30;
            }
            var4 += arg2[arg0 + var5].field347;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        int var8 = 0;
        if (arg3) {
            method203(-54);
        }
        while (arg1 > var8) {
            class26 var9 = arg2[arg0 + var8];
            class37.method243(var9.field354, 0, var6, var7, var9.field347);
            var7 += var9.field347;
            var8++;
        }
        class26 var10 = new class26();
        var10.field347 = var4;
        var10.field354 = var6;
        return var10;
    }
}
