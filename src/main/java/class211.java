import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class211 extends class196 {

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "[I")
    public static int[] field3504 = new int[5];

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static volatile int field3508 = 0;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "Ldf;")
    public static class51 field3511 = class46.method233("leuchten3:", 100);

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "[I")
    public static int[] field3510;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (~arg0 == -1) {
            super.field3291 = ~arg1.method897(-75) == -2;
        }
        if (arg2 != 82) {
            method1444(-21, (class213) null, 7);
        }
        ++field3514;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(II)Z")
    public static final boolean method1441(int arg0, int arg1) {
        if (arg0 < 35) {
            method1445(94, -91, 43, 41, -80);
        }
        ++field3506;
        return (1 & arg1) != 0;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3511 = null;
        if (arg0 != -1) {
            field3511 = null;
        }
        field3510 = null;
        field3504 = null;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field3513;
        if (arg1 != 10565) {
            field3510 = null;
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        if (super.field3274.field3741) {
            int[] var4 = this.method1390(arg0, 0, -106);
            for (int var5 = 0; class49.field767 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field3512;
        if (arg0 != 11) {
            field3507 = -91;
        }
        int[][] var3 = super.field3285.method1548(arg1, (byte) -128);
        if (super.field3285.field3963) {
            int[][] var4 = this.method1387(arg0 ^ 90, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; class49.field767 > var11; ++var11) {
                var10[var11] = 4096 - var5[var11];
                var8[var11] = -var6[var11] + 4096;
                var9[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JZII)Ldf;")
    public static final class51 method1443(long arg0, boolean arg1, int arg2, int arg3) {
        ++field3509;
        if (arg2 >= 2 && ~arg2 >= -37) {
            int var5 = 1;
            if (arg3 != -4833) {
                field3504 = null;
            }
            for (long var6 = arg0 / (long) arg2; ~var6 != -1L; var6 /= (long) arg2) {
                ++var5;
            }
            int var8 = var5;
            if (~arg0 > -1L || arg1) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (~arg0 <= -1L) {
                if (arg1) {
                    var9[0] = 43;
                }
            } else {
                var9[0] = 45;
            }
            for (int var10 = 0; ~var5 < ~var10; ++var10) {
                int var12 = (int) (arg0 % (long) arg2);
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (var12 > 9) {
                    var12 += 39;
                }
                arg0 /= (long) arg2;
                var9[-var10 + -1 + var8] = (byte) (var12 + 48);
            }
            class51 var11 = new class51();
            var11.field855 = var8;
            var11.field813 = var9;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILwc;I)Ldf;")
    public static final class51 method1444(int arg0, class213 arg1, int arg2) {
        ++field3505;
        if (arg2 != -3004) {
            method1445(85, 98, 40, 18, 92);
        }
        if (!class179.method1278(client.method1061(arg1), arg0, arg2 + 3007) && arg1.field3599 == null) {
            return null;
        } else if (arg1.field3566 != null && ~arg1.field3566.length < ~arg0 && arg1.field3566[arg0] != null && arg1.field3566[arg0].method310(-1).method293(false) != 0) {
            return arg1.field3566[arg0];
        } else {
            return class79.field1263 ? class20.method104(-125, new class51[] { class248.field4364, class51.method311(arg0, 10) }) : null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII)V")
    public static final void method1445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3503;
        class136 var5 = (class136) class7.field77.method1453((long) arg3, 1);
        if (arg0 != 30587) {
            method1442(-107);
        }
        if (var5 == null) {
            var5 = new class136();
            class7.field77.method1447(86, (long) arg3, var5);
        }
        if (~arg1 <= ~var5.field2258.length) {
            int[] var6 = new int[arg1 - -1];
            int[] var7 = new int[arg1 - -1];
            for (int var8 = 0; var5.field2258.length > var8; ++var8) {
                var6[var8] = var5.field2258[var8];
                var7[var8] = var5.field2256[var8];
            }
            for (int var9 = var5.field2258.length; arg1 > var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2258 = var6;
            var5.field2256 = var7;
        }
        var5.field2258[arg1] = arg4;
        var5.field2256[arg1] = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class211() {
        super(1, false);
    }
}
