import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class249 extends class566 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "Lgk;")
    private class616 field3100 = new class616();

    @OriginalMember(owner = "client!vba", name = "P", descriptor = "Lgk;")
    private class616 field3116 = new class616();

    @OriginalMember(owner = "client!vba", name = "U", descriptor = "Z")
    private boolean field3121;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!vba", name = "E", descriptor = "[[B")
    public static byte[][] field3106 = new byte[1000][];

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "Lnfa;")
    public static class151 field3096 = new class151(14, 1);

    @OriginalMember(owner = "client!vba", name = "J", descriptor = "Lnfa;")
    public static class151 field3110 = new class151(15, 4);

    @OriginalMember(owner = "client!vba", name = "L", descriptor = "Lnfa;")
    public static class151 field3112 = new class151(16, -2);

    @OriginalMember(owner = "client!vba", name = "N", descriptor = "Lnfa;")
    public static class151 field3114 = new class151(17, 0);

    @OriginalMember(owner = "client!vba", name = "Q", descriptor = "Lnfa;")
    public static class151 field3117 = new class151(18, -2);

    @OriginalMember(owner = "client!vba", name = "V", descriptor = "Lnfa;")
    public static class151 field3122 = new class151(19, -2);

    @OriginalMember(owner = "client!vba", name = "W", descriptor = "Lnfa;")
    public static class151 field3123 = new class151(20, 6);

    @OriginalMember(owner = "client!vba", name = "X", descriptor = "Lnfa;")
    public static class151 field3124 = new class151(21, 9);

    @OriginalMember(owner = "client!vba", name = "Y", descriptor = "Lnfa;")
    public static class151 field3125 = new class151(22, -2);

    @OriginalMember(owner = "client!vba", name = "Z", descriptor = "Lnfa;")
    public static class151 field3126 = new class151(23, 4);

    @OriginalMember(owner = "client!vba", name = "ab", descriptor = "Lnfa;")
    public static class151 field3127 = new class151(24, -1);

    @OriginalMember(owner = "client!vba", name = "bb", descriptor = "Lnfa;")
    public static class151 field3128 = new class151(25, -2);

    @OriginalMember(owner = "client!vba", name = "cb", descriptor = "Lnfa;")
    public static class151 field3129 = new class151(26, 0);

    @OriginalMember(owner = "client!vba", name = "db", descriptor = "Lnfa;")
    public static class151 field3130 = new class151(27, 0);

    @OriginalMember(owner = "client!vba", name = "eb", descriptor = "[Lnfa;")
    private static class151[] field3131 = new class151[32];

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    private int field3086;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!vba", name = "C", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!vba", name = "D", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!vba", name = "F", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!vba", name = "H", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!vba", name = "I", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!vba", name = "K", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!vba", name = "M", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!vba", name = "O", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!vba", name = "R", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!vba", name = "S", descriptor = "I")
    private int field3119;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "Ltf;")
    public static class701 field3088;

    @OriginalMember(owner = "client!vba", name = "T", descriptor = "Ljava/awt/Component;")
    private Component field3120;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "(I)Z")
    public final boolean method248(int arg0) {
        if (arg0 < 122) {
            this.method244(63);
        }
        field3092++;
        return (this.field3086 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!vba", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field3087++;
        int var2 = this.method1466(110, arg0);
        if ((this.field3119 & var2) == 0) {
            var2 = this.field3119;
        }
        if ((var2 & 0x1) != 0) {
            this.method1473(arg0.getY(), 3, arg0.getClickCount(), arg0.getX(), -89);
        }
        if ((var2 & 0x4) != 0) {
            this.method1473(arg0.getY(), 5, arg0.getClickCount(), arg0.getX(), -57);
        }
        if ((var2 & 0x2) != 0) {
            this.method1473(arg0.getY(), 4, arg0.getClickCount(), arg0.getX(), -94);
        }
        this.field3119 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public final void method243(int arg0) {
        this.method1469(arg0);
        field3101++;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/awt/event/MouseEvent;)I")
    private final int method1466(int arg0, MouseEvent arg1) {
        field3094++;
        int var3 = arg1.getModifiers();
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (arg0 <= 39) {
            method1471((byte) 21);
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

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        field3093++;
        if (arg0 == 20822) {
            return (this.field3086 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vba", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method1472((byte) 31, arg0.getX(), arg0.getY());
        field3099++;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)I")
    public final int method252(int arg0) {
        field3095++;
        if (arg0 != 7) {
            field3117 = null;
        }
        return this.field3113;
    }

    @OriginalMember(owner = "client!vba", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3098++;
        this.method1472((byte) 95, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lha;III[Z)V")
    public static final void method1467(class120 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class666.field9303 == class156.field1743) {
            return;
        }
        int var5 = class385.field5193[arg1].method1610(arg2, 123, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class274 var7 = class385.field5193[var6];
                if (var7 != null) {
                    var7.method385(arg0, arg2, var5 - var7.method1610(arg2, 107, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private final void method1468(int arg0, Component arg1) {
        this.method1469(0);
        if (arg0 == 2425) {
            field3109++;
            this.field3120 = arg1;
            this.field3120.addMouseListener(this);
            this.field3120.addMouseMotionListener(this);
        }
    }

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "(I)V")
    private final void method1469(int arg0) {
        field3084++;
        if (this.field3120 == null) {
            return;
        }
        this.field3120.removeMouseMotionListener(this);
        this.field3120.removeMouseListener(this);
        this.field3115 = this.field3118 = this.field3119 = arg0;
        this.field3120 = null;
        this.field3100 = null;
        this.field3116 = null;
        this.field3097 = this.field3113 = this.field3086 = 0;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V")
    public final synchronized void method244(int arg0) {
        this.field3113 = this.field3118;
        this.field3086 = this.field3119;
        field3103++;
        this.field3097 = this.field3115;
        class616 var2 = this.field3100;
        if (arg0 == 0) {
            this.field3100 = this.field3116;
            this.field3116 = var2;
            this.field3116.method3438(arg0 ^ 0x10);
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V")
    public static final void method1470(byte arg0) {
        if (arg0 != -34) {
            return;
        }
        field3105++;
        int var1 = class306.field3786;
        int[] var2 = class396.field5353;
        for (int var3 = 0; var3 < var1; var3++) {
            class236 var4 = class139.field1540[var2[var3]];
            if (var4 != null) {
                class505.method2898(arg0 + 159, var4.method1414(arg0 ^ 0x7C0D), var4);
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)V")
    public static void method1471(byte arg0) {
        field3127 = null;
        field3096 = null;
        field3129 = null;
        field3110 = null;
        field3112 = null;
        field3130 = null;
        field3125 = null;
        field3123 = null;
        field3124 = null;
        field3128 = null;
        field3122 = null;
        field3131 = null;
        field3126 = null;
        field3114 = null;
        field3106 = null;
        field3117 = null;
        if (arg0 == -121) {
            field3088 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3089++;
    }

    @OriginalMember(owner = "client!vba", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field3091++;
        this.method1472((byte) 55, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "(I)Laaa;")
    public final class103 method249(int arg0) {
        field3107++;
        return arg0 < 69 ? null : (class103) this.field3100.method3440((byte) 114);
    }

    @OriginalMember(owner = "client!vba", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3111++;
        this.method1472((byte) 31, arg0.getX(), arg0.getY());
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BII)V")
    private final void method1472(byte arg0, int arg1, int arg2) {
        this.field3118 = arg2;
        field3083++;
        if (arg0 > 19) {
            this.field3115 = arg1;
            if (this.field3121) {
                this.method1473(arg2, -1, 0, arg1, -86);
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)Z")
    public final boolean method250(int arg0) {
        int var2 = -60 % ((arg0 + 19) / 59);
        field3108++;
        return (this.field3086 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)I")
    public final int method253(boolean arg0) {
        field3102++;
        if (!arg0) {
            method1471((byte) 1);
        }
        return this.field3097;
    }

    @OriginalMember(owner = "client!vba", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field3104++;
        int var2 = this.method1466(110, arg0);
        if (var2 == 1) {
            this.method1473(arg0.getY(), 0, arg0.getClickCount(), arg0.getX(), -21);
        } else if (var2 == 4) {
            this.method1473(arg0.getY(), 2, arg0.getClickCount(), arg0.getX(), -99);
        } else if (var2 == 2) {
            this.method1473(arg0.getY(), 1, arg0.getClickCount(), arg0.getX(), -18);
        }
        this.field3119 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIII)V")
    private final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3085++;
        class363 var6 = new class363();
        var6.field4869 = arg3;
        var6.field4870 = arg2;
        var6.field4865 = arg1;
        var6.field4867 = arg0;
        var6.field4861 = class557.method3157(-72);
        if (arg4 < -7) {
            this.field3116.method3425(var6, false);
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class249(Component arg0, boolean arg1) {
        this.method1468(2425, arg0);
        this.field3121 = arg1;
    }

    static {
        class151[] var0 = class103.method560((byte) 12);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3131[var0[var1].field1673] = var0[var1];
        }
    }
}
