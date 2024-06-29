import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class275 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field4379 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field4386 = 0;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field4392 = 1;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field4387 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lhc;")
    public static class235 field4382;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[Led;")
    public static class186[] field4385;

    @OriginalMember(owner = "client!rb", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4389++;
        if (class62.field1062 != null) {
            class189.field2925 = 0;
            class22.field309 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rb", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4378++;
        if (class62.field1062 != null) {
            class189.field2925 = 0;
            class18.field269 = arg0.getX();
            class292.field4604 = arg0.getY();
            class7.field161 = class134.method924(false);
            if (arg0.isMetaDown()) {
                class181.field2828 = 2;
                class22.field309 = 2;
            } else {
                class181.field2828 = 1;
                class22.field309 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rb", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4377++;
        if (class62.field1062 != null) {
            class189.field2925 = 0;
            class145.field2312 = arg0.getX();
            class250.field4032 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rb", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class62.field1062 != null) {
            class189.field2925 = 0;
            class145.field2312 = -1;
            class250.field4032 = -1;
        }
        field4390++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1847(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class142.field2166 = arg1;
        class280.field4424 = arg2;
        class79.field1320 = arg3;
        class116.field1899 = new class6[arg0][class142.field2166][class280.field4424];
        class5.field60 = new int[arg0][class142.field2166 + 1][class280.field4424 + 1];
        if (arg4) {
            class52.field798 = new class6[1][class142.field2166][class280.field4424];
            class4.field29 = new int[class142.field2166][class280.field4424];
            class116.field1890 = new int[1][class142.field2166 + 1][class280.field4424 + 1];
        } else {
            class52.field798 = null;
            class4.field29 = null;
            class116.field1890 = null;
        }
        class284.method1912(false);
        class41.field590 = new class163[500];
        class196.field3099 = 0;
        class218.field3366 = new class163[500];
        class16.field250 = 0;
        class143.field2192 = new int[arg0][class142.field2166 + 1][class280.field4424 + 1];
        class199.field3125 = new class293[5000];
        class160.field2480 = 0;
        class110.field1803 = new class293[100];
        class94.field1605 = new boolean[class79.field1320 + class79.field1320 + 1][class79.field1320 + class79.field1320 + 1];
        class205.field3196 = new boolean[class79.field1320 + class79.field1320 + 2][class79.field1320 + class79.field1320 + 2];
        class160.field2502 = new byte[arg0][class142.field2166][class280.field4424];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Lik;")
    public static final class267 method1848(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class267 var4 = var3.field124;
            var3.field124 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!rb", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4381++;
    }

    @OriginalMember(owner = "client!rb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4383++;
        if (class62.field1062 != null) {
            class22.field309 = 0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4384++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1849(int arg0) {
        field4385 = null;
        if (arg0 != -1) {
            field4379 = -31;
        }
        field4382 = null;
    }

    @OriginalMember(owner = "client!rb", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4388++;
        if (class62.field1062 != null) {
            class189.field2925 = 0;
            class145.field2312 = arg0.getX();
            class250.field4032 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!rb", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4380++;
        if (class62.field1062 != null) {
            class189.field2925 = 0;
            class145.field2312 = arg0.getX();
            class250.field4032 = arg0.getY();
        }
    }
}
