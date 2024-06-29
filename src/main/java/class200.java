import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class200 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lob;")
    public static class141 field3784 = class175.method1195(40, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[Lki;")
    public static class108[] field3777 = new class108[4];

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lob;")
    private static class141 field3781 = class175.method1195(40, "Loading)3)3)3");

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lob;")
    public static class141 field3794 = class175.method1195(40, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lob;")
    public static class141 field3790 = class175.method1195(40, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lob;")
    public static class141 field3779 = field3781;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3789++;
        if (class212.field4046 != null) {
            class60.field1169 = 0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3791++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lfa;I)V")
    public static final void method1334(class52 arg0, int arg1) {
        for (int var2 = 0; var2 < class142.field2748.length; var2++) {
            class142.field2748[var2] = 0;
        }
        field3785++;
        short var3 = 256;
        if (arg1 != 29499) {
            return;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class142.field2748[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class111.field2136[var15] = (class142.field2748[var15 + 1] + class142.field2748[var15 - 1] + class142.field2748[var15 + 128] + class142.field2748[var15 - 128]) / 4;
                }
            }
            int[] var13 = class142.field2748;
            class142.field2748 = class111.field2136;
            class111.field2136 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field1000; var7++) {
            for (int var8 = 0; var8 < arg0.field1003; var8++) {
                if (arg0.field1004[var6++] != 0) {
                    int var9 = var7 + arg0.field998 + 16;
                    int var10 = arg0.field1002 + var8 + 16;
                    int var11 = (var9 << 7) + var10;
                    class142.field2748[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 + arg5;
        field3792++;
        for (int var8 = arg1; var8 < var7; var8++) {
            class180.method1217(arg6, (byte) 52, arg2, arg0, class41.field805[var8]);
        }
        int var9 = arg6 - arg5;
        if (arg3 != 3963) {
            method1335(44, 0, 96, -57, 92, -113, 42);
        }
        int var10 = arg4 - arg5;
        int var11 = arg2 + arg5;
        for (int var12 = arg4; var12 > var10; var12--) {
            class180.method1217(arg6, (byte) 52, arg2, arg0, class41.field805[var12]);
        }
        for (int var13 = var7; var13 <= var10; var13++) {
            int[] var14 = class41.field805[var13];
            class180.method1217(var11, (byte) 52, arg2, arg0, var14);
            class180.method1217(arg6, (byte) 52, var9, arg0, var14);
        }
    }

    @OriginalMember(owner = "client!ua", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class212.field4046 != null) {
            class138.field2656 = 0;
            class57.field1106 = arg0.getX();
            client.field610 = arg0.getY();
        }
        field3788++;
    }

    @OriginalMember(owner = "client!ua", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class212.field4046 != null) {
            class138.field2656 = 0;
            class90.field1780 = arg0.getX();
            class123.field2358 = arg0.getY();
            class76.field1535 = class1.method2((byte) -105);
            if (arg0.isMetaDown()) {
                class170.field3344 = 2;
                class60.field1169 = 2;
            } else {
                class170.field3344 = 1;
                class60.field1169 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3793++;
    }

    @OriginalMember(owner = "client!ua", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field3786++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ua", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class212.field4046 != null) {
            class138.field2656 = 0;
            class57.field1106 = arg0.getX();
            client.field610 = arg0.getY();
        }
        field3783++;
    }

    @OriginalMember(owner = "client!ua", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class212.field4046 != null) {
            class138.field2656 = 0;
            class60.field1169 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3787++;
    }

    @OriginalMember(owner = "client!ua", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3782++;
        if (class212.field4046 != null) {
            class138.field2656 = 0;
            class57.field1106 = -1;
            client.field610 = -1;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method1336(boolean arg0) {
        field3777 = null;
        if (!arg0) {
            return;
        }
        field3779 = null;
        field3790 = null;
        field3781 = null;
        field3784 = null;
        field3794 = null;
    }

    @OriginalMember(owner = "client!ua", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3778++;
        if (class212.field4046 != null) {
            class138.field2656 = 0;
            class57.field1106 = arg0.getX();
            client.field610 = arg0.getY();
        }
    }
}
