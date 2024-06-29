import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class74 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III[I[ILvj;)Leca;", line = 10)
    public static final class417 method401(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, class422 arg5) {
        field772++;
        byte[] var6 = new byte[arg1 * arg2];
        if (arg0 != -14183) {
            return null;
        }
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg2 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class417(arg5, arg2, arg1, var6);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z", line = 40)
    public static final boolean method402(int arg0, int arg1, int arg2) {
        field774++;
        if (arg0 > -117) {
            method402(101, 14, 65);
        }
        return (arg2 & 0x580) != 0;
    }
}
