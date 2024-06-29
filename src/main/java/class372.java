import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class372 extends class508 {

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "Ljava/lang/String;")
    public String field4830;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "[I")
    public static int[] field4832 = new int[5];

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "Lqa;")
    public static class129 field4831;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 5) {
            method2168(-120, -58, 41, -98, 107, 11, -62, 23, 57, 23);
        }
        if (arg2 < arg0) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class333.field4265[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class333.field4265[var6][arg1] = arg4;
            }
        }
        field4829++;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V", line = 40)
    public class372() {
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIIIIII)V", line = 47)
    public static final void method2168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4828++;
        class354 var10 = null;
        for (class354 var11 = (class354) class460.field6425.method49(-121); var11 != null; var11 = (class354) class460.field6425.method46((byte) 115)) {
            if (var11.field4544 == arg2 && var11.field4546 == arg9 && var11.field4538 == arg6 && var11.field4533 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class354();
            var10.field4546 = arg9;
            var10.field4533 = arg5;
            var10.field4538 = arg6;
            var10.field4544 = arg2;
            if (arg9 >= 0 && arg6 >= 0 && class200.field2594 > arg9 && arg6 < class118.field1647) {
                class499.method2985((byte) -24, var10);
            }
            class460.field6425.method42(var10, 0);
        }
        var10.field4539 = arg3;
        var10.field4545 = arg7;
        var10.field4542 = arg0;
        if (arg8 == 0) {
            var10.field4540 = arg4;
            var10.field4534 = arg1;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V", line = 92)
    public static void method2169(int arg0) {
        if (arg0 == 28098) {
            field4831 = null;
            field4832 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 102)
    public class372(String arg0) {
        this.field4830 = arg0;
    }
}
