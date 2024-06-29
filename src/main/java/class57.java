import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class57 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    public static int[] field871 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field874 = 0;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[I")
    public static int[] field876 = new int[100];

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Z")
    public static boolean field878 = true;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lve;")
    public static class233 field875;

    @OriginalMember(owner = "client!nf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field877++;
        if (class158.field2300 != null) {
            class234.field3529 = 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class158.field2300 != null) {
            class273.field4345 = 0;
            class123.field1785 = arg0.getX();
            class23.field307 = arg0.getY();
        }
        field882++;
    }

    @OriginalMember(owner = "client!nf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class158.field2300 != null) {
            class273.field4345 = 0;
            class123.field1785 = arg0.getX();
            class23.field307 = arg0.getY();
        }
        field879++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JI)V")
    public static final void method383(long arg0, int arg1) {
        class95.field1451.field1673 = 0;
        class95.field1451.method775(21, -126);
        class95.field1451.method765(532401312, arg0);
        class40.field591 = 0;
        field881++;
        class204.field2956 = -3;
        class81.field1251 = 1;
        class221.field3259 = 0;
        if (arg1 >= -84) {
            field883 = -14;
        }
    }

    @OriginalMember(owner = "client!nf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field868++;
        if (class158.field2300 != null) {
            class273.field4345 = 0;
            class179.field2552 = arg0.getX();
            class166.field2416 = arg0.getY();
            class187.field2666 = class287.method1928(27332);
            if (arg0.isMetaDown()) {
                class282.field4493 = 2;
                class234.field3529 = 2;
            } else {
                class282.field4493 = 1;
                class234.field3529 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field872++;
        if (class158.field2300 != null) {
            class273.field4345 = 0;
            class234.field3529 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method384(byte arg0) {
        field880++;
        if (!class151.field2185) {
            if (class104.field1541 != 0) {
                class261.field3942 = class218.field3226;
                class222.field3311 = class149.field2144;
            } else if (class200.field2894 == 0) {
                class222.field3311 = class190.field2688;
                class261.field3942 = class25.field345;
            } else {
                class261.field3942 = class279.field4465;
                class222.field3311 = class42.field602;
            }
            class86.field1330[0] = class233.field3503;
            class283.field4508 = 1;
            class69.field1087[0] = "";
            class187.field2665[0] = class275.field4416;
            class280.field4475[0] = 1006;
        }
        if (class193.field2774 != -1) {
            class31.method226(class193.field2774, 52);
        }
        for (int var1 = 0; var1 < class220.field3252; var1++) {
            if (class21.field278[var1]) {
                class119.field1753[var1] = true;
            }
            class86.field1334[var1] = class21.field278[var1];
            class21.field278[var1] = false;
        }
        class213.field3060 = -1;
        class141.field2034 = null;
        class51.field748 = -1;
        class94.field1432 = class82.field1267;
        class84.field1298 = null;
        if (class193.field2774 != -1) {
            class220.field3252 = 0;
            class13.method107((byte) 119);
        }
        class144.method962();
        class224.method1462(false);
        if (class151.field2185) {
            if (class56.field854) {
                class103.method690((byte) -34);
            } else {
                class248.method1634(-10440);
            }
        } else if (class84.field1298 != null) {
            class243.method1581(class153.field2237, class196.field2814, 31076, class84.field1298);
        } else if (class213.field3060 != -1) {
            class243.method1581(class213.field3060, class51.field748, 31076, (class267) null);
        }
        if (arg0 != -112) {
            return;
        }
        int var2 = class151.field2185 ? -1 : class255.method1710(-69);
        if (var2 == -1) {
            var2 = class82.field1263;
        }
        class258.method1731((byte) 105, var2);
        if (class99.field1487 == 1) {
            class99.field1487 = 2;
        }
        if (class203.field2940 == 1) {
            class203.field2940 = 2;
        }
        if (class222.field3305 == 3) {
            for (int var3 = 0; var3 < class220.field3252; var3++) {
                if (class86.field1334[var3]) {
                    class144.method958(class99.field1480[var3], class1.field4[var3], class263.field3964[var3], class109.field1579[var3], 16711935, 128);
                } else if (class119.field1753[var3]) {
                    class144.method958(class99.field1480[var3], class1.field4[var3], class263.field3964[var3], class109.field1579[var3], 16711680, 128);
                }
            }
        }
        class272.method1829(false, class55.field847.field94, class163.field2364, class55.field847.field45, class38.field566);
        class38.field566 = 0;
    }

    @OriginalMember(owner = "client!nf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field869++;
    }

    @OriginalMember(owner = "client!nf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field870++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method385(int arg0) {
        int var1 = -81 % ((77 - arg0) / 40);
        field876 = null;
        field871 = null;
        field875 = null;
    }

    @OriginalMember(owner = "client!nf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class158.field2300 != null) {
            class273.field4345 = 0;
            class123.field1785 = -1;
            class23.field307 = -1;
        }
        field886++;
    }

    @OriginalMember(owner = "client!nf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field873++;
        if (class158.field2300 != null) {
            class273.field4345 = 0;
            class123.field1785 = arg0.getX();
            class23.field307 = arg0.getY();
        }
    }
}
