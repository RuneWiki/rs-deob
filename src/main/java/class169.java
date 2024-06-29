import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class169 extends class391 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!cda", name = "I", descriptor = "Lbg;")
    private class464 field2321 = new class464();

    @OriginalMember(owner = "client!cda", name = "J", descriptor = "Lbg;")
    private class464 field2322 = new class464();

    @OriginalMember(owner = "client!cda", name = "N", descriptor = "Z")
    private boolean field2326;

    @OriginalMember(owner = "client!cda", name = "y", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
    private int field2294;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    private int field2299;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!cda", name = "x", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!cda", name = "z", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!cda", name = "A", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!cda", name = "B", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!cda", name = "C", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!cda", name = "D", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!cda", name = "F", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!cda", name = "G", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!cda", name = "H", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!cda", name = "K", descriptor = "I")
    private int field2323;

    @OriginalMember(owner = "client!cda", name = "L", descriptor = "I")
    private int field2324;

    @OriginalMember(owner = "client!cda", name = "M", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!cda", name = "O", descriptor = "Ljava/awt/Component;")
    private Component field2327;

    @OriginalMember(owner = "client!cda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 7)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2310++;
        int var2 = this.method1095((byte) -53, arg0);
        if (var2 == 1) {
            this.method1093(0, arg0.getY(), arg0.getClickCount(), (byte) 82, arg0.getX());
        } else if (var2 == 4) {
            this.method1093(2, arg0.getY(), arg0.getClickCount(), (byte) 82, arg0.getX());
        } else if (var2 == 2) {
            this.method1093(1, arg0.getY(), arg0.getClickCount(), (byte) 82, arg0.getX());
        }
        this.field2323 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 33)
    private final void method1087(int arg0, Component arg1) {
        this.method1088(-115);
        field2319++;
        if (arg0 != 0) {
            this.mouseMoved(null);
        }
        this.field2327 = arg1;
        this.field2327.addMouseListener(this);
        this.field2327.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!cda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method1099((byte) -99, arg0.getX(), arg0.getY());
        field2320++;
    }

    @OriginalMember(owner = "client!cda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 62)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2300++;
        this.method1099((byte) -122, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!cda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 70)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field2312++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "(I)V", line = 81)
    private final void method1088(int arg0) {
        field2317++;
        if (this.field2327 == null) {
            return;
        }
        this.field2327.removeMouseMotionListener(this);
        this.field2327.removeMouseListener(this);
        if (arg0 >= -49) {
            return;
        }
        this.field2314 = this.field2294 = this.field2299 = 0;
        this.field2325 = this.field2324 = this.field2323 = 0;
        this.field2321 = null;
        this.field2327 = null;
        this.field2322 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)I", line = 104)
    public final int method1089(byte arg0) {
        field2308++;
        if (arg0 != -63) {
            this.field2321 = null;
        }
        return this.field2294;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(B)Z", line = 115)
    public final boolean method1090(byte arg0) {
        field2305++;
        if (arg0 != 46) {
            this.method1090((byte) 0);
        }
        return (this.field2299 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "(I)Z", line = 126)
    public final boolean method1091(int arg0) {
        if (arg0 != -1) {
            this.method1088(-75);
        }
        field2309++;
        return (this.field2299 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V", line = 137)
    public final synchronized void method1092(int arg0) {
        this.field2294 = this.field2324;
        this.field2299 = this.field2323;
        field2302++;
        if (arg0 != 0) {
            field2311 = 55;
        }
        this.field2314 = this.field2325;
        class464 var2 = this.field2321;
        this.field2321 = this.field2322;
        this.field2322 = var2;
        this.field2322.method2767((byte) -19);
    }

    @OriginalMember(owner = "client!cda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 161)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1099((byte) -101, arg0.getX(), arg0.getY());
        field2318++;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIBI)V", line = 169)
    private final void method1093(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2295++;
        class109 var6 = new class109();
        var6.field1316 = arg1;
        var6.field1318 = arg2;
        var6.field1319 = arg4;
        var6.field1315 = arg0;
        var6.field1323 = class479.method2864((byte) -44);
        this.field2322.method2770((byte) -13, var6);
        if (arg3 != 82) {
            this.field2294 = -48;
        }
    }

    @OriginalMember(owner = "client!cda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 190)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2297++;
        int var2 = this.method1095((byte) -81, arg0);
        if ((var2 & this.field2323) == 0) {
            var2 = this.field2323;
        }
        if ((var2 & 0x1) != 0) {
            this.method1093(3, arg0.getY(), arg0.getClickCount(), (byte) 82, arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1093(5, arg0.getY(), arg0.getClickCount(), (byte) 82, arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1093(4, arg0.getY(), arg0.getClickCount(), (byte) 82, arg0.getX());
        }
        this.field2323 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 218)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2303++;
        this.method1099((byte) -127, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "(I)I", line = 233)
    public final int method1094(int arg0) {
        field2307++;
        if (arg0 > -69) {
            this.field2321 = null;
        }
        return this.field2314;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 248)
    private final int method1095(byte arg0, MouseEvent arg1) {
        field2315++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        if (arg0 > -51) {
            this.mouseClicked(null);
        }
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V", line = 285)
    public final void method1096(int arg0) {
        this.method1088(-93);
        field2316++;
        if (arg0 != -1) {
            this.field2314 = 71;
        }
    }

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "(I)Les;", line = 296)
    public final class382 method1097(int arg0) {
        field2304++;
        if (arg0 != -3) {
            this.method1087(99, null);
        }
        return (class382) this.field2321.method2762((byte) -16);
    }

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)Z", line = 307)
    public final boolean method1098(int arg0) {
        if (arg0 == 0) {
            field2296++;
            return (this.field2299 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BII)V", line = 319)
    private final void method1099(byte arg0, int arg1, int arg2) {
        this.field2324 = arg2;
        if (arg0 >= -87) {
            this.method1090((byte) -31);
        }
        this.field2325 = arg1;
        field2306++;
        if (this.field2326) {
            this.method1093(-1, arg2, 0, (byte) 82, arg1);
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 348)
    public class169(Component arg0, boolean arg1) {
        this.method1087(0, arg0);
        this.field2326 = arg1;
    }
}
