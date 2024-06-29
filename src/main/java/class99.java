import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class99 extends class637 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!aja", name = "C", descriptor = "Ltm;")
    private class412 field1385 = new class412();

    @OriginalMember(owner = "client!aja", name = "I", descriptor = "Ltm;")
    private class412 field1391 = new class412();

    @OriginalMember(owner = "client!aja", name = "M", descriptor = "Z")
    private boolean field1395;

    @OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!aja", name = "E", descriptor = "Z")
    public static boolean field1387 = false;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!aja", name = "l", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!aja", name = "m", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!aja", name = "n", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client!aja", name = "o", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!aja", name = "p", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!aja", name = "q", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!aja", name = "s", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!aja", name = "t", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!aja", name = "u", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!aja", name = "v", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!aja", name = "w", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!aja", name = "x", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!aja", name = "y", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!aja", name = "z", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!aja", name = "A", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!aja", name = "B", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!aja", name = "D", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!aja", name = "F", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!aja", name = "G", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!aja", name = "H", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!aja", name = "J", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client!aja", name = "K", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!aja", name = "L", descriptor = "Ljava/awt/Component;")
    private Component field1394;

    @OriginalMember(owner = "client!aja", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 4)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field1377++;
        this.method781((byte) 118, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "(I)V", line = 17)
    public final synchronized void method767(int arg0) {
        this.field1370 = this.field1390;
        this.field1366 = this.field1393;
        field1367++;
        this.field1380 = this.field1392;
        class412 var2 = this.field1385;
        if (arg0 != -3459) {
            this.field1370 = 105;
        }
        this.field1385 = this.field1391;
        this.field1391 = var2;
        this.field1391.method2549(-121);
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)Z", line = 39)
    public final boolean method768(boolean arg0) {
        if (arg0) {
            this.method776(89, null);
        }
        field1383++;
        return (this.field1380 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIIII)V", line = 50)
    private final void method769(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1386++;
        if (arg3 != 18452) {
            return;
        }
        class369 var6 = new class369();
        var6.field5364 = arg1;
        var6.field5351 = arg4;
        var6.field5360 = arg0;
        var6.field5361 = arg2;
        var6.field5352 = class302.method1910(0);
        this.field1391.method2545(arg3 - 18580, var6);
    }

    @OriginalMember(owner = "client!aja", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 68)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method781((byte) 119, arg0.getY(), arg0.getX());
        field1375++;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 76)
    private final int method770(MouseEvent arg0, int arg1) {
        field1381++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != arg1;
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
            return 0;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method771(int arg0) {
        field1373++;
        if (arg0 != 0) {
            this.mouseExited(null);
        }
        return (this.field1380 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!aja", name = "g", descriptor = "(I)V", line = 123)
    private final void method772(int arg0) {
        field1382++;
        if (this.field1394 == null) {
            return;
        }
        this.field1394.removeMouseMotionListener(this);
        this.field1394.removeMouseListener(this);
        this.field1390 = this.field1393 = this.field1392 = 0;
        this.field1394 = null;
        this.field1385 = null;
        this.field1391 = null;
        if (arg0 != 8) {
            this.mouseDragged(null);
        }
        this.field1370 = this.field1366 = this.field1380 = 0;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)Z", line = 156)
    public final boolean method773(byte arg0) {
        if (arg0 < 10) {
            this.method771(-50);
        }
        field1363++;
        return (this.field1380 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!aja", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 169)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method781((byte) -67, arg0.getY(), arg0.getX());
        field1389++;
    }

    @OriginalMember(owner = "client!aja", name = "f", descriptor = "(I)Lqq;", line = 177)
    public final class504 method774(int arg0) {
        if (arg0 == 0) {
            field1361++;
            return (class504) this.field1385.method2543(-15114);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aja", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 188)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field1388++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "(I)V", line = 199)
    public final void method775(int arg0) {
        if (arg0 != -24712) {
            this.field1391 = null;
        }
        this.method772(8);
        field1371++;
    }

    @OriginalMember(owner = "client!aja", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 210)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1378++;
        int var2 = this.method770(arg0, 0);
        if ((this.field1392 & var2) == 0) {
            var2 = this.field1392;
        }
        if ((var2 & 0x1) != 0) {
            this.method769(arg0.getClickCount(), arg0.getY(), arg0.getX(), 18452, 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method769(arg0.getClickCount(), arg0.getY(), arg0.getX(), 18452, 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method769(arg0.getClickCount(), arg0.getY(), arg0.getX(), 18452, 4);
        }
        this.field1392 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 244)
    private final void method776(int arg0, Component arg1) {
        this.method772(8);
        int var3 = -103 % ((-arg0 - 9) / 61);
        field1376++;
        this.field1394 = arg1;
        this.field1394.addMouseListener(this);
        this.field1394.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(B)I", line = 260)
    public final int method777(byte arg0) {
        field1379++;
        int var2 = 69 / ((-arg0 - 83) / 33);
        return this.field1366;
    }

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "(I)I", line = 270)
    public final int method778(int arg0) {
        if (arg0 == 0) {
            field1365++;
            return this.field1370;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIZBI)Lqb;", line = 282)
    public static final class237 method779(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field1368++;
        class237 var5 = new class237();
        if (arg3 != 19) {
            method780(107, (byte) 42);
        }
        var5.field3202 = arg0;
        var5.field3196 = arg4;
        class609.field8283.method3962((long) arg1, var5, -128);
        class488.method2838(arg0, (byte) -26);
        class668 var6 = class536.method3067(arg1, arg3 ^ 0x13);
        if (var6 != null) {
            class763.method4242(var6, true);
        }
        if (class189.field2524 != null) {
            class763.method4242(class189.field2524, true);
            class189.field2524 = null;
        }
        class599.method3329(true);
        if (var6 != null) {
            class446.method2678(123, !arg2, var6);
        }
        if (!arg2) {
            class173.method1226(arg0);
        }
        if (!arg2 && class69.field968 != -1) {
            class274.method1782((byte) -47, 1, class69.field968);
        }
        return var5;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(IB)Z", line = 324)
    public static final boolean method780(int arg0, byte arg1) {
        field1369++;
        if (arg1 > -27) {
            method780(124, (byte) 110);
        }
        return arg0 == 30 || arg0 == 8 || arg0 == 1001 || arg0 == 18 || arg0 == 19;
    }

    @OriginalMember(owner = "client!aja", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 338)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field1364++;
        this.method781((byte) -124, arg0.getY(), arg0.getX());
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(BII)V", line = 346)
    private final void method781(byte arg0, int arg1, int arg2) {
        this.field1390 = arg2;
        int var4 = -89 / ((arg0 - 3) / 47);
        field1384++;
        this.field1393 = arg1;
        if (this.field1395) {
            this.method769(0, arg1, arg2, 18452, -1);
        }
    }

    @OriginalMember(owner = "client!aja", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 363)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field1372++;
        int var2 = this.method770(arg0, 0);
        if (var2 == 1) {
            this.method769(arg0.getClickCount(), arg0.getY(), arg0.getX(), 18452, 0);
        } else if (var2 == 4) {
            this.method769(arg0.getClickCount(), arg0.getY(), arg0.getX(), 18452, 2);
        } else if (var2 == 2) {
            this.method769(arg0.getClickCount(), arg0.getY(), arg0.getX(), 18452, 1);
        }
        this.field1392 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 403)
    public class99(Component arg0, boolean arg1) {
        this.method776(64, arg0);
        this.field1395 = arg1;
    }
}
