import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class109 extends class216 {

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "[B")
    public byte[] field1956;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Lbd;")
    public static class162 field1954 = class17.method142(0, "hitmarks");

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "J")
    public static long field1957 = 0L;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Lbd;")
    public static class162 field1958 = class17.method142(0, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Lbd;")
    public static class162 field1955 = class17.method142(0, "null");

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLb;)V", line = 5)
    public static final void method882(byte arg0, class94 arg1) {
        if (arg0 < 78) {
            method884(-107);
        }
        int var2 = class102.field1862 >> 2 << 10;
        field1962++;
        int var3 = class284.field4803 >> 1;
        byte[][] var4 = new byte[class304.field5132][class9.field114];
        while (arg1.field1681.length > arg1.field1653) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method756(915905888) == 1) {
                var7 = arg1.method756(915905888);
                var5 = true;
                var6 = arg1.method756(915905888);
            }
            int var8 = arg1.method756(915905888);
            int var9 = arg1.method756(915905888);
            int var10 = class9.field114 + class87.field1536 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class290.field4893;
            if (var11 >= 0 && var10 - 63 >= 0 && class304.field5132 > (var11 + 63) && var10 < class9.field114) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var7 * 8 <= var12 && (var7 * 8 + 8) > var12 && (var6 * 8) <= var14 && var6 * 8 + 8 > var14) {
                            var13[var10 - var14] = arg1.method719((byte) -42);
                        }
                    }
                }
            } else if (var5) {
                arg1.field1653 += 64;
            } else {
                arg1.field1653 += 4096;
            }
        }
        int var15 = class9.field114;
        int[] var16 = new int[var15];
        int var17 = class304.field5132;
        int[] var18 = new int[var15];
        int[] var19 = new int[var15];
        int[] var20 = new int[var15];
        int[] var21 = new int[var15];
        for (int var22 = -5; var22 < var17; var22++) {
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var17) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class49 var26 = class4.method18(var25 - 1, true);
                        var16[var23] += var26.field785;
                        var20[var23] += var26.field783;
                        var19[var23] += var26.field791;
                        var18[var23] += var26.field781;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class49 var29 = class4.method18(var28 - 1, true);
                        var16[var23] -= var29.field785;
                        var20[var23] -= var29.field783;
                        var19[var23] -= var29.field791;
                        var18[var23] -= var29.field781;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int var31 = 0;
                int[][] var32 = class158.field2780[var22 >> 6];
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 + 5;
                    if (var15 > var37) {
                        var33 += var21[var37];
                        var35 += var18[var37];
                        var34 += var19[var37];
                        var31 += var20[var37];
                        var30 += var16[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var31 -= var20[var38];
                        var34 -= var19[var38];
                        var35 -= var18[var38];
                        var30 -= var16[var38];
                        var33 -= var21[var38];
                    }
                    if (var36 >= 0 && var33 > 0) {
                        int[] var39 = var32[var36 >> 6];
                        int var40 = var35 == 0 ? 0 : class114.method906((byte) 97, var31 / var33, var34 / var33, var30 * 256 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var32[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 + var2 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class92.method695(63, var22) + class92.method695(4032, var36 << 6)] = class312.field5264[class269.method1842(var42, 96, (byte) 41)];
                        } else if (var39 != null) {
                            var39[class92.method695(63, var22) + (class92.method695(63, var36) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lsi;IIIIIIII)V", line = 239)
    public static final void method883(class311 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1959++;
        int var9 = arg4 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg0.field5201;
            var10 = arg0.field5217;
        } else {
            var10 = arg0.field5201;
            var11 = arg0.field5217;
        }
        int var12;
        int var13;
        if ((arg1 + var10) <= 104) {
            var12 = (var10 + 1 >> 1) + arg1;
            var13 = arg1 + (var10 >> 1);
        } else {
            var12 = arg1 + 1;
            var13 = arg1;
        }
        int var14 = (arg1 << 7) + (var10 << 6);
        int var15 = (arg3 << 7) + (var11 << 6);
        int[][] var16 = class206.field3473[arg5];
        int var17;
        int var18;
        if (arg3 + var11 > arg7) {
            var17 = arg3;
            var18 = arg3 + 1;
        } else {
            var17 = (var11 >> 1) + arg3;
            var18 = (var11 + 1 >> 1) + arg3;
        }
        int var19 = var16[var13][var17] + var16[var12][var17] + var16[var12][var18] + var16[var13][var18] >> 2;
        int var20 = 0;
        if (arg5 != 0) {
            int[][] var21 = class206.field3473[0];
            var20 = var19 - (var21[var12][var17] + var21[var13][var17] + var21[var12][var18] + var21[var13][var18] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg5 < 3) {
            var22 = class206.field3473[arg5 + 1];
        }
        class128 var23 = arg0.method2100(false, var19, arg6, var22, -1, arg4, var16, var15, true, var14, (class99) null);
        class287.method1988(var23.field2317, var14 - arg2, var20, var15 - arg8);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 312)
    public static void method884(int arg0) {
        field1955 = null;
        if (arg0 > 123) {
            field1954 = null;
            field1958 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "([B)V", line = 342)
    public class109(byte[] arg0) {
        this.field1956 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIII)V", line = 363)
    public static final void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -26989) {
            return;
        }
        field1960++;
        int var9 = arg8 - arg6;
        int var10 = arg5 - arg0;
        int var11 = (arg2 - arg1 << 16) / var10;
        int var12 = (arg7 - arg4 << 16) / var9;
        class229.method1639(arg5, arg0, arg1, var11, 0, var12, arg6, arg4, 0, -1, arg8);
    }
}
