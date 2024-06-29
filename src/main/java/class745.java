import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class745 extends class134 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!jga", name = "H", descriptor = "Lef;")
    private class513 field10827 = new class513();

    @OriginalMember(owner = "client!jga", name = "G", descriptor = "Lef;")
    private class513 field10853 = new class513();

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "Z")
    private boolean field10858;

    @OriginalMember(owner = "client!jga", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field10860 = new String[] { method5438(method5437("c\u0017T\f|!")), method5438(method5437("g\u0005YN")), method5438(method5437("c\u0017T\fa!")), method5438(method5437("r^\u001b\fP")), method5438(method5437("c\u0017T\f@f\u0005FG}{\u0015FQHmX")), method5438(method5437("c\u0017T\fk!")), method5438(method5437("c\u0017T\f@f\u0005FGhq\u0019AGI!")), method5438(method5437("c\u0017T\f@f\u0005FG`f\u0006PF\u0005")), method5438(method5437("c\u0017T\fg!")), method5438(method5437("c\u0017T\f@f\u0005FGi{\u0011REHmX")), method5438(method5437("c\u0017T\fo!")), method5438(method5437("c\u0017T\fd!")), method5438(method5437("c\u0017T\fl!")), method5438(method5437("c\u0017T\f`!")), method5438(method5437("c\u0017T\fi!")), method5438(method5437("c\u0017T\f\u007f!")), method5438(method5437("c\u0017T\f@f\u0005FG\u007fl\u001cPC^l\u0014\u001d")), method5438(method5437("c\u0017T\fe!")), method5438(method5437("c\u0017T\fn!")), method5438(method5437("c\u0017T\fh!")), method5438(method5437("c\u0017T\f@f\u0005FGne\u0019VIHmX")), method5438(method5437("c\u0017T\f\u0011`\u001e\\V\u0013!")), method5438(method5437("c\u0017T\fb!")), method5438(method5437("c\u0017T\fj!")), method5438(method5437("A\u0019QFHg]@QH")), method5438(method5437("c\u0017T\f}!")), method5438(method5437("c\u0017T\ff!")), method5438(method5437("c\u0017T\fc!")), method5438(method5437("c\u0017T\f@f\u0005FGhg\u0004PPHmX")) };

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "Lvha;")
    public static class713 field10834 = new class713(0, 4);

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "I")
    public static int field10825;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
    private int field10826;

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "I")
    public static int field10828;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
    public static int field10829;

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "I")
    public static int field10830;

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "I")
    public static int field10831;

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    public static int field10832;

    @OriginalMember(owner = "client!jga", name = "I", descriptor = "I")
    public static int field10833;

    @OriginalMember(owner = "client!jga", name = "E", descriptor = "I")
    public static int field10835;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    public static int field10836;

    @OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
    public static int field10837;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    public static int field10838;

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "I")
    public static int field10839;

    @OriginalMember(owner = "client!jga", name = "L", descriptor = "I")
    public static int field10840;

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
    public static int field10841;

    @OriginalMember(owner = "client!jga", name = "M", descriptor = "I")
    public static int field10842;

    @OriginalMember(owner = "client!jga", name = "A", descriptor = "I")
    public static int field10843;

    @OriginalMember(owner = "client!jga", name = "N", descriptor = "I")
    private int field10844;

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "I")
    public static int field10845;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    public static int field10846;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "I")
    public static int field10847;

    @OriginalMember(owner = "client!jga", name = "F", descriptor = "I")
    public static int field10848;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    public static int field10849;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    public static int field10850;

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "I")
    private int field10851;

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "I")
    private int field10852;

    @OriginalMember(owner = "client!jga", name = "D", descriptor = "I")
    public static int field10854;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
    private int field10855;

    @OriginalMember(owner = "client!jga", name = "t", descriptor = "I")
    public static int field10856;

    @OriginalMember(owner = "client!jga", name = "K", descriptor = "I")
    private int field10857;

    @OriginalMember(owner = "client!jga", name = "C", descriptor = "Ljava/awt/Component;")
    private Component field10859;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(I)V", line = 3)
    public final synchronized void method403(int arg0) {
        try {
            field10829++;
            this.field10844 = this.field10855;
            this.field10826 = this.field10857;
            this.field10851 = this.field10852;
            if (arg0 == 0) {
                class513 var2 = this.field10827;
                this.field10827 = this.field10853;
                this.field10853 = var2;
                this.field10853.method3879(107);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10860[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 26)
    public final synchronized void mousePressed(MouseEvent arg0) {
        try {
            field10838++;
            int var2 = this.method5428((byte) 120, arg0);
            if (var2 == 1) {
                this.method5434(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0, 0);
            } else if (var2 == 4) {
                this.method5434(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0, 2);
            } else if (var2 == 2) {
                this.method5434(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0, 1);
            }
            this.field10857 |= var2;
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10860[4] + (arg0 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lib;Z)V", line = 51)
    public static final void method5427(class163 arg0, boolean arg1) {
        try {
            field10842++;
            int var2 = arg0.method1425(105);
            class717.field10398 = new class43[var2];
            for (int var3 = 0; var3 < var2; var3++) {
                class717.field10398[var3] = new class43();
                class717.field10398[var3].field508 = arg0.method1425(77);
                class717.field10398[var3].field510 = arg0.method1399(-31376);
            }
            class29.field355 = arg0.method1425(14);
            class588.field8656 = arg0.method1425(66);
            class748.field10895 = arg0.method1425(116);
            class612.field8928 = new class604[class588.field8656 + 1 - class29.field355];
            for (int var4 = 0; var4 < class748.field10895; var4++) {
                int var5 = arg0.method1425(113);
                class604 var6 = class612.field8928[var5] = new class604();
                var6.field2525 = arg0.method1455((byte) 62);
                var6.field2529 = arg0.method1453((byte) 100);
                var6.field8860 = class29.field355 + var5;
                var6.field8855 = arg0.method1399(-31376);
                var6.field8850 = arg0.method1399(-31376);
            }
            class540.field7921 = arg0.method1453((byte) 84);
            class76.field874 = arg1;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10860[2] + (arg0 == null ? field10860[1] : field10860[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 95)
    private final int method5428(byte arg0, MouseEvent arg1) {
        try {
            field10836++;
            int var3 = arg1.getModifiers();
            boolean var4 = (var3 & 0x10) != 0;
            if (arg0 != 120) {
                this.method5430(54, null);
            }
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
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10860[22] + arg0 + ',' + (arg1 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 130)
    public final synchronized void mouseExited(MouseEvent arg0) {
        try {
            field10833++;
            this.method5433(1, arg0.getY(), arg0.getX());
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[6] + (arg0 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "(I)V", line = 138)
    public static final void method5429(int arg0) {
        try {
            if (arg0 != -6124) {
                field10834 = null;
            }
            class729.field10595 = true;
            field10843++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10860[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 151)
    private final void method5430(int arg0, Component arg1) {
        try {
            this.method5436((byte) 78);
            if (arg0 == -1) {
                field10831++;
                this.field10859 = arg1;
                this.field10859.addMouseListener(this);
                this.field10859.addMouseMotionListener(this);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10860[19] + arg0 + ',' + (arg1 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILcn;)Ljava/lang/String;", line = 171)
    public static final String method5431(int arg0, class541 arg1) {
        try {
            if (arg0 != -1) {
                field10834 = null;
            }
            field10848++;
            if (client.method2670(arg1).method3564(122) == 0) {
                return null;
            } else if (arg1.field7963 == null || arg1.field7963.trim().length() == 0) {
                return class90.field1028 ? field10860[24] : null;
            } else {
                return arg1.field7963;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[23] + arg0 + ',' + (arg1 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z", line = 194)
    public final boolean method397(byte arg0) {
        try {
            field10856++;
            if (arg0 == -75) {
                return (this.field10826 & 0x2) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(III)V", line = 205)
    public static final void method5432(int arg0, int arg1, int arg2) {
        try {
            field10846++;
            class313 var3 = class196.method1670((long) arg0, arg1, -40);
            var3.method2636((byte) -1);
            var3.field4951 = arg2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10860[27] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 216)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        try {
            field10835++;
            int var2 = this.method5428((byte) 120, arg0);
            if ((this.field10857 & var2) == 0) {
                var2 = this.field10857;
            }
            if ((var2 & 0x1) != 0) {
                this.method5434(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0, 3);
            }
            if ((var2 & 0x4) != 0) {
                this.method5434(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0, 5);
            }
            if ((var2 & 0x2) != 0) {
                this.method5434(arg0.getX(), arg0.getClickCount(), arg0.getY(), 0, 4);
            }
            this.field10857 &= ~var2;
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10860[16] + (arg0 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(III)V", line = 247)
    private final void method5433(int arg0, int arg1, int arg2) {
        try {
            this.field10855 = arg1;
            field10830++;
            this.field10852 = arg2;
            if (arg0 != 1) {
                this.method392(-65);
            }
            if (this.field10858) {
                this.method5434(arg2, 0, arg1, 0, -1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10860[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Z", line = 268)
    public final boolean method394(int arg0) {
        try {
            if (arg0 != 0) {
                this.field10851 = 116;
            }
            field10845++;
            return (this.field10826 & 0x1) != 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Lbk;", line = 281)
    public final class394 method396(int arg0) {
        try {
            field10854++;
            if (arg0 != 15) {
                this.method5436((byte) -89);
            }
            return (class394) this.field10827.method3875(-87);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(B)I", line = 292)
    public final int method391(byte arg0) {
        try {
            field10825++;
            return arg0 == 94 ? this.field10844 : 124;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIII)V", line = 306)
    private final void method5434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field10841++;
            class258 var6 = new class258();
            var6.field3987 = arg1;
            var6.field3992 = arg4;
            if (arg3 == 0) {
                var6.field3997 = arg0;
                var6.field3994 = arg2;
                var6.field3991 = class430.method3299(111);
                this.field10853.method3868(-39, var6);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10860[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 324)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        try {
            field10828++;
            this.method5433(1, arg0.getY(), arg0.getX());
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[9] + (arg0 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 333)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        try {
            this.method5433(1, arg0.getY(), arg0.getX());
            field10849++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[7] + (arg0 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "(I)V", line = 341)
    public static void method5435(int arg0) {
        try {
            field10834 = null;
            if (arg0 != 0) {
                method5435(-21);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10860[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 351)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        try {
            field10840++;
            this.method5433(1, arg0.getY(), arg0.getX());
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[28] + (arg0 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 359)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        try {
            if (arg0.isPopupTrigger()) {
                arg0.consume();
            }
            field10837++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[20] + (arg0 == null ? field10860[1] : field10860[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)I", line = 370)
    public final int method401(int arg0) {
        try {
            if (arg0 != 16428) {
                this.method394(55);
            }
            field10832++;
            return this.field10851;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "(I)Z", line = 385)
    public final boolean method392(int arg0) {
        try {
            if (arg0 != 15) {
                this.mousePressed(null);
            }
            field10847++;
            return (this.field10826 & 0x4) != 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)V", line = 400)
    public final void method400(byte arg0) {
        try {
            this.method5436((byte) 78);
            if (arg0 == 56) {
                field10850++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 448)
    public class745(Component arg0, boolean arg1) {
        try {
            this.method5430(-1, arg0);
            this.field10858 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10860[21] + (arg0 == null ? field10860[1] : field10860[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "(B)V", line = 420)
    private final void method5436(byte arg0) {
        try {
            field10839++;
            if (this.field10859 != null) {
                this.field10859.removeMouseMotionListener(this);
                this.field10859.removeMouseListener(this);
                this.field10852 = this.field10855 = this.field10857 = 0;
                this.field10827 = null;
                this.field10859 = null;
                this.field10851 = this.field10844 = this.field10826 = 0;
                this.field10853 = null;
                if (arg0 != 78) {
                    this.method5436((byte) 103);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10860[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5437(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5438(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
