import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class238 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ul", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class199.field2924 != null) {
            class181.field2723 = 0;
            class225.field3312 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3485++;
    }

    @OriginalMember(owner = "client!ul", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3477++;
        if (class199.field2924 != null) {
            class181.field2723 = 0;
            class114.field1896 = arg0.getX();
            class217.field3171 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ul", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3486++;
        if (class199.field2924 != null) {
            class181.field2723 = 0;
            class114.field1896 = arg0.getX();
            class217.field3171 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ul", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3481++;
        if (class199.field2924 != null) {
            class181.field2723 = 0;
            class82.field1322 = arg0.getX();
            class21.field231 = arg0.getY();
            class261.field4032 = class3.method14(29853);
            if (arg0.isMetaDown()) {
                class306.field4938 = 2;
                class225.field3312 = 2;
            } else {
                class306.field4938 = 1;
                class225.field3312 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ul", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3482++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ul", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3488++;
    }

    @OriginalMember(owner = "client!ul", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class199.field2924 != null) {
            class181.field2723 = 0;
            class114.field1896 = -1;
            class217.field3171 = -1;
        }
        field3478++;
    }

    @OriginalMember(owner = "client!ul", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3480++;
        if (class199.field2924 != null) {
            class225.field3312 = 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIILmh;ILlf;)V")
    public static final void method1636(int arg0, int arg1, int arg2, int arg3, class263 arg4, int arg5, class94 arg6) {
        field3484++;
        if (arg6 == null) {
            return;
        }
        int var7 = (int) class102.field1736 + class267.field4279 & 0x7FF;
        int var8 = arg0 * arg0 + arg3 * arg3;
        int var9 = Math.max(arg4.field4215 / 2, arg4.field4046 / 2) + 10;
        if (var8 > var9 * var9) {
            return;
        }
        int var10 = class244.field3590[var7];
        int var11 = var10 * 256 / (class131.field2168 + 256);
        if (arg1 != 27191) {
            field3479 = -46;
        }
        int var12 = class244.field3592[var7];
        int var13 = var12 * 256 / (class131.field2168 + 256);
        int var14 = arg0 * var11 + arg3 * var13 >> 16;
        int var15 = arg0 * var13 - (arg3 * var11) >> 16;
        ((class148) arg6).method1094(arg4.field4215 / 2 + arg5 - (arg6.field1580 / 2 + -var14), arg4.field4046 / 2 + (arg2 - arg6.field1587 / 2) + -var15, arg4.field4220, arg4.field4168);
    }

    @OriginalMember(owner = "client!ul", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class199.field2924 != null) {
            class181.field2723 = 0;
            class114.field1896 = arg0.getX();
            class217.field3171 = arg0.getY();
        }
        field3483++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)J")
    public static final long method1637(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field5022; var4++) {
            class156 var5 = var3.field5037[var4];
            if ((var5.field2431 >> 29 & 0x3L) == 2L && var5.field2443 == arg1 && var5.field2432 == arg2) {
                return var5.field2431;
            }
        }
        return 0L;
    }
}
