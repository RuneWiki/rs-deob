import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[B")
    public static byte[] field2037 = new byte[520];

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lkd;")
    public static class73 field2036 = class126.method1070((byte) -66, "l");

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lkd;")
    public static class73 field2050 = class126.method1070((byte) -66, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static volatile int field2043 = 0;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2039 = 0;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lkd;")
    public static class73 field2056 = class126.method1070((byte) -66, "Texturen geladen)3");

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field2033 = -1;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lkd;")
    public static class73 field2049 = class126.method1070((byte) -66, ")3runescape)3com");

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Lkd;")
    public static class73 field2059 = class126.method1070((byte) -66, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field2053 = 0;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lq;")
    public static class111 field2051;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lrd;")
    public static class122 field2044;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lde;")
    public static class27 field2038;

    @OriginalMember(owner = "client!le", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class71.field1795 != null) {
            class23.field647 = 0;
            class98.field2443 = arg0.getX();
            class120.field3065 = arg0.getY();
        }
        field2048++;
    }

    @OriginalMember(owner = "client!le", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2052++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static final void method691(byte arg0) {
        class92.method771((byte) 50);
        field2057++;
        class116.field2974 = true;
        class89.method742((byte) -122);
        if (class104.field2603) {
            class58.field1553.method343(class9.field316, 239, 40, 0, -1);
            class58.field1553.method343(class32.method258(-92, new class73[] { class46.method346(class9.field299), class105.field2623 }), 239, 60, 128, -1);
        } else if (class2.field146 == 1) {
            class58.field1553.method343(class50.field1350, 239, 40, 0, -1);
            class58.field1553.method343(class32.method258(-94, new class73[] { class46.method346(class9.field296), class105.field2623 }), 239, 60, 128, -1);
        } else if (class2.field146 == 2) {
            class58.field1553.method343(class34.field920, 239, 40, 0, -1);
            class58.field1553.method343(class32.method258(-104, new class73[] { class46.method346(class9.field296), class105.field2623 }), 239, 60, 128, -1);
        } else if (class2.field146 == 3) {
            if (class9.field304 != class9.field296) {
                class143.method1157(class9.field296, (byte) 103);
                class9.field304 = class9.field296;
            }
            class46 var1 = class109.field2688;
            class17.method143(0, 0, 463, 77);
            for (int var2 = 0; var2 < class66.field1708; var2++) {
                int var3 = var2 * 14 + 18 - class18.field513;
                if (var3 > 0 && var3 < 110) {
                    var1.method343(class77.field1978[var2], 239, var3, 0, -1);
                }
            }
            class17.method135();
            if (class66.field1708 > 5) {
                class28.method227(0, (byte) 21, class18.field513, class66.field1708 * 14 + 7, 77, 463);
            }
            if (class9.field296.method632((byte) -121) == 0) {
                class58.field1553.method343(class15.field476, 239, 40, 255, -1);
            } else if (class66.field1708 == 0) {
                class58.field1553.method343(class77.field1970, 239, 40, 0, -1);
            }
            var1.method343(class32.method258(-105, new class73[] { class46.method346(class9.field296), class105.field2623 }), 239, 90, 0, -1);
            class17.method136(0, 77, 479, 0);
        } else if (class2.field146 == 4) {
            class58.field1553.method343(class9.field315, 239, 40, 0, -1);
            class58.field1553.method343(class32.method258(-70, new class73[] { class46.method346(class9.field296), class105.field2623 }), 239, 60, 128, -1);
        } else if (class143.field3575 != null) {
            class58.field1553.method362(class143.field3575, 10, 20, 459, 40, 0, -1, 1, 1, 0);
            class58.field1553.method343(class21.field585, 239, 80, 128, -1);
        } else if (class129.field3246 != -1) {
            boolean var19 = class103.method830(23578, 2, 0, 96, class129.field3246, 0, 479);
            if (!var19) {
                class132.field3304 = true;
            }
        } else if (class11.field364 == -1) {
            int var4 = 0;
            class46 var5 = class109.field2688;
            class17.method143(0, 0, 463, 77);
            for (int var6 = 0; var6 < 100; var6++) {
                if (class76.field1952[var6] != null) {
                    int var8 = class110.field2702[var6];
                    int var9 = class62.field1622 + 70 - var4 * 14;
                    class73 var10 = class18.field530[var6];
                    byte var11 = 0;
                    if (var10 != null && var10.method642(107, class131.field3284)) {
                        var11 = 1;
                        var10 = var10.method638(5, -20);
                    }
                    if (var10 != null && var10.method642(-62, class42.field1122)) {
                        var10 = var10.method638(5, -6);
                        var11 = 2;
                    }
                    if (var8 == 0) {
                        var4++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method355(class76.field1952[var6], 4, var9, 0, -1);
                        }
                    }
                    if ((var8 == 1 || var8 == 2) && (var8 == 1 || class133.field3342 == 0 || class133.field3342 == 1 && class115.method978(86, var10))) {
                        if (var9 > 0 && var9 < 110) {
                            int var12 = 4;
                            if (var11 == 1) {
                                class83.field2080[0].method208(var12, var9 - 12);
                                var12 += 14;
                            }
                            if (var11 == 2) {
                                class83.field2080[1].method208(var12, var9 - 12);
                                var12 += 14;
                            }
                            var5.method355(class32.method258(-128, new class73[] { var10, class48.field1279 }), var12, var9, 0, -1);
                            int var13 = var12 + var5.method357(var10) + 8;
                            var5.method355(class76.field1952[var6], var13, var9, 255, -1);
                        }
                        var4++;
                    }
                    if ((var8 == 3 || var8 == 7) && class80.field2025 == 0 && (var8 == 7 || class25.field711 == 0 || class25.field711 == 1 && class115.method978(127, var10))) {
                        var4++;
                        if (var9 > 0 && var9 < 110) {
                            byte var14 = 4;
                            var5.method355(class133.field3357, var14, var9, 0, -1);
                            int var15 = var14 + var5.method357(class133.field3357);
                            int var16 = var15 + var5.method363(32);
                            if (var11 == 1) {
                                class83.field2080[0].method208(var16, var9 - 12);
                                var16 += 14;
                            }
                            if (var11 == 2) {
                                class83.field2080[1].method208(var16, var9 - 12);
                                var16 += 14;
                            }
                            var5.method355(class32.method258(-107, new class73[] { var10, class48.field1279 }), var16, var9, 0, -1);
                            int var17 = var16 + var5.method357(var10) + 8;
                            var5.method355(class76.field1952[var6], var17, var9, 8388608, -1);
                        }
                    }
                    if (var8 == 4 && (class13.field410 == 0 || class13.field410 == 1 && class115.method978(99, var10))) {
                        if (var9 > 0 && var9 < 110) {
                            var5.method355(class32.method258(-74, new class73[] { var10, class133.field3334, class76.field1952[var6] }), 4, var9, 8388736, -1);
                        }
                        var4++;
                    }
                    if (var8 == 5 && class80.field2025 == 0 && class25.field711 < 2) {
                        var4++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method355(class76.field1952[var6], 4, var9, 8388608, -1);
                        }
                    }
                    if (var8 == 6 && class80.field2025 == 0 && class25.field711 < 2) {
                        var4++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method355(class32.method258(-126, new class73[] { class129.field3259, class133.field3334, var10, class48.field1279 }), 4, var9, 0, -1);
                            var5.method355(class76.field1952[var6], var5.method357(class32.method258(-111, new class73[] { class129.field3259, class133.field3334, var10 })) + 12, var9, 8388608, -1);
                        }
                    }
                    if (var8 == 8 && (class13.field410 == 0 || class13.field410 == 1 && class115.method978(103, var10))) {
                        var4++;
                        if (var9 > 0 && var9 < 110) {
                            var5.method355(class32.method258(-95, new class73[] { var10, class133.field3334, class76.field1952[var6] }), 4, var9, 8270336, -1);
                        }
                    }
                }
            }
            class17.method135();
            class100.field2521 = var4 * 14 + 7;
            if (class100.field2521 < 78) {
                class100.field2521 = 78;
            }
            class28.method227(0, (byte) 21, class100.field2521 - class62.field1622 - 77, class100.field2521, 77, 463);
            class73 var7;
            if (class73.field1901 == null || class73.field1901.field3025 == null) {
                var7 = class42.field1142;
            } else {
                var7 = class73.field1901.field3025;
            }
            var5.method355(class32.method258(-120, new class73[] { var7, class48.field1279 }), 4, 90, 0, -1);
            var5.method355(class32.method258(-61, new class73[] { class46.method346(class9.field309), class105.field2623 }), var5.method357(class32.method258(-73, new class73[] { var7, class133.field3355 })) + 6, 90, 255, -1);
            class17.method136(0, 77, 479, 0);
        } else {
            boolean var18 = class103.method830(23578, 3, 0, 96, class11.field364, 0, 479);
            if (!var18) {
                class132.field3304 = true;
            }
        }
        if (class15.field459 && class50.field1333 == 2) {
            class146.method1169((byte) 120);
        }
        int var20 = 30 / ((arg0 - 58) / 32);
        class31.method253(-1002);
    }

    @OriginalMember(owner = "client!le", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field2045++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!le", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class71.field1795 != null) {
            class23.field647 = 0;
            class98.field2443 = arg0.getX();
            class120.field3065 = arg0.getY();
        }
        field2054++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method692(int arg0) {
        field2037 = null;
        field2059 = null;
        field2056 = null;
        field2049 = null;
        field2050 = null;
        if (arg0 != 8270336) {
            field2044 = null;
        }
        field2044 = null;
        field2036 = null;
        field2038 = null;
        field2051 = null;
    }

    @OriginalMember(owner = "client!le", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class71.field1795 != null) {
            class2.field156 = 0;
        }
        field2032++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        class132 var10 = null;
        field2041++;
        for (class132 var11 = (class132) class112.field2790.method514((byte) -79); var11 != null; var11 = (class132) class112.field2790.method517(-79)) {
            if (var11.field3311 == arg0 && var11.field3314 == arg8 && var11.field3301 == arg9 && var11.field3305 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class132();
            var10.field3301 = arg9;
            var10.field3305 = arg3;
            var10.field3311 = arg0;
            var10.field3314 = arg8;
            class123.method1048((byte) 83, var10);
            class112.field2790.method519(var10, 13017);
        }
        var10.field3324 = arg2;
        var10.field3325 = arg1;
        var10.field3310 = arg7;
        var10.field3312 = arg5;
        var10.field3302 = arg4;
        if (arg6 >= -83) {
            field2043 = 21;
        }
    }

    @OriginalMember(owner = "client!le", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class71.field1795 != null) {
            class23.field647 = 0;
            class98.field2443 = arg0.getX();
            class120.field3065 = arg0.getY();
        }
        field2035++;
    }

    @OriginalMember(owner = "client!le", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class71.field1795 != null) {
            class23.field647 = 0;
            class145.field3581 = arg0.getX();
            field2043 = arg0.getY();
            class71.field1796 = class146.method1168(-80);
            if (arg0.isMetaDown()) {
                class28.field817 = 2;
                class2.field156 = 2;
            } else {
                class28.field817 = 1;
                class2.field156 = 1;
            }
        }
        field2046++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!le", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class71.field1795 != null) {
            class23.field647 = 0;
            class2.field156 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2034++;
    }

    @OriginalMember(owner = "client!le", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class71.field1795 != null) {
            class23.field647 = 0;
            class98.field2443 = -1;
            class120.field3065 = -1;
        }
        field2058++;
    }
}
