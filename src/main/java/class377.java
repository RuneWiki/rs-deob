import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class377 extends class53 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Leb;")
    private class395 field5505 = new class395();

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "Leb;")
    private class395 field5531 = new class395();

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Z")
    private boolean field5534;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lll;")
    public static class343 field5509 = class458.method2833(false);

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    private int field5506;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    private int field5514;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    private int field5527;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    private int field5528;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    private int field5529;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    private int field5532;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Lct;")
    public static class104 field5520;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field5533;

    static {
        new class409("Select", "Auswählen", "Sélectionner", "Selecionar");
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method407(byte arg0) {
        field5499++;
        if (arg0 > -120) {
            this.method407((byte) 11);
        }
        return (this.field5527 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I", line = 16)
    public final int method411(int arg0) {
        if (arg0 != 0) {
            this.mouseExited((MouseEvent) null);
        }
        field5522++;
        return this.field5514;
    }

    @OriginalMember(owner = "client!rg", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 28)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2391((byte) -109, arg0);
        field5526++;
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)Lrb;", line = 36)
    public final class436 method418(int arg0) {
        field5510++;
        if (arg0 <= 124) {
            method2386((byte) -121);
        }
        return (class436) this.field5505.method2476(-29642);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Z", line = 47)
    public final boolean method408(int arg0) {
        int var2 = -43 / ((13 - arg0) / 43);
        field5513++;
        return (this.field5527 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIZ)V", line = 60)
    public static final void method2383(boolean arg0, int arg1, boolean arg2) {
        class444.field6480 = new byte[arg1][class195.field2745][class78.field984];
        class264.field3910 = new int[arg1][class195.field2745 + 1][class78.field984 + 1];
        class427.field6211 = new byte[arg1][class195.field2745][class78.field984];
        class82.field1007 = new byte[arg1][class195.field2745][class78.field984];
        class86.field1063 = new int[class78.field984];
        if (!arg0) {
            return;
        }
        class349.field5116 = new int[class78.field984];
        if (!arg2) {
            class157.field2114 = null;
        }
        class282.field4150 = new byte[arg1][class195.field2745 + 1][class78.field984 + 1];
        class245.field3626 = new int[class78.field984];
        field5516++;
        class307.field4536 = new int[5];
        class316.field4632 = new byte[arg1][class195.field2745][class78.field984];
        class263.field3897 = new int[class78.field984];
        class455.field6725 = new int[class78.field984];
        class253.field3722 = 99;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V", line = 86)
    private final void method2384(int arg0, int arg1, int arg2, int arg3) {
        field5512++;
        class386 var5 = new class386();
        var5.field5645 = arg2;
        var5.field5642 = arg0;
        var5.field5640 = arg3;
        var5.field5648 = class43.method364(-16756);
        if (arg1 < -50) {
            this.field5531.method2484(0, var5);
        }
    }

    @OriginalMember(owner = "client!rg", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 104)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5515++;
        int var2 = this.method2387(arg0, 1);
        if ((var2 & this.field5529) == 0) {
            var2 = this.field5529;
        }
        if ((var2 & 0x1) != 0) {
            this.method2384(3, -124, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2384(5, -58, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2384(4, -66, arg0.getX(), arg0.getY());
        }
        this.field5529 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V", line = 133)
    private final void method2385(byte arg0) {
        if (arg0 != -84) {
            return;
        }
        field5498++;
        if (this.field5533 == null) {
            return;
        }
        this.field5533.removeMouseListener(this);
        this.field5533.removeMouseMotionListener(this);
        this.field5532 = this.field5528 = this.field5529 = 0;
        this.field5533 = null;
        this.field5531 = null;
        this.field5514 = this.field5506 = this.field5527 = 0;
        this.field5505 = null;
    }

    @OriginalMember(owner = "client!rg", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 156)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5504++;
    }

    @OriginalMember(owner = "client!rg", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 171)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5511++;
        int var2 = this.method2387(arg0, 1);
        if (var2 == 1) {
            this.method2384(0, -111, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method2384(2, -56, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method2384(1, -75, arg0.getX(), arg0.getY());
        }
        this.field5529 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V", line = 197)
    public static final void method2386(byte arg0) {
        class188.field2633.method600(-105);
        field5501++;
        if (arg0 != 92) {
            method2386((byte) -44);
        }
        class465.field6847.method600(-89);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 209)
    private final int method2387(MouseEvent arg0, int arg1) {
        field5521++;
        int var3 = arg0.getModifiers();
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
            if (arg1 != 1) {
                method2390(57, (class58) null);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 248)
    private final void method2388(byte arg0, Component arg1) {
        this.method2385((byte) -84);
        field5508++;
        if (arg0 < 59) {
            method2386((byte) 44);
        }
        this.field5533 = arg1;
        this.field5533.addMouseListener(this);
        this.field5533.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!rg", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 262)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field5528 = -1;
        this.field5532 = -1;
        field5500++;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 275)
    public final synchronized void method410(int arg0) {
        this.field5527 = this.field5529;
        this.field5514 = this.field5532;
        this.field5506 = this.field5528;
        field5517++;
        int var2 = -119 / ((-arg0 - 90) / 32);
        class395 var3 = this.field5505;
        this.field5505 = this.field5531;
        this.field5531 = var3;
        this.field5531.method2477(-14221);
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)I", line = 302)
    public final int method415(int arg0) {
        if (arg0 >= -71) {
            this.field5531 = null;
        }
        field5518++;
        return this.field5506;
    }

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)V", line = 314)
    public static void method2389(int arg0) {
        if (arg0 != 0) {
            field5524 = 102;
        }
        field5520 = null;
        field5509 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 325)
    public final void method416(byte arg0) {
        field5523++;
        this.method2385((byte) -84);
        if (arg0 != 65) {
            this.field5529 = -113;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILva;)V", line = 336)
    public static final void method2390(int arg0, class58 arg1) {
        field5507++;
        boolean var2 = false;
        if (class388.field5665 == arg1.field743 || arg1.field751 == -1 || arg1.field737 != 0) {
            var2 = true;
        } else {
            class196 var3 = class83.method556(arg1.field751, 82);
            if (var3.field2758 || arg1.field756 + 1 > var3.field2763[arg1.field717]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field743 - arg1.field760;
            int var5 = class388.field5665 - arg1.field760;
            int var6 = arg1.field727 * 128 + (arg1.method446(10) * 64);
            int var7 = arg1.field710 * 128 + (arg1.method446(10) * 64);
            int var8 = arg1.field776 * 128 + arg1.method446(10) * 64;
            int var9 = arg1.field757 * 128 + arg1.method446(10) * 64;
            arg1.field4951 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field4954 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field789 = 0;
        if (arg1.field745 == 0) {
            arg1.method437(8192, arg0 + 8);
        }
        if (arg1.field745 == 1) {
            arg1.method437(12288, 10);
        }
        if (arg1.field745 == arg0) {
            arg1.method437(0, 10);
        }
        if (arg1.field745 == 3) {
            arg1.method437(4096, 10);
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Z", line = 392)
    public final boolean method412(int arg0) {
        field5519++;
        if (arg0 == -13) {
            return (this.field5527 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)V", line = 403)
    private final void method2391(byte arg0, MouseEvent arg1) {
        this.field5532 = arg1.getX();
        field5502++;
        if (arg0 >= -20) {
            this.field5532 = 66;
        }
        this.field5528 = arg1.getY();
        if (this.field5534) {
            this.method2384(-1, -77, arg1.getX(), arg1.getY());
        }
    }

    @OriginalMember(owner = "client!rg", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 423)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5530++;
        this.method2391((byte) -78, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 433)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5503++;
        this.method2391((byte) -38, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 475)
    public class377(Component arg0, boolean arg1) {
        this.method2388((byte) 96, arg0);
        this.field5534 = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "(I)V", line = 446)
    public static final void method2392(int arg0) {
        field5525++;
        class387.field5659 = class233.method1582(8, 23219, 2048, 8, 35, true, 0.4F, 4);
        if (arg0 != 0) {
            field5524 = 80;
        }
    }
}
