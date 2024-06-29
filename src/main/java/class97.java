import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class97 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Lai;")
    private static class10 field1793 = class44.method278("Sorry invited players only)3", 103);

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lai;")
    public static class10 field1785 = field1793;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Ldb;")
    public static class32 field1792 = new class32(4096);

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lai;")
    public static class10 field1797 = class44.method278(":clanreq:", 112);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lte;")
    public static class177 field1795;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "[Lbf;")
    public static class17[] field1787;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
    public static final void method639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg4; var5 <= arg0 + arg4; var5++) {
            for (int var7 = arg2; var7 <= arg2 + arg3; var7++) {
                if (var7 >= 0 && var7 < 104 && var5 >= 0 && var5 < 104) {
                    class46.field755[0][var7][var5] = 127;
                    if (arg2 == var7 && var7 > 0) {
                        class186.field3556[0][var7][var5] = class186.field3556[0][var7 - 1][var5];
                    }
                    if (arg2 + arg3 == var7 && var7 < 103) {
                        class186.field3556[0][var7][var5] = class186.field3556[0][var7 + 1][var5];
                    }
                    if (arg4 == var5 && var5 > 0) {
                        class186.field3556[0][var7][var5] = class186.field3556[0][var7][var5 - 1];
                    }
                    if (arg4 + arg0 == var5 && var5 < 103) {
                        class186.field3556[0][var7][var5] = class186.field3556[0][var7][var5 + 1];
                    }
                }
            }
        }
        int var6 = 34 % ((arg1 + 1) / 33);
        field1791++;
    }

    @OriginalMember(owner = "client!kf", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field1794++;
        if (class84.field1460 != null) {
            class141.field2655 = 0;
            class180.field3428 = arg0.getX();
            class134.field2519 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kf", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class84.field1460 != null) {
            class141.field2655 = 0;
            class180.field3428 = arg0.getX();
            class134.field2519 = arg0.getY();
        }
        field1780++;
    }

    @OriginalMember(owner = "client!kf", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1788++;
        if (class84.field1460 != null) {
            class141.field2655 = 0;
            class180.field3428 = -1;
            class134.field2519 = -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1787 = null;
        if (arg0 != 127) {
            return;
        }
        field1795 = null;
        field1792 = null;
        field1797 = null;
        field1785 = null;
        field1793 = null;
    }

    @OriginalMember(owner = "client!kf", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1784++;
    }

    @OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class84.field1460 != null) {
            class45.field737 = 0;
        }
        field1779++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BZ)V")
    public static final void method641(byte arg0, boolean arg1) {
        int var2 = 0;
        if (arg0 != 97) {
            method642(null, null, true, -23);
        }
        while (class93.field1690 > var2) {
            int var3 = (class166.field3187[var2] << 14) + 536870912;
            class125 var4 = class168.field3249[class166.field3187[var2]];
            if (var4 != null && var4.method250((byte) 32) && arg1 == var4.field2386.field3565 && var4.field2386.method1204(3089)) {
                int var5 = var4.field1097 >> 7;
                int var6 = var4.field1100 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    label72: {
                        if (var4.field1126 == 1 && (var4.field1100 & 0x7F) == 64 && (var4.field1097 & 0x7F) == 64) {
                            if (class58.field1025[var6][var5] == class119.field2292) {
                                break label72;
                            }
                            class58.field1025[var6][var5] = class119.field2292;
                        }
                        if (!var4.field2386.field3602) {
                            var3 += Integer.MIN_VALUE;
                        }
                        var4.field1128 = class145.method1003((byte) -97, var4.field1126 * 64 + var4.field1100 - 64, var4.field1097 - -((var4.field1126 - 1) * 64), class42.field687);
                        class36.field560.method583(class42.field687, var4.field1100, var4.field1097, var4.field1128, var4.field1126 * 64 + 60 - 64, var4, var4.field1109, var3, var4.field1133);
                    }
                }
            }
            var2++;
        }
        field1789++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lje;Lmb;ZI)V")
    public static final void method642(class87 arg0, class111 arg1, boolean arg2, int arg3) {
        field1778++;
        class82 var4 = new class82();
        var4.field1429 = arg1;
        var4.field2291 = arg3;
        var4.field1441 = 1;
        var4.field1439 = arg0;
        class192 var5 = class30.field460;
        synchronized (class30.field460) {
            class30.field460.method1230(var4, arg2);
        }
        class126.method872((byte) -4);
    }

    @OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1777++;
    }

    @OriginalMember(owner = "client!kf", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class84.field1460 != null) {
            class141.field2655 = 0;
            class180.field3428 = arg0.getX();
            class134.field2519 = arg0.getY();
        }
        field1781++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZZ)V")
    public static final void method643(int arg0, int arg1, boolean arg2, boolean arg3) {
        field1782++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class57.field1003 = arg1;
        class29.field437 = arg3;
        class71.field1225 = arg0;
        if (!arg2) {
            field1797 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1786++;
        if (class84.field1460 != null) {
            class141.field2655 = 0;
            class11.field194 = arg0.getX();
            class56.field989 = arg0.getY();
            class67.field1174 = class80.method491(2);
            if (arg0.isMetaDown()) {
                class166.field3188 = 2;
                class45.field737 = 2;
            } else {
                class166.field3188 = 1;
                class45.field737 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kf", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1796++;
        if (class84.field1460 != null) {
            class141.field2655 = 0;
            class45.field737 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
