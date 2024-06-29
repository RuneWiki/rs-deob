import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class489 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
    public static int[] field6952 = new int[1];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field6951 = 0;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method2890(byte arg0) {
        field6952 = null;
        if (arg0 >= -76) {
            method2891(null, 47, (byte) -111, 26, -90, 94, 9);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lha;IBIIII)Lka;")
    public static final class474 method2891(class60 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 127) {
            method2891(null, -64, (byte) -20, -67, -34, 59, 24);
        }
        field6953++;
        long var7 = (long) arg5;
        class474 var9 = (class474) class373.field4792.method3079(var7, 0);
        short var10 = 2055;
        if (var9 == null) {
            class714 var11 = class637.method3572(class220.field2956, arg5, arg2 ^ 0x7B, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field9927 < 13) {
                var11.method3989(2, -119);
            }
            var9 = arg0.method540(var11, var10, class137.field1969, 64, 768);
            class373.field4792.method3077((byte) -107, var7, var9);
        }
        class474 var12 = var9.method273((byte) 2, var10, true);
        if (arg4 != 0) {
            var12.method270(arg4);
        }
        if (arg3 != 0) {
            var12.method257(arg3);
        }
        if (arg6 != 0) {
            var12.method276(arg6);
        }
        if (arg1 != 0) {
            var12.method281(0, arg1, 0);
        }
        return var12;
    }
}
