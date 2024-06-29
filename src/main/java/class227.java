import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class227 extends class343 {

    @OriginalMember(owner = "client!em", name = "S", descriptor = "I")
    private int field3234 = 0;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "I")
    public int field3238 = -1;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public int field3237 = -1;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public int field3240 = 0;

    @OriginalMember(owner = "client!em", name = "eb", descriptor = "Z")
    private boolean field3246 = false;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "[I")
    public static int[] field3232 = new int[2];

    @OriginalMember(owner = "client!em", name = "O", descriptor = "Lqt;")
    public static class637 field3230 = new class637();

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "[I")
    public static int[] field3242 = new int[32];

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!em", name = "cb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!em", name = "db", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!em", name = "fb", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!em", name = "gb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!em", name = "hb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!em", name = "ib", descriptor = "I")
    public static int field3250;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field3242[var1] = var0 + -1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLha;)Lck;", line = 7)
    public final class642 method808(byte arg0, class59 arg1) {
        ++field3249;
        return arg0 > -86 ? null : null;
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)I", line = 18)
    public final int method789(int arg0) {
        ++field3245;
        if (arg0 != -32768) {
            this.field3239 = -64;
        }
        return -10;
    }

    @OriginalMember(owner = "client!em", name = "i", descriptor = "(I)V", line = 34)
    public static void method1449(int arg0) {
        field3242 = null;
        if (arg0 == -16873) {
            field3232 = null;
            field3230 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)Z", line = 46)
    public final boolean method801(boolean arg0) {
        ++field3229;
        if (arg0) {
            this.method806((byte) 120);
        }
        return this.field3246;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIII)V", line = 127)
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lvfa;Z)V", line = 69)
    public static final void method1450(class672 arg0, boolean arg1) {
        ++field3235;
        if (class142.field2268) {
            if (!arg1) {
                if (arg0.field9242 != null) {
                    class672 var2 = class239.method1503(class649.field8631, class136.field2168, 0);
                    if (var2 != null) {
                        class309 var3 = new class309();
                        var3.field4435 = arg0;
                        var3.field4439 = arg0.field9242;
                        var3.field4444 = var2;
                        class182.method1249(var3);
                    }
                }
                ++class76.field920;
                class583 var4 = class381.method2246(1, class128.field2105, class339.field4793);
                var4.field7637.method3798(27695, arg0.field9200);
                var4.field7637.method3772(class136.field2168, -231665880);
                var4.field7637.method3772(arg0.field9318, -231665880);
                var4.field7637.method3787((byte) -128, class649.field8631);
                var4.field7637.method3780(arg0.field9277, 81);
                var4.field7637.method3781(true, class275.field3827);
                class42.method309(var4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(B)I", line = 114)
    public final int method791(byte arg0) {
        ++field3248;
        if (arg0 < 81) {
            this.field3239 = 52;
        }
        return this.field3234;
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)I", line = 142)
    public final int method1451(int arg0) {
        if (arg0 > 0) {
            this.method791((byte) -11);
        }
        ++field3250;
        class597 var2 = class77.field948.method1165((byte) 118, this.field3239);
        int var3 = var2.field7806;
        if (this.field3238 != -1) {
            class597 var4 = class77.field948.method1165((byte) 77, this.field3238);
            if (~var3 > ~var4.field7806) {
                var3 = var4.field7806;
            }
        }
        if (this.field3237 != -1) {
            class597 var5 = class77.field948.method1165((byte) 80, this.field3237);
            if (~var5.field7806 < ~var3) {
                var3 = var5.field7806;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(ILha;)Lww;", line = 177)
    public final class733 method800(int arg0, class59 arg1) {
        ++field3247;
        class10 var3 = class366.method2162(super.field3508, super.field3505 >> class140.field2224, super.field3502 >> class140.field2224);
        if (var3 != null && var3.field170.field9365) {
            int var4 = var3.field170.method789(-32768);
            if (this.field3240 != var4) {
                super.field3510 -= this.field3240;
                super.field3510 += var4;
                this.field3240 = var4;
            }
        }
        class333 var5 = arg1.method451();
        var5.method1725();
        if (var3 == null || !var3.field170.field9365) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class282 var9 = class507.field6771[super.field3515];
            int var10 = this.field3234 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method1750((byte) 96, super.field3505 + var12, super.field3502 + var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method1750((byte) 116, super.field3505 - -var15, super.field3502 + var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method1750((byte) 114, super.field3505 - -var18, super.field3502 + var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method1750((byte) 103, super.field3505 + var21, super.field3502 - -var22);
            int var24 = ~var17 < ~var14 ? var14 : var17;
            int var25 = ~var23 >= ~var20 ? var23 : var20;
            int var26 = ~var17 <= ~var23 ? var23 : var17;
            int var27 = ~var14 > ~var20 ? var14 : var20;
            if (~var10 != -1) {
                int var28 = (int) (2607.5945876176133D * Math.atan2((double) (-var25 + var24), (double) var10)) & 16383;
                if (~var28 != -1) {
                    var5.method1718(var28);
                }
            }
            int var29 = var14 + var23;
            if (~var10 != -1) {
                int var30 = 16383 & (int) (Math.atan2((double) (-var26 + var27), (double) var10) * 2607.5945876176133D);
                if (var30 != 0) {
                    var5.method1716(-var30);
                }
            }
            if (~var29 < ~(var17 - -var20)) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field3510;
            if (~var31 != -1) {
                var5.method1730(0, var31, 0);
            }
        }
        var5.method1730(super.field3505, super.field3510 + -10, super.field3502);
        class733 var32 = class397.method2338(true, (byte) 125, 3);
        this.field3234 = 0;
        this.field3246 = false;
        if (this.field3237 != -1) {
            class475 var33 = class77.field948.method1165((byte) 93, this.field3237).method3251((class456) null, 0, (class320) null, arg1, arg0 + -26162, this.field3241, 0, 2048, -1);
            if (var33 != null) {
                if (!class540.field7159) {
                    var33.method155(var5, var32.field10150[2], 0);
                } else {
                    var33.method160(var5, var32.field10150[2], class100.field1358, 0);
                }
                this.field3246 |= var33.method159();
                this.field3234 = var33.method167();
            }
        }
        if (~this.field3238 != 0) {
            class475 var34 = class77.field948.method1165((byte) 83, this.field3238).method3251((class456) null, 0, (class320) null, arg1, arg0 + -26162, this.field3243, 0, 2048, -1);
            if (var34 != null) {
                if (class540.field7159) {
                    var34.method160(var5, var32.field10150[1], class100.field1358, 0);
                } else {
                    var34.method155(var5, var32.field10150[1], 0);
                }
                this.field3246 |= var34.method159();
                if (var34.method167() > this.field3234) {
                    this.field3234 = var34.method167();
                }
            }
        }
        class475 var35 = class77.field948.method1165((byte) 98, this.field3239).method3251((class456) null, 0, (class320) null, arg1, -26163, this.field3233, 0, 2048, arg0);
        if (var35 != null) {
            if (class540.field7159) {
                var35.method160(var5, var32.field10150[0], class100.field1358, 0);
            } else {
                var35.method155(var5, var32.field10150[0], 0);
            }
            this.field3246 |= var35.method159();
            if (~var35.method167() < ~this.field3234) {
                this.field3234 = var35.method167();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lha;IIB)Z", line = 357)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field3231;
        if (arg3 != 103) {
            return false;
        } else {
            class333 var5 = arg0.method451();
            var5.method1727(super.field3505, super.field3510 + -10, super.field3502);
            class597 var6 = class77.field948.method1165((byte) 96, this.field3239);
            class475 var7 = var6.method3251((class456) null, 0, (class320) null, arg0, -26163, this.field3233, 0, 131072, -1);
            if (var7 != null && (!class540.field7159 ? var7.method158(arg2, arg1, var5, true, var6.field7806) : var7.method203(arg2, arg1, var5, true, var6.field7806, class100.field1358))) {
                return true;
            } else {
                if (~this.field3238 != 0) {
                    class597 var8 = class77.field948.method1165((byte) 72, this.field3238);
                    class475 var9 = var8.method3251((class456) null, 0, (class320) null, arg0, arg3 + -26266, this.field3243, 0, 131072, -1);
                    if (var9 != null && (!class540.field7159 ? var9.method158(arg2, arg1, var5, true, var8.field7806) : var9.method203(arg2, arg1, var5, true, var8.field7806, class100.field1358))) {
                        return true;
                    }
                }
                if (this.field3237 != -1) {
                    class597 var10 = class77.field948.method1165((byte) 82, this.field3237);
                    class475 var11 = var10.method3251((class456) null, 0, (class320) null, arg0, -26163, this.field3241, 0, 131072, -1);
                    if (var11 != null && (class540.field7159 ? var11.method203(arg2, arg1, var5, true, var10.field7806, class100.field1358) : var11.method158(arg2, arg1, var5, true, var10.field7806))) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(B)Z", line = 398)
    public final boolean method806(byte arg0) {
        int var2 = -27 % ((arg0 - 14) / 57);
        ++field3236;
        return false;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lha;B)V", line = 414)
    public final void method792(class59 arg0, byte arg1) {
        if (arg1 < 121) {
            this.method789(93);
        }
        ++field3244;
    }
}
