import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class337 extends class345 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Lum;")
    private class347 field4885 = new class347();

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Lum;")
    private class347 field4907 = new class347();

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "Z")
    private boolean field4915;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "[I")
    public static int[] field4880 = new int[2048];

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "Liu;")
    public static class390 field4886 = new class390(59, -2);

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "Lwt;")
    public static class194 field4902 = new class194("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4904 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "I")
    public static int field4913 = 1403;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Lum;")
    public static class347 field4912 = new class347();

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4917 = null;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "F")
    public static float field4910;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    private int field4887;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    private int field4893;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!dk", name = "D", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    private int field4906;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    private int field4908;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    private int field4909;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "Lhe;")
    public static class239 field4916;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Lfu;")
    public static class254 field4911;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "Ljava/awt/Component;")
    private Component field4914;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIII)V", line = 6)
    private final void method2032(boolean arg0, int arg1, int arg2, int arg3) {
        field4883++;
        if (!arg0) {
            return;
        }
        class160 var5 = new class160();
        var5.field2076 = arg1;
        var5.field2079 = arg2;
        var5.field2075 = arg3;
        var5.field2081 = class109.method653(false);
        this.field4907.method2086((byte) -128, var5);
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V", line = 25)
    private final void method2033(byte arg0) {
        field4879++;
        if (this.field4914 == null) {
            return;
        }
        this.field4914.removeMouseListener(this);
        this.field4914.removeMouseMotionListener(this);
        this.field4893 = this.field4903 = this.field4887 = 0;
        if (arg0 >= -20) {
            this.field4914 = null;
        }
        this.field4914 = null;
        this.field4885 = null;
        this.field4909 = this.field4908 = this.field4906 = 0;
        this.field4907 = null;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V", line = 48)
    public final synchronized void method2034(int arg0) {
        this.field4887 = this.field4906;
        this.field4893 = this.field4909;
        field4898++;
        this.field4903 = this.field4908;
        class347 var2 = this.field4885;
        this.field4885 = this.field4907;
        this.field4907 = var2;
        this.field4907.method2089(328);
        int var3 = -43 % ((16 - arg0) / 61);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 69)
    private final void method2035(int arg0, Component arg1) {
        field4881++;
        this.method2033((byte) -70);
        this.field4914 = arg1;
        this.field4914.addMouseListener(this);
        this.field4914.addMouseMotionListener(this);
        if (arg0 != -10144) {
            this.method2043((byte) 68);
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)Z", line = 84)
    public final boolean method2036(int arg0) {
        if (arg0 <= 4) {
            field4886 = null;
        }
        field4875++;
        return (this.field4887 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!dk", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 97)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field4896++;
        this.field4909 = -1;
        this.field4908 = -1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I", line = 113)
    private final int method2037(MouseEvent arg0, int arg1) {
        field4894++;
        int var3 = arg0.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & arg1) != 0;
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

    @OriginalMember(owner = "client!dk", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 152)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2047(arg0, (byte) 61);
        field4897++;
    }

    @OriginalMember(owner = "client!dk", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 160)
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4877++;
        int var2 = this.method2037(arg0, 4);
        if (var2 == 1) {
            this.method2032(true, 0, arg0.getX(), arg0.getY());
        } else if (var2 == 4) {
            this.method2032(true, 2, arg0.getX(), arg0.getY());
        } else if (var2 == 2) {
            this.method2032(true, 1, arg0.getX(), arg0.getY());
        }
        this.field4906 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I", line = 188)
    public final int method2038(int arg0) {
        field4889++;
        if (arg0 != 9) {
            field4910 = -0.023214437F;
        }
        return this.field4893;
    }

    @OriginalMember(owner = "client!dk", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 199)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4891++;
        this.method2047(arg0, (byte) 61);
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)Lrm;", line = 212)
    public final class270 method2039(int arg0) {
        field4899++;
        if (arg0 != 16) {
            this.method2035(57, null);
        }
        return (class270) this.field4885.method2093(-10805);
    }

    @OriginalMember(owner = "client!dk", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 225)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2047(arg0, (byte) 61);
        field4882++;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(B)V", line = 234)
    public static void method2040(byte arg0) {
        if (arg0 >= -76) {
            field4912 = null;
        }
        field4911 = null;
        field4916 = null;
        field4902 = null;
        field4904 = null;
        field4880 = null;
        field4912 = null;
        field4917 = null;
        field4886 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)Lou;", line = 251)
    public static final class412 method2041(int arg0, int arg1) {
        field4895++;
        class412 var2 = (class412) class368.field5527.method40(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field755.method1470(4, arg0, 0);
        class412 var4 = new class412();
        if (arg1 != -27822) {
            field4902 = null;
        }
        if (var3 != null) {
            var4.method2455(true, new class156(var3));
        }
        var4.method2457(true);
        class368.field5527.method36(arg1 + 6862, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V", line = 280)
    public static final void method2042(int arg0) {
        if (arg0 > 61) {
            class305.field4419 = new class347();
            field4888++;
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z", line = 293)
    public final boolean method2043(byte arg0) {
        if (arg0 != -60) {
            this.field4906 = 48;
        }
        field4890++;
        return (this.field4887 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)I", line = 307)
    public final int method2044(byte arg0) {
        if (arg0 > -21) {
            this.method2037(null, 52);
        }
        field4892++;
        return this.field4903;
    }

    @OriginalMember(owner = "client!dk", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 319)
    public final synchronized void mouseClicked(MouseEvent arg0) {
        field4901++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z", line = 330)
    public final boolean method2045(int arg0) {
        field4884++;
        if (arg0 != 16383) {
            this.field4893 = -22;
        }
        return (this.field4887 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!dk", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 341)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4876++;
        int var2 = this.method2037(arg0, 4);
        if ((var2 & this.field4906) == 0) {
            var2 = this.field4906;
        }
        if ((var2 & 0x1) != 0) {
            this.method2032(true, 3, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x4) != 0) {
            this.method2032(true, 5, arg0.getX(), arg0.getY());
        }
        if ((var2 & 0x2) != 0) {
            this.method2032(true, 4, arg0.getX(), arg0.getY());
        }
        this.field4906 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V", line = 371)
    public final void method2046(byte arg0) {
        this.method2033((byte) -108);
        int var2 = -103 % ((-arg0 - 27) / 34);
        field4900++;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V", line = 426)
    public class337(Component arg0, boolean arg1) {
        this.method2035(-10144, arg0);
        this.field4915 = arg1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;B)V", line = 392)
    private final void method2047(MouseEvent arg0, byte arg1) {
        field4878++;
        this.field4909 = arg0.getX();
        this.field4908 = arg0.getY();
        if (arg1 != 61) {
            this.mouseClicked(null);
        }
        if (this.field4915) {
            this.method2032(true, -1, arg0.getX(), arg0.getY());
        }
    }
}
