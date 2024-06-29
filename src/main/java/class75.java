import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 implements class19 {

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "Z")
    private boolean field1906 = true;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lmc;")
    public static class75 field1868 = class30.method234(true, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lmc;")
    public static class75 field1877 = class30.method234(true, "rot:");

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Lmc;")
    public static class75 field1891 = class30.method234(true, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lmc;")
    public static class75 field1895 = class30.method234(true, "redstone2");

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1867 = 128;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[Z")
    public static boolean[] field1881 = new boolean[5];

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "[[I")
    public static int[][] field1882 = new int[104][104];

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Z")
    public static boolean field1894 = false;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "Lmc;")
    public static class75 field1908 = class30.method234(true, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field1893 = 127;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public int field1869;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    private int field1903;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "Lnc;")
    public static class81 field1899;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field1917;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "[B")
    public byte[] field1912;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public static int[] field1866;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method658(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)I", line = 3)
    private final int method620(int arg0, int arg1, byte arg2) {
        field1898++;
        byte var4 = (byte) arg1;
        if (arg2 != 91) {
            field1893 = -84;
        }
        for (int var5 = arg0; var5 < this.field1869; var5++) {
            if (this.field1912[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I", line = 29)
    public final int method621(int arg0) {
        field1892++;
        if (arg0 != -19198) {
            this.method628(7, -104);
        }
        return this.field1869;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILmc;)Lmc;", line = 41)
    public final class75 method622(int arg0, int arg1, class75 arg2) {
        field1862++;
        if (!this.field1906) {
            throw new IllegalArgumentException();
        } else if (arg0 > this.field1869) {
            throw new IllegalArgumentException();
        } else {
            this.field1903 = 0;
            if (arg2.field1869 + arg0 > this.field1912.length) {
                int var4;
                for (var4 = 1; var4 < arg2.field1869 + arg0; var4 += var4) {
                }
                byte[] var5 = new byte[var4];
                class53.method407(this.field1912, 0, var5, 0, this.field1869);
                this.field1912 = var5;
            }
            if (arg1 != 27642) {
                field1893 = -128;
            }
            class53.method407(arg2.field1912, 0, this.field1912, arg0, arg2.field1869);
            if (this.field1869 < arg2.field1869 + arg0) {
                this.field1869 = arg2.field1869 + arg0;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lmc;", line = 91)
    public final class75 method623(int arg0) {
        field1902++;
        long var2 = this.method642(0);
        synchronized (field1917 == null ? (field1917 = method658("mc")) : field1917) {
            if (class12.field236 == null) {
                class12.field236 = new class74(4096);
            } else {
                for (class5 var5 = (class5) class12.field236.method614(arg0 - 19417, var2); var5 != null; var5 = (class5) class12.field236.method611(-1)) {
                    if (this.method635(var5.field67, arg0 ^ 0x323)) {
                        return var5.field67;
                    }
                }
            }
            if (arg0 != 19374) {
                return null;
            }
            class5 var8 = new class5();
            var8.field67 = this;
            this.field1906 = false;
            class12.field236.method613(-1, var2, var8);
            return this;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)I", line = 134)
    public final int method624(int arg0, byte arg1) {
        int var3 = 50 % ((63 - arg1) / 63);
        field1900++;
        return this.method620(0, arg0, (byte) 91);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lmc;", line = 146)
    public final class75 method625(boolean arg0) {
        field1914++;
        class75 var2 = new class75();
        boolean var3 = true;
        if (arg0) {
            field1894 = false;
        }
        var2.field1869 = this.field1869;
        var2.field1912 = new byte[this.field1869];
        for (int var4 = 0; var4 < this.field1869; var4++) {
            byte var5 = this.field1912[var4];
            if (var5 >= 97 && var5 <= 122 || var5 >= -32 && var5 <= -2 && var5 != -9) {
                if (var3) {
                    var5 = (byte) (var5 - 32);
                }
                var3 = false;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (!var3) {
                    var5 = (byte) (var5 + 32);
                }
                var3 = false;
            }
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var3 = true;
            }
            var2.field1912[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmc;B)Z", line = 197)
    public final boolean method626(class75 arg0, byte arg1) {
        field1913++;
        if (arg0.field1869 > this.field1869) {
            return false;
        }
        int var3 = this.field1869 - arg0.field1869;
        if (arg1 <= 19) {
            field1894 = false;
        }
        for (int var4 = 0; var4 < arg0.field1869; var4++) {
            if (this.field1912[var3 + var4] != arg0.field1912[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lvb;ILjava/awt/Component;)V", line = 224)
    public static final void method627(class124 arg0, int arg1, Component arg2) {
        field1905++;
        try {
            class113 var3 = (class113) Class.forName("ca").getDeclaredConstructor().newInstance();
            var3.method915(arg0, 2048);
            class52.field1321 = var3;
        } catch (Throwable var6) {
            try {
                class52.field1321 = new class103(arg0, arg2);
            } catch (Throwable var5) {
                if (arg1 <= class124.field3032.toLowerCase().indexOf("microsoft")) {
                    try {
                        class52.field1321 = new class83();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class52.field1321 = new class38(8000);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Z", line = 284)
    private final boolean method628(int arg0, int arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var3 = 38 % ((arg1 - 29) / 55);
        boolean var4 = false;
        boolean var5 = false;
        field1863++;
        int var6 = 0;
        for (int var7 = 0; var7 < this.field1869; var7++) {
            int var8 = this.field1912[var7] & 0xFF;
            if (var7 == 0) {
                if (var8 == 45) {
                    var5 = true;
                    continue;
                }
                if (var8 == 43) {
                    continue;
                }
            }
            if (var8 >= 48 && var8 <= 57) {
                var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
                var8 -= 55;
            } else if (var8 >= 97 && var8 <= 122) {
                var8 -= 87;
            } else {
                return false;
            }
            if (arg0 <= var8) {
                return false;
            }
            if (var5) {
                var8 = -var8;
            }
            int var9 = arg0 * var6 + var8;
            if (var9 / arg0 != var6) {
                return false;
            }
            var6 = var9;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lja;ILja;)V", line = 359)
    public static final void method629(class55 arg0, int arg1, class55 arg2) {
        field1873++;
        class31.field691 = arg2;
        if (arg1 != -3677) {
            field1894 = true;
        }
        class85.field2085 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Lmc;", line = 380)
    public final class75 method630(byte arg0) {
        field1910++;
        class75 var2 = new class75();
        if (arg0 != -22) {
            this.method632(-61);
        }
        var2.field1869 = this.field1869;
        var2.field1912 = new byte[this.field1869];
        for (int var3 = 0; var3 < this.field1869; var3++) {
            byte var4 = this.field1912[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1912[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Lmc;", line = 421)
    public final class75 method631(int arg0) {
        class75 var2 = new class75();
        var2.field1869 = this.field1869;
        var2.field1912 = new byte[this.field1869];
        field1897++;
        for (int var3 = arg0; var3 < this.field1869; var3++) {
            var2.field1912[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lmc;", line = 441)
    public final class75 method632(int arg0) {
        class75 var2 = new class75();
        field1885++;
        var2.field1869 = 0;
        var2.field1912 = new byte[12];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1869; var4++) {
            if (this.field1912[var4] >= 65 && this.field1912[var4] <= 90) {
                var2.field1912[var3++] = (byte) (this.field1912[var4] + 97 - 65);
                var2.field1869 = var3;
            } else if (this.field1912[var4] >= 97 && this.field1912[var4] <= 122 || this.field1912[var4] >= 48 && this.field1912[var4] <= 57) {
                var2.field1912[var3++] = this.field1912[var4];
                var2.field1869 = var3;
            } else if (var3 > 0) {
                var2.field1912[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        if (arg0 != -30765) {
            field1908 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)Z", line = 492)
    public final boolean method633(int arg0) {
        field1880++;
        if (arg0 != 10) {
            field1908 = null;
        }
        return this.method628(10, arg0 ^ 0xFFFFFFEB);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmc;I)Z", line = 509)
    public final boolean method634(class75 arg0, int arg1) {
        field1916++;
        if (arg0 == null) {
            return false;
        } else if (arg1 != 1) {
            return true;
        } else if (this.field1869 == arg0.field1869) {
            for (int var3 = 0; var3 < this.field1869; var3++) {
                byte var4 = this.field1912[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field1912[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lmc;I)Z", line = 560)
    public final boolean method635(class75 arg0, int arg1) {
        field1904++;
        if (arg0 == null) {
            return false;
        } else if (this.field1869 == arg0.field1869) {
            if (!this.field1906 || !arg0.field1906) {
                if (this.field1903 == 0) {
                    this.field1903 = this.method641(53);
                    if (this.field1903 == 0) {
                        this.field1903 = 1;
                    }
                }
                if (arg0.field1903 == 0) {
                    arg0.field1903 = arg0.method641(90);
                    if (arg0.field1903 == 0) {
                        arg0.field1903 = 1;
                    }
                }
                if (this.field1903 != arg0.field1903) {
                    return false;
                }
            }
            if (arg1 != 18573) {
                return false;
            }
            for (int var3 = 0; var3 < this.field1869; var3++) {
                if (this.field1912[var3] != arg0.field1912[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;", line = 615)
    public final String toString() {
        field1886++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)[B", line = 625)
    public final byte[] method636(int arg0) {
        if (arg0 == -18729) {
            field1861++;
            byte[] var2 = new byte[this.field1869];
            class53.method407(this.field1912, 0, var2, 0, this.field1869);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)Lmc;", line = 640)
    public final class75 method637(int arg0) {
        field1909++;
        int var2 = this.field1869;
        int var3;
        for (var3 = 0; var3 < this.field1869 && this.field1912[var3] >= 0 && (this.field1912[var3] <= 32 || this.field1912[var3] == 160); var3++) {
        }
        while (var3 < var2 && this.field1912[var2 - 1] >= 0 && (this.field1912[var2 - 1] <= 32 || this.field1912[var2 - 1] == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field1869 == var2) {
            return this;
        }
        class75 var4 = new class75();
        var4.field1869 = var2 - var3;
        var4.field1912 = new byte[var4.field1869];
        for (int var5 = 0; var5 < var4.field1869; var5++) {
            var4.field1912[var5] = this.field1912[var3 + var5];
        }
        if (arg0 != 90) {
            this.field1906 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V", line = 684)
    public static void method638(byte arg0) {
        field1895 = null;
        field1881 = null;
        field1891 = null;
        field1868 = null;
        if (arg0 <= 3) {
            method627(null, -65, null);
        }
        field1877 = null;
        field1866 = null;
        field1908 = null;
        field1882 = null;
        field1899 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmc;IZ)I", line = 721)
    private final int method639(class75 arg0, int arg1, boolean arg2) {
        int[] var4 = new int[arg0.field1869];
        field1870++;
        if (arg2) {
            return -17;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field1869];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg0.field1869;
        }
        for (int var8 = 1; var8 <= arg0.field1869; var8++) {
            var4[var8 - 1] = (arg0.field1869 << 1) - var8;
            var5[class56.method456(255, arg0.field1912[var8 - 1])] = arg0.field1869 - var8;
        }
        int var9 = arg0.field1869 + 1;
        int var10 = arg0.field1869;
        while (var10 > 0) {
            var6[var10 - 1] = var9;
            while (arg0.field1869 >= var9 && arg0.field1912[var9 - 1] != arg0.field1912[var10 - 1]) {
                if (arg0.field1869 - var10 <= var4[var9 - 1]) {
                    var4[var9 - 1] = arg0.field1869 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var10--;
            var9--;
        }
        int var11 = var9;
        int var12 = arg0.field1869 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        int var15 = 1;
        while (var15 <= var12) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field1912[var14 - 1] != arg0.field1912[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var15++;
            var14++;
        }
        while (var11 < arg0.field1869) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if (var4[var18 - 1] >= arg0.field1869 + var11 - var18) {
                    var4[var18 - 1] = arg0.field1869 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 + -1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg1 + arg0.field1869 - 1; var16 < this.field1869; var16 += Math.max(var5[this.field1912[var16] & 0xFF], var4[var17])) {
            for (var17 = arg0.field1869 - 1; var17 >= 0 && this.field1912[var16] == arg0.field1912[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)I", line = 842)
    public final int method640(int arg0) {
        int var2 = -88 % ((arg0 - 59) / 46);
        field1911++;
        return this.method648(false, 10);
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)I", line = 861)
    public final int method641(int arg0) {
        field1896++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1869; var3++) {
            var2 = (this.field1912[var3] & 0xFF) + (var2 << 5) - var2;
        }
        if (arg0 <= 46) {
            this.method649(-56, 104);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 892)
    public final boolean equals(Object arg0) {
        field1888++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)J", line = 916)
    private final long method642(int arg0) {
        field1876++;
        long var2 = (long) arg0;
        for (int var4 = 0; var4 < this.field1869; var4++) {
            var2 = (var2 << 5) + (long) (this.field1912[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "hashCode", descriptor = "()I", line = 933)
    public final int hashCode() {
        field1907++;
        return this.method641(113);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)J", line = 941)
    public final long method643(boolean arg0) {
        field1890++;
        long var2 = 0L;
        if (!arg0) {
            this.field1906 = false;
        }
        for (int var4 = 0; var4 < this.field1869 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field1912[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 + 1 - 97;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 - 21;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lmc;I)I", line = 980)
    public final int method644(class75 arg0, int arg1) {
        if (arg1 != 0) {
            field1895 = null;
        }
        field1878++;
        return this.method639(arg0, 0, false);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)Lmc;", line = 991)
    public final class75 method645(int arg0, byte arg1) {
        field1865++;
        return arg1 == 110 ? this.method647(0, arg0, this.field1869) : null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lmc;", line = 1004)
    public final class75 method646(byte arg0, int arg1) {
        field1875++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class75 var3 = new class75();
        var3.field1912 = new byte[this.field1869 + 1];
        var3.field1869 = this.field1869 + 1;
        if (arg0 > -36) {
            this.method631(-82);
        }
        class53.method407(this.field1912, 0, var3.field1912, 0, this.field1869);
        var3.field1912[this.field1869] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lmc;", line = 1026)
    public final class75 method647(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method646((byte) 59, -115);
        }
        class75 var4 = new class75();
        var4.field1869 = arg2 - arg1;
        field1860++;
        var4.field1912 = new byte[arg2 - arg1];
        class53.method407(this.field1912, arg1, var4.field1912, 0, var4.field1869);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I", line = 1042)
    private final int method648(boolean arg0, int arg1) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        field1915++;
        boolean var3 = arg0;
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1869; var6++) {
            int var7 = this.field1912[var6] & 0xFF;
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
                throw new NumberFormatException();
            }
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var4 = true;
            var5 = var8;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Lmc;", line = 1116)
    public final class75 method649(int arg0, int arg1) {
        field1879++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field1906) {
            this.field1903 = 0;
            if (this.field1912.length == this.field1869) {
                int var3;
                for (var3 = 1; var3 <= this.field1869; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class53.method407(this.field1912, 0, var4, 0, this.field1869);
                this.field1912 = var4;
            }
            if (arg0 <= 79) {
                return null;
            } else {
                this.field1912[this.field1869++] = (byte) arg1;
                return this;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "(I)Lmc;", line = 1163)
    public final class75 method650(int arg0) {
        field1889++;
        if (!this.field1906) {
            throw new IllegalArgumentException();
        }
        this.field1903 = arg0;
        if (this.field1912.length != this.field1869) {
            byte[] var2 = new byte[this.field1869];
            class53.method407(this.field1912, 0, var2, 0, this.field1869);
            this.field1912 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 1192)
    public final void method651(Graphics arg0, int arg1, int arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field1912, 0, this.field1869, "ISO-8859-1");
            if (arg3 != 5038) {
                this.method622(54, 71, null);
            }
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1912, 0, this.field1869);
        }
        field1901++;
        arg0.drawString(var5, arg1, arg2);
    }

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "(I)Lmc;", line = 1217)
    public final class75 method652(int arg0) {
        field1887++;
        if (arg0 != 1) {
            return null;
        }
        boolean var2 = true;
        class75 var3 = new class75();
        var3.field1869 = this.field1869;
        var3.field1912 = new byte[this.field1869];
        for (int var4 = 0; var4 < this.field1869; var4++) {
            byte var5 = this.field1912[var4];
            if (var5 == 95) {
                var2 = true;
                var3.field1912[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field1912[var4] = (byte) (var5 - 32);
            } else {
                var3.field1912[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BIII)I", line = 1273)
    public final int method653(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        class53.method407(this.field1912, arg0, arg1, arg3, arg4 - arg0);
        if (arg2 != -66) {
            this.method623(-97);
        }
        field1883++;
        return arg4 - arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILmc;)Lmc;", line = 1298)
    public final class75 method654(int arg0, class75 arg1) {
        field1864++;
        if (!this.field1906) {
            throw new IllegalArgumentException();
        }
        this.field1903 = 0;
        if (this.field1869 + arg1.field1869 > this.field1912.length) {
            int var3;
            for (var3 = 1; var3 < this.field1869 + arg1.field1869; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class53.method407(this.field1912, 0, var4, 0, this.field1869);
            this.field1912 = var4;
        }
        class53.method407(arg1.field1912, 0, this.field1912, this.field1869, arg1.field1869);
        this.field1869 += arg1.field1869;
        if (arg0 != 13) {
            this.hashCode();
        }
        return this;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lmc;I)Z", line = 1335)
    public final boolean method655(class75 arg0, int arg1) {
        field1871++;
        if (this.field1869 < arg0.field1869) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field1869; var3++) {
            if (this.field1912[var3] != arg0.field1912[var3]) {
                return false;
            }
        }
        if (arg1 > -108) {
            field1866 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(ZI)I", line = 1360)
    public final int method656(boolean arg0, int arg1) {
        if (arg0) {
            field1884++;
            return this.field1912[arg1] & 0xFF;
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 1373)
    public final int method657(int arg0, FontMetrics arg1) {
        field1874++;
        String var3;
        try {
            var3 = new String(this.field1912, arg0, this.field1869, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1912, 0, this.field1869);
        }
        return arg1.stringWidth(var3);
    }
}
