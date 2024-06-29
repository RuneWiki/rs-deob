import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class247 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static volatile int field3879 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3883 = " is already on your friend list.";

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "[I")
    public static int[] field3885 = new int[1000];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lbf;")
    public static class102 field3887;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lkj;")
    public static class114 field3886;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lwf;")
    public static class17 field3888;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1638(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3884++;
        class31.method265(arg2, -28516);
        int var7 = 118 % ((-arg1 - 1) / 32);
        int var8 = 0;
        int var9 = arg2 - arg0;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg2;
        int var11 = arg2;
        int var12 = -1;
        int var13 = var9;
        int var14 = -var9;
        int var15 = -1;
        if (arg4 >= class108.field1650 && class154.field2509 >= arg4) {
            int[] var16 = class114.field1841[arg4];
            int var17 = class32.method278(class32.field540, 1, class61.field1034, arg5 - arg2);
            int var18 = class32.method278(class32.field540, 1, class61.field1034, arg2 + arg5);
            int var19 = class32.method278(class32.field540, 1, class61.field1034, arg5 - var9);
            int var20 = class32.method278(class32.field540, 1, class61.field1034, arg5 + var9);
            class224.method1504(arg6, var19, var17, var16, 7);
            class224.method1504(arg3, var20, var19, var16, 7);
            class224.method1504(arg6, var18, var20, var16, 7);
        }
        while (var11 > var8) {
            var15 += 2;
            var14 += var15;
            if (var14 >= 0 && var13 >= 1) {
                var13--;
                class4.field57[var13] = var8;
                var14 -= var13 << 1;
            }
            var8++;
            var12 += 2;
            var10 += var12;
            if (var10 >= 0) {
                var11--;
                var10 -= var11 << 1;
                int var21 = arg4 - var11;
                int var22 = arg4 + var11;
                if (class108.field1650 <= var22 && var21 <= class154.field2509) {
                    if (var11 >= var9) {
                        int var23 = class32.method278(class32.field540, 1, class61.field1034, arg5 + var8);
                        int var24 = class32.method278(class32.field540, 1, class61.field1034, arg5 - var8);
                        if (class154.field2509 >= var22) {
                            class224.method1504(arg6, var23, var24, class114.field1841[var22], 7);
                        }
                        if (var21 >= class108.field1650) {
                            class224.method1504(arg6, var23, var24, class114.field1841[var21], 7);
                        }
                    } else {
                        int var25 = class4.field57[var11];
                        int var26 = class32.method278(class32.field540, 1, class61.field1034, arg5 + var8);
                        int var27 = class32.method278(class32.field540, 1, class61.field1034, arg5 - var8);
                        int var28 = class32.method278(class32.field540, 1, class61.field1034, arg5 + var25);
                        int var29 = class32.method278(class32.field540, 1, class61.field1034, arg5 - var25);
                        if (class154.field2509 >= var22) {
                            int[] var30 = class114.field1841[var22];
                            class224.method1504(arg6, var29, var27, var30, 7);
                            class224.method1504(arg3, var28, var29, var30, 7);
                            class224.method1504(arg6, var26, var28, var30, 7);
                        }
                        if (class108.field1650 <= var21) {
                            int[] var31 = class114.field1841[var21];
                            class224.method1504(arg6, var29, var27, var31, 7);
                            class224.method1504(arg3, var28, var29, var31, 7);
                            class224.method1504(arg6, var26, var28, var31, 7);
                        }
                    }
                }
            }
            int var32 = arg4 - var8;
            int var33 = arg4 + var8;
            if (var33 >= class108.field1650 && var32 <= class154.field2509) {
                int var34 = arg5 + var11;
                int var35 = arg5 - var11;
                if (class32.field540 <= var34 && var35 <= class61.field1034) {
                    int var36 = class32.method278(class32.field540, 1, class61.field1034, var34);
                    int var37 = class32.method278(class32.field540, 1, class61.field1034, var35);
                    if (var8 >= var9) {
                        if (var33 <= class154.field2509) {
                            class224.method1504(arg6, var36, var37, class114.field1841[var33], 7);
                        }
                        if (var32 >= class108.field1650) {
                            class224.method1504(arg6, var36, var37, class114.field1841[var32], 7);
                        }
                    } else {
                        int var38 = var13 >= var8 ? var13 : class4.field57[var8];
                        int var39 = class32.method278(class32.field540, 1, class61.field1034, arg5 + var38);
                        int var40 = class32.method278(class32.field540, 1, class61.field1034, arg5 - var38);
                        if (var33 <= class154.field2509) {
                            int[] var41 = class114.field1841[var33];
                            class224.method1504(arg6, var40, var37, var41, 7);
                            class224.method1504(arg3, var39, var40, var41, 7);
                            class224.method1504(arg6, var36, var39, var41, 7);
                        }
                        if (var32 >= class108.field1650) {
                            int[] var42 = class114.field1841[var32];
                            class224.method1504(arg6, var40, var37, var42, 7);
                            class224.method1504(arg3, var39, var40, var42, 7);
                            class224.method1504(arg6, var36, var39, var42, 7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static final void method1639(boolean arg0) {
        class265.field4232 = null;
        field3880++;
        class288.method1941(0, 0, class137.field2301, -1, (byte) 121, 0, class33.field557, 0, class223.field3558);
        if (arg0) {
            field3885 = null;
        }
        if (class265.field4232 != null) {
            class185.method1287(class137.field2301, class189.field3092.field1874, class33.field557, class265.field4232, class144.field2378, 1, class11.field157, -1412584499, 0, 0);
            class265.field4232 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public static final void method1640(int arg0, int arg1) {
        class23.field350.method1163(arg0, false);
        if (arg1 == 1926) {
            field3881++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLla;)V")
    public static final void method1641(byte arg0, class171 arg1) {
        int var2 = arg1.field2836 - class207.field3336;
        int var3 = arg1.field2857 * 128 + arg1.method1226((byte) -117) * 64;
        int var4 = arg1.field2865 * 128 + (arg1.method1226((byte) -110) * 64);
        if (arg1.field2822 == 0) {
            arg1.field2893 = 1024;
        }
        field3878++;
        if (arg1.field2822 == 1) {
            arg1.field2893 = 1536;
        }
        arg1.field2900 = 0;
        if (arg1.field2822 == 2) {
            arg1.field2893 = 0;
        }
        arg1.field2887 += (var4 - arg1.field2887) / var2;
        if (arg1.field2822 == 3) {
            arg1.field2893 = 512;
        }
        if (arg0 <= 13) {
            method1643(true);
        }
        arg1.field2849 += (var3 - arg1.field2849) / var2;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILoh;II)V")
    public static final void method1642(int arg0, int arg1, class248 arg2, int arg3, int arg4) {
        if (arg1 != 128) {
            field3879 = -102;
        }
        field3882++;
        for (class132 var5 = (class132) class139.field2329.method1807(-98); var5 != null; var5 = (class132) class139.field2329.method1808((byte) 45)) {
            if (var5.field2211 == arg0 && (arg4 * 128) == var5.field2197 && arg3 * 128 == var5.field2204 && var5.field2193.field3893 == arg2.field3893) {
                if (var5.field2205 != null) {
                    class145.field2394.method1242(var5.field2205);
                    var5.field2205 = null;
                }
                if (var5.field2199 != null) {
                    class145.field2394.method1242(var5.field2199);
                    var5.field2199 = null;
                }
                var5.method1074((byte) -117);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public static void method1643(boolean arg0) {
        field3885 = null;
        field3886 = null;
        field3887 = null;
        field3888 = null;
        field3883 = null;
        if (!arg0) {
            method1640(-48, -25);
        }
    }
}
