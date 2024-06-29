import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class178 extends class64 {

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "Z")
    private boolean field3477 = true;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "I")
    private int field3474 = 4096;

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "[I")
    public static int[] field3469 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "Lsg;")
    public static class169 field3470 = class165.method1060("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 1536);

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lsg;")
    public static class169 field3479 = class165.method1060("", 1536);

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
    public static int field3480 = 0;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field3476;
        if (arg0 != -40) {
            this.method14((byte) -125, (class127) null, -92);
        }
        int[][] var3 = super.field1195.method177(arg0 ^ -1167, arg1);
        if (super.field1195.field532) {
            int[] var4 = this.method394(20331, 0, class89.field1616 & arg1 + -1);
            int[] var5 = this.method394(arg0 + 20371, 0, arg1);
            int[] var6 = this.method394(20331, 0, class89.field1616 & arg1 + 1);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class147.field2715; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field3474;
                int var12 = (var5[var10 + 1 & class8.field217] + -var5[class8.field217 & var10 + -1]) * this.field3474;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((var16 + 4096 + var15) / 4096)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var19 = 0;
                    var18 = 0;
                    var20 = 0;
                }
                if (this.field3477) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var19 = 2048 - -(var19 >> 1);
                }
                var8[var10] = var18;
                var7[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class178() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([Lqf;II)V")
    public static final void method1186(class150[] arg0, int arg1, int arg2) {
        ++field3472;
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            class150 var4 = arg0[var3];
            if (var4 != null && var4.field2893 == arg2 && (!var4.field2778 || !class187.method1233(var4, 0))) {
                if (~var4.field2882 == -1) {
                    if (!var4.field2778 && class187.method1233(var4, 0) && class129.field2419 != var4) {
                        continue;
                    }
                    method1186(arg0, -8043, var4.field2878);
                    if (var4.field2784 != null) {
                        method1186(var4.field2784, -8043, var4.field2878);
                    }
                    class80 var5 = (class80) class202.field3948.method1045((long) var4.field2878, (byte) -77);
                    if (var5 != null) {
                        class42.method272(arg1 + 7957, var5.field1475);
                    }
                }
                if (var4.field2882 == 6) {
                    if (var4.field2836 != -1 || ~var4.field2899 != 0) {
                        boolean var6 = class19.method137(0, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field2836;
                        } else {
                            var7 = var4.field2899;
                        }
                        if (var7 != -1) {
                            class174 var8 = class159.method1021((byte) 24, var7);
                            var4.field2874 += class149.field2756;
                            while (~var4.field2874 < ~var8.field3384[var4.field2846]) {
                                var4.field2874 -= var8.field3384[var4.field2846];
                                ++var4.field2846;
                                if (var4.field2846 >= var8.field3379.length) {
                                    var4.field2846 -= var8.field3371;
                                    if (~var4.field2846 > -1 || var8.field3379.length <= var4.field2846) {
                                        var4.field2846 = 0;
                                    }
                                }
                                class64.method404(98, var4);
                            }
                        }
                    }
                    if (~var4.field2790 != -1 && !var4.field2778) {
                        int var9 = var4.field2790 >> 16;
                        int var10 = var4.field2790 << 16 >> 16;
                        int var11 = class149.field2756 * var10;
                        int var12 = class149.field2756 * var9;
                        var4.field2863 = 2047 & var4.field2863 + var11;
                        var4.field2888 = 2047 & var4.field2888 + var12;
                        class64.method404(121, var4);
                    }
                }
            }
        }
        if (arg1 != -8043) {
            method1188(-62, 30, -24, 46, 123);
        }
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3479 = null;
        field3469 = null;
        if (arg0 != 1) {
            method1188(11, -27, -8, -114, 49);
        }
        field3470 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
    public static final void method1188(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg2; ~(arg2 + arg3) <= ~var5; ++var5) {
            for (int var7 = arg4; ~var7 >= ~(arg0 + arg4); ++var7) {
                if (var7 >= 0 && ~var7 > -105 && var5 >= 0 && var5 < 104) {
                    client.field577[0][var7][var5] = 127;
                    if (~arg4 == ~var7 && ~var7 < -1) {
                        class139.field2588[0][var7][var5] = class139.field2588[0][var7 + -1][var5];
                    }
                    if (arg0 + arg4 == var7 && ~var7 > -104) {
                        class139.field2588[0][var7][var5] = class139.field2588[0][var7 - -1][var5];
                    }
                    if (~arg2 == ~var5 && ~var5 < -1) {
                        class139.field2588[0][var7][var5] = class139.field2588[0][var7][var5 + -1];
                    }
                    if (~(arg2 + arg3) == ~var5 && ~var5 > -104) {
                        class139.field2588[0][var7][var5] = class139.field2588[0][var7][var5 + 1];
                    }
                }
            }
        }
        int var6 = -2 / ((-7 - arg1) / 48);
        ++field3473;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field3478;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field3477 = ~arg1.method819((byte) 22) == -2;
            }
        } else {
            this.field3474 = arg1.method785(true);
        }
        int var5 = -104 % ((-60 - arg0) / 36);
    }
}
