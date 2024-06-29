import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class441 extends class486 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "Lki;")
    private class364 field5688 = new class364();

    @OriginalMember(owner = "client!wda", name = "L", descriptor = "Lki;")
    private class364 field5713 = new class364();

    @OriginalMember(owner = "client!wda", name = "N", descriptor = "Z")
    private boolean field5715;

    @OriginalMember(owner = "client!wda", name = "h", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!wda", name = "i", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
    private int field5697;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!wda", name = "y", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!wda", name = "A", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!wda", name = "B", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!wda", name = "D", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!wda", name = "E", descriptor = "I")
    private int field5706;

    @OriginalMember(owner = "client!wda", name = "F", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!wda", name = "H", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!wda", name = "I", descriptor = "I")
    private int field5710;

    @OriginalMember(owner = "client!wda", name = "J", descriptor = "I")
    private int field5711;

    @OriginalMember(owner = "client!wda", name = "K", descriptor = "I")
    private int field5712;

    @OriginalMember(owner = "client!wda", name = "M", descriptor = "I")
    private int field5714;

    @OriginalMember(owner = "client!wda", name = "O", descriptor = "Ljava/awt/Component;")
    private Component field5716;

    @OriginalMember(owner = "client!wda", name = "C", descriptor = "[I")
    public static int[] field5704;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "(I)Lpc;")
    public final class252 method2211(int arg0) {
        field5705++;
        if (arg0 != 3813864) {
            this.method2504(7, true, -17, 102);
        }
        return (class252) this.field5688.method2092((byte) 92);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(BII)I")
    public static final int method2498(byte arg0, int arg1, int arg2) {
        field5702++;
        if (class317.field4110 == -1) {
            return 1;
        }
        if (class364.field4697 != arg2) {
            class646.method3557((byte) 92, arg2, class604.field8137.method3280((byte) 71, class144.field1890));
            if (class364.field4697 != arg2) {
                return -1;
            }
        }
        try {
            Dimension var3 = class524.field6827.getSize();
            class542.method2877(true, class604.field8137.method3280((byte) 108, class144.field1890), class520.field6799, class562.field7337, class401.field5111, true);
            class645 var4 = class463.method2591(true, class317.field4110, 0, class61.field837);
            long var5 = class584.method3191(arg0 ^ 0x1E);
            class520.field6799.method396();
            class355.field4580.method146(0, class57.field768, 0);
            class520.field6799.method342(class355.field4580);
            class520.field6799.method393(var3.width / 2, var3.height / 2, 512, 512);
            class520.field6799.method360(1.0F);
            class520.field6799.method390(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class107 var7 = class520.field6799.method410(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class520.field6799.method162(0);
                class520.field6799.method205();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class125.field1623.method146((int) (((float) var11 - (float) var10 / 2.0F) * (float) class688.field9414), 0, (var10 + 1) * class688.field9414);
                        var7.method827(class125.field1623, null, 0);
                        var8++;
                        if (class584.method3191(1) - var5 >= (long) arg1) {
                            break label45;
                        }
                    }
                }
            }
            if (arg0 != 31) {
                return -83;
            }
            class520.field6799.method208();
            long var12 = (long) (var8 * 1000) / (class584.method3191(1) - var5);
            class520.field6799.method162(0);
            class520.field6799.method205();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!wda", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2499(-1, arg0.getX(), arg0.getY());
        field5686++;
    }

    @OriginalMember(owner = "client!wda", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field5694++;
        this.method2499(-1, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!wda", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5701++;
        int var2 = this.method2502(8, arg0);
        if ((var2 & this.field5712) == 0) {
            var2 = this.field5712;
        }
        if ((var2 & 0x1) != 0) {
            this.method2504(3, false, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2504(5, false, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2504(4, false, arg0.getY(), arg0.getX());
        }
        this.field5712 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)Z")
    public final boolean method2215(int arg0) {
        if (arg0 != 64) {
            this.mouseExited(null);
        }
        field5708++;
        return (this.field5697 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "(I)I")
    public final int method2208(int arg0) {
        if (arg0 != 30114) {
            this.method2499(69, -105, -45);
        }
        field5698++;
        return this.field5710;
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)Z")
    public final boolean method2216(byte arg0) {
        field5690++;
        int var2 = -102 % ((arg0 + 49) / 49);
        return (this.field5697 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wda", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2499(-1, arg0.getX(), arg0.getY());
        field5696++;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)V")
    private final void method2499(int arg0, int arg1, int arg2) {
        this.field5714 = arg2;
        this.field5711 = arg1;
        if (arg0 != -1) {
            this.method2208(-12);
        }
        field5707++;
        if (this.field5715) {
            this.method2504(-1, false, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)V")
    public final synchronized void method2213(int arg0) {
        this.field5706 = this.field5711;
        field5700++;
        this.field5697 = this.field5712;
        this.field5710 = this.field5714;
        class364 var2 = this.field5688;
        int var3 = 77 / ((arg0 - 1) / 40);
        this.field5688 = this.field5713;
        this.field5713 = var2;
        this.field5713.method2085((byte) 9);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)V")
    public final void method2209(boolean arg0) {
        field5683++;
        this.method2506((byte) 127);
        if (!arg0) {
            this.field5710 = 127;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    private final void method2500(Component arg0, int arg1) {
        this.method2506((byte) 127);
        if (arg1 != -9795) {
            this.method2500(null, 56);
        }
        field5692++;
        this.field5716 = arg0;
        this.field5716.addMouseListener(this);
        this.field5716.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!wda", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2499(-1, arg0.getX(), arg0.getY());
        field5684++;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2501(String arg0, int arg1) {
        field5695++;
        if (!class265.field3542.field1823) {
            return -1;
        } else if (class305.field4010.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class193.method1264(arg0, -120);
            if (var2 == null) {
                return -1;
            }
            String var3 = class192.field2461 + var2;
            if (!class619.field8351.method3351(arg1 ^ 0xFFFFFFAF, "", var3)) {
                return -1;
            } else if (class619.field8351.method3370(var3, -2)) {
                byte[] var4 = class619.field8351.method3355(arg1 + arg1, "", var3);
                File var5 = class180.method1201((byte) -87, var2);
                if (var4 == null || var5 == null) {
                    return -1;
                }
                boolean var6 = true;
                byte[] var7 = class406.method2301(var5, (byte) -127);
                if (var7 != null && var4.length == var7.length) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        if (var4[var8] != var7[var8]) {
                            var6 = false;
                            break;
                        }
                    }
                } else {
                    var6 = false;
                }
                try {
                    if (!var6) {
                        class265.field3542.method1055(var4, var5, 0);
                    }
                } catch (Throwable var9) {
                    return -1;
                }
                class279.method1683(arg0, (byte) -110, var5);
                return 100;
            } else {
                return class619.field8351.method3347((byte) -31, var3);
            }
        }
    }

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "(I)Z")
    public final boolean method2205(int arg0) {
        field5699++;
        if (arg0 != 64) {
            this.mousePressed(null);
        }
        return (this.field5697 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)I")
    public final int method2214(int arg0) {
        if (arg0 != -2703) {
            method2498((byte) 49, 114, 53);
        }
        field5691++;
        return this.field5706;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method2502(int arg0, MouseEvent arg1) {
        field5685++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & arg0) != 0;
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

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "(BII)Z")
    public static final boolean method2503(byte arg0, int arg1, int arg2) {
        int var3 = -12 / ((arg0 + 38) / 55);
        field5693++;
        return class187.method1240(arg2, arg1, -24641) & class608.method3309((byte) -1, arg2, arg1);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IZII)V")
    private final void method2504(int arg0, boolean arg1, int arg2, int arg3) {
        field5703++;
        class328 var5 = new class328();
        var5.field4259 = arg2;
        if (arg1) {
            this.method2216((byte) 85);
        }
        var5.field4254 = arg0;
        var5.field4257 = arg3;
        var5.field4264 = class584.method3191(1);
        this.field5713.method2087(var5, 43);
    }

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "(I)V")
    public static void method2505(int arg0) {
        if (arg0 != -6637) {
            field5704 = null;
        }
        field5704 = null;
    }

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "(B)V")
    private final void method2506(byte arg0) {
        field5687++;
        if (this.field5716 == null) {
            return;
        }
        this.field5716.removeMouseMotionListener(this);
        this.field5716.removeMouseListener(this);
        this.field5713 = null;
        this.field5716 = null;
        if (arg0 <= 126) {
            this.field5712 = 92;
        }
        this.field5706 = this.field5710 = this.field5697 = 0;
        this.field5688 = null;
        this.field5711 = this.field5714 = this.field5712 = 0;
    }

    @OriginalMember(owner = "client!wda", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5689++;
        int var2 = this.method2502(8, arg0);
        if (var2 == 1) {
            this.method2504(0, false, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method2504(2, false, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method2504(1, false, arg0.getY(), arg0.getX());
        }
        this.field5712 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!wda", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field5709++;
    }

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class441(Component arg0, boolean arg1) {
        this.method2500(arg0, -9795);
        this.field5715 = arg1;
    }
}
