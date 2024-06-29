import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class403 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Z")
    public static boolean field5425 = true;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Lbw;")
    public static class329 field5429;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
    public static void method2399(boolean arg0) {
        field5429 = null;
        if (arg0) {
            field5425 = true;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II[BIII)V")
    public static final void method2400(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field5430++;
        if (arg0 <= arg3) {
            return;
        }
        int var6 = arg3 + arg4;
        int var7 = arg0 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg0 - arg3 & 0x3;
                if (arg1 >= -15) {
                    return;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }
}
