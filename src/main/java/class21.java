import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class21 implements KeyListener, FocusListener {

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "I")
    public static int field303 = 0;

    @OriginalMember(owner = "mapview!k", name = "d", descriptor = "[[B")
    public static byte[][] field306 = new byte[1000][];

    @OriginalMember(owner = "mapview!k", name = "e", descriptor = "Lh;")
    public static class15 field307 = class26.method190(true, "Mini)2Game");

    @OriginalMember(owner = "mapview!k", name = "h", descriptor = "Z")
    public static volatile boolean field310 = false;

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "Lh;")
    public static class15 field304 = class26.method190(true, "mapscene");

    @OriginalMember(owner = "mapview!k", name = "i", descriptor = "Lh;")
    public static class15 field311 = class26.method190(true, "Gem Shop");

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "mapview!k", name = "f", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "mapview!k", name = "g", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "mapview!k", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 17)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class26.field354 != null) {
            class31.field420 = -1;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 56)
    public final void focusGained(FocusEvent arg0) {
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(I)[Lg;", line = 67)
    public static final class13[] method162(int arg0) {
        class13[] var1 = new class13[class3.field106];
        for (int var2 = 0; var2 < class3.field106; var2++) {
            class13 var3 = var1[var2] = new class13();
            var3.field230 = class14.field234;
            var3.field233 = field309;
            var3.field229 = class25.field343[var2];
            var3.field232 = class2.field87[var2];
            var3.field226 = class16.field261[var2];
            var3.field227 = class29.field399[var2];
            var3.field228 = class16.field269;
            var3.field231 = class6.field130[var2];
        }
        if (arg0 > -66) {
            field307 = null;
        }
        class4.method58(120);
        return var1;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(IIZ[B)Lh;", line = 99)
    public static final class15 method163(int arg0, int arg1, boolean arg2, byte[] arg3) {
        class15 var4 = new class15();
        var4.field247 = new byte[arg1];
        if (arg2) {
            field307 = null;
        }
        var4.field250 = 0;
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field247[var4.field250++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!k", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 139)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class26.field354 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class14.field245.length) {
                var3 = class14.field245[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class31.field420 >= 0 && var3 >= 0) {
                class35.field443[class31.field420] = ~var3;
                class31.field420 = class31.field420 + 1 & 0x7F;
                if (class31.field420 == class15.field253) {
                    class31.field420 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(I)V", line = 187)
    public static void method164(int arg0) {
        field306 = null;
        field311 = null;
        field304 = null;
        field307 = null;
        if (arg0 <= 49) {
            field308 = -116;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 202)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Laa;ZII)[Ls;", line = 248)
    public static final class32[] method165(class2 arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return class31.method226(arg3, arg0, 0, arg2) ? class17.method145(73) : null;
        } else {
            return (class32[]) null;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 264)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class26.field354 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class14.field245.length > var2) {
                var3 = class14.field245[var2];
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
                var4 = mapview.method10(-125, arg0);
            }
            if (class31.field420 >= 0 && var3 >= 0) {
                class35.field443[class31.field420] = var3;
                class31.field420 = class31.field420 + 1 & 0x7F;
                if (class31.field420 == class15.field253) {
                    class31.field420 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class11.field181 + 1 & 0x7F;
                if (class6.field134 != var5) {
                    class28.field383[class11.field181] = var3;
                    class14.field239[class11.field181] = var4;
                    class11.field181 = var5;
                }
            }
        }
        arg0.consume();
    }
}
