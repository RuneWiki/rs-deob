import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class205 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lm;")
    public static class44 field3360 = new class44(0, 0);

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Luf;")
    public static class168 field3376 = class148.method1019(-1720, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Luf;")
    public static class168 field3378 = class148.method1019(-1720, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!o", name = "o", descriptor = "J")
    public static long field3373 = 0L;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field3377 = 0;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Luf;")
    public static class168 field3379 = class148.method1019(-1720, "<br>");

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "[I")
    public static int[] field3374;

    @OriginalMember(owner = "client!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 12)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3370++;
        if (class159.field2509 != null) {
            class86.field1333 = 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 23)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class159.field2509 != null) {
            class68.field902 = 0;
            class201.field3309 = -1;
            class25.field308 = -1;
        }
        field3367++;
    }

    @OriginalMember(owner = "client!o", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 42)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3361++;
        if (class159.field2509 != null) {
            class68.field902 = 0;
            class86.field1333 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) == 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 82)
    public static void method1433(byte arg0) {
        field3378 = null;
        field3360 = null;
        field3376 = null;
        int var1 = 60 / ((-arg0 - 67) / 58);
        field3374 = null;
        field3379 = null;
    }

    @OriginalMember(owner = "client!o", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 95)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class159.field2509 != null) {
            class68.field902 = 0;
            class201.field3309 = arg0.getX();
            class25.field308 = arg0.getY();
        }
        field3365++;
    }

    @OriginalMember(owner = "client!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 111)
    public final void focusGained(FocusEvent arg0) {
        field3362++;
    }

    @OriginalMember(owner = "client!o", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 122)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field3369++;
        if (class159.field2509 != null) {
            class68.field902 = 0;
            class201.field3309 = arg0.getX();
            class25.field308 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BZ)V", line = 145)
    public static final void method1434(byte arg0, boolean arg1) {
        field3371++;
        byte var2;
        byte[][] var3;
        if (arg1) {
            var2 = 1;
            var3 = class28.field356;
        } else {
            var2 = 4;
            var3 = class151.field2336;
        }
        if (arg0 > -102) {
            field3375 = 25;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class254.method1750((byte) -31);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class80.field1152[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x34737FE) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = (var8 & 0xFFD827) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class303.field5104.length; var14++) {
                                if (class303.field5104[var14] == var13 && var3[var14] != null) {
                                    class63.method363(var9, arg1, var6 * 8, var5 * 8, var3[var14], var4, class140.field2176, (byte) -34, var10, (var12 & 0x7) * 8, (var11 & 0x7) * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class294.method2022(var4, 8, 8, 23229, var6 * 8, var5 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 236)
    public final void mouseClicked(MouseEvent arg0) {
        field3368++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!o", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 247)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class159.field2509 != null) {
            class68.field902 = 0;
            class23.field281 = arg0.getX();
            class183.field2945 = arg0.getY();
            class130.field2015 = class194.method1368((byte) -6);
            if (arg0.isMetaDown()) {
                class36.field417 = 2;
                class86.field1333 = 2;
            } else {
                class36.field417 = 1;
                class86.field1333 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) == 0) {
            }
            if ((var2 & 0x4) != 0) {
            }
        }
        field3359++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 295)
    public static final void method1435(int arg0, int arg1) {
        field3372++;
        class143 var2 = (class143) class259.field4390.method493((long) arg0, 125);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field2207.length; var3++) {
            var2.field2207[var3] = -1;
            var2.field2201[var3] = 0;
        }
        if (arg1 != 1822622241) {
            field3363 = 106;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZII)I", line = 324)
    public static final int method1436(int arg0, boolean arg1, int arg2, int arg3) {
        class143 var4 = (class143) class259.field4390.method493((long) arg2, 47);
        int var5 = 34 / ((48 - arg3) / 58);
        field3364++;
        if (var4 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var4.field2207.length; var7++) {
            if (var4.field2207[var7] >= 0 && class101.field1572 > var4.field2207[var7]) {
                class238 var8 = class284.method1963((byte) -47, var4.field2207[var7]);
                if (var8.field3824 != null) {
                    class69 var9 = (class69) var8.field3824.method493((long) arg0, 125);
                    if (var9 != null) {
                        if (arg1) {
                            var6 += var4.field2201[var7] * var9.field919;
                        } else {
                            var6 += var9.field919;
                        }
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!o", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 372)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3366++;
        if (class159.field2509 != null) {
            class68.field902 = 0;
            class201.field3309 = arg0.getX();
            class25.field308 = arg0.getY();
        }
    }
}
