import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class242 implements class25 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "[I")
    public static int[] field3866 = new int[5];

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Lok;")
    public static class41 field3872 = class137.method956("m-Ochte mit Ihnen handeln)3", 45);

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lsb;")
    public static class133 field3865;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lof;ZII)V", line = 7)
    public static final void method1732(class245 arg0, boolean arg1, int arg2, int arg3) {
        field3870++;
        if (arg0.field4300 == arg3 && arg3 != -1) {
            class205 var4 = class285.method2000(arg3, 4442);
            int var5 = var4.field3314;
            if (var5 == 1) {
                arg0.field4288 = 0;
                arg0.field4338 = 0;
                arg0.field4292 = arg2;
                arg0.field4312 = 0;
                class148.method1026(arg0.field4311, arg0.field4338, arg0.field4280, var4, -105, class62.field913 == arg0);
            }
            if (var5 == 2) {
                arg0.field4312 = 0;
            }
        } else if (arg3 == -1 || arg0.field4300 == -1 || class285.method2000(arg3, 4442).field3326 >= class285.method2000(arg0.field4300, 4442).field3326) {
            arg0.field4338 = 0;
            arg0.field4292 = arg2;
            arg0.field4288 = 0;
            arg0.field4300 = arg3;
            arg0.field4312 = 0;
            arg0.field4295 = arg0.field4322;
            if (arg0.field4300 != -1) {
                class148.method1026(arg0.field4311, arg0.field4338, arg0.field4280, class285.method2000(arg0.field4300, 4442), 33, class62.field913 == arg0);
            }
        }
        if (arg1) {
            field3866 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I", line = 60)
    public static final int method1733(int arg0, int arg1) {
        if (arg1 != -17669) {
            field3865 = (class133) null;
        }
        field3869++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JBI[I)Lok;", line = 76)
    public final class41 method166(long arg0, byte arg1, int arg2, int[] arg3) {
        if (arg1 > -16) {
            return (class41) null;
        }
        field3868++;
        if (arg2 == 0) {
            class88 var6 = class236.method1696(arg3[0], 243971376);
            return var6.method629((int) arg0, 96);
        } else if (arg2 == 1 || arg2 == 10) {
            class138 var7 = class130.method918((int) arg0, -56);
            return var7.field2120;
        } else if (arg2 == 6 || arg2 == 7) {
            return class236.method1696(arg3[0], 243971376).method629((int) arg0, 98);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 116)
    public static void method1734(int arg0) {
        field3865 = null;
        field3872 = null;
        int var1 = -111 % ((arg0 + 52) / 51);
        field3866 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZZJI)Lok;", line = 139)
    public static final class41 method1735(boolean arg0, boolean arg1, long arg2, int arg3) {
        field3867++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var5 = 1;
        for (long var6 = arg2 / (long) arg3; var6 != 0L; var6 /= (long) arg3) {
            var5++;
        }
        int var8 = var5;
        if (arg2 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg2 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var11 = (int) (arg2 % (long) arg3);
            if (var11 < 0) {
                var11 = -var11;
            }
            arg2 /= (long) arg3;
            if (var11 > 9) {
                var11 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var11 + 48);
        }
        class41 var12 = new class41();
        var12.field660 = var9;
        var12.field617 = var8;
        if (!arg1) {
            method1734(40);
        }
        return var12;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V", line = 205)
    public static final void method1736(int arg0, int arg1) {
        field3873++;
        class165.field2608.method138(arg1, 0);
        if (arg0 != -3) {
            field3866 = (int[]) null;
        }
        class222.field3540.method138(arg1, 0);
    }
}
