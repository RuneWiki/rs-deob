import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "Lt;")
    public static class31 field77 = class11.method64(-81, "Water Source");

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "Lt;")
    public static class31 field74 = class11.method64(-114, "Next page");

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Lha;")
    public static class15 field75 = null;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Lt;")
    public static class31 field76 = class11.method64(84, "loc)3dat");

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "Lt;")
    public static class31 field78 = class11.method64(-123, "floorcol)3dat");

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lt;")
    public static class31 field80 = class11.method64(-84, "Kebab Seller");

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 10)
    public static void method29(int arg0) {
        field74 = null;
        field77 = null;
        field80 = null;
        field76 = null;
        field78 = null;
        if (arg0 != 2) {
            method31(null, null);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I[BII)Lt;", line = 25)
    public static final class31 method30(int arg0, byte[] arg1, int arg2, int arg3) {
        class31 var4 = new class31();
        var4.field349 = new byte[arg0];
        var4.field345 = 0;
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field349[var4.field345++] = arg1[var5];
            }
        }
        if (arg2 != -30188) {
            field79 = 27;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 61)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 72)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class27.field301 != null) {
            class15.field224 = arg0.getX();
            class10.field167 = arg0.getY();
            if (arg0.isMetaDown()) {
                class6.field118 = 2;
                class26.field289 = 2;
            } else {
                class6.field118 = 1;
                class26.field289 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 115)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class27.field301 != null) {
            class26.field289 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lba;", line = 136)
    public static final class4 method31(Throwable arg0, String arg1) {
        class4 var2;
        if (arg0 instanceof class4) {
            var2 = (class4) arg0;
            var2.field107 = var2.field107 + ' ' + arg1;
        } else {
            var2 = new class4(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)[Lka;", line = 157)
    public static final class21[] method32(byte arg0) {
        class21[] var1 = new class21[mapview.field20];
        int var2 = 55 / ((-arg0 - 76) / 49);
        for (int var3 = 0; var3 < mapview.field20; var3++) {
            class21 var4 = var1[var3] = new class21();
            var4.field262 = class25.field285;
            var4.field258 = field79;
            var4.field260 = class6.field115[var3];
            var4.field255 = class10.field166[var3];
            var4.field261 = class32.field364[var3];
            var4.field257 = class18.field245[var3];
            var4.field256 = class33.field390;
            var4.field259 = class28.field309[var3];
        }
        class17.method99((byte) 91);
        return var1;
    }

    @OriginalMember(owner = "mapview!a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 191)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class27.field301 != null) {
            class30.field334 = arg0.getX();
            mapview.field4 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 208)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class27.field301 != null) {
            class30.field334 = arg0.getX();
            mapview.field4 = arg0.getY();
        }
    }

    @OriginalMember(owner = "mapview!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 224)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class27.field301 != null) {
            class30.field334 = -1;
            mapview.field4 = -1;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 251)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class27.field301 != null) {
            class30.field334 = arg0.getX();
            mapview.field4 = arg0.getY();
        }
    }
}
