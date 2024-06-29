import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class75 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1088 = "Members object";

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1089 = "Drop";

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[[S")
    public static short[][] field1095 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lcn;")
    public static class279 field1087;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lph;")
    public static class361 field1090;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
    public static int[] field1098;

    @OriginalMember(owner = "client!uh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 10)
    public final void focusGained(FocusEvent arg0) {
        field1093++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 17)
    public static final void method613(boolean arg0, int arg1, String arg2) {
        field1097++;
        class95 var3 = class227.method1699(3, -1855723168, arg1);
        if (!arg0) {
            field1090 = (class361) null;
        }
        var3.method738((byte) -113);
        var3.field1332 = arg2;
    }

    @OriginalMember(owner = "client!uh", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 39)
    public final void keyTyped(KeyEvent arg0) {
        field1094++;
        if (class260.field3879 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class28.method178(160, var2)) {
                int var3 = class314.field4670 + 1 & 0x7F;
                if (class209.field3054 != var3) {
                    class19.field305[class314.field4670] = -1;
                    class321.field4830[class314.field4670] = var2;
                    class314.field4670 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!uh", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 72)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1086++;
        if (class260.field3879 == null) {
            return;
        }
        class146.field2099 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class83.field1184.length) {
            var3 = class83.field1184[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class306.field4584 >= 0 && var3 >= 0) {
            class326.field4899[class306.field4584] = var3;
            class306.field4584 = class306.field4584 + 1 & 0x7F;
            if (class306.field4584 == class28.field395) {
                class306.field4584 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class314.field4670 + 1 & 0x7F;
            if (class209.field3054 != var4) {
                class19.field305[class314.field4670] = var3;
                class321.field4830[class314.field4670] = '\u0000';
                class314.field4670 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 129)
    public static void method614(int arg0) {
        field1087 = null;
        if (arg0 >= -21) {
            method613(true, 77, (String) null);
        }
        field1098 = null;
        field1090 = null;
        field1089 = null;
        field1095 = (short[][]) null;
        field1088 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V", line = 147)
    public static final void method615(int arg0, int arg1) {
        class36 var2 = class255.field3805;
        synchronized (class255.field3805) {
            class290.field4388 = arg0;
        }
        if (arg1 != -21329) {
            field1090 = (class361) null;
        }
        field1085++;
    }

    @OriginalMember(owner = "client!uh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 163)
    public final synchronized void focusLost(FocusEvent arg0) {
        field1091++;
        if (class260.field3879 != null) {
            class306.field4584 = -1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 176)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1092++;
        if (class260.field3879 != null) {
            class146.field2099 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class83.field1184.length > var2) {
                var3 = class83.field1184[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class306.field4584 >= 0 && var3 >= 0) {
                class326.field4899[class306.field4584] = ~var3;
                class306.field4584 = class306.field4584 + 1 & 0x7F;
                if (class306.field4584 == class28.field395) {
                    class306.field4584 = -1;
                }
            }
        }
        arg0.consume();
    }
}
