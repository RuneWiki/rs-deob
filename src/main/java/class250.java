import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class250 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
    public static int[] field4003 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "[S")
    public static short[] field4011 = new short[] { 36, 37, 7, 23, 14, 58, 42, 29 };

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method1683(int arg0) {
        if (arg0 != 24037) {
            method1685((class186) null, 26);
        }
        field4003 = null;
        field4011 = null;
    }

    @OriginalMember(owner = "client!fa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4002++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class39.field526 != null) {
            class87.field1375 = 0;
            class174.field2730 = -1;
            class271.field4304 = -1;
        }
        field4008++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4013++;
        if (class39.field526 != null) {
            class87.field1375 = 0;
            class174.field2730 = arg0.getX();
            class271.field4304 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILjava/lang/String;II[B)I")
    public static final int method1684(byte arg0, int arg1, String arg2, int arg3, int arg4, byte[] arg5) {
        int var6 = arg4 - arg1;
        field4004++;
        if (arg0 > -116) {
            method1683(34);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg3 + var7] = -97;
            } else {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var8, 16) + " in CharSequence");
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class39.field526 != null) {
            class87.field1375 = 0;
            class149.field2228 = arg0.getX();
            class216.field3536 = arg0.getY();
            class181.field2830 = class260.method1785((byte) -98);
            if (arg0.isMetaDown()) {
                class120.field1756 = 2;
                class40.field549 = 2;
            } else {
                class120.field1756 = 1;
                class40.field549 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4012++;
    }

    @OriginalMember(owner = "client!fa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class39.field526 != null) {
            class40.field549 = 0;
        }
        field4010++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class39.field526 != null) {
            class87.field1375 = 0;
            class174.field2730 = arg0.getX();
            class271.field4304 = arg0.getY();
        }
        field4001++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4007++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class39.field526 != null) {
            class87.field1375 = 0;
            class40.field549 = 0;
            int var2 = arg0.getModifiers();
        }
        field4005++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lbd;I)V")
    public static final void method1685(class186 arg0, int arg1) {
        if (arg1 != -29387) {
            field4009 = -78;
        }
        class190 var2 = (class190) class290.field4573.method665((byte) 87, class162.method1116(arg0.field2912, (byte) 6));
        if (var2 == null) {
            class16.method113(arg0, class276.field4398, arg0.field1272[0], (class56) null, 0, (class181) null, arg0.field1257[0], (byte) -49);
        } else {
            var2.method1332((byte) -75);
        }
        field4014++;
    }

    @OriginalMember(owner = "client!fa", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4006++;
        if (class39.field526 != null) {
            class87.field1375 = 0;
            class174.field2730 = arg0.getX();
            class271.field4304 = arg0.getY();
        }
    }
}
