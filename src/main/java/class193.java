import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class193 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lcd;")
    public static class23 field3811 = class54.method414("Der Anmelde)2Server ist offline)3", -1);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lcd;")
    public static class23 field3809 = class54.method414("swe", -1);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "Lcd;")
    public static class23 field3817 = class54.method414("nav", -1);

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "Lcd;")
    public static class23 field3815 = class54.method414(":duelreq:", -1);

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Z")
    public static boolean field3810 = false;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[Z")
    public static boolean[] field3821 = new boolean[100];

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "B")
    public static byte field3814;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lgd;")
    public static class58 field3812;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZILcd;)V")
    public static final void method1249(boolean arg0, int arg1, class23 arg2) {
        field3819++;
        byte var3 = 4;
        if (arg1 != -17570) {
            method1250(102);
        }
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class14.field301.method283(arg2, 250);
        int var7 = class14.field301.method288(arg2, 250) * 13;
        class196.method1281(var5 - var3, -var3 + var4, var6 + var3 + var3, var7 - -var3 + var3, 0);
        class196.method1273(var5 - var3, var4 - var3, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        class14.field301.method281(arg2, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class109.method709((byte) -30, var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var3 + var7);
        if (!arg0) {
            class67.method493(0, var6, var4, var7, var5);
            return;
        }
        try {
            Graphics var8 = class27.field558.getGraphics();
            class151.field3012.method545(var8, (byte) 96, 0, 0);
        } catch (Exception var9) {
            class27.field558.repaint();
        }
    }

    @OriginalMember(owner = "client!ve", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3820++;
        if (class176.field3499 != null) {
            class66.field1560 = -1;
        }
    }

    @OriginalMember(owner = "client!ve", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class176.field3499 != null) {
            int var2 = class54.method419(arg0, (byte) -111);
            if (var2 >= 0) {
                int var3 = class101.field2154 + 1 & 0x7F;
                if (class63.field1451 != var3) {
                    class189.field3743[class101.field2154] = -1;
                    class108.field2308[class101.field2154] = var2;
                    class101.field2154 = var3;
                }
            }
        }
        field3813++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1250(int arg0) {
        if (arg0 <= 48) {
            field3817 = null;
        }
        field3817 = null;
        field3809 = null;
        field3821 = null;
        field3815 = null;
        field3812 = null;
        field3811 = null;
    }

    @OriginalMember(owner = "client!ve", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class176.field3499 != null) {
            class50.field1197 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class52.field1238.length > var2) {
                var3 = class52.field1238[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class66.field1560 >= 0 && var3 >= 0) {
                class129.field2677[class66.field1560] = ~var3;
                class66.field1560 = class66.field1560 + 1 & 0x7F;
                if (class66.field1560 == class111.field2356) {
                    class66.field1560 = -1;
                }
            }
        }
        field3807++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ve", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3816++;
    }

    @OriginalMember(owner = "client!ve", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3822++;
        if (class176.field3499 == null) {
            return;
        }
        class50.field1197 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class52.field1238.length > var2) {
            var3 = class52.field1238[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class66.field1560 >= 0 && var3 >= 0) {
            class129.field2677[class66.field1560] = var3;
            class66.field1560 = class66.field1560 + 1 & 0x7F;
            if (class66.field1560 == class111.field2356) {
                class66.field1560 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class101.field2154 + 1 & 0x7F;
            if (class63.field1451 != var4) {
                class189.field3743[class101.field2154] = var3;
                class108.field2308[class101.field2154] = -1;
                class101.field2154 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }
}
