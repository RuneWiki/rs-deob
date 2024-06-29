import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class425 extends class70 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Lkba;")
    private class108 field5962 = new class108();

    @OriginalMember(owner = "client!un", name = "E", descriptor = "Lkba;")
    private class108 field5984 = new class108();

    @OriginalMember(owner = "client!un", name = "P", descriptor = "Z")
    private boolean field5995;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "Llga;")
    public static class712 field5991 = new class712(72, 3);

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field5994 = 16777215;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "[I")
    public static int[] field5997 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    private int field5967;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    private int field5978;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    private int field5980;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    private int field5985;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    private int field5987;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    private int field5990;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "Lvia;")
    public static class564 field5993;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "Ljava/awt/Component;")
    private Component field5996;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "[[B")
    public static byte[][] field5983;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(B)Z")
    public final boolean method524(byte arg0) {
        if (arg0 != -19) {
            this.method526(-127);
        }
        field5998++;
        return (this.field5980 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(B)Z")
    public final boolean method520(byte arg0) {
        int var2 = -85 % ((72 - arg0) / 35);
        field5977++;
        return (this.field5980 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!un", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5981++;
        int var2 = this.method2437(23542, arg0);
        if (var2 == 1) {
            this.method2438(22661, arg0.getX(), arg0.getClickCount(), arg0.getY(), 0);
        } else if (var2 == 4) {
            this.method2438(22661, arg0.getX(), arg0.getClickCount(), arg0.getY(), 2);
        } else if (var2 == 2) {
            this.method2438(22661, arg0.getX(), arg0.getClickCount(), arg0.getY(), 1);
        }
        this.field5987 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Z")
    public final boolean method526(int arg0) {
        field5969++;
        if (arg0 == 1) {
            return (this.field5980 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
    public final void method529(int arg0) {
        if (arg0 < -110) {
            this.method2439((byte) 119);
            field5986++;
        }
    }

    @OriginalMember(owner = "client!un", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5971++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!un", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5982++;
        this.method2440(-22490, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!un", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field5965++;
        this.method2440(-22490, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V")
    public static void method2431(boolean arg0) {
        field5983 = null;
        field5993 = null;
        if (arg0) {
            method2435(-120, -17);
        }
        field5997 = null;
        field5991 = null;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(III)V")
    public static final void method2432(int arg0, int arg1, int arg2) {
        if (class226.field2934 != 0) {
            if (arg1 < 0) {
                for (int var3 = 0; var3 < 16; var3++) {
                    class266.field3526[var3] = arg0;
                }
            } else {
                class266.field3526[arg1] = arg0;
            }
        }
        field5963++;
        class68.field755.method4032(-17, arg1, arg0);
        if (arg2 != 0) {
            method2436(35, -66);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLlr;)Lkfa;")
    public static final class603 method2433(byte arg0, class752 arg1) {
        if (arg0 != -90) {
            return null;
        }
        field5973++;
        class603 var2;
        if (class389.field5485 == null) {
            var2 = new class603();
        } else {
            var2 = class389.field5485;
            class389.field5485 = class389.field5485.field8413;
            class122.field1585--;
            var2.field8413 = null;
        }
        var2.field8410 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method2434(int arg0, Component arg1) {
        int var3 = -82 % ((arg0 - 22) / 43);
        field5964++;
        this.method2439((byte) -40);
        this.field5996 = arg1;
        this.field5996.addMouseListener(this);
        this.field5996.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)I")
    public final int method528(int arg0) {
        field5989++;
        return arg0 <= 4 ? 121 : this.field5978;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Lhfa;")
    public final class314 method522(int arg0) {
        field5972++;
        if (arg0 != 600) {
            this.field5984 = null;
        }
        return (class314) this.field5962.method727(6494);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
    public static final boolean method2435(int arg0, int arg1) {
        field5968++;
        if (arg0 < 113) {
            return false;
        } else if (arg1 == 13 || arg1 == 23 || arg1 == 2 || arg1 == 30 || arg1 == 18) {
            return true;
        } else {
            return arg1 == 58 || arg1 == 1008;
        }
    }

    @OriginalMember(owner = "client!un", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2440(-22490, arg0.getX(), arg0.getY());
        field5979++;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)I")
    public static final int method2436(int arg0, int arg1) {
        field5960++;
        if (arg1 != 770356935) {
            field5993 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2437(int arg0, MouseEvent arg1) {
        field5974++;
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
        } else {
            if (arg0 != 23542) {
                this.field5980 = -41;
            }
            if (var5) {
                return 2;
            } else if (var6) {
                return 4;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(B)V")
    public final synchronized void method530(byte arg0) {
        this.field5967 = this.field5985;
        this.field5980 = this.field5987;
        field5961++;
        this.field5978 = this.field5990;
        class108 var2 = this.field5962;
        this.field5962 = this.field5984;
        this.field5984 = var2;
        if (arg0 <= 103) {
            this.field5980 = 55;
        }
        this.field5984.method728((byte) 47);
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(B)I")
    public final int method521(byte arg0) {
        if (arg0 < 24) {
            this.mouseExited(null);
        }
        field5970++;
        return this.field5967;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V")
    private final void method2438(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5992++;
        class751 var6 = new class751();
        var6.field10405 = arg2;
        var6.field10416 = arg4;
        var6.field10406 = arg1;
        var6.field10410 = arg3;
        var6.field10412 = class538.method2963(arg0 ^ 0xFFFFA754);
        if (arg0 != 22661) {
            this.field5962 = null;
        }
        this.field5984.method725(var6, arg0 ^ 0xFFFFF6D4);
    }

    @OriginalMember(owner = "client!un", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2440(-22490, arg0.getX(), arg0.getY());
        field5966++;
    }

    @OriginalMember(owner = "client!un", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5975++;
        int var2 = this.method2437(23542, arg0);
        if ((var2 & this.field5987) == 0) {
            var2 = this.field5987;
        }
        if ((var2 & 0x1) != 0) {
            this.method2438(22661, arg0.getX(), arg0.getClickCount(), arg0.getY(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2438(22661, arg0.getX(), arg0.getClickCount(), arg0.getY(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2438(22661, arg0.getX(), arg0.getClickCount(), arg0.getY(), 4);
        }
        this.field5987 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(B)V")
    private final void method2439(byte arg0) {
        field5976++;
        if (this.field5996 == null) {
            return;
        }
        this.field5996.removeMouseMotionListener(this);
        this.field5996.removeMouseListener(this);
        this.field5990 = this.field5985 = this.field5987 = 0;
        this.field5978 = this.field5967 = this.field5980 = 0;
        this.field5996 = null;
        int var2 = 20 / ((arg0 - 45) / 48);
        this.field5962 = null;
        this.field5984 = null;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class425(Component arg0, boolean arg1) {
        this.method2434(-32, arg0);
        this.field5995 = arg1;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(III)V")
    private final void method2440(int arg0, int arg1, int arg2) {
        field5988++;
        if (arg0 != -22490) {
            this.method2434(-122, null);
        }
        this.field5985 = arg2;
        this.field5990 = arg1;
        if (this.field5995) {
            this.method2438(22661, arg1, 0, arg2, -1);
        }
    }
}
