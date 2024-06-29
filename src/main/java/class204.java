import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class204 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3542 = 0;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
    public static boolean field3538 = false;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Lqe;")
    public static class168 field3548 = class66.method448(" <col=ffffff>", 38);

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
    public static int[] field3546 = new int[5];

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "B")
    public static byte field3557;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "J")
    public static long field3556;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lba;")
    public static class3 field3544;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[Luj;")
    public static class158[] field3541;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[[I")
    public static int[][] field3554;

    @OriginalMember(owner = "client!ph", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3552++;
        if (class62.field845 != null) {
            class123.field2026 = 0;
            class202.field3514 = -1;
            class249.field4306 = -1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field3554 = null;
        field3544 = null;
        field3548 = null;
        field3546 = null;
        field3541 = null;
        if (arg0 >= -16) {
            field3550 = 85;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
    public static final void method1326(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            method1327(-2, -49);
        }
        field3549++;
        if (arg2 <= arg3) {
            class232.method1501(arg4, arg2, (byte) -108, class241.field4117[arg1], arg3);
        } else {
            class232.method1501(arg4, arg3, (byte) -108, class241.field4117[arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!ph", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class62.field845 != null) {
            class145.field2535 = 0;
        }
        field3547++;
    }

    @OriginalMember(owner = "client!ph", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3536++;
    }

    @OriginalMember(owner = "client!ph", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class62.field845 != null) {
            class123.field2026 = 0;
            class202.field3514 = arg0.getX();
            class249.field4306 = arg0.getY();
        }
        field3545++;
    }

    @OriginalMember(owner = "client!ph", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3537++;
        if (class62.field845 != null) {
            class123.field2026 = 0;
            class254.field4394 = arg0.getX();
            class105.field1689 = arg0.getY();
            class66.field931 = class59.method407(-98);
            if (arg0.isMetaDown()) {
                class66.field932 = 2;
                class145.field2535 = 2;
            } else {
                class66.field932 = 1;
                class145.field2535 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public static final int method1327(int arg0, int arg1) {
        if (arg0 >= -120) {
            field3554 = null;
        }
        field3555++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static final void method1328(byte arg0) {
        field3540++;
        if (class9.field109 != null) {
            return;
        }
        if (arg0 >= -34) {
            method1327(-121, -22);
        }
        if (class240.field4106 != null) {
            return;
        }
        int var1 = class200.field3454;
        if (class169.field2956) {
            if (var1 != 1) {
                int var2 = class146.field2550;
                int var3 = class161.field2765;
                if (class150.field2620 - 10 > var2 || var2 > class150.field2620 + class139.field2462 + 10 || class36.field443 - 10 > var3 || class16.field144 + class36.field443 + 10 < var3) {
                    class169.field2956 = false;
                    class208.method1352(class150.field2620, -622332702, class36.field443, class139.field2462, class16.field144);
                }
            }
            if (var1 == 1) {
                int var4 = class150.field2620;
                int var5 = class36.field443;
                int var6 = class139.field2462;
                int var7 = class198.field3422;
                int var8 = -1;
                int var9 = class9.field97;
                for (int var10 = 0; var10 < class109.field1748; var10++) {
                    int var11 = (class109.field1748 - var10 - 1) * 15 + var5 + 31;
                    if (var4 < var7 && var4 + var6 > var7 && var9 > var11 - 13 && var9 < var11 + 3) {
                        var8 = var10;
                    }
                }
                if (var8 != -1) {
                    class65.method444(-15, var8);
                }
                class169.field2956 = false;
                class208.method1352(class150.field2620, -622332702, class36.field443, class139.field2462, class16.field144);
                return;
            }
            return;
        }
        if (var1 == 1 && class109.field1748 > 0) {
            short var12 = class51.field701[class109.field1748 - 1];
            if (var12 == 42 || var12 == 18 || var12 == 50 || var12 == 45 || var12 == 43 || var12 == 24 || var12 == 28 || var12 == 1 || var12 == 39 || var12 == 19 || var12 == 46 || var12 == 1003) {
                int var13 = class228.field3876[class109.field1748 - 1];
                int var14 = class35.field436[class109.field1748 - 1];
                class129 var15 = class257.method1713(var14, 127);
                if (class123.method835(-1, client.method266(var15)) || class253.method1671(client.method266(var15), (byte) -60)) {
                    class92.field1456 = false;
                    class108.field1733 = 0;
                    if (class9.field109 != null) {
                        class65.method443(class9.field109, 0);
                    }
                    class9.field109 = class257.method1713(var14, 126);
                    class165.field2817 = class9.field97;
                    class111.field1778 = var13;
                    class185.field3271 = class198.field3422;
                    class65.method443(class9.field109, 0);
                    return;
                }
            }
        }
        if (var1 == 1 && (class242.field4135 == 1 && class109.field1748 > 2 || class142.method972(4096, class109.field1748 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class109.field1748 > 0) {
            class65.method444(119, class109.field1748 - 1);
        }
        if (var1 != 2 || class109.field1748 <= 0) {
            return;
        }
        class123.method840(11340);
    }

    @OriginalMember(owner = "client!ph", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class62.field845 != null) {
            class123.field2026 = 0;
            class202.field3514 = arg0.getX();
            class249.field4306 = arg0.getY();
        }
        field3551++;
    }

    @OriginalMember(owner = "client!ph", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class62.field845 != null) {
            class123.field2026 = 0;
            class145.field2535 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3553++;
    }

    @OriginalMember(owner = "client!ph", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3543++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ph", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3539++;
        if (class62.field845 != null) {
            class123.field2026 = 0;
            class202.field3514 = arg0.getX();
            class249.field4306 = arg0.getY();
        }
    }
}
