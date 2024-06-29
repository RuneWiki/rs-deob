import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class29 extends OutputStream {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "[Z")
    public static boolean[] field526 = new boolean[100];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lgi;I)V")
    public static final void method230(class164 arg0, int arg1) {
        class230.field3599 = arg0;
        if (arg1 == 17479) {
            field525++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILuk;ILhd;IILsg;I)V")
    public static final void method231(int arg0, class104 arg1, int arg2, class12 arg3, int arg4, int arg5, class172 arg6, int arg7) {
        field523++;
        if (arg0 != -19232) {
            field524 = 63;
        }
        class273 var8 = new class273();
        var8.field4396 = arg5;
        var8.field4394 = arg4 * 128;
        var8.field4410 = arg2 * 128;
        if (arg6 != null) {
            var8.field4406 = arg6.field2864 * 128;
            var8.field4409 = arg6;
            var8.field4411 = arg6.field2854;
            var8.field4399 = arg6.field2829;
            var8.field4395 = arg6.field2845;
            var8.field4418 = arg6.field2859;
            var8.field4403 = arg6.field2882;
            int var10 = arg6.field2809;
            int var11 = arg6.field2821;
            if (arg7 == 1 || arg7 == 3) {
                var10 = arg6.field2821;
                var11 = arg6.field2809;
            }
            var8.field4397 = (arg4 + var10) * 128;
            var8.field4400 = (arg2 + var11) * 128;
            if (arg6.field2846 != null) {
                var8.field4392 = true;
                var8.method1808(-30174);
            }
            if (var8.field4399 != null) {
                var8.field4398 = (int) (Math.random() * (double) (var8.field4411 - var8.field4403)) + var8.field4403;
            }
            class203.field3282.method1554(5257, var8);
        } else if (arg1 != null) {
            var8.field4417 = arg1;
            class242 var9 = arg1.field1645;
            if (var9.field3779 != null) {
                var8.field4392 = true;
                var9 = var9.method1649(false);
            }
            if (var9 != null) {
                var8.field4397 = (var9.field3789 + arg4) * 128;
                var8.field4400 = (var9.field3789 + arg2) * 128;
                var8.field4418 = class92.method644((byte) 120, arg1);
                var8.field4406 = var9.field3787 * 128;
                var8.field4395 = var9.field3778;
            }
            class66.field1071.method1554(arg0 ^ 0xFFFFA069, var8);
        } else if (arg3 != null) {
            var8.field4414 = arg3;
            var8.field4400 = (arg3.method101(false) + arg2) * 128;
            var8.field4397 = (arg3.method101(false) + arg4) * 128;
            var8.field4418 = class83.method595((byte) -29, arg3);
            var8.field4406 = arg3.field215 * 128;
            var8.field4395 = arg3.field228;
            class33.field546.method368(class162.method1114((byte) -116, arg3.field222), var8, -74);
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field521++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method232(int arg0) {
        if (arg0 != -29688) {
            field524 = 52;
        }
        field526 = null;
    }
}
