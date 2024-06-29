import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class173 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lp;")
    public static class82 field3173 = null;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3169 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Z")
    public static boolean field3177 = false;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "[I")
    public static int[] field3178 = new int[4096];

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1230(int arg0) {
        field3169 = null;
        field3178 = null;
        field3173 = null;
        if (arg0 != 0) {
            method1232(true);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V")
    public static final void method1231(int arg0, int arg1) {
        class118.field2109.method85((byte) 75, arg1);
        field3163++;
        if (arg0 != 0) {
            method1230(-73);
        }
    }

    @OriginalMember(owner = "client!ah", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class27.field460 != null) {
            class171.field3157 = 0;
            class25.field419 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3174++;
    }

    @OriginalMember(owner = "client!ah", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3166++;
        if (class27.field460 != null) {
            class171.field3157 = 0;
            class81.field1457 = arg0.getX();
            class181.field3319 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ah", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class27.field460 != null) {
            class171.field3157 = 0;
            class81.field1457 = arg0.getX();
            class181.field3319 = arg0.getY();
        }
        field3168++;
    }

    @OriginalMember(owner = "client!ah", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3161++;
        if (class27.field460 != null) {
            class171.field3157 = 0;
            class81.field1457 = -1;
            class181.field3319 = -1;
        }
    }

    @OriginalMember(owner = "client!ah", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3165++;
    }

    @OriginalMember(owner = "client!ah", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class27.field460 != null) {
            class171.field3157 = 0;
            class81.field1457 = arg0.getX();
            class181.field3319 = arg0.getY();
        }
        field3172++;
    }

    @OriginalMember(owner = "client!ah", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3164++;
        if (class27.field460 != null) {
            class25.field419 = 0;
        }
    }

    @OriginalMember(owner = "client!ah", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class27.field460 != null) {
            class171.field3157 = 0;
            class144.field2732 = arg0.getX();
            class134.field2429 = arg0.getY();
            class212.field3875 = class244.method1644((byte) -82);
            if (arg0.isMetaDown()) {
                class148.field2807 = 2;
                class25.field419 = 2;
            } else {
                class148.field2807 = 1;
                class25.field419 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field3171++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)[Lcg;")
    public static final class34[] method1232(boolean arg0) {
        field3162++;
        if (!arg0) {
            method1230(-33);
        }
        class34[] var1 = new class34[class27.field457];
        for (int var2 = 0; var2 < class27.field457; var2++) {
            var1[var2] = new class34(class87.field1716, class210.field3839, class145.field2766[var2], class249.field4418[var2], class55.field940[var2], class258.field4591[var2], class174.field3182[var2], class211.field3842);
        }
        class269.method1827((byte) -121);
        return var1;
    }

    @OriginalMember(owner = "client!ah", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3167++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
