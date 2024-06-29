import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class355 extends class214 {

    @OriginalMember(owner = "client!ol", name = "O", descriptor = "I")
    private int field4938 = 0;

    @OriginalMember(owner = "client!ol", name = "K", descriptor = "I")
    private int field4934 = 0;

    @OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
    private int field4936 = 0;

    @OriginalMember(owner = "client!ol", name = "ab", descriptor = "Lcs;")
    public static class351 field4950 = new class351(62, 6);

    @OriginalMember(owner = "client!ol", name = "cb", descriptor = "Lcs;")
    public static class351 field4952 = new class351(63, 11);

    @OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
    public static int field4955 = -1;

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ol", name = "L", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!ol", name = "N", descriptor = "I")
    private int field4937;

    @OriginalMember(owner = "client!ol", name = "P", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
    private int field4940;

    @OriginalMember(owner = "client!ol", name = "R", descriptor = "I")
    private int field4941;

    @OriginalMember(owner = "client!ol", name = "S", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!ol", name = "U", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ol", name = "V", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!ol", name = "W", descriptor = "I")
    private int field4946;

    @OriginalMember(owner = "client!ol", name = "X", descriptor = "I")
    private int field4947;

    @OriginalMember(owner = "client!ol", name = "Y", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ol", name = "Z", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ol", name = "db", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!ol", name = "eb", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!ol", name = "bb", descriptor = "[[[J")
    public static long[][][] field4951;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)Z", line = 4)
    public static final boolean method2132(byte arg0, int arg1) {
        class297.field4096 = true;
        if (arg0 != -80) {
            field4951 = null;
        }
        class421.field5795 = 65535 & arg1 - -1;
        ++field4942;
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Llk;II)V", line = 22)
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field4943;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4938 = (arg0.method2480(-8315) << 12) / 100;
                }
            } else {
                this.field4934 = (arg0.method2480(-8315) << 12) / 100;
            }
        } else {
            this.field4936 = arg0.method2514(9786);
        }
        if (arg1 >= -114) {
            field4953 = -98;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 93)
    public class355() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILms;Lms;)V", line = 75)
    public static final void method2133(int arg0, class363 arg1, class363 arg2) {
        ++field4949;
        if (arg0 != 2) {
            method2138((class425) null, (byte) 65);
        }
        ++class84.field1261;
        class131.method793(class419.field5784, arg0 + -45);
        class366.field5214.method2481(arg2.field5096, true);
        class366.field5214.method2453(arg2.field5195, true);
        class366.field5214.method2501(arg2.field5047, -128);
        class366.field5214.method2462(arg1.field5047, (byte) -123);
        class366.field5214.method2487(arg0 + -2, arg1.field5096);
        class366.field5214.method2475(arg0 ^ 130, arg1.field5195);
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V", line = 102)
    public static final void method2134(int arg0) {
        ++field4948;
        for (class462 var1 = (class462) class178.field2594.method1544(-95); var1 != null; var1 = (class462) class178.field2594.method1546((byte) -42)) {
            if (var1.field6499) {
                var1.method2733(0);
            }
        }
        if (arg0 != -24840) {
            field4952 = null;
        }
        for (class462 var2 = (class462) class366.field5213.method1544(-112); var2 != null; var2 = (class462) class366.field5213.method1546((byte) -42)) {
            if (var2.field6499) {
                var2.method2733(arg0 + 24840);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)[[I", line = 135)
    public final int[][] method11(int arg0, byte arg1) {
        ++field4939;
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (arg1 != 92) {
            this.field4937 = -89;
        }
        if (super.field3030.field6644) {
            int[][] var4 = this.method1354(0, arg0, (byte) 23);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class399.field5585; ++var11) {
                this.method2137(var5[var11], arg1 + 29, var7[var11], var6[var11]);
                this.field4945 += this.field4934;
                this.field4946 += this.field4936;
                this.field4940 += this.field4938;
                while (~this.field4946 > -1) {
                    this.field4946 += 4096;
                }
                while (this.field4946 > 4096) {
                    this.field4946 -= 4096;
                }
                if (~this.field4945 > -1) {
                    this.field4945 = 0;
                }
                if (~this.field4945 < -4097) {
                    this.field4945 = 4096;
                }
                if (this.field4940 < 0) {
                    this.field4940 = 0;
                }
                if (this.field4940 > 4096) {
                    this.field4940 = 4096;
                }
                this.method2135(this.field4940, -6825, this.field4946, this.field4945);
                var8[var11] = this.field4947;
                var9[var11] = this.field4941;
                var10[var11] = this.field4937;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)V", line = 209)
    private final void method2135(int arg0, int arg1, int arg2, int arg3) {
        ++field4933;
        int var5 = arg0 > 2048 ? arg0 + arg3 + -(arg0 * arg3 >> 12) : (arg3 + 4096) * arg0 >> 12;
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = arg0 + arg0 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field4941 = var7;
                                    this.field4947 = var5;
                                    this.field4937 = var15;
                                }
                            } else {
                                this.field4947 = var14;
                                this.field4937 = var5;
                                this.field4941 = var7;
                            }
                        } else {
                            this.field4937 = var5;
                            this.field4947 = var7;
                            this.field4941 = var15;
                        }
                    } else {
                        this.field4941 = var5;
                        this.field4947 = var7;
                        this.field4937 = var14;
                    }
                } else {
                    this.field4947 = var15;
                    this.field4941 = var5;
                    this.field4937 = var7;
                }
            } else {
                this.field4947 = var5;
                this.field4937 = var7;
                this.field4941 = var14;
            }
        } else {
            this.field4947 = this.field4941 = this.field4937 = arg0;
        }
        if (arg1 != -6825) {
            this.method2137(2, -28, -22, 72);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 314)
    public static void method2136(byte arg0) {
        int var1 = 59 / ((arg0 - -76) / 36);
        field4951 = null;
        field4952 = null;
        field4950 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IIII)V", line = 325)
    private final void method2137(int arg0, int arg1, int arg2, int arg3) {
        ++field4935;
        int var5 = arg0 <= arg3 ? arg3 : arg0;
        int var6 = var5 < arg2 ? arg2 : var5;
        int var7 = arg3 <= arg0 ? arg3 : arg0;
        int var8 = var7 > arg2 ? arg2 : var7;
        if (arg1 <= 76) {
            field4952 = null;
        }
        this.field4940 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (this.field4940 > 0 && ~this.field4940 > -4097) {
            this.field4945 = (var9 << 12) / (~this.field4940 < -2049 ? 8192 - this.field4940 * 2 : this.field4940 * 2);
        } else {
            this.field4945 = 0;
        }
        if (var9 <= 0) {
            this.field4946 = 0;
        } else {
            int var10 = (var6 - arg0 << 12) / var9;
            int var11 = (-arg3 + var6 << 12) / var9;
            int var12 = (var6 - arg2 << 12) / var9;
            if (~arg0 == ~var6) {
                this.field4946 = ~arg3 != ~var8 ? -var11 + 4096 : var12 + 20480;
            } else if (arg3 != var6) {
                this.field4946 = ~arg0 != ~var8 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field4946 = arg2 == var8 ? 4096 - -var10 : -var12 + 12288;
            }
            this.field4946 /= 6;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Llk;B)Lip;", line = 386)
    public static final class387 method2138(class425 arg0, byte arg1) {
        ++field4944;
        if (arg1 != 71) {
            method2132((byte) -93, -47);
        }
        return new class387(arg0.method2514(9786), arg0.method2514(arg1 + 9715), arg0.method2514(9786), arg0.method2514(9786), arg0.method2498(3), arg0.method2498(3), arg0.method2503(true));
    }
}
