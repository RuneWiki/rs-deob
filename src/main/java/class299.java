import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class299 extends Canvas {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field4632;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field4633 = -1;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4641 = " ";

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Leg;")
    public static class188 field4634 = new class188(32);

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field4643 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[B)Z", line = 5)
    public static final boolean method1967(int arg0, byte[] arg1) {
        field4631++;
        if (arg0 != -14948) {
            return true;
        }
        class303 var2 = new class303(arg1);
        int var3 = var2.method2043((byte) -117);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method2043((byte) -107) == 1;
        if (var4) {
            class235.method1603(var2, 12880);
        }
        class92.method632((byte) 115, var2);
        return true;
    }

    @OriginalMember(owner = "client!fg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 39)
    public final void paint(Graphics arg0) {
        field4638++;
        this.field4632.paint(arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 48)
    public static void method1968(byte arg0) {
        field4641 = null;
        if (arg0 == -76) {
            field4634 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lwf;IIILwf;)Lwd;", line = 59)
    public static final class232 method1969(class306 arg0, int arg1, int arg2, int arg3, class306 arg4) {
        field4639++;
        if (class156.method1093(true, arg2, arg1, arg0)) {
            int var5 = -9 / ((arg3 + 49) / 51);
            return class47.method325(-2, arg4.method2103(0, arg1, arg2));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 74)
    public final void update(Graphics arg0) {
        this.field4632.update(arg0);
        field4640++;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V", line = 85)
    public static final void method1970(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4637++;
        class15 var5 = (class15) class247.field3868.method1558((long) arg3, false);
        if (var5 == null) {
            var5 = new class15();
            class247.field3868.method1550(var5, (long) arg3, (byte) 100);
        }
        if (var5.field154.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field154.length; var8++) {
                var6[var8] = var5.field154[var8];
                var7[var8] = var5.field151[var8];
            }
            for (int var9 = var5.field154.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field154 = var6;
            var5.field151 = var7;
        }
        var5.field154[arg0] = arg4;
        if (arg1 != -1) {
            field4633 = -105;
        }
        var5.field151[arg0] = arg2;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)I", line = 136)
    public static final int method1971(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg3 != 10643) {
            return -63;
        }
        field4635++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 156)
    public class299(Component arg0) {
        this.field4632 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lwf;I)I", line = 170)
    public static final int method1972(class306 arg0, int arg1) {
        field4636++;
        int var2 = 0;
        if (arg1 <= 64) {
            return 84;
        }
        if (arg0.method2093(-114, class168.field2571)) {
            var2++;
        }
        if (arg0.method2093(-69, class311.field4932)) {
            var2++;
        }
        return var2;
    }
}
