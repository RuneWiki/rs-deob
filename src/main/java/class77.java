import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class77 extends class71 {

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "[[B")
    public byte[][] field1859 = new byte[256][];

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public int field1870 = 0;

    @OriginalMember(owner = "client!ie", name = "tb", descriptor = "[I")
    private int[] field1876;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "[I")
    private int[] field1869;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
    private int[] field1850;

    @OriginalMember(owner = "client!ie", name = "xb", descriptor = "[I")
    private int[] field1880;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "I")
    private int field1867;

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "I")
    private int field1872;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "Lea;")
    private static class38 field1849 = class9.method46((byte) 116, ")4u");

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lea;")
    private static class38 field1851 = class9.method46((byte) 121, "u=");

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    private static int field1847 = 256;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    private static int field1863 = 256;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "Lea;")
    private static class38 field1866 = class9.method46((byte) 106, ")4str");

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    private static int field1868 = 0;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    private static int field1865 = -1;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Lea;")
    private static class38 field1848 = class9.method46((byte) 109, ")4shad");

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "Lea;")
    private static class38 field1871 = class9.method46((byte) 111, ")4col");

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    private static int field1862 = -1;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Lea;")
    private static class38 field1853 = class9.method46((byte) 120, "br");

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "Lea;")
    private static class38 field1874 = class9.method46((byte) 127, "lt");

    @OriginalMember(owner = "client!ie", name = "ub", descriptor = "Lea;")
    private static class38 field1877 = class9.method46((byte) 125, "str=");

    @OriginalMember(owner = "client!ie", name = "sb", descriptor = "I")
    private static int field1875 = 0;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Lea;")
    private static class38 field1860 = class9.method46((byte) 114, "img=");

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Lea;")
    private static class38 field1854 = class9.method46((byte) 121, "gt");

    @OriginalMember(owner = "client!ie", name = "wb", descriptor = "Lea;")
    private static class38 field1879 = class9.method46((byte) 115, "shad=");

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "Lea;")
    private static class38 field1861 = class9.method46((byte) 102, "col=");

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    private static int field1857 = -1;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    private static int field1855 = 0;

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
    private static int field1864 = 0;

    @OriginalMember(owner = "client!ie", name = "vb", descriptor = "Lea;")
    private static class38 field1878 = class9.method46((byte) 115, "shad");

    @OriginalMember(owner = "client!ie", name = "Ab", descriptor = "I")
    private static int field1883 = -1;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lea;")
    private static class38 field1858 = class9.method46((byte) 125, "u");

    @OriginalMember(owner = "client!ie", name = "yb", descriptor = "Lea;")
    private static class38 field1881 = class9.method46((byte) 125, "str");

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "[Lea;")
    private static class38[] field1873 = new class38[100];

    @OriginalMember(owner = "client!ie", name = "zb", descriptor = "[B")
    private byte[] field1882;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "[I")
    private int[] field1852;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "[Lfa;")
    public static class47[] field1856;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;[I[Lea;)I")
    private final int method638(class38 arg0, int[] arg1, class38[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class38 var6 = class52.method381(100, 0);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method276((byte) 38);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method265(var14, 24);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class38 var16 = arg0.method273(0, var10 + 1, var14);
                    var10 = -1;
                    var6.method258(0, 60);
                    var6.method261(var16, -20035);
                    var6.method258(0, 62);
                    if (var16.method252(-127, field1853)) {
                        arg2[var12++] = var6.method273(0, var5, var6.method276((byte) 38));
                        var5 = var6.method276((byte) 38);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method252(-107, field1874)) {
                        var4 += this.method654(60);
                        if (this.field1882 != null && var11 != -1) {
                            var4 += this.field1882[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method252(-106, field1854)) {
                        var4 += this.method654(62);
                        if (this.field1882 != null && var11 != -1) {
                            var4 += this.field1882[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method269(field1860, 52)) {
                        try {
                            int var17 = var16.method262(4, -1).method279(8109);
                            var4 += field1856[var17].field1146;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method258(0, var15);
                        var4 += this.method654(var15);
                        if (this.field1882 != null && var11 != -1) {
                            var4 += this.field1882[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method276((byte) 38);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method273(0, var5, var7 - var9);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method276((byte) 38);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method276((byte) 38) > var5) {
            arg2[var12++] = var6.method273(0, var5, var6.method276((byte) 38));
        }
        return var12;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([B)V")
    private final void method639(byte[] arg0) {
        this.field1852 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field1852.length; var2++) {
                this.field1852[var2] = arg0[var2] & 0xFF;
            }
            this.field1870 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field1852[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field1882 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field1882[(var13 << 8) + var14] = (byte) method664(var9, var11, var6, this.field1852, var5, var13, var14);
                    }
                }
            }
        }
        this.field1870 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;IIIIII)V")
    public final void method640(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method641(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field802];
        for (int var11 = 0; var11 < arg0.field802; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method657(arg0, arg1 - this.method656(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
    private final void method641(int arg0, int arg1) {
        field1857 = -1;
        field1883 = -1;
        field1865 = arg1;
        field1862 = arg1;
        field1855 = arg0;
        field1864 = arg0;
        field1847 = 256;
        field1863 = 256;
        field1868 = 0;
        field1875 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;IIII)V")
    public final void method642(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method641(arg3, arg4);
            this.method650(arg0, arg1 - this.method656(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;IIIII)V")
    public final void method643(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method641(arg3, arg4);
        int[] var7 = new int[arg0.field802];
        for (int var8 = 0; var8 < arg0.field802; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method657(arg0, arg1 - this.method656(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;)Lea;")
    public static final class38 method644(class38 arg0) {
        int var1 = arg0.method276((byte) 38);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field821[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class38 var4 = new class38();
        var4.field802 = var1 + var2;
        var4.field821 = new byte[var4.field802];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field821[var6];
            if (var7 == 60) {
                var4.field821[var5++] = 60;
                var4.field821[var5++] = 108;
                var4.field821[var5++] = 116;
                var4.field821[var5++] = 62;
            } else if (var7 == 62) {
                var4.field821[var5++] = 60;
                var4.field821[var5++] = 103;
                var4.field821[var5++] = 116;
                var4.field821[var5++] = 62;
            } else {
                var4.field821[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lea;IIII)V")
    public final void method645(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method641(arg3, arg4);
            this.method650(arg0, arg1 - this.method656(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lea;IIII)V")
    public final void method646(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method641(arg3, arg4);
            this.method650(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;I)V")
    private final void method647(class38 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method276((byte) 38); var5++) {
            int var6 = arg0.method265(var5, -127);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field1868 = (arg1 - this.method656(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lea;IIIII)V")
    public final void method648(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method641(arg3, arg4);
        int[] var7 = new int[arg0.field802];
        int[] var8 = new int[arg0.field802];
        for (int var9 = 0; var9 < arg0.field802; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method657(arg0, arg1 - this.method656(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;IIIILjava/util/Random;I)I")
    public final int method649(class38 arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg0 == null) {
            return 0;
        }
        arg5.setSeed((long) arg6);
        this.method663(arg3, arg4, (arg5.nextInt() & 0x1F) + 192);
        int[] var8 = new int[arg0.field802];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field802; var10++) {
            var8[var10] = var9;
            if ((arg5.nextInt() & 0x3) == 0) {
                var9++;
            }
        }
        this.method657(arg0, arg1, arg2, var8, null);
        return var9;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;II)V")
    private final void method650(class38 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1870;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field802; var7++) {
            int var8 = arg0.field821[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class38 var9 = arg0.method273(0, var5 + 1, var7);
                    var5 = -1;
                    if (var9.method252(-98, field1874)) {
                        var8 = 60;
                    } else {
                        if (!var9.method252(-89, field1854)) {
                            if (var9.method269(field1860, 52)) {
                                try {
                                    int var10 = var9.method262(4, -1).method279(8109);
                                    class47 var11 = field1856[var10];
                                    var11.method335(arg1, this.field1870 + var4 - var11.field1140);
                                    arg1 += var11.field1146;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method666(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field1882 != null && var6 != -1) {
                        arg1 += this.field1882[(var6 << 8) + var8];
                    }
                    int var12 = this.field1850[var8];
                    int var13 = this.field1880[var8];
                    if (var8 == 32) {
                        if (field1868 > 0) {
                            field1875 += field1868;
                            arg1 += field1875 >> 8;
                            field1875 &= 0xFF;
                        }
                    } else if (field1863 == 256) {
                        if (field1862 != -1) {
                            this.method653(var8, this.field1876[var8] + arg1 + 1, this.field1869[var8] + var4 + 1, var12, var13, field1862);
                        }
                        this.method655(var8, this.field1876[var8] + arg1, this.field1869[var8] + var4, var12, var13, field1864);
                    } else {
                        if (field1862 != -1) {
                            this.method665(var8, this.field1876[var8] + arg1 + 1, this.field1869[var8] + var4 + 1, var12, var13, field1862, field1863);
                        }
                        this.method660(var8, this.field1876[var8] + arg1, this.field1869[var8] + var4, var12, var13, field1864, field1863);
                    }
                    int var14 = this.field1852[var8];
                    if (field1857 != -1) {
                        class71.method560(arg1, (int) ((double) this.field1870 * 0.7D) + var4, var14, field1857);
                    }
                    if (field1883 != -1) {
                        class71.method560(arg1, this.field1870 + var4 + 1, var14, field1883);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lea;I)I")
    public final int method651(class38 arg0, int arg1) {
        return this.method638(arg0, new int[] { arg1 }, field1873);
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()V")
    public static void method652() {
        field1874 = null;
        field1854 = null;
        field1860 = null;
        field1853 = null;
        field1861 = null;
        field1871 = null;
        field1851 = null;
        field1858 = null;
        field1849 = null;
        field1879 = null;
        field1878 = null;
        field1848 = null;
        field1877 = null;
        field1881 = null;
        field1866 = null;
        field1856 = null;
        field1873 = null;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(IIIIII)V")
    private final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class71.field1755 * arg2 + arg1;
        int var8 = class71.field1755 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class71.field1756) {
            int var11 = class71.field1756 - arg2;
            arg4 -= var11;
            arg2 = class71.field1756;
            var10 += arg3 * var11;
            var7 += class71.field1755 * var11;
        }
        if (arg2 + arg4 > class71.field1757) {
            arg4 -= arg2 + arg4 - class71.field1757;
        }
        if (arg1 < class71.field1754) {
            int var12 = class71.field1754 - arg1;
            arg3 -= var12;
            arg1 = class71.field1754;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class71.field1760) {
            int var13 = arg1 + arg3 - class71.field1760;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method659(class71.field1759, this.field1859[arg0], arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)I")
    private final int method654(int arg0) {
        return this.field1852[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(IIIIII)V")
    public abstract void method655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lea;)I")
    public final int method656(class38 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field802; var5++) {
            int var6 = arg0.field821[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class38 var7 = arg0.method273(0, var2 + 1, var5);
                    var2 = -1;
                    if (var7.method252(-77, field1874)) {
                        var6 = 60;
                    } else {
                        if (!var7.method252(-98, field1854)) {
                            if (var7.method269(field1860, 52)) {
                                try {
                                    int var8 = var7.method262(4, -1).method279(8109);
                                    var4 += field1856[var8].field1146;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field1852[var6];
                    if (this.field1882 != null && var3 != -1) {
                        var4 += this.field1882[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;II[I[I)V")
    private final void method657(class38 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1870;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field802; var10++) {
            int var11 = arg0.field821[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class38 var12 = arg0.method273(0, var7 + 1, var10);
                    var7 = -1;
                    if (var12.method252(-118, field1874)) {
                        var11 = 60;
                    } else {
                        if (!var12.method252(-89, field1854)) {
                            if (var12.method269(field1860, 52)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method262(4, -1).method279(8109);
                                    class47 var16 = field1856[var15];
                                    var16.method335(arg1 + var13, this.field1870 + var6 - var16.field1140 + var14);
                                    arg1 += var16.field1146;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method666(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field1882 != null && var8 != -1) {
                        arg1 += this.field1882[(var8 << 8) + var11];
                    }
                    int var17 = this.field1850[var11];
                    int var18 = this.field1880[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field1868 > 0) {
                            field1875 += field1868;
                            arg1 += field1875 >> 8;
                            field1875 &= 0xFF;
                        }
                    } else if (field1863 == 256) {
                        if (field1862 != -1) {
                            this.method653(var11, this.field1876[var11] + arg1 + var19 + 1, this.field1869[var11] + var6 + 1 + var20, var17, var18, field1862);
                        }
                        this.method655(var11, this.field1876[var11] + arg1 + var19, this.field1869[var11] + var6 + var20, var17, var18, field1864);
                    } else {
                        if (field1862 != -1) {
                            this.method665(var11, this.field1876[var11] + arg1 + var19 + 1, this.field1869[var11] + var6 + 1 + var20, var17, var18, field1862, field1863);
                        }
                        this.method660(var11, this.field1876[var11] + arg1 + var19, this.field1869[var11] + var6 + var20, var17, var18, field1864, field1863);
                    }
                    int var21 = this.field1852[var11];
                    if (field1857 != -1) {
                        class71.method560(arg1, (int) ((double) this.field1870 * 0.7D) + var6, var21, field1857);
                    }
                    if (field1883 != -1) {
                        class71.method560(arg1, this.field1870 + var6, var21, field1883);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;IIIIIIIII)I")
    public final int method658(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        return this.method662(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7, arg8, arg9);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method659(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method661(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lea;IIIIIIIIII)I")
    private final int method662(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg0 == null) {
            return 0;
        }
        this.method663(arg5, arg6, arg7);
        if (arg10 == 0) {
            arg10 = this.field1870;
        }
        int[] var12 = new int[] { arg3 };
        if (arg4 < this.field1872 + this.field1867 + arg10 && arg4 < arg10 + arg10) {
            var12 = null;
        }
        int var13 = this.method638(arg0, var12, field1873);
        if (arg9 == 3 && var13 == 1) {
            arg9 = 1;
        }
        int var14;
        if (arg9 == 0) {
            var14 = this.field1867 + arg2;
        } else if (arg9 == 1) {
            var14 = (arg4 - this.field1867 - this.field1872 - (var13 - 1) * arg10) / 2 + this.field1867 + arg2;
        } else if (arg9 == 2) {
            var14 = arg2 + arg4 - this.field1872 - (var13 - 1) * arg10;
        } else {
            int var15 = (arg4 - this.field1867 - this.field1872 - (var13 - 1) * arg10) / (var13 + 1);
            if (var15 < 0) {
                var15 = 0;
            }
            var14 = this.field1867 + arg2 + var15;
            arg10 += var15;
        }
        for (int var16 = 0; var16 < var13; var16++) {
            if (arg8 == 0) {
                this.method650(field1873[var16], arg1, var14);
            } else if (arg8 == 1) {
                this.method650(field1873[var16], arg1 + (arg3 - this.method656(field1873[var16])) / 2, var14);
            } else if (arg8 == 2) {
                this.method650(field1873[var16], arg1 + arg3 - this.method656(field1873[var16]), var14);
            } else if (var13 - 1 == var16) {
                this.method650(field1873[var16], arg1, var14);
            } else {
                this.method647(field1873[var16], arg3);
                this.method650(field1873[var16], arg1, var14);
                field1868 = 0;
            }
            var14 += arg10;
        }
        return var13;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    private final void method663(int arg0, int arg1, int arg2) {
        field1857 = -1;
        field1883 = -1;
        field1865 = arg1;
        field1862 = arg1;
        field1855 = arg0;
        field1864 = arg0;
        field1847 = arg2;
        field1863 = arg2;
        field1868 = 0;
        field1875 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method664(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIIIIII)V")
    private final void method665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = class71.field1755 * arg2 + arg1;
        int var9 = class71.field1755 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < class71.field1756) {
            int var12 = class71.field1756 - arg2;
            arg4 -= var12;
            arg2 = class71.field1756;
            var11 += arg3 * var12;
            var8 += class71.field1755 * var12;
        }
        if (arg2 + arg4 > class71.field1757) {
            arg4 -= arg2 + arg4 - class71.field1757;
        }
        if (arg1 < class71.field1754) {
            int var13 = class71.field1754 - arg1;
            arg3 -= var13;
            arg1 = class71.field1754;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > class71.field1760) {
            int var14 = arg1 + arg3 - class71.field1760;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method661(class71.field1759, this.field1859[arg0], arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class77(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field1876 = arg1;
        this.field1869 = arg2;
        this.field1850 = arg3;
        this.field1880 = arg4;
        this.method639(arg0);
        this.field1859 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1869[var10] < var8 && this.field1880[var10] != 0) {
                var8 = this.field1869[var10];
            }
            if (this.field1880[var10] + this.field1869[var10] > var9) {
                var9 = this.field1880[var10] + this.field1869[var10];
            }
        }
        this.field1867 = this.field1870 - var8;
        this.field1872 = var9 - this.field1870;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lea;)V")
    private final void method666(class38 arg0) {
        try {
            if (arg0.method269(field1861, 52)) {
                field1864 = arg0.method262(4, -1).method259(1037, 16);
                return;
            }
            if (arg0.method252(-88, field1871)) {
                field1864 = field1855;
                return;
            }
            if (arg0.method269(field1877, 52)) {
                field1857 = arg0.method262(4, -1).method259(1037, 16);
                return;
            }
            if (arg0.method252(-79, field1881)) {
                field1857 = 8388608;
                return;
            }
            if (arg0.method252(-99, field1866)) {
                field1857 = -1;
                return;
            }
            if (arg0.method269(field1851, 52)) {
                field1883 = arg0.method262(2, -1).method259(1037, 16);
                return;
            }
            if (arg0.method252(-99, field1858)) {
                field1883 = 0;
                return;
            }
            if (arg0.method252(-128, field1849)) {
                field1883 = -1;
                return;
            }
            if (arg0.method269(field1879, 52)) {
                field1862 = arg0.method262(5, -1).method259(1037, 16);
                return;
            }
            if (arg0.method252(-122, field1878)) {
                field1862 = 0;
                return;
            }
            if (arg0.method252(-101, field1848)) {
                field1862 = field1865;
                return;
            }
            if (arg0.method252(-89, field1853)) {
                this.method663(field1855, field1865, field1847);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(Lea;I)I")
    public final int method667(class38 arg0, int arg1) {
        int var3 = this.method638(arg0, new int[] { arg1 }, field1873);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method656(field1873[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "([B)V")
    public class77(byte[] arg0) {
        this.method639(arg0);
    }
}
