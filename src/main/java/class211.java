import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class211 extends class6 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Ljm;")
    private class162 field2948 = new class162();

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Ljm;")
    private class162 field2970 = new class162();

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "Z")
    private boolean field2973;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field2956 = 2;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "[I")
    public static int[] field2960 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    private int field2953;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    private int field2965;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    private int field2969;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    private int field2972;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lbc;")
    public static class285 field2946;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Lwn;")
    public static class77 field2967;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "Ljava/awt/Component;")
    private Component field2974;

    @OriginalMember(owner = "client!ob", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 3)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2950++;
        this.method1414(false, arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLjava/awt/event/MouseEvent;)V", line = 12)
    private final void method1414(boolean arg0, MouseEvent arg1) {
        this.field2971 = arg1.getX();
        field2962++;
        this.field2972 = arg1.getY();
        if (arg0) {
            this.field2965 = -32;
        }
        if (this.field2973) {
            this.method1416(-1, arg1.getY(), (byte) 102, arg1.getX());
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZIFII)[I", line = 33)
    public static final int[] method1415(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5, int arg6, int arg7) {
        field2941++;
        int[] var8 = new int[arg1];
        class319 var9 = new class319();
        var9.field4347 = arg3;
        var9.field4355 = (int) (arg5 * 4096.0F);
        var9.field4343 = arg0;
        var9.field4348 = arg7;
        if (arg4 != 16) {
            return null;
        }
        var9.field4349 = arg2;
        var9.field4346 = arg6;
        var9.method113(arg4 ^ 0x13);
        class119.method926(1, arg1, 209268044);
        var9.method1949(var8, 0, 4);
        return var8;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 57)
    public final void method29(boolean arg0) {
        if (!arg0) {
            this.mouseMoved((MouseEvent) null);
        }
        field2968++;
        this.method1417((byte) -117);
    }

    @OriginalMember(owner = "client!ob", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 68)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field2971 = -1;
        this.field2972 = -1;
        field2966++;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z", line = 81)
    public final boolean method31(int arg0) {
        field2961++;
        if (arg0 <= 31) {
            return true;
        } else {
            return (this.field2939 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z", line = 92)
    public final boolean method28(int arg0) {
        if (arg0 != 30711) {
            field2946 = null;
        }
        field2963++;
        return (this.field2939 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 111)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field2945++;
        this.method1414(false, arg0);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)I", line = 122)
    public final int method34(boolean arg0) {
        if (!arg0) {
            this.field2948 = null;
        }
        field2947++;
        return this.field2965;
    }

    @OriginalMember(owner = "client!ob", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 133)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2957++;
        this.field2969 &= ~arg0.getModifiers();
        byte var2 = -1;
        if ((arg0.getModifiers() & 0x10) != 0) {
            var2 = 3;
        } else if ((arg0.getModifiers() & 0x8) != 0) {
            var2 = 4;
        } else if ((arg0.getModifiers() & 0x4) != 0) {
            var2 = 5;
        }
        if (var2 != -1) {
            this.method1416(var2, arg0.getY(), (byte) 61, arg0.getX());
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I", line = 160)
    public final int method30(byte arg0) {
        if (arg0 != 115) {
            this.method30((byte) 55);
        }
        field2942++;
        return this.field2953;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBI)V", line = 171)
    private final void method1416(int arg0, int arg1, byte arg2, int arg3) {
        field2949++;
        class263 var5 = new class263();
        if (arg2 <= 45) {
            this.mouseExited((MouseEvent) null);
        }
        var5.field3616 = arg1;
        var5.field3611 = arg3;
        var5.field3617 = arg0;
        var5.field3610 = class199.method1372(30938);
        this.field2970.method1162(120, var5);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V", line = 197)
    private final void method1417(byte arg0) {
        field2954++;
        if (this.field2974 == null) {
            return;
        }
        this.field2974.removeMouseListener(this);
        this.field2974.removeMouseMotionListener(this);
        this.field2970 = null;
        this.field2948 = null;
        this.field2974 = null;
        this.field2971 = this.field2972 = this.field2969 = 0;
        if (arg0 < -97) {
            this.field2965 = this.field2953 = this.field2939 = 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 219)
    public final synchronized void mousePressed(MouseEvent arg0) {
        this.field2969 |= arg0.getModifiers();
        field2951++;
        byte var2 = -1;
        if ((arg0.getModifiers() & 0x10) != 0) {
            var2 = 0;
        } else if ((arg0.getModifiers() & 0x8) != 0) {
            var2 = 1;
        } else if ((arg0.getModifiers() & 0x4) != 0) {
            var2 = 2;
        }
        if (var2 != -1) {
            this.method1416(var2, arg0.getY(), (byte) 83, arg0.getX());
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 246)
    private final void method1418(Component arg0, boolean arg1) {
        this.method1417((byte) -120);
        field2940++;
        this.field2974 = arg0;
        if (!arg1) {
            this.field2970 = null;
        }
        this.field2974.addMouseListener(this);
        this.field2974.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Lmp;", line = 261)
    public final class21 method37(int arg0) {
        if (arg0 != -17511) {
            this.method31(57);
        }
        field2959++;
        return (class21) this.field2948.method1160((byte) 53);
    }

    @OriginalMember(owner = "client!ob", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 272)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2952++;
        this.method1414(false, arg0);
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 280)
    public static void method1419(int arg0) {
        field2946 = null;
        int var1 = 4 / ((arg0 + 45) / 40);
        field2967 = null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!ob", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 294)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field2964++;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)Z", line = 304)
    public final boolean method39(byte arg0) {
        if (arg0 <= 124) {
            this.method37(-16);
        }
        field2958++;
        return (this.field2939 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIBIII)V", line = 315)
    public static final void method1420(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2943++;
        class108 var7 = class451.method2815(arg0, arg2, (byte) -53);
        if (var7 != null && var7.field1562 != null) {
            class101 var8 = new class101();
            var8.field1393 = var7.field1562;
            var8.field1403 = var7;
            class172.method1230(var8);
        }
        if (arg3 != 58) {
            method1419(98);
        }
        class156.field2225 = arg5;
        class438.field6183 = arg4;
        class217.field3045 = arg0;
        class277.field3780 = arg6;
        if (var7 != null) {
            class266.field3633 = var7.field1575;
        }
        class428.field5955 = arg1;
        class34.field467 = arg2;
        class213.field2980 = true;
        class298.method1821((byte) -100, var7);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V", line = 355)
    public final synchronized void method38(int arg0) {
        field2944++;
        if (arg0 != 128) {
            return;
        }
        this.field2965 = this.field2971;
        this.field2939 = this.field2969;
        this.field2953 = this.field2972;
        class162 var2 = this.field2948;
        this.field2948 = this.field2970;
        this.field2970 = var2;
        this.field2970.method1168(122);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 398)
    public class211(Component arg0, boolean arg1) {
        this.method1418(arg0, true);
        this.field2973 = arg1;
    }
}
