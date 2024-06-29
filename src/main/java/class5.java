import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field82 = -1;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Ldc;")
    public static class22 field85 = new class22(5000);

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field89 = 0;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
    public static boolean field90 = false;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "[I")
    public static int[] field95 = new int[25];

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[J")
    public static long[] field92 = new long[100];

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lec;")
    public static class28 field96 = class28.method210(-46, " you requested@lre@ new recovery*6n@lre@questions)3@yel@ The requested change will occur*6non: @lre@");

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lcc;")
    public static class16 field94;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
    public static int[] field93;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
    public static final void method24(boolean arg0, int arg1) {
        field88++;
        if (class32.field689 == 0) {
            if (field82 >= 0) {
                field82 = arg1;
                class14.field251.method170(332, 0, arg1);
            }
        } else if (class37.field830 != null) {
            class87.field1939 = arg1;
        }
        if (!arg0) {
            method25(-68, 124);
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field91++;
    }

    @OriginalMember(owner = "client!ad", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field84++;
        if (class16.field302 != null) {
            class16.field305 = 0;
            class103.field2202 = -1;
            class112.field2423 = -1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field76++;
        if (class16.field302 != null) {
            class16.field305 = 0;
            class13.field230 = arg0.getX();
            class15.field285 = arg0.getY();
            class64.field1425 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                class4.field67 = 2;
                class34.field779 = 2;
            } else {
                class4.field67 = 1;
                class34.field779 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field77++;
        if (class16.field302 != null) {
            class16.field305 = 0;
            class103.field2202 = arg0.getX();
            class112.field2423 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lec;")
    public static final class28 method25(int arg0, int arg1) {
        if (arg0 != 6366) {
            field95 = null;
        }
        field81++;
        return class65.method521((byte) 81, arg1, 10, false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method26(byte arg0) {
        field95 = null;
        field92 = null;
        field96 = null;
        field93 = null;
        if (arg0 != -29) {
            method24(false, -117);
        }
        field94 = null;
        field85 = null;
    }

    @OriginalMember(owner = "client!ad", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field79++;
        if (class16.field302 != null) {
            class16.field305 = 0;
            class103.field2202 = arg0.getX();
            class112.field2423 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ad", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field87++;
        if (class16.field302 != null) {
            class16.field305 = 0;
            class103.field2202 = arg0.getX();
            class112.field2423 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)Ln;")
    public static final class78 method27(int arg0, int arg1) {
        field83++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (arg0 != 0) {
            return null;
        }
        if (class18.field372[var2] == null || class18.field372[var2][var3] == null) {
            boolean var4 = class37.method305(-1, var2);
            if (!var4) {
                return null;
            }
        }
        return class18.field372[var2][var3];
    }

    @OriginalMember(owner = "client!ad", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class16.field302 != null) {
            class16.field305 = 0;
            class34.field779 = 0;
        }
        field86++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
