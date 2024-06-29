import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class171 extends class356 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "Lvf;")
    private class166 field2028 = new class166();

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "Lvf;")
    private class166 field2049 = new class166();

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "Z")
    private boolean field2053;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2020 = 0;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    private int field2021;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    private int field2040;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "Lhc;")
    public static class398 field2045;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lg;")
    public static class470 field2022;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "Ljava/awt/Component;")
    private Component field2054;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)V", line = 3)
    private final void method832(int arg0, MouseEvent arg1) {
        this.field2051 = arg1.getX();
        field2042++;
        this.field2048 = arg1.getY();
        if (this.field2053) {
            this.method835(arg1.getY(), 52, arg1.getX(), -1);
        }
        if (arg0 < 21) {
            this.field2040 = -14;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)Loc;", line = 24)
    public final class100 method833(int arg0) {
        field2029++;
        if (arg0 != -7951) {
            this.mousePressed((MouseEvent) null);
        }
        return (class100) this.field2028.method810(arg0 ^ 0xFFFF863A);
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(B)Z", line = 36)
    public final boolean method834(byte arg0) {
        if (arg0 <= 62) {
            return false;
        } else {
            field2035++;
            return (this.field2040 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)V", line = 47)
    private final void method835(int arg0, int arg1, int arg2, int arg3) {
        field2043++;
        class462 var5 = new class462();
        if (arg1 != 52) {
            this.field2040 = 101;
        }
        var5.field6512 = arg3;
        var5.field6507 = arg0;
        var5.field6511 = arg2;
        var5.field6510 = class434.method2591(arg1 ^ 0xFFFFB4A6);
        this.field2049.method803(var5, 50);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V", line = 64)
    public final void method836(byte arg0) {
        this.method847(-32024);
        field2047++;
        if (arg0 <= 67) {
            method839((byte) -114, (class179) null);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)I", line = 76)
    public final int method837(int arg0) {
        if (arg0 != -1) {
            this.field2049 = null;
        }
        field2025++;
        return this.field2024;
    }

    @OriginalMember(owner = "client!sm", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 93)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field2036++;
        int var2 = this.method846(-108, arg0);
        if ((var2 & this.field2052) == 0) {
            var2 = this.field2052;
        }
        if ((var2 & 0x1) != 0) {
            this.method835(arg0.getY(), 52, arg0.getX(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method835(arg0.getY(), 52, arg0.getX(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method835(arg0.getY(), 52, arg0.getX(), 4);
        }
        this.field2052 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sm", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 128)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field2030++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sm", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 140)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field2027++;
        this.method832(124, arg0);
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)I", line = 154)
    public final int method838(int arg0) {
        field2038++;
        int var2 = 88 % ((arg0 - 89) / 32);
        return this.field2021;
    }

    @OriginalMember(owner = "client!sm", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 165)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field2031++;
        this.method832(106, arg0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLvt;)Ljava/lang/String;", line = 175)
    public static final String method839(byte arg0, class179 arg1) {
        field2044++;
        if (arg0 != 23) {
            method840(-82);
        }
        return class352.method2135((byte) -97, arg1, 32767);
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V", line = 187)
    public static void method840(int arg0) {
        field2045 = null;
        if (arg0 < -89) {
            field2022 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 198)
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.field2048 = -1;
        this.field2051 = -1;
        field2037++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)Z", line = 210)
    public final boolean method841(boolean arg0) {
        if (arg0) {
            this.field2051 = -109;
        }
        field2034++;
        return (this.field2040 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V", line = 221)
    public static final void method842(int arg0, boolean arg1) {
        if (arg1) {
            if (class57.field725 != -1) {
                class423.method2520((byte) 52, class57.field725);
            }
            for (class68 var2 = (class68) class369.field5270.method241(0); var2 != null; var2 = (class68) class369.field5270.method239(0)) {
                if (!var2.method698(true)) {
                    var2 = (class68) class369.field5270.method241(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class259.method1590(var2, false, -364, true);
            }
            class57.field725 = -1;
            class369.field5270 = new class45(8);
            class50.method265(arg0 ^ 0xFFFFFFF7);
            class57.field725 = class231.field3204;
            class418.method2486(false, false);
            class415.method2469((byte) 121);
            class396.method2373(class57.field725);
        }
        field2033++;
        class84.method427(0);
        class283.field4126 = arg0;
        class58.method302(class84.field1019, -15794);
        class19.field258 = new class198();
        class19.field258.field1005 = 6656;
        class19.field258.field2539[0] = 52;
        class19.field258.field1008 = 6656;
        class351.field5047 = 0;
        class58.field734 = 0;
        class19.field258.field2536[0] = 52;
        if (class358.field5167 == 2) {
            class351.field5047 = class233.field3241 << 7;
            class58.field734 = class90.field1130 << 7;
        } else {
            class360.method2196((byte) -47);
        }
        class347.method2099((byte) 100);
        if (class58.field734 == 0 || class351.field5047 == 0) {
            class404.method2413(false, 10);
        } else {
            class57.method296(true);
            class404.method2413(false, 28);
        }
    }

    @OriginalMember(owner = "client!sm", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 286)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        this.method832(80, arg0);
        field2039++;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)Z", line = 294)
    public final boolean method843(int arg0) {
        if (arg0 <= 23) {
            return true;
        } else {
            field2023++;
            return (this.field2040 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 306)
    private final void method844(byte arg0, Component arg1) {
        field2041++;
        if (arg0 != 0) {
            this.method837(-119);
        }
        this.method847(-32024);
        this.field2054 = arg1;
        this.field2054.addMouseListener(this);
        this.field2054.addMouseMotionListener(this);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 321)
    public final synchronized void method845(byte arg0) {
        field2026++;
        this.field2024 = this.field2051;
        this.field2021 = this.field2048;
        this.field2040 = this.field2052;
        if (arg0 >= 5) {
            class166 var2 = this.field2028;
            this.field2028 = this.field2049;
            this.field2049 = var2;
            this.field2049.method813(0);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(ILjava/awt/event/MouseEvent;)I", line = 344)
    private final int method846(int arg0, MouseEvent arg1) {
        field2032++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        if (arg0 > -98) {
            this.method843(-69);
        }
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

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V", line = 380)
    private final void method847(int arg0) {
        field2050++;
        if (this.field2054 == null) {
            return;
        }
        this.field2054.removeMouseListener(this);
        this.field2054.removeMouseMotionListener(this);
        this.field2024 = this.field2021 = this.field2040 = 0;
        this.field2051 = this.field2048 = this.field2052 = 0;
        this.field2049 = null;
        this.field2054 = null;
        this.field2028 = null;
        if (arg0 != -32024) {
            this.field2051 = 42;
        }
    }

    @OriginalMember(owner = "client!sm", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 403)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field2046++;
        int var2 = this.method846(-102, arg0);
        if (var2 == 1) {
            this.method835(arg0.getY(), 52, arg0.getX(), 0);
        } else if (var2 == 4) {
            this.method835(arg0.getY(), 52, arg0.getX(), 2);
        } else if (var2 == 2) {
            this.method835(arg0.getY(), 52, arg0.getX(), 1);
        }
        this.field2052 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 442)
    public class171(Component arg0, boolean arg1) {
        this.method844((byte) 0, arg0);
        this.field2053 = arg1;
    }
}
