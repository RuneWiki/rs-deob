import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 implements class23 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
    private boolean field1864 = true;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Z")
    public static boolean field1880 = false;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lo;")
    public static class84 field1872 = class15.method124(" is already on your ignore list", 255);

    @OriginalMember(owner = "client!o", name = "G", descriptor = "Lo;")
    public static class84 field1896 = class15.method124("New User", 255);

    @OriginalMember(owner = "client!o", name = "O", descriptor = "Lo;")
    public static class84 field1904 = class15.method124("Close", 255);

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field1901 = 2;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lo;")
    public static class84 field1866 = class15.method124(" has logged in)3", 255);

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Lo;")
    public static class84 field1915 = class15.method124("Accept challenge @whi@", 255);

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lo;")
    public static class84 field1879 = class15.method124("Imported music", 255);

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
    public static boolean field1892 = false;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    public static int field1916 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!o", name = "cb", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!o", name = "db", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!o", name = "eb", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lud;")
    public static class118 field1898;

    // $FF: synthetic field
    @OriginalMember(owner = "client!o", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field1922;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[B")
    public byte[] field1869;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "[I")
    public static int[] field1895;

    // $FF: synthetic method
    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method671(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)J", line = 10)
    private final long method634(int arg0) {
        field1900++;
        long var2 = 0L;
        if (arg0 == 27263) {
            for (int var4 = 0; var4 < this.field1906; var4++) {
                var2 = (var2 << 5) + (long) (this.field1869[var4] & 0xFF) - var2;
            }
            return var2;
        } else {
            return 99L;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Lo;", line = 31)
    public final class84 method635(int arg0) {
        field1881++;
        long var2 = this.method634(27263);
        synchronized (field1922 == null ? (field1922 = method671("o")) : field1922) {
            if (arg0 > -42) {
                return null;
            }
            if (class38.field752 == null) {
                class38.field752 = new class8(4096);
            } else {
                for (class40 var6 = (class40) class38.field752.method66(126, var2); var6 != null; var6 = (class40) class38.field752.method58(-1)) {
                    if (this.method654(-10, var6.field819)) {
                        return var6.field819;
                    }
                }
            }
            class40 var8 = new class40();
            this.field1864 = false;
            var8.field819 = this;
            class38.field752.method71(123, var8, var2);
            return this;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Lo;", line = 73)
    public final class84 method636(byte arg0) {
        field1890++;
        if (arg0 != 29) {
            field1915 = null;
        }
        class84 var2 = new class84();
        boolean var3 = true;
        var2.field1906 = this.field1906;
        var2.field1869 = new byte[this.field1906];
        for (int var4 = 0; var4 < this.field1906; var4++) {
            byte var5 = this.field1869[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
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
            var2.field1869[var4] = var5;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lo;", line = 126)
    public final class84 method637(boolean arg0) {
        field1899++;
        class84 var2 = new class84();
        boolean var3 = arg0;
        var2.field1906 = this.field1906;
        var2.field1869 = new byte[this.field1906];
        for (int var4 = 0; var4 < this.field1906; var4++) {
            byte var5 = this.field1869[var4];
            if (var5 == 95) {
                var3 = true;
                var2.field1869[var4] = 32;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field1869[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field1869[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lo;I)Z", line = 173)
    public final boolean method638(class84 arg0, int arg1) {
        field1870++;
        if (this.field1906 < arg0.field1906) {
            return false;
        }
        if (arg1 <= 48) {
            method667((byte) -2);
        }
        for (int var3 = 0; var3 < arg0.field1906; var3++) {
            if (this.field1869[var3] != arg0.field1869[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I", line = 198)
    public final int method639(int arg0) {
        int var2 = 107 / ((arg0 - 83) / 36);
        field1921++;
        return this.field1906;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 209)
    public static void method640(int arg0) {
        field1895 = null;
        field1904 = null;
        field1896 = null;
        field1879 = null;
        if (arg0 < 0) {
            method663(-66, 63, 120);
        }
        field1915 = null;
        field1872 = null;
        field1866 = null;
        field1898 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Z", line = 229)
    private final boolean method641(int arg0, byte arg1) {
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field1867++;
        boolean var3 = false;
        if (arg1 >= -11) {
            return false;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1906; var6++) {
            int var7 = this.field1869[var6] & 0xFF;
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
            if (arg0 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var5 = var8;
            var4 = true;
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lo;", line = 301)
    public static final class84 method642(int arg0, int arg1) {
        int var2 = -92 / ((-arg1 - 6) / 51);
        field1877++;
        if (arg0 < 100000) {
            return class62.method489(arg0, (byte) -128);
        } else if (arg0 < 10000000) {
            return class97.method746(0, new class84[] { class62.method489(arg0 / 1000, (byte) -128), class116.field2524 });
        } else {
            return class97.method746(0, new class84[] { class62.method489(arg0 / 1000000, (byte) -124), class28.field551 });
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)I", line = 322)
    private final int method643(int arg0, boolean arg1) {
        field1917++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var3 = false;
        int var4 = 0;
        if (!arg1) {
            method642(27, 84);
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field1906; var6++) {
            int var7 = this.field1869[var6] & 0xFF;
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
            if (var7 >= arg0) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)I", line = 414)
    public final int method644(boolean arg0, int arg1) {
        field1873++;
        return arg0 ? -41 : this.field1869[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Lo;", line = 430)
    public final class84 method645(int arg0) {
        field1912++;
        class84 var2 = new class84();
        int var3 = 0;
        var2.field1906 = 0;
        var2.field1869 = new byte[12];
        if (arg0 <= 110) {
            this.field1906 = -31;
        }
        for (int var4 = 0; var4 < this.field1906; var4++) {
            if (this.field1869[var4] >= 65 && this.field1869[var4] <= 90) {
                var2.field1869[var3++] = (byte) (this.field1869[var4] + 97 - 65);
                var2.field1906 = var3;
            } else if (this.field1869[var4] >= 97 && this.field1869[var4] <= 122 || this.field1869[var4] >= 48 && this.field1869[var4] <= 57) {
                var2.field1869[var3++] = this.field1869[var4];
                var2.field1906 = var3;
            } else if (var3 > 0) {
                var2.field1869[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)Z", line = 477)
    public final boolean method646(int arg0) {
        if (arg0 > -71) {
            return true;
        } else {
            field1874++;
            return this.method641(10, (byte) -30);
        }
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)Lo;", line = 494)
    public final class84 method647(int arg0) {
        if (arg0 != 63) {
            this.method655(-120, 49);
        }
        field1894++;
        class84 var2 = new class84();
        var2.field1906 = this.field1906;
        var2.field1869 = new byte[this.field1906];
        for (int var3 = 0; var3 < this.field1906; var3++) {
            var2.field1869[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)Lo;", line = 529)
    public final class84 method648(byte arg0) {
        if (arg0 != 12) {
            this.method634(-81);
        }
        field1885++;
        int var2 = this.field1906;
        int var3;
        for (var3 = 0; var3 < this.field1906 && this.field1869[var3] >= 0 && this.field1869[var3] <= 32; var3++) {
        }
        while (var2 > var3 && this.field1869[var2 - 1] >= 0 && this.field1869[var2 - 1] <= 32) {
            var2--;
        }
        class84 var4 = new class84();
        var4.field1906 = var2 - var3;
        var4.field1869 = new byte[var4.field1906];
        for (int var5 = 0; var5 < var4.field1906; var5++) {
            var4.field1869[var5] = this.field1869[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)J", line = 564)
    public final long method649(byte arg0) {
        if (arg0 >= -124) {
            field1904 = null;
        }
        long var2 = 0L;
        for (int var4 = 0; this.field1906 > var4 && var4 < 12; var4++) {
            byte var5 = this.field1869[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 + 1 - 65;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        field1884++;
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lo;", line = 607)
    public final class84 method650(int arg0, int arg1, int arg2) {
        field1886++;
        class84 var4 = new class84();
        var4.field1906 = arg0 - arg2;
        var4.field1869 = new byte[arg0 - arg2];
        class68.method518(this.field1869, arg2, var4.field1869, 0, var4.field1906);
        if (arg1 != -32) {
            this.method656(-13, 100, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!o", name = "hashCode", descriptor = "()I", line = 624)
    public final int hashCode() {
        field1887++;
        return this.method660(115);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I", line = 634)
    public final int method651(byte arg0, FontMetrics arg1) {
        if (arg0 <= 64) {
            return 37;
        }
        field1919++;
        String var3;
        try {
            var3 = new String(this.field1869, 0, this.field1906, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field1869, 0, this.field1906);
        }
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)I", line = 655)
    public final int method652(int arg0, int arg1) {
        int var3 = -31 / ((68 - arg1) / 33);
        field1908++;
        return this.method657(26127, 0, arg0);
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(B)Lo;", line = 671)
    public final class84 method653(byte arg0) {
        field1914++;
        if (!this.field1864) {
            throw new IllegalArgumentException();
        }
        this.field1902 = 0;
        if (this.field1869.length != this.field1906) {
            byte[] var2 = new byte[this.field1906];
            class68.method518(this.field1869, 0, var2, 0, this.field1906);
            this.field1869 = var2;
        }
        if (arg0 <= 88) {
            method642(74, -103);
        }
        return this;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILo;)Z", line = 701)
    public final boolean method654(int arg0, class84 arg1) {
        field1920++;
        if (arg1 == null) {
            return false;
        } else if (this.field1906 == arg1.field1906) {
            if (!this.field1864 || !arg1.field1864) {
                if (this.field1902 == 0) {
                    this.field1902 = this.method660(-58);
                    if (this.field1902 == 0) {
                        this.field1902 = 1;
                    }
                }
                if (arg1.field1902 == 0) {
                    arg1.field1902 = arg1.method660(-101);
                    if (arg1.field1902 == 0) {
                        arg1.field1902 = 1;
                    }
                }
                if (this.field1902 != arg1.field1902) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1906; var3++) {
                if (this.field1869[var3] != arg1.field1869[var3]) {
                    return false;
                }
            }
            return arg0 == -10 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)Lo;", line = 777)
    public final class84 method655(int arg0, int arg1) {
        if (arg0 != 28418) {
            this.method634(50);
        }
        field1883++;
        return this.method650(this.field1906, -32, arg1);
    }

    @OriginalMember(owner = "client!o", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 788)
    public final boolean equals(Object arg0) {
        field1905++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILo;)I", line = 802)
    private final int method656(int arg0, int arg1, class84 arg2) {
        int[] var4 = new int[arg2.field1906];
        int[] var5 = new int[256];
        field1875++;
        int[] var6 = new int[arg2.field1906];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg2.field1906;
        }
        for (int var8 = 1; var8 <= arg2.field1906; var8++) {
            var4[var8 - 1] = (arg2.field1906 << 1) - var8;
            var5[class61.method486(arg2.field1869[var8 - 1], 255)] = arg2.field1906 - var8;
        }
        int var9 = 81 / ((arg1 + 10) / 55);
        int var10 = arg2.field1906 + 1;
        int var11 = arg2.field1906;
        while (var11 > 0) {
            var6[var11 - 1] = var10;
            while (var10 <= arg2.field1906 && arg2.field1869[var10 - 1] != arg2.field1869[var11 - 1]) {
                if (arg2.field1906 - var11 <= var4[var10 + -1]) {
                    var4[var10 - 1] = arg2.field1906 - var11;
                }
                var10 = var6[var10 - 1];
            }
            var11--;
            var10--;
        }
        int var12 = 1;
        int var13 = 0;
        int var14 = var10;
        int var15 = arg2.field1906 + 1 - var10;
        for (int var16 = 1; var16 <= var15; var16++) {
            var6[var16 - 1] = var13;
            while (var13 >= 1 && arg2.field1869[var13 - 1] != arg2.field1869[var16 - 1]) {
                var13 = var6[var13 - 1];
            }
            var13++;
        }
        while (var14 < arg2.field1906) {
            for (int var19 = var12; var19 <= var14; var19++) {
                if (arg2.field1906 + var14 - var19 <= var4[var19 + -1]) {
                    var4[var19 - 1] = arg2.field1906 + var14 - var19;
                }
            }
            var12 = var14 + 1;
            var14 = var14 + var15 - var6[var15 - 1];
            var15 = var6[var15 - 1];
        }
        int var18;
        for (int var17 = arg2.field1906 + arg0 - 1; var17 < this.field1906; var17 += Math.max(var5[this.field1869[var17] & 0xFF], var4[var18])) {
            for (var18 = arg2.field1906 - 1; var18 >= 0 && this.field1869[var17] == arg2.field1869[var18]; var18--) {
                var17--;
            }
            if (var18 == -1) {
                return var17 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)I", line = 921)
    private final int method657(int arg0, int arg1, int arg2) {
        field1868++;
        if (arg0 != 26127) {
            this.method661(null, -31, 26, 8, -110);
        }
        byte var4 = (byte) arg2;
        for (int var5 = arg1; var5 < this.field1906; var5++) {
            if (this.field1869[var5] == var4) {
                return var5;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIBZZ)Lad;", line = 945)
    public static final class5 method658(boolean arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        if (arg2 != 99) {
            field1904 = null;
        }
        field1893++;
        class15 var5 = null;
        if (class78.field1666 != null) {
            var5 = new class15(arg1, class78.field1666, class3.field40[arg1], 1000000);
        }
        return new class5(var5, class86.field1969, arg1, arg0, arg4, arg3);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)[B", line = 964)
    public final byte[] method659(boolean arg0) {
        field1882++;
        if (arg0) {
            this.field1906 = -47;
        }
        byte[] var2 = new byte[this.field1906];
        class68.method518(this.field1869, 0, var2, 0, this.field1906);
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "(I)I", line = 984)
    public final int method660(int arg0) {
        int var2 = 126 / ((arg0 - 51) / 43);
        field1888++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1906; var4++) {
            var3 = (this.field1869[var4] & 0xFF) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BIIII)I", line = 1007)
    public final int method661(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1876++;
        if (arg2 != 63) {
            field1879 = null;
        }
        class68.method518(this.field1869, arg1, arg0, arg4, arg3 - arg1);
        return arg3 - arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lo;", line = 1023)
    public final class84 method662(byte arg0, int arg1) {
        field1891++;
        if (arg0 >= -35) {
            method642(35, -30);
        }
        class84 var3 = new class84();
        var3.field1869 = new byte[this.field1906 + 1];
        var3.field1906 = this.field1906 + 1;
        class68.method518(this.field1869, 0, var3.field1869, 0, this.field1906);
        var3.field1869[this.field1906] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(III)I", line = 1044)
    public static final int method663(int arg0, int arg1, int arg2) {
        if (arg2 != -22942) {
            method663(-97, -25, 70);
        }
        field1878++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 1085)
    public final void method664(int arg0, int arg1, Graphics arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field1869, arg0, this.field1906, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field1869, 0, this.field1906);
        }
        field1911++;
        arg2.drawString(var5, arg3, arg1);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lo;Z)Z", line = 1112)
    public final boolean method665(class84 arg0, boolean arg1) {
        field1903++;
        if (this.field1906 < arg0.field1906) {
            return false;
        }
        int var3 = this.field1906 - arg0.field1906;
        for (int var4 = 0; var4 < arg0.field1906; var4++) {
            if (this.field1869[var3 + var4] != arg0.field1869[var4]) {
                return false;
            }
        }
        if (!arg1) {
            field1915 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "(I)Lo;", line = 1148)
    public final class84 method666(int arg0) {
        field1865++;
        class84 var2 = new class84();
        var2.field1906 = this.field1906;
        var2.field1869 = new byte[this.field1906];
        if (arg0 >= -20) {
            this.field1902 = -63;
        }
        for (int var3 = 0; var3 < this.field1906; var3++) {
            byte var4 = this.field1869[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1869[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V", line = 1192)
    public static final void method667(byte arg0) {
        field1871++;
        for (int var1 = -1; var1 < class107.field2257; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class85.field1949[var1];
            }
            class63 var3 = class119.field2643[var2];
            if (var3 != null) {
                class110.method854(var3, 1, arg0 + 182);
            }
        }
        if (arg0 != -118) {
            method667((byte) -112);
        }
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(B)I", line = 1243)
    public final int method668(byte arg0) {
        field1913++;
        int var2 = 21 / ((-arg0 - 12) / 38);
        return this.method643(10, true);
    }

    @OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;", line = 1253)
    public final String toString() {
        field1897++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Lo;Z)Z", line = 1279)
    public final boolean method669(class84 arg0, boolean arg1) {
        field1907++;
        if (!arg1) {
            this.method670(null, (byte) 41);
        }
        if (arg0 == null) {
            return false;
        } else if (this.field1906 == arg0.field1906) {
            for (int var3 = 0; var3 < this.field1906; var3++) {
                byte var4 = this.field1869[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field1869[var3];
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

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lo;B)I", line = 1323)
    public final int method670(class84 arg0, byte arg1) {
        if (arg1 != 95) {
            field1904 = null;
        }
        field1909++;
        return this.method656(0, -96, arg0);
    }
}
