import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class136 extends class84 {

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field1907 = -2;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "Lvd;")
    private class4 field1901;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "Z")
    public static boolean field1903;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILql;I)V")
    private final void method918(int arg0, class224 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method1453((byte) -128);
            if (this.field1901 == null) {
                int var5 = class89.method567(var4, -1989);
                this.field1901 = new class4(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1453((byte) -127) == 1;
                int var8 = arg1.method1454(-59);
                class171 var9;
                if (var7) {
                    var9 = new class76(arg1.method1455(-90));
                } else {
                    var9 = new class47(arg1.method1483((byte) 46));
                }
                this.field1901.method20(var9, (long) var8, 0);
            }
        }
        if (arg0 != -2) {
            method924((byte) -19, (class56) null, false);
        }
        field1906++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
    public final int method919(int arg0, int arg1, int arg2) {
        if (arg2 > -55) {
            return 81;
        }
        field1904++;
        if (this.field1901 == null) {
            return arg1;
        } else {
            class47 var4 = (class47) this.field1901.method23(216, (long) arg0);
            return var4 == null ? arg1 : var4.field689;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILql;)V")
    public final void method920(int arg0, class224 arg1) {
        if (arg0 != -20920) {
            return;
        }
        while (true) {
            int var3 = arg1.method1453((byte) -128);
            if (var3 == 0) {
                field1908++;
                return;
            }
            this.method918(-2, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method921(String arg0, int arg1, int arg2) {
        field1899++;
        if (this.field1901 == null) {
            return arg0;
        }
        class76 var4 = (class76) this.field1901.method23(216, (long) arg1);
        if (arg2 != 2560) {
            field1907 = -55;
        }
        return var4 == null ? arg0 : var4.field1056;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public static final void method922(byte arg0) {
        field1905++;
        class69.field936.method544(false);
        class151.field2082.method544(false);
        if (arg0 != 23) {
            field1903 = false;
        }
        class122.field1699.method544(false);
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
    public static final void method923(int arg0) {
        field1910++;
        if (!class11.field113) {
            return;
        }
        class211 var1 = class168.method1099(0, class144.field1998, class93.field1306);
        if (var1 != null && var1.field3124 != null) {
            class27 var2 = new class27();
            var2.field338 = var1;
            var2.field341 = var1.field3124;
            class213.method1392(var2, -83);
        }
        class11.field113 = false;
        class172.field2399 = -1;
        class236.method1583(var1, 0);
        if (arg0 >= -25) {
            method923(74);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLdf;Z)V")
    public static final void method924(byte arg0, class56 arg1, boolean arg2) {
        field1909++;
        int var3 = arg1.field808;
        int var4 = (int) arg1.field2369;
        if (arg0 != 86) {
            field1903 = true;
        }
        arg1.method1115(95);
        if (arg2) {
            class170.method1112(var3, 0);
        }
        class228.method1507((byte) 110, var3);
        class211 var5 = class67.method421(var4, 0);
        if (var5 != null) {
            class236.method1583(var5, 0);
        }
        int var6 = class68.field925;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class66.method416(class221.field3306[var7], true)) {
                class248.method1665(var7, -10872);
            }
        }
        if (class68.field925 == 1) {
            class15.field146 = false;
            class238.method1595((byte) 30, class40.field593, class224.field3406, class175.field2458, class180.field2516);
        } else {
            class238.method1595((byte) 30, class40.field593, class224.field3406, class175.field2458, class180.field2516);
            int var8 = class54.field787.method824(class92.field1277);
            for (int var9 = 0; var9 < class68.field925; var9++) {
                int var10 = class54.field787.method824(class41.method273(0, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class175.field2458 = var8 + 8;
            class224.field3406 = class68.field925 * 15 + (class137.field1925 ? 26 : 22);
        }
        if (class212.field3193 != -1) {
            class10.method64((byte) -107, 1, class212.field3193);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1900++;
        class236.method1584(arg3, arg2 ^ 0x72CA);
        int var7 = 0;
        int var8 = arg3;
        int var9 = arg3 - arg4;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg3;
        if (arg2 != 29387) {
            field1903 = true;
        }
        int var11 = -1;
        int var12 = -var9;
        int var13 = -1;
        int var14 = var9;
        int[] var15 = class216.field3264[arg6];
        int var16 = arg0 - var9;
        class154.method1028(-353, var15, arg1, arg0 - arg3, var16);
        int var17 = arg0 + var9;
        class154.method1028(-353, var15, arg5, var16, var17);
        class154.method1028(-353, var15, arg1, var17, arg0 + arg3);
        while (var8 > var7) {
            var11 += 2;
            var13 += 2;
            var12 += var11;
            var10 += var13;
            if (var12 >= 0 && var14 >= 1) {
                class178.field2489[var14] = var7;
                var14--;
                var12 -= var14 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                if (var9 <= var8) {
                    int[] var18 = class216.field3264[arg6 + var8];
                    int[] var19 = class216.field3264[arg6 - var8];
                    int var20 = arg0 + var7;
                    int var21 = arg0 - var7;
                    class154.method1028(-353, var18, arg1, var21, var20);
                    class154.method1028(-353, var19, arg1, var21, var20);
                } else {
                    int[] var22 = class216.field3264[arg6 + var8];
                    int[] var23 = class216.field3264[arg6 - var8];
                    int var24 = class178.field2489[var8];
                    int var25 = arg0 - var7;
                    int var26 = arg0 + var24;
                    int var27 = arg0 - var24;
                    class154.method1028(arg2 - 29740, var22, arg1, var25, var27);
                    class154.method1028(-353, var22, arg5, var27, var26);
                    int var28 = arg0 + var7;
                    class154.method1028(-353, var22, arg1, var26, var28);
                    class154.method1028(-353, var23, arg1, var25, var27);
                    class154.method1028(arg2 ^ 0xFFFF8C54, var23, arg5, var27, var26);
                    class154.method1028(-353, var23, arg1, var26, var28);
                }
                var10 -= var8 << 1;
            }
            int[] var29 = class216.field3264[arg6 + var7];
            int[] var30 = class216.field3264[arg6 - var7];
            int var31 = arg0 - var8;
            int var32 = arg0 + var8;
            if (var9 > var7) {
                int var33 = var7 <= var14 ? var14 : class178.field2489[var7];
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class154.method1028(-353, var29, arg1, var31, var35);
                class154.method1028(-353, var29, arg5, var35, var34);
                class154.method1028(-353, var29, arg1, var34, var32);
                class154.method1028(arg2 ^ 0xFFFF8C54, var30, arg1, var31, var35);
                class154.method1028(-353, var30, arg5, var35, var34);
                class154.method1028(-353, var30, arg1, var34, var32);
            } else {
                class154.method1028(-353, var29, arg1, var31, var32);
                class154.method1028(-353, var30, arg1, var31, var32);
            }
        }
    }
}
