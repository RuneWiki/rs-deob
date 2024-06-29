import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class19 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Leg;")
    public static class37 field254 = class174.method1167("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", 58);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Leg;")
    private static class37 field261 = class174.method1167("Connecting to update server", 119);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Leg;")
    public static class37 field256 = field261;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "F")
    public static float field252;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Leg;")
    public static class37[] field255;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[[[B")
    public static byte[][][] field257;

    @OriginalMember(owner = "client!i", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class4.field71 != null) {
            int var2 = class44.method290((byte) -71, arg0);
            if (var2 >= 0) {
                int var3 = class282.field4996 + 1 & 0x7F;
                if (class247.field4439 != var3) {
                    class105.field1632[class282.field4996] = -1;
                    class78.field1210[class282.field4996] = var2;
                    class282.field4996 = var3;
                }
            }
        }
        arg0.consume();
        field258++;
    }

    @OriginalMember(owner = "client!i", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class4.field71 != null) {
            class36.field532 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class239.field4258.length) {
                var3 = class239.field4258[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class236.field4058 >= 0 && var3 >= 0) {
                class121.field2038[class236.field4058] = var3;
                class236.field4058 = class236.field4058 + 1 & 0x7F;
                if (class260.field4604 == class236.field4058) {
                    class236.field4058 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class282.field4996 + 1 & 0x7F;
                if (class247.field4439 != var4) {
                    class105.field1632[class282.field4996] = var3;
                    class78.field1210[class282.field4996] = -1;
                    class282.field4996 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field259++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method125(int arg0) {
        if (arg0 != -26164) {
            return;
        }
        field254 = null;
        field255 = null;
        field257 = null;
        field256 = null;
        field261 = null;
    }

    @OriginalMember(owner = "client!i", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field250++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/Object;Llb;B)V")
    public static final void method126(Object arg0, class207 arg1, byte arg2) {
        field251++;
        int var3 = 65 % ((arg2 + 70) / 40);
        if (arg1.field3509 == null) {
            return;
        }
        for (int var4 = 0; var4 < 50 && arg1.field3509.peekEvent() != null; var4++) {
            class144.method1008(84, 1L);
        }
        if (arg0 != null) {
            arg1.field3509.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!i", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field253++;
        if (class4.field71 != null) {
            class36.field532 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class239.field4258.length > var2) {
                var3 = class239.field4258[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class236.field4058 >= 0 && var3 >= 0) {
                class121.field2038[class236.field4058] = ~var3;
                class236.field4058 = class236.field4058 + 1 & 0x7F;
                if (class260.field4604 == class236.field4058) {
                    class236.field4058 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!i", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field260++;
        if (class4.field71 != null) {
            class236.field4058 = -1;
        }
    }
}
