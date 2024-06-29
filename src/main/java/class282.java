import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class class282 {

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    private int field3795 = 4;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    private int field3797 = 4;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    private int field3796 = 0;

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    private int field3799 = 4;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[S")
    private short[] field3804 = new short[512];

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public int field3803 = 4;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "[S")
    private short[] field3802;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
    public abstract void method1116(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
    private final void method1594(byte arg0) {
        field3794++;
        this.field3802 = new short[this.field3803];
        for (int var2 = 0; var2 < this.field3803; var2++) {
            this.field3802[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        int var3 = -125 % ((arg0 - 61) / 40);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIBI)V")
    public final void method1595(int arg0, int arg1, byte arg2, int arg3) {
        field3805++;
        if (arg2 <= 118) {
            return;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg3; var7++) {
            var5[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method1115(-118);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field3803; var14++) {
                        int var15 = this.field3802[var14] << 12;
                        int var16 = this.field3797 * var15 >> 12;
                        int var17 = this.field3795 * var15 >> 12;
                        int var18 = this.field3799 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var8[var11] * var15 >> 12;
                        int var22 = this.field3795 * var20;
                        int var23 = this.field3797 * var21;
                        int var24 = this.field3799 * var19;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var26 >= var18) {
                            var33 = 0;
                        } else {
                            var33 = var26 & 0xFF;
                        }
                        int var34;
                        if (var17 > var29) {
                            var34 = var29 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35 = var31 & 0xFF;
                        int var36;
                        if (var32 >= var16) {
                            var36 = 0;
                        } else {
                            var36 = var32 & 0xFF;
                        }
                        int var37 = var23 & 0xFFF;
                        int var38 = var22 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = var38 - 4096;
                        int var41 = var37 - 4096;
                        short var42 = this.field3804[var35];
                        int var43 = class270.field3607[var37];
                        int var44 = class270.field3607[var38];
                        short var45 = this.field3804[var36];
                        int var46 = class270.field3607[var39];
                        int var47 = var39 - 4096;
                        short var48 = this.field3804[var34 + var42];
                        short var49 = this.field3804[var34 + var45];
                        short var50 = this.field3804[var30 + var45];
                        short var51 = this.field3804[var30 + var42];
                        int var52 = class64.method430(var37, 17841, var39, var38, this.field3804[var27 + var51]);
                        int var53 = class64.method430(var37, 17841, var47, var38, this.field3804[var33 + var51]);
                        int var54 = var52 + ((var53 - var52) * var46 >> 12);
                        int var55 = class64.method430(var37, 17841, var39, var40, this.field3804[var27 + var48]);
                        int var56 = class64.method430(var37, 17841, var47, var40, this.field3804[var33 + var48]);
                        int var57 = ((var56 - var55) * var46 >> 12) + var55;
                        int var58 = ((var57 - var54) * var44 >> 12) + var54;
                        int var59 = class64.method430(var41, 17841, var39, var38, this.field3804[var27 + var50]);
                        int var60 = class64.method430(var41, 17841, var47, var38, this.field3804[var33 + var50]);
                        int var61 = ((var60 - var59) * var46 >> 12) + var59;
                        int var62 = class64.method430(var41, 17841, var39, var40, this.field3804[var27 + var49]);
                        int var63 = class64.method430(var41, 17841, var47, var40, this.field3804[var33 + var49]);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = var61 + ((var64 - var61) * var44 >> 12);
                        this.method1116(73, var14, ((var65 - var58) * var43 >> 12) + var58);
                    }
                    this.method1114(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
    private final void method1596(byte arg0) {
        field3800++;
        Random var2 = new Random((long) this.field3796);
        int var3 = 0;
        if (arg0 < 43) {
            this.method1595(-62, -12, (byte) 53, -74);
        }
        while (var3 < 255) {
            this.field3804[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class257.method1447(20094, var5, var2);
            short var7 = this.field3804[var6];
            this.field3804[var6] = this.field3804[var5];
            this.field3804[var5] = this.field3804[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public abstract void method1115(int arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3801++;
        class404.method2442(arg2, arg5 - 10049);
        int var7 = 0;
        int var8 = arg2 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        if (arg5 != 10049) {
            return;
        }
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg1 >= class221.field2942 && arg1 <= class205.field2784) {
            int[] var15 = class102.field1472[arg1];
            int var16 = class309.method1706(class425.field5751, arg6 - arg2, 6798, class136.field1985);
            int var17 = class309.method1706(class425.field5751, arg6 + arg2, 6798, class136.field1985);
            int var18 = class309.method1706(class425.field5751, arg6 - var8, 6798, class136.field1985);
            int var19 = class309.method1706(class425.field5751, arg6 + var8, 6798, class136.field1985);
            class330.method1834(var18, var15, arg0, var16, 25084);
            class330.method1834(var19, var15, arg3, var18, 25084);
            class330.method1834(var17, var15, arg0, var19, arg5 ^ 0x46BD);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class2.field38[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (var21 >= class221.field2942 && class205.field2784 >= var20) {
                    if (var8 > var9) {
                        int var22 = class2.field38[var9];
                        int var23 = class309.method1706(class425.field5751, arg6 + var7, 6798, class136.field1985);
                        int var24 = class309.method1706(class425.field5751, arg6 - var7, 6798, class136.field1985);
                        int var25 = class309.method1706(class425.field5751, arg6 + var22, 6798, class136.field1985);
                        int var26 = class309.method1706(class425.field5751, arg6 - var22, 6798, class136.field1985);
                        if (var21 <= class205.field2784) {
                            int[] var27 = class102.field1472[var21];
                            class330.method1834(var26, var27, arg0, var24, arg5 + 15035);
                            class330.method1834(var25, var27, arg3, var26, 25084);
                            class330.method1834(var23, var27, arg0, var25, 25084);
                        }
                        if (class221.field2942 <= var20) {
                            int[] var28 = class102.field1472[var20];
                            class330.method1834(var26, var28, arg0, var24, arg5 + 15035);
                            class330.method1834(var25, var28, arg3, var26, 25084);
                            class330.method1834(var23, var28, arg0, var25, 25084);
                        }
                    } else {
                        int var29 = class309.method1706(class425.field5751, arg6 + var7, 6798, class136.field1985);
                        int var30 = class309.method1706(class425.field5751, arg6 - var7, 6798, class136.field1985);
                        if (var21 <= class205.field2784) {
                            class330.method1834(var29, class102.field1472[var21], arg0, var30, 25084);
                        }
                        if (class221.field2942 <= var20) {
                            class330.method1834(var29, class102.field1472[var20], arg0, var30, 25084);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (class221.field2942 <= var32 && class205.field2784 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class425.field5751 && class136.field1985 >= var34) {
                    int var35 = class309.method1706(class425.field5751, var33, 6798, class136.field1985);
                    int var36 = class309.method1706(class425.field5751, var34, 6798, class136.field1985);
                    if (var7 >= var8) {
                        if (var32 <= class205.field2784) {
                            class330.method1834(var35, class102.field1472[var32], arg0, var36, 25084);
                        }
                        if (var31 >= class221.field2942) {
                            class330.method1834(var35, class102.field1472[var31], arg0, var36, arg5 + 15035);
                        }
                    } else {
                        int var37 = var11 >= var7 ? var11 : class2.field38[var7];
                        int var38 = class309.method1706(class425.field5751, arg6 + var37, 6798, class136.field1985);
                        int var39 = class309.method1706(class425.field5751, arg6 - var37, 6798, class136.field1985);
                        if (var32 <= class205.field2784) {
                            int[] var40 = class102.field1472[var32];
                            class330.method1834(var39, var40, arg0, var36, arg5 + 15035);
                            class330.method1834(var38, var40, arg3, var39, 25084);
                            class330.method1834(var35, var40, arg0, var38, arg5 + 15035);
                        }
                        if (class221.field2942 <= var31) {
                            int[] var41 = class102.field1472[var31];
                            class330.method1834(var39, var41, arg0, var36, 25084);
                            class330.method1834(var38, var41, arg3, var39, 25084);
                            class330.method1834(var35, var41, arg0, var38, arg5 + 15035);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
    public abstract void method1114(boolean arg0);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[[[B")
    public static final byte[][][] method1598(int arg0, int arg1) {
        field3793++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= (var19 >> 1)) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var22 << 1 <= var127) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 >= var28 << 1) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= (var31 >> 1)) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= var37 >> 1) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= var40 << 1) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= (var43 >> 1)) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var46 << 1 >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= (var49 >> 1)) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= var52 << 1) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var55 >> 1 <= var116) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if ((var58 << 1) >= var115) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if ((var61 >> 1) <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        int var64 = 0;
        if (arg1 < 117) {
            method1597(-96, -85, -88, -52, -74, 109, 41);
        }
        while (var64 < var4) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= var64 << 1) {
                    var63[var62] = -1;
                }
                var62++;
            }
            var64++;
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= (var4 / 2)) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var3 / 2) <= var110) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= (var4 / 2)) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var79 - (var4 / 2)) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - (var4 / 2)) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var85 - (var4 / 2))) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= (var88 - (var4 / 2))) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= var94 - var4 / 2) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - (var4 / 2) <= var102) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= (var100 - (var4 / 2))) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIII)V")
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3799 = arg2;
        this.field3795 = arg3;
        this.field3796 = arg0;
        this.field3803 = arg1;
        this.field3797 = arg4;
        this.method1594((byte) 120);
        this.method1596((byte) 69);
    }
}
