import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class121 extends class82 {

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Z")
    private static boolean field1834 = false;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    private static int field1823;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    private static int field1827;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    private static int field1828;

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    private int field1837;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    private static int field1844;

    @OriginalMember(owner = "client!u", name = "W", descriptor = "I")
    private int field1849;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    private int field1851;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Z")
    private boolean field1818;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Z")
    private boolean field1847;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "[B")
    private static byte[] field1838;

    @OriginalMember(owner = "client!u", name = "X", descriptor = "[B")
    private byte[] field1850;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "[F")
    private static float[] field1822;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "[F")
    private static float[] field1824;

    @OriginalMember(owner = "client!u", name = "E", descriptor = "[F")
    private static float[] field1831;

    @OriginalMember(owner = "client!u", name = "F", descriptor = "[F")
    private static float[] field1832;

    @OriginalMember(owner = "client!u", name = "G", descriptor = "[F")
    private static float[] field1833;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "[F")
    private static float[] field1835;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "[F")
    private float[] field1845;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "[F")
    private static float[] field1848;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "[I")
    private static int[] field1820;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "[I")
    private static int[] field1821;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "[I")
    private static int[] field1826;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "[Lvj;")
    private static class117[] field1846;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "[Ltc;")
    public static class182[] field1843;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "[Lbl;")
    private static class34[] field1842;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "[Lej;")
    private static class51[] field1825;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "[Z")
    private static boolean[] field1841;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "[[B")
    private byte[][] field1829;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)I")
    public static final int method763(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field1828) {
            int var4 = 8 - field1828;
            int var5 = (0x1 << var4) - 1;
            var1 += (field1838[field1827] >> field1828 & var5) << var2;
            field1828 = 0;
            field1827++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field1838[field1827] >> field1828 & var3) << var2;
            field1828 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([I)Ljk;")
    public final class260 method764(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field1850 == null) {
            this.field1840 = 0;
            this.field1845 = new float[field1823];
            this.field1850 = new byte[this.field1830];
            this.field1849 = 0;
            this.field1851 = 0;
        }
        while (this.field1851 < this.field1829.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method769(this.field1851);
            if (var3 != null) {
                int var4 = this.field1849;
                int var5 = var3.length;
                if (var5 > this.field1830 - var4) {
                    var5 = this.field1830 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field1850[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field1849;
                }
                this.field1849 = var4;
            }
            this.field1851++;
        }
        this.field1845 = null;
        byte[] var2 = this.field1850;
        this.field1850 = null;
        return new class260(this.field1839, var2, this.field1836, this.field1837, this.field1818);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lpf;II)Lu;")
    public static final class121 method765(class294 arg0, int arg1, int arg2) {
        if (method773(arg0)) {
            byte[] var3 = arg0.method1973(1, arg1, arg2);
            return var3 == null ? null : new class121(var3);
        } else {
            arg0.method1969(arg1, -117, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)F")
    public static final float method766(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([BI)V")
    private static final void method767(byte[] arg0, int arg1) {
        field1838 = arg0;
        field1827 = arg1;
        field1828 = 0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([B)V")
    private static final void method768(byte[] arg0) {
        method767(arg0, 0);
        field1844 = 0x1 << method763(4);
        field1823 = 0x1 << method763(4);
        field1832 = new float[field1823];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field1844 : field1823;
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
            int var25 = class114.method734(var17 - 1, 91);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class129.method805(-1, var25, var26);
            }
            if (var1 == 0) {
                field1835 = var18;
                field1822 = var20;
                field1833 = var22;
                field1826 = var24;
            } else {
                field1848 = var18;
                field1831 = var20;
                field1824 = var22;
                field1821 = var24;
            }
        }
        int var2 = method763(8) + 1;
        field1843 = new class182[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field1843[var3] = new class182();
        }
        int var4 = method763(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method763(16);
        }
        int var6 = method763(6) + 1;
        field1825 = new class51[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field1825[var7] = new class51();
        }
        int var8 = method763(6) + 1;
        field1846 = new class117[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field1846[var9] = new class117();
        }
        int var10 = method763(6) + 1;
        field1842 = new class34[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field1842[var11] = new class34();
        }
        int var12 = method763(6) + 1;
        field1841 = new boolean[var12];
        field1820 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field1841[var13] = method772() != 0;
            method763(16);
            method763(16);
            field1820[var13] = method763(8);
        }
    }

    @OriginalMember(owner = "client!u", name = "h", descriptor = "(I)[F")
    private final float[] method769(int arg0) {
        method767(this.field1829[arg0], 0);
        method772();
        int var2 = method763(class114.method734(field1820.length - 1, 82));
        boolean var3 = field1841[var2];
        int var4 = var3 ? field1823 : field1844;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method772() != 0;
            var6 = method772() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field1844 >> 2);
            var9 = (field1844 >> 2) + (var4 >> 2);
            var10 = field1844 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field1844 >> 2);
            var12 = (field1844 >> 2) + (var4 - (var4 >> 2));
            var13 = field1844 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class34 var14 = field1842[field1820[var2]];
        int var15 = var14.field490;
        int var16 = var14.field492[var15];
        boolean var17 = !field1825[var16].method338();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field491; var19++) {
            class117 var95 = field1846[var14.field489[var19]];
            float[] var96 = field1832;
            var95.method748(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field490;
            int var21 = var14.field492[var20];
            field1825[var21].method342(field1832, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field1832[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field1832;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field1848 : field1835;
            float[] var30 = var3 ? field1831 : field1822;
            float[] var31 = var3 ? field1824 : field1833;
            int[] var32 = var3 ? field1821 : field1826;
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
            int var35 = class114.method734(var4 - 1, 80);
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
                field1832[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field1832[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field1840 > 0) {
            int var49 = this.field1840 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field1847) {
                for (int var50 = 0; var50 < this.field1819; var50++) {
                    int var51 = (this.field1840 >> 1) + var50;
                    var48[var50] += this.field1845[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field1832[var52];
                }
            }
        }
        float[] var54 = this.field1845;
        this.field1845 = field1832;
        field1832 = var54;
        this.field1840 = var4;
        this.field1819 = var12 - (var4 >> 1);
        this.field1847 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static void method770() {
        field1838 = null;
        field1843 = null;
        field1825 = null;
        field1846 = null;
        field1842 = null;
        field1841 = null;
        field1820 = null;
        field1832 = null;
        field1835 = null;
        field1822 = null;
        field1833 = null;
        field1848 = null;
        field1831 = null;
        field1824 = null;
        field1826 = null;
        field1821 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "([B)V")
    private final void method771(byte[] arg0) {
        class248 var2 = new class248(arg0);
        this.field1839 = var2.method1576(-17672);
        this.field1830 = var2.method1576(-17672);
        this.field1836 = var2.method1576(-17672);
        this.field1837 = var2.method1576(-17672);
        if (this.field1837 < 0) {
            this.field1837 = ~this.field1837;
            this.field1818 = true;
        }
        int var3 = var2.method1576(-17672);
        this.field1829 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1593((byte) 27);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1579(28172, var7, 0, var5);
            this.field1829[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
    public static final int method772() {
        int var0 = field1838[field1827] >> field1828 & 0x1;
        field1828++;
        field1827 += field1828 >> 3;
        field1828 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lpf;)Z")
    private static final boolean method773(class294 arg0) {
        if (!field1834) {
            byte[] var1 = arg0.method1973(1, 0, 0);
            if (var1 == null) {
                return false;
            }
            method768(var1);
            field1834 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "([B)V")
    private class121(byte[] arg0) {
        this.method771(arg0);
    }
}
