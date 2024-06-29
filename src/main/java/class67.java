import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class67 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lp;")
    public static class104 field1581 = new class104(20);

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field1595 = 78;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lfc;")
    public static class39 field1599 = class90.method774("Fertigkeit)2", -119);

    @OriginalMember(owner = "client!je", name = "q", descriptor = "Lfc;")
    private static class39 field1597 = class90.method774("This world is full)3", -87);

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lfc;")
    private static class39 field1602 = class90.method774("To play on this world move to a free area first", -107);

    @OriginalMember(owner = "client!je", name = "z", descriptor = "Lfc;")
    public static class39 field1606 = class90.method774("Cabbage", -106);

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Z")
    public static boolean field1598 = true;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lfc;")
    private static class39 field1603 = class90.method774("Loading interfaces )2 ", -126);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lfc;")
    public static class39 field1596 = field1603;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "Lfc;")
    public static class39 field1608 = field1602;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Lfc;")
    public static class39 field1607 = field1597;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lp;")
    public static class104 field1605 = new class104(50);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILoc;)V", line = 3)
    public static final void method634(int arg0, class100 arg1) {
        field1588++;
        class104.field2639 = arg1;
        class75.field1725 = class104.field2639.method849((byte) -73, 16);
        int var2 = 97 / ((-arg0 - 33) / 49);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Loc;I)V", line = 20)
    public static final void method635(class100 arg0, int arg1) {
        field1586++;
        class43.field1170 = arg0;
        if (arg1 != 0) {
            field1581 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 33)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class35.field914 != null) {
            class77.field1751 = 0;
            class45.field1227 = -1;
            class6.field197 = -1;
        }
        field1601++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 50)
    public static final void method636(byte arg0) {
        field1593++;
        class28.field791 = new class2();
        if (arg0 != 48) {
            field1598 = true;
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 61)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class35.field914 != null) {
            class77.field1751 = 0;
            class45.field1227 = arg0.getX();
            class6.field197 = arg0.getY();
        }
        field1592++;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 87)
    public static void method637(byte arg0) {
        field1596 = null;
        field1608 = null;
        field1606 = null;
        field1602 = null;
        field1581 = null;
        if (arg0 != 114) {
            return;
        }
        field1597 = null;
        field1599 = null;
        field1605 = null;
        field1607 = null;
        field1603 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Component;Loc;I)V", line = 106)
    public static final void method638(Component arg0, class100 arg1, int arg2) {
        field1594++;
        if (class107.field2699) {
            return;
        }
        class78.field1781 = class29.method359(arg2 ^ 0xFFFF90EC, class53.field1334, class136.field3403, arg1);
        class108.field2721 = class29.method359(-87, class53.field1334, class111.field2878, arg1);
        class3.field88 = class29.method359(-22, class53.field1334, class97.field2298, arg1);
        class26.field750 = class29.method359(-109, class53.field1334, class120.field3145, arg1);
        class7.field237 = class29.method359(arg2 ^ 0xFFFF90F6, class53.field1334, class6.field198, arg1);
        class88.field2046 = class29.method359(arg2 ^ 0xFFFF9093, class53.field1334, class54.field1357, arg1);
        class12.field316 = class3.method23(96, 0, 479, arg0);
        class108.field2721.method1155(0, 0);
        class97.field2297 = class3.method23(156, 0, 172, arg0);
        class152.method1217();
        class3.field88.method1155(0, 0);
        class116.field3065 = class3.method23(261, 0, 190, arg0);
        class78.field1781.method1155(0, 0);
        class42.field1145 = class3.method23(334, 0, 512, arg0);
        class152.method1217();
        class16.field457 = class3.method23(50, 0, 496, arg0);
        class68.field1621 = class3.method23(37, 0, 269, arg0);
        class120.field3141 = class3.method23(45, 0, 249, arg0);
        class8 var3 = class55.method573((byte) 123, arg1, class79.field1796, class53.field1334);
        class35.field967 = class3.method23(var3.field239, arg2 - 28448, var3.field245, arg0);
        var3.method119(0, 0);
        class8 var4 = class55.method573((byte) 124, arg1, class53.field1319, class53.field1334);
        class140.field3539 = class3.method23(var4.field239, 0, var4.field245, arg0);
        var4.method119(0, 0);
        class8 var5 = class55.method573((byte) -55, arg1, class128.field3276, class53.field1334);
        class87.field2011 = class3.method23(var5.field239, 0, var5.field245, arg0);
        var5.method119(0, 0);
        class8 var6 = class55.method573((byte) 124, arg1, class96.field2280, class53.field1334);
        class16.field450 = class3.method23(var6.field239, 0, var6.field245, arg0);
        var6.method119(0, 0);
        class8 var7 = class55.method573((byte) 120, arg1, class119.field3104, class53.field1334);
        class83.field1847 = class3.method23(var7.field239, 0, var7.field245, arg0);
        var7.method119(0, 0);
        class8 var8 = class55.method573((byte) 123, arg1, class82.field1834, class53.field1334);
        class71.field1672 = class3.method23(var8.field239, 0, var8.field245, arg0);
        var8.method119(0, 0);
        class8 var9 = class55.method573((byte) 121, arg1, class79.field1805, class53.field1334);
        class140.field3536 = class3.method23(var9.field239, 0, var9.field245, arg0);
        var9.method119(0, 0);
        class8 var10 = class55.method573((byte) 122, arg1, class119.field3114, class53.field1334);
        class37.field1013 = class3.method23(var10.field239, arg2 - 28448, var10.field245, arg0);
        var10.method119(0, 0);
        class8 var11 = class55.method573((byte) -49, arg1, class1.field9, class53.field1334);
        class83.field1843 = class3.method23(var11.field239, 0, var11.field245, arg0);
        if (arg2 != 28448) {
            field1603 = null;
        }
        var11.method119(0, 0);
        class62.field1519 = class29.method359(arg2 ^ 0xFFFF908F, class53.field1334, class110.field2831, arg1);
        class121.field3164 = class29.method359(arg2 - 28521, class53.field1334, class136.field3406, arg1);
        class132.field3323 = class29.method359(-60, class53.field1334, class71.field1674, arg1);
        class121.field3167 = class62.field1519.method1150();
        class121.field3167.method1152();
        class87.field2021 = class121.field3164.method1150();
        class87.field2021.method1152();
        class60.field1462 = class62.field1519.method1150();
        class60.field1462.method1156();
        class115.field3014 = class121.field3164.method1150();
        class115.field3014.method1156();
        class31.field873 = class132.field3323.method1150();
        class31.field873.method1156();
        class143.field3594 = class62.field1519.method1150();
        class143.field3594.method1152();
        class143.field3594.method1156();
        class136.field3419 = class121.field3164.method1150();
        class136.field3419.method1152();
        class136.field3419.method1156();
        class108.field2729 = class145.method1167(arg1, class131.field3315, (byte) -124, class53.field1334);
        class126.field3205 = new int[151];
        class140.field3524 = new int[33];
        class53.field1316 = new int[33];
        class92.field2151 = new int[151];
        for (int var12 = 0; var12 < 33; var12++) {
            int var17 = 999;
            int var18 = 0;
            for (int var19 = 0; var19 < 34; var19++) {
                if (class3.field88.field3544[var19 + class3.field88.field3543 * var12] == 0) {
                    if (var17 == 999) {
                        var17 = var19;
                    }
                } else if (var17 != 999) {
                    var18 = var19;
                    break;
                }
            }
            class140.field3524[var12] = var17;
            class53.field1316[var12] = var18 - var17;
        }
        for (int var13 = 5; var13 < 156; var13++) {
            int var14 = 999;
            int var15 = 0;
            for (int var16 = 25; var16 < 172; var16++) {
                if (class3.field88.field3544[var16 + class3.field88.field3543 * var13] == 0 && (var16 > 34 || var13 > 34)) {
                    if (var14 == 999) {
                        var14 = var16;
                    }
                } else if (var14 != 999) {
                    var15 = var16;
                    break;
                }
            }
            class92.field2151[var13 - 5] = var14 - 25;
            class126.field3205[var13 - 5] = var15 - var14;
        }
        class107.field2699 = true;
    }

    @OriginalMember(owner = "client!je", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 265)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1604++;
        if (class35.field914 != null) {
            class77.field1751 = 0;
            class134.field3384 = arg0.getX();
            class55.field1385 = arg0.getY();
            class131.field3296 = class29.method361(-5321);
            if (arg0.isMetaDown()) {
                class134.field3390 = 2;
                class36.field976 = 2;
            } else {
                class134.field3390 = 1;
                class36.field976 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 298)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class35.field914 != null) {
            class77.field1751 = 0;
            class36.field976 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1583++;
    }

    @OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 326)
    public final void focusGained(FocusEvent arg0) {
        field1587++;
    }

    @OriginalMember(owner = "client!je", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 334)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class35.field914 != null) {
            class77.field1751 = 0;
            class45.field1227 = arg0.getX();
            class6.field197 = arg0.getY();
        }
        field1589++;
    }

    @OriginalMember(owner = "client!je", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 351)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1591++;
        if (class35.field914 != null) {
            class77.field1751 = 0;
            class45.field1227 = arg0.getX();
            class6.field197 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 376)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class35.field914 != null) {
            class36.field976 = 0;
        }
        field1590++;
    }

    @OriginalMember(owner = "client!je", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 387)
    public final void mouseClicked(MouseEvent arg0) {
        field1582++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I", line = 397)
    public static final int method639(int arg0, int arg1) {
        if (arg1 != 33) {
            field1603 = null;
        }
        field1585++;
        return arg0 >> 11 & 0x3F;
    }
}
