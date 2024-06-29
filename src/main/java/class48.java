import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 extends class196 {

    @OriginalMember(owner = "client!eg", name = "lb", descriptor = "[Z")
    public static boolean[] field1057 = new boolean[5];

    @OriginalMember(owner = "client!eg", name = "nb", descriptor = "D")
    public static double field1059 = -1.0D;

    @OriginalMember(owner = "client!eg", name = "pb", descriptor = "Ldd;")
    private static class35 field1061 = class180.method1196((byte) 127, "Hidden");

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "Ldd;")
    private static class35 field1052 = class180.method1196((byte) 126, "Please reload this page)3");

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "Ldd;")
    public static class35 field1050 = field1052;

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "Ldd;")
    public static class35 field1051 = field1061;

    @OriginalMember(owner = "client!eg", name = "ob", descriptor = "Ldd;")
    public static class35 field1060 = class180.method1196((byte) -80, "leuchten3:");

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!eg", name = "qb", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!eg", name = "jb", descriptor = "Lo;")
    public static class134 field1055;

    @OriginalMember(owner = "client!eg", name = "mb", descriptor = "Lag;")
    public static class8 field1058;

    @OriginalMember(owner = "client!eg", name = "kb", descriptor = "Z")
    public static boolean field1056;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field1054;
        if (arg1 <= 5) {
            field1052 = null;
        }
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978 && this.method1284(-10)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field3896 * super.field3896;
            for (int var8 = 0; ~class72.field1719 < ~var8; ++var8) {
                int var9 = super.field3900[var7 - -(var8 % super.field3894)];
                var6[var8] = class208.method1372(4080, var9 << 4);
                var5[var8] = class208.method1372(var9 >> 4, 4080);
                var4[var8] = class208.method1372(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIILlc;IJZ)Z")
    public static final boolean method430(int arg0, int arg1, int arg2, int arg3, int arg4, class110 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return method431(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIILlc;IZJ)Z")
    public static final boolean method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class110 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; ++var13) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                if (var13 < 0 || var20 < 0 || var13 >= class113.field2536 || var20 >= class102.field2272) {
                    return false;
                }
                class54 var21 = class191.field3853[arg0][var13][var20];
                if (var21 != null && var21.field1218 >= 5) {
                    return false;
                }
            }
        }
        class131 var14 = new class131();
        var14.field2822 = arg11;
        var14.field2819 = arg0;
        var14.field2824 = arg5;
        var14.field2815 = arg6;
        var14.field2821 = arg7;
        var14.field2814 = arg8;
        var14.field2820 = arg9;
        var14.field2816 = arg1;
        var14.field2812 = arg2;
        var14.field2827 = arg1 + arg3 - 1;
        var14.field2828 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var16 = arg2; var16 < arg2 + arg4; ++var16) {
                int var17 = 0;
                if (var15 > arg1) {
                    ++var17;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; --var18) {
                    if (class191.field3853[var18][var15][var16] == null) {
                        class191.field3853[var18][var15][var16] = new class54(var18, var15, var16);
                    }
                }
                class54 var19 = class191.field3853[arg0][var15][var16];
                var19.field1225[var19.field1218] = var14;
                var19.field1220[var19.field1218] = var17;
                var19.field1209 |= var17;
                ++var19.field1218;
            }
        }
        if (arg10) {
            class21.field429[class137.field2925++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(B)V")
    public static void method432(byte arg0) {
        field1058 = null;
        field1055 = null;
        field1050 = null;
        field1051 = null;
        field1060 = null;
        field1052 = null;
        if (arg0 <= 124) {
            method432((byte) 103);
        }
        field1061 = null;
        field1057 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)Lqb;")
    public static final class154 method433(byte arg0, int arg1) {
        ++field1053;
        int var2 = 104 % ((-66 - arg0) / 35);
        class154 var3 = (class154) class68.field1587.method817(true, (long) arg1);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class191.field3845.method39(5, -1, arg1);
            class154 var5 = new class154();
            if (var4 != null) {
                var5.method1039(new class26(var4), (byte) 34);
            }
            class68.field1587.method816(var5, (long) arg1, 16);
            return var5;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)Lbf;")
    public static final class17 method434(int arg0, int arg1) {
        class17 var2 = (class17) class44.field960.method817(true, (long) arg1);
        ++field1062;
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -54 / ((-60 - arg0) / 49);
            byte[] var4 = class203.field4051.method39(13, -1, arg1);
            class17 var5 = new class17();
            var5.field330 = arg1;
            if (var4 != null) {
                var5.method155(new class26(var4), 12784);
            }
            class44.field960.method816(var5, (long) arg1, 16);
            return var5;
        }
    }
}
