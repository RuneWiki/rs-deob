import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class107 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Led;")
    private static class43 field2041 = class191.method1219("go back to the main RuneScape webpage", false);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Led;")
    public static class43 field2035 = field2041;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "Led;")
    public static class43 field2042 = class191.method1219("Lade Sprites )2 ", false);

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Lob;")
    public static class129 field2052 = null;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "[Z")
    public static boolean[] field2056 = new boolean[100];

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Led;")
    public static class43 field2049 = class191.method1219(": ", false);

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Led;")
    public static class43 field2055 = class191.method1219(" <col=00ff80>", false);

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "[Lnb;")
    public static class120[] field2057 = new class120[1000];

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
    public static int[] field2038 = new int[128];

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "Led;")
    public static class43 field2059 = class191.method1219("Bitte wenden Sie sich an den Kundendienst)3", false);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Lnb;")
    public static class120 field2044;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "[I")
    public static int[] field2050;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "[Lta;")
    public static class173[] field2058;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLna;)V")
    public static final void method661(boolean arg0, class119 arg1) {
        field2048++;
        arg1.field2344 = arg1.field2326;
        if (arg1.field2377 == 0) {
            arg1.field2317 = 0;
            return;
        }
        if (arg1.field2351 != -1 && arg1.field2355 == 0) {
            class205 var2 = class175.method1101(arg1.field2351, true);
            if (arg1.field2348 > 0 && var2.field4005 == 0) {
                arg1.field2317++;
                return;
            }
            if (arg1.field2348 <= 0 && var2.field4002 == 0) {
                arg1.field2317++;
                return;
            }
        }
        int var3 = arg1.field2347;
        int var4 = arg1.field2328;
        int var5 = arg1.field2357[arg1.field2377 - 1] * 128 + arg1.field2327 * 64;
        int var6 = arg1.field2335[arg1.field2377 - 1] * 128 + arg1.field2327 * 64;
        if (arg0) {
            return;
        }
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field2328 = var6;
            arg1.field2347 = var5;
            return;
        }
        if (var3 >= var5) {
            if (var3 > var5) {
                if (var6 > var4) {
                    arg1.field2372 = 768;
                } else if (var4 > var6) {
                    arg1.field2372 = 256;
                } else {
                    arg1.field2372 = 512;
                }
            } else if (var4 < var6) {
                arg1.field2372 = 1024;
            } else if (var4 > var6) {
                arg1.field2372 = 0;
            }
        } else if (var4 < var6) {
            arg1.field2372 = 1280;
        } else if (var4 <= var6) {
            arg1.field2372 = 1536;
        } else {
            arg1.field2372 = 1792;
        }
        int var7 = arg1.field2378;
        boolean var8 = true;
        int var9 = 4;
        int var10 = arg1.field2372 - arg1.field2352 & 0x7FF;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var7 = arg1.field2323;
        } else if (var10 >= 256 && var10 < 768) {
            var7 = arg1.field2334;
        } else if (var10 >= -768 && var10 <= -256) {
            var7 = arg1.field2361;
        }
        if (var7 == -1) {
            var7 = arg1.field2323;
        }
        arg1.field2344 = var7;
        if (arg1 instanceof class77) {
            var8 = ((class77) arg1).field1539.field1192;
        }
        if (var8) {
            if (arg1.field2372 != arg1.field2352 && arg1.field2380 == -1 && arg1.field2322 != 0) {
                var9 = 2;
            }
            if (arg1.field2377 > 2) {
                var9 = 6;
            }
            if (arg1.field2377 > 3) {
                var9 = 8;
            }
            if (arg1.field2317 > 0 && arg1.field2377 > 1) {
                var9 = 8;
                arg1.field2317--;
            }
        } else {
            if (arg1.field2377 > 1) {
                var9 = 6;
            }
            if (arg1.field2377 > 2) {
                var9 = 8;
            }
            if (arg1.field2317 > 0 && arg1.field2377 > 1) {
                arg1.field2317--;
                var9 = 8;
            }
        }
        if (arg1.field2330[arg1.field2377 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var6) {
            arg1.field2328 += var9;
            if (arg1.field2328 > var6) {
                arg1.field2328 = var6;
            }
        } else if (var4 > var6) {
            arg1.field2328 -= var9;
            if (arg1.field2328 < var6) {
                arg1.field2328 = var6;
            }
        }
        if (var5 > var3) {
            arg1.field2347 += var9;
            if (var5 < arg1.field2347) {
                arg1.field2347 = var5;
            }
        } else if (var5 < var3) {
            arg1.field2347 -= var9;
            if (arg1.field2347 < var5) {
                arg1.field2347 = var5;
            }
        }
        if (arg1.field2347 == var5 && arg1.field2328 == var6) {
            arg1.field2377--;
            if (arg1.field2348 > 0) {
                arg1.field2348--;
            }
        }
        if (var9 >= 8 && arg1.field2344 == arg1.field2323 && arg1.field2336 != -1) {
            arg1.field2344 = arg1.field2336;
        }
    }

    @OriginalMember(owner = "client!lg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2043++;
        if (class102.field1942 != null) {
            class156.field3157 = 0;
        }
    }

    @OriginalMember(owner = "client!lg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class102.field1942 != null) {
            class23.field450 = 0;
            class193.field3755 = -1;
            class12.field178 = -1;
        }
        field2039++;
    }

    @OriginalMember(owner = "client!lg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2046++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class102.field1942 != null) {
            class23.field450 = 0;
            class116.field2276 = arg0.getX();
            class95.field1852 = arg0.getY();
            class16.field264 = class52.method315((byte) -128);
            if (arg0.isMetaDown()) {
                class43.field840 = 2;
                class156.field3157 = 2;
            } else {
                class43.field840 = 1;
                class156.field3157 = 1;
            }
        }
        field2037++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2053++;
        if (class102.field1942 != null) {
            class23.field450 = 0;
            class156.field3157 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method662(int arg0) {
        field2035 = null;
        field2058 = null;
        field2044 = null;
        field2038 = null;
        field2057 = null;
        field2056 = null;
        if (arg0 != 1) {
            field2056 = null;
        }
        field2042 = null;
        field2041 = null;
        field2050 = null;
        field2055 = null;
        field2049 = null;
        field2059 = null;
        field2052 = null;
    }

    @OriginalMember(owner = "client!lg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2054++;
    }

    @OriginalMember(owner = "client!lg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2047++;
        if (class102.field1942 != null) {
            class23.field450 = 0;
            class193.field3755 = arg0.getX();
            class12.field178 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!lg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class102.field1942 != null) {
            class23.field450 = 0;
            class193.field3755 = arg0.getX();
            class12.field178 = arg0.getY();
        }
        field2051++;
    }

    @OriginalMember(owner = "client!lg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class102.field1942 != null) {
            class23.field450 = 0;
            class193.field3755 = arg0.getX();
            class12.field178 = arg0.getY();
        }
        field2040++;
    }
}
