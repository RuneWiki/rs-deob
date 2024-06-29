import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class61 extends class157 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Luh;")
    private class168 field1211 = new class168();

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Luh;")
    private class168 field1220 = new class168();

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "Z")
    private boolean field1228;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Z")
    public static boolean field1214 = false;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "Ljava/awt/Component;")
    private Component field1229;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[Lvh;")
    public static class361[] field1216;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    private final void method648(byte arg0, Component arg1) {
        field1217++;
        if (arg0 >= -83) {
            this.mouseExited(null);
        }
        this.method653(85);
        this.field1229 = arg1;
        this.field1229.addMouseListener(this);
        this.field1229.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!bd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method650(arg0.getY(), (byte) -76, arg0.getX());
        field1197++;
    }

    @OriginalMember(owner = "client!bd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method650(arg0.getY(), (byte) -76, arg0.getX());
        field1196++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method649(int arg0, MouseEvent arg1) {
        field1206++;
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
        } else if (var5) {
            return 2;
        } else {
            if (arg0 != -6345) {
                this.method577(-12);
            }
            return var6 ? 4 : 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method650(arg0.getY(), (byte) -76, arg0.getX());
        field1222++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Z")
    public final boolean method573(byte arg0) {
        field1227++;
        if (arg0 <= 112) {
            this.method651(-77, 6, -104, -59, 86);
        }
        return (this.field1202 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public final synchronized void method579(int arg0) {
        if (arg0 != 0) {
            this.method579(-46);
        }
        this.field1202 = this.field1226;
        field1210++;
        this.field1218 = this.field1223;
        this.field1212 = this.field1224;
        class168 var2 = this.field1211;
        this.field1211 = this.field1220;
        this.field1220 = var2;
        this.field1220.method1270(arg0 ^ 0x66);
    }

    @OriginalMember(owner = "client!bd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1205++;
        this.method650(arg0.getY(), (byte) -76, arg0.getX());
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)V")
    private final void method650(int arg0, byte arg1, int arg2) {
        field1215++;
        this.field1224 = arg2;
        if (arg1 != -76) {
            field1199 = 51;
        }
        this.field1223 = arg0;
        if (this.field1228) {
            this.method651(-1, arg0, arg2, 0, -125);
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
    public final int method571(byte arg0) {
        field1200++;
        return arg0 <= 69 ? -123 : this.field1218;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)Lbu;")
    public final class19 method577(int arg0) {
        if (arg0 != 0) {
            this.mouseReleased(null);
        }
        field1207++;
        return (class19) this.field1211.method1271(arg0 + 8);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
    private final void method651(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1209++;
        class450 var6 = new class450();
        var6.field6364 = arg2;
        var6.field6358 = arg1;
        var6.field6355 = arg3;
        var6.field6361 = arg0;
        var6.field6359 = class554.method3190(-110);
        this.field1220.method1273(var6, -20180);
        if (arg4 >= -110) {
            method652(28, null, -68);
        }
    }

    @OriginalMember(owner = "client!bd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1208++;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final void method580(int arg0) {
        if (arg0 != 0) {
            this.method574(false);
        }
        field1203++;
        this.method653(84);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z")
    public final boolean method569(int arg0) {
        int var2 = -108 % ((-arg0 - 38) / 48);
        field1204++;
        return (this.field1202 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Z")
    public final boolean method576(int arg0) {
        field1225++;
        if (arg0 >= -67) {
            this.mouseExited(null);
        }
        return (this.field1202 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILcea;I)Ljava/lang/String;")
    public static final String method652(int arg0, class215 arg1, int arg2) {
        int var3 = 17 % ((9 - arg2) / 59);
        field1221++;
        try {
            int var4 = arg1.method1530(-122);
            if (var4 > arg0) {
                var4 = arg0;
            }
            byte[] var5 = new byte[var4];
            arg1.field3109 += class472.field6610.method3628(var5, arg1.field3109, arg1.field3066, var4, -1, 0);
            return class79.method725(var5, 0, var4, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!bd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1198++;
        int var2 = this.method649(-6345, arg0);
        if ((var2 & this.field1226) == 0) {
            var2 = this.field1226;
        }
        if ((var2 & 0x1) != 0) {
            this.method651(3, arg0.getY(), arg0.getX(), arg0.getClickCount(), -116);
        }
        if ((var2 & 0x4) != 0) {
            this.method651(5, arg0.getY(), arg0.getX(), arg0.getClickCount(), -119);
        }
        if ((var2 & 0x2) != 0) {
            this.method651(4, arg0.getY(), arg0.getX(), arg0.getClickCount(), -117);
        }
        this.field1226 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
    private final void method653(int arg0) {
        field1201++;
        if (this.field1229 == null) {
            return;
        }
        this.field1229.removeMouseMotionListener(this);
        this.field1229.removeMouseListener(this);
        this.field1229 = null;
        this.field1211 = null;
        this.field1220 = null;
        this.field1212 = this.field1218 = this.field1202 = 0;
        int var2 = -106 / ((-arg0 - 57) / 46);
        this.field1224 = this.field1223 = this.field1226 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
    public final int method574(boolean arg0) {
        if (!arg0) {
            this.field1223 = -101;
        }
        field1213++;
        return this.field1212;
    }

    @OriginalMember(owner = "client!bd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1219++;
        int var2 = this.method649(-6345, arg0);
        if (var2 == 1) {
            this.method651(0, arg0.getY(), arg0.getX(), arg0.getClickCount(), -126);
        } else if (var2 == 4) {
            this.method651(2, arg0.getY(), arg0.getX(), arg0.getClickCount(), -112);
        } else if (var2 == 2) {
            this.method651(1, arg0.getY(), arg0.getX(), arg0.getClickCount(), -121);
        }
        this.field1226 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    public static void method654(byte arg0) {
        int var1 = 49 % ((arg0 + 35) / 41);
        field1216 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class61(Component arg0, boolean arg1) {
        this.method648((byte) -108, arg0);
        this.field1228 = arg1;
    }
}
