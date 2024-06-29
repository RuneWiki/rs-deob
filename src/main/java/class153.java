import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class153 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Ldj;")
    private static class44 field2661 = class89.method650(255, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2656 = -1;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Z")
    public static boolean field2669 = false;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Ldj;")
    public static class44 field2672 = class89.method650(255, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Ldj;")
    public static class44 field2670 = field2661;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
    public static int[] field2674;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[Lod;")
    public static class155[] field2660;

    @OriginalMember(owner = "client!ob", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2657++;
    }

    @OriginalMember(owner = "client!ob", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class119.field2117 != null) {
            class30.field535 = 0;
            class228.field4279 = arg0.getX();
            class39.field693 = arg0.getY();
        }
        field2667++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    public static final void method985(int arg0, int arg1) {
        if (class101.field1851 == 0) {
            class119.field2125.method1213(-88, arg1);
        } else {
            class19.field322 = arg1;
        }
        if (arg0 == 7583) {
            field2663++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I")
    public static final int method986(int arg0, int arg1) {
        if (arg0 != 5) {
            field2670 = null;
        }
        field2668++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method987(int arg0) {
        field2670 = null;
        int var1 = 102 % ((arg0 + 53) / 38);
        field2661 = null;
        field2660 = null;
        field2674 = null;
        field2672 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBII)V")
    public static final void method988(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (class154.field2679 < 100) {
            class235.method1533(112);
        }
        class99.method707(arg1, arg3, arg0 + arg1, arg3 + arg4);
        class206.method1345();
        class99.method688(arg1, arg3, arg0, arg4, 0);
        field2671++;
        if (class154.field2679 < 100) {
            int var5 = arg0 / 2 + arg1;
            byte var6 = 20;
            int var7 = arg3 + arg4 / 2 - var6 - 18;
            class99.method696(var5 - 152, var7, 304, 34, 9179409);
            class99.method696(var5 - 151, var7 + 1, 302, 32, 0);
            class99.method688(var5 - 150, var7 + 2, class154.field2679 * 3, 30, 9179409);
            class99.method688(var5 + class154.field2679 * 3 - 150, var7 - -2, 300 - class154.field2679 * 3, 30, 0);
            class150.field2620.method401(class150.field2614, var5, var6 + var7, 16777215, -1);
            return;
        }
        class237.field4405 = (int) ((double) (arg0 * 2) / class202.field3601);
        class44.field821 = class3.field46 - (int) ((double) arg4 / class202.field3601);
        class151.field2625 = class2.field38 - (int) ((double) arg0 / class202.field3601);
        int var8 = class2.field38 - (int) ((double) arg0 / class202.field3601);
        class199.field3518 = (int) ((double) (arg4 * 2) / class202.field3601);
        if (arg2 != 104) {
            field2669 = false;
        }
        int var9 = class3.field46 - (int) ((double) arg4 / class202.field3601);
        int var10 = (int) ((double) arg0 / class202.field3601) + class2.field38;
        int var11 = (int) ((double) arg4 / class202.field3601) + class3.field46;
        class54.method389(arg3, arg0 + arg1, -14116, var9, var10, var11, var8, arg3 + arg4, arg1);
        class172.method1090(var8, var10, arg1 + arg0, arg3 + arg4, arg3, arg1, var9, 14944, var11);
        if (class77.field1493 > 0) {
            class77.field1493--;
        }
        if (!class47.field878) {
            return;
        }
        int var12 = arg0 + arg1 - 5;
        int var13 = arg4 + arg3 - 8;
        class74.field1424.method426(class70.method555(new class44[] { class120.field2128, class199.method1287(class220.field3995, -1) }, arg2 - 107), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 32768 && class33.field583) {
            var16 = 16711680;
        }
        if (var15 > 65536 && !class33.field583) {
            var16 = 16711680;
        }
        class74.field1424.method426(class70.method555(new class44[] { class64.field1183, class199.method1287(var15, -1), class80.field1549 }, -3), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!ob", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class119.field2117 != null) {
            class30.field535 = 0;
            class228.field4279 = -1;
            class39.field693 = -1;
        }
        field2654++;
    }

    @OriginalMember(owner = "client!ob", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field2658++;
        if (class119.field2117 != null) {
            class46.field871 = 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
    public static final void method989() {
        int var0 = class22.field370[class84.field1635];
        class130[] var1 = class22.field365[class84.field1635];
        class190.field3292 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class130 var3 = var1[var2];
            if (var3.field2334 == 1) {
                int var4 = var3.field2327 + class59.field1108 - class157.field2735;
                if (var4 >= 0 && var4 <= class59.field1108 + class59.field1108) {
                    int var5 = var3.field2312 + class59.field1108 - class98.field1799;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field2322 + class59.field1108 - class98.field1799;
                    if (var6 > class59.field1108 + class59.field1108) {
                        var6 = class59.field1108 + class59.field1108;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class162.field2809[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class191.field3298 - var3.field2321;
                        if (var8 > 32) {
                            var3.field2311 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field2311 = 2;
                            var8 = -var8;
                        }
                        var3.field2318 = (var3.field2314 - class200.field3546 << 8) / var8;
                        var3.field2315 = (var3.field2329 - class200.field3546 << 8) / var8;
                        var3.field2317 = (var3.field2330 - field2666 << 8) / var8;
                        var3.field2325 = (var3.field2316 - field2666 << 8) / var8;
                        class59.field1107[class190.field3292++] = var3;
                    }
                }
            } else if (var3.field2334 == 2) {
                int var9 = var3.field2312 + class59.field1108 - class98.field1799;
                if (var9 >= 0 && var9 <= class59.field1108 + class59.field1108) {
                    int var10 = var3.field2327 + class59.field1108 - class157.field2735;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field2319 + class59.field1108 - class157.field2735;
                    if (var11 > class59.field1108 + class59.field1108) {
                        var11 = class59.field1108 + class59.field1108;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class162.field2809[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class200.field3546 - var3.field2314;
                        if (var13 > 32) {
                            var3.field2311 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field2311 = 4;
                            var13 = -var13;
                        }
                        var3.field2333 = (var3.field2321 - class191.field3298 << 8) / var13;
                        var3.field2323 = (var3.field2335 - class191.field3298 << 8) / var13;
                        var3.field2317 = (var3.field2330 - field2666 << 8) / var13;
                        var3.field2325 = (var3.field2316 - field2666 << 8) / var13;
                        class59.field1107[class190.field3292++] = var3;
                    }
                }
            } else if (var3.field2334 == 4) {
                int var14 = var3.field2330 - field2666;
                if (var14 > 128) {
                    int var15 = var3.field2312 + class59.field1108 - class98.field1799;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field2322 + class59.field1108 - class98.field1799;
                    if (var16 > class59.field1108 + class59.field1108) {
                        var16 = class59.field1108 + class59.field1108;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field2327 + class59.field1108 - class157.field2735;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field2319 + class59.field1108 - class157.field2735;
                        if (var18 > class59.field1108 + class59.field1108) {
                            var18 = class59.field1108 + class59.field1108;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class162.field2809[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field2311 = 5;
                            var3.field2333 = (var3.field2321 - class191.field3298 << 8) / var14;
                            var3.field2323 = (var3.field2335 - class191.field3298 << 8) / var14;
                            var3.field2318 = (var3.field2314 - class200.field3546 << 8) / var14;
                            var3.field2315 = (var3.field2329 - class200.field3546 << 8) / var14;
                            class59.field1107[class190.field3292++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Lv;")
    public static final class220 method990(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        return var3 == null || var3.field1304 == null ? null : var3.field1304;
    }

    @OriginalMember(owner = "client!ob", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class119.field2117 != null) {
            class30.field535 = 0;
            class228.field4279 = arg0.getX();
            class39.field693 = arg0.getY();
        }
        field2673++;
    }

    @OriginalMember(owner = "client!ob", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2653++;
        if (class119.field2117 != null) {
            class30.field535 = 0;
            class121.field2154 = arg0.getX();
            class196.field3466 = arg0.getY();
            class45.field859 = class27.method193((byte) 97);
            if (arg0.isMetaDown()) {
                class61.field1137 = 2;
                class46.field871 = 2;
            } else {
                class61.field1137 = 1;
                class46.field871 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
    public static final boolean method991(int arg0) {
        field2664++;
        return ~class101.field1851 == arg0 ? class119.field2125.method1216((byte) 68) : true;
    }

    @OriginalMember(owner = "client!ob", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2665++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ob", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class119.field2117 != null) {
            class30.field535 = 0;
            class228.field4279 = arg0.getX();
            class39.field693 = arg0.getY();
        }
        field2662++;
    }

    @OriginalMember(owner = "client!ob", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2675++;
        if (class119.field2117 != null) {
            class30.field535 = 0;
            class46.field871 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
