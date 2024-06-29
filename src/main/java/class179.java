import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class179 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[I")
    public static int[] field2926 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field2927 = 0;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lmo;")
    public static class447 field2931;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Ljava/lang/String;")
    public String field2930;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[[[Lwe;")
    public static class232[][][] field2923;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1226(int arg0) {
        field2923 = null;
        field2931 = null;
        if (arg0 != 0) {
            field2923 = null;
        }
        field2926 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method1227(int arg0, int arg1) {
        field2929++;
        if (arg0 != -4776) {
            field2926 = null;
        }
        class52 var2 = class270.field4326;
        synchronized (class270.field4326) {
            class270.field4326.method337(arg1, (byte) -128);
        }
        class52 var3 = class130.field2044;
        synchronized (class130.field2044) {
            class130.field2044.method337(arg1, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1228(int arg0, int arg1) {
        field2925++;
        if (arg1 != -19703) {
            method1228(48, -106);
        }
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class208.field3329 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class38.field491 + "</col>";
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1229(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field2922++;
        class57.method374(29334, arg4);
        int var7 = 0;
        int var8 = arg4 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        if (!arg2) {
            return;
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class277.field4414[arg0];
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class256.method1769(var16, var15, (byte) 63, arg1, arg3 - arg4);
        class256.method1769(var17, var15, (byte) 75, arg6, var16);
        class256.method1769(arg3 + arg4, var15, (byte) 58, arg1, var17);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class172.field2714[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class277.field4414[arg0 + var9];
                    int[] var19 = class277.field4414[arg0 - var9];
                    int var20 = class172.field2714[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class256.method1769(var24, var18, (byte) 118, arg1, var22);
                    class256.method1769(var23, var18, (byte) 97, arg6, var24);
                    class256.method1769(var21, var18, (byte) 51, arg1, var23);
                    class256.method1769(var24, var19, (byte) 110, arg1, var22);
                    class256.method1769(var23, var19, (byte) 72, arg6, var24);
                    class256.method1769(var21, var19, (byte) 107, arg1, var23);
                } else {
                    int[] var25 = class277.field4414[arg0 + var9];
                    int[] var26 = class277.field4414[arg0 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class256.method1769(var27, var25, (byte) 49, arg1, var28);
                    class256.method1769(var27, var26, (byte) 82, arg1, var28);
                }
            }
            int[] var29 = class277.field4414[arg0 + var7];
            int[] var30 = class277.field4414[arg0 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 >= var8) {
                class256.method1769(var31, var29, (byte) 75, arg1, var32);
                class256.method1769(var31, var30, (byte) 76, arg1, var32);
            } else {
                int var33 = var7 <= var11 ? var11 : class172.field2714[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class256.method1769(var35, var29, (byte) 52, arg1, var32);
                class256.method1769(var34, var29, (byte) 50, arg6, var35);
                class256.method1769(var31, var29, (byte) 45, arg1, var34);
                class256.method1769(var35, var30, (byte) 94, arg1, var32);
                class256.method1769(var34, var30, (byte) 64, arg6, var35);
                class256.method1769(var31, var30, (byte) 99, arg1, var34);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
    public static final void method1230(int arg0, int arg1) {
        field2928++;
        class211 var2 = class281.method1921(arg1, arg0, (byte) -109);
        var2.method1489((byte) -100);
    }
}
