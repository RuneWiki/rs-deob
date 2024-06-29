import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class131 extends class221 {

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    private int field1870 = 0;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "Lqf;")
    private class390 field1867 = new class390();

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
    public static int[] field1857 = new int[14];

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "J")
    public static long field1869 = 0L;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[I")
    public static int[] field1873 = new int[64];

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 4)
    public static void method1017(int arg0) {
        field1857 = null;
        if (arg0 == 30) {
            field1873 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IFZILsa;)V", line = 15)
    public final void method1018(int arg0, float arg1, boolean arg2, int arg3, class411 arg4) {
        super.field3046[super.field3050] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
        if (arg0 != 0) {
            field1860 = -34;
        }
        ++field1862;
        super.field3053[super.field3050] = arg4;
        super.field3048[super.field3050] = arg1;
        ++super.field3050;
        if (~super.field3050 <= -5001) {
            super.field3050 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILdg;)V", line = 33)
    public final void method1019(int arg0, class224 arg1) {
        super.field3046[super.field3050] = 21;
        ++field1868;
        if (arg0 != 0) {
            this.method1020((byte) -27);
        }
        super.field3053[super.field3050] = arg1;
        ++super.field3050;
        if (super.field3050 >= 5000) {
            super.field3050 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 51)
    public final void method1020(byte arg0) {
        ++field1864;
        if (arg0 <= 61) {
            this.method1026(true, -98);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLdg;)V", line = 65)
    public final void method1021(byte arg0, class224 arg1) {
        super.field3046[super.field3050] = 20;
        ++field1859;
        super.field3053[super.field3050] = arg1;
        if (arg0 > 63) {
            ++super.field3050;
            if (~super.field3050 <= -5001) {
                super.field3050 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V", line = 82)
    private final void method1022(int arg0) {
        ++field1871;
        int var2 = super.field3056++;
        if (~super.field3056 <= -5001) {
            super.field3056 = 0;
        }
        this.field1870 = super.field3046[var2];
        Object var3 = super.field3053[var2];
        super.field3053[var2] = null;
        if (arg0 == 0) {
            if (~this.field1870 == -22) {
                class450.method2797(this.field1867, (class224) var3);
            } else if (this.field1870 != 20) {
                if (this.field1870 >= 30 && this.field1870 <= 33) {
                    class91.field1347.method108(3000.0F, super.field3048[var2] * 1.5F);
                    ((class411) var3).method1510(class134.field1914, class31.field516, class303.field4107, class227.field3147, this.field1870 + -30 == 0);
                } else if (~this.field1870 <= -41 && ~this.field1870 >= -44) {
                    class91.field1347.method108(3000.0F, super.field3048[var2] * 1.5F);
                    ((class411) var3).method1510(class134.field1914, class31.field516, class303.field4107, class400.field5594, ~(this.field1870 + -40) == -1);
                } else if (this.field1870 == 22) {
                    class91.field1347.method137(-1, 1583160, 40);
                } else if (this.field1870 == 23) {
                    class91.field1347.method148();
                } else if (~this.field1870 == -25) {
                    class91.field1347.method141(0, (class269[]) null);
                }
            } else {
                class224 var4 = (class224) var3;
                if (var4.field3108 != null) {
                    var4.field3108.method581(0, class91.field1347);
                }
                if (var4.field3125 != null) {
                    var4.field3125.method581(0, class91.field1347);
                }
                if (var4.field3121 != null) {
                    var4.field3121.method581(0, class91.field1347);
                }
                if (var4.field3116 != null) {
                    var4.field3116.method581(0, class91.field1347);
                }
                if (var4.field3124 != null) {
                    var4.field3124.method581(0, class91.field1347);
                }
                for (class26 var5 = var4.field3129; var5 != null; var5 = var5.field463) {
                    var5.field460.method581(0, class91.field1347);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 173)
    public static final int method1023(int arg0, int arg1, int arg2, int arg3) {
        ++field1863;
        int var4 = arg2 / arg0;
        int var5 = arg2 & arg0 + -1;
        int var6 = arg1 / arg0;
        int var7 = arg1 & arg0 + -1;
        int var8 = class29.method336(var4, 6443, var6);
        int var9 = class29.method336(var4 + 1, 6443, var6);
        int var10 = class29.method336(var4, 6443, var6 + 1);
        int var11 = class29.method336(var4 + 1, arg3 + 6473, var6 + 1);
        int var12 = class134.method1074(var8, arg3 ^ -106, var5, var9, arg0);
        int var13 = class134.method1074(var10, 116, var5, var11, arg0);
        return arg3 != -30 ? 29 : class134.method1074(var12, 111, var7, var13, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(ZI)Ldj;", line = 204)
    public static final class305 method1024(boolean arg0, int arg1) {
        ++field1866;
        class305 var2 = (class305) class390.field5476.method361((long) arg1, (byte) -61);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class276.field3723.method2633(arg1, -1, 19);
            class305 var4 = new class305();
            if (var3 != null) {
                var4.method1969(new class289(var3), -15585);
            }
            class390.field5476.method360(arg0, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ldg;I)V", line = 225)
    public final void method1025(class224 arg0, int arg1) {
        --super.field3056;
        ++field1865;
        if (arg1 < ~super.field3056) {
            super.field3056 = 4999;
        }
        super.field3046[super.field3056] = 21;
        super.field3053[super.field3056] = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V", line = 239)
    public final void method1026(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1019(-44, (class224) null);
        }
        ++field1858;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 253)
    public final void method1027(int arg0, int arg1) {
        if (arg0 == 2) {
            ++field1861;
            super.field3046[super.field3050] = (byte) arg1;
            ++super.field3050;
            if (super.field3050 >= 5000) {
                super.field3050 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 290)
    public final void method1028(byte arg0) {
        ++field1872;
        while (super.field3056 != super.field3050) {
            this.method1022(0);
        }
        if (arg0 <= 21) {
            this.field1870 = -123;
        }
    }
}
