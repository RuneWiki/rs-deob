import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class35 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lwb;")
    public static class130 field987 = class26.method212("@gr1@", -32376);

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[I")
    public static int[] field998 = new int[4000];

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "Lwb;")
    private static class130 field997 = class26.method212(" seconds)3", -32376);

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lwb;")
    public static class130 field992 = class26.method212("backtop1", -32376);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field988 = 0;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lwb;")
    public static class130 field990 = field997;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lwb;")
    private static class130 field1010 = class26.method212("Login server offline)3", -32376);

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Lwb;")
    public static class130 field1009 = class26.method212("und haben es deaktiviert)3 Benutzen Sie die", -32376);

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lwb;")
    public static class130 field1006 = class26.method212("Mem:", -32376);

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lwb;")
    public static class130 field996 = class26.method212("Handel)4Duell", -32376);

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lwb;")
    public static class130 field1000 = field1010;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "J")
    public static long field1003;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "[I")
    public static int[] field1013;

    @OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 14)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class130.field3083 != null) {
            class40.field1112 = 0;
            class41.field1145 = arg0.getX();
            class115.field2846 = arg0.getY();
        }
        field1005++;
    }

    @OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 28)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class130.field3083 != null) {
            class40.field1112 = 0;
            class41.field1145 = arg0.getX();
            class115.field2846 = arg0.getY();
        }
        field989++;
    }

    @OriginalMember(owner = "client!fd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 45)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class130.field3083 != null) {
            class52.field1358 = 0;
        }
        field991++;
    }

    @OriginalMember(owner = "client!fd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 57)
    public final void focusGained(FocusEvent arg0) {
        field994++;
    }

    @OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 89)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1002++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIZ)V", line = 99)
    public static final void method319(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            method320(83);
        }
        for (int var5 = arg0; var5 <= arg0 + arg3; var5++) {
            for (int var6 = arg1; var6 <= arg1 + arg2; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class117.field2879[0][var6][var5] = 127;
                    if (arg1 == var6 && var6 > 0) {
                        class69.field1781[0][var6][var5] = class69.field1781[0][var6 - 1][var5];
                    }
                    if (arg1 + arg2 == var6 && var6 < 103) {
                        class69.field1781[0][var6][var5] = class69.field1781[0][var6 + 1][var5];
                    }
                    if (arg0 == var5 && var5 > 0) {
                        class69.field1781[0][var6][var5] = class69.field1781[0][var6][var5 - 1];
                    }
                    if (arg0 + arg3 == var5 && var5 < 103) {
                        class69.field1781[0][var6][var5] = class69.field1781[0][var6][var5 + 1];
                    }
                }
            }
        }
        field1004++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 152)
    public static void method320(int arg0) {
        field996 = null;
        field998 = null;
        field990 = null;
        field1006 = null;
        field1010 = null;
        field1009 = null;
        if (arg0 > -114) {
            method319(-64, -70, 60, -80, true);
        }
        field1013 = null;
        field997 = null;
        field987 = null;
        field1000 = null;
        field992 = null;
    }

    @OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 174)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class130.field3083 != null) {
            class40.field1112 = 0;
            class41.field1145 = -1;
            class115.field2846 = -1;
        }
        field1008++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIBII)V", line = 188)
    public static final void method321(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class41.field1166[0].method744(arg0, arg4);
        int var6 = (arg2 - 32) * arg2 / arg1;
        class41.field1166[1].method744(arg0, arg4 + arg2 - 16);
        field995++;
        class49.method440(arg0, arg4 + 16, 16, arg2 - 32, class37.field1090);
        if (arg3 >= -28) {
            method322((byte) -80);
        }
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg5 / (arg1 - arg2);
        class49.method440(arg0, arg4 + var7 + 16, 16, var6, class75.field1881);
        class49.method434(arg0, arg4 + var7 + 16, var6, class71.field1813);
        class49.method434(arg0 + 1, var7 + 16 + arg4, var6, class71.field1813);
        class49.method438(arg0, var7 + arg4 + 16, 16, class71.field1813);
        class49.method438(arg0, arg4 + var7 + 17, 16, class71.field1813);
        class49.method434(arg0 + 15, arg4 - -16 + var7, var6, class89.field2149);
        class49.method434(arg0 + 14, arg4 + 17 - -var7, var6 - 1, class89.field2149);
        class49.method438(arg0, arg4 + var7 + var6 + 15, 16, class89.field2149);
        class49.method438(arg0 + 1, arg4 + 14 + var6 + var7, 15, class89.field2149);
    }

    @OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 225)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1012++;
        if (class130.field3083 != null) {
            class40.field1112 = 0;
            class52.field1358 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 264)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class130.field3083 != null) {
            class40.field1112 = 0;
            class81.field1937 = arg0.getX();
            class6.field220 = arg0.getY();
            class71.field1809 = class90.method668(false);
            if (arg0.isMetaDown()) {
                class22.field642 = 2;
                class52.field1358 = 2;
            } else {
                class22.field642 = 1;
                class52.field1358 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field986++;
    }

    @OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 298)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1001++;
        if (class130.field3083 != null) {
            class40.field1112 = 0;
            class41.field1145 = arg0.getX();
            class115.field2846 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V", line = 312)
    public static final void method322(byte arg0) {
        field999++;
        if (class46.field1246 != 0) {
            return;
        }
        int var1 = class119.field2921;
        if (class42.field1182 == 1 && class105.field2558 >= 516 && field988 >= 160 && class105.field2558 <= 765 && field988 <= 205) {
            var1 = 0;
        }
        if (arg0 > -105) {
            method320(106);
        }
        if (!class58.field1462) {
            if (var1 == 1 && class26.field757 > 0) {
                int var12 = class3.field73[class26.field757 - 1];
                if (var12 == 38 || var12 == 2 || var12 == 56 || var12 == 43 || var12 == 17 || var12 == 8 || var12 == 18 || var12 == 5 || var12 == 10 || var12 == 50 || var12 == 37 || var12 == 1002) {
                    int var13 = class14.field409[class26.field757 - 1];
                    int var14 = class47.field1269[class26.field757 - 1];
                    class3 var15 = class31.method248(65535, var14);
                    if (var15.field121 || var15.field108) {
                        class7.field247 = false;
                        class8.field276 = field988;
                        class46.field1246 = 2;
                        class95.field2309 = var14;
                        if (var14 >> 16 == class115.field2843) {
                            class46.field1246 = 1;
                        }
                        class15.field422 = 0;
                        class109.field2631 = var13;
                        if (var14 >> 16 == class22.field632) {
                            class46.field1246 = 3;
                        }
                        class19.field568 = class105.field2558;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class117.field2893 == 1 || class27.method220(-110, class26.field757 - 1)) && class26.field757 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class26.field757 > 0) {
                class109.method828(true, class26.field757 - 1);
            }
            if (var1 != 2 || class26.field757 <= 0) {
                return;
            }
            class93.method695((byte) 43);
            return;
        }
        if (var1 != 1) {
            int var2 = class18.field483;
            int var3 = class101.field2429;
            if (class116.field2863 == 0) {
                var2 -= 4;
                var3 -= 4;
            }
            if (class116.field2863 == 1) {
                var2 -= 553;
                var3 -= 205;
            }
            if (class116.field2863 == 2) {
                var2 -= 17;
                var3 -= 357;
            }
            if (class18.field496 - 10 > var2 || class18.field496 + class119.field2908 + 10 < var2 || class69.field1767 - 10 > var3 || var3 > class69.field1767 + field1007 + 10) {
                if (class116.field2863 == 2) {
                    class129.field3047 = true;
                }
                if (class116.field2863 == 1) {
                    class20.field585 = true;
                }
                class58.field1462 = false;
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class18.field496;
        int var5 = class69.field1767;
        int var6 = class119.field2908;
        int var7 = class105.field2558;
        int var8 = field988;
        if (class116.field2863 == 0) {
            var8 -= 4;
            var7 -= 4;
        }
        int var9 = -1;
        if (class116.field2863 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (class116.field2863 == 2) {
            var8 -= 357;
            var7 -= 17;
        }
        for (int var10 = 0; var10 < class26.field757; var10++) {
            int var11 = (class26.field757 - var10 - 1) * 15 + var5 + 31;
            if (var4 < var7 && var4 + var6 > var7 && var8 > var11 - 13 && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class109.method828(true, var9);
        }
        class58.field1462 = false;
        if (class116.field2863 == 1) {
            class20.field585 = true;
        }
        if (class116.field2863 == 2) {
            class129.field3047 = true;
            return;
        }
    }
}
