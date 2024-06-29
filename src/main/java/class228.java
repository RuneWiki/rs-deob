import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class228 extends class255 {

    @OriginalMember(owner = "client!s", name = "R", descriptor = "Lha;")
    public static class30 field3929 = new class30(64);

    @OriginalMember(owner = "client!s", name = "V", descriptor = "Leb;")
    public static class230 field3933 = class68.method589(0, "<col=ff3000>");

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "Leb;")
    public class230 field3927;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[I")
    public int[] field3926;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "[I")
    public int[] field3930;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "[Leb;")
    public class230[] field3925;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "[Laj;")
    public class46[] field3928;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "[[[Lqf;")
    public static class233[][][] field3938;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIBIZ)V")
    public static final void method1571(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        field3924++;
        if (class273.field4809 == arg1 && class231.field4014 == arg5 && class171.field3036 == arg0 || class179.method1302(75)) {
            return;
        }
        class231.field4014 = arg5;
        class171.field3036 = arg0;
        class273.field4809 = arg1;
        if (class179.method1302(-98)) {
            class171.field3036 = 0;
        }
        if (arg6) {
            class26.method260(-11, 28);
        } else {
            class26.method260(-11, 25);
        }
        class18.method221(true, (byte) 26, class6.field86);
        int var7 = class155.field2759;
        class155.field2759 = arg5 * 8 - 48;
        int var8 = class272.field4795;
        class272.field4795 = arg1 * 8 - 48;
        class162.field2890 = client.method1165(class231.field4014 * 8, class273.field4809 * 8, false);
        class236.field4087 = null;
        if (arg4 != -23) {
            return;
        }
        int var9 = class272.field4795 - var8;
        int var10 = class155.field2759 - var7;
        int var11 = class272.field4795;
        int var12 = class155.field2759;
        if (arg6) {
            class18.field393 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class109 var14 = class168.field2963[var13];
                if (var14 != null) {
                    var14.field2274 -= var9 * 128;
                    var14.field2300 -= var10 * 128;
                    if (var14.field2274 >= 0 && var14.field2274 <= 13184 && var14.field2300 >= 0 && var14.field2300 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field2296[var15] -= var9;
                            var14.field2253[var15] -= var10;
                        }
                        class167.field2956[class18.field393++] = var13;
                    } else {
                        class168.field2963[var13].field1956 = null;
                        class168.field2963[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class109 var32 = class168.field2963[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field2296[var33] -= var9;
                        var32.field2253[var33] -= var10;
                    }
                    var32.field2274 -= var9 * 128;
                    var32.field2300 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class260 var30 = class230.field4011[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field2296[var31] -= var9;
                    var30.field2253[var31] -= var10;
                }
                var30.field2300 -= var10 * 128;
                var30.field2274 -= var9 * 128;
            }
        }
        class124.field2174 = arg0;
        byte var18 = 0;
        byte var19 = 0;
        byte var20 = 1;
        byte var21 = 104;
        class56.field1033.method1810(arg2, arg3, false, arg4 ^ 0xFFFFFF19);
        if (var9 < 0) {
            var20 = -1;
            var18 = 103;
            var21 = -1;
        }
        byte var22 = 104;
        byte var23 = 1;
        if (var10 < 0) {
            var22 = -1;
            var23 = -1;
            var19 = 103;
        }
        for (int var24 = var18; var24 != var21; var24 += var20) {
            for (int var26 = var19; var26 != var22; var26 += var23) {
                int var27 = var9 + var24;
                int var28 = var26 + var10;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class237.field4090[var29][var24][var26] = class237.field4090[var29][var27][var28];
                    } else {
                        class237.field4090[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class191 var25 = (class191) class222.field3806.method839(128); var25 != null; var25 = (class191) class222.field3806.method834((byte) 82)) {
            var25.field3381 -= var9;
            var25.field3377 -= var10;
            if (var25.field3381 < 0 || var25.field3377 < 0 || var25.field3381 >= 104 || var25.field3377 >= 104) {
                var25.method518(107);
            }
        }
        if (class227.field3918 != 0) {
            class227.field3918 -= var9;
            class16.field372 -= var10;
        }
        if (arg6) {
            class210.field3676 -= var10;
            class89.field1566 -= var9;
            class14.field283 -= var9;
            class164.field2924 -= var10;
        } else {
            class229.field3948 = 1;
        }
        class17.field386 = 0;
        class15.field353 = -1;
        class123.field2144.method837(-26215);
        class37.field690.method837(-26215);
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
    public static final void method1572(int arg0) {
        if (arg0 >= -107) {
            return;
        }
        class135.field2433.method1122(10);
        class70.field1285.method1122(10);
        class245.field4259.method1122(10);
        field3935++;
        class60.field1132.method1122(10);
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public static void method1573(int arg0) {
        field3933 = null;
        field3938 = null;
        if (arg0 != -32685) {
            method1571(54, -76, -56, 53, (byte) -91, 25, true);
        }
        field3929 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3934++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg2 - arg7;
        int var12 = arg4 - arg7;
        int var13 = arg2 * arg2;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        if (arg0 != 2143942273) {
            return;
        }
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = (1 - var21) * var13 + var17;
        int var23 = var12 << 1;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var23) * var15 + var19;
        int var26 = var16 - ((var23 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = (var21 - 3) * var18;
        int var32 = var17 * 3;
        int var33 = (var23 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class66.field1254[arg6];
        class182.method1311(arg1, arg3 - var11, true, var39, arg3 - arg2);
        class182.method1311(arg5, arg3 + var11, true, var39, arg3 - var11);
        class182.method1311(arg1, arg2 + arg3, true, var39, arg3 + var11);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var24 += var35;
                    var8++;
                    var22 += var32;
                    var35 += var28;
                    var32 += var28;
                }
            }
            boolean var40 = var9 <= var12;
            if (var24 < 0) {
                var24 += var35;
                var22 += var32;
                var35 += var28;
                var32 += var28;
                var8++;
            }
            var24 += -var31;
            var31 -= var27;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var34;
                        var10++;
                        var34 += var30;
                        var26 += var37;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var34;
                    var34 += var30;
                    var26 += var37;
                    var10++;
                    var37 += var30;
                }
                var26 += -var33;
                var33 -= var29;
                var25 += -var38;
                var38 -= var29;
            }
            int var41 = arg3 + var8;
            var9--;
            int var42 = arg6 + var9;
            var22 += -var36;
            int var43 = arg6 - var9;
            int var44 = arg3 - var8;
            var36 -= var27;
            if (var40) {
                int var45 = arg3 + var10;
                int var46 = arg3 - var10;
                class182.method1311(arg1, var46, true, class66.field1254[var43], var44);
                class182.method1311(arg5, var45, true, class66.field1254[var43], var46);
                class182.method1311(arg1, var41, true, class66.field1254[var43], var45);
                class182.method1311(arg1, var46, true, class66.field1254[var42], var44);
                class182.method1311(arg5, var45, true, class66.field1254[var42], var46);
                class182.method1311(arg1, var41, true, class66.field1254[var42], var45);
            } else {
                class182.method1311(arg1, var41, true, class66.field1254[var43], var44);
                class182.method1311(arg1, var41, true, class66.field1254[var42], var44);
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lpe;I)V")
    public static final void method1575(class234 arg0, int arg1) {
        class260.field4631 = arg0;
        if (arg1 >= -63) {
            method1571(37, -109, -89, -23, (byte) -60, 87, true);
        }
        field3923++;
    }
}
