import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class434 extends class508 implements Runnable {

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public int field6182 = -1;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
    private boolean field6190 = true;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lhb;")
    private class619 field6181;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Lcba;")
    public static class471 field6184 = new class471(99, 2);

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field6189 = 0;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Z")
    public static boolean field6191 = false;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Lcba;")
    public static class471 field6185;

    @OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field6190) {
            this.field6181.method3607(this, -958);
        }
        field6192++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lbea;IILhh;IIILss;)V")
    public static final void method2578(class188 arg0, int arg1, int arg2, class109 arg3, int arg4, int arg5, int arg6, class364 arg7) {
        field6183++;
        class421 var8 = new class421();
        var8.field5914 = arg1 << 7;
        var8.field5906 = arg5 << 7;
        var8.field5909 = arg4;
        if (arg6 != 279765095) {
            field6184 = null;
        }
        if (arg7 != null) {
            var8.field5905 = arg7;
            int var10 = arg7.field4910;
            int var11 = arg7.field4926;
            if (arg2 == 1 || arg2 == 3) {
                var10 = arg7.field4926;
                var11 = arg7.field4910;
            }
            var8.field5915 = arg7.field4899;
            var8.field5913 = arg1 + var10 << 7;
            var8.field5919 = arg7.field4933;
            var8.field5921 = arg7.field4878;
            var8.field5916 = arg7.field4952 << 7;
            var8.field5922 = arg5 + var11 << 7;
            var8.field5908 = arg7.field4941;
            var8.field5924 = arg7.field4945;
            if (arg7.field4904 != null) {
                var8.field5912 = true;
                var8.method2516(0);
            }
            if (var8.field5921 != null) {
                var8.field5923 = (int) (Math.random() * (double) (var8.field5924 - var8.field5919)) + var8.field5919;
            }
            class41.field806.method463(var8, -96);
        } else if (arg3 != null) {
            var8.field5920 = arg3;
            class593 var9 = arg3.field1669;
            if (var9.field8532 != null) {
                var8.field5912 = true;
                var9 = var9.method3516(class189.field2681, arg6 - 279764993);
            }
            if (var9 != null) {
                var8.field5922 = var9.field8597 + arg5 << 7;
                var8.field5913 = arg1 + var9.field8597 << 7;
                var8.field5915 = class522.method3011(arg3, true);
                var8.field5908 = var9.field8531;
                var8.field5916 = var9.field8524 << 7;
            }
            class495.field6924.method463(var8, -93);
        } else if (arg0 != null) {
            var8.field5907 = arg0;
            var8.field5913 = arg0.method337(0) + arg1 << 7;
            var8.field5922 = arg0.method337(arg6 - 279765095) + arg5 << 7;
            var8.field5915 = class443.method2622(-113, arg0);
            var8.field5916 = arg0.field2663 << 7;
            var8.field5908 = arg0.field2635;
            class480.field6765.method1241(var8, (long) arg0.field607, -128);
            return;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method2579(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field6186++;
        if (class377.method2232(arg5 + 122, arg0)) {
            if (class75.field1198[arg0] == null) {
                class506.method2929(arg4, -1, arg2, class618.field8850[arg0], arg3, 9, arg6, arg1, arg8, arg7);
            } else {
                class506.method2929(arg4, -1, arg2, class75.field1198[arg0], arg3, 9, arg6, arg1, arg8, arg7);
            }
            if (arg5 != -2) {
                field6185 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class48.field940[var9] = true;
            }
        } else {
            class48.field940[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public final void method2580(byte arg0) {
        if (arg0 == -31) {
            this.field6190 = false;
            field6187++;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public final void method2581(int arg0) {
        (new Thread(this, "a")).start();
        if (arg0 != 995242791) {
            method2578(null, -77, -16, null, 25, -72, 80, null);
        }
        field6188++;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public static void method2582(int arg0) {
        field6185 = null;
        if (arg0 != 17036) {
            field6184 = null;
        }
        field6184 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lhb;)V")
    public class434(class619 arg0) {
        this.field6181 = arg0;
    }
}
