import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class263 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Z")
    public static boolean field4433 = false;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lmh;")
    public static class62 field4437 = class201.method1405(true, "<col=00ff80>");

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Lmh;")
    private static class62 field4441 = class201.method1405(true, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lmh;")
    public static class62 field4432 = field4441;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!tc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4440++;
        if (class81.field1345 != null) {
            class244.field4150 = 0;
            class19.field184 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 41)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4439++;
        if (class81.field1345 != null) {
            class244.field4150 = 0;
            class270.field4581 = -1;
            class16.field150 = -1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 58)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4435++;
        if (class81.field1345 != null) {
            class244.field4150 = 0;
            class270.field4581 = arg0.getX();
            class16.field150 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 83)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4425++;
        if (class81.field1345 != null) {
            class244.field4150 = 0;
            class270.field4581 = arg0.getX();
            class16.field150 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!tc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 106)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class81.field1345 != null) {
            class244.field4150 = 0;
            class84.field1377 = arg0.getX();
            class42.field638 = arg0.getY();
            class2.field27 = class293.method1985((byte) -71);
            if (arg0.isMetaDown()) {
                class77.field1274 = 2;
                class19.field184 = 2;
            } else {
                class77.field1274 = 1;
                class19.field184 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) != 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        field4426++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 162)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class81.field1345 != null) {
            class19.field184 = 0;
        }
        field4430++;
    }

    @OriginalMember(owner = "client!tc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 181)
    public final void mouseClicked(MouseEvent arg0) {
        field4427++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!tc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 197)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class81.field1345 != null) {
            class244.field4150 = 0;
            class270.field4581 = arg0.getX();
            class16.field150 = arg0.getY();
        }
        field4428++;
    }

    @OriginalMember(owner = "client!tc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 213)
    public final void focusGained(FocusEvent arg0) {
        field4436++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 223)
    public static void method1819(int arg0) {
        if (arg0 != -29962) {
            method1820(-43, 38, 79, -10, 27);
        }
        field4441 = null;
        field4437 = null;
        field4432 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V", line = 236)
    public static final void method1820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4438++;
        if (class287.field4904 < 100) {
            class164.method1182(-8863);
        }
        class311.method2118(arg4, arg3, arg1 + arg4, arg3 - -arg0);
        if (class287.field4904 < 100) {
            int var5 = arg1 / 2 + arg4;
            byte var6 = 20;
            int var7 = arg0 / 2 + arg3 - var6 - 18;
            class311.method2117(arg4, arg3, arg1, arg0, 0);
            class311.method2115(var5 - 152, var7, 304, 34, 9179409);
            class311.method2115(var5 - 151, var7 + 1, 302, 32, 0);
            class311.method2117(var5 - 150, var7 + 2, class287.field4904 * 3, 30, 9179409);
            class311.method2117(class287.field4904 * 3 + var5 - 150, var7 - -2, 300 - (class287.field4904 * 3), 30, 0);
            class296.field5047.method2018(class215.field3650, var5, var6 + var7, 16777215, -1);
            return;
        }
        class244.field4146 = class114.field1915 - ((int) ((float) arg1 / class187.field2990));
        class38.field597 = (int) ((float) (arg1 * 2) / class187.field2990);
        int var8 = class114.field1915 - ((int) ((float) arg1 / class187.field2990));
        int var9 = class114.field1915 + ((int) ((float) arg1 / class187.field2990));
        class131.field2130 = (int) ((float) (arg0 * 2) / class187.field2990);
        class149.field2353 = class282.field4813 - ((int) ((float) arg0 / class187.field2990));
        int var10 = class282.field4813 - (int) ((float) arg0 / class187.field2990);
        int var11 = (int) ((float) arg0 / class187.field2990) + class282.field4813;
        if (class148.field2333 == null || class148.field2333.field2207 != arg1 || class148.field2333.field2202 != arg0) {
            class148.field2333 = null;
            class148.field2333 = new class47(arg1, arg0);
        }
        class280.method1914(class148.field2333.field1363, arg1, arg0);
        class236.method1670(arg1, var10, var9, 0, arg0, 0, var11, (byte) -69, var8);
        class200.method1400(arg0, arg2, var11, var10, arg1, (byte) 100, var9, 0, var8);
        class19.method81(arg0, var11, (byte) 50, 0, var9, var10, 0, var8, arg1);
        class148.field2333.method304(arg4, arg3);
        if (class116.field1937 > 0) {
            class116.field1937--;
        }
        if (!class214.field3639) {
            return;
        }
        int var12 = arg4 + arg1 - 5;
        int var13 = arg0 + arg3 - 8;
        class20.field195.method2036(class254.method1772(new class62[] { class36.field488, class42.method284(class191.field3070, -120) }, arg2), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var17 = var13 - 15;
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class20.field195.method2036(class254.method1772(new class62[] { class39.field606, class42.method284(var16, arg2 ^ 0xFFFFFF8C), class150.field2367 }, 0), var12, var17, var15, -1);
        var13 = var17 - 15;
    }
}
