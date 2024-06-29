import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class83 extends class247 {

    @OriginalMember(owner = "client!jd", name = "fc", descriptor = "Ldf;")
    private static class51 field1394 = class46.method233(" has logged out)3", 100);

    @OriginalMember(owner = "client!jd", name = "bc", descriptor = "Z")
    public static boolean field1390 = false;

    @OriginalMember(owner = "client!jd", name = "kc", descriptor = "Ldf;")
    public static class51 field1399 = class46.method233("(U", 100);

    @OriginalMember(owner = "client!jd", name = "lc", descriptor = "Ldf;")
    public static class51 field1400 = field1394;

    @OriginalMember(owner = "client!jd", name = "cc", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!jd", name = "ec", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!jd", name = "gc", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!jd", name = "hc", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!jd", name = "ic", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!jd", name = "jc", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!jd", name = "dc", descriptor = "Lhd;")
    public class11 field1392;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1395;
        if (this.field1392 != null) {
            class151 var11 = super.field4344 != -1 && ~super.field4321 == -1 ? class72.method501(super.field4344, (byte) 11) : null;
            class151 var12 = ~super.field4314 == 0 || super.field4314 == super.field4304 && var11 != null ? null : class72.method501(super.field4314, (byte) 98);
            class65 var13 = this.field1392.method68(super.field4301, super.field4277, var12, var11, (byte) 78);
            if (var13 != null) {
                super.field4313 = var13.method94();
                class11 var14 = this.field1392;
                if (var14.field120 != null) {
                    var14 = var14.method60((byte) 56);
                }
                if (class174.field2860 && var14.field129) {
                    class65 var15 = class72.method506(super.field4282, this.field1392.field169, this.field1392.field127, var12 != null ? super.field4301 : super.field4277, super.field4328, 2, arg0, var12 != null ? var12 : var11, super.field4348, this.field1392.field152, super.field4319, var13, this.field1392.field118, this.field1392.field157);
                    var15.method96(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field1392.field143 != 0 || ~this.field1392.field126 != -1) {
                    int var19 = class73.field1167[arg0];
                    int var20 = class73.field1155[arg0];
                    short var21 = this.field1392.field143;
                    short var22 = this.field1392.field126;
                    int var23 = -var21 / 2;
                    int var24 = -var22 / 2;
                    int var25 = var19 * var23 + var20 * var24 >> 16;
                    int var26 = var19 * var24 + -(var20 * var23) >> 16;
                    int var27 = class207.method1424(class257.field4496, super.field4319 + var25, (byte) 91, super.field4348 - -var26);
                    int var28 = var21 / 2;
                    int var29 = -var22 / 2;
                    int var30 = var19 * var29 + -(var20 * var28) >> 16;
                    int var31 = var19 * var28 + var20 * var29 >> 16;
                    int var32 = class207.method1424(class257.field4496, super.field4319 - -var31, (byte) 103, super.field4348 + var30);
                    int var33 = var22 / 2;
                    int var34 = -var21 / 2;
                    int var35 = var19 * var34 + var20 * var33 >> 16;
                    int var36 = var19 * var33 + -(var20 * var34) >> 16;
                    int var37 = class207.method1424(class257.field4496, super.field4319 + var35, (byte) 90, super.field4348 + var36);
                    int var38 = var22 / 2;
                    int var39 = var21 / 2;
                    int var40 = var20 * var38 - -(var19 * var39) >> 16;
                    int var41 = var19 * var38 + -(var20 * var39) >> 16;
                    int var42 = class207.method1424(class257.field4496, super.field4319 + var40, (byte) 50, super.field4348 + var41);
                    int var43 = var27 + var42;
                    if (~(var32 + var37) > ~var43) {
                        var43 = var32 + var37;
                    }
                    int var44 = var32 <= var27 ? var32 : var27;
                    int var45 = var37 < var42 ? var37 : var42;
                    int var46 = var42 <= var32 ? var42 : var32;
                    if (var22 != 0) {
                        var16 = 2047 & (int) (Math.atan2((double) (-var45 + var44), (double) var22) * 325.95D);
                        if (var16 != 0) {
                            var13.method436(var16);
                        }
                    }
                    int var47 = var27 >= var37 ? var37 : var27;
                    if (~var21 != -1) {
                        var17 = (int) (325.95D * Math.atan2((double) (-var46 + var47), (double) var21)) & 2047;
                        if (var17 != 0) {
                            var13.method451(var17);
                        }
                    }
                    var18 = (var43 >> 1) + -super.field4328;
                    if (~var18 != -1) {
                        var13.method448(0, var18, 0);
                    }
                }
                class65 var48 = null;
                if (super.field4334 != -1 && ~super.field4306 != 0) {
                    class82 var49 = class195.method1384(super.field4334, 0);
                    var48 = var49.method639((byte) -4, super.field4306);
                    if (var48 != null) {
                        var48.method448(0, -super.field4357, 0);
                        if (var49.field1364) {
                            if (~var16 != -1) {
                                var48.method436(var16);
                            }
                            if (~var17 != -1) {
                                var48.method451(var17);
                            }
                            if (~var18 != -1) {
                                var48.method448(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class137) var13).method994(var48);
                }
                if (this.field1392.field118 == 1) {
                    var13.field1053 = true;
                }
                var13.method96(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(B)Z")
    public static final boolean method644(byte arg0) {
        ++field1393;
        if (arg0 != -71) {
            field1400 = null;
        }
        if (~class234.field4088 != -1) {
            try {
                class9.field99.method295(arg0 ^ 12190, class25.field376.field3999);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
    public final int method94() {
        ++field1397;
        return super.field4313;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V")
    public static final void method645(int arg0, int arg1) {
        if (arg0 != -5428) {
            method648((byte) 20);
        }
        class27.field390 = 1000 / arg1;
        ++field1396;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)Z")
    public final boolean method646(byte arg0) {
        if (arg0 > -52) {
            this.method96(-113, -64, 3, 81, -34, -71, 108, -104, -34L);
        }
        ++field1398;
        return this.field1392 != null;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(II)I")
    public static final int method647(int arg0, int arg1) {
        int var2 = 89 / ((arg1 - -83) / 43);
        ++field1391;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(B)V")
    public static void method648(byte arg0) {
        field1394 = null;
        field1399 = null;
        if (arg0 != -93) {
            field1399 = null;
        }
        field1400 = null;
    }
}
