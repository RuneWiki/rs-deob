import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class159 extends class725 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "Lfh;")
    private class653 field2180 = new class653();

    @OriginalMember(owner = "client!wea", name = "C", descriptor = "Lfh;")
    private class653 field2183 = new class653();

    @OriginalMember(owner = "client!wea", name = "I", descriptor = "Z")
    private boolean field2189;

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "Z")
    public static boolean field2165 = false;

    @OriginalMember(owner = "client!wea", name = "A", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
    private int field2175;

    @OriginalMember(owner = "client!wea", name = "v", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!wea", name = "w", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!wea", name = "x", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!wea", name = "y", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
    private int field2184;

    @OriginalMember(owner = "client!wea", name = "E", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!wea", name = "F", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!wea", name = "G", descriptor = "I")
    private int field2187;

    @OriginalMember(owner = "client!wea", name = "H", descriptor = "I")
    private int field2188;

    @OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!wea", name = "L", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!wea", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field2191;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 4)
    private final int method1108(int arg0, MouseEvent arg1) {
        field2192++;
        if (arg0 < 46) {
            this.method1114(42);
        }
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
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

    @OriginalMember(owner = "client!wea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 41)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method1116(arg0.getY(), true, arg0.getX());
        field2177++;
    }

    @OriginalMember(owner = "client!wea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 49)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method1116(arg0.getY(), true, arg0.getX());
        field2182++;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)Z", line = 57)
    public final boolean method1109(boolean arg0) {
        if (arg0) {
            this.method1112(null, 23);
        }
        field2179++;
        return (this.field2161 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 70)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2164++;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZIIII)V", line = 81)
    private final void method1110(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2186++;
        class618 var6 = new class618();
        var6.field8520 = arg3;
        var6.field8515 = arg4;
        var6.field8521 = arg1;
        var6.field8517 = arg2;
        var6.field8516 = class446.method2525(500);
        this.field2183.method3671(var6, false);
        if (!arg0) {
            this.method1118((byte) -45);
        }
    }

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "(I)V", line = 101)
    public final synchronized void method1111(int arg0) {
        this.field2161 = this.field2188;
        field2185++;
        this.field2175 = this.field2187;
        this.field2166 = this.field2184;
        class653 var2 = this.field2180;
        this.field2180 = this.field2183;
        if (arg0 > -94) {
            this.mouseReleased(null);
        }
        this.field2183 = var2;
        this.field2183.method3668(0);
    }

    @OriginalMember(owner = "client!wea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 126)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2178++;
        this.method1116(arg0.getY(), true, arg0.getX());
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 138)
    private final void method1112(Component arg0, int arg1) {
        field2174++;
        this.method1120(true);
        this.field2191 = arg0;
        if (arg1 != 12198) {
            this.method1119(15);
        }
        this.field2191.addMouseListener(this);
        this.field2191.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!wea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 154)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2173++;
        int var2 = this.method1108(65, arg0);
        if (var2 == 1) {
            this.method1110(true, 0, arg0.getClickCount(), arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method1110(true, 2, arg0.getClickCount(), arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method1110(true, 1, arg0.getClickCount(), arg0.getY(), arg0.getX());
        }
        this.field2188 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(B)Z", line = 180)
    public final boolean method1113(byte arg0) {
        if (arg0 != 65) {
            this.field2188 = -13;
        }
        field2163++;
        return (this.field2161 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 194)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2167++;
        int var2 = this.method1108(119, arg0);
        if ((var2 & this.field2188) == 0) {
            var2 = this.field2188;
        }
        if ((var2 & 0x1) != 0) {
            this.method1110(true, 3, arg0.getClickCount(), arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method1110(true, 5, arg0.getClickCount(), arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method1110(true, 4, arg0.getClickCount(), arg0.getY(), arg0.getX());
        }
        this.field2188 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)Lcia;", line = 226)
    public final class614 method1114(int arg0) {
        if (arg0 != -28128) {
            field2181 = -112;
        }
        field2190++;
        return (class614) this.field2180.method3665(arg0 + 51418);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)I", line = 237)
    public final int method1115(int arg0) {
        if (arg0 != 4) {
            this.field2184 = -109;
        }
        field2172++;
        return this.field2166;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZI)V", line = 248)
    private final void method1116(int arg0, boolean arg1, int arg2) {
        this.field2184 = arg0;
        field2176++;
        if (!arg1) {
            field2165 = true;
        }
        this.field2187 = arg2;
        if (this.field2189) {
            this.method1110(true, -1, 0, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "(I)V", line = 268)
    public final void method1117(int arg0) {
        this.method1120(true);
        field2170++;
        if (arg0 != 2) {
            this.field2183 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)I", line = 279)
    public final int method1118(byte arg0) {
        if (arg0 <= 121) {
            this.field2188 = -104;
        }
        field2168++;
        return this.field2175;
    }

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "(I)Z", line = 291)
    public final boolean method1119(int arg0) {
        field2171++;
        if (arg0 != -23098) {
            this.field2191 = null;
        }
        return (this.field2161 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 355)
    public class159(Component arg0, boolean arg1) {
        this.method1112(arg0, 12198);
        this.field2189 = arg1;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(Z)V", line = 308)
    private final void method1120(boolean arg0) {
        field2162++;
        if (this.field2191 == null) {
            return;
        }
        this.field2191.removeMouseMotionListener(this);
        this.field2191.removeMouseListener(this);
        this.field2191 = null;
        this.field2187 = this.field2184 = this.field2188 = 0;
        this.field2175 = this.field2166 = this.field2161 = 0;
        this.field2180 = null;
        this.field2183 = null;
        if (!arg0) {
            this.method1111(-32);
        }
    }

    @OriginalMember(owner = "client!wea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 348)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1116(arg0.getY(), true, arg0.getX());
        field2169++;
    }
}
