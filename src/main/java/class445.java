import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class445 extends class20 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "Lmf;")
    private class291 field6633 = new class291();

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "Lmf;")
    private class291 field6636 = new class291();

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "Z")
    private boolean field6639;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    private int field6614;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    private int field6620;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
    private int field6622;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    private int field6634;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
    private int field6635;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    private int field6637;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "Ljava/awt/Component;")
    private Component field6638;

    @OriginalMember(owner = "client!oo", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6623++;
        int var2 = this.method2660(1, arg0);
        if (var2 == 1) {
            this.method2662(arg0.getY(), arg0.getX(), false, 0);
        } else if (var2 == 4) {
            this.method2662(arg0.getY(), arg0.getX(), false, 2);
        } else if (var2 == 2) {
            this.method2662(arg0.getY(), arg0.getX(), false, 1);
        }
        this.field6637 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oo", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2666(true, arg0);
        field6617++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
    public static final boolean method2659(int arg0, int arg1) {
        if (arg0 != 0) {
            field6627 = 107;
        }
        field6629++;
        return arg1 == 2 || arg1 == 6 || arg1 == 9;
    }

    @OriginalMember(owner = "client!oo", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6615++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2660(int arg0, MouseEvent arg1) {
        field6625++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        if (arg0 != 1) {
            this.field6637 = -18;
        }
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

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(B)Z")
    public final boolean method140(byte arg0) {
        field6632++;
        if (arg0 <= 79) {
            return true;
        } else {
            return (this.field6620 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!oo", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6626++;
        int var2 = this.method2660(1, arg0);
        if ((this.field6637 & var2) == 0) {
            var2 = this.field6637;
        }
        if ((var2 & 0x1) != 0) {
            this.method2662(arg0.getY(), arg0.getX(), false, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2662(arg0.getY(), arg0.getX(), false, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2662(arg0.getY(), arg0.getX(), false, 4);
        }
        this.field6637 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I")
    public final int method132(int arg0) {
        if (arg0 <= 3) {
            this.field6637 = 13;
        }
        field6630++;
        return this.field6614;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lza;IILc;III[[[B[I[I[I[I[IIBIIZ)V")
    public static final void method2661(class288 arg0, int arg1, int arg2, class124 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class34.field522 = arg0;
        class122.field2125 = arg1;
        class63.field1292 = arg3;
        class196.field3150 = class34.field522.method403() > 0;
        class107.field1974 = arg4 >> class353.field5216;
        class199.field3222 = arg6 >> class353.field5216;
        class233.field3595 = arg4;
        class471.field6987 = arg6;
        class91.field1815 = arg5;
        class450.field6693 = class107.field1974 - class97.field1894;
        if (class450.field6693 < 0) {
            class467.field6939 = -class450.field6693;
            class450.field6693 = 0;
        } else {
            class467.field6939 = 0;
        }
        class498.field7314 = class199.field3222 - class97.field1894;
        if (class498.field7314 < 0) {
            class483.field7126 = -class498.field7314;
            class498.field7314 = 0;
        } else {
            class483.field7126 = 0;
        }
        class250.field3857 = class97.field1894 + class107.field1974;
        if (class250.field3857 > class493.field7231) {
            class250.field3857 = class493.field7231;
        }
        class531.field7725 = class97.field1894 + class199.field3222;
        if (class531.field7725 > class220.field3464) {
            class531.field7725 = class220.field3464;
        }
        for (int var18 = 0; var18 < class97.field1894 + class97.field1894 + 2; var18++) {
            for (int var23 = 0; var23 < class97.field1894 + class97.field1894 + 2; var23++) {
                int var24 = class107.field1974 + var18 - class97.field1894;
                int var25 = class199.field3222 + var23 - class97.field1894;
                if (var24 >= 0 && var25 >= 0 && var24 < class493.field7231 && var25 < class220.field3464) {
                    int var26 = var24 << class353.field5216;
                    int var27 = var25 << class353.field5216;
                    int var28 = class531.field7727[class531.field7727.length - 1].method177(var24, var25) - (0x3E8 << class353.field5216 - 7);
                    int var29 = class293.field4481 == null ? class531.field7727[0].method177(var24, var25) + class19.field312 : class293.field4481[0].method177(var24, var25) + class19.field312;
                    class486.field7158[var18][var23] = class34.field522.method361(var26, var28, var27, var26, var29, var27);
                } else {
                    class486.field7158[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class97.field1894 + class97.field1894 + 1; var19++) {
            for (int var22 = 0; var22 < class97.field1894 + class97.field1894 + 1; var22++) {
                class38.field559[var19][var22] = class486.field7158[var19][var22] || class486.field7158[var19 + 1][var22] || class486.field7158[var19][var22 + 1] || class486.field7158[var19 + 1][var22 + 1];
            }
        }
        class271.field4118 = arg8;
        class261.field3979 = arg9;
        class12.field174 = arg10;
        class499.field7329 = arg11;
        class58.field1221 = arg12;
        class7.method44();
        class67.method589(1);
        for (class385 var20 = (class385) class146.field2446.method533((byte) -50); var20 != null; var20 = (class385) class146.field2446.method536(-109)) {
            var20.method2352((byte) 113);
            class439.method2619(var20, 0);
        }
        if (class196.field3150) {
            for (int var21 = 0; var21 < class429.field6417; var21++) {
                class248.field3825[var21].method1280((byte) -73, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class34.field522.method409(0);
            if (class192.field3104 == null || class192.field3104 instanceof class198) {
                class192.field3104 = new class263();
            }
        } else if (class192.field3104 == null || class192.field3104 instanceof class263) {
            class192.field3104 = new class198();
        }
        class192.field3104.method1347(113, arg2);
        class192.field3104.method1345(-696);
        if (class310.field4698 != null) {
            class124.method985(true);
            class192.field3104.method1341((byte) -27, 22);
            class185.method1261(arg2, null, 0, (byte) 0, arg15, arg16);
            class192.field3104.method1345(-696);
            class192.field3104.method1341((byte) -27, 23);
            class124.method985(false);
        }
        class185.method1261(arg2, arg7, arg13, arg14, arg15, arg16);
        class192.field3104.method1345(-696);
        class192.field3104.method1349(1);
        class192.field3104.method1345(-696);
        if (arg2 > 1) {
            class34.field522.method316(0);
        }
        class34.field522.method372(0, null);
    }

    @OriginalMember(owner = "client!oo", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2666(true, arg0);
        field6628++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIZI)V")
    private final void method2662(int arg0, int arg1, boolean arg2, int arg3) {
        field6613++;
        class9 var5 = new class9();
        var5.field130 = arg1;
        var5.field133 = arg3;
        var5.field125 = arg0;
        var5.field126 = class423.method2578(-19698);
        this.field6636.method1885(arg2, var5);
    }

    @OriginalMember(owner = "client!oo", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2666(true, arg0);
        field6621++;
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(B)Z")
    public final boolean method138(byte arg0) {
        int var2 = -128 / ((arg0 + 29) / 57);
        field6618++;
        return (this.field6620 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method2663(byte arg0, Component arg1) {
        field6624++;
        this.method2664((byte) -127);
        this.field6638 = arg1;
        this.field6638.addMouseListener(this);
        int var3 = -82 / ((arg0 - 21) / 41);
        this.field6638.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Z")
    public final boolean method131(byte arg0) {
        field6608++;
        int var2 = -49 / ((-arg0 - 80) / 43);
        return (this.field6620 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oo", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field6635 = -1;
        field6609++;
        this.field6634 = -1;
    }

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "(B)V")
    private final void method2664(byte arg0) {
        field6619++;
        if (this.field6638 == null) {
            return;
        }
        this.field6638.removeMouseListener(this);
        this.field6638.removeMouseMotionListener(this);
        this.field6634 = this.field6635 = this.field6637 = 0;
        this.field6638 = null;
        this.field6636 = null;
        this.field6614 = this.field6622 = this.field6620 = 0;
        if (arg0 != -127) {
            this.field6622 = -29;
        }
        this.field6633 = null;
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)I")
    public static final int method2665(int arg0) {
        if (arg0 != 4) {
            field6627 = 70;
        }
        field6611++;
        if (class253.field3885 == null) {
            if (!class76.field1543 && class332.field5041 > 0) {
                if (class479.field7063 && class179.field2912.method1458(100, 81) && class332.field5041 > 2) {
                    return ((class328) class373.field5469.field4458.field3976.field3976).field4971;
                }
                return ((class328) class373.field5469.field4458.field3976).field4971;
            }
            int var1 = class393.field5991.method132(94);
            int var2 = class393.field5991.method139(-107);
            int var3 = class229.field3561;
            int var4 = class280.field4218;
            int var5 = class383.field5601;
            if (var3 < var1 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class332.field5041; var7++) {
                    if (class192.field3105) {
                        int var11 = var4 - (-((class332.field5041 - var7 - 1) * 16) - 33);
                        if (var2 > (var11 - 13) && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + ((class332.field5041 + -1 + -var7) * 16) + 31;
                        if (var2 > var12 - 13 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class482 var9 = new class482(class373.field5469);
                    for (class328 var10 = (class328) var9.method2893(arg0 ^ 0x6B); var10 != null; var10 = (class328) var9.method2895(31)) {
                        if (var6 == var8++) {
                            return var10.field4971;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)V")
    public final void method136(byte arg0) {
        field6612++;
        if (arg0 > -23) {
            this.field6635 = -104;
        }
        this.method2664((byte) -127);
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)I")
    public final int method139(int arg0) {
        if (arg0 >= -75) {
            return -118;
        } else {
            field6607++;
            return this.field6622;
        }
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(B)Lqj;")
    public final class356 method137(byte arg0) {
        field6631++;
        int var2 = 51 / ((-arg0 - 62) / 57);
        return (class356) this.field6633.method1894((byte) -88);
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
    public final synchronized void method134(byte arg0) {
        this.field6622 = this.field6635;
        this.field6614 = this.field6634;
        this.field6620 = this.field6637;
        field6616++;
        class291 var2 = this.field6633;
        this.field6633 = this.field6636;
        this.field6636 = var2;
        int var3 = -64 / ((15 - arg0) / 42);
        this.field6636.method1891(-3);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V")
    private final void method2666(boolean arg0, MouseEvent arg1) {
        this.field6634 = arg1.getX();
        field6610++;
        this.field6635 = arg1.getY();
        if (this.field6639) {
            this.method2662(arg1.getY(), arg1.getX(), false, -1);
        }
        if (!arg0) {
            method2661(null, 44, -71, null, -10, -108, 117, null, null, null, null, null, null, -73, (byte) -99, -75, 127, false);
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class445(Component arg0, boolean arg1) {
        this.method2663((byte) 99, arg0);
        this.field6639 = arg1;
    }
}
