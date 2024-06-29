import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class477 extends Canvas {

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field6776;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "Ljo;")
    public static class351 field6779 = new class351(52, 4);

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "I")
    public static int field6780 = 0;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "Lrh;")
    public static class275 field6781 = new class275(10, 2, 2, 0);

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "J")
    public static long field6783 = 1L;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
    public static int field6782;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rca", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field6784;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2813(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void paint(Graphics arg0) {
        field6775++;
        this.field6776.paint(arg0);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IBII)Z", line = 15)
    public static final boolean method2811(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -57) {
            field6783 = -39L;
        }
        field6777++;
        class362 var4 = (class362) class259.method1702(arg0, arg3, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class666.method3793(-77, var4);
        }
        class362 var6 = (class362) class195.method1415(arg0, arg3, arg2, field6784 == null ? (field6784 = method2813("ija")) : field6784);
        if (var6 != null) {
            var5 &= class666.method3793(-114, var6);
        }
        class362 var7 = (class362) class728.method4087(arg0, arg3, arg2);
        if (var7 != null) {
            var5 &= class666.method3793(-106, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rca", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 45)
    public final void update(Graphics arg0) {
        this.field6776.update(arg0);
        field6778++;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)V", line = 53)
    public static void method2812(int arg0) {
        if (arg0 != 2) {
            method2812(-40);
        }
        field6781 = null;
        field6779 = null;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 66)
    public class477(Component arg0) {
        this.field6776 = arg0;
    }
}
