import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class53 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lqd;")
    public static class40 field1022 = class147.method1106("::gc", (byte) -121);

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lqd;")
    public static class40 field1031 = class147.method1106("(U", (byte) -96);

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Lqd;")
    public static class40 field1034 = class147.method1106(":clanreq:", (byte) -108);

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[I")
    public static int[] field1036 = new int[100];

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!il", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class288.field4828 != null) {
            class76.field1310 = 0;
        }
        field1032++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 38)
    public static void method460(byte arg0) {
        if (arg0 <= -36) {
            field1034 = null;
            field1031 = null;
            field1036 = null;
            field1022 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 55)
    public static final void method461(int arg0) {
        field1023++;
        int var1 = 60 / ((arg0 + 72) / 50);
        class257.method1805(false, 0);
        System.gc();
        class271.method1879(25, 17646);
    }

    @OriginalMember(owner = "client!il", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 70)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1027++;
        if (class288.field4828 != null) {
            class51.field982 = 0;
            class51.field978 = arg0.getX();
            class44.field826 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIB)V", line = 90)
    public static final void method462(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1030++;
        if (arg4 >= -95) {
            method461(-23);
        }
        int var5 = 0;
        class150.method1124(arg2 + arg3, -arg3 + arg2, arg1, true, class37.field694[arg0]);
        int var6 = -1;
        int var7 = -arg3;
        int var8 = arg3;
        while (var8 > var5) {
            var5++;
            var6 += 2;
            var7 += var6;
            if (var7 >= 0) {
                int var9 = arg2 + var5;
                var8--;
                int[] var10 = class37.field694[arg0 - var8];
                var7 -= var8 << 1;
                int[] var11 = class37.field694[arg0 + var8];
                int var12 = arg2 - var5;
                class150.method1124(var9, var12, arg1, true, var11);
                class150.method1124(var9, var12, arg1, true, var10);
            }
            int var13 = arg2 + var8;
            int[] var14 = class37.field694[arg0 - var5];
            int var15 = arg2 - var8;
            int[] var16 = class37.field694[arg0 + var5];
            class150.method1124(var13, var15, arg1, true, var16);
            class150.method1124(var13, var15, arg1, true, var14);
        }
    }

    @OriginalMember(owner = "client!il", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 146)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class288.field4828 != null) {
            class51.field982 = 0;
            class51.field978 = arg0.getX();
            class44.field826 = arg0.getY();
        }
        field1024++;
    }

    @OriginalMember(owner = "client!il", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 163)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class288.field4828 != null) {
            class51.field982 = 0;
            class51.field978 = -1;
            class44.field826 = -1;
        }
        field1021++;
    }

    @OriginalMember(owner = "client!il", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 181)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class288.field4828 != null) {
            class51.field982 = 0;
            class101.field1771 = arg0.getX();
            class14.field212 = arg0.getY();
            class243.field4008 = class69.method535(true);
            if (arg0.isMetaDown()) {
                class52.field1009 = 2;
                class76.field1310 = 2;
            } else {
                class52.field1009 = 1;
                class76.field1310 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1029++;
    }

    @OriginalMember(owner = "client!il", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 228)
    public final void focusGained(FocusEvent arg0) {
        field1025++;
    }

    @OriginalMember(owner = "client!il", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 243)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1037++;
        if (class288.field4828 != null) {
            class51.field982 = 0;
            class51.field978 = arg0.getX();
            class44.field826 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!il", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 273)
    public final void mouseClicked(MouseEvent arg0) {
        field1033++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!il", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 283)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1020++;
        if (class288.field4828 != null) {
            class51.field982 = 0;
            class76.field1310 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 319)
    public static final void method463(int arg0) {
        class128.field2199.method1347(0);
        if (arg0 <= 76) {
            method460((byte) -109);
        }
        field1028++;
    }
}
