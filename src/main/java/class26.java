import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field654 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field659 = -1;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Li;")
    public static class48 field651 = new class48(64);

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field667 = 0;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
    public static int[] field672 = new int[2000];

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lva;")
    private static class121 field671 = class107.method797("Prepared sound engine", -10983);

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "Lva;")
    public static class121 field673 = field671;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Ljd;")
    public static class58 field670;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 12)
    public static final void method204(byte arg0) {
        field662++;
        if (arg0 != -102) {
            method205(69, true);
        }
        if (class21.field568 != 1) {
            return;
        }
        if (class15.field280 >= 539 && class15.field280 <= 573 && class82.field1909 >= 169 && class82.field1909 < 205 && class42.field956[0] != -1) {
            class28.field716 = 0;
            class25.field630 = true;
            class97.field2168 = true;
        }
        if (class15.field280 >= 569 && class15.field280 <= 599 && class82.field1909 >= 168 && class82.field1909 < 205 && class42.field956[1] != -1) {
            class97.field2168 = true;
            class28.field716 = 1;
            class25.field630 = true;
        }
        if (class15.field280 >= 597 && class15.field280 <= 627 && class82.field1909 >= 168 && class82.field1909 < 205 && class42.field956[2] != -1) {
            class28.field716 = 2;
            class25.field630 = true;
            class97.field2168 = true;
        }
        if (class15.field280 >= 625 && class15.field280 <= 669 && class82.field1909 >= 168 && class82.field1909 < 203 && class42.field956[3] != -1) {
            class25.field630 = true;
            class97.field2168 = true;
            class28.field716 = 3;
        }
        if (class15.field280 >= 666 && class15.field280 <= 696 && class82.field1909 >= 168 && class82.field1909 < 205 && class42.field956[4] != -1) {
            class25.field630 = true;
            class97.field2168 = true;
            class28.field716 = 4;
        }
        if (class15.field280 >= 694 && class15.field280 <= 724 && class82.field1909 >= 168 && class82.field1909 < 205 && class42.field956[5] != -1) {
            class25.field630 = true;
            class28.field716 = 5;
            class97.field2168 = true;
        }
        if (class15.field280 >= 722 && class15.field280 <= 756 && class82.field1909 >= 169 && class82.field1909 < 205 && class42.field956[6] != -1) {
            class28.field716 = 6;
            class97.field2168 = true;
            class25.field630 = true;
        }
        if (class15.field280 >= 540 && class15.field280 <= 574 && class82.field1909 >= 466 && class82.field1909 < 502 && class42.field956[7] != -1) {
            class25.field630 = true;
            class28.field716 = 7;
            class97.field2168 = true;
        }
        if (class15.field280 >= 572 && class15.field280 <= 602 && class82.field1909 >= 466 && class82.field1909 < 503 && class42.field956[8] != -1) {
            class97.field2168 = true;
            class28.field716 = 8;
            class25.field630 = true;
        }
        if (class15.field280 >= 599 && class15.field280 <= 629 && class82.field1909 >= 466 && class82.field1909 < 503 && class42.field956[9] != -1) {
            class97.field2168 = true;
            class28.field716 = 9;
            class25.field630 = true;
        }
        if (class15.field280 >= 627 && class15.field280 <= 671 && class82.field1909 >= 467 && class82.field1909 < 502 && class42.field956[10] != -1) {
            class25.field630 = true;
            class28.field716 = 10;
            class97.field2168 = true;
        }
        if (class15.field280 >= 669 && class15.field280 <= 699 && class82.field1909 >= 466 && class82.field1909 < 503 && class42.field956[11] != -1) {
            class97.field2168 = true;
            class25.field630 = true;
            class28.field716 = 11;
        }
        if (class15.field280 >= 696 && class15.field280 <= 726 && class82.field1909 >= 466 && class82.field1909 < 503 && class42.field956[12] != -1) {
            class25.field630 = true;
            class28.field716 = 12;
            class97.field2168 = true;
        }
        if (class15.field280 >= 724 && class15.field280 <= 758 && class82.field1909 >= 466 && class82.field1909 < 502 && class42.field956[13] != -1) {
            class28.field716 = 13;
            class97.field2168 = true;
            class25.field630 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)Lva;", line = 133)
    public static final class121 method205(int arg0, boolean arg1) {
        field656++;
        if (arg1) {
            method204((byte) -37);
        }
        return class113.method866((byte) -46, new class121[] { class35.method242(arg0 >> 24 & 0xFF, 10), class45.field1044, class35.method242(arg0 >> 16 & 0xFF, 10), class45.field1044, class35.method242(arg0 >> 8 & 0xFF, 10), class45.field1044, class35.method242(arg0 & 0xFF, 10) });
    }

    @OriginalMember(owner = "client!ea", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 156)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field653++;
        if (class23.field596 != null) {
            class61.field1478 = 0;
            class81.field1871 = arg0.getX();
            class79.field1837 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ea", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 173)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class23.field596 != null) {
            class61.field1478 = 0;
            class81.field1871 = arg0.getX();
            class79.field1837 = arg0.getY();
        }
        field658++;
    }

    @OriginalMember(owner = "client!ea", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 189)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field661++;
        if (class23.field596 != null) {
            class61.field1478 = 0;
            class81.field1871 = -1;
            class79.field1837 = -1;
        }
    }

    @OriginalMember(owner = "client!ea", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 209)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class23.field596 != null) {
            class61.field1478 = 0;
            class81.field1871 = arg0.getX();
            class79.field1837 = arg0.getY();
        }
        field663++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 224)
    public static void method206(int arg0) {
        field670 = null;
        if (arg0 == 27624) {
            field673 = null;
            field651 = null;
            field671 = null;
            field672 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 238)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field664++;
        if (class23.field596 != null) {
            class61.field1478 = 0;
            class64.field1571 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ea", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 259)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field665++;
        if (class23.field596 != null) {
            class61.field1478 = 0;
            class66.field1590 = arg0.getX();
            class21.field559 = arg0.getY();
            class11.field195 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                class81.field1880 = 2;
                class64.field1571 = 2;
            } else {
                class81.field1880 = 1;
                class64.field1571 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)[Lbc;", line = 292)
    public static final class10[] method207(int arg0) {
        field666++;
        class10[] var1 = new class10[class120.field2760];
        if (arg0 < 7) {
            field669 = -23;
        }
        for (int var2 = 0; var2 < class120.field2760; var2++) {
            class10 var3 = var1[var2] = new class10();
            var3.field163 = class25.field643;
            var3.field161 = class1.field12;
            var3.field166 = class116.field2643[var2];
            var3.field162 = class64.field1547[var2];
            var3.field167 = class107.field2450[var2];
            var3.field165 = class86.field1973[var2];
            byte[] var4 = class57.field1320[var2];
            int var5 = var3.field167 * var3.field165;
            var3.field164 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field164[var6] = class28.field701[class90.method614(255, var4[var6])];
            }
        }
        class1.method5((byte) 108);
        return var1;
    }

    @OriginalMember(owner = "client!ea", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 334)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field652++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIII)V", line = 353)
    public static final void method208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 25359) {
            return;
        }
        field657++;
        if (arg1 < 1 || arg7 < 1 || arg1 > 102 || arg7 > 102) {
            return;
        }
        if (class38.field879 && class121.field2807 != arg3) {
            return;
        }
        int var8 = 0;
        if (arg6 == 0) {
            var8 = class58.field1348.method739(arg3, arg1, arg7);
        }
        if (arg6 == 1) {
            var8 = class58.field1348.method722(arg3, arg1, arg7);
        }
        boolean var9 = true;
        if (arg6 == 2) {
            var8 = class58.field1348.method768(arg3, arg1, arg7);
        }
        if (arg6 == 3) {
            var8 = class58.field1348.method761(arg3, arg1, arg7);
        }
        boolean var10 = false;
        boolean var11 = false;
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class58.field1348.method741(arg3, arg1, arg7, var8);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg6 == 0) {
                class58.field1348.method740(arg3, arg1, arg7);
                class59 var16 = class20.method179(6, var12);
                if (var16.field1370) {
                    class18.field385[arg3].method119(var16.field1374, arg1, var15, -157, var14, arg7);
                }
            }
            if (arg6 == 1) {
                class58.field1348.method729(arg3, arg1, arg7);
            }
            if (arg6 == 2) {
                class58.field1348.method747(arg3, arg1, arg7);
                class59 var17 = class20.method179(arg4 ^ 0x6309, var12);
                if (var17.field1371 + arg1 > 103 || var17.field1371 + arg7 > 103 || var17.field1387 + arg1 > 103 || arg7 + var17.field1387 > 103) {
                    return;
                }
                if (var17.field1370) {
                    class18.field385[arg3].method114(var15, -19742, var17.field1387, arg1, arg7, var17.field1374, var17.field1371);
                }
            }
            if (arg6 == 3) {
                class58.field1348.method744(arg3, arg1, arg7);
                class59 var18 = class20.method179(6, var12);
                if (var18.field1370 && var18.field1373 == 1) {
                    class18.field385[arg3].method112((byte) 101, arg1, arg7);
                }
            }
        }
        if (arg0 < 0) {
            return;
        }
        int var19 = arg3;
        if (arg3 < 3 && (class23.field613[1][arg1][arg7] & 0x2) == 2) {
            var19 = arg3 + 1;
        }
        class95.method647(arg7, arg3, var19, class18.field385[arg3], arg0, arg1, arg5, arg4 ^ 0x630E, class58.field1348, arg2);
        return;
    }
}
