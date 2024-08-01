import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("pd")
public class class143 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "pd", name = "i", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "pd", name = "w", descriptor = "Llf;")
    public static class109 field2768 = class35.method275("Ihr Spielkonto wird bereits benutzt)3", 2);

    @OriginalMember(owner = "pd", name = "x", descriptor = "Llf;")
    public static class109 field2769 = class35.method275("T", 2);

    @OriginalMember(owner = "pd", name = "a", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "pd", name = "b", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "pd", name = "c", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "pd", name = "f", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "pd", name = "g", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "pd", name = "j", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "pd", name = "k", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "pd", name = "l", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "pd", name = "m", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "pd", name = "n", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "pd", name = "o", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "pd", name = "p", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "pd", name = "q", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "pd", name = "r", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "pd", name = "t", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "pd", name = "u", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "pd", name = "v", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "pd", name = "s", descriptor = "J")
    public static long field2764;

    @OriginalMember(owner = "pd", name = "y", descriptor = "Lbg;")
    public static class18 field2770;

    @OriginalMember(owner = "pd", name = "e", descriptor = "[I")
    public static int[] field2750;

    @OriginalMember(owner = "pd", name = "h", descriptor = "[I")
    public static int[] field2753;

    @OriginalMember(owner = "pd", name = "d", descriptor = "[[B")
    public static byte[][] field2749;

    @OriginalMember(owner = "pd", name = "a", descriptor = "(I)V")
    public static final void method1009(int arg0) {
        if (arg0 != -29672) {
            field2764 = -95L;
        }
        class67.field1309.method1195((byte) 33);
        class16.field302 = null;
        field2751++;
        class84.field1711 = 1;
    }

    @OriginalMember(owner = "pd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class85.field1728 != null) {
            class67.field1303 = 0;
            class76.field1461 = arg0.getX();
            class45.field948 = arg0.getY();
            class106.field2112 = class123.method880(false);
            if (arg0.isMetaDown()) {
                class19.field413 = 2;
                class52.field1054 = 2;
            } else {
                class19.field413 = 1;
                class52.field1054 = 1;
            }
        }
        field2747++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "pd", name = "b", descriptor = "(I)V")
    public static final void method1010(int arg0) {
        if (arg0 != 4) {
            method1014(35, 98, null, (byte) 58, -92);
        }
        for (int var1 = 0; var1 < class98.field1967; var1++) {
            int var2 = class102.field2018[var1];
            class139 var3 = class183.field3444[var2];
            int var4 = class95.field1934.method598((byte) 77);
            if ((var4 & 0x8) != 0) {
                int var5 = class95.field1934.method594(arg0 ^ 0xFB);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class95.field1934.method598((byte) 71);
                if (var3.field3597 == var5 && var5 != -1) {
                    int var7 = client.method246(12, var5).field452;
                    if (var7 == 1) {
                        var3.field3558 = 0;
                        var3.field3595 = 0;
                        var3.field3570 = var6;
                        var3.field3594 = 0;
                    }
                    if (var7 == 2) {
                        var3.field3594 = 0;
                    }
                } else if (var5 == -1 || var3.field3597 == -1 || client.method246(12, var5).field459 >= client.method246(arg0 ^ 0x8, var3.field3597).field459) {
                    var3.field3558 = 0;
                    var3.field3595 = 0;
                    var3.field3570 = var6;
                    var3.field3594 = 0;
                    var3.field3597 = var5;
                    var3.field3560 = var3.field3563;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field3588 = class95.field1934.method562((byte) 87);
                var3.field3599 = 100;
            }
            if ((var4 & 0x20) != 0) {
                var3.field3596 = class95.field1934.method553(255);
                var3.field3589 = class95.field1934.method569(true);
            }
            if ((var4 & 0x2) != 0) {
                int var8 = class95.field1934.method593(arg0 ^ 0x7A);
                int var9 = class95.field1934.method590(28747);
                var3.method1271(var9, (byte) -123, var8, field2754);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2691 = class192.method1290((byte) -99, class95.field1934.method553(arg0 + 251));
                var3.field3544 = var3.field2691.field3190;
                var3.field3548 = var3.field2691.field3174;
                var3.field3616 = var3.field2691.field3169;
                var3.field3566 = var3.field2691.field3187;
                var3.field3569 = var3.field2691.field3155;
                var3.field3574 = var3.field2691.field3166;
                var3.field3559 = var3.field2691.field3172;
                var3.field3603 = var3.field2691.field3182;
                var3.field3612 = var3.field2691.field3175;
            }
            if ((var4 & 0x10) != 0) {
                var3.field3582 = class95.field1934.method569(true);
                if (var3.field3582 == 65535) {
                    var3.field3582 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                int var10 = class95.field1934.method590(28747);
                int var11 = class95.field1934.method598((byte) 96);
                var3.method1271(var11, (byte) -111, var10, field2754);
                var3.field3605 = field2754 + 300;
                var3.field3592 = class95.field1934.method573(arg0 + 24259);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3583 = class95.field1934.method594(255);
                int var12 = class95.field1934.method579((byte) -24);
                var3.field3607 = var12 >> 16;
                var3.field3598 = 0;
                var3.field3554 = 0;
                if (var3.field3583 == 65535) {
                    var3.field3583 = -1;
                }
                var3.field3615 = (var12 & 0xFFFF) + field2754;
                if (var3.field3615 > field2754) {
                    var3.field3598 = -1;
                }
            }
        }
        field2756++;
    }

    @OriginalMember(owner = "pd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1011(byte arg0, Component arg1) {
        field2760++;
        if (arg0 < 123) {
            method1014(-13, -45, null, (byte) -56, -91);
        }
        Method var2 = class99.field2005;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class205.field4019);
        arg1.addFocusListener(class205.field4019);
    }

    @OriginalMember(owner = "pd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class85.field1728 != null) {
            class52.field1054 = 0;
        }
        field2762++;
    }

    @OriginalMember(owner = "pd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2761++;
        if (class85.field1728 != null) {
            class67.field1303 = 0;
            class39.field834 = arg0.getX();
            class52.field1060 = arg0.getY();
        }
    }

    @OriginalMember(owner = "pd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2757++;
        if (class85.field1728 != null) {
            class67.field1303 = 0;
            class39.field834 = arg0.getX();
            class52.field1060 = arg0.getY();
        }
    }

    @OriginalMember(owner = "pd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2767++;
    }

    @OriginalMember(owner = "pd", name = "a", descriptor = "(B)V")
    public static void method1012(byte arg0) {
        field2753 = null;
        field2770 = null;
        if (arg0 == -23) {
            field2750 = null;
            field2749 = null;
            field2769 = null;
            field2768 = null;
        }
    }

    @OriginalMember(owner = "pd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2746++;
        if (class85.field1728 != null) {
            class67.field1303 = 0;
            class39.field834 = arg0.getX();
            class52.field1060 = arg0.getY();
        }
    }

    @OriginalMember(owner = "pd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class85.field1728 != null) {
            class67.field1303 = 0;
            class52.field1054 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2766++;
    }

    @OriginalMember(owner = "pd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2758++;
    }

    @OriginalMember(owner = "pd", name = "a", descriptor = "(Llf;I)I")
    public static final int method1013(class109 arg0, int arg1) {
        field2765++;
        if (class49.field1011 == 1) {
            return 7;
        } else if (arg0.method793((byte) -114, class153.field2918)) {
            return 1;
        } else if (arg0.method793((byte) -126, class55.field1100)) {
            return 1;
        } else if (arg0.method793((byte) -82, class144.field2779)) {
            return 2;
        } else if (arg0.method793((byte) -122, class71.field1389)) {
            return 2;
        } else if (arg0.method793((byte) -79, class29.field620)) {
            return 3;
        } else if (arg0.method793((byte) -97, class24.field545)) {
            return 4;
        } else if (arg0.method793((byte) -111, class139.field2702)) {
            return 4;
        } else {
            int var2 = -119 / ((-arg1 - 43) / 49);
            if (arg0.method793((byte) -85, class4.field43)) {
                return 5;
            } else if (arg0.method793((byte) -82, class23.field524)) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "pd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class85.field1728 != null) {
            class67.field1303 = 0;
            class39.field834 = -1;
            class52.field1060 = -1;
        }
        field2759++;
    }

    @OriginalMember(owner = "pd", name = "a", descriptor = "(IILu;BI)V")
    public static final void method1014(int arg0, int arg1, class184 arg2, byte arg3, int arg4) {
        field2755++;
        if (class157.field2955 == arg2 || class149.field2882 >= 400) {
            return;
        }
        if (arg3 != 32) {
            method1010(46);
        }
        class109 var5;
        if (arg2.field3485 == 0) {
            var5 = class36.method279(new class109[] { arg2.field3455, class19.method181(arg2.field3475, class157.field2955.field3475, arg3 ^ 0x7DAB), class29.field627, class92.field1903, class52.method345((byte) 85, arg2.field3475), class70.field1376 }, 119);
        } else {
            var5 = class36.method279(new class109[] { arg2.field3455, class29.field627, class179.field3381, class52.method345((byte) 85, arg2.field3485), class70.field1376 }, arg3 ^ 0x56);
        }
        if (class140.field2725 == 1) {
            class12.method81(arg4, arg1, class70.field1350, (short) 1, (long) arg0, arg3 + 468, class36.method279(new class109[] { class204.field4001, class107.field2120, var5 }, arg3 ^ 0xFFFFFFF9));
            class161.field3016++;
        } else if (!class123.field2360) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class206.field4049[var6] != null) {
                    short var8 = 0;
                    if (class206.field4049[var6].method778((byte) -121, class91.field1876)) {
                        if (class157.field2955.field3475 < arg2.field3475) {
                            var8 = 2000;
                        }
                        if (class157.field2955.field3463 != 0 && arg2.field3463 != 0) {
                            if (class157.field2955.field3463 == arg2.field3463) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class7.field108[var6]) {
                        var8 = 2000;
                    }
                    class187.field3557++;
                    boolean var9 = false;
                    short var10 = class178.field3352[var6];
                    short var11 = (short) (var8 + var10);
                    class12.method81(arg4, arg1, class206.field4049[var6], var11, (long) arg0, 500, class36.method279(new class109[] { class116.field2305, var5 }, 123));
                }
            }
        } else if ((class156.field2939 & 0x8) == 8) {
            class12.method81(arg4, arg1, class116.field2296, (short) 12, (long) arg0, 500, class36.method279(new class109[] { class170.field3161, class107.field2120, var5 }, -103));
            class51.field1038++;
        }
        for (int var7 = 0; var7 < class149.field2882; var7++) {
            if (class31.field726[var7] == 25) {
                class183.field3438[var7] = class36.method279(new class109[] { class116.field2305, var5 }, 119);
                return;
            }
        }
    }
}
