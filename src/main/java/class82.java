import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class82 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[I")
    public static int[] field1182 = new int[50];

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "[I")
    public static int[] field1193 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
    public static boolean field1184 = false;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static volatile int field1198 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "[I")
    public static int[] field1189;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[Lsc;")
    public static class212[] field1188;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ldc;IIILic;Lhg;II)V")
    public static final void method512(class145 arg0, int arg1, int arg2, int arg3, class134 arg4, class164 arg5, int arg6, int arg7) {
        field1192++;
        class72 var8 = new class72();
        var8.field1021 = arg6 * 128;
        var8.field1028 = arg2 * 128;
        var8.field1025 = arg7;
        if (arg0 != null) {
            var8.field1022 = arg0.field2260;
            var8.field1046 = arg0.field2227;
            var8.field1023 = arg0.field2283;
            var8.field1044 = arg0.field2245 * 128;
            var8.field1024 = arg0;
            int var9 = arg0.field2278;
            var8.field1039 = arg0.field2235;
            int var10 = arg0.field2263;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg0.field2278;
                var9 = arg0.field2263;
            }
            var8.field1033 = (arg2 + var9) * 128;
            var8.field1047 = (arg6 + var10) * 128;
            if (arg0.field2232 != null) {
                var8.field1020 = true;
                var8.method462((byte) -123);
            }
            if (var8.field1046 != null) {
                var8.field1038 = (int) (Math.random() * (double) (var8.field1022 - var8.field1023)) + var8.field1023;
            }
            class62.field852.method1652(26532, var8);
        } else if (arg5 != null) {
            class111 var11 = arg5.field2648;
            var8.field1042 = arg5;
            if (var11.field1591 != null) {
                var8.field1020 = true;
                var11 = var11.method659(95);
            }
            if (var11 != null) {
                var8.field1033 = (arg2 + var11.field1599) * 128;
                var8.field1047 = (var11.field1599 + arg6) * 128;
                var8.field1039 = class90.method554(arg5, 127);
                var8.field1044 = var11.field1624 * 128;
            }
            class223.field3995.method1652(26532, var8);
        } else if (arg4 != null) {
            var8.field1033 = (arg4.field2049 + arg2) * 128;
            var8.field1016 = arg4;
            var8.field1047 = (arg4.field2049 + arg6) * 128;
            var8.field1039 = class201.method1357(-111, arg4);
            var8.field1044 = arg4.field1910 * 128;
            class35.field423.method1552(var8, arg4.field1924.method1330(0), 0);
        }
        if (arg1 > -54) {
            field1188 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1186++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method513(byte arg0) {
        field1188 = null;
        field1193 = null;
        field1189 = null;
        int var1 = -41 % ((-arg0 - 9) / 51);
        field1182 = null;
    }

    @OriginalMember(owner = "client!mf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1195++;
    }

    @OriginalMember(owner = "client!mf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1191++;
        if (class193.field3403 != null) {
            class218.field3911 = 0;
            class242.field4310 = -1;
            class62.field861 = -1;
        }
    }

    @OriginalMember(owner = "client!mf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class193.field3403 != null) {
            class218.field3911 = 0;
            field1198 = 0;
            int var2 = arg0.getModifiers();
        }
        field1197++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1194++;
        if (class193.field3403 != null) {
            class218.field3911 = 0;
            class81.field1165 = arg0.getX();
            class156.field2522 = arg0.getY();
            class65.field915 = class183.method1195((byte) 118);
            if (arg0.isMetaDown()) {
                class43.field496 = 2;
                field1198 = 2;
            } else {
                class43.field496 = 1;
                field1198 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!mf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1181++;
        if (class193.field3403 != null) {
            class218.field3911 = 0;
            class242.field4310 = arg0.getX();
            class62.field861 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method514(int arg0) {
        field1196++;
        class82 var1 = class193.field3403;
        synchronized (class193.field3403) {
            class218.field3911++;
            class227.field4052 = field1198;
            class52.field646 = class242.field4310;
            class63.field869 = class62.field861;
            class178.field3052 = class43.field496;
            if (arg0 >= -103) {
                method513((byte) -19);
            }
            class61.field812 = class81.field1165;
            class28.field350 = class156.field2522;
            class216.field3888 = class65.field915;
            class43.field496 = 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class193.field3403 != null) {
            class218.field3911 = 0;
            class242.field4310 = arg0.getX();
            class62.field861 = arg0.getY();
        }
        field1185++;
    }

    @OriginalMember(owner = "client!mf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1183++;
        if (class193.field3403 != null) {
            class218.field3911 = 0;
            class242.field4310 = arg0.getX();
            class62.field861 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!mf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1190++;
        if (class193.field3403 != null) {
            field1198 = 0;
        }
    }
}
