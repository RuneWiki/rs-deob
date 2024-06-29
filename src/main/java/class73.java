import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class73 implements class135 {

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Z")
    private boolean field1853 = true;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
    public static int[] field1845 = new int[32];

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "Lkd;")
    public static class73 field1897;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "[[B")
    public static byte[][] field1898;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "Lkd;")
    private static class73 field1900;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "[Z")
    public static boolean[] field1895;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "Lkd;")
    public static class73 field1894;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "Lkd;")
    private static class73 field1903;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "Lkd;")
    public static class73 field1896;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "Lkd;")
    public static class73 field1893;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lkd;")
    public static class73 field1899;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field1847;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public int field1880;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lr;")
    public static class118 field1901;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "Lha;")
    public static class50 field1891;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field1904;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "[B")
    public byte[] field1858;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Lkd;")
    public final class73 method605(int arg0) {
        field1887++;
        if (!this.field1853) {
            throw new IllegalArgumentException();
        }
        if (arg0 < 31) {
            field1899 = null;
        }
        this.field1847 = 0;
        if (this.field1858.length != this.field1880) {
            byte[] var2 = new byte[this.field1880];
            class128.method1077(this.field1858, 0, var2, 0, this.field1880);
            this.field1858 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)J")
    private final long method606(int arg0) {
        long var2 = 0L;
        if (arg0 > -39) {
            return -52L;
        }
        for (int var4 = 0; var4 < this.field1880; var4++) {
            var2 = (var2 << 5) + (long) (this.field1858[var4] & 0xFF) - var2;
        }
        field1848++;
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lkd;")
    public final class73 method607(byte arg0, int arg1) {
        field1881++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class73 var3 = new class73();
        var3.field1858 = new byte[this.field1880 + 1];
        var3.field1880 = this.field1880 + 1;
        if (arg0 > -7) {
            this.method605(74);
        }
        class128.method1077(this.field1858, 0, var3.field1858, 0, this.field1880);
        var3.field1858[this.field1880] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Lkd;")
    public final class73 method608(int arg0) {
        field1869++;
        class73 var2 = new class73();
        var2.field1880 = this.field1880;
        var2.field1858 = new byte[this.field1880];
        if (arg0 != -24240) {
            return null;
        }
        for (int var3 = 0; var3 < this.field1880; var3++) {
            byte var4 = this.field1858[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1858[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Lkd;")
    public final class73 method609(byte arg0) {
        class73 var2 = new class73();
        field1883++;
        var2.field1858 = new byte[12];
        var2.field1880 = 0;
        if (arg0 != -107) {
            this.method618((byte) -59);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1880; var4++) {
            if (this.field1858[var4] >= 65 && this.field1858[var4] <= 90) {
                var2.field1858[var3++] = (byte) (this.field1858[var4] + 97 - 65);
                var2.field1880 = var3;
            } else if (this.field1858[var4] >= 97 && this.field1858[var4] <= 122 || this.field1858[var4] >= 48 && this.field1858[var4] <= 57) {
                var2.field1858[var3++] = this.field1858[var4];
                var2.field1880 = var3;
            } else if (var3 > 0) {
                var2.field1858[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Lkd;")
    public final class73 method610(int arg0) {
        field1867++;
        class73 var2 = new class73();
        var2.field1880 = this.field1880;
        boolean var3 = true;
        var2.field1858 = new byte[this.field1880];
        for (int var4 = 0; var4 < this.field1880; var4++) {
            byte var6 = this.field1858[var4];
            if (var6 == 95) {
                var3 = true;
                var2.field1858[var4] = 32;
            } else if (var6 >= 97 && var6 <= 122 && var3) {
                var2.field1858[var4] = (byte) (var6 - 32);
                var3 = false;
            } else {
                var2.field1858[var4] = var6;
                var3 = false;
            }
        }
        int var5 = 90 % ((arg0 - 88) / 37);
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Lkd;")
    public final class73 method611(byte arg0) {
        if (arg0 < 11) {
            this.method632((byte) 18);
        }
        field1865++;
        long var2 = this.method606(-83);
        synchronized (field1904 == null ? (field1904 = method644("kd")) : field1904) {
            if (class143.field3567 == null) {
                class143.field3567 = new class131(4096);
            } else {
                for (class87 var5 = (class87) class143.field3567.method1099(114, var2); var5 != null; var5 = (class87) class143.field3567.method1101(15241)) {
                    if (this.method616(-42, var5.field2191)) {
                        return var5.field2191;
                    }
                }
            }
            class87 var7 = new class87();
            this.field1853 = false;
            var7.field2191 = this;
            class143.field3567.method1093((byte) 84, var7, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)[B")
    public final byte[] method612(int arg0) {
        field1875++;
        if (arg0 != 4) {
            this.method634((byte) 7);
        }
        byte[] var2 = new byte[this.field1880];
        class128.method1077(this.field1858, 0, var2, 0, this.field1880);
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILkd;)I")
    private final int method613(int arg0, int arg1, class73 arg2) {
        field1871++;
        int[] var4 = new int[arg2.field1880];
        int[] var5 = new int[arg2.field1880];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg2.field1880;
        }
        if (arg0 != 12416) {
            field1903 = null;
        }
        for (int var8 = 1; var8 <= arg2.field1880; var8++) {
            var4[var8 - 1] = (arg2.field1880 << 1) - var8;
            var6[class149.method1189(arg2.field1858[var8 - 1], 255)] = arg2.field1880 - var8;
        }
        int var9 = arg2.field1880 + 1;
        for (int var10 = arg2.field1880; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (var9 <= arg2.field1880 && arg2.field1858[var9 - 1] != arg2.field1858[var10 - 1]) {
                if (var4[var9 - 1] >= arg2.field1880 - var10) {
                    var4[var9 - 1] = arg2.field1880 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg2.field1880 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg2.field1858[var14 - 1] != arg2.field1858[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var14++;
        }
        while (arg2.field1880 > var11) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (arg2.field1880 + var11 - var18 <= var4[var18 - 1]) {
                    var4[var18 - 1] = arg2.field1880 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var5[var12 - 1];
            var12 = var5[var12 - 1];
        }
        int var17;
        for (int var16 = arg2.field1880 + arg1 - 1; var16 < this.field1880; var16 += Math.max(var6[this.field1858[var16] & 0xFF], var4[var17])) {
            for (var17 = arg2.field1880 - 1; var17 >= 0 && this.field1858[var16] == arg2.field1858[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)Ljava/net/URL;")
    public final URL method614(int arg0) throws MalformedURLException {
        field1864++;
        return arg0 < 119 ? null : new URL(new String(this.field1858, 0, this.field1880));
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lkd;I)Z")
    public final boolean method615(class73 arg0, int arg1) {
        field1888++;
        if (arg0 == null) {
            return false;
        } else if (this.field1880 == arg0.field1880) {
            for (int var3 = 0; var3 < this.field1880; var3++) {
                byte var4 = this.field1858[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field1858[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 != 60) {
                this.method616(123, null);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILkd;)Z")
    public final boolean method616(int arg0, class73 arg1) {
        field1889++;
        if (arg1 == null) {
            return false;
        } else if (this.field1880 == arg1.field1880) {
            if (arg0 > -27) {
                field1900 = null;
            }
            if (!this.field1853 || !arg1.field1853) {
                if (this.field1847 == 0) {
                    this.field1847 = this.method634((byte) -88);
                    if (this.field1847 == 0) {
                        this.field1847 = 1;
                    }
                }
                if (arg1.field1847 == 0) {
                    arg1.field1847 = arg1.method634((byte) -116);
                    if (arg1.field1847 == 0) {
                        arg1.field1847 = 1;
                    }
                }
                if (this.field1847 != arg1.field1847) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1880; var3++) {
                if (this.field1858[var3] != arg1.field1858[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)I")
    public final int method617(int arg0, boolean arg1) {
        if (arg1) {
            this.method628(null, -25);
        }
        field1866++;
        return this.method621(arg0, 19348, 0);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I")
    public final int method618(byte arg0) {
        field1874++;
        if (arg0 < 124) {
            field1891 = null;
        }
        return this.method629(false, 10);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII[B)I")
    public final int method619(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        if (arg3 <= 117) {
            this.field1858 = null;
        }
        class128.method1077(this.field1858, arg1, arg4, arg2, arg0 - arg1);
        field1846++;
        return arg0 - arg1;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)Z")
    private final boolean method620(int arg0, boolean arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        field1854++;
        int var4 = 0;
        boolean var5 = arg1;
        for (int var6 = 0; var6 < this.field1880; var6++) {
            int var7 = this.field1858[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                return false;
            }
            var5 = true;
            var4 = var8;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    private final int method621(int arg0, int arg1, int arg2) {
        byte var4 = (byte) arg0;
        field1868++;
        if (arg1 != 19348) {
            return 36;
        }
        for (int var5 = arg2; var5 < this.field1880; var5++) {
            if (this.field1858[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Lkd;")
    public final class73 method622(boolean arg0) {
        class73 var2 = new class73();
        field1873++;
        var2.field1880 = this.field1880;
        var2.field1858 = new byte[this.field1880];
        int var3 = 0;
        if (!arg0) {
            return null;
        }
        while (var3 < this.field1880) {
            var2.field1858[var3] = 42;
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1876++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILkd;)I")
    public final int method623(int arg0, class73 arg1) {
        if (arg0 != -1893532698) {
            this.field1880 = 52;
        }
        field1856++;
        return this.method613(12416, 0, arg1);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IZ)I")
    public final int method624(int arg0, boolean arg1) {
        if (arg1) {
            return -42;
        } else {
            field1863++;
            return this.field1858[arg0] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)Lkd;")
    public final class73 method625(byte arg0) {
        if (arg0 != 16) {
            this.method612(83);
        }
        byte var2 = 2;
        class73 var3 = new class73();
        field1878++;
        var3.field1880 = this.field1880;
        var3.field1858 = new byte[this.field1880];
        for (int var4 = 0; var4 < this.field1880; var4++) {
            byte var5 = this.field1858[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field1858[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLkd;)Lkd;")
    public final class73 method626(byte arg0, class73 arg1) {
        field1877++;
        if (!this.field1853) {
            throw new IllegalArgumentException();
        }
        this.field1847 = 0;
        if (this.field1858.length < this.field1880 + arg1.field1880) {
            int var3;
            for (var3 = 1; var3 < this.field1880 + arg1.field1880; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class128.method1077(this.field1858, 0, var4, 0, this.field1880);
            this.field1858 = var4;
        }
        int var5 = -110 % ((20 - arg0) / 44);
        class128.method1077(arg1.field1858, 0, this.field1858, this.field1880, arg1.field1880);
        this.field1880 += arg1.field1880;
        return this;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(ILkd;)Z")
    public final boolean method627(int arg0, class73 arg1) {
        field1890++;
        if (this.field1880 < arg1.field1880) {
            return false;
        }
        if (arg0 != 2858) {
            field1900 = null;
        }
        int var3 = this.field1880 - arg1.field1880;
        for (int var4 = 0; var4 < arg1.field1880; var4++) {
            if (this.field1858[var4 + var3] != arg1.field1858[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field1872++;
        if (!(arg0 instanceof class73)) {
            throw new IllegalArgumentException();
        }
        return this.method616(-101, (class73) arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/FontMetrics;I)I")
    public final int method628(FontMetrics arg0, int arg1) {
        field1884++;
        if (arg1 != 57) {
            this.method609((byte) 98);
        }
        String var3;
        try {
            var3 = new String(this.field1858, 0, this.field1880, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1858, 0, this.field1880);
        }
        return arg0.stringWidth(var3);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)I")
    public final int method629(boolean arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1879++;
        boolean var3 = false;
        boolean var4 = arg0;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1880; var6++) {
            int var7 = this.field1858[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var4 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var4) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var3 = true;
        }
        if (!var3) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Lkd;")
    public final class73 method630(int arg0, int arg1, int arg2) {
        field1852++;
        class73 var4 = new class73();
        var4.field1880 = arg0 - arg1;
        var4.field1858 = new byte[arg0 - arg1];
        class128.method1077(this.field1858, arg1, var4.field1858, 0, var4.field1880);
        if (arg2 != -24023) {
            field1896 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
    public static void method631(byte arg0) {
        field1897 = null;
        field1894 = null;
        field1901 = null;
        field1893 = null;
        field1899 = null;
        field1898 = null;
        field1845 = null;
        field1891 = null;
        field1896 = null;
        field1895 = null;
        field1903 = null;
        field1900 = null;
        if (arg0 != -67) {
            method631((byte) -28);
        }
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)I")
    public final int method632(byte arg0) {
        field1870++;
        if (arg0 > -48) {
            field1892 = -36;
        }
        return this.field1880;
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)V")
    public static final void method633(byte arg0) {
        field1855++;
        class50.field1340.method534((byte) 11);
        if (arg0 != 38) {
            method631((byte) -116);
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)I")
    public final int method634(byte arg0) {
        field1859++;
        int var2 = -34 % ((arg0 - 31) / 56);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1880; var4++) {
            var3 = (this.field1858[var4] & 0xFF) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field1886++;
        return this.method634((byte) -63);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method635(int arg0, Graphics arg1, int arg2, boolean arg3) {
        field1861++;
        String var5;
        try {
            if (!arg3) {
                field1892 = -126;
            }
            var5 = new String(this.field1858, 0, this.field1880, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1858, 0, this.field1880);
        }
        arg1.drawString(var5, arg2, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Z")
    public final boolean method636(int arg0) {
        if (arg0 == 10) {
            field1849++;
            return this.method620(10, false);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lkd;B)I")
    public final int method637(class73 arg0, byte arg1) {
        field1860++;
        if (arg1 != 53) {
            return 69;
        }
        int var3;
        if (this.field1880 <= arg0.field1880) {
            var3 = this.field1880;
        } else {
            var3 = arg0.field1880;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field1858[var4] & 0xFF) > (this.field1858[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field1858[var4] & 0xFF) < (this.field1858[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field1880 < arg0.field1880) {
            return -1;
        } else if (arg0.field1880 < this.field1880) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lkd;")
    public final class73 method638(int arg0, int arg1) {
        field1850++;
        int var3 = -108 % ((77 - arg1) / 47);
        return this.method630(this.field1880, arg0, -24023);
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(ILkd;)I")
    public final int method639(int arg0, class73 arg1) {
        int var3;
        if (this.field1880 <= arg1.field1880) {
            var3 = this.field1880;
        } else {
            var3 = arg1.field1880;
        }
        field1862++;
        int var4 = 37 % ((arg0 - 49) / 56);
        for (int var5 = 0; var5 < var3; var5++) {
            if (class86.field2185[this.field1858[var5] & 0xFF] < class86.field2185[arg1.field1858[var5] & 0xFF]) {
                return -1;
            }
            if (class86.field2185[arg1.field1858[var5] & 0xFF] < class86.field2185[this.field1858[var5] & 0xFF]) {
                return 1;
            }
        }
        if (this.field1880 < arg1.field1880) {
            return -1;
        } else if (this.field1880 > arg1.field1880) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)Lkd;")
    public final class73 method640(int arg0) {
        field1857++;
        int var2;
        for (var2 = 0; var2 < this.field1880 && (this.field1858[var2] >= 0 && this.field1858[var2] <= 32 || (this.field1858[var2] & 0xFF) == 160); var2++) {
        }
        int var3;
        for (var3 = this.field1880; var2 < var3 && (this.field1858[var3 - 1] >= 0 && this.field1858[var3 - 1] <= 32 || (this.field1858[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field1880 == var3) {
            return this;
        }
        class73 var4 = new class73();
        var4.field1880 = var3 - var2;
        var4.field1858 = new byte[var4.field1880];
        int var5 = 0;
        if (arg0 != -123) {
            field1897 = null;
        }
        while (var5 < var4.field1880) {
            var4.field1858[var5] = this.field1858[var2 + var5];
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)Lkd;")
    public final class73 method641(int arg0, byte arg1) {
        field1851++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg0);
        } else if (this.field1853) {
            this.field1847 = 0;
            int var3 = -38 % ((arg1 + 57) / 57);
            if (this.field1858.length == this.field1880) {
                int var4;
                for (var4 = 1; var4 <= this.field1880; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class128.method1077(this.field1858, 0, var5, 0, this.field1880);
                this.field1858 = var5;
            }
            this.field1858[this.field1880++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(ILkd;)Z")
    public final boolean method642(int arg0, class73 arg1) {
        field1882++;
        if (arg1.field1880 > this.field1880) {
            return false;
        }
        int var3 = -70 / ((21 - arg0) / 45);
        for (int var4 = 0; var4 < arg1.field1880; var4++) {
            if (this.field1858[var4] != arg1.field1858[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)J")
    public final long method643(int arg0) {
        field1885++;
        long var2 = 0L;
        for (int var4 = 0; this.field1880 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1858[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        if (arg0 == 255) {
            while (var2 % 37L == 0L && var2 != 0L) {
                var2 /= 37L;
            }
            return var2;
        } else {
            return 15L;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method644(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1845[var1] = var0 - 1;
            var0 += var0;
        }
        field1897 = class126.method1070((byte) -66, "::qa_op_test");
        field1898 = new byte[50][];
        field1900 = class126.method1070((byte) -66, "yellow:");
        field1895 = new boolean[112];
        field1894 = field1900;
        field1903 = class126.method1070((byte) -66, "Loaded config");
        field1902 = 1;
        field1896 = field1900;
        field1893 = class126.method1070((byte) -66, "Regelversto-8 melden");
        field1899 = field1903;
        field1892 = 0;
    }
}
