import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class434 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Z")
    public static boolean field6378 = true;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field6380 = 503;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lpp;")
    public static class464 field6379 = new class464(41, 16);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method2586(int arg0) {
        field6379 = null;
        if (arg0 != -25146) {
            field6380 = 51;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII[B)V")
    public static final void method2587(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6376++;
        if (arg2 <= arg3) {
            return;
        }
        int var6 = arg0 + arg3;
        int var7 = arg2 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg2 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg1 >= -109) {
                            field6378 = true;
                            return;
                        } else {
                            return;
                        }
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }
}
