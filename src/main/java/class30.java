import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class30 extends class243 {

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    private int field484 = 1;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
    private int field485 = 1;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "I")
    private int field486 = 204;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "Luh;")
    public static class198 field482 = new class198();

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field488 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "Lbd;")
    public static class124 field490 = new class124(0, 0);

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "[Z")
    public static boolean[] field489;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field486 = arg0.method1447(0);
                }
            } else {
                this.field484 = arg0.method1471(255);
            }
        } else {
            this.field485 = arg0.method1471(255);
        }
        ++field483;
        if (arg1) {
            field490 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILub;)V")
    public static final void method154(int arg0, class227 arg1) {
        ++field480;
        if (class79.field1382 != null) {
            int var2 = 0;
            long var3 = arg1.method1485(122);
            if (var3 != 0L) {
                while (~var2 > ~class79.field1382.length && class79.field1382[var2].field1113 != var3) {
                    ++var2;
                }
                if (~class79.field1382.length < ~var2 && class79.field1382[var2] != null) {
                    ++class237.field4115;
                    class176.field2935.method664((byte) -121, arg0);
                    class176.field2935.method1457(class79.field1382[var2].field1113, arg0 + -122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = -18 % ((arg0 - -15) / 51);
        ++field481;
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            for (int var5 = 0; var5 < class212.field3586; ++var5) {
                int var6 = class148.field2582[arg1];
                int var7 = class212.field3585[var5];
                int var8 = this.field484 * var6 >> 12;
                int var9 = this.field485 * var7 >> 12;
                int var10 = var7 % (4096 / this.field485) * this.field485;
                int var11 = var6 % (4096 / this.field484) * this.field484;
                if (var11 < this.field486) {
                    for (var9 -= var8; var9 < 0; var9 += 4) {
                    }
                    while (var9 > 3) {
                        var9 -= 4;
                    }
                    if (var9 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field486) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (this.field486 > var10) {
                    int var12;
                    for (var12 = var9 - var8; var12 < 0; var12 += 4) {
                    }
                    while (~var12 < -4) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIIIIII)V")
    public static final void method155(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field487;
        if (arg0 <= 103) {
            field489 = null;
        }
        class190[] var7 = class229.field3994;
        for (int var8 = 0; ~var8 > ~var7.length; ++var8) {
            class190 var9 = var7[var8];
            if (var9 != null && var9.field3226 == 2) {
                class88.method527((-class192.field3267 + var9.field3225 << 7) - -var9.field3211, (-class78.field1367 + var9.field3219 << 7) + var9.field3212, arg5 >> 1, arg6, arg3 >> 1, 0, var9.field3216 * 2, arg4);
                if (class38.field642 > -1 && ~(class253.field4393 % 20) > -11) {
                    class228.field3978[var9.field3220].method787(arg2 + -12 + class38.field642, class71.field1249 + arg1 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
    public static void method156(int arg0) {
        field488 = null;
        field482 = null;
        field490 = null;
        if (arg0 <= 104) {
            field488 = null;
        }
        field489 = null;
    }
}
