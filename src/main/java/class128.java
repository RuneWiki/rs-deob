import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class128 extends class260 {

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "[I")
    public int[] field1893 = new int[] { -1 };

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "[I")
    public int[] field1902 = new int[1];

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field1892 = -1;

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "Lqq;")
    public static class333 field1895 = null;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1897 = new String[100];

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "Lri;")
    public static class74 field1896 = new class74(4, 14);

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "J")
    public static long field1905;

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "Lmg;")
    public static class101 field1903;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V", line = 5)
    public static final void method883(byte arg0) {
        class422.field6179.method1068(0);
        if (arg0 >= 35) {
            field1899++;
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V", line = 17)
    public static void method884(int arg0) {
        field1897 = null;
        field1903 = null;
        field1895 = null;
        int var1 = 123 % ((arg0 + 46) / 53);
        field1896 = null;
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)[Luc;", line = 30)
    public static final class23[] method885(int arg0) {
        field1900++;
        if (arg0 <= 51) {
            field1895 = null;
        }
        return new class23[] { class141.field2016, class141.field2017, class141.field2018, class141.field2019, class141.field2020, class141.field2021, class141.field2022, class141.field2023, class141.field2024, class141.field2025 };
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z[II[II)J", line = 43)
    private final long method886(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        field1894++;
        long[] var6 = class272.field3753;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)];
        long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg3[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)];
            }
        }
        if (arg2 != 897045960) {
            field1897 = null;
        }
        return var6[(int) ((var11 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILya;ZIIILgo;IZLvf;)Lt;", line = 87)
    public final class471 method887(int arg0, class38 arg1, boolean arg2, int arg3, int arg4, int arg5, class441 arg6, int arg7, boolean arg8, class104 arg9) {
        field1898++;
        class471 var11 = null;
        int var12 = arg3;
        class93 var13 = null;
        if (arg0 != -1) {
            var13 = class501.field7375.method1305(arg0, (byte) -84);
        }
        int[] var14 = this.field1893;
        if (var13 != null && var13.field1347 != null) {
            var14 = new int[var13.field1347.length];
            for (int var15 = 0; var15 < var13.field1347.length; var15++) {
                int var16 = var13.field1347[var15];
                if (var16 >= 0 && var16 < this.field1893.length) {
                    var14[var15] = this.field1893[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = arg8;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class327 var24 = null;
        class327 var25 = null;
        if (arg9 != null) {
            var12 = arg3 | 0x20;
            int var26 = arg9.field1551[arg4];
            int var27 = var26 >>> 16;
            var24 = class222.field3168.method128(var27, -10423);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 = arg8 | var24.method1899(-1, var21);
                var17 |= var24.method1900((byte) -87, var21);
                var20 |= var24.method1896(var21, (byte) 122);
                var19 |= arg9.field1548;
            }
            if ((arg9.field1563 || class299.field4102) && arg5 != -1 && arg9.field1551.length > arg5) {
                int var28 = arg9.field1551[arg5];
                var23 = arg9.field1575[arg4];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class222.field3168.method128(var22 >>> 16, -10423);
                }
                if (var25 != null) {
                    var18 |= var25.method1899(-1, var22);
                    var17 |= var25.method1900((byte) -87, var22);
                    var20 |= var25.method1896(var22, (byte) 122);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method886(arg2, arg6 == null ? null : arg6.field6511, 897045960, var14, arg0);
        if (class147.field2137 != null) {
            var11 = (class471) class147.field2137.method1073(var30, false);
        }
        if (var11 == null || arg1.method257(var11.method372(), var12) != 0) {
            if (var11 != null) {
                var12 = arg1.method288(var12, var11.method372());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class328.field4480.method3091(70, var14[var34]).method3039(arg2, 0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class419[] var35 = new class419[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class328.field4480.method3091(122, var14[var36]).method3026(arg2, -77);
                }
            }
            if (var13 != null && var13.field1356 != null) {
                for (int var37 = 0; var37 < var13.field1356.length; var37++) {
                    if (var13.field1356[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1356[var37][0];
                        int var39 = var13.field1356[var37][1];
                        int var40 = var13.field1356[var37][2];
                        int var41 = var13.field1356[var37][3];
                        int var42 = var13.field1356[var37][4];
                        int var43 = var13.field1356[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2500(var41, var43, (byte) -71, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2501(var40, 83, var39, var38);
                        }
                    }
                }
            }
            class419 var44 = new class419(var35, var35.length);
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg1.method231(var44, var32, class347.field4970, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class289.field4010[var45].length > arg6.field6511[var45]) {
                        var11.method408(class21.field288[var45], class289.field4010[var45][arg6.field6511[var45]]);
                    }
                    if (class484.field7078[var45].length > arg6.field6511[var45]) {
                        var11.method408(class282.field3865[var45], class484.field7078[var45][arg6.field6511[var45]]);
                    }
                }
            }
            if (class147.field2137 != null) {
                var11.method402(var12);
                class147.field2137.method1072(var30, var11, false);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class471 var46 = var11.method381((byte) 1, var12, true);
            var46.method2777(var24, var23, arg9.field1548, var21, var25, var22, 65535, arg7 - 1, 0);
            return var46;
        }
    }
}
