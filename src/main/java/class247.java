import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class247 extends class200 {

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "Z")
    public boolean field4242 = false;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "Laj;")
    private class47 field4243;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "Z")
    private boolean field4238;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Z")
    private boolean field4233;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    private int field4234;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "[I")
    public static int[] field4245 = new int[5];

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "Lrd;")
    public static class267 field4239 = new class267();

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "Loa;")
    public static class99 field4247 = class221.method1463(2844, ":clanreq:");

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "J")
    public static long field4249 = 0L;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "Lwk;")
    public static class273 field4250 = new class273(5);

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "F")
    private float field4241;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "I")
    public static int field4252;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "[I")
    private int[] field4231;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLoa;)V")
    public static final void method1597(boolean arg0, class99 arg1) {
        class79.method552(false, 112);
        if (arg0) {
            class193.method1306(80, arg1);
            field4240++;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)V")
    public final void method1598(byte arg0, int arg1) {
        field4236++;
        if (this.field4231 == null) {
            return;
        }
        int var3 = -128 % ((-arg0 - 65) / 44);
        if (this.field4234 == 0 && this.field4237 == 0) {
            return;
        }
        if (class44.field769 == null || this.field4231.length > class44.field769.length) {
            class44.field769 = new int[this.field4231.length];
        }
        int var4 = this.field4231.length;
        int var5 = this.field4231.length == 4096 ? 64 : 128;
        int var6 = this.field4237 * arg1;
        int var7 = var5 - 1;
        int var8 = this.field4234 * arg1 * var5;
        int var9 = var4 - 1;
        for (int var10 = 0; var10 < var4; var10 += var5) {
            int var12 = var9 & var8 + var10;
            for (int var13 = 0; var13 < var5; var13++) {
                int var14 = var10 + var13;
                int var15 = (var7 & var6 + var13) + var12;
                class44.field769[var14] = this.field4231[var15];
            }
        }
        int[] var11 = this.field4231;
        this.field4231 = class44.field769;
        class44.field769 = var11;
    }

    @OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field4248++;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V")
    public static final void method1599(int arg0) {
        int var1 = 0;
        field4230++;
        for (int var2 = arg0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class128.method850(class128.field2236, var1, var2, var3, true, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ltg;BLq;)Z")
    public final boolean method1600(class182 arg0, byte arg1, class126 arg2) {
        if (arg1 > -116) {
            return false;
        } else {
            field4246++;
            return this.field4243.method340(arg0, false, arg2);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lni;")
    public static final class153 method1601(int arg0, int arg1) {
        field4235++;
        class153 var2 = (class153) class34.field608.method1811((long) arg1, arg0 ^ 0xFFFF9A3D);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class172.field3056.method1242(class12.method81((byte) 117, arg1), class256.method1656((byte) 18, arg1), arg0 - 19211);
        class153 var4 = new class153();
        var4.field2709 = arg1;
        if (var3 != null) {
            var4.method1021(127, new class261(var3));
        }
        var4.method1030(0);
        if (arg0 != 26012) {
            method1602(87);
        }
        if (!class200.field3473 && var4.field2688) {
            var4.field2684 = null;
        }
        if (var4.field2747) {
            var4.field2685 = 0;
            var4.field2751 = false;
        }
        class34.field608.method1817((long) arg1, arg0 - 25996, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
    public static void method1602(int arg0) {
        if (arg0 != 255) {
            method1601(82, -47);
        }
        field4239 = null;
        field4247 = null;
        field4250 = null;
        field4245 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(FLq;Ltg;ZB)[I")
    public final int[] method1603(float arg0, class126 arg1, class182 arg2, boolean arg3, byte arg4) {
        field4252++;
        if (this.field4231 == null || this.field4241 != arg0) {
            if (!this.field4243.method340(arg2, false, arg1)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field4231 = this.field4243.method341(true, (double) arg0, this.field4233, var6, -121, arg2, var6, arg1);
            this.field4241 = arg0;
            if (this.field4238) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6;
                int var13 = var6 - 1;
                int var14 = var6 - 1;
                int var15 = var6;
                int var16 = var6;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var13; var34 >= 0; var34--) {
                        var15--;
                        int var35 = this.field4231[var15];
                        var7[var34] += class71.method502(var35, 16729143) >> 16;
                        var8[var34] += class71.method502(var35 >> 8, 255);
                        var9[var34] += class71.method502(255, var35);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var14; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var22--;
                        var23 += var8[var22];
                        var25 += var7[var22];
                        var24 += var9[var22];
                        if (var22 == 0) {
                            var22 = var12;
                        }
                    }
                    for (int var27 = var13; var27 >= 0; var27--) {
                        var22--;
                        var21--;
                        int var31 = var24 / 9;
                        int var32 = var25 / 9;
                        int var33 = var23 / 9;
                        var19--;
                        var10[var19] = class179.method1194(class179.method1194(var33 << 8, var32 << 16), var31);
                        var25 += var7[var22] - var7[var21];
                        var24 += var9[var22] - var9[var21];
                        var23 += var8[var22] - var8[var21];
                        if (var21 == 0) {
                            var21 = var12;
                        }
                        if (var22 == 0) {
                            var22 = var12;
                        }
                    }
                    for (int var28 = var13; var28 >= 0; var28--) {
                        var15--;
                        int var29 = this.field4231[var15];
                        var16--;
                        int var30 = this.field4231[var16];
                        var7[var28] += class71.method502(255, var29 >> 16) - (class71.method502(16747487, var30) >> 16);
                        var8[var28] += -class71.method502(var30 >> 8, 255) + (class71.method502(var29, 65521) >> 8);
                        var9[var28] += class71.method502(var29, 255) - class71.method502(255, var30);
                    }
                    if (var16 == 0) {
                        var16 = var17;
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                }
                this.field4231 = var10;
            }
        }
        return arg4 < 85 ? null : this.field4231;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLtg;ZLq;)[I")
    public final int[] method1604(boolean arg0, class182 arg1, boolean arg2, class126 arg3) {
        field4232++;
        if (this.field4243.method340(arg1, arg0, arg3)) {
            int var5 = arg2 ? 64 : 128;
            return this.field4243.method341(false, 1.0D, this.field4233, var5, 61, arg1, var5, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lik;)V")
    public class247(class261 arg0) {
        this.field4243 = new class47(arg0);
        this.field4238 = arg0.method1693((byte) 72) == 1;
        this.field4233 = arg0.method1693((byte) -103) == 1;
        arg0.method1693((byte) 105);
        arg0.method1693((byte) -107);
        int var2 = arg0.method1693((byte) -114) & 0x3;
        this.field4237 = arg0.method1706(10819);
        this.field4234 = arg0.method1706(10819);
        arg0.method1693((byte) -108);
        arg0.method1693((byte) -105);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BD)V")
    public static final void method1605(byte arg0, double arg1) {
        if (class119.field2110 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class146.field2591[var3] = var4 <= 255 ? var4 : 255;
            }
            class119.field2110 = arg1;
        }
        if (arg0 != 77) {
            field4245 = null;
        }
        field4244++;
    }
}
