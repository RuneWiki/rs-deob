import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class106 extends class530 {

    @OriginalMember(owner = "client!at", name = "A", descriptor = "I")
    private int field1801 = 0;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "Z")
    private boolean field1800 = false;

    @OriginalMember(owner = "client!at", name = "pb", descriptor = "Z")
    private boolean field1842 = true;

    @OriginalMember(owner = "client!at", name = "O", descriptor = "I")
    private int field1815 = 0;

    @OriginalMember(owner = "client!at", name = "Pb", descriptor = "I")
    private int field1868 = 0;

    @OriginalMember(owner = "client!at", name = "cc", descriptor = "I")
    private int field1881 = 0;

    @OriginalMember(owner = "client!at", name = "Qb", descriptor = "I")
    private int field1869 = 0;

    @OriginalMember(owner = "client!at", name = "Lb", descriptor = "Lih;")
    private class214 field1864;

    @OriginalMember(owner = "client!at", name = "ab", descriptor = "Lnn;")
    private class45 field1827;

    @OriginalMember(owner = "client!at", name = "bb", descriptor = "Lnn;")
    private class45 field1828;

    @OriginalMember(owner = "client!at", name = "ub", descriptor = "Lnn;")
    private class45 field1847;

    @OriginalMember(owner = "client!at", name = "Eb", descriptor = "Lnn;")
    private class45 field1857;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "Lnr;")
    private class16 field1811;

    @OriginalMember(owner = "client!at", name = "bc", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    private int field1808;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "[I")
    private int[] field1798;

    @OriginalMember(owner = "client!at", name = "T", descriptor = "[I")
    private int[] field1820;

    @OriginalMember(owner = "client!at", name = "xb", descriptor = "[I")
    private int[] field1850;

    @OriginalMember(owner = "client!at", name = "nb", descriptor = "[S")
    private short[] field1840;

    @OriginalMember(owner = "client!at", name = "db", descriptor = "[I")
    private int[] field1830;

    @OriginalMember(owner = "client!at", name = "Jb", descriptor = "[Lhv;")
    private class150[] field1862;

    @OriginalMember(owner = "client!at", name = "gc", descriptor = "[Lgh;")
    private class345[] field1885;

    @OriginalMember(owner = "client!at", name = "ac", descriptor = "I")
    private int field1879;

    @OriginalMember(owner = "client!at", name = "N", descriptor = "[Lds;")
    private class12[] field1814;

    @OriginalMember(owner = "client!at", name = "jc", descriptor = "[Lea;")
    private class15[] field1888;

    @OriginalMember(owner = "client!at", name = "Nb", descriptor = "[S")
    private short[] field1866;

    @OriginalMember(owner = "client!at", name = "qb", descriptor = "[S")
    private short[] field1843;

    @OriginalMember(owner = "client!at", name = "yb", descriptor = "[S")
    private short[] field1851;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "[S")
    private short[] field1812;

    @OriginalMember(owner = "client!at", name = "lc", descriptor = "[S")
    private short[] field1890;

    @OriginalMember(owner = "client!at", name = "mb", descriptor = "[B")
    private byte[] field1839;

    @OriginalMember(owner = "client!at", name = "W", descriptor = "[S")
    private short[] field1823;

    @OriginalMember(owner = "client!at", name = "Hb", descriptor = "[F")
    private float[] field1860;

    @OriginalMember(owner = "client!at", name = "Ab", descriptor = "S")
    private short field1853;

    @OriginalMember(owner = "client!at", name = "Y", descriptor = "[S")
    private short[] field1825;

    @OriginalMember(owner = "client!at", name = "eb", descriptor = "[S")
    private short[] field1831;

    @OriginalMember(owner = "client!at", name = "Wb", descriptor = "[F")
    private float[] field1875;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "[S")
    private short[] field1802;

    @OriginalMember(owner = "client!at", name = "ib", descriptor = "S")
    private short field1835;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "[S")
    private short[] field1810;

    @OriginalMember(owner = "client!at", name = "sc", descriptor = "[B")
    private byte[] field1897;

    @OriginalMember(owner = "client!at", name = "Gb", descriptor = "[I")
    private int[] field1859;

    @OriginalMember(owner = "client!at", name = "vb", descriptor = "[[I")
    private int[][] field1848;

    @OriginalMember(owner = "client!at", name = "wb", descriptor = "[[I")
    private int[][] field1849;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "[[I")
    private int[][] field1791;

    @OriginalMember(owner = "client!at", name = "Mb", descriptor = "[Lir;")
    public static class251[] field1865 = new class251[4];

    @OriginalMember(owner = "client!at", name = "Z", descriptor = "Lrr;")
    public static class280 field1826 = new class280(6, 0, 4, 2);

    @OriginalMember(owner = "client!at", name = "rc", descriptor = "Lvv;")
    public static class313 field1896;

    @OriginalMember(owner = "client!at", name = "tc", descriptor = "[I")
    public static int[] field1898;

    @OriginalMember(owner = "client!at", name = "vc", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!at", name = "xc", descriptor = "Z")
    public static boolean field1902;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "B")
    private byte field1805;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!at", name = "D", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!at", name = "F", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!at", name = "P", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!at", name = "R", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!at", name = "U", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!at", name = "V", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!at", name = "X", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!at", name = "cb", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!at", name = "fb", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!at", name = "gb", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!at", name = "kb", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!at", name = "lb", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!at", name = "ob", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!at", name = "rb", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!at", name = "sb", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!at", name = "tb", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!at", name = "zb", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!at", name = "Bb", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!at", name = "Cb", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!at", name = "Db", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!at", name = "Fb", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!at", name = "Ib", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!at", name = "Kb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!at", name = "Rb", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!at", name = "Sb", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!at", name = "Ub", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!at", name = "Vb", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!at", name = "Xb", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!at", name = "Yb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!at", name = "Zb", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!at", name = "dc", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!at", name = "ec", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!at", name = "fc", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!at", name = "hc", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!at", name = "ic", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!at", name = "kc", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!at", name = "mc", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!at", name = "nc", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!at", name = "pc", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!at", name = "qc", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!at", name = "hb", descriptor = "Lgp;")
    private class135 field1834;

    @OriginalMember(owner = "client!at", name = "wc", descriptor = "Lkg;")
    public static class217 field1901;

    @OriginalMember(owner = "client!at", name = "jb", descriptor = "Loi;")
    private class43 field1836;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "Lig;")
    private class92 field1787;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "S")
    private short field1793;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "S")
    private short field1795;

    @OriginalMember(owner = "client!at", name = "Q", descriptor = "S")
    private short field1817;

    @OriginalMember(owner = "client!at", name = "S", descriptor = "S")
    private short field1819;

    @OriginalMember(owner = "client!at", name = "Ob", descriptor = "S")
    private short field1867;

    @OriginalMember(owner = "client!at", name = "Tb", descriptor = "S")
    private short field1872;

    @OriginalMember(owner = "client!at", name = "oc", descriptor = "S")
    private short field1893;

    @OriginalMember(owner = "client!at", name = "uc", descriptor = "[I")
    public static int[] field1899;

    static {
        new class306("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field1896 = new class313(1, -1);
        field1898 = new int[2];
        new class306("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field1900 = -1;
        field1902 = false;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lkp;I)V", line = 5)
    private final void method725(class289 arg0, int arg1) {
        if (this.field1864.field3740.length < this.field1801) {
            this.field1864.field3740 = new int[this.field1801];
            this.field1864.field3741 = new int[this.field1801];
        }
        field1876++;
        int[] var3 = this.field1864.field3740;
        int[] var4 = this.field1864.field3741;
        for (int var5 = 0; var5 < this.field1881; var5++) {
            int var16 = (this.field1830[var5] - (this.field1850[var5] * this.field1864.field3703 >> 8) >> this.field1864.field3601) - arg0.field4704;
            int var17 = (this.field1820[var5] - (this.field1850[var5] * this.field1864.field3643 >> 8) >> this.field1864.field3601) - arg0.field4711;
            int var18 = this.field1798[var5];
            int var19 = this.field1798[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field1843[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        if (arg1 > -63) {
            this.field1853 = 73;
        }
        for (int var6 = 0; var6 < this.field1815; var6++) {
            if (this.field1839 == null || this.field1839[var6] <= 128) {
                short var7 = this.field1810[var6];
                short var8 = this.field1890[var6];
                short var9 = this.field1825[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg0.method1874(var11, -177891024, var12, var10, var15, var14, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "B", descriptor = "()I", line = 95)
    public final int method726() {
        if (!this.field1800) {
            this.method742(-17620);
        }
        field1806++;
        return this.field1867;
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "()[Lhv;", line = 107)
    public final class150[] method727() {
        field1891++;
        return this.field1862;
    }

    @OriginalMember(owner = "client!at", name = "q", descriptor = "(SS)V", line = 115)
    public final void method728(short arg0, short arg1) {
        field1887++;
        for (int var3 = 0; var3 < this.field1869; var3++) {
            if (this.field1823[var3] == arg0) {
                this.field1823[var3] = arg1;
            }
        }
        if (this.field1888 != null) {
            for (int var4 = 0; var4 < this.field1879; var4++) {
                class15 var5 = this.field1888[var4];
                class12 var6 = this.field1814[var4];
                var6.field143 = class164.field2603[this.field1823[var5.field175] & 0xFFFF] & 0xFFFFFF | var6.field143 & 0xFF000000;
            }
        }
        if (this.field1857 != null) {
            this.field1857.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "()Z", line = 159)
    public final boolean method729() {
        field1854++;
        if (this.field1812 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field1812.length; var1++) {
            if (this.field1812[var1] != -1 && !this.field1864.field7179.method194((byte) 89, this.field1812[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!at", name = "L", descriptor = "()V", line = 182)
    public final void method730() {
        field1873++;
        for (int var1 = 0; var1 < this.field1881; var1++) {
            this.field1820[var1] = -this.field1820[var1];
        }
        for (int var2 = 0; var2 < this.field1801; var2++) {
            this.field1866[var2] = (short) (-this.field1866[var2]);
        }
        for (int var3 = 0; var3 < this.field1869; var3++) {
            short var4 = this.field1810[var3];
            this.field1810[var3] = this.field1825[var3];
            this.field1825[var3] = var4;
        }
        if (this.field1847 == null && this.field1857 != null) {
            this.field1857.field731 = null;
        }
        if (this.field1847 != null) {
            this.field1847.field731 = null;
        }
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
        if (this.field1811 != null) {
            this.field1811.field182 = null;
        }
        this.field1800 = false;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLnb;)V", line = 234)
    private final void method731(byte arg0, class246 arg1) {
        field1861++;
        if (this.field1885 != null) {
            for (int var3 = 0; var3 < this.field1885.length; var3++) {
                class345 var4 = this.field1885[var3];
                class345 var5 = var4;
                if (var4.field5420 != null) {
                    var5 = var4.field5420;
                }
                var5.field5411 = (int) ((float) this.field1820[var4.field5426] * arg1.field4219 + (float) this.field1850[var4.field5426] * arg1.field4205 + (float) this.field1830[var4.field5426] * arg1.field4207 + arg1.field4220);
                var5.field5424 = (int) ((float) this.field1820[var4.field5426] * arg1.field4211 + (float) this.field1850[var4.field5426] * arg1.field4235 + (float) this.field1830[var4.field5426] * arg1.field4216 + arg1.field4223);
                var5.field5405 = (int) ((float) this.field1820[var4.field5426] * arg1.field4222 + (float) this.field1850[var4.field5426] * arg1.field4234 + (float) this.field1830[var4.field5426] * arg1.field4212 + arg1.field4213);
                var5.field5416 = (int) ((float) this.field1820[var4.field5407] * arg1.field4219 + (float) this.field1850[var4.field5407] * arg1.field4205 + (float) this.field1830[var4.field5407] * arg1.field4207 + arg1.field4220);
                var5.field5423 = (int) ((float) this.field1820[var4.field5407] * arg1.field4211 + (float) this.field1850[var4.field5407] * arg1.field4235 + (float) this.field1830[var4.field5407] * arg1.field4216 + arg1.field4223);
                var5.field5421 = (int) ((float) this.field1820[var4.field5407] * arg1.field4222 + (float) this.field1850[var4.field5407] * arg1.field4234 + (float) this.field1830[var4.field5407] * arg1.field4212 + arg1.field4213);
                var5.field5409 = (int) ((float) this.field1820[var4.field5414] * arg1.field4219 + (float) this.field1850[var4.field5414] * arg1.field4205 + (float) this.field1830[var4.field5414] * arg1.field4207 + arg1.field4220);
                var5.field5412 = (int) ((float) this.field1820[var4.field5414] * arg1.field4211 + (float) this.field1850[var4.field5414] * arg1.field4235 + (float) this.field1830[var4.field5414] * arg1.field4216 + arg1.field4223);
                var5.field5425 = (int) ((float) this.field1820[var4.field5414] * arg1.field4222 + (float) this.field1850[var4.field5414] * arg1.field4234 + (float) this.field1830[var4.field5414] * arg1.field4212 + arg1.field4213);
            }
        }
        int var6 = -110 / ((arg0 + 24) / 59);
        if (this.field1862 == null) {
            return;
        }
        for (int var7 = 0; var7 < this.field1862.length; var7++) {
            class150 var8 = this.field1862[var7];
            class150 var9 = var8;
            if (var8.field2408 != null) {
                var9 = var8.field2408;
            }
            if (var8.field2412 == null) {
                var8.field2412 = arg1.method1242();
            } else {
                var8.field2412.method1241(arg1);
            }
            var9.field2410 = (int) ((float) this.field1820[var8.field2407] * arg1.field4219 + (float) this.field1850[var8.field2407] * arg1.field4205 + (float) this.field1830[var8.field2407] * arg1.field4207 + arg1.field4220);
            var9.field2413 = (int) ((float) this.field1820[var8.field2407] * arg1.field4211 + (float) this.field1850[var8.field2407] * arg1.field4235 + (float) this.field1830[var8.field2407] * arg1.field4216 + arg1.field4223);
            var9.field2415 = (int) ((float) this.field1820[var8.field2407] * arg1.field4222 + (float) this.field1850[var8.field2407] * arg1.field4234 + (float) this.field1830[var8.field2407] * arg1.field4212 + arg1.field4213);
        }
    }

    @OriginalMember(owner = "client!at", name = "va", descriptor = "(I[IIIIIZ)V", line = 301)
    public final void method732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1792++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class251.field4294 = 0;
            int var12 = 0;
            class162.field2570 = 0;
            class404.field6133 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field1848.length > var14) {
                    int[] var15 = this.field1848[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class162.field2570 += this.field1830[var17];
                        class404.field6133 += this.field1850[var17];
                        var12++;
                        class251.field4294 += this.field1820[var17];
                    }
                }
            }
            if (var12 <= 0) {
                class251.field4294 = var10;
                class162.field2570 = var9;
                class404.field6133 = var11;
            } else {
                class404.field6133 = class404.field6133 / var12 + var11;
                class162.field2570 = class162.field2570 / var12 + var9;
                class251.field4294 = class251.field4294 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg2 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field1848.length > var22) {
                    int[] var23 = this.field1848[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field1830[var25] += var19;
                        this.field1850[var25] += var18;
                        this.field1820[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field1848.length > var45) {
                    int[] var46 = this.field1848[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field1830[var48] -= class162.field2570;
                            this.field1850[var48] -= class404.field6133;
                            this.field1820[var48] -= class251.field4294;
                            if (arg4 != 0) {
                                int var49 = class46.field757[arg4];
                                int var50 = class46.field755[arg4];
                                int var51 = this.field1850[var48] * var49 + this.field1830[var48] * var50 + 32767 >> 15;
                                this.field1850[var48] = this.field1850[var48] * var50 + 32767 - (this.field1830[var48] * var49) >> 15;
                                this.field1830[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class46.field757[arg2];
                                int var53 = class46.field755[arg2];
                                int var54 = this.field1850[var48] * var53 + 32767 - (this.field1820[var48] * var52) >> 15;
                                this.field1820[var48] = this.field1820[var48] * var53 + this.field1850[var48] * var52 + 32767 >> 15;
                                this.field1850[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class46.field757[arg3];
                                int var56 = class46.field755[arg3];
                                int var57 = this.field1820[var48] * var55 - (-(this.field1830[var48] * var56) - 32767) >> 15;
                                this.field1820[var48] = this.field1820[var48] * var56 - (this.field1830[var48] * var55 - 32767) >> 15;
                                this.field1830[var48] = var57;
                            }
                            this.field1830[var48] += class162.field2570;
                            this.field1850[var48] += class404.field6133;
                            this.field1820[var48] += class251.field4294;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field1830[var59] -= class162.field2570;
                            this.field1850[var59] -= class404.field6133;
                            this.field1820[var59] -= class251.field4294;
                            if (arg2 != 0) {
                                int var60 = class46.field757[arg2];
                                int var61 = class46.field755[arg2];
                                int var62 = this.field1850[var59] * var61 + 32767 - this.field1820[var59] * var60 >> 15;
                                this.field1820[var59] = this.field1850[var59] * var60 + (this.field1820[var59] * var61) + 32767 >> 15;
                                this.field1850[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class46.field757[arg4];
                                int var64 = class46.field755[arg4];
                                int var65 = this.field1850[var59] * var63 + this.field1830[var59] * var64 + 32767 >> 15;
                                this.field1850[var59] = this.field1850[var59] * var64 + 32767 - (this.field1830[var59] * var63) >> 15;
                                this.field1830[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class46.field757[arg3];
                                int var67 = class46.field755[arg3];
                                int var68 = this.field1820[var59] * var66 + this.field1830[var59] * var67 + 32767 >> 15;
                                this.field1820[var59] = this.field1820[var59] * var67 - (this.field1830[var59] * var66 - 32767) >> 15;
                                this.field1830[var59] = var68;
                            }
                            this.field1830[var59] += class162.field2570;
                            this.field1850[var59] += class404.field6133;
                            this.field1820[var59] += class251.field4294;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field1848.length) {
                        int[] var29 = this.field1848[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field1798[var31];
                            int var33 = this.field1798[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field1843[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class46.field757[arg4];
                                    int var37 = class46.field755[arg4];
                                    int var38 = this.field1831[var35] * var36 + (this.field1851[var35] * var37) + 32767 >> 15;
                                    this.field1831[var35] = (short) (this.field1831[var35] * var37 + 32767 - (this.field1851[var35] * var36) >> 15);
                                    this.field1851[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class46.field757[arg2];
                                    int var40 = class46.field755[arg2];
                                    int var41 = this.field1831[var35] * var40 + 32767 - this.field1866[var35] * var39 >> 15;
                                    this.field1866[var35] = (short) (this.field1866[var35] * var40 + this.field1831[var35] * var39 + 32767 >> 15);
                                    this.field1831[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class46.field757[arg3];
                                    int var43 = class46.field755[arg3];
                                    int var44 = this.field1866[var35] * var42 + (this.field1851[var35] * var43) + 32767 >> 15;
                                    this.field1866[var35] = (short) (this.field1866[var35] * var43 + 32767 - (this.field1851[var35] * var42) >> 15);
                                    this.field1851[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field1847 == null && this.field1857 != null) {
                    this.field1857.field731 = null;
                }
                if (this.field1847 != null) {
                    this.field1847.field731 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field1848.length) {
                    int[] var71 = this.field1848[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field1830[var73] -= class162.field2570;
                        this.field1850[var73] -= class404.field6133;
                        this.field1820[var73] -= class251.field4294;
                        this.field1830[var73] = this.field1830[var73] * arg2 >> 7;
                        this.field1850[var73] = this.field1850[var73] * arg3 >> 7;
                        this.field1820[var73] = this.field1820[var73] * arg4 >> 7;
                        this.field1830[var73] += class162.field2570;
                        this.field1850[var73] += class404.field6133;
                        this.field1820[var73] += class251.field4294;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1791 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field1791.length > var78) {
                        int[] var79 = this.field1791[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field1839[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field1839[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field1857 != null) {
                            this.field1857.field731 = null;
                        }
                    }
                }
                if (this.field1888 != null) {
                    for (int var75 = 0; var75 < this.field1879; var75++) {
                        class15 var76 = this.field1888[var75];
                        class12 var77 = this.field1814[var75];
                        var77.field143 = var77.field143 & 0xFFFFFF | 255 - (this.field1839[var76.field175] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1791 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field1791.length > var87) {
                        int[] var88 = this.field1791[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field1823[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field1823[var90] = (short) class338.method2141(var97, class338.method2141(var95 << 7, var94 << 10));
                        }
                        if (var88.length > 0 && this.field1857 != null) {
                            this.field1857.field731 = null;
                        }
                    }
                }
                if (this.field1888 != null) {
                    for (int var84 = 0; var84 < this.field1879; var84++) {
                        class15 var85 = this.field1888[var84];
                        class12 var86 = this.field1814[var84];
                        var86.field143 = var86.field143 & 0xFF000000 | class164.field2603[this.field1823[var85.field175] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1849 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field1849.length > var99) {
                        int[] var100 = this.field1849[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class12 var102 = this.field1814[var100[var101]];
                            var102.field139 += arg3;
                            var102.field132 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1849 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field1849.length) {
                        int[] var105 = this.field1849[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class12 var107 = this.field1814[var105[var106]];
                            var107.field140 = var107.field140 * arg3 >> 7;
                            var107.field138 = var107.field138 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1849 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (this.field1849.length > var109) {
                    int[] var110 = this.field1849[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class12 var112 = this.field1814[var110[var111]];
                        var112.field137 = var112.field137 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "za", descriptor = "(IIII)V", line = 949)
    public final void method733(int arg0, int arg1, int arg2, int arg3) {
        field1799++;
        if (arg0 == 0) {
            class404.field6133 = 0;
            class162.field2570 = 0;
            int var5 = 0;
            class251.field4294 = 0;
            for (int var6 = 0; var6 < this.field1881; var6++) {
                class162.field2570 += this.field1830[var6];
                class404.field6133 += this.field1850[var6];
                var5++;
                class251.field4294 += this.field1820[var6];
            }
            if (var5 > 0) {
                class404.field6133 = class404.field6133 / var5 + arg2;
                class251.field4294 = class251.field4294 / var5 + arg3;
                class162.field2570 = class162.field2570 / var5 + arg1;
            } else {
                class404.field6133 = arg2;
                class162.field2570 = arg1;
                class251.field4294 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1881; var7++) {
                this.field1830[var7] += arg1;
                this.field1850[var7] += arg2;
                this.field1820[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1881; var8++) {
                this.field1830[var8] -= class162.field2570;
                this.field1850[var8] -= class404.field6133;
                this.field1820[var8] -= class251.field4294;
                if (arg3 != 0) {
                    int var9 = class46.field757[arg3];
                    int var10 = class46.field755[arg3];
                    int var11 = this.field1850[var8] * var9 + this.field1830[var8] * var10 + 32767 >> 15;
                    this.field1850[var8] = this.field1850[var8] * var10 + (32767 - (this.field1830[var8] * var9)) >> 15;
                    this.field1830[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class46.field757[arg1];
                    int var13 = class46.field755[arg1];
                    int var14 = this.field1850[var8] * var13 + 32767 - this.field1820[var8] * var12 >> 15;
                    this.field1820[var8] = this.field1850[var8] * var12 + this.field1820[var8] * var13 + 32767 >> 15;
                    this.field1850[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class46.field757[arg2];
                    int var16 = class46.field755[arg2];
                    int var17 = this.field1820[var8] * var15 - (-(this.field1830[var8] * var16) - 32767) >> 15;
                    this.field1820[var8] = this.field1820[var8] * var16 + 32767 - (this.field1830[var8] * var15) >> 15;
                    this.field1830[var8] = var17;
                }
                this.field1830[var8] += class162.field2570;
                this.field1850[var8] += class404.field6133;
                this.field1820[var8] += class251.field4294;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1881; var18++) {
                this.field1830[var18] -= class162.field2570;
                this.field1850[var18] -= class404.field6133;
                this.field1820[var18] -= class251.field4294;
                this.field1830[var18] = this.field1830[var18] * arg1 / 128;
                this.field1850[var18] = this.field1850[var18] * arg2 / 128;
                this.field1820[var18] = this.field1820[var18] * arg3 / 128;
                this.field1830[var18] += class162.field2570;
                this.field1850[var18] += class404.field6133;
                this.field1820[var18] += class251.field4294;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1869; var19++) {
                int var23 = (this.field1839[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field1839[var19] = (byte) var23;
            }
            if (this.field1857 != null) {
                this.field1857.field731 = null;
            }
            if (this.field1888 != null) {
                for (int var20 = 0; var20 < this.field1879; var20++) {
                    class15 var21 = this.field1888[var20];
                    class12 var22 = this.field1814[var20];
                    var22.field143 = var22.field143 & 0xFFFFFF | 255 - (this.field1839[var21.field175] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field1869; var24++) {
                int var28 = this.field1823[var24] & 0xFFFF;
                int var29 = (var28 & 0xFC27) >> 10;
                int var30 = (var28 & 0x3B4) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                int var34 = arg3 + var31;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field1823[var24] = (short) class338.method2141(var34, class338.method2141(var33 << 10, var32 << 7));
            }
            if (this.field1857 != null) {
                this.field1857.field731 = null;
            }
            if (this.field1888 != null) {
                for (int var25 = 0; var25 < this.field1879; var25++) {
                    class15 var26 = this.field1888[var25];
                    class12 var27 = this.field1814[var25];
                    var27.field143 = var27.field143 & 0xFF000000 | class164.field2603[this.field1823[var26.field175] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field1879; var35++) {
                class12 var36 = this.field1814[var35];
                var36.field139 += arg2;
                var36.field132 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field1879; var37++) {
                class12 var38 = this.field1814[var37];
                var38.field140 = var38.field140 * arg2 >> 7;
                var38.field138 = var38.field138 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field1879; var39++) {
                class12 var40 = this.field1814[var39];
                var40.field137 = var40.field137 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "W", descriptor = "(I)V", line = 1258)
    public final void method734(int arg0) {
        field1788++;
        int var2 = class46.field757[arg0];
        int var3 = class46.field755[arg0];
        for (int var4 = 0; var4 < this.field1881; var4++) {
            int var5 = this.field1850[var4] * var3 - (this.field1820[var4] * var2) >> 15;
            this.field1820[var4] = this.field1850[var4] * var2 + (this.field1820[var4] * var3) >> 15;
            this.field1850[var4] = var5;
        }
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
        this.field1800 = false;
    }

    @OriginalMember(owner = "client!at", name = "S", descriptor = "()I", line = 1290)
    public final int method735() {
        if (!this.field1800) {
            this.method742(-17620);
        }
        field1855++;
        return this.field1793;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lc;Ltq;I)V", line = 1301)
    public final void method736(class202 arg0, class273 arg1, int arg2) {
        field1809++;
        if (this.field1801 == 0) {
            return;
        }
        class246 var4 = this.field1864.field3685;
        class246 var5 = (class246) arg0;
        if (!this.field1800) {
            this.method742(-17620);
        }
        this.method731((byte) 90, var5);
        class461.field6827 = var4.field4222 * var5.field4234 + var4.field4234 * var5.field4235 + var4.field4212 * var5.field4205;
        class453.field6761 = var4.field4222 * var5.field4213 + var4.field4234 * var5.field4223 + var4.field4212 * var5.field4220 + var4.field4213;
        float var6 = (float) this.field1867 * class461.field6827 + class453.field6761;
        float var7 = (float) this.field1817 * class461.field6827 + class453.field6761;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var8 = (float) (-this.field1893) + var7;
            var9 = (float) this.field1893 + var6;
        } else {
            var8 = var6 - (float) this.field1893;
            var9 = (float) this.field1893 + var7;
        }
        if ((this.field1864.field3622 <= var8) || ((float) this.field1864.field3628 >= var9)) {
            return;
        }
        class279.field4583 = var4.field4219 * var5.field4234 + var4.field4207 * var5.field4205 + var4.field4205 * var5.field4235;
        class381.field5894 = var4.field4219 * var5.field4213 + var4.field4207 * var5.field4220 + var4.field4205 * var5.field4223 + var4.field4220;
        float var10 = (float) this.field1867 * class279.field4583 + class381.field5894;
        float var11 = (float) this.field1817 * class279.field4583 + class381.field5894;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = ((float) this.field1893 + var10) * (float) this.field1864.field3636;
            var13 = (var11 - (float) this.field1893) * (float) this.field1864.field3636;
        } else {
            var12 = ((float) this.field1893 + var11) * (float) this.field1864.field3636;
            var13 = (var10 - (float) this.field1893) * (float) this.field1864.field3636;
        }
        if ((var13 / var9 >= this.field1864.field3705) || (var12 / var9 <= this.field1864.field3706)) {
            return;
        }
        class86.field1474 = var4.field4211 * var5.field4234 + var4.field4235 * var5.field4235 + var4.field4216 * var5.field4205;
        class407.field6191 = var4.field4211 * var5.field4213 + var4.field4235 * var5.field4223 + var4.field4216 * var5.field4220 + var4.field4223;
        float var14 = (float) this.field1867 * class86.field1474 + class407.field6191;
        float var15 = (float) this.field1817 * class86.field1474 + class407.field6191;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field1893 + var14) * (float) this.field1864.field3665;
            var16 = ((float) (-this.field1893) + var15) * (float) this.field1864.field3665;
        } else {
            var16 = (var14 - (float) this.field1893) * (float) this.field1864.field3665;
            var17 = ((float) this.field1893 + var15) * (float) this.field1864.field3665;
        }
        if ((var16 / var9 >= this.field1864.field3634) || (var17 / var9 <= this.field1864.field3699)) {
            return;
        }
        if (arg1 != null || this.field1888 != null) {
            class128.field2212 = var4.field4222 * var5.field4222 + var4.field4234 * var5.field4211 + var4.field4212 * var5.field4219;
            class333.field5235 = var4.field4211 * var5.field4212 + var4.field4235 * var5.field4216 + var4.field4216 * var5.field4207;
            class68.field1074 = var4.field4211 * var5.field4222 + var4.field4235 * var5.field4211 + var4.field4216 * var5.field4219;
            class531.field7797 = var4.field4219 * var5.field4212 + var4.field4207 * var5.field4207 + var4.field4205 * var5.field4216;
            class178.field2826 = var4.field4219 * var5.field4222 + var4.field4207 * var5.field4219 + var4.field4205 * var5.field4211;
            class281.field4600 = var4.field4222 * var5.field4212 + var4.field4234 * var5.field4216 + var4.field4212 * var5.field4207;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field1872 + this.field1819 >> 1;
            int var21 = this.field1795 + this.field1793 >> 1;
            int var22 = (int) ((float) var21 * class178.field2826 + (float) this.field1867 * class279.field4583 + (float) var20 * class531.field7797 + class381.field5894);
            int var23 = (int) ((float) var21 * class68.field1074 + (float) this.field1867 * class86.field1474 + (float) var20 * class333.field5235 + class407.field6191);
            int var24 = (int) ((float) var21 * class128.field2212 + (float) this.field1867 * class461.field6827 + (float) var20 * class281.field4600 + class453.field6761);
            if (var24 >= this.field1864.field3628) {
                arg1.field4517 = this.field1864.field3734 + (this.field1864.field3636 * var22 / var24);
                arg1.field4516 = this.field1864.field3657 + (this.field1864.field3665 * var23 / var24);
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class178.field2826 + (float) this.field1817 * class279.field4583 + (float) var20 * class531.field7797 + class381.field5894);
            int var26 = (int) ((float) var21 * class68.field1074 + (float) this.field1817 * class86.field1474 + (float) var20 * class333.field5235 + class407.field6191);
            int var27 = (int) ((float) var21 * class128.field2212 + (float) this.field1817 * class461.field6827 + (float) var20 * class281.field4600 + class453.field6761);
            if (var27 >= this.field1864.field3628) {
                arg1.field4521 = this.field1864.field3636 * var25 / var27 + this.field1864.field3734;
                arg1.field4518 = this.field1864.field3665 * var26 / var27 + this.field1864.field3657;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field1864.field3628 > var24 && this.field1864.field3628 > var27) {
                    var19 = false;
                } else if (var24 < this.field1864.field3628) {
                    int var31 = (var27 - this.field1864.field3628 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field4517 = this.field1864.field3734 + (this.field1864.field3636 * var32 / this.field1864.field3628);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field4516 = this.field1864.field3665 * var33 / this.field1864.field3628 + this.field1864.field3657;
                } else if (var27 < this.field1864.field3628) {
                    int var28 = (var24 - this.field1864.field3628 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field4517 = this.field1864.field3734 + (this.field1864.field3636 * var29 / this.field1864.field3628);
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field4516 = this.field1864.field3665 * var30 / this.field1864.field3628 + this.field1864.field3657;
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field4519 = (this.field1893 + var22) * this.field1864.field3636 / var24 + this.field1864.field3734 - arg1.field4517;
                } else {
                    arg1.field4519 = this.field1864.field3734 + ((this.field1893 + var25) * this.field1864.field3636 / var27) - arg1.field4521;
                }
                arg1.field4520 = true;
            }
        }
        this.field1864.method1445((byte) 107);
        this.field1864.method1446(var5, 8960);
        this.method757(false);
        this.field1864.method1434((byte) 72);
        this.method740(2);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZJIIFFIIILko;)S", line = 1505)
    private final short method737(boolean arg0, long arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7, int arg8, class227 arg9) {
        if (!arg0) {
            this.field1827 = null;
        }
        field1846++;
        int var12 = this.field1798[arg6];
        int var13 = this.field1798[arg6 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field1843[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class465.field6915[var15] == arg1) {
                return (short) (var16 - 1);
            }
        }
        this.field1843[var14] = (short) (this.field1801 + 1);
        class465.field6915[var14] = arg1;
        this.field1851[this.field1801] = (short) arg8;
        this.field1831[this.field1801] = (short) arg7;
        this.field1866[this.field1801] = (short) arg2;
        this.field1897[this.field1801] = (byte) arg3;
        this.field1860[this.field1801] = arg4;
        this.field1875[this.field1801] = arg5;
        return (short) (this.field1801++);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lc;Ltq;II)V", line = 1550)
    public final void method738(class202 arg0, class273 arg1, int arg2, int arg3) {
        field1813++;
        if (this.field1801 == 0) {
            return;
        }
        class246 var5 = this.field1864.field3685;
        if (!this.field1800) {
            this.method742(-17620);
        }
        class246 var6 = (class246) arg0;
        class453.field6761 = var5.field4222 * var6.field4213 + var5.field4234 * var6.field4223 + var5.field4212 * var6.field4220 + var5.field4213;
        class461.field6827 = var5.field4222 * var6.field4234 + var5.field4234 * var6.field4235 + var5.field4212 * var6.field4205;
        float var7 = (float) this.field1867 * class461.field6827 + class453.field6761;
        float var8 = (float) this.field1817 * class461.field6827 + class453.field6761;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = var8 - (float) this.field1893;
            var10 = (float) this.field1893 + var7;
        } else {
            var9 = var7 - (float) this.field1893;
            var10 = (float) this.field1893 + var8;
        }
        if ((this.field1864.field3639 <= var9) || (var10 <= (float) this.field1864.field3628)) {
            return;
        }
        class381.field5894 = var5.field4219 * var6.field4213 + var5.field4207 * var6.field4220 + var5.field4205 * var6.field4223 + var5.field4220;
        class279.field4583 = var5.field4219 * var6.field4234 + var5.field4207 * var6.field4205 + var5.field4205 * var6.field4235;
        float var11 = (float) this.field1867 * class279.field4583 + class381.field5894;
        float var12 = (float) this.field1817 * class279.field4583 + class381.field5894;
        float var13;
        float var14;
        if (var11 > var12) {
            var13 = ((float) this.field1893 + var11) * (float) this.field1864.field3636;
            var14 = (var12 - (float) this.field1893) * (float) this.field1864.field3636;
        } else {
            var14 = (var11 - (float) this.field1893) * (float) this.field1864.field3636;
            var13 = ((float) this.field1893 + var12) * (float) this.field1864.field3636;
        }
        if ((var14 / (float) arg2 >= this.field1864.field3705) || (var13 / (float) arg2 <= this.field1864.field3706)) {
            return;
        }
        class407.field6191 = var5.field4211 * var6.field4213 + var5.field4235 * var6.field4223 + var5.field4216 * var6.field4220 + var5.field4223;
        class86.field1474 = var5.field4211 * var6.field4234 + var5.field4235 * var6.field4235 + var5.field4216 * var6.field4205;
        float var15 = (float) this.field1867 * class86.field1474 + class407.field6191;
        float var16 = (float) this.field1817 * class86.field1474 + class407.field6191;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = (var16 - (float) this.field1893) * (float) this.field1864.field3665;
            var17 = ((float) this.field1893 + var15) * (float) this.field1864.field3665;
        } else {
            var17 = ((float) this.field1893 + var16) * (float) this.field1864.field3665;
            var18 = ((float) (-this.field1893) + var15) * (float) this.field1864.field3665;
        }
        if ((this.field1864.field3634 <= var18 / (float) arg2) || (var17 / (float) arg2 <= this.field1864.field3699)) {
            return;
        }
        if (arg1 != null || this.field1888 != null) {
            class281.field4600 = var5.field4222 * var6.field4212 + var5.field4234 * var6.field4216 + var5.field4212 * var6.field4207;
            class68.field1074 = var5.field4211 * var6.field4222 + var5.field4235 * var6.field4211 + var5.field4216 * var6.field4219;
            class333.field5235 = var5.field4211 * var6.field4212 + var5.field4235 * var6.field4216 + var5.field4216 * var6.field4207;
            class128.field2212 = var5.field4222 * var6.field4222 + var5.field4234 * var6.field4211 + var5.field4212 * var6.field4219;
            class178.field2826 = var5.field4219 * var6.field4222 + var5.field4207 * var6.field4219 + var5.field4205 * var6.field4211;
            class531.field7797 = var5.field4219 * var6.field4212 + var5.field4207 * var6.field4207 + var5.field4205 * var6.field4216;
        }
        if (arg1 != null) {
            int var19 = this.field1872 + this.field1819 >> 1;
            int var20 = this.field1795 + this.field1793 >> 1;
            int var21 = (int) ((float) var20 * class178.field2826 + (float) this.field1867 * class279.field4583 + (float) var19 * class531.field7797 + class381.field5894);
            int var22 = (int) ((float) var20 * class68.field1074 + (float) this.field1867 * class86.field1474 + (float) var19 * class333.field5235 + class407.field6191);
            int var23 = (int) ((float) var20 * class128.field2212 + (float) this.field1867 * class461.field6827 + (float) var19 * class281.field4600 + class453.field6761);
            int var24 = (int) ((float) var20 * class178.field2826 + (float) this.field1817 * class279.field4583 + (float) var19 * class531.field7797 + class381.field5894);
            int var25 = (int) ((float) var20 * class68.field1074 + (float) this.field1817 * class86.field1474 + (float) var19 * class333.field5235 + class407.field6191);
            arg1.field4516 = this.field1864.field3657 + (this.field1864.field3665 * var22 / arg2);
            arg1.field4517 = this.field1864.field3734 + (this.field1864.field3636 * var21 / arg2);
            arg1.field4518 = this.field1864.field3665 * var25 / arg2 + this.field1864.field3657;
            int var26 = (int) ((float) var20 * class128.field2212 + (float) this.field1817 * class461.field6827 + (float) var19 * class281.field4600 + class453.field6761);
            arg1.field4521 = this.field1864.field3636 * var24 / arg2 + this.field1864.field3734;
            if (var23 < this.field1864.field3628 && var26 < this.field1864.field3628) {
                arg1.field4520 = true;
                arg1.field4519 = (this.field1893 + var21) * this.field1864.field3636 / arg2 + this.field1864.field3734 - arg1.field4517;
            }
        }
        this.field1864.method1452(-116, (float) arg2);
        this.field1864.method1420(8);
        this.field1864.method1446(var6, 8960);
        this.method757(false);
        this.field1864.method1434((byte) 72);
        this.method740(2);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BIZ)Le;", line = 1700)
    public final class530 method739(byte arg0, int arg1, boolean arg2) {
        field1856++;
        class106 var4;
        class106 var5;
        if (arg0 == 1) {
            var4 = this.field1864.field3736;
            var5 = this.field1864.field3669;
        } else if (arg0 == 2) {
            var4 = this.field1864.field3646;
            var5 = this.field1864.field3723;
        } else if (arg0 == 3) {
            var5 = this.field1864.field3677;
            var4 = this.field1864.field3711;
        } else if (arg0 == 4) {
            var5 = this.field1864.field3732;
            var4 = this.field1864.field3682;
        } else if (arg0 == 5) {
            var4 = this.field1864.field3663;
            var5 = this.field1864.field3674;
        } else {
            var5 = var4 = new class106(this.field1864);
        }
        return this.method770(arg0 != 0, 30736, var4, arg2, var5, arg1);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 1748)
    private final void method740(int arg0) {
        field1874++;
        if (this.field1888 != null) {
            class246 var2 = this.field1864.field3596;
            float var3 = this.field1864.method898();
            float var4 = this.field1864.method850();
            this.field1864.method1467((byte) -108);
            this.field1864.method886(false);
            this.field1864.method1417(false, false);
            this.field1864.method1406(arg0 + 32886, this.field1864.field3701, null, null, this.field1864.field3691);
            for (int var5 = 0; var5 < this.field1879; var5++) {
                class15 var6 = this.field1888[var5];
                class12 var7 = this.field1814[var5];
                if (!var6.field165 || !this.field1864.method903()) {
                    float var8 = (float) (this.field1830[var6.field173] + this.field1830[var6.field168] + this.field1830[var6.field170]) * 0.3333333F;
                    float var9 = (float) (this.field1850[var6.field173] - (-this.field1850[var6.field170] - this.field1850[var6.field168])) * 0.3333333F;
                    float var10 = (float) (this.field1820[var6.field173] + this.field1820[var6.field168] + this.field1820[var6.field170]) * 0.3333333F;
                    float var11 = class178.field2826 * var10 + class531.field7797 * var8 + class279.field4583 * var9 + class381.field5894;
                    float var12 = class68.field1074 * var10 + class86.field1474 * var9 + class333.field5235 * var8 + class407.field6191;
                    float var13 = class128.field2212 * var10 + class461.field6827 * var9 + class281.field4600 * var8 + class453.field6761;
                    var2.method1679((float) var7.field132 + var11, var6.field164 * var7.field140 >> 7, (float) var7.field139 - var12, var6.field166 * var7.field138 >> 7, var7.field137, -var13, arg0 ^ 0x38);
                    this.field1864.method1404(var2, (byte) -104);
                    this.field1864.method877(var4, var3 - (float) var6.field169 * 1.5F);
                    int var14 = var7.field143;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field1864.method1463(var6.field178, (byte) 98);
                    this.field1864.method1486(var6.field176, (byte) 124);
                    this.field1864.method1410(var6.field177, 7681);
                    this.field1864.method1433(0, 7, 4, (byte) 32);
                }
            }
            this.field1864.method877(var4, var3);
            this.field1864.method886(true);
            this.field1864.method1434((byte) 72);
        }
        if (arg0 != 2) {
            this.method743();
        }
    }

    @OriginalMember(owner = "client!at", name = "RA", descriptor = "()I", line = 1815)
    public final int method741() {
        field1886++;
        return this.field1808;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V", line = 1823)
    private final void method742(int arg0) {
        field1832++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        if (arg0 != -17620) {
            this.field1875 = null;
        }
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1881; var10++) {
            int var11 = this.field1830[var10];
            int var12 = this.field1850[var10];
            if (var5 < var11) {
                var5 = var11;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = this.field1820[var10];
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field1872 = (short) var2;
        this.field1795 = (short) var4;
        this.field1867 = (short) var3;
        this.field1817 = (short) var6;
        this.field1819 = (short) var5;
        this.field1793 = (short) var7;
        this.field1893 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field1800 = true;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "()V", line = 1906)
    public final void method743() {
        field1884++;
        if (this.field1801 <= 0 || this.field1815 <= 0) {
            return;
        }
        this.method747(125, false);
        if ((this.field1805 & 0x10) == 0 && this.field1811.field182 == null) {
            this.method754(false, -91);
        }
        this.method771(-22314);
    }

    @OriginalMember(owner = "client!at", name = "X", descriptor = "(I)V", line = 1928)
    public final void method744(int arg0) {
        if (this.field1857 != null) {
            this.field1857.field731 = null;
        }
        this.field1835 = (short) arg0;
        field1797++;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lih;)V", line = 5643)
    public class106(class214 arg0) {
        this.field1864 = arg0;
        this.field1827 = new class45(null, 5126, 3, 0);
        this.field1828 = new class45(null, 5126, 2, 0);
        this.field1847 = new class45(null, 5126, 3, 0);
        this.field1857 = new class45(null, 5121, 4, 0);
        this.field1811 = new class16();
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lih;Lko;IIII)V", line = 5655)
    public class106(class214 arg0, class227 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1880 = arg5;
        this.field1864 = arg0;
        this.field1808 = arg2;
        if (class477.method2816(3, arg2, arg5)) {
            this.field1827 = new class45(null, 5126, 3, 0);
        }
        if (class250.method1695(arg2, arg5, (byte) -49)) {
            this.field1828 = new class45(null, 5126, 2, 0);
        }
        if (class195.method1300(arg2, -98, arg5)) {
            this.field1847 = new class45(null, 5126, 3, 0);
        }
        if (class446.method2682(0, arg5, arg2)) {
            this.field1857 = new class45(null, 5121, 4, 0);
        }
        if (class72.method515(arg2, arg5, -78)) {
            this.field1811 = new class16();
        }
        class196 var7 = arg0.field7179;
        int[] var8 = new int[arg1.field3964];
        this.field1798 = new int[arg1.field3956 + 1];
        for (int var9 = 0; var9 < arg1.field3964; var9++) {
            if ((arg1.field3931 == null || arg1.field3931[var9] != 2) && (arg1.field3939 == null || arg1.field3939[var9] == -1 || !var7.method195(arg1.field3939[var9] & 0xFFFF, (byte) -105).field5027)) {
                var8[this.field1869++] = var9;
                this.field1798[arg1.field3942[var9]]++;
                this.field1798[arg1.field3966[var9]]++;
                this.field1798[arg1.field3949[var9]]++;
            }
        }
        this.field1815 = this.field1869;
        long[] var10 = new long[this.field1869];
        boolean var11 = (this.field1808 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field1869; var12++) {
            int var180 = var8[var12];
            class320 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field3972 != null) {
                for (int var186 = 0; var186 < arg1.field3972.length; var186++) {
                    class455 var187 = arg1.field3972[var186];
                    if (var187.field6797 == var180) {
                        class462 var188 = class533.method3164(123, var187.field6799);
                        if (var188.field6866) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field1815--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field3939 != null) {
                var189 = arg1.field3939[var180];
                if (var189 != -1) {
                    var181 = var7.method195(var189 & 0xFFFF, (byte) -105);
                    var184 = var181.field5026;
                    var185 = var181.field5038;
                }
            }
            boolean var190 = arg1.field3938 != null && arg1.field3938[var180] != 0 || var181 != null && !var181.field5028;
            if ((var11 || var190) && arg1.field3943 != null) {
                var182 += arg1.field3943[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = (var184 & 0xFF << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class66.method432(var8, var10, 395);
        this.field1820 = arg1.field3965;
        this.field1868 = arg1.field3952;
        this.field1850 = arg1.field3946;
        this.field1881 = arg1.field3956;
        this.field1840 = arg1.field3967;
        this.field1830 = arg1.field3969;
        this.field1862 = arg1.field3945;
        this.field1885 = arg1.field3962;
        class418[] var13 = new class418[this.field1881];
        if (arg1.field3972 != null) {
            this.field1879 = arg1.field3972.length;
            this.field1814 = new class12[this.field1879];
            this.field1888 = new class15[this.field1879];
            for (int var14 = 0; var14 < this.field1879; var14++) {
                class455 var15 = arg1.field3972[var14];
                class462 var16 = class533.method3164(47, var15.field6799);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field1869; var18++) {
                    if (var8[var18] == var15.field6797) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class164.field2603[arg1.field3923[var15.field6797] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3938 == null ? 0 : arg1.field3938[var15.field6797]) << 24;
                this.field1888[var14] = new class15(var17, arg1.field3942[var15.field6797], arg1.field3966[var15.field6797], arg1.field3949[var15.field6797], var16.field6860, var16.field6870, var16.field6867, var16.field6865, var16.field6861, var16.field6866, var16.field6871, var15.field6792);
                this.field1814[var14] = new class12(var20);
            }
        }
        int var21 = this.field1869 * 3;
        this.field1866 = new short[var21];
        this.field1843 = new short[var21];
        this.field1851 = new short[var21];
        this.field1812 = new short[this.field1869];
        this.field1890 = new short[this.field1869];
        this.field1839 = new byte[this.field1869];
        this.field1823 = new short[this.field1869];
        this.field1860 = new float[var21];
        this.field1853 = (short) arg4;
        this.field1825 = new short[this.field1869];
        this.field1831 = new short[var21];
        this.field1875 = new float[var21];
        class465.field6915 = new long[var21];
        if (arg1.field3929 != null) {
            this.field1802 = new short[this.field1869];
        }
        this.field1835 = (short) arg3;
        this.field1810 = new short[this.field1869];
        this.field1897 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field3956; var23++) {
            int var179 = this.field1798[var23];
            this.field1798[var23] = var22;
            var22 += var179;
            var13[var23] = new class418();
        }
        this.field1798[arg1.field3956] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field3920 != null) {
            int var28 = arg1.field3950;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            var27 = new float[var28][];
            var26 = new int[var28];
            var25 = new int[var28];
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field1869; var36++) {
                int var43 = var8[var36];
                if (arg1.field3920[var43] != -1) {
                    int var44 = arg1.field3920[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field3942[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field3966[var43];
                        } else {
                            var46 = arg1.field3949[var43];
                        }
                        int var47 = arg1.field3969[var46];
                        int var48 = arg1.field3946[var46];
                        int var49 = arg1.field3965[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field3951[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field3963[var37];
                        var39 = 64.0F / (float) arg1.field3958[var37];
                        if (var42 == 0) {
                            var40 = 1.0F;
                            var41 = 1.0F;
                        } else if (var42 <= 0) {
                            var41 = 1.0F;
                            var40 = (float) (-var42) / 1024.0F;
                        } else {
                            var41 = (float) var42 / 1024.0F;
                            var40 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field3958[var37];
                        var40 = 64.0F / (float) arg1.field3963[var37];
                        var41 = 64.0F / (float) arg1.field3925[var37];
                    } else {
                        var39 = (float) arg1.field3958[var37] / 1024.0F;
                        var40 = (float) arg1.field3963[var37] / 1024.0F;
                        var41 = (float) arg1.field3925[var37] / 1024.0F;
                    }
                    var27[var37] = class264.method1758(arg1.field3954[var37], var40, var39, arg1.field3961[var37], var41, class344.method2224(arg1.field3947[var37], 255), (byte) 95, arg1.field3940[var37]);
                }
            }
        }
        class253[] var50 = new class253[arg1.field3964];
        for (int var51 = 0; var51 < arg1.field3964; var51++) {
            short var158 = arg1.field3942[var51];
            short var159 = arg1.field3966[var51];
            short var160 = arg1.field3949[var51];
            int var161 = this.field1830[var159] - this.field1830[var158];
            int var162 = this.field1850[var159] - this.field1850[var158];
            int var163 = this.field1820[var159] - this.field1820[var158];
            int var164 = this.field1830[var160] - this.field1830[var158];
            int var165 = this.field1850[var160] - this.field1850[var158];
            int var166 = this.field1820[var160] - this.field1820[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - (var162 * var164); var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var167 * var167 + var168 * var168 + var169 * var169));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field3931 == null ? 0 : arg1.field3931[var51];
            if (var174 == 0) {
                class418 var175 = var13[var158];
                var175.field6326 += var171;
                var175.field6327 += var172;
                var175.field6328++;
                var175.field6331 += var173;
                class418 var176 = var13[var159];
                var176.field6331 += var173;
                var176.field6328++;
                var176.field6326 += var171;
                var176.field6327 += var172;
                class418 var177 = var13[var160];
                var177.field6326 += var171;
                var177.field6331 += var173;
                var177.field6327 += var172;
                var177.field6328++;
            } else if (var174 == 1) {
                class253 var178 = var50[var51] = new class253();
                var178.field4312 = var172;
                var178.field4311 = var173;
                var178.field4306 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field1869; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field3923[var68] & 0xFFFF;
            short var70;
            if (arg1.field3939 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field3939[var68];
            }
            int var71;
            if (arg1.field3920 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field3920[var68];
            }
            int var72;
            if (arg1.field3938 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field3938[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var80 = 2;
                    var76 = 1.0F;
                    var75 = 1.0F;
                    var74 = 1.0F;
                    var73 = 0.0F;
                    var79 = 1;
                    var78 = 0.0F;
                    var77 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field3951[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field3942[var68];
                        short var112 = arg1.field3966[var68];
                        short var113 = arg1.field3949[var68];
                        short var114 = arg1.field3961[var71];
                        short var115 = arg1.field3954[var71];
                        short var116 = arg1.field3940[var71];
                        float var117 = (float) arg1.field3969[var114];
                        float var118 = (float) arg1.field3946[var114];
                        float var119 = (float) arg1.field3965[var114];
                        float var120 = (float) arg1.field3969[var115] - var117;
                        float var121 = (float) arg1.field3946[var115] - var118;
                        float var122 = (float) arg1.field3965[var115] - var119;
                        float var123 = (float) arg1.field3969[var116] - var117;
                        float var124 = (float) arg1.field3946[var116] - var118;
                        float var125 = (float) arg1.field3965[var116] - var119;
                        float var126 = (float) arg1.field3969[var111] - var117;
                        float var127 = (float) arg1.field3946[var111] - var118;
                        float var128 = (float) arg1.field3965[var111] - var119;
                        float var129 = (float) arg1.field3969[var112] - var117;
                        float var130 = (float) arg1.field3946[var112] - var118;
                        float var131 = (float) arg1.field3965[var112] - var119;
                        float var132 = (float) arg1.field3969[var113] - var117;
                        float var133 = (float) arg1.field3946[var113] - var118;
                        float var134 = (float) arg1.field3965[var113] - var119;
                        float var135 = var121 * var125 - var122 * var124;
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - var121 * var123;
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - var123 * var137;
                        float var140 = var123 * var136 - (var124 * var135);
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var120 * var136 - (var121 * var135);
                        float var143 = var122 * var135 - var120 * var137;
                        float var144 = var121 * var137 - var122 * var136;
                        float var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                        var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                        var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                        var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                    } else {
                        short var83 = arg1.field3942[var68];
                        short var84 = arg1.field3966[var68];
                        short var85 = arg1.field3949[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field3948[var71];
                        float var91 = (float) arg1.field3941[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field3925[var71] / 1024.0F;
                            class73.method519(arg1.field3946[var83], var86, var88, var92, var87, var89, arg1.field3969[var83], arg1.field3965[var83], var90, (byte) 98, var91);
                            var74 = class93.field1558;
                            var73 = class30.field481;
                            class73.method519(arg1.field3946[var84], var86, var88, var92, var87, var89, arg1.field3969[var84], arg1.field3965[var84], var90, (byte) 115, var91);
                            var75 = class30.field481;
                            var76 = class93.field1558;
                            class73.method519(arg1.field3946[var85], var86, var88, var92, var87, var89, arg1.field3969[var85], arg1.field3965[var85], var90, (byte) 127, var91);
                            var77 = class30.field481;
                            var78 = class93.field1558;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > var93) {
                                    var79 = 1;
                                    var75 -= var92;
                                } else if (var73 - var75 > var93) {
                                    var75 += var92;
                                    var79 = 2;
                                }
                                if (var77 - var73 > var93) {
                                    var77 -= var92;
                                    var80 = 1;
                                } else if (var93 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                            } else {
                                if ((var78 - var74 > var93)) {
                                    var78 -= var92;
                                    var80 = 1;
                                } else if (var93 < var74 - var78) {
                                    var78 += var92;
                                    var80 = 2;
                                }
                                if (var76 - var74 > var93) {
                                    var79 = 1;
                                    var76 -= var92;
                                } else if (var93 < var74 - var76) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field3921[var71] / 256.0F;
                            float var95 = (float) arg1.field3973[var71] / 256.0F;
                            int var96 = arg1.field3969[var84] - arg1.field3969[var83];
                            int var97 = arg1.field3946[var84] - arg1.field3946[var83];
                            int var98 = arg1.field3965[var84] - arg1.field3965[var83];
                            int var99 = arg1.field3969[var85] - arg1.field3969[var83];
                            int var100 = arg1.field3946[var85] - arg1.field3946[var83];
                            int var101 = arg1.field3965[var85] - arg1.field3965[var83];
                            int var102 = var97 * var101 - (var98 * var100);
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field3963[var71];
                            float var106 = 64.0F / (float) arg1.field3958[var71];
                            float var107 = 64.0F / (float) arg1.field3925[var71];
                            float var108 = (var89[2] * (float) var104 + var89[1] * (float) var103 + var89[0] * (float) var102) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[6] * (float) var102 + var89[7] * (float) var103) / var107;
                            var81 = class304.method1942(var108, var110, -12, var109);
                            class1.method1(var88, var95, var89, arg1.field3969[var83], arg1.field3965[var83], var94, var81, var90, -102, arg1.field3946[var83], var86, var91, var87);
                            var73 = class275.field4522;
                            var74 = class369.field5718;
                            class1.method1(var88, var95, var89, arg1.field3969[var84], arg1.field3965[var84], var94, var81, var90, -105, arg1.field3946[var84], var86, var91, var87);
                            var75 = class275.field4522;
                            var76 = class369.field5718;
                            class1.method1(var88, var95, var89, arg1.field3969[var85], arg1.field3965[var85], var94, var81, var90, -91, arg1.field3946[var85], var86, var91, var87);
                            var77 = class275.field4522;
                            var78 = class369.field5718;
                        } else if (var82 == 3) {
                            class157.method1100(arg1.field3946[var83], var88, var89, var90, arg1.field3969[var83], true, arg1.field3965[var83], var86, var91, var87);
                            var74 = class244.field4190;
                            var73 = class126.field2181;
                            class157.method1100(arg1.field3946[var84], var88, var89, var90, arg1.field3969[var84], true, arg1.field3965[var84], var86, var91, var87);
                            var76 = class244.field4190;
                            var75 = class126.field2181;
                            class157.method1100(arg1.field3946[var85], var88, var89, var90, arg1.field3969[var85], true, arg1.field3965[var85], var86, var91, var87);
                            var78 = class244.field4190;
                            var77 = class126.field2181;
                            if ((var90 & 0x1) == 0) {
                                if (var75 - var73 > 0.5F) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var77++;
                                    var80 = 2;
                                }
                            } else {
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                                if ((var78 - var74 > 0.5F)) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var78++;
                                    var80 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field3931 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field3931[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var81 << 24) + (long) var72 + ((long) (var69 << 8)) << 32) + (long) (var71 << 2);
                short var149 = arg1.field3942[var68];
                short var150 = arg1.field3966[var68];
                short var151 = arg1.field3949[var68];
                class418 var152 = var13[var149];
                this.field1810[var52] = this.method737(true, var147, var152.field6327, var152.field6328, var73, var74, var149, var152.field6326, var152.field6331, arg1);
                class418 var153 = var13[var150];
                this.field1890[var52] = this.method737(true, (long) var79 + var147, var153.field6327, var153.field6328, var75, var76, var150, var153.field6326, var153.field6331, arg1);
                class418 var154 = var13[var151];
                this.field1825[var52] = this.method737(true, (long) var80 + var147, var154.field6327, var154.field6328, var77, var78, var151, var154.field6326, var154.field6331, arg1);
            } else if (var146 == 1) {
                class253 var155 = var50[var68];
                long var156 = (long) ((var155.field4306 + 256 << 12) + (var155.field4311 <= 0 ? 2048 : 1024) + ((var71 << 2) - -(var155.field4312 + 256 << 22))) + ((long) (var69 << 8) + (long) var72 + (long) (var81 << 24) << 32);
                this.field1810[var52] = this.method737(true, var156, var155.field4312, 0, var73, var74, arg1.field3942[var68], var155.field4306, var155.field4311, arg1);
                this.field1890[var52] = this.method737(true, (long) var79 + var156, var155.field4312, 0, var75, var76, arg1.field3966[var68], var155.field4306, var155.field4311, arg1);
                this.field1825[var52] = this.method737(true, (long) var80 + var156, var155.field4312, 0, var77, var78, arg1.field3949[var68], var155.field4306, var155.field4311, arg1);
            }
            if (arg1.field3939 == null) {
                this.field1812[var52] = -1;
            } else {
                this.field1812[var52] = arg1.field3939[var68];
            }
            if (arg1.field3938 != null) {
                this.field1839[var52] = arg1.field3938[var68];
            }
            if (arg1.field3929 != null) {
                this.field1802[var52] = arg1.field3929[var68];
            }
            this.field1823[var52] = arg1.field3923[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field1815; var55++) {
            short var67 = this.field1812[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field1859 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field1815; var58++) {
            short var66 = this.field1812[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field1859[var57++] = var58;
            }
        }
        this.field1859[var57] = this.field1815;
        class465.field6915 = null;
        this.field1851 = class102.method700(0, this.field1801, this.field1851);
        this.field1831 = class102.method700(0, this.field1801, this.field1831);
        this.field1866 = class102.method700(0, this.field1801, this.field1866);
        this.field1897 = class398.method2485(this.field1801, 26, this.field1897);
        this.field1860 = class55.method387(this.field1860, this.field1801, 0);
        this.field1875 = class55.method387(this.field1875, this.field1801, 0);
        if (arg1.field3955 != null && class380.method2405((byte) -47, this.field1880, arg2)) {
            this.field1848 = arg1.method1570((byte) 113);
        }
        if (arg1.field3972 != null && class309.method1963(false, this.field1880, arg2)) {
            this.field1849 = arg1.method1572(0);
        }
        if (arg1.field3960 != null && class367.method2334(true, this.field1880, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field1869; var61++) {
                int var65 = arg1.field3960[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field1791 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field1791[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field1869; var63++) {
                int var64 = arg1.field3960[var8[var63]];
                if (var64 >= 0) {
                    this.field1791[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "Y", descriptor = "()I", line = 1945)
    public final int method745() {
        field1845++;
        return this.field1835;
    }

    @OriginalMember(owner = "client!at", name = "C", descriptor = "(I)V", line = 1962)
    public final void method746(int arg0) {
        field1892++;
        int var2 = class46.field757[arg0];
        int var3 = class46.field755[arg0];
        for (int var4 = 0; var4 < this.field1881; var4++) {
            int var7 = this.field1830[var4] * var3 + this.field1820[var4] * var2 >> 15;
            this.field1820[var4] = this.field1820[var4] * var3 - (this.field1830[var4] * var2) >> 15;
            this.field1830[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field1801; var5++) {
            int var6 = this.field1866[var5] * var2 + (this.field1851[var5] * var3) >> 15;
            this.field1866[var5] = (short) (this.field1866[var5] * var3 - (this.field1851[var5] * var2) >> 15);
            this.field1851[var5] = (short) var6;
        }
        if (this.field1847 == null && this.field1857 != null) {
            this.field1857.field731 = null;
        }
        if (this.field1847 != null) {
            this.field1847.field731 = null;
        }
        this.field1800 = false;
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IZ)V", line = 2011)
    private final void method747(int arg0, boolean arg1) {
        field1844++;
        boolean var3 = this.field1857 != null && this.field1857.field731 == null;
        boolean var4 = this.field1847 != null && this.field1847.field731 == null;
        if (arg0 <= 121) {
            this.method755(-15, -86, -114, -87);
        }
        boolean var5 = this.field1827 != null && this.field1827.field731 == null;
        boolean var6 = this.field1828 != null && this.field1828.field731 == null;
        if (arg1) {
            var4 &= (this.field1805 & 0x4) != 0;
            var3 &= (this.field1805 & 0x2) != 0;
            var6 &= (this.field1805 & 0x8) != 0;
            var5 &= (this.field1805 & 0x1) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field1864.field3656.field302.length < (this.field1801 * var7)) {
            this.field1864.field3656 = new class364((this.field1801 + 100) * var7);
        } else {
            this.field1864.field3656.field301 = 0;
        }
        class364 var12 = this.field1864.field3656;
        if (var5) {
            if (this.field1864.field3708) {
                for (int var13 = 0; var13 < this.field1881; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field1830[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field1850[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field1820[var13]);
                    int var17 = this.field1798[var13];
                    int var18 = this.field1798[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field1843[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field301 = var7 * var20;
                        var12.method152(var14, (byte) -38);
                        var12.method152(var15, (byte) -38);
                        var12.method152(var16, (byte) -38);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field1881; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field1830[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field1850[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field1820[var21]);
                    int var25 = this.field1798[var21];
                    int var26 = this.field1798[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field1843[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field301 = var7 * var28;
                        var12.method120(true, var22);
                        var12.method120(true, var23);
                        var12.method120(true, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field1847 == null) {
                byte[] var31;
                short[] var32;
                short[] var33;
                short[] var34;
                if (this.field1834 == null) {
                    var31 = this.field1897;
                    var32 = this.field1851;
                    var33 = this.field1866;
                    var34 = this.field1831;
                } else {
                    var31 = this.field1834.field2288;
                    var32 = this.field1834.field2290;
                    var34 = this.field1834.field2294;
                    var33 = this.field1834.field2289;
                }
                float var35 = this.field1864.field3695[0];
                float var36 = this.field1864.field3695[1];
                float var37 = this.field1864.field3695[2];
                float var38 = this.field1864.field3712;
                float var39 = this.field1864.field3731 * 768.0F / (float) this.field1853;
                float var40 = this.field1864.field3642 * 768.0F / (float) this.field1853;
                for (int var41 = 0; var41 < this.field1869; var41++) {
                    int var42 = this.method758((byte) 19, this.field1839[var41], this.field1812[var41], this.field1823[var41], this.field1835);
                    float var43 = (float) ((var42 & 0xFF6E) >> 8) * this.field1864.field3652;
                    short var44 = this.field1810[var41];
                    float var45 = (float) (var42 >>> 24) * this.field1864.field3697;
                    float var46 = (float) (var42 >> 16 & 0xFF) * this.field1864.field3672;
                    short var47 = (short) var31[var44];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var33[var44] * var37 + (float) var32[var44] * var35 + (float) var34[var44] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var33[var44] * var37 + (float) var32[var44] * var35 + (float) var34[var44] * var36) / (float) (var47 * 256);
                    }
                    float var49 = ((var48 < 0.0F) ? var40 : var39) * var48 + var38;
                    int var50 = (int) (var45 * var49);
                    int var51 = (int) (var46 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var52 = (int) (var43 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.field301 = var7 * var44 + var9;
                    var12.method163(var50, (byte) 49);
                    var12.method163(var51, (byte) 49);
                    var12.method163(var52, (byte) 49);
                    var12.method163(255 - (this.field1839[var41] & 0xFF), (byte) 49);
                    short var53 = this.field1890[var41];
                    short var54 = (short) var31[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var33[var53] * var37 + (float) var32[var53] * var35 + (float) var34[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var33[var53] * var37 + (float) var32[var53] * var35 + (float) var34[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + ((var55 < 0.0F) ? var40 : var39) * var55;
                    int var57 = (int) (var45 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var46 * var56);
                    int var59 = (int) (var43 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    var12.field301 = var7 * var53 + var9;
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method163(var57, (byte) 49);
                    var12.method163(var58, (byte) 49);
                    var12.method163(var59, (byte) 49);
                    var12.method163(255 - (this.field1839[var41] & 0xFF), (byte) 49);
                    short var60 = this.field1825[var41];
                    short var61 = (short) var31[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var33[var60] * var37 + (float) var32[var60] * var35 + (float) var34[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var33[var60] * var37 + (float) var32[var60] * var35 + (float) var34[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = ((var62 < 0.0F) ? var40 : var39) * var62 + var38;
                    int var64 = (int) (var45 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    int var65 = (int) (var46 * var63);
                    int var66 = (int) (var43 * var63);
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field301 = var9 + (var7 * var60);
                    var12.method163(var64, (byte) 49);
                    var12.method163(var65, (byte) 49);
                    var12.method163(var66, (byte) 49);
                    var12.method163(255 - (this.field1839[var41] & 0xFF), (byte) 49);
                }
            } else {
                for (int var29 = 0; var29 < this.field1869; var29++) {
                    int var30 = this.method758((byte) 19, this.field1839[var29], this.field1812[var29], this.field1823[var29], this.field1835);
                    var12.field301 = this.field1810[var29] * var7 + var9;
                    var12.method152(var30, (byte) -38);
                    var12.field301 = this.field1890[var29] * var7 + var9;
                    var12.method152(var30, (byte) -38);
                    var12.field301 = this.field1825[var29] * var7 + var9;
                    var12.method152(var30, (byte) -38);
                }
            }
        }
        if (var4) {
            byte[] var67;
            short[] var68;
            short[] var69;
            short[] var70;
            if (this.field1834 == null) {
                var70 = this.field1851;
                var68 = this.field1831;
                var69 = this.field1866;
                var67 = this.field1897;
            } else {
                var67 = this.field1834.field2288;
                var68 = this.field1834.field2294;
                var69 = this.field1834.field2289;
                var70 = this.field1834.field2290;
            }
            float var71 = 3.0F / (float) this.field1853;
            var12.field301 = var10;
            float var72 = 3.0F / (float) (this.field1853 / 2 + this.field1853);
            if (this.field1864.field3708) {
                for (int var73 = 0; var73 < this.field1801; var73++) {
                    int var74 = var67[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2319((float) var70[var73] * var72, 2177);
                        var12.method2319((float) var68[var73] * var72, 2177);
                        var12.method2319((float) var69[var73] * var72, 2177);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2319((float) var70[var73] * var75, 2177);
                        var12.method2319((float) var68[var73] * var75, 2177);
                        var12.method2319((float) var69[var73] * var75, 2177);
                    }
                    var12.field301 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field1801; var76++) {
                    int var77 = var67[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2323((float) var70[var76] * var72, (byte) -57);
                        var12.method2323((float) var68[var76] * var72, (byte) -124);
                        var12.method2323((float) var69[var76] * var72, (byte) -60);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2323((float) var70[var76] * var78, (byte) -102);
                        var12.method2323((float) var68[var76] * var78, (byte) -119);
                        var12.method2323((float) var69[var76] * var78, (byte) -62);
                    }
                    var12.field301 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field301 = var11;
            if (this.field1864.field3708) {
                for (int var79 = 0; var79 < this.field1801; var79++) {
                    var12.method2319(this.field1860[var79], 2177);
                    var12.method2319(this.field1875[var79], 2177);
                    var12.field301 += var7 - 8;
                }
            } else {
                for (int var80 = 0; var80 < this.field1801; var80++) {
                    var12.method2323(this.field1860[var80], (byte) -124);
                    var12.method2323(this.field1875[var80], (byte) -114);
                    var12.field301 += var7 - 8;
                }
            }
        }
        var12.field301 = this.field1801 * var7;
        class92 var81;
        if (arg1) {
            if (this.field1787 == null) {
                this.field1787 = this.field1864.method1442(true, var12.field301, var12.field302, (byte) -27, var7);
            } else {
                this.field1787.method516((byte) -98, var12.field302, var12.field301, var7);
            }
            this.field1805 = 0;
            var81 = this.field1787;
        } else {
            var81 = this.field1864.method1442(false, var12.field301, var12.field302, (byte) 123, var7);
            this.field1842 = true;
        }
        if (var5) {
            this.field1827.field731 = var81;
            this.field1827.field735 = var8;
        }
        if (var6) {
            this.field1828.field731 = var81;
            this.field1828.field735 = var11;
        }
        if (var3) {
            this.field1857.field735 = var9;
            this.field1857.field731 = var81;
        }
        if (var4) {
            this.field1847.field731 = var81;
            this.field1847.field735 = var10;
        }
    }

    @OriginalMember(owner = "client!at", name = "aa", descriptor = "(I[IIIIZI[I)V", line = 2531)
    public final void method748(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field1794++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = arg3 << 4;
            class251.field4294 = 0;
            class162.field2570 = 0;
            int var13 = 0;
            class404.field6133 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1848.length) {
                    int[] var16 = this.field1848[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1840 == null || (arg6 & this.field1840[var18]) != 0) {
                            class162.field2570 += this.field1830[var18];
                            class404.field6133 += this.field1850[var18];
                            class251.field4294 += this.field1820[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class404.field6133 = var12;
                class162.field2570 = var11;
                class251.field4294 = var10;
            } else {
                class404.field6133 = class404.field6133 / var13 + var12;
                class46.field746 = true;
                class251.field4294 = class251.field4294 / var13 + var10;
                class162.field2570 = class162.field2570 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[1] * arg3 + arg7[0] * arg2 + 16384 >> 15;
                int var20 = arg7[3] * arg2 + (arg7[4] * arg3) + arg7[5] * arg4 + 16384 >> 15;
                int var21 = arg7[6] * arg2 + (arg7[8] * arg4) + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg4 = var21;
                arg3 = var20;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1848.length) {
                    int[] var27 = this.field1848[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1840 == null || (this.field1840[var29] & arg6) != 0) {
                            this.field1830[var29] += var24;
                            this.field1850[var29] += var23;
                            this.field1820[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field1848.length) {
                        int[] var50 = this.field1848[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field1840 == null || (arg6 & this.field1840[var52]) != 0) {
                                this.field1830[var52] -= class162.field2570;
                                this.field1850[var52] -= class404.field6133;
                                this.field1820[var52] -= class251.field4294;
                                if (arg4 != 0) {
                                    int var53 = class46.field757[arg4];
                                    int var54 = class46.field755[arg4];
                                    int var55 = this.field1850[var52] * var53 + this.field1830[var52] * var54 + 32767 >> 15;
                                    this.field1850[var52] = this.field1850[var52] * var54 + 32767 - (this.field1830[var52] * var53) >> 15;
                                    this.field1830[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class46.field757[arg2];
                                    int var57 = class46.field755[arg2];
                                    int var58 = this.field1850[var52] * var57 + 32767 - (this.field1820[var52] * var56) >> 15;
                                    this.field1820[var52] = this.field1850[var52] * var56 + (this.field1820[var52] * var57) + 32767 >> 15;
                                    this.field1850[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class46.field757[arg3];
                                    int var60 = class46.field755[arg3];
                                    int var61 = this.field1830[var52] * var60 + this.field1820[var52] * var59 + 32767 >> 15;
                                    this.field1820[var52] = this.field1820[var52] * var60 + 32767 - (this.field1830[var52] * var59) >> 15;
                                    this.field1830[var52] = var61;
                                }
                                this.field1830[var52] += class162.field2570;
                                this.field1850[var52] += class404.field6133;
                                this.field1820[var52] += class251.field4294;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field1848.length > var32) {
                            int[] var33 = this.field1848[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field1840 == null || (this.field1840[var35] & arg6) != 0) {
                                    int var36 = this.field1798[var35];
                                    int var37 = this.field1798[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field1843[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class46.field757[arg4];
                                            int var41 = class46.field755[arg4];
                                            int var42 = this.field1851[var39] * var41 + this.field1831[var39] * var40 + 32767 >> 15;
                                            this.field1831[var39] = (short) (this.field1831[var39] * var41 + 32767 - (this.field1851[var39] * var40) >> 15);
                                            this.field1851[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class46.field757[arg2];
                                            int var44 = class46.field755[arg2];
                                            int var45 = this.field1831[var39] * var44 + 32767 - (this.field1866[var39] * var43) >> 15;
                                            this.field1866[var39] = (short) (this.field1866[var39] * var44 + this.field1831[var39] * var43 + 32767 >> 15);
                                            this.field1831[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class46.field757[arg3];
                                            int var47 = class46.field755[arg3];
                                            int var48 = this.field1866[var39] * var46 + this.field1851[var39] * var47 + 32767 >> 15;
                                            this.field1866[var39] = (short) (this.field1866[var39] * var47 + 32767 - (this.field1851[var39] * var46) >> 15);
                                            this.field1851[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1847 == null && this.field1857 != null) {
                        this.field1857.field731 = null;
                    }
                    if (this.field1847 != null) {
                        this.field1847.field731 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class46.field746) {
                    int var68 = arg7[3] * class404.field6133 + arg7[0] * class162.field2570 + arg7[6] * class251.field4294 + 16384 >> 15;
                    int var69 = arg7[7] * class251.field4294 + (arg7[1] * class162.field2570 - (-(arg7[4] * class404.field6133) - 16384)) >> 15;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[2] * class162.field2570 + arg7[5] * class404.field6133 + (arg7[8] * class251.field4294 - -16384) >> 15;
                    class162.field2570 = var71;
                    int var73 = var67 + var72;
                    class404.field6133 = var70;
                    class251.field4294 = var73;
                    class46.field746 = false;
                }
                int[] var74 = new int[9];
                int var75 = class46.field755[arg2];
                int var76 = class46.field757[arg2];
                int var77 = class46.field755[arg3];
                int var78 = class46.field757[arg3];
                int var79 = class46.field755[arg4];
                int var80 = class46.field757[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[6] = var77 * var82 + -var78 * var79 + 16384 >> 15;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                var74[5] = -var76;
                var74[1] = var78 * var81 + (-var77 * var80 + 16384) >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[7] = var77 * var81 + var78 * var80 + 16384 >> 15;
                int var83 = var74[0] * -class162.field2570 + var74[1] * -class404.field6133 + var74[2] * -class251.field4294 + 16384 >> 15;
                int var84 = var74[5] * -class251.field4294 + var74[4] * -class404.field6133 + var74[3] * -class162.field2570 + 16384 >> 15;
                int var85 = var74[7] * -class404.field6133 + var74[8] * -class251.field4294 + var74[6] * -class162.field2570 + 16384 >> 15;
                int var86 = class162.field2570 + var83;
                int var87 = class404.field6133 + var84;
                int var88 = class251.field4294 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[2] * var67 + var74[1] * var66 + var74[0] * var65 + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[3] * var65 + (var74[4] * var66) + 16384 >> 15;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[6] * var65 - (-(var74[7] * var66) - (var74[8] * var67 + 16384)) >> 15;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[2] * var96 + arg7[0] * var93 + arg7[1] * var94 + 16384 >> 15;
                int var100 = arg7[3] * var93 + arg7[4] * var94 + (arg7[5] * var96) + 16384 >> 15;
                int var101 = var63 + var100;
                int var102 = arg7[8] * var96 + (arg7[6] * var93 + (arg7[7] * var94) + 16384) >> 15;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field1848.length) {
                        int[] var107 = this.field1848[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field1840 == null || (arg6 & this.field1840[var109]) != 0) {
                                int var110 = this.field1820[var109] * var97[2] + (this.field1830[var109] * var97[0] + (this.field1850[var109] * var97[1])) + 16384 >> 15;
                                int var111 = this.field1830[var109] * var97[3] + (this.field1850[var109] * var97[4]) + this.field1820[var109] * var97[5] + 16384 >> 15;
                                int var112 = this.field1850[var109] * var97[7] + this.field1830[var109] * var97[6] + (this.field1820[var109] * var97[8]) + 16384 >> 15;
                                int var113 = var101 + var111;
                                int var114 = var103 + var110;
                                int var115 = var104 + var112;
                                this.field1830[var109] = var114;
                                this.field1850[var109] = var113;
                                this.field1820[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field1848.length > var173) {
                        int[] var174 = this.field1848[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1840 == null || (arg6 & this.field1840[var176]) != 0) {
                                this.field1830[var176] -= class162.field2570;
                                this.field1850[var176] -= class404.field6133;
                                this.field1820[var176] -= class251.field4294;
                                this.field1830[var176] = this.field1830[var176] * arg2 >> 7;
                                this.field1850[var176] = this.field1850[var176] * arg3 >> 7;
                                this.field1820[var176] = this.field1820[var176] * arg4 >> 7;
                                this.field1830[var176] += class162.field2570;
                                this.field1850[var176] += class404.field6133;
                                this.field1820[var176] += class251.field4294;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class46.field746) {
                    int var128 = arg7[6] * class251.field4294 + (arg7[0] * class162.field2570 + (arg7[3] * class404.field6133)) + 16384 >> 15;
                    int var129 = arg7[4] * class404.field6133 + arg7[1] * class162.field2570 + arg7[7] * class251.field4294 + 16384 >> 15;
                    int var130 = var125 + var128;
                    int var131 = var126 + var129;
                    int var132 = arg7[2] * class162.field2570 - (-(arg7[5] * class404.field6133) - arg7[8] * class251.field4294 - 16384) >> 15;
                    class162.field2570 = var130;
                    class404.field6133 = var131;
                    int var133 = var127 + var132;
                    class46.field746 = false;
                    class251.field4294 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class162.field2570 * var134 + 16384 >> 15;
                int var138 = -class404.field6133 * var135 + 16384 >> 15;
                int var139 = -class251.field4294 * var136 + 16384 >> 15;
                int var140 = class162.field2570 + var137;
                int var141 = var138 + class404.field6133;
                int var142 = class251.field4294 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var141 + var145;
                int var147 = var127 * var136 + 16384 >> 15;
                int var148 = var140 + var144;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += var143[var169 + (var171 * 3)] * arg7[var151 * 3 + var171];
                        }
                        var150[var151 * 3 + var169] = var170 + 16384 >> 15;
                    }
                }
                int var152 = arg7[1] * var146 + (arg7[2] * var149) + arg7[0] * var148 + 16384 >> 15;
                int var153 = arg7[5] * var149 + arg7[4] * var146 + arg7[3] * var148 + 16384 >> 15;
                int var154 = arg7[8] * var149 + arg7[6] * var148 + arg7[7] * var146 + 16384 >> 15;
                int var155 = var122 + var152;
                int var156 = var123 + var153;
                int var157 = var124 + var154;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (var159 < this.field1848.length) {
                        int[] var160 = this.field1848[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field1840 == null || (this.field1840[var162] & arg6) != 0) {
                                int var163 = this.field1820[var162] * var150[2] + (this.field1830[var162] * var150[0] + (this.field1850[var162] * var150[1])) + 16384 >> 15;
                                int var164 = this.field1820[var162] * var150[5] + this.field1850[var162] * var150[4] + this.field1830[var162] * var150[3] + 16384 >> 15;
                                int var165 = var156 + var164;
                                int var166 = this.field1850[var162] * var150[7] + this.field1830[var162] * var150[6] + this.field1820[var162] * var150[8] + 16384 >> 15;
                                int var167 = var155 + var163;
                                int var168 = var157 + var166;
                                this.field1830[var162] = var167;
                                this.field1850[var162] = var165;
                                this.field1820[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1791 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field1791.length > var181) {
                        int[] var182 = this.field1791[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field1802 == null || (this.field1802[var184] & arg6) != 0) {
                                int var185 = (this.field1839[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field1839[var184] = (byte) var185;
                                if (this.field1857 != null) {
                                    this.field1857.field731 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1888 != null) {
                    for (int var178 = 0; var178 < this.field1879; var178++) {
                        class15 var179 = this.field1888[var178];
                        class12 var180 = this.field1814[var178];
                        var180.field143 = var180.field143 & 0xFFFFFF | 255 - (this.field1839[var179.field175] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field1791 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field1791.length) {
                        int[] var191 = this.field1791[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field1802 == null || (arg6 & this.field1802[var193]) != 0) {
                                int var194 = this.field1823[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFD56) >> 10;
                                int var196 = (var194 & 0x3C8) >> 7;
                                int var197 = var194 & 0x7F;
                                int var198 = var195 + arg2 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                int var200 = arg4 + var197;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field1823[var193] = (short) class338.method2141(var200, class338.method2141(var199 << 7, var198 << 10));
                                if (this.field1857 != null) {
                                    this.field1857.field731 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field1888 != null) {
                    for (int var187 = 0; var187 < this.field1879; var187++) {
                        class15 var188 = this.field1888[var187];
                        class12 var189 = this.field1814[var187];
                        var189.field143 = var189.field143 & 0xFF000000 | class164.field2603[this.field1823[var188.field175] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field1849 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (var202 < this.field1849.length) {
                        int[] var203 = this.field1849[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class12 var205 = this.field1814[var203[var204]];
                            var205.field139 += arg3;
                            var205.field132 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field1849 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field1849.length) {
                        int[] var208 = this.field1849[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class12 var210 = this.field1814[var208[var209]];
                            var210.field138 = var210.field138 * arg2 >> 7;
                            var210.field140 = var210.field140 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field1849 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field1849.length > var212) {
                    int[] var213 = this.field1849[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class12 var215 = this.field1814[var213[var214]];
                        var215.field137 = var215.field137 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "k", descriptor = "()I", line = 3518)
    public final int method749() {
        if (!this.field1800) {
            this.method742(-17620);
        }
        field1837++;
        return this.field1893;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)V", line = 3533)
    public static final void method750(int arg0, int arg1) {
        if (arg1 > -118) {
            field1901 = null;
        }
        for (class276 var2 = class81.field1408.method2518(127); var2 != null; var2 = class81.field1408.method2524(0)) {
            if ((var2.field4542 >> 48 & 0xFFFFL) == ((long) arg0)) {
                var2.method1821((byte) 114);
            }
        }
        field1829++;
    }

    @OriginalMember(owner = "client!at", name = "Z", descriptor = "()I", line = 3557)
    public final int method751() {
        if (!this.field1800) {
            this.method742(-17620);
        }
        field1807++;
        return this.field1795;
    }

    @OriginalMember(owner = "client!at", name = "pa", descriptor = "()I", line = 3579)
    public final int method752() {
        field1883++;
        return this.field1853;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIIII)Z", line = 3588)
    private final boolean method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1838++;
        if (arg8 != -1) {
            this.method772(null, -70, 13, 94, true);
        }
        if (arg1 > arg4 && arg6 > arg4 && arg3 > arg4) {
            return false;
        } else if (arg1 < arg4 && arg4 > arg6 && arg4 > arg3) {
            return false;
        } else if (arg7 > arg0 && arg5 > arg0 && arg2 > arg0) {
            return false;
        } else {
            return arg0 <= arg7 || arg0 <= arg5 || arg2 >= arg0;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)V", line = 3613)
    private final void method754(boolean arg0, int arg1) {
        int var3 = -114 % ((arg1 + 51) / 33);
        if (this.field1864.field3656.field302.length < this.field1815 * 6) {
            this.field1864.field3656 = new class364((this.field1815 + 100) * 6);
        } else {
            this.field1864.field3656.field301 = 0;
        }
        field1882++;
        class364 var4 = this.field1864.field3656;
        if (this.field1864.field3708) {
            for (int var5 = 0; var5 < this.field1815; var5++) {
                var4.method182(this.field1810[var5], -120);
                var4.method182(this.field1890[var5], -119);
                var4.method182(this.field1825[var5], 94);
            }
        } else {
            for (int var6 = 0; var6 < this.field1815; var6++) {
                var4.method154(this.field1810[var6], -857932536);
                var4.method154(this.field1890[var6], -857932536);
                var4.method154(this.field1825[var6], -857932536);
            }
        }
        if (var4.field301 == 0) {
            return;
        }
        if (arg0) {
            if (this.field1836 == null) {
                this.field1836 = this.field1864.method1480(var4.field302, true, 5123, 89, var4.field301);
            } else {
                this.field1836.method314(5123, 120, var4.field302, var4.field301);
            }
            this.field1811.field182 = this.field1836;
        } else {
            this.field1811.field182 = this.field1864.method1480(var4.field302, false, 5123, 106, var4.field301);
        }
        if (!arg0) {
            this.field1842 = true;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIII)V", line = 3682)
    public final void method755(int arg0, int arg1, int arg2, int arg3) {
        field1804++;
        for (int var5 = 0; var5 < this.field1869; var5++) {
            int var9 = this.field1823[var5] & 0xFFFF;
            int var10 = (var9 & 0xFF69) >> 10;
            int var11 = var9 >> 7 & 0x7;
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field1823[var5] = (short) class338.method2141(var12, class338.method2141(var11 << 7, var10 << 10));
        }
        if (this.field1888 != null) {
            for (int var6 = 0; var6 < this.field1879; var6++) {
                class15 var7 = this.field1888[var6];
                class12 var8 = this.field1814[var6];
                var8.field143 = var8.field143 & 0xFF000000 | class164.field2603[this.field1823[var7.field175] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field1857 != null) {
            this.field1857.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "ma", descriptor = "(I)V", line = 3741)
    public final void method756(int arg0) {
        field1824++;
        int var2 = class46.field757[arg0];
        int var3 = class46.field755[arg0];
        for (int var4 = 0; var4 < this.field1881; var4++) {
            int var5 = this.field1830[var4] * var3 + this.field1820[var4] * var2 >> 15;
            this.field1820[var4] = this.field1820[var4] * var3 - (this.field1830[var4] * var2) >> 15;
            this.field1830[var4] = var5;
        }
        this.field1800 = false;
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V", line = 3781)
    private final void method757(boolean arg0) {
        field1871++;
        if (this.field1815 == 0) {
            return;
        }
        if (this.field1805 != 0) {
            this.method747(122, true);
        }
        this.method747(126, arg0);
        if (this.field1811 != null) {
            if (this.field1811.field182 == null) {
                this.method754((this.field1805 & 0x10) != 0, -117);
            }
            if (this.field1811.field182 != null) {
                this.field1864.method1417(this.field1847 != null, false);
                this.field1864.method1406(32888, this.field1828, this.field1847, this.field1857, this.field1827);
                int var2 = this.field1859.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field1859[var3];
                    int var5 = this.field1859[var3 + 1];
                    int var6 = this.field1812[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field1864.method1477(true, this.field1847 != null, var6);
                    this.field1864.method1407((var5 - var4) * 3, (byte) -68, 4, this.field1811.field182, var4 * 3);
                }
            }
        }
        this.method771(-22314);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BBSII)I", line = 3844)
    private final int method758(byte arg0, byte arg1, short arg2, int arg3, int arg4) {
        field1822++;
        if (arg0 != 19) {
            return -7;
        }
        int var6 = class164.field2603[class301.method1925((byte) 33, arg3, arg4)];
        if (arg2 != -1) {
            class320 var7 = this.field1864.field7179.method195(arg2 & 0xFFFF, (byte) -105);
            int var8 = var7.field5029 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg4 < 0) {
                    var9 = 0;
                } else if (arg4 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg4 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field5035 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var13 << 8 & 0xFF00C6) + (var15 >> 8) + (var14 & 0xFF00);
            }
        }
        return (var6 << 8) + 255 - (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)V", line = 3917)
    public static void method759(int arg0) {
        if (arg0 < 80) {
            return;
        }
        field1896 = null;
        field1899 = null;
        field1865 = null;
        field1901 = null;
        field1898 = null;
        field1826 = null;
    }

    @OriginalMember(owner = "client!at", name = "ta", descriptor = "()I", line = 3932)
    public final int method760() {
        if (!this.field1800) {
            this.method742(-17620);
        }
        field1789++;
        return this.field1872;
    }

    @OriginalMember(owner = "client!at", name = "K", descriptor = "(I)V", line = 3944)
    public final void method761(int arg0) {
        field1895++;
        int var2 = class46.field757[arg0];
        int var3 = class46.field755[arg0];
        for (int var4 = 0; var4 < this.field1881; var4++) {
            int var5 = this.field1850[var4] * var2 + (this.field1830[var4] * var3) >> 15;
            this.field1850[var4] = this.field1850[var4] * var3 - (this.field1830[var4] * var2) >> 15;
            this.field1830[var4] = var5;
        }
        this.field1800 = false;
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "D", descriptor = "(I)V", line = 3979)
    public final void method762(int arg0) {
        this.field1808 = arg0;
        field1870++;
        if (this.field1834 != null && (this.field1808 & 0x10000) == 0) {
            this.field1866 = this.field1834.field2289;
            this.field1831 = this.field1834.field2294;
            this.field1897 = this.field1834.field2288;
            this.field1851 = this.field1834.field2290;
            this.field1834 = null;
        }
        this.field1842 = true;
        this.method771(-22314);
    }

    @OriginalMember(owner = "client!at", name = "A", descriptor = "(I)V", line = 4005)
    public final void method763(int arg0) {
        if (this.field1857 != null) {
            this.field1857.field731 = null;
        }
        this.field1853 = (short) arg0;
        field1816++;
        if (this.field1847 != null) {
            this.field1847.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "KA", descriptor = "()V", line = 4022)
    public final void method764() {
        field1841++;
        for (int var1 = 0; var1 < this.field1868; var1++) {
            this.field1830[var1] = this.field1830[var1] + 7 >> 4;
            this.field1850[var1] = this.field1850[var1] + 7 >> 4;
            this.field1820[var1] = this.field1820[var1] + 7 >> 4;
        }
        this.field1800 = false;
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "u", descriptor = "(SS)V", line = 4047)
    public final void method765(short arg0, short arg1) {
        field1894++;
        class196 var3 = this.field1864.field7179;
        for (int var4 = 0; var4 < this.field1869; var4++) {
            if (this.field1812[var4] == arg0) {
                this.field1812[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class320 var7 = var3.method195(arg0 & 0xFFFF, (byte) -105);
            var5 = var7.field5029;
            var6 = var7.field5035;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class320 var10 = var3.method195(arg1 & 0xFFFF, (byte) -105);
            var9 = var10.field5035;
            var8 = var10.field5029;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field1888 != null) {
            for (int var11 = 0; var11 < this.field1879; var11++) {
                class15 var12 = this.field1888[var11];
                class12 var13 = this.field1814[var11];
                var13.field143 = class164.field2603[this.field1823[var12.field175] & 0xFFFF] & 0xFFFFFF | var13.field143 & 0xFF000000;
            }
        }
        if (this.field1857 != null) {
            this.field1857.field731 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!at", name = "MA", descriptor = "()I", line = 4127)
    public final int method766() {
        field1803++;
        if (!this.field1800) {
            this.method742(-17620);
        }
        return this.field1819;
    }

    @OriginalMember(owner = "client!at", name = "da", descriptor = "(IILya;Lya;III)V", line = 4139)
    public final void method767(int arg0, int arg1, class220 arg2, class220 arg3, int arg4, int arg5, int arg6) {
        if (!this.field1800) {
            this.method742(-17620);
        }
        field1858++;
        int var8 = this.field1872 + arg4;
        int var9 = this.field1819 + arg4;
        int var10 = this.field1795 + arg6;
        int var11 = arg6 + this.field1793;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field3802 + var9 >> arg2.field3803) >= arg2.field3801 || var10 < 0 || arg2.field3797 <= (arg2.field3802 + var11 >> arg2.field3803)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || (arg3.field3802 + var9 >> arg3.field3803) >= arg3.field3801 || var10 < 0 || arg3.field3797 <= (arg3.field3802 + var11 >> arg3.field3803)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field3803;
            int var13 = arg2.field3802 - (1 - var9) >> arg2.field3803;
            int var14 = var10 >> arg2.field3803;
            int var15 = arg2.field3802 + var11 - 1 >> arg2.field3803;
            if (arg2.method1516(var12, var14) == arg5 && arg5 == arg2.method1516(var13, var14) && arg5 == arg2.method1516(var12, var15) && arg2.method1516(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field1881; var16++) {
                this.field1850[var16] = this.field1850[var16] + arg2.method1517(this.field1830[var16] + arg4, this.field1820[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var30 = this.field1867;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field1881; var31++) {
                int var32 = (this.field1850[var31] << 16) / var30;
                if (var32 < arg1) {
                    this.field1850[var31] += (arg2.method1517(this.field1830[var31] + arg4, this.field1820[var31] + arg6) - arg5) * (arg1 - var32) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var17 = (arg1 & 0xFF) * 4;
            int var18 = ((arg1 & 0xFFD1) >> 8) * 4;
            int var19 = (arg1 >> 16 & 0xFF) << 6;
            int var20 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var17 >> 1)) < 0 || (arg2.field3801 << arg2.field3803) <= (arg4 + (var17 >> 1) + arg2.field3802) || arg6 - (var18 >> 1) < 0 || arg6 + (var18 >> 1) + arg2.field3802 >= arg2.field3797 << arg2.field3803) {
                return;
            }
            this.method3141(var17, arg6, var19, 0, arg5, var20, arg4, arg2, var18);
        } else if (arg0 == 4) {
            int var28 = this.field1817 - this.field1867;
            for (int var29 = 0; var29 < this.field1881; var29++) {
                this.field1850[var29] = this.field1850[var29] + arg3.method1517(this.field1830[var29] + arg4, this.field1820[var29] - -arg6) + var28 - arg5;
            }
        } else if (arg0 == 5) {
            int var21 = this.field1817 - this.field1867;
            for (int var22 = 0; var22 < this.field1881; var22++) {
                int var23 = this.field1830[var22] + arg4;
                int var24 = this.field1820[var22] + arg6;
                int var25 = arg2.method1517(var23, var24);
                int var26 = arg3.method1517(var23, var24);
                int var27 = var25 - var26;
                this.field1850[var22] = ((this.field1850[var22] << 8) / var21 * var27 >> 8) + (var25 - arg5);
            }
        }
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
        this.field1800 = false;
    }

    @OriginalMember(owner = "client!at", name = "n", descriptor = "(III)V", line = 4297)
    public final void method768(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1881; var4++) {
            if (arg0 != 128) {
                this.field1830[var4] = this.field1830[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field1850[var4] = this.field1850[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field1820[var4] = this.field1820[var4] * arg2 >> 7;
            }
        }
        field1878++;
        this.field1800 = false;
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "l", descriptor = "()I", line = 4339)
    public final int method769() {
        if (!this.field1800) {
            this.method742(-17620);
        }
        field1796++;
        return this.field1817;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZILat;ZLat;I)Le;", line = 4352)
    private final class530 method770(boolean arg0, int arg1, class106 arg2, boolean arg3, class106 arg4, int arg5) {
        arg4.field1853 = this.field1853;
        arg4.field1868 = this.field1868;
        arg4.field1881 = this.field1881;
        arg4.field1835 = this.field1835;
        arg4.field1801 = this.field1801;
        arg4.field1805 = 0;
        arg4.field1815 = this.field1815;
        arg4.field1869 = this.field1869;
        arg4.field1808 = arg5;
        arg4.field1879 = this.field1879;
        arg4.field1880 = this.field1880;
        field1877++;
        boolean var7 = class105.method724(arg5, (byte) 89, this.field1880);
        boolean var8 = class140.method1042(arg5, 34, this.field1880);
        boolean var9 = class243.method1663(arg5, -364, this.field1880);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg4.field1830 = this.field1830;
            } else if (arg2.field1830 == null || this.field1868 > arg2.field1830.length) {
                arg4.field1830 = arg2.field1830 = new int[this.field1868];
            } else {
                arg4.field1830 = arg2.field1830;
            }
            if (!var8) {
                arg4.field1850 = this.field1850;
            } else if (arg2.field1850 == null || this.field1868 > arg2.field1850.length) {
                arg4.field1850 = arg2.field1850 = new int[this.field1868];
            } else {
                arg4.field1850 = arg2.field1850;
            }
            if (!var9) {
                arg4.field1820 = this.field1820;
            } else if (arg2.field1820 == null || this.field1868 > arg2.field1820.length) {
                arg4.field1820 = arg2.field1820 = new int[this.field1868];
            } else {
                arg4.field1820 = arg2.field1820;
            }
            for (int var11 = 0; var11 < this.field1868; var11++) {
                if (var7) {
                    arg4.field1830[var11] = this.field1830[var11];
                }
                if (var8) {
                    arg4.field1850[var11] = this.field1850[var11];
                }
                if (var9) {
                    arg4.field1820[var11] = this.field1820[var11];
                }
            }
        } else {
            arg4.field1830 = this.field1830;
            arg4.field1820 = this.field1820;
            arg4.field1850 = this.field1850;
        }
        if (class163.method1122(arg5, 16619, this.field1880)) {
            if (arg0) {
                arg4.field1805 = (byte) (arg4.field1805 | 0x1);
            }
            arg4.field1827 = arg2.field1827;
            arg4.field1827.field735 = this.field1827.field735;
            arg4.field1827.field731 = this.field1827.field731;
        } else if (class477.method2816(3, arg5, this.field1880)) {
            arg4.field1827 = this.field1827;
        } else {
            arg4.field1827 = null;
        }
        if (class270.method1802(arg5, (byte) -114, this.field1880)) {
            if (arg2.field1823 == null || this.field1869 > arg2.field1823.length) {
                arg4.field1823 = arg2.field1823 = new short[this.field1869];
            } else {
                arg4.field1823 = arg2.field1823;
            }
            for (int var12 = 0; var12 < this.field1869; var12++) {
                arg4.field1823[var12] = this.field1823[var12];
            }
        } else {
            arg4.field1823 = this.field1823;
        }
        if (class78.method571(this.field1880, arg5, (byte) -37)) {
            if (arg2.field1839 == null || arg2.field1839.length < this.field1869) {
                arg4.field1839 = arg2.field1839 = new byte[this.field1869];
            } else {
                arg4.field1839 = arg2.field1839;
            }
            for (int var13 = 0; var13 < this.field1869; var13++) {
                arg4.field1839[var13] = this.field1839[var13];
            }
        } else {
            arg4.field1839 = this.field1839;
        }
        if (class206.method1354(-2, this.field1880, arg5)) {
            arg4.field1857 = arg2.field1857;
            if (arg0) {
                arg4.field1805 = (byte) (arg4.field1805 | 0x2);
            }
            arg4.field1857.field735 = this.field1857.field735;
            arg4.field1857.field731 = this.field1857.field731;
        } else if (class446.method2682(0, this.field1880, arg5)) {
            arg4.field1857 = this.field1857;
        } else {
            arg4.field1857 = null;
        }
        if (class536.method3173(this.field1880, -1, arg5)) {
            if (arg2.field1851 == null || arg2.field1851.length < this.field1801) {
                int var14 = this.field1801;
                arg4.field1866 = arg2.field1866 = new short[var14];
                arg4.field1831 = arg2.field1831 = new short[var14];
                arg4.field1851 = arg2.field1851 = new short[var14];
            } else {
                arg4.field1831 = arg2.field1831;
                arg4.field1866 = arg2.field1866;
                arg4.field1851 = arg2.field1851;
            }
            if (this.field1834 == null) {
                for (int var18 = 0; var18 < this.field1801; var18++) {
                    arg4.field1851[var18] = this.field1851[var18];
                    arg4.field1831[var18] = this.field1831[var18];
                    arg4.field1866[var18] = this.field1866[var18];
                }
            } else {
                if (arg2.field1834 == null) {
                    arg2.field1834 = new class135();
                }
                class135 var15 = arg4.field1834 = arg2.field1834;
                if (var15.field2290 == null || var15.field2290.length < this.field1801) {
                    int var16 = this.field1801;
                    var15.field2294 = new short[var16];
                    var15.field2290 = new short[var16];
                    var15.field2289 = new short[var16];
                    var15.field2288 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field1801; var17++) {
                    arg4.field1851[var17] = this.field1851[var17];
                    arg4.field1831[var17] = this.field1831[var17];
                    arg4.field1866[var17] = this.field1866[var17];
                    var15.field2290[var17] = this.field1834.field2290[var17];
                    var15.field2294[var17] = this.field1834.field2294[var17];
                    var15.field2289[var17] = this.field1834.field2289[var17];
                    var15.field2288[var17] = this.field1834.field2288[var17];
                }
            }
            arg4.field1897 = this.field1897;
        } else {
            arg4.field1831 = this.field1831;
            arg4.field1834 = this.field1834;
            arg4.field1866 = this.field1866;
            arg4.field1897 = this.field1897;
            arg4.field1851 = this.field1851;
        }
        if (class345.method2229(this.field1880, arg5, 86)) {
            if (arg0) {
                arg4.field1805 = (byte) (arg4.field1805 | 0x4);
            }
            arg4.field1847 = arg2.field1847;
            arg4.field1847.field731 = this.field1847.field731;
            arg4.field1847.field735 = this.field1847.field735;
        } else if (class195.method1300(arg5, -116, this.field1880)) {
            arg4.field1847 = this.field1847;
        } else {
            arg4.field1847 = null;
        }
        if (class460.method2743(this.field1880, (byte) -112, arg5)) {
            if (arg2.field1860 == null || arg2.field1860.length < this.field1869) {
                int var19 = this.field1801;
                arg4.field1860 = arg2.field1860 = new float[var19];
                arg4.field1875 = arg2.field1875 = new float[var19];
            } else {
                arg4.field1860 = arg2.field1860;
                arg4.field1875 = arg2.field1875;
            }
            for (int var20 = 0; var20 < this.field1801; var20++) {
                arg4.field1860[var20] = this.field1860[var20];
                arg4.field1875[var20] = this.field1875[var20];
            }
        } else {
            arg4.field1860 = this.field1860;
            arg4.field1875 = this.field1875;
        }
        if (class378.method2397(-3469, this.field1880, arg5)) {
            arg4.field1828 = arg2.field1828;
            if (arg0) {
                arg4.field1805 = (byte) (arg4.field1805 | 0x8);
            }
            arg4.field1828.field731 = this.field1828.field731;
            arg4.field1828.field735 = this.field1828.field735;
        } else if (class250.method1695(arg5, this.field1880, (byte) -49)) {
            arg4.field1828 = this.field1828;
        } else {
            arg4.field1828 = null;
        }
        if (class440.method2655(5712, this.field1880, arg5)) {
            if (arg2.field1810 == null || this.field1869 > arg2.field1810.length) {
                int var21 = this.field1869;
                arg4.field1890 = arg2.field1890 = new short[var21];
                arg4.field1810 = arg2.field1810 = new short[var21];
                arg4.field1825 = arg2.field1825 = new short[var21];
            } else {
                arg4.field1890 = arg2.field1890;
                arg4.field1825 = arg2.field1825;
                arg4.field1810 = arg2.field1810;
            }
            for (int var22 = 0; var22 < this.field1869; var22++) {
                arg4.field1810[var22] = this.field1810[var22];
                arg4.field1890[var22] = this.field1890[var22];
                arg4.field1825[var22] = this.field1825[var22];
            }
        } else {
            arg4.field1810 = this.field1810;
            arg4.field1890 = this.field1890;
            arg4.field1825 = this.field1825;
        }
        if (class412.method2552(arg5, this.field1880, (byte) 81)) {
            arg4.field1811 = arg2.field1811;
            if (arg0) {
                arg4.field1805 = (byte) (arg4.field1805 | 0x10);
            }
            arg4.field1811.field182 = this.field1811.field182;
        } else if (class72.method515(arg5, this.field1880, -84)) {
            arg4.field1811 = this.field1811;
        } else {
            arg4.field1811 = null;
        }
        if (class229.method1588(arg5, -17634, this.field1880)) {
            if (arg2.field1812 == null || this.field1869 > arg2.field1812.length) {
                int var23 = this.field1869;
                arg4.field1812 = arg2.field1812 = new short[var23];
            } else {
                arg4.field1812 = arg2.field1812;
            }
            for (int var24 = 0; var24 < this.field1869; var24++) {
                arg4.field1812[var24] = this.field1812[var24];
            }
        } else {
            arg4.field1812 = this.field1812;
        }
        if (!class241.method1650(this.field1880, arg5, arg1 ^ 0x7839)) {
            arg4.field1814 = this.field1814;
        } else if (arg2.field1814 == null || this.field1879 > arg2.field1814.length) {
            int var26 = this.field1879;
            arg4.field1814 = arg2.field1814 = new class12[var26];
            for (int var27 = 0; var27 < this.field1879; var27++) {
                arg4.field1814[var27] = this.field1814[var27].method64(false);
            }
        } else {
            arg4.field1814 = arg2.field1814;
            for (int var25 = 0; var25 < this.field1879; var25++) {
                arg4.field1814[var25].method66(this.field1814[var25], 105);
            }
        }
        arg4.field1862 = this.field1862;
        arg4.field1885 = this.field1885;
        arg4.field1849 = this.field1849;
        if (this.field1800) {
            arg4.field1893 = this.field1893;
            arg4.field1800 = true;
            arg4.field1819 = this.field1819;
            arg4.field1817 = this.field1817;
            arg4.field1872 = this.field1872;
            arg4.field1793 = this.field1793;
            arg4.field1867 = this.field1867;
            arg4.field1795 = this.field1795;
        } else {
            arg4.field1800 = false;
        }
        arg4.field1802 = this.field1802;
        arg4.field1848 = this.field1848;
        arg4.field1840 = this.field1840;
        arg4.field1859 = this.field1859;
        arg4.field1791 = this.field1791;
        arg4.field1843 = this.field1843;
        arg4.field1798 = this.field1798;
        arg4.field1888 = this.field1888;
        if (arg1 != 30736) {
            this.method738(null, null, -42, 45);
        }
        return arg4;
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V", line = 4831)
    private final void method771(int arg0) {
        field1852++;
        if (arg0 != -22314) {
            this.field1791 = null;
        }
        if (!this.field1842) {
            return;
        }
        this.field1842 = false;
        if (this.field1885 == null && this.field1862 == null && this.field1888 == null) {
            if (this.field1830 != null && !class88.method621(this.field1808, this.field1880, -123)) {
                if (this.field1827 != null && this.field1827.field731 == null) {
                    this.field1842 = true;
                } else {
                    if (!this.field1800) {
                        this.method742(arg0 + 4694);
                    }
                    this.field1830 = null;
                }
            }
            if (this.field1850 != null && !class527.method3128(this.field1808, this.field1880, (byte) -84)) {
                if (this.field1827 != null && this.field1827.field731 == null) {
                    this.field1842 = true;
                } else {
                    if (!this.field1800) {
                        this.method742(-17620);
                    }
                    this.field1850 = null;
                }
            }
            if (this.field1820 != null && !class214.method1468(this.field1880, this.field1808, 458752)) {
                if (this.field1827 != null && this.field1827.field731 == null) {
                    this.field1842 = true;
                } else {
                    if (!this.field1800) {
                        this.method742(arg0 + 4694);
                    }
                    this.field1820 = null;
                }
            }
        }
        if (this.field1843 != null && this.field1830 == null && this.field1850 == null && this.field1820 == null) {
            this.field1843 = null;
            this.field1798 = null;
        }
        if (this.field1897 != null && !class222.method1532(this.field1808, (byte) -122, this.field1880)) {
            if (this.field1847 == null) {
                if (this.field1857 != null && this.field1857.field731 == null) {
                    this.field1842 = true;
                } else {
                    this.field1897 = null;
                    this.field1851 = this.field1831 = this.field1866 = null;
                }
            } else if (this.field1847.field731 == null) {
                this.field1842 = true;
            } else {
                this.field1897 = null;
                this.field1851 = this.field1831 = this.field1866 = null;
            }
        }
        if (this.field1823 != null && !class190.method1286(this.field1808, 31730, this.field1880)) {
            if (this.field1857 != null && this.field1857.field731 == null) {
                this.field1842 = true;
            } else {
                this.field1823 = null;
            }
        }
        if (this.field1839 != null && !class189.method1277(arg0 ^ 0xFFFFA8D6, this.field1880, this.field1808)) {
            if (this.field1857 != null && this.field1857.field731 == null) {
                this.field1842 = true;
            } else {
                this.field1839 = null;
            }
        }
        if (this.field1860 != null && !class48.method345(this.field1808, this.field1880, 0)) {
            if (this.field1828 != null && this.field1828.field731 == null) {
                this.field1842 = true;
            } else {
                this.field1860 = this.field1875 = null;
            }
        }
        if (this.field1812 != null && !class346.method2236(this.field1880, this.field1808, false)) {
            if (this.field1857 != null && this.field1857.field731 == null) {
                this.field1842 = true;
            } else {
                this.field1812 = null;
            }
        }
        if (this.field1810 != null && !class487.method2848(this.field1808, this.field1880, (byte) -115)) {
            if (this.field1811 != null && this.field1811.field182 == null || this.field1857 != null && this.field1857.field731 == null) {
                this.field1842 = true;
            } else {
                this.field1810 = this.field1890 = this.field1825 = null;
            }
        }
        if (this.field1791 != null && !class367.method2334(true, this.field1880, this.field1808)) {
            this.field1802 = null;
            this.field1791 = null;
        }
        if (this.field1848 != null && !class380.method2405((byte) -47, this.field1880, this.field1808)) {
            this.field1848 = null;
            this.field1840 = null;
        }
        if (this.field1849 != null && !class309.method1963(false, this.field1880, this.field1808)) {
            this.field1849 = null;
        }
        if (this.field1859 != null && (this.field1808 & 0x800) == 0 && (this.field1808 & 0x40000) == 0) {
            this.field1859 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Le;IIIZ)V", line = 5013)
    public final void method772(class530 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1818++;
        class106 var6 = (class106) arg0;
        if (this.field1869 == 0 || var6.field1869 == 0) {
            return;
        }
        int var7 = var6.field1881;
        int[] var8 = var6.field1830;
        int[] var9 = var6.field1850;
        int[] var10 = var6.field1820;
        short[] var11 = var6.field1851;
        short[] var12 = var6.field1831;
        short[] var13 = var6.field1866;
        byte[] var14 = var6.field1897;
        byte[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1834 == null) {
            var17 = null;
            var18 = null;
            var15 = null;
            var16 = null;
        } else {
            var15 = this.field1834.field2288;
            var16 = this.field1834.field2289;
            var17 = this.field1834.field2290;
            var18 = this.field1834.field2294;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1834 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field1834.field2290;
            var20 = var6.field1834.field2288;
            var19 = var6.field1834.field2294;
            var22 = var6.field1834.field2289;
        }
        int[] var23 = var6.field1798;
        short[] var24 = var6.field1843;
        if (!var6.field1800) {
            var6.method742(-17620);
        }
        short var25 = var6.field1867;
        short var26 = var6.field1817;
        short var27 = var6.field1872;
        short var28 = var6.field1819;
        short var29 = var6.field1795;
        short var30 = var6.field1793;
        for (int var31 = 0; var31 < this.field1881; var31++) {
            int var32 = this.field1850[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field1830[var31] - arg1;
                if (var33 >= var27 && var28 >= var33) {
                    int var34 = this.field1820[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field1798[var31];
                        int var37 = this.field1798[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1843[var38] - 1;
                            if (var35 == -1 || this.field1897[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39 + 1];
                                    int var41 = var23[var39];
                                    int var42 = -1;
                                    for (int var43 = var41; var43 < var40; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var17 == null) {
                                            this.field1834 = new class135();
                                            var17 = this.field1834.field2290 = class382.method2412(0, this.field1851);
                                            var18 = this.field1834.field2294 = class382.method2412(0, this.field1831);
                                            var16 = this.field1834.field2289 = class382.method2412(0, this.field1866);
                                            var15 = this.field1834.field2288 = class526.method3117(this.field1897, (byte) -124);
                                        }
                                        if (var21 == null) {
                                            class135 var44 = var6.field1834 = new class135();
                                            var21 = var44.field2290 = class382.method2412(0, var11);
                                            var19 = var44.field2294 = class382.method2412(0, var12);
                                            var22 = var44.field2289 = class382.method2412(0, var13);
                                            var20 = var44.field2288 = class526.method3117(var14, (byte) -123);
                                        }
                                        short var45 = this.field1851[var35];
                                        short var46 = this.field1831[var35];
                                        short var47 = this.field1866[var35];
                                        byte var48 = this.field1897[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field1798[var31];
                                        int var54 = this.field1798[var31 + 1];
                                        byte var55 = var14[var42];
                                        short var56 = var13[var42];
                                        short var57 = var11[var42];
                                        short var58 = var12[var42];
                                        for (int var59 = var53; var59 < var54; var59++) {
                                            int var60 = this.field1843[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var15[var60] != 0) {
                                                var17[var60] += var57;
                                                var18[var60] += var58;
                                                var16[var60] += var56;
                                                var15[var60] += var55;
                                            }
                                        }
                                        if (this.field1847 == null && this.field1857 != null) {
                                            this.field1857.field731 = null;
                                        }
                                        if (this.field1847 != null) {
                                            this.field1847.field731 = null;
                                        }
                                        if (var6.field1847 == null && var6.field1857 != null) {
                                            var6.field1857.field731 = null;
                                        }
                                        if (var6.field1847 != null) {
                                            var6.field1847.field731 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V", line = 5281)
    public final void method773(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1881; var4++) {
            if (arg0 != 0) {
                this.field1830[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field1850[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field1820[var4] += arg2;
            }
        }
        field1833++;
        this.field1800 = false;
        if (this.field1827 != null) {
            this.field1827.field731 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "EA", descriptor = "(Li;)Li;", line = 5312)
    public final class515 method774(class515 arg0) {
        field1821++;
        if (this.field1801 == 0) {
            return null;
        }
        if (!this.field1800) {
            this.method742(-17620);
        }
        int var2;
        int var3;
        if (this.field1864.field3703 <= 0) {
            var2 = this.field1872 - (this.field1864.field3703 * this.field1867 >> 8) >> this.field1864.field3601;
            var3 = this.field1819 - (this.field1864.field3703 * this.field1817 >> 8) >> this.field1864.field3601;
        } else {
            var2 = this.field1872 - (this.field1864.field3703 * this.field1817 >> 8) >> this.field1864.field3601;
            var3 = this.field1819 - (this.field1864.field3703 * this.field1867 >> 8) >> this.field1864.field3601;
        }
        int var4;
        int var5;
        if (this.field1864.field3643 > 0) {
            var4 = this.field1795 - (this.field1864.field3643 * this.field1817 >> 8) >> this.field1864.field3601;
            var5 = this.field1793 - (this.field1864.field3643 * this.field1867 >> 8) >> this.field1864.field3601;
        } else {
            var4 = this.field1795 - (this.field1864.field3643 * this.field1867 >> 8) >> this.field1864.field3601;
            var5 = this.field1793 - (this.field1864.field3643 * this.field1817 >> 8) >> this.field1864.field3601;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 - (var4 - 1);
        class289 var8 = (class289) arg0;
        class289 var9;
        if (var8 != null && var8.method1870(var7, 1921660432, var6)) {
            var9 = var8;
            var8.method1872((byte) 0);
        } else {
            var9 = new class289(this.field1864, var6, var7);
        }
        var9.method1873(var4, (byte) -128, var5, var3, var2);
        this.method725(var9, -112);
        return var9;
    }

    @OriginalMember(owner = "client!at", name = "h", descriptor = "()Z", line = 5376)
    public final boolean method775() {
        field1790++;
        if (this.field1848 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1868; var1++) {
            this.field1830[var1] <<= 0x4;
            this.field1850[var1] <<= 0x4;
            this.field1820[var1] <<= 0x4;
        }
        class404.field6133 = 0;
        class162.field2570 = 0;
        class251.field4294 = 0;
        return true;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IILc;Z)Z", line = 5403)
    public final boolean method776(int arg0, int arg1, class202 arg2, boolean arg3) {
        field1863++;
        class246 var5 = (class246) arg2;
        class246 var6 = this.field1864.field3685;
        float var7 = var5.field4213 * var6.field4219 + var5.field4223 * var6.field4205 + var5.field4220 * var6.field4207 + var6.field4220;
        float var8 = var5.field4213 * var6.field4211 + var5.field4223 * var6.field4235 + var5.field4220 * var6.field4216 + var6.field4223;
        class68.field1074 = var5.field4222 * var6.field4211 + var5.field4219 * var6.field4216 + var5.field4211 * var6.field4235;
        class281.field4600 = var5.field4212 * var6.field4222 + var5.field4216 * var6.field4234 + var5.field4207 * var6.field4212;
        class531.field7797 = var5.field4212 * var6.field4219 + var5.field4216 * var6.field4205 + var5.field4207 * var6.field4207;
        class128.field2212 = var5.field4222 * var6.field4222 + var5.field4219 * var6.field4212 + var5.field4211 * var6.field4234;
        class461.field6827 = var5.field4234 * var6.field4222 + var5.field4235 * var6.field4234 + var5.field4205 * var6.field4212;
        class279.field4583 = var5.field4234 * var6.field4219 + var5.field4235 * var6.field4205 + var5.field4205 * var6.field4207;
        float var9 = var5.field4213 * var6.field4222 + var5.field4223 * var6.field4234 + var5.field4220 * var6.field4212 + var6.field4213;
        class178.field2826 = var5.field4222 * var6.field4219 + var5.field4219 * var6.field4207 + var5.field4211 * var6.field4205;
        class86.field1474 = var5.field4234 * var6.field4211 + var5.field4235 * var6.field4235 + var5.field4205 * var6.field4216;
        class333.field5235 = var5.field4212 * var6.field4211 + var5.field4216 * var6.field4235 + var5.field4207 * var6.field4216;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field1864.field3636;
        int var16 = this.field1864.field3665;
        if (!this.field1800) {
            this.method742(-17620);
        }
        class134.field2287[0] = this.field1872;
        class334.field5255[0] = this.field1867;
        class139.field2323[0] = this.field1795;
        class134.field2287[1] = this.field1819;
        class334.field5255[1] = this.field1867;
        class139.field2323[1] = this.field1795;
        class134.field2287[2] = this.field1872;
        class334.field5255[2] = this.field1817;
        class134.field2287[3] = this.field1819;
        class139.field2323[2] = this.field1795;
        class334.field5255[3] = this.field1817;
        class139.field2323[3] = this.field1795;
        class134.field2287[4] = this.field1872;
        class334.field5255[4] = this.field1867;
        class134.field2287[5] = this.field1819;
        class139.field2323[4] = this.field1793;
        class334.field5255[5] = this.field1867;
        class134.field2287[6] = this.field1872;
        class139.field2323[5] = this.field1793;
        class334.field5255[6] = this.field1817;
        class139.field2323[6] = this.field1793;
        class134.field2287[7] = this.field1819;
        class334.field5255[7] = this.field1817;
        class139.field2323[7] = this.field1793;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class134.field2287[var17];
            float var39 = (float) class334.field5255[var17];
            float var40 = (float) class139.field2323[var17];
            float var41 = class128.field2212 * var40 + class461.field6827 * var39 + class281.field4600 * var38 + var9;
            float var42 = class178.field2826 * var40 + class531.field7797 * var38 + class279.field4583 * var39 + var7;
            float var43 = class68.field1074 * var40 + class86.field1474 * var39 + class333.field5235 * var38 + var8;
            if ((float) this.field1864.field3628 <= var41) {
                float var44 = (float) var15 * var42 / var41 + (float) this.field1864.field3734;
                if (var44 > var12) {
                    var12 = var44;
                }
                float var45 = (float) var16 * var43 / var41 + (float) this.field1864.field3657;
                if (var11 > var44) {
                    var11 = var44;
                }
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && var12 > (float) arg0 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field1801 > this.field1864.field3740.length) {
                this.field1864.field3740 = new int[this.field1801];
                this.field1864.field3741 = new int[this.field1801];
            }
            int[] var18 = this.field1864.field3740;
            int[] var19 = this.field1864.field3741;
            for (int var20 = 0; var20 < this.field1881; var20++) {
                float var22 = (float) this.field1830[var20];
                float var23 = (float) this.field1850[var20];
                float var24 = (float) this.field1820[var20];
                float var25 = class128.field2212 * var24 + class461.field6827 * var23 + class281.field4600 * var22 + var9;
                float var26 = class178.field2826 * var24 + class531.field7797 * var22 + class279.field4583 * var23 + var7;
                float var27 = class68.field1074 * var24 + class86.field1474 * var23 + class333.field5235 * var22 + var8;
                if (((float) this.field1864.field3628 <= var25)) {
                    int var32 = (int) ((float) var15 * var26 / var25 + (float) this.field1864.field3734);
                    int var33 = (int) ((float) var16 * var27 / var25 + (float) this.field1864.field3657);
                    int var34 = this.field1798[var20];
                    int var35 = this.field1798[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field1843[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[var37] = var32;
                        var19[var37] = var33;
                    }
                } else {
                    int var28 = this.field1798[var20];
                    int var29 = this.field1798[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field1843[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        var18[this.field1843[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field1869; var21++) {
                if (var18[this.field1810[var21]] != -999999 && var18[this.field1890[var21]] != -999999 && var18[this.field1825[var21]] != -999999 && this.method753(arg0, var19[this.field1810[var21]], var18[this.field1825[var21]], var19[this.field1825[var21]], arg1, var18[this.field1890[var21]], var19[this.field1890[var21]], var18[this.field1810[var21]], -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "()[Lgh;", line = 5629)
    public final class345[] method777() {
        field1889++;
        return this.field1885;
    }
}
