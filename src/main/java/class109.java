import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class109 extends class146 {

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "Z")
    private static boolean field1674 = false;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    private static int field1662;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    private int field1666;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    private static int field1671;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    private int field1673;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    private static int field1677;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    private static int field1681;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Z")
    private boolean field1655;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "Z")
    private boolean field1665;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "[B")
    private static byte[] field1664;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "[B")
    private byte[] field1684;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "[F")
    private static float[] field1652;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[F")
    private static float[] field1654;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[F")
    private static float[] field1658;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "[F")
    private float[] field1661;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "[F")
    private static float[] field1669;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "[F")
    private static float[] field1670;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "[F")
    private static float[] field1675;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "[F")
    private static float[] field1676;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "[I")
    private static int[] field1659;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[I")
    private static int[] field1663;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[I")
    private static int[] field1672;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "[Lgg;")
    private static class122[] field1678;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "[Lna;")
    private static class147[] field1668;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "[Ljg;")
    private static class158[] field1667;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "[Lia;")
    public static class83[] field1660;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "[Z")
    private static boolean[] field1653;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[[B")
    private byte[][] field1657;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lsb;II)Lvh;")
    public static final class109 method808(class124 arg0, int arg1, int arg2) {
        if (method813(arg0)) {
            byte[] var3 = arg0.method900(arg1, arg2, false);
            return var3 == null ? null : new class109(var3);
        } else {
            arg0.method912(false, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([B)V")
    private static final void method809(byte[] arg0) {
        method817(arg0, 0);
        field1681 = 0x1 << method810(4);
        field1671 = 0x1 << method810(4);
        field1676 = new float[field1671];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1681 : field1671;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class170.method1217(var17 - 1, 3471);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class7.method37(var26, (byte) -112, var25);
            }
            if (var1 == 0) {
                field1675 = var18;
                field1658 = var20;
                field1669 = var22;
                field1663 = var24;
            } else {
                field1652 = var18;
                field1670 = var20;
                field1654 = var22;
                field1672 = var24;
            }
        }
        int var2 = method810(8) + 1;
        field1660 = new class83[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1660[var3] = new class83();
        }
        int var4 = method810(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method810(16);
        }
        int var6 = method810(6) + 1;
        field1668 = new class147[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1668[var7] = new class147();
        }
        int var8 = method810(6) + 1;
        field1667 = new class158[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1667[var9] = new class158();
        }
        int var10 = method810(6) + 1;
        field1678 = new class122[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1678[var11] = new class122();
        }
        int var12 = method810(6) + 1;
        field1653 = new boolean[var12];
        field1659 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1653[var13] = method816() != 0;
            method810(16);
            method810(16);
            field1659[var13] = method810(8);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
    public static final int method810(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1677) {
            int var4 = 8 - field1677;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1664[field1662] >> field1677 & var5) << var2;
            field1677 = 0;
            field1662++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1664[field1662] >> field1677 & var3) << var2;
            field1677 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I)Lbe;")
    public final class86 method811(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1684 == null) {
            this.field1656 = 0;
            this.field1661 = new float[field1671];
            this.field1684 = new byte[this.field1680];
            this.field1685 = 0;
            this.field1683 = 0;
        }
        while (this.field1683 < this.field1657.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method815(this.field1683);
            if (var3 != null) {
                int var4 = this.field1685;
                int var5 = var3.length;
                if (var5 > this.field1680 - var4) {
                    var5 = this.field1680 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1684[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1685;
                }
                this.field1685 = var4;
            }
            this.field1683++;
        }
        this.field1661 = null;
        byte[] var2 = this.field1684;
        this.field1684 = null;
        return new class86(this.field1682, var2, this.field1679, this.field1673, this.field1665);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
    public static void method812() {
        field1664 = null;
        field1660 = null;
        field1668 = null;
        field1667 = null;
        field1678 = null;
        field1653 = null;
        field1659 = null;
        field1676 = null;
        field1675 = null;
        field1658 = null;
        field1669 = null;
        field1652 = null;
        field1670 = null;
        field1654 = null;
        field1663 = null;
        field1672 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lsb;)Z")
    private static final boolean method813(class124 arg0) {
        if (!field1674) {
            byte[] var1 = arg0.method900(0, 0, false);
            if (var1 == null) {
                return false;
            }
            method809(var1);
            field1674 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)F")
    public static final float method814(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)[F")
    private final float[] method815(int arg0) {
        method817(this.field1657[arg0], 0);
        method816();
        int var2 = method810(class170.method1217(field1659.length - 1, 3471));
        boolean var3 = field1653[var2];
        int var4 = var3 ? field1671 : field1681;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method816() != 0;
            var6 = method816() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1681 >> 2);
            var9 = (field1681 >> 2) + (var4 >> 2);
            var10 = field1681 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1681 >> 2);
            var12 = (field1681 >> 2) + (var4 - (var4 >> 2));
            var13 = field1681 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class122 var14 = field1678[field1659[var2]];
        int var15 = var14.field2034;
        int var16 = var14.field2033[var15];
        boolean var17 = !field1668[var16].method1085();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2035; var19++) {
            class158 var95 = field1667[var14.field2036[var19]];
            float[] var96 = field1676;
            var95.method1137(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2034;
            int var21 = var14.field2033[var20];
            field1668[var21].method1080(field1676, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1676[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1676;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1652 : field1675;
            float[] var30 = var3 ? field1670 : field1658;
            float[] var31 = var3 ? field1654 : field1669;
            int[] var32 = var3 ? field1672 : field1663;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class170.method1217(var4 - 1, 3471);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field1676[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1676[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1656 > 0) {
            int var49 = this.field1656 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1655) {
                for (int var50 = 0; var50 < this.field1666; var50++) {
                    int var51 = (this.field1656 >> 1) + var50;
                    var48[var50] += this.field1661[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1676[var52];
                }
            }
        }
        float[] var54 = this.field1661;
        this.field1661 = field1676;
        field1676 = var54;
        this.field1656 = var4;
        this.field1666 = var12 - (var4 >> 1);
        this.field1655 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()I")
    public static final int method816() {
        int var0 = field1664[field1662] >> field1677 & 0x1;
        field1677++;
        field1662 += field1677 >> 3;
        field1677 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BI)V")
    private static final void method817(byte[] arg0, int arg1) {
        field1664 = arg0;
        field1662 = arg1;
        field1677 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "([B)V")
    private final void method818(byte[] arg0) {
        class136 var2 = new class136(arg0);
        this.field1682 = var2.method1022(93);
        this.field1680 = var2.method1022(99);
        this.field1679 = var2.method1022(102);
        this.field1673 = var2.method1022(-70);
        if (this.field1673 < 0) {
            this.field1673 = ~this.field1673;
            this.field1665 = true;
        }
        int var3 = var2.method1022(99);
        this.field1657 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1012(4);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1018(var7, 0, var5, true);
            this.field1657[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B)V")
    private class109(byte[] arg0) {
        this.method818(arg0);
    }
}
