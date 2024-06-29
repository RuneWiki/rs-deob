import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class111 extends class10 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lfr;")
    private class497 field1674 = new class497();

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Lfr;")
    private class497 field1692 = new class497();

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Z")
    private boolean field1694;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Lgn;")
    public static class526 field1693 = new class526(12, 14);

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    private int field1687;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    private int field1688;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    private int field1690;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Lrl;")
    public static class524 field1697;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field1695;

    static {
        new class347("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field1696 = 2;
    }

    @OriginalMember(owner = "client!fd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 5)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field1675++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 15)
    public final synchronized void method53(int arg0) {
        this.field1688 = this.field1689;
        this.field1687 = this.field1691;
        this.field1673 = this.field1690;
        field1668++;
        class497 var2 = this.field1674;
        this.field1674 = this.field1692;
        this.field1692 = var2;
        this.field1692.method2955(2131289328);
        int var3 = 126 / ((8 - arg0) / 39);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 36)
    private final void method860(Component arg0, byte arg1) {
        if (arg1 != 118) {
            this.field1692 = null;
        }
        this.method861((byte) 52);
        field1672++;
        this.field1695 = arg0;
        this.field1695.addMouseListener(this);
        this.field1695.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V", line = 55)
    private final void method861(byte arg0) {
        field1670++;
        if (this.field1695 == null) {
            return;
        }
        this.field1695.removeMouseListener(this);
        this.field1695.removeMouseMotionListener(this);
        this.field1689 = this.field1691 = this.field1690 = 0;
        this.field1692 = null;
        this.field1674 = null;
        int var2 = 24 % ((-arg0 - 30) / 54);
        this.field1695 = null;
        this.field1688 = this.field1687 = this.field1673 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)Lkn;", line = 78)
    public final class376 method51(byte arg0) {
        if (arg0 <= 94) {
            field1697 = null;
        }
        field1666++;
        return (class376) this.field1674.method2951((byte) -62);
    }

    @OriginalMember(owner = "client!fd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 89)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1665++;
        int var2 = this.method867((byte) 41, arg0);
        if ((this.field1690 & var2) == 0) {
            var2 = this.field1690;
        }
        if ((var2 & 0x1) != 0) {
            this.method868(3, arg0.getX(), arg0.getY(), (byte) -126);
        }
        if ((var2 & 0x4) != 0) {
            this.method868(5, arg0.getX(), arg0.getY(), (byte) -128);
        }
        if ((var2 & 0x2) != 0) {
            this.method868(4, arg0.getX(), arg0.getY(), (byte) -125);
        }
        this.field1690 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILya;Lga;)V", line = 121)
    public static final void method862(int arg0, class11 arg1, class243 arg2) {
        field1678++;
        if (class137.field2018 == null) {
            return;
        }
        if (class507.field7449 < 10) {
            if (!class137.field2015.method525(class137.field2018.field2271, 0)) {
                class507.field7449 = class307.field4602.method540(0, class137.field2018.field2271) / 10;
                return;
            }
            class21.method218(arg0 ^ 0x5F64);
            class507.field7449 = 10;
        }
        if (class507.field7449 == 10) {
            class137.field2035 = class137.field2018.field2265 >> 6 << 6;
            class137.field2036 = class137.field2018.field2258 >> 6 << 6;
            class137.field2053 = (class137.field2018.field2257 >> 6 << 6) + 64 - class137.field2035;
            class137.field2049 = (class137.field2018.field2251 >> 6 << 6) + 64 - class137.field2036;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class137.field2018.method1079(class410.field6198.field7686, false, (class410.field6198.field7681 >> 7) + class267.field3979, class241.field3358 - -(class410.field6198.field7671 >> 7), var3)) {
                var5 = var3[2] - class137.field2036;
                var4 = var3[1] - class137.field2035;
            }
            if (!class53.field704 && var4 >= 0 && var4 < class137.field2053 && var5 >= 0 && class137.field2049 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class473.field6977 = var7;
                class170.field2508 = var6;
            } else if (class486.field7237 == -1 || class46.field597 == -1) {
                class137.field2018.method1080(24102, class137.field2018.field2261 & 0x3FFF, (class137.field2018.field2261 & 0xFFFFFA8) >> 14, var3);
                class170.field2508 = var3[1] - class137.field2035;
                class473.field6977 = var3[2] - class137.field2036;
            } else {
                class137.field2018.method1080(arg0 ^ 0xFFFFFED5, class46.field597, class486.field7237, var3);
                if (var3 != null) {
                    class473.field6977 = var3[2] - class137.field2036;
                    class170.field2508 = var3[1] - class137.field2035;
                }
                class53.field704 = false;
                class46.field597 = -1;
                class486.field7237 = -1;
            }
            if (class137.field2018.field2252 == 37) {
                class137.field2026 = 3.0F;
                class137.field2023 = 3.0F;
            } else if (class137.field2018.field2252 == 50) {
                class137.field2026 = 4.0F;
                class137.field2023 = 4.0F;
            } else if (class137.field2018.field2252 == 75) {
                class137.field2026 = 6.0F;
                class137.field2023 = 6.0F;
            } else if (class137.field2018.field2252 == 100) {
                class137.field2026 = 8.0F;
                class137.field2023 = 8.0F;
            } else if (class137.field2018.field2252 == 200) {
                class137.field2026 = 16.0F;
                class137.field2023 = 16.0F;
            } else {
                class137.field2026 = 8.0F;
                class137.field2023 = 8.0F;
            }
            class137.field2029 = (int) class137.field2026 >> 1;
            class137.field2027 = class158.method1124(class137.field2029, (byte) 1);
            class239.method1468((byte) -110);
            class137.method1009();
            class6.field59 = new class497();
            class137.field2032 += (int) (Math.random() * 5.0D) - 2;
            if (class137.field2032 < -8) {
                class137.field2032 = -8;
            }
            if (class137.field2032 > 8) {
                class137.field2032 = 8;
            }
            class137.field2030 += (int) (Math.random() * 5.0D) - 2;
            if (class137.field2030 < -16) {
                class137.field2030 = -16;
            }
            if (class137.field2030 > 16) {
                class137.field2030 = 16;
            }
            class137.method1014(arg2, class137.field2032 >> 2 << 10, class137.field2030 >> 1);
            class137.field2014.method702(1024, -14845, 256);
            class137.field2019.method337(256, (byte) -127, 256);
            class137.field2017.method252(23062, 4096);
            class41.field539.method2510(256, (byte) 54);
            class507.field7449 = 20;
        } else if (class507.field7449 == 20) {
            class99.method762(true, 841940584);
            class137.method1012(arg1, class137.field2032, class137.field2030);
            class507.field7449 = 60;
            class99.method762(true, arg0 ^ 0xCDD15E9B);
            class103.method779(12592);
        } else if (class507.field7449 == 60) {
            if (class137.field2015.method531(class137.field2018.field2271 + "_staticelements", -119)) {
                if (!class137.field2015.method525(class137.field2018.field2271 + "_staticelements", 0)) {
                    return;
                }
                class137.field2031 = class71.method505(class137.field2018.field2271 + "_staticelements", 10392, class125.field1884, class137.field2015);
            } else {
                class137.field2031 = new class290(0);
            }
            class137.method1000();
            class507.field7449 = 70;
            class99.method762(true, 841940584);
            class103.method779(12592);
        } else if (class507.field7449 == 70) {
            class87.field1371 = new class294(arg1, 11, true, class357.field5469);
            class507.field7449 = 73;
            class99.method762(true, 841940584);
            class103.method779(arg0 + 36925);
        } else if (class507.field7449 == 73) {
            class414.field6248 = new class294(arg1, 12, true, class357.field5469);
            class507.field7449 = 76;
            class99.method762(true, 841940584);
            class103.method779(12592);
        } else if (class507.field7449 == 76) {
            class146.field2194 = new class294(arg1, 14, true, class357.field5469);
            class507.field7449 = 79;
            class99.method762(true, 841940584);
            class103.method779(12592);
        } else if (class507.field7449 == 79) {
            class266.field3967 = new class294(arg1, 17, true, class357.field5469);
            class507.field7449 = 82;
            class99.method762(true, 841940584);
            class103.method779(12592);
        } else if (class507.field7449 == 82) {
            class314.field4858 = new class294(arg1, 19, true, class357.field5469);
            class507.field7449 = 85;
            class99.method762(true, 841940584);
            class103.method779(12592);
        } else if (class507.field7449 == 85) {
            class286.field4294 = new class294(arg1, 22, true, class357.field5469);
            class507.field7449 = 88;
            class99.method762(true, 841940584);
            class103.method779(12592);
        } else if (class507.field7449 == 88) {
            class197.field2886 = new class294(arg1, 26, true, class357.field5469);
            class507.field7449 = 91;
            class99.method762(true, 841940584);
            class103.method779(12592);
        } else {
            class282.field4266 = new class294(arg1, 30, true, class357.field5469);
            class507.field7449 = 100;
            if (arg0 != -24333) {
                method866((byte) 68, -16, -106);
            }
            class99.method762(true, arg0 + 841964917);
            class103.method779(arg0 + 36925);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 350)
    private final void method863(int arg0, MouseEvent arg1) {
        field1681++;
        this.field1689 = arg1.getX();
        if (arg0 != -1) {
            this.field1692 = null;
        }
        this.field1691 = arg1.getY();
        if (this.field1694) {
            this.method868(-1, arg1.getX(), arg1.getY(), (byte) -123);
        }
    }

    @OriginalMember(owner = "client!fd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 373)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1684++;
        int var2 = this.method867((byte) 41, arg0);
        if (var2 == 1) {
            this.method868(0, arg0.getX(), arg0.getY(), (byte) -123);
        } else if (var2 == 4) {
            this.method868(2, arg0.getX(), arg0.getY(), (byte) -125);
        } else if (var2 == 2) {
            this.method868(1, arg0.getX(), arg0.getY(), (byte) -128);
        }
        this.field1690 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V", line = 398)
    public static final void method864(int arg0) {
        field1667++;
        if (class237.field3314 != null) {
            return;
        }
        if (arg0 != -11481) {
            method862(21, null, null);
        }
        int var1 = class252.field3438;
        int var2 = class33.field457;
        int var3 = class455.field6669 - class155.field2347 - var1;
        int var4 = class69.field921 - var2 - class413.field6241;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class176.field2596 == null) {
                var5 = class25.field375.field1611;
            } else {
                var5 = class176.field2596;
            }
            int var6 = 0;
            int var7 = 0;
            if (class176.field2596 == var5) {
                Insets var8 = class176.field2596.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class69.field921);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class455.field6669, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 - (var3 - class455.field6669), var7, var3, class69.field921);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class69.field921 - var4, class455.field6669, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 468)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method863(-1, arg0);
        field1685++;
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V", line = 478)
    public static void method865(int arg0) {
        field1697 = null;
        if (arg0 != 85) {
            method864(109);
        }
        field1693 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Z", line = 490)
    public final boolean method47(int arg0) {
        field1682++;
        if (arg0 != 302) {
            field1696 = 35;
        }
        return (this.field1673 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 501)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method863(-1, arg0);
        field1677++;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)I", line = 511)
    public final int method54(int arg0) {
        field1669++;
        if (arg0 != 28455) {
            this.field1694 = true;
        }
        return this.field1687;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Z", line = 523)
    public final boolean method48(boolean arg0) {
        field1679++;
        if (arg0) {
            this.field1692 = null;
        }
        return (this.field1673 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 536)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1662++;
        this.field1691 = -1;
        this.field1689 = -1;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 677)
    public class111(Component arg0, boolean arg1) {
        this.method860(arg0, (byte) 118);
        this.field1694 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V", line = 551)
    public final void method46(byte arg0) {
        field1664++;
        this.method861((byte) -84);
        if (arg0 > -38) {
            this.field1687 = -64;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z", line = 562)
    public final boolean method49(int arg0) {
        field1663++;
        if (arg0 <= 81) {
            field1693 = null;
        }
        return (this.field1673 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!fd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 573)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method863(-1, arg0);
        field1671++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)V", line = 581)
    public static final void method866(byte arg0, int arg1, int arg2) {
        if (class36.field496 == 1) {
            class101.method771(arg1, (byte) 112, class521.field7664, arg2);
        } else if (class36.field496 == 2) {
            class431.method2549(arg2, (byte) -78, arg1);
        }
        field1686++;
        class36.field496 = 0;
        class521.field7664 = null;
        if (arg0 != -98) {
            field1696 = 77;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I", line = 603)
    public final int method44(byte arg0) {
        field1676++;
        if (arg0 <= 43) {
            this.field1691 = -98;
        }
        return this.field1688;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 615)
    private final int method867(byte arg0, MouseEvent arg1) {
        field1683++;
        if (arg0 != 41) {
            this.method863(6, null);
        }
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIB)V", line = 656)
    private final void method868(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -122) {
            field1696 = -64;
        }
        field1680++;
        class130 var5 = new class130();
        var5.field1933 = arg2;
        var5.field1930 = arg0;
        var5.field1925 = arg1;
        var5.field1928 = class381.method2281((byte) 105);
        this.field1692.method2958(var5, (byte) 115);
    }
}
