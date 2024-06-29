import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class343 extends class389 {

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    private int field4673;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    private int field4671;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    private int field4670;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    private int field4674;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Lkn;")
    public static class442 field4672 = new class442(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "[J")
    public static long[] field4679 = new long[256];

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field4678;

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                } else {
                    var1 >>>= 1;
                }
            }
            field4679[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZI)V", line = 6)
    public final void method554(int arg0, boolean arg1, int arg2) {
        ++field4676;
        if (!arg1) {
            this.method553(-35, 83, -124);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(IIIIIII)V", line = 16)
    public class343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4673 = arg1;
        this.field4671 = arg0;
        this.field4670 = arg2;
        this.field4674 = arg3;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 27)
    public static void method2175(byte arg0) {
        field4679 = null;
        if (arg0 < 7) {
            field4672 = null;
        }
        field4672 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V", line = 41)
    public final void method553(int arg0, int arg1, int arg2) {
        int var4 = -121 / ((-24 - arg0) / 35);
        ++field4675;
        int var5 = this.field4671 * arg2 >> 12;
        int var6 = this.field4670 * arg2 >> 12;
        int var7 = this.field4673 * arg1 >> 12;
        int var8 = this.field4674 * arg1 >> 12;
        class341.method2165(var7, var5, (byte) 71, var6, super.field5589, var8);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V", line = 60)
    public final void method552(int arg0, int arg1, int arg2) {
        ++field4678;
        int var4 = this.field4671 * arg1 >> 12;
        int var5 = this.field4670 * arg1 >> 12;
        if (arg0 != 32546) {
            field4679 = null;
        }
        int var6 = this.field4673 * arg2 >> 12;
        int var7 = this.field4674 * arg2 >> 12;
        class51.method426(var6, super.field5582, var5, var4, super.field5592, super.field5589, 109, var7);
    }
}
