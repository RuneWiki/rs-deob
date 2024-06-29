import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class277 extends class414 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "Lft;")
    private class4 field4192 = new class4();

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "Lft;")
    private class4 field4212 = new class4();

    @OriginalMember(owner = "client!ep", name = "P", descriptor = "Z")
    private boolean field4222;

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "[F")
    public static float[] field4216 = new float[16];

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    private int field4195;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    private int field4209;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    private int field4210;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
    private int field4214;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    private int field4215;

    @OriginalMember(owner = "client!ep", name = "K", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!ep", name = "L", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ep", name = "N", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ep", name = "O", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ep", name = "M", descriptor = "Ljava/awt/Component;")
    private Component field4219;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZLwn;Ljava/lang/String;B)V", line = 4)
    public static final void method1681(boolean arg0, class488 arg1, String arg2, byte arg3) {
        field4218++;
        byte var4 = 4;
        if (arg3 < 8) {
            field4216 = null;
        }
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class380.field5545.method2346(true, null, arg2, 250);
        int var8 = class380.field5545.method2351(null, 250, (byte) -126, arg2) * 13;
        class345.field5116.method1971(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - -var4 + var4, -16777216, 0);
        class345.field5116.method1918(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg1.method2940(0, -1, 0, null, -1, var7, var8, var6, 1, arg2, 0, 1, 0, null, null, var5);
        class323.method2017(var6 - var4, var4 - -var4 + var8, true, var4 + var7 + var4, -var4 + var5);
        if (arg0) {
            class345.field5116.method1915();
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)Z", line = 32)
    public final boolean method1682(byte arg0) {
        if (arg0 < 36) {
            this.method1683((byte) -118, -52, -119, -37);
        }
        field4221++;
        return (this.field4195 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ep", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 44)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4201++;
        this.method1695(arg0, 20928);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIII)V", line = 52)
    private final void method1683(byte arg0, int arg1, int arg2, int arg3) {
        field4206++;
        class203 var5 = new class203();
        var5.field3205 = arg1;
        var5.field3209 = arg2;
        if (arg0 >= 99) {
            var5.field3207 = arg3;
            var5.field3204 = class344.method2111((byte) -119);
            this.field4212.method4(1, var5);
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Lei;", line = 70)
    public final class112 method1684(int arg0) {
        if (arg0 > -73) {
            this.field4212 = null;
        }
        field4196++;
        return (class112) this.field4192.method7(false);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZZZ)V", line = 82)
    public static final void method1685(boolean arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            class395.field5762--;
            if (class395.field5762 == 0) {
                class143.field2332 = null;
            }
        }
        if (!arg2) {
            method1692((byte) -84, 52);
        }
        if (arg0) {
            class360.field5330--;
            if (class360.field5330 == 0) {
                class327.field4907 = null;
            }
        }
        field4204++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)I", line = 118)
    public final int method1686(int arg0) {
        if (arg0 != 25478) {
            method1694(54);
        }
        field4191++;
        return this.field4209;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLjava/awt/event/MouseEvent;)I", line = 135)
    private final int method1687(byte arg0, MouseEvent arg1) {
        field4199++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (arg0 < 110) {
            this.method1691((byte) -35);
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

    @OriginalMember(owner = "client!ep", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 172)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1695(arg0, 20928);
        field4203++;
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V", line = 180)
    private final void method1688(int arg0) {
        field4217++;
        if (this.field4219 == null) {
            return;
        }
        this.field4219.removeMouseListener(this);
        this.field4219.removeMouseMotionListener(this);
        this.field4215 = this.field4214 = this.field4210 = arg0;
        this.field4212 = null;
        this.field4219 = null;
        this.field4209 = this.field4200 = this.field4195 = 0;
        this.field4192 = null;
    }

    @OriginalMember(owner = "client!ep", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 199)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field4215 = -1;
        field4189++;
        this.field4214 = -1;
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)Z", line = 211)
    public final boolean method1689(byte arg0) {
        if (arg0 <= 92) {
            this.mouseExited(null);
        }
        field4208++;
        return (this.field4195 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)I", line = 222)
    public final int method1690(int arg0) {
        field4194++;
        if (arg0 != 8) {
            this.method1684(-89);
        }
        return this.field4200;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V", line = 234)
    public final synchronized void method1691(byte arg0) {
        field4205++;
        this.field4200 = this.field4214;
        this.field4195 = this.field4210;
        this.field4209 = this.field4215;
        class4 var2 = this.field4192;
        this.field4192 = this.field4212;
        this.field4212 = var2;
        int var3 = 122 % ((arg0 - 75) / 35);
        this.field4212.method13(false);
    }

    @OriginalMember(owner = "client!ep", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 255)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4213++;
        int var2 = this.method1687((byte) 112, arg0);
        if ((var2 & this.field4210) == 0) {
            var2 = this.field4210;
        }
        if ((var2 & 0x1) != 0) {
            this.method1683((byte) 109, arg0.getY(), arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1683((byte) 122, arg0.getY(), arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1683((byte) 115, arg0.getY(), arg0.getX(), 4);
        }
        this.field4210 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ep", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 282)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4193++;
        this.method1695(arg0, 20928);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)I", line = 290)
    public static final int method1692(byte arg0, int arg1) {
        if (arg0 != -124) {
            method1694(19);
        }
        field4190++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 301)
    public final void method1693(int arg0) {
        int var2 = -51 % ((-arg0 - 52) / 61);
        field4220++;
        this.method1688(0);
    }

    @OriginalMember(owner = "client!ep", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 311)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4211++;
        int var2 = this.method1687((byte) 127, arg0);
        if (var2 == 1) {
            this.method1683((byte) 112, arg0.getY(), arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method1683((byte) 116, arg0.getY(), arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method1683((byte) 105, arg0.getY(), arg0.getX(), 1);
        }
        this.field4210 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ep", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 337)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field4198++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "(I)V", line = 347)
    public static void method1694(int arg0) {
        field4216 = null;
        if (arg0 != -1) {
            field4216 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 427)
    public class277(Component arg0, boolean arg1) {
        this.method1697(56, arg0);
        this.field4222 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V", line = 373)
    private final void method1695(MouseEvent arg0, int arg1) {
        field4207++;
        this.field4215 = arg0.getX();
        if (arg1 != 20928) {
            this.method1697(-9, null);
        }
        this.field4214 = arg0.getY();
        if (this.field4222) {
            this.method1683((byte) 119, arg0.getY(), arg0.getX(), -1);
        }
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(I)Z", line = 396)
    public final boolean method1696(int arg0) {
        field4197++;
        int var2 = 108 / ((65 - arg0) / 43);
        return (this.field4195 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 412)
    private final void method1697(int arg0, Component arg1) {
        field4202++;
        this.method1688(0);
        this.field4219 = arg1;
        if (arg0 > 25) {
            this.field4219.addMouseListener(this);
            this.field4219.addMouseMotionListener(this);
        }
    }
}
