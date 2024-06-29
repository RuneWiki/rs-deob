import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class103 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lkh;")
    public static class117 field1870 = class224.method1450((byte) 119, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lkh;")
    public static class117 field1867 = class224.method1450((byte) -61, "<col=80ff00>");

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1876 = 0;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Z")
    public static boolean field1882 = false;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lkh;")
    public static class117 field1883 = class224.method1450((byte) 112, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Lkh;")
    public static class117 field1869 = class224.method1450((byte) 117, "(U3");

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lnc;")
    public static class145 field1880 = new class145(8);

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Lkh;")
    public static class117 field1888 = class224.method1450((byte) 122, "<img=0>");

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lkh;")
    public static class117 field1886;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lvb;")
    public static class232 field1877;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lch;")
    public static class31 field1889;

    @OriginalMember(owner = "client!je", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1887++;
        if (class199.field3581 != null) {
            class26.field656 = 0;
            class137.field2482 = arg0.getX();
            class50.field1039 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[III[I)V")
    public static final void method692(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        int var5 = arg3;
        if (arg3 > 25) {
            var5 = 25;
        }
        arg3--;
        int var6 = arg4[arg3];
        field1875++;
        int var7 = arg1[arg3];
        if (arg0 == 0) {
            class105.field1911.method400(200, 8);
            class105.field1911.method1002(false, var5 + var5 + 3);
            class32.field747++;
        }
        if (arg0 == 1) {
            class10.field330++;
            class105.field1911.method400(199, 8);
            class105.field1911.method1002(false, var5 + var5 + 3 + 14);
        }
        if (arg0 == 2) {
            class117.field2204++;
            class105.field1911.method400(159, 8);
            class105.field1911.method1002(false, var5 + var5 + 3);
        }
        class105.field1911.method993(false, var7 + class184.field3319);
        class105.field1911.method992(class53.field1090[arg2] ? 1 : 0, 0);
        class193.field3448 = arg1[0];
        class61.field1233 = arg4[0];
        for (int var8 = 1; var8 < var5; var8++) {
            arg3--;
            class105.field1911.method1011(arg4[arg3] - var6, 128);
            class105.field1911.method992(arg1[arg3] - var7, 0);
        }
        class105.field1911.method1046(111, var6 + class143.field2591);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method693(int arg0) {
        class196.field3496 = null;
        class167.field3016 = null;
        class109.field2062 = null;
        if (arg0 != 0) {
            field1888 = null;
        }
        class38.field873 = null;
        class73.field1394 = null;
        class184.field3305 = null;
        class180.field3260 = null;
        field1865++;
        class88.field1635 = null;
        class120.field2268 = null;
        class225.field4049 = null;
        class140.field2556 = null;
    }

    @OriginalMember(owner = "client!je", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1885++;
        if (class199.field3581 != null) {
            class26.field656 = 0;
            class137.field2482 = -1;
            class50.field1039 = -1;
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1866++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
    public static final void method694(int arg0, int arg1, int arg2, int arg3) {
        class48.field998 = new class170[arg0][arg1][arg2];
        class146.field2684 = new int[arg0][arg1 + 1][arg2 + 1];
        class66.method473(false);
        class92.field1698 = arg1;
        class170.field3053 = arg2;
        class53.field1099 = new int[arg0][arg1 + 1][arg2 + 1];
        class28.method239();
        class41.field933 = arg3;
        class95.field1740 = new boolean[class41.field933 + class41.field933 + 1][class41.field933 + class41.field933 + 1];
        class156.field2841 = new boolean[class41.field933 + class41.field933 + 2][class41.field933 + class41.field933 + 2];
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static void method695(int arg0) {
        field1883 = null;
        field1886 = null;
        field1880 = null;
        field1867 = null;
        field1869 = null;
        if (arg0 != -5561) {
            method692(104, null, 120, 109, null);
        }
        field1877 = null;
        field1870 = null;
        field1889 = null;
        field1888 = null;
    }

    @OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1872++;
    }

    @OriginalMember(owner = "client!je", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1868++;
        if (class199.field3581 != null) {
            class26.field656 = 0;
            class137.field2482 = arg0.getX();
            class50.field1039 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class199.field3581 != null) {
            class26.field656 = 0;
            class11.field379 = 0;
            int var2 = arg0.getModifiers();
        }
        field1884++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class199.field3581 != null) {
            class26.field656 = 0;
            class137.field2482 = arg0.getX();
            class50.field1039 = arg0.getY();
        }
        field1878++;
    }

    @OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class199.field3581 != null) {
            class11.field379 = 0;
        }
        field1873++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
    public static final boolean method696(int arg0, int arg1) {
        field1881++;
        if (arg1 != -17080) {
            field1870 = null;
        }
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!je", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class199.field3581 != null) {
            class26.field656 = 0;
            class5.field63 = arg0.getX();
            class77.field1474 = arg0.getY();
            class19.field538 = class4.method31((byte) 47);
            if (arg0.isMetaDown()) {
                class176.field3181 = 2;
                class11.field379 = 2;
            } else {
                class176.field3181 = 1;
                class11.field379 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field1874++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)I")
    public static final int method697(int arg0, int arg1, int arg2) {
        int var3 = arg2 >>> 31;
        if (arg1 != 2676) {
            method693(-50);
        }
        field1879++;
        return (arg2 + var3) / arg0 - var3;
    }
}
