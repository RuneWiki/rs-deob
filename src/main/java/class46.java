import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lv;")
    private static class122 field1179 = class55.method425(-49, "glow3:");

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Lv;")
    public static class122 field1184 = field1179;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljb;")
    public static class56 field1182 = new class56(30);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lv;")
    private static class122 field1191 = class55.method425(-128, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lv;")
    public static class122 field1195 = field1191;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lv;")
    private static class122 field1192 = class55.method425(-52, "Accept trade");

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lv;")
    public static class122 field1189 = field1192;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Lv;")
    private static class122 field1190 = class55.method425(-114, "Existing user");

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lv;")
    public static class122 field1193 = field1190;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Lkb;")
    public static class62 field1196;

    @OriginalMember(owner = "client!hd", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 38)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class16.field406 != null) {
            class70.field1830 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class4.field106.length) {
                var3 = class4.field106[var2];
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
                var4 = class113.method864(true, arg0);
            }
            if (client.field445 >= 0 && var3 >= 0) {
                class83.field2159[client.field445] = var3;
                client.field445 = client.field445 + 1 & 0x7F;
                if (client.field445 == class84.field2184) {
                    client.field445 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class50.field1264 + 1 & 0x7F;
                if (class34.field856 != var5) {
                    class54.field1394[class50.field1264] = var3;
                    class80.field2085[class50.field1264] = var4;
                    class50.field1264 = var5;
                }
            }
        }
        field1188++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!hd", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 95)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field1181++;
    }

    @OriginalMember(owner = "client!hd", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 120)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class16.field406 != null) {
            class70.field1830 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class4.field106.length) {
                var3 = class4.field106[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (client.field445 >= 0 && var3 >= 0) {
                class83.field2159[client.field445] = ~var3;
                client.field445 = client.field445 + 1 & 0x7F;
                if (client.field445 == class84.field2184) {
                    client.field445 = -1;
                }
            }
        }
        field1180++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 158)
    public static void method380(int arg0) {
        field1179 = null;
        if (arg0 != 127) {
            method380(122);
        }
        field1190 = null;
        field1189 = null;
        field1191 = null;
        field1196 = null;
        field1192 = null;
        field1184 = null;
        field1193 = null;
        field1195 = null;
        field1182 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 182)
    public static final void method381(int arg0) {
        for (int var1 = arg0; var1 < class108.field2671; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class7.field175[var1];
            }
            class55 var3 = class125.field3043[var2];
            if (var3 != null) {
                class22.method233(1, 92, var3);
            }
        }
        field1178++;
    }

    @OriginalMember(owner = "client!hd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 213)
    public final void focusGained(FocusEvent arg0) {
        field1183++;
    }

    @OriginalMember(owner = "client!hd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 222)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class16.field406 != null) {
            client.field445 = -1;
        }
        field1177++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V", line = 250)
    public static final void method382(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg2 << arg0) + arg1);
        field1185++;
        class82 var5 = (class82) class18.field440.method631(var3, -26644);
        if (var5 != null) {
            class28.field730.method576(var5, false);
        }
    }
}
