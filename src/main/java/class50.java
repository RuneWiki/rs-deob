import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lfc;")
    public static class39 field1261 = class90.method774("headicons_pk", -111);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lfc;")
    public static class39 field1270 = class90.method774("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -94);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lfc;")
    private static class39 field1262 = class90.method774("Service unavailable)3", -111);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lfc;")
    public static class39 field1256 = field1262;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lfc;")
    private static class39 field1260 = class90.method774("Use", -88);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field1275 = 0;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Lfc;")
    private static class39 field1274 = class90.method774("glow3:", -128);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lfc;")
    public static class39 field1253 = field1274;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lfc;")
    public static class39 field1267 = field1260;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lfc;")
    private static class39 field1265 = class90.method774("Loading friend list", -89);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lfc;")
    public static class39 field1257 = field1265;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "Lfc;")
    private static class39 field1276 = class90.method774("Please subscribe)1 or use a different world)3", -119);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
    public static int[] field1264 = new int[50];

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lfc;")
    public static class39 field1269 = field1276;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "Z")
    public static boolean field1282 = false;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "Lfc;")
    public static class39 field1281 = field1274;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lp;")
    public static class104 field1259 = new class104(100);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Loc;")
    public static class100 field1252;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lma;")
    public static class84 field1255;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[Lb;")
    public static class8[] field1263;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBI)I", line = 46)
    public static final int method549(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg2 < 64) {
            field1264 = null;
        }
        field1272++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loc;ILoc;)V", line = 74)
    public static final void method550(class100 arg0, int arg1, class100 arg2) {
        field1252 = arg2;
        class16.field471 = arg0;
        field1250++;
        if (arg1 == -86) {
            class18.field514 = class16.field471.method849((byte) -79, 3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 108)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1254++;
        if (class13.field331 != null) {
            class60.field1469 = -1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z", line = 133)
    public static final boolean method551(int arg0, int arg1) {
        int var2 = -53 / ((arg1 - 77) / 43);
        field1278++;
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 154)
    public final void focusGained(FocusEvent arg0) {
        field1277++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 162)
    public static void method552(int arg0) {
        field1259 = null;
        field1269 = null;
        field1257 = null;
        field1262 = null;
        field1270 = null;
        field1267 = null;
        field1253 = null;
        field1256 = null;
        field1265 = null;
        field1261 = null;
        field1281 = null;
        field1252 = null;
        field1263 = null;
        field1255 = null;
        field1264 = null;
        field1260 = null;
        field1276 = null;
        field1274 = null;
        if (arg0 != 84) {
            field1282 = false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 207)
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class13.field331 != null) {
            class43.field1184 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class86.field1946.length) {
                var3 = class86.field1946[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class60.field1469 >= 0 && var3 >= 0) {
                class56.field1405[class60.field1469] = ~var3;
                class60.field1469 = class60.field1469 + 1 & 0x7F;
                if (class60.field1469 == class127.field3231) {
                    class60.field1469 = -1;
                }
            }
        }
        field1251++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!ha", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 279)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class13.field331 != null) {
            class43.field1184 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class86.field1946.length) {
                var3 = class86.field1946[var2];
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
                var4 = class2.method16((byte) 110, arg0);
            }
            if (class60.field1469 >= 0 && var3 >= 0) {
                class56.field1405[class60.field1469] = var3;
                class60.field1469 = class60.field1469 + 1 & 0x7F;
                if (class60.field1469 == class127.field3231) {
                    class60.field1469 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class12.field320 + 1 & 0x7F;
                if (class29.field822 != var5) {
                    class72.field1688[class12.field320] = var3;
                    class131.field3313[class12.field320] = var4;
                    class12.field320 = var5;
                }
            }
        }
        arg0.consume();
        field1273++;
    }

    @OriginalMember(owner = "client!ha", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 342)
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field1268++;
    }
}
