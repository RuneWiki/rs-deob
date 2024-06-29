import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class407 extends class45 {

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "Lnu;")
    public class351 field5354;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Leba;")
    public static class550 field5358 = new class550(77, -1);

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "[Lvi;")
    public static class632[] field5359 = new class632[16];

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Ltt;")
    public static class338 field5360 = new class338(81, -1);

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "Z")
    public static boolean field5361 = false;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field5363;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field5364;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "[I")
    public static int[] field5362;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method2309(int arg0) {
        if (arg0 != 4983) {
            method2309(-1);
        }
        field5359 = null;
        field5360 = null;
        field5358 = null;
        field5362 = null;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lnu;)V")
    public class407(class351 arg0) {
        this.field5354 = arg0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ldp;I)V")
    public static final void method2310(class464 arg0, int arg1) {
        if (arg1 != -10868) {
            return;
        }
        field5363++;
        if (class153.field2168 == null) {
            return;
        }
        class599 var2 = null;
        if (arg0.field6085 == 0) {
            var2 = (class599) class41.method225(arg0.field6074, arg0.field6082, arg0.field6080);
        }
        if (arg0.field6085 == 1) {
            var2 = (class599) class595.method3304(arg0.field6074, arg0.field6082, arg0.field6080);
        }
        if (arg0.field6085 == 2) {
            var2 = (class599) class303.method1782(arg0.field6074, arg0.field6082, arg0.field6080, field5364 == null ? (field5364 = method2314("ge")) : field5364);
        }
        if (arg0.field6085 == 3) {
            var2 = (class599) class50.method266(arg0.field6074, arg0.field6082, arg0.field6080);
        }
        if (var2 == null) {
            arg0.field6084 = 0;
            arg0.field6077 = 0;
            arg0.field6076 = -1;
        } else {
            arg0.field6076 = var2.method710((byte) 67);
            arg0.field6077 = var2.method699((byte) -93);
            arg0.field6084 = var2.method706(16259);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIII)V")
    public static final void method2311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5355++;
        float var5 = (float) class672.field9571 / (float) class672.field9586;
        int var6 = arg4;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg4 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg3 - (arg4 - var6) / 2;
        int var9 = arg1 - (arg2 - var7) / arg0;
        class698.field9854 = class672.field9586 * var8 / var6;
        class424.field5722 = class672.field9571 - (class672.field9571 * var9 / var7);
        class59.field746 = -1;
        class68.field827 = -1;
        class310.method1827((byte) 112);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lij;")
    public static final class614 method2312(Throwable arg0, String arg1) {
        field5356++;
        class614 var2;
        if ((arg0 instanceof class614)) {
            var2 = (class614) arg0;
            var2.field8508 = var2.field8508 + ' ' + arg1;
        } else {
            var2 = new class614(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILhca;I)V")
    public static final void method2313(int arg0, class186 arg1, int arg2) {
        field5357++;
        if (class413.field5414 >= 50 || arg1 == null || arg1.field2589 == null || arg1.field2589.length <= arg0 || arg1.field2589[arg0] == null) {
            return;
        }
        int var3 = arg1.field2589[arg0][0];
        int var4 = var3 >> 8;
        int var5 = (var3 & 0xF5) >> 5;
        if (arg1.field2589[arg0].length > 1) {
            int var6 = (int) (Math.random() * (double) arg1.field2589[arg0].length);
            if (var6 > 0) {
                var4 = arg1.field2589[arg0][var6];
            }
        }
        if (arg1.field2578) {
            class609.method3379(var4, 0, var5, 255, -87, false);
        } else {
            class493.method2816(var5, var4, 3, 255, 0);
        }
        if (arg2 != 255) {
            field5361 = true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2314(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
