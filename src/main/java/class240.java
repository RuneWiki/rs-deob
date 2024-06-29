import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class240 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
    public static boolean field3381 = false;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[I")
    public static int[] field3384 = new int[128];

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lqj;")
    public static class238 field3382;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[[B")
    public static byte[][] field3383;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIILro;IIII)V", line = 7)
    public static final void method1489(byte arg0, int arg1, int arg2, class249 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class309.field4431) {
            class94.field1302 = 32;
        } else {
            class94.field1302 = 0;
        }
        field3386++;
        class309.field4431 = false;
        if (arg0 != -92) {
            field3384 = null;
        }
        if (class10.field100 != 0) {
            if (arg2 >= arg5 && (arg5 + 16) > arg2 && arg7 >= arg1 && arg7 < (arg1 + 16)) {
                arg3.field3582 -= 4;
                class392.method2564(-99, arg3);
            } else if (arg5 <= arg2 && arg5 + 16 > arg2 && arg7 >= arg4 + arg1 - 16 && arg7 < (arg1 + arg4)) {
                arg3.field3582 += 4;
                class392.method2564(-76, arg3);
            } else if (arg2 >= arg5 - class94.field1302 && arg2 < (arg5 + class94.field1302 + 16) && (arg1 + 16) <= arg7 && arg7 < (arg4 + arg1 - 16)) {
                int var8 = (arg4 - 32) * arg4 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - (var8 / 2) - arg1 - 16;
                int var10 = arg4 - var8 - 32;
                arg3.field3582 = (arg6 - arg4) * var9 / var10;
                class392.method2564(-109, arg3);
                class309.field4431 = true;
            }
        }
        if (class433.field6392 == 0) {
            return;
        }
        int var11 = arg3.field3578;
        if (arg2 >= (arg5 - var11) && arg7 >= arg1 && arg2 < (arg5 + 16) && arg1 + arg4 >= arg7) {
            arg3.field3582 += class433.field6392 * 45;
            class392.method2564(-82, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 73)
    public static void method1490(byte arg0) {
        field3384 = null;
        int var1 = 122 / ((arg0 + 67) / 33);
        field3383 = null;
        field3382 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILro;IB)V", line = 91)
    public static final void method1491(int arg0, class249 arg1, int arg2, byte arg3) {
        class123.field1646 = arg1;
        class77.field1056 = arg2;
        class300.field4315 = arg0;
        if (arg3 < 4) {
            method1489((byte) -109, -92, -74, (class249) null, 28, -104, -30, -34);
        }
        field3385++;
    }
}
