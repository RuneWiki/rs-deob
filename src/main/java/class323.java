import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class323 extends class231 {

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field5030 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lik;")
    public static class327 field5026;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIZ)V", line = 5)
    public static final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        field5028++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (class333.field5166) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class203.field3063 - class334.field5200) * var6 / 100 + class334.field5200;
            if (var7 < class274.field4224) {
                var7 = class274.field4224;
            } else if (var7 > class162.field2511) {
                var7 = class162.field2511;
            }
            int var8 = arg4 * var7 * 512 / (arg3 * 334);
            if (var8 < class205.field3109) {
                short var12 = class205.field3109;
                var7 = arg3 * var12 * 334 / (arg4 * 512);
                if (class162.field2511 < var7) {
                    var7 = class162.field2511;
                    int var13 = arg4 * var7 * 512 / (var12 * 334);
                    int var14 = (arg3 - var13) / 2;
                    if (arg5) {
                        class238.method1629();
                        class238.method1636(arg0, arg2, var14, arg4, 0);
                        class238.method1636(arg0 + arg3 - var14, arg2, var14, arg4, 0);
                    }
                    arg3 -= var14 * 2;
                    arg0 += var14;
                }
            } else if (var8 > class265.field4094) {
                short var9 = class265.field4094;
                var7 = arg3 * 334 * var9 / (arg4 * 512);
                if (var7 < class274.field4224) {
                    var7 = class274.field4224;
                    int var10 = var9 * 334 * arg3 / (var7 * 512);
                    int var11 = (arg4 - var10) / 2;
                    if (arg5) {
                        class238.method1629();
                        class238.method1636(arg0, arg2, arg3, var11, 0);
                        class238.method1636(arg0, arg2 + arg4 - var11, arg3, var11, 0);
                    }
                    arg4 -= var11 * 2;
                    arg2 += var11;
                }
            }
            class188.field2855 = arg4 * var7 / 334;
        }
        class44.field630 = arg2;
        if (arg1 == -645014238) {
            class179.field2743 = (short) arg4;
            class123.field1921 = arg0;
            class218.field3476 = (short) arg3;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 104)
    public static void method2183(byte arg0) {
        field5026 = null;
        if (arg0 != 92) {
            field5032 = 34;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 115)
    public static final void method2184(int arg0) {
        class172.field2619.method1296(255);
        field5035++;
        if (arg0 != 0) {
            field5030 = 81;
        }
        class47.field662.method1296(255);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z[Lwb;II[BI)V", line = 128)
    public static final void method2185(boolean arg0, class294[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field5029++;
        class303 var6 = new class303(arg4);
        int var7 = -1;
        if (arg5 != -645014238) {
            field5026 = (class327) null;
        }
        while (true) {
            int var8 = var6.method2025(arg5 + 1418965198);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method2003(8);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var6.method2043((byte) -111);
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = var9 >> 12;
                int var17 = arg2 + var11;
                int var18 = var12 + arg3;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class294 var19 = null;
                    if (!arg0) {
                        int var20 = var16;
                        if ((class305.field4784[1][var18][var17] & 0x2) == 2) {
                            var20 = var16 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class231.method1585(var15, -113, arg0, var18, !arg0, var17, var16, var14, var7, var16, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 199)
    public static final void method2186(int arg0) {
        class329.field5093 = true;
        field5034++;
        if (arg0 > -92) {
            method2182(116, 46, -68, -102, -117, false);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIB)V", line = 216)
    public static final void method2187(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class129.field2023 = class204.field3088 * arg2 / arg0;
        class121.field1869 = -1;
        class342.field5334 = class129.field2021 * arg3 / arg1;
        if (arg4 < -2) {
            class324.field5050 = -1;
            class242.method1649(1);
            field5031++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIZFZI)[[I", line = 237)
    public static final int[][] method2188(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6, boolean arg7, int arg8) {
        field5033++;
        int[][] var9 = new int[arg8][arg1];
        class190 var10 = new class190();
        var10.field2900 = arg0;
        var10.field2885 = arg3;
        var10.field2882 = (int) (arg6 * 4096.0F);
        var10.field2897 = arg2;
        var10.field2880 = arg5;
        if (arg7) {
            method2184(97);
        }
        var10.method349(1);
        class269.method1782(0, arg1, arg8);
        for (int var11 = 0; var11 < arg8; var11++) {
            var10.method1305(var9[var11], var11, 1);
        }
        return var9;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V", line = 278)
    public static final void method2189(int arg0, int arg1) {
        field5027++;
        if (arg0 == -1 || !class228.field3658[arg0]) {
            return;
        }
        class116.field1793.method2094(arg0, (byte) -117);
        if (class219.field3487[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = arg1; var3 < class219.field3487[arg0].length; var3++) {
            if (class219.field3487[arg0][var3] != null) {
                if (class219.field3487[arg0][var3].field3273 == 2) {
                    var2 = false;
                } else {
                    class219.field3487[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class219.field3487[arg0] = null;
        }
        class228.field3658[arg0] = false;
    }
}
