import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class222 extends Canvas {

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field2805;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lup;")
    public static class181 field2800 = new class181(1, 2);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!on", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 3)
    public final void paint(Graphics arg0) {
        field2802++;
        this.field2805.paint(arg0);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([JZ[Ljava/lang/Object;)V", line = 14)
    public static final void method1350(long[] arg0, boolean arg1, Object[] arg2) {
        field2804++;
        if (!arg1) {
            class168.method1080(arg0.length - 1, 0, arg0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!on", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 25)
    public final void update(Graphics arg0) {
        this.field2805.update(arg0);
        field2801++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)Lui;", line = 36)
    public static final class153 method1351(boolean arg0) {
        field2806++;
        class153 var1 = (class153) class291.field3704.method1399(119);
        if (var1 != null) {
            var1.method2165(16225);
            var1.method701(81);
            return var1;
        }
        if (!arg0) {
            field2807 = 118;
        }
        class153 var2;
        do {
            var2 = (class153) class414.field5893.method1399(111);
            if (var2 == null) {
                return null;
            }
            if (var2.method1002((byte) 114) > class504.method3034((byte) -120)) {
                return null;
            }
            var2.method2165(16225);
            var2.method701(116);
        } while ((Long.MIN_VALUE & var2.field1098) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII)I", line = 78)
    public static final int method1352(int arg0, int arg1, int arg2, int arg3) {
        field2803++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg3 >= -6) {
                method1353(-70);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 101)
    public class222(Component arg0) {
        this.field2805 = arg0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 112)
    public static void method1353(int arg0) {
        if (arg0 == 1) {
            field2800 = null;
        }
    }
}
