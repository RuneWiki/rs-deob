import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class328 extends class320 {

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "[I")
    public int[] field4957 = new int[] { -1 };

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "[I")
    public int[] field4960 = new int[1];

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "J")
    public static long field4953 = 0L;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Liv;")
    public static class64 field4951 = new class64(11, -1);

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "Loa;")
    public static class489 field4954;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4958;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I", line = 11)
    public static final int method2104(byte arg0) {
        if (arg0 != -22) {
            field4954 = null;
        }
        field4952++;
        if (class475.field7100 == null) {
            if (!class197.field2903 && class363.field5500 > 0) {
                if (class420.field6277 && class380.field5726.method1584(14, 81) && class363.field5500 > 2) {
                    return ((class208) class339.field5122.field5929.field4906.field4906).field3013;
                }
                return ((class208) class339.field5122.field5929.field4906).field3013;
            }
            int var1 = class166.field2579.method1024(true);
            int var2 = class166.field2579.method1019((byte) 3);
            int var3 = class106.field1766;
            int var4 = class215.field3104;
            int var5 = class499.field7375;
            if (var1 > var3 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class363.field5500; var7++) {
                    if (class295.field4199) {
                        int var11 = (class363.field5500 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > (var11 - 13) && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class363.field5500 - var7 - 1) * 16 + var4 + 31;
                        if (var12 - 13 < var2 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class510 var9 = new class510(class339.field5122);
                    for (class208 var10 = (class208) var9.method3056(false); var10 != null; var10 = (class208) var9.method3055(123)) {
                        if (var8++ == var6) {
                            return var10.field3013;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZILqo;Lkf;ILqa;II)Lc;", line = 105)
    public final class121 method2105(int arg0, int arg1, boolean arg2, int arg3, class19 arg4, class165 arg5, int arg6, class162 arg7, int arg8, int arg9) {
        field4955++;
        class121 var11 = null;
        int var12 = arg0;
        class435 var13 = null;
        if (arg8 != -1) {
            var13 = class203.field2969.method1239(32, arg8);
        }
        int[] var14 = this.field4957;
        if (var13 != null && var13.field6458 != null) {
            var14 = new int[var13.field6458.length];
            for (int var15 = 0; var15 < var13.field6458.length; var15++) {
                int var16 = var13.field6458[var15];
                if (var16 >= 0 && var16 < this.field4957.length) {
                    var14[var15] = this.field4957[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        int var18 = -61 / ((34 - arg9) / 52);
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = false;
        int var22 = -1;
        int var23 = -1;
        int var24 = 0;
        class291 var25 = null;
        class291 var26 = null;
        if (arg5 != null) {
            var12 = arg0 | 0x20;
            int var27 = arg5.field2539[arg3];
            int var28 = var27 >>> 16;
            var22 = var27 & 0xFFFF;
            var25 = class431.field6419.method1129(var28, (byte) 66);
            if (var25 != null) {
                var19 |= var25.method1839(-98, var22);
                var17 |= var25.method1841(var22, 0);
                var21 |= var25.method1837(var22, (byte) 84);
                var20 |= arg5.field2550;
            }
            if ((arg5.field2546 || class21.field428) && arg1 != -1 && arg1 < arg5.field2539.length) {
                int var29 = arg5.field2539[arg1];
                var24 = arg5.field2564[arg3];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class431.field6419.method1129(var23 >>> 16, (byte) 61);
                }
                if (var26 != null) {
                    var19 |= var26.method1839(-99, var23);
                    var17 |= var26.method1841(var23, 0);
                    var21 |= var26.method1837(var23, (byte) 84);
                }
            }
            if (var19) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var20) {
                var12 |= 0x200;
            }
            if (var21) {
                var12 |= 0x400;
            }
        }
        long var31 = this.method2107(var14, arg2, 0, arg4 == null ? null : arg4.field328, arg8);
        if (class271.field3908 != null) {
            var11 = (class121) class271.field3908.method494(0, var31);
        }
        if (var11 == null || arg7.method255(var11.method889(), var12) != 0) {
            if (var11 != null) {
                var12 = arg7.method280(var12, var11.method889());
            }
            int var33 = var12;
            boolean var34 = false;
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1 && !class367.field5550.method1312((byte) 91, var14[var35]).method999((byte) 55, arg2)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class380[] var36 = new class380[var14.length];
            for (int var37 = 0; var37 < var14.length; var37++) {
                if (var14[var37] != -1) {
                    var36[var37] = class367.field5550.method1312((byte) 91, var14[var37]).method992(true, arg2);
                }
            }
            if (var13 != null && var13.field6486 != null) {
                for (int var38 = 0; var38 < var13.field6486.length; var38++) {
                    if (var13.field6486[var38] != null && var36[var38] != null) {
                        int var39 = var13.field6486[var38][0];
                        int var40 = var13.field6486[var38][1];
                        int var41 = var13.field6486[var38][2];
                        int var42 = var13.field6486[var38][3];
                        int var43 = var13.field6486[var38][4];
                        int var44 = var13.field6486[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method2357(var42, var43, 319311823, var44);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method2366(var39, var41, var40, 7807);
                        }
                    }
                }
            }
            if (arg4 != null) {
                var33 = var12 | 0x4000;
            }
            class380 var45 = new class380(var36, var36.length);
            var11 = arg7.method265(var45, var33, class355.field5423, 64, 850);
            if (arg4 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    if (class83.field1436[var46].length > arg4.field328[var46]) {
                        var11.method890(class124.field2008[var46], class83.field1436[var46][arg4.field328[var46]]);
                    }
                    if (class246.field3537[var46].length > arg4.field328[var46]) {
                        var11.method890(class45.field834[var46], class246.field3537[var46][arg4.field328[var46]]);
                    }
                }
            }
            if (class271.field3908 != null) {
                var11.method906(var12);
                class271.field3908.method485(var31, (byte) -125, var11);
            }
        }
        if (arg5 == null || var25 == null) {
            return var11;
        } else {
            class121 var47 = var11.method938((byte) 1, var12, true);
            var47.method916(var25, arg5.field2550, var26, var24, var22, arg6 - 1, 0, -78, var23);
            return var47;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z", line = 352)
    public static final boolean method2106(int arg0, int arg1, int arg2) {
        int var3 = -34 / ((arg0 - 94) / 32);
        field4956++;
        return (arg2 & 0x40000) != 0 | class20.method170(arg1, arg2, -3910) || class281.method1797(arg2, arg1, -4542);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([IZI[II)J", line = 362)
    private final long method2107(int[] arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        field4959++;
        long[] var6 = class108.field1791;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg4) & 0xFFL)];
        for (int var13 = arg2; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg0[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg0[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)];
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg3[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((var11 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 402)
    public static void method2108(int arg0) {
        if (arg0 != 30574) {
            method2108(88);
        }
        field4958 = null;
        field4954 = null;
        field4951 = null;
    }
}
