import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class154 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field2509 = 100;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2513 = new String[100];

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field2505 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!a", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2503++;
        if (class210.field3374 != null) {
            class165.field2689 = 0;
            class29.field504 = arg0.getX();
            class189.field3079 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method1111(int arg0, int arg1) {
        int var2 = 77 / ((50 - arg0) / 39);
        class244.field3854.method1163(arg1, false);
        field2500++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IBI)V")
    public static final void method1112(int arg0, byte arg1, int arg2) {
        field2514++;
        if (arg1 < -10) {
            class23 var3 = class91.method694(arg2, 6, 124);
            var3.method190(0);
            var3.field361 = arg0;
        }
    }

    @OriginalMember(owner = "client!a", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field2511++;
        if (class210.field3374 != null) {
            class165.field2689 = 0;
            class29.field504 = -1;
            class189.field3079 = -1;
        }
    }

    @OriginalMember(owner = "client!a", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2502++;
        if (class210.field3374 != null) {
            class165.field2689 = 0;
            class29.field504 = arg0.getX();
            class189.field3079 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!a", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2507++;
        if (class210.field3374 != null) {
            class165.field2689 = 0;
            class132.field2190 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[B")
    public static final byte[] method1113(int arg0, int arg1) {
        class48 var2 = (class48) class229.field3654.method1518((long) arg1, 115);
        if (arg0 <= 25) {
            method1111(-22, -116);
        }
        field2508++;
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class111.method824(0, var3, var7);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class48(var4);
            class229.field3654.method1514(false, var2, (long) arg1);
        }
        return var2.field887;
    }

    @OriginalMember(owner = "client!a", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class210.field3374 != null) {
            class165.field2689 = 0;
            class58.field1010 = arg0.getX();
            class247.field3879 = arg0.getY();
            class52.field939 = class62.method472(115);
            if (arg0.isMetaDown()) {
                class297.field4696 = 2;
                class132.field2190 = 2;
            } else {
                class297.field4696 = 1;
                class132.field2190 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        field2516++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!a", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2499++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILig;)V")
    public static final void method1114(int arg0, class136 arg1) {
        while (arg1.field2263.length > arg1.field2231) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg1.method1012(4) == 1) {
                var3 = arg1.method1012(4);
                var2 = true;
                var4 = arg1.method1012(4);
            }
            int var5 = arg1.method1012(4);
            int var6 = arg1.method1012(4);
            int var7 = var5 * 64 - class285.field4524;
            int var8 = class253.field4030 + class31.field524 - (var6 * 64) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class159.field2574 && var8 < class31.field524) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                            byte var13 = arg1.method981(false);
                            if (var13 != 0) {
                                if (class106.field1623[var9][var10] == null) {
                                    class106.field1623[var9][var10] = new byte[4096];
                                }
                                class106.field1623[var9][var10][(63 - var12 << 6) + var11] = var13;
                                byte var14 = arg1.method981(false);
                                if (class246.field3876[var9][var10] == null) {
                                    class246.field3876[var9][var10] = new byte[4096];
                                }
                                class246.field3876[var9][var10][(63 - var12 << 6) + var11] = var14;
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                    byte var16 = arg1.method981(false);
                    if (var16 != 0) {
                        arg1.field2231++;
                    }
                }
            }
        }
        field2506++;
        if (arg0 >= -119) {
            method1111(26, -40);
        }
    }

    @OriginalMember(owner = "client!a", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2501++;
        if (class210.field3374 != null) {
            class165.field2689 = 0;
            class29.field504 = arg0.getX();
            class189.field3079 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!a", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class210.field3374 != null) {
            class132.field2190 = 0;
        }
        field2515++;
    }

    @OriginalMember(owner = "client!a", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2510++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lsb;I)V")
    public static final void method1115(class124 arg0, int arg1) {
        class19.field304 = arg0;
        field2512++;
        if (arg1 != 84) {
            method1113(81, 121);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method1116(int arg0) {
        field2513 = null;
        if (arg0 != 4096) {
            method1115((class124) null, 17);
        }
    }
}
