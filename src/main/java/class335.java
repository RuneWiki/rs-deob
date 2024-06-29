import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class335 extends Canvas {

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field4798;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lpp;")
    public static class464 field4796 = new class464(12, 7);

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field4800 = 0;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
    public static int[] field4801 = new int[14];

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
    public static boolean field4802;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2060(String arg0, int arg1, int arg2) {
        field4803++;
        int var3 = 116 / ((3 - arg1) / 46);
        class221.field3313++;
        class624.method3537(-126, class27.field362);
        class127.field2088.method1710(class51.method441((byte) 116, arg0) + 1, 111);
        class127.field2088.method1737((byte) -12, arg2);
        class127.field2088.method1726((byte) -52, arg0);
    }

    @OriginalMember(owner = "client!hk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4798.paint(arg0);
        field4797++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method2061(int arg0) {
        if (arg0 != 7) {
            field4796 = null;
        }
        field4801 = null;
        field4796 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2062(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class335(Component arg0) {
        this.field4798 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)I")
    public static final int method2063(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        if (arg0 != -27960) {
            field4799 = -98;
        }
        field4804++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field4795++;
        this.field4798.update(arg0);
    }
}
