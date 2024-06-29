import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class507 {

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    private int field7293 = -1;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "Z")
    public boolean field7300 = true;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    private int field7297;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "Lug;")
    private class395 field7301;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "I")
    private int field7308;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Lfu;")
    private class267 field7304;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    private int field7299;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "Lml;")
    private class265 field7298;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Lit;")
    private class458 field7296;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Lor;")
    private class454 field7294;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field7292 = 0;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "[[I")
    public static int[][] field7302 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "[I")
    public static int[] field7309 = new int[32];

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field7305 = -1;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Lqn;")
    public static class47 field7290;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 4)
    public static void method3040(int arg0) {
        field7302 = null;
        if (arg0 != 1) {
            method3040(-4);
        }
        field7309 = null;
        field7290 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([BIII)V", line = 17)
    public final void method3041(byte[] arg0, int arg1, int arg2, int arg3) {
        this.field7294.method2505(arg2, 6538, arg3 * this.field7301.method2346((byte) 117, arg2), arg0);
        field7289++;
        this.method3046(arg3, this.field7294, 0);
        if (arg1 < 60) {
            method3043(null, true, true);
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V", line = 35)
    public final void method3042(int arg0) {
        field7291++;
        if (arg0 == -10299) {
            this.method3046(this.field7299, this.field7296, 0);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;ZZ)V", line = 46)
    public static final void method3043(String arg0, boolean arg1, boolean arg2) {
        field7307++;
        if (arg0 == null) {
            return;
        }
        if (class498.field7223 >= 100) {
            class445.method2622(true, class442.field6353.method1936(-26539, class11.field177));
            return;
        }
        String var3 = class465.method2803(arg0, (byte) 77);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class498.field7223; var4++) {
            String var8 = class465.method2803(class385.field5063[var4], (byte) 80);
            if (var8 != null && var8.equals(var3)) {
                class445.method2622(arg1, arg0 + class532.field7838.method1936(-26539, class11.field177));
                return;
            }
            if (class281.field3580[var4] != null) {
                String var9 = class465.method2803(class281.field3580[var4], (byte) 78);
                if (var9 != null && var9.equals(var3)) {
                    class445.method2622(true, arg0 + class532.field7838.method1936(-26539, class11.field177));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class280.field3555; var5++) {
            String var6 = class465.method2803(class329.field4163[var5], (byte) 125);
            if (var6 != null && var6.equals(var3)) {
                class445.method2622(true, class478.field6998.method1936(-26539, class11.field177) + arg0 + class90.field1109.method1936(-26539, class11.field177));
                return;
            }
            if (class106.field1341[var5] != null) {
                String var7 = class465.method2803(class106.field1341[var5], (byte) 90);
                if (var7 != null && var7.equals(var3)) {
                    class445.method2622(true, class478.field6998.method1936(-26539, class11.field177) + arg0 + class90.field1109.method1936(-26539, class11.field177));
                    return;
                }
            }
        }
        if (class465.method2803(class23.field336.field2852, (byte) 115).equals(var3)) {
            class445.method2622(arg1, class392.field5263.method1936(-26539, class11.field177));
            return;
        }
        class282.method1669(class147.field1866, !arg1);
        class335.field4228++;
        class40.field511.method2729(class463.method2733(-106, arg0) + 1, false);
        class40.field511.method2769(arg0, arg1);
        class40.field511.method2729(arg2 ? 1 : 0, false);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)V", line = 141)
    public static final void method3044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class320.method1884((byte) 98, arg4);
        field7306++;
        int var7 = arg3;
        int var8 = arg4 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg1 >= class533.field7845 && arg1 <= class289.field3694) {
            int[] var14 = class387.field5088[arg1];
            int var15 = class33.method242(arg2 - arg4, class147.field1870, class237.field3019, (byte) -128);
            int var16 = class33.method242(arg2 + arg4, class147.field1870, class237.field3019, (byte) -128);
            int var17 = class33.method242(arg2 - var8, class147.field1870, class237.field3019, (byte) -128);
            int var18 = class33.method242(arg2 + var8, class147.field1870, class237.field3019, (byte) -128);
            class184.method1160(var14, -7, arg5, var17, var15);
            class184.method1160(var14, -7, arg6, var18, var17);
            class184.method1160(var14, arg3 ^ 0xFFFFFFF9, arg5, var16, var18);
        }
        int var19 = -1;
        while (var9 > var7) {
            var19 += 2;
            var13 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class36.field485[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (class533.field7845 <= var21 && class289.field3694 >= var20) {
                    if (var9 >= var8) {
                        int var22 = class33.method242(arg2 + var7, class147.field1870, class237.field3019, (byte) -128);
                        int var23 = class33.method242(arg2 - var7, class147.field1870, class237.field3019, (byte) -128);
                        if (var21 <= class289.field3694) {
                            class184.method1160(class387.field5088[var21], -7, arg5, var22, var23);
                        }
                        if (class533.field7845 <= var20) {
                            class184.method1160(class387.field5088[var20], -7, arg5, var22, var23);
                        }
                    } else {
                        int var24 = class36.field485[var9];
                        int var25 = class33.method242(arg2 + var7, class147.field1870, class237.field3019, (byte) -128);
                        int var26 = class33.method242(arg2 - var7, class147.field1870, class237.field3019, (byte) -128);
                        int var27 = class33.method242(arg2 + var24, class147.field1870, class237.field3019, (byte) -128);
                        int var28 = class33.method242(arg2 - var24, class147.field1870, class237.field3019, (byte) -128);
                        if (var21 <= class289.field3694) {
                            int[] var29 = class387.field5088[var21];
                            class184.method1160(var29, arg3 - 7, arg5, var28, var26);
                            class184.method1160(var29, -7, arg6, var27, var28);
                            class184.method1160(var29, arg3 - 7, arg5, var25, var27);
                        }
                        if (class533.field7845 <= var20) {
                            int[] var30 = class387.field5088[var20];
                            class184.method1160(var30, -7, arg5, var28, var26);
                            class184.method1160(var30, arg3 - 7, arg6, var27, var28);
                            class184.method1160(var30, -7, arg5, var25, var27);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class533.field7845 && var31 <= class289.field3694) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (class147.field1870 <= var33 && var34 <= class237.field3019) {
                    int var35 = class33.method242(var33, class147.field1870, class237.field3019, (byte) -128);
                    int var36 = class33.method242(var34, class147.field1870, class237.field3019, (byte) -128);
                    if (var8 > var7) {
                        int var37 = var7 <= var11 ? var11 : class36.field485[var7];
                        int var38 = class33.method242(arg2 + var37, class147.field1870, class237.field3019, (byte) -128);
                        int var39 = class33.method242(arg2 - var37, class147.field1870, class237.field3019, (byte) -128);
                        if (class289.field3694 >= var32) {
                            int[] var40 = class387.field5088[var32];
                            class184.method1160(var40, arg3 - 7, arg5, var39, var36);
                            class184.method1160(var40, arg3 ^ 0xFFFFFFF9, arg6, var38, var39);
                            class184.method1160(var40, -7, arg5, var35, var38);
                        }
                        if (class533.field7845 <= var31) {
                            int[] var41 = class387.field5088[var31];
                            class184.method1160(var41, arg3 ^ 0xFFFFFFF9, arg5, var39, var36);
                            class184.method1160(var41, -7, arg6, var38, var39);
                            class184.method1160(var41, arg3 - 7, arg5, var35, var38);
                        }
                    } else {
                        if (class289.field3694 >= var32) {
                            class184.method1160(class387.field5088[var32], -7, arg5, var35, var36);
                        }
                        if (var31 >= class533.field7845) {
                            class184.method1160(class387.field5088[var31], -7, arg5, var35, var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lug;Lfu;Lul;IIIII)V", line = 489)
    public class507(class395 arg0, class267 arg1, class405 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7297 = arg7;
        this.field7301 = arg0;
        this.field7308 = arg6;
        this.field7304 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field1842 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field5783[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field7299 = var10;
        if (var10 <= 0) {
            this.field7298 = null;
        } else {
            class463 var14 = new class463(var10 * 2);
            if (this.field7301.field5593) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field1842 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field5783[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2759((byte) -102, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field1842 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field5783[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2790(-951330584, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field7296 = this.field7301.method2287(5123, false, 5667, var14.field6618, var14.field6631);
            this.field7294 = new class454(this.field7301, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V", line = 328)
    private final void method3045(int arg0) {
        field7303++;
        if (!this.field7300) {
            return;
        }
        this.field7300 = false;
        byte[] var2 = this.field7304.field3386;
        if (arg0 != 6406) {
            return;
        }
        byte[] var3 = this.field7301.field5645;
        int var4 = 0;
        int var5 = this.field7304.field3390;
        int var6 = this.field7304.field3390 * this.field7297 + this.field7308;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field7298 != null && this.field7293 == var4) {
            this.field7300 = false;
            return;
        }
        this.field7293 = var4;
        int var8 = 0;
        int var9 = this.field7297 * var5 + this.field7308;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var9] == 0) {
                    int var12 = 0;
                    if (var2[var9 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var9 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var9 + var5] != 0) {
                        var12++;
                    }
                    var3[var8++] = (byte) (var12 * 17);
                } else {
                    var3[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field7304.field3390 - 128;
        }
        if (this.field7298 == null) {
            this.field7298 = new class265(this.field7301, 3553, 6406, 128, 128, false, this.field7301.field5645, 6406, false);
            this.field7298.method1578(false, 0, false);
            this.field7298.method861(true, arg0 + 3578);
        } else {
            this.field7298.method1575(128, this.field7301.field5645, 128, 6406, 0, false, 0, 0, (byte) 52, 0);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILit;I)V", line = 443)
    private final void method3046(int arg0, class458 arg1, int arg2) {
        field7288++;
        if (arg0 != 0) {
            this.method3045(6406);
            this.field7301.method2322(this.field7298, 14);
            this.field7301.method2343(-93, arg1, arg2, arg0, 4);
        }
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)V", line = 475)
    public static final void method3047(int arg0) {
        class314.method1845(121);
        field7295++;
        if (arg0 > 0) {
            class139.method946(-41);
        }
    }
}
