import java.awt.Canvas;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class131 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2434 = 0;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Lr;")
    private static class66 field2435 = class93.method641(43, "Loading)3)3)3");

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field2438 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lr;")
    public static class66 field2436 = class93.method641(43, "sl_stars");

    @OriginalMember(owner = "client!od", name = "k", descriptor = "[J")
    public static long[] field2442 = new long[32];

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field2443 = -1;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lr;")
    public static class66 field2441 = field2435;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lcj;")
    public static class28 field2433;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2452;

    @OriginalMember(owner = "client!od", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2444++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public static final void method909(int arg0, int arg1) {
        field2447++;
        class131 var2 = class9.field95;
        synchronized (class9.field95) {
            class203.field3486 = arg0;
        }
        if (arg1 != 0) {
            field2452 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2440++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!od", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2432++;
        if (class9.field95 != null) {
            class203.field3486 = 0;
            class111.field2148 = -1;
            class156.field2774 = -1;
        }
    }

    @OriginalMember(owner = "client!od", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2446++;
        if (class9.field95 != null) {
            class203.field3486 = 0;
            class111.field2148 = arg0.getX();
            class156.field2774 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method910(int arg0) {
        field2433 = null;
        field2435 = null;
        field2441 = null;
        field2442 = null;
        field2452 = null;
        if (arg0 != -20033) {
            method910(37);
        }
        field2436 = null;
    }

    @OriginalMember(owner = "client!od", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2450++;
        if (class9.field95 != null) {
            client.field1640 = 0;
        }
    }

    @OriginalMember(owner = "client!od", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2448++;
        if (class9.field95 != null) {
            class203.field3486 = 0;
            class209.field3614 = arg0.getX();
            class234.field4092 = arg0.getY();
            class96.field1859 = class3.method13(17161);
            if (arg0.isMetaDown()) {
                class201.field3462 = 2;
                client.field1640 = 2;
            } else {
                class201.field3462 = 1;
                client.field1640 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!od", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class9.field95 != null) {
            class203.field3486 = 0;
            class111.field2148 = arg0.getX();
            class156.field2774 = arg0.getY();
        }
        field2445++;
    }

    @OriginalMember(owner = "client!od", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class9.field95 != null) {
            class203.field3486 = 0;
            client.field1640 = 0;
            int var2 = arg0.getModifiers();
        }
        field2437++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!od", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class9.field95 != null) {
            class203.field3486 = 0;
            class111.field2148 = arg0.getX();
            class156.field2774 = arg0.getY();
        }
        field2451++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)I")
    public static final int method911(int arg0, int arg1, int arg2, byte arg3) {
        field2439++;
        if ((class47.field846[arg1][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 >= -43) {
            return 117;
        } else if (arg1 <= 0 || (class47.field846[1][arg2][arg0] & 0x2) == 0) {
            return arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BD)V")
    public static final void method912(byte arg0, double arg1) {
        if (class61.field1031 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class160.field2865[var3] = var4 <= 255 ? var4 : 255;
            }
            class61.field1031 = arg1;
        }
        field2453++;
        if (arg0 != 47) {
            method911(-26, -31, -30, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method913(int arg0, int arg1, int arg2, long arg3) {
        class16 var5 = class110.field2124[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field205 != null && var5.field205.field853 == arg3) {
            return true;
        } else if (var5.field212 != null && var5.field212.field2390 == arg3) {
            return true;
        } else if (var5.field225 != null && var5.field225.field1746 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field219; var6++) {
                if (var5.field220[var6].field780 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
