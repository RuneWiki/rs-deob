import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class243 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3354 = "Loaded update list";

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3347 = -11713997;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field3355 = 0;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3361 = "red:";

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Z")
    public static boolean field3363 = false;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lik;")
    public static class410 field3362 = new class410(64);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!v", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3365++;
        if (class127.field1799 != null) {
            class404.field5625 = 0;
            class228.field3177 = arg0.getX();
            class272.field3653 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!v", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 24)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class127.field1799 != null) {
            class404.field5625 = 0;
            class228.field3177 = arg0.getX();
            class272.field3653 = arg0.getY();
        }
        field3352++;
    }

    @OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 43)
    public final void focusGained(FocusEvent arg0) {
        field3356++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 54)
    public static void method1598(boolean arg0) {
        field3354 = null;
        field3362 = null;
        field3361 = null;
        if (arg0) {
            field3360 = 68;
        }
    }

    @OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 66)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class127.field1799 != null) {
            class130.field1849 = 0;
        }
        field3353++;
    }

    @OriginalMember(owner = "client!v", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 78)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class127.field1799 != null) {
            class404.field5625 = 0;
            class228.field3177 = arg0.getX();
            class272.field3653 = arg0.getY();
        }
        field3359++;
    }

    @OriginalMember(owner = "client!v", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 96)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3357++;
        if (class127.field1799 != null) {
            class404.field5625 = 0;
            class360.field4885 = arg0.getX();
            class169.field2500 = arg0.getY();
            class436.field6207 = class108.method902((byte) -93);
            if (arg0.isMetaDown()) {
                class8.field72 = 2;
                class130.field1849 = 2;
            } else {
                class8.field72 = 1;
                class130.field1849 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!v", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 142)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3364++;
    }

    @OriginalMember(owner = "client!v", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 153)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3349++;
        if (class127.field1799 != null) {
            class404.field5625 = 0;
            class130.field1849 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!v", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 189)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class127.field1799 != null) {
            class404.field5625 = 0;
            class228.field3177 = -1;
            class272.field3653 = -1;
        }
        field3358++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 229)
    public static final void method1599(byte arg0) {
        field3346++;
        if (class286.field3830 == -1 || class29.field493 == -1) {
            return;
        }
        int var1 = ((class406.field5638 - class177.field2612) * class71.field1066 >> 16) + class177.field2612;
        class71.field1066 += var1;
        if (class71.field1066 < 65535) {
            class107.field1573 = false;
            class420.field5883 = false;
        } else {
            if (class420.field5883) {
                class107.field1573 = false;
            } else {
                class107.field1573 = true;
            }
            class71.field1066 = 65535;
            class420.field5883 = true;
        }
        if (arg0 >= -82) {
            method1599((byte) 5);
        }
        float var2 = (float) class71.field1066 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class84.field1276 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class286.field3836[class286.field3830][var4][var5] * 3;
            int var22 = class286.field3836[class286.field3830][var4 + 1][var5] * 3;
            int var23 = (class286.field3836[class286.field3830][var4 + 2][var5] - (class286.field3836[class286.field3830][var4 + 3][var5] - class286.field3836[class286.field3830][var4 + 2][var5])) * 3;
            int var24 = class286.field3836[class286.field3830][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class286.field3836[class286.field3830][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class356.field4842 = (int) var3[0] - (class283.field3794 * 128);
        class443.field6389 = (int) var3[1] * -1;
        class374.field5261 = (int) var3[2] - (class296.field3988 * 128);
        float[] var6 = new float[3];
        int var7 = class68.field1028 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class286.field3836[class29.field493][var7][var8] * 3;
            int var15 = class286.field3836[class29.field493][var7 + 1][var8] * 3;
            int var16 = (class286.field3836[class29.field493][var7 + 2][var8] + class286.field3836[class29.field493][var7 - -2][var8] - class286.field3836[class29.field493][var7 + 3][var8]) * 3;
            int var17 = class286.field3836[class29.field493][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class286.field3836[class29.field493][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class167.field2488 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class286.field3837 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class450.field6502 = ((class286.field3836[class286.field3830][var4 + 2][3] - class286.field3836[class286.field3830][var4][3]) * class71.field1066 >> 16) + class286.field3836[class286.field3830][var4][3];
    }
}
