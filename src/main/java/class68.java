import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class68 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field1121 = -1;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1124 = "Loading config - ";

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field1132 = -1;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field1134 = 0;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field1135 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!db", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1133++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILfc;I)V")
    public static final void method474(int arg0, int arg1, int arg2, class158 arg3, int arg4) {
        field1130++;
        if (arg4 != 0) {
            return;
        }
        for (class107 var5 = (class107) class237.field3809.method1643((byte) 102); var5 != null; var5 = (class107) class237.field3809.method1642((byte) 87)) {
            if (var5.field1700 == arg2 && (arg0 * 128) == var5.field1718 && (arg1 * 128) == var5.field1708 && var5.field1703.field2474 == arg3.field2474) {
                if (var5.field1699 != null) {
                    class6.field68.method1594(var5.field1699);
                    var5.field1699 = null;
                }
                if (var5.field1715 != null) {
                    class6.field68.method1594(var5.field1715);
                    var5.field1715 = null;
                }
                var5.method913(-3542);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)I")
    public static final int method475(int arg0, boolean arg1) {
        field1127++;
        return arg1 ? arg0 & 0xFF : 87;
    }

    @OriginalMember(owner = "client!db", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1128++;
        if (class177.field2899 != null) {
            class273.field4377 = 0;
            class225.field3661 = -1;
            class71.field1201 = -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1125++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method476(int arg0) {
        if (arg0 != 11684) {
            field1135 = 44;
        }
        field1124 = null;
    }

    @OriginalMember(owner = "client!db", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1137++;
        if (class177.field2899 != null) {
            class273.field4377 = 0;
            class225.field3661 = arg0.getX();
            class71.field1201 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILag;)I")
    public static final int method477(int arg0, int arg1, class211 arg2) {
        field1129++;
        if (arg1 != -5777) {
            field1121 = -62;
        }
        if (!client.method2015(arg2).method1527(true, arg0) && arg2.field3377 == null) {
            return -1;
        } else if (arg2.field3499 == null || arg0 >= arg2.field3499.length) {
            return -1;
        } else {
            return arg2.field3499[arg0];
        }
    }

    @OriginalMember(owner = "client!db", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1123++;
        if (class177.field2899 != null) {
            class273.field4377 = 0;
            class225.field3661 = arg0.getX();
            class71.field1201 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!db", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class177.field2899 != null) {
            class273.field4377 = 0;
            class225.field3661 = arg0.getX();
            class71.field1201 = arg0.getY();
        }
        field1136++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZI)V")
    public static final void method478(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1138++;
        class227 var5 = (class227) class1.field14.method1059(0, (long) arg2);
        if (var5 == null) {
            var5 = new class227();
            class1.field14.method1052((long) arg2, (byte) -65, var5);
        }
        if (var5.field3666.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field3666.length; var8++) {
                var6[var8] = var5.field3666[var8];
                var7[var8] = var5.field3664[var8];
            }
            for (int var9 = var5.field3666.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3666 = var6;
            var5.field3664 = var7;
        }
        var5.field3666[arg0] = arg4;
        var5.field3664[arg0] = arg1;
        if (arg3) {
            method477(88, 44, (class211) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class177.field2899 != null) {
            class273.field4377 = 0;
            class220.field3600 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1131++;
    }

    @OriginalMember(owner = "client!db", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1126++;
        if (class177.field2899 != null) {
            class273.field4377 = 0;
            class247.field3929 = arg0.getX();
            class137.field2165 = arg0.getY();
            class175.field2871 = class191.method1350((byte) 96);
            if (arg0.isMetaDown()) {
                class285.field4525 = 2;
                class220.field3600 = 2;
            } else {
                class285.field4525 = 1;
                class220.field3600 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!db", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class177.field2899 != null) {
            class220.field3600 = 0;
        }
        field1122++;
    }
}
