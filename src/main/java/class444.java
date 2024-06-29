import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class444 extends class154 {

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
    private int field6442;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    private int field6448;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    private int field6451;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    private int field6445;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    private int field6443;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    private int field6444;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
    private int field6446;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    private int field6449;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "[J")
    public static long[] field6450 = new long[256];

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "[I")
    public static int[] field6452;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "Ljm;")
    public static class485 field6454;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6442 = arg3;
        this.field6448 = arg6;
        this.field6451 = arg1;
        this.field6445 = arg7;
        this.field6443 = arg0;
        this.field6444 = arg4;
        this.field6446 = arg5;
        this.field6449 = arg2;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method2636(byte arg0) {
        field6454 = null;
        field6452 = null;
        field6450 = null;
        if (arg0 >= -123) {
            method2636((byte) 53);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)V")
    public final void method296(int arg0, int arg1, int arg2) {
        if (arg1 <= -29) {
            ++field6441;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
    public final void method295(int arg0, int arg1, int arg2) {
        if (arg2 != 14619) {
            method2636((byte) 91);
        }
        ++field6447;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BF)F")
    public static final float method2637(byte arg0, float arg1) {
        ++field6440;
        int var2 = 106 / ((arg0 - 3) / 49);
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F + -15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
    public final void method294(int arg0, byte arg1, int arg2) {
        ++field6453;
        int var4 = this.field6443 * arg2 >> 12;
        int var5 = this.field6451 * arg0 >> 12;
        if (arg1 != 21) {
            field6454 = null;
        }
        int var6 = this.field6449 * arg2 >> 12;
        int var7 = this.field6442 * arg0 >> 12;
        int var8 = this.field6444 * arg2 >> 12;
        int var9 = this.field6446 * arg0 >> 12;
        int var10 = this.field6448 * arg2 >> 12;
        int var11 = this.field6445 * arg0 >> 12;
        class290.method1655(arg1 + -21, var6, super.field2212, var4, var9, var10, var8, var11, var5, var7);
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var1 & 1L) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field6450[var0] = var1;
        }
        field6452 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
        field6454 = new class485(76, -1);
        field6455 = -1;
    }
}
