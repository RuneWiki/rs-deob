import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class182 extends class270 {

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "Lmh;")
    private static class62 field2895 = class201.method1405(true, "Aug");

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "Lmh;")
    private static class62 field2887 = class201.method1405(true, "Feb");

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "Lmh;")
    private static class62 field2888 = class201.method1405(true, "Jan");

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "Lmh;")
    private static class62 field2892 = class201.method1405(true, "May");

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "I")
    public static int field2897 = 0;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "I")
    public static int field2898 = 0;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "[I")
    public static int[] field2900 = new int[4096];

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "Lmh;")
    private static class62 field2891 = class201.method1405(true, "Dec");

    @OriginalMember(owner = "client!nk", name = "mb", descriptor = "Lmh;")
    private static class62 field2906 = class201.method1405(true, "Jul");

    @OriginalMember(owner = "client!nk", name = "kb", descriptor = "Lmh;")
    private static class62 field2904 = class201.method1405(true, "Oct");

    @OriginalMember(owner = "client!nk", name = "jb", descriptor = "Lmh;")
    private static class62 field2903 = class201.method1405(true, "Mar");

    @OriginalMember(owner = "client!nk", name = "pb", descriptor = "I")
    public static int field2909 = -1;

    @OriginalMember(owner = "client!nk", name = "rb", descriptor = "Lmh;")
    private static class62 field2911 = class201.method1405(true, "Sep");

    @OriginalMember(owner = "client!nk", name = "sb", descriptor = "Lmh;")
    private static class62 field2912 = class201.method1405(true, "Jun");

    @OriginalMember(owner = "client!nk", name = "tb", descriptor = "Lmh;")
    private static class62 field2913 = class201.method1405(true, "Nov");

    @OriginalMember(owner = "client!nk", name = "ob", descriptor = "Lmh;")
    private static class62 field2908 = class201.method1405(true, "Apr");

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "[Lmh;")
    public static class62[] field2889 = new class62[] { field2888, field2887, field2903, field2908, field2892, field2912, field2906, field2895, field2911, field2904, field2913, field2891 };

    @OriginalMember(owner = "client!nk", name = "lb", descriptor = "Ljava/util/Random;")
    public static Random field2905 = new Random();

    @OriginalMember(owner = "client!nk", name = "vb", descriptor = "Lmh;")
    private static class62 field2915 = class201.method1405(true, "Ok");

    @OriginalMember(owner = "client!nk", name = "ub", descriptor = "Lmh;")
    public static class62 field2914 = field2915;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!nk", name = "nb", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!nk", name = "qb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method6(int arg0, int arg1) {
        field2894++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (arg0 != 18693) {
            method1281((byte) 109, 58);
        }
        if (this.field4573.field1984) {
            class231.method1632(var3, 0, class109.field1770, class166.field2702[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)Lkl;", line = 33)
    public static final class227 method1277(int arg0, int arg1) {
        field2902++;
        int var2 = -65 / ((arg1 - 37) / 38);
        class227 var3 = (class227) class146.field2315.method263(2013, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class193.field3251.method157(arg0, 11, (byte) 19);
        class227 var5 = new class227();
        if (var4 != null) {
            var5.method1606(-89, new class92(var4));
        }
        class146.field2315.method257(false, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([J[IB)V", line = 56)
    public static final void method1278(long[] arg0, int[] arg1, byte arg2) {
        if (arg2 != -63) {
            method1282(14, -75, 103, 1, false, 86, -0.16500595F, -121);
        }
        class238.method1674(arg0, -29057, arg0.length - 1, arg1, 0);
        field2901++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILhi;Lhi;)V", line = 70)
    public static final void method1279(int arg0, class26 arg1, class26 arg2) {
        class87.field1397 = arg2;
        class258.field4344 = arg1;
        class91.field1433 = class258.field4344.method159(arg0, true);
        field2893++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[III[Ljava/lang/Object;)V", line = 82)
    public static final void method1280(int arg0, int[] arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 > arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (arg1[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method1280(arg0, arg1, var6 - 1, 1, arg4);
            method1280(var6 + 1, arg1, arg2, 1, arg4);
        }
        if (arg3 != 1) {
            method1281((byte) 117, 101);
        }
        field2899++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BI)V", line = 139)
    public static final void method1281(byte arg0, int arg1) {
        class36.field496.method1390(arg1, -113);
        class62.field899.method1390(arg1, -113);
        int var2 = 104 % ((arg0 + 9) / 38);
        field2890++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIZIFI)[I", line = 151)
    public static final int[] method1282(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, float arg6, int arg7) {
        int[] var8 = new int[arg7];
        field2910++;
        class262 var9 = new class262();
        var9.field4399 = arg3;
        var9.field4413 = arg5;
        var9.field4423 = (int) (arg6 * 4096.0F);
        var9.field4416 = arg4;
        var9.field4400 = arg2;
        var9.field4410 = arg1;
        var9.method231((byte) 90);
        class122.method934(109, arg7, 1);
        var9.method1812((byte) -15, arg0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 189)
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIII)V", line = 208)
    public static final void method1283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2896++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg1 - arg5;
        int var12 = arg1 * arg1;
        int var13 = arg7 - arg5;
        int var14 = var13 * var13;
        int var15 = var12 << 1;
        int var16 = var11 * var11;
        int var17 = arg7 * arg7;
        int var18 = var17 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = arg1 << 1;
        int var22 = (1 - var21) * var17 + var15;
        int var23 = var12 - ((var21 - 1) * var18);
        int var24 = var11 << 1;
        int var25 = (1 - var24) * var14 + var19;
        int var26 = var16 - ((arg0 + var24) * var20);
        int var27 = var17 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var12 << 2;
        int var31 = (var21 - 3) * var18;
        int var32 = var19 * 3;
        int var33 = var15 * 3;
        int var34 = var30;
        int var35 = (var24 - 3) * var20;
        int var36 = (arg1 - 1) * var27;
        int var37 = var29;
        int[] var38 = class282.field4817[arg2];
        int var39 = (var11 - 1) * var28;
        class271.method1861(arg6, true, var38, arg4 - var13, -arg7 + arg4);
        class271.method1861(arg3, true, var38, arg4 + var13, arg4 - var13);
        class271.method1861(arg6, true, var38, arg4 + arg7, arg4 + var13);
        while (var9 > 0) {
            boolean var40 = var11 >= var9;
            var9--;
            if (var22 < 0) {
                while (var22 < 0) {
                    var23 += var34;
                    var8++;
                    var22 += var33;
                    var33 += var30;
                    var34 += var30;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var26 += var37;
                        var10++;
                        var37 += var29;
                        var32 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var32;
                    var32 += var29;
                    var37 += var29;
                    var10++;
                }
                var26 += -var35;
                var35 -= var28;
                var25 += -var39;
                var39 -= var28;
            }
            int var41 = arg2 - var9;
            if (var23 < 0) {
                var23 += var34;
                var22 += var33;
                var33 += var30;
                var8++;
                var34 += var30;
            }
            var22 += -var36;
            var23 += -var31;
            int var42 = arg2 + var9;
            var36 -= var27;
            int var43 = arg4 + var8;
            var31 -= var27;
            int var44 = arg4 - var8;
            if (var40) {
                int var45 = arg4 - var10;
                int var46 = arg4 + var10;
                class271.method1861(arg6, true, class282.field4817[var41], var45, var44);
                class271.method1861(arg3, true, class282.field4817[var41], var46, var45);
                class271.method1861(arg6, true, class282.field4817[var41], var43, var46);
                class271.method1861(arg6, true, class282.field4817[var42], var45, var44);
                class271.method1861(arg3, true, class282.field4817[var42], var46, var45);
                class271.method1861(arg6, true, class282.field4817[var42], var43, var46);
            } else {
                class271.method1861(arg6, true, class282.field4817[var41], var43, var44);
                class271.method1861(arg6, true, class282.field4817[var42], var43, var44);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(III)V", line = 381)
    public static final void method1284(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class164.field2669; var3++) {
            for (int var4 = 0; var4 < class114.field1900; var4++) {
                for (int var5 = 0; var5 < class252.field4273; var5++) {
                    class166 var6 = class256.field4320[var3][var4][var5];
                    if (var6 != null) {
                        class54 var7 = var6.field2706;
                        if (var7 != null && var7.field786.method578()) {
                            class209.method1461(var7.field786, var3, var4, var5, 1, 1);
                            if (var7.field788 != null && var7.field788.method578()) {
                                class209.method1461(var7.field788, var3, var4, var5, 1, 1);
                                var7.field786.method572(var7.field788, 0, 0, 0, false);
                                var7.field788 = var7.field788.method588(arg0, arg1, arg2);
                            }
                            var7.field786 = var7.field786.method588(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2724; var8++) {
                            class164 var9 = var6.field2713[var8];
                            if (var9 != null && var9.field2672.method578()) {
                                class209.method1461(var9.field2672, var3, var4, var5, var9.field2661 + 1 - var9.field2651, var9.field2657 - var9.field2670 + 1);
                                var9.field2672 = var9.field2672.method588(arg0, arg1, arg2);
                            }
                        }
                        class32 var10 = var6.field2711;
                        if (var10 != null && var10.field443.method578()) {
                            class221.method1572(var10.field443, var3, var4, var5);
                            var10.field443 = var10.field443.method588(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 451)
    public static void method1285(boolean arg0) {
        field2887 = null;
        field2911 = null;
        field2900 = null;
        field2908 = null;
        field2915 = null;
        field2913 = null;
        field2889 = null;
        field2891 = null;
        field2905 = null;
        field2888 = null;
        field2914 = null;
        field2904 = null;
        field2892 = null;
        field2895 = null;
        field2903 = null;
        field2912 = null;
        if (arg0) {
            method1284(89, -91, 54);
        }
        field2906 = null;
    }
}
