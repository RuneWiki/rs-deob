import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Ltd;")
    public static class136 field1160 = class145.method1172("W-=hlen Sie eine Option", 45);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Ltd;")
    public static class136 field1171 = class145.method1172("Lade Wordpack )2 ", 45);

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Ltd;")
    private static class136 field1175 = class145.method1172("Your profile will be transferred in:", 45);

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Ltd;")
    private static class136 field1167 = class145.method1172("Login", 45);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Ltd;")
    public static class136 field1164 = field1167;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "[I")
    public static int[] field1177 = new int[2000];

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Ltd;")
    public static class136 field1168 = field1175;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!hc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1173++;
        int var2 = class152.method1197(arg0, (byte) -80);
        if (var2 >= 0) {
            int var3 = class125.field2902 + 1 & 0x7F;
            if (class62.field1316 != var3) {
                client.field451[class125.field2902] = -1;
                class44.field1021[class125.field2902] = var2;
                class125.field2902 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!hc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1159++;
        if (class79.field1808 != null) {
            class74.field1682 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class37.field875.length) {
                var3 = class37.field875[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class78.field1798 >= 0 && var3 >= 0) {
                class75.field1700[class78.field1798] = ~var3;
                class78.field1798 = class78.field1798 + 1 & 0x7F;
                if (class78.field1798 == class7.field132) {
                    class78.field1798 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1161++;
        if (class79.field1808 != null) {
            class78.field1798 = -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1169++;
    }

    @OriginalMember(owner = "client!hc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1162++;
        if (class79.field1808 == null) {
            return;
        }
        class74.field1682 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class37.field875.length) {
            var3 = class37.field875[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class78.field1798 >= 0 && var3 >= 0) {
            class75.field1700[class78.field1798] = var3;
            class78.field1798 = class78.field1798 + 1 & 0x7F;
            if (class78.field1798 == class7.field132) {
                class78.field1798 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class125.field2902 + 1 & 0x7F;
            if (class62.field1316 != var4) {
                client.field451[class125.field2902] = var3;
                class44.field1021[class125.field2902] = -1;
                class125.field2902 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method424(int arg0, int arg1, int arg2, int arg3) {
        field1165++;
        int var4 = arg3 >> 14 & 0x7FFF;
        int var5 = class146.field3366.method759(class62.field1331, arg0, arg2, arg3);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 >> 6 & 0x3;
        if (arg1 > -43) {
            field1172 = -27;
        }
        int var7 = var5 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class128 var8 = class142.method1154(var4, 109);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field3076;
                var9 = var8.field3071;
            } else {
                var9 = var8.field3076;
                var10 = var8.field3071;
            }
            int var11 = var8.field3054;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class41.method345(var9, var10, var11, 0, class24.field555.field3581[0], 2, class24.field555.field3560[0], arg2, true, 0, arg0, false);
        } else {
            class41.method345(0, 0, 0, var6, class24.field555.field3581[0], 2, class24.field555.field3560[0], arg2, true, var7 + 1, arg0, false);
        }
        class4.field85 = 0;
        class139.field3254 = class146.field3379;
        class145.field3339 = 2;
        class18.field368 = class8.field142;
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1167 = null;
        field1164 = null;
        field1171 = null;
        field1177 = null;
        field1168 = null;
        if (arg0 >= -6) {
            field1172 = 94;
        }
        field1160 = null;
        field1175 = null;
    }
}
