import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class123 {

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Z")
    private boolean field378 = true;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "Z")
    private boolean field380 = true;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Leb;")
    public static class230 field377 = class68.method589(0, "<img=1>");

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field379 = 0;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "Leb;")
    public static class230 field382 = class68.method589(0, "Konfig geladen)3");

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    public static int field386 = 0;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field387 = -1;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "J")
    public static long field381;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            this.field380 = true;
        }
        ++field374;
        int[][] var3 = super.field2152.method1106(arg0, arg1 + -33114);
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, !this.field380 ? arg0 : class79.field1431 - arg0, (byte) -67);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field378) {
                for (int var11 = 0; ~class140.field2505 < ~var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var7[var11];
                    var10[var11] = var6[var11];
                }
            } else {
                for (int var12 = 0; class140.field2505 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class217.field3743];
                    var9[var12] = var7[-var12 + class217.field3743];
                    var10[var12] = var6[-var12 + class217.field3743];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILob;)V")
    public static final void method214(int arg0, class128 arg1) {
        ++field373;
        int var2 = arg1.field2238 - class259.field4584;
        int var3 = arg1.field2277 * 128 + 64 * arg1.method1005(0);
        int var4 = arg1.field2262 * 128 - -(64 * arg1.method1005(arg0 + 21555));
        arg1.field2274 += (-arg1.field2274 + var3) / var2;
        arg1.field2264 = 0;
        if (arg1.field2272 == 0) {
            arg1.field2278 = 1024;
        }
        arg1.field2300 += (-arg1.field2300 + var4) / var2;
        if (arg0 != -21555) {
            field377 = null;
        }
        if (arg1.field2272 == 1) {
            arg1.field2278 = 1536;
        }
        if (~arg1.field2272 == -3) {
            arg1.field2278 = 0;
        }
        if (arg1.field2272 == 3) {
            arg1.field2278 = 512;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class17() {
        super(1, false);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field376;
        int[] var3 = super.field2160.method1323((byte) 48, arg0);
        if (super.field2160.field3243) {
            int[] var4 = this.method965(0, !this.field380 ? arg0 : -arg0 + class79.field1431, (byte) 69);
            if (this.field378) {
                for (int var5 = 0; ~class140.field2505 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class217.field3743];
                }
            } else {
                class43.method377(var4, 0, var3, 0, class140.field2505);
            }
        }
        int var6 = -25 % ((arg1 - -24) / 57);
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(II)V")
    public static final void method215(int arg0, int arg1) {
        class102.field1865.method1121(arg1, arg0);
        ++field384;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field375;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2147 = ~arg1.method200(arg2 ^ 1876195635) == -2;
                }
            } else {
                this.field380 = arg1.method200(255) == 1;
            }
        } else {
            this.field378 = arg1.method200(arg2 + -1876195533) == 1;
        }
        if (arg2 != 1876195788) {
            field379 = -45;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
    public static final void method216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class182.method1311(arg1, arg2 - -arg3, true, class66.field1254[arg0], -arg3 + arg2);
        int var6 = 0;
        ++field385;
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 - -var10;
        int var14 = var8 << 2;
        int var15 = var9 << 2;
        int var16 = -((var12 + -1) * var11) + var9;
        int var17 = (var6 - arg5) * var15;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = (arg4 + -1) * var14;
        int var20 = ((arg4 << 1) - 3) * var11;
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    ++var6;
                    var16 += var17;
                    var17 += var15;
                    var13 += var18;
                    var18 += var15;
                }
            }
            --var7;
            int var21 = arg0 - var7;
            if (var16 < 0) {
                ++var6;
                var16 += var17;
                var17 += var15;
                var13 += var18;
                var18 += var15;
            }
            var16 += -var20;
            var13 += -var19;
            var20 -= var14;
            int var22 = arg0 + var7;
            var19 -= var14;
            int var23 = arg2 + var6;
            int var24 = -var6 + arg2;
            class182.method1311(arg1, var23, true, class66.field1254[var21], var24);
            class182.method1311(arg1, var23, true, class66.field1254[var22], var24);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLeb;)I")
    public static final int method217(byte arg0, class230 arg1) {
        int var2 = -25 % ((-24 - arg0) / 56);
        ++field383;
        return 1 + arg1.method1635(-39);
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static void method218(int arg0) {
        if (arg0 != 3) {
            method215(-123, 58);
        }
        field377 = null;
        field382 = null;
    }
}
