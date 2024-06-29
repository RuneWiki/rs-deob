import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class197 extends class105 {

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    private final int field3426;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    private final int field3427;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    private final int field3423;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    private final int field3432;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[J")
    public static long[] field3425 = new long[256];

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "Lpj;")
    public static class237 field3431;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "Lpj;")
    public static class237 field3433;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
    public final void method501(int arg0, int arg1, int arg2) {
        ++field3429;
        int var4 = this.field3432 * arg0 >> 12;
        if (arg1 <= 110) {
            field3425 = null;
        }
        int var5 = this.field3423 * arg0 >> 12;
        int var6 = this.field3427 * arg2 >> 12;
        int var7 = this.field3426 * arg2 >> 12;
        class110.method820(var7, var5, var6, 101, super.field1852, var4);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        ++field3422;
        if (arg1 > -72) {
            field3433 = null;
        }
        int var4 = this.field3426 * arg0 >> 12;
        int var5 = this.field3423 * arg2 >> 12;
        int var6 = this.field3427 * arg0 >> 12;
        int var7 = this.field3432 * arg2 >> 12;
        class43.method414((byte) -113, super.field1856, var7, var5, super.field1851, var4, var6);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V")
    public final void method497(int arg0, byte arg1, int arg2) {
        ++field3430;
        int var4 = this.field3432 * arg0 >> 12;
        int var5 = this.field3423 * arg0 >> 12;
        int var6 = this.field3426 * arg2 >> 12;
        if (arg1 != 51) {
            field3425 = null;
        }
        int var7 = this.field3427 * arg2 >> 12;
        class242.method1678(super.field1856, super.field1852, -108, var4, super.field1851, var5, var7, var6);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
    public static void method1352(byte arg0) {
        field3433 = null;
        if (arg0 != 84) {
            field3431 = null;
        }
        field3425 = null;
        field3431 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIII)V")
    private class197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3426 = arg1;
        this.field3427 = arg3;
        this.field3423 = arg2;
        this.field3432 = arg0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lie;I)Lih;")
    public static final class197 method1353(class32 arg0, int arg1) {
        ++field3421;
        return arg1 != -29556 ? null : new class197(arg0.method309(-489706920), arg0.method309(-489706920), arg0.method309(arg1 ^ 489694932), arg0.method309(-489706920), arg0.method313((byte) -80), arg0.method313((byte) -80), arg0.method316((byte) 116));
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(SB)Z")
    public static final boolean method1354(short arg0, byte arg1) {
        ++field3428;
        if (~arg0 != -49 && arg0 != 20 && ~arg0 != -25 && arg0 != 2 && ~arg0 != -17 && arg0 != 25 && arg0 != 17 && ~arg0 != -58) {
            if (~arg0 != -47 && arg0 != 37 && arg0 != 1001 && ~arg0 != -1005) {
                if (arg0 != 39 && ~arg0 != -2 && arg0 != 12 && ~arg0 != -52 && ~arg0 != -9) {
                    if (arg0 != 35 && ~arg0 != -45 && arg0 != 3 && arg0 != 40 && ~arg0 != -39 && ~arg0 != -20) {
                        if (arg1 > -31) {
                            method1353((class32) null, -96);
                        }
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if ((1L & var1) != 1L) {
                    var1 >>>= 1;
                } else {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                }
            }
            field3425[var0] = var1;
        }
        field3431 = class33.method353(" )2> <col=ff9040>", 24);
        field3433 = class33.method353("hitmarks", 43);
    }
}
