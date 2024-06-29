import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class125 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lsd;")
    public static class166 field2453 = class135.method935("Schlie-8en", 0);

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lsd;")
    private static class166 field2459 = class135.method935("wave:", 0);

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lsd;")
    public static class166 field2456 = class135.method935("VOLL", 0);

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lsd;")
    public static class166 field2458 = field2459;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field2452 = 0;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Lsd;")
    private static class166 field2466 = class135.method935("Login limit exceeded)3", 0);

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lsd;")
    public static class166 field2463 = field2466;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Lsd;")
    public static class166 field2465 = field2459;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lsd;")
    public static class166 field2461 = class135.method935("Willkommen auf RuneScape", 0);

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field2467 = -1;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
    public static boolean field2457 = false;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Lhb;")
    public static class66 field2464;

    @OriginalMember(owner = "client!nh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class4.field80 != null) {
            class177.field3346 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class147.field2905.length) {
                var3 = class147.field2905[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class62.field1284 >= 0 && var3 >= 0) {
                class151.field2936[class62.field1284] = ~var3;
                class62.field1284 = class62.field1284 + 1 & 0x7F;
                if (class62.field1284 == class138.field2692) {
                    class62.field1284 = -1;
                }
            }
        }
        field2450++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!nh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class4.field80 != null) {
            class177.field3346 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class147.field2905.length) {
                var3 = class147.field2905[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class62.field1284 >= 0 && var3 >= 0) {
                class151.field2936[class62.field1284] = var3;
                class62.field1284 = class62.field1284 + 1 & 0x7F;
                if (class62.field1284 == class138.field2692) {
                    class62.field1284 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class32.field596 + 1 & 0x7F;
                if (class60.field1238 != var4) {
                    class164.field3125[class32.field596] = var3;
                    class132.field2586[class32.field596] = -1;
                    class32.field596 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field2468++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lrf;")
    public static final class159 method892(int arg0) {
        if (class115.field2242 == null) {
            class115.field2242 = new class159();
        }
        field2454++;
        if (arg0 > -33) {
            field2464 = null;
        }
        return class115.field2242;
    }

    @OriginalMember(owner = "client!nh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class4.field80 != null) {
            int var2 = class8.method55(127, arg0);
            if (var2 >= 0) {
                int var3 = class32.field596 + 1 & 0x7F;
                if (class60.field1238 != var3) {
                    class164.field3125[class32.field596] = -1;
                    class132.field2586[class32.field596] = var2;
                    class32.field596 = var3;
                }
            }
        }
        field2469++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public static void method893(int arg0) {
        field2459 = null;
        field2464 = null;
        field2465 = null;
        int var1 = 61 % ((arg0 + 3) / 56);
        field2461 = null;
        field2453 = null;
        field2463 = null;
        field2466 = null;
        field2456 = null;
        field2458 = null;
    }

    @OriginalMember(owner = "client!nh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2451++;
    }

    @OriginalMember(owner = "client!nh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class4.field80 != null) {
            class62.field1284 = -1;
        }
        field2448++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)V")
    public static final void method894(int arg0, byte[] arg1) {
        field2462++;
        class53 var2 = new class53(arg1);
        var2.field1000 = arg1.length - 2;
        class108.field2097 = var2.method405(2);
        class137.field2669 = new byte[class108.field2097][];
        class161.field3083 = new int[class108.field2097];
        class41.field723 = new int[class108.field2097];
        class82.field1664 = new int[class108.field2097];
        class47.field884 = new int[class108.field2097];
        var2.field1000 = arg1.length - class108.field2097 * 8 - 7;
        class63.field1315 = var2.method405(2);
        class98.field1870 = var2.method405(arg0 ^ 0xFFFFFFFD);
        int var3 = (var2.method400(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class108.field2097; var4++) {
            class47.field884[var4] = var2.method405(2);
        }
        for (int var5 = 0; var5 < class108.field2097; var5++) {
            class82.field1664[var5] = var2.method405(2);
        }
        for (int var6 = 0; var6 < class108.field2097; var6++) {
            class41.field723[var6] = var2.method405(2);
        }
        for (int var7 = 0; var7 < class108.field2097; var7++) {
            class161.field3083[var7] = var2.method405(arg0 + 3);
        }
        if (arg0 != -1) {
            field2467 = 63;
        }
        var2.field1000 = arg1.length + 3 - class108.field2097 * 8 - var3 * 3 - 7;
        class9.field176 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class9.field176[var8] = var2.method422((byte) -84);
            if (class9.field176[var8] == 0) {
                class9.field176[var8] = 1;
            }
        }
        var2.field1000 = 0;
        for (int var9 = 0; var9 < class108.field2097; var9++) {
            int var10 = class41.field723[var9];
            int var11 = class161.field3083[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class137.field2669[var9] = var13;
            int var14 = var2.method400(255);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method388(arg0 - 29380);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method388(-29381);
                    }
                }
            }
        }
    }
}
