import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lv;")
    private static class146 field2359 = class159.method1226((byte) -37, "slide:");

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lv;")
    public static class146 field2363 = class159.method1226((byte) -37, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lv;")
    public static class146 field2365 = class159.method1226((byte) -37, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Lv;")
    public static class146 field2368 = field2359;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lv;")
    public static class146 field2367 = class159.method1226((byte) -37, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Lv;")
    public static class146 field2371 = field2359;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lv;")
    private static class146 field2364 = class159.method1226((byte) -37, " is already on your friend list");

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lv;")
    public static class146 field2378 = class159.method1226((byte) -37, "(Udns");

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lv;")
    public static class146 field2370 = field2364;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Lv;")
    private static class146 field2377 = class159.method1226((byte) -37, " from your ignore list first");

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lv;")
    public static class146 field2373 = field2377;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Lua;")
    public static class140 field2369 = new class140(64);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
    public static int[] field2381 = new int[50];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lla;")
    public static class77 field2361;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lla;")
    public static class77 field2380;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[S")
    public static short[] field2375;

    @OriginalMember(owner = "client!oa", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class6.field150 != null) {
            class87.field2074 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class12.field191.length > var2) {
                var3 = class12.field191[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class134.field3052 >= 0 && var3 >= 0) {
                class15.field240[class134.field3052] = ~var3;
                class134.field3052 = class134.field3052 + 1 & 0x7F;
                if (class97.field2347 == class134.field3052) {
                    class134.field3052 = -1;
                }
            }
        }
        field2379++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!oa", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        int var2 = class2.method11(arg0, 0);
        field2366++;
        if (var2 >= 0) {
            int var3 = client.field351 + 1 & 0x7F;
            if (class121.field2811 != var3) {
                class67.field1521[client.field351] = -1;
                class113.field2640[client.field351] = var2;
                client.field351 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!oa", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2360++;
        if (class6.field150 == null) {
            return;
        }
        class87.field2074 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class12.field191.length > var2) {
            var3 = class12.field191[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class134.field3052 >= 0 && var3 >= 0) {
            class15.field240[class134.field3052] = var3;
            class134.field3052 = class134.field3052 + 1 & 0x7F;
            if (class97.field2347 == class134.field3052) {
                class134.field3052 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = client.field351 + 1 & 0x7F;
            if (class121.field2811 != var4) {
                class67.field1521[client.field351] = var3;
                class113.field2640[client.field351] = -1;
                client.field351 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method801(int arg0) {
        field2362++;
        if (arg0 != -86) {
            return;
        }
        int var1 = class51.field1158;
        int var2 = class44.field1024;
        int var3 = class12.field192;
        int var4 = class17.field277;
        int var5 = 6116423;
        class56.method382(var1, var3, var2, var4, var5);
        class56.method382(var1 + 1, var3 + 1, var2 - 2, 16, 0);
        class56.method391(var1 + 1, var3 + 18, var2 - 2, var4 - 19, 0);
        class151.field3483.method827(class72.field1657, var1 + 3, var3 - -14, var5, -1);
        int var6 = class2.field45;
        int var7 = class151.field3491;
        for (int var8 = 0; var8 < class13.field208; var8++) {
            int var9 = var3 + (class13.field208 - var8 - 1) * 15 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var2 && var9 - 13 < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class151.field3483.method827(class41.method270(var8, -1), var1 + 3, var9, var10, 0);
        }
        class152.method1139(class51.field1158, -121, class17.field277, class44.field1024, class12.field192);
    }

    @OriginalMember(owner = "client!oa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class6.field150 != null) {
            class134.field3052 = -1;
        }
        field2374++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method802(byte arg0) {
        field2373 = null;
        field2363 = null;
        field2375 = null;
        field2380 = null;
        field2367 = null;
        field2359 = null;
        field2378 = null;
        field2369 = null;
        if (arg0 != 33) {
            method801(49);
        }
        field2361 = null;
        field2370 = null;
        field2368 = null;
        field2365 = null;
        field2377 = null;
        field2371 = null;
        field2381 = null;
        field2364 = null;
    }

    @OriginalMember(owner = "client!oa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2376++;
    }
}
