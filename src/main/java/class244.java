import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class244 extends class107 {

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    private int field3850 = 1024;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "I")
    private int field3855 = 1024;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    private int field3866 = 1024;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    private int field3860 = 409;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    private int field3863 = 2048;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    private int field3856 = 1024;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    private int field3854 = 0;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    private int field3857 = 819;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    private int field3859 = 0;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field3862 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Z")
    public static boolean field3867 = true;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field3869 = 0;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    private int field3853;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILjava/util/Random;I[[II)V")
    private final void method1657(int arg0, int arg1, int arg2, Random arg3, int arg4, int[][] arg5, int arg6) {
        int var8 = this.field3855 > 0 ? 4096 + -class182.method1288(21953, arg3, this.field3855) : 4096;
        ++field3852;
        int var9 = this.field3856 * this.field3853 >> 12;
        int var10 = this.field3853 + -(~var9 < -1 ? class182.method1288(21953, arg3, var9) : 0);
        if (~class24.field443 >= ~arg6) {
            arg6 -= class24.field443;
        }
        if (arg1 == -10983) {
            if (~var10 >= -1) {
                if (~(arg4 + arg6) < ~class24.field443) {
                    int var11 = -arg6 + class24.field443;
                    for (int var12 = 0; var12 < arg0; ++var12) {
                        int[] var13 = arg5[arg2 + var12];
                        class282.method1920(var13, arg6, var11, var8);
                        class282.method1920(var13, 0, -var11 + arg4, var8);
                    }
                } else {
                    for (int var14 = 0; ~var14 > ~arg0; ++var14) {
                        class282.method1920(arg5[arg2 + var14], arg6, arg4, var8);
                    }
                }
            } else if (arg0 > 0 && ~arg4 < -1) {
                int var15 = arg4 / 2;
                int var16 = arg0 / 2;
                int var17 = var10 <= var15 ? var10 : var15;
                int var18 = ~var16 <= ~var10 ? var10 : var16;
                int var19 = arg6 + var17;
                int var20 = arg4 - var17 * 2;
                for (int var21 = 0; var21 < arg0; ++var21) {
                    int[] var22 = arg5[arg2 + var21];
                    if (var18 > var21) {
                        int var23 = var8 * var21 / var18;
                        if (~this.field3859 == -1) {
                            for (int var24 = 0; var24 < var17; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class233.method1609(arg6 - -var24, class128.field2053)] = var22[class233.method1609(arg4 + arg6 + -1 + -var24, class128.field2053)] = var23 * var25 >> 12;
                            }
                        } else {
                            for (int var26 = 0; ~var17 < ~var26; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class233.method1609(class128.field2053, arg6 + var26)] = var22[class233.method1609(arg6 - (var26 + 1 + -arg4), class128.field2053)] = var23 <= var28 ? var23 : var28;
                            }
                        }
                        if (var19 + var20 > class24.field443) {
                            int var27 = -var19 + class24.field443;
                            class282.method1920(var22, var19, var27, var23);
                            class282.method1920(var22, 0, -var27 + var20, var23);
                        } else {
                            class282.method1920(var22, var19, var20, var23);
                        }
                    } else {
                        int var29 = arg0 + -1 + -var21;
                        if (var18 > var29) {
                            int var30 = var8 * var29 / var18;
                            if (~this.field3859 != -1) {
                                for (int var31 = 0; var17 > var31; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class233.method1609(arg6 - -var31, class128.field2053)] = var22[class233.method1609(arg6 - (var31 - -1 + -arg4), class128.field2053)] = var30 <= var32 ? var30 : var32;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class233.method1609(arg6 + var33, class128.field2053)] = var22[class233.method1609(arg6 - (-arg4 + 1) + -var33, class128.field2053)] = var30 * var35 >> 12;
                                }
                            }
                            if (var19 + var20 > class24.field443) {
                                int var34 = -var19 + class24.field443;
                                class282.method1920(var22, var19, var34, var30);
                                class282.method1920(var22, 0, var20 - var34, var30);
                            } else {
                                class282.method1920(var22, var19, var20, var30);
                            }
                        } else {
                            for (int var36 = 0; var17 > var36; ++var36) {
                                var22[class233.method1609(arg6 + var36, class128.field2053)] = var22[class233.method1609(class128.field2053, -var36 + arg6 + -1 + arg4)] = var8 * var36 / var17;
                            }
                            if (class24.field443 < var19 + var20) {
                                int var37 = -var19 + class24.field443;
                                class282.method1920(var22, var19, var37, var8);
                                class282.method1920(var22, 0, -var37 + var20, var8);
                            } else {
                                class282.method1920(var22, var19, var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field3851;
        if (arg1 != 4096) {
            method1661(-120, 89, -98, -27);
        }
        class236 var13 = new class236();
        var13.field3702 = arg2;
        var13.field3714 = arg10;
        var13.field3696 = arg7;
        var13.field3695 = arg12;
        var13.field3698 = arg6;
        var13.field3699 = arg9;
        var13.field3697 = arg4;
        var13.field3693 = arg0;
        var13.field3709 = arg11;
        var13.field3707 = arg5;
        var13.field3711 = arg3;
        var13.field3703 = arg8;
        class107.field1668.method1554(5257, var13);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field3855 = arg1.method1837(252);
                                        }
                                    } else {
                                        this.field3856 = arg1.method1837(252);
                                    }
                                } else {
                                    this.field3859 = arg1.method1849(255);
                                }
                            } else {
                                this.field3866 = arg1.method1837(252);
                            }
                        } else {
                            this.field3857 = arg1.method1837(252);
                        }
                    } else {
                        this.field3860 = arg1.method1837(arg2 + 224);
                    }
                } else {
                    this.field3863 = arg1.method1837(252);
                }
            } else {
                this.field3850 = arg1.method1837(252);
            }
        } else {
            this.field3854 = arg1.method1849(255);
        }
        ++field3868;
        if (arg2 != 28) {
            method1661(2, 19, -100, -41);
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public static final void method1659(int arg0) {
        if (arg0 != 120) {
            field3862 = null;
        }
        for (class109 var1 = (class109) class74.field1192.method379(-21146); var1 != null; var1 = (class109) class74.field1192.method369(true)) {
            int var2 = var1.field1689;
            if (class118.method816(var2, 0)) {
                boolean var3 = true;
                class248[] var4 = class208.field3315[var2];
                for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3952;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2209;
                    class248 var7 = class281.method1913(var6, (byte) -108);
                    if (var7 != null) {
                        class111.method776(var7, (byte) 25);
                    }
                }
            }
        }
        ++field3864;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int[] var3 = super.field1661.method894(126, arg1);
        int var4 = -86 / ((-34 - arg0) / 49);
        ++field3861;
        if (super.field1661.field2115) {
            int var5 = 0;
            int[][] var6 = super.field1661.method893(-129);
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = class24.field443 * this.field3850 >> 12;
            int var16 = class24.field443 * this.field3863 >> 12;
            int var17 = class153.field2452 * this.field3860 >> 12;
            int var18 = class153.field2452 * this.field3857 >> 12;
            if (~var18 >= -2) {
                return var6[arg1];
            } else {
                this.field3853 = class24.field443 / 8 * this.field3866 >> 12;
                int var19 = class24.field443 / var15 + 1;
                Random var20 = new Random((long) this.field3854);
                int[][] var21 = new int[var19][3];
                int[][] var22 = new int[var19][3];
                while (true) {
                    while (true) {
                        int var23 = class182.method1288(21953, var20, -var15 + var16) + var15;
                        int var24 = var17 - -class182.method1288(21953, var20, -var17 + var18);
                        int var25 = var12 - -var23;
                        if (var25 > class24.field443) {
                            var23 = -var12 + class24.field443;
                            var25 = class24.field443;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var26 = var8;
                            int var27 = var7 + var25;
                            int[] var28 = var22[var8];
                            if (var27 < 0) {
                                var27 += class24.field443;
                            }
                            var29 = var28[2];
                            int var30 = 0;
                            if (var27 > class24.field443) {
                                var27 -= class24.field443;
                            }
                            while (true) {
                                int[] var31 = var22[var26];
                                if (var27 >= var31[0] && var27 <= var31[1]) {
                                    if (~var8 != ~var26) {
                                        int var32 = var12 - -var7;
                                        if (~var32 > -1) {
                                            var32 += class24.field443;
                                        }
                                        if (~class24.field443 > ~var32) {
                                            var32 -= class24.field443;
                                        }
                                        for (int var33 = 1; var33 <= var30; ++var33) {
                                            int[] var41 = var22[(var8 + var33) % var14];
                                            var29 = Math.max(var29, var41[2]);
                                        }
                                        for (int var34 = 0; var34 <= var30; ++var34) {
                                            int[] var35 = var22[(var8 - -var34) % var14];
                                            int var36 = var35[2];
                                            if (~var29 != ~var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (~var27 < ~var32) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var27, var38);
                                                } else if (var37 == 0) {
                                                    var40 = Math.min(var27, var38);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class24.field443;
                                                }
                                                this.method1657(-var36 + var29, -10983, var36, var20, var40 - var39, var6, var39 - -var5);
                                            }
                                        }
                                    }
                                    var8 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var14) {
                                    var26 = 0;
                                }
                                ++var30;
                            }
                        }
                        if (class153.field2452 >= var24 + var29) {
                            var10 = false;
                        } else {
                            var24 = -var29 + class153.field2452;
                        }
                        if (class24.field443 != var25) {
                            int[] var42 = var21[var13++];
                            var42[1] = var25;
                            var42[2] = var29 - -var24;
                            var42[0] = var12;
                            this.method1657(var24, -10983, var29, var20, var23, var6, var12 - -var9);
                            var12 = var25;
                        } else {
                            this.method1657(var24, -10983, var29, var20, var23, var6, var9 + var12);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            var8 = 0;
                            var11 = false;
                            int[] var43 = var21[var13++];
                            int[][] var44 = var22;
                            var43[2] = var24 + var29;
                            var5 = var9;
                            var14 = var13;
                            var43[0] = var12;
                            var43[1] = var25;
                            var9 = class182.method1288(21953, var20, class24.field443);
                            var7 = var9 - var5;
                            var22 = var21;
                            int var45 = var7;
                            var13 = 0;
                            var12 = 0;
                            var21 = var44;
                            if (~var7 > -1) {
                                var45 = class24.field443 + var7;
                            }
                            if (~class24.field443 > ~var45) {
                                var45 -= class24.field443;
                            }
                            while (true) {
                                int[] var46 = var22[var8];
                                if (var45 >= var46[0] && var45 <= var46[1]) {
                                    break;
                                }
                                ++var8;
                                if (var8 >= var14) {
                                    var8 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
    public static void method1660(int arg0) {
        int var1 = -112 / ((-49 - arg0) / 59);
        field3862 = null;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        ++field3865;
        if (arg0 != 35) {
            this.method189(127, -58);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1661(int arg0, int arg1, int arg2, int arg3) {
        if (!class163.method1117(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class166.field2746[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class35.field567) {
                        if (!class169.method1198(var4, var6, var5)) {
                            return false;
                        }
                        if (!class169.method1198(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class169.method1198(var4, var7, var5)) {
                            return false;
                        }
                        if (!class169.method1198(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class169.method1198(var4, var8, var5)) {
                        return false;
                    }
                    if (!class169.method1198(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class280.field4561) {
                        if (!class169.method1198(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class169.method1198(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class169.method1198(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class169.method1198(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class169.method1198(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class169.method1198(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class35.field567) {
                        if (!class169.method1198(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class169.method1198(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class169.method1198(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class169.method1198(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class169.method1198(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class169.method1198(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class280.field4561) {
                        if (!class169.method1198(var4, var6, var5)) {
                            return false;
                        }
                        if (!class169.method1198(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class169.method1198(var4, var7, var5)) {
                            return false;
                        }
                        if (!class169.method1198(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class169.method1198(var4, var8, var5)) {
                        return false;
                    }
                    if (!class169.method1198(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class169.method1198(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class169.method1198(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class169.method1198(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class169.method1198(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class169.method1198(var4, var8, var5);
            } else {
                return true;
            }
        }
    }
}
