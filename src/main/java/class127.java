import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class127 extends class219 {

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    public int field1846 = 0;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "B")
    public byte field1860 = 0;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Z")
    private boolean field1841 = false;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public int field1842 = 0;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[I")
    public int[] field1824;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "[I")
    public int[] field1849;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "[I")
    public int[] field1830;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[I")
    private int[] field1821;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "[I")
    public int[] field1870;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "[I")
    public int[] field1831;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
    public int[] field1836;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "[B")
    public byte[] field1848;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "[B")
    public byte[] field1840;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "[B")
    public byte[] field1834;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "[S")
    public short[] field1851;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[S")
    public short[] field1832;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "[B")
    public byte[] field1868;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "[I")
    private int[] field1863;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "[B")
    public byte[] field1850;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "[S")
    public short[] field1871;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "[S")
    public short[] field1861;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "[S")
    public short[] field1867;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "[S")
    private short[] field1854;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "[S")
    private short[] field1857;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "[S")
    private short[] field1844;

    @OriginalMember(owner = "client!va", name = "db", descriptor = "[B")
    private byte[] field1866;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[B")
    private byte[] field1838;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "[B")
    private byte[] field1856;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "[B")
    private byte[] field1853;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "[B")
    private byte[] field1859;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[S")
    public short[] field1833;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "[S")
    public short[] field1843;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "[[I")
    public int[][] field1823;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[[I")
    public int[][] field1822;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[Lwd;")
    public class67[] field1828;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[Loh;")
    public class14[] field1837;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[Lwd;")
    public class67[] field1829;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "S")
    public short field1839;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "S")
    public short field1858;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "[I")
    private static int[] field1826 = new int[10000];

    @OriginalMember(owner = "client!va", name = "H", descriptor = "[I")
    private static int[] field1845 = class18.field261;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "[I")
    private static int[] field1852 = new int[10000];

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "[I")
    private static int[] field1865 = class18.field259;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    private static int field1862 = 0;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "S")
    private short field1825;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "S")
    private short field1827;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "S")
    private short field1835;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "S")
    private short field1855;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "S")
    private short field1864;

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "S")
    private short field1869;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()V")
    public final void method856() {
        for (int var1 = 0; var1 < this.field1842; var1++) {
            int var2 = this.field1824[var1];
            this.field1824[var1] = this.field1830[var1];
            this.field1830[var1] = -var2;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final void method857(int arg0) {
        int var2 = field1845[arg0];
        int var3 = field1865[arg0];
        for (int var4 = 0; var4 < this.field1842; var4++) {
            int var5 = this.field1830[var4] * var2 + this.field1824[var4] * var3 >> 16;
            this.field1830[var4] = this.field1830[var4] * var3 - this.field1824[var4] * var2 >> 16;
            this.field1824[var4] = var5;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()Lva;")
    public final class127 method858() {
        class127 var1 = new class127();
        if (this.field1848 != null) {
            var1.field1848 = new byte[this.field1846];
            for (int var2 = 0; var2 < this.field1846; var2++) {
                var1.field1848[var2] = this.field1848[var2];
            }
        }
        var1.field1842 = this.field1842;
        var1.field1846 = this.field1846;
        var1.field1847 = this.field1847;
        var1.field1824 = this.field1824;
        var1.field1849 = this.field1849;
        var1.field1830 = this.field1830;
        var1.field1870 = this.field1870;
        var1.field1831 = this.field1831;
        var1.field1836 = this.field1836;
        var1.field1840 = this.field1840;
        var1.field1834 = this.field1834;
        var1.field1868 = this.field1868;
        var1.field1851 = this.field1851;
        var1.field1832 = this.field1832;
        var1.field1860 = this.field1860;
        var1.field1850 = this.field1850;
        var1.field1871 = this.field1871;
        var1.field1861 = this.field1861;
        var1.field1867 = this.field1867;
        var1.field1854 = this.field1854;
        var1.field1857 = this.field1857;
        var1.field1844 = this.field1844;
        var1.field1866 = this.field1866;
        var1.field1838 = this.field1838;
        var1.field1856 = this.field1856;
        var1.field1853 = this.field1853;
        var1.field1859 = this.field1859;
        var1.field1821 = this.field1821;
        var1.field1863 = this.field1863;
        var1.field1823 = this.field1823;
        var1.field1822 = this.field1822;
        var1.field1828 = this.field1828;
        var1.field1837 = this.field1837;
        var1.field1839 = this.field1839;
        var1.field1858 = this.field1858;
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    private final void method859(int arg0) {
        int var2 = field1845[arg0];
        int var3 = field1865[arg0];
        for (int var4 = 0; var4 < this.field1842; var4++) {
            int var5 = this.field1849[var4] * var3 - this.field1830[var4] * var2 >> 16;
            this.field1830[var4] = this.field1849[var4] * var2 + this.field1830[var4] * var3 >> 16;
            this.field1849[var4] = var5;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()V")
    public final void method860() {
        for (int var1 = 0; var1 < this.field1842; var1++) {
            int var2 = this.field1830[var1];
            this.field1830[var1] = this.field1824[var1];
            this.field1824[var1] = -var2;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
    private final void method861(int arg0) {
        int var2 = field1845[arg0];
        int var3 = field1865[arg0];
        for (int var4 = 0; var4 < this.field1842; var4++) {
            int var5 = this.field1849[var4] * var2 + this.field1824[var4] * var3 >> 16;
            this.field1849[var4] = this.field1849[var4] * var3 - this.field1824[var4] * var2 >> 16;
            this.field1824[var4] = var5;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Ltk;")
    public final class219 method862(int arg0, int arg1, int arg2) {
        return this.method863(this.field1839, this.field1858, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IIIII)Lpa;")
    public final class2 method863(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class215(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()Z")
    public final boolean method864() {
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIIIJILqa;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class112 arg10) {
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "()V")
    public final void method865() {
        for (int var1 = 0; var1 < this.field1842; var1++) {
            this.field1824[var1] = -this.field1824[var1];
            this.field1830[var1] = -this.field1830[var1];
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lve;II)Lva;")
    public static final class127 method866(class233 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1538(arg1, arg2, (byte) 121);
        return var3 == null ? null : new class127(var3);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lva;IS)I")
    private final int method867(class127 arg0, int arg1, short arg2) {
        int var4 = arg0.field1824[arg1];
        int var5 = arg0.field1849[arg1];
        int var6 = arg0.field1830[arg1];
        for (int var7 = 0; var7 < this.field1842; var7++) {
            if (this.field1824[var7] == var4 && this.field1849[var7] == var5 && this.field1830[var7] == var6) {
                this.field1833[var7] |= arg2;
                return var7;
            }
        }
        this.field1824[this.field1842] = var4;
        this.field1849[this.field1842] = var5;
        this.field1830[this.field1842] = var6;
        this.field1833[this.field1842] = arg2;
        if (arg0.field1821 != null) {
            this.field1821[this.field1842] = arg0.field1821[arg1];
        }
        return this.field1842++;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(IIIII)Lf;")
    public final class215 method868(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class215(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(SS)V")
    public final void method869(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1846; var3++) {
            if (this.field1851[var3] == arg0) {
                this.field1851[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()I")
    public final int method36() {
        if (!this.field1841) {
            this.method876();
        }
        return this.field1835;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "()V")
    public final void method870() {
        if (this.field1828 != null) {
            return;
        }
        this.field1828 = new class67[this.field1842];
        for (int var1 = 0; var1 < this.field1842; var1++) {
            this.field1828[var1] = new class67();
        }
        for (int var2 = 0; var2 < this.field1846; var2++) {
            int var3 = this.field1870[var2];
            int var4 = this.field1831[var2];
            int var5 = this.field1836[var2];
            int var6 = this.field1824[var4] - this.field1824[var3];
            int var7 = this.field1849[var4] - this.field1849[var3];
            int var8 = this.field1830[var4] - this.field1830[var3];
            int var9 = this.field1824[var5] - this.field1824[var3];
            int var10 = this.field1849[var5] - this.field1849[var3];
            int var11 = this.field1830[var5] - this.field1830[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field1848 == null) {
                var19 = 0;
            } else {
                var19 = this.field1848[var2];
            }
            if (var19 == 0) {
                class67 var20 = this.field1828[var3];
                var20.field1041 += var16;
                var20.field1038 += var17;
                var20.field1052 += var18;
                var20.field1053++;
                class67 var21 = this.field1828[var4];
                var21.field1041 += var16;
                var21.field1038 += var17;
                var21.field1052 += var18;
                var21.field1053++;
                class67 var22 = this.field1828[var5];
                var22.field1041 += var16;
                var22.field1038 += var17;
                var22.field1052 += var18;
                var22.field1053++;
            } else if (var19 == 1) {
                if (this.field1837 == null) {
                    this.field1837 = new class14[this.field1846];
                }
                class14 var23 = this.field1837[var2] = new class14();
                var23.field211 = var16;
                var23.field217 = var17;
                var23.field213 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
    public final void method871(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1842; var4++) {
            this.field1824[var4] += arg0;
            this.field1849[var4] += arg1;
            this.field1830[var4] += arg2;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(SS)V")
    public final void method872(short arg0, short arg1) {
        if (this.field1832 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field1846; var3++) {
            if (this.field1832[var3] == arg0) {
                this.field1832[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(III)V")
    public final void method873(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field1845[arg2];
            int var5 = field1865[arg2];
            for (int var6 = 0; var6 < this.field1842; var6++) {
                int var7 = this.field1849[var6] * var4 + this.field1824[var6] * var5 >> 16;
                this.field1849[var6] = this.field1849[var6] * var5 - this.field1824[var6] * var4 >> 16;
                this.field1824[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field1845[arg0];
            int var9 = field1865[arg0];
            for (int var10 = 0; var10 < this.field1842; var10++) {
                int var11 = this.field1849[var10] * var9 - this.field1830[var10] * var8 >> 16;
                this.field1830[var10] = this.field1849[var10] * var8 + this.field1830[var10] * var9 >> 16;
                this.field1849[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field1845[arg1];
        int var13 = field1865[arg1];
        for (int var14 = 0; var14 < this.field1842; var14++) {
            int var15 = this.field1830[var14] * var12 + this.field1824[var14] * var13 >> 16;
            this.field1830[var14] = this.field1830[var14] * var13 - this.field1824[var14] * var12 >> 16;
            this.field1824[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(III)V")
    public final void method874(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1842; var4++) {
            this.field1824[var4] = this.field1824[var4] * arg0 / 128;
            this.field1849[var4] = this.field1849[var4] * arg1 / 128;
            this.field1830[var4] = this.field1830[var4] * arg2 / 128;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(III)I")
    public final int method875(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1842; var4++) {
            if (this.field1824[var4] == arg0 && this.field1849[var4] == arg1 && this.field1830[var4] == arg2) {
                return var4;
            }
        }
        this.field1824[this.field1842] = arg0;
        this.field1849[this.field1842] = arg1;
        this.field1830[this.field1842] = arg2;
        return this.field1842++;
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "()V")
    private final void method876() {
        if (this.field1841) {
            return;
        }
        this.field1841 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field1842; var7++) {
            int var8 = this.field1824[var7];
            int var9 = this.field1849[var7];
            int var10 = this.field1830[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field1855 = (short) var1;
        this.field1869 = (short) var4;
        this.field1835 = (short) var2;
        this.field1825 = (short) var5;
        this.field1864 = (short) var3;
        this.field1827 = (short) var6;
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "()V")
    public final void method877() {
        this.field1821 = null;
        this.field1863 = null;
        this.field1823 = null;
        this.field1822 = null;
    }

    @OriginalMember(owner = "client!va", name = "j", descriptor = "()V")
    public final void method878() {
        int var10002;
        if (this.field1821 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1842; var3++) {
                int var7 = this.field1821[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1823 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field1823[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1842) {
                int var6 = this.field1821[var5];
                this.field1823[var6][var1[var6]++] = var5++;
            }
            this.field1821 = null;
        }
        if (this.field1863 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1846; var10++) {
            int var14 = this.field1863[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field1822 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field1822[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field1846) {
            int var13 = this.field1863[var12];
            this.field1822[var13][var8[var13]++] = var12++;
        }
        this.field1863 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([B)V")
    private final void method879(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class114 var4 = new class114(arg0);
        class114 var5 = new class114(arg0);
        class114 var6 = new class114(arg0);
        class114 var7 = new class114(arg0);
        class114 var8 = new class114(arg0);
        var4.field1673 = arg0.length - 18;
        int var9 = var4.method756(-29901);
        int var10 = var4.method756(-29901);
        int var11 = var4.method760(false);
        int var12 = var4.method760(false);
        int var13 = var4.method760(false);
        int var14 = var4.method760(false);
        int var15 = var4.method760(false);
        int var16 = var4.method760(false);
        int var17 = var4.method756(-29901);
        int var18 = var4.method756(-29901);
        int var19 = var4.method756(-29901);
        int var20 = var4.method756(-29901);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1842 = var9;
        this.field1846 = var10;
        this.field1847 = var11;
        this.field1824 = new int[var9];
        this.field1849 = new int[var9];
        this.field1830 = new int[var9];
        this.field1870 = new int[var10];
        this.field1831 = new int[var10];
        this.field1836 = new int[var10];
        if (var11 > 0) {
            this.field1850 = new byte[var11];
            this.field1871 = new short[var11];
            this.field1861 = new short[var11];
            this.field1867 = new short[var11];
        }
        if (var16 == 1) {
            this.field1821 = new int[var9];
        }
        if (var12 == 1) {
            this.field1848 = new byte[var10];
            this.field1868 = new byte[var10];
            this.field1832 = new short[var10];
        }
        if (var13 == 255) {
            this.field1840 = new byte[var10];
        } else {
            this.field1860 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1834 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1863 = new int[var10];
        }
        this.field1851 = new short[var10];
        var4.field1673 = var21;
        var5.field1673 = var36;
        var6.field1673 = var38;
        var7.field1673 = var40;
        var8.field1673 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method760(false);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method736(-128);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method736(-128);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method736(-128);
            }
            this.field1824[var46] = var43 + var63;
            this.field1849[var46] = var44 + var64;
            this.field1830[var46] = var45 + var65;
            var43 = this.field1824[var46];
            var44 = this.field1849[var46];
            var45 = this.field1830[var46];
            if (var16 == 1) {
                this.field1821[var46] = var8.method760(false);
            }
        }
        var4.field1673 = var32;
        var5.field1673 = var28;
        var6.field1673 = var26;
        var7.field1673 = var30;
        var8.field1673 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field1851[var47] = (short) var4.method756(-29901);
            if (var12 == 1) {
                int var61 = var5.method760(false);
                if ((var61 & 0x1) == 1) {
                    this.field1848[var47] = 1;
                    var2 = true;
                } else {
                    this.field1848[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field1868[var47] = (byte) (var61 >> 2);
                    this.field1832[var47] = this.field1851[var47];
                    this.field1851[var47] = 127;
                    if (this.field1832[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1868[var47] = -1;
                    this.field1832[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1840[var47] = var6.method741(3083);
            }
            if (var14 == 1) {
                this.field1834[var47] = var7.method741(3083);
            }
            if (var15 == 1) {
                this.field1863[var47] = var8.method760(false);
            }
        }
        var4.field1673 = var25;
        var5.field1673 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method760(false);
            if (var57 == 1) {
                var48 = var4.method736(-128) + var51;
                var49 = var4.method736(-128) + var48;
                var50 = var4.method736(-128) + var49;
                var51 = var50;
                this.field1870[var52] = var48;
                this.field1831[var52] = var49;
                this.field1836[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method736(-128) + var51;
                var51 = var50;
                this.field1870[var52] = var48;
                this.field1831[var52] = var49;
                this.field1836[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method736(-128) + var51;
                var51 = var50;
                this.field1870[var52] = var48;
                this.field1831[var52] = var49;
                this.field1836[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method736(-128) + var51;
                var51 = var50;
                this.field1870[var52] = var48;
                this.field1831[var52] = var60;
                this.field1836[var52] = var50;
            }
        }
        var4.field1673 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field1850[var53] = 0;
            this.field1871[var53] = (short) var4.method756(-29901);
            this.field1861[var53] = (short) var4.method756(-29901);
            this.field1867[var53] = (short) var4.method756(-29901);
        }
        if (this.field1868 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field1868[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field1871[var56] & 0xFFFF) == this.field1870[var55] && (this.field1861[var56] & 0xFFFF) == this.field1831[var55] && (this.field1867[var56] & 0xFFFF) == this.field1836[var55]) {
                        this.field1868[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1868 = null;
            }
        }
        if (!var3) {
            this.field1832 = null;
        }
        if (!var2) {
            this.field1848 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBSB)I")
    public final int method880(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field1870[this.field1846] = arg0;
        this.field1831[this.field1846] = arg1;
        this.field1836[this.field1846] = arg2;
        this.field1848[this.field1846] = arg3;
        this.field1868[this.field1846] = -1;
        this.field1851[this.field1846] = arg4;
        this.field1832[this.field1846] = -1;
        this.field1834[this.field1846] = arg5;
        return this.field1846++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II[[I[[IIIIZZ)Lva;")
    public final class127 method881(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method876();
        int var10 = this.field1855 + arg4;
        int var11 = this.field1869 + arg4;
        int var12 = this.field1864 + arg6;
        int var13 = this.field1827 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class127 var18;
        if (arg7) {
            var18 = new class127();
            var18.field1842 = this.field1842;
            var18.field1846 = this.field1846;
            var18.field1847 = this.field1847;
            var18.field1870 = this.field1870;
            var18.field1831 = this.field1831;
            var18.field1836 = this.field1836;
            var18.field1848 = this.field1848;
            var18.field1840 = this.field1840;
            var18.field1834 = this.field1834;
            var18.field1868 = this.field1868;
            var18.field1851 = this.field1851;
            var18.field1832 = this.field1832;
            var18.field1860 = this.field1860;
            var18.field1850 = this.field1850;
            var18.field1871 = this.field1871;
            var18.field1861 = this.field1861;
            var18.field1867 = this.field1867;
            var18.field1854 = this.field1854;
            var18.field1857 = this.field1857;
            var18.field1844 = this.field1844;
            var18.field1866 = this.field1866;
            var18.field1838 = this.field1838;
            var18.field1856 = this.field1856;
            var18.field1853 = this.field1853;
            var18.field1859 = this.field1859;
            var18.field1821 = this.field1821;
            var18.field1863 = this.field1863;
            var18.field1823 = this.field1823;
            var18.field1822 = this.field1822;
            var18.field1839 = this.field1839;
            var18.field1858 = this.field1858;
            var18.field1828 = this.field1828;
            var18.field1837 = this.field1837;
            var18.field1829 = this.field1829;
            if (arg0 == 3) {
                var18.field1824 = class272.method1828(-14305, this.field1824);
                var18.field1849 = class272.method1828(-14305, this.field1849);
                var18.field1830 = class272.method1828(-14305, this.field1830);
            } else {
                var18.field1824 = this.field1824;
                var18.field1849 = new int[var18.field1842];
                var18.field1830 = this.field1830;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field1842; var19++) {
                int var20 = this.field1824[var19] + arg4;
                int var21 = this.field1830[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field1849[var19] = this.field1849[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field1842; var29++) {
                int var30 = (this.field1849[var29] << 16) / this.field1835;
                if (var30 < arg1) {
                    int var31 = this.field1824[var29] + arg4;
                    int var32 = this.field1830[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field1849[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field1849[var29];
                } else {
                    var18.field1849[var29] = this.field1849[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method888(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field1825 - this.field1835;
            for (int var43 = 0; var43 < this.field1842; var43++) {
                int var44 = this.field1824[var43] + arg4;
                int var45 = this.field1830[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field1849[var43] = var52 + this.field1849[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field1825 - this.field1835;
            for (int var54 = 0; var54 < this.field1842; var54++) {
                int var55 = this.field1824[var54] + arg4;
                int var56 = this.field1830[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field1849[var54] = ((this.field1849[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method882();
        } else {
            this.field1841 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!va", name = "k", descriptor = "()V")
    private final void method882() {
        this.field1828 = null;
        this.field1829 = null;
        this.field1837 = null;
        this.field1841 = false;
    }

    @OriginalMember(owner = "client!va", name = "l", descriptor = "()V")
    public final void method883() {
        for (int var1 = 0; var1 < this.field1842; var1++) {
            this.field1830[var1] = -this.field1830[var1];
        }
        for (int var2 = 0; var2 < this.field1846; var2++) {
            int var3 = this.field1870[var2];
            this.field1870[var2] = this.field1836[var2];
            this.field1836[var2] = var3;
        }
        this.method882();
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ltk;IIIZ)V")
    public final void method884(class219 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class127 var6 = (class127) arg0;
        var6.method876();
        var6.method870();
        field1862++;
        int var7 = 0;
        int[] var8 = var6.field1824;
        int var9 = var6.field1842;
        for (int var10 = 0; var10 < this.field1842; var10++) {
            class67 var13 = this.field1828[var10];
            if (var13.field1053 != 0) {
                int var14 = this.field1849[var10] - arg2;
                if (var14 >= var6.field1835 && var14 <= var6.field1825) {
                    int var15 = this.field1824[var10] - arg1;
                    if (var15 >= var6.field1855 && var15 <= var6.field1869) {
                        int var16 = this.field1830[var10] - arg3;
                        if (var16 >= var6.field1864 && var16 <= var6.field1827) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class67 var18 = var6.field1828[var17];
                                if (var8[var17] == var15 && var6.field1830[var17] == var16 && var6.field1849[var17] == var14 && var18.field1053 != 0) {
                                    if (this.field1829 == null) {
                                        this.field1829 = new class67[this.field1842];
                                    }
                                    if (var6.field1829 == null) {
                                        var6.field1829 = new class67[var9];
                                    }
                                    class67 var19 = this.field1829[var10];
                                    if (var19 == null) {
                                        var19 = this.field1829[var10] = new class67(var13);
                                    }
                                    class67 var20 = var6.field1829[var17];
                                    if (var20 == null) {
                                        var20 = var6.field1829[var17] = new class67(var18);
                                    }
                                    var19.field1041 += var18.field1041;
                                    var19.field1038 += var18.field1038;
                                    var19.field1052 += var18.field1052;
                                    var19.field1053 += var18.field1053;
                                    var20.field1041 += var13.field1041;
                                    var20.field1038 += var13.field1038;
                                    var20.field1052 += var13.field1052;
                                    var20.field1053 += var13.field1053;
                                    var7++;
                                    field1852[var10] = field1862;
                                    field1826[var17] = field1862;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field1846; var11++) {
            if (field1852[this.field1870[var11]] == field1862 && field1852[this.field1831[var11]] == field1862 && field1852[this.field1836[var11]] == field1862) {
                if (this.field1848 == null) {
                    this.field1848 = new byte[this.field1846];
                }
                this.field1848[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field1846; var12++) {
            if (field1826[var6.field1870[var12]] == field1862 && field1826[var6.field1831[var12]] == field1862 && field1826[var6.field1836[var12]] == field1862) {
                if (var6.field1848 == null) {
                    var6.field1848 = new byte[var6.field1846];
                }
                var6.field1848[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "([B)V")
    private final void method885(byte[] arg0) {
        class114 var2 = new class114(arg0);
        class114 var3 = new class114(arg0);
        class114 var4 = new class114(arg0);
        class114 var5 = new class114(arg0);
        class114 var6 = new class114(arg0);
        class114 var7 = new class114(arg0);
        class114 var8 = new class114(arg0);
        var2.field1673 = arg0.length - 23;
        int var9 = var2.method756(-29901);
        int var10 = var2.method756(-29901);
        int var11 = var2.method760(false);
        int var12 = var2.method760(false);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method760(false);
        int var16 = var2.method760(false);
        int var17 = var2.method760(false);
        int var18 = var2.method760(false);
        int var19 = var2.method760(false);
        int var20 = var2.method756(-29901);
        int var21 = var2.method756(-29901);
        int var22 = var2.method756(-29901);
        int var23 = var2.method756(-29901);
        int var24 = var2.method756(-29901);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field1850 = new byte[var11];
            var2.field1673 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field1850[var28] = var2.method741(3083);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field1842 = var9;
        this.field1846 = var10;
        this.field1847 = var11;
        this.field1824 = new int[var9];
        this.field1849 = new int[var9];
        this.field1830 = new int[var9];
        this.field1870 = new int[var10];
        this.field1831 = new int[var10];
        this.field1836 = new int[var10];
        if (var19 == 1) {
            this.field1821 = new int[var9];
        }
        if (var13) {
            this.field1848 = new byte[var10];
        }
        if (var15 == 255) {
            this.field1840 = new byte[var10];
        } else {
            this.field1860 = (byte) var15;
        }
        if (var16 == 1) {
            this.field1834 = new byte[var10];
        }
        if (var17 == 1) {
            this.field1863 = new int[var10];
        }
        if (var18 == 1) {
            this.field1832 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field1868 = new byte[var10];
        }
        this.field1851 = new short[var10];
        if (var11 > 0) {
            this.field1871 = new short[var11];
            this.field1861 = new short[var11];
            this.field1867 = new short[var11];
            if (var26 > 0) {
                this.field1854 = new short[var26];
                this.field1857 = new short[var26];
                this.field1844 = new short[var26];
                this.field1866 = new byte[var26];
                this.field1838 = new byte[var26];
                this.field1856 = new byte[var26];
            }
            if (var27 > 0) {
                this.field1853 = new byte[var27];
                this.field1859 = new byte[var27];
            }
        }
        var2.field1673 = var11;
        var3.field1673 = var46;
        var4.field1673 = var48;
        var5.field1673 = var50;
        var6.field1673 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method760(false);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method736(-128);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method736(-128);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method736(-128);
            }
            this.field1824[var69] = var66 + var85;
            this.field1849[var69] = var67 + var86;
            this.field1830[var69] = var68 + var87;
            var66 = this.field1824[var69];
            var67 = this.field1849[var69];
            var68 = this.field1830[var69];
            if (var19 == 1) {
                this.field1821[var69] = var6.method760(false);
            }
        }
        var2.field1673 = var44;
        var3.field1673 = var33;
        var4.field1673 = var36;
        var5.field1673 = var39;
        var6.field1673 = var37;
        var7.field1673 = var42;
        var8.field1673 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field1851[var70] = (short) var2.method756(-29901);
            if (var13) {
                this.field1848[var70] = var3.method741(3083);
            }
            if (var15 == 255) {
                this.field1840[var70] = var4.method741(3083);
            }
            if (var16 == 1) {
                this.field1834[var70] = var5.method741(3083);
            }
            if (var17 == 1) {
                this.field1863[var70] = var6.method760(false);
            }
            if (var18 == 1) {
                this.field1832[var70] = (short) (var7.method756(-29901) - 1);
            }
            if (this.field1868 != null) {
                if (this.field1832[var70] == -1) {
                    this.field1868[var70] = -1;
                } else {
                    this.field1868[var70] = (byte) (var8.method760(false) - 1);
                }
            }
        }
        var2.field1673 = var35;
        var3.field1673 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method760(false);
            if (var80 == 1) {
                var71 = var2.method736(-128) + var74;
                var72 = var2.method736(-128) + var71;
                var73 = var2.method736(-128) + var72;
                var74 = var73;
                this.field1870[var75] = var71;
                this.field1831[var75] = var72;
                this.field1836[var75] = var73;
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method736(-128) + var74;
                var74 = var73;
                this.field1870[var75] = var71;
                this.field1831[var75] = var72;
                this.field1836[var75] = var73;
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method736(-128) + var74;
                var74 = var73;
                this.field1870[var75] = var71;
                this.field1831[var75] = var72;
                this.field1836[var75] = var73;
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method736(-128) + var74;
                var74 = var73;
                this.field1870[var75] = var71;
                this.field1831[var75] = var83;
                this.field1836[var75] = var73;
            }
        }
        var2.field1673 = var52;
        var3.field1673 = var54;
        var4.field1673 = var56;
        var5.field1673 = var58;
        var6.field1673 = var60;
        var7.field1673 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field1850[var76] & 0xFF;
            if (var79 == 0) {
                this.field1871[var76] = (short) var2.method756(-29901);
                this.field1861[var76] = (short) var2.method756(-29901);
                this.field1867[var76] = (short) var2.method756(-29901);
            }
            if (var79 == 1) {
                this.field1871[var76] = (short) var3.method756(-29901);
                this.field1861[var76] = (short) var3.method756(-29901);
                this.field1867[var76] = (short) var3.method756(-29901);
                this.field1854[var76] = (short) var4.method756(-29901);
                this.field1857[var76] = (short) var4.method756(-29901);
                this.field1844[var76] = (short) var4.method756(-29901);
                this.field1866[var76] = var5.method741(3083);
                this.field1838[var76] = var6.method741(3083);
                this.field1856[var76] = var7.method741(3083);
            }
            if (var79 == 2) {
                this.field1871[var76] = (short) var3.method756(-29901);
                this.field1861[var76] = (short) var3.method756(-29901);
                this.field1867[var76] = (short) var3.method756(-29901);
                this.field1854[var76] = (short) var4.method756(-29901);
                this.field1857[var76] = (short) var4.method756(-29901);
                this.field1844[var76] = (short) var4.method756(-29901);
                this.field1866[var76] = var5.method741(3083);
                this.field1838[var76] = var6.method741(3083);
                this.field1856[var76] = var7.method741(3083);
                this.field1853[var76] = var7.method741(3083);
                this.field1859[var76] = var7.method741(3083);
            }
            if (var79 == 3) {
                this.field1871[var76] = (short) var3.method756(-29901);
                this.field1861[var76] = (short) var3.method756(-29901);
                this.field1867[var76] = (short) var3.method756(-29901);
                this.field1854[var76] = (short) var4.method756(-29901);
                this.field1857[var76] = (short) var4.method756(-29901);
                this.field1844[var76] = (short) var4.method756(-29901);
                this.field1866[var76] = var5.method741(3083);
                this.field1838[var76] = var6.method741(3083);
                this.field1856[var76] = var7.method741(3083);
            }
        }
        if (!var14) {
            return;
        }
        var2.field1673 = var64;
        int var77 = var2.method760(false);
        if (var77 > 0) {
            var2.field1673 += var77 * 4;
        }
        int var78 = var2.method760(false);
        if (var78 > 0) {
            var2.field1673 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!va", name = "m", descriptor = "()V")
    public static void method886() {
        field1852 = null;
        field1826 = null;
        field1845 = null;
        field1865 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([[III)I")
    private static final int method887(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([[IIIIII)V")
    private final void method888(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method887(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method887(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method887(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method887(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method859(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method861(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method871(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
    private class127() {
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([B)V")
    private class127(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method885(arg0);
        } else {
            this.method879(arg0);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(III)V")
    public class127(int arg0, int arg1, int arg2) {
        this.field1824 = new int[arg0];
        this.field1849 = new int[arg0];
        this.field1830 = new int[arg0];
        this.field1821 = new int[arg0];
        this.field1870 = new int[arg1];
        this.field1831 = new int[arg1];
        this.field1836 = new int[arg1];
        this.field1848 = new byte[arg1];
        this.field1840 = new byte[arg1];
        this.field1834 = new byte[arg1];
        this.field1851 = new short[arg1];
        this.field1832 = new short[arg1];
        this.field1868 = new byte[arg1];
        this.field1863 = new int[arg1];
        if (arg2 > 0) {
            this.field1850 = new byte[arg2];
            this.field1871 = new short[arg2];
            this.field1861 = new short[arg2];
            this.field1867 = new short[arg2];
            this.field1854 = new short[arg2];
            this.field1857 = new short[arg2];
            this.field1844 = new short[arg2];
            this.field1866 = new byte[arg2];
            this.field1838 = new byte[arg2];
            this.field1856 = new byte[arg2];
            this.field1853 = new byte[arg2];
            this.field1859 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "([Lva;I)V")
    public class127(class127[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1842 = 0;
        this.field1846 = 0;
        this.field1847 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field1860 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class127 var20 = arg0[var11];
            if (var20 != null) {
                this.field1842 += var20.field1842;
                this.field1846 += var20.field1846;
                this.field1847 += var20.field1847;
                if (var20.field1840 == null) {
                    if (this.field1860 == -1) {
                        this.field1860 = var20.field1860;
                    }
                    if (this.field1860 != var20.field1860) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var20.field1848 != null;
                var5 |= var20.field1834 != null;
                var6 |= var20.field1863 != null;
                var7 |= var20.field1832 != null;
                var8 |= var20.field1868 != null;
            }
        }
        this.field1824 = new int[this.field1842];
        this.field1849 = new int[this.field1842];
        this.field1830 = new int[this.field1842];
        this.field1821 = new int[this.field1842];
        this.field1833 = new short[this.field1842];
        this.field1870 = new int[this.field1846];
        this.field1831 = new int[this.field1846];
        this.field1836 = new int[this.field1846];
        if (var3) {
            this.field1848 = new byte[this.field1846];
        }
        if (var4) {
            this.field1840 = new byte[this.field1846];
        }
        if (var5) {
            this.field1834 = new byte[this.field1846];
        }
        if (var6) {
            this.field1863 = new int[this.field1846];
        }
        if (var7) {
            this.field1832 = new short[this.field1846];
        }
        if (var8) {
            this.field1868 = new byte[this.field1846];
        }
        this.field1851 = new short[this.field1846];
        this.field1843 = new short[this.field1846];
        if (this.field1847 > 0) {
            this.field1850 = new byte[this.field1847];
            this.field1871 = new short[this.field1847];
            this.field1861 = new short[this.field1847];
            this.field1867 = new short[this.field1847];
            this.field1854 = new short[this.field1847];
            this.field1857 = new short[this.field1847];
            this.field1844 = new short[this.field1847];
            this.field1866 = new byte[this.field1847];
            this.field1838 = new byte[this.field1847];
            this.field1856 = new byte[this.field1847];
            this.field1853 = new byte[this.field1847];
            this.field1859 = new byte[this.field1847];
        }
        this.field1842 = 0;
        this.field1846 = 0;
        this.field1847 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var15 = (short) (0x1 << var14);
            class127 var16 = arg0[var14];
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field1846; var17++) {
                    if (var3 && var16.field1848 != null) {
                        this.field1848[this.field1846] = var16.field1848[var17];
                    }
                    if (var4) {
                        if (var16.field1840 == null) {
                            this.field1840[this.field1846] = var16.field1860;
                        } else {
                            this.field1840[this.field1846] = var16.field1840[var17];
                        }
                    }
                    if (var5 && var16.field1834 != null) {
                        this.field1834[this.field1846] = var16.field1834[var17];
                    }
                    if (var6 && var16.field1863 != null) {
                        this.field1863[this.field1846] = var16.field1863[var17];
                    }
                    if (var7) {
                        if (var16.field1832 == null) {
                            this.field1832[this.field1846] = -1;
                        } else {
                            this.field1832[this.field1846] = var16.field1832[var17];
                        }
                    }
                    if (var8) {
                        if (var16.field1868 == null || var16.field1868[var17] == -1) {
                            this.field1868[this.field1846] = -1;
                        } else {
                            this.field1868[this.field1846] = (byte) (var16.field1868[var17] + this.field1847);
                        }
                    }
                    this.field1851[this.field1846] = var16.field1851[var17];
                    this.field1843[this.field1846] = var15;
                    this.field1870[this.field1846] = this.method867(var16, var16.field1870[var17], var15);
                    this.field1831[this.field1846] = this.method867(var16, var16.field1831[var17], var15);
                    this.field1836[this.field1846] = this.method867(var16, var16.field1836[var17], var15);
                    this.field1846++;
                }
                for (int var18 = 0; var18 < var16.field1847; var18++) {
                    byte var19 = this.field1850[this.field1847] = var16.field1850[var18];
                    if (var19 == 0) {
                        this.field1871[this.field1847] = (short) this.method867(var16, var16.field1871[var18], var15);
                        this.field1861[this.field1847] = (short) this.method867(var16, var16.field1861[var18], var15);
                        this.field1867[this.field1847] = (short) this.method867(var16, var16.field1867[var18], var15);
                    }
                    if (var19 >= 1 && var19 <= 3) {
                        this.field1871[this.field1847] = var16.field1871[var18];
                        this.field1861[this.field1847] = var16.field1861[var18];
                        this.field1867[this.field1847] = var16.field1867[var18];
                        this.field1854[this.field1847] = var16.field1854[var18];
                        this.field1857[this.field1847] = var16.field1857[var18];
                        this.field1844[this.field1847] = var16.field1844[var18];
                        this.field1866[this.field1847] = var16.field1866[var18];
                        this.field1838[this.field1847] = var16.field1838[var18];
                        this.field1856[this.field1847] = var16.field1856[var18];
                    }
                    if (var19 == 2) {
                        this.field1853[this.field1847] = var16.field1853[var18];
                        this.field1859[this.field1847] = var16.field1859[var18];
                    }
                    this.field1847++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lva;ZZZZ)V")
    public class127(class127 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1842 = arg0.field1842;
        this.field1846 = arg0.field1846;
        this.field1847 = arg0.field1847;
        if (arg1) {
            this.field1824 = arg0.field1824;
            this.field1849 = arg0.field1849;
            this.field1830 = arg0.field1830;
        } else {
            this.field1824 = new int[this.field1842];
            this.field1849 = new int[this.field1842];
            this.field1830 = new int[this.field1842];
            for (int var6 = 0; var6 < this.field1842; var6++) {
                this.field1824[var6] = arg0.field1824[var6];
                this.field1849[var6] = arg0.field1849[var6];
                this.field1830[var6] = arg0.field1830[var6];
            }
        }
        if (arg2) {
            this.field1851 = arg0.field1851;
        } else {
            this.field1851 = new short[this.field1846];
            for (int var7 = 0; var7 < this.field1846; var7++) {
                this.field1851[var7] = arg0.field1851[var7];
            }
        }
        if (arg3 || arg0.field1832 == null) {
            this.field1832 = arg0.field1832;
        } else {
            this.field1832 = new short[this.field1846];
            for (int var8 = 0; var8 < this.field1846; var8++) {
                this.field1832[var8] = arg0.field1832[var8];
            }
        }
        if (arg4) {
            this.field1834 = arg0.field1834;
        } else {
            this.field1834 = new byte[this.field1846];
            if (arg0.field1834 == null) {
                for (int var9 = 0; var9 < this.field1846; var9++) {
                    this.field1834[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1846; var10++) {
                    this.field1834[var10] = arg0.field1834[var10];
                }
            }
        }
        this.field1870 = arg0.field1870;
        this.field1831 = arg0.field1831;
        this.field1836 = arg0.field1836;
        this.field1848 = arg0.field1848;
        this.field1840 = arg0.field1840;
        this.field1868 = arg0.field1868;
        this.field1860 = arg0.field1860;
        this.field1850 = arg0.field1850;
        this.field1871 = arg0.field1871;
        this.field1861 = arg0.field1861;
        this.field1867 = arg0.field1867;
        this.field1854 = arg0.field1854;
        this.field1857 = arg0.field1857;
        this.field1844 = arg0.field1844;
        this.field1866 = arg0.field1866;
        this.field1838 = arg0.field1838;
        this.field1856 = arg0.field1856;
        this.field1853 = arg0.field1853;
        this.field1859 = arg0.field1859;
        this.field1821 = arg0.field1821;
        this.field1863 = arg0.field1863;
        this.field1823 = arg0.field1823;
        this.field1822 = arg0.field1822;
        this.field1828 = arg0.field1828;
        this.field1837 = arg0.field1837;
        this.field1829 = arg0.field1829;
        this.field1839 = arg0.field1839;
        this.field1858 = arg0.field1858;
    }
}
