import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lv;")
    private static class146 field2547 = class159.method1226((byte) -37, "shake:");

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Lv;")
    public static class146 field2560 = field2547;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lv;")
    public static class146 field2549 = class159.method1226((byte) -37, "Standort");

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lv;")
    public static class146 field2548 = field2547;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lv;")
    public static class146 field2557 = class159.method1226((byte) -37, "::fpsoff");

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "[I")
    public static int[] field2551 = new int[32];

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lv;")
    private static class146 field2554 = class159.method1226((byte) -37, "To create a new account you need to");

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lv;")
    public static class146 field2559 = field2554;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lv;")
    private static class146 field2568 = class159.method1226((byte) -37, "green:");

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lv;")
    public static class146 field2550 = field2568;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "Lv;")
    public static class146 field2569 = field2568;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Lv;")
    public static class146 field2570 = class159.method1226((byte) -37, "<col=40ff00>");

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Lie;")
    public static class61 field2566;

    @OriginalMember(owner = "client!pc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2561++;
        if (class110.field2601 != null) {
            class110.field2604 = 0;
            class69.field1621 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
    public static final void method861(boolean arg0, int arg1) {
        field2556++;
        for (int var2 = 0; var2 < class91.field2171; var2++) {
            class38 var3 = class34.field735[class57.field1271[var2]];
            int var4 = (class57.field1271[var2] << 14) + 536870912;
            if (var3 != null && var3.method235(-119) && var3.field849.field1920 == arg0 && var3.field849.method607(arg1 - 433)) {
                int var5 = var3.field757 >> 7;
                int var6 = var3.field790 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field742 == 1 && (var3.field757 & 0x7F) == 64 && (var3.field790 & 0x7F) == 64) {
                        if (class38.field845[var5][var6] == class25.field431) {
                            continue;
                        }
                        class38.field845[var5][var6] = class25.field431;
                    }
                    if (!var3.field849.field1911) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class66.field1496.method1189(class148.field3428, var3.field757, var3.field790, class79.method612(class148.field3428, var3.field757 + (var3.field742 - 1) * 64, (var3.field742 + -1) * 64 + var3.field790, false), (var3.field742 - 1) * 64 + 60, var3, var3.field763, var4, var3.field758);
                }
            }
        }
        if (arg1 != 383) {
            field2547 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class110.field2601 != null) {
            class110.field2604 = 0;
            class13.field221 = arg0.getX();
            class118.field2742 = arg0.getY();
        }
        field2558++;
    }

    @OriginalMember(owner = "client!pc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class110.field2601 != null) {
            class69.field1621 = 0;
        }
        field2553++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method862(int arg0) {
        int var1 = class92.field2208 * 128 + 64;
        field2564++;
        int var2 = class115.field2667 * 128 + 64;
        int var3 = class79.method612(class148.field3428, var1, var2, false) - class127.field2931;
        if (class143.field3266 < var2) {
            class143.field3266 += (var2 - class143.field3266) * class3.field84 / 1000 + class122.field2848;
            if (class143.field3266 > var2) {
                class143.field3266 = var2;
            }
        }
        if (class126.field2920 < var1) {
            class126.field2920 += (var1 - class126.field2920) * class3.field84 / 1000 + class122.field2848;
            if (var1 < class126.field2920) {
                class126.field2920 = var1;
            }
        }
        if (var2 < class143.field3266) {
            class143.field3266 -= class122.field2848 + (class143.field3266 - var2) * class3.field84 / 1000;
            if (class143.field3266 < var2) {
                class143.field3266 = var2;
            }
        }
        if (var3 > class116.field2698) {
            class116.field2698 += class122.field2848 + (var3 - class116.field2698) * class3.field84 / 1000;
            if (class116.field2698 > var3) {
                class116.field2698 = var3;
            }
        }
        if (var3 < class116.field2698) {
            class116.field2698 -= (class116.field2698 - var3) * class3.field84 / 1000 + class122.field2848;
            if (class116.field2698 < var3) {
                class116.field2698 = var3;
            }
        }
        if (var1 < class126.field2920) {
            class126.field2920 -= (class126.field2920 - var1) * class3.field84 / 1000 + class122.field2848;
            if (class126.field2920 < var1) {
                class126.field2920 = var1;
            }
        }
        int var4 = class148.field3458 * 128 + 64;
        int var5 = class140.field3211 * 128 + 64;
        int var6 = class79.method612(class148.field3428, var4, var5, false) - class120.field2793;
        int var7 = var5 - class143.field3266;
        int var8 = var6 - class116.field2698;
        int var9 = var4 - class126.field2920;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & arg0;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class89.field2109 < var11) {
            class89.field2109 += (var11 - class89.field2109) * class148.field3453 / 1000 + class123.field2857;
            if (class89.field2109 > var11) {
                class89.field2109 = var11;
            }
        }
        int var13 = var12 - class123.field2854;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class123.field2854 += class148.field3453 * var13 / 1000 + class123.field2857;
            class123.field2854 &= 0x7FF;
        }
        if (class89.field2109 > var11) {
            class89.field2109 -= (class89.field2109 - var11) * class148.field3453 / 1000 + class123.field2857;
            if (var11 > class89.field2109) {
                class89.field2109 = var11;
            }
        }
        if (var13 < 0) {
            class123.field2854 -= -var13 * class148.field3453 / 1000 + class123.field2857;
            class123.field2854 &= 0x7FF;
        }
        int var14 = var12 - class123.field2854;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class123.field2854 = var12;
        }
    }

    @OriginalMember(owner = "client!pc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2552++;
    }

    @OriginalMember(owner = "client!pc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2555++;
        if (class110.field2601 != null) {
            class110.field2604 = 0;
            class13.field221 = -1;
            class118.field2742 = -1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2563++;
        if (class110.field2601 != null) {
            class110.field2604 = 0;
            class13.field221 = arg0.getX();
            class118.field2742 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!pc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2562++;
    }

    @OriginalMember(owner = "client!pc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class110.field2601 != null) {
            class110.field2604 = 0;
            class13.field221 = arg0.getX();
            class118.field2742 = arg0.getY();
        }
        field2567++;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method863(int arg0) {
        field2570 = null;
        field2569 = null;
        field2559 = null;
        field2557 = null;
        field2560 = null;
        field2568 = null;
        if (arg0 >= -122) {
            return;
        }
        field2548 = null;
        field2550 = null;
        field2547 = null;
        field2554 = null;
        field2566 = null;
        field2549 = null;
        field2551 = null;
    }

    @OriginalMember(owner = "client!pc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class110.field2601 != null) {
            class110.field2604 = 0;
            class51.field1160 = arg0.getX();
            class148.field3446 = arg0.getY();
            class28.field582 = class51.method345((byte) -1);
            if (arg0.isMetaDown()) {
                class137.field3115 = 2;
                class69.field1621 = 2;
            } else {
                class137.field3115 = 1;
                class69.field1621 = 1;
            }
        }
        field2571++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
