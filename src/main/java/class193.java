import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class193 extends class252 {

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    private int field3301 = 1;

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "I")
    private int field3306 = 1;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "[I")
    public static int[] field3292 = new int[500];

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "Z")
    public static boolean field3296 = true;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "Ljd;")
    public static class85 field3294 = class221.method1499(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) -115);

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "[I")
    public static int[] field3304 = new int[50];

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "[I")
    public static int[] field3302 = new int[32];

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "Ljd;")
    private static class85 field3298 = class221.method1499("Created gameworld", (byte) -116);

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "Ljd;")
    public static class85 field3293 = field3298;

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "I")
    public static int field3307 = 0;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "Lsc;")
    public static class236 field3297;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "Lge;")
    public static class68 field3300;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "[[[I")
    public static int[][][] field3299;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -123) {
            return null;
        } else {
            ++field3291;
            int[][] var3 = super.field4350.method155(arg0, false);
            if (super.field4350.field338) {
                int var4 = this.field3301 + this.field3301 + 1;
                int var5 = 65536 / var4;
                int var6 = this.field3306 + 1 + this.field3306;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = arg0 - this.field3301; ~var9 >= ~(arg0 - -this.field3301); ++var9) {
                    int[][] var19 = this.method1737(0, 3, class25.field360 & var9);
                    int[][] var20 = new int[3][class5.field63];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field3306; ~var27 >= ~this.field3306; ++var27) {
                        int var37 = class67.field1233 & var27;
                        var21 += var24[var37];
                        var22 += var25[var37];
                        var23 += var26[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (var31 < class5.field63) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = var31 - this.field3306 & class67.field1233;
                        int var33 = var21 - var24[var32];
                        ++var31;
                        int var34 = var22 - var25[var32];
                        int var35 = var23 - var26[var32];
                        int var36 = class67.field1233 & this.field3306 + var31;
                        var21 = var24[var36] + var33;
                        var22 = var25[var36] + var34;
                        var23 = var26[var36] + var35;
                    }
                    var8[-arg0 + this.field3301 + var9] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; class5.field63 > var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var17 > ~var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            field3300 = null;
        }
        int[] var3 = super.field4356.method868(arg0, (byte) 118);
        ++field3295;
        if (super.field4356.field2258) {
            int var4 = this.field3301 + 1 + this.field3301;
            int var5 = 65536 / var4;
            int var6 = this.field3306 + 1 + this.field3306;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field3301 + arg0; this.field3301 + arg0 >= var9; ++var9) {
                int[] var13 = this.method1742((byte) 8, 0, class25.field360 & var9);
                int[] var14 = new int[class5.field63];
                int var15 = 0;
                for (int var16 = -this.field3306; ~this.field3306 <= ~var16; ++var16) {
                    var15 += var13[var16 & class67.field1233];
                }
                int var17 = 0;
                while (var17 < class5.field63) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field3306 + var17 & class67.field1233];
                    ++var17;
                    var15 = var13[class67.field1233 & var17 - -this.field3306] + var18;
                }
                var8[var9 - arg0 + this.field3301] = var14;
            }
            for (int var10 = 0; class5.field63 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public static void method1319(boolean arg0) {
        field3297 = null;
        field3302 = null;
        field3300 = null;
        field3299 = null;
        field3304 = null;
        if (!arg0) {
            field3298 = null;
            field3293 = null;
            field3294 = null;
            field3292 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field3305;
        if (arg2 == -99) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field4338 = ~arg0.method1711((byte) -67) == -2;
                    }
                } else {
                    this.field3301 = arg0.method1711((byte) -67);
                }
            } else {
                this.field3306 = arg0.method1711((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V")
    public static final void method1320(int arg0, int arg1) {
        ++field3303;
        class171 var2 = class85.method579(5, 0, arg1);
        var2.method1141(-6456);
        if (arg0 != 3) {
            method1320(7, 92);
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class193() {
        super(1, false);
    }
}
