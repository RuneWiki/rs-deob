import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class225 extends class45 {

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "Ljava/lang/String;")
    public String field2926;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "[I")
    public static int[] field2930 = new int[1];

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "Lmt;")
    public static class680 field2929 = new class680();

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "Ltt;")
    public static class338 field2931 = new class338(76, -1);

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field2933 = -1;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "F")
    public static float field2932;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILkba;[IZ)V")
    public static final void method1406(int arg0, class573 arg1, int[] arg2, boolean arg3) {
        field2925++;
        if (arg1.field2989 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field2989.length; var5++) {
                if (arg1.field2989[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field3048 != -1) {
                class186 var6 = class423.field5620.method1707(arg1.field3048, 54);
                int var7 = var6.field2584;
                if (var7 == 1) {
                    arg1.field2991 = 0;
                    arg1.field3068 = arg0;
                    arg1.field3026 = 1;
                    arg1.field3051 = 0;
                    arg1.field3058 = 0;
                    class615.method3398(arg1.field2991, arg1.field398, var6, -1773, arg1.field397, arg1.field385, class408.field5369 == arg1);
                }
                if (var7 == 2) {
                    arg1.field3051 = 0;
                }
            }
        }
        boolean var8 = arg3;
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg1.field2989 == null || arg1.field2989[var9] == -1 || class423.field5620.method1707(arg2[var9], 106).field2572 >= class423.field5620.method1707(arg1.field2989[var9], -123).field2572) {
                arg1.field2989 = arg2;
                arg1.field3068 = arg0;
                break;
            }
        }
        if (var8) {
            arg1.field2989 = arg2;
            arg1.field3068 = arg0;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method1407(int arg0) {
        if (arg0 != -3) {
            field2931 = null;
        }
        field2931 = null;
        field2930 = null;
        field2929 = null;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "()V")
    public class225() {
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class225(String arg0, int arg1) {
        this.field2926 = arg0;
    }
}
