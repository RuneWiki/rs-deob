import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class431 extends Canvas {

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field5761;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public static int[] field5755 = new int[14];

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
    public static boolean field5759 = true;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lhg;")
    public static class693 field5760 = new class693(75, 2);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!li", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field5757++;
        this.field5761.update(arg0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static final void method2465(int arg0) {
        class67.method621(64, false);
        field5758++;
        if (arg0 != -1) {
            method2466(124, false, null);
        }
        if (class365.field4708 >= 0 && class365.field4708 != 0) {
            class415.method2331(false, class365.field4708, -4);
            class365.field4708 = -1;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
    public static final Object method2466(int arg0, boolean arg1, byte[] arg2) {
        field5753++;
        int var3 = -111 / ((-arg0 - 14) / 59);
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class24.field449) {
            try {
                class287 var4 = (class287) Class.forName("pe").getDeclaredConstructor().newInstance();
                var4.method1704(0, arg2);
                return var4;
            } catch (Throwable var5) {
                class24.field449 = true;
            }
        }
        return arg1 ? class302.method1802(arg2, -19451) : arg2;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIB)V")
    public static final void method2467(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (class667.field9373 <= arg2 && class225.field2994 >= arg3 && arg4 >= class546.field7619 && class760.field10606 >= arg1) {
            class100.method799(arg1, arg2, arg4, (byte) -14, arg0, arg3);
        } else {
            class632.method3547(arg4, arg3, 7652, arg2, arg1, arg0);
        }
        if (arg5 > -89) {
            method2466(-65, true, null);
        }
        field5754++;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public static void method2468(int arg0) {
        field5755 = null;
        field5760 = null;
        if (arg0 != 2) {
            field5760 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field5756++;
        this.field5761.paint(arg0);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class431(Component arg0) {
        this.field5761 = arg0;
    }
}
