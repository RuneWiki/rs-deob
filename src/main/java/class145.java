import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class145 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lid;")
    public static class60 field3261 = class11.method72("Der Anmelde)2Server ist offline)3", (byte) 118);

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field3271 = 0;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lid;")
    private static class60 field3265 = class11.method72("No reply from loginserver)3", (byte) 110);

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lid;")
    public static class60 field3266 = field3265;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field3273 = 0;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lta;")
    public static class133 field3268 = new class133();

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lid;")
    public static class60 field3274 = class11.method72("<col=ffffff>", (byte) -58);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lie;")
    public static class61 field3269;

    @OriginalMember(owner = "client!uf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3272++;
    }

    @OriginalMember(owner = "client!uf", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field3260++;
        if (class133.field3041 != null) {
            class63.field1574 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class93.field2298.length) {
                var3 = class93.field2298[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class52.field1315 >= 0 && var3 >= 0) {
                class154.field3500[class52.field1315] = ~var3;
                class52.field1315 = class52.field1315 + 1 & 0x7F;
                if (class52.field1315 == class22.field545) {
                    class52.field1315 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!uf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3262++;
        if (class133.field3041 != null) {
            class52.field1315 = -1;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field3268 = null;
        field3269 = null;
        field3265 = null;
        field3266 = null;
        field3274 = null;
        int var1 = 53 % ((arg0 - 28) / 42);
        field3261 = null;
    }

    @OriginalMember(owner = "client!uf", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3264++;
        int var2 = class140.method1095(arg0, -84);
        if (var2 >= 0) {
            int var3 = class146.field3282 + 1 & 0x7F;
            if (class1.field34 != var3) {
                class51.field1297[class146.field3282] = -1;
                class135.field3066[class146.field3282] = var2;
                class146.field3282 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)V")
    public static final void method1113(byte arg0, int arg1) {
        field3267++;
        class23 var2 = (class23) class16.field404.method716((byte) 115, (long) arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field574.length; var3++) {
            var2.field574[var3] = -1;
            var2.field566[var3] = 0;
        }
        if (arg0 != -101) {
            field3274 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3270++;
        if (class133.field3041 == null) {
            return;
        }
        class63.field1574 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class93.field2298.length) {
            var3 = class93.field2298[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class52.field1315 >= 0 && var3 >= 0) {
            class154.field3500[class52.field1315] = var3;
            class52.field1315 = class52.field1315 + 1 & 0x7F;
            if (class52.field1315 == class22.field545) {
                class52.field1315 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class146.field3282 + 1 & 0x7F;
            if (class1.field34 != var4) {
                class51.field1297[class146.field3282] = var3;
                class135.field3066[class146.field3282] = -1;
                class146.field3282 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
