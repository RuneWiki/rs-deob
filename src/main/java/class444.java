import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class444 extends class543 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "Lqia;")
    private class547 field6231 = new class547();

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "Lqia;")
    private class547 field6242 = new class547();

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "Z")
    private boolean field6249;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6221 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    private int field6223;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    private int field6235;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    private int field6237;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    private int field6238;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    private int field6239;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    private int field6245;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Lee;")
    public static class485 field6234;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "Ljava/awt/Component;")
    private Component field6247;

    @OriginalMember(owner = "client!hi", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field6226++;
        this.method2613(arg0.getX(), -123, arg0.getY());
    }

    @OriginalMember(owner = "client!hi", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 14)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field6229++;
        int var2 = this.method2614(arg0, 99);
        if ((var2 & this.field6239) == 0) {
            var2 = this.field6239;
        }
        if ((var2 & 0x1) != 0) {
            this.method2618(3, 62, arg0.getX(), arg0.getY(), arg0.getClickCount());
        }
        if ((var2 & 0x4) != 0) {
            this.method2618(5, 33, arg0.getX(), arg0.getY(), arg0.getClickCount());
        }
        if ((var2 & 0x2) != 0) {
            this.method2618(4, 116, arg0.getX(), arg0.getY(), arg0.getClickCount());
        }
        this.field6239 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hi", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 41)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2613(arg0.getX(), -112, arg0.getY());
        field6244++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)Luk;", line = 56)
    public final class283 method2333(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field6222++;
            return (class283) this.field6231.method3115(1210318848);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)V", line = 68)
    public static void method2612(boolean arg0) {
        field6221 = null;
        if (!arg0) {
            field6234 = null;
        }
        field6234 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V", line = 80)
    private final void method2613(int arg0, int arg1, int arg2) {
        this.field6238 = arg0;
        if (arg1 >= -84) {
            this.mouseExited(null);
        }
        this.field6245 = arg2;
        field6241++;
        if (this.field6249) {
            this.method2618(-1, 56, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z", line = 99)
    public final boolean method2330(int arg0) {
        field6243++;
        if (arg0 != 0) {
            this.field6238 = 13;
        }
        return (this.field6237 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Z", line = 110)
    public final boolean method2334(int arg0) {
        field6233++;
        if (arg0 != 0) {
            this.method2334(45);
        }
        return (this.field6237 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 121)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field6220++;
        this.method2613(arg0.getX(), -114, arg0.getY());
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)I", line = 129)
    public final int method2336(byte arg0) {
        field6225++;
        if (arg0 < 2) {
            this.method2616((byte) -41);
        }
        return this.field6223;
    }

    @OriginalMember(owner = "client!hi", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field6227++;
        int var2 = this.method2614(arg0, -60);
        if (var2 == 1) {
            this.method2618(0, 59, arg0.getX(), arg0.getY(), arg0.getClickCount());
        } else if (var2 == 4) {
            this.method2618(2, 126, arg0.getX(), arg0.getY(), arg0.getClickCount());
        } else if (var2 == 2) {
            this.method2618(1, 112, arg0.getX(), arg0.getY(), arg0.getClickCount());
        }
        this.field6239 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 165)
    public final synchronized void method2331(byte arg0) {
        this.field6237 = this.field6239;
        if (arg0 < 5) {
            this.field6235 = 14;
        }
        this.field6223 = this.field6245;
        field6246++;
        this.field6235 = this.field6238;
        class547 var2 = this.field6231;
        this.field6231 = this.field6242;
        this.field6242 = var2;
        this.field6242.method3114(true);
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)Z", line = 193)
    public final boolean method2338(byte arg0) {
        field6216++;
        if (arg0 != 92) {
            this.field6223 = -121;
        }
        return (this.field6237 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 206)
    private final int method2614(MouseEvent arg0, int arg1) {
        int var3 = 41 % ((33 - arg1) / 62);
        field6217++;
        int var4 = arg0.getModifiers();
        boolean var5 = (var4 & 0x10) != 0;
        boolean var6 = (var4 & 0x8) != 0;
        boolean var7 = (var4 & 0x4) != 0;
        if (var6 && (var5 || var7)) {
            var6 = false;
        }
        if (var5 && var7) {
            return 4;
        } else if (var5) {
            return 1;
        } else if (var6) {
            return 2;
        } else if (var7) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)[Lrha;", line = 242)
    public static final class434[] method2615(int arg0) {
        field6228++;
        if (arg0 > -8) {
            method2617(99);
        }
        if (class147.field1779 == null) {
            class434[] var1 = class97.method652((byte) -1, class681.field9312);
            class434[] var2 = new class434[var1.length];
            int var3 = 0;
            int var4 = class223.field2944.field626.method1211((byte) -128);
            label73: for (int var5 = 0; var5 < var1.length; var5++) {
                class434 var9 = var1[var5];
                if ((var9.field6120 <= 0 || var9.field6120 >= 24) && var9.field6121 >= 800 && var9.field6117 >= 600 && (var4 != 2 || var9.field6121 <= 800 && var9.field6117 <= 600) && (var4 != 1 || var9.field6121 <= 1024 && var9.field6117 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class434 var11 = var2[var10];
                        if (var9.field6121 == var11.field6121 && var9.field6117 == var11.field6117) {
                            if (var9.field6120 > var11.field6120) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class147.field1779 = new class434[var3];
            class617.method3390(var2, 0, class147.field1779, 0, var3);
            int[] var6 = new int[class147.field1779.length];
            for (int var7 = 0; var7 < class147.field1779.length; var7++) {
                class434 var8 = class147.field1779[var7];
                var6[var7] = var8.field6121 * var8.field6117;
            }
            class680.method3650(class147.field1779, false, var6);
        }
        return class147.field1779;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(B)V", line = 332)
    private final void method2616(byte arg0) {
        field6218++;
        if (this.field6247 == null) {
            return;
        }
        this.field6247.removeMouseMotionListener(this);
        this.field6247.removeMouseListener(this);
        this.field6242 = null;
        this.field6238 = this.field6245 = this.field6239 = 0;
        this.field6231 = null;
        this.field6235 = this.field6223 = this.field6237 = 0;
        this.field6247 = null;
        if (arg0 > -91) {
            field6221 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 354)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field6224++;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Z", line = 364)
    public static final boolean method2617(int arg0) {
        if (arg0 == 0) {
            field6232++;
            return class244.field3142 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V", line = 378)
    private final void method2618(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6230++;
        class587 var6 = new class587();
        var6.field8195 = arg2;
        var6.field8199 = arg4;
        var6.field8209 = arg0;
        if (arg1 <= 30) {
            this.method2614(null, 92);
        }
        var6.field8201 = arg3;
        var6.field8198 = class97.method654((byte) 120);
        this.field6242.method3110(var6, 1);
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V", line = 398)
    public final void method2328(byte arg0) {
        field6240++;
        if (arg0 >= -43) {
            this.mouseReleased(null);
        }
        this.method2616((byte) -108);
    }

    @OriginalMember(owner = "client!hi", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 409)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2613(arg0.getX(), -116, arg0.getY());
        field6236++;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 461)
    public class444(Component arg0, boolean arg1) {
        this.method2619((byte) -11, arg0);
        this.field6249 = arg1;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I", line = 428)
    public final int method2337(int arg0) {
        if (arg0 >= -108) {
            field6234 = null;
        }
        field6248++;
        return this.field6235;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 443)
    private final void method2619(byte arg0, Component arg1) {
        this.method2616((byte) -119);
        field6219++;
        this.field6247 = arg1;
        this.field6247.addMouseListener(this);
        int var3 = -35 % ((arg0 + 66) / 41);
        this.field6247.addMouseMotionListener(this);
    }
}
