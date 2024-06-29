import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class127 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lce;")
    private static class126 field2175 = class206.method1445(-7923, "Oct");

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Lce;")
    private static class126 field2184 = class206.method1445(-7923, "May");

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lce;")
    private static class126 field2178 = class206.method1445(-7923, "Sep");

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Lce;")
    private static class126 field2176 = class206.method1445(-7923, "Jul");

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Lce;")
    private static class126 field2183 = class206.method1445(-7923, "Apr");

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "Lce;")
    private static class126 field2187 = class206.method1445(-7923, "Jun");

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lce;")
    private static class126 field2182 = class206.method1445(-7923, "Dec");

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "[J")
    public static long[] field2194 = new long[32];

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "Z")
    public static boolean field2189 = false;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lce;")
    private static class126 field2190 = class206.method1445(-7923, "Feb");

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lce;")
    private static class126 field2185 = class206.method1445(-7923, "Aug");

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Lce;")
    private static class126 field2191 = class206.method1445(-7923, "Nov");

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lce;")
    private static class126 field2177 = class206.method1445(-7923, "Mar");

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Lce;")
    public static class126 field2186 = class206.method1445(-7923, "<img=0>");

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Lce;")
    private static class126 field2180 = class206.method1445(-7923, "Jan");

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "[Lce;")
    public static class126[] field2193 = new class126[] { field2180, field2190, field2177, field2183, field2184, field2187, field2176, field2185, field2178, field2175, field2191, field2182 };

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lcc;")
    public static class313 field2170;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "Lcc;")
    public static class313 field2196;

    @OriginalMember(owner = "client!aj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class294.field4879 != null) {
            class298.field4955 = 0;
            class199.field3396 = arg0.getX();
            class95.field1516 = arg0.getY();
            class157.field2824 = class261.method1765(16299);
            if (arg0.isMetaDown()) {
                class21.field276 = 2;
                class185.field3206 = 2;
            } else {
                class21.field276 = 1;
                class185.field3206 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        field2179++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)I", line = 54)
    public static final int method885(int arg0, boolean arg1) {
        double var2 = (double) ((arg0 & 0xFF96A3) >> 16) / 256.0D;
        field2188++;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var12 = 0.0D;
        double var14 = (var8 + var10) / 2.0D;
        if (!arg1) {
            method885(-47, true);
        }
        double var16 = 0.0D;
        if (var8 != var10) {
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var14 < 0.5D) {
                var16 = (var10 - var8) / (var8 + var10);
            }
            if (var14 >= 0.5D) {
                var16 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var22 = (int) (var18 * 256.0D);
        if (var21 > 243) {
            var20 >>= 0x4;
        } else if (var21 > 217) {
            var20 >>= 0x3;
        } else if (var21 > 192) {
            var20 >>= 0x2;
        } else if (var21 > 179) {
            var20 >>= 0x1;
        }
        return (var20 >> 5 << 7) + ((var22 >> 2 << 10) + (var21 >> 1));
    }

    @OriginalMember(owner = "client!aj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 155)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class294.field4879 != null) {
            class298.field4955 = 0;
            class254.field4265 = arg0.getX();
            class36.field526 = arg0.getY();
        }
        field2172++;
    }

    @OriginalMember(owner = "client!aj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 172)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class294.field4879 != null) {
            class298.field4955 = 0;
            class185.field3206 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        field2171++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 207)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2195++;
        if (class294.field4879 != null) {
            class298.field4955 = 0;
            class254.field4265 = arg0.getX();
            class36.field526 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!aj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 235)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2192++;
        if (class294.field4879 != null) {
            class298.field4955 = 0;
            class254.field4265 = -1;
            class36.field526 = -1;
        }
    }

    @OriginalMember(owner = "client!aj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 253)
    public final synchronized void focusLost(FocusEvent arg0) {
        field2174++;
        if (class294.field4879 != null) {
            class185.field3206 = 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 271)
    public final void focusGained(FocusEvent arg0) {
        field2173++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 281)
    public static void method886(int arg0) {
        field2185 = null;
        field2193 = null;
        field2196 = null;
        field2175 = null;
        field2177 = null;
        if (arg0 != -12075) {
            method886(-120);
        }
        field2183 = null;
        field2176 = null;
        field2194 = null;
        field2184 = null;
        field2180 = null;
        field2190 = null;
        field2178 = null;
        field2182 = null;
        field2170 = null;
        field2187 = null;
        field2186 = null;
        field2191 = null;
    }

    @OriginalMember(owner = "client!aj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 317)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class294.field4879 != null) {
            class298.field4955 = 0;
            class254.field4265 = arg0.getX();
            class36.field526 = arg0.getY();
        }
        field2181++;
    }

    @OriginalMember(owner = "client!aj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 355)
    public final void mouseClicked(MouseEvent arg0) {
        field2197++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
