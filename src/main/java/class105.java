import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class105 extends class222 {

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    private int field1863 = 12288;

    @OriginalMember(owner = "client!aj", name = "hb", descriptor = "I")
    private int field1869 = 2048;

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
    private int field1868 = 8192;

    @OriginalMember(owner = "client!aj", name = "nb", descriptor = "I")
    private int field1875 = 0;

    @OriginalMember(owner = "client!aj", name = "tb", descriptor = "I")
    private int field1881 = 2048;

    @OriginalMember(owner = "client!aj", name = "rb", descriptor = "I")
    private int field1879 = 0;

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "I")
    private int field1867 = 4096;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
    public static int field1866 = 0;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "Lsb;")
    public static class98 field1861 = class47.method368("::gc", 0);

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "Lsb;")
    public static class98 field1864 = class47.method368("runes", 0);

    @OriginalMember(owner = "client!aj", name = "pb", descriptor = "[Lbe;")
    public static class14[] field1877 = new class14[5000];

    @OriginalMember(owner = "client!aj", name = "qb", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!aj", name = "ib", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!aj", name = "kb", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!aj", name = "lb", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!aj", name = "mb", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!aj", name = "ob", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!aj", name = "sb", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)V")
    public static final void method802(byte arg0) {
        for (int var1 = 0; ~var1 > ~class104.field1855; ++var1) {
            int var3 = class244.field4240[var1];
            class192 var4 = class141.field2499[var3];
            int var5 = class144.field2536.method1446(5350);
            if ((var5 & 2) != 0) {
                var5 += class144.field2536.method1446(5350) << 8;
            }
            class217.method1496(var4, var5, var3, 100);
        }
        int var2 = 101 / ((arg0 - 78) / 33);
        ++field1876;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ltg;Ltg;I)V")
    public static final void method803(class75 arg0, class75 arg1, int arg2) {
        ++field1862;
        class115.field2058 = arg1;
        class136.field2401 = arg0;
        class71.field1139 = class115.field2058.method550(-1757152080, arg2);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)V")
    public static final void method804(int arg0) {
        class31.field557 = 0;
        class104.field1855 = 0;
        ++field1873;
        class244.method1682(arg0 + 21798);
        class122.method912(arg0 + -63);
        class142.method1062(301);
        int var1 = 0;
        if (arg0 != 64) {
            method807(-32, 13);
        }
        while (~class31.field557 < ~var1) {
            int var3 = class115.field2071[var1];
            if (class236.field4071 != class180.field3109[var3].field4456) {
                if (class180.field3109[var3].field1928.method893(-9737)) {
                    class2.method10(class180.field3109[var3], arg0 + -1042);
                }
                class180.field3109[var3].field1928 = null;
                class180.field3109[var3] = null;
            }
            ++var1;
        }
        if (~class47.field789 != ~class144.field2536.field3728) {
            throw new RuntimeException("gnp1 pos:" + class144.field2536.field3728 + " psize:" + class47.field789);
        } else {
            for (int var2 = 0; ~class222.field3837 < ~var2; ++var2) {
                if (class180.field3109[class87.field1546[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class222.field3837);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lki;II)V")
    public static final void method805(class255 arg0, int arg1, int arg2) {
        if (class236.field4071 < arg0.field4476) {
            class109.method826(arg0, (byte) 23);
        } else if (~class236.field4071 < ~arg0.field4515) {
            class78.method591(arg0, 27168);
        } else {
            class87.method653(-117, arg0);
        }
        if (arg1 <= 10) {
            field1872 = -106;
        }
        ++field1871;
        if (arg0.field4492 < 128 || ~arg0.field4466 > -129 || arg0.field4492 >= 13184 || arg0.field4466 >= 13184) {
            arg0.field4515 = 0;
            arg0.field4503 = -1;
            arg0.field4461 = -1;
            arg0.field4466 = arg0.field4491[0] * 128 + arg0.field4486 * 64;
            arg0.field4492 = arg0.field4501[0] * 128 + arg0.field4486 * 64;
            arg0.field4476 = 0;
            arg0.method1769((byte) 123);
        }
        if (class163.field2943 == arg0 && (arg0.field4492 < 1536 || ~arg0.field4466 > -1537 || ~arg0.field4492 <= -11777 || arg0.field4466 >= 11776)) {
            arg0.field4461 = -1;
            arg0.field4476 = 0;
            arg0.field4466 = arg0.field4491[0] * 128 + arg0.field4486 * 64;
            arg0.field4492 = arg0.field4501[0] * 128 + arg0.field4486 * 64;
            arg0.field4503 = -1;
            arg0.field4515 = 0;
            arg0.method1769((byte) 85);
        }
        class31.method282(arg0, 55);
        class205.method1387((byte) 102, arg0);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)Z")
    private final boolean method806(int arg0, int arg1, int arg2) {
        int var4 = (arg2 - -arg1) * this.field1863 >> 12;
        ++field1874;
        int var5 = class132.field2351[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1863;
        int var7 = 16 % ((arg0 - -40) / 54);
        int var8 = (var6 << 12) / this.field1868;
        int var9 = this.field1867 * var8 >> 12;
        return -arg1 + arg2 < var9 && ~(-arg1 + arg2) < ~(-var9);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field1858;
        if (arg1) {
            this.field1868 = -8;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field1868 = arg0.method1487(41);
                                }
                            } else {
                                this.field1867 = arg0.method1487(120);
                            }
                        } else {
                            this.field1863 = arg0.method1487(39);
                        }
                    } else {
                        this.field1869 = arg0.method1487(42);
                    }
                } else {
                    this.field1879 = arg0.method1487(64);
                }
            } else {
                this.field1875 = arg0.method1487(113);
            }
        } else {
            this.field1881 = arg0.method1487(38);
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(II)I")
    public static final int method807(int arg0, int arg1) {
        if (arg1 != 128) {
            return -2;
        } else {
            class191 var2 = class163.method1177(arg0, 20913);
            int var3 = var2.field3310;
            ++field1870;
            int var4 = var2.field3314;
            int var5 = var2.field3303;
            int var6 = class85.field1489[-var3 + var4];
            return var6 & class118.field2117[var5] >> var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)Z")
    private final boolean method808(int arg0, int arg1, byte arg2) {
        ++field1859;
        int var4 = (-arg1 + arg0) * this.field1863 >> 12;
        int var5 = class132.field2351[(1044934 & var4 * 255) >> 12];
        if (arg2 > -123) {
            this.field1868 = 30;
        }
        int var6 = (var5 << 12) / this.field1863;
        int var7 = (var6 << 12) / this.field1868;
        int var8 = this.field1867 * var7 >> 12;
        return ~var8 < ~(arg0 + arg1) && -var8 < arg1 - -arg0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIBIII)I")
    public static final int method809(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (~(1 & arg2) == -2) {
            int var7 = arg1;
            arg1 = arg5;
            arg5 = var7;
        }
        int var8 = arg6 & 3;
        ++field1860;
        if (arg3 != -13) {
            field1861 = null;
        }
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return -arg1 - (-1 - (-arg0 + 7));
        } else {
            return ~var8 == -3 ? -arg4 - (arg5 - 1) + 7 : arg0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field1880;
        int var2 = -101 / ((arg0 - 57) / 51);
        class133.method1002(0);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1865;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int var4 = class214.field3639[arg1] - 2048;
            for (int var5 = 0; ~var5 > ~class13.field253; ++var5) {
                int var6 = class261.field4577[var5] + -2048;
                int var7 = this.field1881 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field1875 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field1879 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = var4 - -this.field1869;
                int var16 = var15 >= -2048 ? var15 : var15 + 4096;
                int var17 = var14 <= 2048 ? var14 : var14 + -4096;
                int var18 = var16 > 2048 ? var16 + -4096 : var16;
                var3[var5] = !this.method808(var12, var9, (byte) -127) && !this.method806(14, var17, var18) ? 0 : 4096;
            }
        }
        if (arg0 <= 35) {
            this.field1868 = 61;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(B)V")
    public static void method810(byte arg0) {
        field1861 = null;
        field1864 = null;
        field1877 = null;
        if (arg0 != -117) {
            method802((byte) 91);
        }
    }
}
