import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class119 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[I")
    public static int[] field2701 = new int[128];

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lja;")
    public static class62 field2713 = class30.method243(43, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lja;")
    public static class62 field2715 = class30.method243(43, "Anmelde)2Limit -Uberschritten)3");

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Z")
    public static boolean field2709 = false;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lja;")
    private static class62 field2712 = class30.method243(43, "glow3:");

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lja;")
    public static class62 field2711 = field2712;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lja;")
    public static class62 field2708 = field2712;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lja;")
    public static class62 field2725 = class30.method243(43, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lhe;")
    public static class54 field2724 = null;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Lja;")
    public static class62 field2728 = class30.method243(43, " ");

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field2729 = -1;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lc;")
    public static class18 field2706 = new class18(64);

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field2732 = -1;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "Lja;")
    public static class62 field2731 = class30.method243(43, "Sprites geladen)3");

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "Lja;")
    public static class62 field2733 = class30.method243(43, "mod_icons");

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lka;")
    public static class69 field2703;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "[I")
    public static int[] field2734;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lmd;I)V")
    public static final void method948(class87 arg0, int arg1) {
        int var2 = -70 / ((arg1 - 47) / 44);
        arg0.field2075 = false;
        if (arg0.field2076 != null) {
            arg0.field2076.field1481 = 0;
        }
        for (class87 var3 = arg0.method30(); var3 != null; var3 = arg0.method35()) {
            method948(var3, -35);
        }
        field2727++;
    }

    @OriginalMember(owner = "client!rb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2726++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2705++;
        if (class70.field1788 != null) {
            class47.field1093 = 0;
            class153.field3564 = arg0.getX();
            class10.field251 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static final void method949(boolean arg0) {
        class34.field814 = 0;
        class134.field3088 = 0;
        field2702++;
        class9.method75((byte) -105);
        class116.method942(-23014);
        class147.method1170((byte) 0);
        for (int var1 = 0; var1 < class134.field3088; var1++) {
            int var3 = class42.field989[var1];
            if (class86.field2060 != class136.field3127[var3].field180) {
                class136.field3127[var3].field2966 = null;
                class136.field3127[var3] = null;
            }
        }
        if (class115.field2651 != class38.field879.field2873) {
            throw new RuntimeException("gnp1 pos:" + class38.field879.field2873 + " psize:" + class115.field2651);
        }
        int var2 = 0;
        if (arg0) {
            method952(108, -54);
        }
        while (class83.field2001 > var2) {
            if (class136.field3127[class36.field871[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class83.field2001);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class70.field1788 != null) {
            class47.field1093 = 0;
            class153.field3564 = arg0.getX();
            class10.field251 = arg0.getY();
        }
        field2716++;
    }

    @OriginalMember(owner = "client!rb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2723++;
        if (class70.field1788 != null) {
            class47.field1093 = 0;
            class153.field3564 = arg0.getX();
            class10.field251 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method950(int arg0) {
        class144.field3361 = false;
        if (arg0 != 104) {
            method949(false);
        }
        field2718++;
        class69.field1750 = false;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method951(int arg0) {
        field2708 = null;
        field2711 = null;
        field2728 = null;
        field2712 = null;
        field2725 = null;
        field2724 = null;
        field2715 = null;
        field2706 = null;
        field2713 = null;
        field2731 = null;
        field2701 = null;
        field2703 = null;
        field2734 = null;
        if (arg0 == 104) {
            field2733 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Lwb;")
    public static final class151 method952(int arg0, int arg1) {
        field2714++;
        class151 var2 = (class151) class142.field3319.method129((long) arg0, 24838);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 104) {
            field2701 = null;
        }
        byte[] var3 = class38.field896.method867(14, 15, arg0);
        class151 var4 = new class151();
        if (var3 != null) {
            var4.method1187(new class128(var3), -1);
        }
        class142.field3319.method128((byte) -99, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class70.field1788 != null) {
            class47.field1093 = 0;
            class153.field3564 = -1;
            class10.field251 = -1;
        }
        field2722++;
    }

    @OriginalMember(owner = "client!rb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2704++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static final void method953(byte arg0) {
        field2707++;
        class15.field369 = new byte[4][105][105];
        class153.field3575 = new int[104];
        class81.field1964 = new int[105][105];
        int var1 = -67 % ((arg0 - 77) / 34);
        field2734 = new int[104];
        class83.field1989 = new int[4][105][105];
        class26.field633 = new int[104];
        class147.field3479 = new int[104];
        class81.field1966 = new byte[4][104][104];
        class34.field817 = new byte[4][104][104];
        class84.field2016 = 99;
        class79.field1930 = new byte[4][104][104];
        class38.field888 = new int[104];
        class53.field1222 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!rb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2720++;
        if (class70.field1788 != null) {
            class86.field2062 = 0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class70.field1788 != null) {
            class47.field1093 = 0;
            class71.field1811 = arg0.getX();
            class18.field412 = arg0.getY();
            class155.field3600 = class26.method209((byte) 117);
            if (arg0.isMetaDown()) {
                class29.field706 = 2;
                class86.field2062 = 2;
            } else {
                class29.field706 = 1;
                class86.field2062 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2719++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Lda;")
    public static final class22 method954(byte arg0, int arg1) {
        field2721++;
        class22 var2 = (class22) class98.field2289.method129((long) arg1, 24838);
        if (var2 != null) {
            return var2;
        }
        class22 var3 = class15.method105(arg1, class27.field661, false, class1.field16, 1);
        if (var3 != null) {
            class98.field2289.method128((byte) -113, var3, (long) arg1);
        }
        return arg0 > -115 ? null : var3;
    }

    @OriginalMember(owner = "client!rb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2710++;
        if (class70.field1788 != null) {
            class47.field1093 = 0;
            class86.field2062 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
