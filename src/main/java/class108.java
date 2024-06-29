import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class108 extends class24 {

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Z")
    private static boolean field1662 = false;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    private static int field1652;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    private static int field1661;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    private static int field1668;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "I")
    private static int field1673;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    private int field1676;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    private int field1679;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "I")
    private int field1680;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "Z")
    private boolean field1659;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
    private boolean field1669;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "[B")
    private static byte[] field1667;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "[B")
    private byte[] field1682;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[F")
    private float[] field1649;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "[F")
    private static float[] field1654;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "[F")
    private static float[] field1657;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "[F")
    private static float[] field1658;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[F")
    private static float[] field1666;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "[F")
    private static float[] field1670;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "[F")
    private static float[] field1672;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "[F")
    private static float[] field1677;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[I")
    private static int[] field1656;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[I")
    private static int[] field1664;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "[I")
    private static int[] field1674;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "[Lda;")
    public static class202[] field1678;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "[Lii;")
    private static class223[] field1665;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "[Lnj;")
    private static class230[] field1675;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "[Lib;")
    private static class3[] field1663;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[Z")
    private static boolean[] field1655;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[[B")
    private byte[][] field1671;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()I", line = 8)
    public static final int method794() {
        int var0 = field1667[field1652] >> field1673 & 0x1;
        field1673++;
        field1652 += field1673 >> 3;
        field1673 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "()V", line = 18)
    public static void method795() {
        field1667 = null;
        field1678 = null;
        field1675 = null;
        field1663 = null;
        field1665 = null;
        field1655 = null;
        field1674 = null;
        field1657 = null;
        field1666 = null;
        field1672 = null;
        field1654 = null;
        field1670 = null;
        field1677 = null;
        field1658 = null;
        field1656 = null;
        field1664 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([I)Llg;", line = 38)
    public final class11 method796(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1682 == null) {
            this.field1660 = 0;
            this.field1649 = new float[field1661];
            this.field1682 = new byte[this.field1653];
            this.field1680 = 0;
            this.field1681 = 0;
        }
        while (this.field1681 < this.field1671.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method799(this.field1681);
            if (var2 != null) {
                int var3 = this.field1680;
                int var4 = var2.length;
                if (var4 > this.field1653 - var3) {
                    var4 = this.field1653 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field1682[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field1680;
                }
                this.field1680 = var3;
            }
            this.field1681++;
        }
        this.field1649 = null;
        byte[] var7 = this.field1682;
        this.field1682 = null;
        return new class11(this.field1676, var7, this.field1679, this.field1651, this.field1669);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ldk;II)Lah;", line = 96)
    public static final class108 method797(class241 arg0, int arg1, int arg2) {
        if (method798(arg0)) {
            byte[] var3 = arg0.method1647(arg1, (byte) 123, arg2);
            return var3 == null ? null : new class108(var3);
        } else {
            arg0.method1638((byte) 23, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ldk;)Z", line = 110)
    private static final boolean method798(class241 arg0) {
        if (!field1662) {
            byte[] var1 = arg0.method1647(0, (byte) 126, 0);
            if (var1 == null) {
                return false;
            }
            method804(var1);
            field1662 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)[F", line = 126)
    private final float[] method799(int arg0) {
        method800(this.field1671[arg0], 0);
        method794();
        int var2 = method803(class15.method60(false, field1674.length - 1));
        boolean var3 = field1655[var2];
        int var4 = var3 ? field1661 : field1668;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method794() != 0;
            var6 = method794() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1668 >> 2);
            var9 = (field1668 >> 2) + (var4 >> 2);
            var10 = field1668 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1668 >> 2);
            var12 = (field1668 >> 2) + (var4 - (var4 >> 2));
            var13 = field1668 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class223 var14 = field1665[field1674[var2]];
        int var15 = var14.field3599;
        int var16 = var14.field3600[var15];
        boolean var17 = !field1675[var16].method1569();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3598; var19++) {
            class3 var20 = field1663[var14.field3601[var19]];
            float[] var21 = field1657;
            var20.method8(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3599;
            int var23 = var14.field3600[var22];
            field1675[var23].method1567(field1657, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field1657[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field1657;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field1670 : field1666;
            float[] var32 = var3 ? field1677 : field1672;
            float[] var33 = var3 ? field1658 : field1654;
            int[] var34 = var3 ? field1664 : field1656;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class15.method60(false, var4 - 1);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field1657[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1657[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field1660 > 0) {
            int var91 = this.field1660 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field1659) {
                for (int var92 = 0; var92 < this.field1650; var92++) {
                    int var93 = (this.field1660 >> 1) + var92;
                    var90[var92] += this.field1649[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field1657[var94];
                }
            }
        }
        float[] var96 = this.field1649;
        this.field1649 = field1657;
        field1657 = var96;
        this.field1660 = var4;
        this.field1650 = var12 - (var4 >> 1);
        this.field1659 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BI)V", line = 538)
    private static final void method800(byte[] arg0, int arg1) {
        field1667 = arg0;
        field1652 = arg1;
        field1673 = 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([B)V", line = 551)
    private final void method801(byte[] arg0) {
        class153 var2 = new class153(arg0);
        this.field1676 = var2.method1089((byte) -14);
        this.field1653 = var2.method1089((byte) -14);
        this.field1679 = var2.method1089((byte) -14);
        this.field1651 = var2.method1089((byte) -14);
        if (this.field1651 < 0) {
            this.field1651 = ~this.field1651;
            this.field1669 = true;
        }
        int var3 = var2.method1089((byte) -14);
        this.field1671 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1042((byte) 120);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1080(var5, (byte) -65, 0, var7);
            this.field1671[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)F", line = 599)
    public static final float method802(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)I", line = 619)
    public static final int method803(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1673) {
            int var3 = 8 - field1673;
            int var4 = (0x1 << var3) - 1;
            var1 += (field1667[field1652] >> field1673 & var4) << var2;
            field1673 = 0;
            field1652++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field1667[field1652] >> field1673 & var5) << var2;
            field1673 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "([B)V", line = 649)
    private static final void method804(byte[] arg0) {
        method800(arg0, 0);
        field1668 = 0x1 << method803(4);
        field1661 = 0x1 << method803(4);
        field1657 = new float[field1661];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field1668 : field1661;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class15.method60(false, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class216.method1502(var13, 98, var14);
            }
            if (var1 == 0) {
                field1666 = var6;
                field1672 = var8;
                field1654 = var10;
                field1656 = var12;
            } else {
                field1670 = var6;
                field1677 = var8;
                field1658 = var10;
                field1664 = var12;
            }
        }
        int var15 = method803(8) + 1;
        field1678 = new class202[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field1678[var16] = new class202();
        }
        int var17 = method803(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method803(16);
        }
        int var19 = method803(6) + 1;
        field1675 = new class230[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field1675[var20] = new class230();
        }
        int var21 = method803(6) + 1;
        field1663 = new class3[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field1663[var22] = new class3();
        }
        int var23 = method803(6) + 1;
        field1665 = new class223[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field1665[var24] = new class223();
        }
        int var25 = method803(6) + 1;
        field1655 = new boolean[var25];
        field1674 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field1655[var26] = method794() != 0;
            method803(16);
            method803(16);
            field1674[var26] = method803(8);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "([B)V", line = 803)
    private class108(byte[] arg0) {
        this.method801(arg0);
    }
}
