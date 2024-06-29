import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class244 extends class117 {

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    private int field4311 = 1;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    private int field4307 = 1;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "Z")
    public static boolean field4312 = false;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "Z")
    public static boolean field4306 = true;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "[I")
    public static int[] field4315 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "Lhh;")
    public static class163 field4317 = class137.method1065("Mitglieder)2Welt", 17);

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field4319 = 0;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "Lhh;")
    private static class163 field4320 = class137.method1065("Discard", 17);

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field4321 = -2;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "Lhh;")
    public static class163 field4318 = field4320;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, 0);
        ++field4313;
        if (super.field2218.field2587) {
            int var4 = this.field4307 - -this.field4307 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field4311 + this.field4311 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var6][];
            for (int var9 = -this.field4311 + arg1; ~(this.field4311 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method932(class258.field4520 & var9, false, 0);
                int[] var14 = new int[class143.field2702];
                int var15 = 0;
                for (int var16 = -this.field4307; var16 <= this.field4307; ++var16) {
                    var15 += var13[var16 & class54.field884];
                }
                int var17 = 0;
                while (class143.field2702 > var17) {
                    var14[var17] = var5 * var15 >> 16;
                    int var18 = var15 - var13[-this.field4307 + var17 & class54.field884];
                    ++var17;
                    var15 = var13[this.field4307 + var17 & class54.field884] + var18;
                }
                var8[this.field4311 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; ~class143.field2702 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var6 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var7 * var11 >> 16;
            }
        }
        if (arg0 != -21393) {
            this.method60(101, -35, (class81) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
    public static void method1683(int arg0) {
        field4318 = null;
        field4320 = null;
        field4315 = null;
        field4317 = null;
        if (arg0 < 93) {
            field4306 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1684(byte arg0, byte[] arg1) {
        class81 var2 = new class81(arg1);
        ++field4308;
        if (arg0 != 89) {
            return null;
        } else {
            int var3 = var2.method622(true);
            int var4 = var2.method620((byte) -82);
            if (~var4 <= -1 && (class21.field343 == 0 || ~class21.field343 <= ~var4)) {
                if (~var3 == -1) {
                    byte[] var5 = new byte[var4];
                    var2.method628(123, var4, var5, 0);
                    return var5;
                } else {
                    int var6 = var2.method620((byte) -82);
                    if (~var6 <= -1 && (~class21.field343 == -1 || var6 <= class21.field343)) {
                        byte[] var7 = new byte[var6];
                        if (~var3 == -2) {
                            class61.method418(var7, var6, arg1, var4, 9);
                        } else {
                            class115.field2154.method157(14341, var2, var7);
                        }
                        return var7;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
    public static final int method1685(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1687343696) {
            return -20;
        } else {
            int var4 = arg0 & 3;
            ++field4322;
            if (~var4 == -1) {
                return arg1;
            } else if (var4 == 1) {
                return 7 - arg2;
            } else {
                return ~var4 == -3 ? 7 - arg1 : arg2;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field4316;
            int[][] var3 = super.field2228.method1304(arg0, (byte) -7);
            if (super.field2228.field3221) {
                int var4 = this.field4311 + this.field4311 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field4307 + 1 + this.field4307;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field4311 + arg0; var9 <= this.field4311 + arg0; ++var9) {
                    int[][] var19 = this.method931(class258.field4520 & var9, -85, 0);
                    int[][] var20 = new int[3][class143.field2702];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[2];
                    int[] var26 = var19[1];
                    for (int var27 = -this.field4307; this.field4307 >= var27; ++var27) {
                        int var37 = var27 & class54.field884;
                        var22 += var25[var37];
                        var23 += var26[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class143.field2702 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var23 >> 16;
                        var30[var31] = var7 * var22 >> 16;
                        int var32 = -this.field4307 + var31 & class54.field884;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = var31 - -this.field4307 & class54.field884;
                        var21 = var24[var36] + var33;
                        var23 = var26[var36] + var35;
                        var22 = var25[var36] + var34;
                    }
                    var8[this.field4311 + var9 + -arg0] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class143.field2702 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var4 > var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            this.method90(64, false);
        }
        ++field4309;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field2208 = arg2.method622(true) == 1;
                }
            } else {
                this.field4311 = arg2.method622(true);
            }
        } else {
            this.field4307 = arg2.method622(true);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class244() {
        super(1, false);
    }
}
