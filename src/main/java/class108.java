import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class108 extends class104 {

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "Z")
    private static boolean field1812 = false;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    private int field1787;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    private static int field1788;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    private static int field1791;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    private static int field1802;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    private int field1806;

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    private static int field1807;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    private int field1808;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
    private int field1809;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    private int field1817;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "Z")
    private boolean field1790;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Z")
    private boolean field1814;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "[B")
    private static byte[] field1801;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "[B")
    private byte[] field1816;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "[F")
    private float[] field1793;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "[F")
    private static float[] field1796;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "[F")
    private static float[] field1797;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "[F")
    private static float[] field1799;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "[F")
    private static float[] field1803;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "[F")
    private static float[] field1804;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "[F")
    private static float[] field1805;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "[F")
    private static float[] field1810;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[I")
    private static int[] field1785;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "[I")
    private static int[] field1786;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "[I")
    private static int[] field1811;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "[Lwj;")
    private static class139[] field1800;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "[Luf;")
    public static class160[] field1792;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "[Lge;")
    private static class264[] field1795;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "[Lgf;")
    private static class98[] field1794;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "[Z")
    private static boolean[] field1813;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "[[B")
    private byte[][] field1815;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)[F")
    private final float[] method689(int arg0) {
        method691(this.field1815[arg0], 0);
        method696();
        int var2 = method690(class91.method553(field1785.length - 1, 80));
        boolean var3 = field1813[var2];
        int var4 = var3 ? field1807 : field1791;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method696() != 0;
            var6 = method696() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1791 >> 2);
            var9 = (field1791 >> 2) + (var4 >> 2);
            var10 = field1791 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1791 >> 2);
            var12 = (field1791 >> 2) + (var4 - (var4 >> 2));
            var13 = field1791 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class98 var14 = field1794[field1785[var2]];
        int var15 = var14.field1578;
        int var16 = var14.field1580[var15];
        boolean var17 = !field1795[var16].method1815();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1579; var19++) {
            class139 var95 = field1800[var14.field1577[var19]];
            float[] var96 = field1804;
            var95.method923(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1578;
            int var21 = var14.field1580[var20];
            field1795[var21].method1814(field1804, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1804[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1804;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1803 : field1796;
            float[] var30 = var3 ? field1797 : field1805;
            float[] var31 = var3 ? field1810 : field1799;
            int[] var32 = var3 ? field1786 : field1811;
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
            int var35 = class91.method553(var4 - 1, 60);
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
                field1804[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1804[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1806 > 0) {
            int var49 = this.field1806 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1790) {
                for (int var50 = 0; var50 < this.field1787; var50++) {
                    int var51 = (this.field1806 >> 1) + var50;
                    var48[var50] += this.field1793[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1804[var52];
                }
            }
        }
        float[] var54 = this.field1793;
        this.field1793 = field1804;
        field1804 = var54;
        this.field1806 = var4;
        this.field1787 = var12 - (var4 >> 1);
        this.field1790 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)I")
    public static final int method690(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1788) {
            int var4 = 8 - field1788;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1801[field1802] >> field1788 & var5) << var2;
            field1788 = 0;
            field1802++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1801[field1802] >> field1788 & var3) << var2;
            field1788 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BI)V")
    private static final void method691(byte[] arg0, int arg1) {
        field1801 = arg0;
        field1802 = arg1;
        field1788 = 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([B)V")
    private final void method692(byte[] arg0) {
        class225 var2 = new class225(arg0);
        this.field1809 = var2.method1562(21705);
        this.field1789 = var2.method1562(21705);
        this.field1798 = var2.method1562(21705);
        this.field1808 = var2.method1562(21705);
        if (this.field1808 < 0) {
            this.field1808 = ~this.field1808;
            this.field1814 = true;
        }
        int var3 = var2.method1562(21705);
        this.field1815 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1580(-41);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1610(var7, var5, 0, (byte) 75);
            this.field1815[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lng;)Z")
    private static final boolean method693(class121 arg0) {
        if (!field1812) {
            byte[] var1 = arg0.method826((byte) 35, 0, 0);
            if (var1 == null) {
                return false;
            }
            method698(var1);
            field1812 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lng;II)Lce;")
    public static final class108 method694(class121 arg0, int arg1, int arg2) {
        if (method693(arg0)) {
            byte[] var3 = arg0.method826((byte) 35, arg1, arg2);
            return var3 == null ? null : new class108(var3);
        } else {
            arg0.method801(arg2, arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
    public static void method695() {
        field1801 = null;
        field1792 = null;
        field1795 = null;
        field1800 = null;
        field1794 = null;
        field1813 = null;
        field1785 = null;
        field1804 = null;
        field1796 = null;
        field1805 = null;
        field1799 = null;
        field1803 = null;
        field1797 = null;
        field1810 = null;
        field1811 = null;
        field1786 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()I")
    public static final int method696() {
        int var0 = field1801[field1802] >> field1788 & 0x1;
        field1788++;
        field1802 += field1788 >> 3;
        field1788 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)F")
    public static final float method697(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "([B)V")
    private static final void method698(byte[] arg0) {
        method691(arg0, 0);
        field1791 = 0x1 << method690(4);
        field1807 = 0x1 << method690(4);
        field1804 = new float[field1807];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1791 : field1807;
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
            int var25 = class91.method553(var17 - 1, 97);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class230.method1635(true, var25, var26);
            }
            if (var1 == 0) {
                field1796 = var18;
                field1805 = var20;
                field1799 = var22;
                field1811 = var24;
            } else {
                field1803 = var18;
                field1797 = var20;
                field1810 = var22;
                field1786 = var24;
            }
        }
        int var2 = method690(8) + 1;
        field1792 = new class160[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1792[var3] = new class160();
        }
        int var4 = method690(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method690(16);
        }
        int var6 = method690(6) + 1;
        field1795 = new class264[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1795[var7] = new class264();
        }
        int var8 = method690(6) + 1;
        field1800 = new class139[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1800[var9] = new class139();
        }
        int var10 = method690(6) + 1;
        field1794 = new class98[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1794[var11] = new class98();
        }
        int var12 = method690(6) + 1;
        field1813 = new boolean[var12];
        field1785 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1813[var13] = method696() != 0;
            method690(16);
            method690(16);
            field1785[var13] = method690(8);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([I)Ltf;")
    public final class103 method699(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1816 == null) {
            this.field1806 = 0;
            this.field1793 = new float[field1807];
            this.field1816 = new byte[this.field1789];
            this.field1818 = 0;
            this.field1817 = 0;
        }
        while (this.field1817 < this.field1815.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method689(this.field1817);
            if (var3 != null) {
                int var4 = this.field1818;
                int var5 = var3.length;
                if (var5 > this.field1789 - var4) {
                    var5 = this.field1789 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1816[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1818;
                }
                this.field1818 = var4;
            }
            this.field1817++;
        }
        this.field1793 = null;
        byte[] var2 = this.field1816;
        this.field1816 = null;
        return new class103(this.field1809, var2, this.field1798, this.field1808, this.field1814);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
    private class108(byte[] arg0) {
        this.method692(arg0);
    }
}
