import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class187 implements class162 {

    @OriginalMember(owner = "client!cka", name = "h", descriptor = "Lqda;")
    private class113 field2261 = new class113(256);

    @OriginalMember(owner = "client!cka", name = "k", descriptor = "Lbt;")
    private class48 field2264;

    @OriginalMember(owner = "client!cka", name = "l", descriptor = "Lbt;")
    private class48 field2265;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "[Lgd;")
    private class359[] field2257;

    @OriginalMember(owner = "client!cka", name = "g", descriptor = "Ltu;")
    public static class369 field2260 = new class369(2);

    @OriginalMember(owner = "client!cka", name = "o", descriptor = "I")
    public static int field2268 = 0;

    @OriginalMember(owner = "client!cka", name = "m", descriptor = "[Lnja;")
    public static class456[] field2266 = new class456[37];

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!cka", name = "i", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!cka", name = "j", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!cka", name = "n", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(II)Lgd;", line = 6)
    public final class359 method1138(int arg0, int arg1) {
        field2262++;
        return arg1 <= 21 ? null : this.field2257[arg0];
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIZIIF)[I", line = 18)
    public final int[] method1139(int arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5) {
        field2258++;
        if (arg1 != 11196) {
            field2266 = null;
        }
        return this.method1242(arg0, (byte) -100).method2744((double) arg5, this.field2264, arg1 ^ 0xFFFFD43E, arg3, this, this.field2257[arg0].field4452, arg4);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIIFZI)[F", line = 29)
    public final float[] method1136(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        if (arg5 != -116) {
            this.method1138(-1, -109);
        }
        field2263++;
        return this.method1242(arg1, (byte) -109).method2747(this, this.field2264, -1, arg2, arg0, this.field2257[arg1].field4452);
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)V", line = 41)
    public static void method1241(int arg0) {
        int var1 = 64 % ((-arg0 - 47) / 61);
        field2266 = null;
        field2260 = null;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IFZIIB)[I", line = 52)
    public final int[] method1135(int arg0, float arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field2259++;
        return arg5 == -26 ? this.method1242(arg0, (byte) -69).method2746(arg3, this.field2257[arg0].field4452, (byte) -113, this, (double) arg1, arg4, arg2, this.field2264) : null;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)Z", line = 64)
    public final boolean method1137(int arg0, int arg1) {
        if (arg0 != 12429) {
            this.method1136(123, -23, -125, -0.8024046F, true, 127);
        }
        field2267++;
        class453 var3 = this.method1242(arg1, (byte) -119);
        return var3 != null && var3.method2749((byte) 81, this, this.field2264);
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)I", line = 82)
    public final int method1134(int arg0) {
        field2254++;
        if (arg0 != 31932) {
            this.method1139(-73, -54, true, 75, -82, -0.9260389F);
        }
        return this.field2255;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)Lmea;", line = 96)
    private final class453 method1242(int arg0, byte arg1) {
        field2256++;
        class152 var3 = this.field2261.method901((long) arg0, -40);
        if (var3 != null) {
            return (class453) var3;
        }
        byte[] var4 = this.field2265.method453(arg0, 11040);
        if (var4 == null) {
            return null;
        }
        if (arg1 > -46) {
            this.method1135(-128, -1.154793F, false, -12, 43, (byte) 49);
        }
        class453 var5 = new class453(new class403(var4));
        this.field2261.method897((long) arg0, var5, false);
        return var5;
    }

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "(II)V", line = 122)
    public static final void method1243(int arg0, int arg1) {
        class196 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class296 var4 = class707.field9933[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class250.field2938; var5++) {
                    for (int var6 = 0; var6 < class307.field3799; var6++) {
                        var2 = var4.method1399(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class714.field10017;
                            int var8 = var5 << class714.field10017;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class296 var10 = class707.field9933[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1728(var5, (byte) -36, var6) - var10.method1728(var5, (byte) -62, var6);
                                    int var12 = var4.method1728(var5, (byte) -105, var6 + 1) - var10.method1728(var5, (byte) -88, var6 + 1);
                                    int var13 = var4.method1728(var5 + 1, (byte) -59, var6 + 1) - var10.method1728(var5 + 1, (byte) -70, var6 + 1);
                                    int var14 = var4.method1728(var5 + 1, (byte) -27, var6) - var10.method1728(var5 + 1, (byte) -66, var6);
                                    var10.method1402(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lbt;Lbt;Lbt;)V", line = 191)
    public class187(class48 arg0, class48 arg1, class48 arg2) {
        this.field2264 = arg2;
        this.field2265 = arg1;
        class403 var4 = new class403(arg0.method437(0, (byte) 88, 0));
        this.field2255 = var4.method2390((byte) -113);
        this.field2257 = new class359[this.field2255];
        for (int var5 = 0; var5 < this.field2255; var5++) {
            if (var4.method2396((byte) -110) == 1) {
                this.field2257[var5] = new class359();
            }
        }
        for (int var6 = 0; var6 < this.field2255; var6++) {
            if (this.field2257[var6] != null) {
                this.field2257[var6].field4464 = var4.method2396((byte) -121) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field2255; var7++) {
            if (this.field2257[var7] != null) {
                this.field2257[var7].field4451 = var4.method2396((byte) 46) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field2255; var8++) {
            if (this.field2257[var8] != null) {
                this.field2257[var8].field4455 = var4.method2396((byte) -111) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field2255; var9++) {
            if (this.field2257[var9] != null) {
                this.field2257[var9].field4458 = var4.method2392(118);
            }
        }
        for (int var10 = 0; var10 < this.field2255; var10++) {
            if (this.field2257[var10] != null) {
                this.field2257[var10].field4462 = var4.method2392(-83);
            }
        }
        for (int var11 = 0; var11 < this.field2255; var11++) {
            if (this.field2257[var11] != null) {
                this.field2257[var11].field4459 = var4.method2392(114);
            }
        }
        for (int var12 = 0; var12 < this.field2255; var12++) {
            if (this.field2257[var12] != null) {
                this.field2257[var12].field4445 = var4.method2392(120);
            }
        }
        for (int var13 = 0; var13 < this.field2255; var13++) {
            if (this.field2257[var13] != null) {
                this.field2257[var13].field4448 = (short) var4.method2390((byte) 119);
            }
        }
        for (int var14 = 0; var14 < this.field2255; var14++) {
            if (this.field2257[var14] != null) {
                this.field2257[var14].field4444 = var4.method2392(126);
            }
        }
        for (int var15 = 0; var15 < this.field2255; var15++) {
            if (this.field2257[var15] != null) {
                this.field2257[var15].field4449 = var4.method2392(115);
            }
        }
        for (int var16 = 0; var16 < this.field2255; var16++) {
            if (this.field2257[var16] != null) {
                this.field2257[var16].field4461 = var4.method2396((byte) 69) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field2255; var17++) {
            if (this.field2257[var17] != null) {
                this.field2257[var17].field4452 = var4.method2396((byte) 62) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field2255; var18++) {
            if (this.field2257[var18] != null) {
                this.field2257[var18].field4453 = var4.method2392(122);
            }
        }
        for (int var19 = 0; var19 < this.field2255; var19++) {
            if (this.field2257[var19] != null) {
                this.field2257[var19].field4447 = var4.method2396((byte) -87) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field2255; var20++) {
            if (this.field2257[var20] != null) {
                this.field2257[var20].field4460 = var4.method2396((byte) -127) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field2255; var21++) {
            if (this.field2257[var21] != null) {
                this.field2257[var21].field4465 = var4.method2396((byte) 82) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field2255; var22++) {
            if (this.field2257[var22] != null) {
                this.field2257[var22].field4450 = var4.method2396((byte) 52);
            }
        }
        for (int var23 = 0; var23 < this.field2255; var23++) {
            if (this.field2257[var23] != null) {
                this.field2257[var23].field4456 = var4.method2381((byte) 93);
            }
        }
        for (int var24 = 0; var24 < this.field2255; var24++) {
            if (this.field2257[var24] != null) {
                this.field2257[var24].field4457 = var4.method2396((byte) 43);
            }
        }
    }
}
