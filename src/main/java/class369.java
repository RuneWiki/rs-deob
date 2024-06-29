import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class369 extends class324 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Lfea;")
    private class47 field5245 = new class47();

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lfea;")
    private class47 field5258 = new class47();

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Z")
    private boolean field5263;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lbv;")
    public static class567 field5240 = new class567("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    private int field5231;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    private int field5235;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private int field5251;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    private int field5257;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    private int field5259;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    private int field5260;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/awt/Component;")
    private Component field5262;

    static {
        new class567("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }

    @OriginalMember(owner = "client!ub", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field5232++;
        int var2 = this.method2233(arg0, (byte) 122);
        if (var2 == 1) {
            this.method2231(false, 0, arg0.getY(), arg0.getX());
        } else if (var2 == 4) {
            this.method2231(false, 2, arg0.getY(), arg0.getX());
        } else if (var2 == 2) {
            this.method2231(false, 1, arg0.getY(), arg0.getX());
        }
        this.field5260 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V", line = 30)
    public static final void method2229(int arg0) {
        class258.field3749.method720(true);
        field5239++;
        if (arg0 >= -15) {
            method2229(42);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class340.field4887[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class54.field780[var2] = 0L;
        }
        class24.field328 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 59)
    public final void method1615(byte arg0) {
        if (arg0 != -41) {
            this.method2235(39, -42, (byte) 35);
        }
        field5237++;
        this.method2232(-128);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)Z", line = 75)
    public final boolean method1612(boolean arg0) {
        if (arg0) {
            this.method2232(7);
        }
        field5244++;
        return (this.field5231 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)Z", line = 86)
    public static final boolean method2230(int arg0) {
        field5246++;
        if (arg0 != -32666) {
            return false;
        }
        try {
            return class592.method3387(-1);
        } catch (IOException var4) {
            class587.method3365(18);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class240.field3487 == null ? -1 : class240.field3487.method2914(6)) + "," + (class338.field4853 == null ? -1 : class338.field4853.method2914(6)) + "," + (class370.field5320 == null ? -1 : class370.field5320.method2914(6)) + " - " + class541.field7525 + "," + (class382.field5687 + class644.field9367.field1571[0]) + "," + (class644.field9367.field1572[0] + class597.field8500) + " - ";
            for (int var3 = 0; class541.field7525 > var3 && var3 < 50; var3++) {
                var2 = var2 + class52.field761.field3952[var3] + ",";
            }
            class593.method3390(var2, var5, 0);
            class271.method1759(false, 4);
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)I", line = 121)
    public final int method1607(byte arg0) {
        field5253++;
        if (arg0 != -78) {
            this.method1607((byte) -76);
        }
        return this.field5251;
    }

    @OriginalMember(owner = "client!ub", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 134)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field5252++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)Z", line = 147)
    public final boolean method1613(int arg0) {
        if (arg0 != -1) {
            this.method1613(-120);
        }
        field5242++;
        return (this.field5231 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ub", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 158)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2235(arg0.getX(), arg0.getY(), (byte) -115);
        field5249++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I", line = 167)
    public final int method1614(byte arg0) {
        field5241++;
        return arg0 == -46 ? this.field5235 : -82;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIII)V", line = 179)
    private final void method2231(boolean arg0, int arg1, int arg2, int arg3) {
        field5248++;
        class215 var5 = new class215();
        var5.field3248 = arg1;
        var5.field3254 = arg2;
        var5.field3251 = arg3;
        var5.field3257 = class508.method2860(arg0);
        this.field5258.method414(var5, (byte) 41);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 195)
    public final synchronized void method1606(int arg0) {
        this.field5251 = this.field5257;
        this.field5235 = this.field5259;
        this.field5231 = this.field5260;
        field5238++;
        class47 var2 = this.field5245;
        this.field5245 = this.field5258;
        if (arg0 != -1) {
            this.mouseExited(null);
        }
        this.field5258 = var2;
        this.field5258.method425(-89);
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V", line = 217)
    private final void method2232(int arg0) {
        field5236++;
        if (this.field5262 == null) {
            return;
        }
        this.field5262.removeMouseMotionListener(this);
        this.field5262.removeMouseListener(this);
        if (arg0 >= -110) {
            this.field5251 = -6;
        }
        this.field5235 = this.field5251 = this.field5231 = 0;
        this.field5259 = this.field5257 = this.field5260 = 0;
        this.field5245 = null;
        this.field5258 = null;
        this.field5262 = null;
    }

    @OriginalMember(owner = "client!ub", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 240)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field5254++;
        int var2 = this.method2233(arg0, (byte) 122);
        if ((this.field5260 & var2) == 0) {
            var2 = this.field5260;
        }
        if ((var2 & 0x1) != 0) {
            this.method2231(false, 3, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x4) != 0) {
            this.method2231(false, 5, arg0.getY(), arg0.getX());
        }
        if ((var2 & 0x2) != 0) {
            this.method2231(false, 4, arg0.getY(), arg0.getX());
        }
        this.field5260 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ub", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 266)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field5255++;
        this.method2235(arg0.getX(), arg0.getY(), (byte) -119);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)I", line = 277)
    private final int method2233(MouseEvent arg0, byte arg1) {
        field5243++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        if (arg1 != 122) {
            return -28;
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

    @OriginalMember(owner = "client!ub", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 315)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2235(arg0.getX(), arg0.getY(), (byte) -110);
        field5233++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 328)
    private final void method2234(byte arg0, Component arg1) {
        this.method2232(-128);
        field5234++;
        this.field5262 = arg1;
        this.field5262.addMouseListener(this);
        int var3 = 67 / ((-arg0 - 37) / 36);
        this.field5262.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ub", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 342)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method2235(arg0.getX(), arg0.getY(), (byte) 50);
        field5247++;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)Lsda;", line = 351)
    public final class7 method1618(int arg0) {
        if (arg0 > -102) {
            this.field5231 = 32;
        }
        field5261++;
        return (class7) this.field5245.method417((byte) 51);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Z", line = 362)
    public final boolean method1611(int arg0) {
        if (arg0 != -1) {
            field5240 = null;
        }
        field5256++;
        return (this.field5231 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V", line = 373)
    private final void method2235(int arg0, int arg1, byte arg2) {
        int var4 = -49 / ((-arg2 - 48) / 45);
        this.field5259 = arg0;
        this.field5257 = arg1;
        field5250++;
        if (this.field5263) {
            this.method2231(false, -1, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "(I)V", line = 391)
    public static void method2236(int arg0) {
        if (arg0 != 3632) {
            method2230(-48);
        }
        field5240 = null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 419)
    public class369(Component arg0, boolean arg1) {
        this.method2234((byte) 20, arg0);
        this.field5263 = arg1;
    }
}
