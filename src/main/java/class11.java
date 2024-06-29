import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class11 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[I")
    public static int[] field211 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Lvd;")
    private static class222 field217 = class212.method1357("green:", 10731);

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
    public static int[] field212 = new int[1000];

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lvd;")
    public static class222 field202 = field217;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lvd;")
    public static class222 field215 = field217;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILab;)V")
    public static final void method101(int arg0, class3 arg1) {
        class116.field2222 = arg1;
        if (arg0 == -12446) {
            field204++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class176.field3301 != null) {
            class107.field1981 = 0;
        }
        field219++;
    }

    @OriginalMember(owner = "client!aj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field218++;
    }

    @OriginalMember(owner = "client!aj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field216++;
        if (class176.field3301 != null) {
            class186.field3433 = 0;
            class72.field1424 = -1;
            class165.field3116 = -1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class176.field3301 != null) {
            class186.field3433 = 0;
            class216.field4008 = arg0.getX();
            class131.field2544 = arg0.getY();
            class111.field2101 = class135.method849(true);
            if (arg0.isMetaDown()) {
                class6.field100 = 2;
                class107.field1981 = 2;
            } else {
                class6.field100 = 1;
                class107.field1981 = 1;
            }
        }
        field201++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Z")
    public static final boolean method102(int arg0, int arg1) {
        field209++;
        if (arg1 != -66) {
            field212 = null;
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
    public static final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field206++;
        if (class143.field2773 < 100) {
            class226.method1480(3633);
        }
        class53.method396(arg2, arg0, arg2 + arg3, arg0 + arg4);
        class199.method1264();
        class53.method399(arg2, arg0, arg3, arg4, 0);
        if (class143.field2773 < 100) {
            byte var5 = 20;
            int var6 = arg3 / 2 + arg2;
            int var7 = arg4 / 2 + arg0 - var5 - 18;
            class53.method401(var6 - 152, var7, 304, 34, 9179409);
            class53.method401(var6 - 151, var7 + 1, 302, 32, 0);
            class53.method399(var6 - 150, var7 + 2, class143.field2773 * 3, 30, 9179409);
            class53.method399(class143.field2773 * 3 + var6 - 150, var7 + 2, 300 - class143.field2773 * 3, 30, 0);
            class138.field2664.method889(class16.field419, var6, var5 + var7, 16777215, -1);
            return;
        }
        class146.field2790 = (int) ((double) (arg3 * 2) / class229.field4313);
        class91.field1712 = class175.field3287 - (int) ((double) arg3 / class229.field4313);
        class44.field921 = (int) ((double) (arg4 * 2) / class229.field4313);
        class218.field4053 = class122.field2334 - (int) ((double) arg4 / class229.field4313);
        int var8 = class175.field3287 - (int) ((double) arg3 / class229.field4313);
        int var9 = class122.field2334 - (int) ((double) arg4 / class229.field4313);
        int var10 = (int) ((double) arg3 / class229.field4313) + class175.field3287;
        int var11 = class122.field2334 + (int) ((double) arg4 / class229.field4313);
        class5.method52(0, arg0, arg2, var9, arg0 + arg4, var8, var10, arg2 + arg3, var11);
        class151.method972(arg0 + arg4, arg0, arg2, arg2 + arg3, var11, var9, var10, var8, arg1 ^ 0xFFFF0A);
        if (arg1 != 16776960) {
            method102(-63, 8);
        }
        if (class31.field653 > 0) {
            class31.field653--;
        }
        if (!class209.field3886) {
            return;
        }
        int var12 = arg2 + arg3 - 5;
        int var13 = arg0 + arg4 - 8;
        class91.field1717.method882(class234.method1531(new class222[] { class233.field4355, class56.method414(-116, class50.field973) }, -10949), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var17 = var13 - 15;
        int var16 = 16776960;
        if (var15 > 32768 && class122.field2331) {
            var16 = 16711680;
        }
        if (var15 > 65536 && !class122.field2331) {
            var16 = 16711680;
        }
        class91.field1717.method882(class234.method1531(new class222[] { class233.field4359, class56.method414(-120, var15), class208.field3872 }, -10949), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!aj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field203++;
        if (class176.field3301 != null) {
            class186.field3433 = 0;
            class72.field1424 = arg0.getX();
            class165.field3116 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!aj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class176.field3301 != null) {
            class186.field3433 = 0;
            class107.field1981 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field200++;
    }

    @OriginalMember(owner = "client!aj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field208++;
        if (class176.field3301 != null) {
            class186.field3433 = 0;
            class72.field1424 = arg0.getX();
            class165.field3116 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lva;")
    public static final class219 method104(int arg0) {
        field207++;
        class219 var1 = new class219();
        var1.field4057 = class185.field3429[0];
        if (arg0 != 2) {
            method104(-103);
        }
        var1.field4056 = class157.field3020[0];
        var1.field4060 = class223.field4182;
        var1.field4055 = class235.field4398;
        var1.field4059 = class102.field1892;
        var1.field4054 = class218.field4050[0];
        var1.field4061 = class83.field1584[0];
        var1.field4058 = class174.field3279[0];
        class160.method1009(true);
        return var1;
    }

    @OriginalMember(owner = "client!aj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class176.field3301 != null) {
            class186.field3433 = 0;
            class72.field1424 = arg0.getX();
            class165.field3116 = arg0.getY();
        }
        field214++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method105(boolean arg0) {
        field211 = null;
        field212 = null;
        field202 = null;
        field215 = null;
        field217 = null;
        if (arg0) {
            method104(-10);
        }
    }

    @OriginalMember(owner = "client!aj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field205++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
