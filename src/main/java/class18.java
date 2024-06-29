import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class18 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "I")
    public static int field156 = 0;

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lt;")
    public static class31 field162 = class14.method84(109, "Helmet Shop");

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "Lt;")
    public static class31 field158 = class14.method84(117, "Altar");

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lt;")
    public static class31 field155 = class14.method84(121, "Rare Trees");

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "Lt;")
    public static class31 field157 = class14.method84(109, "Transportation");

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Lt;")
    public static class31 field161 = class14.method84(112, "Platebody Shop");

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "[I")
    public static int[] field154 = new int[128];

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lt;")
    public static class31 field153 = class14.method84(126, "Scimitar Shop");

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Lo;")
    public static class26 field163;

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "[I")
    public static int[] field159;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "[Lo;")
    public static class26[] field152;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V", line = 7)
    public static void method100(byte arg0) {
        field153 = null;
        field162 = null;
        field157 = null;
        field158 = null;
        field161 = null;
        field163 = null;
        if (arg0 != 120) {
            field156 = -104;
        }
        field152 = null;
        field159 = null;
        field155 = null;
        field154 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 27)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class6.field39 != null) {
            class30.field327 = -1;
            class13.field99 = -1;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 54)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 79)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class6.field39 != null) {
            class30.field327 = arg0.getX();
            class13.field99 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I[Lt;BI)Lt;", line = 101)
    public static final class31 method101(int arg0, class31[] arg1, byte arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg1[arg3 + var5] == null) {
                arg1[arg3 + var5] = class14.field116;
            }
            var4 += arg1[arg3 + var5].field339;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg2 != -45) {
            return (class31) null;
        }
        for (int var8 = 0; var8 < arg0; var8++) {
            class31 var9 = arg1[arg3 + var8];
            class9.method51(var9.field336, 0, var6, var7, var9.field339);
            var7 += var9.field339;
        }
        class31 var10 = new class31();
        var10.field339 = var4;
        var10.field336 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([Lt;B)Lt;", line = 146)
    public static final class31 method102(class31[] arg0, byte arg1) {
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        int var2 = -109 % ((arg1 - 43) / 40);
        return method101(arg0.length, arg0, (byte) -45, 0);
    }

    @OriginalMember(owner = "mapview!j", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 162)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class6.field39 != null) {
            class30.field327 = arg0.getX();
            class13.field99 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 185)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class6.field39 != null) {
            class34.field389 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 201)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class6.field39 != null) {
            class30.field327 = arg0.getX();
            class13.field99 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 223)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class6.field39 != null) {
            class27.field309 = arg0.getX();
            class1.field1 = arg0.getY();
            if (arg0.isMetaDown()) {
                class13.field102 = 2;
                class34.field389 = 2;
            } else {
                class13.field102 = 1;
                class34.field389 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
