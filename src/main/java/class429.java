import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class429 extends class448 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "Lps;")
    private class63 field6517 = new class63();

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lps;")
    private class63 field6536 = new class63();

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "Z")
    private boolean field6546;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Z")
    public static boolean field6521 = false;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Lbj;")
    public static class162 field6508 = new class162();

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Lua;")
    public static class480 field6540 = new class480(8);

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static int field6544 = 1;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    private int field6509;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field6531;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    private int field6533;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    private int field6538;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    private int field6541;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    private int field6542;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "Lgw;")
    public static class117 field6539;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "Ljava/awt/Component;")
    private Component field6545;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field6543;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 3)
    private final int method2617(int arg0, MouseEvent arg1) {
        field6523++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (arg0 != 16383) {
            field6521 = false;
        }
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

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method2327(int arg0) {
        if (arg0 != -32309) {
            this.mouseMoved(null);
        }
        field6507++;
        return (this.field6509 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZI)V", line = 54)
    private final void method2618(int arg0, int arg1, boolean arg2, int arg3) {
        field6511++;
        class320 var5 = new class320();
        if (!arg2) {
            this.method2617(18, null);
        }
        var5.field4638 = arg3;
        var5.field4631 = arg1;
        var5.field4632 = arg0;
        var5.field4640 = class58.method427((byte) -19);
        this.field6536.method453((byte) 104, var5);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILga;ILaa;Li;III)V", line = 71)
    public static final void method2619(int arg0, class282 arg1, int arg2, class341 arg3, class30 arg4, int arg5, int arg6, int arg7) {
        field6528++;
        if (arg3 == null) {
            return;
        }
        if (arg7 >= -105) {
            field6521 = true;
        }
        int var8;
        if (class340.field5269 == 4) {
            var8 = (int) class53.field744 & 0x3FFF;
        } else {
            var8 = (int) class53.field744 + class303.field4433 & 0x3FFF;
        }
        int var9 = Math.max(arg1.field3991 / 2, arg1.field4043 / 2) + 10;
        int var10 = arg0 * arg0 + arg2 * arg2;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class428.field6502[var8];
        int var12 = class428.field6501[var8];
        if (class340.field5269 != 4) {
            var12 = var12 * 256 / (class514.field7549 + 256);
            var11 = var11 * 256 / (class514.field7549 + 256);
        }
        int var13 = arg0 * var11 + arg2 * var12 >> 15;
        int var14 = arg0 * var12 - (arg2 * var11) >> 15;
        arg3.method303(var13 + arg1.field3991 / 2 + arg5 - (arg3.method302() / 2), arg6 - (-(arg1.field4043 / 2) - -var14 + arg3.method306() / 2), arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)I", line = 114)
    public final int method2325(int arg0) {
        int var2 = 99 / ((-arg0 - 38) / 51);
        field6530++;
        return this.field6533;
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V", line = 131)
    public static void method2620(int arg0) {
        field6539 = null;
        if (arg0 != 2) {
            method2619(-4, null, -60, null, null, 119, -7, -30);
        }
        field6540 = null;
        field6508 = null;
        field6543 = null;
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Z", line = 144)
    public final boolean method2326(byte arg0) {
        field6520++;
        if (arg0 != -51) {
            field6508 = null;
        }
        return (this.field6509 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 156)
    private final void method2621(Component arg0, boolean arg1) {
        if (!arg1) {
            this.mousePressed(null);
        }
        this.method2625(-11995);
        field6524++;
        this.field6545 = arg0;
        this.field6545.addMouseListener(this);
        this.field6545.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Loq;", line = 174)
    public final class245 method2319(byte arg0) {
        field6519++;
        int var2 = 43 / ((83 - arg0) / 41);
        return (class245) this.field6517.method447(8);
    }

    @OriginalMember(owner = "client!rj", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 184)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6532++;
        int var2 = this.method2617(16383, arg0);
        if (var2 == 1) {
            this.method2618(arg0.getX(), 0, true, arg0.getY());
        } else if (var2 == 4) {
            this.method2618(arg0.getX(), 2, true, arg0.getY());
        } else if (var2 == 2) {
            this.method2618(arg0.getX(), 1, true, arg0.getY());
        }
        this.field6538 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rj", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 211)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field6535++;
        this.method2624(arg0, (byte) 109);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 220)
    public final void method2318(int arg0) {
        this.method2625(-11995);
        field6516++;
        if (arg0 != 101) {
            this.method2621(null, true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 232)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6515++;
        int var2 = this.method2617(16383, arg0);
        if ((this.field6538 & var2) == 0) {
            var2 = this.field6538;
        }
        if ((var2 & 0x1) != 0) {
            this.method2618(arg0.getX(), 3, true, arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2618(arg0.getX(), 5, true, arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2618(arg0.getX(), 4, true, arg0.getY());
        }
        this.field6538 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "(I)Z", line = 261)
    public static final boolean method2622(int arg0) {
        field6513++;
        if (arg0 != -1) {
            field6540 = null;
        }
        return class406.field6164 == 0 ? class480.field7082.method1407(30274) : true;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I", line = 276)
    public static final int method2623(byte arg0, int arg1) {
        field6529++;
        if (arg0 != -43) {
            return 92;
        } else if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)Z", line = 310)
    public final boolean method2322(int arg0) {
        field6510++;
        if (arg0 == -28950) {
            return (this.field6509 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V", line = 329)
    private final void method2624(MouseEvent arg0, byte arg1) {
        field6514++;
        if (arg1 != 109) {
            this.field6545 = null;
        }
        this.field6542 = arg0.getX();
        this.field6541 = arg0.getY();
        if (this.field6546) {
            this.method2618(arg0.getX(), -1, true, arg0.getY());
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)V", line = 352)
    public final synchronized void method2321(int arg0) {
        this.field6533 = this.field6541;
        this.field6509 = this.field6538;
        field6526++;
        this.field6531 = this.field6542;
        class63 var2 = this.field6517;
        if (arg0 != 69) {
            this.field6546 = false;
        }
        this.field6517 = this.field6536;
        this.field6536 = var2;
        this.field6536.method450((byte) 73);
    }

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "(I)V", line = 374)
    private final void method2625(int arg0) {
        field6527++;
        if (this.field6545 == null) {
            return;
        }
        this.field6545.removeMouseMotionListener(this);
        this.field6545.removeMouseListener(this);
        this.field6517 = null;
        this.field6545 = null;
        this.field6531 = this.field6533 = this.field6509 = 0;
        this.field6542 = this.field6541 = this.field6538 = 0;
        if (arg0 != -11995) {
            field6544 = 76;
        }
        this.field6536 = null;
    }

    @OriginalMember(owner = "client!rj", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 396)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2624(arg0, (byte) 109);
        field6537++;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII[FFIIIFFI)V", line = 404)
    public static final void method2626(int arg0, boolean arg1, int arg2, int arg3, int arg4, float[] arg5, float arg6, int arg7, int arg8, int arg9, float arg10, float arg11, int arg12) {
        int var13 = arg7 - arg2;
        int var14 = arg9 - arg8;
        field6518++;
        int var15 = arg12 - arg4;
        float var16 = arg5[2] * (float) var14 + arg5[0] * (float) var13 + arg5[1] * (float) var15;
        if (arg1) {
            return;
        }
        float var17 = arg5[5] * (float) var14 + arg5[4] * (float) var15 + arg5[3] * (float) var13;
        float var18 = arg5[8] * (float) var14 + arg5[7] * (float) var15 + arg5[6] * (float) var13;
        float var19;
        float var20;
        if (arg0 == 0) {
            var19 = arg10 + 0.5F - var18;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg0 == 1) {
            var19 = arg10 + var18 + 0.5F;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg0 == 2) {
            var19 = arg6 + 0.5F - var17;
            var20 = arg11 + 0.5F - var16;
        } else if (arg0 == 3) {
            var19 = arg6 + 0.5F - var17;
            var20 = arg11 + var16 + 0.5F;
        } else if (arg0 == 4) {
            var20 = arg10 + var18 + 0.5F;
            var19 = arg6 + 0.5F - var17;
        } else {
            var19 = arg6 + 0.5F - var17;
            var20 = arg10 + 0.5F - var18;
        }
        if (arg3 == 1) {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        } else if (arg3 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg3 == 3) {
            float var21 = var20;
            var20 = var19;
            var19 = -var21;
        }
        class290.field4245 = var20;
        class241.field3396 = var19;
    }

    @OriginalMember(owner = "client!rj", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 492)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field6525++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rj", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 506)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field6534++;
        this.method2624(arg0, (byte) 109);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)I", line = 514)
    public final int method2323(byte arg0) {
        field6512++;
        return arg0 > -82 ? 79 : this.field6531;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 562)
    public class429(Component arg0, boolean arg1) {
        this.method2621(arg0, true);
        this.field6546 = arg1;
    }

    @OriginalMember(owner = "client!rj", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 532)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field6541 = -1;
        field6522++;
        this.field6542 = -1;
    }
}
