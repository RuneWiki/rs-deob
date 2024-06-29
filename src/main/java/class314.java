import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class314 extends class435 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Lar;")
    private class479 field4276 = new class479();

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "Lar;")
    private class479 field4291 = new class479();

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "Z")
    private boolean field4298;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "Lwj;")
    public static class270 field4293;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    private int field4271;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    private int field4278;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "I")
    private int field4292;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    private int field4295;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field4297;

    static {
        new class466("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field4293 = new class270(78, 2);
    }

    @OriginalMember(owner = "client!ci", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4283++;
        this.method1824(arg0, 120);
    }

    @OriginalMember(owner = "client!ci", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 13)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field4280++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Z", line = 24)
    public final boolean method1812(int arg0) {
        if (arg0 > -14) {
            this.field4297 = null;
        }
        field4294++;
        return (this.field4278 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)I", line = 35)
    public final int method1813(int arg0) {
        field4273++;
        return arg0 == 0 ? this.field4271 : -35;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Z", line = 47)
    public final boolean method1814(boolean arg0) {
        field4274++;
        if (arg0) {
            return false;
        } else {
            return (this.field4278 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 62)
    private final void method1815(Component arg0, byte arg1) {
        field4279++;
        this.method1817(60);
        if (arg1 != 24) {
            this.field4291 = null;
        }
        this.field4297 = arg0;
        this.field4297.addMouseListener(this);
        this.field4297.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)V", line = 76)
    public static final void method1816(int arg0) {
        if (class252.field3498 < 1024.0F) {
            class252.field3498 = 1024.0F;
        }
        field4266++;
        while (class498.field7255 >= 16384.0F) {
            class498.field7255 -= 16384.0F;
        }
        if (class252.field3498 > 3072.0F) {
            class252.field3498 = 3072.0F;
        }
        if (arg0 != 10299) {
            field4264 = 83;
        }
        while (class498.field7255 < 0.0F) {
            class498.field7255 += 16384.0F;
        }
        int var1 = class240.field3370 >> 7;
        int var2 = class121.field1818 >> 7;
        int var3 = class242.method1465(113, class436.field6379, class121.field1818, class240.field3370);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < (class527.field7799 - 4) && class422.field6182 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class436.field6379;
                    if (var7 < 3 && class360.method2159(var6, false, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class98.field1484.field4441 != null && class98.field1484.field4441[var7] != null) {
                        var8 = (class98.field1484.field4441[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class211.field2950[var7].method351(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class164.field2464) {
            class164.field2464 += (var10 - class164.field2464) / 24;
        } else if (var10 < class164.field2464) {
            class164.field2464 += (var10 - class164.field2464) / 80;
        }
    }

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "(I)V", line = 158)
    private final void method1817(int arg0) {
        field4288++;
        if (arg0 <= 4 || this.field4297 == null) {
            return;
        }
        this.field4297.removeMouseListener(this);
        this.field4297.removeMouseMotionListener(this);
        this.field4297 = null;
        this.field4271 = this.field4284 = this.field4278 = 0;
        this.field4295 = this.field4292 = this.field4296 = 0;
        this.field4276 = null;
        this.field4291 = null;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V", line = 182)
    public final synchronized void method1818(int arg0) {
        this.field4284 = this.field4292;
        this.field4271 = this.field4295;
        field4285++;
        this.field4278 = this.field4296;
        if (arg0 != 14494) {
            this.field4295 = 122;
        }
        class479 var2 = this.field4276;
        this.field4276 = this.field4291;
        this.field4291 = var2;
        this.field4291.method2814((byte) 112);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Z", line = 209)
    public final boolean method1819(int arg0) {
        field4269++;
        if (arg0 != 4) {
            method1816(61);
        }
        return (this.field4278 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ci", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 220)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field4292 = -1;
        field4290++;
        this.field4295 = -1;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V", line = 235)
    public static void method1820(byte arg0) {
        if (arg0 == 73) {
            field4293 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZII)V", line = 246)
    private final void method1821(int arg0, boolean arg1, int arg2, int arg3) {
        field4267++;
        class469 var5 = new class469();
        var5.field6863 = arg3;
        var5.field6854 = arg0;
        var5.field6864 = arg2;
        var5.field6857 = class246.method1483(5957);
        this.field4291.method2809(var5, 2);
        if (!arg1) {
            this.field4298 = false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 263)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field4282++;
        this.method1824(arg0, 124);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I", line = 276)
    public final int method1822(int arg0) {
        if (arg0 != 126) {
            this.method1823(48);
        }
        field4286++;
        return this.field4284;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)Llo;", line = 292)
    public final class528 method1823(int arg0) {
        if (arg0 == 16384) {
            field4265++;
            return (class528) this.field4276.method2816(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)V", line = 307)
    private final void method1824(MouseEvent arg0, int arg1) {
        field4268++;
        if (arg1 <= 116) {
            this.field4298 = false;
        }
        this.field4295 = arg0.getX();
        this.field4292 = arg0.getY();
        if (this.field4298) {
            this.method1821(arg0.getY(), true, arg0.getX(), -1);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 457)
    public class314(Component arg0, boolean arg1) {
        this.method1815(arg0, (byte) 24);
        this.field4298 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 331)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4270++;
        int var2 = this.method1826(arg0, 8);
        if ((this.field4296 & var2) == 0) {
            var2 = this.field4296;
        }
        if ((var2 & 0x1) != 0) {
            this.method1821(arg0.getY(), true, arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method1821(arg0.getY(), true, arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method1821(arg0.getY(), true, arg0.getX(), 4);
        }
        this.field4296 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)V", line = 361)
    public final void method1825(int arg0) {
        field4287++;
        this.method1817(63);
        if (arg0 > -63) {
            field4264 = 56;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 383)
    private final int method1826(MouseEvent arg0, int arg1) {
        field4289++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & arg1) != 0;
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

    @OriginalMember(owner = "client!ci", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 417)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4275++;
        this.method1824(arg0, 120);
    }

    @OriginalMember(owner = "client!ci", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 425)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4272++;
        int var2 = this.method1826(arg0, 8);
        if (var2 == 1) {
            this.method1821(arg0.getY(), true, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method1821(arg0.getY(), true, arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method1821(arg0.getY(), true, arg0.getX(), 1);
        }
        this.field4296 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }
}
