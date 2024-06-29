import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lod;")
    public static class101 field3481 = class46.method335(76, "<col=ffffff>");

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lcb;")
    public static class17 field3488 = new class17(64);

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lud;")
    public static class143 field3494 = new class143(512);

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lcb;")
    public static class17 field3496 = new class17(30);

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3498 = 0;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "Lod;")
    public static class101 field3497 = class46.method335(62, "Sprites geladen)3");

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Lod;")
    private static class101 field3503 = class46.method335(-105, "Loaded textures");

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[Lod;")
    public static class101[] field3500 = new class101[500];

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Lod;")
    public static class101 field3502 = field3503;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "Lsa;")
    public static class126 field3501;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lt;")
    public static class132 field3478;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
    public static boolean field3499;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[Lod;")
    public static class101[] field3485;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[Lrd;")
    public static class122[] field3495;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1185(int arg0) {
        field3488 = null;
        field3481 = null;
        field3500 = null;
        field3494 = null;
        field3503 = null;
        field3501 = null;
        field3485 = null;
        field3478 = null;
        field3502 = null;
        field3496 = null;
        if (arg0 == 5) {
            field3495 = null;
            field3497 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Lda;")
    public static final class23 method1186(boolean arg0, int arg1) {
        field3480++;
        class23 var2 = (class23) class106.field2291.method140(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field939.method114((byte) -84, 8, arg1);
        if (!arg0) {
            field3501 = null;
        }
        class23 var4 = new class23();
        if (var3 != null) {
            var4.method183(-16191, new class138(var3));
        }
        class106.field2291.method141(var4, (long) arg1, (byte) -128);
        return var4;
    }

    @OriginalMember(owner = "client!w", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3486++;
        if (class8.field122 != null) {
            class65.field1481 = 0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)Lod;")
    public static final class101 method1187(int arg0, int arg1, byte arg2) {
        field3479++;
        int var3 = arg1 - arg0;
        if (var3 < -9) {
            return class53.field1207;
        } else if (var3 < -6) {
            return class54.field1222;
        } else if (var3 < -3) {
            return class143.field3287;
        } else if (var3 < 0) {
            return class99.field2148;
        } else if (var3 > 9) {
            return class89.field1929;
        } else if (arg2 > -49) {
            return null;
        } else if (var3 > 6) {
            return class125.field2721;
        } else if (var3 > 3) {
            return class101.field2188;
        } else if (var3 > 0) {
            return class34.field860;
        } else {
            return class41.field998;
        }
    }

    @OriginalMember(owner = "client!w", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3492++;
    }

    @OriginalMember(owner = "client!w", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class8.field122 != null) {
            class90.field1956 = 0;
            class147.field3370 = arg0.getX();
            class83.field1816 = arg0.getY();
        }
        field3493++;
    }

    @OriginalMember(owner = "client!w", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3482++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!w", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class8.field122 != null) {
            class90.field1956 = 0;
            class65.field1481 = 0;
        }
        field3484++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!w", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3483++;
        if (class8.field122 != null) {
            class90.field1956 = 0;
            class147.field3370 = arg0.getX();
            class83.field1816 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!w", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class8.field122 != null) {
            class90.field1956 = 0;
            class147.field3370 = arg0.getX();
            class83.field1816 = arg0.getY();
        }
        field3491++;
    }

    @OriginalMember(owner = "client!w", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3490++;
        if (class8.field122 != null) {
            class90.field1956 = 0;
            class147.field3370 = -1;
            class83.field1816 = -1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILtf;Lod;)I")
    public static final int method1188(int arg0, class138 arg1, class101 arg2) {
        field3489++;
        if (arg0 >= -60) {
            method1188(-45, null, null);
        }
        int var3 = arg1.field3175;
        arg1.method1104((byte) -119, arg2.field2231);
        arg1.field3175 += class6.field95.method378(0, 24, arg2.field2223, arg1.field3175, arg1.field3213, arg2.field2231);
        return arg1.field3175 - var3;
    }

    @OriginalMember(owner = "client!w", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class8.field122 != null) {
            class90.field1956 = 0;
            class96.field2096 = arg0.getX();
            class43.field1037 = arg0.getY();
            class25.field630 = class10.method47(18889);
            if (arg0.isMetaDown()) {
                class94.field2029 = 2;
                class65.field1481 = 2;
            } else {
                class94.field2029 = 1;
                class65.field1481 = 1;
            }
        }
        field3487++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
