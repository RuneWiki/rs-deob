import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class252 {

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "Z")
    private boolean field411 = true;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "Z")
    private boolean field412 = true;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field408 = -8 + (int) (17.0D * Math.random());

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "Ljd;")
    public static class85 field415 = class221.method1499("Suche nach Updates )2 ", (byte) -99);

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "[I")
    public static int[] field409 = new int[32];

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "[I")
    public static int[] field417 = new int[32];

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "Ljb;")
    public static class255 field420 = null;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lge;")
    public static class68 field419;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "[S")
    public static short[] field414;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z")
    public static final boolean method190(byte arg0) {
        if (arg0 <= 56) {
            method190((byte) 10);
        }
        ++field410;
        return ~class230.field3983 != -1 ? true : class201.field3511.method794(125);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZLjd;)V")
    public static final void method191(int arg0, boolean arg1, class85 arg2) {
        short[] var3 = new short[16];
        class85 var4 = arg2.method633(arg0 + 90);
        int var5 = 0;
        ++field422;
        for (int var6 = arg0; var6 < class116.field2081; ++var6) {
            class61 var9 = class32.method221(11649, var6);
            if ((!arg1 || var9.field1118) && ~var9.field1133 == 0 && ~var9.field1138 == 0 && var9.field1140 == 0 && var9.field1106.method633(90).method607(var4, false) != -1) {
                if (~var5 <= -251) {
                    class151.field2550 = -1;
                    class247.field4221 = null;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; ++var11) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class200.field3484 = 0;
        class151.field2550 = var5;
        class85[] var7 = new class85[class151.field2550];
        class247.field4221 = var3;
        for (int var8 = 0; ~var8 > ~class151.field2550; ++var8) {
            var7[var8] = class32.method221(11649, var3[var8]).field1106;
        }
        class104.method720(var7, class247.field4221, (byte) 63);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field406;
        int var8 = -arg3 + 2048 & 2047;
        int var9 = 12 % ((61 - arg1) / 38);
        int var10 = -arg7 + 2048 & 2047;
        int var11 = 0;
        int var12 = 0;
        int var13 = arg6;
        if (~var8 != -1) {
            int var14 = class173.field2984[var8];
            var12 = -arg6 * var14 >> 16;
            int var15 = class173.field2995[var8];
            var13 = arg6 * var15 >> 16;
        }
        if (~var10 != -1) {
            int var16 = class173.field2995[var10];
            int var17 = class173.field2984[var10];
            var11 = var13 * var17 >> 16;
            var13 = var13 * var16 >> 16;
        }
        class252.field4347 = arg3;
        class267.field4762 = -var11 + arg0;
        class272.field4809 = -var13 + arg4;
        class231.field3987 = arg2 - var12;
        class35.field547 = arg7;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field407;
        int[] var3 = super.field4356.method868(arg0, (byte) -85);
        if (super.field4356.field2258) {
            int[] var4 = this.method1742((byte) 8, 0, !this.field411 ? arg0 : class25.field360 - arg0);
            if (!this.field412) {
                class248.method1725(var4, 0, var3, 0, class5.field63);
            } else {
                for (int var5 = 0; var5 < class5.field63; ++var5) {
                    var3[var5] = var4[-var5 + class67.field1233];
                }
            }
        }
        if (arg1 != -55) {
            this.field411 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Ljb;ZIBI)V")
    public static final void method193(int arg0, class255[] arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 18) {
            method191(-3, false, (class85) null);
        }
        for (int var6 = 0; ~arg1.length < ~var6; ++var6) {
            class255 var7 = arg1[var6];
            if (var7 != null && ~var7.field4530 == ~arg3) {
                class8.method41(arg5, arg0, arg2, -100, var7);
                class71.method500(98, arg5, arg0, var7);
                if (~(var7.field4466 - var7.field4482) > ~var7.field4484) {
                    var7.field4484 = -var7.field4482 + var7.field4466;
                }
                if (var7.field4443 - var7.field4513 < var7.field4557) {
                    var7.field4557 = -var7.field4513 + var7.field4443;
                }
                if (~var7.field4557 > -1) {
                    var7.field4557 = 0;
                }
                if (var7.field4484 < 0) {
                    var7.field4484 = 0;
                }
                if (~var7.field4436 == -1) {
                    class66.method446(var7, arg2, (byte) 57);
                }
            }
        }
        ++field418;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field413;
        if (arg1 != -123) {
            field420 = null;
        }
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[][] var4 = this.method1737(0, 3, this.field411 ? -arg0 + class25.field360 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            if (this.field412) {
                for (int var11 = 0; class5.field63 > var11; ++var11) {
                    var7[var11] = var5[-var11 + class67.field1233];
                    var8[var11] = var6[-var11 + class67.field1233];
                    var10[var11] = var9[-var11 + class67.field1233];
                }
            } else {
                for (int var12 = 0; class5.field63 > var12; ++var12) {
                    var7[var12] = var5[var12];
                    var8[var12] = var6[var12];
                    var10[var12] = var9[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public static void method194(int arg0) {
        field417 = null;
        field409 = null;
        field414 = null;
        field420 = null;
        if (arg0 == 2047) {
            field419 = null;
            field415 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4338 = ~arg0.method1711((byte) -67) == -2;
                }
            } else {
                this.field411 = ~arg0.method1711((byte) -67) == -2;
            }
        } else {
            this.field412 = ~arg0.method1711((byte) -67) == -2;
        }
        if (arg2 == -99) {
            ++field416;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field417[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
