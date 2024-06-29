import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class117 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "[Luj;")
    public static class269[] field2182 = new class269[50];

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2189 = 0;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Loh;")
    public static class263 field2192 = class253.method1681(-119, "lila:");

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[I")
    public static int[] field2191 = new int[32768];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lue;")
    public static class86 field2187;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[I")
    public static int[] field2185;

    @OriginalMember(owner = "client!dh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field2188++;
        if (class236.field4122 != null) {
            class244.field4300 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class75.field1551.length > var2) {
                var3 = class75.field1551[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class95.field1868 >= 0 && var3 >= 0) {
                class114.field2136[class95.field1868] = ~var3;
                class95.field1868 = class95.field1868 + 1 & 0x7F;
                if (class95.field1868 == class73.field1518) {
                    class95.field1868 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!dh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class236.field4122 != null) {
            int var2 = class98.method673(-121, arg0);
            if (var2 >= 0) {
                int var3 = class194.field3453 + 1 & 0x7F;
                if (class29.field728 != var3) {
                    class181.field3296[class194.field3453] = -1;
                    class136.field2480[class194.field3453] = var2;
                    class194.field3453 = var3;
                }
            }
        }
        arg0.consume();
        field2186++;
    }

    @OriginalMember(owner = "client!dh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2184++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Lfg;")
    public static final class12 method763(int arg0, byte arg1) {
        field2181++;
        class12 var2 = (class12) class95.field1862.method828(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class156.field2807.method596(-124, class243.method1649(arg0, (byte) 39), class134.method882(arg0, (byte) -111));
        class12 var4 = new class12();
        var4.field335 = arg0;
        if (var3 != null) {
            var4.method99(true, new class194(var3));
        }
        var4.method89(true);
        if (!class158.field2858 && var4.field290) {
            var4.field303 = null;
        }
        int var5 = -12 / ((arg1 + 66) / 37);
        if (var4.field325) {
            var4.field331 = 0;
            var4.field283 = false;
        }
        class95.field1862.method826((long) arg0, 9815, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class236.field4122 != null) {
            class95.field1868 = -1;
        }
        field2180++;
    }

    @OriginalMember(owner = "client!dh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2193++;
        if (class236.field4122 == null) {
            return;
        }
        class244.field4300 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class75.field1551.length) {
            var3 = class75.field1551[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class95.field1868 >= 0 && var3 >= 0) {
            class114.field2136[class95.field1868] = var3;
            class95.field1868 = class95.field1868 + 1 & 0x7F;
            if (class95.field1868 == class73.field1518) {
                class95.field1868 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class194.field3453 + 1 & 0x7F;
            if (class29.field728 != var4) {
                class181.field3296[class194.field3453] = var3;
                class136.field2480[class194.field3453] = -1;
                class194.field3453 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method764(int arg0) {
        field2192 = null;
        field2187 = null;
        field2185 = null;
        if (arg0 > -62) {
            field2192 = null;
        }
        field2191 = null;
        field2182 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILoh;)V")
    public static final void method765(int arg0, class263 arg1) {
        field2190++;
        if (class4.field82 >= 2) {
            if (arg1.method1766(-1, class265.field4634)) {
                class187.method1230((byte) 81);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class120.method774(0, class124.method797(arg0 - 65, new class263[] { class11.field261, class136.method891(-80, var4), class272.field4793 }), -11292, (class263) null);
            }
            if (arg1.method1766(arg0 - 5, class238.field4143)) {
                class108.method722(-1834571320);
            }
            if (arg1.method1766(-1, class218.field3873)) {
                class33.field806.method1042((byte) -25);
            }
            if (arg1.method1766(-1, class233.field4071)) {
                class33.field806.method1046(0);
            }
            if (arg1.method1766(-1, class159.field2890)) {
                class95.field1867.method1728(arg0 ^ 0x73);
                class166.field3023.method798(2061376624);
                class33.field806.method1044(101);
            }
            if (arg1.method1766(-1, class187.field3365)) {
                class254.field4420 = true;
            }
            if (arg1.method1766(-1, class131.field2402)) {
                class244.method1659(25, 26473);
            }
            if (arg1.method1766(-1, class146.field2663)) {
                class92.field1816 = true;
            }
            if (arg1.method1766(-1, class4.field75)) {
                class92.field1816 = false;
            }
            if (arg1.method1766(-1, class194.field3500)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class103.field1954[var5].field1527[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1754((byte) 56, class243.field4288) && class55.field1157 != 0) {
                class55.method353(arg0 ^ 0x79, arg1.method1787(6, false).method1769(arg0 ^ 0xE));
            }
            if (arg1.method1766(-1, class94.field1858) && class55.field1157 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1754((byte) -125, class119.field2218)) {
                class41.field925 = arg1.method1787(12, false).method1786((byte) 116).method1769(10);
                class120.method774(0, class124.method797(-128, new class263[] { class152.field2740, class136.method891(-59, class41.field925) }), -11292, (class263) null);
            }
            if (arg1.method1766(-1, class32.field786)) {
                class121.field2246 = true;
            }
        }
        class154.field2792.method1516(79, 103);
        class150.field2702++;
        if (arg0 != 4) {
            field2187 = null;
        }
        class154.field2792.method1288((byte) -92, arg1.method1740(-125) - 1);
        class154.field2792.method1312(-122, arg1.method1787(2, false));
    }
}
