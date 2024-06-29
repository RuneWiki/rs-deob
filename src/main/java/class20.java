import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class20 extends class82 {

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    private int field349 = 1;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
    private int field351 = 1;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Ldj;")
    public static class44 field338 = class89.method650(255, "cookieprefix");

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
    public static int[] field346 = new int[500];

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Ldj;")
    private static class44 field339 = class89.method650(255, " more options");

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "Ldj;")
    public static class44 field345 = class89.method650(255, ":duelstake:");

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "Ldj;")
    public static class44 field352 = field339;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "Ldj;")
    public static class44 field344 = class89.method650(255, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "Ldj;")
    public static class44 field353 = class89.method650(255, "compass");

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "Z")
    public static boolean field341;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILvc;)Z")
    public static final boolean method155(int arg0, class223 arg1) {
        ++field342;
        if (arg1.field4101 == null) {
            return false;
        } else {
            for (int var2 = arg0; ~arg1.field4101.length < ~var2; ++var2) {
                int var3 = class172.method1092(var2, 30364, arg1);
                int var4 = arg1.field4047[var2];
                if (arg1.field4101[var2] == 2) {
                    if (~var3 <= ~var4) {
                        return false;
                    }
                } else if (~arg1.field4101[var2] != -4) {
                    if (arg1.field4101[var2] != 4) {
                        if (var3 != var4) {
                            return false;
                        }
                    } else if (var3 == var4) {
                        return false;
                    }
                } else if (var4 >= var3) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class20() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field1599 = arg0.method506(arg2 ^ 187) == 1;
                }
            } else {
                this.field349 = arg0.method506(255);
            }
        } else {
            this.field351 = arg0.method506(255);
        }
        ++field348;
        if (arg2 != 68) {
            method156(-15);
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V")
    public static final void method156(int arg0) {
        ++field347;
        while (~class218.field3957.method1169(true, class88.field1680) <= -28) {
            int var1 = class218.field3957.method1173(127, 15);
            if (~var1 == -32768) {
                break;
            }
            boolean var2 = false;
            if (class170.field2960[var1] == null) {
                var2 = true;
                class170.field2960[var1] = new class121();
            }
            class121 var3 = class170.field2960[var1];
            class158.field2751[class158.field2755++] = var1;
            var3.field2248 = class46.field868;
            int var4 = class218.field3957.method1173(arg0 ^ -15886, 1);
            if (~var4 == -2) {
                class143.field2533[class27.field490++] = var1;
            }
            int var5 = class81.field1582[class218.field3957.method1173(127, 3)];
            if (var2) {
                var3.field2211 = var3.field2224 = var5;
            }
            var3.field2156 = class154.method996(class218.field3957.method1173(127, 14), (byte) -116);
            int var6 = class218.field3957.method1173(127, 5);
            int var7 = class218.field3957.method1173(127, 5);
            int var8 = class218.field3957.method1173(127, 1);
            var3.field2242 = var3.field2156.field3609;
            var3.field2251 = var3.field2156.field3577;
            var3.field2253 = var3.field2156.field3592;
            if (var6 > 15) {
                var6 -= 32;
            }
            if (~var7 < -16) {
                var7 -= 32;
            }
            var3.field2201 = var3.field2156.field3623;
            var3.field2256 = var3.field2156.field3594;
            var3.field2258 = var3.field2156.field3619;
            var3.field2196 = var3.field2156.field3576;
            var3.field2197 = var3.field2156.field3590;
            var3.field2231 = var3.field2156.field3620;
            if (~var3.field2201 == -1) {
                var3.field2224 = 0;
            }
            var3.method854(class96.field1774.field2240[0] + var7, class96.field1774.field2235[0] + var6, (byte) 105, ~var8 == -2);
        }
        if (arg0 != -15987) {
            field345 = null;
        }
        class218.field3957.method1166((byte) 9);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field343;
        if (arg0 > -59) {
            return null;
        } else {
            int[][] var3 = super.field1601.method548(arg1, true);
            if (super.field1601.field1343) {
                int var4 = this.field351 + 1 + this.field351;
                int var5 = 65536 / var4;
                int var6 = this.field349 + 1 + this.field349;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var6][][];
                for (int var9 = arg1 - this.field349; ~(this.field349 + arg1) <= ~var9; ++var9) {
                    int[][] var19 = this.method619(var9 & class101.field1850, true, 0);
                    int[][] var20 = new int[3][class129.field2287];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field351; ~this.field351 <= ~var27; ++var27) {
                        int var37 = var27 & class53.field943;
                        var21 += var24[var37];
                        var23 += var26[var37];
                        var22 += var25[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[2];
                    int[] var30 = var20[1];
                    int var31 = 0;
                    while (~var31 > ~class129.field2287) {
                        var28[var31] = var5 * var21 >> 16;
                        var30[var31] = var5 * var22 >> 16;
                        var29[var31] = var5 * var23 >> 16;
                        int var32 = -this.field351 + var31 & class53.field943;
                        int var33 = var21 - var24[var32];
                        int var34 = var23 - var26[var32];
                        ++var31;
                        int var35 = var22 - var25[var32];
                        int var36 = this.field351 + var31 & class53.field943;
                        var23 = var26[var36] + var34;
                        var22 = var25[var36] + var35;
                        var21 = var24[var36] + var33;
                    }
                    var8[-arg1 + this.field349 + var9] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; var13 < class129.field2287; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var6 < ~var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var7 * var14 >> 16;
                    var11[var13] = var7 * var15 >> 16;
                    var12[var13] = var7 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
    public static void method157(int arg0) {
        if (arg0 != -24288) {
            field352 = null;
        }
        field339 = null;
        field344 = null;
        field338 = null;
        field345 = null;
        field353 = null;
        field346 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        if (arg0 != 25238) {
            return null;
        } else {
            int[] var3 = super.field1595.method603(true, arg1);
            ++field340;
            if (super.field1595.field1538) {
                int var4 = this.field349 + this.field349 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field351 - (-this.field351 - 1);
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field349 + arg1; ~var9 >= ~(this.field349 + arg1); ++var9) {
                    int[] var13 = this.method620(2652, var9 & class101.field1850, 0);
                    int[] var14 = new int[class129.field2287];
                    int var15 = 0;
                    for (int var16 = -this.field351; this.field351 >= var16; ++var16) {
                        var15 += var13[class53.field943 & var16];
                    }
                    int var17 = 0;
                    while (var17 < class129.field2287) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[-this.field351 + var17 & class53.field943];
                        ++var17;
                        var15 = var13[this.field351 + var17 & class53.field943] + var18;
                    }
                    var8[-arg1 + var9 + this.field349] = var14;
                }
                for (int var10 = 0; ~class129.field2287 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }
}
