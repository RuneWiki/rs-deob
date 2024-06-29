import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class111 extends class288 {

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    private int field1912 = 4096;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    private int field1916 = 0;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1911 = -1;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "Leg;")
    public static class272 field1908 = new class272(100);

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field1921 = 1;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field1923 = new String[1000];

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "Lcg;")
    public static class36 field1922;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Ljava/lang/String;")
    public static String field1920;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        for (int var1 = 0; ~var1 > ~class251.field4027; ++var1) {
            int var2 = class134.field2250[var1];
            class275 var3 = class198.field3193[var2];
            if (var3 != null) {
                class267.method1809(var3, var3.field4439.field4262, (byte) 123);
            }
        }
        if (arg0 >= 7) {
            ++field1909;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class111() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
    public static void method803(byte arg0) {
        if (arg0 <= -107) {
            field1923 = null;
            field1908 = null;
            field1922 = null;
            field1920 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field1915;
        if (arg0 != 0) {
            field1908 = null;
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[] var4 = this.method1931((byte) -115, 0, arg1);
            for (int var5 = 0; var5 < class186.field2986; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field1916) {
                    var3[var5] = this.field1916;
                } else if (~this.field1912 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1912;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field1914;
        if (arg0 != 1) {
            return null;
        } else {
            int[][] var3 = super.field4598.method812(arg1, arg0 + 65534);
            if (super.field4598.field1954) {
                int[][] var4 = this.method1930(0, arg1, (byte) -114);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var4[0];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class186.field2986; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var6[var11];
                    int var14 = var5[var11];
                    if (~this.field1916 >= ~var12) {
                        if (var12 > this.field1912) {
                            var8[var11] = this.field1912;
                        } else {
                            var8[var11] = var12;
                        }
                    } else {
                        var8[var11] = this.field1916;
                    }
                    if (~this.field1916 < ~var14) {
                        var9[var11] = this.field1916;
                    } else if (var14 <= this.field1912) {
                        var9[var11] = var14;
                    } else {
                        var9[var11] = this.field1912;
                    }
                    if (this.field1916 > var13) {
                        var10[var11] = this.field1916;
                    } else if (this.field1912 >= var13) {
                        var10[var11] = var13;
                    } else {
                        var10[var11] = this.field1912;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            field1923 = null;
        }
        ++field1917;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field4612 = ~arg0.method1779(-121) == -2;
                }
            } else {
                this.field1912 = arg0.method1777(-64);
            }
        } else {
            this.field1916 = arg0.method1777(-119);
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static final void method804(int arg0) {
        class168.field2726 = null;
        class131.field2187 = null;
        if (arg0 != 0) {
            method802((byte) -127);
        }
        class249.field3993 = null;
        class263.field4168 = null;
        class70.field968 = null;
        ++field1918;
        class207.field3348 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method805(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        ++field1907;
        int var9 = arg3;
        if (arg1 > -114) {
            method802((byte) 39);
        }
        int var10 = -arg6 + arg7;
        int var11 = arg7 * arg7;
        int var12 = -arg6 + arg3;
        int var13 = 0;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var10 * var10;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = var11 << 1;
        int var21 = var12 << 1;
        int var22 = arg3 << 1;
        int var23 = -((var22 + -1) * var20) + var14;
        int var24 = (-var22 + 1) * var11 - -var17;
        int var25 = (1 - var21) * var16 + var19;
        int var26 = var11 << 2;
        int var27 = var15 - (var21 + -1) * var18;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = (var22 - 3) * var20;
        int var32 = var17 * 3;
        int var33 = var19 * 3;
        int var34 = (var21 + -3) * var18;
        int var35 = var30;
        int var36 = var28;
        if (arg2 >= class156.field2507 && arg2 <= client.field3617) {
            int[] var37 = class85.field1162[arg2];
            int var38 = class18.method125(-24914, -arg7 + arg5, class121.field2042, class58.field817);
            int var39 = class18.method125(-24914, arg5 + arg7, class121.field2042, class58.field817);
            int var40 = class18.method125(-24914, -var10 + arg5, class121.field2042, class58.field817);
            int var41 = class18.method125(-24914, arg5 - -var10, class121.field2042, class58.field817);
            class168.method1184(128, var40, var38, arg0, var37);
            class168.method1184(128, var41, var40, arg4, var37);
            class168.method1184(128, var39, var41, arg0, var37);
        }
        int var42 = (var12 + -1) * var29;
        int var43 = (arg3 + -1) * var26;
        while (~var9 < -1) {
            if (var24 < 0) {
                while (~var24 > -1) {
                    ++var8;
                    var23 += var36;
                    var36 += var28;
                    var24 += var32;
                    var32 += var28;
                }
            }
            boolean var44 = ~var9 >= ~var12;
            --var9;
            if (var44) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var27 += var35;
                        ++var13;
                        var33 += var30;
                        var35 += var30;
                    }
                }
                if (var27 < 0) {
                    var27 += var35;
                    var25 += var33;
                    var33 += var30;
                    var35 += var30;
                    ++var13;
                }
                var27 += -var34;
                var25 += -var42;
                var34 -= var29;
                var42 -= var29;
            }
            if (var23 < 0) {
                ++var8;
                var23 += var36;
                var24 += var32;
                var32 += var28;
                var36 += var28;
            }
            int var45 = -var9 + arg2;
            var23 += -var31;
            var24 += -var43;
            var31 -= var26;
            int var46 = arg2 + var9;
            if (~var46 <= ~class156.field2507 && var45 <= client.field3617) {
                int var47 = class18.method125(-24914, arg5 + var8, class121.field2042, class58.field817);
                int var48 = class18.method125(-24914, -var8 + arg5, class121.field2042, class58.field817);
                if (var44) {
                    int var49 = class18.method125(-24914, arg5 + var13, class121.field2042, class58.field817);
                    int var50 = class18.method125(-24914, arg5 - var13, class121.field2042, class58.field817);
                    if (var45 >= class156.field2507) {
                        int[] var51 = class85.field1162[var45];
                        class168.method1184(128, var50, var48, arg0, var51);
                        class168.method1184(128, var49, var50, arg4, var51);
                        class168.method1184(128, var47, var49, arg0, var51);
                    }
                    if (~client.field3617 <= ~var46) {
                        int[] var52 = class85.field1162[var46];
                        class168.method1184(128, var50, var48, arg0, var52);
                        class168.method1184(128, var49, var50, arg4, var52);
                        class168.method1184(128, var47, var49, arg0, var52);
                    }
                } else {
                    if (~var45 <= ~class156.field2507) {
                        class168.method1184(128, var47, var48, arg0, class85.field1162[var45]);
                    }
                    if (client.field3617 >= var46) {
                        class168.method1184(128, var47, var48, arg0, class85.field1162[var46]);
                    }
                }
            }
            var43 -= var26;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IC)Z")
    public static final boolean method806(int arg0, char arg1) {
        if (arg0 >= -23) {
            method804(76);
        }
        ++field1910;
        return ~arg1 <= -49 && arg1 <= '9';
    }
}
