import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class108 extends class255 {

    @OriginalMember(owner = "client!ne", name = "ac", descriptor = "Lsb;")
    public static class98 field1938 = class47.method368(" (X", 0);

    @OriginalMember(owner = "client!ne", name = "Pb", descriptor = "S")
    public static short field1927 = 205;

    @OriginalMember(owner = "client!ne", name = "Rb", descriptor = "[I")
    public static int[] field1929 = new int[5];

    @OriginalMember(owner = "client!ne", name = "Ub", descriptor = "I")
    public static int field1932 = 0;

    @OriginalMember(owner = "client!ne", name = "Yb", descriptor = "Lsb;")
    public static class98 field1936 = class47.method368("Schlie-8en", 0);

    @OriginalMember(owner = "client!ne", name = "Xb", descriptor = "I")
    public static int field1935 = 1;

    @OriginalMember(owner = "client!ne", name = "Sb", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ne", name = "Tb", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ne", name = "Vb", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ne", name = "Wb", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ne", name = "Zb", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ne", name = "Qb", descriptor = "Lak;")
    public class120 field1928;

    @OriginalMember(owner = "client!ne", name = "bc", descriptor = "[I")
    public static int[] field1939;

    @OriginalMember(owner = "client!ne", name = "cc", descriptor = "[Lve;")
    public static class174[] field1940;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BZ)V")
    public static final void method822(byte arg0, boolean arg1) {
        ++field1930;
        byte[][] var2 = class238.field4106;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            byte[] var11 = var2[var5];
            int var12 = (class49.field812[var5] >> 8) * 64 + -class189.field3277;
            int var13 = (255 & class49.field812[var5]) * 64 + -class182.field3143;
            if (var11 != null) {
                class115.method867(arg0 + -17);
                class56.method414(arg0 + -106, arg1, var11, var12, (class191.field3316 + -6) * 8, class118.field2124 * 8 - 48, class110.field1961, var13);
            }
        }
        for (int var6 = 0; var6 < var4; ++var6) {
            int var7 = (class49.field812[var6] >> 8) * 64 + -class189.field3277;
            int var8 = (255 & class49.field812[var6]) * 64 + -class182.field3143;
            byte[] var9 = var2[var6];
            if (var9 == null && ~class191.field3316 > -801) {
                class115.method867(47);
                for (int var10 = 0; ~var10 > ~var3; ++var10) {
                    class251.method1740(64, 64, var10, var7, 0, var8);
                }
            }
        }
        if (arg0 != 106) {
            method825(-38, -40, (class75) null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()I")
    public final int method90() {
        ++field1931;
        return super.field4477;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)Z")
    public final boolean method823(boolean arg0) {
        ++field1933;
        if (!arg0) {
            return false;
        } else {
            return this.field1928 != null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1937;
        if (this.field1928 != null) {
            class138 var11 = super.field4503 != -1 && ~super.field4474 == -1 ? class16.method144(1, super.field4503) : null;
            class138 var12 = ~super.field4479 == 0 || ~super.field4510 == ~super.field4479 && var11 != null ? null : class16.method144(1, super.field4479);
            class17 var13 = this.field1928.method898(true, var12, super.field4502, var11, super.field4518);
            if (var13 != null) {
                super.field4477 = var13.method90();
                class120 var14 = this.field1928;
                if (var14.field2189 != null) {
                    var14 = var14.method895(-1);
                }
                if (class115.field2062 && var14.field2205) {
                    class17 var15 = class75.method563(var13, this.field1928.field2212, super.field4468, super.field4466, this.field1928.field2166, var12 != null ? super.field4518 : super.field4502, this.field1928.field2193, super.field4475, this.field1928.field2165, var12 != null ? var12 : var11, 15135, this.field1928.field2190, super.field4492, arg0);
                    var15.method91(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field1928.field2159 != -1 || this.field1928.field2158 != 0) {
                    int var19 = class160.field2890[arg0];
                    int var20 = class160.field2893[arg0];
                    short var21 = this.field1928.field2159;
                    int var22 = -var21 / 2;
                    short var23 = this.field1928.field2158;
                    int var24 = -var23 / 2;
                    int var25 = var19 * var24 + -(var20 * var22) >> 16;
                    int var26 = var21 / 2;
                    int var27 = var19 * var22 + var20 * var24 >> 16;
                    int var28 = class70.method480(class265.field4640, (byte) 126, super.field4492 + var27, super.field4466 - -var25);
                    int var29 = -var23 / 2;
                    int var30 = var19 * var26 + var20 * var29 >> 16;
                    int var31 = var19 * var29 + -(var20 * var26) >> 16;
                    int var32 = class70.method480(class265.field4640, (byte) 126, super.field4492 + var30, super.field4466 + var31);
                    int var33 = -var21 / 2;
                    int var34 = var23 / 2;
                    int var35 = var19 * var33 + var20 * var34 >> 16;
                    int var36 = var19 * var34 + -(var20 * var33) >> 16;
                    int var37 = class70.method480(class265.field4640, (byte) 126, super.field4492 - -var35, super.field4466 + var36);
                    int var38 = var23 / 2;
                    int var39 = var21 / 2;
                    int var40 = var19 * var38 + -(var20 * var39) >> 16;
                    int var41 = var19 * var39 + var20 * var38 >> 16;
                    int var42 = class70.method480(class265.field4640, (byte) 126, super.field4492 - -var41, super.field4466 + var40);
                    int var43 = var28 + var42;
                    if (var43 > var32 + var37) {
                        var43 = var32 - -var37;
                    }
                    int var44 = var28 < var32 ? var28 : var32;
                    int var45 = ~var42 < ~var32 ? var32 : var42;
                    int var46 = ~var42 < ~var37 ? var37 : var42;
                    if (var23 != 0) {
                        var18 = (int) (325.95D * Math.atan2((double) (var44 - var46), (double) var23)) & 2047;
                        if (var18 != 0) {
                            var13.method164(var18);
                        }
                    }
                    int var47 = var37 > var28 ? var28 : var37;
                    if (var21 != 0) {
                        var17 = 2047 & (int) (325.95D * Math.atan2((double) (-var45 + var47), (double) var21));
                        if (~var17 != -1) {
                            var13.method154(var17);
                        }
                    }
                    var16 = (var43 >> 1) + -super.field4475;
                    if (~var16 != -1) {
                        var13.method156(0, var16, 0);
                    }
                }
                class17 var48 = null;
                if (~super.field4461 != 0 && ~super.field4485 != 0) {
                    class203 var49 = class49.method385(super.field4461, 0);
                    var48 = var49.method1376(-125, super.field4485);
                    if (var48 != null) {
                        var48.method156(0, -super.field4519, 0);
                        if (var49.field3458) {
                            if (~var18 != -1) {
                                var48.method164(var18);
                            }
                            if (~var17 != -1) {
                                var48.method154(var17);
                            }
                            if (var16 != 0) {
                                var48.method156(0, var16, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class58) var13).method427(var48);
                }
                if (this.field1928.field2165 == 1) {
                    var13.field333 = true;
                }
                var13.method91(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public static void method824(int arg0) {
        field1938 = null;
        if (arg0 == 64) {
            field1929 = null;
            field1940 = null;
            field1939 = null;
            field1936 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILtg;)Lmj;")
    public static final class234 method825(int arg0, int arg1, class75 arg2) {
        ++field1934;
        int var3 = -43 % ((arg0 - 39) / 55);
        byte[] var4 = arg2.method552(arg1, 25937);
        return var4 == null ? null : new class234(var4);
    }
}
